/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vqa
 *  vRa
 */
public final class Vqa_3
extends Enum<Vqa> {
    public static final /* enum */ Vqa CONNECTED;
    private static final /* synthetic */ Vqa[] $VALUES;
    public static final /* enum */ Vqa CONNECTING;
    public static final /* enum */ Vqa RECONNECT;
    public static final /* enum */ Vqa IDLE;

    static {
        IDLE = new Vqa_3();
        CONNECTING = new Vqa_3();
        CONNECTED = new Vqa_3();
        RECONNECT = new Vqa_3();
        Vqa_3[] vqa_3Array = new Vqa_3[AQa.P];
        vqa_3Array[uSa.E] = IDLE;
        vqa_3Array[vRa.d] = CONNECTING;
        vqa_3Array[uqa.g] = CONNECTED;
        vqa_3Array[yRa.d] = RECONNECT;
        $VALUES = vqa_3Array;
    }

    public static Vqa[] values() {
        return (Vqa[])$VALUES.clone();
    }

    private Vqa_3() {
        int a2 = n2;
        Vqa_3 vqa_3 = this;
    }

    public static Vqa valueOf(String a2) {
        return Enum.valueOf(Vqa_3.class, a2);
    }
}

