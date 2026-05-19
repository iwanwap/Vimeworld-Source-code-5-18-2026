/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  vs
 */
public final class vs_1
extends Enum<vs> {
    public static final /* enum */ vs LOADED;
    public static final /* enum */ vs NOT_LOADED;
    public static final /* enum */ vs FAILED;
    private static final /* synthetic */ vs[] $VALUES;

    static {
        NOT_LOADED = new vs_1();
        LOADED = new vs_1();
        FAILED = new vs_1();
        vs_1[] vs_1Array = new vs_1[yRa.d];
        vs_1Array[uSa.E] = NOT_LOADED;
        vs_1Array[vRa.d] = LOADED;
        vs_1Array[uqa.g] = FAILED;
        $VALUES = vs_1Array;
    }

    private vs_1() {
        int a2 = n2;
        vs_1 vs_12 = this;
    }

    public static vs[] values() {
        return (vs[])$VALUES.clone();
    }

    public static vs valueOf(String a2) {
        return Enum.valueOf(vs_1.class, a2);
    }
}

