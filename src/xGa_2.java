/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dv
 *  I
 *  JPa
 *  LQa
 *  MQa
 *  Mda
 *  Oz
 *  TPa
 *  TQa
 *  XTa
 *  Yfa
 *  bpa
 *  eAa
 *  gFa
 *  kta
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  wra
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xGa_2
extends gFa {
    private float M;
    private boolean k;
    private int j;
    private int J;
    private final Yfa A;
    private final float I;

    /*
     * Unable to fully structure code
     */
    public void f() {
        block19: {
            var1_3 = this;
            var7_4 = (Sx)var1_3.A.Aa;
            var8_5 = (bga)var1_3.A;
            var3_6 = Oz.f((float)(var7_4.X - var1_3.A.X)) * MQa.L;
            if (v0 > eua.C) {
                var3_6 = eua.C;
            }
            if (var3_6 < CRa.M) {
                var3_6 = CRa.M;
            }
            v1 = var1_3;
            v1.A.X = Oz.f((float)(v1.A.X + var3_6));
            if (v1.M < var1_3.I) {
                v2 = var1_3;
                var1_3.M += (v2.I - v2.M) * Jpa.B;
            }
            v3 = var1_3;
            if (v3.M > v3.I) {
                var1_3.M = var1_3.I;
            }
            v4 = var1_3;
            var3_7 = Oz.f((double)v4.A.la);
            var4_8 = Oz.f((double)v4.A.Z);
            var5_9 = Oz.f((double)v4.A.A);
            var6_10 = v4.M;
            if (v4.k) {
                v5 = var1_3.J;
                var1_3.J = v5 + vRa.d;
                if (v5 > var1_3.j) {
                    var1_3.k = uSa.E;
                }
                v6 = var6_10;
                var6_10 = v6 + v6 * TPa.z * Oz.d((float)((float)var1_3.J / (float)var1_3.j * pua.j));
            }
            a = XOa.v;
            if (var1_3.A.ha) {
                a = var1_3.A.j.J((XF)new XF((int)Oz.J((float)((float)var3_7)), (int)(Oz.J((float)((float)var4_8)) - vRa.d), (int)Oz.J((float)((float)var5_9)))).J().slipperiness.J() * XOa.v;
            }
            v7 = a;
            a = TQa.i / (v7 * v7 * a);
            v8 = var8_5;
            var2_11 = Oz.d((float)(v8.X * pua.j / Hra.Ga));
            var9_13 = Oz.C((float)(v8.X * pua.j / Hra.Ga));
            a = v8.D() * a;
            var10_15 = Math.max(var6_10, pqa.r);
            var10_15 = a / var10_15;
            a = var6_10 * var10_15;
            var2_11 = -(a * var2_11);
            a *= var9_13;
            if (Oz.l((float)var2_11) > Oz.l((float)a)) {
                if (var2_11 < JPa.N) {
                    var2_11 -= var1_3.A.F / kta.v;
                }
                if (var2_11 > JPa.N) {
                    var2_11 += var1_3.A.F / kta.v;
                }
                a = JPa.N;
                v9 = var1_3;
            } else {
                var2_11 = JPa.N;
                if (a < JPa.N) {
                    a -= var1_3.A.F / kta.v;
                }
                if (a > JPa.N) {
                    a += var1_3.A.F / kta.v;
                }
                v9 = var1_3;
            }
            var2_12 = Oz.f((double)(v9.A.la + (double)var2_11));
            v10 = var1_3;
            a = Oz.f((double)(v10.A.A + (double)a));
            var9_14 = Oz.J((float)(v10.A.F + pqa.r));
            var10_16 = Oz.J((float)(v10.A.u + var7_4.u + pqa.r));
            var11_17 = Oz.J((float)(v10.A.F + pqa.r));
            if (var3_7 == var2_12 && var5_9 == a) break block19;
            v11 = var1_3;
            var12_18 = v11.A.j.J(new XF(var3_7, var4_8, var5_9)).J();
            if (v11.J(var12_18)) ** GOTO lbl-1000
            if (var12_18.J() != Material.air) ** GOTO lbl-1000
            v12 = var1_3;
            if (!v12.J(v12.A.j.J(new XF(var3_7, var4_8 - vRa.d, var5_9)).J())) lbl-1000:
            // 2 sources

            {
                v13 = vRa.d;
            } else lbl-1000:
            // 2 sources

            {
                v13 = var13_19 = uSa.E;
            }
            if (var13_19 != 0 && uSa.E == Dv.J((I)var1_3.A.j, (vL)var1_3.A, (int)var2_12, (int)var4_8, (int)a, (int)var9_14, (int)var10_16, (int)var11_17, (boolean)uSa.E, (boolean)uSa.E, (boolean)vRa.d) && vRa.d == Dv.J((I)var1_3.A.j, (vL)var1_3.A, (int)var3_7, (int)(var4_8 + vRa.d), (int)var5_9, (int)var9_14, (int)var10_16, (int)var11_17, (boolean)uSa.E, (boolean)uSa.E, (boolean)vRa.d) && vRa.d == Dv.J((I)var1_3.A.j, (vL)var1_3.A, (int)var2_12, (int)(var4_8 + vRa.d), (int)a, (int)var9_14, (int)var10_16, (int)var11_17, (boolean)uSa.E, (boolean)uSa.E, (boolean)vRa.d)) {
                var8_5.J().J();
            }
        }
        if (!var7_4.h.f()) {
            v14 = var1_3;
            if (v14.M >= v14.I * MQa.L && var1_3.A.J().nextFloat() < LQa.ia && !var1_3.k && (var12_18 = var7_4.J()) != null && var12_18.J() == Gea.md) {
                v15 = var12_18;
                v15.J(vRa.d, var7_4);
                if (v15.E == 0) {
                    var13_20 = new Mda((eAa)Gea.DA);
                    var13_20.J(var12_18.J());
                    var7_4.K.j[var7_4.K.J] = var13_20;
                }
            }
        }
        var1_3.A.d(JPa.N, var6_10);
    }

    public boolean f() {
        xGa_2 a2;
        if (a2.A.K() && a2.A.Aa != null && a2.A.Aa instanceof Sx && (a2.k || a2.A.x())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public xGa_2(Yfa yfa, float f2) {
        void b2;
        float c2 = f2;
        xGa_2 a2 = this;
        a2.A = b2;
        a2.I = c2;
        a2.J(XTa.W);
    }

    public void l() {
        a.M = JPa.N;
    }

    public void J() {
        xGa_2 a2;
        xGa_2 xGa_22 = a2;
        xGa_22.k = uSa.E;
        xGa_22.M = JPa.N;
    }

    private boolean J(Block block) {
        Object b2 = block;
        xGa_2 a2 = this;
        if (b2 instanceof BlockStairs || b2 instanceof BlockSlab) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean d() {
        xGa_2 a2;
        if (!a2.C()) {
            xGa_2 xGa_22 = a2;
            if (xGa_22.M > xGa_22.I * bpa.K) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void C() {
        xGa_2 a2;
        a2.k = vRa.d;
        a2.J = uSa.E;
        a2.j = a2.A.J().nextInt(wra.u) + Bua.v;
    }

    public boolean C() {
        xGa_2 a2;
        return a2.k;
    }
}

