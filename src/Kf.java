/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Le
 *  PF
 *  Qsa
 *  vB
 */
public final class Kf
extends vB {
    private final eF I;

    public Kf(eF eF2) {
        Object b2 = eF2;
        Kf a2 = this;
        super(uSa.E, uSa.E, (int)b2.l(), (int)b2.J(), null, null);
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a22;
        Kf b2;
        int c22 = n2;
        Kf kf = b2 = this;
        b2.k = b2.I.l();
        kf.j = kf.I.J();
        super.J(c22, (int)a22);
        Ii c22 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        String a22 = Zqa.x;
        c22.J(a22, (int)(b2.I + b2.k / KPa.y - (double)(c22.f(a22) / uqa.g)), (int)(b2.J + b2.j / KPa.y - (double)(c22.J(Mqa.y) / uqa.g)), Bc.K.getRGB(), uSa.E != 0);
    }
}

