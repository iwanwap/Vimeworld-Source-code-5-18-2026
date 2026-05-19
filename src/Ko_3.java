/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ko
 *  vRa
 */
public final class Ko_3
extends Enum<Ko> {
    public static final /* enum */ Ko MODELPATH = new Ko_3(tTa.h);
    public static final /* enum */ Ko MODEL_NOT_SET;
    private final int value;
    private static final /* synthetic */ Ko[] $VALUES;
    public static final /* enum */ Ko MODELRESOURCE;

    @Deprecated
    public static Ko valueOf(int a2) {
        return Ko_3.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Ko forNumber(int a2) {
        switch (a2) {
            case 5: {
                return MODELPATH;
            }
            case 6: {
                return MODELRESOURCE;
            }
            case 0: {
                return MODEL_NOT_SET;
            }
        }
        return null;
    }

    static {
        MODELRESOURCE = new Ko_3(uua.p);
        MODEL_NOT_SET = new Ko_3(uSa.E);
        Ko_3[] ko_3Array = new Ko_3[yRa.d];
        ko_3Array[uSa.E] = MODELPATH;
        ko_3Array[vRa.d] = MODELRESOURCE;
        ko_3Array[uqa.g] = MODEL_NOT_SET;
        $VALUES = ko_3Array;
    }

    public static Ko valueOf(String a2) {
        return Enum.valueOf(Ko_3.class, a2);
    }

    public int getNumber() {
        Ko_3 a2;
        return a2.value;
    }

    private Ko_3(int n3) {
        int b2 = n3;
        Ko_3 a2 = this;
        a2.value = b2;
    }

    public static Ko[] values() {
        return (Ko[])$VALUES.clone();
    }
}

