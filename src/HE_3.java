/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  HE
 *  TQa
 *  Zpa
 *  Zta
 *  aQa
 *  pqa
 *  vRa
 *  wra
 */
public final class HE_3
extends Enum<HE> {
    private final String title;
    private static final /* synthetic */ HE[] $VALUES;
    private final String[] description;
    private final String emoji;
    public static final /* enum */ HE OFF;
    public static final /* enum */ HE REQUEST;
    public static final /* enum */ HE ON;
    private final String command;

    public String getCommand() {
        HE_3 a2;
        return a2.command;
    }

    public String getTitle() {
        HE_3 a2;
        return a2.title;
    }

    static {
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = TQa.f;
        stringArray[vRa.d] = uqa.N;
        ON = new HE_3(wra.Ka, aQa.P, sSa.x, stringArray);
        String[] stringArray2 = new String[uqa.g];
        stringArray2[uSa.E] = Zpa.s;
        stringArray2[vRa.d] = Ata.Z;
        REQUEST = new HE_3(Zta.G, ZSa.j, Eqa.Da, stringArray2);
        String[] stringArray3 = new String[uqa.g];
        stringArray3[uSa.E] = UTa.m;
        stringArray3[vRa.d] = cPa.Ca;
        OFF = new HE_3(pqa.u, vqa.C, xTa.P, stringArray3);
        HE_3[] hE_3Array = new HE_3[yRa.d];
        hE_3Array[uSa.E] = ON;
        hE_3Array[vRa.d] = REQUEST;
        hE_3Array[uqa.g] = OFF;
        $VALUES = hE_3Array;
    }

    public static HE valueOf(String a2) {
        return Enum.valueOf(HE_3.class, a2);
    }

    public static HE[] values() {
        return (HE[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private HE_3(String string2, String string3, String string4, String ... stringArray) {
        String[] e2;
        void b2;
        void c2;
        void d2;
        String[] stringArray2 = stringArray3;
        String[] stringArray3 = stringArray;
        String[] a2 = stringArray2;
        a2.emoji = d2;
        a2.command = c2;
        a2.title = b2;
        a2.description = e2;
    }

    public String[] getDescription() {
        HE_3 a2;
        return a2.description;
    }

    public String getEmoji() {
        HE_3 a2;
        return a2.emoji;
    }
}

