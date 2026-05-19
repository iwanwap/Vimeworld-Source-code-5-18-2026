/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  EU
 *  FTa
 *  NOa
 *  NTa
 *  Qqa
 *  TQa
 *  URa
 *  XTa
 *  fTa
 *  lPa
 *  pPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class EU_2
extends Enum<EU> {
    public static final /* enum */ EU TOURNAMENT;
    public static final /* enum */ EU PRIME;
    public static final /* enum */ EU SPRING;
    public static final /* enum */ EU WINTER;
    private final boolean visible;
    public static final /* enum */ EU HALLOWEEN;
    private ResourceLocation background;
    public static final /* enum */ EU NONE;
    private final String name;
    public static final /* enum */ EU EASTER;
    public static final /* enum */ EU FALL;
    public static final /* enum */ EU SUMMER;
    public static final /* enum */ EU VALENTINE;
    private int backgroundColor;
    public static final /* enum */ EU GENERIC_RARE;
    private static final /* synthetic */ EU[] $VALUES;

    /*
     * WARNING - void declaration
     */
    private EU_2(boolean bl, String string2, int n3) {
        void d2;
        void b2;
        void c2;
        EU_2 a2;
        int n4 = n3;
        EU_2 eU_2 = a2 = this;
        a2.visible = c2;
        eU_2.name = b2;
        eU_2.backgroundColor = d2;
    }

    public String getName() {
        EU_2 a2;
        return a2.name;
    }

    public static EU[] values() {
        return (EU[])$VALUES.clone();
    }

    public String getStringId() {
        EU_2 a2;
        if (a2 == NONE) {
            return Mqa.y;
        }
        return a2.name().toLowerCase();
    }

    public int getBackgroundColor() {
        EU_2 a2;
        return a2.backgroundColor;
    }

    /*
     * WARNING - void declaration
     */
    private EU_2(boolean bl, String string2, ResourceLocation resourceLocation) {
        Object d2;
        void b2;
        void c2;
        EU_2 a2;
        EU_2 eU_2 = object;
        Object object = resourceLocation;
        EU_2 eU_22 = a2 = eU_2;
        a2.visible = c2;
        eU_22.name = b2;
        eU_22.background = d2;
    }

    public ResourceLocation getBackground() {
        EU_2 a2;
        return a2.background;
    }

    public static EU valueOf(String a2) {
        return Enum.valueOf(EU_2.class, a2);
    }

    static {
        PRIME = new EU_2(uSa.E != 0, fTa.D, lPa.m);
        GENERIC_RARE = new EU_2(uSa.E != 0, null, lQa.r);
        TOURNAMENT = new EU_2(uSa.E != 0, null, Jta.ca);
        HALLOWEEN = new EU_2(uSa.E != 0, Qqa.o, URa.v);
        FALL = new EU_2(uSa.E != 0, TQa.Ha, WPa.M);
        SUMMER = new EU_2(uSa.E != 0, Ora.d, Hra.L);
        EASTER = new EU_2(uSa.E != 0, Jta.Q, Ura.J);
        SPRING = new EU_2(uSa.E != 0, Ata.N, NOa.t);
        WINTER = new EU_2(uSa.E != 0, hQa.Z, TOa.B);
        VALENTINE = new EU_2(uSa.E != 0, FTa.U, Jqa.l);
        NONE = new EU_2(vRa.d != 0, null, uSa.E);
        EU_2[] eU_2Array = new EU_2[pPa.f];
        eU_2Array[uSa.E] = PRIME;
        eU_2Array[vRa.d] = GENERIC_RARE;
        eU_2Array[uqa.g] = TOURNAMENT;
        eU_2Array[yRa.d] = HALLOWEEN;
        eU_2Array[AQa.P] = FALL;
        eU_2Array[tTa.h] = SUMMER;
        eU_2Array[uua.p] = EASTER;
        eU_2Array[XTa.W] = SPRING;
        eU_2Array[Yqa.i] = WINTER;
        eU_2Array[WOa.fa] = VALENTINE;
        eU_2Array[NTa.C] = NONE;
        $VALUES = eU_2Array;
    }

    public boolean isVisible() {
        EU_2 a2;
        return a2.visible;
    }
}

