/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  ac
 *  pqa
 *  uKa
 *  vRa
 */
public final class bMa_2
extends ac {
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public bMa_2(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        bMa_2 a2 = this;
        super((int)c2, (int)b2, d2, kTa.j, kTa.j, Mqa.y);
        a2.I = uSa.E;
    }

    public boolean f() {
        bMa_2 a2;
        return a2.I;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        bMa_2 a2 = this;
        a2.I = b2;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_3, int var2_5, int var3_7) {
        block12: {
            d = var2_5;
            b = this;
            if (!b.k) break block12;
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
                v2 = c = uSa.E;
            }
            if (b.I) {
                if (!b.J) {
                    d = HMa.LOCKED_DISABLED;
                    v3 = b;
                } else if (c != 0) {
                    d = HMa.LOCKED_HOVER;
                    v3 = b;
                } else {
                    d = HMa.LOCKED;
                    v3 = b;
                }
            } else if (!b.J) {
                d = HMa.UNLOCKED_DISABLED;
                v3 = b;
            } else if (c != 0) {
                d = HMa.UNLOCKED_HOVER;
                v3 = b;
            } else {
                d = HMa.UNLOCKED;
                v3 = b;
            }
            v4 = b;
            v5 = b;
            v3.f(v4.m, (int)v4.I, d.func_178910_a(), d.func_178912_b(), v5.j, v5.E);
        }
    }
}

