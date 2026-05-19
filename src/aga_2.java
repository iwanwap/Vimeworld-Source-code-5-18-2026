/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dha
 *  Gg
 *  JPa
 *  JTa
 *  Lqa
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  QFa
 *  Tpa
 *  Waa
 *  aSa
 *  dpa
 *  gZ
 *  hra
 *  jRa
 *  kta
 *  pqa
 *  uOa
 *  vL
 *  vRa
 *  wra
 */
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aga_2
extends vL {
    private boolean C;
    private float i;
    private IBlockState M;
    public Waa k;
    public int j;
    private int J;
    private boolean A;
    public boolean I;

    public IBlockState J() {
        aga_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public aga_2(Gg gg2, double d2, double d3, double d4, IBlockState iBlockState) {
        void b2;
        void c2;
        void d5;
        Object f2;
        void e2;
        aga_2 a2;
        aga_2 aga_22 = object;
        Object object = iBlockState;
        aga_2 aga_23 = a2 = aga_22;
        aga_2 aga_24 = a2;
        aga_2 aga_25 = a2;
        aga_2 aga_26 = a2;
        super((Gg)e2);
        a2.I = vRa.d;
        a2.J = wra.P;
        aga_26.i = kta.v;
        aga_26.M = f2;
        aga_26.h = vRa.d;
        aga_25.l(MQa.d, MQa.d);
        aga_25.l((double)d5, (double)c2, (double)b2);
        aga_24.f(aSa.V);
        aga_24.J(aSa.V);
        a2.l(aSa.V);
        a2.c = d5;
        aga_23.ba = c2;
        aga_23.r = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Dha dha) {
        void a2;
        aga_2 aga_22;
        aga_2 aga_23 = aga_22 = this;
        super.J((Dha)a2);
        if (aga_23.M != null) {
            Block b2 = aga_22.M.J();
            void v1 = a2;
            v1.J(fqa.C, (Object)Block.J(b2));
            v1.J(FRa.j, (Object)b2.f(aga_22.M));
        }
    }

    public void J() {
    }

    public aga_2(Gg gg2) {
        aga_2 b2 = gg2;
        aga_2 a2 = this;
        super((Gg)b2);
        a2.I = vRa.d;
        a2.J = wra.P;
        a2.i = kta.v;
    }

    public void f(float f2, float f3) {
        int b2;
        aga_2 aga_22;
        aga_2 aga_23 = aga_22 = this;
        Block a22 = aga_23.M.J();
        if (aga_23.C && (b2 = Oz.f((float)(b2 - pqa.r))) > 0) {
            aga_2 aga_24 = aga_22;
            Object c22 = Lists.newArrayList(aga_22.j.f((vL)aga_24, aga_24.J()));
            int a22 = a22 == QFa.Sb ? vRa.d : uSa.E;
            gZ gZ2 = a22 != 0 ? gZ.M : gZ.H;
            c22 = c22.iterator();
            Object object = c22;
            while (object.hasNext()) {
                ((vL)c22.next()).J(gZ2, (float)Math.min(Oz.J((float)((float)b2 * aga_22.i)), aga_22.J));
                object = c22;
            }
            if (a22 != 0 && (double)aga_22.R.nextFloat() < ySa.Ja + (double)b2 * fPa.ca) {
                int c22 = aga_22.M.J(BlockAnvil.DAMAGE);
                if (++c22 > uqa.g) {
                    aga_22.A = vRa.d;
                    return;
                }
                aga_22.M = aga_22.M.J(BlockAnvil.DAMAGE, c22);
            }
        }
    }

    public Gg f() {
        aga_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        aga_2 aga_22 = this;
        Block block = aga_22.M != null ? aga_22.M.J() : QFa.HF;
        ResourceLocation b2 = (ResourceLocation)Block.blockRegistry.f(block);
        a2.J(Iqa.F, b2 == null ? Mqa.y : b2.toString());
        void v0 = a2;
        v0.J(Lqa.o, (byte)block.f(aga_22.M));
        v0.J(JTa.m, (byte)aga_22.j);
        v0.J(vua.Q, aga_22.I);
        v0.J(ROa.Y, aga_22.C);
        v0.J(Bua.G, aga_22.i);
        aga_2 aga_23 = aga_22;
        v0.J(Tpa.ga, aga_23.J);
        if (aga_23.k != null) {
            a2.J(Qra.o, (NCa)aga_22.k);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void d() {
        var2_1 = this /* !! */ ;
        var1_2 = var2_1.M.J();
        if (var1_2.J() == Material.air) {
            var2_1.k();
            return;
        }
        v0 = var2_1;
        v0.c = v0.la;
        v0.ba = v0.Z;
        v0.r = (double)v0.A;
        v1 = v0.j;
        v0.j = v1 + vRa.d;
        if (v1 != 0) ** GOTO lbl23
        a /* !! */  = new XF(var2_1);
        if (var2_1.j.J((XF)a /* !! */ ).J() == var1_2) {
            v2 = var2_1;
            v3 = v2;
            v2.j.G((XF)a /* !! */ );
        } else {
            if (!var2_1.j.e) {
                var2_1.k();
                return;
            }
lbl23:
            // 3 sources

            v3 = var2_1;
        }
        v3.J(var2_1.Ea - Tpa.fa);
        v4 = var2_1;
        v5 = var2_1;
        v5.J(v4.i, v5.Ea, var2_1.f);
        v4.f(v4.i * uua.G);
        v4.J(v4.Ea * uua.G);
        v4.l(v4.f * uua.G);
        if (!v4.j.e) {
            a /* !! */  = new XF(var2_1);
            if (var2_1.ha) {
                v6 = var2_1;
                v6.f(v6.i * dpa.X);
                v6.l(v6.f * dpa.X);
                v6.J(v6.Ea * KPa.I);
                if (v6.j.J((XF)a /* !! */ ).J() != QFa.zA) {
                    v7 = var2_1;
                    v7.k();
                    if (!v7.A) {
                        if (var2_1.j.J(var1_2, (XF)a /* !! */ , (boolean)vRa.d, DZ.UP, (vL)null, (Mda)null) && !BlockFalling.l((Gg)var2_1.j, a /* !! */ .down()) && var2_1.j.J((XF)a /* !! */ , var2_1.M, yRa.d)) {
                            if (var1_2 instanceof BlockFalling) {
                                ((BlockFalling)var1_2).l((Gg)var2_1.j, (XF)a /* !! */ );
                            }
                            if (var2_1.k != null && var1_2 instanceof ITileEntityProvider && (var6_3 = var2_1.j.J((XF)a /* !! */ )) != null) {
                                var4_4 = new Waa();
                                var6_3.J(var4_4);
                                for (String var3_6 : var2_1.k.J()) {
                                    var7_7 = var2_1.k.J(var3_6);
                                    if (var3_6.equals(rRa.X) || var3_6.equals(uOa.Ja) || var3_6.equals(oua.v)) continue;
                                    var4_4.J(var3_6, var7_7.J());
                                }
                                v8 = var6_3;
                                v8.f(var4_4);
                                v8.f();
                                return;
                            }
                        } else if (var2_1.I && var2_1.j.J().f(qQa.y)) {
                            v9 = var1_2;
                            var2_1.J(new Mda(v9, vRa.d, v9.C(var2_1.M)), JPa.N);
                            return;
                        }
                    }
                }
            } else if (var2_1.j > ySa.T && !var2_1.j.e && (a /* !! */ .getY() < vRa.d || a /* !! */ .getY() > hra.Ja) || var2_1.j > Jpa.z) {
                if (var2_1.I && var2_1.j.J().f(qQa.y)) {
                    v10 = var1_2;
                    var2_1.J(new Mda(v10, vRa.d, v10.C(var2_1.M)), JPa.N);
                }
                var2_1.k();
            }
        }
    }

    public void A(boolean bl) {
        boolean b2 = bl;
        aga_2 a2 = this;
        a2.C = b2;
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public boolean e() {
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        aga_2 aga_22;
        aga_2 aga_23;
        aga_2 b2 = waa2;
        aga_2 a2 = this;
        aga_2 aga_24 = b2;
        int n2 = aga_24.J(Lqa.o) & osa.Ja;
        if (aga_24.J(Iqa.F, Yqa.i)) {
            aga_23 = a2;
            a2.M = Block.J(b2.J(Iqa.F)).J(n2);
        } else if (b2.J(jRa.j, zOa.v)) {
            aga_23 = a2;
            a2.M = Block.f(b2.J(jRa.j)).J(n2);
        } else {
            aga_23 = a2;
            a2.M = Block.f(b2.J(wsa.q) & osa.Ja).J(n2);
        }
        aga_23.j = b2.J(JTa.m) & osa.Ja;
        Block block = a2.M.J();
        if (b2.J(ROa.Y, zOa.v)) {
            aga_2 aga_25 = b2;
            aga_22 = aga_25;
            aga_2 aga_26 = a2;
            aga_26.C = b2.f(ROa.Y);
            aga_26.i = b2.J(Bua.G);
            a2.J = aga_25.J(Tpa.ga);
        } else {
            if (block == QFa.Sb) {
                a2.C = vRa.d;
            }
            aga_22 = b2;
        }
        if (aga_22.J(vua.Q, zOa.v)) {
            a2.I = b2.f(vua.Q);
        }
        if (b2.J(Qra.o, NTa.C)) {
            a2.k = b2.J(Qra.o);
        }
        if (block == null || block.J() == Material.air) {
            a2.M = QFa.R.J();
        }
    }

    public boolean E() {
        aga_2 a2;
        if (a2.J == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

