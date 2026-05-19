/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQa
 *  NTa
 *  Tfa
 *  VEa
 *  XTa
 *  Ypa
 *  eAa
 *  lqa
 *  nQa
 *  vRa
 */
public final class Tfa_2
extends Enum<Tfa> {
    public static final /* enum */ Tfa IRON;
    private final int maxDamageFactor;
    public static final /* enum */ Tfa GOLD;
    public static final /* enum */ Tfa LEATHER;
    private final int[] damageReductionAmountArray;
    public static final /* enum */ Tfa NETHERITE;
    private final String name;
    public static final /* enum */ Tfa CHAIN;
    public static final /* enum */ Tfa DIAMOND;
    private static final /* synthetic */ Tfa[] $VALUES;
    private final int enchantability;

    public String getName() {
        Tfa_2 a2;
        return a2.name;
    }

    public static Tfa[] values() {
        return (Tfa[])$VALUES.clone();
    }

    public int getDurability(int n2) {
        int b2 = n2;
        Tfa_2 a2 = this;
        return VEa.J()[b2] * a2.maxDamageFactor;
    }

    public static Tfa valueOf(String a2) {
        return Enum.valueOf(Tfa_2.class, a2);
    }

    public eAa getRepairItem() {
        Tfa_2 a2;
        if (a2 == LEATHER) {
            return Gea.Xb;
        }
        if (a2 == CHAIN) {
            return Gea.GA;
        }
        if (a2 == GOLD) {
            return Gea.Bb;
        }
        if (a2 == IRON) {
            return Gea.GA;
        }
        if (a2 == DIAMOND) {
            return Gea.b;
        }
        return null;
    }

    static {
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = vRa.d;
        nArray[vRa.d] = yRa.d;
        nArray[uqa.g] = uqa.g;
        nArray[yRa.d] = vRa.d;
        LEATHER = new Tfa_2(kTa.c, tTa.h, nArray, Ypa.A);
        int[] nArray2 = new int[AQa.P];
        nArray2[uSa.E] = uqa.g;
        nArray2[vRa.d] = tTa.h;
        nArray2[uqa.g] = AQa.P;
        nArray2[yRa.d] = vRa.d;
        CHAIN = new Tfa_2(nQa.F, Ypa.A, nArray2, lqa.s);
        int[] nArray3 = new int[AQa.P];
        nArray3[uSa.E] = uqa.g;
        nArray3[vRa.d] = uua.p;
        nArray3[uqa.g] = tTa.h;
        nArray3[yRa.d] = uqa.g;
        IRON = new Tfa_2(mPa.L, Ypa.A, nArray3, WOa.fa);
        int[] nArray4 = new int[AQa.P];
        nArray4[uSa.E] = uqa.g;
        nArray4[vRa.d] = tTa.h;
        nArray4[uqa.g] = yRa.d;
        nArray4[yRa.d] = vRa.d;
        GOLD = new Tfa_2(pta.A, XTa.W, nArray4, kTa.g);
        int[] nArray5 = new int[AQa.P];
        nArray5[uSa.E] = yRa.d;
        nArray5[vRa.d] = Yqa.i;
        nArray5[uqa.g] = uua.p;
        nArray5[yRa.d] = yRa.d;
        DIAMOND = new Tfa_2(nQa.a, Zqa.G, nArray5, NTa.C);
        int[] nArray6 = new int[AQa.P];
        nArray6[uSa.E] = yRa.d;
        nArray6[vRa.d] = Yqa.i;
        nArray6[uqa.g] = uua.p;
        nArray6[yRa.d] = yRa.d;
        NETHERITE = new Tfa_2(uua.H, LQa.c, nArray6, Ypa.A);
        Tfa_2[] tfa_2Array = new Tfa_2[uua.p];
        tfa_2Array[uSa.E] = LEATHER;
        tfa_2Array[vRa.d] = CHAIN;
        tfa_2Array[uqa.g] = IRON;
        tfa_2Array[yRa.d] = GOLD;
        tfa_2Array[AQa.P] = DIAMOND;
        tfa_2Array[tTa.h] = NETHERITE;
        $VALUES = tfa_2Array;
    }

    /*
     * WARNING - void declaration
     */
    private Tfa_2(String string2, int n3, int[] nArray, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        Tfa_2 a2;
        int n5 = n4;
        Tfa_2 tfa_2 = a2 = this;
        Tfa_2 tfa_22 = a2;
        tfa_22.name = d2;
        tfa_22.maxDamageFactor = c2;
        tfa_2.damageReductionAmountArray = b2;
        tfa_2.enchantability = e2;
    }

    public int getEnchantability() {
        Tfa_2 a2;
        return a2.enchantability;
    }

    public int getDamageReductionAmount(int n2) {
        int b2 = n2;
        Tfa_2 a2 = this;
        return a2.damageReductionAmountArray[b2];
    }
}

