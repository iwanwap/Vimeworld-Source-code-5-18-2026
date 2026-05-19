/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kK
 *  vRa
 */
public final class kK_2
extends Enum<kK> {
    public static final /* enum */ kK SERVER = new kK_2();
    public static final /* enum */ kK REMOTE = new kK_2();
    private static final /* synthetic */ kK[] $VALUES;

    public static kK valueOf(String a2) {
        return Enum.valueOf(kK_2.class, a2);
    }

    private kK_2() {
        int a2 = n2;
        kK_2 kK_22 = this;
    }

    public static kK[] values() {
        return (kK[])$VALUES.clone();
    }

    static {
        kK_2[] kK_2Array = new kK_2[uqa.g];
        kK_2Array[uSa.E] = SERVER;
        kK_2Array[vRa.d] = REMOTE;
        $VALUES = kK_2Array;
    }
}

