/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class LO
extends Enum<LO> {
    public static final /* enum */ LO RADIUSVAL_NOT_SET;
    private final int value;
    private static final /* synthetic */ LO[] $VALUES;
    public static final /* enum */ LO RADIUS;
    public static final /* enum */ LO RADIUSANIM;

    @Deprecated
    public static LO valueOf(int a2) {
        return LO.forNumber(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static LO forNumber(int a2) {
        switch (a2) {
            case 5: {
                return RADIUS;
            }
            case 6: {
                return RADIUSANIM;
            }
            case 0: {
                return RADIUSVAL_NOT_SET;
            }
        }
        return null;
    }

    public static LO valueOf(String a2) {
        return Enum.valueOf(LO.class, a2);
    }

    private LO(int n3) {
        int b2 = n3;
        LO a2 = this;
        a2.value = b2;
    }

    public int getNumber() {
        LO a2;
        return a2.value;
    }

    static {
        RADIUS = new LO(tTa.h);
        RADIUSANIM = new LO(uua.p);
        RADIUSVAL_NOT_SET = new LO(uSa.E);
        LO[] lOArray = new LO[yRa.d];
        lOArray[uSa.E] = RADIUS;
        lOArray[vRa.d] = RADIUSANIM;
        lOArray[uqa.g] = RADIUSVAL_NOT_SET;
        $VALUES = lOArray;
    }

    public static LO[] values() {
        return (LO[])$VALUES.clone();
    }
}

