/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  XTa
 *  hDa
 *  kqa
 *  mFa
 *  pua
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hia
extends hDa {
    private int j;
    private final mFa J;
    private boolean A;
    private boolean I;

    public void J() {
        hia a2;
        super.J();
    }

    public boolean f() {
        hia a2;
        if (a2.A <= 0) {
            if (!a2.J.j.J().f(kqa.N)) {
                return uSa.E != 0;
            }
            hia hia2 = a2;
            hia2.j = pua.o;
            hia2.I = hia2.J.Fa();
            hia2.A = hia2.J.Ha();
        }
        return super.f();
    }

    public void l() {
        hia a2;
        super.l();
    }

    public boolean J(Gg gg2, XF xF) {
        IBlockState b2;
        Object c2 = xF;
        hia a2 = this;
        Block block = b2.J((XF)((Object)c2)).J();
        if (block == QFa.rd) {
            block = (b2 = b2.J((XF)((Object)(c2 = ((XF)((Object)c2)).up())))).J();
            if (block instanceof BlockCrops && b2.J(BlockCrops.AGE) == XTa.W && a2.A && (a2.j == 0 || a2.j < 0)) {
                a2.j = uSa.E;
                return vRa.d != 0;
            }
            if (block == QFa.HF && a2.I && (a2.j == vRa.d || a2.j < 0)) {
                a2.j = vRa.d;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public hia(mFa mFa2, double d2) {
        void a2;
        hia c2 = mFa2;
        hia b2 = this;
        super((bga)((Object)c2), (double)a2, ERa.C);
        b2.J = c2;
    }

    public boolean l() {
        hia a2;
        if (a2.j >= 0 && super.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f() {
        block8: {
            block7: {
                block10: {
                    block9: {
                        v0 = var2_2 = this /* !! */ ;
                        super.f();
                        v1 = var2_2;
                        v0.J.J().J((double)v1.J.getX() + kTa.B, (double)(var2_2.J.getY() + vRa.d), (double)var2_2.J.getZ() + kTa.B, FRa.Ga, (float)var2_2.J.F());
                        if (!v1.C()) break block8;
                        v2 = var2_2;
                        var6_3 = v2.J.j;
                        var4_4 = v2.J.up();
                        var3_5 = var6_3.J(var4_4);
                        a /* !! */  = var3_5.J();
                        if (v2.j != 0 || !(a /* !! */  instanceof BlockCrops) || var3_5.J(BlockCrops.AGE) != XTa.W) break block9;
                        v3 = var2_2;
                        var6_3.f(var4_4, (boolean)vRa.d);
                        break block7;
                    }
                    if (var2_2.j != vRa.d || a /* !! */  != QFa.HF) break block10;
                    var3_5 = var2_2.J.J();
                    v4 = a = uSa.E;
                    while (v4 < var3_5.f()) {
                        var5_7 = var3_5.J(a);
                        var1_6 = uSa.E;
                        if (var5_7 == null) ** GOTO lbl40
                        if (var5_7.J() == Gea.o) {
                            var6_3.J(var4_4, QFa.Aa.J(), yRa.d);
                            var1_6 = vRa.d;
                            v5 = var1_6;
                        } else if (var5_7.J() == Gea.cA) {
                            var6_3.J(var4_4, QFa.LF.J(), yRa.d);
                            var1_6 = vRa.d;
                            v5 = var1_6;
                        } else {
                            if (var5_7.J() == Gea.EB) {
                                var6_3.J(var4_4, QFa.FE.J(), yRa.d);
                                var1_6 = vRa.d;
                            }
lbl40:
                            // 4 sources

                            v5 = var1_6;
                        }
                        if (v5 != 0) {
                            v6 = var5_7;
                            v6.E -= vRa.d;
                            if (v6.E > 0) break;
                            var3_5.J(a, null);
                            v3 = var2_2;
                            break block7;
                        }
                        v4 = ++a;
                    }
                }
                v3 = var2_2;
            }
            v3.j = pua.o;
            var2_2.A = NTa.C;
        }
    }
}

