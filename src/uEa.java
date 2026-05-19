/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class uEa
extends Enum<uEa> {
    public static final /* enum */ uEa HEAD;
    private static final /* synthetic */ uEa[] $VALUES;
    public static final /* enum */ uEa LEGS;
    public static final /* enum */ uEa FEET;
    public static final /* enum */ uEa HAND;
    public static final /* enum */ uEa CHEST;

    public static uEa[] values() {
        return (uEa[])$VALUES.clone();
    }

    public static uEa valueOf(String a2) {
        return Enum.valueOf(uEa.class, a2);
    }

    static {
        HAND = new uEa();
        FEET = new uEa();
        LEGS = new uEa();
        CHEST = new uEa();
        HEAD = new uEa();
        uEa[] uEaArray = new uEa[tTa.h];
        uEaArray[uSa.E] = HAND;
        uEaArray[vRa.d] = FEET;
        uEaArray[uqa.g] = LEGS;
        uEaArray[yRa.d] = CHEST;
        uEaArray[AQa.P] = HEAD;
        $VALUES = uEaArray;
    }

    private uEa() {
        int a2 = n2;
        uEa uEa2 = this;
    }
}

