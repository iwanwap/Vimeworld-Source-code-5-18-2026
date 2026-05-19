/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVerticalSlab$1;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockVerticalSlab
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
    private static final Set<Block> VERTICAL_SLAB_BLOCKS = Collections.newSetFromMap(new IdentityHashMap());

    @Override
    public BlockState J() {
        BlockVerticalSlab a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockVerticalSlab a2 = this;
        DZ b22 = DZ.getFront(b22);
        if (b22.getAxis() == RX.Y) {
            b22 = DZ.NORTH;
        }
        return a2.J().J(FACING, b22);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockVerticalSlab i2;
        BlockVerticalSlab blockVerticalSlab = blockVerticalSlab2;
        BlockVerticalSlab blockVerticalSlab2 = gl2;
        BlockVerticalSlab a2 = blockVerticalSlab;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        Object c2 = i2;
        BlockVerticalSlab b2 = this;
        if ((c2 = c2.J((XF)a2)).J() != b2) return;
        switch (BlockVerticalSlab$1.$SwitchMap$net$minecraft$util$EnumFacing[c2.J(FACING).ordinal()]) {
            case 1: {
                b2.J(JPa.N, JPa.N, MQa.L, pqa.r, pqa.r, pqa.r);
                return;
            }
            case 2: {
                b2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, MQa.L);
                return;
            }
            case 3: {
                b2.J(MQa.L, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
            case 4: {
                b2.J(JPa.N, JPa.N, JPa.N, MQa.L, pqa.r, pqa.r);
                return;
            }
        }
    }

    public BlockVerticalSlab(Block block) {
        BlockVerticalSlab a2;
        Object b2 = block;
        BlockVerticalSlab blockVerticalSlab = a2 = this;
        super(((Block)b2).blockMaterial);
        b2 = blockVerticalSlab.blockState.J();
        blockVerticalSlab.J(JPa.N, JPa.N, JPa.N, MQa.L, pqa.r, pqa.r);
        VERTICAL_SLAB_BLOCKS.add(a2);
        BlockVerticalSlab blockVerticalSlab2 = a2;
        blockVerticalSlab2.J(b2.J(FACING, DZ.EAST));
        blockVerticalSlab2.J(yGa.A);
        a2.J(osa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void a2;
        void b2;
        void c2;
        BlockVerticalSlab blockVerticalSlab = this;
        IBlockState d2 = c2.J((XF)b2);
        if (VERTICAL_SLAB_BLOCKS.contains(d2.J()) && d2.J(FACING) == a2) {
            return vRa.d != 0;
        }
        return super.J((I)c2, (XF)b2, (DZ)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        BlockVerticalSlab e2;
        Object g2 = xF2;
        BlockVerticalSlab blockVerticalSlab = e2 = this;
        blockVerticalSlab.J((I)f2, (XF)((Object)g2));
        super.J((Gg)f2, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockVerticalSlab a2 = this;
        return b2.J(FACING).getIndex();
    }

    @Override
    public void f() {
        BlockVerticalSlab a2;
        a2.J(JPa.N, JPa.N, JPa.N, MQa.L, pqa.r, pqa.r);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

