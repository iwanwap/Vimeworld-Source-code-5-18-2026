/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ng
 *  vRa
 */
public final class ng_3
extends Enum<ng> {
    public static final /* enum */ ng BestShortSideFit = new ng_3();
    private static final /* synthetic */ ng[] $VALUES;
    public static final /* enum */ ng ContactPointRule;
    public static final /* enum */ ng BestLongSideFit;
    public static final /* enum */ ng BottomLeftRule;
    public static final /* enum */ ng BestAreaFit;

    public static ng valueOf(String a2) {
        return Enum.valueOf(ng_3.class, a2);
    }

    public static ng[] values() {
        return (ng[])$VALUES.clone();
    }

    static {
        BestLongSideFit = new ng_3();
        BestAreaFit = new ng_3();
        BottomLeftRule = new ng_3();
        ContactPointRule = new ng_3();
        ng_3[] ng_3Array = new ng_3[tTa.h];
        ng_3Array[uSa.E] = BestShortSideFit;
        ng_3Array[vRa.d] = BestLongSideFit;
        ng_3Array[uqa.g] = BestAreaFit;
        ng_3Array[yRa.d] = BottomLeftRule;
        ng_3Array[AQa.P] = ContactPointRule;
        $VALUES = ng_3Array;
    }

    private ng_3() {
        int a2 = n2;
        ng_3 ng_32 = this;
    }
}

