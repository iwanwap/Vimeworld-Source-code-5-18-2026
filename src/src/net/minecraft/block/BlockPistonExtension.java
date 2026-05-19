/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  QFa
 *  XTa
 *  Zpa
 *  eAa
 *  pqa
 *  vL
 *  vRa
 *  wOa
 *  xy
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension$1;
import net.minecraft.block.BlockPistonExtension$EnumPistonType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPistonExtension
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja);
    public static final PropertyBool SHORT;
    public static final PropertyEnum<BlockPistonExtension$EnumPistonType> TYPE;

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockPistonExtension blockPistonExtension = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getIndex();
        if (a2.J(TYPE) == BlockPistonExtension$EnumPistonType.STICKY) {
            b2 |= Yqa.i;
        }
        return b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockPistonExtension a2 = this;
        if ((b2 = b2.J(FACING)) == null) return;
        switch (BlockPistonExtension$1.$SwitchMap$net$minecraft$util$EnumFacing[((Enum)b2).ordinal()]) {
            case 1: {
                a2.J(JPa.N, JPa.N, JPa.N, pqa.r, rta.o, pqa.r);
                return;
            }
            case 2: {
                a2.J(JPa.N, wOa.w, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
            case 3: {
                a2.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, rta.o);
                return;
            }
            case 4: {
                a2.J(JPa.N, JPa.N, wOa.w, pqa.r, pqa.r, pqa.r);
                return;
            }
            case 5: {
                a2.J(JPa.N, JPa.N, JPa.N, rta.o, pqa.r, pqa.r);
                return;
            }
            case 6: {
                a2.J(wOa.w, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockPistonExtension a2 = this;
        a2.l(b2.J((XF)((Object)c2)));
    }

    public BlockPistonExtension() {
        BlockPistonExtension a2;
        BlockPistonExtension blockPistonExtension = a2;
        super(Material.piston);
        blockPistonExtension.J(blockPistonExtension.blockState.J().J(FACING, DZ.NORTH).J(TYPE, BlockPistonExtension$EnumPistonType.DEFAULT).J(SHORT, uSa.E != 0));
        blockPistonExtension.J(soundTypePiston);
        a2.J(MQa.L);
    }

    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockPistonExtension a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, xy xy2, List<xy> list, vL vL2) {
        void a2;
        void b2;
        void c2;
        void e2;
        void f2;
        BlockPistonExtension d2;
        IBlockState g2 = iBlockState;
        BlockPistonExtension blockPistonExtension = d2 = this;
        BlockPistonExtension blockPistonExtension2 = d2;
        blockPistonExtension2.l(g2);
        super.J((Gg)f2, (XF)e2, g2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockPistonExtension.f(g2);
        super.J((Gg)f2, (XF)e2, g2, (xy)c2, (List<xy>)b2, (vL)a2);
        blockPistonExtension.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
    }

    @Override
    public boolean J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockPistonExtension a2 = this;
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockPistonExtension a2 = this;
        if (b2.J((XF)((Object)c2)).J(TYPE) == BlockPistonExtension$EnumPistonType.STICKY) {
            return eAa.J((Block)QFa.bF);
        }
        return eAa.J((Block)QFa.Nc);
    }

    @Override
    public BlockState J() {
        BlockPistonExtension a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = TYPE;
        iPropertyArray[uqa.g] = SHORT;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void a2;
        void c2;
        void d2;
        Object e2 = iBlockState;
        BlockPistonExtension b2 = this;
        e2 = e2.J(FACING);
        IBlockState iBlockState2 = d2.J((XF)((Object)(e2 = c2.offset(((DZ)((Object)e2)).getOpposite()))));
        if (iBlockState2.J() != QFa.Nc && iBlockState2.J() != QFa.bF) {
            d2.G((XF)c2);
            return;
        }
        iBlockState2.J().J((Gg)d2, (XF)((Object)e2), iBlockState2, (Block)a2);
    }

    static {
        TYPE = PropertyEnum.J(Zpa.x, BlockPistonExtension$EnumPistonType.class);
        SHORT = PropertyBool.J(uua.Y);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPistonExtension a2 = this;
        switch (BlockPistonExtension$1.$SwitchMap$net$minecraft$util$EnumFacing[b2.J(FACING).ordinal()]) {
            case 1: {
                a2.J(MRa.K, rta.o, MRa.K, Jpa.y, pqa.r, Jpa.y);
                return;
            }
            case 2: {
                a2.J(MRa.K, JPa.N, MRa.K, Jpa.y, wOa.w, Jpa.y);
                return;
            }
            case 3: {
                a2.J(rta.o, MRa.K, rta.o, wOa.w, Jpa.y, pqa.r);
                return;
            }
            case 4: {
                a2.J(rta.o, MRa.K, JPa.N, wOa.w, Jpa.y, wOa.w);
                return;
            }
            case 5: {
                a2.J(MRa.K, rta.o, rta.o, Jpa.y, wOa.w, pqa.r);
                return;
            }
            case 6: {
                a2.J(JPa.N, MRa.K, rta.o, wOa.w, Jpa.y, wOa.w);
                return;
            }
        }
    }

    public static DZ J(int n2) {
        int n3 = n2;
        int a2 = n3 & XTa.W;
        if (a2 > tTa.h) {
            return null;
        }
        return DZ.getFront(a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        void c2;
        void d2;
        Block block;
        void b2;
        Object e2;
        void a2;
        BlockPistonExtension blockPistonExtension = this;
        if (a2.h.f() && (e2 = b2.J(FACING)) != null && ((block = d2.J((XF)((Object)(e2 = c2.offset(((DZ)((Object)e2)).getOpposite())))).J()) == QFa.Nc || block == QFa.bF)) {
            d2.G((XF)((Object)e2));
        }
        super.J((Gg)d2, (XF)c2, (IBlockState)b2, (Sx)a2);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockPistonExtension a2 = this;
        return uSa.E;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPistonExtension a2 = this;
        return a2.J().J(FACING, BlockPistonExtension.J(b2)).J(TYPE, (b2 & Yqa.i) > 0 ? BlockPistonExtension$EnumPistonType.STICKY : BlockPistonExtension$EnumPistonType.DEFAULT);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        XF b2;
        void c2;
        Object d2 = iBlockState;
        BlockPistonExtension a2 = this;
        super.l((Gg)c2, b2, (IBlockState)d2);
        d2 = d2.J(FACING).getOpposite();
        b2 = b2.offset((DZ)((Object)d2));
        d2 = c2.J(b2);
        if ((d2.J() == QFa.Nc || d2.J() == QFa.bF) && d2.J(BlockPistonBase.EXTENDED).booleanValue()) {
            void v0 = c2;
            d2.J().J((Gg)v0, b2, (IBlockState)d2, uSa.E);
            v0.G(b2);
        }
    }

    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockPistonExtension a2 = this;
        return vRa.d != 0;
    }
}

