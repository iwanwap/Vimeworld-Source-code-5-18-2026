/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class kP
extends Enum<kP> {
    public static final /* enum */ kP JSON = new kP();
    public static final /* enum */ kP UNKNOWN;
    public static final /* enum */ kP ZIP;
    private static final /* synthetic */ kP[] $VALUES;

    public static kP[] values() {
        return (kP[])$VALUES.clone();
    }

    private kP() {
        int a2 = n2;
        kP kP2 = this;
    }

    static {
        ZIP = new kP();
        UNKNOWN = new kP();
        kP[] kPArray = new kP[yRa.d];
        kPArray[uSa.E] = JSON;
        kPArray[vRa.d] = ZIP;
        kPArray[uqa.g] = UNKNOWN;
        $VALUES = kPArray;
    }

    public static kP valueOf(String a2) {
        return Enum.valueOf(kP.class, a2);
    }
}

