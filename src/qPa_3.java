/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  pPa
 *  qPa
 *  vRa
 */
public final class qPa_3
extends Enum<qPa> {
    public static final /* enum */ qPa DISCONNECT_PLAYER;
    public static final /* enum */ qPa OUTDATED_CLIENT;
    public static final /* enum */ qPa PLAYER_LIST_DATA;
    public static final /* enum */ qPa DISCONNECT;
    public static final /* enum */ qPa AUDIO_END;
    public static final /* enum */ qPa ONE_PLAYER_DATA;
    public static final /* enum */ qPa DATA_NOT_SET;
    public static final /* enum */ qPa AUDIO;
    public static final /* enum */ qPa PONG;
    public static final /* enum */ qPa AUDIO_DATA_BATCH;
    public static final /* enum */ qPa UPDATE_MUTED;
    private static final /* synthetic */ qPa[] $VALUES;
    private final int value;

    static {
        PONG = new qPa_3(vRa.d);
        OUTDATED_CLIENT = new qPa_3(uqa.g);
        ONE_PLAYER_DATA = new qPa_3(yRa.d);
        PLAYER_LIST_DATA = new qPa_3(AQa.P);
        UPDATE_MUTED = new qPa_3(tTa.h);
        AUDIO = new qPa_3(uua.p);
        AUDIO_END = new qPa_3(XTa.W);
        DISCONNECT_PLAYER = new qPa_3(Yqa.i);
        DISCONNECT = new qPa_3(WOa.fa);
        AUDIO_DATA_BATCH = new qPa_3(NTa.C);
        DATA_NOT_SET = new qPa_3(uSa.E);
        qPa_3[] qPa_3Array = new qPa_3[pPa.f];
        qPa_3Array[uSa.E] = PONG;
        qPa_3Array[vRa.d] = OUTDATED_CLIENT;
        qPa_3Array[uqa.g] = ONE_PLAYER_DATA;
        qPa_3Array[yRa.d] = PLAYER_LIST_DATA;
        qPa_3Array[AQa.P] = UPDATE_MUTED;
        qPa_3Array[tTa.h] = AUDIO;
        qPa_3Array[uua.p] = AUDIO_END;
        qPa_3Array[XTa.W] = DISCONNECT_PLAYER;
        qPa_3Array[Yqa.i] = DISCONNECT;
        qPa_3Array[WOa.fa] = AUDIO_DATA_BATCH;
        qPa_3Array[NTa.C] = DATA_NOT_SET;
        $VALUES = qPa_3Array;
    }

    private qPa_3(int n3) {
        int b2 = n3;
        qPa_3 a2 = this;
        a2.value = b2;
    }

    public static qPa[] values() {
        return (qPa[])$VALUES.clone();
    }

    public static qPa valueOf(String a2) {
        return Enum.valueOf(qPa_3.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static qPa forNumber(int a2) {
        switch (a2) {
            case 1: {
                return PONG;
            }
            case 2: {
                return OUTDATED_CLIENT;
            }
            case 3: {
                return ONE_PLAYER_DATA;
            }
            case 4: {
                return PLAYER_LIST_DATA;
            }
            case 5: {
                return UPDATE_MUTED;
            }
            case 6: {
                return AUDIO;
            }
            case 7: {
                return AUDIO_END;
            }
            case 8: {
                return DISCONNECT_PLAYER;
            }
            case 9: {
                return DISCONNECT;
            }
            case 10: {
                return AUDIO_DATA_BATCH;
            }
            case 0: {
                return DATA_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static qPa valueOf(int a2) {
        return qPa_3.forNumber(a2);
    }

    public int getNumber() {
        qPa_3 a2;
        return a2.value;
    }
}

