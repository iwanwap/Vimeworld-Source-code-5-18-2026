/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  Xsa
 *  bpa
 *  dpa
 *  vRa
 *  yra
 */
package net.minecraft.block;

public final class BlockDoublePlant$EnumPlantType
extends Enum<BlockDoublePlant$EnumPlantType>
implements Pb {
    public static final /* enum */ BlockDoublePlant$EnumPlantType ROSE;
    private final int meta;
    public static final /* enum */ BlockDoublePlant$EnumPlantType SYRINGA;
    private static final /* synthetic */ BlockDoublePlant$EnumPlantType[] $VALUES;
    private final String name;
    private static final BlockDoublePlant$EnumPlantType[] META_LOOKUP;
    private final String unlocalizedName;
    public static final /* enum */ BlockDoublePlant$EnumPlantType GRASS;
    public static final /* enum */ BlockDoublePlant$EnumPlantType FERN;
    public static final /* enum */ BlockDoublePlant$EnumPlantType PAEONIA;
    public static final /* enum */ BlockDoublePlant$EnumPlantType SUNFLOWER;

    /*
     * WARNING - void declaration
     */
    private BlockDoublePlant$EnumPlantType(int n3, String string2, String string3) {
        Object d2;
        void b2;
        void c2;
        BlockDoublePlant$EnumPlantType a2;
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = object;
        Object object = string3;
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType2 = a2 = blockDoublePlant$EnumPlantType;
        a2.meta = c2;
        blockDoublePlant$EnumPlantType2.name = b2;
        blockDoublePlant$EnumPlantType2.unlocalizedName = d2;
    }

    /*
     * WARNING - void declaration
     */
    private BlockDoublePlant$EnumPlantType(int n3, String string2) {
        void b2;
        Object c2;
        BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType = object;
        Object object = string2;
        BlockDoublePlant$EnumPlantType a2 = blockDoublePlant$EnumPlantType;
        Object object2 = c2;
        a2((int)b2, (String)object2, (String)object2);
    }

    public int getMeta() {
        BlockDoublePlant$EnumPlantType a2;
        return a2.meta;
    }

    public static BlockDoublePlant$EnumPlantType byMetadata(int a2) {
        if (a2 < 0 || a2 >= META_LOOKUP.length) {
            a2 = uSa.E;
        }
        return META_LOOKUP[a2];
    }

    public String getUnlocalizedName() {
        BlockDoublePlant$EnumPlantType a2;
        return a2.unlocalizedName;
    }

    public String getName() {
        BlockDoublePlant$EnumPlantType a2;
        return a2.name;
    }

    public static BlockDoublePlant$EnumPlantType valueOf(String a2) {
        return Enum.valueOf(BlockDoublePlant$EnumPlantType.class, a2);
    }

    static {
        int n2;
        SUNFLOWER = new BlockDoublePlant$EnumPlantType(uSa.E, dpa.g);
        SYRINGA = new BlockDoublePlant$EnumPlantType(vRa.d, bpa.j);
        GRASS = new BlockDoublePlant$EnumPlantType(uqa.g, DPa.Q, Xsa.J);
        FERN = new BlockDoublePlant$EnumPlantType(yRa.d, mPa.h, kua.ga);
        ROSE = new BlockDoublePlant$EnumPlantType(AQa.P, GPa.Ka, NSa.t);
        PAEONIA = new BlockDoublePlant$EnumPlantType(tTa.h, yra.i);
        BlockDoublePlant$EnumPlantType[] blockDoublePlant$EnumPlantTypeArray = new BlockDoublePlant$EnumPlantType[uua.p];
        blockDoublePlant$EnumPlantTypeArray[uSa.E] = SUNFLOWER;
        blockDoublePlant$EnumPlantTypeArray[vRa.d] = SYRINGA;
        blockDoublePlant$EnumPlantTypeArray[uqa.g] = GRASS;
        blockDoublePlant$EnumPlantTypeArray[yRa.d] = FERN;
        blockDoublePlant$EnumPlantTypeArray[AQa.P] = ROSE;
        blockDoublePlant$EnumPlantTypeArray[tTa.h] = PAEONIA;
        $VALUES = blockDoublePlant$EnumPlantTypeArray;
        META_LOOKUP = new BlockDoublePlant$EnumPlantType[BlockDoublePlant$EnumPlantType.values().length];
        BlockDoublePlant$EnumPlantType[] blockDoublePlant$EnumPlantTypeArray2 = BlockDoublePlant$EnumPlantType.values();
        int n3 = blockDoublePlant$EnumPlantTypeArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType;
            BlockDoublePlant$EnumPlantType.META_LOOKUP[blockDoublePlant$EnumPlantType.getMeta()] = blockDoublePlant$EnumPlantType = blockDoublePlant$EnumPlantTypeArray2[n2];
            n4 = ++n2;
        }
    }

    public String toString() {
        BlockDoublePlant$EnumPlantType a2;
        return a2.name;
    }

    public static BlockDoublePlant$EnumPlantType[] values() {
        return (BlockDoublePlant$EnumPlantType[])$VALUES.clone();
    }
}

