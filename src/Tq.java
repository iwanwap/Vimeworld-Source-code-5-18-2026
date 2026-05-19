/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zo
 *  vRa
 */
public final class Tq
extends Enum<Tq> {
    private static final /* synthetic */ Tq[] $VALUES;
    public static final /* enum */ Tq NONE = new Tq(Zo.NONE);
    public static final /* enum */ Tq VERTICAL = new Tq(Zo.VERTICAL);
    public static final /* enum */ Tq HORIZONTAL = new Tq(Zo.HORIZONTAL);
    private final Zo proto;

    private Tq(Zo zo2) {
        Tq b2 = zo2;
        Tq a2 = this;
        a2.proto = b2;
    }

    public static Tq fromProto(Zo zo2) {
        int a2;
        Zo zo3 = zo2;
        Tq[] tqArray = Tq.values();
        int n2 = tqArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Tq tq = tqArray[a2];
            if (tq.proto == zo3) {
                return tq;
            }
            n3 = ++a2;
        }
        return NONE;
    }

    public static Tq[] values() {
        return (Tq[])$VALUES.clone();
    }

    public static Tq valueOf(String a2) {
        return Enum.valueOf(Tq.class, a2);
    }

    static {
        Tq[] tqArray = new Tq[yRa.d];
        tqArray[uSa.E] = NONE;
        tqArray[vRa.d] = VERTICAL;
        tqArray[uqa.g] = HORIZONTAL;
        $VALUES = tqArray;
    }
}

