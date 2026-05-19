/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  eAa
 *  iea
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockColored
extends Block {
    public static final PropertyEnum<iea> COLOR = PropertyEnum.J(Zra.L, iea.class);

    public BlockColored(Material material) {
        BlockColored a2;
        Material b2 = material;
        BlockColored blockColored = a2 = this;
        super(b2);
        blockColored.J(blockColored.blockState.J().J(COLOR, iea.WHITE));
        blockColored.J(yGa.A);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockColored a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockColored a2 = this;
        return b2.J(COLOR).getMapColor();
    }

    @Override
    public BlockState J() {
        BlockColored a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = COLOR;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockColored blockColored = this;
        iea[] b2 = iea.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            iea iea2 = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, iea2.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockColored a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockColored a2 = this;
        return a2.J().J(COLOR, iea.byMetadata((int)b2));
    }
}

