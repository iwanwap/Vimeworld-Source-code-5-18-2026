/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Kpa
 *  Mda
 *  Oz
 *  YSa
 *  ZOa
 *  bqa
 *  gZ
 *  kta
 *  ld
 *  pqa
 *  qta
 *  uw
 *  vRa
 *  xy
 */
import com.mojang.authlib.GameProfile;

public final class Hna
extends XW {
    private double g;
    private boolean L;
    private double E;
    private int k;
    private double j;
    private double J;
    private double I;

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void h2;
        void c2;
        void d5;
        void e2;
        void f4;
        void g2;
        Hna b2;
        int n3 = n2;
        Hna hna2 = b2 = this;
        Hna hna3 = b2;
        Hna hna4 = b2;
        hna4.g = g2;
        hna4.E = f4;
        hna3.J = e2;
        hna3.I = (double)d5;
        hna2.j = (double)c2;
        hna2.k = h2;
    }

    public void J(ld ld2) {
        Hna b2 = ld2;
        Hna a2 = this;
        Kpa.J().Ya.J().J((ld)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(int n2, Mda mda2) {
        void b2;
        Hna c2 = mda2;
        Hna a2 = this;
        if (b2 == false) {
            a2.K.j[a2.K.J] = c2;
            return;
        }
        a2.K.A[b2 - vRa.d] = c2;
    }

    public xy f() {
        Hna hna2 = this;
        if (uw.j == uqa.g && !hna2.p()) {
            Hna a2 = hna2.J();
            return new xy(((xy)a2).J - fPa.ca, ((xy)a2).j, ((xy)a2).I - fPa.ca, ((xy)a2).A + fPa.ca, ((xy)a2).j + oua.i, ((xy)a2).k + fPa.ca);
        }
        return super.f();
    }

    public XF J() {
        Hna a2;
        return new XF(a2.la + kTa.B, a2.Z + kTa.B, a2.A + kTa.B);
    }

    @Override
    public void y() {
        Hna a2;
        if (a2.k > 0) {
            double d2;
            Hna hna2 = a2;
            double d3 = hna2.la + (a2.g - a2.la) / (double)a2.k;
            Hna hna3 = a2;
            double d4 = hna2.Z + (hna3.E - a2.Z) / (double)a2.k;
            double d5 = hna3.A + (a2.J - a2.A) / (double)a2.k;
            double d6 = d2 = hna2.I - (double)a2.X;
            while (d6 < bqa.H) {
                d6 = d2 + ZOa.Ja;
            }
            double d7 = d2;
            while (d7 >= kta.Da) {
                d7 = d2 - ZOa.Ja;
            }
            Hna hna4 = a2;
            Hna hna5 = a2;
            Hna hna6 = a2;
            hna6.X = (float)((double)hna6.X + d2 / (double)a2.k);
            hna6.d = (float)((double)hna6.d + (a2.j - (double)a2.d) / (double)a2.k);
            hna5.k -= vRa.d;
            hna5.l(d3, d4, d5);
            hna4.C(hna4.X, a2.d);
        }
        Hna hna7 = a2;
        hna7.Z = hna7.S;
        hna7.z();
        float f2 = Oz.J((double)(hna7.i * a2.i + a2.f * a2.f));
        float f3 = (float)Math.atan(-hna7.Ea * Bua.Ia) * qta.D;
        if (f2 > Nra.e) {
            f2 = Nra.e;
        }
        if (!a2.ha || a2.f() <= JPa.N) {
            f2 = JPa.N;
        }
        if (a2.ha || a2.f() <= JPa.N) {
            f3 = JPa.N;
        }
        Hna hna8 = a2;
        hna8.S += (f2 - a2.S) * Xpa.R;
        hna8.G += (f3 - a2.G) * xSa.la;
    }

    /*
     * WARNING - void declaration
     */
    public Hna(Gg gg2, GameProfile gameProfile) {
        void b2;
        Object c2 = gameProfile;
        Hna a2 = this;
        super((Gg)b2, (GameProfile)c2);
        a2.Ka = JPa.N;
        a2.Ma = vRa.d;
        a2.y = rta.o;
        a2.n = Wqa.m;
    }

    public boolean J(int n2, String string) {
        Object c2 = string;
        Hna a2 = this;
        return uSa.E != 0;
    }

    @Override
    public boolean J(gZ gZ2, float f2) {
        float c2 = f2;
        Hna a2 = this;
        return vRa.d != 0;
    }

    @Override
    public void d() {
        float f2;
        Hna hna2;
        Hna hna3 = hna2 = this;
        hna3.y = JPa.N;
        super.d();
        hna3.z = hna3.U;
        double d2 = hna3.la - hna2.c;
        double d3 = hna3.A - hna2.r;
        double d4 = d2;
        double d5 = d3;
        float f3 = Oz.J((double)(d4 * d4 + d5 * d5)) * YSa.G;
        if (f2 > pqa.r) {
            f3 = pqa.r;
        }
        Hna hna4 = hna2;
        hna4.U += (f3 - hna2.U) * Xpa.R;
        hna4.E += hna2.U;
        if (!hna4.L && hna2.A() && hna2.K.j[hna2.K.J] != null) {
            Hna hna5 = hna2;
            Hna hna6 = hna2;
            Hna a2 = hna5.K.j[hna6.K.J];
            hna6.f(hna5.K.j[hna2.K.J], a2.J().J((Mda)a2));
            hna5.L = vRa.d;
            return;
        }
        if (hna2.L && !hna2.A()) {
            hna2.Q();
            hna2.L = uSa.E;
        }
    }
}

