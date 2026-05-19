/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eba
 *  vRa
 */
public final class Eba_2
extends Enum<Eba> {
    private static final /* synthetic */ Eba[] $VALUES;
    public static final /* enum */ Eba DECLINED;
    public static final /* enum */ Eba FAILED_DOWNLOAD;
    public static final /* enum */ Eba SUCCESSFULLY_LOADED;
    public static final /* enum */ Eba ACCEPTED;

    public static Eba[] values() {
        return (Eba[])$VALUES.clone();
    }

    private Eba_2() {
        int a2 = n2;
        Eba_2 eba_2 = this;
    }

    static {
        SUCCESSFULLY_LOADED = new Eba_2();
        DECLINED = new Eba_2();
        FAILED_DOWNLOAD = new Eba_2();
        ACCEPTED = new Eba_2();
        Eba_2[] eba_2Array = new Eba_2[AQa.P];
        eba_2Array[uSa.E] = SUCCESSFULLY_LOADED;
        eba_2Array[vRa.d] = DECLINED;
        eba_2Array[uqa.g] = FAILED_DOWNLOAD;
        eba_2Array[yRa.d] = ACCEPTED;
        $VALUES = eba_2Array;
    }

    public static Eba valueOf(String a2) {
        return Enum.valueOf(Eba_2.class, a2);
    }
}

