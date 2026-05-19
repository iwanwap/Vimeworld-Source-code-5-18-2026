/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  xBa
 */
public final class PJa_1 {
    private static final String A = "CL_00002435";
    public static final int[] I = new int[xBa.values().length];

    public PJa_1() {
        PJa_1 a2;
    }

    static {
        try {
            PJa_1.I[xBa.ALWAYS.ordinal()] = vRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PJa_1.I[xBa.NEVER.ordinal()] = uqa.g;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PJa_1.I[xBa.HIDE_FOR_OTHER_TEAMS.ordinal()] = yRa.d;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PJa_1.I[xBa.HIDE_FOR_OWN_TEAM.ordinal()] = AQa.P;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

