/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cra
 *  hra
 *  lE
 *  vRa
 */
public final class lE_2
extends Enum<lE> {
    private static final /* synthetic */ lE[] $VALUES;
    public static final /* enum */ lE BOLD;
    public static final /* enum */ lE THIN;
    private final int weight;
    public static final /* enum */ lE REGULAR;
    public static final /* enum */ lE LONG;

    public int getWeight() {
        lE_2 a2;
        return a2.weight;
    }

    public static lE fromInt(int n2) {
        int n3;
        int n4 = n2;
        lE lE2 = THIN;
        lE a22 = LONG;
        if (n4 <= lE2.getWeight()) {
            return lE2;
        }
        if (n4 >= a22.getWeight()) {
            return a22;
        }
        int a22 = Math.abs(n4 - lE2.getWeight());
        lE[] lEArray = lE_2.values();
        int n5 = lEArray.length;
        int n6 = n3 = uSa.E;
        while (n6 < n5) {
            lE lE3 = lEArray[n3];
            int n7 = Math.abs(n4 - lE3.getWeight());
            if (n7 < a22) {
                a22 = n7;
                lE2 = lE3;
            }
            n6 = ++n3;
        }
        return lE2;
    }

    private lE_2(int n3) {
        int b2 = n3;
        lE_2 a2 = this;
        a2.weight = b2;
    }

    public static lE[] values() {
        return (lE[])$VALUES.clone();
    }

    public static lE valueOf(String a2) {
        return Enum.valueOf(lE_2.class, a2);
    }

    static {
        THIN = new lE_2(ySa.T);
        REGULAR = new lE_2(hra.i);
        BOLD = new lE_2(BQa.t);
        LONG = new lE_2(cra.I);
        lE_2[] lE_2Array = new lE_2[AQa.P];
        lE_2Array[uSa.E] = THIN;
        lE_2Array[vRa.d] = REGULAR;
        lE_2Array[uqa.g] = BOLD;
        lE_2Array[yRa.d] = LONG;
        $VALUES = lE_2Array;
    }
}

