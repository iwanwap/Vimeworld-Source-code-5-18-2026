/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hn
 *  vRa
 */
public final class Hn_2
extends Enum<Hn> {
    public static final /* enum */ Hn IMAGEPATH = new Hn_2(EPa.O);
    public static final /* enum */ Hn IMAGE_NOT_SET;
    private final int value;
    private static final /* synthetic */ Hn[] $VALUES;
    public static final /* enum */ Hn RESOURCE;

    static {
        RESOURCE = new Hn_2(ITa.A);
        IMAGE_NOT_SET = new Hn_2(uSa.E);
        Hn_2[] hn_2Array = new Hn_2[yRa.d];
        hn_2Array[uSa.E] = IMAGEPATH;
        hn_2Array[vRa.d] = RESOURCE;
        hn_2Array[uqa.g] = IMAGE_NOT_SET;
        $VALUES = hn_2Array;
    }

    public static Hn[] values() {
        return (Hn[])$VALUES.clone();
    }

    @Deprecated
    public static Hn valueOf(int a2) {
        return Hn_2.forNumber(a2);
    }

    private Hn_2(int n3) {
        int b2 = n3;
        Hn_2 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Hn forNumber(int a2) {
        switch (a2) {
            case 28: {
                return IMAGEPATH;
            }
            case 29: {
                return RESOURCE;
            }
            case 0: {
                return IMAGE_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        Hn_2 a2;
        return a2.value;
    }

    public static Hn valueOf(String a2) {
        return Enum.valueOf(Hn_2.class, a2);
    }
}

