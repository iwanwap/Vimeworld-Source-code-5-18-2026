/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Gg
 *  Gl
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  XTa
 *  pqa
 *  vL
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;

public abstract class BlockSlab
extends Block {
    private static final Set<Block> SLAB_BLOCKS;
    public static final PropertyEnum<BlockSlab$EnumBlockHalf> HALF;

    @Override
    public boolean g() {
        BlockSlab a2;
        return a2.b();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockSlab a2 = this;
        return super.f((Gg)b2, (XF)((Object)c2)) & XTa.W;
    }

    @Override
    public boolean G() {
        return uSa.E != 0;
    }

    public abstract Object J(Mda var1);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void a2;
        Object c2 = i2;
        Object b2 = this;
        if (((BlockSlab)b2).b()) {
            ((Block)b2).J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
            return;
        }
        if ((c2 = c2.J((XF)a2)).J() == b2) {
            if (c2.J(HALF) == BlockSlab$EnumBlockHalf.TOP) {
                ((Block)b2).J(JPa.N, MQa.L, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
            ((Block)b2).J(JPa.N, JPa.N, JPa.N, pqa.r, MQa.L, pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        BlockSlab h2;
        Object i2 = gg2;
        BlockSlab blockSlab = h2 = this;
        i2 = super.J((Gg)i2, (XF)g2, (DZ)f5, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2).J(HALF, BlockSlab$EnumBlockHalf.BOTTOM);
        if (blockSlab.b()) {
            return i2;
        }
        if (f5 != DZ.DOWN && (f5 == DZ.UP || (double)d2 <= kTa.B)) {
            return i2;
        }
        return i2.J(HALF, BlockSlab$EnumBlockHalf.TOP);
    }

    public abstract IProperty<?> J();

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
        BlockSlab e2;
        Object g2 = xF2;
        BlockSlab blockSlab = e2 = this;
        blockSlab.J((I)f2, (XF)((Object)g2));
        super.J((Gg)f2, (XF)((Object)g2), (IBlockState)d2, (xy)c2, (List<xy>)b2, (vL)a2);
    }

    @Override
    public void f() {
        BlockSlab a2;
        if (a2.b()) {
            a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
            return;
        }
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, MQa.L, pqa.r);
    }

    static {
        HALF = PropertyEnum.J(Fpa.H, BlockSlab$EnumBlockHalf.class);
        SLAB_BLOCKS = Collections.newSetFromMap(new IdentityHashMap());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        int n2;
        void b2;
        void c2;
        DZ d2 = dZ2;
        Object a2 = this;
        if (a2.b()) {
            return super.J((I)c2, (XF)b2, d2);
        }
        if (d2 != DZ.UP && d2 != DZ.DOWN && !super.J((I)c2, (XF)b2, d2)) {
            return uSa.E != 0;
        }
        Object object = b2.offset(d2.getOpposite());
        void v0 = c2;
        IBlockState iBlockState = v0.J((XF)b2);
        object = v0.J((XF)((Object)object));
        int n3 = BlockSlab.f(iBlockState.J()) && iBlockState.J(HALF) == BlockSlab$EnumBlockHalf.TOP ? vRa.d : uSa.E;
        int n4 = n2 = BlockSlab.f(object.J()) && object.J(HALF) == BlockSlab$EnumBlockHalf.TOP ? vRa.d : uSa.E;
        if (n2 != 0) {
            if (d2 == DZ.DOWN || d2 == DZ.UP && super.J((I)c2, (XF)b2, d2) || !BlockSlab.f(iBlockState.J()) || n3 == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (d2 == DZ.UP || d2 == DZ.DOWN && super.J((I)c2, (XF)b2, d2) || !BlockSlab.f(iBlockState.J()) || n3 != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        Object a2 = this;
        if (((BlockSlab)a2).b()) {
            return uqa.g;
        }
        return vRa.d;
    }

    public abstract boolean b();

    @Override
    public boolean l() {
        BlockSlab a2;
        return a2.b();
    }

    public static boolean f(Block a2) {
        return SLAB_BLOCKS.contains(a2);
    }

    public abstract String J(int var1);

    public BlockSlab(Material material) {
        BlockSlab blockSlab;
        BlockSlab a2;
        Material b2 = material;
        BlockSlab blockSlab2 = a2 = this;
        super(b2);
        if (blockSlab2.b()) {
            blockSlab = a2;
            a2.fullBlock = vRa.d;
        } else {
            BlockSlab blockSlab3 = a2;
            blockSlab = blockSlab3;
            blockSlab3.J(JPa.N, JPa.N, JPa.N, pqa.r, MQa.L, pqa.r);
            SLAB_BLOCKS.add(a2);
        }
        blockSlab.J(osa.Ja);
    }
}

