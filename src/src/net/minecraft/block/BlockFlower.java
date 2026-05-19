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
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower$1;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BlockFlower
extends BlockBush {
    public PropertyEnum<BlockFlower$EnumFlowerType> type;

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFlower a2 = this;
        return b2.J(a2.J()).getMeta();
    }

    @Override
    public BlockState J() {
        BlockFlower a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = a2.J();
        return new BlockState(a2, iPropertyArray);
    }

    public BlockFlower() {
        BlockFlower a2;
        BlockFlower blockFlower = a2;
        BlockFlower blockFlower2 = a2;
        blockFlower2.J(blockFlower.blockState.J().J(a2.J(), blockFlower2.J() == BlockFlower$EnumFlowerColor.RED ? BlockFlower$EnumFlowerType.POPPY : BlockFlower$EnumFlowerType.DANDELION));
    }

    public IProperty<BlockFlower$EnumFlowerType> J() {
        BlockFlower a2;
        if (a2.type == null) {
            a2.type = PropertyEnum.J(Zpa.x, BlockFlower$EnumFlowerType.class, new BlockFlower$1(a2));
        }
        return a2.type;
    }

    public abstract BlockFlower$EnumFlowerColor J();

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockFlower blockFlower = this;
        BlockFlower$EnumFlowerType[] b2 = BlockFlower$EnumFlowerType.getTypes(blockFlower.J());
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockFlower$EnumFlowerType blockFlower$EnumFlowerType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockFlower$EnumFlowerType.getMeta()));
            n3 = ++d2;
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockFlower a2 = this;
        return a2.J().J(a2.J(), BlockFlower$EnumFlowerType.getType(a2.J(), b2));
    }

    @Override
    public Block$EnumOffsetType J() {
        return Block$EnumOffsetType.XZ;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFlower a2 = this;
        return b2.J(a2.J()).getMeta();
    }
}

