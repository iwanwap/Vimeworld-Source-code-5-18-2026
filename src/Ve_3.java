/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bpa
 *  DQa
 *  Kd
 *  Le
 *  PF
 *  QF
 *  Usa
 *  tQa
 *  vQa
 *  vRa
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public final class Ve_3
extends QF {
    private static final Map<Integer, Map<String, String>> j;
    private static boolean J;
    private String I = Mqa.y;

    static {
        J = uSa.E;
        j = new HashMap<Integer, Map<String, String>>();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        Ve_3 a2 = this;
        if (b2 == false && e2 != false) {
            if (WF.J().size() <= vRa.d) {
                return;
            }
            Ve_3.f((!J ? vRa.d : uSa.E) != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        Ve_3 ve_3;
        String string;
        void b2;
        int c2 = n3;
        Ve_3 a2 = this;
        a2.j = (a2.A ? (J ? Bc.Za : Bc.Ga) : (J ? Bc.Ga : Bc.Ja)).transparent(WF.J());
        a2.I = (a2.A ? (J ? Bc.X : Bc.Za) : (J ? Bc.Za : Bc.Ga)).transparent(WF.J());
        super.J((int)b2, c2);
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(Ve_3.J(Bua.v, a2.I), (int)(a2.I + hpa.y), a2.J + DQa.S, Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
        Ii ii2 = Le.J((PF)PF.VIME_ART, (int)kTa.j);
        if (J) {
            string = vQa.L;
            ve_3 = a2;
        } else {
            string = Bpa.W;
            ve_3 = a2;
        }
        ii2.J(string, (int)(ve_3.I + a2.k - hpa.y - Wqa.m), a2.J + a2.j / KPa.y - Wqa.Z, Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static String J(int n2, String string) {
        void a2;
        Map<Object, Object> map;
        int n3 = n2;
        if (j.containsKey(n3)) {
            map = j.get(n3);
            if (map.containsKey(a2)) {
                return (String)map.get(a2);
            }
        } else {
            map = new HashMap();
        }
        Ii ii2 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        String b2 = a2;
        int n4 = b2.length() - vRa.d;
        Ii ii3 = ii2;
        while (ii3.f(b2) >= n3) {
            b2 = b2.substring(uSa.E, n4--);
            ii3 = ii2;
        }
        if (n4 != a2.length() - vRa.d) {
            b2 = new StringBuilder().insert(3 & 4, b2).append(Usa.E).toString();
        }
        map.put(a2, b2);
        j.put(n3, map);
        return b2;
    }

    public static void f(boolean a2) {
        J = a2;
    }

    public void J() {
        if (WF.J() == null) {
            if (WF.J().isEmpty()) {
                a.I = Mqa.y;
                return;
            }
            a.I = tQa.J((byte[])WF.J().get(uSa.E));
            return;
        }
        a.I = tQa.J((byte[])WF.J());
    }

    public static boolean l() {
        return J;
    }

    public Ve_3() {
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ja, null, (Color)Bc.Ga);
        Ve_3 a2;
        a2.A = Kd.S;
    }
}

