/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  NTa
 *  XTa
 *  Ypa
 *  cQa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wOa
 */
import com.google.protobuf.Internal;

public final class bJ
extends Enum<bJ>
implements Internal.EnumLite {
    public static final int LOOK_AT_ENTITY_ID_VALUE = 20;
    public static final int TAB_VALUE = 7;
    public static final int ALWAYS_VALUE = 0;
    public static final int BOSSBAR_VALUE = 8;
    public static final int FOCUS_VALUE = 18;
    public static final int AND_VALUE = 14;
    public static final /* enum */ bJ ELEMENT_FOCUS;
    public static final /* enum */ bJ ELEMENT_EXISTS;
    public static final /* enum */ bJ BOSSBAR;
    public static final /* enum */ bJ TAB;
    public static final /* enum */ bJ LOOK_AT_ENTITY_TYPE;
    public static final int VISIBLE_VALUE = 16;
    public static final int INGAME_VALUE = 1;
    public static final /* enum */ bJ KEYBOARD;
    public static final int FPS_VALUE = 6;
    public static final /* enum */ bJ AND;
    public static final int ELEMENT_EXISTS_VALUE = 9;
    public static final /* enum */ bJ CHAT;
    public static final /* enum */ bJ F3;
    public static final int LOOK_AT_ENTITY_TYPE_VALUE = 21;
    public static final /* enum */ bJ ALWAYS;
    private static final /* synthetic */ bJ[] $VALUES;
    public static final int INVENTORY_VALUE = 3;
    public static final /* enum */ bJ GUI;
    public static final /* enum */ bJ INGAME;
    public static final int F3_VALUE = 5;
    private final int value;
    public static final /* enum */ bJ OR;
    public static final /* enum */ bJ LOOK_AT_ENTITY_ID;
    public static final int ELEMENT_VISIBLE_VALUE = 12;
    public static final int GUI_CLASS_VALUE = 17;
    public static final /* enum */ bJ FOCUS;
    public static final int ELEMENT_FOCUS_VALUE = 19;
    public static final int GUI_VALUE = 2;
    public static final /* enum */ bJ FPS;
    public static final /* enum */ bJ VISIBLE;
    private static final Internal.EnumLiteMap<bJ> internalValueMap;
    public static final int KEYBOARD_VALUE = 13;
    public static final /* enum */ bJ HOVER;
    public static final /* enum */ bJ ELEMENT_HOVER;
    public static final /* enum */ bJ GUI_CLASS;
    public static final /* enum */ bJ ELEMENT_VISIBLE;
    public static final int OR_VALUE = 15;
    public static final int HOVER_VALUE = 10;
    public static final int ELEMENT_HOVER_VALUE = 11;
    public static final /* enum */ bJ UNRECOGNIZED;
    public static final /* enum */ bJ INVENTORY;
    public static final int CHAT_VALUE = 4;

    public static Internal.EnumVerifier internalGetVerifier() {
        return uJ.INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bJ forNumber(int a2) {
        switch (a2) {
            case 0: {
                return ALWAYS;
            }
            case 1: {
                return INGAME;
            }
            case 2: {
                return GUI;
            }
            case 3: {
                return INVENTORY;
            }
            case 4: {
                return CHAT;
            }
            case 5: {
                return F3;
            }
            case 6: {
                return FPS;
            }
            case 7: {
                return TAB;
            }
            case 8: {
                return BOSSBAR;
            }
            case 9: {
                return ELEMENT_EXISTS;
            }
            case 10: {
                return HOVER;
            }
            case 11: {
                return ELEMENT_HOVER;
            }
            case 12: {
                return ELEMENT_VISIBLE;
            }
            case 13: {
                return KEYBOARD;
            }
            case 14: {
                return AND;
            }
            case 15: {
                return OR;
            }
            case 16: {
                return VISIBLE;
            }
            case 17: {
                return GUI_CLASS;
            }
            case 18: {
                return FOCUS;
            }
            case 19: {
                return ELEMENT_FOCUS;
            }
            case 20: {
                return LOOK_AT_ENTITY_ID;
            }
            case 21: {
                return LOOK_AT_ENTITY_TYPE;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<bJ> internalGetValueMap() {
        return internalValueMap;
    }

    public static bJ[] values() {
        return (bJ[])$VALUES.clone();
    }

    private bJ(int n3) {
        int b2 = n3;
        bJ a2 = this;
        a2.value = b2;
    }

    static {
        ALWAYS = new bJ(uSa.E);
        INGAME = new bJ(vRa.d);
        GUI = new bJ(uqa.g);
        INVENTORY = new bJ(yRa.d);
        CHAT = new bJ(AQa.P);
        F3 = new bJ(tTa.h);
        FPS = new bJ(uua.p);
        TAB = new bJ(XTa.W);
        BOSSBAR = new bJ(Yqa.i);
        ELEMENT_EXISTS = new bJ(WOa.fa);
        HOVER = new bJ(NTa.C);
        ELEMENT_HOVER = new bJ(pPa.f);
        ELEMENT_VISIBLE = new bJ(lqa.s);
        KEYBOARD = new bJ(uua.s);
        AND = new bJ(hpa.Z);
        OR = new bJ(Ypa.A);
        VISIBLE = new bJ(ERa.C);
        GUI_CLASS = new bJ(yta.Ka);
        FOCUS = new bJ(yOa.B);
        ELEMENT_FOCUS = new bJ(wOa.t);
        LOOK_AT_ENTITY_ID = new bJ(kTa.j);
        LOOK_AT_ENTITY_TYPE = new bJ(wOa.h);
        UNRECOGNIZED = new bJ(pua.o);
        bJ[] bJArray = new bJ[AQa.ba];
        bJArray[uSa.E] = ALWAYS;
        bJArray[vRa.d] = INGAME;
        bJArray[uqa.g] = GUI;
        bJArray[yRa.d] = INVENTORY;
        bJArray[AQa.P] = CHAT;
        bJArray[tTa.h] = F3;
        bJArray[uua.p] = FPS;
        bJArray[XTa.W] = TAB;
        bJArray[Yqa.i] = BOSSBAR;
        bJArray[WOa.fa] = ELEMENT_EXISTS;
        bJArray[NTa.C] = HOVER;
        bJArray[pPa.f] = ELEMENT_HOVER;
        bJArray[lqa.s] = ELEMENT_VISIBLE;
        bJArray[uua.s] = KEYBOARD;
        bJArray[hpa.Z] = AND;
        bJArray[Ypa.A] = OR;
        bJArray[ERa.C] = VISIBLE;
        bJArray[yta.Ka] = GUI_CLASS;
        bJArray[yOa.B] = FOCUS;
        bJArray[wOa.t] = ELEMENT_FOCUS;
        bJArray[kTa.j] = LOOK_AT_ENTITY_ID;
        bJArray[wOa.h] = LOOK_AT_ENTITY_TYPE;
        bJArray[cQa.o] = UNRECOGNIZED;
        $VALUES = bJArray;
        internalValueMap = new SL();
    }

    @Override
    public final int getNumber() {
        bJ a2;
        if (a2 == UNRECOGNIZED) {
            throw new IllegalArgumentException(xSa.A);
        }
        return a2.value;
    }

    public static bJ valueOf(String a2) {
        return Enum.valueOf(bJ.class, a2);
    }

    @Deprecated
    public static bJ valueOf(int a2) {
        return bJ.forNumber(a2);
    }
}

