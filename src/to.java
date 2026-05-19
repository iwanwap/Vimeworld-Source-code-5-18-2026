/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class to
extends Enum<to> {
    private static final /* synthetic */ to[] $VALUES;
    public static final /* enum */ to DATA_NOT_SET;
    private final int value;
    public static final /* enum */ to ENTITY;

    /*
     * Enabled aggressive block sorting
     */
    public static to forNumber(int a2) {
        switch (a2) {
            case 2: {
                return ENTITY;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    static {
        ENTITY = new to(uqa.g);
        DATA_NOT_SET = new to(uSa.E);
        to[] toArray = new to[uqa.g];
        toArray[uSa.E] = ENTITY;
        toArray[vRa.d] = DATA_NOT_SET;
        $VALUES = toArray;
    }

    @Deprecated
    public static to valueOf(int a2) {
        return to.forNumber(a2);
    }

    public static to[] values() {
        return (to[])$VALUES.clone();
    }

    public int getNumber() {
        to a2;
        return a2.value;
    }

    private to(int n3) {
        int b2 = n3;
        to a2 = this;
        a2.value = b2;
    }

    public static to valueOf(String a2) {
        return Enum.valueOf(to.class, a2);
    }
}

