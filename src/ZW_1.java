/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  ERa
 *  Gg
 *  Oz
 *  QFa
 *  XTa
 *  Ypa
 *  mw
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ZW_1
extends mw {
    private boolean M;
    private static final IBlockState k;
    private static final IBlockState J;
    private static final IBlockState A;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void a2;
        void c2;
        ZW_1 b2;
        Object d2 = random;
        ZW_1 zW_1 = b2 = this;
        int n2 = zW_1.J((Random)d2);
        if (!zW_1.J((Gg)c2, (Random)d2, (XF)a2, n2)) {
            return uSa.E != 0;
        }
        b2.J((Gg)c2, a2.getX(), a2.getZ(), a2.getY() + n2, uSa.E, (Random)d2);
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            Block block = c2.J(a2.up(d2)).J();
            if (block.J() == Material.air || block.J() == Material.leaves) {
                b2.J((Gg)c2, a2.up(d2), b2.I);
            }
            if (d2 < n2 - vRa.d) {
                block = c2.J(a2.add(vRa.d, d2, uSa.E)).J();
                if (block.J() == Material.air || block.J() == Material.leaves) {
                    b2.J((Gg)c2, a2.add(vRa.d, d2, uSa.E), b2.I);
                }
                if ((block = c2.J(a2.add(vRa.d, d2, vRa.d)).J()).J() == Material.air || block.J() == Material.leaves) {
                    b2.J((Gg)c2, a2.add(vRa.d, d2, vRa.d), b2.I);
                }
                if ((block = c2.J(a2.add(uSa.E, d2, vRa.d)).J()).J() == Material.air || block.J() == Material.leaves) {
                    b2.J((Gg)c2, a2.add(uSa.E, d2, vRa.d), b2.I);
                }
            }
            n3 = ++d2;
        }
        return vRa.d != 0;
    }

    static {
        A = QFa.UA.J().J(BlockOldLog.VARIANT, BlockPlanks$EnumType.SPRUCE);
        J = QFa.vd.J().J(BlockOldLeaf.VARIANT, BlockPlanks$EnumType.SPRUCE).J(BlockLeaves.CHECK_DECAY, uSa.E != 0);
        k = QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.PODZOL);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        int n2;
        void a2;
        void c2;
        ZW_1 zW_1;
        ZW_1 zW_12 = zW_1 = this;
        void v1 = c2;
        void v2 = a2;
        zW_1.l((Gg)c2, v2.west().north());
        zW_1.l((Gg)v1, v2.east(uqa.g).north());
        zW_12.l((Gg)v1, a2.west().south(uqa.g));
        zW_12.l((Gg)c2, a2.east(uqa.g).south(uqa.g));
        int n3 = n2 = uSa.E;
        while (n3 < tTa.h) {
            void b2;
            int d2 = b2.nextInt(ysa.s);
            int n4 = d2 % Yqa.i;
            if (n4 == 0 || n4 == XTa.W || (d2 /= Yqa.i) == 0 || d2 == XTa.W) {
                zW_1.l((Gg)c2, a2.add(ERa.Ka + n4, uSa.E, ERa.Ka + d2));
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(Gg gg2, XF xF2) {
        int n2;
        ZW_1 zW_1 = this;
        int n3 = n2 = rQa.p;
        while (n3 <= uqa.g) {
            int n4 = rQa.p;
            while (n4 <= uqa.g) {
                int c2;
                if (Math.abs(n2) != uqa.g || Math.abs(c2) != uqa.g) {
                    void a2;
                    void b2;
                    zW_1.f((Gg)b2, a2.add(n2, uSa.E, c2));
                }
                n4 = ++c2;
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Gg gg2, int n2, int n3, int n4, int n5, Random random) {
        void c2;
        void g2;
        void a22;
        ZW_1 zW_1 = this;
        int a22 = a22.nextInt(tTa.h) + (zW_1.M ? (int)zW_1.A : yRa.d);
        int n6 = uSa.E;
        void v0 = g2 = c2 - a22;
        while (v0 <= c2) {
            void d2;
            void e2;
            void f2;
            void b2;
            void var9_11 = c2 - g2;
            void var10_12 = b2 + Oz.J((float)((float)var9_11 / (float)a22 * Bpa.w));
            zW_1.f((Gg)f2, new XF((int)e2, (int)g2, (int)d2), (int)(var10_12 + (var9_11 > 0 && var10_12 == n6 && (g2 & vRa.d) == 0 ? vRa.d : uSa.E)));
            n6 = var10_12;
            v0 = ++g2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public ZW_1(boolean bl, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        ZW_1 a2 = this;
        super((boolean)b2, uua.s, Ypa.A, A, J);
        a2.M = c2;
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF2) {
        int c2;
        ZW_1 zW_1 = this;
        int n2 = c2 = uqa.g;
        while (n2 >= ERa.Ka) {
            void b2;
            void a2;
            XF xF3 = a2.up(c2);
            Block block = b2.J(xF3).J();
            if (block == QFa.lf || block == QFa.Bc) {
                zW_1.J((Gg)b2, xF3, k);
                return;
            }
            if (block.J() != Material.air && c2 < 0) {
                return;
            }
            n2 = --c2;
        }
    }
}

