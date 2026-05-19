/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Bsa
 *  ERa
 *  FY
 *  Jy
 *  Lqa
 *  NCa
 *  NTa
 *  TZ
 *  Waa
 *  XTa
 *  hra
 *  iPa
 *  pPa
 *  vRa
 *  wX
 *  waa
 *  wra
 */
public final class Haa_3 {
    /*
     * WARNING - void declaration
     */
    public static void J(FY fY2, Waa waa2, Ay ay2) {
        int n2;
        int n3;
        void b2;
        FY fY3 = fY2;
        void v0 = b2;
        v0.J(Bta.z, fY3.C);
        v0.J(wra.k, fY3.k);
        FY fY4 = fY3;
        v0.J(Psa.F, fY4.L);
        Object c22 = new int[fY4.g.length];
        int n4 = n3 = uSa.E;
        while (n4 < fY3.g.length) {
            int n5 = n3++;
            c22[n5] = (FY)fY3.g[n5];
            n4 = n3;
        }
        void v4 = b2;
        v4.J(vsa.R, (int[])c22);
        v4.J(iPa.ga, fY3.A);
        waa waa3 = new waa();
        int n6 = c22 = uSa.E;
        while (n6 < Yqa.i) {
            int n7;
            int n8 = vRa.d;
            int n9 = uSa.E;
            while (n9 < ERa.C && n8 != 0) {
                int n10 = uSa.E;
                while (n10 < ERa.C && n8 != 0) {
                    int n11;
                    int n12 = uSa.E;
                    while (n12 < ERa.C) {
                        int n13;
                        int n14 = n2 << pPa.f | n13 << XTa.W | n11 + (c22 << AQa.P);
                        n7 = fY3.i[n14];
                        if (n7 != 0) {
                            n8 = uSa.E;
                            break;
                        }
                        n12 = ++n13;
                    }
                    n10 = ++n11;
                }
                n9 = ++n2;
            }
            if (n8 == 0) {
                Waa waa4;
                byte[] byArray = new byte[mPa.H];
                wX wX2 = new wX();
                wX wX3 = new wX();
                wX wX4 = new wX();
                int n15 = uSa.E;
                while (n15 < ERa.C) {
                    int n16 = uSa.E;
                    while (n16 < ERa.C) {
                        int n17;
                        int n18 = uSa.E;
                        while (n18 < ERa.C) {
                            int n19;
                            int n20 = n7 << pPa.f | n19 << XTa.W | n17 + (c22 << AQa.P);
                            n20 = fY3.i[n20];
                            byArray[n17 << Yqa.i | n19 << AQa.P | n7] = (byte)(n20 & osa.Ja);
                            wX2.J(n7, n17, n19, fY3.I.J(n7, n17 + (c22 << AQa.P), n19));
                            wX3.J(n7, n17, n19, fY3.J.J(n7, n17 + (c22 << AQa.P), n19));
                            wX4.J(n7, n17, n19, fY3.j.J(n7, n17 + (c22 << AQa.P), n19++));
                            n18 = n19;
                        }
                        n16 = ++n17;
                    }
                    n15 = ++n7;
                }
                Waa waa5 = waa4 = new Waa();
                waa5.J(wua.q, (byte)(c22 & osa.Ja));
                waa5.J(ySa.H, byArray);
                waa5.J(Lqa.o, wX2.J());
                waa5.J(KPa.s, wX3.J());
                waa5.J(fqa.p, wX4.J());
                waa3.J((NCa)waa5);
            }
            n6 = ++c22;
        }
        b2.J(rua.Ha, (NCa)waa3);
        byte[] c22 = new byte[hra.Ja];
        zz zz2 = new zz();
        int n21 = n2 = uSa.E;
        while (n21 < ERa.C) {
            int n22 = uSa.E;
            while (n22 < ERa.C) {
                void a2;
                int n23;
                zz2.func_181079_c(fY3.C << AQa.P | n2, uSa.E, fY3.k << AQa.P | n23);
                int n24 = n23 << AQa.P | n2;
                c22[n24] = (byte)(a2.J((XF)zz2, (Jy)Jy.f).Ka & osa.Ja);
                n22 = ++n23;
            }
            n21 = ++n2;
        }
        void v16 = b2;
        v16.J(vqa.Ka, c22);
        v16.J(Bua.S, (NCa)fY3.M);
        v16.J(GPa.B, (NCa)fY3.m);
        if (fY3.E != null) {
            b2.J(Bsa.L, (NCa)fY3.E);
        }
    }

    public static FY J(Waa waa2) {
        Waa waa3;
        Waa waa4 = waa3 = waa2;
        int a2 = waa4.J(Bta.z);
        int n2 = waa4.J(wra.k);
        FY fY2 = a2 = new FY(a2, n2);
        Waa waa5 = waa3;
        FY fY3 = a2;
        FY fY4 = a2;
        fY4.i = waa3.J(ySa.H);
        FY fY5 = a2;
        fY4.I = new TZ(waa3.J(Lqa.o), XTa.W);
        fY5.J = new TZ(waa3.J(KPa.s), XTa.W);
        fY4.j = new TZ(waa3.J(fqa.p), XTa.W);
        fY3.g = waa3.J(vsa.R);
        fY3.A = waa3.f(iPa.ga);
        a2.M = waa5.J(Bua.S, NTa.C);
        fY2.m = waa5.J(GPa.B, NTa.C);
        fY2.E = waa3.J(Bsa.L, NTa.C);
        try {
            a2.L = waa3.J(Psa.F);
            return a2;
        }
        catch (ClassCastException classCastException) {
            a2.L = waa3.J(Psa.F);
            return a2;
        }
    }

    public Haa_3() {
        Haa_3 a2;
    }
}

