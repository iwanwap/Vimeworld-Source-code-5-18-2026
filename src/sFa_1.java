/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  QFa
 *  Waa
 *  gZ
 *  hz
 *  kta
 *  lqa
 *  vL
 *  vRa
 */
public final class sFa_1
extends vL {
    public int J;
    public int A;

    /*
     * WARNING - void declaration
     */
    public sFa_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        sFa_1 d5;
        sFa_1 e2 = gg2;
        sFa_1 sFa_12 = d5 = this;
        sFa_12((Gg)e2);
        sFa_12.l((double)c2, (double)b2, (double)a2);
    }

    public void f(Waa object) {
        sFa_1 b2 = object;
        object = this;
    }

    public void J(Waa object) {
        sFa_1 b2 = object;
        object = this;
    }

    public void d() {
        sFa_1 sFa_12;
        sFa_1 sFa_13 = sFa_12 = this;
        sFa_13.c = sFa_13.la;
        sFa_13.ba = sFa_13.Z;
        sFa_13.r = sFa_13.A;
        sFa_13.J += vRa.d;
        sFa_13.aa.J(Yqa.i, Integer.valueOf(sFa_12.A));
        int n2 = Oz.f((double)sFa_13.la);
        int n3 = Oz.f((double)sFa_13.Z);
        int a2 = Oz.f((double)sFa_13.A);
        if (sFa_13.j.F instanceof hz && sFa_12.j.J(new XF(n2, n3, a2)).J() != QFa.ic) {
            sFa_12.j.J(new XF(n2, n3, a2), QFa.ic.J());
        }
    }

    public sFa_1(Gg gg2) {
        sFa_1 a2;
        sFa_1 b2 = gg2;
        sFa_1 sFa_12 = a2 = this;
        super((Gg)b2);
        sFa_12.h = vRa.d;
        sFa_12.l(kta.v, kta.v);
        sFa_12.A = tTa.h;
        sFa_12.J = sFa_12.R.nextInt(tua.P);
    }

    public boolean J(gZ gZ2, float f2) {
        sFa_1 b2 = this;
        sFa_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (b2.J == 0 && !b2.j.e) {
            b2.A = uSa.E;
            if (b2.A <= 0) {
                sFa_1 sFa_12 = b2;
                sFa_12.k();
                if (!sFa_12.j.e) {
                    b2.j.J((vL)null, b2.la, b2.Z, (double)b2.A, lqa.ga, vRa.d != 0);
                }
            }
        }
        return vRa.d != 0;
    }

    public void J() {
        sFa_1 a2;
        a2.aa.f(Yqa.i, a2.A);
    }

    public boolean E() {
        return vRa.d != 0;
    }

    public boolean u() {
        return uSa.E != 0;
    }
}

