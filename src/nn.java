/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class nn
extends Enum<nn> {
    public static final /* enum */ nn IMAGEDATA;
    public static final /* enum */ nn PATH;
    public static final /* enum */ nn RESOURCE;
    private static final /* synthetic */ nn[] $VALUES;
    private final int value;
    public static final /* enum */ nn IMAGE_NOT_SET;

    public static nn valueOf(String a2) {
        return Enum.valueOf(nn.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static nn forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PATH;
            }
            case 2: {
                return RESOURCE;
            }
            case 3: {
                return IMAGEDATA;
            }
            case 0: {
                return IMAGE_NOT_SET;
            }
        }
        return null;
    }

    private nn(int n3) {
        int b2 = n3;
        nn a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static nn valueOf(int a2) {
        return nn.forNumber(a2);
    }

    static {
        PATH = new nn(vRa.d);
        RESOURCE = new nn(uqa.g);
        IMAGEDATA = new nn(yRa.d);
        IMAGE_NOT_SET = new nn(uSa.E);
        nn[] nnArray = new nn[AQa.P];
        nnArray[uSa.E] = PATH;
        nnArray[vRa.d] = RESOURCE;
        nnArray[uqa.g] = IMAGEDATA;
        nnArray[yRa.d] = IMAGE_NOT_SET;
        $VALUES = nnArray;
    }

    public int getNumber() {
        nn a2;
        return a2.value;
    }

    public static nn[] values() {
        return (nn[])$VALUES.clone();
    }
}

