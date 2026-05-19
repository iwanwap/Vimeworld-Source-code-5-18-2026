/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Mda
 *  Tz
 *  eAa
 *  uY
 *  vRa
 *  wi
 *  wra
 *  zX
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf$1;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockOldLeaf
extends BlockLeaves {
    public static final PropertyEnum<BlockPlanks$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPlanks$EnumType.class, new BlockOldLeaf$1());

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void a2;
        void b2;
        void c2;
        BlockOldLeaf blockOldLeaf = this;
        Object d2 = c2.J((XF)b2);
        if (d2.J() == blockOldLeaf) {
            if ((d2 = d2.J(VARIANT)) == BlockPlanks$EnumType.SPRUCE) {
                return wi.f((int)zX.l());
            }
            if (d2 == BlockPlanks$EnumType.BIRCH) {
                return wi.f((int)zX.J());
            }
        }
        return super.J((I)c2, (XF)b2, (int)a2);
    }

    @Override
    public BlockPlanks$EnumType J(int n2) {
        int b2 = n2;
        BlockOldLeaf a2 = this;
        return BlockPlanks$EnumType.byMetadata((b2 & yRa.d) % AQa.P);
    }

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockOldLeaf a2 = this;
        if (b2.J() != a2) {
            return super.J(b2);
        }
        BlockPlanks$EnumType blockPlanks$EnumType = b2.J(VARIANT);
        if (blockPlanks$EnumType == BlockPlanks$EnumType.SPRUCE) {
            return wi.f((int)zX.l());
        }
        if (blockPlanks$EnumType == BlockPlanks$EnumType.BIRCH) {
            return wi.f((int)zX.J());
        }
        return super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, int n2) {
        void a2;
        void b2;
        BlockOldLeaf e2 = gg2;
        BlockOldLeaf d2 = this;
        if (b2.J(VARIANT) == BlockPlanks$EnumType.OAK && ((Gg)e2).v.nextInt((int)a2) == 0) {
            void c2;
            BlockOldLeaf.J((Gg)e2, (XF)c2, new Mda(Gea.Mb, vRa.d, uSa.E));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void a2;
        void b2;
        void c2;
        void e2;
        Sx f2 = sx2;
        BlockOldLeaf d2 = this;
        if (!e2.e && f2.f() != null && f2.f().J() == Gea.ja) {
            f2.J(Tz.a[Block.J(d2)]);
            BlockOldLeaf.J((Gg)e2, (XF)c2, new Mda(eAa.J((Block)d2), vRa.d, b2.J(VARIANT).getMetadata()));
            return;
        }
        super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockOldLeaf a2 = this;
        return b2.J(VARIANT).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockOldLeaf a2 = this;
        return a2.J().J(VARIANT, a2.J(b2)).J(DECAYABLE, ((b2 & AQa.P) == 0 ? vRa.d : uSa.E) != 0).J(CHECK_DECAY, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockOldLeaf a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, b2.J(VARIANT).getMetadata());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockOldLeaf blockOldLeaf = this;
        int b2 = uSa.E;
        b2 |= a2.J(VARIANT).getMetadata();
        if (!a2.J(DECAYABLE).booleanValue()) {
            b2 |= AQa.P;
        }
        if (a2.J(CHECK_DECAY).booleanValue()) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockOldLeaf a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.OAK.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.SPRUCE.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.BIRCH.getMetadata()));
        d2.add(new Mda((eAa)c2, vRa.d, BlockPlanks$EnumType.JUNGLE.getMetadata()));
    }

    @Override
    public int d(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockOldLeaf a2 = this;
        if (b2.J(VARIANT) == BlockPlanks$EnumType.JUNGLE) {
            return wra.P;
        }
        return super.d(b2);
    }

    public BlockOldLeaf() {
        BlockOldLeaf a2;
        BlockOldLeaf blockOldLeaf = a2;
        blockOldLeaf.J(blockOldLeaf.blockState.J().J(VARIANT, BlockPlanks$EnumType.OAK).J(CHECK_DECAY, vRa.d != 0).J(DECAYABLE, vRa.d != 0));
    }

    @Override
    public BlockState J() {
        BlockOldLeaf a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        iPropertyArray[vRa.d] = CHECK_DECAY;
        iPropertyArray[uqa.g] = DECAYABLE;
        return new BlockState(a2, iPropertyArray);
    }
}

