/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Jy
 *  Lz
 *  MQa
 *  MX
 *  Ypa
 *  hd
 *  kqa
 *  pqa
 *  pua
 *  qta
 *  vQa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MX_2
extends Ty {
    @Override
    public PX J() {
        MX_2 a2;
        return new xX((MX)a2);
    }

    @Override
    public float J(long l2, float f2) {
        float c2 = f2;
        MX_2 a2 = this;
        return MQa.L;
    }

    @Override
    public String J() {
        return kqa.g;
    }

    @Override
    public Lz J(float f2, float f3) {
        float c2 = f3;
        MX_2 a2 = this;
        return new Lz(Bua.Ia, Yua.t, Yua.t);
    }

    @Override
    public boolean f(int n2, int n3) {
        int c2 = n3;
        MX_2 a2 = this;
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public hd J() {
        MX_2 a2;
        MX_2 mX_2 = a2;
        return new sy(mX_2.E, mX_2.E.J().l(), a2.E.J());
    }

    @Override
    public String f() {
        return Vra.Ga;
    }

    @Override
    public void J() {
        MX_2 a2;
        MX_2 mX_2 = a2;
        MX_2 mX_22 = a2;
        mX_2.m = new Qy(Jy.B, JPa.N);
        mX_22.A = vRa.d;
        mX_2.J = vRa.d;
        mX_2.I = pua.o;
    }

    @Override
    public void f() {
        int a2;
        MX_2 mX_2 = this;
        float f2 = Nra.e;
        int n2 = a2 = uSa.E;
        while (n2 <= Ypa.A) {
            float f3 = pqa.r - (float)a2 / qta.D;
            mX_2.j[a2++] = (pqa.r - f3) / (f3 * vQa.q + pqa.r) * (pqa.r - f2) + f2;
            n2 = a2;
        }
    }

    @Override
    public boolean J(int n2, int n3) {
        int c2 = n3;
        MX_2 a2 = this;
        return vRa.d != 0;
    }

    public MX_2() {
        MX_2 a2;
    }

    @Override
    public boolean J() {
        return uSa.E != 0;
    }
}

