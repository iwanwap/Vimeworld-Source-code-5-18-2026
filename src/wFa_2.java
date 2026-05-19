/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GY
 *  Mda
 *  Sea
 *  Uz
 *  eAa
 *  gB
 *  vRa
 */
import java.util.Random;

public final class wFa_2
implements gB {
    public Sea A;
    public Mda I;

    /*
     * WARNING - void declaration
     */
    public void J(GY gY2, Random random) {
        void v0;
        void b2;
        Mda mda2;
        Mda a2;
        wFa_2 wFa_22 = this;
        int c2 = vRa.d;
        if (wFa_22.A != null) {
            c2 = wFa_22.A.J((Random)a2);
        }
        if (c2 < 0) {
            a2 = new Mda(Gea.kc, vRa.d, uSa.E);
            mda2 = new Mda(wFa_22.I.J(), -c2, wFa_22.I.J());
            v0 = b2;
        } else {
            a2 = new Mda(Gea.kc, c2, uSa.E);
            mda2 = new Mda(wFa_22.I.J(), vRa.d, wFa_22.I.J());
            v0 = b2;
        }
        v0.add((Object)new Uz(a2, mda2));
    }

    /*
     * WARNING - void declaration
     */
    public wFa_2(Mda mda2, Sea sea2) {
        void b2;
        wFa_2 a2;
        wFa_2 c2 = sea2;
        wFa_2 wFa_22 = a2 = this;
        wFa_22.I = b2;
        wFa_22.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public wFa_2(eAa eAa2, Sea sea2) {
        void b2;
        wFa_2 c2 = sea2;
        wFa_2 a2 = this;
        wFa_2 wFa_22 = a2;
        a2.I = new Mda((eAa)b2);
        a2.A = c2;
    }
}

