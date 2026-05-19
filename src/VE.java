/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  NQa
 *  Oqa
 *  ad
 *  gra
 *  if
 *  kC
 *  kpa
 *  lE
 */
import java.awt.Color;

public final class VE
extends jb {
    private final kC A;
    private final kC I;

    @Override
    public void e() {
        VE a2;
        VE vE = a2;
        if.f((double)(a2.I + oua.i), (double)vE.J, (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
        if.f((double)(vE.I + oua.i), (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        VE a2;
        int c2 = n3;
        VE vE = a2 = this;
        vE.A.J((Color)Bc.E.transparent(WF.J()));
        vE.I.J((Color)Bc.E.transparent(WF.J()));
        vE.I.J((WF.f() == null ? uSa.E : WF.f().size()) + Mqa.y);
        super.J((int)b2, c2);
    }

    public VE() {
        VE a2;
        VE vE = a2;
        super(Oqa.COLUMN, tTa.h, yRa.d);
        vE.J(gra.SPACE_BETWEEN);
        vE.J(cPa.x);
        vE.f(uqa.g);
        vE.i(uqa.g);
        VE vE2 = a2;
        vE.A = new kC(uSa.E, uSa.E, null, hpa.Z, kpa.n, Color.WHITE);
        vE.f((ad)vE.A);
        a2.I = new kC(uSa.E, uSa.E, null, hpa.Z, WF.e.size() + NQa.Ga, Color.WHITE);
        a2.f((ad)a2.I);
        VE vE3 = a2;
        vE3.A.J(lE.THIN);
        vE3.I.J(lE.THIN);
        vE3.J(Color.WHITE);
    }
}

