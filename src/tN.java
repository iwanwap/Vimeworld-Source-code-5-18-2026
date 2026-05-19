/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class tN
extends Enum<tN> {
    private final int value;
    private static final /* synthetic */ tN[] $VALUES;
    public static final /* enum */ tN RESOURCE;
    public static final /* enum */ tN PATH;
    public static final /* enum */ tN SOUND_NOT_SET;

    static {
        PATH = new tN(vRa.d);
        RESOURCE = new tN(uqa.g);
        SOUND_NOT_SET = new tN(uSa.E);
        tN[] tNArray = new tN[yRa.d];
        tNArray[uSa.E] = PATH;
        tNArray[vRa.d] = RESOURCE;
        tNArray[uqa.g] = SOUND_NOT_SET;
        $VALUES = tNArray;
    }

    public static tN[] values() {
        return (tN[])$VALUES.clone();
    }

    public int getNumber() {
        tN a2;
        return a2.value;
    }

    @Deprecated
    public static tN valueOf(int a2) {
        return tN.forNumber(a2);
    }

    public static tN valueOf(String a2) {
        return Enum.valueOf(tN.class, a2);
    }

    private tN(int n3) {
        int b2 = n3;
        tN a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static tN forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PATH;
            }
            case 2: {
                return RESOURCE;
            }
            case 0: {
                return SOUND_NOT_SET;
            }
        }
        return null;
    }
}

