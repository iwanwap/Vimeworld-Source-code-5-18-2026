/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  XTa
 *  bRa
 *  kpa
 *  pqa
 *  uKa
 *  vQa
 *  vRa
 */
import optifine.Config;

public final class Vd {
    public static final int E = 4;
    public static final int m = 8;
    public static final int C = 3;
    public static final int i = 1;
    public static final int M = 7;
    public static final int k = 0;
    public static final int j = 6;
    public static final int J = 5;
    public static final int A = 1;
    public static final int I = 2;

    public Vd() {
        Vd a2;
    }

    public static int J(String a2) {
        if (a2 == null) {
            return vRa.d;
        }
        if ((a2 = a2.toLowerCase().trim()).equals(eua.t)) {
            return uSa.E;
        }
        if (a2.equals(Qra.U)) {
            return vRa.d;
        }
        if (a2.equals(yOa.u)) {
            return uqa.g;
        }
        if (a2.equals(vQa.T)) {
            return yRa.d;
        }
        if (a2.equals(csa.J)) {
            return AQa.P;
        }
        if (a2.equals(gsa.w)) {
            return tTa.h;
        }
        if (a2.equals(bRa.b)) {
            return uua.p;
        }
        if (a2.equals(Asa.J)) {
            return XTa.W;
        }
        if (a2.equals(sOa.G)) {
            return Yqa.i;
        }
        Config.J(new StringBuilder().insert(5 >> 3, BQa.K).append(a2).toString());
        return vRa.d;
    }

    public static void J(int n2, float f2) {
        float b2 = f2;
        int a2 = n2;
        switch (a2) {
            case 0: {
                uKa.c();
                while (false) {
                }
                uKa.B();
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)b2);
                break;
            }
            case 1: {
                uKa.c();
                uKa.B();
                uKa.f((int)Lra.k, (int)vRa.d);
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)b2);
                break;
            }
            case 2: {
                uKa.c();
                uKa.B();
                uKa.f((int)qQa.C, (int)uSa.E);
                float f3 = b2;
                uKa.f((float)f3, (float)f3, (float)f3, (float)pqa.r);
                break;
            }
            case 3: {
                uKa.c();
                uKa.B();
                uKa.f((int)Qpa.Q, (int)kpa.J);
                float f4 = b2;
                uKa.f((float)f4, (float)f4, (float)f4, (float)f4);
                break;
            }
            case 4: {
                uKa.c();
                uKa.B();
                uKa.f((int)vRa.d, (int)vRa.d);
                float f5 = b2;
                uKa.f((float)f5, (float)f5, (float)f5, (float)pqa.r);
                break;
            }
            case 5: {
                uKa.c();
                uKa.B();
                uKa.f((int)uSa.E, (int)Wqa.w);
                float f6 = b2;
                uKa.f((float)f6, (float)f6, (float)f6, (float)pqa.r);
                break;
            }
            case 6: {
                uKa.c();
                uKa.B();
                uKa.f((int)vRa.d, (int)Wqa.w);
                float f7 = b2;
                uKa.f((float)f7, (float)f7, (float)f7, (float)pqa.r);
                break;
            }
            case 7: {
                uKa.c();
                uKa.B();
                uKa.f((int)Qpa.Q, (int)tua.C);
                float f8 = b2;
                uKa.f((float)f8, (float)f8, (float)f8, (float)pqa.r);
                break;
            }
            case 8: {
                uKa.K();
                uKa.k();
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)b2);
            }
        }
        uKa.H();
    }

    public static void J(float a2) {
        uKa.c();
        uKa.B();
        uKa.f((int)Lra.k, (int)vRa.d);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)a2);
    }
}

