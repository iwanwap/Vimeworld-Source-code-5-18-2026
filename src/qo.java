/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class qo
extends Enum<qo> {
    public static final /* enum */ qo SCROLLOFFSETVAL_NOT_SET;
    public static final /* enum */ qo SCROLLOFFSETANIM;
    private final int value;
    private static final /* synthetic */ qo[] $VALUES;
    public static final /* enum */ qo SCROLLOFFSET;

    public static qo forNumber(int a2) {
        switch (a2) {
            case 2: {
                return SCROLLOFFSET;
            }
            case 3: {
                return SCROLLOFFSETANIM;
            }
            case 0: {
                while (false) {
                }
                return SCROLLOFFSETVAL_NOT_SET;
            }
        }
        return null;
    }

    public int getNumber() {
        qo a2;
        return a2.value;
    }

    static {
        SCROLLOFFSET = new qo(uqa.g);
        SCROLLOFFSETANIM = new qo(yRa.d);
        SCROLLOFFSETVAL_NOT_SET = new qo(uSa.E);
        qo[] qoArray = new qo[yRa.d];
        qoArray[uSa.E] = SCROLLOFFSET;
        qoArray[vRa.d] = SCROLLOFFSETANIM;
        qoArray[uqa.g] = SCROLLOFFSETVAL_NOT_SET;
        $VALUES = qoArray;
    }

    private qo(int n3) {
        int b2 = n3;
        qo a2 = this;
        a2.value = b2;
    }

    @Deprecated
    public static qo valueOf(int a2) {
        return qo.forNumber(a2);
    }

    public static qo[] values() {
        return (qo[])$VALUES.clone();
    }

    public static qo valueOf(String a2) {
        return Enum.valueOf(qo.class, a2);
    }
}

