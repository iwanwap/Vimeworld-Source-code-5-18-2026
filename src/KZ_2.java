/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  Oz
 *  WSa
 *  YSa
 *  kta
 *  pqa
 *  vRa
 *  wOa
 */
public final class KZ_2 {
    private final float A;
    private final sZ I;

    /*
     * WARNING - void declaration
     */
    public KZ_2(sZ sZ2, long l2, long l3, float f2) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f3 = f2;
        KZ_2 a2 = this;
        a2.I = d2;
        a2.A = a2.J(a2.I, (long)c2, (long)b2, (float)e2);
    }

    /*
     * WARNING - void declaration
     */
    private float J(sZ sZ2, long l2, long l3, float f2) {
        void a2;
        void b2;
        void c22;
        void d2;
        KZ_2 kZ_2 = this;
        if (d2 == sZ.PEACEFUL) {
            return JPa.N;
        }
        int n2 = d2 == sZ.HARD ? vRa.d : uSa.E;
        float e2 = wOa.w;
        float c22 = Oz.J((float)(((float)c22 + Bra.y) / BQa.Ca), (float)JPa.N, (float)pqa.r) * rta.o;
        e2 += c22;
        float f3 = JPa.N;
        f3 += Oz.J((float)((float)b2 / WSa.Ka), (float)JPa.N, (float)pqa.r) * (n2 != 0 ? pqa.r : wOa.w);
        f3 += Oz.J((float)(a2 * rta.o), (float)JPa.N, (float)c22);
        if (d2 == sZ.EASY) {
            f3 *= MQa.L;
        }
        return (float)d2.getDifficultyId() * (e2 += f3);
    }

    public float f() {
        KZ_2 a2;
        if (a2.A < kta.v) {
            return JPa.N;
        }
        if (a2.A > YSa.G) {
            return pqa.r;
        }
        return (a2.A - kta.v) / kta.v;
    }

    public float J() {
        KZ_2 a2;
        return a2.A;
    }
}

