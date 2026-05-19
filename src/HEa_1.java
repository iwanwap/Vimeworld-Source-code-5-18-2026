/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  HEa
 *  JPa
 *  Mda
 *  bRa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class HEa_1
extends Enum<HEa> {
    public static final /* enum */ HEa CLOWNFISH;
    private static final /* synthetic */ HEa[] $VALUES;
    private final float uncookedSaturationModifier;
    private static final Map<Integer, HEa> META_LOOKUP;
    public static final /* enum */ HEa SALMON;
    public static final /* enum */ HEa PUFFERFISH;
    private final int uncookedHealAmount;
    private final float cookedSaturationModifier;
    private final String unlocalizedName;
    private final int meta;
    private final int cookedHealAmount;
    private boolean cookable;
    public static final /* enum */ HEa COD;

    public static HEa byMetadata(int n2) {
        int n3 = n2;
        HEa_1 a2 = (HEa_1)META_LOOKUP.get(n3);
        if (a2 == null) {
            return COD;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private HEa_1(int n3, String string2, int n4, float f2, int n5, float f3) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f4;
        HEa_1 a2;
        float f5 = f3;
        HEa_1 hEa_1 = a2 = this;
        HEa_1 hEa_12 = a2;
        HEa_1 hEa_13 = a2;
        a2.cookable = uSa.E;
        hEa_13.meta = f4;
        hEa_13.unlocalizedName = e2;
        hEa_12.uncookedHealAmount = d2;
        hEa_12.uncookedSaturationModifier = c2;
        hEa_1.cookedHealAmount = b2;
        hEa_1.cookedSaturationModifier = g2;
        hEa_1.cookable = vRa.d;
    }

    public static HEa valueOf(String a2) {
        return Enum.valueOf(HEa_1.class, a2);
    }

    public float getUncookedSaturationModifier() {
        HEa_1 a2;
        return a2.uncookedSaturationModifier;
    }

    public static HEa byItemStack(Mda a2) {
        if (a2.J() instanceof gfa) {
            return HEa_1.byMetadata(a2.J());
        }
        return COD;
    }

    public float getCookedSaturationModifier() {
        HEa_1 a2;
        return a2.cookedSaturationModifier;
    }

    public int getCookedHealAmount() {
        HEa_1 a2;
        return a2.cookedHealAmount;
    }

    /*
     * WARNING - void declaration
     */
    private HEa_1(int n3, String string2, int n4, float f2) {
        void e2;
        void b2;
        void c2;
        void d2;
        HEa_1 a2;
        float f3 = f2;
        HEa_1 hEa_1 = a2 = this;
        HEa_1 hEa_12 = a2;
        HEa_1 hEa_13 = a2;
        a2.cookable = uSa.E;
        hEa_13.meta = d2;
        hEa_13.unlocalizedName = c2;
        hEa_12.uncookedHealAmount = b2;
        hEa_1.uncookedSaturationModifier = e2;
        hEa_12.cookedHealAmount = uSa.E;
        hEa_1.cookedSaturationModifier = JPa.N;
        hEa_1.cookable = uSa.E;
    }

    public static HEa[] values() {
        return (HEa[])$VALUES.clone();
    }

    public String getUnlocalizedName() {
        HEa_1 a2;
        return a2.unlocalizedName;
    }

    public int getUncookedHealAmount() {
        HEa_1 a2;
        return a2.uncookedHealAmount;
    }

    public int getMetadata() {
        HEa_1 a2;
        return a2.meta;
    }

    static {
        int n2;
        COD = new HEa_1(uSa.E, opa.D, uqa.g, Nra.e, tTa.h, Ora.D);
        SALMON = new HEa_1(vRa.d, Fpa.la, uqa.g, Nra.e, uua.p, xSa.la);
        CLOWNFISH = new HEa_1(uqa.g, bRa.o, vRa.d, Nra.e);
        PUFFERFISH = new HEa_1(yRa.d, Bra.a, vRa.d, Nra.e);
        HEa_1[] hEa_1Array = new HEa_1[AQa.P];
        hEa_1Array[uSa.E] = COD;
        hEa_1Array[vRa.d] = SALMON;
        hEa_1Array[uqa.g] = CLOWNFISH;
        hEa_1Array[yRa.d] = PUFFERFISH;
        $VALUES = hEa_1Array;
        META_LOOKUP = Maps.newHashMap();
        HEa[] hEaArray = HEa_1.values();
        int n3 = hEaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            HEa hEa2 = hEaArray[n2];
            META_LOOKUP.put(hEa2.getMetadata(), hEa2);
            n4 = ++n2;
        }
    }

    public boolean canCook() {
        HEa_1 a2;
        return a2.cookable;
    }
}

