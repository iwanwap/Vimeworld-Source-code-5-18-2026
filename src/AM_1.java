/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AM
 *  vRa
 */
public final class AM_1
extends Enum<AM> {
    public static final /* enum */ AM RADIUS = new AM_1(tTa.h);
    private static final /* synthetic */ AM[] $VALUES;
    public static final /* enum */ AM RADIUSANIM = new AM_1(uua.p);
    public static final /* enum */ AM RADIUSVAL_NOT_SET = new AM_1(uSa.E);
    private final int value;

    private AM_1(int n3) {
        int b2 = n3;
        AM_1 a2 = this;
        a2.value = b2;
    }

    static {
        AM_1[] aM_1Array = new AM_1[yRa.d];
        aM_1Array[uSa.E] = RADIUS;
        aM_1Array[vRa.d] = RADIUSANIM;
        aM_1Array[uqa.g] = RADIUSVAL_NOT_SET;
        $VALUES = aM_1Array;
    }

    public static AM valueOf(String a2) {
        return Enum.valueOf(AM_1.class, a2);
    }

    public static AM[] values() {
        return (AM[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static AM forNumber(int a2) {
        switch (a2) {
            case 5: {
                return RADIUS;
            }
            case 6: {
                return RADIUSANIM;
            }
            case 0: {
                return RADIUSVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        AM_1 a2;
        return a2.value;
    }

    @Deprecated
    public static AM valueOf(int a2) {
        return AM_1.forNumber(a2);
    }
}

