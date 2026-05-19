/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class qaa
extends Enum<qaa> {
    public static final /* enum */ qaa GROWING = new qaa(APa.F);
    public static final /* enum */ qaa STATIONARY;
    public static final /* enum */ qaa SHRINKING;
    private final int id;
    private static final /* synthetic */ qaa[] $VALUES;

    public int getID() {
        qaa a2;
        return a2.id;
    }

    static {
        SHRINKING = new qaa(vua.x);
        STATIONARY = new qaa(PRa.z);
        qaa[] qaaArray = new qaa[yRa.d];
        qaaArray[uSa.E] = GROWING;
        qaaArray[vRa.d] = SHRINKING;
        qaaArray[uqa.g] = STATIONARY;
        $VALUES = qaaArray;
    }

    public static qaa[] values() {
        return (qaa[])$VALUES.clone();
    }

    private qaa(int n3) {
        int b2 = n3;
        qaa a2 = this;
        a2.id = b2;
    }

    public static qaa valueOf(String a2) {
        return Enum.valueOf(qaa.class, a2);
    }
}

