/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  Mda
 *  QFa
 *  Sz
 *  Tz
 *  Wsa
 *  Ypa
 *  eAa
 *  ez
 *  hy
 *  kta
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockFlowerPot$1;
import net.minecraft.block.BlockFlowerPot$EnumFlowerType;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockFlowerPot
extends BlockContainer {
    public static final PropertyInteger LEGACY_DATA = PropertyInteger.J(LRa.i, uSa.E, Ypa.A);
    public static final PropertyEnum<BlockFlowerPot$EnumFlowerType> CONTENTS = PropertyEnum.J(STa.l, BlockFlowerPot$EnumFlowerType.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2) {
        void a2;
        void b2;
        void c2;
        BlockFlowerPot e2 = gg2;
        BlockFlowerPot d2 = this;
        super.J((Gg)e2, (XF)c2, (IBlockState)b2, (Sx)a2);
        if (a2.h.f() && (e2 = d2.J((Gg)e2, (XF)c2)) != null) {
            e2.J((eAa)null, uSa.E);
        }
    }

    @Override
    public void f() {
        BlockFlowerPot blockFlowerPot = this;
        float f2 = MRa.K;
        float a2 = f2 / kta.v;
        blockFlowerPot.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, f2, MQa.L + a2);
    }

    @Override
    public boolean H() {
        return vRa.d != 0;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockFlowerPot a2 = this;
        return Gea.mB;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(Gg gg2, XF xF2) {
        void a2;
        BlockFlowerPot c2 = gg2;
        BlockFlowerPot b2 = this;
        if ((c2 = b2.J((Gg)c2, (XF)a2)) != null && c2.J() != null) {
            return c2.J();
        }
        return Gea.mB;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockFlowerPot a2 = this;
        return b2.J(LEGACY_DATA);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public uY J(Gg gg2, int n2) {
        void c2222;
        void a2;
        void var1_17;
        void c2222 = var1_17;
        BlockFlowerPot b2 = this;
        Object c2222 = null;
        int n3 = uSa.E;
        switch (a2) {
            case 1: {
                BlockFlower c2222 = QFa.l;
                n3 = BlockFlower$EnumFlowerType.POPPY.getMeta();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 2: {
                BlockFlower c2222 = QFa.zc;
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 3: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.OAK.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 4: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.SPRUCE.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 5: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.BIRCH.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 6: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.JUNGLE.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 7: {
                BlockBush c2222 = QFa.TC;
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 8: {
                BlockBush c2222 = QFa.vc;
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 9: {
                BlockCactus c2222 = QFa.dd;
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 10: {
                BlockDeadBush c2222 = QFa.BB;
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 11: {
                BlockTallGrass c2222 = QFa.y;
                n3 = BlockTallGrass$EnumType.FERN.getMeta();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 12: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.ACACIA.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
            case 13: {
                Block c2222 = QFa.Y;
                n3 = BlockPlanks$EnumType.DARK_OAK.getMetadata();
                return new Sz(eAa.J((Block)c2222), n3);
            }
        }
        return new Sz(eAa.J((Block)c2222), n3);
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Block block, int n2) {
        Block c2 = block;
        BlockFlowerPot b2 = this;
        if (c2 != QFa.zc && c2 != QFa.l && c2 != QFa.dd && c2 != QFa.vc && c2 != QFa.TC && c2 != QFa.Y && c2 != QFa.BB) {
            void a2;
            if (c2 == QFa.y && a2 == BlockTallGrass$EnumType.FERN.getMeta()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void a2;
        BlockFlowerPot c2 = gg2;
        BlockFlowerPot b2 = this;
        if ((c2 = b2.J((Gg)c2, (XF)a2)) != null && c2.J() != null) {
            return c2.J();
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        BlockFlowerPot blockFlowerPot = this;
        BlockFlowerPot d2 = blockFlowerPot.J((Gg)c2, (XF)b2);
        if (d2 != null && d2.J() != null) {
            BlockFlowerPot.J((Gg)c2, (XF)b2, new Mda(d2.J(), vRa.d, d2.J()));
        }
        super.l((Gg)c2, (XF)b2, (IBlockState)a2);
    }

    @Override
    public String f() {
        return Ey.f((String)sSa.Z);
    }

    /*
     * WARNING - void declaration
     */
    private Sz J(Gg gg2, XF xF2) {
        void a2;
        BlockFlowerPot c2 = gg2;
        BlockFlowerPot b2 = this;
        if ((c2 = c2.J((XF)a2)) instanceof Sz) {
            return (Sz)c2;
        }
        return null;
    }

    @Override
    public BlockState J() {
        BlockFlowerPot a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = CONTENTS;
        iPropertyArray[vRa.d] = LEGACY_DATA;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        BlockFlowerPot a2 = this;
        Object c2 = xF2;
        if (super.J((Gg)b2, (XF)((Object)c2)) && Gg.J((I)b2, (XF)((XF)((Object)c2)).down())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void v0;
        void c2;
        void a22;
        uY b22;
        BlockFlowerPot blockFlowerPot = this;
        BlockFlowerPot$EnumFlowerType d2 = BlockFlowerPot$EnumFlowerType.EMPTY;
        if ((b22 = b22.J((XF)a22)) instanceof Sz && (a22 = (b22 = (Sz)b22).J()) instanceof kda) {
            int b22 = b22.J();
            Block a22 = Block.J(a22);
            if (a22 == QFa.Y) {
                switch (BlockFlowerPot$1.$SwitchMap$net$minecraft$block$BlockPlanks$EnumType[BlockPlanks$EnumType.byMetadata(b22).ordinal()]) {
                    case 1: {
                        d2 = BlockFlowerPot$EnumFlowerType.OAK_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 2: {
                        d2 = BlockFlowerPot$EnumFlowerType.SPRUCE_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 3: {
                        d2 = BlockFlowerPot$EnumFlowerType.BIRCH_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 4: {
                        d2 = BlockFlowerPot$EnumFlowerType.JUNGLE_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 5: {
                        d2 = BlockFlowerPot$EnumFlowerType.ACACIA_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 6: {
                        d2 = BlockFlowerPot$EnumFlowerType.DARK_OAK_SAPLING;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                }
                d2 = BlockFlowerPot$EnumFlowerType.EMPTY;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.y) {
                switch (b22) {
                    case 0: {
                        d2 = BlockFlowerPot$EnumFlowerType.DEAD_BUSH;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 2: {
                        d2 = BlockFlowerPot$EnumFlowerType.FERN;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                }
                d2 = BlockFlowerPot$EnumFlowerType.EMPTY;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.zc) {
                d2 = BlockFlowerPot$EnumFlowerType.DANDELION;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.l) {
                switch (BlockFlowerPot$1.$SwitchMap$net$minecraft$block$BlockFlower$EnumFlowerType[BlockFlower$EnumFlowerType.getType(BlockFlower$EnumFlowerColor.RED, b22).ordinal()]) {
                    case 1: {
                        d2 = BlockFlowerPot$EnumFlowerType.POPPY;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 2: {
                        d2 = BlockFlowerPot$EnumFlowerType.BLUE_ORCHID;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 3: {
                        d2 = BlockFlowerPot$EnumFlowerType.ALLIUM;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 4: {
                        d2 = BlockFlowerPot$EnumFlowerType.HOUSTONIA;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 5: {
                        d2 = BlockFlowerPot$EnumFlowerType.RED_TULIP;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 6: {
                        d2 = BlockFlowerPot$EnumFlowerType.ORANGE_TULIP;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 7: {
                        d2 = BlockFlowerPot$EnumFlowerType.WHITE_TULIP;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 8: {
                        d2 = BlockFlowerPot$EnumFlowerType.PINK_TULIP;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                    case 9: {
                        d2 = BlockFlowerPot$EnumFlowerType.OXEYE_DAISY;
                        v0 = c2;
                        return v0.J(CONTENTS, d2);
                    }
                }
                d2 = BlockFlowerPot$EnumFlowerType.EMPTY;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.TC) {
                d2 = BlockFlowerPot$EnumFlowerType.MUSHROOM_RED;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.vc) {
                d2 = BlockFlowerPot$EnumFlowerType.MUSHROOM_BROWN;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.BB) {
                d2 = BlockFlowerPot$EnumFlowerType.DEAD_BUSH;
                v0 = c2;
                return v0.J(CONTENTS, d2);
            }
            if (a22 == QFa.dd) {
                d2 = BlockFlowerPot$EnumFlowerType.CACTUS;
            }
        }
        v0 = c2;
        return v0.J(CONTENTS, d2);
    }

    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void b2;
        void c2;
        BlockFlowerPot blockFlowerPot = this;
        BlockFlowerPot d2 = c2.J((XF)b2);
        if (d2 instanceof Sz && (d2 = ((Sz)d2).J()) instanceof kda) {
            void a2;
            return Block.J((eAa)d2).J((I)c2, (XF)b2, (int)a2);
        }
        return Wsa.K;
    }

    public BlockFlowerPot() {
        BlockFlowerPot a2;
        BlockFlowerPot blockFlowerPot = a2;
        super(Material.circuits);
        blockFlowerPot.J(blockFlowerPot.blockState.J().J(CONTENTS, BlockFlowerPot$EnumFlowerType.EMPTY).J(LEGACY_DATA, uSa.E));
        blockFlowerPot.f();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void e2;
        Object i2 = iBlockState;
        BlockFlowerPot f5 = this;
        i2 = e2.K.f();
        if (i2 != null && i2.J() instanceof kda) {
            void g2;
            void h2;
            Sz d2 = f5.J((Gg)h2, (XF)g2);
            if (d2 == null) {
                return uSa.E != 0;
            }
            if (d2.J() != null) {
                return uSa.E != 0;
            }
            Block c2 = Block.J(i2.J());
            if (!f5.J(c2, i2.J())) {
                return uSa.E != 0;
            }
            Sz sz2 = d2;
            sz2.J(i2.J(), i2.J());
            sz2.f();
            void v1 = e2;
            h2.C((XF)g2);
            v1.J(Tz.M);
            if (!v1.h.f() && (((Mda)i2).E -= vRa.d) <= 0) {
                void v2 = e2;
                v2.K.J(v2.K.J, (Mda)null);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void d2;
        XF e2 = xF2;
        BlockFlowerPot c2 = this;
        if (!Gg.J((I)d2, (XF)e2.down())) {
            void b2;
            void v0 = d2;
            c2.J((Gg)v0, e2, (IBlockState)b2, uSa.E);
            v0.G(e2);
        }
    }
}

