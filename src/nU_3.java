/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MW
 *  NTa
 *  QFa
 *  XTa
 *  Xv
 *  cW
 *  jpa
 *  nU
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class nU_3
extends MW {
    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        nU_3 a2 = this;
        a2.l((cW)c2, (List)b2, (Random)d2, vRa.d, uSa.E, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int d2;
        nU_3 nU_32 = this;
        int b2 = nU_32.J(QFa.qB, uqa.g);
        int n2 = d2 = uSa.E;
        while (n2 <= WOa.fa) {
            void a2;
            void c2;
            int n3 = Math.max(vRa.d, XTa.W - d2);
            int n4 = Math.min(Math.max(n3 + tTa.h, hpa.Z - d2), uua.s);
            int n5 = d2;
            nU_3 nU_33 = nU_32;
            int n6 = d2;
            nU_33.J((Gg)c2, (Xv)a2, uSa.E, uSa.E, n6, AQa.P, n3, n6, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
            int n7 = d2;
            nU_33.J((Gg)c2, (Xv)a2, vRa.d, n3 + vRa.d, n7, yRa.d, n4 - vRa.d, n7, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            if (d2 <= uua.p) {
                nU_3 nU_34 = nU_32;
                void v5 = c2;
                nU_32.f((Gg)v5, QFa.qB.J(b2), vRa.d, n3 + vRa.d, d2, (Xv)a2);
                nU_34.f((Gg)v5, QFa.qB.J(b2), uqa.g, n3 + vRa.d, d2, (Xv)a2);
                nU_34.f((Gg)c2, QFa.qB.J(b2), yRa.d, n3 + vRa.d, d2, (Xv)a2);
            }
            void v6 = c2;
            void v7 = a2;
            int n8 = n4;
            nU_32.J((Gg)c2, (Xv)v7, uSa.E, n8, d2, AQa.P, n8, d2, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
            int n9 = d2;
            nU_32.J((Gg)v6, (Xv)v7, uSa.E, n3 + vRa.d, n9, uSa.E, n4 - vRa.d, n9, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
            int n10 = d2;
            nU_32.J((Gg)v6, (Xv)a2, AQa.P, n3 + vRa.d, n10, AQa.P, n4 - vRa.d, n10, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
            if ((d2 & vRa.d) == 0) {
                nU_3 nU_35 = nU_32;
                int n11 = d2;
                nU_35.J((Gg)c2, (Xv)a2, uSa.E, n3 + uqa.g, n11, uSa.E, n3 + yRa.d, n11, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
                int n12 = d2;
                nU_35.J((Gg)c2, (Xv)a2, AQa.P, n3 + uqa.g, n12, AQa.P, n3 + yRa.d, n12, QFa.iC.J(), QFa.iC.J(), uSa.E != 0);
            }
            int n13 = n3 = uSa.E;
            while (n13 <= AQa.P) {
                nU_32.J((Gg)c2, QFa.Cf.J(), n3++, pua.o, n5, (Xv)a2);
                n13 = n3;
            }
            n2 = ++d2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static nU J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)jpa.r, (int)uSa.E, (int)tTa.h, (int)hpa.Z, (int)NTa.C, (DZ)b2);
        if (nU_3.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new nU_3((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public nU_3(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        nU_3 a2;
        nU_3 nU_32 = object;
        Object object = dZ2;
        nU_3 nU_33 = a2 = nU_32;
        super((int)d2);
        nU_33.coordBaseMode = e2;
        nU_33.boundingBox = b2;
    }

    public nU_3() {
        nU_3 a2;
    }
}

