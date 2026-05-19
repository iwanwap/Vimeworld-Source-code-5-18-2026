/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Uta
 *  ZOa
 *  ld
 *  poa
 *  vRa
 */
public final class poa_1
extends Enum<poa> {
    public static final /* enum */ poa PROMPT;
    private final ld motd;
    private static final /* synthetic */ poa[] $VALUES;
    public static final /* enum */ poa DISABLED;
    public static final /* enum */ poa ENABLED;

    private poa_1(String string2) {
        Object b2 = string2;
        poa_1 a2 = this;
        poa_1 poa_12 = a2;
        poa_12.motd = new CZ(new StringBuilder().insert(3 >> 2, ZOa.fa).append((String)b2).toString(), new Object[uSa.E]);
    }

    static {
        ENABLED = new poa_1(Uta.p);
        DISABLED = new poa_1(Nta.q);
        PROMPT = new poa_1(Tqa.x);
        poa_1[] poa_1Array = new poa_1[yRa.d];
        poa_1Array[uSa.E] = ENABLED;
        poa_1Array[vRa.d] = DISABLED;
        poa_1Array[uqa.g] = PROMPT;
        $VALUES = poa_1Array;
    }

    public static poa[] values() {
        return (poa[])$VALUES.clone();
    }

    public static poa valueOf(String a2) {
        return Enum.valueOf(poa_1.class, a2);
    }

    public ld getMotd() {
        poa_1 a2;
        return a2.motd;
    }
}

