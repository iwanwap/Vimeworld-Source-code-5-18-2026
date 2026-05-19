/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  yN
 */
public final class yN_1
extends Enum<yN> {
    private static final /* synthetic */ yN[] $VALUES;
    public static final /* enum */ yN TEXTUREPATH = new yN_1(yRa.d);
    private final int value;
    public static final /* enum */ yN TEXTURERESOURCE = new yN_1(AQa.P);
    public static final /* enum */ yN TEXTURE_NOT_SET = new yN_1(uSa.E);

    public int getNumber() {
        yN_1 a2;
        return a2.value;
    }

    public static yN[] values() {
        return (yN[])$VALUES.clone();
    }

    private yN_1(int n3) {
        int b2 = n3;
        yN_1 a2 = this;
        a2.value = b2;
    }

    public static yN valueOf(String a2) {
        return Enum.valueOf(yN_1.class, a2);
    }

    static {
        yN_1[] yN_1Array = new yN_1[yRa.d];
        yN_1Array[uSa.E] = TEXTUREPATH;
        yN_1Array[vRa.d] = TEXTURERESOURCE;
        yN_1Array[uqa.g] = TEXTURE_NOT_SET;
        $VALUES = yN_1Array;
    }

    @Deprecated
    public static yN valueOf(int a2) {
        return yN_1.forNumber(a2);
    }

    public static yN forNumber(int a2) {
        switch (a2) {
            case 3: {
                return TEXTUREPATH;
            }
            case 4: {
                return TEXTURERESOURCE;
            }
            case 0: {
                while (false) {
                }
                return TEXTURE_NOT_SET;
            }
        }
        return null;
    }
}

