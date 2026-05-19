/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DS
 *  vRa
 */
public final class DS_1
extends Enum<DS> {
    private static final /* synthetic */ DS[] $VALUES;
    public static final /* enum */ DS SCALE;
    public static final /* enum */ DS ROTATION;
    public static final /* enum */ DS POSITION;

    public static DS valueOf(String a2) {
        return Enum.valueOf(DS_1.class, a2);
    }

    static {
        POSITION = new DS_1();
        ROTATION = new DS_1();
        SCALE = new DS_1();
        DS_1[] dS_1Array = new DS_1[yRa.d];
        dS_1Array[uSa.E] = POSITION;
        dS_1Array[vRa.d] = ROTATION;
        dS_1Array[uqa.g] = SCALE;
        $VALUES = dS_1Array;
    }

    private DS_1() {
        int a2 = n2;
        DS_1 dS_1 = this;
    }

    public static DS[] values() {
        return (DS[])$VALUES.clone();
    }
}

