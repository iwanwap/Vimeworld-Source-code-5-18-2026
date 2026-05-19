/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pba
 *  vRa
 */
public final class pba_1
extends Enum<pba> {
    public static final /* enum */ pba CHANGE = new pba_1();
    public static final /* enum */ pba REMOVE = new pba_1();
    private static final /* synthetic */ pba[] $VALUES;

    private pba_1() {
        int a2 = n2;
        pba_1 pba_12 = this;
    }

    static {
        pba_1[] pba_1Array = new pba_1[uqa.g];
        pba_1Array[uSa.E] = CHANGE;
        pba_1Array[vRa.d] = REMOVE;
        $VALUES = pba_1Array;
    }

    public static pba valueOf(String a2) {
        return Enum.valueOf(pba_1.class, a2);
    }

    public static pba[] values() {
        return (pba[])$VALUES.clone();
    }
}

