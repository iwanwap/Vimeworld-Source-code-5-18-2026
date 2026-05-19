/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  Wv
 *  XTa
 *  Xv
 *  ex
 *  lW
 *  pPa
 *  pua
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;

public final class ex_3
extends Wv {
    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        ex_3 a2 = this;
        a2.f((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public ex_3(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void c2;
        Object e2;
        void d2;
        ex_3 ex_32 = object;
        Object object = dZ2;
        ex_3 a2 = ex_32;
        super((int)d2);
        a2.coordBaseMode = e2;
        a2.field_143013_d = a2.J((Random)c2);
        a2.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        ex_3 a2 = this;
        ex_3 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        ex_3 ex_32 = a2;
        void v1 = c2;
        void v2 = c2;
        ex_3 ex_33 = a2;
        void v4 = c2;
        ex_3 ex_34 = d2;
        ex_3 ex_35 = a2;
        void v7 = c2;
        ex_3 ex_36 = d2;
        ex_3 ex_37 = a2;
        void v10 = c2;
        a2.J((Gg)v10, (Xv)d2, uSa.E, uSa.E, uSa.E, Yqa.i, AQa.P, NTa.C, vRa.d != 0, (Random)b2, (ww)LV.J());
        ex_37.J((Gg)v10, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, vRa.d, uSa.E);
        ex_37.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, NTa.C, yRa.d, yRa.d, NTa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)ex_36, AQa.P, vRa.d, vRa.d, AQa.P, yRa.d, vRa.d, uSa.E != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)v7, (Xv)ex_36, AQa.P, vRa.d, yRa.d, AQa.P, yRa.d, yRa.d, uSa.E != 0, (Random)b2, (ww)LV.J());
        ex_35.J((Gg)v7, (Xv)d2, AQa.P, vRa.d, XTa.W, AQa.P, yRa.d, XTa.W, uSa.E != 0, (Random)b2, (ww)LV.J());
        ex_35.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, WOa.fa, AQa.P, yRa.d, WOa.fa, uSa.E != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)c2, (Xv)ex_34, AQa.P, vRa.d, AQa.P, AQa.P, yRa.d, uua.p, QFa.u.J(), QFa.u.J(), uSa.E != 0);
        a2.J((Gg)v4, (Xv)ex_34, tTa.h, vRa.d, tTa.h, XTa.W, yRa.d, tTa.h, QFa.u.J(), QFa.u.J(), uSa.E != 0);
        ex_33.f((Gg)v4, QFa.u.J(), AQa.P, yRa.d, uqa.g, (Xv)d2);
        ex_33.f((Gg)v2, QFa.u.J(), AQa.P, yRa.d, Yqa.i, (Xv)d2);
        ex_3 ex_38 = a2;
        ex_38.f((Gg)v2, QFa.oC.J(ex_38.J(QFa.oC, yRa.d)), AQa.P, vRa.d, uqa.g, (Xv)d2);
        ex_3 ex_39 = a2;
        ex_39.f((Gg)v2, QFa.oC.J(ex_39.J(QFa.oC, yRa.d) + Yqa.i), AQa.P, uqa.g, uqa.g, (Xv)d2);
        ex_32.f((Gg)v1, QFa.oC.J(a2.J(QFa.oC, yRa.d)), AQa.P, vRa.d, Yqa.i, (Xv)d2);
        ex_32.f((Gg)v1, QFa.oC.J(a2.J(QFa.oC, yRa.d) + Yqa.i), AQa.P, uqa.g, Yqa.i, (Xv)d2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static ex J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)WOa.fa, (int)tTa.h, (int)pPa.f, (DZ)b2);
        if (ex_3.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new ex_3((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    public ex_3() {
        ex_3 a2;
    }
}

