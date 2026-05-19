/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  lW
 *  pua
 *  vRa
 *  ww
 *  xU
 */
import java.util.List;
import java.util.Random;

public final class xU_1
extends Wv {
    private boolean expandsX;
    private boolean expandsZ;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        xU_1 a2 = this;
        xU_1 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        xU_1 xU_12 = a2;
        void v1 = c2;
        xU_1 xU_13 = d2;
        xU_1 xU_14 = a2;
        void v4 = c2;
        a2.J((Gg)v4, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, AQa.P, uua.p, vRa.d != 0, (Random)b2, (ww)LV.J());
        xU_14.J((Gg)v4, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, vRa.d, uSa.E);
        xU_14.J((Gg)c2, (Random)b2, (Xv)d2, nw.OPENING, vRa.d, vRa.d, uua.p);
        a2.J((Gg)c2, (Xv)xU_13, (Random)b2, Nra.e, vRa.d, uqa.g, vRa.d, QFa.FB.J());
        a2.J((Gg)v1, (Xv)xU_13, (Random)b2, Nra.e, yRa.d, uqa.g, vRa.d, QFa.FB.J());
        xU_12.J((Gg)v1, (Xv)d2, (Random)b2, Nra.e, vRa.d, uqa.g, tTa.h, QFa.FB.J());
        xU_12.J((Gg)c2, (Xv)d2, (Random)b2, Nra.e, yRa.d, uqa.g, tTa.h, QFa.FB.J());
        if (a2.expandsX) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, uqa.g, uSa.E, yRa.d, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        if (a2.expandsZ) {
            a2.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, uqa.g, AQa.P, yRa.d, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        return vRa.d != 0;
    }

    public void J(Waa waa2) {
        xU_1 a2;
        xU_1 b2 = waa2;
        xU_1 xU_12 = a2 = this;
        xU_1 xU_13 = b2;
        super.J((Waa)xU_13);
        xU_12.expandsX = xU_13.f(Tqa.Ma);
        xU_12.expandsZ = b2.f(sra.I);
    }

    public void f(Waa waa2) {
        xU_1 b2 = waa2;
        xU_1 a2 = this;
        xU_1 xU_12 = b2;
        super.f((Waa)xU_12);
        xU_12.J(Tqa.Ma, a2.expandsX);
        xU_12.J(sra.I, a2.expandsZ);
    }

    /*
     * WARNING - void declaration
     */
    public static xU J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)XTa.W, (DZ)b2);
        if (xU_1.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new xU_1((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        xU_1 a2 = this;
        a2.f((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
        if (a2.expandsX) {
            a2.l((lW)c2, (List)b2, (Random)d2, vRa.d, uqa.g);
        }
        if (a2.expandsZ) {
            a2.J((lW)c2, (List)b2, (Random)d2, vRa.d, uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    public xU_1(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        xU_1 c2;
        Random e2 = random;
        xU_1 xU_12 = c2 = this;
        super((int)d2);
        c2.coordBaseMode = a2;
        c2.field_143013_d = c2.J(e2);
        xU_12.boundingBox = b2;
        xU_12.expandsX = e2.nextInt(uqa.g) == 0 ? vRa.d : uSa.E;
        c2.expandsZ = e2.nextInt(uqa.g) == 0 ? vRa.d : uSa.E;
    }

    public xU_1() {
        xU_1 a2;
    }
}

