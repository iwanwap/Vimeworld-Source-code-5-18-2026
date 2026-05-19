/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DX
 *  pua
 *  vRa
 */
public final class DX_3
extends Enum<DX> {
    private static final /* synthetic */ DX[] $VALUES;
    public static final /* enum */ DX POSITIVE = new DX_3(vRa.d, Tqa.R);
    private final int offset;
    public static final /* enum */ DX NEGATIVE = new DX_3(pua.o, Fsa.h);
    private final String description;

    public String toString() {
        DX_3 a2;
        return a2.description;
    }

    public static DX valueOf(String a2) {
        return Enum.valueOf(DX_3.class, a2);
    }

    public int getOffset() {
        DX_3 a2;
        return a2.offset;
    }

    public static DX[] values() {
        return (DX[])$VALUES.clone();
    }

    static {
        DX_3[] dX_3Array = new DX_3[uqa.g];
        dX_3Array[uSa.E] = POSITIVE;
        dX_3Array[vRa.d] = NEGATIVE;
        $VALUES = dX_3Array;
    }

    /*
     * WARNING - void declaration
     */
    private DX_3(int n3, String string2) {
        Object c2;
        void b2;
        DX_3 a2;
        DX_3 dX_3 = object;
        Object object = string2;
        DX_3 dX_32 = a2 = dX_3;
        dX_32.offset = b2;
        dX_32.description = c2;
    }
}

