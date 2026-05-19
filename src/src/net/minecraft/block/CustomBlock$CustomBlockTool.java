/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block;

public final class CustomBlock$CustomBlockTool
extends Enum<CustomBlock$CustomBlockTool> {
    public static final /* enum */ CustomBlock$CustomBlockTool axe = new CustomBlock$CustomBlockTool();
    public static final /* enum */ CustomBlock$CustomBlockTool shovel = new CustomBlock$CustomBlockTool();
    public static final /* enum */ CustomBlock$CustomBlockTool pickaxe = new CustomBlock$CustomBlockTool();
    private static final /* synthetic */ CustomBlock$CustomBlockTool[] $VALUES;

    static {
        CustomBlock$CustomBlockTool[] customBlock$CustomBlockToolArray = new CustomBlock$CustomBlockTool[yRa.d];
        customBlock$CustomBlockToolArray[uSa.E] = axe;
        customBlock$CustomBlockToolArray[vRa.d] = shovel;
        customBlock$CustomBlockToolArray[uqa.g] = pickaxe;
        $VALUES = customBlock$CustomBlockToolArray;
    }

    private CustomBlock$CustomBlockTool() {
        int a2 = n2;
        CustomBlock$CustomBlockTool customBlock$CustomBlockTool = this;
    }

    public static CustomBlock$CustomBlockTool valueOf(String a2) {
        return Enum.valueOf(CustomBlock$CustomBlockTool.class, a2);
    }

    public static CustomBlock$CustomBlockTool[] values() {
        return (CustomBlock$CustomBlockTool[])$VALUES.clone();
    }
}

