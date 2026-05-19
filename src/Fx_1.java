/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fx
 *  Gg
 *  NTa
 *  QFa
 *  Wv
 *  XTa
 *  Xv
 *  jpa
 *  lW
 *  pPa
 *  pua
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;

public final class Fx_1
extends Wv {
    public Fx_1() {
        Fx_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        Fx_1 a2 = this;
        a2.f((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public static Fx J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)jpa.r, (int)uSa.E, (int)tTa.h, (int)pPa.f, (int)Yqa.i, (DZ)b2);
        if (Fx_1.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new Fx_1((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Fx_1(int n2, Random random, Xv xv, DZ dZ2) {
        void b2;
        void c2;
        Object e2;
        void d2;
        Fx_1 fx_1 = object;
        Object object = dZ2;
        Fx_1 a2 = fx_1;
        super((int)d2);
        a2.coordBaseMode = e2;
        a2.field_143013_d = a2.J((Random)c2);
        a2.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        int d2;
        void b22;
        void a2;
        void c2;
        Fx_1 fx_1 = this;
        if (fx_1.J((Gg)c2, (Xv)a2)) {
            return uSa.E != 0;
        }
        Fx_1 fx_12 = fx_1;
        void v1 = c2;
        fx_1.J((Gg)v1, (Xv)a2, uSa.E, uSa.E, uSa.E, AQa.P, NTa.C, XTa.W, vRa.d != 0, (Random)b22, (ww)LV.J());
        fx_12.J((Gg)v1, (Random)b22, (Xv)a2, fx_1.field_143013_d, vRa.d, XTa.W, uSa.E);
        fx_12.J((Gg)c2, (Random)b22, (Xv)a2, nw.OPENING, vRa.d, vRa.d, XTa.W);
        int b22 = fx_1.J(QFa.We, uqa.g);
        int n2 = d2 = uSa.E;
        while (n2 < uua.p) {
            Fx_1 fx_13 = fx_1;
            void v4 = c2;
            fx_1.f((Gg)v4, QFa.We.J(b22), vRa.d, uua.p - d2, vRa.d + d2, (Xv)a2);
            fx_13.f((Gg)v4, QFa.We.J(b22), uqa.g, uua.p - d2, vRa.d + d2, (Xv)a2);
            fx_13.f((Gg)c2, QFa.We.J(b22), yRa.d, uua.p - d2, vRa.d + d2, (Xv)a2);
            if (d2 < tTa.h) {
                Fx_1 fx_14 = fx_1;
                void v6 = c2;
                fx_1.f((Gg)v6, QFa.v.J(), vRa.d, tTa.h - d2, vRa.d + d2, (Xv)a2);
                fx_14.f((Gg)v6, QFa.v.J(), uqa.g, tTa.h - d2, vRa.d + d2, (Xv)a2);
                fx_14.f((Gg)c2, QFa.v.J(), yRa.d, tTa.h - d2, vRa.d + d2, (Xv)a2);
            }
            n2 = ++d2;
        }
        return vRa.d != 0;
    }
}

