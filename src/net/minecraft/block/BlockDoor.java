/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ey
 *  Fpa
 *  Gg
 *  I
 *  JPa
 *  Lz
 *  QFa
 *  Spa
 *  XTa
 *  eAa
 *  ez
 *  kta
 *  pqa
 *  uRa
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor$EnumDoorHalf;
import net.minecraft.block.BlockDoor$EnumHingePosition;
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
public final class BlockDoor
extends Block {
    public static final PropertyBool OPEN;
    public static final PropertyEnum<BlockDoor$EnumDoorHalf> HALF;
    public static final PropertyEnum<BlockDoor$EnumHingePosition> HINGE;
    public static final PropertyBool POWERED;
    public static final PropertyDirection FACING;

    /*
     * WARNING - void declaration
     */
    @Override
    public RY J(Gg gg2, XF xF2, Lz lz2, Lz lz3) {
        void a2;
        void b2;
        void d2;
        BlockDoor c2;
        Object e2 = xF2;
        BlockDoor blockDoor = c2 = this;
        blockDoor.J((I)d2, (XF)((Object)e2));
        return super.J((Gg)d2, (XF)((Object)e2), (Lz)b2, (Lz)a2);
    }

    @Override
    public BlockState J() {
        BlockDoor a2;
        IProperty[] iPropertyArray = new IProperty[tTa.h];
        iPropertyArray[uSa.E] = HALF;
        iPropertyArray[vRa.d] = FACING;
        iPropertyArray[uqa.g] = OPEN;
        iPropertyArray[yRa.d] = HINGE;
        iPropertyArray[AQa.P] = POWERED;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockDoor a2 = this;
        return BlockDoor.l(BlockDoor.l((I)b2, (XF)((Object)c2)));
    }

    public static DZ J(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        return BlockDoor.J(BlockDoor.l(a2, (XF)((Object)b2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void c2;
        BlockDoor b2;
        Object d2 = xF2;
        BlockDoor blockDoor = b2 = this;
        blockDoor.J((I)c2, (XF)((Object)d2));
        return super.J((Gg)c2, (XF)((Object)d2), (IBlockState)a2);
    }

    static {
        FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);
        OPEN = PropertyBool.J(xua.Ga);
        HINGE = PropertyEnum.J(Spa.w, BlockDoor$EnumHingePosition.class);
        POWERED = PropertyBool.J(uRa.M);
        HALF = PropertyEnum.J(Fpa.H, BlockDoor$EnumDoorHalf.class);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        BlockDoor a2;
        Object c2 = xF2;
        BlockDoor blockDoor = a2 = this;
        blockDoor.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockDoor a2 = this;
        return a2.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockDoor blockDoor = this;
        int b2 = uSa.E;
        if (a2.J(HALF) == BlockDoor$EnumDoorHalf.UPPER) {
            b2 |= Yqa.i;
            if (a2.J(HINGE) == BlockDoor$EnumHingePosition.RIGHT) {
                b2 |= vRa.d;
            }
            if (a2.J(POWERED).booleanValue()) {
                return b2 |= uqa.g;
            }
        } else {
            b2 |= a2.J(FACING).rotateY().getHorizontalIndex();
            if (a2.J(OPEN).booleanValue()) {
                b2 |= AQa.P;
            }
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockDoor a2 = this;
        if (c2.getY() >= osa.Ja) {
            return uSa.E != 0;
        }
        if (Gg.J((I)b2, (XF)c2.down()) && super.J((Gg)b2, c2) && super.J((Gg)b2, c2.up())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        IBlockState d2 = iBlockState;
        BlockDoor c2 = this;
        if (d2.J(HALF) == BlockDoor$EnumDoorHalf.UPPER) {
            return null;
        }
        return c2.J();
    }

    private eAa J() {
        BlockDoor a2;
        if (a2 == QFa.oC) {
            return Gea.fd;
        }
        if (a2 == QFa.UB) {
            return Gea.YC;
        }
        if (a2 == QFa.Ed) {
            return Gea.xc;
        }
        if (a2 == QFa.T) {
            return Gea.hA;
        }
        if (a2 == QFa.Na) {
            return Gea.zA;
        }
        if (a2 == QFa.QB) {
            return Gea.VA;
        }
        if (a2 == QFa.vA) {
            return Gea.CB;
        }
        if (a2 == QFa.Mc) {
            return Gea.Lc;
        }
        if (a2 == QFa.hA) {
            return Gea.p;
        }
        if (a2 == QFa.oc) {
            return Gea.HB;
        }
        if (a2 == QFa.PB) {
            return Gea.R;
        }
        if (a2 == QFa.Db) {
            return Gea.va;
        }
        return Gea.YC;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        void d2;
        void b2;
        void a2;
        Object e2 = xF2;
        BlockDoor c2 = this;
        e2 = ((XF)((Object)e2)).down();
        if (a2.h.f() && b2.J(HALF) == BlockDoor$EnumDoorHalf.UPPER && d2.J((XF)((Object)e2)).J() == c2) {
            d2.G((XF)((Object)e2));
        }
    }

    public static boolean l(int a2) {
        if ((a2 & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean f(int a2) {
        if ((a2 & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockDoor a2 = this;
        a2.J(BlockDoor.l((I)b2, (XF)((Object)c2)));
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    public static int J(int a2) {
        return a2 & XTa.W;
    }

    public static boolean f(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        return BlockDoor.l(BlockDoor.l(a2, (XF)((Object)b2)));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, boolean bl) {
        void c2;
        XF d2 = xF2;
        BlockDoor b2 = this;
        IBlockState iBlockState = c2.J(d2);
        if (iBlockState.J() == b2) {
            void a2;
            IBlockState iBlockState2;
            Object object = iBlockState.J(HALF) == BlockDoor$EnumDoorHalf.LOWER ? d2 : d2.down();
            IBlockState iBlockState3 = iBlockState2 = d2 == object ? iBlockState : c2.J((XF)((Object)object));
            if (iBlockState2.J() == b2 && iBlockState2.J(OPEN).booleanValue() != a2) {
                XF xF3;
                int n2;
                void v1 = c2;
                c2.J((XF)((Object)object), iBlockState2.J(OPEN, (boolean)a2), uqa.g);
                v1.J((XF)((Object)object), d2);
                Sx sx2 = null;
                if (a2 != false) {
                    n2 = Ira.m;
                    xF3 = d2;
                } else {
                    n2 = Spa.f;
                    xF3 = d2;
                }
                v1.J(sx2, n2, xF3, uSa.E);
            }
        }
    }

    @Override
    public String f() {
        BlockDoor a2;
        return Ey.f((String)new StringBuilder().insert(2 & 5, a2.J()).append(tpa.N).toString().replaceAll(sra.F, xua.Aa));
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        Object d2;
        void a2;
        void b2;
        IBlockState c2;
        BlockDoor blockDoor = this;
        if (c2.J(HALF) == BlockDoor$EnumDoorHalf.LOWER) {
            d2 = b2.J(a2.up());
            if (d2.J() == blockDoor) {
                c2 = c2.J(HINGE, d2.J(HINGE)).J(POWERED, d2.J(POWERED));
            }
        } else {
            d2 = b2.J(a2.down());
            if (d2.J() == blockDoor) {
                c2 = c2.J(FACING, d2.J(FACING)).J(OPEN, d2.J(OPEN));
            }
        }
        return c2;
    }

    private void J(int n2) {
        boolean a2;
        BlockDoor blockDoor = this;
        float b2 = sqa.Z;
        blockDoor.J(JPa.N, JPa.N, JPa.N, pqa.r, kta.v, pqa.r);
        DZ dZ2 = BlockDoor.J(a2 ? 1 : 0);
        boolean bl = BlockDoor.l(a2 ? 1 : 0);
        a2 = BlockDoor.f(a2 ? 1 : 0);
        if (bl) {
            if (dZ2 == DZ.EAST) {
                if (!a2) {
                    blockDoor.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, b2);
                    return;
                }
                blockDoor.J(JPa.N, JPa.N, pqa.r - b2, pqa.r, pqa.r, pqa.r);
                return;
            }
            if (dZ2 == DZ.SOUTH) {
                BlockDoor blockDoor2 = blockDoor;
                if (!a2) {
                    blockDoor2.J(pqa.r - b2, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                    return;
                }
                blockDoor2.J(JPa.N, JPa.N, JPa.N, b2, pqa.r, pqa.r);
                return;
            }
            if (dZ2 == DZ.WEST) {
                BlockDoor blockDoor3 = blockDoor;
                if (!a2) {
                    blockDoor3.J(JPa.N, JPa.N, pqa.r - b2, pqa.r, pqa.r, pqa.r);
                    return;
                }
                blockDoor3.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, b2);
                return;
            }
            if (dZ2 == DZ.NORTH) {
                BlockDoor blockDoor4 = blockDoor;
                if (!a2) {
                    blockDoor4.J(JPa.N, JPa.N, JPa.N, b2, pqa.r, pqa.r);
                    return;
                }
                blockDoor4.J(pqa.r - b2, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
        } else {
            if (dZ2 == DZ.EAST) {
                blockDoor.J(JPa.N, JPa.N, JPa.N, b2, pqa.r, pqa.r);
                return;
            }
            if (dZ2 == DZ.SOUTH) {
                blockDoor.J(JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, b2);
                return;
            }
            if (dZ2 == DZ.WEST) {
                blockDoor.J(pqa.r - b2, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r);
                return;
            }
            if (dZ2 == DZ.NORTH) {
                blockDoor.J(JPa.N, JPa.N, pqa.r - b2, pqa.r, pqa.r, pqa.r);
            }
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockDoor a2 = this;
        if ((b2 & Yqa.i) > 0) {
            return a2.J().J(HALF, BlockDoor$EnumDoorHalf.UPPER).J(HINGE, (b2 & vRa.d) > 0 ? BlockDoor$EnumHingePosition.RIGHT : BlockDoor$EnumHingePosition.LEFT).J(POWERED, ((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0);
        }
        return a2.J().J(HALF, BlockDoor$EnumDoorHalf.LOWER).J(FACING, DZ.getHorizontal(b2 & yRa.d).rotateYCCW()).J(OPEN, ((b2 & AQa.P) > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public int l() {
        return vRa.d;
    }

    public static int l(I i2, XF xF2) {
        I a2;
        Object b22 = xF2;
        I i3 = a2 = i2;
        IBlockState iBlockState = i3.J((XF)((Object)b22));
        int n2 = iBlockState.J().f(iBlockState);
        boolean bl = BlockDoor.J(n2);
        IBlockState iBlockState2 = i3.J(((XF)((Object)b22)).down());
        int n3 = iBlockState2.J().f(iBlockState2);
        int n4 = bl ? n3 : n2;
        b22 = a2.J(((XF)((Object)b22)).up());
        int b22 = b22.J().f((IBlockState)b22);
        n3 = bl ? n2 : b22;
        b22 = (n3 & vRa.d) != 0 ? vRa.d : uSa.E;
        n2 = (n3 & uqa.g) != 0 ? vRa.d : uSa.E;
        return BlockDoor.J(n4) | (bl ? Yqa.i : uSa.E) | (b22 != 0 ? ERa.C : uSa.E) | (n2 != 0 ? fPa.i : uSa.E);
    }

    public static DZ J(int a2) {
        return DZ.getHorizontal(a2 & yRa.d).rotateYCCW();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void e2;
        XF xF3;
        int n2;
        void h2;
        void c2;
        IBlockState f5;
        XF i2 = xF2;
        BlockDoor g2 = this;
        if (g2.blockMaterial == Material.iron) {
            return vRa.d != 0;
        }
        Object d2 = f5.J(HALF) == BlockDoor$EnumDoorHalf.LOWER ? i2 : i2.down();
        IBlockState iBlockState2 = c2 = i2.equals(d2) ? f5 : h2.J((XF)((Object)d2));
        if (c2.J() != g2) {
            return uSa.E != 0;
        }
        f5 = c2.J(OPEN);
        void v1 = h2;
        v1.J((XF)((Object)d2), f5, uqa.g);
        h2.J((XF)((Object)d2), i2);
        if (f5.J(OPEN).booleanValue()) {
            n2 = Ira.m;
            xF3 = i2;
        } else {
            n2 = Spa.f;
            xF3 = i2;
        }
        v1.J((Sx)e2, n2, xF3, uSa.E);
        return vRa.d != 0;
    }

    public static boolean J(int a2) {
        if ((a2 & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void a2;
        void c2;
        void b2;
        BlockDoor e2 = gg2;
        BlockDoor d2 = this;
        if (b2.J(HALF) == BlockDoor$EnumDoorHalf.UPPER) {
            XF xF3 = c2.down();
            IBlockState iBlockState2 = e2.J(xF3);
            if (iBlockState2.J() != d2) {
                e2.G((XF)c2);
                return;
            }
            if (a2 != d2) {
                d2.J((Gg)e2, xF3, iBlockState2, (Block)a2);
                return;
            }
        } else {
            int n2;
            int bl = uSa.E;
            XF xF3 = c2.up();
            IBlockState iBlockState3 = e2.J(xF3);
            if (iBlockState3.J() != d2) {
                e2.G((XF)c2);
                int n3 = vRa.d;
            }
            if (!Gg.J((I)e2, (XF)c2.down())) {
                e2.G((XF)c2);
                n2 = vRa.d;
                if (iBlockState3.J() == d2) {
                    e2.G(xF3);
                }
            }
            if (n2 != 0) {
                if (!((Gg)e2).e) {
                    d2.J((Gg)e2, (XF)c2, (IBlockState)b2, uSa.E);
                    return;
                }
            } else {
                int n4;
                int n5 = n4 = e2.k((XF)c2) || e2.k(xF3) ? vRa.d : uSa.E;
                if ((n4 != 0 || a2.C()) && a2 != d2 && n4 != iBlockState3.J(POWERED)) {
                    e2.J(xF3, iBlockState3.J(POWERED, n4 != 0), uqa.g);
                    if (n4 != b2.J(OPEN)) {
                        void v5;
                        int n6;
                        BlockDoor blockDoor = e2;
                        e2.J((XF)c2, b2.J(OPEN, n4 != 0), uqa.g);
                        void v2 = c2;
                        blockDoor.J((XF)v2, (XF)v2);
                        Sx sx2 = null;
                        if (n4 != 0) {
                            n6 = Ira.m;
                            v5 = c2;
                        } else {
                            n6 = Spa.f;
                            v5 = c2;
                        }
                        blockDoor.J(sx2, n6, (XF)v5, uSa.E);
                    }
                }
            }
        }
    }

    public BlockDoor(Material material) {
        BlockDoor a2;
        Material b2 = material;
        BlockDoor blockDoor = a2 = this;
        super(b2);
        blockDoor.J(blockDoor.blockState.J().J(FACING, DZ.NORTH).J(OPEN, uSa.E != 0).J(HINGE, BlockDoor$EnumHingePosition.LEFT).J(POWERED, uSa.E != 0).J(HALF, BlockDoor$EnumDoorHalf.LOWER));
    }
}

