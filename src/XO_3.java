/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQ
 *  XO
 *  vRa
 */
public final class XO_3
extends Enum<XO> {
    public static final /* enum */ XO VISIBLE = new XO_3();
    private static final /* synthetic */ XO[] $VALUES;
    public static final /* enum */ XO TRIM = new XO_3();
    public static final /* enum */ XO DOTS = new XO_3();

    private XO_3() {
        int a2 = n2;
        XO_3 xO_3 = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static XO fromProto(ZL a2) {
        switch (EQ.j[a2.ordinal()]) {
            case 1: {
                return TRIM;
            }
            case 2: {
                return DOTS;
            }
        }
        return VISIBLE;
    }

    static {
        XO_3[] xO_3Array = new XO_3[yRa.d];
        xO_3Array[uSa.E] = VISIBLE;
        xO_3Array[vRa.d] = TRIM;
        xO_3Array[uqa.g] = DOTS;
        $VALUES = xO_3Array;
    }

    public static XO[] values() {
        return (XO[])$VALUES.clone();
    }

    public static XO valueOf(String a2) {
        return Enum.valueOf(XO_3.class, a2);
    }
}

