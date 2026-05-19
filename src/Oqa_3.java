/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oqa
 *  vRa
 */
public final class Oqa_3
extends Enum<Oqa> {
    private final boolean increase;
    private final boolean horizontal;
    public static final /* enum */ Oqa ROW = new Oqa_3(vRa.d != 0, uSa.E != 0);
    public static final /* enum */ Oqa COLUMN = new Oqa_3(vRa.d != 0, vRa.d != 0);
    private static final /* synthetic */ Oqa[] $VALUES;

    static {
        Oqa_3[] oqa_3Array = new Oqa_3[uqa.g];
        oqa_3Array[uSa.E] = ROW;
        oqa_3Array[vRa.d] = COLUMN;
        $VALUES = oqa_3Array;
    }

    public static Oqa valueOf(String a2) {
        return Enum.valueOf(Oqa_3.class, a2);
    }

    public boolean isHorizontal() {
        Oqa_3 a2;
        return a2.horizontal;
    }

    public static Oqa[] values() {
        return (Oqa[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private Oqa_3(boolean bl2, boolean bl3) {
        void c2;
        void b2;
        Oqa_3 a2;
        boolean bl4 = bl3;
        Oqa_3 oqa_3 = a2 = this;
        oqa_3.increase = b2;
        oqa_3.horizontal = c2;
    }

    public boolean isIncrease() {
        Oqa_3 a2;
        return a2.increase;
    }

    public boolean isVertical() {
        Oqa_3 a2;
        if (!a2.isHorizontal()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

