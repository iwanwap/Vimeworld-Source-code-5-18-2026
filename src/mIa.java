/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OU
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class mIa
implements Comparable<mIa> {
    private final int keyCodeDefault;
    private OU pressed;
    private long pressedEventNanos;
    private ArrayDeque<Long> pressedNanos;
    public static final OX<mIa> hash;
    private static final Set<String> keybindSet;
    public static final List<mIa> keybindArray;
    private final String keyDescription;
    private final String keyCategory;
    private int pressTime;
    private int keyCode;

    public boolean isKeyDown() {
        mIa a2;
        return a2.pressed.J();
    }

    public static void resetKeyBindingArrayAndHash() {
        Iterator<mIa> iterator;
        hash.J();
        Iterator<mIa> iterator2 = iterator = keybindArray.iterator();
        while (iterator2.hasNext()) {
            mIa mIa2 = iterator.next();
            hash.J(mIa2.keyCode, mIa2);
            iterator2 = iterator;
        }
    }

    private void unpressKey() {
        mIa a2;
        mIa mIa2 = a2;
        mIa2.pressTime = uSa.E;
        mIa2.pressedNanos.clear();
        mIa2.pressedEventNanos = nqa.i;
        mIa2.pressed.J(uSa.E != 0);
    }

    public int getKeyCodeDefault() {
        mIa a2;
        return a2.keyCodeDefault;
    }

    public static void unPressAllKeys() {
        Iterator<mIa> iterator;
        Iterator<mIa> iterator2 = iterator = keybindArray.iterator();
        while (iterator2.hasNext()) {
            iterator.next().unpressKey();
            iterator2 = iterator;
        }
    }

    public String getKeyCategory() {
        mIa a2;
        return a2.keyCategory;
    }

    public boolean isPressed() {
        mIa mIa2 = this;
        if (mIa2.pressTime == 0) {
            mIa2.pressedEventNanos = nqa.i;
            return uSa.E != 0;
        }
        mIa mIa3 = mIa2;
        mIa3.pressTime -= vRa.d;
        Comparable<mIa> a2 = mIa3.pressedNanos.poll();
        if (a2 != null) {
            mIa2.pressedEventNanos = (Long)a2;
        }
        return vRa.d != 0;
    }

    static {
        keybindArray = Lists.newArrayList();
        hash = new OX();
        keybindSet = Sets.newHashSet();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int compareTo(mIa mIa2) {
        void a2;
        mIa mIa3 = this;
        int b2 = oha.J(mIa3.keyCategory, new Object[uSa.E]).compareTo(oha.J(a2.keyCategory, new Object[uSa.E]));
        if (b2 == 0) {
            b2 = oha.J(mIa3.keyDescription, new Object[uSa.E]).compareTo(oha.J(a2.keyDescription, new Object[uSa.E]));
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public static void onTick(int n2, long l2) {
        mIa b2;
        int n3 = n2;
        if (n3 != 0 && (b2 = hash.J(n3)) != null) {
            void a2;
            mIa mIa2 = b2;
            mIa2.pressTime += vRa.d;
            mIa2.pressedNanos.add((long)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public mIa(String string, int n2, String string2) {
        void b2;
        void c2;
        mIa a2;
        String d2 = string2;
        mIa mIa2 = a2 = this;
        mIa mIa3 = a2;
        mIa mIa4 = a2;
        mIa3.pressed = new OU(uSa.E != 0, tTa.h);
        mIa3.pressedNanos = new ArrayDeque();
        mIa3.keyDescription = c2;
        mIa2.keyCodeDefault = a2.keyCode = b2;
        mIa2.keyCategory = d2;
        keybindArray.add(a2);
        hash.J((int)b2, a2);
        keybindSet.add(d2);
    }

    public static Set<String> getKeybinds() {
        return keybindSet;
    }

    public String getKeyDescription() {
        mIa a2;
        return a2.keyDescription;
    }

    public long getPressedEventNanos() {
        mIa a2;
        return a2.pressedEventNanos;
    }

    /*
     * WARNING - void declaration
     */
    public static void setKeyBindState(int n2, boolean bl) {
        mIa b2;
        int n3 = n2;
        if (n3 != 0 && (b2 = hash.J(n3)) != null) {
            void a2;
            b2.pressed.J((boolean)a2);
        }
    }

    public int getKeyCode() {
        mIa a2;
        return a2.keyCode;
    }

    public void setPressedEventNanos(long a2) {
        b.pressedEventNanos = a2;
    }

    public void setKeyCode(int n2) {
        int b2 = n2;
        mIa a2 = this;
        a2.keyCode = b2;
    }
}

