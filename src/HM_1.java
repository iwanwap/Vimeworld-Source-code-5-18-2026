/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HM
 *  vRa
 */
public final class HM_1
extends Enum<HM> {
    private static final /* synthetic */ HM[] $VALUES;
    public static final /* enum */ HM PLAYPARTICLES = new HM_1(vRa.d);
    public static final /* enum */ HM STOPPARTICLES = new HM_1(uqa.g);
    private final int value;
    public static final /* enum */ HM ACTION_NOT_SET = new HM_1(uSa.E);

    public static HM[] values() {
        return (HM[])$VALUES.clone();
    }

    static {
        HM_1[] hM_1Array = new HM_1[yRa.d];
        hM_1Array[uSa.E] = PLAYPARTICLES;
        hM_1Array[vRa.d] = STOPPARTICLES;
        hM_1Array[uqa.g] = ACTION_NOT_SET;
        $VALUES = hM_1Array;
    }

    public static HM valueOf(String a2) {
        return Enum.valueOf(HM_1.class, a2);
    }

    @Deprecated
    public static HM valueOf(int a2) {
        return HM_1.forNumber(a2);
    }

    public int getNumber() {
        HM_1 a2;
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static HM forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PLAYPARTICLES;
            }
            case 2: {
                return STOPPARTICLES;
            }
            case 0: {
                return ACTION_NOT_SET;
            }
        }
        return null;
    }

    private HM_1(int n3) {
        int b2 = n3;
        HM_1 a2 = this;
        a2.value = b2;
    }
}

