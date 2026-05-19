/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  fba
 *  vRa
 */
public final class fba_1
extends Enum<fba> {
    public static final /* enum */ fba STOP_SLEEPING;
    private static final /* synthetic */ fba[] $VALUES;
    public static final /* enum */ fba RIDING_JUMP;
    public static final /* enum */ fba STOP_SNEAKING;
    public static final /* enum */ fba OPEN_INVENTORY;
    public static final /* enum */ fba STOP_SPRINTING;
    public static final /* enum */ fba START_SNEAKING;
    public static final /* enum */ fba START_SPRINTING;

    static {
        START_SNEAKING = new fba_1();
        STOP_SNEAKING = new fba_1();
        STOP_SLEEPING = new fba_1();
        START_SPRINTING = new fba_1();
        STOP_SPRINTING = new fba_1();
        RIDING_JUMP = new fba_1();
        OPEN_INVENTORY = new fba_1();
        fba_1[] fba_1Array = new fba_1[XTa.W];
        fba_1Array[uSa.E] = START_SNEAKING;
        fba_1Array[vRa.d] = STOP_SNEAKING;
        fba_1Array[uqa.g] = STOP_SLEEPING;
        fba_1Array[yRa.d] = START_SPRINTING;
        fba_1Array[AQa.P] = STOP_SPRINTING;
        fba_1Array[tTa.h] = RIDING_JUMP;
        fba_1Array[uua.p] = OPEN_INVENTORY;
        $VALUES = fba_1Array;
    }

    public static fba valueOf(String a2) {
        return Enum.valueOf(fba_1.class, a2);
    }

    public static fba[] values() {
        return (fba[])$VALUES.clone();
    }

    private fba_1() {
        int a2 = n2;
        fba_1 fba_12 = this;
    }
}

