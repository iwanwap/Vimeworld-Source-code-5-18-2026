/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  SRa
 *  WSa
 *  vRa
 */
package net.minecraft.block;

public final class BlockRedSandstone$EnumType
extends Enum<BlockRedSandstone$EnumType>
implements Pb {
    public static final /* enum */ BlockRedSandstone$EnumType CHISELED;
    private final int meta;
    private final String name;
    public static final /* enum */ BlockRedSandstone$EnumType SMOOTH;
    public static final /* enum */ BlockRedSandstone$EnumType DEFAULT;
    private static final BlockRedSandstone$EnumType[] META_LOOKUP;
    private final String unlocalizedName;
    private static final /* synthetic */ BlockRedSandstone$EnumType[] $VALUES;

    public static BlockRedSandstone$EnumType[] values() {
        return (BlockRedSandstone$EnumType[])$VALUES.clone();
    }

    public static BlockRedSandstone$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String toString() {
        BlockRedSandstone$EnumType a2;
        return a2.name;
    }

    public static BlockRedSandstone$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockRedSandstone$EnumType.class, a2);
    }

    public String getUnlocalizedName() {
        BlockRedSandstone$EnumType a2;
        return a2.unlocalizedName;
    }

    public int getMetadata() {
        BlockRedSandstone$EnumType a2;
        return a2.meta;
    }

    public String getName() {
        BlockRedSandstone$EnumType a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private BlockRedSandstone$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockRedSandstone$EnumType a2;
        BlockRedSandstone$EnumType blockRedSandstone$EnumType = object;
        Object object = string3;
        BlockRedSandstone$EnumType blockRedSandstone$EnumType2 = a2 = blockRedSandstone$EnumType;
        a2.meta = c2;
        blockRedSandstone$EnumType2.name = b2;
        blockRedSandstone$EnumType2.unlocalizedName = d2;
    }

    static {
        int n2;
        DEFAULT = new BlockRedSandstone$EnumType(uSa.E, SRa.M, BQa.la);
        CHISELED = new BlockRedSandstone$EnumType(vRa.d, yta.e, Jpa.w);
        SMOOTH = new BlockRedSandstone$EnumType(uqa.g, Asa.Da, WSa.l);
        BlockRedSandstone$EnumType[] blockRedSandstone$EnumTypeArray = new BlockRedSandstone$EnumType[yRa.d];
        blockRedSandstone$EnumTypeArray[uSa.E] = DEFAULT;
        blockRedSandstone$EnumTypeArray[vRa.d] = CHISELED;
        blockRedSandstone$EnumTypeArray[uqa.g] = SMOOTH;
        $VALUES = blockRedSandstone$EnumTypeArray;
        META_LOOKUP = new BlockRedSandstone$EnumType[BlockRedSandstone$EnumType.values().length];
        BlockRedSandstone$EnumType[] blockRedSandstone$EnumTypeArray2 = BlockRedSandstone$EnumType.values();
        int n3 = blockRedSandstone$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockRedSandstone$EnumType blockRedSandstone$EnumType;
            BlockRedSandstone$EnumType.META_LOOKUP[blockRedSandstone$EnumType.getMetadata()] = blockRedSandstone$EnumType = blockRedSandstone$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }
}

