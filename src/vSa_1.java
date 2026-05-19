/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 *  vRa
 *  vSa
 */
public final class vSa_1
extends Enum<vSa> {
    private static final /* synthetic */ vSa[] $VALUES;
    public static final /* enum */ vSa Normal;
    public final int value;
    public static final /* enum */ vSa Low;
    public static final /* enum */ vSa High;

    public static vSa valueOf(String a2) {
        return Enum.valueOf(vSa_1.class, a2);
    }

    public static vSa[] values() {
        return (vSa[])$VALUES.clone();
    }

    static {
        High = new vSa_1(vRa.d);
        Normal = new vSa_1(uSa.E);
        Low = new vSa_1(pua.o);
        vSa_1[] vSa_1Array = new vSa_1[yRa.d];
        vSa_1Array[uSa.E] = High;
        vSa_1Array[vRa.d] = Normal;
        vSa_1Array[uqa.g] = Low;
        $VALUES = vSa_1Array;
    }

    private vSa_1(int n3) {
        int b2 = n3;
        vSa_1 a2 = this;
        a2.value = b2;
    }
}

