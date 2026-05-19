/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  DQ
 *  Ip
 *  XM
 *  fO
 *  k
 *  kpa
 *  mq
 *  vRa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Tp
extends Ip {
    private String[] J;
    private final List<Ur> A;
    private static final Pattern I = Pattern.compile(kpa.Q);

    /*
     * WARNING - void declaration
     */
    public Tp(k k2, XM xM2) {
        void b2;
        Tp c2 = xM2;
        Tp a2 = this;
        super((k)b2, (XM)c2);
        a2.A = new ArrayList<Ur>();
        a2.J = Arrays.copyOf(a2.e, a2.e.length);
        a2.k();
    }

    private void k() {
        int a2;
        Tp tp2 = this;
        tp2.A.clear();
        int n2 = a2 = uSa.E;
        while (n2 < tp2.J.length) {
            Matcher matcher = I.matcher(tp2.J[a2]);
            while (matcher.find()) {
                String string = matcher.group(uSa.E);
                Ur ur = new Ur(string, a2);
                String string2 = string;
                ur.J = Tp.J(string2.substring(vRa.d, string2.length() - vRa.d));
                if (ur.J == null) continue;
                tp2.A.add(ur);
            }
            n2 = ++a2;
        }
    }

    public static /* synthetic */ boolean J(String string, mIa mIa2) {
        mIa b2 = mIa2;
        String a2 = string;
        return b2.getKeyDescription().equals(a2);
    }

    public boolean J(long a22) {
        Tp b2;
        boolean a22 = super.J(a22);
        if (a22) {
            b2.G();
        }
        return a22;
    }

    private static Supplier<String> J(String string) {
        String string2 = string;
        if (string2.startsWith(WPa.Da)) {
            Optional a2 = string2.substring(WPa.Da.length());
            a2 = mIa.keybindArray.stream().filter(DQ.J((String)((Object)a2))).findAny();
            if (!a2.isPresent()) {
                return null;
            }
            return mq.J((mIa)((mIa)a2.get()));
        }
        return null;
    }

    public static /* synthetic */ String J(mIa a2) {
        return Cia.J((int)a2.getKeyCode());
    }

    private void G() {
        Object object;
        Tp tp2 = this;
        int n2 = uSa.E;
        for (Ur a2 : tp2.A) {
            object = a2.J.get();
            if (((String)object).equals(a2.I)) continue;
            n2 = vRa.d;
            a2.I = object;
        }
        if (n2 != 0) {
            Iterator<Ur> a2;
            Tp tp3 = tp2;
            String[] stringArray = Arrays.copyOf(tp3.J, tp3.J.length);
            Iterator<Ur> iterator = a2 = tp2.A.iterator();
            while (iterator.hasNext()) {
                object = a2.next();
                iterator = a2;
                Object object2 = object;
                stringArray[((Ur)object).A] = stringArray[((Ur)object).A].replace(((Ur)object2).j, ((Ur)object2).I);
            }
            tp2.e = stringArray;
            super.D();
        }
    }

    public void J(fO fO2) {
        Tp b2 = fO2;
        Tp a2 = this;
        Tp tp2 = b2;
        super.J((fO)tp2);
        if (tp2.hasEText() && b2.getEText().getTextCount() > 0) {
            a2.J = Arrays.copyOf(a2.e, a2.e.length);
            a2.k();
        }
    }
}

