/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Waa
 *  Zb
 *  gZ
 *  qEa
 *  vL
 *  vRa
 */
public final class qEa_1
extends vL {
    public final String A;
    public final Zb I;

    public boolean J(vL vL2) {
        qEa_1 a2 = this;
        qEa_1 b2 = vL2;
        if (a2 == b2 || a2.I == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public qEa_1(Zb zb2, String string, float f2, float f3) {
        void c2;
        void a2;
        void b2;
        qEa_1 d2;
        qEa_1 e2 = zb2;
        qEa_1 qEa_12 = d2 = this;
        qEa_1 qEa_13 = d2;
        super(e2.l());
        qEa_13.l((float)b2, (float)a2);
        qEa_12.I = e2;
        qEa_12.A = c2;
    }

    public void J(Waa object) {
        qEa_1 b2 = object;
        object = this;
    }

    public void J() {
    }

    public boolean E() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        qEa_1 b2 = this;
        qEa_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        return b2.I.J((qEa)b2, (gZ)c2, (float)a2);
    }

    public void f(Waa object) {
        qEa_1 b2 = object;
        object = this;
    }
}

