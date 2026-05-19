/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EL
 *  Qsa
 *  bSa
 *  vRa
 */
public final class EL_2
extends Enum<EL> {
    public static final /* enum */ EL LINEAR = new EL_2(bSa.u);
    public final String id;
    public static final /* enum */ EL HERMITE = new EL_2(Qsa.H);
    private static final /* synthetic */ EL[] $VALUES;

    private EL_2(String string2) {
        Object b2 = string2;
        EL_2 a2 = this;
        a2.id = b2;
    }

    public static EL fromString(String string) {
        int a2;
        String string2 = string;
        EL[] eLArray = EL_2.values();
        int n2 = eLArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            EL eL2 = eLArray[a2];
            if (eL2.id.equals(string2)) {
                return eL2;
            }
            n3 = ++a2;
        }
        return LINEAR;
    }

    public static EL valueOf(String a2) {
        return Enum.valueOf(EL_2.class, a2);
    }

    public static EL[] values() {
        return (EL[])$VALUES.clone();
    }

    static {
        EL_2[] eL_2Array = new EL_2[uqa.g];
        eL_2Array[uSa.E] = LINEAR;
        eL_2Array[vRa.d] = HERMITE;
        $VALUES = eL_2Array;
    }
}

