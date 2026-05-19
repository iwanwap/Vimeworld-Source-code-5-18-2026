/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  fpa
 *  qta
 *  vRa
 */
public final class Wb
extends Enum<Wb> {
    public static final /* enum */ Wb LEADER;
    public static final /* enum */ Wb SOUND;
    public static final /* enum */ Wb KICK;
    public static final /* enum */ Wb MUTE;
    private final String emojiEnabled;
    public static final /* enum */ Wb MICROPHONE;
    public static final /* enum */ Wb ADD;
    private static final /* synthetic */ Wb[] $VALUES;
    private final String emojiDisabled;

    public static Wb valueOf(String a2) {
        return Enum.valueOf(Wb.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private Wb(String string2, String string3) {
        Object c2;
        void b2;
        Wb a2;
        Wb wb2 = object;
        Object object = string3;
        Wb wb3 = a2 = wb2;
        wb3.emojiEnabled = b2;
        wb3.emojiDisabled = c2;
    }

    public String getEmojiEnabled() {
        Wb a2;
        return a2.emojiEnabled;
    }

    public String getEmojiDisabled() {
        Wb a2;
        return a2.emojiDisabled;
    }

    public static Wb[] values() {
        return (Wb[])$VALUES.clone();
    }

    static {
        SOUND = new Wb(vTa.Ha, Bua.Q);
        MICROPHONE = new Wb(WSa.t, fpa.aa);
        MUTE = new Wb(Eqa.J, Zqa.F);
        KICK = new Wb(qta.V, qta.V);
        LEADER = new Wb(kTa.x, kTa.x);
        ADD = new Wb(vua.R, vua.R);
        Wb[] wbArray = new Wb[uua.p];
        wbArray[uSa.E] = SOUND;
        wbArray[vRa.d] = MICROPHONE;
        wbArray[uqa.g] = MUTE;
        wbArray[yRa.d] = KICK;
        wbArray[AQa.P] = LEADER;
        wbArray[tTa.h] = ADD;
        $VALUES = wbArray;
    }
}

