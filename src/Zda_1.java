/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  JPa
 *  Mda
 *  Oz
 *  Taa
 *  aX
 *  pqa
 *  vL
 *  zEa
 */
public final class Zda_1
extends sEa {
    private Sx j;
    private int J;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Mda mda2) {
        void a2;
        Zda_1 zda_1;
        Zda_1 zda_12 = zda_1 = this;
        a2.J((Gg)zda_1.j.j, zda_12.j, zda_1.J);
        if (!zda_12.j.j.e) {
            int n2;
            int n3;
            int b2 = zda_1.J;
            float f2 = Taa.J().J((Mda)a2);
            if (f2 == JPa.N) {
                n3 = b2 = uSa.E;
            } else {
                if (f2 < pqa.r) {
                    n2 = Oz.J((float)((float)b2 * f2));
                    if (n2 < Oz.f((float)((float)b2 * f2)) && Math.random() < (double)((float)b2 * f2 - (float)n2)) {
                        ++n2;
                    }
                    b2 = n2;
                }
                n3 = b2;
            }
            while (n3 > 0) {
                n2 = zEa.J((int)b2);
                n3 = b2 - n2;
                zda_1.j.j.f((vL)new zEa((Gg)zda_1.j.j, zda_1.j.la, (double)(zda_1.j.Z + kTa.B), (double)(zda_1.j.A + kTa.B), n2));
            }
        }
        zda_1.J = uSa.E;
        if (a2.J() == Gea.GA) {
            zda_1.j.J((aX)mY.j);
        }
        if (a2.J() == Gea.Ka) {
            zda_1.j.J((aX)mY.h);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Zda_1(Sx sx, HA hA2, int n2, int n3, int n4) {
        void e2;
        void f2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Zda_1 a2 = this;
        super((HA)d2, (int)c2, (int)b2, (int)f2);
        a2.j = e2;
    }

    @Override
    public boolean J(Mda mda2) {
        Zda_1 b2 = mda2;
        Zda_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Mda mda2, int n2) {
        void b2;
        Zda_1 a2;
        int c2 = n2;
        Zda_1 zda_1 = a2 = this;
        zda_1.J += c2;
        zda_1.f((Mda)b2);
    }

    @Override
    public Mda J(int n2) {
        int b2 = n2;
        Zda_1 a2 = this;
        if (a2.J()) {
            a2.J += Math.min(b2, a2.J().E);
        }
        return super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx, Mda mda2) {
        void b2;
        Zda_1 a2;
        Zda_1 c2 = mda2;
        Zda_1 zda_1 = a2 = this;
        zda_1.f((Mda)c2);
        super.J((Sx)b2, (Mda)c2);
    }
}

