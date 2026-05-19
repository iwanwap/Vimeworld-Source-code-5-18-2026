/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DE
 *  KTa
 *  RQa
 *  pua
 *  vRa
 */
public final class DE_1
extends Enum<DE> {
    public static final /* enum */ DE CONNECTION_TROUBLE;
    private final rc text;
    public static final /* enum */ DE SERVER_MAINTENANCE;
    public static final /* enum */ DE NOISE_SUPRESSION_ERROR;
    private final rc bg;
    public static final /* enum */ DE OLD_CLIENT;
    private final rc underline;
    public static final /* enum */ DE COULD_NOT_CONNECT;
    private static final /* synthetic */ DE[] $VALUES;
    private final String content;

    public static DE[] values() {
        return (DE[])$VALUES.clone();
    }

    public static DE valueOf(String a2) {
        return Enum.valueOf(DE_1.class, a2);
    }

    static {
        COULD_NOT_CONNECT = new DE_1(KPa.x, Bc.C, Bc.N, Bc.ca);
        CONNECTION_TROUBLE = new DE_1(pua.n, Bc.v, Bc.oa, Bc.ea);
        OLD_CLIENT = new DE_1(tSa.L, Bc.v, Bc.oa, Bc.ea);
        SERVER_MAINTENANCE = new DE_1(RQa.I, Bc.v, Bc.oa, Bc.ea);
        NOISE_SUPRESSION_ERROR = new DE_1(KTa.fa, Bc.C, Bc.N, Bc.ca);
        DE_1[] dE_1Array = new DE_1[tTa.h];
        dE_1Array[uSa.E] = COULD_NOT_CONNECT;
        dE_1Array[vRa.d] = CONNECTION_TROUBLE;
        dE_1Array[uqa.g] = OLD_CLIENT;
        dE_1Array[yRa.d] = SERVER_MAINTENANCE;
        dE_1Array[AQa.P] = NOISE_SUPRESSION_ERROR;
        $VALUES = dE_1Array;
    }

    public rc underlineColor() {
        DE_1 a2;
        return a2.underline;
    }

    public rc bgColor() {
        DE_1 a2;
        return a2.bg;
    }

    public String content() {
        DE_1 a2;
        return a2.content;
    }

    /*
     * WARNING - void declaration
     */
    private DE_1(String string2, rc rc2, rc rc3, rc rc4) {
        Object e2;
        void b2;
        void c2;
        void d2;
        DE_1 a2;
        DE_1 dE_1 = object;
        Object object = rc4;
        DE_1 dE_12 = a2 = dE_1;
        DE_1 dE_13 = a2;
        dE_13.content = d2;
        dE_13.bg = c2;
        dE_12.underline = b2;
        dE_12.text = e2;
    }

    public rc textColor() {
        DE_1 a2;
        return a2.text;
    }
}

