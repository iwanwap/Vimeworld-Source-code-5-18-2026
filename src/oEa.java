/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Gl
 *  ISa
 *  Lz
 *  NCa
 *  Oz
 *  Qqa
 *  UZ
 *  Waa
 *  YSa
 *  aSa
 *  bpa
 *  fsa
 *  gZ
 *  hTa
 *  kta
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vRa
 *  xy
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class oEa
extends vL {
    public Gl G;
    private int D;
    private int f;
    private int F;
    private Block E;
    private int m;
    public double C;
    public double M;
    public double k;
    private boolean j;
    private int A;

    public float J() {
        return fsa.Ia;
    }

    public oEa(Gg gg2) {
        oEa a2;
        oEa b2 = gg2;
        oEa oEa2 = a2 = this;
        super((Gg)b2);
        oEa2.f = pua.o;
        oEa2.A = pua.o;
        oEa2.F = pua.o;
        oEa2.l(pqa.r, pqa.r);
    }

    public void J() {
    }

    public void f(Waa waa2) {
        oEa b2 = waa2;
        oEa a2 = this;
        oEa oEa2 = b2;
        oEa2.J(fPa.g, (short)a2.f);
        oEa2.J(pua.g, (short)a2.A);
        oEa2.J(pua.N, (short)a2.F);
        ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(a2.E);
        b2.J(xSa.l, resourceLocation == null ? Mqa.y : resourceLocation.toString());
        b2.J(hTa.ha, (byte)(a2.j ? vRa.d : uSa.E));
        double[] dArray = new double[yRa.d];
        dArray[uSa.E] = a2.i;
        dArray[vRa.d] = a2.Ea;
        dArray[uqa.g] = a2.f;
        b2.J(pta.i, (NCa)a2.J(dArray));
    }

    public float C() {
        return pqa.r;
    }

    public boolean J(gZ gZ2, float f2) {
        oEa b2 = this;
        oEa c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        b2.i();
        if (c2.f() != null) {
            Lz a2 = c2.f().f();
            if (a2 != null) {
                oEa oEa2 = b2;
                oEa oEa3 = b2;
                Lz lz2 = a2;
                b2.f(lz2.A);
                oEa3.J(lz2.j);
                oEa2.l(a2.J);
                oEa2.M = oEa3.i * tpa.k;
                oEa2.k = oEa2.Ea * tpa.k;
                oEa2.C = oEa2.f * tpa.k;
            }
            if (c2.f() instanceof Gl) {
                b2.G = (Gl)c2.f();
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public abstract void J(RY var1);

    public int J(float f2) {
        float b2 = f2;
        oEa a2 = this;
        return YSa.L;
    }

    public void d() {
        oEa oEa2 = this;
        if (oEa2.j.e || (oEa2.G == null || !oEa2.G.J) && oEa2.j.F(new XF(oEa2))) {
            int n2;
            oEa oEa3 = oEa2;
            super.d();
            oEa3.J(vRa.d);
            if (oEa3.j) {
                oEa oEa4 = oEa2;
                if (oEa2.j.J(new XF(oEa4.f, oEa4.A, oEa2.F)).J() == oEa2.E) {
                    oEa oEa5 = oEa2;
                    oEa5.m += vRa.d;
                    if (oEa5.m == Jpa.z) {
                        oEa2.k();
                    }
                    return;
                }
                oEa oEa6 = oEa2;
                oEa6.j = uSa.E;
                oEa oEa7 = oEa2;
                oEa7.f(oEa6.i * (double)(oEa7.R.nextFloat() * psa.N));
                oEa6.J(oEa6.Ea * (double)(oEa2.R.nextFloat() * psa.N));
                oEa6.l(oEa6.f * (double)(oEa2.R.nextFloat() * psa.N));
                oEa6.m = uSa.E;
                oEa6.D = uSa.E;
            } else {
                oEa2.D += vRa.d;
            }
            Lz lz2 = new Lz(oEa2.la, oEa2.Z, (double)oEa2.A);
            Lz lz3 = new Lz(oEa2.la + oEa2.i, oEa2.Z + oEa2.Ea, (double)(oEa2.A + oEa2.f));
            RY rY2 = oEa2.j.J(lz2, lz3);
            lz2 = new Lz(oEa2.la, oEa2.Z, (double)oEa2.A);
            lz3 = new Lz(oEa2.la + oEa2.i, oEa2.Z + oEa2.Ea, (double)(oEa2.A + oEa2.f));
            if (rY2 != null) {
                lz3 = new Lz(rY2.I.A, rY2.I.j, rY2.I.J);
            }
            oEa oEa8 = null;
            oEa oEa9 = oEa2;
            List list = oEa2.j.f((vL)oEa9, oEa2.J().l(oEa9.i, oEa2.Ea, (double)oEa2.f).f(oua.i, oua.i, oua.i));
            double d2 = aSa.V;
            int n3 = n2 = uSa.E;
            while (n3 < list.size()) {
                oEa a2 = (vL)list.get(n2);
                if (a2.E() && (!a2.J((vL)oEa2.G) || oEa2.D >= kTa.g)) {
                    double d3;
                    float f2 = bpa.K;
                    xy xy2 = a2.J().f((double)f2, (double)f2, (double)f2);
                    RY rY3 = xy2.J(lz2, lz3);
                    if (rY3 != null && ((d3 = lz2.l(rY3.I)) < d2 || d2 == aSa.V)) {
                        oEa8 = a2;
                        d2 = d3;
                    }
                }
                n3 = ++n2;
            }
            if (oEa8 != null) {
                rY2 = new RY(oEa8);
            }
            if (rY2 != null) {
                oEa2.J(rY2);
            }
            oEa oEa10 = oEa2;
            oEa oEa11 = oEa10;
            oEa10.la += oEa2.i;
            oEa10.Z += oEa2.Ea;
            oEa10.A += oEa2.f;
            float f3 = Oz.J((double)(oEa10.i * oEa2.i + oEa2.f * oEa2.f));
            oEa10.X = (float)(Oz.f((double)oEa10.f, (double)oEa2.i) * kta.Da / lQa.f) + ISa.a;
            oEa10.d = (float)(Oz.f((double)f3, (double)oEa2.Ea) * kta.Da / lQa.f) - ISa.a;
            while (oEa11.d - oEa2.o < xua.V) {
                oEa oEa12 = oEa2;
                oEa11 = oEa12;
                oEa12.o -= CRa.ja;
            }
            oEa oEa13 = oEa2;
            while (oEa13.d - oEa2.o >= Hra.Ga) {
                oEa oEa14 = oEa2;
                oEa13 = oEa14;
                oEa14.o += CRa.ja;
            }
            oEa oEa15 = oEa2;
            while (oEa15.X - oEa2.s < xua.V) {
                oEa oEa16 = oEa2;
                oEa15 = oEa16;
                oEa16.s -= CRa.ja;
            }
            oEa oEa17 = oEa2;
            while (oEa17.X - oEa2.s >= Hra.Ga) {
                oEa oEa18 = oEa2;
                oEa17 = oEa18;
                oEa18.s += CRa.ja;
            }
            oEa oEa19 = oEa2;
            oEa oEa20 = oEa2;
            oEa19.d = oEa19.o + (oEa20.d - oEa2.o) * psa.N;
            oEa oEa21 = oEa2;
            oEa19.X = oEa20.s + (oEa21.X - oEa21.s) * psa.N;
            float a2 = oEa19.J();
            if (oEa19.L()) {
                int n4;
                int n5 = n4 = uSa.E;
                while (n5 < AQa.P) {
                    float f4 = rta.o;
                    int n6 = --1;
                    oEa2.j.J(UZ.WATER_BUBBLE, oEa2.la - oEa2.i * (double)f4, oEa2.Z - oEa2.Ea * (double)f4, (double)(oEa2.A - oEa2.f * (double)f4), oEa2.i, oEa2.Ea, (double)oEa2.f, new int[uSa.E]);
                    n5 = ++n4;
                }
                a2 = xSa.la;
            }
            oEa oEa22 = oEa2;
            oEa oEa23 = oEa2;
            oEa23.f(oEa22.i + oEa23.M);
            oEa22.J(oEa22.Ea + oEa2.k);
            oEa22.l(oEa22.f + oEa2.C);
            oEa22.f(oEa22.i * (double)a2);
            oEa22.J(oEa22.Ea * (double)a2);
            oEa22.l(oEa22.f * (double)a2);
            oEa22.j.J(UZ.SMOKE_NORMAL, oEa2.la, oEa2.Z + kTa.B, (double)oEa2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            oEa22.l(oEa22.la, oEa2.Z, oEa2.A);
            return;
        }
        oEa2.k();
    }

    public void J(Waa waa2) {
        oEa oEa2;
        oEa b2 = waa2;
        oEa a2 = this;
        oEa oEa3 = b2;
        oEa oEa4 = a2;
        oEa4.f = b2.J(fPa.g);
        oEa4.A = b2.J(pua.g);
        a2.F = oEa3.J(pua.N);
        if (oEa3.J(xSa.l, Yqa.i)) {
            oEa2 = a2;
            a2.E = Block.J(b2.J(xSa.l));
        } else {
            oEa2 = a2;
            a2.E = Block.f(b2.J(xSa.l) & osa.Ja);
        }
        int n2 = (oEa2.j = b2.J(hTa.ha) == vRa.d ? vRa.d : uSa.E) ? 1 : 0;
        if (b2.J(pta.i, WOa.fa)) {
            b2 = b2.J(pta.i, uua.p);
            oEa oEa5 = a2;
            oEa oEa6 = b2;
            a2.f(oEa6.J(uSa.E));
            oEa5.J(oEa6.J(vRa.d));
            oEa5.l(b2.J(uqa.g));
            return;
        }
        a2.k();
    }

    /*
     * WARNING - void declaration
     */
    public oEa(Gg gg2, Gl gl2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        oEa d5;
        oEa f2 = gl2;
        oEa oEa2 = d5 = this;
        oEa oEa3 = d5;
        oEa oEa4 = d5;
        super((Gg)e2);
        d5.f = pua.o;
        d5.A = pua.o;
        d5.F = pua.o;
        oEa4.G = f2;
        oEa4.l(pqa.r, pqa.r);
        oEa oEa5 = f2;
        oEa4.f(((Gl)f2).la, ((Gl)f2).Z, ((Gl)f2).A, ((Gl)oEa5).X, ((Gl)oEa5).d);
        oEa oEa6 = d5;
        oEa6.l(oEa3.la, oEa6.Z, d5.A);
        oEa3.f(aSa.V);
        oEa3.J(aSa.V);
        d5.l(aSa.V);
        void v5 = c2 += d5.R.nextGaussian() * Qqa.b;
        void v6 = b2 += d5.R.nextGaussian() * Qqa.b;
        void v7 = a2 += d5.R.nextGaussian() * Qqa.b;
        double d6 = Oz.J((double)(v5 * v5 + v6 * v6 + v7 * v7));
        d5.M = c2 / d6 * tpa.k;
        oEa2.k = b2 / d6 * tpa.k;
        oEa2.C = a2 / d6 * tpa.k;
    }

    /*
     * WARNING - void declaration
     */
    public oEa(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void c2;
        void a2;
        void b2;
        void d8;
        void e2;
        double f2;
        oEa g2;
        oEa h2 = gg2;
        oEa oEa2 = g2 = this;
        void v1 = f2;
        oEa oEa3 = g2;
        super((Gg)h2);
        oEa3.f = pua.o;
        oEa3.A = pua.o;
        oEa3.F = pua.o;
        oEa3.l(pqa.r, pqa.r);
        oEa oEa4 = g2;
        g2.f((double)v1, (double)e2, (double)d8, oEa4.X, oEa4.d);
        g2.l((double)v1, (double)e2, (double)d8);
        void v4 = b2;
        void v5 = a2;
        f2 = Oz.J((double)(c2 * c2 + v4 * v4 + v5 * v5));
        g2.M = c2 / f2 * tpa.k;
        oEa2.k = b2 / f2 * tpa.k;
        oEa2.C = a2 / f2 * tpa.k;
    }

    public boolean J(double a2) {
        oEa b2;
        double d2 = b2.J().J() * FPa.T;
        if (Double.isNaN(d2)) {
            d2 = FPa.T;
        }
        double d3 = d2 *= ypa.X;
        if (a2 < d3 * d3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean E() {
        return vRa.d != 0;
    }

    public float J(float f2) {
        float b2 = f2;
        oEa a2 = this;
        return pqa.r;
    }
}

