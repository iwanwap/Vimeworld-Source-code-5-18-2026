/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  QFa
 *  Yfa
 *  gZ
 *  kqa
 *  vL
 *  vRa
 *  wPa
 */
public final class ZDa
extends oEa {
    /*
     * WARNING - void declaration
     */
    public ZDa(Gg gg2, Gl gl2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        ZDa d5;
        ZDa f2 = gl2;
        ZDa zDa = d5 = this;
        super((Gg)e2, (Gl)f2, (double)c2, (double)b2, (double)a2);
        zDa.l(wPa.F, wPa.F);
    }

    @Override
    public boolean J(gZ gZ2, float f2) {
        float c2 = f2;
        ZDa a2 = this;
        return uSa.E != 0;
    }

    @Override
    public boolean E() {
        return uSa.E != 0;
    }

    public ZDa(Gg gg2) {
        ZDa a2;
        ZDa b2 = gg2;
        ZDa zDa = a2 = this;
        super((Gg)b2);
        zDa.l(wPa.F, wPa.F);
    }

    @Override
    public void J(RY rY) {
        Object b2 = rY;
        ZDa a2 = this;
        if (!a2.j.e) {
            if (((RY)b2).J != null) {
                ZDa zDa = a2;
                boolean bl = ((RY)b2).J.J(gZ.J((oEa)zDa, (vL)zDa.G), eua.C);
                if (bl) {
                    ZDa zDa2 = a2;
                    Object object = b2;
                    zDa2.J(zDa2.G, ((RY)object).J);
                    if (!((RY)object).J.k()) {
                        ((RY)b2).J.J(tTa.h);
                    }
                }
            } else {
                int n2 = vRa.d;
                if (a2.G != null && a2.G instanceof Yfa) {
                    n2 = a2.j.J().f(kqa.N) ? 1 : 0;
                }
                if (n2 != 0 && a2.j.J((XF)((Object)(b2 = ((RY)b2).J().offset(((RY)b2).j))))) {
                    a2.j.J((XF)((Object)b2), QFa.ic.J());
                }
            }
            a2.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ZDa(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        ZDa g;
        ZDa h = gg2;
        ZDa zDa = g = this;
        super((Gg)h, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        zDa.l(wPa.F, wPa.F);
    }
}

