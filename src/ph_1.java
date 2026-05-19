/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ph
 *  qG
 *  vRa
 */
public final class ph_1
extends Enum<ph> {
    public static final /* enum */ ph BOTTOM;
    public static final /* enum */ ph MIDDLE;
    public static final /* enum */ ph EYES;
    public static final /* enum */ ph TOP;
    private static final /* synthetic */ ph[] $VALUES;

    public static ph[] values() {
        return (ph[])$VALUES.clone();
    }

    static {
        TOP = new ph_1();
        EYES = new ph_1();
        MIDDLE = new ph_1();
        BOTTOM = new ph_1();
        ph_1[] ph_1Array = new ph_1[AQa.P];
        ph_1Array[uSa.E] = TOP;
        ph_1Array[vRa.d] = EYES;
        ph_1Array[uqa.g] = MIDDLE;
        ph_1Array[yRa.d] = BOTTOM;
        $VALUES = ph_1Array;
    }

    public static ph valueOf(String a2) {
        return Enum.valueOf(ph_1.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ph fromProto(yM a2) {
        switch (qG.j[a2.ordinal()]) {
            case 1: {
                return TOP;
            }
            case 2: {
                return EYES;
            }
            case 3: {
                return MIDDLE;
            }
            case 4: {
                return BOTTOM;
            }
        }
        return TOP;
    }

    private ph_1() {
        int a2 = n2;
        ph_1 ph_12 = this;
    }
}

