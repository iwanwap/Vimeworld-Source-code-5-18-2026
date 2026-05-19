/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rh
 *  vRa
 */
public final class rh_3
extends Enum<rh> {
    private static final /* synthetic */ rh[] $VALUES;
    public static final /* enum */ rh LOADING = new rh_3();
    public static final /* enum */ rh READY = new rh_3();
    public static final /* enum */ rh ERROR = new rh_3();

    static {
        rh_3[] rh_3Array = new rh_3[yRa.d];
        rh_3Array[uSa.E] = LOADING;
        rh_3Array[vRa.d] = READY;
        rh_3Array[uqa.g] = ERROR;
        $VALUES = rh_3Array;
    }

    public static rh[] values() {
        return (rh[])$VALUES.clone();
    }

    public static rh valueOf(String a2) {
        return Enum.valueOf(rh_3.class, a2);
    }

    private rh_3() {
        int a2 = n2;
        rh_3 rh_32 = this;
    }
}

