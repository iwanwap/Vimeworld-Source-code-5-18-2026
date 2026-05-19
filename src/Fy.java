/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fpa
 *  JTa
 *  Usa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fy {
    public static final Fy[] f = new Fy[ERa.C];
    public static final Fy F;
    private boolean g;
    private boolean L;
    public static final Fy E;
    public static final Fy m;
    private boolean C;
    private final int i;
    public static final Fy M;
    public static final Fy k;
    private final int j;
    public static final Fy J;
    public static final Fy A;
    private final String I;

    public boolean l() {
        Fy a2;
        return a2.C;
    }

    public boolean f() {
        Fy a2;
        return a2.g;
    }

    public int f() {
        Fy a2;
        return a2.i;
    }

    public boolean J() {
        Fy a2;
        return a2.L;
    }

    private Fy J(boolean bl2) {
        boolean b2 = bl2;
        Fy a2 = this;
        a2.L = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private Fy(int n2, String string) {
        void b2;
        String c2 = string;
        Fy a2 = this;
        a2((int)b2, c2, uSa.E);
    }

    private Fy f() {
        Fy a2;
        a2.C = vRa.d;
        return a2;
    }

    static {
        M = new Fy(uSa.E, BQa.la, vRa.d).f();
        k = new Fy(vRa.d, UOa.D);
        F = new Fy(uqa.g, Era.B);
        J = new Fy(yRa.d, Fpa.Ia).J();
        m = new Fy(AQa.P, hQa.A);
        A = new Fy(tTa.h, NSa.R);
        E = new Fy(Yqa.i, JTa.s, uSa.E).J(uSa.E != 0);
    }

    public Fy J(int n2) {
        int b2 = n2;
        Fy a2 = this;
        if (a2 == M && b2 == 0) {
            return E;
        }
        return a2;
    }

    public String l() {
        Fy a2;
        return new StringBuilder().insert(2 & 5, a2.f()).append(ySa.e).toString();
    }

    public int J() {
        Fy a2;
        return a2.j;
    }

    private Fy J() {
        Fy a2;
        a2.g = vRa.d;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private Fy(int n2, String string, int n3) {
        void a2;
        void b2;
        Fy c2;
        int d2 = n2;
        Fy fy2 = c2 = this;
        c2.I = b2;
        fy2.j = a2;
        fy2.L = vRa.d;
        fy2.i = d2;
        Fy.f[d2] = c2;
    }

    public String f() {
        Fy a2;
        return new StringBuilder().insert(3 ^ 3, Usa.fa).append(a2.I).toString();
    }

    public String J() {
        Fy a2;
        return a2.I;
    }

    public static Fy J(String string) {
        int a2;
        String string2 = string;
        int n2 = a2 = uSa.E;
        while (n2 < f.length) {
            if (f[a2] != null && Fy.f[a2].I.equalsIgnoreCase(string2)) {
                return f[a2];
            }
            n2 = ++a2;
        }
        return null;
    }
}

