/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pb
 *  kqa
 *  vRa
 *  zTa
 */
package net.minecraft.block;

public final class BlockStairs$EnumShape
extends Enum<BlockStairs$EnumShape>
implements Pb {
    public static final /* enum */ BlockStairs$EnumShape INNER_RIGHT;
    public static final /* enum */ BlockStairs$EnumShape OUTER_LEFT;
    public static final /* enum */ BlockStairs$EnumShape OUTER_RIGHT;
    public static final /* enum */ BlockStairs$EnumShape INNER_LEFT;
    private static final /* synthetic */ BlockStairs$EnumShape[] $VALUES;
    public static final /* enum */ BlockStairs$EnumShape STRAIGHT;
    private final String name;

    static {
        STRAIGHT = new BlockStairs$EnumShape(Jqa.T);
        INNER_LEFT = new BlockStairs$EnumShape(kqa.s);
        INNER_RIGHT = new BlockStairs$EnumShape(Nta.S);
        OUTER_LEFT = new BlockStairs$EnumShape(rua.X);
        OUTER_RIGHT = new BlockStairs$EnumShape(zTa.y);
        BlockStairs$EnumShape[] blockStairs$EnumShapeArray = new BlockStairs$EnumShape[tTa.h];
        blockStairs$EnumShapeArray[uSa.E] = STRAIGHT;
        blockStairs$EnumShapeArray[vRa.d] = INNER_LEFT;
        blockStairs$EnumShapeArray[uqa.g] = INNER_RIGHT;
        blockStairs$EnumShapeArray[yRa.d] = OUTER_LEFT;
        blockStairs$EnumShapeArray[AQa.P] = OUTER_RIGHT;
        $VALUES = blockStairs$EnumShapeArray;
    }

    public static BlockStairs$EnumShape valueOf(String a2) {
        return Enum.valueOf(BlockStairs$EnumShape.class, a2);
    }

    private BlockStairs$EnumShape(String string2) {
        Object b2 = string2;
        BlockStairs$EnumShape a2 = this;
        a2.name = b2;
    }

    public String toString() {
        BlockStairs$EnumShape a2;
        return a2.name;
    }

    public static BlockStairs$EnumShape[] values() {
        return (BlockStairs$EnumShape[])$VALUES.clone();
    }

    public String getName() {
        BlockStairs$EnumShape a2;
        return a2.name;
    }
}

