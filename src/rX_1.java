/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rX
 *  vRa
 */
public final class rX_1
extends Enum<rX> {
    public static final /* enum */ rX ACCEPTED;
    public static final /* enum */ rX AUTHENTICATING;
    public static final /* enum */ rX KEY;
    public static final /* enum */ rX READY_TO_ACCEPT;
    public static final /* enum */ rX HELLO;
    private static final /* synthetic */ rX[] $VALUES;
    public static final /* enum */ rX DELAY_ACCEPT;

    public static rX[] values() {
        return (rX[])$VALUES.clone();
    }

    static {
        HELLO = new rX_1();
        KEY = new rX_1();
        AUTHENTICATING = new rX_1();
        READY_TO_ACCEPT = new rX_1();
        DELAY_ACCEPT = new rX_1();
        ACCEPTED = new rX_1();
        rX_1[] rX_1Array = new rX_1[uua.p];
        rX_1Array[uSa.E] = HELLO;
        rX_1Array[vRa.d] = KEY;
        rX_1Array[uqa.g] = AUTHENTICATING;
        rX_1Array[yRa.d] = READY_TO_ACCEPT;
        rX_1Array[AQa.P] = DELAY_ACCEPT;
        rX_1Array[tTa.h] = ACCEPTED;
        $VALUES = rX_1Array;
    }

    public static rX valueOf(String a2) {
        return Enum.valueOf(rX_1.class, a2);
    }

    private rX_1() {
        int a2 = n2;
        rX_1 rX_12 = this;
    }
}

