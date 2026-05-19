/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  LQa
 *  SQa
 *  XTa
 *  ZIa
 *  vRa
 */
public final class ZIa_1
extends Enum<ZIa> {
    private static final /* synthetic */ ZIa[] $VALUES;
    public static final /* enum */ ZIa NORMAL;
    public static final /* enum */ ZIa UV;
    private final String displayName;
    public static final /* enum */ ZIa BLEND_WEIGHT;
    public static final /* enum */ ZIa COLOR;
    public static final /* enum */ ZIa POSITION;
    public static final /* enum */ ZIa MATRIX;
    public static final /* enum */ ZIa PADDING;

    public String getDisplayName() {
        ZIa_1 a2;
        return a2.displayName;
    }

    private ZIa_1(String string2) {
        Object b2 = string2;
        ZIa_1 a2 = this;
        a2.displayName = b2;
    }

    public static ZIa valueOf(String a2) {
        return Enum.valueOf(ZIa_1.class, a2);
    }

    static {
        POSITION = new ZIa_1(qsa.q);
        NORMAL = new ZIa_1(EQa.I);
        COLOR = new ZIa_1(LQa.N);
        UV = new ZIa_1(SQa.o);
        MATRIX = new ZIa_1(SQa.a);
        BLEND_WEIGHT = new ZIa_1(LRa.Fa);
        PADDING = new ZIa_1(FRa.C);
        ZIa_1[] zIa_1Array = new ZIa_1[XTa.W];
        zIa_1Array[uSa.E] = POSITION;
        zIa_1Array[vRa.d] = NORMAL;
        zIa_1Array[uqa.g] = COLOR;
        zIa_1Array[yRa.d] = UV;
        zIa_1Array[AQa.P] = MATRIX;
        zIa_1Array[tTa.h] = BLEND_WEIGHT;
        zIa_1Array[uua.p] = PADDING;
        $VALUES = zIa_1Array;
    }

    public static ZIa[] values() {
        return (ZIa[])$VALUES.clone();
    }
}

