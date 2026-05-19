/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Rha
 *  SRa
 *  kqa
 *  vRa
 *  wPa
 */
public final class Rha_1
extends Enum<Rha> {
    public final int typeID;
    public static final /* enum */ Rha AFFECTED_BLOCKS;
    public static final /* enum */ Rha AFFECTED_ITEMS;
    public static final /* enum */ Rha AFFECTED_ENTITIES;
    public static final /* enum */ Rha QUERY_RESULT;
    public static final /* enum */ Rha SUCCESS_COUNT;
    private static final /* synthetic */ Rha[] $VALUES;
    public final String typeName;

    public static String[] getTypeNames() {
        int n2;
        String[] stringArray = new String[Rha_1.values().length];
        int n3 = uSa.E;
        Rha[] rhaArray = Rha_1.values();
        int n4 = rhaArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Rha rha2 = rhaArray[n2];
            stringArray[n3++] = rha2.getTypeName();
            n5 = ++n2;
        }
        return stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private Rha_1(int n3, String string2) {
        Object c2;
        void b2;
        Rha_1 a2;
        Rha_1 rha_1 = object;
        Object object = string2;
        Rha_1 rha_12 = a2 = rha_1;
        rha_12.typeID = b2;
        rha_12.typeName = c2;
    }

    public String getTypeName() {
        Rha_1 a2;
        return a2.typeName;
    }

    public static Rha getTypeByName(String string) {
        int a2;
        String string2 = string;
        Rha[] rhaArray = Rha_1.values();
        int n2 = rhaArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Rha rha2 = rhaArray[a2];
            if (rha2.getTypeName().equals(string2)) {
                return rha2;
            }
            n3 = ++a2;
        }
        return null;
    }

    public int getTypeID() {
        Rha_1 a2;
        return a2.typeID;
    }

    public static Rha valueOf(String a2) {
        return Enum.valueOf(Rha_1.class, a2);
    }

    static {
        SUCCESS_COUNT = new Rha_1(uSa.E, kqa.J);
        AFFECTED_BLOCKS = new Rha_1(vRa.d, wPa.H);
        AFFECTED_ENTITIES = new Rha_1(uqa.g, FPa.k);
        AFFECTED_ITEMS = new Rha_1(yRa.d, ypa.M);
        QUERY_RESULT = new Rha_1(AQa.P, SRa.Y);
        Rha_1[] rha_1Array = new Rha_1[tTa.h];
        rha_1Array[uSa.E] = SUCCESS_COUNT;
        rha_1Array[vRa.d] = AFFECTED_BLOCKS;
        rha_1Array[uqa.g] = AFFECTED_ENTITIES;
        rha_1Array[yRa.d] = AFFECTED_ITEMS;
        rha_1Array[AQa.P] = QUERY_RESULT;
        $VALUES = rha_1Array;
    }

    public static Rha[] values() {
        return (Rha[])$VALUES.clone();
    }
}

