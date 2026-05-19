/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RI
 *  vRa
 */
public final class RI_3
extends Enum<RI> {
    public static final /* enum */ RI URL = new RI_3();
    public static final /* enum */ RI CLOSE_GUI;
    public static final /* enum */ RI CHAT;
    public static final /* enum */ RI SCRIPT;
    public static final /* enum */ RI CALLBACK;
    private static final /* synthetic */ RI[] $VALUES;

    static {
        CHAT = new RI_3();
        CALLBACK = new RI_3();
        SCRIPT = new RI_3();
        CLOSE_GUI = new RI_3();
        RI_3[] rI_3Array = new RI_3[tTa.h];
        rI_3Array[uSa.E] = URL;
        rI_3Array[vRa.d] = CHAT;
        rI_3Array[uqa.g] = CALLBACK;
        rI_3Array[yRa.d] = SCRIPT;
        rI_3Array[AQa.P] = CLOSE_GUI;
        $VALUES = rI_3Array;
    }

    public static RI[] values() {
        return (RI[])$VALUES.clone();
    }

    private RI_3() {
        int a2 = n2;
        RI_3 rI_3 = this;
    }

    public static RI valueOf(String a2) {
        return Enum.valueOf(RI_3.class, a2);
    }
}

