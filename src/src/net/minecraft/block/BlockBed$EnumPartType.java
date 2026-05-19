/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  qta
 *  vRa
 */
package net.minecraft.block;

public final class BlockBed$EnumPartType
extends Enum<BlockBed$EnumPartType>
implements Pb {
    public static final /* enum */ BlockBed$EnumPartType FOOT;
    public static final /* enum */ BlockBed$EnumPartType HEAD;
    private static final /* synthetic */ BlockBed$EnumPartType[] $VALUES;
    private final String name;

    public String toString() {
        BlockBed$EnumPartType a2;
        return a2.name;
    }

    public static BlockBed$EnumPartType[] values() {
        return (BlockBed$EnumPartType[])$VALUES.clone();
    }

    static {
        HEAD = new BlockBed$EnumPartType(WRa.q);
        FOOT = new BlockBed$EnumPartType(qta.H);
        BlockBed$EnumPartType[] blockBed$EnumPartTypeArray = new BlockBed$EnumPartType[uqa.g];
        blockBed$EnumPartTypeArray[uSa.E] = HEAD;
        blockBed$EnumPartTypeArray[vRa.d] = FOOT;
        $VALUES = blockBed$EnumPartTypeArray;
    }

    public static BlockBed$EnumPartType valueOf(String a2) {
        return Enum.valueOf(BlockBed$EnumPartType.class, a2);
    }

    private BlockBed$EnumPartType(String string2) {
        Object b2 = string2;
        BlockBed$EnumPartType a2 = this;
        a2.name = b2;
    }

    public String getName() {
        BlockBed$EnumPartType a2;
        return a2.name;
    }
}

