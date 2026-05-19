/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  dFa
 *  vRa
 *  vfa
 */
public final class vIa_1
extends dFa {
    private int J;
    public vfa A;
    public Gl I;

    public vIa_1(vfa vfa2) {
        vIa_1 a2;
        vIa_1 b2 = vfa2;
        vIa_1 vIa_12 = a2 = this;
        super((bga)((Object)b2), uSa.E != 0);
        vIa_12.A = b2;
        vIa_12.J(vRa.d);
    }

    public boolean f() {
        vIa_1 vIa_12 = this;
        if (!vIa_12.A.ba()) {
            return uSa.E != 0;
        }
        vIa_1 a2 = vIa_12.A.d();
        if (a2 == null) {
            return uSa.E != 0;
        }
        vIa_12.I = a2.J();
        if (a2.l() != vIa_12.J) {
            vIa_1 vIa_13 = vIa_12;
            if (vIa_13.J(vIa_13.I, uSa.E != 0)) {
                vIa_1 vIa_14 = vIa_12;
                if (vIa_14.A.J(vIa_14.I, (Gl)a2)) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    public void l() {
        vIa_1 vIa_12;
        vIa_1 vIa_13 = vIa_12 = this;
        vIa_12.j.C(vIa_13.I);
        vIa_1 a2 = vIa_13.A.d();
        if (a2 != null) {
            vIa_12.J = a2.l();
        }
        super.l();
    }
}

