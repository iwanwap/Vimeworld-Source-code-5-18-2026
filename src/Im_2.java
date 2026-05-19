/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Im
 *  vRa
 */
public final class Im_2
extends Enum<Im> {
    public static final /* enum */ Im ACTION = new Im_2(AQa.P);
    private final int value;
    private static final /* synthetic */ Im[] $VALUES;
    public static final /* enum */ Im DATA_NOT_SET = new Im_2(uSa.E);

    /*
     * Enabled aggressive block sorting
     */
    public static Im forNumber(int a2) {
        switch (a2) {
            case 4: {
                return ACTION;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    public static Im valueOf(String a2) {
        return Enum.valueOf(Im_2.class, a2);
    }

    private Im_2(int n3) {
        int b2 = n3;
        Im_2 a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static Im valueOf(int a2) {
        return Im_2.forNumber(a2);
    }

    public int getNumber() {
        Im_2 a2;
        return a2.value;
    }

    static {
        Im_2[] im_2Array = new Im_2[uqa.g];
        im_2Array[uSa.E] = ACTION;
        im_2Array[vRa.d] = DATA_NOT_SET;
        $VALUES = im_2Array;
    }

    public static Im[] values() {
        return (Im[])$VALUES.clone();
    }
}

