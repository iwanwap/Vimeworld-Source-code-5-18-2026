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

public final class RDa_2
implements gB {
    public Sea A;
    public eAa I;

    /*
     * WARNING - void declaration
     */
    public RDa_2(eAa eAa2, Sea sea) {
        void b2;
        RDa_2 a2;
        RDa_2 c2 = sea;
        RDa_2 rDa_2 = a2 = this;
        rDa_2.I = b2;
        rDa_2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(GY gY2, Random random) {
        void b2;
        RDa_2 rDa_2 = this;
        int c2 = vRa.d;
        if (rDa_2.A != null) {
            void a2;
            c2 = rDa_2.A.J((Random)a2);
        }
        b2.add((Object)new Uz(new Mda(rDa_2.I, c2, uSa.E), Gea.kc));
    }
}

