/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  Xsa
 *  Zpa
 *  pPa
 *  pQa
 *  vPa
 *  vRa
 */
public final class PL
extends Enum<PL> {
    public static final /* enum */ PL EMITTER_XY;
    public static final /* enum */ PL ROTATE_Y;
    public static final /* enum */ PL LOOKAT_Y;
    public final boolean isDirection;
    private static final /* synthetic */ PL[] $VALUES;
    public static final /* enum */ PL LOOKAT_DIRECTION;
    public final String id;
    public static final /* enum */ PL DIRECTION_Z;
    public static final /* enum */ PL DIRECTION_Y;
    public final boolean isLookAt;
    public static final /* enum */ PL EMITTER_YZ;
    public static final /* enum */ PL LOOKAT_XYZ;
    public static final /* enum */ PL DIRECTION_X;
    public static final /* enum */ PL ROTATE_XYZ;
    public static final /* enum */ PL EMITTER_XZ;

    static {
        ROTATE_XYZ = new PL(QTa.I);
        ROTATE_Y = new PL(pQa.la);
        LOOKAT_XYZ = new PL(gsa.a, vRa.d != 0, uSa.E != 0);
        LOOKAT_Y = new PL(Zpa.a, vRa.d != 0, uSa.E != 0);
        LOOKAT_DIRECTION = new PL(wua.U, vRa.d != 0, vRa.d != 0);
        DIRECTION_X = new PL(fqa.o, uSa.E != 0, vRa.d != 0);
        DIRECTION_Y = new PL(Ora.T, uSa.E != 0, vRa.d != 0);
        DIRECTION_Z = new PL(wta.X, uSa.E != 0, vRa.d != 0);
        EMITTER_XY = new PL(Xsa.ja);
        EMITTER_XZ = new PL(Ira.Ma);
        EMITTER_YZ = new PL(vPa.B);
        PL[] pLArray = new PL[pPa.f];
        pLArray[uSa.E] = ROTATE_XYZ;
        pLArray[vRa.d] = ROTATE_Y;
        pLArray[uqa.g] = LOOKAT_XYZ;
        pLArray[yRa.d] = LOOKAT_Y;
        pLArray[AQa.P] = LOOKAT_DIRECTION;
        pLArray[tTa.h] = DIRECTION_X;
        pLArray[uua.p] = DIRECTION_Y;
        pLArray[XTa.W] = DIRECTION_Z;
        pLArray[Yqa.i] = EMITTER_XY;
        pLArray[WOa.fa] = EMITTER_XZ;
        pLArray[NTa.C] = EMITTER_YZ;
        $VALUES = pLArray;
    }

    public static PL fromString(String string) {
        int a2;
        String string2 = string;
        PL[] pLArray = PL.values();
        int n2 = pLArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            PL pL = pLArray[a2];
            if (pL.id.equals(string2)) {
                return pL;
            }
            n3 = ++a2;
        }
        return ROTATE_XYZ;
    }

    private PL(String string2) {
        Object b2 = string2;
        PL a2 = this;
        a2((String)b2, uSa.E != 0, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    private PL(String string2, boolean bl, boolean bl2) {
        void d2;
        void b2;
        void c2;
        PL a2;
        boolean bl3 = bl2;
        PL pL = a2 = this;
        a2.id = c2;
        pL.isLookAt = b2;
        pL.isDirection = d2;
    }

    public static PL valueOf(String a2) {
        return Enum.valueOf(PL.class, a2);
    }

    public static PL[] values() {
        return (PL[])$VALUES.clone();
    }
}

