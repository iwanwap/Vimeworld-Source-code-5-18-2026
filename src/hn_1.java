/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  hn
 *  vRa
 */
public final class hn_1
extends Enum<hn> {
    private final int value;
    public static final /* enum */ hn VALUE_NOT_SET;
    public static final /* enum */ hn BOOLVAL;
    public static final /* enum */ hn LONGVAL;
    public static final /* enum */ hn NULLVAL;
    public static final /* enum */ hn FLOATVAL;
    public static final /* enum */ hn STRINGVAL;
    private static final /* synthetic */ hn[] $VALUES;

    @Deprecated
    public static hn valueOf(int a2) {
        return hn_1.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static hn forNumber(int a2) {
        switch (a2) {
            case 3: {
                return LONGVAL;
            }
            case 4: {
                return BOOLVAL;
            }
            case 5: {
                return STRINGVAL;
            }
            case 6: {
                return FLOATVAL;
            }
            case 7: {
                return NULLVAL;
            }
            case 0: {
                return VALUE_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        hn_1 a2;
        return a2.value;
    }

    public static hn valueOf(String a2) {
        return Enum.valueOf(hn_1.class, a2);
    }

    private hn_1(int n3) {
        int b2 = n3;
        hn_1 a2 = this;
        a2.value = b2;
    }

    public static hn[] values() {
        return (hn[])$VALUES.clone();
    }

    static {
        LONGVAL = new hn_1(yRa.d);
        BOOLVAL = new hn_1(AQa.P);
        STRINGVAL = new hn_1(tTa.h);
        FLOATVAL = new hn_1(uua.p);
        NULLVAL = new hn_1(XTa.W);
        VALUE_NOT_SET = new hn_1(uSa.E);
        hn_1[] hn_1Array = new hn_1[uua.p];
        hn_1Array[uSa.E] = LONGVAL;
        hn_1Array[vRa.d] = BOOLVAL;
        hn_1Array[uqa.g] = STRINGVAL;
        hn_1Array[yRa.d] = FLOATVAL;
        hn_1Array[AQa.P] = NULLVAL;
        hn_1Array[tTa.h] = VALUE_NOT_SET;
        $VALUES = hn_1Array;
    }
}

