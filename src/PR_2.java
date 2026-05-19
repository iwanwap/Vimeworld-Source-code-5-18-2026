/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ju
 *  QF
 *  Sf
 *  Zta
 *  eS
 *  iS
 *  pua
 *  rt
 *  vRa
 *  wra
 *  zU
 */
public final class PR_2
extends QF {
    private Ju A;
    private final He I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        jU jU2;
        void a22;
        int e22 = n2;
        PR_2 d2 = this;
        if (a22 == false) {
            return;
        }
        jU e22 = zU.M.J();
        cw c2 = e22.J(nu.J(Ju.J((Ju)d2.A)).J());
        if (c2 == null) {
            e22 = zU.M.J(iS.MINIDOT_GUI);
            c2 = e22.J(nu.J(Ju.J((Ju)d2.A)).J());
        }
        if (c2 == null || c2.J == eS.PET_LEFT) {
            return;
        }
        cw b2 = e22.J(eS.PET_LEFT);
        rt a22 = new rt(nu.J(Ju.J((Ju)d2.A)).J());
        jU jU3 = e22;
        if (b2 != null) {
            jU3.J(eS.PET_RIGHT, b2.I, new rt(b2.A), vRa.d != 0);
            jU2 = e22;
        } else {
            jU3.J(eS.PET_RIGHT);
            jU2 = e22;
        }
        jU2.J(eS.PET_LEFT, c2.I, a22, vRa.d != 0);
    }

    public PR_2(Ju ju2) {
        PR_2 b2 = ju2;
        PR_2 a2 = this;
        super(uSa.E, uSa.E, (int)((Ju.J((Ju)b2).l() - Zta.ba) / KPa.y), wra.P, null, null, null);
        a2.A = b2;
        a2.I = Sf.J((char)KSa.H);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        PR_2 a2;
        int c2 = n3;
        PR_2 pR_2 = a2 = this;
        super.J((int)b2, c2);
        pR_2.I.J((int)(a2.I + a2.k / KPa.y - Wqa.m), (int)(a2.J + a2.j / KPa.y - Wqa.m), kTa.j, kTa.j, pua.o);
    }
}

