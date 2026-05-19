/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NTa
 *  QFa
 *  Qsa
 *  YSa
 *  Ypa
 *  Zta
 *  cQa
 *  eAa
 *  jpa
 *  kPa
 *  kta
 *  lPa
 *  lqa
 *  pqa
 *  vQa
 *  vRa
 *  wda
 */
import net.minecraft.block.Block;

public final class wda_3
extends Enum<wda> {
    private final int enchantability;
    private final float efficiencyOnProperMaterial;
    private final int maxUses;
    public static final /* enum */ wda STONE;
    private final float damageVsEntity;
    private static final /* synthetic */ wda[] $VALUES;
    public static final /* enum */ wda GOLD;
    public static final /* enum */ wda WOOD;
    public static final /* enum */ wda IRON;
    public static final /* enum */ wda NETHERITE;
    public static final /* enum */ wda EMERALD;
    private final int harvestLevel;

    public float getEfficiencyOnProperMaterial() {
        wda_3 a2;
        return a2.efficiencyOnProperMaterial;
    }

    public static wda[] values() {
        return (wda[])$VALUES.clone();
    }

    public eAa getRepairItem() {
        wda_3 a2;
        if (a2 == WOOD) {
            return eAa.J((Block)QFa.L);
        }
        if (a2 == STONE) {
            return eAa.J((Block)QFa.yB);
        }
        if (a2 == GOLD) {
            return Gea.Bb;
        }
        if (a2 == IRON) {
            return Gea.GA;
        }
        if (a2 == EMERALD) {
            return Gea.b;
        }
        return null;
    }

    static {
        WOOD = new wda_3(uSa.E, lPa.p, kta.v, JPa.N, Ypa.A);
        STONE = new wda_3(vRa.d, vRa.Ea, YSa.G, pqa.r, tTa.h);
        IRON = new wda_3(uqa.g, Zta.w, lqa.ga, kta.v, hpa.Z);
        EMERALD = new wda_3(yRa.d, kta.fa, Qsa.k, vQa.q, NTa.C);
        GOLD = new wda_3(uSa.E, fPa.i, Fua.Y, JPa.N, cQa.o);
        NETHERITE = new wda_3(AQa.P, jpa.O, kPa.S, YSa.G, Ypa.A);
        wda_3[] wda_3Array = new wda_3[uua.p];
        wda_3Array[uSa.E] = WOOD;
        wda_3Array[vRa.d] = STONE;
        wda_3Array[uqa.g] = IRON;
        wda_3Array[yRa.d] = EMERALD;
        wda_3Array[AQa.P] = GOLD;
        wda_3Array[tTa.h] = NETHERITE;
        $VALUES = wda_3Array;
    }

    public float getDamageVsEntity() {
        wda_3 a2;
        return a2.damageVsEntity;
    }

    public int getMaxUses() {
        wda_3 a2;
        return a2.maxUses;
    }

    /*
     * WARNING - void declaration
     */
    private wda_3(int n3, int n4, float f2, float f3, int n5) {
        void f4;
        void b2;
        void c2;
        void d2;
        void e2;
        wda_3 a2;
        int n6 = n5;
        wda_3 wda_32 = a2 = this;
        wda_3 wda_33 = a2;
        a2.harvestLevel = e2;
        wda_33.maxUses = d2;
        wda_33.efficiencyOnProperMaterial = c2;
        wda_32.damageVsEntity = b2;
        wda_32.enchantability = f4;
    }

    public int getEnchantability() {
        wda_3 a2;
        return a2.enchantability;
    }

    public int getHarvestLevel() {
        wda_3 a2;
        return a2.harvestLevel;
    }

    public static wda valueOf(String a2) {
        return Enum.valueOf(wda_3.class, a2);
    }
}

