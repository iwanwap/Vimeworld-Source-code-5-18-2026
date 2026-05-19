/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Rda
 *  Wsa
 *  XTa
 *  YSa
 *  ZRa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;

public final class Rda_3
extends Enum<Rda> {
    public static final /* enum */ Rda RIDEABLE;
    private final int networkID;
    private static final Map<Integer, Rda> ID_LOOKUP;
    private static final /* synthetic */ Rda[] $VALUES;
    public static final /* enum */ Rda CHEST;
    private final String name;
    public static final /* enum */ Rda FURNACE;
    public static final /* enum */ Rda SPAWNER;
    public static final /* enum */ Rda COMMAND_BLOCK;
    public static final /* enum */ Rda HOPPER;
    public static final /* enum */ Rda TNT;

    public static Rda valueOf(String a2) {
        return Enum.valueOf(Rda_3.class, a2);
    }

    public int getNetworkID() {
        Rda_3 a2;
        return a2.networkID;
    }

    /*
     * WARNING - void declaration
     */
    private Rda_3(int n3, String string2) {
        Object c2;
        void b2;
        Rda_3 a2;
        Rda_3 rda_3 = object;
        Object object = string2;
        Rda_3 rda_32 = a2 = rda_3;
        rda_32.networkID = b2;
        rda_32.name = c2;
    }

    public static Rda byNetworkID(int n2) {
        int n3 = n2;
        Rda_3 a2 = (Rda_3)ID_LOOKUP.get(n3);
        if (a2 == null) {
            return RIDEABLE;
        }
        return a2;
    }

    public String getName() {
        Rda_3 a2;
        return a2.name;
    }

    public static Rda[] values() {
        return (Rda[])$VALUES.clone();
    }

    static {
        int n2;
        RIDEABLE = new Rda_3(uSa.E, APa.q);
        CHEST = new Rda_3(vRa.d, YSa.Z);
        FURNACE = new Rda_3(uqa.g, ATa.C);
        TNT = new Rda_3(yRa.d, Wsa.V);
        SPAWNER = new Rda_3(AQa.P, ZRa.S);
        HOPPER = new Rda_3(tTa.h, UTa.J);
        COMMAND_BLOCK = new Rda_3(uua.p, ERa.Q);
        Rda_3[] rda_3Array = new Rda_3[XTa.W];
        rda_3Array[uSa.E] = RIDEABLE;
        rda_3Array[vRa.d] = CHEST;
        rda_3Array[uqa.g] = FURNACE;
        rda_3Array[yRa.d] = TNT;
        rda_3Array[AQa.P] = SPAWNER;
        rda_3Array[tTa.h] = HOPPER;
        rda_3Array[uua.p] = COMMAND_BLOCK;
        $VALUES = rda_3Array;
        ID_LOOKUP = Maps.newHashMap();
        Rda[] rdaArray = Rda_3.values();
        int n3 = rdaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Rda rda2 = rdaArray[n2];
            ID_LOOKUP.put(rda2.getNetworkID(), rda2);
            n4 = ++n2;
        }
    }
}

