/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  Lra
 *  NQa
 *  NTa
 *  Pb
 *  Rua
 *  XTa
 *  YSa
 *  pPa
 *  vRa
 *  vpa
 */
package net.minecraft.block;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType$1;

public final class BlockFlower$EnumFlowerType
extends Enum<BlockFlower$EnumFlowerType>
implements Pb {
    private static final /* synthetic */ BlockFlower$EnumFlowerType[] $VALUES;
    private final int meta;
    public static final /* enum */ BlockFlower$EnumFlowerType OXEYE_DAISY;
    public static final /* enum */ BlockFlower$EnumFlowerType POPPY;
    private static final BlockFlower$EnumFlowerType[][] TYPES_FOR_BLOCK;
    public static final /* enum */ BlockFlower$EnumFlowerType BLUE_ORCHID;
    public static final /* enum */ BlockFlower$EnumFlowerType PINK_TULIP;
    public static final /* enum */ BlockFlower$EnumFlowerType RED_TULIP;
    private final String name;
    public static final /* enum */ BlockFlower$EnumFlowerType DANDELION;
    private final String unlocalizedName;
    public static final /* enum */ BlockFlower$EnumFlowerType WHITE_TULIP;
    public static final /* enum */ BlockFlower$EnumFlowerType ALLIUM;
    private final BlockFlower$EnumFlowerColor blockType;
    public static final /* enum */ BlockFlower$EnumFlowerType ORANGE_TULIP;
    public static final /* enum */ BlockFlower$EnumFlowerType HOUSTONIA;

    public String getUnlocalizedName() {
        BlockFlower$EnumFlowerType a2;
        return a2.unlocalizedName;
    }

    public static BlockFlower$EnumFlowerType[] getTypes(BlockFlower$EnumFlowerColor a2) {
        return TYPES_FOR_BLOCK[a2.ordinal()];
    }

    /*
     * WARNING - void declaration
     */
    private BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n3, String string2, String string3) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockFlower$EnumFlowerType a2;
        BlockFlower$EnumFlowerType blockFlower$EnumFlowerType = object;
        Object object = string3;
        BlockFlower$EnumFlowerType blockFlower$EnumFlowerType2 = a2 = blockFlower$EnumFlowerType;
        BlockFlower$EnumFlowerType blockFlower$EnumFlowerType3 = a2;
        blockFlower$EnumFlowerType3.blockType = d2;
        blockFlower$EnumFlowerType3.meta = c2;
        blockFlower$EnumFlowerType2.name = b2;
        blockFlower$EnumFlowerType2.unlocalizedName = e2;
    }

    public String getName() {
        BlockFlower$EnumFlowerType a2;
        return a2.name;
    }

    public String toString() {
        BlockFlower$EnumFlowerType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n3, String string2) {
        void b2;
        void c2;
        Object d2;
        BlockFlower$EnumFlowerType blockFlower$EnumFlowerType = object;
        Object object = string2;
        BlockFlower$EnumFlowerType a2 = blockFlower$EnumFlowerType;
        Object object2 = d2;
        a2((BlockFlower$EnumFlowerColor)c2, (int)b2, (String)object2, (String)object2);
    }

    public static BlockFlower$EnumFlowerType getType(BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor, int n2) {
        int b2 = n2;
        BlockFlower$EnumFlowerColor a2 = blockFlower$EnumFlowerColor;
        BlockFlower$EnumFlowerType[] blockFlower$EnumFlowerTypeArray = TYPES_FOR_BLOCK[a2.ordinal()];
        if (b2 < 0 || b2 >= blockFlower$EnumFlowerTypeArray.length) {
            b2 = uSa.E;
        }
        return blockFlower$EnumFlowerTypeArray[b2];
    }

    public BlockFlower$EnumFlowerColor getBlockType() {
        BlockFlower$EnumFlowerType a2;
        return a2.blockType;
    }

    static {
        int n2;
        DANDELION = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.YELLOW, uSa.E, Era.M);
        POPPY = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, uSa.E, tTa.Ia);
        BLUE_ORCHID = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, vRa.d, opa.P, Lra.n);
        ALLIUM = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, uqa.g, Rua.D);
        HOUSTONIA = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, yRa.d, vpa.k);
        RED_TULIP = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, AQa.P, FTa.fa, Mqa.h);
        ORANGE_TULIP = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, tTa.h, Ora.x, Yua.n);
        WHITE_TULIP = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, uua.p, pPa.B, YSa.ja);
        PINK_TULIP = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, XTa.W, zta.ja, NQa.N);
        OXEYE_DAISY = new BlockFlower$EnumFlowerType(BlockFlower$EnumFlowerColor.RED, Yqa.i, xTa.X, rta.Ja);
        BlockFlower$EnumFlowerType[] blockFlower$EnumFlowerTypeArray = new BlockFlower$EnumFlowerType[NTa.C];
        blockFlower$EnumFlowerTypeArray[uSa.E] = DANDELION;
        blockFlower$EnumFlowerTypeArray[vRa.d] = POPPY;
        blockFlower$EnumFlowerTypeArray[uqa.g] = BLUE_ORCHID;
        blockFlower$EnumFlowerTypeArray[yRa.d] = ALLIUM;
        blockFlower$EnumFlowerTypeArray[AQa.P] = HOUSTONIA;
        blockFlower$EnumFlowerTypeArray[tTa.h] = RED_TULIP;
        blockFlower$EnumFlowerTypeArray[uua.p] = ORANGE_TULIP;
        blockFlower$EnumFlowerTypeArray[XTa.W] = WHITE_TULIP;
        blockFlower$EnumFlowerTypeArray[Yqa.i] = PINK_TULIP;
        blockFlower$EnumFlowerTypeArray[WOa.fa] = OXEYE_DAISY;
        $VALUES = blockFlower$EnumFlowerTypeArray;
        TYPES_FOR_BLOCK = new BlockFlower$EnumFlowerType[BlockFlower$EnumFlowerColor.values().length][];
        BlockFlower$EnumFlowerColor[] blockFlower$EnumFlowerColorArray = BlockFlower$EnumFlowerColor.values();
        int n3 = blockFlower$EnumFlowerColorArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Collection<BlockFlower$EnumFlowerType> collection;
            BlockFlower$EnumFlowerColor blockFlower$EnumFlowerColor = blockFlower$EnumFlowerColorArray[n2];
            Collection<BlockFlower$EnumFlowerType> collection2 = collection = Collections2.filter(Lists.newArrayList(BlockFlower$EnumFlowerType.values()), new BlockFlower$EnumFlowerType$1(blockFlower$EnumFlowerColor));
            BlockFlower$EnumFlowerType.TYPES_FOR_BLOCK[blockFlower$EnumFlowerColor.ordinal()] = collection2.toArray(new BlockFlower$EnumFlowerType[collection2.size()]);
            n4 = ++n2;
        }
    }

    public static BlockFlower$EnumFlowerType valueOf(String a2) {
        return Enum.valueOf(BlockFlower$EnumFlowerType.class, a2);
    }

    public static BlockFlower$EnumFlowerType[] values() {
        return (BlockFlower$EnumFlowerType[])$VALUES.clone();
    }

    public int getMeta() {
        BlockFlower$EnumFlowerType a2;
        return a2.meta;
    }
}

