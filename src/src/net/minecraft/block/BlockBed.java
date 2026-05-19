/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Gg
 *  I
 *  JPa
 *  Jy
 *  NTa
 *  Ssa
 *  eAa
 *  ez
 *  ld
 *  lqa
 *  pqa
 *  ufa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockBed
extends BlockDirectional {
    public static final PropertyBool OCCUPIED;
    public static final PropertyEnum<BlockBed$EnumPartType> PART;

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockBed blockBed = this;
        int b2 = uSa.E;
        b2 |= a2.J(FACING).getHorizontalIndex();
        if (a2.J(PART) == BlockBed$EnumPartType.HEAD) {
            b2 |= Yqa.i;
            if (a2.J(OCCUPIED).booleanValue()) {
                b2 |= AQa.P;
            }
        }
        return b2;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public BlockState J() {
        BlockBed a2;
        IProperty[] iPropertyArray = new IProperty[yRa.d];
        iPropertyArray[uSa.E] = FACING;
        iPropertyArray[vRa.d] = PART;
        iPropertyArray[uqa.g] = OCCUPIED;
        return new BlockState(a2, iPropertyArray);
    }

    public BlockBed() {
        BlockBed a2;
        BlockBed blockBed = a2;
        super(Material.cloth);
        blockBed.J(blockBed.blockState.J().J(PART, BlockBed$EnumPartType.FOOT).J(OCCUPIED, uSa.E != 0));
        blockBed.l();
    }

    public static boolean l(Gg gg2, XF xF) {
        Gg a2 = gg2;
        Object b2 = xF;
        if (Gg.J((I)a2, (XF)b2.down()) && !a2.J((XF)((Object)b2)).J().J().i() && !a2.J(b2.up()).J().J().i()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int l() {
        return vRa.d;
    }

    static {
        PART = PropertyEnum.J(Ssa.x, BlockBed$EnumPartType.class);
        OCCUPIED = PropertyBool.J(rRa.E);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        IBlockState d2 = iBlockState;
        BlockBed c2 = this;
        if (d2.J(PART) == BlockBed$EnumPartType.HEAD) {
            return null;
        }
        return Gea.QC;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void d2;
        void b2;
        XF e2 = xF;
        BlockBed c2 = this;
        DZ a2 = b2.J(FACING);
        if (b2.J(PART) == BlockBed$EnumPartType.HEAD) {
            if (d2.J(e2.offset(a2.getOpposite())).J() != c2) {
                d2.G(e2);
                return;
            }
        } else if (d2.J(e2.offset(a2)).J() != c2) {
            void v0 = d2;
            v0.G(e2);
            if (!v0.e) {
                c2.J((Gg)d2, e2, (IBlockState)b2, uSa.E);
            }
        }
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Sx J(Gg gg2, XF xF) {
        Gg c2 = gg2;
        BlockBed b2 = this;
        for (Sx sx2 : c2.w) {
            void a2;
            if (!sx2.p() || !sx2.z.equals(a2)) continue;
            return sx2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        Object d2;
        IBlockState f5;
        void h2;
        Object i2 = xF;
        BlockBed g2 = this;
        if (h2.e) {
            return vRa.d != 0;
        }
        if (f5.J(PART) != BlockBed$EnumPartType.HEAD && (f5 = h2.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset(f5.J(FACING)))))).J() != g2) {
            return vRa.d != 0;
        }
        if (h2.F.l() && h2.J((XF)((Object)i2)) != Jy.B) {
            void e2;
            if (f5.J(OCCUPIED).booleanValue()) {
                d2 = g2.J((Gg)h2, (XF)((Object)i2));
                if (d2 != null) {
                    e2.f((ld)new CZ(lqa.S, new Object[uSa.E]));
                    return vRa.d != 0;
                }
                f5 = f5.J(OCCUPIED, uSa.E != 0);
                h2.J((XF)((Object)i2), f5, AQa.P);
            }
            if ((d2 = e2.J((XF)((Object)i2))) == ufa.OK) {
                f5 = f5.J(OCCUPIED, vRa.d != 0);
                h2.J((XF)((Object)i2), f5, AQa.P);
                return vRa.d != 0;
            }
            if (d2 == ufa.NOT_POSSIBLE_NOW) {
                e2.f((ld)new CZ(zua.ca, new Object[uSa.E]));
            } else if (d2 == ufa.NOT_SAFE) {
                e2.f((ld)new CZ(Mqa.U, new Object[uSa.E]));
            }
            return vRa.d != 0;
        }
        h2.G((XF)((Object)i2));
        d2 = ((XF)((Object)i2)).offset(f5.J(FACING).getOpposite());
        if (h2.J(d2).J() == g2) {
            h2.G(d2);
        }
        h2.J((vL)null, (double)i2.getX() + kTa.B, (double)i2.getY() + kTa.B, (double)i2.getZ() + kTa.B, eua.C, vRa.d != 0, vRa.d != 0);
        return vRa.d != 0;
    }

    @Override
    public void J(I i2, XF xF) {
        Object c2 = xF;
        BlockBed a2 = this;
        a2.l();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, float f2, int n2) {
        IBlockState f3 = iBlockState;
        BlockBed c2 = this;
        if (f3.J(PART) == BlockBed$EnumPartType.FOOT) {
            void b2;
            void d2;
            void e2;
            super.J((Gg)e2, (XF)d2, f3, (float)b2, uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(int n2) {
        void a2;
        BlockBed blockBed = this;
        Object b2 = DZ.getHorizontal((int)a2);
        if ((a2 & Yqa.i) > 0) {
            return blockBed.J().J(PART, BlockBed$EnumPartType.HEAD).J(FACING, b2).J(OCCUPIED, ((a2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0);
        }
        return blockBed.J().J(PART, BlockBed$EnumPartType.FOOT).J(FACING, b2);
    }

    @Override
    public eAa J(Gg gg2, XF xF) {
        Object c2 = xF;
        BlockBed a2 = this;
        return Gea.QC;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2) {
        void d2;
        void b2;
        void a2;
        Object e2 = xF;
        BlockBed c2 = this;
        if (a2.h.f() && b2.J(PART) == BlockBed$EnumPartType.HEAD && d2.J((XF)((Object)(e2 = ((XF)((Object)e2)).offset(b2.J(FACING).getOpposite())))).J() == c2) {
            d2.G((XF)((Object)e2));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF) {
        void a2;
        IBlockState b2;
        Object d2 = iBlockState;
        BlockBed c2 = this;
        if (d2.J(PART) == BlockBed$EnumPartType.FOOT && (b2 = b2.J(a2.offset(d2.J(FACING)))).J() == c2) {
            d2 = d2.J(OCCUPIED, b2.J(OCCUPIED));
        }
        return d2;
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    public static XF J(Gg gg2, XF xF, int n2) {
        int n3;
        void b22;
        Gg gg3 = gg2;
        DZ dZ2 = gg3.J((XF)b22).J(FACING);
        void v0 = b22;
        int b22 = v0.getX();
        int n4 = v0.getY();
        int n5 = v0.getZ();
        int n6 = n3 = uSa.E;
        while (n6 <= vRa.d) {
            int c2 = b22 - dZ2.getFrontOffsetX() * n3 - vRa.d;
            int n7 = n5 - dZ2.getFrontOffsetZ() * n3 - vRa.d;
            int n8 = c2 + uqa.g;
            int n9 = n7 + uqa.g;
            int n10 = c2 = c2;
            while (n10 <= n8) {
                int n11 = n7;
                while (n11 <= n9) {
                    int n12;
                    XF xF2 = new XF(c2, n4, n12);
                    if (BlockBed.l(gg3, xF2)) {
                        void a2;
                        if (a2 <= 0) {
                            return xF2;
                        }
                        --a2;
                    }
                    n11 = ++n12;
                }
                n10 = ++c2;
            }
            n6 = ++n3;
        }
        return null;
    }

    private void l() {
        BlockBed a2;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, NTa.c, pqa.r);
    }
}

