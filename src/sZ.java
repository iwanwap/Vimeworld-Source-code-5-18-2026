/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bua
 *  fsa
 *  vRa
 */
public final class sZ
extends Enum<sZ> {
    public static final /* enum */ sZ EASY;
    private static final sZ[] difficultyEnums;
    public static final /* enum */ sZ HARD;
    public static final /* enum */ sZ PEACEFUL;
    private final String difficultyResourceKey;
    public static final /* enum */ sZ NORMAL;
    private final int difficultyId;
    private static final /* synthetic */ sZ[] $VALUES;

    public String getDifficultyResourceKey() {
        sZ a2;
        return a2.difficultyResourceKey;
    }

    static {
        int n2;
        PEACEFUL = new sZ(uSa.E, fsa.B);
        EASY = new sZ(vRa.d, xSa.i);
        NORMAL = new sZ(uqa.g, bua.X);
        HARD = new sZ(yRa.d, sOa.V);
        sZ[] sZArray = new sZ[AQa.P];
        sZArray[uSa.E] = PEACEFUL;
        sZArray[vRa.d] = EASY;
        sZArray[uqa.g] = NORMAL;
        sZArray[yRa.d] = HARD;
        $VALUES = sZArray;
        difficultyEnums = new sZ[sZ.values().length];
        sZ[] sZArray2 = sZ.values();
        int n3 = sZArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            sZ sZ2;
            sZ.difficultyEnums[sZ2.difficultyId] = sZ2 = sZArray2[n2];
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private sZ(int n3, String string2) {
        Object c2;
        void b2;
        sZ a2;
        sZ sZ2 = object;
        Object object = string2;
        sZ sZ3 = a2 = sZ2;
        sZ3.difficultyId = b2;
        sZ3.difficultyResourceKey = c2;
    }

    public static sZ valueOf(String a2) {
        return Enum.valueOf(sZ.class, a2);
    }

    public static sZ[] values() {
        return (sZ[])$VALUES.clone();
    }

    public static sZ getDifficultyEnum(int a2) {
        return difficultyEnums[a2 % difficultyEnums.length];
    }

    public int getDifficultyId() {
        sZ a2;
        return a2.difficultyId;
    }
}

