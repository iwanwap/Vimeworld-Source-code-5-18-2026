/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Waa
 *  Wv
 *  Xv
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class Cv_2
extends Wv {
    private int field_74993_a;

    /*
     * WARNING - void declaration
     */
    public Cv_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        Cv_2 a2;
        Cv_2 cv_2 = object;
        Object object = dZ2;
        Cv_2 cv_22 = a2 = cv_2;
        super((int)d2);
        a2.coordBaseMode = e2;
        cv_22.boundingBox = b2;
        cv_22.field_74993_a = e2 != DZ.NORTH && e2 != DZ.SOUTH ? b2.J() : b2.l();
    }

    /*
     * WARNING - void declaration
     */
    public static Xv J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        void a2;
        void b2;
        void c2;
        void d2;
        Object f2 = random;
        List<uU> e2 = list;
        f2 = Xv.J((int)d2, (int)c2, (int)b2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)AQa.P, (DZ)a2);
        uU uU2 = uU.J(e2, (Xv)f2);
        if (uU2 == null) {
            return null;
        }
        if (uU2.J().minY == ((Xv)f2).minY) {
            int n5;
            int n6 = n5 = yRa.d;
            while (n6 >= vRa.d) {
                f2 = Xv.J((int)d2, (int)c2, (int)b2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)(n5 - vRa.d), (DZ)a2);
                if (!uU2.J().J((Xv)f2)) {
                    return Xv.J((int)d2, (int)c2, (int)b2, (int)pua.o, (int)pua.o, (int)uSa.E, (int)tTa.h, (int)tTa.h, (int)n5, (DZ)a2);
                }
                n6 = --n5;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void a2;
        void c2;
        Object d2 = random;
        Cv_2 b2 = this;
        if (b2.J((Gg)c2, (Xv)a2)) {
            return uSa.E != 0;
        }
        int n2 = d2 = uSa.E;
        while (n2 < b2.field_74993_a) {
            Cv_2 cv_2 = b2;
            void v2 = c2;
            Cv_2 cv_22 = b2;
            cv_22.f((Gg)c2, QFa.v.J(), uSa.E, uSa.E, d2, (Xv)a2);
            cv_22.f((Gg)c2, QFa.v.J(), vRa.d, uSa.E, d2, (Xv)a2);
            b2.f((Gg)v2, QFa.v.J(), uqa.g, uSa.E, d2, (Xv)a2);
            cv_2.f((Gg)v2, QFa.v.J(), yRa.d, uSa.E, d2, (Xv)a2);
            cv_2.f((Gg)c2, QFa.v.J(), AQa.P, uSa.E, d2, (Xv)a2);
            int n3 = vRa.d;
            while (n3 <= yRa.d) {
                int n4;
                Cv_2 cv_23 = b2;
                void v6 = c2;
                Cv_2 cv_24 = b2;
                cv_24.f((Gg)c2, QFa.v.J(), uSa.E, n4, d2, (Xv)a2);
                cv_24.f((Gg)c2, QFa.HF.J(), vRa.d, n4, d2, (Xv)a2);
                b2.f((Gg)v6, QFa.HF.J(), uqa.g, n4, d2, (Xv)a2);
                cv_23.f((Gg)v6, QFa.HF.J(), yRa.d, n4, d2, (Xv)a2);
                cv_23.f((Gg)c2, QFa.v.J(), AQa.P, n4++, d2, (Xv)a2);
                n3 = n4;
            }
            Cv_2 cv_25 = b2;
            void v9 = c2;
            Cv_2 cv_26 = b2;
            void v11 = c2;
            b2.f((Gg)v11, QFa.v.J(), uSa.E, AQa.P, d2, (Xv)a2);
            cv_26.f((Gg)v11, QFa.v.J(), vRa.d, AQa.P, d2, (Xv)a2);
            cv_26.f((Gg)c2, QFa.v.J(), uqa.g, AQa.P, d2, (Xv)a2);
            cv_25.f((Gg)v9, QFa.v.J(), yRa.d, AQa.P, d2, (Xv)a2);
            cv_25.f((Gg)v9, QFa.v.J(), AQa.P, AQa.P, d2++, (Xv)a2);
            n2 = d2;
        }
        return vRa.d != 0;
    }

    public Cv_2() {
        Cv_2 a2;
    }

    public void f(Waa waa2) {
        Cv_2 b2 = waa2;
        Cv_2 a2 = this;
        Cv_2 cv_2 = b2;
        super.f((Waa)cv_2);
        cv_2.J(Jpa.Aa, a2.field_74993_a);
    }

    public void J(Waa waa2) {
        Cv_2 b2 = waa2;
        Cv_2 a2 = this;
        super.J((Waa)b2);
        a2.field_74993_a = b2.J(Jpa.Aa);
    }
}

