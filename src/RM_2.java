/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lra
 *  NTa
 *  Qsa
 *  RM
 *  TQa
 *  Tpa
 *  XTa
 *  Ypa
 *  cQa
 *  lqa
 *  pPa
 *  vRa
 *  wOa
 */
public final class RM_2
extends Enum<RM> {
    public static final /* enum */ RM ISOMETRICDISABLE;
    public static final /* enum */ RM ENTITYOPTION;
    public static final /* enum */ RM ENTITYACTION;
    public static final /* enum */ RM REGISTERDYNAMICITEM;
    public static final /* enum */ RM REMOVE3D;
    public static final /* enum */ RM CLEAR2D;
    public static final /* enum */ RM ACTION_NOT_SET;
    public static final /* enum */ RM ADD2D;
    public static final /* enum */ RM PROMOACTIVATERESULT;
    public static final /* enum */ RM COPYTOCLIPBOARD;
    public static final /* enum */ RM EDIT2D;
    public static final /* enum */ RM OPENGUI;
    public static final /* enum */ RM PARTICLES;
    public static final /* enum */ RM JOINVOICECHAT;
    public static final /* enum */ RM CLEAR3D;
    public static final /* enum */ RM ADD2DGROUP;
    public static final /* enum */ RM SOUNDPLAY;
    public static final /* enum */ RM OPENURL;
    public static final /* enum */ RM PLAYANIMATION;
    public static final /* enum */ RM EDITBB;
    public static final /* enum */ RM ADDBB;
    private static final /* synthetic */ RM[] $VALUES;
    private final int value;
    public static final /* enum */ RM RECONNECTDATA;
    public static final /* enum */ RM CLEARKEYBOARD;
    public static final /* enum */ RM OPTIONSET;
    public static final /* enum */ RM RESOURCESAVE;
    public static final /* enum */ RM ADD3D;
    public static final /* enum */ RM EDIT3D;
    public static final /* enum */ RM RESET;
    public static final /* enum */ RM ISOMETRICENABLE;
    public static final /* enum */ RM REMOVEBB;
    public static final /* enum */ RM KEYBOARDBIND;
    public static final /* enum */ RM REMOVE2D;
    public static final /* enum */ RM KEYBOARDUNBIND;
    public static final /* enum */ RM SNOWSTORMPARTICLES;
    public static final /* enum */ RM SOUNDSTOP;
    public static final /* enum */ RM RESOURCECHECK;

    /*
     * Enabled aggressive block sorting
     */
    public static RM forNumber(int a2) {
        switch (a2) {
            case 1: {
                return RESET;
            }
            case 2: {
                return ADD2D;
            }
            case 3: {
                return ADD2DGROUP;
            }
            case 4: {
                return REMOVE2D;
            }
            case 5: {
                return CLEAR2D;
            }
            case 6: {
                return EDIT2D;
            }
            case 7: {
                return OPTIONSET;
            }
            case 8: {
                return OPENGUI;
            }
            case 9: {
                return PARTICLES;
            }
            case 10: {
                return ADD3D;
            }
            case 11: {
                return EDIT3D;
            }
            case 12: {
                return REMOVE3D;
            }
            case 13: {
                return CLEAR3D;
            }
            case 14: {
                return ADDBB;
            }
            case 15: {
                return REMOVEBB;
            }
            case 16: {
                return EDITBB;
            }
            case 17: {
                return OPENURL;
            }
            case 18: {
                return KEYBOARDBIND;
            }
            case 19: {
                return KEYBOARDUNBIND;
            }
            case 20: {
                return CLEARKEYBOARD;
            }
            case 21: {
                return SOUNDPLAY;
            }
            case 22: {
                return SOUNDSTOP;
            }
            case 24: {
                return RESOURCECHECK;
            }
            case 25: {
                return RESOURCESAVE;
            }
            case 26: {
                return ENTITYOPTION;
            }
            case 27: {
                return ENTITYACTION;
            }
            case 28: {
                return REGISTERDYNAMICITEM;
            }
            case 29: {
                return PLAYANIMATION;
            }
            case 30: {
                return JOINVOICECHAT;
            }
            case 31: {
                return RECONNECTDATA;
            }
            case 32: {
                return SNOWSTORMPARTICLES;
            }
            case 33: {
                return COPYTOCLIPBOARD;
            }
            case 34: {
                return PROMOACTIVATERESULT;
            }
            case 35: {
                return ISOMETRICENABLE;
            }
            case 36: {
                return ISOMETRICDISABLE;
            }
            case 0: {
                return ACTION_NOT_SET;
            }
        }
        return null;
    }

    private RM_2(int n3) {
        int b2 = n3;
        RM_2 a2 = this;
        a2.value = b2;
    }

    public static RM valueOf(String a2) {
        return Enum.valueOf(RM_2.class, a2);
    }

    static {
        RESET = new RM_2(vRa.d);
        ADD2D = new RM_2(uqa.g);
        ADD2DGROUP = new RM_2(yRa.d);
        REMOVE2D = new RM_2(AQa.P);
        CLEAR2D = new RM_2(tTa.h);
        EDIT2D = new RM_2(uua.p);
        OPTIONSET = new RM_2(XTa.W);
        OPENGUI = new RM_2(Yqa.i);
        PARTICLES = new RM_2(WOa.fa);
        ADD3D = new RM_2(NTa.C);
        EDIT3D = new RM_2(pPa.f);
        REMOVE3D = new RM_2(lqa.s);
        CLEAR3D = new RM_2(uua.s);
        ADDBB = new RM_2(hpa.Z);
        REMOVEBB = new RM_2(Ypa.A);
        EDITBB = new RM_2(ERa.C);
        OPENURL = new RM_2(yta.Ka);
        KEYBOARDBIND = new RM_2(yOa.B);
        KEYBOARDUNBIND = new RM_2(wOa.t);
        CLEARKEYBOARD = new RM_2(kTa.j);
        SOUNDPLAY = new RM_2(wOa.h);
        SOUNDSTOP = new RM_2(cQa.o);
        RESOURCECHECK = new RM_2(osa.c);
        RESOURCESAVE = new RM_2(kTa.g);
        ENTITYOPTION = new RM_2(ITa.E);
        ENTITYACTION = new RM_2(Lra.e);
        REGISTERDYNAMICITEM = new RM_2(EPa.O);
        PLAYANIMATION = new RM_2(ITa.A);
        JOINVOICECHAT = new RM_2(Fsa.d);
        RECONNECTDATA = new RM_2(tua.U);
        SNOWSTORMPARTICLES = new RM_2(fPa.i);
        COPYTOCLIPBOARD = new RM_2(Zqa.G);
        PROMOACTIVATERESULT = new RM_2(Tpa.z);
        ISOMETRICENABLE = new RM_2(TQa.ca);
        ISOMETRICDISABLE = new RM_2(Qsa.Ha);
        ACTION_NOT_SET = new RM_2(uSa.E);
        RM_2[] rM_2Array = new RM_2[Qsa.Ha];
        rM_2Array[uSa.E] = RESET;
        rM_2Array[vRa.d] = ADD2D;
        rM_2Array[uqa.g] = ADD2DGROUP;
        rM_2Array[yRa.d] = REMOVE2D;
        rM_2Array[AQa.P] = CLEAR2D;
        rM_2Array[tTa.h] = EDIT2D;
        rM_2Array[uua.p] = OPTIONSET;
        rM_2Array[XTa.W] = OPENGUI;
        rM_2Array[Yqa.i] = PARTICLES;
        rM_2Array[WOa.fa] = ADD3D;
        rM_2Array[NTa.C] = EDIT3D;
        rM_2Array[pPa.f] = REMOVE3D;
        rM_2Array[lqa.s] = CLEAR3D;
        rM_2Array[uua.s] = ADDBB;
        rM_2Array[hpa.Z] = REMOVEBB;
        rM_2Array[Ypa.A] = EDITBB;
        rM_2Array[ERa.C] = OPENURL;
        rM_2Array[yta.Ka] = KEYBOARDBIND;
        rM_2Array[yOa.B] = KEYBOARDUNBIND;
        rM_2Array[wOa.t] = CLEARKEYBOARD;
        rM_2Array[kTa.j] = SOUNDPLAY;
        rM_2Array[wOa.h] = SOUNDSTOP;
        rM_2Array[cQa.o] = RESOURCECHECK;
        rM_2Array[AQa.ba] = RESOURCESAVE;
        rM_2Array[osa.c] = ENTITYOPTION;
        rM_2Array[kTa.g] = ENTITYACTION;
        rM_2Array[ITa.E] = REGISTERDYNAMICITEM;
        rM_2Array[Lra.e] = PLAYANIMATION;
        rM_2Array[EPa.O] = JOINVOICECHAT;
        rM_2Array[ITa.A] = RECONNECTDATA;
        rM_2Array[Fsa.d] = SNOWSTORMPARTICLES;
        rM_2Array[tua.U] = COPYTOCLIPBOARD;
        rM_2Array[fPa.i] = PROMOACTIVATERESULT;
        rM_2Array[Zqa.G] = ISOMETRICENABLE;
        rM_2Array[Tpa.z] = ISOMETRICDISABLE;
        rM_2Array[TQa.ca] = ACTION_NOT_SET;
        $VALUES = rM_2Array;
    }

    public int getNumber() {
        RM_2 a2;
        return a2.value;
    }

    public static RM[] values() {
        return (RM[])$VALUES.clone();
    }

    @Deprecated
    public static RM valueOf(int a2) {
        return RM_2.forNumber(a2);
    }
}

