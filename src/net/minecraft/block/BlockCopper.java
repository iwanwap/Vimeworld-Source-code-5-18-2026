/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Mda
 *  eAa
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCopper$EnumVariant;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockCopper
extends Block {
    public static final PropertyEnum<BlockCopper$EnumVariant> VARIANT = PropertyEnum.J(Xpa.Ka, BlockCopper$EnumVariant.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockCopper blockCopper = this;
        BlockCopper$EnumVariant[] b2 = BlockCopper$EnumVariant.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockCopper$EnumVariant blockCopper$EnumVariant = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockCopper$EnumVariant.getMeta()));
            n3 = ++d2;
        }
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCopper a2 = this;
        return b2.J(VARIANT).getMeta();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCopper a2 = this;
        return b2.J(VARIANT).getMeta();
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCopper a2 = this;
        return b2.J(VARIANT).getColor();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCopper a2 = this;
        return a2.J().J(VARIANT, BlockCopper$EnumVariant.byMeta(b2));
    }

    @Override
    public BlockState J() {
        BlockCopper a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockCopper() {
        BlockCopper a2;
        BlockCopper blockCopper = a2;
        super(Material.iron);
        blockCopper.J(Bpa.w);
        a2.l(lqa.ga);
        BlockCopper blockCopper2 = a2;
        blockCopper2.J(blockCopper2.blockState.J().J(VARIANT, BlockCopper$EnumVariant.COPPER));
        blockCopper2.J(yGa.A);
    }
}

