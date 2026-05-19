/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zi
 *  jO
 *  jh
 *  vRa
 */
public final class jh_1
extends Enum<jh> {
    public static final /* enum */ jh LINES;
    private static final /* synthetic */ jh[] $VALUES;
    public static final /* enum */ jh FILL;
    public static final /* enum */ jh POINTS;

    /*
     * Enabled aggressive block sorting
     */
    public static jh fromProto(jO a2) {
        switch (Zi.I[a2.ordinal()]) {
            case 1: {
                return LINES;
            }
            case 2: {
                return POINTS;
            }
        }
        return FILL;
    }

    static {
        FILL = new jh_1();
        LINES = new jh_1();
        POINTS = new jh_1();
        jh_1[] jh_1Array = new jh_1[yRa.d];
        jh_1Array[uSa.E] = FILL;
        jh_1Array[vRa.d] = LINES;
        jh_1Array[uqa.g] = POINTS;
        $VALUES = jh_1Array;
    }

    public static jh valueOf(String a2) {
        return Enum.valueOf(jh_1.class, a2);
    }

    private jh_1() {
        int a2 = n2;
        jh_1 jh_12 = this;
    }

    public static jh[] values() {
        return (jh[])$VALUES.clone();
    }
}

