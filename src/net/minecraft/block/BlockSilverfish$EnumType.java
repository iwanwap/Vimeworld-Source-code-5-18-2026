/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  JPa
 *  Pb
 *  QSa
 *  WQa
 *  Wsa
 *  fpa
 *  hqa
 *  pPa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockSilverfish$1;
import net.minecraft.block.BlockSilverfish$EnumType$1;
import net.minecraft.block.BlockSilverfish$EnumType$2;
import net.minecraft.block.BlockSilverfish$EnumType$3;
import net.minecraft.block.BlockSilverfish$EnumType$4;
import net.minecraft.block.BlockSilverfish$EnumType$5;
import net.minecraft.block.BlockSilverfish$EnumType$6;
import net.minecraft.block.state.IBlockState;

public abstract class BlockSilverfish$EnumType
extends Enum<BlockSilverfish$EnumType>
implements Pb {
    public static final /* enum */ BlockSilverfish$EnumType COBBLESTONE;
    public static final /* enum */ BlockSilverfish$EnumType STONE;
    public static final /* enum */ BlockSilverfish$EnumType CHISELED_STONEBRICK;
    private static final /* synthetic */ BlockSilverfish$EnumType[] $VALUES;
    public static final /* enum */ BlockSilverfish$EnumType CRACKED_STONEBRICK;
    private final String name;
    public static final /* enum */ BlockSilverfish$EnumType STONEBRICK;
    private static final BlockSilverfish$EnumType[] META_LOOKUP;
    private final String unlocalizedName;
    public static final /* enum */ BlockSilverfish$EnumType MOSSY_STONEBRICK;
    private final int meta;

    public String getName() {
        BlockSilverfish$EnumType a2;
        return a2.name;
    }

    static {
        int n2;
        STONE = new BlockSilverfish$EnumType$1(uSa.E, fpa.F);
        COBBLESTONE = new BlockSilverfish$EnumType$2(vRa.d, ATa.ga, Epa.L);
        STONEBRICK = new BlockSilverfish$EnumType$3(uqa.g, vua.j, Wsa.f);
        MOSSY_STONEBRICK = new BlockSilverfish$EnumType$4(yRa.d, ypa.A, JPa.K);
        CRACKED_STONEBRICK = new BlockSilverfish$EnumType$5(AQa.P, QSa.O, WQa.i);
        CHISELED_STONEBRICK = new BlockSilverfish$EnumType$6(tTa.h, hqa.ia, pPa.ha);
        BlockSilverfish$EnumType[] blockSilverfish$EnumTypeArray = new BlockSilverfish$EnumType[uua.p];
        blockSilverfish$EnumTypeArray[uSa.E] = STONE;
        blockSilverfish$EnumTypeArray[vRa.d] = COBBLESTONE;
        blockSilverfish$EnumTypeArray[uqa.g] = STONEBRICK;
        blockSilverfish$EnumTypeArray[yRa.d] = MOSSY_STONEBRICK;
        blockSilverfish$EnumTypeArray[AQa.P] = CRACKED_STONEBRICK;
        blockSilverfish$EnumTypeArray[tTa.h] = CHISELED_STONEBRICK;
        $VALUES = blockSilverfish$EnumTypeArray;
        META_LOOKUP = new BlockSilverfish$EnumType[BlockSilverfish$EnumType.values().length];
        BlockSilverfish$EnumType[] blockSilverfish$EnumTypeArray2 = BlockSilverfish$EnumType.values();
        int n3 = blockSilverfish$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockSilverfish$EnumType blockSilverfish$EnumType;
            BlockSilverfish$EnumType.META_LOOKUP[blockSilverfish$EnumType.getMetadata()] = blockSilverfish$EnumType = blockSilverfish$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ BlockSilverfish$EnumType(String string, int n2, int n3, String string2, String string3, BlockSilverfish.1 var6_6) {
        Object g2;
        void c2;
        void d2;
        void e2;
        void f2;
        BlockSilverfish$EnumType blockSilverfish$EnumType = object;
        Object object = string3;
        BlockSilverfish$EnumType b2 = blockSilverfish$EnumType;
        b2((int)d2, (String)c2, (String)g2);
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ BlockSilverfish$EnumType(String string, int n2, int n3, String string2, BlockSilverfish.1 var5_5) {
        Object f2;
        void c2;
        void d2;
        void e2;
        BlockSilverfish$EnumType blockSilverfish$EnumType = object;
        Object object = string2;
        BlockSilverfish$EnumType b2 = blockSilverfish$EnumType;
        b2((int)c2, (String)f2);
    }

    /*
     * WARNING - void declaration
     */
    private BlockSilverfish$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockSilverfish$EnumType a2;
        BlockSilverfish$EnumType blockSilverfish$EnumType = object;
        Object object = string3;
        BlockSilverfish$EnumType blockSilverfish$EnumType2 = a2 = blockSilverfish$EnumType;
        a2.meta = c2;
        blockSilverfish$EnumType2.name = b2;
        blockSilverfish$EnumType2.unlocalizedName = d2;
    }

    public int getMetadata() {
        BlockSilverfish$EnumType a2;
        return a2.meta;
    }

    public static BlockSilverfish$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public abstract IBlockState getModelBlock();

    public static BlockSilverfish$EnumType forModelBlock(IBlockState iBlockState) {
        int a2;
        IBlockState iBlockState2 = iBlockState;
        BlockSilverfish$EnumType[] blockSilverfish$EnumTypeArray = BlockSilverfish$EnumType.values();
        int n2 = blockSilverfish$EnumTypeArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            BlockSilverfish$EnumType blockSilverfish$EnumType = blockSilverfish$EnumTypeArray[a2];
            if (iBlockState2 == blockSilverfish$EnumType.getModelBlock()) {
                return blockSilverfish$EnumType;
            }
            n3 = ++a2;
        }
        return STONE;
    }

    public static BlockSilverfish$EnumType[] values() {
        return (BlockSilverfish$EnumType[])$VALUES.clone();
    }

    public String getUnlocalizedName() {
        BlockSilverfish$EnumType a2;
        return a2.unlocalizedName;
    }

    public String toString() {
        BlockSilverfish$EnumType a2;
        return a2.name;
    }

    public static BlockSilverfish$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockSilverfish$EnumType.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private BlockSilverfish$EnumType(int n3, String string2) {
        void b2;
        Object c2;
        BlockSilverfish$EnumType blockSilverfish$EnumType = object;
        Object object = string2;
        BlockSilverfish$EnumType a2 = blockSilverfish$EnumType;
        Object object2 = c2;
        a2((int)b2, (String)object2, (String)object2);
    }
}

