/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sqa
 *  Ut
 *  XTa
 *  hqa
 *  vRa
 */
public final class Ut_3
extends Enum<Ut> {
    public static final /* enum */ Ut WINTER;
    public static final /* enum */ Ut HIDE_WITH_LEGGINGS;
    public static final /* enum */ Ut HIDE_WITH_BOOTS;
    public static final /* enum */ Ut SUMMER;
    private final char symbol;
    private static final /* synthetic */ Ut[] $VALUES;
    public static final /* enum */ Ut SPRING;
    public static final /* enum */ Ut HIDE_WITH_HELMET;
    public static final /* enum */ Ut HIDE_WITH_CHESTPLATE;
    public static final /* enum */ Ut FALL;

    private Ut_3(char c2) {
        char b2 = c2;
        Ut_3 a2 = this;
        a2.symbol = b2;
    }

    static {
        FALL = new Ut_3((char)csa.ja);
        SPRING = new Ut_3((char)MTa.ja);
        SUMMER = new Ut_3((char)Bua.ca);
        WINTER = new Ut_3((char)Sqa.Ma);
        HIDE_WITH_HELMET = new Ut_3((char)Nra.ja);
        HIDE_WITH_CHESTPLATE = new Ut_3((char)gsa.t);
        HIDE_WITH_LEGGINGS = new Ut_3((char)hqa.h);
        HIDE_WITH_BOOTS = new Ut_3((char)FRa.Ja);
        Ut_3[] ut_3Array = new Ut_3[Yqa.i];
        ut_3Array[uSa.E] = FALL;
        ut_3Array[vRa.d] = SPRING;
        ut_3Array[uqa.g] = SUMMER;
        ut_3Array[yRa.d] = WINTER;
        ut_3Array[AQa.P] = HIDE_WITH_HELMET;
        ut_3Array[tTa.h] = HIDE_WITH_CHESTPLATE;
        ut_3Array[uua.p] = HIDE_WITH_LEGGINGS;
        ut_3Array[XTa.W] = HIDE_WITH_BOOTS;
        $VALUES = ut_3Array;
    }

    public static Ut[] values() {
        return (Ut[])$VALUES.clone();
    }

    public char getSymbol() {
        Ut_3 a2;
        return a2.symbol;
    }

    public static Ut valueOf(String a2) {
        return Enum.valueOf(Ut_3.class, a2);
    }
}

