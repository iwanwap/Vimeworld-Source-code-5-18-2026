/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Pb
 *  SQa
 *  TQa
 *  XTa
 *  ZOa
 *  fTa
 *  jpa
 *  lqa
 *  nQa
 *  pPa
 *  vQa
 *  vRa
 *  wOa
 */
package net.minecraft.block;

import net.minecraft.block.material.MapColor;

public final class BlockPlanks$EnumType
extends Enum<BlockPlanks$EnumType>
implements Pb {
    public static final /* enum */ BlockPlanks$EnumType CRIMSON;
    public static final /* enum */ BlockPlanks$EnumType BIRCH;
    private static final BlockPlanks$EnumType[] META_LOOKUP;
    private final int meta;
    private final String unlocalizedName;
    public static final /* enum */ BlockPlanks$EnumType PALE_OAK;
    public static final /* enum */ BlockPlanks$EnumType CHERRY;
    private final MapColor field_181071_k;
    public static final /* enum */ BlockPlanks$EnumType SPRUCE;
    public static final /* enum */ BlockPlanks$EnumType ACACIA;
    public static final /* enum */ BlockPlanks$EnumType JUNGLE;
    public static final /* enum */ BlockPlanks$EnumType IRON;
    public static final /* enum */ BlockPlanks$EnumType DARK_OAK;
    public static final /* enum */ BlockPlanks$EnumType MANGROVE;
    public static final /* enum */ BlockPlanks$EnumType OAK;
    public static final /* enum */ BlockPlanks$EnumType WARPED;
    private final String name;
    private static final /* synthetic */ BlockPlanks$EnumType[] $VALUES;

    public String getName() {
        BlockPlanks$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockPlanks$EnumType(int n3, String string2, String string3, MapColor mapColor) {
        Object e2;
        void b2;
        void c2;
        void d2;
        BlockPlanks$EnumType a2;
        BlockPlanks$EnumType blockPlanks$EnumType = object;
        Object object = mapColor;
        BlockPlanks$EnumType blockPlanks$EnumType2 = a2 = blockPlanks$EnumType;
        BlockPlanks$EnumType blockPlanks$EnumType3 = a2;
        blockPlanks$EnumType3.meta = d2;
        blockPlanks$EnumType3.name = c2;
        blockPlanks$EnumType2.unlocalizedName = b2;
        blockPlanks$EnumType2.field_181071_k = e2;
    }

    public static BlockPlanks$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockPlanks$EnumType.class, a2);
    }

    public static BlockPlanks$EnumType[] values() {
        return (BlockPlanks$EnumType[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private BlockPlanks$EnumType(int n3, String string2, MapColor mapColor) {
        Object d2;
        void c2;
        void b2;
        BlockPlanks$EnumType blockPlanks$EnumType = object;
        Object object = mapColor;
        BlockPlanks$EnumType a2 = blockPlanks$EnumType;
        void v1 = b2;
        a2((int)c2, (String)v1, (String)v1, (MapColor)d2);
    }

    public static BlockPlanks$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String toString() {
        BlockPlanks$EnumType a2;
        return a2.name;
    }

    public String getUnlocalizedName() {
        BlockPlanks$EnumType a2;
        return a2.unlocalizedName;
    }

    static {
        int n2;
        OAK = new BlockPlanks$EnumType(uSa.E, jpa.j, MapColor.woodColor);
        SPRUCE = new BlockPlanks$EnumType(vRa.d, fTa.N, MapColor.obsidianColor);
        BIRCH = new BlockPlanks$EnumType(uqa.g, vQa.O, MapColor.sandColor);
        JUNGLE = new BlockPlanks$EnumType(yRa.d, nQa.U, MapColor.dirtColor);
        ACACIA = new BlockPlanks$EnumType(AQa.P, LRa.x, MapColor.adobeColor);
        DARK_OAK = new BlockPlanks$EnumType(tTa.h, wOa.S, Fsa.m, MapColor.brownColor);
        CRIMSON = new BlockPlanks$EnumType(uua.p, TQa.v, MapColor.magentaColor);
        WARPED = new BlockPlanks$EnumType(XTa.W, SQa.P, MapColor.cyanColor);
        IRON = new BlockPlanks$EnumType(Yqa.i, mPa.L, MapColor.grayColor);
        MANGROVE = new BlockPlanks$EnumType(WOa.fa, ZOa.C, MapColor.redColor);
        CHERRY = new BlockPlanks$EnumType(NTa.C, TOa.Ia, MapColor.terracottaWhiteColor);
        PALE_OAK = new BlockPlanks$EnumType(pPa.f, csa.E, MapColor.quartzColor);
        BlockPlanks$EnumType[] blockPlanks$EnumTypeArray = new BlockPlanks$EnumType[lqa.s];
        blockPlanks$EnumTypeArray[uSa.E] = OAK;
        blockPlanks$EnumTypeArray[vRa.d] = SPRUCE;
        blockPlanks$EnumTypeArray[uqa.g] = BIRCH;
        blockPlanks$EnumTypeArray[yRa.d] = JUNGLE;
        blockPlanks$EnumTypeArray[AQa.P] = ACACIA;
        blockPlanks$EnumTypeArray[tTa.h] = DARK_OAK;
        blockPlanks$EnumTypeArray[uua.p] = CRIMSON;
        blockPlanks$EnumTypeArray[XTa.W] = WARPED;
        blockPlanks$EnumTypeArray[Yqa.i] = IRON;
        blockPlanks$EnumTypeArray[WOa.fa] = MANGROVE;
        blockPlanks$EnumTypeArray[NTa.C] = CHERRY;
        blockPlanks$EnumTypeArray[pPa.f] = PALE_OAK;
        $VALUES = blockPlanks$EnumTypeArray;
        META_LOOKUP = new BlockPlanks$EnumType[BlockPlanks$EnumType.values().length];
        BlockPlanks$EnumType[] blockPlanks$EnumTypeArray2 = BlockPlanks$EnumType.values();
        int n3 = blockPlanks$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockPlanks$EnumType blockPlanks$EnumType;
            BlockPlanks$EnumType.META_LOOKUP[blockPlanks$EnumType.getMetadata()] = blockPlanks$EnumType = blockPlanks$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public int getMetadata() {
        BlockPlanks$EnumType a2;
        return a2.meta;
    }

    public MapColor func_181070_c() {
        BlockPlanks$EnumType a2;
        return a2.field_181071_k;
    }
}

