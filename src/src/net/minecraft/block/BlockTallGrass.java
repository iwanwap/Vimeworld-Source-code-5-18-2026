/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  JX
 *  MQa
 *  Mda
 *  QFa
 *  Tz
 *  Wsa
 *  Zpa
 *  eAa
 *  pua
 *  uY
 *  vRa
 *  wi
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$1;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockTallGrass
extends BlockBush
implements IGrowable {
    public static final PropertyEnum<BlockTallGrass$EnumType> TYPE = PropertyEnum.J(Zpa.x, BlockTallGrass$EnumType.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(Gg gg2, XF xF2) {
        void a2;
        Object c2 = gg2;
        BlockTallGrass b2 = this;
        c2 = c2.J((XF)a2);
        return c2.J().f((IBlockState)c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(int n2, Random random) {
        void b2;
        Random c2 = random;
        BlockTallGrass a2 = this;
        return vRa.d + c2.nextInt((int)(b2 * uqa.g + vRa.d));
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
        BlockTallGrass d2 = this;
        if (!e2.e && f2.f() != null && f2.f().J() == Gea.ja) {
            f2.J(Tz.a[Block.J(d2)]);
            BlockTallGrass.J((Gg)e2, (XF)c2, new Mda((Block)QFa.y, vRa.d, b2.J(TYPE).getMeta()));
            return;
        }
        super.J((Gg)e2, f2, (XF)c2, (IBlockState)b2, (uY)a2);
    }

    @Override
    public int J() {
        return JX.J((double)kTa.B, (double)oua.i);
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        Random d2 = random;
        BlockTallGrass b2 = this;
        if (d2.nextInt(Yqa.i) == 0) {
            return Gea.o;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        yGa d2 = yGa2;
        BlockTallGrass b2 = this;
        int n2 = d2 = vRa.d;
        while (n2 < BlockTallGrass$EnumType.values().length) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }

    @Override
    public BlockState J() {
        BlockTallGrass a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = TYPE;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        XF d2 = xF2;
        BlockTallGrass b2 = this;
        return b2.f(c2.J(d2.down()).J());
    }

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        BlockTallGrass blockTallGrass = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockTallGrass a2 = blockTallGrass;
        return vRa.d != 0;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockTallGrass a2 = this;
        return a2.J().J(TYPE, BlockTallGrass$EnumType.byMetadata(b2));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl) {
        IBlockState e2 = iBlockState;
        BlockTallGrass b2 = this;
        switch (BlockTallGrass$1.$SwitchMap$net$minecraft$block$BlockTallGrass$EnumType[e2.J(TYPE).ordinal()]) {
            case 1: 
            case 2: {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    @Override
    public int J(IBlockState iBlockState) {
        Object b2 = iBlockState;
        BlockTallGrass a2 = this;
        if (b2.J() != a2) {
            return super.J((IBlockState)b2);
        }
        if ((b2 = b2.J(TYPE)) == BlockTallGrass$EnumType.DEAD_BUSH || BlockTallGrass$EnumType.access$000((BlockTallGrass$EnumType)((Object)b2)) > uqa.g) {
            return Wsa.K;
        }
        return wi.J((int)JX.J((double)kTa.B, (double)oua.i));
    }

    @Override
    public boolean f(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockTallGrass a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void c2;
        Object d2 = xF2;
        BlockTallGrass b2 = this;
        IBlockState a2 = c2.J((XF)((Object)d2));
        if (a2.J() == QFa.y && BlockTallGrass$EnumType.access$000(a2.J(TYPE)) > uqa.g) {
            return pua.o;
        }
        return wi.J((int)c2.J((XF)((Object)d2)).f((XF)((Object)d2)));
    }

    @Override
    public Block$EnumOffsetType J() {
        return Block$EnumOffsetType.XYZ;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockTallGrass a2 = this;
        return b2.J(TYPE).getMeta();
    }

    public BlockTallGrass() {
        BlockTallGrass blockTallGrass;
        BlockTallGrass blockTallGrass2 = blockTallGrass = this;
        super(Material.vine);
        blockTallGrass2.J(blockTallGrass2.blockState.J().J(TYPE, BlockTallGrass$EnumType.DEAD_BUSH));
        float a2 = Xpa.R;
        blockTallGrass2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, xSa.la, MQa.L + a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        void b2;
        void d2;
        void a2;
        Object e2 = random;
        BlockTallGrass c2 = this;
        e2 = BlockDoublePlant$EnumPlantType.GRASS;
        if (a2.J(TYPE) == BlockTallGrass$EnumType.FERN) {
            e2 = BlockDoublePlant$EnumPlantType.FERN;
        }
        if (QFa.Ia.J((Gg)d2, (XF)b2)) {
            QFa.Ia.J((Gg)d2, (XF)b2, (BlockDoublePlant$EnumPlantType)((Object)e2), uqa.g);
        }
    }
}

