/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class aM
extends Enum<aM> {
    public static final /* enum */ aM STOPANIMATION;
    private static final /* synthetic */ aM[] $VALUES;
    public static final /* enum */ aM PLAYANIMATION;
    private final int value;
    public static final /* enum */ aM ACTION_NOT_SET;

    public int getNumber() {
        aM a2;
        return a2.value;
    }

    @Deprecated
    public static aM valueOf(int a2) {
        return aM.forNumber(a2);
    }

    public static aM forNumber(int a2) {
        switch (a2) {
            case 2: {
                return PLAYANIMATION;
            }
            case 3: {
                return STOPANIMATION;
            }
            case 0: {
                while (false) {
                }
                return ACTION_NOT_SET;
            }
        }
        return null;
    }

    public static aM[] values() {
        return (aM[])$VALUES.clone();
    }

    static {
        PLAYANIMATION = new aM(uqa.g);
        STOPANIMATION = new aM(yRa.d);
        ACTION_NOT_SET = new aM(uSa.E);
        aM[] aMArray = new aM[yRa.d];
        aMArray[uSa.E] = PLAYANIMATION;
        aMArray[vRa.d] = STOPANIMATION;
        aMArray[uqa.g] = ACTION_NOT_SET;
        $VALUES = aMArray;
    }

    public static aM valueOf(String a2) {
        return Enum.valueOf(aM.class, a2);
    }

    private aM(int n3) {
        int b2 = n3;
        aM a2 = this;
        a2.value = b2;
    }
}

