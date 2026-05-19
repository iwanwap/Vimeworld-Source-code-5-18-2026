/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  UNa
 *  ac
 *  lqa
 *  pqa
 *  uKa
 *  vRa
 *  wOa
 */
public final class Tma_2
extends ac {
    private final boolean I;

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_4, int var3_5) {
        block6: {
            d = var3_5;
            a = this;
            if (!a.k) break block6;
            c.J().J(UNa.J());
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (b < a.m || d < a.I) ** GOTO lbl-1000
            v0 = a;
            if (b >= v0.m + v0.j) ** GOTO lbl-1000
            v1 = a;
            if (d < v1.I + v1.E) {
                v2 = vRa.d;
            } else lbl-1000:
            // 3 sources

            {
                v2 = uSa.E;
            }
            c = v2;
            b = uSa.E;
            d = MTa.U;
            if (!a.J) {
                d += a.j * uqa.g;
                v3 = a;
            } else {
                if (c != 0) {
                    d += a.j;
                }
                v3 = a;
            }
            if (!v3.I) {
                b += a.E;
            }
            v4 = a;
            v5 = a;
            v4.f(v4.m, (int)v4.I, d, b, v5.j, v5.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Tma_2(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        Tma_2 a2 = this;
        super((int)d2, (int)c2, (int)b2, lqa.s, wOa.t, Mqa.y);
        a2.I = e2;
    }
}

