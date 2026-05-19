/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cia
 *  ERa
 *  JPa
 *  Kpa
 *  MQa
 *  NTa
 *  Qta
 *  RQa
 *  SQa
 *  Tpa
 *  Uqa
 *  ZOa
 *  aKa
 *  aSa
 *  bRa
 *  cQa
 *  dQa
 *  gda
 *  gna
 *  hra
 *  lF
 *  lPa
 *  mka
 *  pKa
 *  pqa
 *  qta
 *  sMa
 *  uKa
 *  vRa
 *  vpa
 *  wra
 */
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UD_2 {
    private static gda q;
    private static int x;
    private static Cia v;
    private static long o;
    private static long h;
    public static lF K;
    private static int H;
    public static lF c;
    private static long[] B;
    private static long d;
    private static Kpa a;
    public static boolean b;
    public static lF l;
    private static long[] e;
    public static lF G;
    private static long D;
    private static long[] f;
    private static long[] F;
    private static long[] g;
    private static long L;
    private static long[] E;
    private static long m;
    public static lF C;
    private static long[] i;
    public static lF M;
    private static long k;
    public static lF j;
    private static boolean[] J;
    private static long[] A;
    private static long I;

    public static void J() {
        if (a == null) {
            a = Kpa.J();
            v = UD_2.a.z;
            q = UD_2.a.U;
        }
        if (UD_2.v.t && (UD_2.v.Wa || UD_2.v.mA)) {
            b = vRa.d;
            long l2 = System.nanoTime();
            if (k == fqa.Da) {
                k = l2;
                return;
            }
            int n2 = H & g.length - vRa.d;
            H += vRa.d;
            boolean bl = UD_2.J();
            UD_2.g[n2] = l2 - k - m;
            UD_2.F[n2] = UD_2.c.A;
            UD_2.B[n2] = UD_2.j.A;
            UD_2.E[n2] = UD_2.l.A;
            UD_2.A[n2] = UD_2.C.A;
            UD_2.f[n2] = UD_2.K.A;
            UD_2.e[n2] = UD_2.M.A;
            UD_2.i[n2] = UD_2.G.A;
            UD_2.J[n2] = bl;
            lF.J((lF)c);
            lF.J((lF)j);
            lF.J((lF)K);
            lF.J((lF)C);
            lF.J((lF)l);
            lF.J((lF)M);
            lF.J((lF)G);
            k = System.nanoTime();
            return;
        }
        b = uSa.E;
        k = fqa.Da;
    }

    public static boolean f() {
        return b;
    }

    public UD_2() {
        UD_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static long J(int n2, long l2, int n3, int n4, int n5, float f2, aKa aKa2) {
        void c2;
        void d2;
        void e2;
        void f3;
        void g2;
        void a2;
        float f4 = f2;
        int b2 = n2;
        if ((f3 /= qQa.Ma) < Bra.I) {
            return nqa.i;
        }
        void v0 = a2;
        int n6 = b2;
        v0.J((double)((float)n6 + MQa.L), (double)(g2 - (float)f3 + MQa.L), aSa.V).J((int)e2, (int)d2, (int)c2, osa.Ja).M();
        v0.J((double)((float)n6 + MQa.L), (double)(g2 + MQa.L), aSa.V).J((int)e2, (int)d2, (int)c2, osa.Ja).M();
        return (long)f3;
    }

    /*
     * WARNING - void declaration
     */
    private static long J(int n2, int n3, long l2, int n4, int n5, int n6, float f2, aKa aKa2) {
        void g2;
        void c2;
        void d2;
        void e2;
        void f3;
        void b2;
        void h2;
        aKa aKa3 = aKa2;
        int a2 = n2;
        if ((f3 /= qQa.Ma) < Bra.I) {
            return nqa.i;
        }
        h2.J((double)((float)a2 + MQa.L), (double)(b2 - (float)f3 + MQa.L), aSa.V).J((int)e2, (int)d2, (int)c2, osa.Ja).M();
        h2.J((double)((float)g2 + MQa.L), (double)(b2 - (float)f3 + MQa.L), aSa.V).J((int)e2, (int)d2, (int)c2, osa.Ja).M();
        return (long)f3;
    }

    public static void J(sMa sMa2) {
        sMa sMa3 = sMa2;
        if (v != null && (UD_2.v.Wa || UD_2.v.mA)) {
            int n2;
            int n3;
            long l2 = System.nanoTime();
            uKa.A((int)hra.Ja);
            uKa.G((int)WPa.s);
            uKa.e();
            uKa.a();
            uKa.y();
            uKa.J((double)aSa.V, (double)UD_2.a.t, (double)UD_2.a.k, (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
            uKa.G((int)SQa.ca);
            uKa.e();
            uKa.y();
            uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
            uKa.C((float)pqa.r);
            uKa.z();
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            aKa2.J(vRa.d, mka.I);
            int n4 = n3 = uSa.E;
            while (n4 < g.length) {
                n2 = (n3 - H & g.length - vRa.d) * ySa.T / g.length;
                n2 += BQa.Q;
                float a2 = UD_2.a.k;
                long l3 = nqa.i;
                if (J[n3]) {
                    int n5 = n3;
                    int n6 = n2;
                    UD_2.J(n5, g[n5], n6, n6 / uqa.g, uSa.E, a2, aKa2);
                } else {
                    int n7 = n2;
                    UD_2.J(n3, g[n3], n7, n7, n7, a2, aKa2);
                    int n8 = n3;
                    a2 -= (float)UD_2.J(n8, i[n8], n2 / uqa.g, n2 / uqa.g, n2 / uqa.g, a2, aKa2);
                    int n9 = n3;
                    a2 -= (float)UD_2.J(n9, e[n9], uSa.E, n2, uSa.E, a2, aKa2);
                    int n10 = n3;
                    int n11 = n2;
                    a2 -= (float)UD_2.J(n10, f[n10], n11, n11, uSa.E, a2, aKa2);
                    int n12 = n3;
                    a2 -= (float)UD_2.J(n12, A[n12], n2, uSa.E, uSa.E, a2, aKa2);
                    int n13 = n3;
                    int n14 = n2;
                    a2 -= (float)UD_2.J(n13, E[n13], n14, uSa.E, n14, a2, aKa2);
                    int n15 = n3;
                    a2 -= (float)UD_2.J(n15, B[n15], uSa.E, uSa.E, n2, a2, aKa2);
                    int n16 = n3;
                    int n17 = n2;
                    float f2 = a2 - (float)UD_2.J(n16, F[n16], uSa.E, n17, n17, a2, aKa2);
                }
                n4 = ++n3;
            }
            UD_2.J(uSa.E, g.length, bRa.z, pta.c, pta.c, pta.c, UD_2.a.k, aKa2);
            UD_2.J(uSa.E, g.length, iSa.R, pta.c, pta.c, pta.c, UD_2.a.k, aKa2);
            pKa2.J();
            uKa.H();
            n3 = UD_2.a.k - Fua.J;
            n2 = UD_2.a.k - rRa.f;
            UD_2.a.Ea.J(Qta.W, uqa.g, n2 + vRa.d, Bpa.g);
            UD_2.a.Ea.J(Qta.W, vRa.d, n2, wra.V);
            UD_2.a.Ea.J(qta.C, uqa.g, n3 + vRa.d, Bpa.g);
            UD_2.a.Ea.J(qta.C, vRa.d, n3, wra.V);
            uKa.G((int)WPa.s);
            uKa.D();
            uKa.G((int)SQa.ca);
            uKa.D();
            uKa.H();
            float a2 = pqa.r - (float)((double)(System.currentTimeMillis() - o) / Tpa.M);
            a2 = Config.J(a2, JPa.N, pqa.r);
            int n18 = (int)(RQa.Ka + a2 * lPa.l);
            int n19 = (int)(QTa.G + a2 * sSa.h);
            int n20 = (int)(FRa.Ga + a2 * FRa.Ga);
            int n21 = n18 << ERa.C | n19 << Yqa.i | n20;
            int n22 = cQa.z / sMa3.l() + uqa.g;
            n3 = UD_2.a.k / sMa3.l() - Yqa.i;
            gna cfr_ignored_0 = UD_2.a.Ya;
            gna.J((int)(n22 - vRa.d), (int)(n3 - vRa.d), (int)(n22 + vpa.o), (int)(n3 + NTa.C), (int)rua.J);
            UD_2.a.Ea.J(new StringBuilder().insert(2 & 5, Tpa.E).append(x).append(Uqa.Da).toString(), n22, n3, n21);
            m = System.nanoTime() - l2;
        }
    }

    static {
        b = uSa.E;
        c = new lF();
        j = new lF();
        l = new lF();
        C = new lF();
        K = new lF();
        M = new lF();
        G = new lF();
        g = new long[cQa.z];
        F = new long[cQa.z];
        B = new long[cQa.z];
        E = new long[cQa.z];
        A = new long[cQa.z];
        f = new long[cQa.z];
        e = new long[cQa.z];
        i = new long[cQa.z];
        J = new boolean[cQa.z];
        H = uSa.E;
        k = fqa.Da;
        m = nqa.i;
        o = System.currentTimeMillis();
        D = UD_2.J();
        L = o;
        h = D;
        I = dQa.Ga;
        d = nqa.i;
        x = uSa.E;
    }

    private static long J() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static boolean J() {
        long l2;
        long l3 = System.currentTimeMillis();
        long l4 = UD_2.J();
        int n2 = uSa.E;
        if (l4 < h) {
            double d2 = (double)d / ZOa.ha;
            double d3 = (double)I / Tpa.M;
            int n3 = (int)(d2 / d3);
            if (n3 > 0) {
                x = n3;
            }
            o = l3;
            D = l4;
            I = nqa.i;
            d = nqa.i;
            n2 = vRa.d;
            l2 = l3;
        } else {
            I = l3 - o;
            d = l4 - D;
            l2 = l3;
        }
        L = l2;
        h = l4;
        return n2 != 0;
    }
}

