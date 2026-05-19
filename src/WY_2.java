/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Jy
 *  NTa
 *  QFa
 *  mV
 *  vpa
 */
import java.util.Random;

public final class WY_2
extends Jy {
    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void c2;
        void b2;
        Object d2 = xF2;
        WY_2 a2 = this;
        void v0 = b2;
        super.J((Gg)c2, (Random)v0, (XF)((Object)d2));
        if (v0.nextInt(PRa.U) == 0) {
            void v1 = b2;
            int n2 = v1.nextInt(ERa.C) + Yqa.i;
            int n3 = v1.nextInt(ERa.C) + Yqa.i;
            d2 = c2.l(((XF)((Object)d2)).add(n2, uSa.E, n3)).up();
            new mV().J((Gg)c2, (Random)b2, (XF)((Object)d2));
        }
    }

    public WY_2(int n2) {
        WY_2 a2;
        int b2 = n2;
        WY_2 wY_2 = a2 = this;
        super(b2);
        wY_2.q.clear();
        wY_2.M = QFa.R.J();
        wY_2.G = QFa.R.J();
        wY_2.A.h = rta.n;
        wY_2.A.W = uqa.g;
        wY_2.A.H = vpa.o;
        wY_2.A.A = NTa.C;
        wY_2.q.clear();
    }
}

