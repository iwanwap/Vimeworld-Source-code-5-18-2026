/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hy
 *  vRa
 */
public final class hy_1
extends Enum<hy> {
    public static final /* enum */ hy ENTITYBLOCK_ANIMATED;
    private static final /* synthetic */ hy[] $VALUES;
    public static final /* enum */ hy LIQUID;
    public static final /* enum */ hy INVISIBLE;
    public static final /* enum */ hy MODEL;

    private hy_1() {
        int a2 = n2;
        hy_1 hy_12 = this;
    }

    static {
        INVISIBLE = new hy_1();
        LIQUID = new hy_1();
        ENTITYBLOCK_ANIMATED = new hy_1();
        MODEL = new hy_1();
        hy_1[] hy_1Array = new hy_1[AQa.P];
        hy_1Array[uSa.E] = INVISIBLE;
        hy_1Array[vRa.d] = LIQUID;
        hy_1Array[uqa.g] = ENTITYBLOCK_ANIMATED;
        hy_1Array[yRa.d] = MODEL;
        $VALUES = hy_1Array;
    }

    public static hy[] values() {
        return (hy[])$VALUES.clone();
    }

    public static hy valueOf(String a2) {
        return Enum.valueOf(hy_1.class, a2);
    }
}

