/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Yra
 *  ac
 *  pqa
 *  uKa
 *  vRa
 */
public final class iOa
extends ac {
    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_4, int var3_6) {
        block3: {
            d = var2_4;
            b = this;
            if (!b.k) break block3;
            c.J().J(ac.L);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
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
            c = v2;
            d = Yra.j;
            if (c != 0) {
                d += b.E;
            }
            v3 = b;
            v4 = b;
            v3.f(v3.m, v3.I, uSa.E, d, v4.j, v4.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public iOa(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        iOa a2 = this;
        super((int)c2, (int)b2, d2, kTa.j, kTa.j, Mqa.y);
    }
}

