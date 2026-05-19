/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  FPa
 *  Gg
 *  Gl
 *  JPa
 *  Lz
 *  Oz
 *  QFa
 *  Tf
 *  UZ
 *  Waa
 *  XC
 *  aSa
 *  bpa
 *  hTa
 *  kta
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vRa
 */
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class nEa_1
extends vL
implements XC {
    private int F;
    private int E;
    private Block m;
    private int C;
    public boolean i;
    private int M;
    private Gl k;
    private int j;
    private String J;
    public int A;

    public Gl J() {
        nEa_1 nEa_12 = this;
        if (nEa_12.k == null && nEa_12.J != null && nEa_12.J.length() > 0) {
            nEa_1 nEa_13 = nEa_12;
            nEa_12.k = nEa_12.j.J(nEa_13.J);
            if (nEa_13.k == null && nEa_12.j instanceof Tf) {
                try {
                    nEa_1 a2 = ((Tf)nEa_12.j).J(UUID.fromString(nEa_12.J));
                    if (a2 instanceof Gl) {
                        nEa_12.k = (Gl)a2;
                    }
                }
                catch (Throwable a2) {
                    nEa_12.k = null;
                }
            }
        }
        return nEa_12.k;
    }

    public boolean J(double a2) {
        nEa_1 b2;
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

    public void f(Waa waa2) {
        nEa_1 b2 = waa2;
        nEa_1 a2 = this;
        nEa_1 nEa_12 = b2;
        nEa_12.J(fPa.g, (short)a2.C);
        nEa_12.J(pua.g, (short)a2.E);
        nEa_12.J(pua.N, (short)a2.M);
        ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(a2.m);
        b2.J(xSa.l, resourceLocation == null ? Mqa.y : resourceLocation.toString());
        nEa_1 nEa_13 = b2;
        nEa_13.J(Qra.v, (byte)a2.A);
        nEa_13.J(hTa.ha, (byte)(a2.i ? vRa.d : uSa.E));
        if ((a2.J == null || a2.J.length() == 0) && a2.k instanceof Sx) {
            a2.J = a2.k.J();
        }
        b2.J(UOa.Ja, a2.J == null ? Mqa.y : a2.J);
    }

    /*
     * Unable to fully structure code
     */
    public void d() {
        v0 = var3_1 = this;
        v0.V = v0.la;
        v0.Ga = v0.Z;
        v0.Ca = v0.A;
        super.d();
        if (v0.A > 0) {
            var3_1.A -= vRa.d;
        }
        if (var3_1.i) {
            v1 = var3_1;
            if (var3_1.j.J(new XF(v1.C, v1.E, var3_1.M)).J() == var3_1.m) {
                v2 = var3_1;
                v2.F += vRa.d;
                if (v2.F == PRa.ga) {
                    var3_1.k();
                }
                return;
            }
            v3 = var3_1;
            v3.i = uSa.E;
            v4 = var3_1;
            v4.f(v3.i * (double)(v4.R.nextFloat() * psa.N));
            v3.J(v3.Ea * (double)(var3_1.R.nextFloat() * psa.N));
            v3.l(v3.f * (double)(var3_1.R.nextFloat() * psa.N));
            v3.F = uSa.E;
            v3.j = uSa.E;
        } else {
            var3_1.j += vRa.d;
        }
        var5_2 = new Lz(var3_1.la, var3_1.Z, (double)var3_1.A);
        var11_3 = new Lz(var3_1.la + var3_1.i, var3_1.Z + var3_1.Ea, (double)(var3_1.A + var3_1.f));
        a = var3_1.j.J(var5_2, var11_3);
        var5_2 = new Lz(var3_1.la, var3_1.Z, (double)var3_1.A);
        var11_3 = new Lz(var3_1.la + var3_1.i, var3_1.Z + var3_1.Ea, (double)(var3_1.A + var3_1.f));
        if (a != null) {
            var11_3 = new Lz(a.I.A, a.I.j, a.I.J);
        }
        if (!var3_1.j.e) {
            var4_4 = null;
            v5 = var3_1;
            var1_6 = var3_1.j.f((vL)v5, v5.J().l((double)var3_1.i, var3_1.Ea, var3_1.f).f(oua.i, oua.i, oua.i));
            var6_8 = aSa.V;
            var8_10 = v5.J();
            v6 = var9_12 = uSa.E;
            while (v6 < var1_6.size()) {
                var10_15 = (vL)var1_6.get(var9_12);
                if (var10_15.E() && (var10_15 != var8_10 || var3_1.j >= tTa.h)) {
                    var2_14 = bpa.K;
                    var2_13 = var10_15.J().f((double)var2_14, (double)var2_14, (double)var2_14).J(var5_2, var11_3);
                    if (var2_13 != null && ((var12_16 = var5_2.l(var2_13.I)) < var6_8 || var6_8 == aSa.V)) {
                        var4_4 = var10_15;
                        var6_8 = var12_16;
                    }
                }
                v6 = ++var9_12;
            }
            if (var4_4 != null) {
                a = new RY(var4_4);
            }
        }
        if (a == null) ** GOTO lbl59
        if (a.A == AY.BLOCK && var3_1.j.J(a.J()).J() == QFa.rF) {
            v7 = var3_1;
            v8 = v7;
            v7.J(a.J());
        } else {
            var3_1.J((RY)a);
lbl59:
            // 2 sources

            v8 = var3_1;
        }
        v8.la += var3_1.i;
        v9 = var3_1;
        v10 = v9;
        v9.Z += var3_1.Ea;
        v9.A += var3_1.f;
        var4_5 = Oz.J((double)(v9.i * var3_1.i + var3_1.f * var3_1.f));
        v9.X = (float)(Oz.f((double)v9.i, (double)var3_1.f) * kta.Da / lQa.f);
        v9.d = (float)(Oz.f((double)v9.Ea, (double)var4_5) * kta.Da / lQa.f);
        while (v10.d - var3_1.o < xua.V) {
            v11 = var3_1;
            v10 = v11;
            v11.o -= CRa.ja;
        }
        v12 = var3_1;
        while (v12.d - var3_1.o >= Hra.Ga) {
            v13 = var3_1;
            v12 = v13;
            v13.o += CRa.ja;
        }
        v14 = var3_1;
        while (v14.X - var3_1.s < xua.V) {
            v15 = var3_1;
            v14 = v15;
            v15.s -= CRa.ja;
        }
        v16 = var3_1;
        while (v16.X - var3_1.s >= Hra.Ga) {
            v17 = var3_1;
            v16 = v17;
            v17.s += CRa.ja;
        }
        v18 = var3_1;
        v19 = var3_1;
        v18.d = v18.o + (v19.d - var3_1.o) * psa.N;
        v20 = var3_1;
        v18.X = v19.s + (v20.X - v20.s) * psa.N;
        var1_7 = KPa.w;
        var6_9 = v18.J();
        if (v18.L()) {
            v21 = var7_17 = uSa.E;
            while (v21 < AQa.P) {
                var8_11 = rta.o;
                v22 = 2 ^ 3;
                var3_1.j.J(UZ.WATER_BUBBLE, var3_1.la - var3_1.i * (double)var8_11, var3_1.Z - var3_1.Ea * (double)var8_11, (double)(var3_1.A - var3_1.f * (double)var8_11), (double)var3_1.i, var3_1.Ea, var3_1.f, new int[uSa.E]);
                v21 = ++var7_17;
            }
            var1_7 = xSa.la;
        }
        v23 = var3_1;
        v23.f(v23.i * (double)var1_7);
        v23.J(v23.Ea * (double)var1_7);
        v23.l(v23.f * (double)var1_7);
        v23.J(v23.Ea - (double)var6_9);
        v23.l(v23.la, var3_1.Z, var3_1.A);
    }

    /*
     * WARNING - void declaration
     */
    public nEa_1(Gg gg2, Gl gl2) {
        void b22;
        nEa_1 a2;
        nEa_1 c2 = gl2;
        nEa_1 nEa_12 = a2 = this;
        nEa_1 nEa_13 = a2;
        nEa_1 nEa_14 = a2;
        super((Gg)b22);
        a2.C = pua.o;
        nEa_14.E = pua.o;
        nEa_14.M = pua.o;
        nEa_14.k = c2;
        nEa_13.l(rta.o, rta.o);
        nEa_1 nEa_15 = c2;
        nEa_12.f(((Gl)c2).la, ((Gl)c2).Z + (double)c2.l(), ((Gl)c2).A, ((Gl)nEa_15).X, ((Gl)nEa_15).d);
        nEa_13.la -= (double)(Oz.C((float)(a2.X / Hra.Ga * pua.j)) * TOa.r);
        nEa_12.Z -= Tqa.Ia;
        nEa_12.A -= (double)(Oz.d((float)(a2.X / Hra.Ga * pua.j)) * TOa.r);
        nEa_12.l(nEa_12.la, a2.Z, a2.A);
        float b22 = Xpa.R;
        nEa_12.f(-Oz.d((float)(nEa_12.X / Hra.Ga * pua.j)) * Oz.C((float)(a2.d / Hra.Ga * pua.j)) * b22);
        nEa_12.l(Oz.C((float)(nEa_12.X / Hra.Ga * pua.j)) * Oz.C((float)(a2.d / Hra.Ga * pua.j)) * b22);
        nEa_12.J(-Oz.d((float)((nEa_12.d + a2.M()) / Hra.Ga * pua.j)) * b22);
        nEa_12.J((double)nEa_12.i, a2.Ea, a2.f, a2.f(), pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public nEa_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        nEa_1 d5;
        nEa_1 e2 = gg2;
        nEa_1 nEa_12 = d5 = this;
        super((Gg)e2);
        d5.C = pua.o;
        d5.E = pua.o;
        d5.M = pua.o;
        d5.F = uSa.E;
        nEa_12.l(rta.o, rta.o);
        nEa_12.l((double)c2, (double)b2, (double)a2);
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
        nEa_1 b2 = this;
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
        nEa_1 nEa_12 = b2;
        nEa_12.f((double)(e2 *= (double)f4));
        nEa_12.J((double)(d5 *= (double)f4));
        b2.l((double)(c2 *= (double)f4));
        void v4 = c2;
        f4 = Oz.J((double)(e2 * e2 + v4 * v4));
        b2.s = b2.X = (float)(Oz.f((double)e2, (double)c2) * kta.Da / lQa.f);
        nEa_1 nEa_13 = b2;
        nEa_13.o = nEa_13.d = (float)(Oz.f((double)d5, (double)f4) * kta.Da / lQa.f);
        b2.F = uSa.E;
    }

    public abstract void J(RY var1);

    public void J(Waa waa2) {
        nEa_1 nEa_12;
        nEa_1 b2 = waa2;
        nEa_1 a2 = this;
        nEa_1 nEa_13 = b2;
        nEa_1 nEa_14 = a2;
        nEa_14.C = b2.J(fPa.g);
        nEa_14.E = b2.J(pua.g);
        a2.M = nEa_13.J(pua.N);
        if (nEa_13.J(xSa.l, Yqa.i)) {
            nEa_12 = a2;
            a2.m = Block.J(b2.J(xSa.l));
        } else {
            nEa_12 = a2;
            a2.m = Block.f(b2.J(xSa.l) & osa.Ja);
        }
        nEa_12.A = b2.J(Qra.v) & osa.Ja;
        a2.i = b2.J(hTa.ha) == vRa.d ? vRa.d : uSa.E;
        a2.k = null;
        a2.J = b2.J(UOa.Ja);
        if (a2.J != null && a2.J.length() == 0) {
            a2.J = null;
        }
        a2.k = a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void d(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        nEa_1 nEa_12;
        nEa_1 nEa_13 = nEa_12 = this;
        nEa_12.f((double)c2);
        nEa_13.J((double)b2);
        nEa_13.l((double)a2);
        if (nEa_13.o == JPa.N && nEa_12.s == JPa.N) {
            void v1 = c2;
            void v2 = a2;
            float d5 = Oz.J((double)(v1 * v1 + v2 * v2));
            nEa_1 nEa_14 = nEa_12;
            nEa_14.s = nEa_14.X = (float)(Oz.f((double)c2, (double)a2) * kta.Da / lQa.f);
            nEa_1 nEa_15 = nEa_12;
            nEa_15.o = nEa_15.d = (float)(Oz.f((double)b2, (double)d5) * kta.Da / lQa.f);
        }
    }

    public void J() {
    }

    public float M() {
        return JPa.N;
    }

    public float f() {
        return Ira.d;
    }

    public nEa_1(Gg gg2) {
        nEa_1 a2;
        nEa_1 b2 = gg2;
        nEa_1 nEa_12 = a2 = this;
        super((Gg)b2);
        nEa_12.C = pua.o;
        nEa_12.E = pua.o;
        nEa_12.M = pua.o;
        nEa_12.l(rta.o, rta.o);
    }

    public float J() {
        return kTa.J;
    }
}

