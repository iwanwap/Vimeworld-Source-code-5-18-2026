/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ju
 *  QF
 *  Sf
 *  Zpa
 *  Zta
 *  eS
 *  iS
 *  pua
 *  rt
 *  vRa
 *  wra
 *  zU
 */
public final class rs_2
extends QF {
    private Ju A;
    private final He I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        rs_2 a2;
        int c2 = n3;
        rs_2 rs_22 = a2 = this;
        super.J((int)b2, c2);
        rs_22.I.J((int)(a2.I + a2.k / KPa.y - Wqa.m), (int)(a2.J + a2.j / KPa.y - Wqa.m), kTa.j, kTa.j, pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        jU jU2;
        void a22;
        int e22 = n2;
        rs_2 d2 = this;
        if (a22 == false) {
            return;
        }
        jU e22 = zU.M.J();
        cw c2 = e22.J(nu.J(Ju.J((Ju)d2.A)).J());
        if (c2 == null) {
            e22 = zU.M.J(iS.MINIDOT_GUI);
            c2 = e22.J(nu.J(Ju.J((Ju)d2.A)).J());
        }
        if (c2 == null || c2.J == eS.PET_RIGHT) {
            return;
        }
        cw b2 = e22.J(eS.PET_RIGHT);
        rt a22 = new rt(nu.J(Ju.J((Ju)d2.A)).J());
        jU jU3 = e22;
        if (b2 != null) {
            jU3.J(eS.PET_LEFT, b2.I, new rt(b2.A), vRa.d != 0);
            jU2 = e22;
        } else {
            jU3.J(eS.PET_LEFT);
            jU2 = e22;
        }
        jU2.J(eS.PET_RIGHT, c2.I, a22, vRa.d != 0);
    }

    public rs_2(Ju ju2) {
        rs_2 b2 = ju2;
        rs_2 a2 = this;
        super(uSa.E, uSa.E, (int)((Ju.J((Ju)b2).l() - Zta.ba) / KPa.y), wra.P, null, null, null);
        a2.A = b2;
        a2.I = Sf.J((char)Zpa.i);
    }
}

