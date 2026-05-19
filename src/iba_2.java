/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Waa
 *  XTa
 *  Zaa
 *  dW
 *  eAa
 *  vRa
 */
public final class iba_2
extends Zaa {
    public iba_2() {
        iba_2 a2;
        Mda[] mdaArray = new Mda[WOa.fa];
        mdaArray[uSa.E] = new Mda(Gea.LB);
        mdaArray[vRa.d] = new Mda(Gea.LB);
        mdaArray[uqa.g] = new Mda(Gea.LB);
        mdaArray[yRa.d] = new Mda(Gea.LB);
        mdaArray[AQa.P] = new Mda((eAa)Gea.wa, uSa.E, BQa.h);
        mdaArray[tTa.h] = new Mda(Gea.LB);
        mdaArray[uua.p] = new Mda(Gea.LB);
        mdaArray[XTa.W] = new Mda(Gea.LB);
        mdaArray[Yqa.i] = new Mda(Gea.LB);
        super(yRa.d, yRa.d, mdaArray, new Mda((eAa)Gea.CC, uSa.E, uSa.E));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(xFa xFa2) {
        void a2;
        int n2;
        iba_2 iba_22 = this;
        iba_2 b2 = null;
        int n3 = n2 = uSa.E;
        while (n3 < a2.f() && b2 == null) {
            Mda mda2 = a2.J(n2);
            if (mda2 != null && mda2.J() == Gea.wa) {
                b2 = mda2;
            }
            n3 = ++n2;
        }
        b2 = b2.J();
        ((Mda)b2).E = vRa.d;
        if (b2.J() == null) {
            b2.J(new Waa());
        }
        iba_2 iba_23 = b2;
        iba_23.J().J(qsa.N, vRa.d != 0);
        return iba_23;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(xFa xFa2, Gg gg2) {
        int c22;
        void a2;
        void b2;
        iba_2 iba_22 = this;
        if (!super.J((xFa)b2, (Gg)a2)) {
            return uSa.E != 0;
        }
        Mda mda2 = null;
        int n2 = c22 = uSa.E;
        while (n2 < b2.f() && mda2 == null) {
            Mda mda3 = b2.J(c22);
            if (mda3 != null && mda3.J() == Gea.wa) {
                mda2 = mda3;
            }
            n2 = ++c22;
        }
        if (mda2 == null) {
            return uSa.E != 0;
        }
        dW c22 = Gea.wa.J(mda2, (Gg)a2);
        if (c22 == null) {
            return uSa.E != 0;
        }
        if (c22.C < AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

