/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  aSa
 *  vRa
 *  zsa
 */
package net.minecraft.block;

public final class BlockWall$EnumType
extends Enum<BlockWall$EnumType>
implements Pb {
    public static final /* enum */ BlockWall$EnumType NORMAL;
    private final int meta;
    private String unlocalizedName;
    public static final /* enum */ BlockWall$EnumType MOSSY;
    private static final /* synthetic */ BlockWall$EnumType[] $VALUES;
    private static final BlockWall$EnumType[] META_LOOKUP;
    private final String name;

    public int getMetadata() {
        BlockWall$EnumType a2;
        return a2.meta;
    }

    public String getName() {
        BlockWall$EnumType a2;
        return a2.name;
    }

    public String getUnlocalizedName() {
        BlockWall$EnumType a2;
        return a2.unlocalizedName;
    }

    /*
     * WARNING - void declaration
     */
    private BlockWall$EnumType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockWall$EnumType a2;
        BlockWall$EnumType blockWall$EnumType = object;
        Object object = string3;
        BlockWall$EnumType blockWall$EnumType2 = a2 = blockWall$EnumType;
        a2.meta = c2;
        blockWall$EnumType2.name = b2;
        blockWall$EnumType2.unlocalizedName = d2;
    }

    public String toString() {
        BlockWall$EnumType a2;
        return a2.name;
    }

    public static BlockWall$EnumType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public static BlockWall$EnumType valueOf(String a2) {
        return Enum.valueOf(BlockWall$EnumType.class, a2);
    }

    static {
        int n2;
        NORMAL = new BlockWall$EnumType(uSa.E, ATa.ga, AQa.t);
        MOSSY = new BlockWall$EnumType(vRa.d, aSa.A, zsa.i);
        BlockWall$EnumType[] blockWall$EnumTypeArray = new BlockWall$EnumType[uqa.g];
        blockWall$EnumTypeArray[uSa.E] = NORMAL;
        blockWall$EnumTypeArray[vRa.d] = MOSSY;
        $VALUES = blockWall$EnumTypeArray;
        META_LOOKUP = new BlockWall$EnumType[BlockWall$EnumType.values().length];
        BlockWall$EnumType[] blockWall$EnumTypeArray2 = BlockWall$EnumType.values();
        int n3 = blockWall$EnumTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockWall$EnumType blockWall$EnumType;
            BlockWall$EnumType.META_LOOKUP[blockWall$EnumType.getMetadata()] = blockWall$EnumType = blockWall$EnumTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public static BlockWall$EnumType[] values() {
        return (BlockWall$EnumType[])$VALUES.clone();
    }
}

