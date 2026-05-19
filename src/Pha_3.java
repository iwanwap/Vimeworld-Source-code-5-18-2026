/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  dFa
 *  vRa
 *  vfa
 */
public final class Pha_3
extends dFa {
    public Gl J;
    public vfa A;
    private int I;

    public Pha_3(vfa vfa2) {
        Pha_3 a2;
        Pha_3 b2 = vfa2;
        Pha_3 pha_3 = a2 = this;
        super((bga)((Object)b2), uSa.E != 0);
        pha_3.A = b2;
        pha_3.J(vRa.d);
    }

    public void l() {
        Pha_3 pha_3;
        Pha_3 pha_32 = pha_3 = this;
        pha_3.j.C(pha_32.J);
        Pha_3 a2 = pha_32.A.d();
        if (a2 != null) {
            pha_3.I = a2.k();
        }
        super.l();
    }

    public boolean f() {
        Pha_3 pha_3 = this;
        if (!pha_3.A.ba()) {
            return uSa.E != 0;
        }
        Pha_3 a2 = pha_3.A.d();
        if (a2 == null) {
            return uSa.E != 0;
        }
        pha_3.J = a2.f();
        if (a2.k() != pha_3.I) {
            Pha_3 pha_32 = pha_3;
            if (pha_32.J(pha_32.J, uSa.E != 0)) {
                Pha_3 pha_33 = pha_3;
                if (pha_33.A.J(pha_33.J, (Gl)a2)) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }
}

