/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vca
 *  vRa
 */
public final class Vca_2
extends Enum<Vca> {
    public static final /* enum */ Vca ATTACK;
    public static final /* enum */ Vca INTERACT;
    public static final /* enum */ Vca INTERACT_AT;
    private static final /* synthetic */ Vca[] $VALUES;

    public static Vca valueOf(String a2) {
        return Enum.valueOf(Vca_2.class, a2);
    }

    private Vca_2() {
        int a2 = n2;
        Vca_2 vca_2 = this;
    }

    static {
        INTERACT = new Vca_2();
        ATTACK = new Vca_2();
        INTERACT_AT = new Vca_2();
        Vca_2[] vca_2Array = new Vca_2[yRa.d];
        vca_2Array[uSa.E] = INTERACT;
        vca_2Array[vRa.d] = ATTACK;
        vca_2Array[uqa.g] = INTERACT_AT;
        $VALUES = vca_2Array;
    }

    public static Vca[] values() {
        return (Vca[])$VALUES.clone();
    }
}

