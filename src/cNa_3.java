/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Gc
 *  Ic
 *  JPa
 *  Kd
 *  Kpa
 *  SOa
 *  ac
 *  if
 *  pqa
 *  vRa
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cNa_3
extends ac {
    private final float i;
    private final float M;
    private Ic k;
    public boolean j;
    private float J;
    private String A;
    private final Gc I;

    private String J() {
        cNa_3 a2;
        if (a2.k == null) {
            return oha.J(a2.A, new Object[uSa.E]) + Xpa.E + a2.f();
        }
        cNa_3 cNa_32 = a2;
        return cNa_32.k.J(cNa_32.C, oha.J(a2.A, new Object[uSa.E]), a2.f());
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, boolean bl2) {
        void b2;
        cNa_3 a2;
        boolean c2 = bl2;
        cNa_3 cNa_32 = a2 = this;
        cNa_3 cNa_33 = a2;
        cNa_3 cNa_34 = a2;
        cNa_32.J = (b2 - cNa_33.i) / (cNa_34.M - cNa_34.i);
        cNa_32.i = (float)cNa_33.J();
        if (c2) {
            cNa_3 cNa_35 = a2;
            cNa_35.I.J(cNa_35.C, a2.f());
        }
    }

    public void f(Kpa kpa2, int n2, int n3) {
        int d2 = n2;
        cNa_3 b2 = this;
        if (b2.k != false) {
            if (b2.j) {
                cNa_3 cNa_32 = b2;
                cNa_32.J = (float)(d2 - (cNa_32.m + yRa.d)) / (float)(b2.j - kTa.j);
                if (cNa_32.J < JPa.N) {
                    b2.J = JPa.N;
                }
                if (b2.J > pqa.r) {
                    b2.J = pqa.r;
                }
                cNa_3 cNa_33 = b2;
                cNa_33.i = (float)cNa_33.J();
                cNa_33.I.J(b2.C, b2.f());
            }
            cNa_3 cNa_34 = b2;
            if.J((double)(b2.m + yRa.d + (int)(cNa_34.J * (float)(cNa_34.j - kTa.j))), (double)((double)(b2.I + AQa.P)), (double)SOa.w, (double)SOa.w, (Color)Bc.Ja, (Color)Bc.Ga, (Kd)Kd.XXS);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void a2;
        void c2;
        cNa_3 b2 = this;
        int d2 = n2;
        if (super.J((Kpa)c2, d2, (int)a2)) {
            cNa_3 cNa_32 = b2;
            cNa_32.J = (float)(d2 - (cNa_32.m + AQa.P)) / (float)(b2.j - Yqa.i);
            if (cNa_32.J < JPa.N) {
                b2.J = JPa.N;
            }
            if (b2.J > pqa.r) {
                b2.J = pqa.r;
            }
            cNa_3 cNa_33 = b2;
            cNa_33.i = (float)cNa_33.J();
            cNa_33.I.J(b2.C, b2.f());
            cNa_33.j = vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(float f2) {
        cNa_3 a2;
        float b2 = f2;
        cNa_3 cNa_32 = a2 = this;
        cNa_32.J = b2;
        cNa_32.i = (float)cNa_32.J();
        cNa_32.I.J(a2.C, a2.f());
    }

    /*
     * WARNING - void declaration
     */
    public cNa_3(Gc gc2, int n2, int n3, int n4, String string, float f2, float f3, float f4, Ic ic2) {
        void i2;
        void a2;
        void b2;
        void c2;
        void j2;
        void e2;
        void f5;
        void g2;
        void h2;
        cNa_3 d2;
        float f6 = f2;
        cNa_3 cNa_32 = d2 = this;
        cNa_3 cNa_33 = d2;
        cNa_3 cNa_34 = d2;
        super((int)h2, (int)g2, (int)f5, Jpa.Ha, kTa.j, Mqa.y);
        d2.J = pqa.r;
        cNa_34.A = e2;
        cNa_34.i = j2;
        cNa_33.M = c2;
        cNa_33.J = (b2 - j2) / (c2 - j2);
        d2.k = a2;
        cNa_32.I = i2;
        cNa_32.i = (float)d2.J();
    }

    public float f() {
        cNa_3 a2;
        cNa_3 cNa_32 = a2;
        return cNa_32.i + (cNa_32.M - a2.i) * a2.J;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        cNa_3 a2 = this;
        a2.j = uSa.E;
    }

    public int J(boolean bl2) {
        boolean b2 = bl2;
        cNa_3 a2 = this;
        return uSa.E;
    }

    public float J() {
        cNa_3 a2;
        return a2.J;
    }
}

