/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jpa
 *  vRa
 */
public final class HMa
extends Enum<HMa> {
    public static final /* enum */ HMa UNLOCKED;
    private static final /* synthetic */ HMa[] $VALUES;
    private final int field_178914_g;
    public static final /* enum */ HMa UNLOCKED_DISABLED;
    public static final /* enum */ HMa LOCKED_DISABLED;
    public static final /* enum */ HMa LOCKED_HOVER;
    public static final /* enum */ HMa LOCKED;
    private final int field_178920_h;
    public static final /* enum */ HMa UNLOCKED_HOVER;

    static {
        LOCKED = new HMa(uSa.E, sOa.x);
        LOCKED_HOVER = new HMa(uSa.E, UTa.R);
        LOCKED_DISABLED = new HMa(uSa.E, jpa.d);
        UNLOCKED = new HMa(kTa.j, sOa.x);
        UNLOCKED_HOVER = new HMa(kTa.j, UTa.R);
        UNLOCKED_DISABLED = new HMa(kTa.j, jpa.d);
        HMa[] hMaArray = new HMa[uua.p];
        hMaArray[uSa.E] = LOCKED;
        hMaArray[vRa.d] = LOCKED_HOVER;
        hMaArray[uqa.g] = LOCKED_DISABLED;
        hMaArray[yRa.d] = UNLOCKED;
        hMaArray[AQa.P] = UNLOCKED_HOVER;
        hMaArray[tTa.h] = UNLOCKED_DISABLED;
        $VALUES = hMaArray;
    }

    public int func_178912_b() {
        HMa a2;
        return a2.field_178920_h;
    }

    public int func_178910_a() {
        HMa a2;
        return a2.field_178914_g;
    }

    public static HMa[] values() {
        return (HMa[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private HMa(int n3, int n4) {
        void c2;
        void b2;
        HMa a2;
        int n5 = n4;
        HMa hMa = a2 = this;
        hMa.field_178914_g = b2;
        hMa.field_178920_h = c2;
    }

    public static HMa valueOf(String a2) {
        return Enum.valueOf(HMa.class, a2);
    }
}

