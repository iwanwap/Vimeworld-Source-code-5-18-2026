/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NCa
 *  rAa
 *  vRa
 *  waa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tX_3 {
    public final float J;
    public final float A;
    public final float I;

    public float l() {
        tX_3 a2;
        return a2.A;
    }

    public float f() {
        tX_3 a2;
        return a2.J;
    }

    public tX_3(waa waa2) {
        tX_3 a2;
        tX_3 b2 = waa2;
        tX_3 tX_32 = a2 = this;
        tX_3 tX_33 = b2;
        a2.A = tX_33.J(uSa.E);
        tX_32.I = tX_33.J(vRa.d);
        tX_32.J = b2.J(uqa.g);
    }

    public float J() {
        tX_3 a2;
        return a2.I;
    }

    public waa J() {
        tX_3 a2;
        tX_3 tX_32 = this;
        tX_3 tX_33 = a2 = new waa();
        a2.J((NCa)new rAa(tX_32.A));
        tX_33.J((NCa)new rAa(tX_32.I));
        a2.J((NCa)new rAa(tX_32.J));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tX_3(float f2, float f3, float f4) {
        void b2;
        void c2;
        tX_3 a2;
        float d2 = f4;
        tX_3 tX_32 = a2 = this;
        a2.A = c2;
        tX_32.I = b2;
        tX_32.J = d2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        tX_3 a2 = this;
        if (!(b2 instanceof tX_3)) {
            return uSa.E != 0;
        }
        b2 = (tX_3)b2;
        if (a2.A == ((tX_3)b2).A && a2.I == ((tX_3)b2).I && a2.J == ((tX_3)b2).J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

