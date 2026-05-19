/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Gl
 *  JPa
 *  Mda
 *  QFa
 *  UZ
 *  aZ
 *  hy
 *  pqa
 *  pua
 *  uY
 *  vRa
 *  wOa
 *  xA
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockEnchantmentTable
extends BlockContainer {
    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void a2;
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockEnchantmentTable b2 = this;
        super.l((Gg)d2, (XF)c2, e2, (Random)a2);
        int n2 = e2 = rQa.p;
        while (n2 <= uqa.g) {
            int n3 = rQa.p;
            while (n3 <= uqa.g) {
                int n4;
                if (e2 > rQa.p && e2 < uqa.g && n4 == pua.o) {
                    n4 = uqa.g;
                }
                if (a2.nextInt(ERa.C) == 0) {
                    int n5 = uSa.E;
                    while (n5 <= vRa.d) {
                        int n6;
                        XF xF3 = c2.add(e2, n6, n4);
                        if (d2.J(xF3).J() == QFa.gA) {
                            if (!d2.J(c2.add(e2 / uqa.g, uSa.E, n4 / uqa.g))) break;
                            d2.J(UZ.ENCHANTMENT_TABLE, (double)c2.getX() + kTa.B, (double)c2.getY() + KPa.y, (double)c2.getZ() + kTa.B, (double)((float)e2 + a2.nextFloat()) - kTa.B, (double)((float)n6 - a2.nextFloat() - pqa.r), (double)((float)n4 + a2.nextFloat()) - kTa.B, new int[uSa.E]);
                        }
                        n5 = ++n6;
                    }
                }
                n3 = ++n4;
            }
            n2 = ++e2;
        }
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    public BlockEnchantmentTable() {
        BlockEnchantmentTable a2;
        BlockEnchantmentTable blockEnchantmentTable = a2;
        super(Material.rock, MapColor.redColor);
        blockEnchantmentTable.J(JPa.N, JPa.N, JPa.N, pqa.r, wOa.w, pqa.r);
        blockEnchantmentTable.J(uSa.E);
        a2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockEnchantmentTable i2 = gg2;
        BlockEnchantmentTable h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof aZ) {
            void e2;
            e2.J((xA)((aZ)i2));
        }
        return vRa.d != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockEnchantmentTable a2 = this;
        return new aZ();
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        BlockEnchantmentTable f2 = gg2;
        BlockEnchantmentTable e2 = this;
        super.J((Gg)f2, (XF)d2, (IBlockState)c2, (Gl)b2, (Mda)a2);
        if (a2.l() && (f2 = f2.J((XF)d2)) instanceof aZ) {
            ((aZ)f2).J(a2.J());
        }
    }
}

