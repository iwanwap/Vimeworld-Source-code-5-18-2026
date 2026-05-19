/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  lqa
 *  pPa
 *  vRa
 */
package net.minecraft.block;

public final class CustomBlock$CustomBlockType
extends Enum<CustomBlock$CustomBlockType> {
    public static final /* enum */ CustomBlock$CustomBlockType wall;
    public static final /* enum */ CustomBlock$CustomBlockType door;
    public static final /* enum */ CustomBlock$CustomBlockType fence;
    public static final /* enum */ CustomBlock$CustomBlockType vertical_slab;
    public static final /* enum */ CustomBlock$CustomBlockType stairs;
    public static final /* enum */ CustomBlock$CustomBlockType pillar;
    public static final /* enum */ CustomBlock$CustomBlockType facing;
    private static final /* synthetic */ CustomBlock$CustomBlockType[] $VALUES;
    public static final /* enum */ CustomBlock$CustomBlockType fence_gate;
    public static final /* enum */ CustomBlock$CustomBlockType cube;
    public static final /* enum */ CustomBlock$CustomBlockType trapdoor;
    public static final /* enum */ CustomBlock$CustomBlockType slab;
    public static final /* enum */ CustomBlock$CustomBlockType cross;

    private CustomBlock$CustomBlockType() {
        int a2 = n2;
        CustomBlock$CustomBlockType customBlock$CustomBlockType = this;
    }

    static {
        cube = new CustomBlock$CustomBlockType();
        facing = new CustomBlock$CustomBlockType();
        cross = new CustomBlock$CustomBlockType();
        pillar = new CustomBlock$CustomBlockType();
        stairs = new CustomBlock$CustomBlockType();
        slab = new CustomBlock$CustomBlockType();
        vertical_slab = new CustomBlock$CustomBlockType();
        wall = new CustomBlock$CustomBlockType();
        fence = new CustomBlock$CustomBlockType();
        fence_gate = new CustomBlock$CustomBlockType();
        door = new CustomBlock$CustomBlockType();
        trapdoor = new CustomBlock$CustomBlockType();
        CustomBlock$CustomBlockType[] customBlock$CustomBlockTypeArray = new CustomBlock$CustomBlockType[lqa.s];
        customBlock$CustomBlockTypeArray[uSa.E] = cube;
        customBlock$CustomBlockTypeArray[vRa.d] = facing;
        customBlock$CustomBlockTypeArray[uqa.g] = cross;
        customBlock$CustomBlockTypeArray[yRa.d] = pillar;
        customBlock$CustomBlockTypeArray[AQa.P] = stairs;
        customBlock$CustomBlockTypeArray[tTa.h] = slab;
        customBlock$CustomBlockTypeArray[uua.p] = vertical_slab;
        customBlock$CustomBlockTypeArray[XTa.W] = wall;
        customBlock$CustomBlockTypeArray[Yqa.i] = fence;
        customBlock$CustomBlockTypeArray[WOa.fa] = fence_gate;
        customBlock$CustomBlockTypeArray[NTa.C] = door;
        customBlock$CustomBlockTypeArray[pPa.f] = trapdoor;
        $VALUES = customBlock$CustomBlockTypeArray;
    }

    public static CustomBlock$CustomBlockType[] values() {
        return (CustomBlock$CustomBlockType[])$VALUES.clone();
    }

    public static CustomBlock$CustomBlockType valueOf(String a2) {
        return Enum.valueOf(CustomBlock$CustomBlockType.class, a2);
    }
}

