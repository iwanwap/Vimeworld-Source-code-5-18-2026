/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HOa
 *  Kpa
 *  ac
 *  pqa
 *  uKa
 *  vRa
 */
public final class Fma_2
extends ac {
    private final boolean I;

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_4, int var3_6) {
        block4: {
            d = var2_4;
            b = this;
            if (!b.k) break block4;
            if (d < b.m || a < b.I) ** GOTO lbl-1000
            v0 = b;
            if (d >= v0.m + v0.j) ** GOTO lbl-1000
            v1 = b;
            if (a < v1.I + v1.E) {
                v2 = vRa.d;
            } else lbl-1000:
            // 3 sources

            {
                v2 = uSa.E;
            }
            var4_7 = v2;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            c.J().J(HOa.J());
            c = uSa.E;
            d = ppa.f;
            if (var4_7 != 0) {
                c += 23;
            }
            if (!b.I) {
                d += 13;
            }
            v3 = b;
            v3.f(v3.m, (int)v3.I, c, d, AQa.ba, uua.s);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Fma_2(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        Fma_2 a2 = this;
        super((int)d2, (int)c2, (int)b2, AQa.ba, uua.s, Mqa.y);
        a2.I = e2;
    }
}

