/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bsa
 *  ERa
 *  KTa
 *  NPa
 *  NTa
 *  PTa
 *  Rb
 *  Rua
 *  Ssa
 *  Tpa
 *  VQa
 *  WSa
 *  XTa
 *  Ypa
 *  bpa
 *  dpa
 *  hTa
 *  kpa
 *  lqa
 *  mra
 *  pPa
 *  uQa
 *  ura
 *  vRa
 *  ysa
 */
public final class Rb_2
extends Enum<Rb> {
    public static final /* enum */ Rb SHADOW_RES_MUL;
    public static final /* enum */ Rb TEX_MIN_FIL_S;
    public static final /* enum */ Rb HAND_DEPTH_MUL;
    public static final /* enum */ Rb OLD_LIGHTING;
    private String propertyKey;
    public static final /* enum */ Rb TEX_MAG_FIL_S;
    public static final /* enum */ Rb ANTIALIASING;
    public static final /* enum */ Rb SHADER_PACK;
    public static final /* enum */ Rb OLD_HAND_LIGHT;
    public static final /* enum */ Rb SPECULAR_MAP;
    private String valueDefault;
    public static final /* enum */ Rb CLOUD_SHADOW;
    private static final /* synthetic */ Rb[] $VALUES;
    public static final /* enum */ Rb SHADOW_CLIP_FRUSTRUM;
    public static final /* enum */ Rb TEX_MIN_FIL_N;
    public static final /* enum */ Rb TEX_MAG_FIL_B;
    public static final /* enum */ Rb TEX_MIN_FIL_B;
    public static final /* enum */ Rb NORMAL_MAP;
    public static final /* enum */ Rb TEX_MAG_FIL_N;
    private String resourceKey;
    public static final /* enum */ Rb TWEAK_BLOCK_DAMAGE;
    public static final /* enum */ Rb RENDER_RES_MUL;

    public static Rb[] values() {
        return (Rb[])$VALUES.clone();
    }

    public String getResourceKey() {
        Rb_2 a2;
        return a2.resourceKey;
    }

    static {
        ANTIALIASING = new Rb_2(gQa.A, WRa.K, GPa.J);
        NORMAL_MAP = new Rb_2(xra.I, ura.i, oQa.l);
        SPECULAR_MAP = new Rb_2(APa.la, Bsa.R, oQa.l);
        RENDER_RES_MUL = new Rb_2(hTa.y, dpa.k, qQa.F);
        SHADOW_RES_MUL = new Rb_2(bsa.Ja, NPa.n, qQa.F);
        HAND_DEPTH_MUL = new Rb_2(aua.p, PTa.t, VQa.I);
        CLOUD_SHADOW = new Rb_2(eua.B, sSa.u, oQa.l);
        OLD_HAND_LIGHT = new Rb_2(ysa.Ha, yOa.w, BQa.la);
        OLD_LIGHTING = new Rb_2(Ssa.y, rQa.r, BQa.la);
        SHADER_PACK = new Rb_2(uQa.f, ERa.v, Mqa.y);
        TWEAK_BLOCK_DAMAGE = new Rb_2(POa.N, fta.M, MRa.E);
        SHADOW_CLIP_FRUSTRUM = new Rb_2(BRa.V, zua.i, oQa.l);
        TEX_MIN_FIL_B = new Rb_2(mra.D, rQa.n, GPa.J);
        TEX_MIN_FIL_N = new Rb_2(WSa.u, hpa.X, GPa.J);
        TEX_MIN_FIL_S = new Rb_2(KTa.I, kpa.T, GPa.J);
        TEX_MAG_FIL_B = new Rb_2(bpa.C, Rua.S, GPa.J);
        TEX_MAG_FIL_N = new Rb_2(Eqa.Y, sSa.i, GPa.J);
        TEX_MAG_FIL_S = new Rb_2(Tpa.p, nqa.o, GPa.J);
        Rb_2[] rb_2Array = new Rb_2[yOa.B];
        rb_2Array[uSa.E] = ANTIALIASING;
        rb_2Array[vRa.d] = NORMAL_MAP;
        rb_2Array[uqa.g] = SPECULAR_MAP;
        rb_2Array[yRa.d] = RENDER_RES_MUL;
        rb_2Array[AQa.P] = SHADOW_RES_MUL;
        rb_2Array[tTa.h] = HAND_DEPTH_MUL;
        rb_2Array[uua.p] = CLOUD_SHADOW;
        rb_2Array[XTa.W] = OLD_HAND_LIGHT;
        rb_2Array[Yqa.i] = OLD_LIGHTING;
        rb_2Array[WOa.fa] = SHADER_PACK;
        rb_2Array[NTa.C] = TWEAK_BLOCK_DAMAGE;
        rb_2Array[pPa.f] = SHADOW_CLIP_FRUSTRUM;
        rb_2Array[lqa.s] = TEX_MIN_FIL_B;
        rb_2Array[uua.s] = TEX_MIN_FIL_N;
        rb_2Array[hpa.Z] = TEX_MIN_FIL_S;
        rb_2Array[Ypa.A] = TEX_MAG_FIL_B;
        rb_2Array[ERa.C] = TEX_MAG_FIL_N;
        rb_2Array[yta.Ka] = TEX_MAG_FIL_S;
        $VALUES = rb_2Array;
    }

    public String getValueDefault() {
        Rb_2 a2;
        return a2.valueDefault;
    }

    public static Rb valueOf(String a2) {
        return Enum.valueOf(Rb_2.class, a2);
    }

    public String getPropertyKey() {
        Rb_2 a2;
        return a2.propertyKey;
    }

    /*
     * WARNING - void declaration
     */
    private Rb_2(String string2, String string3, String string4) {
        Object d2;
        void b2;
        void c2;
        Rb_2 a2;
        Rb_2 rb_2 = object;
        Object object = string4;
        Rb_2 rb_22 = a2 = rb_2;
        Rb_2 rb_23 = a2;
        Rb_2 rb_24 = a2;
        rb_24.resourceKey = null;
        rb_24.propertyKey = null;
        rb_23.valueDefault = null;
        rb_23.resourceKey = c2;
        rb_22.propertyKey = b2;
        rb_22.valueDefault = d2;
    }
}

