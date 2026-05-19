/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  ig
 *  pqa
 *  sB
 */
public final class Ne
extends ig {
    /*
     * WARNING - void declaration
     */
    public float interpolate(qE qE2, float f2, qE qE3) {
        float f3;
        void a22;
        void b2;
        Object d2 = qE2;
        Ne c2 = this;
        if (b2 <= JPa.N) {
            return qE.f((qE)d2);
        }
        if (b2 >= pqa.r) {
            return qE.f((qE)a22);
        }
        void v0 = a22;
        float f4 = qE.J((qE)v0) - qE.J((qE)d2);
        float f5 = qE.f((qE)v0) - qE.f((qE)d2);
        if (f5 == JPa.N) {
            f5 = BPa.n;
        }
        Object object = d2;
        float f6 = (qE.f((qE)object).x - qE.J((qE)d2)) / f4;
        float f7 = (qE.f((qE)object).y - qE.f((qE)d2)) / f5;
        void v2 = a22;
        float a22 = (qE.J((qE)v2).x - qE.J((qE)d2)) / f4;
        f4 = (qE.J((qE)v2).y - qE.f((qE)d2)) / f5;
        float f8 = f3 = AQa.f;
        f3 = Math.max(Math.min(f8, pqa.r / f5 * f8), BPa.n);
        f6 = Oz.J((float)f6, (float)JPa.N, (float)pqa.r);
        a22 = Oz.J((float)a22, (float)JPa.N, (float)pqa.r);
        return sB.J((float)JPa.N, (float)f7, (float)f4, (float)pqa.r, (float)sB.J((float)f6, (float)a22, (float)b2, (float)f3)) * f5 + qE.f((qE)d2);
    }

    public Ne() {
        int a2 = n2;
        Ne ne = this;
        super(string, a2, null);
    }
}

