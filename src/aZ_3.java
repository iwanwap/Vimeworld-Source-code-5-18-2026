/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Ega
 *  GEa
 *  JPa
 *  MQa
 *  Oz
 *  Tpa
 *  Waa
 *  Ypa
 *  cRa
 *  kea
 *  ld
 *  pqa
 *  psa
 *  pua
 *  rd
 *  uRa
 *  uY
 *  vRa
 *  wra
 *  xA
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aZ_3
extends uY
implements rd,
xA {
    public int g;
    public float L;
    private static Random E = new Random();
    public float m;
    public float C;
    public float i;
    public float M;
    public float k;
    private String j;
    public float J;
    public float A;
    public float I;

    public boolean J() {
        aZ_3 a2;
        if (a2.j != null && a2.j.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public aZ_3() {
        aZ_3 a2;
    }

    public void J(String string) {
        Object b2 = string;
        aZ_3 a2 = this;
        a2.j = b2;
    }

    public void J() {
        float f2;
        aZ_3 aZ_32;
        aZ_3 aZ_33 = aZ_32 = this;
        aZ_33.A = aZ_33.C;
        aZ_33.k = aZ_33.J;
        Object a22 = aZ_33.worldObj.J((double)((float)aZ_32.pos.getX() + MQa.L), (double)((float)aZ_32.pos.getY() + MQa.L), (double)((float)aZ_32.pos.getZ() + MQa.L), uRa.I);
        if (a22 != null) {
            Object object = a22;
            double d2 = ((Sx)((Object)object)).la - (double)((float)aZ_32.pos.getX() + MQa.L);
            aZ_3 aZ_34 = aZ_32;
            float f3 = ((Sx)((Object)object)).A - (double)((float)aZ_34.pos.getZ() + MQa.L);
            aZ_32.L = (float)Oz.f((double)f3, (double)d2);
            aZ_32.C += Nra.e;
            if (aZ_34.C < MQa.L || E.nextInt(wra.P) == 0) {
                float a22 = aZ_32.i;
                do {
                    aZ_32.i += (float)(E.nextInt(AQa.P) - E.nextInt(AQa.P));
                } while (a22 == aZ_32.i);
            }
        } else {
            aZ_3 aZ_35 = aZ_32;
            aZ_35.L += WRa.e;
            aZ_35.C -= Nra.e;
        }
        aZ_3 aZ_36 = aZ_32;
        while (aZ_36.J >= pua.j) {
            aZ_3 aZ_37 = aZ_32;
            aZ_36 = aZ_37;
            aZ_37.J -= Ypa.Ha;
        }
        aZ_3 aZ_38 = aZ_32;
        while (aZ_38.J < gQa.X) {
            aZ_3 aZ_39 = aZ_32;
            aZ_38 = aZ_39;
            aZ_39.J += Ypa.Ha;
        }
        aZ_3 aZ_310 = aZ_32;
        while (aZ_310.L >= pua.j) {
            aZ_3 aZ_311 = aZ_32;
            aZ_310 = aZ_311;
            aZ_311.L -= Ypa.Ha;
        }
        aZ_3 aZ_312 = aZ_32;
        while (aZ_312.L < gQa.X) {
            aZ_3 aZ_313 = aZ_32;
            aZ_312 = aZ_313;
            aZ_313.L += Ypa.Ha;
        }
        aZ_3 aZ_314 = aZ_32;
        float f4 = f2 = aZ_314.L - aZ_314.J;
        while (f4 >= pua.j) {
            f4 = f2 - Ypa.Ha;
        }
        float f5 = f2;
        while (f5 < gQa.X) {
            f5 = f2 + Ypa.Ha;
        }
        aZ_3 aZ_315 = aZ_32;
        aZ_315.J += f2 * Xpa.R;
        aZ_315.C = Oz.J((float)aZ_315.C, (float)JPa.N, (float)pqa.r);
        aZ_315.g += vRa.d;
        aZ_315.I = aZ_315.m;
        float f6 = (aZ_315.i - aZ_32.m) * Xpa.R;
        float f7 = psa.N;
        f6 = Oz.J((float)f6, (float)(-f7), (float)f7);
        aZ_315.M += (f6 - aZ_32.M) * ATa.r;
        aZ_315.m += aZ_32.M;
    }

    public void f(Waa waa2) {
        aZ_3 b2 = waa2;
        aZ_3 a2 = this;
        aZ_3 aZ_32 = b2;
        super.f((Waa)aZ_32);
        if (aZ_32.J(cRa.k, Yqa.i)) {
            a2.j = b2.J(cRa.k);
        }
    }

    public Ega J(kea kea2, Sx sx2) {
        aZ_3 b2;
        aZ_3 c2 = kea2;
        aZ_3 aZ_32 = b2 = this;
        return new GEa((kea)c2, aZ_32.worldObj, aZ_32.pos);
    }

    public String J() {
        aZ_3 a2;
        if (a2.J()) {
            return a2.j;
        }
        return xra.r;
    }

    public String f() {
        return Tpa.H;
    }

    public ld J() {
        aZ_3 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public void J(Waa waa2) {
        aZ_3 a2;
        aZ_3 b2 = waa2;
        aZ_3 aZ_32 = a2 = this;
        super.J((Waa)b2);
        if (aZ_32.J()) {
            b2.J(cRa.k, a2.j);
        }
    }
}

