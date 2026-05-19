/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  Xja
 *  vRa
 */
public final class Xja_3
extends Enum<Xja> {
    public static final /* enum */ Xja GROUND;
    public static final /* enum */ Xja FIXED;
    public static final /* enum */ Xja FIRST_PERSON;
    public static final /* enum */ Xja NONE;
    public static final /* enum */ Xja THIRD_PERSON;
    public static final /* enum */ Xja GUI;
    public static final /* enum */ Xja HEAD;
    private static final /* synthetic */ Xja[] $VALUES;

    private Xja_3() {
        int a2 = n2;
        Xja_3 xja_3 = this;
    }

    public static Xja[] values() {
        return (Xja[])$VALUES.clone();
    }

    public static Xja valueOf(String a2) {
        return Enum.valueOf(Xja_3.class, a2);
    }

    static {
        NONE = new Xja_3();
        THIRD_PERSON = new Xja_3();
        FIRST_PERSON = new Xja_3();
        HEAD = new Xja_3();
        GUI = new Xja_3();
        GROUND = new Xja_3();
        FIXED = new Xja_3();
        Xja_3[] xja_3Array = new Xja_3[XTa.W];
        xja_3Array[uSa.E] = NONE;
        xja_3Array[vRa.d] = THIRD_PERSON;
        xja_3Array[uqa.g] = FIRST_PERSON;
        xja_3Array[yRa.d] = HEAD;
        xja_3Array[AQa.P] = GUI;
        xja_3Array[tTa.h] = GROUND;
        xja_3Array[uua.p] = FIXED;
        $VALUES = xja_3Array;
    }
}

