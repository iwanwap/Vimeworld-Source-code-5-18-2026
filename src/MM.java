/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gm
 *  NTa
 *  XTa
 *  Ypa
 *  ao
 *  cQa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wOa
 */
import com.google.protobuf.Internal;

public final class MM
extends Enum<MM>
implements Internal.EnumLite {
    public static final /* enum */ MM TEXT_STOPWATCH;
    public static final int RADIAL_SLIDER_VALUE = 17;
    public static final int IMAGE_9SLICE_VALUE = 16;
    private static final Internal.EnumLiteMap<MM> internalValueMap;
    public static final int RADIAL_PROGRESS_TIMER_VALUE = 10;
    public static final int MINIDOT_PREVIEW_VALUE = 18;
    public static final /* enum */ MM TEXT_PLACEHOLDER;
    public static final /* enum */ MM MINIDOT_PREVIEW;
    public static final /* enum */ MM UNRECOGNIZED;
    public static final int TEXT_VALUE = 2;
    public static final int PROGRESS_BAR_VALUE = 7;
    public static final int PROGRESS_TIMER_VALUE = 8;
    public static final int TABLE_VALUE = 12;
    public static final int TEXT_INPUT_VALUE = 15;
    public static final int SPACER_VALUE = 0;
    private final int value;
    public static final int IMAGE_VALUE = 6;
    public static final /* enum */ MM TEXT_CLOCK;
    public static final int CONTAINER_VALUE = 14;
    public static final int RADIAL_PROGRESS_BAR_VALUE = 9;
    public static final /* enum */ MM TEXT_TIMER;
    public static final /* enum */ MM TEXT;
    public static final int BUTTON_VALUE = 13;
    public static final /* enum */ MM PROGRESS_BAR;
    public static final /* enum */ MM TABLE;
    public static final int VIGNETTE_VALUE = 11;
    public static final /* enum */ MM VIGNETTE;
    public static final /* enum */ MM CONTAINER;
    public static final /* enum */ MM RECTANGLE;
    public static final int TEXT_CLOCK_VALUE = 5;
    public static final /* enum */ MM PLAYER_PREVIEW;
    public static final /* enum */ MM MODEL_PREVIEW;
    public static final int TEXT_STOPWATCH_VALUE = 4;
    public static final int RECTANGLE_VALUE = 1;
    public static final /* enum */ MM PROGRESS_TIMER;
    public static final /* enum */ MM TEXT_INPUT;
    public static final /* enum */ MM IMAGE_9SLICE;
    public static final /* enum */ MM IMAGE;
    public static final int PLAYER_PREVIEW_VALUE = 20;
    public static final int MODEL_PREVIEW_VALUE = 19;
    private static final /* synthetic */ MM[] $VALUES;
    public static final /* enum */ MM RADIAL_PROGRESS_TIMER;
    public static final /* enum */ MM RADIAL_PROGRESS_BAR;
    public static final /* enum */ MM SPACER;
    public static final /* enum */ MM BUTTON;
    public static final int TEXT_PLACEHOLDER_VALUE = 21;
    public static final int TEXT_TIMER_VALUE = 3;
    public static final /* enum */ MM RADIAL_SLIDER;

    @Deprecated
    public static MM valueOf(int a2) {
        return MM.forNumber(a2);
    }

    static {
        SPACER = new MM(uSa.E);
        RECTANGLE = new MM(vRa.d);
        TEXT = new MM(uqa.g);
        TEXT_TIMER = new MM(yRa.d);
        TEXT_STOPWATCH = new MM(AQa.P);
        TEXT_CLOCK = new MM(tTa.h);
        IMAGE = new MM(uua.p);
        PROGRESS_BAR = new MM(XTa.W);
        PROGRESS_TIMER = new MM(Yqa.i);
        RADIAL_PROGRESS_BAR = new MM(WOa.fa);
        RADIAL_PROGRESS_TIMER = new MM(NTa.C);
        VIGNETTE = new MM(pPa.f);
        TABLE = new MM(lqa.s);
        BUTTON = new MM(uua.s);
        CONTAINER = new MM(hpa.Z);
        TEXT_INPUT = new MM(Ypa.A);
        IMAGE_9SLICE = new MM(ERa.C);
        RADIAL_SLIDER = new MM(yta.Ka);
        MINIDOT_PREVIEW = new MM(yOa.B);
        MODEL_PREVIEW = new MM(wOa.t);
        PLAYER_PREVIEW = new MM(kTa.j);
        TEXT_PLACEHOLDER = new MM(wOa.h);
        UNRECOGNIZED = new MM(pua.o);
        MM[] mMArray = new MM[AQa.ba];
        mMArray[uSa.E] = SPACER;
        mMArray[vRa.d] = RECTANGLE;
        mMArray[uqa.g] = TEXT;
        mMArray[yRa.d] = TEXT_TIMER;
        mMArray[AQa.P] = TEXT_STOPWATCH;
        mMArray[tTa.h] = TEXT_CLOCK;
        mMArray[uua.p] = IMAGE;
        mMArray[XTa.W] = PROGRESS_BAR;
        mMArray[Yqa.i] = PROGRESS_TIMER;
        mMArray[WOa.fa] = RADIAL_PROGRESS_BAR;
        mMArray[NTa.C] = RADIAL_PROGRESS_TIMER;
        mMArray[pPa.f] = VIGNETTE;
        mMArray[lqa.s] = TABLE;
        mMArray[uua.s] = BUTTON;
        mMArray[hpa.Z] = CONTAINER;
        mMArray[Ypa.A] = TEXT_INPUT;
        mMArray[ERa.C] = IMAGE_9SLICE;
        mMArray[yta.Ka] = RADIAL_SLIDER;
        mMArray[yOa.B] = MINIDOT_PREVIEW;
        mMArray[wOa.t] = MODEL_PREVIEW;
        mMArray[kTa.j] = PLAYER_PREVIEW;
        mMArray[wOa.h] = TEXT_PLACEHOLDER;
        mMArray[cQa.o] = UNRECOGNIZED;
        $VALUES = mMArray;
        internalValueMap = new ao();
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Gm.INSTANCE;
    }

    public static MM[] values() {
        return (MM[])$VALUES.clone();
    }

    @Override
    public final int getNumber() {
        MM a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static MM valueOf(String a2) {
        return Enum.valueOf(MM.class, a2);
    }

    public static Internal.EnumLiteMap<MM> internalGetValueMap() {
        return internalValueMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static MM forNumber(int a2) {
        switch (a2) {
            case 0: {
                return SPACER;
            }
            case 1: {
                return RECTANGLE;
            }
            case 2: {
                return TEXT;
            }
            case 3: {
                return TEXT_TIMER;
            }
            case 4: {
                return TEXT_STOPWATCH;
            }
            case 5: {
                return TEXT_CLOCK;
            }
            case 6: {
                return IMAGE;
            }
            case 7: {
                return PROGRESS_BAR;
            }
            case 8: {
                return PROGRESS_TIMER;
            }
            case 9: {
                return RADIAL_PROGRESS_BAR;
            }
            case 10: {
                return RADIAL_PROGRESS_TIMER;
            }
            case 11: {
                return VIGNETTE;
            }
            case 12: {
                return TABLE;
            }
            case 13: {
                return BUTTON;
            }
            case 14: {
                return CONTAINER;
            }
            case 15: {
                return TEXT_INPUT;
            }
            case 16: {
                return IMAGE_9SLICE;
            }
            case 17: {
                return RADIAL_SLIDER;
            }
            case 18: {
                return MINIDOT_PREVIEW;
            }
            case 19: {
                return MODEL_PREVIEW;
            }
            case 20: {
                return PLAYER_PREVIEW;
            }
            case 21: {
                return TEXT_PLACEHOLDER;
            }
        }
        return null;
    }

    private MM(int n3) {
        int b2 = n3;
        MM a2 = this;
        a2.value = b2;
    }
}

