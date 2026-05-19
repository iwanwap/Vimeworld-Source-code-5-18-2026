/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ig
 *  jF
 *  mD
 *  se
 *  vRa
 */
public abstract class ig_3
extends Enum<ig> {
    public static final /* enum */ ig CONSTANT = new se(vqa.Ja, uSa.E);
    private static final /* synthetic */ ig[] $VALUES;
    public static final /* enum */ ig LINEAR = new jF(gQa.l, vRa.d);
    public static final /* enum */ ig BEZIER = new Ne();

    private ig_3() {
        int a2 = n2;
        ig_3 ig_32 = this;
    }

    public static ig[] values() {
        return (ig[])$VALUES.clone();
    }

    public abstract float interpolate(qE var1, float var2, qE var3);

    public static ig valueOf(String a2) {
        return Enum.valueOf(ig_3.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ ig_3(String string, int n2, mD mD2) {
        void c2;
        int d2 = n2;
        ig_3 b2 = this;
        b2();
    }

    static {
        ig_3[] ig_3Array = new ig_3[yRa.d];
        ig_3Array[uSa.E] = CONSTANT;
        ig_3Array[vRa.d] = LINEAR;
        ig_3Array[uqa.g] = BEZIER;
        $VALUES = ig_3Array;
    }
}

