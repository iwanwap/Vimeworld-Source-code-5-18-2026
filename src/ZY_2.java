/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ew
 *  Gg
 *  IV
 *  JPa
 *  Jy
 *  Kz
 *  MQa
 *  QFa
 *  Rw
 *  bpa
 *  vRa
 */
import java.util.Random;

public final class ZY_2
extends Jy {
    private IV J;
    private boolean A;
    private Ew I;

    public bV J(Random random) {
        Object b2 = random;
        ZY_2 a2 = this;
        return new Rw(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public ZY_2(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        ZY_2 a2 = this;
        super((int)b2);
        ZY_2 zY_2 = a2;
        a2.J = new IV();
        zY_2.I = new Ew(AQa.P);
        a2.A = c2;
        if (a2.A) {
            a2.M = QFa.mb.J();
        }
        a2.q.clear();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void a2;
        void c2;
        Random d2 = random;
        ZY_2 b2 = this;
        if (b2.A) {
            int n2;
            int n3;
            int n4;
            int n5 = n4 = uSa.E;
            while (n5 < yRa.d) {
                Random random2 = d2;
                n3 = random2.nextInt(ERa.C) + Yqa.i;
                n2 = random2.nextInt(ERa.C) + Yqa.i;
                void v2 = c2;
                b2.J.J((Gg)v2, d2, v2.l(a2.add(n3, uSa.E, n2)));
                n5 = ++n4;
            }
            int n6 = n4 = uSa.E;
            while (n6 < uqa.g) {
                Object object = d2;
                n3 = ((Random)object).nextInt(ERa.C) + Yqa.i;
                n2 = ((Random)object).nextInt(ERa.C) + Yqa.i;
                void v5 = c2;
                b2.I.J((Gg)v5, d2, v5.l(a2.add(n3, uSa.E, n2)));
                n6 = ++n4;
            }
        }
        super.J((Gg)c2, d2, (XF)a2);
    }

    public Jy f(int n2) {
        int b22 = n2;
        ZY_2 a2 = this;
        Jy b22 = new ZY_2(b22, vRa.d != 0).J(hQa.k, vRa.d != 0).J(new StringBuilder().insert(5 >> 3, a2.Ma).append(rta.v).toString()).J().J(JPa.N, MQa.L).J(new Kz(a2.Ca + Nra.e, a2.k + Nra.e));
        b22.Ca = a2.Ca + bpa.K;
        b22.k = a2.k + Xpa.R;
        return b22;
    }
}

