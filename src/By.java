/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Mda
 *  kGa
 *  oX
 *  vRa
 */
import java.util.Random;

public final class By
extends oX {
    private final Mda J;
    private boolean A;
    private float I;

    public By J(float f2) {
        float b2 = f2;
        By a2 = this;
        a2.I = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public By(Mda mda2, int n2) {
        void b2;
        int c2 = n2;
        By a2 = this;
        super(c2);
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Random random) {
        void a2;
        By by2;
        By by3 = by2 = this;
        Mda mda2 = by3.J.J();
        if (by3.I > JPa.N) {
            By by4 = by2;
            int n2 = (int)(by4.I * (float)by4.J.l());
            void v2 = a2;
            int b2 = mda2.l() - v2.nextInt(v2.nextInt(n2) + vRa.d);
            if (b2 > n2) {
                b2 = n2;
            }
            if (b2 < vRa.d) {
                b2 = vRa.d;
            }
            mda2.J(b2);
        }
        if (by2.A) {
            kGa.J((Random)a2, (Mda)mda2, (int)Fsa.d);
        }
        return mda2;
    }

    public By J() {
        By a2;
        a2.A = vRa.d;
        return a2;
    }
}

