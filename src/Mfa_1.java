/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Mda
 *  NTa
 *  Waa
 *  jFa
 *  vL
 *  wOa
 */
import java.util.Random;

public final class Mfa_1 {
    private static final Random I = new Random();

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, vL vL2, HA hA2) {
        void a2;
        Gg c2 = vL2;
        Gg b2 = gg2;
        Mfa_1.J(b2, c2.la, c2.Z, c2.A, (HA)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, XF xF2, HA hA2) {
        void a2;
        Object c2 = xF2;
        Gg b2 = gg2;
        Mfa_1.J(b2, (double)c2.getX(), (double)c2.getY(), (double)c2.getZ(), (HA)a2);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Gg gg2, double d2, double d3, double d4, HA hA2) {
        void a2;
        int e2;
        Gg gg3 = gg2;
        int n2 = e2 = uSa.E;
        while (n2 < a2.f()) {
            Mda mda2 = a2.J(e2);
            if (mda2 != null) {
                void b2;
                void c2;
                void d5;
                Mfa_1.J(gg3, (double)d5, (double)c2, (double)b2, mda2);
            }
            n2 = ++e2;
        }
    }

    public Mfa_1() {
        Mfa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Gg gg2, double d2, double d3, double d4, Mda mda2) {
        Gg e2;
        Gg gg3 = gg2;
        gg2 = mda2;
        Gg a2 = gg3;
        float f2 = I.nextFloat() * xSa.la + Nra.e;
        float f3 = I.nextFloat() * xSa.la + Nra.e;
        float f4 = I.nextFloat() * xSa.la + Nra.e;
        Gg gg4 = e2;
        while (gg4.E > 0) {
            void b2;
            void c2;
            void d5;
            int n2 = I.nextInt(wOa.h) + NTa.C;
            if (n2 > e2.E) {
                n2 = e2.E;
            }
            Gg gg5 = e2;
            gg5.E -= n2;
            jFa jFa2 = new jFa(a2, (double)(d5 + (double)f2), (double)(c2 + (double)f3), (double)(b2 + (double)f4), new Mda(e2.J(), n2, e2.J()));
            if (gg5.M()) {
                jFa2.J().J((Waa)e2.J().J());
            }
            float f5 = Yqa.C;
            gg4 = e2;
            jFa jFa3 = jFa2;
            jFa3.f(I.nextGaussian() * (double)f5);
            jFa3.J(I.nextGaussian() * (double)f5 + Bua.Ia);
            jFa3.l(I.nextGaussian() * (double)f5);
            a2.f((vL)jFa3);
        }
    }
}

