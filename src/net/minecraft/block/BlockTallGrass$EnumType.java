/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  NOa
 *  NTa
 *  Pb
 *  Qqa
 *  XTa
 *  Ypa
 *  Zta
 *  cRa
 *  lqa
 *  pPa
 *  vRa
 */
package net.minecraft.block;

public final class BlockTallGrass$EnumType
extends Enum<BlockTallGrass$EnumType>
implements Pb {
    private static final /* synthetic */ BlockTallGrass$EnumType[] $VALUES;
    public static final /* enum */ BlockTallGrass$EnumType GRAPE;
    public static final /* enum */ BlockTallGrass$EnumType COTTON;
    private final String name;
    private static final BlockTallGrass$EnumType[] META_LOOKUP;
    public static final /* enum */ BlockTallGrass$EnumType STRAWBERRY;
    public static final /* enum */ BlockTallGrass$EnumType RASPBERRY;
    public static final /* enum */ BlockTallGrass$EnumType TOMATO;
    public static final /* enum */ BlockTallGrass$EnumType CORN;
    public static final /* enum */ BlockTallGrass$EnumType DEAD_BUSH;
    public static final /* enum */ BlockTallGrass$EnumType BLACK_CURRANT;
    public static final /* enum */ BlockTallGrass$EnumType FERN;
    public static final /* enum */ BlockTallGrass$EnumType TEALEAF;
    private final int meta;
    public static final /* enum */ BlockTallGrass$EnumType FLAX;
    public static final /* enum */ BlockTallGrass$EnumType ONION;
    public static final /* enum */ BlockTallGrass$EnumType CACAO_BEANS;
    public static final /* enum */ BlockTallGrass$EnumType HOPS;
    public static final /* enum */ BlockTallGrass$EnumType GRASS;

    /*
     * WARNING - void declaration
     */
    private BlockTallGrass$EnumType(int n3, String string2) {
        Object c2;
        void b2;
        BlockTallGrass$EnumType a2;
        BlockTallGrass$EnumType blockTallGrass$EnumType = object;
        Object object = string2;
        BlockTallGrass$EnumType blockTallGrass$EnumType2 = a2 = blockTallGrass$EnumType;
        blockTallGrass$EnumType2.meta = b2;
        blockTallGrass$EnumType2.name = c2;
    }

    public static BlockTallGrass$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockTallGrass$EnumType.class, a2);
    }

    public static BlockTallGrass$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String toString() {
        BlockTallGrass$EnumType a2;
        return a2.name;
    }

    public String getName() {
        BlockTallGrass$EnumType a2;
        return a2.name;
    }

    public int getMeta() {
        BlockTallGrass$EnumType a2;
        return a2.meta;
    }

    public static /* synthetic */ int access$000(BlockTallGrass$EnumType a2) {
        return a2.meta;
    }

    public static BlockTallGrass$EnumType[] values() {
        return (BlockTallGrass$EnumType[])$VALUES.clone();
    }

    static {
        int n2;
        DEAD_BUSH = new BlockTallGrass$EnumType(uSa.E, BRa.o);
        GRASS = new BlockTallGrass$EnumType(vRa.d, Zta.Ha);
        FERN = new BlockTallGrass$EnumType(uqa.g, kua.ga);
        BLACK_CURRANT = new BlockTallGrass$EnumType(yRa.d, eua.o);
        CACAO_BEANS = new BlockTallGrass$EnumType(AQa.P, nqa.y);
        CORN = new BlockTallGrass$EnumType(tTa.h, lQa.M);
        COTTON = new BlockTallGrass$EnumType(uua.p, SPa.Z);
        FLAX = new BlockTallGrass$EnumType(XTa.W, pPa.n);
        GRAPE = new BlockTallGrass$EnumType(Yqa.i, yOa.R);
        HOPS = new BlockTallGrass$EnumType(WOa.fa, cRa.T);
        ONION = new BlockTallGrass$EnumType(NTa.C, Lsa.W);
        RASPBERRY = new BlockTallGrass$EnumType(pPa.f, Qqa.W);
        STRAWBERRY = new BlockTallGrass$EnumType(lqa.s, Ata.k);
        TEALEAF = new BlockTallGrass$EnumType(uua.s, NOa.E);
        TOMATO = new BlockTallGrass$EnumType(hpa.Z, Iqa.Y);
        BlockTallGrass$EnumType[] blockTallGrass$EnumTypeArray = new BlockTallGrass$EnumType[Ypa.A];
        blockTallGrass$EnumTypeArray[uSa.E] = DEAD_BUSH;
        blockTallGrass$EnumTypeArray[vRa.d] = GRASS;
        blockTallGrass$EnumTypeArray[uqa.g] = FERN;
        blockTallGrass$EnumTypeArray[yRa.d] = BLACK_CURRANT;
        blockTallGrass$EnumTypeArray[AQa.P] = CACAO_BEANS;
        blockTallGrass$EnumTypeArray[tTa.h] = CORN;
        blockTallGrass$EnumTypeArray[uua.p] = COTTON;
        blockTallGrass$EnumTypeArray[XTa.W] = FLAX;
        blockTallGrass$EnumTypeArray[Yqa.i] = GRAPE;
        blockTallGrass$EnumTypeArray[WOa.fa] = HOPS;
        blockTallGrass$EnumTypeArray[NTa.C] = ONION;
        blockTallGrass$EnumTypeArray[pPa.f] = RASPBERRY;
        blockTallGrass$EnumTypeArray[lqa.s] = STRAWBERRY;
        blockTallGrass$EnumTypeArray[uua.s] = TEALEAF;
        blockTallGrass$EnumTypeArray[hpa.Z] = TOMATO;
        $VALUES = blockTallGrass$EnumTypeArray;
        META_LOOKUP = new BlockTallGrass$EnumType[BlockTallGrass$EnumType.values().length];
        BlockTallGrass$EnumType[] blockTallGrass$EnumTypeArray2 = BlockTallGrass$EnumType.values();
        int n3 = blockTallGrass$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockTallGrass$EnumType blockTallGrass$EnumType;
            BlockTallGrass$EnumType.META_LOOKUP[blockTallGrass$EnumType.getMeta()] = blockTallGrass$EnumType = blockTallGrass$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }
}

