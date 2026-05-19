/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Tz
 *  eAa
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf$1;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockNewLeaf
extends BlockLeaves {
    public static final PropertyEnum<BlockPlanks$EnumType> VARIANT = PropertyEnum.J(Xpa.Ka, BlockPlanks$EnumType.class, new BlockNewLeaf$1());

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void a2;
        Object c2 = gg2;
        BlockNewLeaf b2 = this;
        c2 = c2.J((XF)a2);
        return c2.J().f((IBlockState)c2) & yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, int n2) {
        void a2;
        void b2;
        BlockNewLeaf e2 = gg2;
        BlockNewLeaf d2 = this;
        if (b2.J(VARIANT) == BlockPlanks$EnumType.DARK_OAK && ((Gg)e2).v.nextInt((int)a2) == 0) {
            void c2;
            BlockNewLeaf.J((Gg)e2, (XF)c2, new Mda(Gea.Mb, vRa.d, uSa.E));
        }
    }

    public BlockNewLeaf() {
        BlockNewLeaf a2;
        BlockNewLeaf blockNewLeaf = a2;
        blockNewLeaf.J(blockNewLeaf.blockState.J().J(VARIANT, BlockPlanks$EnumType.ACACIA).J(CHECK_DECAY, vRa.d != 0).J(DECAYABLE, vRa.d != 0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockNewLeaf blockNewLeaf = this;
        int b2 = uSa.E;
        b2 |= blockNewLeaf.J(a2.J(VARIANT));
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
    public void J(Gg gg2, Sx sx2, XF xF2, IBlockState iBlockState, uY uY2) {
        void a2;
        void b2;
        void c2;
        void e2;
        Sx f2 = sx2;
        BlockNewLeaf d2 = this;
        if (!e2.e && f2.f() != null && f2.f().J() == Gea.ja) {
            f2.J(Tz.a[Block.J(d2)]);
            BlockNewLeaf.J((Gg)e2, (XF)c2, new Mda(eAa.J((Block)d2), vRa.d, d2.J(b2.J(VARIANT))));
            return;
        }
        super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
    }

    public int J(BlockPlanks$EnumType blockPlanks$EnumType) {
        BlockPlanks$EnumType b2 = blockPlanks$EnumType;
        BlockNewLeaf a2 = this;
        if (b2 == BlockPlanks$EnumType.MANGROVE) {
            return uqa.g;
        }
        return b2.getMetadata() - AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockNewLeaf a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
        d2.add(new Mda((eAa)c2, vRa.d, vRa.d));
        d2.add(new Mda((eAa)c2, vRa.d, uqa.g));
    }

    @Override
    public Mda J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockNewLeaf a2 = this;
        return new Mda(eAa.J((Block)a2), vRa.d, a2.J(b2.J(VARIANT)));
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockNewLeaf a2 = this;
        return a2.J(b2.J(VARIANT));
    }

    @Override
    public BlockPlanks$EnumType J(int n2) {
        int b2 = n2;
        BlockNewLeaf a2 = this;
        if ((b2 &= yRa.d) == uqa.g) {
            return BlockPlanks$EnumType.MANGROVE;
        }
        return BlockPlanks$EnumType.byMetadata(b2 + AQa.P);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockNewLeaf a2 = this;
        return a2.J().J(VARIANT, a2.J(b2)).J(DECAYABLE, ((b2 & AQa.P) == 0 ? vRa.d : uSa.E) != 0).J(CHECK_DECAY, ((b2 & Yqa.i) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public BlockState J() {
        BlockNewLeaf a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = VARIANT;
        iPropertyArray[vRa.d] = CHECK_DECAY;
        iPropertyArray[uqa.g] = DECAYABLE;
        return new BlockState(a2, iPropertyArray);
    }
}

