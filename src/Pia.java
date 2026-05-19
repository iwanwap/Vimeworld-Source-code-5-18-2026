/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gua
 *  JPa
 *  QSa
 *  Qsa
 *  Tz
 *  UZ
 *  XTa
 *  aX
 *  fEa
 *  gFa
 *  vL
 *  vRa
 *  wEa
 *  zEa
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Pia
extends gFa {
    private fEa k;
    public double j;
    private fEa J;
    public int A;
    public Gg I;

    public boolean l() {
        Pia a2;
        if (a2.k.K() && a2.k.O() && a2.A < Psa.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Pia(fEa fEa2, double d2) {
        void a2;
        Pia c2 = fEa2;
        Pia b2 = this;
        b2.J = c2;
        b2.I = b2.J.j;
        b2.j = a2;
        b2.J(yRa.d);
    }

    public boolean f() {
        Pia a2;
        if (!a2.J.O()) {
            return uSa.E != 0;
        }
        Pia pia = a2;
        pia.k = pia.J();
        if (pia.k != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        Pia pia;
        Pia pia2 = pia = this;
        Object object = pia2.J.J((wEa)pia2.k);
        if (object != null) {
            Object a22 = pia.J.J();
            if (a22 == null && pia.k.J() != null) {
                a22 = pia.k.J();
            }
            if (a22 != null) {
                ((Sx)((Object)a22)).J(Tz.T);
                if (pia.J instanceof aDa) {
                    ((Sx)((Object)a22)).J((aX)mY.J);
                }
            }
            Pia pia3 = pia;
            pia3.J.D(MTa.g);
            pia3.k.D(MTa.g);
            pia3.J.V();
            pia3.k.V();
            wEa wEa2 = object;
            wEa2.D(QSa.e);
            wEa2.f(pia3.J.la, pia.J.Z, pia.J.A, JPa.N, JPa.N);
            pia3.I.f((vL)object);
            object = pia.J.J();
            int a22 = uSa.E;
            int n2 = a22;
            while (n2 < XTa.W) {
                Object object2 = object;
                double d2 = ((Random)object2).nextGaussian() * GPa.g;
                double d3 = ((Random)object2).nextGaussian() * GPa.g;
                double d4 = ((Random)object2).nextGaussian() * GPa.g;
                double d5 = ((Random)object2).nextDouble() * (double)pia.J.F * KPa.y - (double)pia.J.F;
                double d6 = kTa.B + ((Random)object).nextDouble() * (double)pia.J.u;
                Pia pia4 = pia;
                double d7 = ((Random)object2).nextDouble() * (double)pia4.J.F * KPa.y - (double)pia.J.F;
                int n3 = 4 ^ 5;
                pia4.I.J(UZ.HEART, pia.J.la + d5, pia.J.Z + d6, pia.J.A + d7, d2, d3, d4, new int[uSa.E]);
                n2 = ++a22;
            }
            if (pia.I.J().f(Gua.H)) {
                Pia pia5 = pia;
                pia.I.f((vL)new zEa(pia5.I, pia5.J.la, pia.J.Z, pia.J.A, ((Random)object).nextInt(XTa.W) + vRa.d));
            }
        }
    }

    public void J() {
        Pia a2;
        Pia pia = a2;
        pia.k = null;
        pia.A = uSa.E;
    }

    public void f() {
        Pia a2;
        Pia pia = a2;
        Pia pia2 = a2;
        pia.J.J().J((vL)pia2.k, FRa.Ga, (float)a2.J.F());
        Pia pia3 = a2;
        pia.J.J().J((vL)pia3.k, pia3.j);
        a2.A += vRa.d;
        if (pia2.A >= Psa.M) {
            Pia pia4 = a2;
            if (pia4.J.J((vL)pia4.k) < KSa.F) {
                a2.C();
            }
        }
    }

    private fEa J() {
        Pia pia = this;
        float a22 = Qsa.k;
        Pia pia2 = pia;
        Object a22 = pia2.I.J(pia2.J.getClass(), pia.J.J().f((double)a22, (double)a22, (double)a22));
        double d2 = Bra.o;
        fEa fEa2 = null;
        a22 = a22.iterator();
        while (a22.hasNext()) {
            fEa fEa3 = (fEa)a22.next();
            if (!pia.J.J(fEa3) || !(pia.J.J((vL)fEa3) < d2)) continue;
            fEa2 = fEa3;
            d2 = pia.J.J((vL)fEa3);
        }
        return fEa2;
    }
}

