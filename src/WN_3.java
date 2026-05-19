/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lra
 *  NTa
 *  WN
 *  XTa
 *  Ypa
 *  cQa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wOa
 *  wm
 */
import com.google.protobuf.Internal;

public final class WN_3
extends Enum<WN>
implements Internal.EnumLite {
    public static final /* enum */ WN EASE_OUT_SINE;
    public static final /* enum */ WN UNRECOGNIZED;
    public static final int EASE_OUT_CIRC_VALUE = 20;
    public static final /* enum */ WN EASE_OUT_BOUNCE;
    public static final int EASE_IN_CIRC_VALUE = 19;
    public static final /* enum */ WN EASE_IN_OUT_QUAD;
    public static final int EASE_IN_SINE_VALUE = 1;
    public static final int EASE_IN_BACK_VALUE = 22;
    public static final /* enum */ WN EASE_IN_OUT_SINE;
    public static final /* enum */ WN EASE_OUT_BACK;
    public static final /* enum */ WN EASE_IN_OUT_QUINT;
    private static final /* synthetic */ WN[] $VALUES;
    public static final /* enum */ WN EASE_OUT_CIRC;
    public static final /* enum */ WN EASE_IN_SINE;
    public static final /* enum */ WN EASE_IN_OUT_QUART;
    public static final int EASE_OUT_BACK_VALUE = 23;
    public static final /* enum */ WN EASE_IN_QUINT;
    public static final int EASE_OUT_ELASTIC_VALUE = 26;
    public static final int EASE_IN_OUT_QUART_VALUE = 12;
    public static final int EASE_IN_EXPO_VALUE = 16;
    public static final int EASE_IN_OUT_QUINT_VALUE = 15;
    public static final /* enum */ WN EASE_IN_EXPO;
    public static final int EASE_OUT_QUINT_VALUE = 14;
    public static final /* enum */ WN EASE_IN_QUAD;
    public static final int EASE_IN_ELASTIC_VALUE = 25;
    public static final int EASE_OUT_EXPO_VALUE = 17;
    public static final /* enum */ WN EASE_OUT_CUBIC;
    public static final int EASE_IN_OUT_CUBIC_VALUE = 9;
    public static final /* enum */ WN EASE_IN_QUART;
    public static final int EASE_IN_OUT_ELASTIC_VALUE = 27;
    public static final int EASE_IN_OUT_CIRC_VALUE = 21;
    public static final /* enum */ WN EASE_IN_ELASTIC;
    public static final /* enum */ WN EASE_IN_OUT_BACK;
    public static final int LINEAR_VALUE = 0;
    public static final int EASE_IN_QUAD_VALUE = 4;
    public static final int EASE_OUT_SINE_VALUE = 2;
    public static final int EASE_IN_OUT_SINE_VALUE = 3;
    public static final int EASE_IN_QUINT_VALUE = 13;
    public static final int EASE_IN_OUT_EXPO_VALUE = 18;
    public static final int EASE_IN_BOUNCE_VALUE = 28;
    public static final /* enum */ WN EASE_IN_OUT_CIRC;
    public static final /* enum */ WN EASE_IN_OUT_ELASTIC;
    public static final /* enum */ WN EASE_IN_CUBIC;
    private final int value;
    public static final /* enum */ WN EASE_OUT_EXPO;
    public static final /* enum */ WN EASE_OUT_QUAD;
    public static final int EASE_OUT_QUAD_VALUE = 5;
    public static final int EASE_IN_OUT_BOUNCE_VALUE = 30;
    public static final /* enum */ WN EASE_OUT_QUINT;
    public static final /* enum */ WN EASE_OUT_ELASTIC;
    public static final int EASE_OUT_QUART_VALUE = 11;
    public static final /* enum */ WN EASE_IN_OUT_CUBIC;
    public static final /* enum */ WN LINEAR;
    private static final Internal.EnumLiteMap<WN> internalValueMap;
    public static final int EASE_IN_CUBIC_VALUE = 7;
    public static final /* enum */ WN EASE_IN_BACK;
    public static final /* enum */ WN EASE_IN_OUT_EXPO;
    public static final /* enum */ WN EASE_IN_BOUNCE;
    public static final int EASE_IN_OUT_BACK_VALUE = 24;
    public static final int EASE_IN_QUART_VALUE = 10;
    public static final int EASE_OUT_CUBIC_VALUE = 8;
    public static final /* enum */ WN EASE_IN_OUT_BOUNCE;
    public static final /* enum */ WN EASE_OUT_QUART;
    public static final int EASE_IN_OUT_QUAD_VALUE = 6;
    public static final /* enum */ WN EASE_IN_CIRC;
    public static final int EASE_OUT_BOUNCE_VALUE = 29;

    @Deprecated
    public static WN valueOf(int a2) {
        return WN_3.forNumber(a2);
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return wm.INSTANCE;
    }

    private WN_3(int n3) {
        int b2 = n3;
        WN_3 a2 = this;
        a2.value = b2;
    }

    public static WN valueOf(String a2) {
        return Enum.valueOf(WN_3.class, a2);
    }

    public static Internal.EnumLiteMap<WN> internalGetValueMap() {
        return internalValueMap;
    }

    static {
        LINEAR = new WN_3(uSa.E);
        EASE_IN_SINE = new WN_3(vRa.d);
        EASE_OUT_SINE = new WN_3(uqa.g);
        EASE_IN_OUT_SINE = new WN_3(yRa.d);
        EASE_IN_QUAD = new WN_3(AQa.P);
        EASE_OUT_QUAD = new WN_3(tTa.h);
        EASE_IN_OUT_QUAD = new WN_3(uua.p);
        EASE_IN_CUBIC = new WN_3(XTa.W);
        EASE_OUT_CUBIC = new WN_3(Yqa.i);
        EASE_IN_OUT_CUBIC = new WN_3(WOa.fa);
        EASE_IN_QUART = new WN_3(NTa.C);
        EASE_OUT_QUART = new WN_3(pPa.f);
        EASE_IN_OUT_QUART = new WN_3(lqa.s);
        EASE_IN_QUINT = new WN_3(uua.s);
        EASE_OUT_QUINT = new WN_3(hpa.Z);
        EASE_IN_OUT_QUINT = new WN_3(Ypa.A);
        EASE_IN_EXPO = new WN_3(ERa.C);
        EASE_OUT_EXPO = new WN_3(yta.Ka);
        EASE_IN_OUT_EXPO = new WN_3(yOa.B);
        EASE_IN_CIRC = new WN_3(wOa.t);
        EASE_OUT_CIRC = new WN_3(kTa.j);
        EASE_IN_OUT_CIRC = new WN_3(wOa.h);
        EASE_IN_BACK = new WN_3(cQa.o);
        EASE_OUT_BACK = new WN_3(AQa.ba);
        EASE_IN_OUT_BACK = new WN_3(osa.c);
        EASE_IN_ELASTIC = new WN_3(kTa.g);
        EASE_OUT_ELASTIC = new WN_3(ITa.E);
        EASE_IN_OUT_ELASTIC = new WN_3(Lra.e);
        EASE_IN_BOUNCE = new WN_3(EPa.O);
        EASE_OUT_BOUNCE = new WN_3(ITa.A);
        EASE_IN_OUT_BOUNCE = new WN_3(Fsa.d);
        UNRECOGNIZED = new WN_3(pua.o);
        WN_3[] wN_3Array = new WN_3[fPa.i];
        wN_3Array[uSa.E] = LINEAR;
        wN_3Array[vRa.d] = EASE_IN_SINE;
        wN_3Array[uqa.g] = EASE_OUT_SINE;
        wN_3Array[yRa.d] = EASE_IN_OUT_SINE;
        wN_3Array[AQa.P] = EASE_IN_QUAD;
        wN_3Array[tTa.h] = EASE_OUT_QUAD;
        wN_3Array[uua.p] = EASE_IN_OUT_QUAD;
        wN_3Array[XTa.W] = EASE_IN_CUBIC;
        wN_3Array[Yqa.i] = EASE_OUT_CUBIC;
        wN_3Array[WOa.fa] = EASE_IN_OUT_CUBIC;
        wN_3Array[NTa.C] = EASE_IN_QUART;
        wN_3Array[pPa.f] = EASE_OUT_QUART;
        wN_3Array[lqa.s] = EASE_IN_OUT_QUART;
        wN_3Array[uua.s] = EASE_IN_QUINT;
        wN_3Array[hpa.Z] = EASE_OUT_QUINT;
        wN_3Array[Ypa.A] = EASE_IN_OUT_QUINT;
        wN_3Array[ERa.C] = EASE_IN_EXPO;
        wN_3Array[yta.Ka] = EASE_OUT_EXPO;
        wN_3Array[yOa.B] = EASE_IN_OUT_EXPO;
        wN_3Array[wOa.t] = EASE_IN_CIRC;
        wN_3Array[kTa.j] = EASE_OUT_CIRC;
        wN_3Array[wOa.h] = EASE_IN_OUT_CIRC;
        wN_3Array[cQa.o] = EASE_IN_BACK;
        wN_3Array[AQa.ba] = EASE_OUT_BACK;
        wN_3Array[osa.c] = EASE_IN_OUT_BACK;
        wN_3Array[kTa.g] = EASE_IN_ELASTIC;
        wN_3Array[ITa.E] = EASE_OUT_ELASTIC;
        wN_3Array[Lra.e] = EASE_IN_OUT_ELASTIC;
        wN_3Array[EPa.O] = EASE_IN_BOUNCE;
        wN_3Array[ITa.A] = EASE_OUT_BOUNCE;
        wN_3Array[Fsa.d] = EASE_IN_OUT_BOUNCE;
        wN_3Array[tua.U] = UNRECOGNIZED;
        $VALUES = wN_3Array;
        internalValueMap = new PN();
    }

    public static WN[] values() {
        return (WN[])$VALUES.clone();
    }

    @Override
    public final int getNumber() {
        WN_3 a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static WN forNumber(int a2) {
        switch (a2) {
            case 0: {
                return LINEAR;
            }
            case 1: {
                return EASE_IN_SINE;
            }
            case 2: {
                return EASE_OUT_SINE;
            }
            case 3: {
                return EASE_IN_OUT_SINE;
            }
            case 4: {
                return EASE_IN_QUAD;
            }
            case 5: {
                return EASE_OUT_QUAD;
            }
            case 6: {
                return EASE_IN_OUT_QUAD;
            }
            case 7: {
                return EASE_IN_CUBIC;
            }
            case 8: {
                return EASE_OUT_CUBIC;
            }
            case 9: {
                return EASE_IN_OUT_CUBIC;
            }
            case 10: {
                return EASE_IN_QUART;
            }
            case 11: {
                return EASE_OUT_QUART;
            }
            case 12: {
                return EASE_IN_OUT_QUART;
            }
            case 13: {
                return EASE_IN_QUINT;
            }
            case 14: {
                return EASE_OUT_QUINT;
            }
            case 15: {
                return EASE_IN_OUT_QUINT;
            }
            case 16: {
                return EASE_IN_EXPO;
            }
            case 17: {
                return EASE_OUT_EXPO;
            }
            case 18: {
                return EASE_IN_OUT_EXPO;
            }
            case 19: {
                return EASE_IN_CIRC;
            }
            case 20: {
                return EASE_OUT_CIRC;
            }
            case 21: {
                return EASE_IN_OUT_CIRC;
            }
            case 22: {
                return EASE_IN_BACK;
            }
            case 23: {
                return EASE_OUT_BACK;
            }
            case 24: {
                return EASE_IN_OUT_BACK;
            }
            case 25: {
                return EASE_IN_ELASTIC;
            }
            case 26: {
                return EASE_OUT_ELASTIC;
            }
            case 27: {
                return EASE_IN_OUT_ELASTIC;
            }
            case 28: {
                return EASE_IN_BOUNCE;
            }
            case 29: {
                return EASE_OUT_BOUNCE;
            }
            case 30: {
                return EASE_IN_OUT_BOUNCE;
            }
        }
        return null;
    }
}

