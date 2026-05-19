/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oY
 *  vRa
 */
public final class oY_3
extends Enum<oY> {
    public static final /* enum */ oY QUEUED;
    public static final /* enum */ oY IMMEDIATE;
    private static final /* synthetic */ oY[] $VALUES;
    public static final /* enum */ oY CHECK;

    static {
        IMMEDIATE = new oY_3();
        QUEUED = new oY_3();
        CHECK = new oY_3();
        oY_3[] oY_3Array = new oY_3[yRa.d];
        oY_3Array[uSa.E] = IMMEDIATE;
        oY_3Array[vRa.d] = QUEUED;
        oY_3Array[uqa.g] = CHECK;
        $VALUES = oY_3Array;
    }

    public static oY[] values() {
        return (oY[])$VALUES.clone();
    }

    private oY_3() {
        int a2 = n2;
        oY_3 oY_32 = this;
    }

    public static oY valueOf(String a2) {
        return Enum.valueOf(oY_3.class, a2);
    }
}

