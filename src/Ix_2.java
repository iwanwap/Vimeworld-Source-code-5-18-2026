/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ix
 *  QFa
 *  Wv
 *  Xv
 *  lW
 *  pua
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;

public class Ix_2
extends Wv {
    public Ix_2() {
        Ix_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        Ix_2 a2 = this;
        if (a2.coordBaseMode != DZ.NORTH && a2.coordBaseMode != DZ.EAST) {
            a2.J((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
            return;
        }
        a2.l((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        Ix_2 a2 = this;
        Ix_2 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        Ix_2 ix_2 = a2;
        ix_2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, AQa.P, AQa.P, vRa.d != 0, (Random)b2, (ww)LV.J());
        ix_2.J((Gg)c2, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, vRa.d, uSa.E);
        if (a2.coordBaseMode != DZ.NORTH && a2.coordBaseMode != DZ.EAST) {
            a2.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, vRa.d, AQa.P, yRa.d, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        } else {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Ix_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void c2;
        Object e2;
        void d2;
        Ix_2 ix_2 = object;
        Object object = dZ2;
        Ix_2 a2 = ix_2;
        super((int)d2);
        a2.coordBaseMode = e2;
        a2.field_143013_d = a2.J((Random)c2);
        a2.boundingBox = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static Ix J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)tTa.h, (DZ)b2);
        if (Ix_2.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new Ix_2((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }
}

