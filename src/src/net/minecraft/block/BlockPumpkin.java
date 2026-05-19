/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  DDa
 *  Gg
 *  Gl
 *  I
 *  Iea
 *  JPa
 *  JTa
 *  QFa
 *  TQa
 *  Tpa
 *  UZ
 *  aSa
 *  bpa
 *  uQa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPumpkin$1;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.pattern.FactoryBlockPattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockPumpkin
extends BlockDirectional {
    private BlockPattern snowmanBasePattern;
    private BlockPattern snowmanPattern;
    private static final Predicate<IBlockState> field_181085_Q = new BlockPumpkin$1();
    private BlockPattern golemPattern;
    private BlockPattern golemBasePattern;

    public BlockPattern C() {
        BlockPumpkin a2;
        if (a2.snowmanBasePattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = Tpa.E;
            stringArray[vRa.d] = uQa.Y;
            stringArray[uqa.g] = uQa.Y;
            a2.snowmanBasePattern = FactoryBlockPattern.J().J(stringArray).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.mb))).J();
        }
        return a2.snowmanBasePattern;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockPumpkin i2;
        BlockPumpkin blockPumpkin = blockPumpkin2;
        BlockPumpkin blockPumpkin2 = gl2;
        BlockPumpkin a2 = blockPumpkin;
        return a2.J().J(FACING, i2.J().getOpposite());
    }

    private void f(Gg gg2, XF xF2) {
        block9: {
            DDa dDa2;
            int n2;
            BlockPattern$PatternHelper blockPattern$PatternHelper;
            BlockWorldState a2;
            BlockPumpkin b2;
            BlockPumpkin c2;
            block8: {
                Object object;
                int n3;
                c2 = gg2;
                b2 = this;
                blockPattern$PatternHelper = b2.J().J((Gg)c2, (XF)((Object)a2));
                if (blockPattern$PatternHelper == null) break block8;
                int n4 = n3 = uSa.E;
                while (n4 < b2.J().f()) {
                    object = blockPattern$PatternHelper.J(uSa.E, n3, uSa.E);
                    c2.J(object.J(), QFa.HF.J(), uqa.g);
                    n4 = ++n3;
                }
                Iea iea2 = new Iea((Gg)c2);
                object = blockPattern$PatternHelper.J(uSa.E, uqa.g, uSa.E).J();
                Iea iea3 = iea2;
                iea3.f((double)object.getX() + kTa.B, (double)object.getY() + fPa.ca, (double)object.getZ() + kTa.B, JPa.N, JPa.N);
                c2.f((vL)iea3);
                int n5 = uSa.E;
                int n6 = n5;
                while (n6 < sOa.D) {
                    int n7 = 5 >> 2;
                    c2.J(UZ.SNOW_SHOVEL, (double)object.getX() + ((Gg)c2).v.nextDouble(), (double)object.getY() + ((Gg)c2).v.nextDouble() * vqa.c, (double)object.getZ() + ((Gg)c2).v.nextDouble(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    n6 = ++n5;
                }
                int n8 = n5 = uSa.E;
                while (n8 < b2.J().f()) {
                    BlockWorldState blockWorldState = blockPattern$PatternHelper.J(uSa.E, n5, uSa.E);
                    c2.d(blockWorldState.J(), QFa.HF);
                    n8 = ++n5;
                }
                break block9;
            }
            blockPattern$PatternHelper = b2.f().J((Gg)c2, (XF)((Object)a2));
            if (blockPattern$PatternHelper == null) break block9;
            int n9 = n2 = uSa.E;
            while (n9 < b2.f().J()) {
                int n10 = uSa.E;
                while (n10 < b2.f().f()) {
                    int n11;
                    XF xF3 = blockPattern$PatternHelper.J(n2, n11, uSa.E).J();
                    c2.J(xF3, QFa.HF.J(), uqa.g);
                    n10 = ++n11;
                }
                n9 = ++n2;
            }
            XF xF4 = blockPattern$PatternHelper.J(vRa.d, uqa.g, uSa.E).J();
            DDa dDa3 = dDa2 = new DDa((Gg)c2);
            dDa3.k(vRa.d != 0);
            dDa3.f((double)xF4.getX() + kTa.B, (double)xF4.getY() + fPa.ca, (double)xF4.getZ() + kTa.B, JPa.N, JPa.N);
            c2.f((vL)dDa3);
            int n12 = uSa.E;
            int n13 = n12;
            while (n13 < sOa.D) {
                int n14 = --1;
                c2.J(UZ.SNOWBALL, (double)xF4.getX() + ((Gg)c2).v.nextDouble(), (double)xF4.getY() + ((Gg)c2).v.nextDouble() * JTa.Aa, (double)xF4.getZ() + ((Gg)c2).v.nextDouble(), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n13 = ++n12;
            }
            int n15 = n12 = uSa.E;
            while (n15 < b2.f().J()) {
                int n16 = uSa.E;
                while (n16 < b2.f().f()) {
                    int n17;
                    a2 = blockPattern$PatternHelper.J(n12, n17, uSa.E);
                    c2.d(a2.J(), QFa.HF);
                    n16 = ++n17;
                }
                n15 = ++n12;
            }
        }
    }

    public BlockPattern l() {
        BlockPumpkin a2;
        if (a2.golemBasePattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = Cta.f;
            stringArray[vRa.d] = Qpa.t;
            stringArray[uqa.g] = zpa.L;
            a2.golemBasePattern = FactoryBlockPattern.J().J(stringArray).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.eB))).J((char)rQa.i, BlockWorldState.J(BlockStateHelper.J(QFa.HF))).J();
        }
        return a2.golemBasePattern;
    }

    @Override
    public BlockState J() {
        BlockPumpkin a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockPattern f() {
        BlockPumpkin a2;
        if (a2.golemPattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = tpa.n;
            stringArray[vRa.d] = Qpa.t;
            stringArray[uqa.g] = zpa.L;
            a2.golemPattern = FactoryBlockPattern.J().J(stringArray).J((char)bpa.I, BlockWorldState.J(field_181085_Q)).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.eB))).J((char)rQa.i, BlockWorldState.J(BlockStateHelper.J(QFa.HF))).J();
        }
        return a2.golemPattern;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPumpkin a2 = this;
        return a2.J().J(FACING, DZ.getHorizontal(b2));
    }

    public BlockPattern J() {
        BlockPumpkin a2;
        if (a2.snowmanPattern == null) {
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = CRa.D;
            stringArray[vRa.d] = uQa.Y;
            stringArray[uqa.g] = uQa.Y;
            a2.snowmanPattern = FactoryBlockPattern.J().J(stringArray).J((char)bpa.I, BlockWorldState.J(field_181085_Q)).J((char)TQa.ca, BlockWorldState.J(BlockStateHelper.J(QFa.mb))).J();
        }
        return a2.snowmanPattern;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockPumpkin b2;
        Object d2 = xF2;
        BlockPumpkin blockPumpkin = b2 = this;
        super.f((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
        blockPumpkin.f((Gg)c2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockPumpkin a2 = this;
        if (a2.C().J((Gg)b2, (XF)((Object)c2)) != null || a2.l().J((Gg)b2, (XF)((Object)c2)) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockPumpkin a2 = this;
        if (b2.J((XF)c2).J().blockMaterial.d() && Gg.J((I)b2, (XF)c2.down())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPumpkin a2 = this;
        return b2.J(FACING).getHorizontalIndex();
    }

    public BlockPumpkin() {
        BlockPumpkin a2;
        BlockPumpkin blockPumpkin = a2;
        super(Material.gourd, MapColor.adobeColor);
        blockPumpkin.J(blockPumpkin.blockState.J().J(FACING, DZ.NORTH));
        blockPumpkin.J(vRa.d != 0);
        a2.J(yGa.A);
    }
}

