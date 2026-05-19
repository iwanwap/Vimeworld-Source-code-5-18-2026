/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GY
 *  Mda
 *  Sea
 *  Uz
 *  Ypa
 *  eAa
 *  gB
 *  kGa
 *  vRa
 */
import java.util.Random;

public final class tEa_2
implements gB {
    public Sea A;
    public Mda I;

    /*
     * WARNING - void declaration
     */
    public void J(GY gY2, Random random) {
        void b2;
        void a2;
        tEa_2 tEa_22 = this;
        int c22 = vRa.d;
        if (tEa_22.A != null) {
            c22 = tEa_22.A.J((Random)a2);
        }
        Mda c22 = new Mda(Gea.kc, c22, uSa.E);
        Mda mda2 = new Mda(tEa_22.I.J(), vRa.d, tEa_22.I.J());
        void v0 = a2;
        mda2 = kGa.J((Random)v0, (Mda)mda2, (int)(tTa.h + v0.nextInt(Ypa.A)));
        b2.add((Object)new Uz(c22, mda2));
    }

    /*
     * WARNING - void declaration
     */
    public tEa_2(eAa eAa2, Sea sea) {
        void b2;
        tEa_2 c2 = sea;
        tEa_2 a2 = this;
        tEa_2 tEa_22 = a2;
        a2.I = new Mda((eAa)b2);
        a2.A = c2;
    }
}

