/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  UZ
 *  Uqa
 *  YSa
 *  Zua
 *  cga
 *  eAa
 *  pqa
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ega_3
extends cga {
    public cga J() {
        ega_3 a2;
        return new ega_3(a2.j);
    }

    public boolean N() {
        ega_3 a2;
        if (a2.j.J(a2.J(), (vL)a2)) {
            ega_3 ega_32 = a2;
            if (a2.j.J((vL)ega_32, ega_32.J()).isEmpty() && !a2.j.C(a2.J())) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public UZ J() {
        return UZ.FLAME;
    }

    public void s() {
        ega_3 a2;
        ega_3 ega_32 = a2;
        super.s();
        ega_32.J(Kha.j).J(Bua.Ia);
    }

    public ega_3(Gg gg2) {
        ega_3 b2 = gg2;
        ega_3 a2 = this;
        super((Gg)b2);
        a2.z = vRa.d;
    }

    public int g() {
        ega_3 a2;
        return super.g() * AQa.P;
    }

    public void P() {
        ega_3 a2;
        ega_3 ega_32 = a2;
        ega_32.J(Zua.c + (float)ega_32.H() * Yqa.C);
        ega_32.t = vRa.d;
    }

    public boolean w() {
        ega_3 a2;
        if (a2.j.J() != sZ.PEACEFUL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eAa J() {
        return Gea.Xa;
    }

    public boolean T() {
        return vRa.d != 0;
    }

    public int J(float f2) {
        float b2 = f2;
        ega_3 a2 = this;
        return YSa.L;
    }

    public boolean o() {
        return uSa.E != 0;
    }

    public void q() {
        ega_3 a2;
        ega_3 ega_32 = a2;
        ega_32.J(LPa.S + (float)ega_32.H() * Nra.e);
        ega_32.t = vRa.d;
    }

    public int f() {
        ega_3 a2;
        return a2.H() * yRa.d;
    }

    public boolean X() {
        return vRa.d != 0;
    }

    public int I() {
        ega_3 a2;
        return super.I() + uqa.g;
    }

    public void J(boolean bl2, int n2) {
        ega_3 ega_32 = this;
        eAa b2 = ega_32.J();
        if (b2 != null && ega_32.H() > vRa.d) {
            int a2;
            int c2 = ega_32.R.nextInt(AQa.P) - uqa.g;
            if (a2 > 0) {
                c2 += ega_32.R.nextInt(a2 + vRa.d);
            }
            int n3 = a2 = uSa.E;
            while (n3 < c2) {
                ega_32.J(b2, vRa.d);
                n3 = ++a2;
            }
        }
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        ega_3 ega_32 = this;
    }

    public void W() {
        a.A *= ATa.r;
    }

    public float J(float f2) {
        float b2 = f2;
        ega_3 a2 = this;
        return pqa.r;
    }

    public String l() {
        ega_3 a2;
        if (a2.H() > vRa.d) {
            return Uqa.d;
        }
        return Qpa.W;
    }
}

