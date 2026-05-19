/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HGa
 *  Mda
 *  NCa
 *  Waa
 *  eAa
 *  kGa
 *  vRa
 *  waa
 *  wga
 */
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tFa_1
extends eAa {
    public boolean J(Mda mda2) {
        tFa_1 b2 = mda2;
        tFa_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        int a2;
        void b2;
        waa d2;
        tFa_1 c2;
        Object e2 = sx2;
        tFa_1 tFa_12 = c2 = this;
        super.J((Mda)d2, (Sx)((Object)e2), (List)b2, a2 != 0);
        d2 = tFa_12.J((Mda)d2);
        if (d2 != null) {
            int n2 = e2 = uSa.E;
            while (n2 < d2.J()) {
                waa waa2 = d2;
                a2 = waa2.J(e2).J(QTa.O);
                short s = waa2.J(e2).J(Jra.ca);
                if (wga.J((int)a2) != null) {
                    b2.add(wga.J((int)a2).J((int)s));
                }
                n2 = ++e2;
            }
        }
    }

    public baa J(Random random) {
        Object b2 = random;
        tFa_1 a2 = this;
        return a2.J((Random)b2, vRa.d, vRa.d, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, HGa hGa) {
        int n2;
        void a2;
        waa waa2;
        void b2;
        block5: {
            int c2;
            tFa_1 tFa_12 = this;
            waa2 = tFa_12.J((Mda)b2);
            int n3 = vRa.d;
            int n4 = c2 = uSa.E;
            while (n4 < waa2.J()) {
                Waa waa3 = waa2.J(c2);
                if (waa3.J(QTa.O) == a2.A.I) {
                    if (waa3.J(Jra.ca) < a2.I) {
                        waa3.J(Jra.ca, (short)a2.I);
                    }
                    n2 = n3 = uSa.E;
                    break block5;
                }
                n4 = ++c2;
            }
            n2 = n3;
        }
        if (n2 != 0) {
            Waa c2;
            Waa waa4 = c2 = new Waa();
            waa4.J(QTa.O, (short)a2.A.I);
            waa4.J(Jra.ca, (short)a2.I);
            waa2.J((NCa)waa4);
        }
        if (!b2.M()) {
            b2.J(new Waa());
        }
        b2.J().J(yta.k, (NCa)waa2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(wga wga2, List<Mda> list) {
        void b2;
        int c2;
        tFa_1 tFa_12 = this;
        int n2 = c2 = b2.l();
        while (n2 <= b2.f()) {
            void a2;
            a2.add(tFa_12.J(new HGa((wga)b2, c2++)));
            n2 = c2;
        }
    }

    public boolean l(Mda mda2) {
        tFa_1 b2 = mda2;
        tFa_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public baa J(Random random, int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        void d2;
        tFa_1 tFa_12 = this;
        tFa_1 e2 = new Mda(Gea.Qa, vRa.d, uSa.E);
        kGa.J((Random)d2, (Mda)e2, (int)Fsa.d);
        return new baa((Mda)e2, (int)c2, (int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(HGa hGa) {
        void a2;
        tFa_1 b2;
        tFa_1 tFa_12 = this;
        tFa_1 tFa_13 = b2 = new Mda((eAa)tFa_12);
        tFa_12.J((Mda)tFa_13, (HGa)a2);
        return tFa_13;
    }

    public tFa_1() {
        tFa_1 a2;
    }

    public oda J(Mda mda2) {
        tFa_1 a2 = this;
        tFa_1 b2 = mda2;
        if (a2.J((Mda)b2).J() > 0) {
            return oda.UNCOMMON;
        }
        return super.J((Mda)b2);
    }

    public waa J(Mda mda2) {
        tFa_1 b2 = mda2;
        tFa_1 a2 = this;
        if ((b2 = b2.J()) != null && b2.J(yta.k, WOa.fa)) {
            return (waa)b2.J(yta.k);
        }
        return new waa();
    }
}

