/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  JPa
 *  LQa
 *  MQa
 *  NTa
 *  Oz
 *  Ssa
 *  Tpa
 *  Waa
 *  XTa
 *  YSa
 *  Yra
 *  ZOa
 *  aSa
 *  bRa
 *  gZ
 *  kta
 *  pqa
 *  psa
 *  qta
 *  vL
 *  vRa
 */
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zEa_3
extends vL {
    private int C;
    private Sx i;
    public int M;
    public int k;
    private int j;
    public int J;
    private int A;

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        zEa_3 a2 = this;
        if (a2.J((gZ)b2)) {
            return uSa.E != 0;
        }
        zEa_3 zEa_32 = a2;
        zEa_32.i();
        zEa_32.C = (int)((float)zEa_32.C - c2);
        if (zEa_32.C <= 0) {
            a2.k();
        }
        return uSa.E != 0;
    }

    public void f(Waa waa2) {
        zEa_3 b2 = waa2;
        zEa_3 a2 = this;
        zEa_3 zEa_32 = b2;
        zEa_32.J(XOa.C, (byte)a2.C);
        zEa_32.J(pqa.L, (short)a2.k);
        zEa_32.J(FRa.d, (short)a2.j);
    }

    public void C(Sx sx2) {
        Sx b2 = sx2;
        zEa_3 a2 = this;
        if (!a2.j.e && a2.M == 0 && b2.X == 0) {
            zEa_3 zEa_32 = a2;
            zEa_3 zEa_33 = a2;
            b2.X = uqa.g;
            zEa_33.j.J((vL)b2, Nta.X, Nra.e, MQa.L * ((a2.R.nextFloat() - a2.R.nextFloat()) * ZSa.q + Ssa.la));
            b2.f(zEa_33, vRa.d);
            b2.F(zEa_32.j);
            zEa_32.k();
        }
    }

    public static int J(int a2) {
        if (a2 >= LRa.H) {
            return LRa.H;
        }
        if (a2 >= vsa.i) {
            return vsa.i;
        }
        if (a2 >= GPa.Ja) {
            return GPa.Ja;
        }
        if (a2 >= Tpa.W) {
            return Tpa.W;
        }
        if (a2 >= gQa.V) {
            return gQa.V;
        }
        if (a2 >= Pua.Ka) {
            return Pua.Ka;
        }
        if (a2 >= LQa.c) {
            return LQa.c;
        }
        if (a2 >= yta.Ka) {
            return yta.Ka;
        }
        if (a2 >= XTa.W) {
            return XTa.W;
        }
        if (a2 >= yRa.d) {
            return yRa.d;
        }
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public int J(float f2) {
        void a22;
        zEa_3 zEa_32 = this;
        float f3 = MQa.L;
        f3 = Oz.J((float)f3, (float)JPa.N, (float)pqa.r);
        int a22 = super.J((float)a22);
        int b2 = a22 & osa.Ja;
        a22 = a22 >> ERa.C & osa.Ja;
        if ((b2 += (int)(f3 * qta.D * Yra.i)) > YSa.c) {
            b2 = YSa.c;
        }
        return b2 | a22 << ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    public zEa_3(Gg gg2, double d2, double d3, double d4, int n2) {
        void f2;
        void b2;
        void c2;
        void d5;
        void e2;
        zEa_3 a2;
        int n3 = n2;
        zEa_3 zEa_32 = a2 = this;
        zEa_3 zEa_33 = a2;
        super((Gg)e2);
        a2.C = tTa.h;
        zEa_33.l(MQa.L, MQa.L);
        zEa_33.l((double)d5, (double)c2, (double)b2);
        a2.X = (float)(Math.random() * ZOa.Ja);
        a2.f((float)(Math.random() * Bua.Ia - Tqa.Ia) * kta.v);
        zEa_32.J((float)(Math.random() * iSa.P) * kta.v);
        zEa_32.l((float)(Math.random() * Bua.Ia - Tqa.Ia) * kta.v);
        zEa_32.j = f2;
    }

    public void J() {
    }

    public boolean I() {
        return uSa.E != 0;
    }

    public zEa_3(Gg gg2) {
        zEa_3 a2;
        zEa_3 b2 = gg2;
        zEa_3 zEa_32 = a2 = this;
        super((Gg)b2);
        zEa_32.C = tTa.h;
        zEa_32.l(rta.o, rta.o);
    }

    public void J(Waa waa2) {
        zEa_3 a2;
        zEa_3 b2 = waa2;
        zEa_3 zEa_32 = a2 = this;
        zEa_3 zEa_33 = b2;
        a2.C = zEa_33.J(XOa.C) & osa.Ja;
        zEa_32.k = zEa_33.J(pqa.L);
        zEa_32.j = b2.J(FRa.d);
    }

    public void d() {
        double d2;
        zEa_3 a2;
        block11: {
            block13: {
                block12: {
                    zEa_3 zEa_32 = a2;
                    super.d();
                    if (zEa_32.M > 0) {
                        a2.M -= vRa.d;
                    }
                    zEa_3 zEa_33 = a2;
                    zEa_33.c = zEa_33.la;
                    zEa_33.ba = zEa_33.Z;
                    zEa_33.r = zEa_33.A;
                    zEa_33.J(zEa_33.Ea - Yua.t);
                    if (zEa_33.j.J(new XF(a2)).J().J() == Material.lava) {
                        zEa_3 zEa_34 = a2;
                        zEa_34.J(Bua.Ia);
                        zEa_3 zEa_35 = a2;
                        zEa_35.f((zEa_34.R.nextFloat() - zEa_35.R.nextFloat()) * psa.N);
                        zEa_34.l((zEa_34.R.nextFloat() - a2.R.nextFloat()) * psa.N);
                        zEa_34.J(bRa.T, Xpa.R, kta.v + a2.R.nextFloat() * Xpa.R);
                    }
                    zEa_3 zEa_36 = a2;
                    zEa_3 zEa_37 = a2;
                    zEa_37.l(zEa_36.la, (zEa_37.J().j + a2.J().M) / KPa.y, a2.A);
                    d2 = Wqa.Z;
                    if (zEa_36.A >= a2.J - kTa.j + a2.M() % ySa.T) break block11;
                    if (a2.i == null) break block12;
                    double d3 = d2;
                    if (!(a2.i.J(a2) > d3 * d3)) break block13;
                }
                a2.i = a2.j.J((vL)a2, d2);
            }
            a2.A = a2.J;
        }
        if (a2.i != null && a2.i.t()) {
            a2.i = null;
        }
        if (a2.i != null) {
            double d4;
            zEa_3 zEa_38 = a2;
            double d5 = (zEa_38.i.la - a2.la) / d2;
            zEa_3 zEa_39 = a2;
            float f2 = (zEa_38.i.Z + (double)zEa_39.i.l() - a2.Z) / d2;
            d2 = (zEa_39.i.A - a2.A) / d2;
            double d6 = d5;
            float f3 = f2;
            double d7 = d2;
            double d8 = Math.sqrt(d6 * d6 + f3 * f3 + d7 * d7);
            double d9 = oua.i - d8;
            if (d4 > aSa.V) {
                double d10 = d9;
                d9 = d10 * d10;
                zEa_3 zEa_310 = a2;
                zEa_310.f((double)(zEa_310.i + d5 / d8 * d9 * tpa.k));
                zEa_310.J(zEa_310.Ea + f2 / d8 * d9 * tpa.k);
                zEa_310.l(zEa_310.f + d2 / d8 * d9 * tpa.k);
            }
        }
        zEa_3 zEa_311 = a2;
        zEa_3 zEa_312 = a2;
        zEa_312.J((double)zEa_311.i, zEa_312.Ea, a2.f);
        float f4 = MQa.d;
        if (zEa_311.ha) {
            f4 = a2.j.J((XF)new XF((int)Oz.f((double)a2.la), (int)(Oz.f((double)a2.J().j) - vRa.d), (int)Oz.f((double)a2.A))).J().slipperiness.J() * MQa.d;
        }
        zEa_3 zEa_313 = a2;
        zEa_313.f((double)(zEa_313.i * (double)f4));
        zEa_313.J(zEa_313.Ea * uua.G);
        zEa_313.l(zEa_313.f * (double)f4);
        if (zEa_313.ha) {
            zEa_3 zEa_314 = a2;
            zEa_314.J(zEa_314.Ea * opa.I);
        }
        zEa_3 zEa_315 = a2;
        zEa_315.J += vRa.d;
        zEa_315.k += vRa.d;
        if (zEa_315.k >= MTa.g) {
            a2.k();
        }
    }

    public int f() {
        zEa_3 a2;
        if (a2.j >= LRa.H) {
            return NTa.C;
        }
        if (a2.j >= vsa.i) {
            return WOa.fa;
        }
        if (a2.j >= GPa.Ja) {
            return Yqa.i;
        }
        if (a2.j >= Tpa.W) {
            return XTa.W;
        }
        if (a2.j >= gQa.V) {
            return uua.p;
        }
        if (a2.j >= Pua.Ka) {
            return tTa.h;
        }
        if (a2.j >= LQa.c) {
            return AQa.P;
        }
        if (a2.j >= yta.Ka) {
            return yRa.d;
        }
        if (a2.j >= XTa.W) {
            return uqa.g;
        }
        if (a2.j >= yRa.d) {
            return vRa.d;
        }
        return uSa.E;
    }

    public boolean d() {
        zEa_3 a2;
        return a2.j.J(a2.J(), Material.water, (vL)a2);
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public int J() {
        zEa_3 a2;
        return a2.j;
    }

    public void C(int n2) {
        int b2 = n2;
        zEa_3 a2 = this;
        a2.J(gZ.j, b2);
    }
}

