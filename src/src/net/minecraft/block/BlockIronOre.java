/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Zpa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockIronOre$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockIronOre
extends Block {
    public static final PropertyEnum<BlockIronOre$EnumType> TYPE = PropertyEnum.J(Zpa.x, BlockIronOre$EnumType.class);

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockIronOre a2 = this;
        return b2.J(TYPE).getMeta();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockIronOre blockIronOre = this;
        BlockIronOre$EnumType[] b2 = BlockIronOre$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockIronOre$EnumType blockIronOre$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockIronOre$EnumType.getMeta()));
            n3 = ++d2;
        }
    }

    public BlockIronOre() {
        BlockIronOre a2;
        BlockIronOre blockIronOre = a2;
        super(Material.rock, Material.rock.J());
        blockIronOre.J(yGa.A);
        BlockIronOre blockIronOre2 = a2;
        blockIronOre2.J(blockIronOre2.blockState.J().J(TYPE, BlockIronOre$EnumType.IRON));
    }

    @Override
    public BlockState J() {
        BlockIronOre a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = TYPE;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockIronOre a2 = this;
        return a2.J().J(TYPE, BlockIronOre$EnumType.byMetadata(b2));
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockIronOre a2 = this;
        return b2.J(TYPE).getMeta();
    }
}

