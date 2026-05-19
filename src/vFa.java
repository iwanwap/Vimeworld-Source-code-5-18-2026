/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  JPa
 *  MQa
 *  Tpa
 *  UZ
 *  Waa
 *  YSa
 *  Yra
 *  aSa
 *  dpa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vFa
extends vL {
    private Gl J;
    public int A;

    public boolean E() {
        vFa a2;
        if (a2.J == false) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public vFa(Gg gg2) {
        vFa a2;
        vFa b2 = gg2;
        vFa vFa2 = a2 = this;
        super((Gg)b2);
        vFa2.h = vRa.d;
        vFa2.l(MQa.d, MQa.d);
    }

    public float l() {
        return JPa.N;
    }

    public Gl J() {
        vFa a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public vFa(Gg gg2, double d2, double d3, double d4, Gl gl2) {
        void a2;
        void b2;
        void c2;
        void d5;
        vFa e2;
        vFa f22 = gg2;
        vFa vFa2 = e2 = this;
        vFa vFa3 = e2;
        vFa vFa4 = e2;
        vFa4((Gg)f22);
        vFa4.l((double)d5, (double)c2, (double)b2);
        float f22 = (float)(Math.random() * lQa.f * KPa.y);
        vFa3.f(-((float)Math.sin(f22)) * WRa.e);
        vFa3.J(Bua.Ia);
        vFa3.l(-((float)Math.cos(f22)) * WRa.e);
        vFa3.A = Fua.J;
        vFa3.c = d5;
        vFa2.ba = c2;
        vFa2.r = b2;
        vFa2.J = a2;
    }

    public void J(Waa waa2) {
        vFa b2 = waa2;
        vFa a2 = this;
        a2.A = b2.J(lQa.la);
    }

    private void f() {
        vFa vFa2 = this;
        float a2 = YSa.G;
        vFa vFa3 = vFa2;
        vFa vFa4 = vFa2;
        vFa3.j.J((vL)vFa4, vFa3.la, vFa4.Z + (double)(vFa2.u / Yra.i), (double)vFa2.A, a2, vRa.d != 0);
    }

    public void d() {
        vFa a2;
        vFa vFa2 = a2;
        vFa2.c = vFa2.la;
        vFa2.ba = vFa2.Z;
        vFa2.r = vFa2.A;
        vFa2.J(vFa2.Ea - Tpa.fa);
        vFa2.J(vFa2.i, a2.Ea, a2.f);
        vFa2.f(vFa2.i * uua.G);
        vFa2.J(vFa2.Ea * uua.G);
        vFa2.l(vFa2.f * uua.G);
        if (vFa2.ha) {
            vFa vFa3 = a2;
            vFa3.f(vFa3.i * dpa.X);
            vFa3.l(vFa3.f * dpa.X);
            vFa3.J(vFa3.Ea * KPa.I);
        }
        int n2 = a2.A;
        a2.A = n2 - vRa.d;
        if (n2 <= 0) {
            vFa vFa4 = a2;
            vFa4.k();
            if (!vFa4.j.e) {
                a2.f();
                return;
            }
        } else {
            a2.d();
            a2.j.J(UZ.SMOKE_NORMAL, a2.la, a2.Z + kTa.B, (double)a2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    public void f(Waa waa2) {
        vFa b2 = waa2;
        vFa a2 = this;
        b2.J(lQa.la, (byte)a2.A);
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void J() {
    }
}

