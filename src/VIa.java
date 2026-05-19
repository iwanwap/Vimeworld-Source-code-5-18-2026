/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LA
 *  NPa
 *  NTa
 *  YEa
 *  Ypa
 *  fEa
 *  pea
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class VIa
extends Enum<VIa> {
    public static final /* enum */ VIa CREATURE;
    private final boolean isAnimal;
    private final Material creatureMaterial;
    private static final /* synthetic */ VIa[] $VALUES;
    private final int maxNumberOfCreature;
    public static final /* enum */ VIa MONSTER;
    private final boolean isPeacefulCreature;
    public static final /* enum */ VIa WATER_CREATURE;
    private final Class<? extends LA> creatureClass;
    public static final /* enum */ VIa AMBIENT;

    public Class<? extends LA> getCreatureClass() {
        VIa a2;
        return a2.creatureClass;
    }

    public int getMaxNumberOfCreature() {
        VIa a2;
        return a2.maxNumberOfCreature;
    }

    public boolean getAnimal() {
        VIa a2;
        return a2.isAnimal;
    }

    public static VIa valueOf(String a2) {
        return Enum.valueOf(VIa.class, a2);
    }

    public static VIa[] values() {
        return (VIa[])$VALUES.clone();
    }

    static {
        MONSTER = new VIa(WC.class, NPa.e, Material.air, uSa.E != 0, uSa.E != 0);
        CREATURE = new VIa(fEa.class, NTa.C, Material.air, vRa.d != 0, vRa.d != 0);
        AMBIENT = new VIa(pea.class, Ypa.A, Material.air, vRa.d != 0, uSa.E != 0);
        WATER_CREATURE = new VIa(YEa.class, tTa.h, Material.water, vRa.d != 0, uSa.E != 0);
        VIa[] vIaArray = new VIa[AQa.P];
        vIaArray[uSa.E] = MONSTER;
        vIaArray[vRa.d] = CREATURE;
        vIaArray[uqa.g] = AMBIENT;
        vIaArray[yRa.d] = WATER_CREATURE;
        $VALUES = vIaArray;
    }

    public boolean getPeacefulCreature() {
        VIa a2;
        return a2.isPeacefulCreature;
    }

    /*
     * WARNING - void declaration
     */
    private VIa(Class<? extends LA> clazz, int n3, Material material, boolean bl, boolean bl2) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        VIa a2;
        boolean bl3 = bl2;
        VIa vIa = a2 = this;
        VIa vIa2 = a2;
        a2.creatureClass = e2;
        vIa2.maxNumberOfCreature = d2;
        vIa2.creatureMaterial = c2;
        vIa.isPeacefulCreature = b2;
        vIa.isAnimal = f2;
    }
}

