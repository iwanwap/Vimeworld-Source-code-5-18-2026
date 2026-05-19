/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Gg
 *  Mda
 *  SCa
 *  Tz
 *  Vx
 *  dW
 *  eAa
 *  vRa
 *  yQa
 */
public final class KEa_3
extends SCa {
    public KEa_3() {
        KEa_3 a2;
        KEa_3 kEa_3 = a2;
        kEa_3.J(yGa.g);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        void c2;
        void b2;
        KEa_3 kEa_3 = this;
        Mda mda3 = new Mda((eAa)Gea.wa, vRa.d, b2.J(Epa.Aa));
        String string = new StringBuilder().insert(2 & 5, yQa.H).append(mda3.J()).toString();
        KEa_3 d2 = new dW(string);
        void v0 = c2;
        b2.J(string, (Vx)d2);
        KEa_3 kEa_32 = d2;
        ((dW)d2).C = (byte)uSa.E;
        kEa_32.J(a2.la, a2.A, ((dW)d2).C);
        ((dW)d2).M = (byte)b2.F.J();
        kEa_32.J();
        v0.E -= vRa.d;
        if (v0.E <= 0) {
            return mda3;
        }
        if (!a2.K.f(mda3.J())) {
            a2.J(mda3, uSa.E != 0);
        }
        a2.J(Tz.H[eAa.J((eAa)kEa_3)]);
        return c2;
    }
}

