/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Hda
 *  Mda
 *  Uta
 *  eAa
 *  kba
 *  vRa
 */
import java.util.List;

public final class AFa
extends YCa {
    public boolean l(Mda mda2) {
        AFa b2 = mda2;
        AFa a2 = this;
        if (b2.J() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void b2;
        Object d2 = sx2;
        AFa a2 = this;
        if (!b2.e) {
            d2.J(new kba(Hda.d.O, Uta.F, uSa.E));
        }
        if (c2.J() > 0) {
            if (!b2.e) {
                Object object = d2;
                object.J(new kba(Hda.t.O, Jpa.z, AQa.P));
                object.J(new kba(Hda.u.O, MTa.g, uSa.E));
                object.J(new kba(Hda.G.O, MTa.g, uSa.E));
                return;
            }
        } else {
            super.f((Mda)c2, (Gg)b2, (Sx)((Object)d2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        AFa a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
        d2.add(new Mda((eAa)c2, vRa.d, vRa.d));
    }

    public oda J(Mda mda2) {
        AFa b2 = mda2;
        AFa a2 = this;
        if (b2.J() == 0) {
            return oda.RARE;
        }
        return oda.EPIC;
    }

    /*
     * WARNING - void declaration
     */
    public AFa(int n2, float f2, boolean bl) {
        void b2;
        void c2;
        AFa a2;
        boolean d2 = bl;
        AFa aFa = a2 = this;
        super((int)c2, (float)b2, d2);
        aFa.J(vRa.d != 0);
    }
}

