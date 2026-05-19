/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RCa
 *  vRa
 */
public final class RCa_3
extends Enum<RCa> {
    private static final /* synthetic */ RCa[] $VALUES;
    public static final /* enum */ RCa CLIENTBOUND;
    public static final /* enum */ RCa SERVERBOUND;

    public static RCa[] values() {
        return (RCa[])$VALUES.clone();
    }

    private RCa_3() {
        int a2 = n2;
        RCa_3 rCa_3 = this;
    }

    public static RCa valueOf(String a2) {
        return Enum.valueOf(RCa_3.class, a2);
    }

    static {
        SERVERBOUND = new RCa_3();
        CLIENTBOUND = new RCa_3();
        RCa_3[] rCa_3Array = new RCa_3[uqa.g];
        rCa_3Array[uSa.E] = SERVERBOUND;
        rCa_3Array[vRa.d] = CLIENTBOUND;
        $VALUES = rCa_3Array;
    }
}

