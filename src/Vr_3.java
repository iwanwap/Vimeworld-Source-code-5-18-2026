/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  JB
 *  SN
 *  VP
 *  Vr
 *  aSa
 *  aq
 *  hra
 *  jR
 *  mp
 *  pua
 *  rq
 *  tP
 *  tQ
 *  vRa
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vr_3 {
    private int A = uSa.E;
    private final Map<Integer, List<VP>> I;

    public void J(SN sN2) {
        ip ip2;
        String string;
        Vr_3 b2 = sN2;
        Vr_3 a2 = this;
        List<VP> list = a2.I.computeIfAbsent(b2.getKey(), aq.J());
        if (b2.hasId()) {
            string = b2.getId();
        } else {
            int n2 = a2.A;
            a2.A = n2 + vRa.d;
            string = new StringBuilder().insert(2 & 5, Epa.W).append(n2).toString();
        }
        switch (tQ.I[b2.getKind().ordinal()]) {
            case 1: {
                ip2 = new ip((Vr)a2, b2.getKey(), b2.getAction());
                break;
            }
            default: {
                throw new IllegalArgumentException(aSa.W);
            }
        }
        list.removeIf(rq.J((String)string));
        list.add(new VP(string, (JB)ip2));
    }

    public static /* synthetic */ boolean f(String string, VP vP2) {
        String b2 = vP2;
        String a2 = string;
        return ((VP)b2).I.equals(a2);
    }

    public static /* synthetic */ boolean J(String string, VP vP2) {
        String b2 = vP2;
        String a2 = string;
        return ((VP)b2).I.equals(a2);
    }

    public Vr_3() {
        Vr_3 a2;
        Vr_3 vr_3 = a2;
        vr_3.I = new HashMap<Integer, List<VP>>();
    }

    public boolean f() {
        Vr_3 vr_3 = this;
        if (vr_3.I.isEmpty()) {
            return uSa.E != 0;
        }
        int a2 = Mouse.getEventButton() - ySa.T;
        return vr_3.f(a2, vRa.d != 0);
    }

    public static /* synthetic */ List J(Integer a2) {
        return new CopyOnWriteArrayList();
    }

    public static /* synthetic */ boolean J(JB jB2, VP vP2) {
        JB b2 = vP2;
        JB a2 = jB2;
        if (b2.A == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, JB jB2) {
        void b2;
        Vr_3 vr_3 = this;
        List<VP> c2 = vr_3.I.get((int)b2);
        if (c2 != null) {
            void a2;
            List<VP> list = c2;
            list.removeIf(jR.J((JB)a2));
            if (list.isEmpty()) {
                vr_3.I.remove((int)b2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(int n2, boolean bl) {
        void a2;
        Vr_3 b2 = this;
        int c2 = n2;
        if (b2.J(c2, (boolean)a2)) {
            return vRa.d != 0;
        }
        if ((c2 = mp.J((int)c2)) != pua.o) {
            return b2.J(c2, (boolean)a2);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, String string) {
        void a2;
        int c2 = n2;
        Vr_3 b2 = this;
        if (a2 == null) {
            b2.I.remove(c2);
            return;
        }
        List<VP> list = b2.I.get(c2);
        if (list != null) {
            List<VP> list2 = list;
            list2.removeIf(tP.J((String)a2));
            if (list2.isEmpty()) {
                b2.I.remove(c2);
            }
        }
    }

    public boolean J() {
        Vr_3 vr_3 = this;
        if (vr_3.I.isEmpty()) {
            return uSa.E != 0;
        }
        int a2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + hra.Ja : Keyboard.getEventKey();
        return vr_3.f(a2, uSa.E != 0);
    }

    private boolean J(int n2, boolean bl) {
        int c22 = n2;
        Vr_3 b2 = this;
        List<VP> c22 = b2.I.get(c22);
        if (c22 != null) {
            boolean a2;
            a2 = a2 ? Mouse.getEventButtonState() : Keyboard.getEventKeyState();
            c22 = c22.iterator();
            while (c22.hasNext()) {
                if (!((VP)c22.next()).A.J(a2)) continue;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void J() {
        Vr_3 a2;
        a2.I.clear();
    }
}

