/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qx
 *  vRa
 */
public final class Qx_3
extends Enum<Qx> {
    private static final /* synthetic */ Qx[] $VALUES;
    public static final /* enum */ Qx ALLOWED;
    public static final /* enum */ Qx ERROR;
    public static final /* enum */ Qx DENY;
    public static final /* enum */ Qx VALIDATING;

    public static Qx valueOf(String a2) {
        return Enum.valueOf(Qx_3.class, a2);
    }

    public static Qx[] values() {
        return (Qx[])$VALUES.clone();
    }

    static {
        VALIDATING = new Qx_3();
        ALLOWED = new Qx_3();
        DENY = new Qx_3();
        ERROR = new Qx_3();
        Qx_3[] qx_3Array = new Qx_3[AQa.P];
        qx_3Array[uSa.E] = VALIDATING;
        qx_3Array[vRa.d] = ALLOWED;
        qx_3Array[uqa.g] = DENY;
        qx_3Array[yRa.d] = ERROR;
        $VALUES = qx_3Array;
    }

    private Qx_3() {
        int a2 = n2;
        Qx_3 qx_3 = this;
    }
}

