/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Mda
 *  NTa
 *  Oea
 *  Oz
 *  Waa
 *  eAa
 *  tX
 *  vL
 *  vRa
 *  xy
 */
import java.util.Random;

public final class kEa
extends eAa {
    public kEa() {
        kEa a2;
        kEa kEa2 = a2;
        kEa2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Oea oea2, Random random) {
        void a2;
        kEa c2 = oea2;
        kEa b2 = this;
        kEa kEa2 = c2;
        c2 = kEa2.J();
        void v1 = a2;
        float f2 = v1.nextFloat() * eua.C;
        float f3 = v1.nextFloat() * eta.e - FRa.Ga;
        kEa2.d(new tX(c2.l() + f2, c2.J() + f3, c2.f()));
        c2 = kEa2.e();
        f2 = a2.nextFloat() * FRa.Ga - eua.C;
        kEa2.l(new tX(c2.l(), c2.J() + f2, c2.f()));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        double d2;
        double d3;
        void h2;
        void g222;
        Object i2;
        void f5;
        Object c2;
        void d2222;
        kEa kEa2 = object;
        Object object = xF;
        kEa e2 = kEa2;
        if (d2222 == DZ.DOWN) {
            return uSa.E != 0;
        }
        Object object2 = c2 = f5.J((XF)((Object)i2)).J().f((Gg)f5, (XF)((Object)i2)) ? i2 : ((XF)((Object)i2)).offset((DZ)d2222);
        if (!g222.J((XF)((Object)c2), (DZ)d2222, (Mda)h2)) {
            return uSa.E != 0;
        }
        i2 = ((XF)((Object)c2)).up();
        int d2222 = !f5.J((XF)((Object)c2)) && !f5.J((XF)((Object)c2)).J().f((Gg)f5, (XF)((Object)c2)) ? vRa.d : uSa.E;
        if ((d2222 |= !f5.J((XF)((Object)i2)) && !f5.J((XF)((Object)i2)).J().f((Gg)f5, (XF)((Object)i2)) ? vRa.d : uSa.E) != 0) {
            return uSa.E != 0;
        }
        Object object3 = c2;
        double d4 = object3.getX();
        if (f5.f((vL)null, xy.J((double)d4, (double)(d3 = (double)object3.getY()), (double)(d2 = (double)object3.getZ()), (double)(d4 + oua.i), (double)(d3 + KPa.y), (double)(d2 + oua.i))).size() > 0) {
            return uSa.E != 0;
        }
        if (!f5.e) {
            f5.G((XF)((Object)c2));
            f5.G((XF)((Object)i2));
            i2 = new Oea((Gg)f5, d4 + kTa.B, d3, d2 + kTa.B);
            float g222 = (float)Oz.J((float)((Oz.f((float)(g222.X - Hra.Ga)) + xTa.S) / nua.E)) * nua.E;
            i2.f(d4 + kTa.B, d3, d2 + kTa.B, g222, JPa.N);
            e2.J((Oea)i2, f5.v);
            Waa g222 = h2.J();
            if (g222 != null && g222.J(yOa.C, NTa.C)) {
                Waa d2222 = new Waa();
                i2.J(d2222);
                Waa waa2 = d2222;
                waa2.J(g222.J(yOa.C));
                i2.l(waa2);
            }
            f5.f((vL)i2);
        }
        h2.E -= vRa.d;
        return vRa.d != 0;
    }
}

