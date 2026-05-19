/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MH
 *  bj
 *  nO
 *  vRa
 */
public final class MH_1
extends Enum<MH> {
    public static final /* enum */ MH LINE_STRIP = new MH_1(yRa.d);
    public final int glDrawMode;
    public static final /* enum */ MH LINE_LOOP = new MH_1(uqa.g);
    public static final /* enum */ MH LINES = new MH_1(vRa.d);
    private static final /* synthetic */ MH[] $VALUES;

    public static MH[] values() {
        return (MH[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static MH fromProto(nO a2) {
        switch (bj.I[a2.ordinal()]) {
            case 1: {
                return LINE_STRIP;
            }
            case 2: {
                return LINE_LOOP;
            }
            case 3: {
                return LINES;
            }
        }
        return LINE_STRIP;
    }

    static {
        MH_1[] mH_1Array = new MH_1[yRa.d];
        mH_1Array[uSa.E] = LINE_STRIP;
        mH_1Array[vRa.d] = LINE_LOOP;
        mH_1Array[uqa.g] = LINES;
        $VALUES = mH_1Array;
    }

    private MH_1(int n3) {
        int b2 = n3;
        MH_1 a2 = this;
        a2.glDrawMode = b2;
    }

    public static MH valueOf(String a2) {
        return Enum.valueOf(MH_1.class, a2);
    }
}

