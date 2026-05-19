/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Lra
 *  Pqa
 *  Uqa
 *  XTa
 *  Yha
 *  jsa
 *  pQa
 *  vRa
 *  zsa
 */
public final class Yha_2
extends Enum<Yha> {
    public static final /* enum */ Yha FLOAT = new Yha_2(AQa.P, Jra.v, JPa.la);
    private final String displayName;
    public static final /* enum */ Yha BYTE;
    public static final /* enum */ Yha INT;
    private static final /* synthetic */ Yha[] $VALUES;
    private final int glConstant;
    public static final /* enum */ Yha UINT;
    private final int size;
    public static final /* enum */ Yha UBYTE;
    public static final /* enum */ Yha SHORT;
    public static final /* enum */ Yha USHORT;

    /*
     * WARNING - void declaration
     */
    private Yha_2(int n3, String string2, int n4) {
        void d2;
        void b2;
        void c2;
        Yha_2 a2;
        int n5 = n4;
        Yha_2 yha_2 = a2 = this;
        a2.size = c2;
        yha_2.displayName = b2;
        yha_2.glConstant = d2;
    }

    public static Yha valueOf(String a2) {
        return Enum.valueOf(Yha_2.class, a2);
    }

    public int getSize() {
        Yha_2 a2;
        return a2.size;
    }

    public int getGlConstant() {
        Yha_2 a2;
        return a2.glConstant;
    }

    public String getDisplayName() {
        Yha_2 a2;
        return a2.displayName;
    }

    static {
        UBYTE = new Yha_2(vRa.d, Jsa.i, Uqa.P);
        BYTE = new Yha_2(vRa.d, lTa.d, sra.Z);
        USHORT = new Yha_2(uqa.g, zsa.Aa, jsa.m);
        SHORT = new Yha_2(uqa.g, pQa.G, Yua.W);
        UINT = new Yha_2(AQa.P, rRa.D, Ira.t);
        INT = new Yha_2(AQa.P, Pqa.T, Lra.ha);
        Yha_2[] yha_2Array = new Yha_2[XTa.W];
        yha_2Array[uSa.E] = FLOAT;
        yha_2Array[vRa.d] = UBYTE;
        yha_2Array[uqa.g] = BYTE;
        yha_2Array[yRa.d] = USHORT;
        yha_2Array[AQa.P] = SHORT;
        yha_2Array[tTa.h] = UINT;
        yha_2Array[uua.p] = INT;
        $VALUES = yha_2Array;
    }

    public static Yha[] values() {
        return (Yha[])$VALUES.clone();
    }
}

