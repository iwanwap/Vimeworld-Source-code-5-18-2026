/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Mda
 *  eAa
 *  vRa
 */
import java.util.List;

public final class eDa_3
extends eAa {
    public String C(Mda mda2) {
        eDa_3 b2 = mda2;
        eDa_3 a2 = this;
        if (b2.J() == vRa.d) {
            return Asa.Ga;
        }
        return Fpa.U;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        eDa_3 a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
        d2.add(new Mda((eAa)c2, vRa.d, vRa.d));
    }

    public eDa_3() {
        eDa_3 a2;
        eDa_3 eDa_32 = a2;
        eDa_32.J(vRa.d != 0);
        a2.f(uSa.E);
        a2.J(yGa.E);
    }
}

