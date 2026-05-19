/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ufa
 *  vRa
 */
public final class ufa_1
extends Enum<ufa> {
    public static final /* enum */ ufa OTHER_PROBLEM;
    public static final /* enum */ ufa NOT_POSSIBLE_NOW;
    public static final /* enum */ ufa NOT_SAFE;
    public static final /* enum */ ufa TOO_FAR_AWAY;
    private static final /* synthetic */ ufa[] $VALUES;
    public static final /* enum */ ufa OK;
    public static final /* enum */ ufa NOT_POSSIBLE_HERE;

    public static ufa[] values() {
        return (ufa[])$VALUES.clone();
    }

    public static ufa valueOf(String a2) {
        return Enum.valueOf(ufa_1.class, a2);
    }

    static {
        OK = new ufa_1();
        NOT_POSSIBLE_HERE = new ufa_1();
        NOT_POSSIBLE_NOW = new ufa_1();
        TOO_FAR_AWAY = new ufa_1();
        OTHER_PROBLEM = new ufa_1();
        NOT_SAFE = new ufa_1();
        ufa_1[] ufa_1Array = new ufa_1[uua.p];
        ufa_1Array[uSa.E] = OK;
        ufa_1Array[vRa.d] = NOT_POSSIBLE_HERE;
        ufa_1Array[uqa.g] = NOT_POSSIBLE_NOW;
        ufa_1Array[yRa.d] = TOO_FAR_AWAY;
        ufa_1Array[AQa.P] = OTHER_PROBLEM;
        ufa_1Array[tTa.h] = NOT_SAFE;
        $VALUES = ufa_1Array;
    }

    private ufa_1() {
        int a2 = n2;
        ufa_1 ufa_12 = this;
    }
}

