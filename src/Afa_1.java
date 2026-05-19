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

public final class Afa_1
implements gB {
    public Mda j;
    public Mda J;
    public Sea A;
    public Sea I;

    /*
     * WARNING - void declaration
     */
    public void J(GY gY2, Random random) {
        void b2;
        void a2;
        Afa_1 afa_1 = this;
        int n2 = vRa.d;
        if (afa_1.I != null) {
            n2 = afa_1.I.J((Random)a2);
        }
        int c2 = vRa.d;
        if (afa_1.A != null) {
            c2 = afa_1.A.J((Random)a2);
        }
        b2.add((Object)new Uz(new Mda(afa_1.J.J(), n2, afa_1.J.J()), new Mda(Gea.kc), new Mda(afa_1.j.J(), c2, afa_1.j.J())));
    }

    /*
     * WARNING - void declaration
     */
    public Afa_1(eAa eAa2, Sea sea, eAa eAa3, Sea sea2) {
        Afa_1 e2;
        void b2;
        void c2;
        void d2;
        Afa_1 a2;
        Afa_1 afa_1 = afa_12;
        Afa_1 afa_12 = sea2;
        Afa_1 afa_13 = a2 = afa_1;
        Afa_1 afa_14 = a2;
        afa_14.J = new Mda((eAa)d2);
        afa_13.I = c2;
        afa_13.j = new Mda((eAa)b2);
        afa_13.A = e2;
    }
}

