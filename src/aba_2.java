/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aba
 *  vRa
 */
public final class aba_2
extends Enum<aba> {
    public static final /* enum */ aba RESET;
    private static final /* synthetic */ aba[] $VALUES;
    public static final /* enum */ aba SUBTITLE;
    public static final /* enum */ aba TITLE;
    public static final /* enum */ aba CLEAR;
    public static final /* enum */ aba TIMES;

    static {
        TITLE = new aba_2();
        SUBTITLE = new aba_2();
        TIMES = new aba_2();
        CLEAR = new aba_2();
        RESET = new aba_2();
        aba_2[] aba_2Array = new aba_2[tTa.h];
        aba_2Array[uSa.E] = TITLE;
        aba_2Array[vRa.d] = SUBTITLE;
        aba_2Array[uqa.g] = TIMES;
        aba_2Array[yRa.d] = CLEAR;
        aba_2Array[AQa.P] = RESET;
        $VALUES = aba_2Array;
    }

    public static String[] getNames() {
        int n2;
        String[] stringArray = new String[aba_2.values().length];
        int n3 = uSa.E;
        aba[] abaArray = aba_2.values();
        int n4 = abaArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            aba aba2 = abaArray[n2];
            stringArray[n3++] = aba2.name().toLowerCase();
            n5 = ++n2;
        }
        return stringArray;
    }

    public static aba byName(String string) {
        int a2;
        String string2 = string;
        aba[] abaArray = aba_2.values();
        int n2 = abaArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            aba aba2 = abaArray[a2];
            if (aba2.name().equalsIgnoreCase(string2)) {
                return aba2;
            }
            n3 = ++a2;
        }
        return TITLE;
    }

    public static aba valueOf(String a2) {
        return Enum.valueOf(aba_2.class, a2);
    }

    private aba_2() {
        int a2 = n2;
        aba_2 aba_22 = this;
    }

    public static aba[] values() {
        return (aba[])$VALUES.clone();
    }
}

