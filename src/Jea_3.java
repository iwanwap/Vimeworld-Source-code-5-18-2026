/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  Mda
 *  vRa
 */
public final class Jea_3
extends sEa {
    public final /* synthetic */ xda I;

    /*
     * WARNING - void declaration
     */
    public Jea_3(xda xda2, HA hA2, int n2, int n3, int n4) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n5 = n4;
        Jea_3 a2 = this;
        a2.I = e2;
        super((HA)d2, (int)c2, (int)b2, (int)f2);
    }

    @Override
    public int J() {
        return vRa.d;
    }

    @Override
    public boolean J(Mda mda2) {
        Jea_3 b2 = mda2;
        Jea_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (b2.J() == Gea.kc || b2.J() == Gea.b || b2.J() == Gea.Bb || b2.J() == Gea.GA) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

