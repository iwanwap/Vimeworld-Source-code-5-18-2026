/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gda
 *  vRa
 */
public final class Gda_1
extends Enum<Gda> {
    public static final /* enum */ Gda DROP_ALL_ITEMS;
    public static final /* enum */ Gda STOP_DESTROY_BLOCK;
    public static final /* enum */ Gda ABORT_DESTROY_BLOCK;
    public static final /* enum */ Gda RELEASE_USE_ITEM;
    public static final /* enum */ Gda DROP_ITEM;
    private static final /* synthetic */ Gda[] $VALUES;
    public static final /* enum */ Gda START_DESTROY_BLOCK;

    static {
        START_DESTROY_BLOCK = new Gda_1();
        ABORT_DESTROY_BLOCK = new Gda_1();
        STOP_DESTROY_BLOCK = new Gda_1();
        DROP_ALL_ITEMS = new Gda_1();
        DROP_ITEM = new Gda_1();
        RELEASE_USE_ITEM = new Gda_1();
        Gda_1[] gda_1Array = new Gda_1[uua.p];
        gda_1Array[uSa.E] = START_DESTROY_BLOCK;
        gda_1Array[vRa.d] = ABORT_DESTROY_BLOCK;
        gda_1Array[uqa.g] = STOP_DESTROY_BLOCK;
        gda_1Array[yRa.d] = DROP_ALL_ITEMS;
        gda_1Array[AQa.P] = DROP_ITEM;
        gda_1Array[tTa.h] = RELEASE_USE_ITEM;
        $VALUES = gda_1Array;
    }

    public static Gda[] values() {
        return (Gda[])$VALUES.clone();
    }

    public static Gda valueOf(String a2) {
        return Enum.valueOf(Gda_1.class, a2);
    }

    private Gda_1() {
        int a2 = n2;
        Gda_1 gda_1 = this;
    }
}

