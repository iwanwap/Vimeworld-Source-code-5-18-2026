/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Mda
 *  Yfa
 *  eAa
 *  vRa
 */
public final class DCa_1
extends eAa {
    public DCa_1() {
        DCa_1 a2;
        DCa_1 dCa_1 = a2;
        dCa_1.J(yGa.J);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx, Gl gl2) {
        void b2;
        void c2;
        DCa_1 d2 = gl2;
        DCa_1 a2 = this;
        if (!c2.l()) {
            return uSa.E != 0;
        }
        if (d2 instanceof Yfa) {
            Yfa yfa = (Yfa)d2;
            void v1 = c2;
            yfa.J(v1.J());
            yfa.t();
            v1.E -= vRa.d;
            return vRa.d != 0;
        }
        return super.J((Mda)c2, (Sx)b2, (Gl)d2);
    }
}

