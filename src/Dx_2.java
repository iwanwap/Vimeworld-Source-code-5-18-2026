/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dx
 *  Gg
 *  MW
 *  QFa
 *  XTa
 *  Xv
 *  cW
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class Dx_2
extends MW {
    /*
     * WARNING - void declaration
     */
    public static Dx J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)uSa.E, (int)uSa.E, (int)tTa.h, (int)XTa.W, (int)tTa.h, (DZ)b2);
        if (Dx_2.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new Dx_2((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b2;
        void c2;
        Dx_2 a2;
        Dx_2 d2 = xv2;
        Dx_2 dx_2 = a2 = this;
        void v1 = c2;
        Dx_2 dx_22 = d2;
        Dx_2 dx_23 = a2;
        void v4 = c2;
        a2.J((Gg)v4, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, vRa.d, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        dx_23.J((Gg)v4, (Xv)d2, uSa.E, uqa.g, uSa.E, AQa.P, tTa.h, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        dx_23.J((Gg)c2, (Xv)d2, uSa.E, uqa.g, uSa.E, uSa.E, tTa.h, uSa.E, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)dx_22, AQa.P, uqa.g, uSa.E, AQa.P, tTa.h, uSa.E, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        a2.J((Gg)v1, (Xv)dx_22, uSa.E, uqa.g, AQa.P, uSa.E, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        dx_2.J((Gg)v1, (Xv)d2, AQa.P, uqa.g, AQa.P, AQa.P, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        dx_2.J((Gg)c2, (Xv)d2, uSa.E, uua.p, uSa.E, AQa.P, uua.p, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        int n2 = b2 = uSa.E;
        while (n2 <= AQa.P) {
            int n3 = uSa.E;
            while (n3 <= AQa.P) {
                int n4;
                a2.J((Gg)c2, QFa.Cf.J(), b2, pua.o, n4++, (Xv)d2);
                n3 = n4;
            }
            n2 = ++b2;
        }
        return vRa.d != 0;
    }

    public Dx_2() {
        Dx_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        Dx_2 a2 = this;
        a2.l((cW)c2, (List)b2, (Random)d2, vRa.d, uSa.E, vRa.d != 0);
        a2.f((cW)c2, (List)b2, (Random)d2, uSa.E, vRa.d, vRa.d != 0);
        a2.J((cW)c2, (List)b2, (Random)d2, uSa.E, vRa.d, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Dx_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        Dx_2 a2;
        Dx_2 dx_2 = object;
        Object object = dZ2;
        Dx_2 dx_22 = a2 = dx_2;
        super((int)d2);
        dx_22.coordBaseMode = e2;
        dx_22.boundingBox = b2;
    }
}

