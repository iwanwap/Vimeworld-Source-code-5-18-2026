/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  bm
 *  pPa
 *  vRa
 */
public final class bm_3
extends Enum<bm> {
    public static final /* enum */ bm TEXTURE_NOT_SET;
    private static final /* synthetic */ bm[] $VALUES;
    private final int value;
    public static final /* enum */ bm TEXTUREPATH;
    public static final /* enum */ bm TEXTURERESOURCE;

    public int getNumber() {
        bm_3 a2;
        return a2.value;
    }

    static {
        TEXTURERESOURCE = new bm_3(NTa.C);
        TEXTUREPATH = new bm_3(pPa.f);
        TEXTURE_NOT_SET = new bm_3(uSa.E);
        bm_3[] bm_3Array = new bm_3[yRa.d];
        bm_3Array[uSa.E] = TEXTURERESOURCE;
        bm_3Array[vRa.d] = TEXTUREPATH;
        bm_3Array[uqa.g] = TEXTURE_NOT_SET;
        $VALUES = bm_3Array;
    }

    @Deprecated
    public static bm valueOf(int a2) {
        return bm_3.forNumber(a2);
    }

    private bm_3(int n3) {
        int b2 = n3;
        bm_3 a2 = this;
        a2.value = b2;
    }

    public static bm valueOf(String a2) {
        return Enum.valueOf(bm_3.class, a2);
    }

    public static bm[] values() {
        return (bm[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bm forNumber(int a2) {
        switch (a2) {
            case 10: {
                return TEXTURERESOURCE;
            }
            case 11: {
                return TEXTUREPATH;
            }
            case 0: {
                return TEXTURE_NOT_SET;
            }
        }
        return null;
    }
}

