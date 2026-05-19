/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  VQa
 *  bpa
 *  cg
 *  pua
 *  vRa
 */
import java.util.Arrays;
import java.util.List;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class RB_1 {
    private String[] L;
    private String[] E;
    private String m;
    public static final String C = "\u00a7c";
    public static final String i = "\u00a7a";
    public static final String M = "\u00a79";
    private String k;
    private String j;
    private String J;
    private boolean A;
    private boolean I;

    public String M() {
        RB_1 rB_1 = this;
        Object a2 = Config.J(rB_1.k);
        a2 = cg.l((String)a2, (String)dua.G);
        a2 = pA.J(new StringBuilder().insert(5 >> 3, gsa.h).append(rB_1.e()).append(KQa.M).toString(), (String)a2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String[] stringArray) {
        void a2;
        int b2;
        RB_1 rB_1 = this;
        List<String> list = Arrays.asList(rB_1.L);
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var2_5 = a2[b2];
            if (!list.contains(var2_5)) {
                rB_1.L = (String[])Config.J((Object[])rB_1.L, var2_5);
            }
            n2 = ++b2;
        }
    }

    public String e() {
        RB_1 a2;
        return a2.m;
    }

    public boolean C(String string) {
        String b2 = string;
        RB_1 a2 = this;
        if (RB_1.J(b2, a2.E) < 0) {
            return uSa.E != 0;
        }
        a2.J = b2;
        return vRa.d != 0;
    }

    public String d() {
        RB_1 a2;
        return a2.J;
    }

    public boolean C() {
        RB_1 a2;
        return a2.A;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        RB_1 a2 = this;
        a2.A = b2;
    }

    public void l() {
        RB_1 rB_1;
        RB_1 rB_12 = rB_1 = this;
        int a2 = RB_1.J(rB_12.J, rB_12.E);
        if (a2 >= 0) {
            a2 = (a2 - vRa.d + rB_1.E.length) % rB_1.E.length;
            rB_1.J = rB_1.E[a2];
        }
    }

    public boolean l(String string) {
        String b2 = string;
        RB_1 a2 = this;
        return uSa.E != 0;
    }

    public String C() {
        RB_1 a2;
        return a2.k;
    }

    public void f() {
        RB_1 a2;
        a2.J = a2.j;
    }

    public String f(String string) {
        String b2 = string;
        RB_1 a2 = this;
        return Mqa.y;
    }

    public void J(String string) {
        String b2 = string;
        RB_1 a2 = this;
        a2.k = b2;
    }

    public String l() {
        RB_1 a2;
        return pA.J(new StringBuilder().insert(2 & 5, gsa.h).append(a2.m).toString(), a2.m);
    }

    public String toString() {
        RB_1 a2;
        return new StringBuilder().insert(5 >> 3, Mqa.y).append(a2.m).append(bpa.D).append(a2.J).append(Hra.I).append(a2.j).append(MRa.Ja).append(Config.J(a2.L)).toString();
    }

    public String J(String string) {
        String b2 = string;
        RB_1 a2 = this;
        return pA.J(new StringBuilder().insert(3 ^ 3, eta.F).append(a2.m).append(VQa.ja).append(b2).toString(), b2);
    }

    public String[] f() {
        RB_1 a2;
        return a2.L;
    }

    public void J() {
        RB_1 rB_1;
        RB_1 rB_12 = rB_1 = this;
        int a2 = RB_1.J(rB_12.J, rB_12.E);
        if (a2 >= 0) {
            a2 = (a2 + vRa.d) % rB_1.E.length;
            rB_1.J = rB_1.E[a2];
        }
    }

    public String f() {
        return null;
    }

    public boolean f(String string) {
        String b2 = string;
        RB_1 a2 = this;
        return uSa.E != 0;
    }

    public boolean J(String string) {
        String b2 = string;
        RB_1 a2 = this;
        if (RB_1.J(b2, a2.E) >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        RB_1 a2 = this;
        a2.I = b2;
    }

    public String[] J() {
        RB_1 a2;
        return (String[])a2.E.clone();
    }

    public boolean l() {
        RB_1 a2;
        return a2.I;
    }

    public String J() {
        RB_1 a2;
        return a2.j;
    }

    public boolean f() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, String[] stringArray) {
        void a2;
        int b2;
        String string2 = string;
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2].equals(string2)) {
                return b2;
            }
            n2 = ++b2;
        }
        return pua.o;
    }

    public boolean J() {
        RB_1 a2;
        RB_1 rB_1 = a2;
        if (!Config.equals(rB_1.J, rB_1.j)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public RB_1(String string, String string2, String string3, String[] stringArray, String string4, String string5) {
        String g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        RB_1 a2;
        RB_1 rB_1 = string6;
        String string6 = string5;
        RB_1 rB_12 = a2 = rB_1;
        RB_1 rB_13 = a2;
        RB_1 rB_14 = a2;
        RB_1 rB_15 = a2;
        RB_1 rB_16 = a2;
        RB_1 rB_17 = a2;
        rB_17.m = null;
        rB_17.k = null;
        rB_16.J = null;
        rB_16.E = null;
        rB_15.j = null;
        rB_15.L = null;
        rB_14.A = vRa.d;
        rB_14.I = vRa.d;
        rB_14.m = f2;
        rB_13.k = e2;
        rB_13.J = d2;
        rB_12.E = c2;
        rB_12.j = b2;
        if (g2 != null) {
            String[] stringArray2 = new String[vRa.d];
            stringArray2[uSa.E] = g2;
            a2.L = stringArray2;
        }
    }
}

