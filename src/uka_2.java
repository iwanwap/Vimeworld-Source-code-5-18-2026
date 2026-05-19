/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uka
 *  vRa
 */
public final class uka_2
extends Enum<uka> {
    private static final /* synthetic */ uka[] $VALUES;
    public static final /* enum */ uka UPLOADING;
    public static final /* enum */ uka DONE;
    public static final /* enum */ uka COMPILING;
    public static final /* enum */ uka PENDING;

    public static uka[] values() {
        return (uka[])$VALUES.clone();
    }

    static {
        PENDING = new uka_2();
        COMPILING = new uka_2();
        UPLOADING = new uka_2();
        DONE = new uka_2();
        uka_2[] uka_2Array = new uka_2[AQa.P];
        uka_2Array[uSa.E] = PENDING;
        uka_2Array[vRa.d] = COMPILING;
        uka_2Array[uqa.g] = UPLOADING;
        uka_2Array[yRa.d] = DONE;
        $VALUES = uka_2Array;
    }

    public static uka valueOf(String a2) {
        return Enum.valueOf(uka_2.class, a2);
    }

    private uka_2() {
        int a2 = n2;
        uka_2 uka_22 = this;
    }
}

