/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Lra
 *  UL
 *  bRa
 *  fpa
 *  jRa
 *  kpa
 *  uKa
 *  vRa
 */
public final class UL_3
extends Enum<UL> {
    public final String id;
    public static final /* enum */ UL ALPHA;
    public static final /* enum */ UL OPAQUE;
    public static final /* enum */ UL ADDITIVE;
    private static final /* synthetic */ UL[] $VALUES;
    public static final /* enum */ UL BLEND;

    public static UL fromString(String string) {
        int a2;
        String string2 = string;
        UL[] uLArray = UL_3.values();
        int n2 = uLArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            UL uL2 = uLArray[a2];
            if (uL2.id.equals(string2)) {
                return uL2;
            }
            n3 = ++a2;
        }
        return OPAQUE;
    }

    public static UL[] values() {
        return (UL[])$VALUES.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void endGL() {
        UL_3 a2;
        switch (lj.I[a2.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.k();
                uKa.K();
                uKa.J((int)jRa.m, (float)Nra.e);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void beginGL() {
        UL_3 a2;
        switch (lj.I[a2.ordinal()]) {
            case 1: {
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.J((int)jRa.m, (float)JPa.N);
                uKa.k();
                uKa.K();
                return;
            }
            case 2: {
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.J((int)jRa.m, (float)Nra.e);
                uKa.k();
                uKa.K();
                return;
            }
            case 3: {
                uKa.f((int)Lra.k, (int)kpa.J);
                uKa.J((int)jRa.m, (float)JPa.N);
                uKa.B();
                uKa.K();
                return;
            }
            case 4: {
                uKa.f((int)Lra.k, (int)vRa.d);
                uKa.J((int)jRa.m, (float)JPa.N);
                uKa.B();
                uKa.K();
                return;
            }
        }
    }

    static {
        OPAQUE = new UL_3(vua.ca);
        ALPHA = new UL_3(fpa.T);
        BLEND = new UL_3(Ura.o);
        ADDITIVE = new UL_3(bRa.ja);
        UL_3[] uL_3Array = new UL_3[AQa.P];
        uL_3Array[uSa.E] = OPAQUE;
        uL_3Array[vRa.d] = ALPHA;
        uL_3Array[uqa.g] = BLEND;
        uL_3Array[yRa.d] = ADDITIVE;
        $VALUES = uL_3Array;
    }

    public static UL valueOf(String a2) {
        return Enum.valueOf(UL_3.class, a2);
    }

    private UL_3(String string2) {
        Object b2 = string2;
        UL_3 a2 = this;
        a2.id = b2;
    }
}

