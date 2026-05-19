/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  DQa
 *  Gg
 *  ISa
 *  JPa
 *  LE
 *  Lqa
 *  MQa
 *  Qqa
 *  Tpa
 *  WSa
 *  XTa
 *  Ypa
 *  Zta
 *  aPa
 *  hqa
 *  hra
 *  jpa
 *  kPa
 *  kqa
 *  kta
 *  lPa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  qD
 *  uKa
 *  uRa
 *  vQa
 *  vRa
 *  wra
 *  zsa
 */
import java.util.Properties;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oe_1 {
    private float F;
    private boolean g;
    private int L;
    private int E;
    public int m;
    private int C;
    private int i;
    public String M;
    private int k;
    private int j;
    private float[] J;
    public static final float[] A;
    private qD I;

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3, int n4) {
        void a2;
        void b2;
        int d2 = n2;
        oe_1 c2 = this;
        if (b2 <= a2) {
            if (d2 >= b2 && d2 <= a2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (d2 >= b2 || d2 <= a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private float[] J(String string, float[] fArray) {
        int c22;
        void a2;
        void b2;
        oe_1 oe_12 = this;
        if (b2 == null) {
            return a2;
        }
        String[] stringArray = Config.J((String)b2, Tpa.E);
        if (stringArray.length != yRa.d) {
            Config.J(new StringBuilder().insert(3 ^ 3, DPa.S).append((String)b2).toString());
            return a2;
        }
        float[] fArray2 = new float[yRa.d];
        int n2 = c22 = uSa.E;
        while (n2 < stringArray.length) {
            int n3 = c22;
            fArray2[n3] = Config.J(stringArray[n3], CRa.V);
            if (fArray2[c22] == CRa.V) {
                Config.J(new StringBuilder().insert(5 >> 3, DPa.S).append((String)b2).toString());
                return a2;
            }
            if (fArray2[c22] < vqa.T || fArray2[c22] > pqa.r) {
                Config.J(new StringBuilder().insert(5 >> 3, rua.Ja).append((String)b2).toString());
                return a2;
            }
            n2 = ++c22;
        }
        float c22 = fArray2[uSa.E];
        float f2 = fArray2[vRa.d];
        float f3 = fArray2[uqa.g];
        float f4 = c22;
        float f5 = f2;
        float f6 = f3;
        if (f4 * f4 + f5 * f5 + f6 * f6 < BPa.n) {
            Config.J(new StringBuilder().insert(3 ^ 3, rua.Ja).append((String)b2).toString());
            return a2;
        }
        float[] fArray3 = new float[yRa.d];
        fArray3[uSa.E] = f3;
        fArray3[vRa.d] = f2;
        fArray3[uqa.g] = -c22;
        return fArray3;
    }

    /*
     * WARNING - void declaration
     */
    private int J(String string) {
        void a2;
        String[] stringArray = this;
        if (a2 == null) {
            return pua.o;
        }
        Object b22 = Config.J((String)a2, Era.Aa);
        if (((String[])b22).length != uqa.g) {
            Config.J(new StringBuilder().insert(3 & 4, jpa.fa).append((String)a2).toString());
            return pua.o;
        }
        b22 = b22[uSa.E];
        int b22 = Config.J((String)b22, pua.o);
        int n2 = Config.J(b22[vRa.d], pua.o);
        if (b22 >= 0 && b22 <= AQa.ba && n2 >= 0 && n2 <= lPa.p) {
            if ((b22 -= uua.p) < 0) {
                b22 += 24;
            }
            return b22 * PRa.U + (int)((double)n2 / Zta.l * Tpa.M);
        }
        Config.J(new StringBuilder().insert(3 ^ 3, jpa.fa).append((String)a2).toString());
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, float f2, float f3) {
        float f4;
        void a2;
        int d222 = n2;
        oe_1 c2 = this;
        float d222 = a2 * c2.J(d222);
        d222 = Config.J(d222, JPa.N, pqa.r);
        if (f4 >= WSa.B) {
            oe_1 oe_12 = c2;
            uKa.C((int)oe_12.m);
            Vd.J(oe_12.i, d222);
            uKa.e();
            if (oe_12.g) {
                void b2;
                uKa.J((float)(b2 * CRa.ja * c2.F), (float)c2.J[uSa.E], (float)c2.J[vRa.d], (float)c2.J[uqa.g]);
            }
            pKa d222 = pKa.J();
            uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)kPa.Ha, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            oe_1 oe_13 = c2;
            pKa pKa2 = d222;
            oe_1 oe_14 = c2;
            pKa pKa3 = d222;
            c2.J(pKa3, AQa.P);
            uKa.e();
            uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            oe_14.J(pKa3, vRa.d);
            uKa.D();
            uKa.e();
            uKa.J((float)kPa.Ha, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            oe_14.J(d222, uSa.E);
            uKa.D();
            uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            c2.J(pKa2, tTa.h);
            uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            oe_13.J(pKa2, uqa.g);
            uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            oe_13.J(d222, yRa.d);
            uKa.D();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, int n2) {
        void a2;
        oe_1 b2;
        oe_1 c22 = gg2;
        oe_1 oe_12 = b2 = this;
        if (oe_12.J((int)a2, b2.E, oe_12.L)) {
            return uSa.E != 0;
        }
        if (b2.I != null) {
            long l2;
            long l3 = l2 = c22.f() - (long)b2.L;
            while (l3 < nqa.i) {
                l3 = l2 + (long)(Qqa.B * b2.j);
            }
            int c22 = (int)(l2 / dua.Aa) % b2.j;
            if (!b2.I.J(c22)) {
                return uSa.E != 0;
            }
        }
        return vRa.d != 0;
    }

    public boolean J(String string) {
        String b22 = string;
        oe_1 a2 = this;
        if (a2.M == null) {
            Config.J(new StringBuilder().insert(3 & 4, AQa.ha).append(b22).toString());
            return uSa.E != 0;
        }
        oe_1 oe_12 = a2;
        oe_12.M = Cg.J((String)oe_12.M, (String)Cg.J((String)b22));
        if (oe_12.L >= 0 && a2.k >= 0 && a2.E >= 0) {
            int n2;
            int n3;
            oe_1 oe_13 = a2;
            oe_1 oe_14 = a2;
            int b22 = oe_13.J(oe_13.k - oe_14.L);
            if (oe_14.C < 0) {
                oe_1 oe_15 = a2;
                oe_15.C = oe_15.J(oe_15.E - b22);
                oe_1 oe_16 = a2;
                if (oe_15.J(oe_15.C, oe_16.L, oe_16.k)) {
                    a2.C = a2.k;
                }
            }
            oe_1 oe_17 = a2;
            oe_1 oe_18 = a2;
            int n4 = oe_17.J(oe_17.C - oe_18.k);
            if ((b22 = b22 + n4 + (n3 = oe_17.J(oe_18.E - a2.C)) + (n2 = oe_17.J(oe_17.L - a2.E))) != Qqa.B) {
                Config.J(new StringBuilder().insert(3 & 4, PRa.l).append(b22).toString());
                return uSa.E != 0;
            }
            if (a2.F < JPa.N) {
                Config.J(new StringBuilder().insert(3 ^ 3, zsa.V).append(a2.F).toString());
                return uSa.E != 0;
            }
            if (a2.j <= 0) {
                Config.J(new StringBuilder().insert(3 ^ 3, Lsa.z).append(a2.j).toString());
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        Config.J(tua.o);
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private float J(String string, float f2) {
        void a2;
        String c2 = string;
        oe_1 b2 = this;
        if (c2 == null) {
            return (float)a2;
        }
        float f3 = Config.J(c2, CRa.V);
        if (f3 == CRa.V) {
            Config.J(new StringBuilder().insert(5 >> 3, hqa.N).append(c2).toString());
            return (float)a2;
        }
        return f3;
    }

    static {
        float[] fArray = new float[yRa.d];
        fArray[uSa.E] = pqa.r;
        fArray[vRa.d] = JPa.N;
        fArray[uqa.g] = JPa.N;
        A = fArray;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(String string, boolean bl) {
        void a2;
        String c2 = string;
        oe_1 b2 = this;
        if (c2 == null) {
            return (boolean)a2;
        }
        if (c2.toLowerCase().equals(oQa.l)) {
            return vRa.d != 0;
        }
        if (c2.toLowerCase().equals(MRa.E)) {
            return uSa.E != 0;
        }
        Config.J(new StringBuilder().insert(3 >> 2, hra.M).append(c2).toString());
        return (boolean)a2;
    }

    private float J(int n2) {
        oe_1 a2;
        int b2 = n2;
        oe_1 oe_12 = a2 = this;
        if (oe_12.J(b2, a2.L, oe_12.k)) {
            oe_1 oe_13 = a2;
            oe_1 oe_14 = a2;
            int n3 = oe_13.J(oe_13.k - oe_14.L);
            int n4 = oe_14.J(b2 - a2.L);
            return (float)n4 / (float)n3;
        }
        oe_1 oe_15 = a2;
        if (a2.J(b2, oe_15.k, oe_15.C)) {
            return pqa.r;
        }
        oe_1 oe_16 = a2;
        if (a2.J(b2, oe_16.C, oe_16.E)) {
            oe_1 oe_17 = a2;
            oe_1 oe_18 = a2;
            int n5 = oe_17.J(oe_17.E - oe_18.C);
            int n6 = oe_18.J(b2 - a2.C);
            return pqa.r - (float)n6 / (float)n5;
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public oe_1(Properties properties, String string) {
        void a2;
        oe_1 b2;
        Properties c2 = properties;
        oe_1 oe_12 = b2 = this;
        oe_1 oe_13 = b2;
        oe_1 oe_14 = b2;
        oe_14.M = null;
        b2.L = pua.o;
        oe_14.k = pua.o;
        oe_14.C = pua.o;
        oe_14.E = pua.o;
        oe_14.i = vRa.d;
        oe_14.g = uSa.E;
        oe_14.F = pqa.r;
        oe_13.J = A;
        oe_12.I = null;
        oe_13.j = Yqa.i;
        oe_12.m = pua.o;
        LE lE2 = new LE(kta.T);
        oe_12.M = c2.getProperty(kqa.Ha, (String)a2);
        oe_12.L = oe_12.J(c2.getProperty(ppa.r));
        oe_12.k = oe_12.J(c2.getProperty(aPa.A));
        oe_12.C = oe_12.J(c2.getProperty(Wqa.ga));
        oe_12.E = oe_12.J(c2.getProperty(DQa.e));
        oe_12.i = Vd.J(c2.getProperty(csa.G));
        oe_12.g = oe_12.J(c2.getProperty(Zqa.n), vRa.d != 0);
        oe_12.F = oe_12.J(c2.getProperty(TOa.Ha), pqa.r);
        oe_12.J = oe_12.J(c2.getProperty(Ypa.V), A);
        oe_12.I = lE2.J(c2.getProperty(MQa.G));
        oe_12.j = lE2.J(c2.getProperty(vQa.s), Yqa.i);
    }

    private int J(int n2) {
        int b2 = n2;
        oe_1 a2 = this;
        int n3 = b2;
        while (n3 >= Qqa.B) {
            n3 = b2 -= 24000;
        }
        int n4 = b2;
        while (n4 < 0) {
            n4 = b2 += 24000;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(pKa pKa2, int n2) {
        void a2;
        oe_1 c2 = pKa2;
        oe_1 b2 = this;
        oe_1 oe_12 = c2;
        c2 = oe_12.J();
        double d2 = (double)(a2 % yRa.d) / uRa.I;
        double d3 = (double)(a2 / yRa.d) / KPa.y;
        oe_1 oe_13 = c2;
        oe_13.J(XTa.W, mka.A);
        oe_13.J(wra.Ja, wra.Ja, wra.Ja).J(d2, d3).M();
        oe_13.J(wra.Ja, wra.Ja, fqa.W).J(d2, d3 + kTa.B).M();
        oe_13.J(fqa.W, wra.Ja, fqa.W).J(d2 + Lqa.S, d3 + kTa.B).M();
        oe_13.J(fqa.W, wra.Ja, wra.Ja).J(d2 + Lqa.S, d3).M();
        oe_12.J();
    }
}

