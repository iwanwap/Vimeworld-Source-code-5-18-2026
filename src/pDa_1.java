/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  ERa
 *  FPa
 *  Gg
 *  Gl
 *  Gua
 *  JPa
 *  JQa
 *  JSa
 *  Lra
 *  Lz
 *  MQa
 *  NTa
 *  Oz
 *  QFa
 *  Qsa
 *  Qta
 *  SQa
 *  SRa
 *  Ssa
 *  TPa
 *  UZ
 *  XTa
 *  YSa
 *  Yfa
 *  Yra
 *  ZOa
 *  ZRa
 *  Zb
 *  aSa
 *  bpa
 *  cRa
 *  cra
 *  dpa
 *  gZ
 *  jsa
 *  kqa
 *  kta
 *  lqa
 *  pqa
 *  psa
 *  pua
 *  qEa
 *  sFa
 *  sd
 *  vL
 *  vQa
 *  vRa
 *  xy
 *  ysa
 *  zEa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pDa_1
extends Yfa
implements sd,
Zb,
WC {
    public boolean o;
    public double h;
    public double K;
    public int H;
    private vL c;
    public qEa B;
    public qEa d;
    public qEa a;
    public qEa b;
    public float l;
    public boolean f;
    public qEa F;
    public sFa g;
    public qEa L;
    public double E;
    public qEa m;
    public float C;
    public qEa[] M;
    public int k;
    public double[][] I;

    public void J() {
        pDa_1 a2;
        super.J();
    }

    public Gg l() {
        pDa_1 a2;
        return a2.j;
    }

    public boolean E() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(List<vL> list) {
        void a2;
        int n2;
        pDa_1 pDa_12 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.size()) {
            pDa_1 b2 = (vL)a2.get(n2);
            if (b2 instanceof Gl) {
                b2.J(gZ.J((Gl)pDa_12), FRa.Ga);
                pDa_1 pDa_13 = pDa_12;
                pDa_13.J((Gl)pDa_13, (vL)b2);
            }
            n3 = ++n2;
        }
    }

    public void l() {
        pDa_1 pDa_12;
        pDa_1 pDa_13 = pDa_12 = this;
        pDa_13.k += vRa.d;
        if (pDa_13.k >= cRa.n && pDa_12.k <= ZOa.x) {
            pDa_1 pDa_14 = pDa_12;
            float f2 = (pDa_14.R.nextFloat() - MQa.L) * Qsa.k;
            float a2 = (pDa_14.R.nextFloat() - MQa.L) * YSa.G;
            float f3 = (pDa_14.R.nextFloat() - MQa.L) * Qsa.k;
            pDa_14.j.J(UZ.EXPLOSION_HUGE, pDa_12.la + (double)f2, pDa_12.Z + KPa.y + (double)a2, pDa_12.A + (double)f3, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
        pDa_1 pDa_15 = pDa_12;
        boolean bl2 = pDa_15.j.J().f(Gua.H);
        if (!pDa_15.j.e) {
            if (pDa_12.k > Jpa.Ha && pDa_12.k % tTa.h == 0 && bl2) {
                int a2;
                int n2 = a2 = PRa.U;
                while (n2 > 0) {
                    int n3 = zEa.J((int)a2);
                    n2 = a2 - n3;
                    pDa_1 pDa_16 = pDa_12;
                    pDa_12.j.f((vL)new zEa(pDa_16.j, pDa_16.la, pDa_12.Z, pDa_12.A, n3));
                }
            }
            if (pDa_12.k == vRa.d) {
                pDa_12.j.l(Lra.x, new XF((vL)pDa_12), uSa.E);
            }
        }
        pDa_1 pDa_17 = pDa_12;
        pDa_17.J(aSa.V, Tqa.Ia, aSa.V);
        pDa_17.ba = pDa_17.X += eta.e;
        if (pDa_12.k == ZOa.x && !pDa_12.j.e) {
            if (bl2) {
                int a2;
                int n4 = a2 = aSa.k;
                while (n4 > 0) {
                    int n5 = zEa.J((int)a2);
                    n4 = a2 - n5;
                    pDa_1 pDa_18 = pDa_12;
                    pDa_12.j.f((vL)new zEa(pDa_18.j, pDa_18.la, pDa_12.Z, pDa_12.A, n5));
                }
            }
            pDa_1 pDa_19 = pDa_12;
            pDa_19.f(new XF(pDa_19.la, ypa.X, pDa_12.A));
            pDa_12.k();
        }
    }

    public String f() {
        return Qta.z;
    }

    public float G() {
        return eua.C;
    }

    public pDa_1(Gg gg2) {
        pDa_1 b2 = gg2;
        pDa_1 a2 = this;
        super((Gg)b2);
        a2.I = new double[ysa.s][yRa.d];
        pDa_1 pDa_12 = a2;
        pDa_12.H = pua.o;
        qEa[] qEaArray = new qEa[XTa.W];
        pDa_1 pDa_13 = a2;
        qEaArray[uSa.E] = a2.b = new qEa((Zb)a2, WRa.q, lqa.ga, lqa.ga);
        qEaArray[vRa.d] = a2.d = new qEa((Zb)a2, Eqa.Z, Qsa.k, Qsa.k);
        qEaArray[uqa.g] = a2.L = new qEa((Zb)a2, tpa.Y, YSa.G, YSa.G);
        qEaArray[yRa.d] = a2.B = new qEa((Zb)a2, tpa.Y, YSa.G, YSa.G);
        qEaArray[AQa.P] = a2.a = new qEa((Zb)a2, tpa.Y, YSa.G, YSa.G);
        qEaArray[tTa.h] = a2.F = new qEa((Zb)a2, Cta.s, YSa.G, YSa.G);
        qEaArray[uua.p] = a2.m = new qEa((Zb)a2, Cta.s, YSa.G, YSa.G);
        pDa_12.M = qEaArray;
        pDa_1 pDa_14 = a2;
        pDa_14.A(pDa_14.J());
        pDa_14.l(Yra.i, Qsa.k);
        pDa_14.Ma = vRa.d;
        pDa_14.z = vRa.d;
        pDa_14.h = fqa.W;
        pDa_14.Ja = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        pDa_1 a2 = this;
        return super.J((gZ)b2, c2);
    }

    public void n() {
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(qEa qEa2, gZ gZ2, float f2) {
        void b2;
        void a2;
        pDa_1 d22 = qEa2;
        pDa_1 c2 = this;
        if (d22 != c2.b) {
            a2 = a2 / YSa.G + pqa.r;
        }
        pDa_1 pDa_12 = c2;
        float d22 = pDa_12.X * pua.j / Hra.Ga;
        float f3 = Oz.d((float)d22);
        d22 = Oz.C((float)d22);
        c2.K = pDa_12.la + (double)(f3 * eua.C) + (double)((c2.R.nextFloat() - MQa.L) * kta.v);
        pDa_12.h = pDa_12.Z + (double)(c2.R.nextFloat() * vQa.q) + oua.i;
        pDa_12.E = pDa_12.A - (double)(d22 * eua.C) + (double)((c2.R.nextFloat() - MQa.L) * kta.v);
        pDa_12.c = null;
        if (b2.f() instanceof Sx || b2.l()) {
            c2.f((gZ)b2, (float)a2);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        pDa_1 c2 = gZ2;
        pDa_1 b2 = this;
        if (c2 instanceof GX && ((GX)((Object)c2)).D()) {
            void a2;
            b2.f((gZ)c2, (float)a2);
        }
        return uSa.E != 0;
    }

    public void s() {
        pDa_1 a2;
        pDa_1 pDa_12 = a2;
        super.s();
        pDa_12.J(Kha.M).J(jsa.Ka);
    }

    private void N() {
        double d2;
        double d3;
        double d4;
        pDa_1 pDa_12 = this;
        pDa_12.f = uSa.E;
        ArrayList a2 = Lists.newArrayList(pDa_12.j.w);
        Iterator iterator = a2.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                if (!((Sx)((Object)iterator.next())).t()) continue block0;
                Iterator iterator3 = iterator;
                iterator2 = iterator3;
                iterator3.remove();
            }
            break;
        }
        if (pDa_12.R.nextInt(uqa.g) == 0 && !a2.isEmpty()) {
            pDa_12.c = (vL)a2.get(pDa_12.R.nextInt(a2.size()));
            return;
        }
        do {
            pDa_1 pDa_13 = pDa_12;
            pDa_13.K = aSa.V;
            pDa_13.h = UOa.d + pDa_12.R.nextFloat() * SPa.b;
            pDa_12.E = aSa.V;
            pDa_13.K += (double)(pDa_12.R.nextFloat() * JQa.q - gua.l);
            pDa_13.E += (double)(pDa_12.R.nextFloat() * JQa.q - gua.l);
            double d5 = pDa_13.la - pDa_12.K;
            double d6 = pDa_13.Z - pDa_12.h;
            double d7 = pDa_13.A - pDa_12.E;
            d4 = d5;
            d3 = d6;
            d2 = d7;
        } while ((a2 = d4 * d4 + d3 * d3 + d2 * d2 > fqa.W ? vRa.d : uSa.E) == 0);
        pDa_12.c = null;
    }

    /*
     * Unable to fully structure code
     */
    private void W() {
        var1_3 = this;
        if (var1_3.g == null) ** GOTO lbl14
        if (var1_3.g.J) {
            if (!var1_3.j.e) {
                v0 = var1_3;
                v0.J(v0.b, gZ.J((NZ)null), FRa.Ga);
            }
            v1 = var1_3;
            var1_3.g = null;
        } else {
            if (var1_3.g % NTa.C == false && var1_3.f() < var1_3.J()) {
                v2 = var1_3;
                v2.A(v2.f() + pqa.r);
            }
lbl14:
            // 4 sources

            v1 = var1_3;
        }
        if (v1.R.nextInt(NTa.C) == 0) {
            a = Ura.m;
            a = var1_3.j.J(sFa.class, var1_3.J().f((double)a, (double)a, (double)a));
            var2_4 = null;
            var3_5 = Bra.o;
            a = a.iterator();
            while (a.hasNext()) {
                var5_6 = (sFa)a.next();
                var6_7 = var5_6.J((vL)var1_3);
                if (!(v3 < var3_5)) continue;
                var3_5 = var6_7;
                var2_4 = var5_6;
            }
            var1_3.g = var2_4;
        }
    }

    public vL[] J() {
        pDa_1 a2;
        return a2.M;
    }

    public double[] J(int n2, float f2) {
        int b2;
        float c2 = f2;
        pDa_1 a2 = this;
        if (a2.f() <= JPa.N) {
            c2 = JPa.N;
        }
        c2 = pqa.r - c2;
        pDa_1 pDa_12 = a2;
        int n3 = pDa_12.H - b2 * vRa.d & Ssa.u;
        b2 = pDa_12.H - b2 * vRa.d - vRa.d & Ssa.u;
        double[] dArray = new double[yRa.d];
        double d2 = pDa_12.I[n3][uSa.E];
        double d3 = Oz.J((double)(pDa_12.I[b2][uSa.E] - d2));
        dArray[uSa.E] = d2 + d3 * (double)c2;
        d2 = pDa_12.I[n3][vRa.d];
        d3 = pDa_12.I[b2][vRa.d] - d2;
        double[] dArray2 = dArray;
        dArray2[vRa.d] = d2 + d3 * (double)c2;
        dArray[uqa.g] = a2.I[n3][uqa.g] + (a2.I[b2][uqa.g] - a2.I[n3][uqa.g]) * (double)c2;
        return dArray2;
    }

    public void y() {
        int n2;
        float f2;
        float f3;
        pDa_1 pDa_12;
        block27: {
            pDa_1 pDa_13;
            block26: {
                double d2;
                float f4;
                double d3;
                pDa_1 pDa_14;
                double d4;
                double d5;
                double d6;
                double d7;
                block25: {
                    pDa_1 pDa_15;
                    float f5;
                    pDa_12 = this;
                    if (pDa_12.j.e) {
                        float f6;
                        pDa_1 pDa_16 = pDa_12;
                        float a2 = Oz.C((float)(pDa_16.C * pua.j * kta.v));
                        f5 = Oz.C((float)(pDa_16.l * pua.j * kta.v));
                        if (f6 <= SQa.w && a2 >= SQa.w && !pDa_12.c()) {
                            pDa_1 pDa_17 = pDa_12;
                            pDa_17.j.J(pDa_17.la, pDa_12.Z, pDa_12.A, cra.V, eua.C, xSa.la + pDa_12.R.nextFloat() * bpa.K, uSa.E != 0);
                        }
                    }
                    pDa_1 pDa_18 = pDa_12;
                    pDa_18.l = pDa_18.C;
                    if (pDa_18.f() <= JPa.N) {
                        pDa_1 pDa_19 = pDa_12;
                        float a2 = (pDa_19.R.nextFloat() - MQa.L) * Qsa.k;
                        f5 = (pDa_19.R.nextFloat() - MQa.L) * YSa.G;
                        float f7 = (pDa_19.R.nextFloat() - MQa.L) * Qsa.k;
                        pDa_19.j.J(UZ.EXPLOSION_LARGE, pDa_12.la + (double)a2, pDa_12.Z + KPa.y + (double)f5, pDa_12.A + (double)f7, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        return;
                    }
                    pDa_1 pDa_110 = pDa_12;
                    pDa_110.W();
                    float a2 = psa.N / (Oz.J((double)(pDa_12.i * pDa_12.i + pDa_12.f * pDa_12.f)) * FRa.Ga + pqa.r);
                    a2 *= (float)Math.pow(KPa.y, pDa_12.Ea);
                    if (pDa_110.o) {
                        pDa_1 pDa_111 = pDa_12;
                        pDa_15 = pDa_111;
                        pDa_111.C += a2 * MQa.L;
                    } else {
                        pDa_1 pDa_112 = pDa_12;
                        pDa_15 = pDa_112;
                        pDa_112.C += a2;
                    }
                    pDa_15.X = Oz.f((float)pDa_12.X);
                    if (pDa_12.t()) {
                        pDa_12.C = MQa.L;
                        return;
                    }
                    if (pDa_12.H < 0) {
                        int n3;
                        int n4 = n3 = uSa.E;
                        while (n4 < pDa_12.I.length) {
                            pDa_1 pDa_113 = pDa_12;
                            pDa_12.I[n3][uSa.E] = pDa_113.X;
                            double[] dArray = pDa_113.I[n3];
                            dArray[vRa.d] = pDa_12.Z;
                            n4 = ++n3;
                        }
                    }
                    if ((pDa_12.H += vRa.d) == pDa_12.I.length) {
                        pDa_12.H = uSa.E;
                    }
                    pDa_1 pDa_114 = pDa_12;
                    pDa_1 pDa_115 = pDa_12;
                    pDa_114.I[pDa_114.H][uSa.E] = pDa_115.X;
                    pDa_115.I[pDa_12.H][vRa.d] = pDa_12.Z;
                    if (!pDa_114.j.e) break block25;
                    if (pDa_12.f <= 0) break block26;
                    pDa_1 pDa_116 = pDa_12;
                    pDa_13 = pDa_116;
                    double d8 = pDa_116.la + (pDa_12.fa - pDa_12.la) / (double)pDa_12.f;
                    pDa_1 pDa_117 = pDa_12;
                    d7 = pDa_116.Z + (pDa_117.Ia - pDa_12.Z) / (double)pDa_12.f;
                    d6 = pDa_117.A + (pDa_12.M - pDa_12.A) / (double)pDa_12.f;
                    d5 = Oz.J((double)(pDa_116.H - (double)pDa_12.X));
                    pDa_116.X = (float)((double)pDa_116.X + d5 / (double)pDa_12.f);
                    pDa_116.d = (qEa)((float)((double)pDa_116.d + (pDa_12.m - (double)pDa_12.d) / (double)pDa_12.f));
                    pDa_116.f -= vRa.d;
                    pDa_116.l(d8, d7, d6);
                    pDa_116.C(pDa_116.X, (float)pDa_12.d);
                    break block27;
                }
                pDa_1 pDa_118 = pDa_12;
                double d9 = pDa_118.K - pDa_12.la;
                pDa_1 pDa_119 = pDa_12;
                d7 = pDa_118.h - pDa_119.Z;
                d6 = pDa_119.E - pDa_12.A;
                double d10 = d9;
                double d11 = d7;
                double d12 = d6;
                d5 = d10 * d10 + d11 * d11 + d12 * d12;
                if (pDa_118.c != null) {
                    double d13;
                    pDa_1 pDa_120 = pDa_12;
                    pDa_120.K = pDa_120.c.la;
                    pDa_120.E = pDa_120.c.A;
                    double d14 = pDa_120.K - pDa_12.la;
                    double d15 = pDa_120.E - pDa_12.A;
                    double d16 = d14;
                    double d17 = d15;
                    double d18 = Math.sqrt(d16 * d16 + d17 * d17);
                    d4 = rpa.ja + d18 / ERa.t - oua.i;
                    if (d13 > Wqa.m) {
                        d4 = Wqa.m;
                    }
                    pDa_1 pDa_121 = pDa_12;
                    pDa_14 = pDa_121;
                    pDa_121.h = pDa_121.c.J().j + d4;
                } else {
                    pDa_1 pDa_122 = pDa_12;
                    pDa_14 = pDa_122;
                    pDa_122.K += pDa_12.R.nextGaussian() * KPa.y;
                    pDa_122.E += pDa_12.R.nextGaussian() * KPa.y;
                }
                if (pDa_14.f || d5 < fqa.W || d5 > xqa.D || pDa_12.ca || pDa_12.Ia) {
                    pDa_12.N();
                }
                double d19 = d9;
                double d20 = d6;
                d7 /= (double)Oz.J((double)(d19 * d19 + d20 * d20));
                f3 = Ora.D;
                d7 = Oz.J((double)d7, (double)(-f3), (double)f3);
                pDa_1 pDa_123 = pDa_12;
                pDa_123.J(pDa_123.Ea + d7 * Tqa.Ia);
                pDa_123.X = Oz.f((float)pDa_123.X);
                double d21 = kta.Da - Oz.f((double)d9, (double)d6) * kta.Da / lQa.f;
                double d22 = Oz.J((double)(d21 - (double)pDa_12.X));
                if (d3 > ZRa.r) {
                    d22 = ZRa.r;
                }
                if (d22 < iSa.k) {
                    d22 = iSa.k;
                }
                Lz lz2 = new Lz(pDa_12.K - pDa_12.la, pDa_12.h - pDa_12.Z, pDa_12.E - pDa_12.A).J();
                d4 = -Oz.C((float)(pDa_12.X * pua.j / Hra.Ga));
                Lz a2 = new Lz((double)Oz.d((float)(pDa_12.X * pua.j / Hra.Ga)), pDa_12.Ea, d4).J();
                f2 = ((float)a2.f(lz2) + MQa.L) / Ira.d;
                if (f4 < JPa.N) {
                    f2 = JPa.N;
                }
                pDa_1 pDa_124 = pDa_12;
                pDa_124.B *= xSa.la;
                float f8 = Oz.J((double)(pDa_124.i * pDa_12.i + pDa_12.f * pDa_12.f)) * pqa.r + pqa.r;
                double d23 = Math.sqrt(pDa_124.i * pDa_12.i + pDa_12.f * pDa_12.f) * oua.i + oua.i;
                if (d2 > ITa.a) {
                    d23 = ITa.a;
                }
                pDa_1 pDa_125 = pDa_12;
                pDa_125.B = (qEa)((float)((double)pDa_125.B + d22 * (dpa.X / d23 / (double)f8)));
                pDa_125.X += pDa_12.B * Nra.e;
                f8 = (float)(KPa.y / (d23 + oua.i));
                float f9 = iSa.fa;
                pDa_125.J(JPa.N, vqa.T, f9 * (f2 * f8 + (pqa.r - f8)));
                pDa_1 pDa_126 = pDa_12;
                if (pDa_125.o) {
                    pDa_126.J(pDa_12.i * GPa.fa, pDa_12.Ea * GPa.fa, pDa_12.f * GPa.fa);
                } else {
                    pDa_126.J(pDa_12.i, pDa_12.Ea, (double)pDa_12.f);
                }
                f8 = ((float)new Lz(pDa_12.i, pDa_12.Ea, (double)pDa_12.f).J().f(a2) + pqa.r) / kta.v;
                f8 = xSa.la + VPa.i * f8;
                pDa_1 pDa_127 = pDa_12;
                pDa_127.f(pDa_127.i * (double)f8);
                pDa_127.l(pDa_127.f * (double)f8);
                pDa_127.J(pDa_127.Ea * IPa.Ha);
            }
            pDa_13 = pDa_12;
        }
        pDa_13.ba = pDa_12.X;
        pDa_1 pDa_128 = pDa_12;
        pDa_128.b.F = pDa_128.b.u = vQa.q;
        pDa_1 pDa_129 = pDa_12;
        pDa_129.L.F = pDa_129.L.u = kta.v;
        pDa_1 pDa_130 = pDa_12;
        pDa_130.B.F = pDa_130.B.u = kta.v;
        pDa_1 pDa_131 = pDa_12;
        pDa_131.a.F = pDa_131.a.u = kta.v;
        pDa_1 pDa_132 = pDa_12;
        pDa_132.d.u = vQa.q;
        pDa_132.d.F = eua.C;
        pDa_132.F.u = kta.v;
        pDa_132.F.F = YSa.G;
        pDa_132.m.u = vQa.q;
        pDa_132.m.F = YSa.G;
        float f10 = (float)(pDa_132.J(tTa.h, pqa.r)[vRa.d] - pDa_12.J(NTa.C, pqa.r)[vRa.d]) * FRa.Ga / Hra.Ga * pua.j;
        float f11 = Oz.C((float)f10);
        float f12 = -Oz.d((float)f10);
        float f13 = pDa_132.X * pua.j / Hra.Ga;
        float f14 = Oz.d((float)f13);
        float f15 = Oz.C((float)f13);
        pDa_132.d.d();
        pDa_132.d.f(pDa_12.la + (double)(f14 * MQa.L), pDa_12.Z, pDa_12.A - (double)(f15 * MQa.L), JPa.N, JPa.N);
        pDa_132.F.d();
        pDa_132.F.f(pDa_12.la + (double)(f15 * Jta.r), pDa_12.Z + KPa.y, pDa_12.A + (double)(f14 * Jta.r), JPa.N, JPa.N);
        pDa_132.m.d();
        pDa_132.m.f(pDa_12.la - (double)(f15 * Jta.r), pDa_12.Z + KPa.y, pDa_12.A - (double)(f14 * Jta.r), JPa.N, JPa.N);
        if (!pDa_132.j.e && pDa_12.ha == 0) {
            pDa_1 pDa_133 = pDa_12;
            pDa_1 pDa_134 = pDa_12;
            pDa_133.J(pDa_133.j.f((vL)pDa_134, pDa_12.F.J().f(FPa.T, KPa.y, FPa.T).C(aSa.V, SQa.E, aSa.V)));
            pDa_1 pDa_135 = pDa_12;
            pDa_133.J(pDa_134.j.f((vL)pDa_135, pDa_135.m.J().f(FPa.T, KPa.y, FPa.T).C(aSa.V, SQa.E, aSa.V)));
            pDa_1 pDa_136 = pDa_12;
            pDa_133.f(pDa_133.j.f((vL)pDa_136, pDa_136.b.J().f(oua.i, oua.i, oua.i)));
        }
        pDa_1 pDa_137 = pDa_12;
        double[] dArray = pDa_137.J(tTa.h, pqa.r);
        double[] dArray2 = pDa_137.J(uSa.E, pqa.r);
        f3 = Oz.d((float)(pDa_137.X * pua.j / Hra.Ga - pDa_12.B * Jpa.B));
        float f16 = Oz.C((float)(pDa_137.X * pua.j / Hra.Ga - pDa_12.B * Jpa.B));
        pDa_137.b.d();
        pDa_137.b.f(pDa_12.la + (double)(f3 * SRa.V * f11), pDa_12.Z + (dArray2[vRa.d] - dArray[vRa.d]) * oua.i + (double)(f12 * SRa.V), pDa_12.A - (double)(f16 * SRa.V * f11), JPa.N, JPa.N);
        int n5 = n2 = uSa.E;
        while (n5 < yRa.d) {
            qEa qEa2 = null;
            if (n2 == 0) {
                qEa2 = pDa_12.L;
            }
            if (n2 == vRa.d) {
                qEa2 = pDa_12.B;
            }
            if (n2 == uqa.g) {
                qEa2 = pDa_12.a;
            }
            pDa_1 pDa_138 = pDa_12;
            double[] dArray3 = pDa_138.J(lqa.s + n2 * uqa.g, pqa.r);
            float f17 = pDa_138.X * pua.j / Hra.Ga + pDa_12.J(dArray3[uSa.E] - dArray[uSa.E]) * pua.j / Hra.Ga * pqa.r;
            float f18 = Oz.d((float)f17);
            float f19 = Oz.C((float)f17);
            float a2 = Ira.d;
            f2 = (float)(n2 + vRa.d) * kta.v;
            qEa qEa3 = qEa2;
            qEa3.d();
            qEa3.f(pDa_12.la - (double)((f14 * a2 + f18 * f2) * f11), pDa_12.Z + (dArray3[vRa.d] - dArray[vRa.d]) * oua.i - (double)((f2 + a2) * f12) + Bta.c, pDa_12.A + (double)((f15 * a2 + f19 * f2) * f11), JPa.N, JPa.N);
            n5 = ++n2;
        }
        if (!pDa_12.j.e) {
            pDa_1 pDa_139 = pDa_12;
            pDa_1 pDa_140 = pDa_12;
            pDa_140.o = pDa_139.J(pDa_139.b.J()) | pDa_140.J(pDa_140.d.J());
        }
    }

    private boolean J(xy xy2) {
        int n2;
        pDa_1 b2 = xy2;
        pDa_1 a2 = this;
        pDa_1 pDa_12 = b2;
        int n3 = Oz.f((double)((xy)pDa_12).J);
        int n4 = Oz.f((double)((xy)pDa_12).j);
        int n5 = Oz.f((double)((xy)pDa_12).I);
        int n6 = Oz.f((double)((xy)pDa_12).A);
        int n7 = Oz.f((double)((xy)pDa_12).M);
        int n8 = Oz.f((double)((xy)pDa_12).k);
        int n9 = uSa.E;
        int n10 = uSa.E;
        int n11 = n2 = n3;
        while (n11 <= n6) {
            int n12 = n4;
            while (n12 <= n7) {
                int n13;
                int n14 = n5;
                while (n14 <= n8) {
                    int n15;
                    XF xF2 = new XF(n2, n13, n15);
                    Block block = a2.j.J(xF2).J();
                    if (block.J() != Material.air) {
                        if (block != QFa.fE && block != QFa.X && block != QFa.hd && block != QFa.bg && block != QFa.Ac && a2.j.J().f(kqa.N)) {
                            n10 = a2.j.G(xF2) || n10 != 0 ? vRa.d : uSa.E;
                        } else {
                            n9 = vRa.d;
                        }
                    }
                    n14 = ++n15;
                }
                n12 = ++n13;
            }
            n11 = ++n2;
        }
        if (n10 != 0) {
            pDa_1 pDa_13 = b2;
            double d2 = ((xy)pDa_13).J + (((xy)b2).A - ((xy)b2).J) * (double)a2.R.nextFloat();
            pDa_1 pDa_14 = b2;
            double d3 = ((xy)pDa_13).j + (((xy)pDa_14).M - ((xy)b2).j) * (double)a2.R.nextFloat();
            double d4 = ((xy)pDa_14).I + (((xy)b2).k - ((xy)b2).I) * (double)a2.R.nextFloat();
            a2.j.J(UZ.EXPLOSION_LARGE, d2, d3, d4, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
        return n9 != 0;
    }

    private void J(List<vL> list) {
        pDa_1 a2;
        Iterator b2 = list;
        pDa_1 pDa_12 = a2 = this;
        double d2 = (a2.d.J().J + pDa_12.d.J().A) / KPa.y;
        double d3 = (pDa_12.d.J().I + a2.d.J().k) / KPa.y;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            vL vL2 = (vL)b2.next();
            if (!(vL2 instanceof Gl)) continue;
            vL vL3 = vL2;
            double d4 = vL3.la - d2;
            double d5 = vL3.A - d3;
            double d6 = d4;
            double d7 = d5;
            double d8 = d6 * d6 + d7 * d7;
            vL3.f(d4 / d8 * FPa.T, Bua.Ia, d5 / d8 * FPa.T);
        }
    }

    public void F() {
        pDa_1 a2;
        a2.k();
    }

    private float J(double a2) {
        return (float)Oz.J((double)a2);
    }

    public String A() {
        return TPa.Ga;
    }

    /*
     * WARNING - void declaration
     */
    private void f(XF xF2) {
        void a2;
        int b22;
        pDa_1 pDa_12 = this;
        int n2 = b22 = pua.o;
        while (n2 <= fPa.i) {
            int n3 = pta.a;
            while (n3 <= AQa.P) {
                int n4;
                int n5 = pta.a;
                while (n5 <= AQa.P) {
                    double d2;
                    int n6;
                    int n7 = n4;
                    int n8 = n6;
                    double d3 = n7 * n7 + n8 * n8;
                    if (d2 <= JSa.R) {
                        XF xF3 = a2.add(n4, b22, n6);
                        if (b22 < 0) {
                            if (d3 <= pua.ia) {
                                pDa_12.j.J(xF3, QFa.bg.J());
                            }
                        } else if (b22 > 0) {
                            pDa_12.j.J(xF3, QFa.HF.J());
                        } else {
                            pDa_1 pDa_13 = pDa_12;
                            if (d3 > pua.ia) {
                                pDa_13.j.J(xF3, QFa.bg.J());
                            } else {
                                pDa_13.j.J(xF3, QFa.mc.J());
                            }
                        }
                    }
                    n5 = ++n6;
                }
                n3 = ++n4;
            }
            n2 = ++b22;
        }
        pDa_12.j.J((XF)a2, QFa.bg.J());
        pDa_12.j.J(a2.up(), QFa.bg.J());
        XF b22 = a2.up(uqa.g);
        pDa_12.j.J(b22, QFa.bg.J());
        pDa_12.j.J(b22.west(), QFa.FB.J().J(BlockTorch.FACING, DZ.EAST));
        pDa_12.j.J(b22.east(), QFa.FB.J().J(BlockTorch.FACING, DZ.WEST));
        pDa_12.j.J(b22.north(), QFa.FB.J().J(BlockTorch.FACING, DZ.SOUTH));
        pDa_12.j.J(b22.south(), QFa.FB.J().J(BlockTorch.FACING, DZ.NORTH));
        pDa_12.j.J(a2.up(yRa.d), QFa.bg.J());
        pDa_12.j.J(a2.up(AQa.P), QFa.Zb.J());
    }
}

