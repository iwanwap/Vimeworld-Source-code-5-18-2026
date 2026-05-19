/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZIa
 *  vRa
 */
public final class FJa_1 {
    private static final String A = "CL_00002535";
    public static final int[] I = new int[ZIa.values().length];

    public FJa_1() {
        FJa_1 a2;
    }

    static {
        try {
            FJa_1.I[ZIa.POSITION.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FJa_1.I[ZIa.UV.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            FJa_1.I[ZIa.COLOR.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

