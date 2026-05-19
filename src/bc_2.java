/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mb
 *  aC
 *  bc
 *  kpa
 *  kqa
 *  qc
 *  ura
 *  vRa
 */
import java.util.function.Supplier;

public final class bc_2
extends Enum<bc> {
    public static final /* enum */ bc SETTINGS;
    public static final /* enum */ bc PARTY;
    private final String displayName;
    private final Supplier<jb> element;
    private static final /* synthetic */ bc[] $VALUES;
    public static final /* enum */ bc REQUESTS;

    public static bc valueOf(String a2) {
        return Enum.valueOf(bc_2.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    private bc_2(String string2, Supplier<jb> supplier) {
        Object c2;
        void b2;
        bc_2 a2;
        bc_2 bc_22 = object;
        Object object = supplier;
        bc_2 bc_23 = a2 = bc_22;
        bc_23.displayName = b2;
        bc_23.element = c2;
    }

    static {
        PARTY = new bc_2(kpa.n, aC.J());
        REQUESTS = new bc_2(ura.s, Mb.J());
        SETTINGS = new bc_2(kqa.m, qc.J());
        bc_2[] bc_2Array = new bc_2[yRa.d];
        bc_2Array[uSa.E] = PARTY;
        bc_2Array[vRa.d] = REQUESTS;
        bc_2Array[uqa.g] = SETTINGS;
        $VALUES = bc_2Array;
    }

    public String getDisplayName() {
        bc_2 a2;
        return a2.displayName;
    }

    public static bc[] values() {
        return (bc[])$VALUES.clone();
    }

    public Supplier<jb> getElement() {
        bc_2 a2;
        return a2.element;
    }
}

