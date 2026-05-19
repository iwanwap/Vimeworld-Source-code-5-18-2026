/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Gl
 *  HEa
 *  JPa
 *  Lz
 *  MQa
 *  Mda
 *  NTa
 *  Oz
 *  QFa
 *  Tf
 *  Tpa
 *  Tz
 *  UZ
 *  Waa
 *  XTa
 *  aSa
 *  bpa
 *  cra
 *  dZ
 *  eAa
 *  gZ
 *  hTa
 *  iea
 *  jFa
 *  kGa
 *  kta
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vRa
 *  wra
 *  xy
 *  yra
 *  zEa
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fga
extends vL {
    private int s;
    private int w;
    private Block W;
    private double q;
    private int x;
    public Sx v;
    private double o;
    private double h;
    private double K;
    private double H;
    private static final List<By> c;
    private float B;
    private boolean d;
    private int a;
    private static final List<By> e;
    public int G;
    private double D;
    private int F;
    private double E;
    private int m;
    private double C;
    private static final List<By> M;
    public vL k;
    private int j;
    private int J;
    private int A;

    public boolean J(double a2) {
        Fga b2;
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

    public void k() {
        Fga a2;
        Fga fga = a2;
        super.k();
        if (fga.v != null) {
            a2.v.E = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3) {
        float f4;
        void a2;
        void c2;
        void d5;
        void e2;
        float f5 = f2;
        Fga b2 = this;
        void v0 = e2;
        void v1 = d5;
        void v2 = c2;
        float f6 = Oz.J((double)(v0 * v0 + v1 * v1 + v2 * v2));
        e2 /= (double)f6;
        d5 /= (double)f6;
        c2 /= (double)f6;
        e2 += b2.R.nextGaussian() * Nta.B * (double)a2;
        d5 += b2.R.nextGaussian() * Nta.B * (double)a2;
        c2 += b2.R.nextGaussian() * Nta.B * (double)a2;
        Fga fga = b2;
        fga.f((double)(e2 *= (double)f4));
        fga.J((double)(d5 *= (double)f4));
        b2.l((double)(c2 *= (double)f4));
        void v4 = c2;
        f4 = Oz.J((double)(e2 * e2 + v4 * v4));
        b2.X = (float)(Oz.f((double)e2, (double)c2) * kta.Da / lQa.f);
        b2.s = (int)b2.X;
        b2.d = (float)(Oz.f((double)d5, (double)f4) * kta.Da / lQa.f);
        b2.o = (double)b2.d;
        b2.w = uSa.E;
    }

    public int J() {
        Fga fga;
        Fga fga2 = this;
        if (fga2.j.e) {
            return uSa.E;
        }
        int a2 = uSa.E;
        if (fga2.k != null) {
            Fga fga3 = fga2;
            fga = fga3;
            double d2 = fga3.v.la - fga2.la;
            Fga fga4 = fga2;
            float f2 = fga3.v.Z - fga4.Z;
            float f3 = fga4.v.A - fga2.A;
            double d3 = d2;
            float f4 = f2;
            float f5 = f3;
            double d4 = Oz.J((double)(d3 * d3 + f4 * f4 + f5 * f5));
            double d5 = tpa.k;
            fga3.k.f(fga2.k.i + d2 * d5);
            fga3.k.J(fga2.k.Ea + f2 * d5 + (double)Oz.J((double)d4) * tSa.K);
            fga3.k.l(fga2.k.f + f3 * d5);
            a2 = yRa.d;
        } else {
            if (fga2.a > 0) {
                Fga fga5 = fga2;
                jFa jFa2 = new jFa((Gg)fga5.j, fga5.la, fga2.Z, (double)fga2.A, fga2.J());
                Fga fga6 = fga2;
                double d6 = fga2.v.la - fga2.la;
                float f6 = fga6.v.Z - fga2.Z;
                float f7 = fga6.v.A - fga2.A;
                double d7 = d6;
                float f8 = f6;
                float f9 = f7;
                double d8 = Oz.J((double)(d7 * d7 + f8 * f8 + f9 * f9));
                double d9 = tpa.k;
                jFa jFa3 = jFa2;
                jFa3.f(d6 * d9);
                jFa3.J((double)(f6 * d9 + (double)Oz.J((double)d8) * tSa.K));
                jFa2.l((double)(f7 * d9));
                fga6.j.f((vL)jFa2);
                fga2.v.j.f((vL)new zEa((Gg)fga2.v.j, fga2.v.la, (double)(fga2.v.Z + kTa.B), (double)(fga2.v.A + kTa.B), fga2.R.nextInt(uua.p) + vRa.d));
                a2 = vRa.d;
            }
            fga = fga2;
        }
        if (fga.d) {
            a2 = uqa.g;
        }
        fga2.k();
        fga2.v.E = null;
        return a2;
    }

    public void d(double c2, double b2, double a2) {
        Fga d2;
        Fga fga = d2;
        Fga fga2 = d2;
        fga2.f(c2);
        fga2.J(b2);
        d2.l(a2);
        d2.E = c2;
        fga.o = b2;
        fga.H = a2;
    }

    public void J(Waa waa2) {
        Fga fga;
        Fga b2 = waa2;
        Fga a2 = this;
        Fga fga2 = b2;
        Fga fga3 = a2;
        fga3.j = b2.J(fPa.g);
        fga3.J = b2.J(pua.g);
        a2.m = fga2.J(pua.N);
        if (fga2.J(xSa.l, Yqa.i)) {
            fga = a2;
            a2.W = Block.J(b2.J(xSa.l));
        } else {
            fga = a2;
            a2.W = Block.f(b2.J(xSa.l) & osa.Ja);
        }
        fga.G = b2.J(Qra.v) & osa.Ja;
        a2.d = b2.J(hTa.ha) == vRa.d ? vRa.d : uSa.E;
    }

    public static List<By> J() {
        return e;
    }

    public Fga(Gg gg2) {
        Fga a2;
        Fga b2 = gg2;
        Fga fga = a2 = this;
        super((Gg)b2);
        fga.j = pua.o;
        fga.J = pua.o;
        fga.m = pua.o;
        fga.l(rta.o, rta.o);
        fga.Ja = vRa.d;
    }

    public void d() {
        block46: {
            double d2;
            float f2;
            Fga fga;
            block47: {
                Fga fga2;
                block50: {
                    block49: {
                        int n2;
                        Tf tf;
                        double d3;
                        block51: {
                            block52: {
                                block48: {
                                    int n3;
                                    Fga fga3;
                                    block45: {
                                        block43: {
                                            block44: {
                                                int n4;
                                                Mda mda2;
                                                block40: {
                                                    block42: {
                                                        block41: {
                                                            Fga fga4 = fga = this;
                                                            super.d();
                                                            if (fga4.s > 0) {
                                                                Fga fga5 = fga;
                                                                double d4 = fga5.la + (fga.K - fga.la) / (double)fga.s;
                                                                Fga fga6 = fga;
                                                                double d5 = fga5.Z + (fga6.C - fga.Z) / (double)fga.s;
                                                                int n5 = fga6.A + (fga.q - fga.A) / (double)fga.s;
                                                                double d6 = Oz.J((double)(fga5.h - (double)fga.X));
                                                                fga5.X = (float)((double)fga5.X + d6 / (double)fga.s);
                                                                fga5.d = (float)((double)fga5.d + (fga.D - (double)fga.d) / (double)fga.s);
                                                                fga5.s -= vRa.d;
                                                                fga5.l(d4, d5, n5);
                                                                fga5.C(fga5.X, (float)fga.d);
                                                                return;
                                                            }
                                                            if (fga.j.e) break block40;
                                                            Fga fga7 = fga;
                                                            mda2 = fga7.v.f();
                                                            if (fga7.v.J || !fga.v.K() || mda2 == null || mda2.J() != Gea.DA) break block41;
                                                            Fga fga8 = fga;
                                                            if (!(fga8.J((vL)fga8.v) > yra.Y)) break block42;
                                                        }
                                                        fga.k();
                                                        fga.v.E = null;
                                                        return;
                                                    }
                                                    if (fga.k != null) {
                                                        if (!fga.k.J) {
                                                            Fga fga9 = fga;
                                                            fga9.la = fga9.k.la;
                                                            double d7 = fga9.k.u;
                                                            fga9.Z = fga9.k.J().j + d7 * Jra.A;
                                                            fga9.A = (int)fga9.k.A;
                                                            return;
                                                        }
                                                        fga.k = null;
                                                    }
                                                }
                                                if (fga.G > 0) {
                                                    fga.G -= vRa.d;
                                                }
                                                if (fga.d) {
                                                    Fga fga10 = fga;
                                                    if (fga.j.J(new XF(fga10.j, fga10.J, fga.m)).J() == fga.W) {
                                                        Fga fga11 = fga;
                                                        fga11.w += vRa.d;
                                                        if (fga11.w == PRa.ga) {
                                                            fga.k();
                                                        }
                                                        return;
                                                    }
                                                    Fga fga12 = fga;
                                                    fga12.d = uSa.E;
                                                    Fga fga13 = fga;
                                                    fga13.f(fga12.i * (double)(fga13.R.nextFloat() * psa.N));
                                                    fga12.J(fga12.Ea * (double)(fga.R.nextFloat() * psa.N));
                                                    fga12.l(fga12.f * (double)(fga.R.nextFloat() * psa.N));
                                                    fga12.w = uSa.E;
                                                    fga12.F = uSa.E;
                                                } else {
                                                    fga.F += vRa.d;
                                                }
                                                mda2 = new Lz(fga.la, fga.Z, (double)fga.A);
                                                Lz lz2 = new Lz(fga.la + fga.i, fga.Z + fga.Ea, (double)(fga.A + fga.f));
                                                RY rY2 = fga.j.J((Lz)mda2, lz2);
                                                mda2 = new Lz(fga.la, fga.Z, (double)fga.A);
                                                lz2 = new Lz(fga.la + fga.i, fga.Z + fga.Ea, (double)(fga.A + fga.f));
                                                if (rY2 != null) {
                                                    lz2 = new Lz(rY2.I.A, rY2.I.j, rY2.I.J);
                                                }
                                                vL vL2 = null;
                                                Fga fga14 = fga;
                                                List list = fga.j.f((vL)fga14, fga.J().l(fga14.i, fga.Ea, fga.f).f(oua.i, oua.i, oua.i));
                                                double d8 = aSa.V;
                                                int n6 = n4 = uSa.E;
                                                while (n6 < list.size()) {
                                                    vL vL3 = (vL)list.get(n4);
                                                    if (vL3.E() && (vL3 != fga.v || fga.F >= tTa.h)) {
                                                        double d9;
                                                        float f3 = bpa.K;
                                                        xy xy2 = vL3.J().f((double)f3, (double)f3, (double)f3);
                                                        RY rY3 = xy2.J((Lz)mda2, lz2);
                                                        if (rY3 != null && ((d9 = mda2.l(rY3.I)) < d8 || d8 == aSa.V)) {
                                                            vL2 = vL3;
                                                            d8 = d9;
                                                        }
                                                    }
                                                    n6 = ++n4;
                                                }
                                                if (vL2 != null) {
                                                    rY2 = new RY(vL2);
                                                }
                                                if (rY2 == null) break block43;
                                                if (rY2.J == null) break block44;
                                                Fga fga15 = fga;
                                                if (!rY2.J.J(gZ.J((vL)fga15, (vL)fga15.v), JPa.N)) break block43;
                                                fga3 = fga;
                                                fga.k = rY2.J;
                                                break block45;
                                            }
                                            fga.d = vRa.d;
                                        }
                                        fga3 = fga;
                                    }
                                    if (fga3.d) break block46;
                                    Fga fga16 = fga;
                                    Fga fga17 = fga16;
                                    Fga fga18 = fga;
                                    fga18.J(fga16.i, fga18.Ea, fga.f);
                                    float f4 = Oz.J((double)(fga16.i * fga.i + fga.f * fga.f));
                                    fga16.X = (float)(Oz.f((double)fga16.i, (double)fga.f) * kta.Da / lQa.f);
                                    fga16.d = (float)(Oz.f((double)fga16.Ea, (double)f4) * kta.Da / lQa.f);
                                    while (fga17.d - fga.o < xua.V) {
                                        Fga fga19 = fga;
                                        fga17 = fga19;
                                        fga19.o -= CRa.ja;
                                    }
                                    Fga fga20 = fga;
                                    while (fga20.d - fga.o >= Hra.Ga) {
                                        Fga fga21 = fga;
                                        fga20 = fga21;
                                        fga21.o += CRa.ja;
                                    }
                                    Fga fga22 = fga;
                                    while (fga22.X - fga.s < xua.V) {
                                        Fga fga23 = fga;
                                        fga22 = fga23;
                                        fga23.s -= CRa.ja;
                                    }
                                    Fga fga24 = fga;
                                    while (fga24.X - fga.s >= Hra.Ga) {
                                        Fga fga25 = fga;
                                        fga24 = fga25;
                                        fga25.s += CRa.ja;
                                    }
                                    Fga fga26 = fga;
                                    Fga fga27 = fga;
                                    fga26.d = fga26.o + (fga27.d - fga.o) * psa.N;
                                    Fga fga28 = fga;
                                    fga26.X = fga27.s + (fga28.X - fga28.s) * psa.N;
                                    f2 = LRa.d;
                                    if (fga26.ha || fga.ca) {
                                        f2 = MQa.L;
                                    }
                                    int n7 = tTa.h;
                                    d2 = aSa.V;
                                    int n8 = n3 = uSa.E;
                                    while (n8 < n7) {
                                        xy xy3;
                                        Fga fga29 = fga;
                                        xy xy4 = xy3 = fga29.J();
                                        double d10 = xy3.M - xy4.j;
                                        double d11 = xy4.j + d10 * (double)n3 / (double)n7;
                                        d3 = xy3.j + d10 * (double)(n3 + vRa.d) / (double)n7;
                                        xy xy5 = new xy(xy3.J, d11, xy3.I, xy3.A, d3, xy3.k);
                                        if (fga29.j.J(xy5, Material.water)) {
                                            d2 += oua.i / (double)n7;
                                        }
                                        n8 = ++n3;
                                    }
                                    if (fga.j.e || !(d2 > aSa.V)) break block47;
                                    tf = (Tf)fga.j;
                                    n2 = vRa.d;
                                    XF xF = new XF(fga).up();
                                    if (fga.R.nextFloat() < rta.o && fga.j.i(xF)) {
                                        n2 = uqa.g;
                                    }
                                    if (fga.R.nextFloat() < MQa.L && !fga.j.j(xF)) {
                                        --n2;
                                    }
                                    if (fga.a <= 0) break block48;
                                    Fga fga30 = fga;
                                    fga30.a -= vRa.d;
                                    if (fga30.a > 0) break block49;
                                    fga2 = fga;
                                    fga.x = uSa.E;
                                    fga.A = uSa.E;
                                    break block50;
                                }
                                if (fga.A <= 0) break block51;
                                Fga fga31 = fga;
                                fga31.A -= n2;
                                if (fga31.A > 0) break block52;
                                fga.J(fga.Ea - Bua.Ia);
                                Fga fga32 = fga;
                                fga2 = fga32;
                                fga.J(hTa.i, rta.o, pqa.r + (fga.R.nextFloat() - fga.R.nextFloat()) * Xpa.R);
                                float a2 = Oz.f((double)fga.J().j);
                                tf.J(UZ.WATER_BUBBLE, fga.la, (double)(a2 + pqa.r), (double)fga.A, (int)(pqa.r + fga.F * eta.e), (double)fga.F, aSa.V, (double)fga.F, Bua.Ia, new int[uSa.E]);
                                tf.J(UZ.WATER_WAKE, fga.la, (double)(a2 + pqa.r), (double)fga.A, (int)(pqa.r + fga.F * eta.e), (double)fga.F, aSa.V, (double)fga.F, Bua.Ia, new int[uSa.E]);
                                fga.a = Oz.J((Random)fga32.R, (int)NTa.C, (int)Fsa.d);
                                break block50;
                            }
                            fga.B = (float)((double)fga.B + fga.R.nextGaussian() * FPa.T);
                            Fga fga33 = fga;
                            float a2 = fga33.B * Bua.ga;
                            float f5 = Oz.d((float)a2);
                            float f6 = Oz.C((float)a2);
                            d3 = fga33.la + (double)(f5 * (float)fga.A * Nra.e);
                            double d12 = (float)Oz.f((double)fga33.J().j) + pqa.r;
                            int n9 = fga33.A + (double)(f6 * (float)fga.A * Nra.e);
                            Block block = tf.J(new XF((int)d3, (int)d12 - vRa.d, n9)).J();
                            if (block == QFa.sc || block == QFa.jd) {
                                if (fga.R.nextFloat() < VPa.i) {
                                    tf.J(UZ.WATER_BUBBLE, d3, d12 - Tqa.Ia, (double)n9, vRa.d, (double)f5, tpa.k, (double)f6, aSa.V, new int[uSa.E]);
                                }
                                float f7 = f5 * Bta.G;
                                float f8 = f6 * Bta.G;
                                Tf tf2 = tf;
                                tf2.J(UZ.WATER_WAKE, d3, d12, (double)n9, uSa.E, (double)f8, SPa.x, (double)(-f7), oua.i, new int[uSa.E]);
                                tf2.J(UZ.WATER_WAKE, d3, d12, (double)n9, uSa.E, (double)(-f8), SPa.x, (double)f7, oua.i, new int[uSa.E]);
                            }
                            break block49;
                        }
                        if (fga.x > 0) {
                            Fga fga34;
                            Fga fga35 = fga;
                            fga35.x -= n2;
                            float a2 = VPa.i;
                            if (fga35.x < kTa.j) {
                                a2 = (float)((double)a2 + (double)(kTa.j - fga.x) * fPa.ca);
                                fga34 = fga;
                            } else if (fga.x < wra.P) {
                                a2 = (float)((double)a2 + (double)(wra.P - fga.x) * GPa.g);
                                fga34 = fga;
                            } else {
                                if (fga.x < Psa.M) {
                                    a2 = (float)((double)a2 + (double)(Psa.M - fga.x) * SPa.x);
                                }
                                fga34 = fga;
                            }
                            if (fga34.R.nextFloat() < a2) {
                                int n10;
                                double d13;
                                Fga fga36 = fga;
                                float f9 = Oz.J((Random)fga36.R, (float)JPa.N, (float)CRa.ja) * Bua.ga;
                                float f10 = Oz.J((Random)fga36.R, (float)sSa.E, (float)gua.l);
                                d3 = fga36.la + (double)(Oz.d((float)f9) * f10 * Nra.e);
                                Block block = tf.J(new XF((int)d3, (int)(d13 = (double)((float)Oz.f((double)fga36.J().j) + pqa.r)) - vRa.d, n10 = fga36.A + (double)(Oz.C((float)f9) * f10 * Nra.e))).J();
                                if (block == QFa.sc || block == QFa.jd) {
                                    tf.J(UZ.WATER_SPLASH, d3, d13, (double)n10, uqa.g + fga.R.nextInt(uqa.g), Tqa.Ia, aSa.V, Tqa.Ia, aSa.V, new int[uSa.E]);
                                }
                            }
                            if (fga.x <= 0) {
                                Fga fga37 = fga;
                                fga37.B = Oz.J((Random)fga37.R, (float)JPa.N, (float)CRa.ja);
                                fga37.A = Oz.J((Random)fga37.R, (int)kTa.j, (int)Fua.J);
                            }
                        } else {
                            Fga fga38 = fga;
                            fga38.x = Oz.J((Random)fga38.R, (int)ySa.T, (int)cra.I);
                            fga38.x -= kGa.e((Gl)fga.v) * kTa.j * tTa.h;
                        }
                    }
                    fga2 = fga;
                }
                if (fga2.a > 0) {
                    Fga fga39 = fga;
                    fga39.J(fga.Ea - (double)(fga39.R.nextFloat() * fga.R.nextFloat() * fga.R.nextFloat()) * iSa.P);
                }
            }
            double d14 = d2 * KPa.y - oua.i;
            Fga fga40 = fga;
            fga40.J(fga40.Ea + Tpa.fa * d14);
            if (d2 > aSa.V) {
                f2 = (float)((double)f2 * Tqa.ja);
                Fga fga41 = fga;
                fga41.J(fga41.Ea * Jra.A);
            }
            Fga fga42 = fga;
            fga42.f(fga42.i * (double)f2);
            fga42.J(fga42.Ea * (double)f2);
            fga42.l(fga42.f * (double)f2);
            fga42.l(fga42.la, fga.Z, fga.A);
        }
    }

    static {
        By[] byArray = new By[pPa.f];
        byArray[uSa.E] = new By(new Mda((eAa)Gea.ib), NTa.C).J(ATa.r);
        byArray[vRa.d] = new By(new Mda(Gea.Xb), NTa.C);
        byArray[uqa.g] = new By(new Mda(Gea.Ya), NTa.C);
        byArray[yRa.d] = new By(new Mda((eAa)Gea.aa), NTa.C);
        byArray[AQa.P] = new By(new Mda(Gea.gd), tTa.h);
        byArray[tTa.h] = new By(new Mda((eAa)Gea.DA), uqa.g).J(ATa.r);
        byArray[uua.p] = new By(new Mda(Gea.hC), NTa.C);
        byArray[XTa.W] = new By(new Mda(Gea.t), tTa.h);
        byArray[Yqa.i] = new By(new Mda(Gea.Q, NTa.C, iea.BLACK.getDyeDamage()), vRa.d);
        byArray[WOa.fa] = new By(new Mda((Block)QFa.r), NTa.C);
        byArray[NTa.C] = new By(new Mda(Gea.qa), NTa.C);
        M = Arrays.asList(byArray);
        By[] byArray2 = new By[uua.p];
        byArray2[uSa.E] = new By(new Mda(QFa.pB), vRa.d);
        byArray2[vRa.d] = new By(new Mda(Gea.F), vRa.d);
        byArray2[uqa.g] = new By(new Mda(Gea.NA), vRa.d);
        byArray2[yRa.d] = new By(new Mda((eAa)Gea.cd), vRa.d).J(rta.o).J();
        byArray2[AQa.P] = new By(new Mda((eAa)Gea.DA), vRa.d).J(rta.o).J();
        byArray2[tTa.h] = new By(new Mda(Gea.Qa), vRa.d).J();
        c = Arrays.asList(byArray2);
        By[] byArray3 = new By[AQa.P];
        byArray3[uSa.E] = new By(new Mda(Gea.E, vRa.d, HEa.COD.getMetadata()), Psa.M);
        byArray3[vRa.d] = new By(new Mda(Gea.E, vRa.d, HEa.SALMON.getMetadata()), kTa.g);
        byArray3[uqa.g] = new By(new Mda(Gea.E, vRa.d, HEa.CLOWNFISH.getMetadata()), uqa.g);
        byArray3[yRa.d] = new By(new Mda(Gea.E, vRa.d, HEa.PUFFERFISH.getMetadata()), uua.s);
        e = Arrays.asList(byArray3);
    }

    private Mda J() {
        float f2;
        Fga fga;
        Fga fga2 = fga = this;
        float f3 = fga2.j.v.nextFloat();
        int a22 = kGa.M((Gl)fga2.v);
        int n2 = kGa.e((Gl)fga2.v);
        float f4 = Nra.e - (float)a22 * POa.o - (float)n2 * Jpa.B;
        float a22 = Yqa.C + (float)a22 * Jpa.B - (float)n2 * Jpa.B;
        f4 = Oz.J((float)f4, (float)JPa.N, (float)pqa.r);
        a22 = Oz.J((float)a22, (float)JPa.N, (float)pqa.r);
        if (f3 < f4) {
            Fga fga3 = fga;
            fga3.v.J(Tz.O);
            return ((By)dZ.J((Random)fga3.R, M)).J(fga.R);
        }
        f3 -= f4;
        if (f2 < a22) {
            Fga fga4 = fga;
            fga4.v.J(Tz.z);
            return ((By)dZ.J((Random)fga4.R, c)).J(fga.R);
        }
        float cfr_ignored_0 = f3 - a22;
        Fga fga5 = fga;
        fga5.v.J(Tz.x);
        return ((By)dZ.J((Random)fga5.R, e)).J(fga.R);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void h;
        void c2;
        void d5;
        void e2;
        void f4;
        void g2;
        Fga b2;
        int n3 = n2;
        Fga fga = b2 = this;
        Fga fga2 = b2;
        Fga fga3 = b2;
        fga3.K = g2;
        fga3.C = f4;
        fga2.q = e2;
        fga2.h = (double)d5;
        b2.D = (double)c2;
        fga.s = h;
        fga.f(b2.E);
        fga.J(fga.o);
        fga.l(fga.H);
    }

    /*
     * WARNING - void declaration
     */
    public Fga(Gg gg2, Sx sx2) {
        void b22;
        Fga a2;
        Sx c2 = sx2;
        Fga fga = a2 = this;
        Fga fga2 = a2;
        Fga fga3 = a2;
        super((Gg)b22);
        a2.j = pua.o;
        a2.J = pua.o;
        a2.m = pua.o;
        fga3.Ja = vRa.d;
        fga3.v = c2;
        fga3.v.E = a2;
        fga2.l(rta.o, rta.o);
        Sx sx3 = c2;
        fga.f(c2.la, c2.Z + (double)c2.l(), c2.A, sx3.X, sx3.d);
        fga2.la -= (double)(Oz.C((float)(a2.X / Hra.Ga * pua.j)) * TOa.r);
        fga.Z -= Tqa.Ia;
        fga.A -= (double)(Oz.d((float)(a2.X / Hra.Ga * pua.j)) * TOa.r);
        fga.l(fga.la, a2.Z, a2.A);
        float b22 = Xpa.R;
        fga.f(-Oz.d((float)(fga.X / Hra.Ga * pua.j)) * Oz.C((float)(a2.d / Hra.Ga * pua.j)) * b22);
        fga.l(Oz.C((float)(fga.X / Hra.Ga * pua.j)) * Oz.C((float)(a2.d / Hra.Ga * pua.j)) * b22);
        fga.J(-Oz.d((float)(fga.d / Hra.Ga * pua.j)) * b22);
        fga.J(fga.i, a2.Ea, a2.f, Ira.d, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        Fga fga = this;
        void v0 = a2;
        v0.J(fPa.g, (short)fga.j);
        v0.J(pua.g, (short)fga.J);
        v0.J(pua.N, (short)fga.m);
        ResourceLocation b2 = (ResourceLocation)Block.blockRegistry.f(fga.W);
        a2.J(xSa.l, b2 == null ? Mqa.y : b2.toString());
        void v1 = a2;
        v1.J(Qra.v, (byte)fga.G);
        v1.J(hTa.ha, (byte)(fga.d ? vRa.d : uSa.E));
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public Fga(Gg gg2, double d2, double d3, double d4, Sx sx2) {
        Object f2;
        void b2;
        void c2;
        void d5;
        void e2;
        Fga a2;
        Fga fga = object;
        Object object = sx2;
        Fga fga2 = a2 = fga;
        fga2((Gg)e2);
        fga2.l((double)d5, (double)c2, (double)b2);
        fga2.Ja = vRa.d;
        a2.v = f2;
        ((Sx)((Object)f2)).E = a2;
    }
}

