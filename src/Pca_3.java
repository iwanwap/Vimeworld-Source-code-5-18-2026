/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pca
 *  vRa
 */
public final class Pca_3
extends Enum<Pca> {
    public static final /* enum */ Pca SET_CENTER;
    private static final /* synthetic */ Pca[] $VALUES;
    public static final /* enum */ Pca INITIALIZE;
    public static final /* enum */ Pca SET_SIZE;
    public static final /* enum */ Pca SET_WARNING_TIME;
    public static final /* enum */ Pca LERP_SIZE;
    public static final /* enum */ Pca SET_WARNING_BLOCKS;

    static {
        SET_SIZE = new Pca_3();
        LERP_SIZE = new Pca_3();
        SET_CENTER = new Pca_3();
        INITIALIZE = new Pca_3();
        SET_WARNING_TIME = new Pca_3();
        SET_WARNING_BLOCKS = new Pca_3();
        Pca_3[] pca_3Array = new Pca_3[uua.p];
        pca_3Array[uSa.E] = SET_SIZE;
        pca_3Array[vRa.d] = LERP_SIZE;
        pca_3Array[uqa.g] = SET_CENTER;
        pca_3Array[yRa.d] = INITIALIZE;
        pca_3Array[AQa.P] = SET_WARNING_TIME;
        pca_3Array[tTa.h] = SET_WARNING_BLOCKS;
        $VALUES = pca_3Array;
    }

    private Pca_3() {
        int a2 = n2;
        Pca_3 pca_3 = this;
    }

    public static Pca valueOf(String a2) {
        return Enum.valueOf(Pca_3.class, a2);
    }

    public static Pca[] values() {
        return (Pca[])$VALUES.clone();
    }
}

