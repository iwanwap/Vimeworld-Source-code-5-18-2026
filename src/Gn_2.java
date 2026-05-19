/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gn
 *  vRa
 */
public final class Gn_2
extends Enum<Gn> {
    public static final /* enum */ Gn ANIMATION_NOT_SET;
    private final int value;
    public static final /* enum */ Gn CAMERAPATH;
    public static final /* enum */ Gn SCREENSHAKEANIMATION;
    private static final /* synthetic */ Gn[] $VALUES;

    public static Gn[] values() {
        return (Gn[])$VALUES.clone();
    }

    static {
        SCREENSHAKEANIMATION = new Gn_2(vRa.d);
        CAMERAPATH = new Gn_2(uqa.g);
        ANIMATION_NOT_SET = new Gn_2(uSa.E);
        Gn_2[] gn_2Array = new Gn_2[yRa.d];
        gn_2Array[uSa.E] = SCREENSHAKEANIMATION;
        gn_2Array[vRa.d] = CAMERAPATH;
        gn_2Array[uqa.g] = ANIMATION_NOT_SET;
        $VALUES = gn_2Array;
    }

    private Gn_2(int n3) {
        int b2 = n3;
        Gn_2 a2 = this;
        a2.value = b2;
    }

    public static Gn valueOf(String a2) {
        return Enum.valueOf(Gn_2.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Gn forNumber(int a2) {
        switch (a2) {
            case 1: {
                return SCREENSHAKEANIMATION;
            }
            case 2: {
                return CAMERAPATH;
            }
            case 0: {
                return ANIMATION_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static Gn valueOf(int a2) {
        return Gn_2.forNumber(a2);
    }

    public int getNumber() {
        Gn_2 a2;
        return a2.value;
    }
}

