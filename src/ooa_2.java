/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qqa
 *  XTa
 *  jRa
 *  ooa
 *  vRa
 *  zsa
 */
import net.minecraft.util.ResourceLocation;

public final class ooa_2
extends Enum<ooa> {
    public static final /* enum */ ooa END_BOSS;
    public static final /* enum */ ooa END;
    private final int minDelay;
    public static final /* enum */ ooa MENU;
    public static final /* enum */ ooa NETHER;
    public static final /* enum */ ooa GAME;
    public static final /* enum */ ooa CREATIVE;
    private final int maxDelay;
    public static final /* enum */ ooa CREDITS;
    private static final /* synthetic */ ooa[] $VALUES;
    private final ResourceLocation musicLocation;

    /*
     * WARNING - void declaration
     */
    private ooa_2(ResourceLocation resourceLocation, int n3, int n4) {
        void d2;
        void b2;
        void c2;
        ooa_2 a2;
        int n5 = n4;
        ooa_2 ooa_22 = a2 = this;
        a2.musicLocation = c2;
        ooa_22.minDelay = b2;
        ooa_22.maxDelay = d2;
    }

    public int getMinDelay() {
        ooa_2 a2;
        return a2.minDelay;
    }

    public int getMaxDelay() {
        ooa_2 a2;
        return a2.maxDelay;
    }

    public static ooa valueOf(String a2) {
        return Enum.valueOf(ooa_2.class, a2);
    }

    public static ooa[] values() {
        return (ooa[])$VALUES.clone();
    }

    public ResourceLocation getMusicLocation() {
        ooa_2 a2;
        return a2.musicLocation;
    }

    static {
        MENU = new ooa_2(new ResourceLocation(ZSa.J), kTa.j, Jpa.z);
        GAME = new ooa_2(new ResourceLocation(WRa.j), zsa.P, Qqa.B);
        CREATIVE = new ooa_2(new ResourceLocation(Ura.t), PRa.ga, csa.W);
        CREDITS = new ooa_2(new ResourceLocation(Hta.e), vqa.F, vqa.F);
        NETHER = new ooa_2(new ResourceLocation(ZSa.i), PRa.ga, csa.W);
        END_BOSS = new ooa_2(new ResourceLocation(mPa.N), uSa.E, uSa.E);
        END = new ooa_2(new ResourceLocation(jRa.w), MTa.g, Qqa.B);
        ooa_2[] ooa_2Array = new ooa_2[XTa.W];
        ooa_2Array[uSa.E] = MENU;
        ooa_2Array[vRa.d] = GAME;
        ooa_2Array[uqa.g] = CREATIVE;
        ooa_2Array[yRa.d] = CREDITS;
        ooa_2Array[AQa.P] = NETHER;
        ooa_2Array[tTa.h] = END_BOSS;
        ooa_2Array[uua.p] = END;
        $VALUES = ooa_2Array;
    }
}

