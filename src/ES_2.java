/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ES
 *  Ppa
 *  eS
 *  vRa
 *  wPa
 *  xu
 */
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class ES_2
extends Enum<ES> {
    private final eS[] subtypes;
    private static final /* synthetic */ ES[] $VALUES;
    public static final /* enum */ ES ARMS;
    private final String name;
    public static final /* enum */ ES BODY;
    public static final /* enum */ ES LEGS;
    public static final /* enum */ ES HEAD;

    public static boolean isCombineable(MiniDotItem miniDotItem) {
        MiniDotItem miniDotItem2 = miniDotItem;
        if (miniDotItem2 == null) {
            return uSa.E != 0;
        }
        MiniDotItem a2 = ES_2.fromType(miniDotItem2.type);
        if (a2 != null && miniDotItem2.type != ((ES_2)((Object)a2)).getBaseType()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eS[] getSubtypes() {
        ES_2 a2;
        return a2.subtypes;
    }

    public static ES[] values() {
        return (ES[])$VALUES.clone();
    }

    public static ES fromType(eS eS2) {
        int a2;
        eS eS3 = eS2;
        ES[] eSArray = ES_2.values();
        int n2 = eSArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            ES eS4 = eSArray[a2];
            eS[] eSArray2 = eS4.subtypes;
            int n4 = eS4.subtypes.length;
            int n5 = uSa.E;
            while (n5 < n4) {
                int n6;
                eS eS5 = eSArray2[n6];
                if (eS3 == eS5) {
                    return eS4;
                }
                n5 = ++n6;
            }
            n3 = ++a2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public eS getFullType() {
        ES_2 a2;
        switch (xu.$SwitchMap$net$xtrafrancyz$mods$minidot$items$ItemSlot[a2.ordinal()]) {
            case 1: {
                return eS.HEAD_FULL;
            }
            case 2: {
                return eS.BODY_FULL;
            }
            case 3: {
                return eS.ARMS_FULL;
            }
            case 4: {
                return eS.LEGS_FULL;
            }
        }
        return null;
    }

    public String getName() {
        ES_2 a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    private ES_2(String string2, eS ... eSArray) {
        eS[] c2;
        void b2;
        eS[] eSArray2 = eSArray3;
        eS[] eSArray3 = eSArray;
        eS[] a2 = eSArray2;
        a2.name = b2;
        a2.subtypes = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean canCombine(eS eS2, eS eS3) {
        void b2;
        ES_2 c2 = eS3;
        ES_2 a2 = this;
        if (b2 == c2) {
            return uSa.E != 0;
        }
        if (b2 == a2.getFullType() || c2 == a2.getFullType()) {
            return uSa.E != 0;
        }
        if (b2 == a2.getBaseType() || c2 == a2.getBaseType()) {
            return uSa.E != 0;
        }
        if (a2 == LEGS) {
            if (b2 == eS.LEGS_DEFAULT && (c2 == eS.LEGS_ON_TOP || c2 == eS.LEGS_AROUND) || c2 == eS.LEGS_DEFAULT && (b2 == eS.LEGS_ON_TOP || b2 == eS.LEGS_AROUND) || b2 == eS.LEGS_ON_TOP && c2 == eS.LEGS_AROUND || c2 == eS.LEGS_ON_TOP && b2 == eS.LEGS_AROUND) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2 == ARMS) {
            if (b2 == eS.ARMS_DEFAULT && (c2 == eS.ARMS_ON_TOP || c2 == eS.ARMS_IN) || c2 == eS.ARMS_DEFAULT && (b2 == eS.ARMS_ON_TOP || b2 == eS.ARMS_IN) || b2 == eS.ARMS_ON_TOP && c2 == eS.ARMS_IN || c2 == eS.ARMS_ON_TOP && b2 == eS.ARMS_IN) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2 == HEAD) {
            if (b2 == eS.HEAD_DEFAULT && (c2 == eS.HEAD_ON_TOP || c2 == eS.HEAD_FACE) || c2 == eS.HEAD_DEFAULT && (b2 == eS.HEAD_ON_TOP || b2 == eS.HEAD_FACE) || b2 == eS.HEAD_ON_TOP && c2 == eS.HEAD_FACE || c2 == eS.HEAD_ON_TOP && b2 == eS.HEAD_FACE) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2 == BODY) {
            if (b2 == eS.BODY_DEFAULT && (c2 == eS.BODY_BACK || c2 == eS.BODY_FRONT_TOP || c2 == eS.BODY_FRONT_BOTTOM) || c2 == eS.BODY_DEFAULT && (b2 == eS.BODY_BACK || b2 == eS.BODY_FRONT_TOP || b2 == eS.BODY_FRONT_BOTTOM) || b2 == eS.BODY_BACK && (c2 == eS.BODY_FRONT_TOP || c2 == eS.BODY_FRONT_BOTTOM) || c2 == eS.BODY_BACK && (b2 == eS.BODY_FRONT_TOP || b2 == eS.BODY_FRONT_BOTTOM) || b2 == eS.BODY_FRONT_TOP && c2 == eS.BODY_FRONT_BOTTOM || c2 == eS.BODY_FRONT_TOP && b2 == eS.BODY_FRONT_BOTTOM) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public eS getBaseType() {
        ES_2 a2;
        switch (xu.$SwitchMap$net$xtrafrancyz$mods$minidot$items$ItemSlot[a2.ordinal()]) {
            case 1: {
                return eS.HEAD;
            }
            case 2: {
                return eS.BODY;
            }
            case 3: {
                return eS.ARMS;
            }
            case 4: {
                return eS.LEGS;
            }
        }
        return null;
    }

    public static ES valueOf(String a2) {
        return Enum.valueOf(ES_2.class, a2);
    }

    static {
        eS[] eSArray = new eS[tTa.h];
        eSArray[uSa.E] = eS.HEAD;
        eSArray[vRa.d] = eS.HEAD_DEFAULT;
        eSArray[uqa.g] = eS.HEAD_FULL;
        eSArray[yRa.d] = eS.HEAD_ON_TOP;
        eSArray[AQa.P] = eS.HEAD_FACE;
        HEAD = new ES_2(Ppa.x, eSArray);
        eS[] eSArray2 = new eS[uua.p];
        eSArray2[uSa.E] = eS.BODY;
        eSArray2[vRa.d] = eS.BODY_DEFAULT;
        eSArray2[uqa.g] = eS.BODY_FULL;
        eSArray2[yRa.d] = eS.BODY_BACK;
        eSArray2[AQa.P] = eS.BODY_FRONT_TOP;
        eSArray2[tTa.h] = eS.BODY_FRONT_BOTTOM;
        BODY = new ES_2(nOa.q, eSArray2);
        eS[] eSArray3 = new eS[tTa.h];
        eSArray3[uSa.E] = eS.ARMS;
        eSArray3[vRa.d] = eS.ARMS_DEFAULT;
        eSArray3[uqa.g] = eS.ARMS_FULL;
        eSArray3[yRa.d] = eS.ARMS_ON_TOP;
        eSArray3[AQa.P] = eS.ARMS_IN;
        ARMS = new ES_2(wPa.Ka, eSArray3);
        eS[] eSArray4 = new eS[tTa.h];
        eSArray4[uSa.E] = eS.LEGS;
        eSArray4[vRa.d] = eS.LEGS_DEFAULT;
        eSArray4[uqa.g] = eS.LEGS_FULL;
        eSArray4[yRa.d] = eS.LEGS_ON_TOP;
        eSArray4[AQa.P] = eS.LEGS_AROUND;
        LEGS = new ES_2(ZSa.e, eSArray4);
        ES_2[] eS_2Array = new ES_2[AQa.P];
        eS_2Array[uSa.E] = HEAD;
        eS_2Array[vRa.d] = BODY;
        eS_2Array[uqa.g] = ARMS;
        eS_2Array[yRa.d] = LEGS;
        $VALUES = eS_2Array;
    }
}

