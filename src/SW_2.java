/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dx
 *  Gua
 *  IW
 *  Iv
 *  KW
 *  MW
 *  NTa
 *  SOa
 *  XTa
 *  YSa
 *  Ypa
 *  ZV
 *  Zta
 *  cW
 *  hTa
 *  jRa
 *  jsa
 *  nU
 *  oU
 *  pU
 *  vRa
 *  vW
 *  vv
 *  wv
 */
import java.util.List;
import java.util.Random;

public final class SW_2 {
    private static final vv[] primaryComponents;
    private static final vv[] secondaryComponents;

    /*
     * WARNING - void declaration
     */
    private static MW f(vv vv2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        vv vv3 = vv2;
        Class clazz = vv3.weightClass;
        Object h2 = null;
        if (clazz == kU.class) {
            h2 = kU.J((List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == ZV.class) {
            h2 = ZV.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == vW.class) {
            h2 = vW.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == IW.class) {
            h2 = IW.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (int)a2, (DZ)b2);
            return h2;
        }
        if (clazz == FV.class) {
            h2 = FV.J((List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (int)a2, (DZ)b2);
            return h2;
        }
        if (clazz == wv.class) {
            h2 = wv.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == KW.class) {
            h2 = KW.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == pU.class) {
            h2 = pU.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == rV.class) {
            h2 = rV.J((List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == nU.class) {
            h2 = nU.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == oU.class) {
            h2 = oU.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == Dx.class) {
            h2 = Dx.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h2;
        }
        if (clazz == Iv.class) {
            h2 = Iv.J((List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
        }
        return h2;
    }

    static {
        vv[] vvArray = new vv[uua.p];
        vvArray[uSa.E] = new vv(kU.class, Fsa.d, uSa.E, vRa.d != 0);
        vvArray[vRa.d] = new vv(ZV.class, NTa.C, AQa.P);
        vvArray[uqa.g] = new vv(vW.class, NTa.C, AQa.P);
        vvArray[yRa.d] = new vv(IW.class, NTa.C, yRa.d);
        vvArray[AQa.P] = new vv(FV.class, tTa.h, uqa.g);
        vvArray[tTa.h] = new vv(wv.class, tTa.h, vRa.d);
        primaryComponents = vvArray;
        vv[] vvArray2 = new vv[XTa.W];
        vvArray2[uSa.E] = new vv(KW.class, kTa.g, uSa.E, vRa.d != 0);
        vvArray2[vRa.d] = new vv(Dx.class, Ypa.A, tTa.h);
        vvArray2[uqa.g] = new vv(pU.class, tTa.h, NTa.C);
        vvArray2[yRa.d] = new vv(rV.class, tTa.h, NTa.C);
        vvArray2[AQa.P] = new vv(nU.class, NTa.C, yRa.d, vRa.d != 0);
        vvArray2[tTa.h] = new vv(oU.class, XTa.W, uqa.g);
        vvArray2[uua.p] = new vv(Iv.class, tTa.h, uqa.g);
        secondaryComponents = vvArray2;
    }

    public SW_2() {
        SW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ MW J(vv vv2, List list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        int n6 = n5;
        vv a2 = vv2;
        return SW_2.f(a2, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)h2);
    }

    public static /* synthetic */ vv[] f() {
        return primaryComponents;
    }

    public static void J() {
        uv.f(ZV.class, Gua.m);
        uv.f(wW.class, AQa.L);
        uv.f(kU.class, YSa.q);
        uv.f(nU.class, SOa.fa);
        uv.f(oU.class, eta.S);
        uv.f(wv.class, sqa.a);
        uv.f(Dx.class, nua.z);
        uv.f(rV.class, hTa.Da);
        uv.f(KW.class, jRa.O);
        uv.f(pU.class, jsa.l);
        uv.f(Iv.class, ITa.K);
        uv.f(FV.class, xTa.Q);
        uv.f(vW.class, Nra.W);
        uv.f(IW.class, fqa.b);
        uv.f(cW.class, Zta.g);
    }

    public static /* synthetic */ vv[] J() {
        return secondaryComponents;
    }
}

