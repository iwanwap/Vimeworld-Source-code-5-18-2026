/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  KTa
 *  NPa
 *  NTa
 *  XTa
 *  kta
 *  pqa
 *  psa
 *  sea
 *  vRa
 */
public final class sea_3
extends Enum<sea> {
    public static final /* enum */ sea SPRINT;
    private static final /* synthetic */ sea[] $VALUES;
    public static final /* enum */ sea HOP;
    private final float field_180077_g;
    public static final /* enum */ sea ATTACK;
    public static final /* enum */ sea STEP;
    private final int field_180085_i;
    public static final /* enum */ sea NONE;
    private final float speed;
    private final int duration;

    public int getDuration() {
        sea_3 a2;
        return a2.duration;
    }

    static {
        NONE = new sea_3(JPa.N, JPa.N, Fsa.d, vRa.d);
        HOP = new sea_3(xSa.la, psa.N, kTa.j, NTa.C);
        STEP = new sea_3(pqa.r, KTa.r, hpa.Z, hpa.Z);
        SPRINT = new sea_3(NPa.L, Xpa.R, vRa.d, Yqa.i);
        ATTACK = new sea_3(kta.v, ZSa.q, XTa.W, Yqa.i);
        sea_3[] sea_3Array = new sea_3[tTa.h];
        sea_3Array[uSa.E] = NONE;
        sea_3Array[vRa.d] = HOP;
        sea_3Array[uqa.g] = STEP;
        sea_3Array[yRa.d] = SPRINT;
        sea_3Array[AQa.P] = ATTACK;
        $VALUES = sea_3Array;
    }

    public int func_180073_d() {
        sea_3 a2;
        return a2.field_180085_i;
    }

    /*
     * WARNING - void declaration
     */
    private sea_3(float f2, float f3, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        sea_3 a2;
        int n5 = n4;
        sea_3 sea_32 = a2 = this;
        sea_3 sea_33 = a2;
        sea_33.speed = d2;
        sea_33.field_180077_g = c2;
        sea_32.duration = b2;
        sea_32.field_180085_i = e2;
    }

    public float getSpeed() {
        sea_3 a2;
        return a2.speed;
    }

    public float func_180074_b() {
        sea_3 a2;
        return a2.field_180077_g;
    }

    public static sea[] values() {
        return (sea[])$VALUES.clone();
    }

    public static sea valueOf(String a2) {
        return Enum.valueOf(sea_3.class, a2);
    }
}

