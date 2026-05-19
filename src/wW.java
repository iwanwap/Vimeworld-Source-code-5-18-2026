/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  MW
 *  NTa
 *  QFa
 *  Waa
 *  XTa
 *  Xv
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class wW
extends MW {
    private int fillSeed;

    /*
     * WARNING - void declaration
     */
    public static wW J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pua.o, (int)ERa.Ka, (int)uSa.E, (int)tTa.h, (int)NTa.C, (int)Yqa.i, (DZ)b2);
        if (wW.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new wW((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    public void J(Waa waa2) {
        wW b2 = waa2;
        wW a2 = this;
        super.J((Waa)b2);
        a2.fillSeed = b2.J(XTa.I);
    }

    public void f(Waa waa2) {
        wW b2 = waa2;
        wW a2 = this;
        wW wW2 = b2;
        super.f((Waa)wW2);
        wW2.J(XTa.I, a2.fillSeed);
    }

    /*
     * WARNING - void declaration
     */
    public wW(int n2, Random random, Xv xv2, DZ dZ2) {
        void c2;
        void b2;
        Object e2;
        void d2;
        wW a2;
        wW wW2 = object;
        Object object = dZ2;
        wW wW3 = a2 = wW2;
        super((int)d2);
        a2.coordBaseMode = e2;
        wW3.boundingBox = b2;
        wW3.fillSeed = c2.nextInt();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void a2;
        void c2;
        int n3;
        int d2;
        wW wW2 = this;
        Random b2 = new Random(wW2.fillSeed);
        int n4 = d2 = uSa.E;
        while (n4 <= AQa.P) {
            int n5 = yRa.d;
            while (n5 <= AQa.P) {
                n3 = b2.nextInt(Yqa.i);
                int n6 = d2;
                wW2.J((Gg)c2, (Xv)a2, n6, n2, uSa.E, n6, n2++, n3, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
                n5 = n2;
            }
            n4 = ++d2;
        }
        d2 = b2.nextInt(Yqa.i);
        wW2.J((Gg)c2, (Xv)a2, uSa.E, tTa.h, uSa.E, uSa.E, tTa.h, d2, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        d2 = b2.nextInt(Yqa.i);
        wW2.J((Gg)c2, (Xv)a2, AQa.P, tTa.h, uSa.E, AQa.P, tTa.h, d2, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
        int n7 = d2 = uSa.E;
        while (n7 <= AQa.P) {
            n2 = b2.nextInt(tTa.h);
            int n8 = d2++;
            wW2.J((Gg)c2, (Xv)a2, n8, uqa.g, uSa.E, n8, uqa.g, n2, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
            n7 = d2;
        }
        int n9 = d2 = uSa.E;
        while (n9 <= AQa.P) {
            int n10 = uSa.E;
            while (n10 <= vRa.d) {
                n3 = b2.nextInt(yRa.d);
                int n11 = d2;
                wW2.J((Gg)c2, (Xv)a2, n11, n2, uSa.E, n11, n2++, n3, QFa.Cf.J(), QFa.Cf.J(), uSa.E != 0);
                n10 = n2;
            }
            n9 = ++d2;
        }
        return vRa.d != 0;
    }

    public wW() {
        wW a2;
    }
}

