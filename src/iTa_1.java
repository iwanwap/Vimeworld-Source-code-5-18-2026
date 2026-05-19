/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  iTa
 *  vRa
 */
public final class iTa_1
extends Enum<iTa> {
    private static final /* synthetic */ iTa[] $VALUES;
    public static final /* enum */ iTa START = new iTa_1();
    public static final /* enum */ iTa END = new iTa_1();

    static {
        iTa_1[] iTa_1Array = new iTa_1[uqa.g];
        iTa_1Array[uSa.E] = START;
        iTa_1Array[vRa.d] = END;
        $VALUES = iTa_1Array;
    }

    private iTa_1() {
        int a2 = n2;
        iTa_1 iTa_12 = this;
    }

    public static iTa[] values() {
        return (iTa[])$VALUES.clone();
    }

    public static iTa valueOf(String a2) {
        return Enum.valueOf(iTa_1.class, a2);
    }
}

