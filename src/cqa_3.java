/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  cqa
 *  vRa
 */
public final class cqa_3
extends Enum<cqa> {
    public static final /* enum */ cqa UPDATE_MICRO;
    public static final /* enum */ cqa DATA_NOT_SET;
    public static final /* enum */ cqa PING;
    public static final /* enum */ cqa REQUEST_PLAYERS_DATA;
    private static final /* synthetic */ cqa[] $VALUES;
    private final int value;
    public static final /* enum */ cqa SEND_AUDIO_END;
    public static final /* enum */ cqa SEND_AUDIO;
    public static final /* enum */ cqa DISCONNECT;

    private cqa_3(int n3) {
        int b2 = n3;
        cqa_3 a2 = this;
        a2.value = b2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static cqa forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PING;
            }
            case 2: {
                return UPDATE_MICRO;
            }
            case 3: {
                return SEND_AUDIO;
            }
            case 4: {
                return SEND_AUDIO_END;
            }
            case 5: {
                return REQUEST_PLAYERS_DATA;
            }
            case 6: {
                return DISCONNECT;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    public static cqa valueOf(String a2) {
        return Enum.valueOf(cqa_3.class, a2);
    }

    static {
        PING = new cqa_3(vRa.d);
        UPDATE_MICRO = new cqa_3(uqa.g);
        SEND_AUDIO = new cqa_3(yRa.d);
        SEND_AUDIO_END = new cqa_3(AQa.P);
        REQUEST_PLAYERS_DATA = new cqa_3(tTa.h);
        DISCONNECT = new cqa_3(uua.p);
        DATA_NOT_SET = new cqa_3(uSa.E);
        cqa_3[] cqa_3Array = new cqa_3[XTa.W];
        cqa_3Array[uSa.E] = PING;
        cqa_3Array[vRa.d] = UPDATE_MICRO;
        cqa_3Array[uqa.g] = SEND_AUDIO;
        cqa_3Array[yRa.d] = SEND_AUDIO_END;
        cqa_3Array[AQa.P] = REQUEST_PLAYERS_DATA;
        cqa_3Array[tTa.h] = DISCONNECT;
        cqa_3Array[uua.p] = DATA_NOT_SET;
        $VALUES = cqa_3Array;
    }

    public int getNumber() {
        cqa_3 a2;
        return a2.value;
    }

    public static cqa[] values() {
        return (cqa[])$VALUES.clone();
    }

    @Deprecated
    public static cqa valueOf(int a2) {
        return cqa_3.forNumber(a2);
    }
}

