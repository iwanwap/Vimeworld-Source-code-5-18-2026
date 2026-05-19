/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MD
 *  MW
 *  QFa
 *  Waa
 *  XTa
 *  Xv
 *  Zta
 *  pua
 *  uY
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class FV
extends MW {
    private boolean hasSpawner;

    public FV() {
        FV a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        XF b2;
        void a2;
        FV c2;
        FV d2 = gg2;
        FV fV2 = c2 = this;
        FV fV3 = d2;
        void v2 = a2;
        FV fV4 = c2;
        FV fV5 = d2;
        void v5 = a2;
        FV fV6 = c2;
        FV fV7 = d2;
        void v8 = a2;
        FV fV8 = c2;
        FV fV9 = d2;
        void v11 = a2;
        FV fV10 = c2;
        fV10.J((Gg)d2, (Xv)a2, uSa.E, uqa.g, uSa.E, uua.p, XTa.W, XTa.W, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        fV10.J((Gg)d2, (Xv)a2, vRa.d, uSa.E, uSa.E, tTa.h, vRa.d, XTa.W, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)d2, (Xv)v11, vRa.d, uqa.g, vRa.d, tTa.h, uqa.g, XTa.W, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)fV9, (Xv)v11, vRa.d, yRa.d, uqa.g, tTa.h, yRa.d, XTa.W, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        fV8.J((Gg)fV9, (Xv)a2, vRa.d, AQa.P, yRa.d, tTa.h, AQa.P, XTa.W, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        fV8.J((Gg)d2, (Xv)a2, vRa.d, uqa.g, uSa.E, vRa.d, AQa.P, uqa.g, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)d2, (Xv)v8, tTa.h, uqa.g, uSa.E, tTa.h, AQa.P, uqa.g, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)fV7, (Xv)v8, vRa.d, tTa.h, uqa.g, vRa.d, tTa.h, yRa.d, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        fV6.J((Gg)fV7, (Xv)a2, tTa.h, tTa.h, uqa.g, tTa.h, tTa.h, yRa.d, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        fV6.J((Gg)d2, (Xv)a2, uSa.E, tTa.h, yRa.d, uSa.E, tTa.h, Yqa.i, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)d2, (Xv)v5, uua.p, tTa.h, yRa.d, uua.p, tTa.h, Yqa.i, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        c2.J((Gg)fV5, (Xv)v5, vRa.d, tTa.h, Yqa.i, tTa.h, tTa.h, Yqa.i, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        fV4.f((Gg)fV5, QFa.iC.J(), vRa.d, uua.p, yRa.d, (Xv)a2);
        fV4.f((Gg)d2, QFa.iC.J(), tTa.h, uua.p, yRa.d, (Xv)a2);
        c2.J((Gg)d2, (Xv)v2, uSa.E, uua.p, yRa.d, uSa.E, uua.p, Yqa.i, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        c2.J((Gg)fV3, (Xv)v2, uua.p, uua.p, yRa.d, uua.p, uua.p, Yqa.i, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        fV2.J((Gg)fV3, (Xv)a2, vRa.d, uua.p, Yqa.i, tTa.h, XTa.W, Yqa.i, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        fV2.J((Gg)d2, (Xv)a2, uqa.g, Yqa.i, Yqa.i, AQa.P, Yqa.i, Yqa.i, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        if (!fV2.hasSpawner && a2.J((MD)(b2 = new XF(c2.J(yRa.d, tTa.h), c2.J(tTa.h), c2.f(yRa.d, tTa.h))))) {
            c2.hasSpawner = vRa.d;
            d2.J(b2, QFa.P.J(), uqa.g);
            uY uY2 = d2.J(b2);
            if (uY2 instanceof Caa) {
                ((Caa)uY2).J().J(Mqa.Ja);
            }
        }
        int n2 = b2 = uSa.E;
        while (n2 <= uua.p) {
            int n3 = uSa.E;
            while (n3 <= uua.p) {
                int n4;
                c2.J((Gg)d2, QFa.Cf.J(), b2, pua.o, n4++, (Xv)a2);
                n3 = n4;
            }
            n2 = ++b2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public FV(int n2, Random random, Xv xv, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        FV a2;
        FV fV2 = object;
        Object object = dZ2;
        FV fV3 = a2 = fV2;
        super((int)d2);
        fV3.coordBaseMode = e2;
        fV3.boundingBox = b2;
    }

    public void J(Waa waa2) {
        FV b2 = waa2;
        FV a2 = this;
        super.J((Waa)b2);
        a2.hasSpawner = b2.f(Zta.ia);
    }

    /*
     * WARNING - void declaration
     */
    public static FV J(List<uU> list, Random random, int n2, int n3, int n4, int n5, DZ dZ2) {
        void a2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)rQa.p, (int)uSa.E, (int)uSa.E, (int)XTa.W, (int)Yqa.i, (int)WOa.fa, (DZ)a2);
        if (FV.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void b2;
            return new FV((int)b2, (Random)f2, g22, (DZ)a2);
        }
        return null;
    }

    public void f(Waa waa2) {
        FV b2 = waa2;
        FV a2 = this;
        FV fV2 = b2;
        super.f((Waa)fV2);
        fV2.J(Zta.ia, a2.hasSpawner);
    }
}

