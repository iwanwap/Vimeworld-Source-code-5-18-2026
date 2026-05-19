/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.material.Material;

public final class CustomBlock$CustomBlockMaterial
extends Enum<CustomBlock$CustomBlockMaterial> {
    private static final /* synthetic */ CustomBlock$CustomBlockMaterial[] $VALUES;
    public static final /* enum */ CustomBlock$CustomBlockMaterial wood;
    public static final /* enum */ CustomBlock$CustomBlockMaterial plant;
    public static final /* enum */ CustomBlock$CustomBlockMaterial rock;
    public static final /* enum */ CustomBlock$CustomBlockMaterial iron;
    public static final /* enum */ CustomBlock$CustomBlockMaterial sponge;
    public static final /* enum */ CustomBlock$CustomBlockMaterial grass;
    public static final /* enum */ CustomBlock$CustomBlockMaterial leaves;
    public static final /* enum */ CustomBlock$CustomBlockMaterial glass;
    private final Block$SoundType soundType;
    public static final /* enum */ CustomBlock$CustomBlockMaterial wool;
    private final Material material;

    public Material getMaterial() {
        CustomBlock$CustomBlockMaterial a2;
        return a2.material;
    }

    public Block$SoundType getSoundType() {
        CustomBlock$CustomBlockMaterial a2;
        return a2.soundType;
    }

    /*
     * WARNING - void declaration
     */
    private CustomBlock$CustomBlockMaterial(Material material, Block$SoundType block$SoundType) {
        Object c2;
        void b2;
        CustomBlock$CustomBlockMaterial a2;
        CustomBlock$CustomBlockMaterial customBlock$CustomBlockMaterial = object;
        Object object = block$SoundType;
        CustomBlock$CustomBlockMaterial customBlock$CustomBlockMaterial2 = a2 = customBlock$CustomBlockMaterial;
        customBlock$CustomBlockMaterial2.material = b2;
        customBlock$CustomBlockMaterial2.soundType = c2;
    }

    public static CustomBlock$CustomBlockMaterial[] values() {
        return (CustomBlock$CustomBlockMaterial[])$VALUES.clone();
    }

    static {
        rock = new CustomBlock$CustomBlockMaterial(Material.rock, Block.soundTypeStone);
        wood = new CustomBlock$CustomBlockMaterial(Material.wood, Block.soundTypeWood);
        sponge = new CustomBlock$CustomBlockMaterial(Material.sponge, Block.soundTypeGrass);
        iron = new CustomBlock$CustomBlockMaterial(Material.iron, Block.soundTypeMetal);
        glass = new CustomBlock$CustomBlockMaterial(Material.glass, Block.soundTypeGlass);
        grass = new CustomBlock$CustomBlockMaterial(Material.grass, Block.soundTypeGrass);
        wool = new CustomBlock$CustomBlockMaterial(Material.cloth, Block.soundTypeCloth);
        plant = new CustomBlock$CustomBlockMaterial(Material.plants, Block.soundTypeGrass);
        leaves = new CustomBlock$CustomBlockMaterial(Material.leavesCustom, Block.soundTypeGrass);
        CustomBlock$CustomBlockMaterial[] customBlock$CustomBlockMaterialArray = new CustomBlock$CustomBlockMaterial[WOa.fa];
        customBlock$CustomBlockMaterialArray[uSa.E] = rock;
        customBlock$CustomBlockMaterialArray[vRa.d] = wood;
        customBlock$CustomBlockMaterialArray[uqa.g] = sponge;
        customBlock$CustomBlockMaterialArray[yRa.d] = iron;
        customBlock$CustomBlockMaterialArray[AQa.P] = glass;
        customBlock$CustomBlockMaterialArray[tTa.h] = grass;
        customBlock$CustomBlockMaterialArray[uua.p] = wool;
        customBlock$CustomBlockMaterialArray[XTa.W] = plant;
        customBlock$CustomBlockMaterialArray[Yqa.i] = leaves;
        $VALUES = customBlock$CustomBlockMaterialArray;
    }

    public static CustomBlock$CustomBlockMaterial valueOf(String a2) {
        return Enum.valueOf(CustomBlock$CustomBlockMaterial.class, a2);
    }
}

