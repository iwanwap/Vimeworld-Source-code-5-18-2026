/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material$1;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.block.material.MaterialPortal;
import net.minecraft.block.material.MaterialTransparent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Material {
    public static final Material iron;
    public static final Material fire;
    public static final Material sculk;
    public static final Material cactus;
    private boolean replaceable;
    public static final Material glass;
    public static final Material snow;
    public static final Material vine;
    public static final Material redstoneLight;
    public static final Material barrier;
    public static final Material web;
    public static final Material air;
    public static final Material leavesCustom;
    public static final Material leaves;
    public static final Material grass;
    public static final Material coral;
    private boolean requiresNoTool;
    public static final Material piston;
    public static final Material packedIce;
    public static final Material circuits;
    public static final Material anvil;
    public static final Material plants;
    public static final Material sand;
    public static final Material water;
    public static final Material cake;
    private final MapColor materialMapColor;
    public static final Material wood;
    private int mobilityFlag;
    public static final Material tnt;
    public static final Material clay;
    public static final Material portal;
    public static final Material ground;
    public static final Material dragonEgg;
    private boolean canBurn;
    public static final Material ice;
    public static final Material lava;
    public static final Material amethyst;
    public static final Material moss;
    public static final Material carpet;
    public static final Material sponge;
    private boolean isAdventureModeExempt;
    public static final Material froglight;
    public static final Material cloth;
    private boolean isTranslucent;
    public static final Material gourd;
    public static final Material rock;
    public static final Material craftedSnow;

    private Material M() {
        Material a2;
        a2.isTranslucent = vRa.d;
        return a2;
    }

    public int J() {
        Material a2;
        return a2.mobilityFlag;
    }

    public boolean i() {
        return vRa.d != 0;
    }

    public boolean M() {
        Material a2;
        return a2.requiresNoTool;
    }

    public boolean e() {
        Material a2;
        return a2.canBurn;
    }

    static {
        air = new MaterialTransparent(MapColor.airColor);
        grass = new Material(MapColor.grassColor);
        ground = new Material(MapColor.dirtColor);
        wood = new Material(MapColor.woodColor).J();
        rock = new Material(MapColor.stoneColor).C();
        iron = new Material(MapColor.ironColor).C();
        anvil = new Material(MapColor.ironColor).C().e();
        water = new MaterialLiquid(MapColor.waterColor).l();
        lava = new MaterialLiquid(MapColor.tntColor).l();
        leaves = new Material(MapColor.foliageColor).J().M().l();
        leavesCustom = new Material(MapColor.foliageColor).J().M().l();
        plants = new MaterialLogic(MapColor.foliageColor).l();
        vine = new MaterialLogic(MapColor.foliageColor).J().l().d();
        sponge = new Material(MapColor.yellowColor);
        cloth = new Material(MapColor.clothColor).J();
        fire = new MaterialTransparent(MapColor.airColor).l();
        sand = new Material(MapColor.sandColor);
        circuits = new MaterialLogic(MapColor.airColor).l();
        carpet = new MaterialLogic(MapColor.clothColor).J();
        glass = new Material(MapColor.airColor).M().f();
        redstoneLight = new Material(MapColor.airColor).f();
        tnt = new Material(MapColor.tntColor).J().M();
        coral = new Material(MapColor.foliageColor).l();
        ice = new Material(MapColor.iceColor).M().f();
        packedIce = new Material(MapColor.iceColor).f();
        snow = new MaterialLogic(MapColor.snowColor).d().M().C().l();
        craftedSnow = new Material(MapColor.snowColor).C();
        cactus = new Material(MapColor.foliageColor).M().l();
        clay = new Material(MapColor.clayColor);
        gourd = new Material(MapColor.foliageColor).l();
        dragonEgg = new Material(MapColor.foliageColor).l();
        portal = new MaterialPortal(MapColor.airColor).e();
        cake = new Material(MapColor.airColor).l();
        web = new Material$1(MapColor.clothColor).C().l();
        piston = new Material(MapColor.stoneColor).e();
        barrier = new Material(MapColor.airColor).C().e();
        amethyst = new Material(MapColor.purpleColor).C();
        sculk = new Material(MapColor.blackColor).l();
        froglight = new Material(MapColor.airColor);
        moss = new Material(MapColor.foliageColor).l();
    }

    public Material e() {
        Material a2;
        a2.mobilityFlag = uqa.g;
        return a2;
    }

    public boolean d() {
        Material a2;
        return a2.replaceable;
    }

    public boolean C() {
        return vRa.d != 0;
    }

    public Material d() {
        Material a2;
        a2.replaceable = vRa.d;
        return a2;
    }

    public boolean l() {
        return uSa.E != 0;
    }

    public Material C() {
        Material a2;
        a2.requiresNoTool = uSa.E;
        return a2;
    }

    public Material l() {
        Material a2;
        a2.mobilityFlag = vRa.d;
        return a2;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public Material(MapColor mapColor) {
        MapColor b2 = mapColor;
        Material a2 = this;
        a2.requiresNoTool = vRa.d;
        a2.materialMapColor = b2;
    }

    public Material f() {
        Material a2;
        a2.isAdventureModeExempt = vRa.d;
        return a2;
    }

    public MapColor J() {
        Material a2;
        return a2.materialMapColor;
    }

    public Material J() {
        Material a2;
        a2.canBurn = vRa.d;
        return a2;
    }

    public boolean J() {
        Material a2;
        if (a2.isTranslucent) {
            return uSa.E != 0;
        }
        return a2.f();
    }
}

