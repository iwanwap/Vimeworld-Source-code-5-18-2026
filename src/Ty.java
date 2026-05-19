/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Dz
 *  ERa
 *  Gg
 *  JPa
 *  Jy
 *  Lz
 *  MQa
 *  MX
 *  Oz
 *  QFa
 *  Rz
 *  SX
 *  XTa
 *  Ypa
 *  Ysa
 *  bpa
 *  hd
 *  hz
 *  kta
 *  pqa
 *  psa
 *  pua
 *  qta
 *  uV
 *  vQa
 *  vRa
 *  wOa
 *  wz
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ty {
    public Gg E;
    public Ay m;
    public static final float[] C;
    private String i;
    private final float[] M;
    private Fy k;
    public final float[] j = new float[ERa.C];
    public boolean J;
    public boolean A;
    public int I;

    public boolean d() {
        return vRa.d != 0;
    }

    public boolean C() {
        Ty a2;
        return a2.A;
    }

    public PX J() {
        return new PX();
    }

    public abstract String f();

    public boolean l() {
        return vRa.d != 0;
    }

    public void f() {
        int a2;
        Ty ty2 = this;
        float f2 = JPa.N;
        int n2 = a2 = uSa.E;
        while (n2 <= Ypa.A) {
            float f3 = pqa.r - (float)a2 / qta.D;
            ty2.j[a2++] = (pqa.r - f3) / (f3 * vQa.q + pqa.r) * (pqa.r - f2) + f2;
            n2 = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, int n3) {
        void b2;
        int c2 = n3;
        Ty a2 = this;
        if (a2.E.J(new XF((int)b2, uSa.E, c2)) == QFa.lf) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J(long a2) {
        return (int)(a2 / dua.Aa % Jra.V + Jra.V) % Yqa.i;
    }

    public static Ty J(int a2) {
        if (a2 == pua.o) {
            return new MX();
        }
        if (a2 == 0) {
            return new SX();
        }
        if (a2 == vRa.d) {
            return new hz();
        }
        return null;
    }

    public final void J(Gg gg2) {
        Ty b2 = gg2;
        Ty a2 = this;
        a2.E = b2;
        a2.k = a2.E.J().J();
        a2.i = b2.J().J();
        a2.J();
        a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public float J(long l2, float f2) {
        float f3;
        void b2;
        float c2 = f2;
        Ty a2 = this;
        c2 = ((float)((int)(b2 % dua.Aa)) + c2) / QTa.X - rta.o;
        if (f3 < JPa.N) {
            c2 += pqa.r;
        }
        if (c2 > pqa.r) {
            c2 -= pqa.r;
        }
        c2 = pqa.r - (float)((Math.cos((double)c2 * lQa.f) + oua.i) / KPa.y);
        c2 += (c2 - c2) / vQa.q;
        return c2;
    }

    public abstract String J();

    public Ay J() {
        Ty a2;
        return a2.m;
    }

    public double J() {
        Ty a2;
        if (a2.k == Fy.k) {
            return oua.i;
        }
        return vQa.e;
    }

    public float[] J(float f2, float f3) {
        float f4;
        float c2 = f2;
        Ty b2 = this;
        float a2 = Xpa.R;
        if ((c2 = Oz.C((float)(c2 * pua.j * kta.v)) - JPa.N) >= (f4 = QTa.ga) - a2 && c2 <= f4 + a2) {
            c2 = (c2 - f4) / a2 * MQa.L + MQa.L;
            a2 = pqa.r - (pqa.r - Oz.d((float)(c2 * pua.j))) * KPa.w;
            a2 *= a2;
            Ty ty2 = b2;
            ty2.M[uSa.E] = c2 * bpa.K + ZSa.q;
            float f5 = c2;
            ty2.M[vRa.d] = f5 * f5 * ZSa.q + psa.N;
            float f6 = c2;
            ty2.M[uqa.g] = f6 * f6 * JPa.N + psa.N;
            ty2.M[yRa.d] = a2;
            return ty2.M;
        }
        return null;
    }

    public int f() {
        Ty a2;
        if (a2.k == Fy.k) {
            return AQa.P;
        }
        return a2.E.M() + vRa.d;
    }

    public int J() {
        Ty a2;
        return a2.I;
    }

    static {
        float[] fArray = new float[Yqa.i];
        fArray[uSa.E] = pqa.r;
        fArray[vRa.d] = wOa.w;
        fArray[uqa.g] = MQa.L;
        fArray[yRa.d] = rta.o;
        fArray[AQa.P] = JPa.N;
        fArray[tTa.h] = rta.o;
        fArray[uua.p] = MQa.L;
        fArray[XTa.W] = wOa.w;
        C = fArray;
    }

    public boolean f() {
        Ty a2;
        return a2.J;
    }

    public Lz J(float f2, float f3) {
        float c2 = f2;
        Ty b2 = this;
        c2 = Oz.C((float)(c2 * pua.j * kta.v)) * kta.v + MQa.L;
        c2 = Oz.J((float)c2, (float)JPa.N, (float)pqa.r);
        float a2 = Ysa.Ha;
        float f4 = vua.Ja;
        float f5 = pqa.r;
        return new Lz((double)(a2 *= c2 * Asa.h + iSa.fa), (double)(f4 *= c2 * Asa.h + iSa.fa), (double)(f5 *= c2 * XOa.v + dqa.B));
    }

    public Ty() {
        Ty a2;
        a2.M = new float[AQa.P];
    }

    public void J() {
        Ty ty2 = this;
        Fy fy2 = ty2.E.J().J();
        if (fy2 == Fy.k) {
            Ty a2 = uV.J((String)ty2.E.J().J());
            Ty ty3 = ty2;
            ty3.m = new Qy(Jy.J((int)a2.J(), (Jy)Jy.f), MQa.L);
            return;
        }
        if (fy2 == Fy.A) {
            ty2.m = new Qy(Jy.Z, JPa.N);
            return;
        }
        ty2.m = new Ay(ty2.E);
    }

    public float J() {
        return PRa.E;
    }

    public hd J() {
        Ty a2;
        if (a2.k == Fy.k) {
            Ty ty2 = a2;
            return new Dz(ty2.E, ty2.E.J(), a2.E.J().l(), a2.i);
        }
        if (a2.k == Fy.A) {
            return new Rz(a2.E);
        }
        if (a2.k == Fy.m) {
            Ty ty3 = a2;
            return new wz(ty3.E, ty3.E.J(), a2.E.J().l(), a2.i);
        }
        Ty ty4 = a2;
        return new wz(ty4.E, ty4.E.J(), a2.E.J().l(), a2.i);
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public float[] J() {
        Ty a2;
        return a2.j;
    }

    public XF J() {
        return null;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        Ty a2 = this;
        return uSa.E != 0;
    }
}

