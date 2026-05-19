/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HH
 *  ah
 *  pqa
 */
public final class ii_2
implements b {
    private float i;
    private final K M;
    private long k;
    private final b j;
    private float J;
    private final b A;
    private float I;

    private float f() {
        float f2;
        ii_2 ii_22 = this;
        if (ii_22.k < nqa.i) {
            return ii_22.i;
        }
        float a2 = (float)(OT.e - ii_22.k) / ii_22.J;
        if (f2 >= pqa.r) {
            ii_22.k = fqa.Da;
            return ii_22.i;
        }
        ii_2 ii_23 = ii_22;
        ii_2 ii_24 = ii_22;
        return ii_23.I + ii_23.M.J(a2) * (ii_24.i - ii_24.I);
    }

    /*
     * WARNING - void declaration
     */
    public ii_2(b b2, b b3, b b4) {
        void b5;
        void c2;
        ii_2 a2;
        b d2 = b4;
        ii_2 ii_22 = a2 = this;
        a2.i = Gta.o;
        a2.k = fqa.Da;
        ii_22.j = c2;
        ii_22.A = b5;
        if (d2 instanceof HH) {
            a2.M = ((HH)d2).I;
            return;
        }
        a2.M = ah.J();
    }

    @Override
    public float J() {
        ii_2 ii_22;
        ii_2 ii_23 = ii_22 = this;
        float a2 = ii_23.j.J();
        if (ii_23.i == Gta.o) {
            ii_22.i = a2;
            return ii_22.i;
        }
        if (ii_22.i != a2) {
            ii_2 ii_24 = ii_22;
            ii_24.I = ii_22.f();
            ii_22.i = a2;
            ii_24.k = OT.e;
            ii_22.J = ii_22.A.J();
        }
        return ii_22.f();
    }
}

