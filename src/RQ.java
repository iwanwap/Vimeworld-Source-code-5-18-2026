/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQ
 *  jk
 *  vRa
 */
public final class RQ
extends Enum<RQ> {
    public static final /* enum */ RQ CENTER;
    private static final /* synthetic */ RQ[] $VALUES;
    public static final /* enum */ RQ RIGHT;
    public static final /* enum */ RQ LEFT;

    public static RQ valueOf(String a2) {
        return Enum.valueOf(RQ.class, a2);
    }

    public static RQ[] values() {
        return (RQ[])$VALUES.clone();
    }

    private RQ() {
        int a2 = n2;
        RQ rQ = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static RQ fromProto(jk a2) {
        switch (EQ.k[a2.ordinal()]) {
            case 1: {
                return LEFT;
            }
            case 2: {
                return CENTER;
            }
            case 3: {
                return RIGHT;
            }
        }
        return CENTER;
    }

    static {
        LEFT = new RQ();
        CENTER = new RQ();
        RIGHT = new RQ();
        RQ[] rQArray = new RQ[yRa.d];
        rQArray[uSa.E] = LEFT;
        rQArray[vRa.d] = CENTER;
        rQArray[uqa.g] = RIGHT;
        $VALUES = rQArray;
    }
}

