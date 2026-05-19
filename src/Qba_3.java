/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qba
 *  vRa
 */
public final class Qba_3
extends Enum<Qba> {
    public static final /* enum */ Qba OPEN_INVENTORY_ACHIEVEMENT;
    private static final /* synthetic */ Qba[] $VALUES;
    public static final /* enum */ Qba REQUEST_STATS;
    public static final /* enum */ Qba PERFORM_RESPAWN;

    public static Qba[] values() {
        return (Qba[])$VALUES.clone();
    }

    private Qba_3() {
        int a2 = n2;
        Qba_3 qba_3 = this;
    }

    public static Qba valueOf(String a2) {
        return Enum.valueOf(Qba_3.class, a2);
    }

    static {
        PERFORM_RESPAWN = new Qba_3();
        REQUEST_STATS = new Qba_3();
        OPEN_INVENTORY_ACHIEVEMENT = new Qba_3();
        Qba_3[] qba_3Array = new Qba_3[yRa.d];
        qba_3Array[uSa.E] = PERFORM_RESPAWN;
        qba_3Array[vRa.d] = REQUEST_STATS;
        qba_3Array[uqa.g] = OPEN_INVENTORY_ACHIEVEMENT;
        $VALUES = qba_3Array;
    }
}

