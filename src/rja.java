/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Kpa
 *  Oz
 *  ZOa
 *  aSa
 *  fpa
 *  kPa
 *  kta
 *  pqa
 *  psa
 *  vRa
 *  xb
 */
import optifine.Config;

public final class rja
extends KLa {
    private static final String j = "CL_00001071";
    public double J;
    public double A;
    public static String I;

    public rja(String string) {
        String b2 = string;
        rja a2 = this;
        Object object = b2;
        super((String)object);
        I = object;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, double d2, double d3, double d4, boolean bl, boolean bl2) {
        rja g2 = gg2;
        rja f2 = this;
        if (!f2.q.isEmpty()) {
            int n2;
            rja rja2;
            void a2;
            void b2;
            double d5 = aSa.V;
            if (g2 != null && b2 == false) {
                void d6;
                double e2;
                rja rja3 = g2;
                XF xF = rja3.J();
                double d7 = (double)xF.getX() - e2;
                e2 = (double)xF.getZ() - d6;
                d5 = -(((c %= ZOa.Ja) - fpa.ba) * lQa.f / kta.Da - Math.atan2(e2, d7));
                if (!((Gg)rja3).F.J()) {
                    d5 = Math.random() * lQa.f * KPa.y;
                }
            }
            if (a2 != false) {
                rja2 = f2;
                f2.A = d5;
            } else {
                double d8;
                double d9 = d8 = d5 - f2.A;
                while (d9 < psa.D) {
                    d9 = d8 + kPa.Z;
                }
                double d10 = d8;
                while (d10 >= lQa.f) {
                    d10 = d8 - kPa.Z;
                }
                d8 = Oz.J((double)d8, (double)pqa.q, (double)oua.i);
                rja rja4 = f2;
                rja2 = rja4;
                rja4.J += d8 * tpa.k;
                rja4.J *= Jra.A;
                rja4.A += f2.J;
            }
            int n3 = n2 = (int)((rja2.A / kPa.Z + oua.i) * (double)f2.q.size()) % f2.q.size();
            while (n3 < 0) {
                n3 = (n2 + f2.q.size()) % f2.q.size();
            }
            if (n2 != f2.v) {
                f2.v = n2;
                rja rja5 = f2;
                if (Config.h()) {
                    rja rja6 = f2;
                    rja rja7 = f2;
                    xb.J((int[][])((int[][])rja5.q.get(f2.v)), (int)rja6.d, (int)rja6.G, (int)rja7.A, (int)rja7.L, uSa.E != 0, uSa.E != 0);
                    return;
                }
                rja rja8 = f2;
                rja rja9 = f2;
                gLa.J((int[][])rja5.q.get(f2.v), rja8.d, rja8.G, (int)rja9.A, rja9.L, uSa.E != 0, uSa.E != 0);
            }
        }
    }

    @Override
    public void f() {
        rja rja2 = this;
        rja a2 = Kpa.J();
        if (((Kpa)a2).Ta != null && ((Kpa)a2).c != null) {
            rja rja3 = a2;
            rja2.J((Gg)((Kpa)rja3).Ta, ((Kpa)rja3).c.la, ((Kpa)a2).c.A, ((Kpa)a2).c.X, uSa.E != 0, uSa.E != 0);
            return;
        }
        rja2.J(null, aSa.V, aSa.V, aSa.V, vRa.d != 0, uSa.E != 0);
    }
}

