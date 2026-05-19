/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GZ
 *  JPa
 *  Jy
 *  Lz
 *  MQa
 *  NQa
 *  Oz
 *  Qsa
 *  hd
 *  kta
 *  pqa
 *  pua
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hz_2
extends Ty {
    @Override
    public Lz J(float f2, float f3) {
        float b2;
        float c322 = f3;
        hz_2 a2 = this;
        int c322 = wta.Z;
        b2 = Oz.C((float)(b2 * pua.j * kta.v)) * kta.v + MQa.L;
        b2 = Oz.J((float)b2, (float)JPa.N, (float)pqa.r);
        float f4 = (float)(c322 >> ERa.C & osa.Ja) / NQa.Y;
        float f5 = (float)(c322 >> Yqa.i & osa.Ja) / NQa.Y;
        float c322 = (float)(c322 & osa.Ja) / NQa.Y;
        return new Lz((double)(f4 *= b2 * JPa.N + VPa.i), (double)(f5 *= b2 * JPa.N + VPa.i), (double)(c322 *= b2 * JPa.N + VPa.i));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(int n2, int n3) {
        void b2;
        int c2 = n3;
        hz_2 a2 = this;
        return a2.E.J(new XF((int)b2, uSa.E, c2)).J().f();
    }

    @Override
    public boolean J(int n2, int n3) {
        int c2 = n3;
        hz_2 a2 = this;
        return vRa.d != 0;
    }

    @Override
    public int f() {
        return vpa.o;
    }

    @Override
    public boolean d() {
        return uSa.E != 0;
    }

    @Override
    public boolean J() {
        return uSa.E != 0;
    }

    @Override
    public XF J() {
        return new XF(ySa.T, vpa.o, uSa.E);
    }

    public hz_2() {
        hz_2 a2;
    }

    @Override
    public String J() {
        return Ira.F;
    }

    @Override
    public float[] J(float f2, float f3) {
        float c2 = f3;
        hz_2 a2 = this;
        return null;
    }

    @Override
    public void J() {
        hz_2 a2;
        hz_2 hz_22 = a2;
        hz_2 hz_23 = a2;
        hz_22.m = new Qy(Jy.ia, JPa.N);
        hz_23.I = vRa.d;
        hz_22.J = vRa.d;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public float J(long l2, float f2) {
        float c2 = f2;
        hz_2 a2 = this;
        return JPa.N;
    }

    @Override
    public float J() {
        return Qsa.k;
    }

    @Override
    public hd J() {
        hz_2 a2;
        hz_2 hz_22 = a2;
        return new GZ(hz_22.E, hz_22.E.J());
    }

    @Override
    public String f() {
        return rta.z;
    }
}

