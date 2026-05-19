/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MW
 *  QFa
 *  Waa
 *  XTa
 *  Xv
 *  cW
 *  pua
 *  vRa
 *  wPa
 */
import java.util.List;
import java.util.Random;

public final class rV
extends MW {
    private boolean field_111021_b;

    public void f(Waa waa2) {
        rV b2 = waa2;
        rV a2 = this;
        rV rV2 = b2;
        super.f((Waa)rV2);
        rV2.J(wPa.fa, a2.field_111021_b);
    }

    public void J(Waa waa2) {
        rV b2 = waa2;
        rV a2 = this;
        super.J((Waa)b2);
        a2.field_111021_b = b2.f(wPa.fa);
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        rV a2 = this;
        a2.f((cW)c2, (List)b2, (Random)d2, uSa.E, vRa.d, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public rV(int n2, Random random, Xv xv, DZ dZ2) {
        void c2;
        void b2;
        Object e2;
        void d2;
        rV a2;
        rV rV2 = object;
        Object object = dZ2;
        rV rV3 = a2 = rV2;
        super((int)d2);
        a2.coordBaseMode = e2;
        rV3.boundingBox = b2;
        rV3.field_111021_b = c2.nextInt(yRa.d) == 0 ? vRa.d : uSa.E;
    }

    public rV() {
        rV a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        int b22;
        void c2;
        rV a2;
        rV d2 = xv;
        rV rV2 = a2 = this;
        void v1 = c2;
        rV rV3 = d2;
        rV rV4 = a2;
        void v4 = c2;
        rV rV5 = d2;
        a2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, vRa.d, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rV5, uSa.E, uqa.g, uSa.E, AQa.P, tTa.h, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v4, (Xv)rV5, AQa.P, uqa.g, uSa.E, AQa.P, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        rV4.J((Gg)v4, (Xv)d2, AQa.P, yRa.d, vRa.d, AQa.P, AQa.P, vRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        rV4.J((Gg)c2, (Xv)d2, AQa.P, yRa.d, yRa.d, AQa.P, AQa.P, yRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)rV3, uSa.E, uqa.g, uSa.E, uSa.E, tTa.h, uSa.E, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        a2.J((Gg)v1, (Xv)rV3, uSa.E, uqa.g, AQa.P, yRa.d, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        rV2.J((Gg)v1, (Xv)d2, vRa.d, yRa.d, AQa.P, vRa.d, AQa.P, AQa.P, QFa.iC.J(), QFa.Cf.J(), uSa.E != 0);
        rV2.J((Gg)c2, (Xv)d2, yRa.d, yRa.d, AQa.P, yRa.d, AQa.P, AQa.P, QFa.iC.J(), QFa.Cf.J(), uSa.E != 0);
        if (rV2.field_111021_b) {
            if (d2.J(new XF(a2.J(yRa.d, yRa.d), a2.J(uqa.g), a2.f(yRa.d, yRa.d)))) {
                void b22;
                a2.field_111021_b = uSa.E;
                a2.J((Gg)c2, (Xv)d2, (Random)b22, yRa.d, uqa.g, yRa.d, field_111019_a, uqa.g + b22.nextInt(AQa.P));
            }
        }
        a2.J((Gg)c2, (Xv)d2, uSa.E, uua.p, uSa.E, AQa.P, uua.p, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        int n2 = b22 = uSa.E;
        while (n2 <= AQa.P) {
            int n3 = uSa.E;
            while (n3 <= AQa.P) {
                int n4;
                a2.J((Gg)c2, QFa.Cf.J(), b22, pua.o, n4++, (Xv)d2);
                n3 = n4;
            }
            n2 = ++b22;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static rV J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)uSa.E, (int)uSa.E, (int)tTa.h, (int)XTa.W, (int)tTa.h, (DZ)b2);
        if (rV.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new rV((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }
}

