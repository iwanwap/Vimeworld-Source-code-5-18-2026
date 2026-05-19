/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lk
 *  vRa
 */
public final class lk_2
extends Enum<lk> {
    public static final /* enum */ lk ENTITYTYPE;
    private static final /* synthetic */ lk[] $VALUES;
    private final int value;
    public static final /* enum */ lk BLOCK;
    public static final /* enum */ lk KEY;
    public static final /* enum */ lk DATA_NOT_SET;

    private lk_2(int n3) {
        int b2 = n3;
        lk_2 a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        lk_2 a2;
        return a2.value;
    }

    public static lk[] values() {
        return (lk[])$VALUES.clone();
    }

    public static lk forNumber(int a2) {
        switch (a2) {
            case 3: {
                return KEY;
            }
            case 4: {
                return BLOCK;
            }
            case 5: {
                return ENTITYTYPE;
            }
            case 0: {
                while (false) {
                }
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    static {
        KEY = new lk_2(yRa.d);
        BLOCK = new lk_2(AQa.P);
        ENTITYTYPE = new lk_2(tTa.h);
        DATA_NOT_SET = new lk_2(uSa.E);
        lk_2[] lk_2Array = new lk_2[AQa.P];
        lk_2Array[uSa.E] = KEY;
        lk_2Array[vRa.d] = BLOCK;
        lk_2Array[uqa.g] = ENTITYTYPE;
        lk_2Array[yRa.d] = DATA_NOT_SET;
        $VALUES = lk_2Array;
    }

    public static lk valueOf(String a2) {
        return Enum.valueOf(lk_2.class, a2);
    }

    @Deprecated
    public static lk valueOf(int a2) {
        return lk_2.forNumber(a2);
    }
}

