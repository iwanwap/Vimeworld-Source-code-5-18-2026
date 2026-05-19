/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  bpa
 *  eAa
 *  pqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomPillar;
import net.minecraft.block.BlockFroglight$EnumVariant;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFroglight
extends BlockCustomPillar {
    public static final PropertyEnum<BlockFroglight$EnumVariant> VARIANT = PropertyEnum.J(Xpa.Ka, BlockFroglight$EnumVariant.class);

    public BlockFroglight() {
        BlockFroglight a2;
        BlockFroglight blockFroglight = a2;
        super(Material.froglight);
        blockFroglight.J(bpa.K);
        a2.f(pqa.r);
        BlockFroglight blockFroglight2 = a2;
        blockFroglight2.J(blockFroglight2.blockState.J().J(VARIANT, BlockFroglight$EnumVariant.PEARLESCENT).J(AXIS, RX.Y));
        blockFroglight2.J(soundTypeGlass);
        a2.J(yGa.A);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockFroglight a2 = this;
        int n3 = b2 >> uqa.g;
        return a2.J().J(VARIANT, BlockFroglight$EnumVariant.byMeta(n3)).J(AXIS, RX.values()[b2 &= yRa.d]);
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFroglight a2 = this;
        return b2.J(VARIANT).getColor();
    }

    @Override
    public BlockState J() {
        BlockFroglight a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = VARIANT;
        iPropertyArray[vRa.d] = AXIS;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFroglight a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, a2.C(b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void f5;
        void i2;
        int n3 = n2;
        BlockFroglight b2 = this;
        return b2.J().J(VARIANT, BlockFroglight$EnumVariant.byMeta((int)i2)).J(AXIS, f5.getAxis());
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFroglight a2 = this;
        return b2.J(VARIANT).getMeta();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b22 = iBlockState;
        BlockFroglight a2 = this;
        int n2 = b22.J(VARIANT).getMeta();
        int b22 = ((RX)b22.J(AXIS)).ordinal();
        return (n2 << uqa.g) + (b22 & yRa.d);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockFroglight blockFroglight = this;
        BlockFroglight$EnumVariant[] b2 = BlockFroglight$EnumVariant.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockFroglight$EnumVariant blockFroglight$EnumVariant = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockFroglight$EnumVariant.getMeta()));
            n3 = ++d2;
        }
    }
}

