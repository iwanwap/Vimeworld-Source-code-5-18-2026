/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  lW
 *  pPa
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;

public final class Yv
extends Wv {
    private boolean field_74999_h;
    private boolean field_74995_d;
    private boolean field_74996_b;
    private boolean field_74997_c;

    public void J(Waa waa2) {
        Yv a2;
        Yv b2 = waa2;
        Yv yv2 = a2 = this;
        Yv yv3 = b2;
        super.J((Waa)b2);
        a2.field_74996_b = b2.f(POa.R);
        a2.field_74997_c = yv3.f(zOa.w);
        yv2.field_74995_d = yv3.f(cTa.y);
        yv2.field_74999_h = b2.f(oQa.g);
    }

    public Yv() {
        Yv a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void a2;
        void b2;
        void c2;
        Yv yv2 = this;
        int n2 = yRa.d;
        int d2 = tTa.h;
        if (yv2.coordBaseMode == DZ.WEST || yv2.coordBaseMode == DZ.NORTH) {
            n2 = Yqa.i - n2;
            d2 = Yqa.i - d2;
        }
        yv2.f((lW)c2, (List)b2, (Random)a2, tTa.h, vRa.d);
        if (yv2.field_74996_b) {
            yv2.l((lW)c2, (List)b2, (Random)a2, n2, vRa.d);
        }
        if (yv2.field_74997_c) {
            yv2.l((lW)c2, (List)b2, (Random)a2, d2, XTa.W);
        }
        if (yv2.field_74995_d) {
            yv2.J((lW)c2, (List)b2, (Random)a2, n2, vRa.d);
        }
        if (yv2.field_74999_h) {
            yv2.J((lW)c2, (List)b2, (Random)a2, d2, XTa.W);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        Yv a2 = this;
        Yv d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        Yv yv2 = a2;
        yv2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, WOa.fa, Yqa.i, NTa.C, vRa.d != 0, (Random)b2, (ww)LV.J());
        yv2.J((Gg)c2, (Random)b2, (Xv)d2, a2.field_143013_d, AQa.P, yRa.d, uSa.E);
        if (a2.field_74996_b) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, yRa.d, vRa.d, uSa.E, tTa.h, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        if (a2.field_74995_d) {
            a2.J((Gg)c2, (Xv)d2, WOa.fa, yRa.d, vRa.d, WOa.fa, tTa.h, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        if (a2.field_74997_c) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, tTa.h, XTa.W, uSa.E, XTa.W, WOa.fa, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        if (a2.field_74999_h) {
            a2.J((Gg)c2, (Xv)d2, WOa.fa, tTa.h, XTa.W, WOa.fa, XTa.W, WOa.fa, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        Yv yv3 = a2;
        void v2 = c2;
        Yv yv4 = d2;
        Yv yv5 = a2;
        void v5 = c2;
        Yv yv6 = d2;
        Yv yv7 = a2;
        void v8 = c2;
        Yv yv8 = d2;
        Yv yv9 = a2;
        void v11 = c2;
        Yv yv10 = d2;
        a2.J((Gg)c2, (Xv)yv10, tTa.h, vRa.d, NTa.C, XTa.W, yRa.d, NTa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        a2.J((Gg)v11, (Xv)yv10, vRa.d, uqa.g, vRa.d, Yqa.i, uqa.g, uua.p, uSa.E != 0, (Random)b2, (ww)LV.J());
        yv9.J((Gg)v11, (Xv)d2, AQa.P, vRa.d, tTa.h, AQa.P, AQa.P, WOa.fa, uSa.E != 0, (Random)b2, (ww)LV.J());
        yv9.J((Gg)c2, (Xv)d2, Yqa.i, vRa.d, tTa.h, Yqa.i, AQa.P, WOa.fa, uSa.E != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)c2, (Xv)yv8, vRa.d, AQa.P, XTa.W, yRa.d, AQa.P, WOa.fa, uSa.E != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)v8, (Xv)yv8, vRa.d, yRa.d, tTa.h, yRa.d, yRa.d, uua.p, uSa.E != 0, (Random)b2, (ww)LV.J());
        yv7.J((Gg)v8, (Xv)d2, vRa.d, yRa.d, AQa.P, yRa.d, yRa.d, AQa.P, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        yv7.J((Gg)c2, (Xv)d2, vRa.d, AQa.P, uua.p, yRa.d, AQa.P, uua.p, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)yv6, tTa.h, vRa.d, XTa.W, XTa.W, vRa.d, Yqa.i, uSa.E != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)v5, (Xv)yv6, tTa.h, vRa.d, WOa.fa, XTa.W, vRa.d, WOa.fa, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        yv5.J((Gg)v5, (Xv)d2, tTa.h, uqa.g, XTa.W, XTa.W, uqa.g, XTa.W, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        yv5.J((Gg)c2, (Xv)d2, AQa.P, tTa.h, XTa.W, AQa.P, tTa.h, WOa.fa, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)yv4, Yqa.i, tTa.h, XTa.W, Yqa.i, tTa.h, WOa.fa, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        yv3.J((Gg)v2, (Xv)yv4, tTa.h, tTa.h, XTa.W, XTa.W, tTa.h, WOa.fa, QFa.Rd.J(), QFa.Rd.J(), uSa.E != 0);
        yv3.f((Gg)v2, QFa.FB.J(), uua.p, tTa.h, uua.p, (Xv)d2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Yv(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        Yv c2;
        Random e2 = random;
        Yv yv2 = c2 = this;
        Random random2 = e2;
        Yv yv3 = c2;
        super((int)d2);
        c2.coordBaseMode = a2;
        c2.field_143013_d = c2.J(e2);
        yv3.boundingBox = b2;
        yv3.field_74996_b = e2.nextBoolean();
        c2.field_74997_c = random2.nextBoolean();
        yv2.field_74995_d = random2.nextBoolean();
        yv2.field_74999_h = e2.nextInt(yRa.d) > 0 ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static Yv J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pta.a, (int)ERa.Ka, (int)uSa.E, (int)NTa.C, (int)WOa.fa, (int)pPa.f, (DZ)b2);
        if (Yv.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new Yv((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    public void f(Waa waa2) {
        Yv b2 = waa2;
        Yv a2 = this;
        Yv yv2 = b2;
        super.f((Waa)yv2);
        Yv yv3 = b2;
        yv3.J(POa.R, a2.field_74996_b);
        yv3.J(zOa.w, a2.field_74997_c);
        yv2.J(cTa.y, a2.field_74995_d);
        yv2.J(oQa.g, a2.field_74999_h);
    }
}

