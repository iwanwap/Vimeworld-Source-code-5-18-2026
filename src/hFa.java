/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  LGa
 *  MQa
 *  Mda
 *  Mz
 *  NTa
 *  Oz
 *  Tpa
 *  gZ
 *  kGa
 *  lPa
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hFa
extends bga
implements WC {
    public boolean O() {
        hFa hFa2 = this;
        Object a2 = new XF(hFa2.la, hFa2.J().j, hFa2.A);
        if (hFa2.j.J(Mz.SKY, (XF)((Object)a2)) > hFa2.R.nextInt(fPa.i)) {
            return uSa.E != 0;
        }
        hFa hFa3 = hFa2;
        int n2 = hFa3.j.C((XF)((Object)a2));
        if (hFa3.j.d()) {
            hFa hFa4 = hFa2;
            int n3 = hFa4.j.J();
            hFa4.j.f(NTa.C);
            n2 = hFa4.j.C((XF)((Object)a2));
            hFa4.j.f(n3);
        }
        if (n2 <= hFa2.R.nextInt(Yqa.i)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public float J(XF xF2) {
        Object b2 = xF2;
        hFa a2 = this;
        return MQa.L - a2.j.J((XF)((Object)b2));
    }

    public void y() {
        hFa a2;
        hFa hFa2 = a2;
        hFa2.z();
        if (hFa2.J(pqa.r) > MQa.L) {
            a2.s += uqa.g;
        }
        super.y();
    }

    public String i() {
        return tpa.T;
    }

    /*
     * WARNING - void declaration
     */
    public boolean C(vL vL2) {
        boolean bl;
        void a2;
        hFa hFa2 = this;
        float f2 = (float)hFa2.J(Kha.A).f();
        int b2 = uSa.E;
        if (a2 instanceof Gl) {
            f2 += kGa.J((Mda)hFa2.J(), (LGa)((Gl)a2).J());
            b2 += kGa.l((Gl)hFa2);
        }
        if (bl = a2.J(gZ.J((Gl)hFa2), f2)) {
            if (b2 > 0) {
                hFa hFa3 = hFa2;
                a2.f((double)(-Oz.d((float)(hFa3.X * pua.j / Hra.Ga)) * (float)b2 * MQa.L), tpa.k, (double)(Oz.C((float)(hFa2.X * pua.j / Hra.Ga)) * (float)b2 * MQa.L));
                hFa hFa4 = hFa2;
                hFa4.f(hFa4.i * oQa.fa);
                hFa3.l(hFa3.f * oQa.fa);
            }
            if ((b2 = kGa.f((Gl)hFa2)) > 0) {
                a2.J(b2 * AQa.P);
            }
            hFa hFa5 = hFa2;
            hFa5.J((Gl)hFa5, (vL)a2);
        }
        return bl;
    }

    public String M() {
        return vpa.Y;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        hFa b2 = this;
        hFa c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (super.J((gZ)c2, (float)a2)) {
            if (b2.Aa != (c2 = c2.f()) && b2.ja != c2) {
                return vRa.d != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public hFa(Gg gg2) {
        hFa b2 = gg2;
        hFa a2 = this;
        super((Gg)b2);
        a2.A = tTa.h;
    }

    public void s() {
        hFa a2;
        hFa hFa2 = a2;
        super.s();
        hFa2.J().J(Kha.A);
    }

    public String d() {
        return Tpa.K;
    }

    public String J(int n2) {
        int b2 = n2;
        hFa a2 = this;
        if (b2 > AQa.P) {
            return gua.A;
        }
        return lPa.A;
    }

    @Override
    public boolean w() {
        hFa a2;
        if (a2.j.J() != sZ.PEACEFUL && a2.O() && super.w()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void d() {
        hFa a2;
        hFa hFa2 = a2;
        super.d();
        if (!hFa2.j.e && a2.j.J() == sZ.PEACEFUL) {
            a2.k();
        }
    }

    public boolean s() {
        return vRa.d != 0;
    }

    public String f() {
        return vua.Ga;
    }
}

