/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  Mda
 *  Oz
 *  PIa
 *  QSa
 *  UZ
 *  Waa
 *  aSa
 *  bua
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  wEa
 *  wra
 */
public abstract class wEa_2
extends bga {
    public int E;
    public int m;
    private float C;
    public int k;
    private float A;

    public void f(Waa waa2) {
        wEa_2 b2 = waa2;
        wEa_2 a2 = this;
        wEa_2 wEa_22 = b2;
        super.f((Waa)wEa_22);
        wEa_22.J(pqa.L, a2.I());
        wEa_22.J(bua.x, a2.E);
    }

    public void N() {
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        void a2;
        wEa_2 wEa_22 = this;
        Mda mda2 = a2.K.f();
        if (mda2 != null && mda2.J() == Gea.SB) {
            Object b2;
            if (!wEa_22.j.e && (b2 = PIa.J((int)mda2.J())) != null && ((Object)((Object)wEa_22)).getClass() == b2) {
                wEa_2 wEa_23 = wEa_22;
                b2 = wEa_23.J((wEa)wEa_23);
                if (b2 != null) {
                    wEa_2 wEa_24 = wEa_22;
                    ((wEa_2)((Object)b2)).D(QSa.e);
                    b2.f(wEa_24.la, wEa_22.Z, (double)wEa_22.A, JPa.N, JPa.N);
                    wEa_24.j.f((vL)b2);
                    if (mda2.l()) {
                        b2.J(mda2.J());
                    }
                    if (!a2.h.f()) {
                        Mda mda3 = mda2;
                        mda3.E -= vRa.d;
                        if (mda3.E <= 0) {
                            void v3 = a2;
                            v3.K.J(v3.K.J, (Mda)null);
                        }
                    }
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public final void l(float f2, float f3) {
        void a2;
        void b2;
        wEa_2 wEa_22 = this;
        int c2 = wEa_22.A > JPa.N ? vRa.d : uSa.E;
        wEa_2 wEa_23 = wEa_22;
        wEa_23.A = b2;
        wEa_23.C = a2;
        if (c2 == 0) {
            wEa_22.G(pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, boolean bl2) {
        void a2;
        int b2;
        int c2;
        wEa_2 wEa_22 = this;
        int n3 = c2 = wEa_22.I();
        if ((c2 += b2 * kTa.j) > 0) {
            c2 = uSa.E;
            if (n3 < 0) {
                wEa_22.N();
            }
        }
        b2 = c2 - n3;
        wEa_22.D(c2);
        if (a2 != false) {
            wEa_2 wEa_23 = wEa_22;
            wEa_23.E += b2;
            if (wEa_23.k == 0) {
                wEa_22.k = wra.P;
            }
        }
        if (wEa_22.I() == 0) {
            wEa_2 wEa_24 = wEa_22;
            wEa_24.D(wEa_24.E);
        }
    }

    public void G(int n2) {
        int b2 = n2;
        wEa_2 a2 = this;
        a2.f(b2, uSa.E != 0);
    }

    public int I() {
        wEa_2 a2;
        if (a2.j.e) {
            return a2.aa.J(lqa.s);
        }
        return a2.m;
    }

    public abstract wEa J(wEa var1);

    public boolean Y() {
        wEa_2 a2;
        if (a2.I() < 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void k(boolean bl2) {
        boolean b2 = bl2;
        wEa_2 a2 = this;
        a2.G(b2 ? MQa.L : pqa.r);
    }

    public void D(int n2) {
        wEa_2 a2;
        int b2 = n2;
        wEa_2 wEa_22 = a2 = this;
        wEa_22.aa.J(lqa.s, Byte.valueOf((byte)Oz.f((int)b2, (int)pua.o, (int)vRa.d)));
        a2.m = b2;
        a2.k(wEa_22.Y());
    }

    public void J() {
        wEa_2 a2;
        wEa_2 wEa_22 = a2;
        super.J();
        wEa_22.aa.f(lqa.s, (byte)uSa.E);
    }

    public final void G(float f2) {
        wEa_2 a2;
        float b2 = f2;
        wEa_2 wEa_22 = a2 = this;
        super.l(a2.A * b2, wEa_22.C * b2);
    }

    public void J(Waa waa2) {
        wEa_2 b2 = waa2;
        wEa_2 a2 = this;
        wEa_2 wEa_22 = b2;
        super.J((Waa)wEa_22);
        a2.D(wEa_22.J(pqa.L));
        a2.E = b2.J(bua.x);
    }

    public wEa_2(Gg gg2) {
        wEa_2 b2 = gg2;
        wEa_2 a2 = this;
        super((Gg)b2);
        a2.A = vqa.T;
    }

    public void y() {
        wEa_2 wEa_22;
        wEa_2 wEa_23 = wEa_22 = this;
        super.y();
        if (wEa_23.j.e) {
            if (wEa_22.k > 0) {
                if (wEa_22.k % AQa.P == 0) {
                    wEa_22.j.J(UZ.VILLAGER_HAPPY, wEa_22.la + (double)(wEa_22.R.nextFloat() * wEa_22.F * kta.v) - (double)wEa_22.F, wEa_22.Z + kTa.B + (double)(wEa_22.R.nextFloat() * wEa_22.u), (double)(wEa_22.A + (double)(wEa_22.R.nextFloat() * wEa_22.F * kta.v) - (double)wEa_22.F), aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                }
                wEa_22.k -= vRa.d;
            }
            wEa_2 wEa_24 = wEa_22;
            wEa_24.k(wEa_24.Y());
            return;
        }
        int a2 = wEa_22.I();
        if (a2 < 0) {
            int n2 = ++a2;
            wEa_22.D(n2);
            if (n2 == 0) {
                wEa_22.N();
                return;
            }
        } else if (a2 > 0) {
            wEa_22.D(--a2);
        }
    }
}

