/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  QFa
 *  Qta
 *  eAa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSilverfish$1;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStone$EnumType;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockSilverfish
extends Block {
    public static final PropertyEnum<BlockSilverfish$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockSilverfish$EnumType.class);

    public BlockSilverfish() {
        BlockSilverfish a2;
        BlockSilverfish blockSilverfish = a2;
        super(Material.clay);
        blockSilverfish.J(blockSilverfish.blockState.J().J(VARIANT, BlockSilverfish$EnumType.STONE));
        blockSilverfish.J(JPa.N);
        a2.J(yGa.a);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockSilverfish a2 = this;
        return uSa.E;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSilverfish a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSilverfish a2 = this;
        return a2.J().J(VARIANT, BlockSilverfish$EnumType.byMetadata(b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void a2;
        Object c2 = gg2;
        BlockSilverfish b2 = this;
        c2 = c2.J((XF)a2);
        return c2.J().f((IBlockState)c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        BlockSilverfish f3 = gg2;
        BlockSilverfish e2 = this;
        if (!((Gg)f3).e && f3.J().f(Qta.Ja)) {
            void d2;
            qda c2;
            qda qda2 = c2 = new qda((Gg)f3);
            qda2.f((double)d2.getX() + kTa.B, d2.getY(), (double)d2.getZ() + kTa.B, JPa.N, JPa.N);
            f3.f((vL)qda2);
            c2.Q();
        }
    }

    @Override
    public BlockState J() {
        BlockSilverfish a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        return new BlockState(a2, iPropertyArray);
    }

    public static boolean J(IBlockState iBlockState) {
        IBlockState iBlockState2;
        IBlockState iBlockState3 = iBlockState2 = iBlockState;
        Block a2 = iBlockState3.J();
        if (iBlockState3 == QFa.Gd.J().J(BlockStone.VARIANT, BlockStone$EnumType.STONE) || a2 == QFa.yB || a2 == QFa.v) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSilverfish a2 = this;
        switch (BlockSilverfish$1.$SwitchMap$net$minecraft$block$BlockSilverfish$EnumType[b2.J(VARIANT).ordinal()]) {
            case 1: {
                return new Mda(QFa.yB);
            }
            case 2: {
                return new Mda(QFa.v);
            }
            case 3: {
                return new Mda(QFa.v, vRa.d, BlockStoneBrick$EnumType.MOSSY.getMetadata());
            }
            case 4: {
                return new Mda(QFa.v, vRa.d, BlockStoneBrick$EnumType.CRACKED.getMetadata());
            }
            case 5: {
                return new Mda(QFa.v, vRa.d, BlockStoneBrick$EnumType.CHISELED.getMetadata());
            }
        }
        return new Mda(QFa.Gd);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockSilverfish blockSilverfish = this;
        BlockSilverfish$EnumType[] b2 = BlockSilverfish$EnumType.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            BlockSilverfish$EnumType blockSilverfish$EnumType = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, blockSilverfish$EnumType.getMetadata()));
            n3 = ++d2;
        }
    }
}

