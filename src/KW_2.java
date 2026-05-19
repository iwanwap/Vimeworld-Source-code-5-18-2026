/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  KW
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

public final class KW_2
extends MW {
    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        KW_2 a2 = this;
        a2.l((cW)c2, (List)b2, (Random)d2, vRa.d, uSa.E, vRa.d != 0);
    }

    public KW_2() {
        KW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b2;
        void c2;
        KW_2 a2;
        KW_2 d2 = xv2;
        KW_2 kW_2 = a2 = this;
        void v1 = c2;
        KW_2 kW_22 = d2;
        KW_2 kW_23 = a2;
        void v4 = c2;
        KW_2 kW_24 = d2;
        a2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, vRa.d, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)kW_24, uSa.E, uqa.g, uSa.E, AQa.P, tTa.h, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v4, (Xv)kW_24, uSa.E, uqa.g, uSa.E, uSa.E, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        kW_23.J((Gg)v4, (Xv)d2, AQa.P, uqa.g, uSa.E, AQa.P, tTa.h, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        kW_23.J((Gg)c2, (Xv)d2, uSa.E, yRa.d, vRa.d, uSa.E, AQa.P, vRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)kW_22, uSa.E, yRa.d, yRa.d, uSa.E, AQa.P, yRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        a2.J((Gg)v1, (Xv)kW_22, AQa.P, yRa.d, vRa.d, AQa.P, AQa.P, vRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        kW_2.J((Gg)v1, (Xv)d2, AQa.P, yRa.d, yRa.d, AQa.P, AQa.P, yRa.d, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
        kW_2.J((Gg)c2, (Xv)d2, uSa.E, uua.p, uSa.E, AQa.P, uua.p, AQa.P, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
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

    /*
     * WARNING - void declaration
     */
    public static KW J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)uSa.E, (int)uSa.E, (int)tTa.h, (int)XTa.W, (int)tTa.h, (DZ)b2);
        if (KW_2.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new KW_2((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public KW_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        KW_2 a2;
        KW_2 kW_2 = object;
        Object object = dZ2;
        KW_2 kW_22 = a2 = kW_2;
        super((int)d2);
        kW_22.coordBaseMode = e2;
        kW_22.boundingBox = b2;
    }
}

