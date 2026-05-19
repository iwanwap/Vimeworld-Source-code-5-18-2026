/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KG
 *  Wo
 *  qG
 *  vRa
 */
public final class KG_2
extends Enum<KG> {
    private static final /* synthetic */ KG[] $VALUES;
    public static final /* enum */ KG HEAD;
    public static final /* enum */ KG BODY;
    public static final /* enum */ KG NONE;

    static {
        NONE = new KG_2();
        BODY = new KG_2();
        HEAD = new KG_2();
        KG_2[] kG_2Array = new KG_2[yRa.d];
        kG_2Array[uSa.E] = NONE;
        kG_2Array[vRa.d] = BODY;
        kG_2Array[uqa.g] = HEAD;
        $VALUES = kG_2Array;
    }

    private KG_2() {
        int a2 = n2;
        KG_2 kG_2 = this;
    }

    public static KG[] values() {
        return (KG[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static KG fromProto(Wo a2) {
        switch (qG.I[a2.ordinal()]) {
            case 1: {
                return BODY;
            }
            case 2: {
                return HEAD;
            }
        }
        return NONE;
    }

    public static KG valueOf(String a2) {
        return Enum.valueOf(KG_2.class, a2);
    }
}

