/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MMa
 *  Ysa
 *  vRa
 */
public final class MMa_3
extends Enum<MMa> {
    public static final /* enum */ MMa FILE = new MMa_3(Ysa.f);
    private static final /* synthetic */ MMa[] $VALUES;
    private final String field_148583_c;
    public static final /* enum */ MMa SOUND_EVENT = new MMa_3(Era.V);

    public static MMa valueOf(String a2) {
        return Enum.valueOf(MMa_3.class, a2);
    }

    public static MMa getType(String string) {
        int a2;
        String string2 = string;
        MMa[] mMaArray = MMa_3.values();
        int n2 = mMaArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            MMa mMa2 = mMaArray[a2];
            if (mMa2.field_148583_c.equals(string2)) {
                return mMa2;
            }
            n3 = ++a2;
        }
        return null;
    }

    private MMa_3(String string2) {
        Object b2 = string2;
        MMa_3 a2 = this;
        a2.field_148583_c = b2;
    }

    public static MMa[] values() {
        return (MMa[])$VALUES.clone();
    }

    static {
        MMa_3[] mMa_3Array = new MMa_3[uqa.g];
        mMa_3Array[uSa.E] = FILE;
        mMa_3Array[vRa.d] = SOUND_EVENT;
        $VALUES = mMa_3Array;
    }
}

