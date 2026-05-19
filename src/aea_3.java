/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dga
 *  Gg
 *  Gl
 *  Hda
 *  KTa
 *  KZ
 *  MQa
 *  XTa
 *  Ypa
 *  kba
 *  oA
 *  vL
 *  vRa
 */
public final class aea_3
extends Dga {
    public oA J(KZ kZ2, oA oA2) {
        aea_3 c2 = oA2;
        aea_3 a2 = this;
        return c2;
    }

    public void s() {
        aea_3 a2;
        aea_3 aea_32 = a2;
        super.s();
        aea_32.J(Kha.M).J(hQa.x);
    }

    public aea_3(Gg gg2) {
        aea_3 a2;
        aea_3 b2 = gg2;
        aea_3 aea_32 = a2 = this;
        super((Gg)b2);
        aea_32.l(ZSa.q, MQa.L);
    }

    /*
     * WARNING - void declaration
     */
    public boolean C(vL vL2) {
        void a2;
        aea_3 aea_32 = this;
        if (super.C((vL)a2)) {
            if (a2 instanceof Gl) {
                int n2;
                int b2 = uSa.E;
                if (aea_32.j.J() == sZ.NORMAL) {
                    n2 = b2 = XTa.W;
                } else {
                    if (aea_32.j.J() == sZ.HARD) {
                        b2 = Ypa.A;
                    }
                    n2 = b2;
                }
                if (n2 > 0) {
                    ((Gl)a2).J(new kba(Hda.c.O, b2 * kTa.j, uSa.E));
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float l() {
        return KTa.r;
    }
}

