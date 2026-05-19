/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Vfa
 *  Yfa
 *  cga
 *  pqa
 *  psa
 *  vRa
 */
public final class wea
extends Vfa {
    private float j;
    private boolean J;
    private cga A;
    private int I;

    public wea(cga cga2) {
        wea b2 = cga2;
        wea a2 = this;
        super((Yfa)b2);
        a2.A = b2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void J() {
        wea a2;
        a2.I.t = a2.I.X = a2.J(a2.I.X, a2.j, NSa.B);
        a2.I.ba = a2.I.X;
        if (!a2.M) {
            a2.I.M(JPa.N);
            return;
        }
        a2.M = uSa.E;
        if (a2.I.ha) {
            wea wea2 = a2;
            a2.I.C((float)(wea2.J * a2.I.J(Kha.j).f()));
            int n2 = wea2.I;
            wea2.I = n2 - vRa.d;
            if (n2 <= 0) {
                wea wea3 = a2;
                wea3.I = wea3.A.g();
                if (wea3.J) {
                    a2.I /= yRa.d;
                }
                wea wea4 = a2;
                wea4.A.J().J();
                if (!wea4.A.V()) return;
                wea wea5 = a2;
                wea5.A.J(wea5.A.l(), a2.A.G(), ((a2.A.J().nextFloat() - a2.A.J().nextFloat()) * psa.N + pqa.r) * xSa.la);
                return;
            }
            wea wea6 = a2;
            wea6.A.l(JPa.N);
            wea6.A.M(JPa.N);
            wea6.I.C(JPa.N);
            return;
        }
        wea wea7 = a2;
        wea7.I.C((float)(wea7.J * a2.I.J(Kha.j).f()));
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, boolean bl) {
        void b2;
        wea a2;
        boolean c2 = bl;
        wea wea2 = a2 = this;
        wea2.j = b2;
        wea2.J = c2;
    }

    public void J(double a2) {
        wea b2;
        wea wea2 = b2;
        wea2.J = a2;
        wea2.M = vRa.d;
    }
}

