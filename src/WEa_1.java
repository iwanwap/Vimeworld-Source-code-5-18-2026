/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  JPa
 *  QSa
 *  UZ
 *  eAa
 *  gZ
 *  nEa
 *  vL
 *  vRa
 */
public final class WEa_1
extends nEa {
    public void J(RY rY2) {
        Object b2 = rY2;
        WEa_1 a2 = this;
        if (((RY)b2).J != null) {
            WEa_1 wEa_1 = a2;
            ((RY)b2).J.J(gZ.J((vL)wEa_1, (vL)wEa_1.J()), JPa.N);
        }
        if (!a2.j.e && a2.R.nextInt(Yqa.i) == 0) {
            int n2;
            int n3 = vRa.d;
            if (a2.R.nextInt(fPa.i) == 0) {
                n3 = AQa.P;
            }
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                b2 = new aEa(a2.j);
                WEa_1 wEa_1 = a2;
                b2.D(QSa.e);
                b2.f(wEa_1.la, a2.Z, a2.A, a2.X, JPa.N);
                wEa_1.j.f((vL)b2);
                n4 = ++n2;
            }
        }
        double d2 = tSa.K;
        int n5 = b2 = uSa.E;
        while (n5 < Yqa.i) {
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = eAa.J((eAa)Gea.C);
            a2.j.J(UZ.ITEM_CRACK, a2.la, a2.Z, a2.A, ((double)a2.R.nextFloat() - kTa.B) * tSa.K, ((double)a2.R.nextFloat() - kTa.B) * tSa.K, ((double)a2.R.nextFloat() - kTa.B) * tSa.K, nArray);
            n5 = ++b2;
        }
        if (!a2.j.e) {
            a2.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public WEa_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        WEa_1 e2 = gg2;
        WEa_1 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    public WEa_1(Gg gg2) {
        WEa_1 b2 = gg2;
        WEa_1 a2 = this;
        super((Gg)b2);
    }

    /*
     * WARNING - void declaration
     */
    public WEa_1(Gg gg2, Gl gl2) {
        void b2;
        WEa_1 c2 = gl2;
        WEa_1 a2 = this;
        super((Gg)b2, (Gl)c2);
    }
}

