/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class gN
extends Enum<gN> {
    private final int value;
    private static final /* synthetic */ gN[] $VALUES;
    public static final /* enum */ gN HEIGHTVAL_NOT_SET;
    public static final /* enum */ gN HEIGHT;
    public static final /* enum */ gN HEIGHTANIM;

    public static gN[] values() {
        return (gN[])$VALUES.clone();
    }

    public int getNumber() {
        gN a2;
        return a2.value;
    }

    public static gN valueOf(String a2) {
        return Enum.valueOf(gN.class, a2);
    }

    public static gN forNumber(int a2) {
        switch (a2) {
            case 2: {
                return HEIGHT;
            }
            case 3: {
                return HEIGHTANIM;
            }
            case 0: {
                while (false) {
                }
                return HEIGHTVAL_NOT_SET;
            }
        }
        return null;
    }

    @Deprecated
    public static gN valueOf(int a2) {
        return gN.forNumber(a2);
    }

    static {
        HEIGHT = new gN(uqa.g);
        HEIGHTANIM = new gN(yRa.d);
        HEIGHTVAL_NOT_SET = new gN(uSa.E);
        gN[] gNArray = new gN[yRa.d];
        gNArray[uSa.E] = HEIGHT;
        gNArray[vRa.d] = HEIGHTANIM;
        gNArray[uqa.g] = HEIGHTVAL_NOT_SET;
        $VALUES = gNArray;
    }

    private gN(int n3) {
        int b2 = n3;
        gN a2 = this;
        a2.value = b2;
    }
}

