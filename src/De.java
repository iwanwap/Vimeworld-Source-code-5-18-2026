/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Oqa
 *  Rua
 *  ad
 *  gra
 *  if
 *  kC
 *  kpa
 *  lE
 */
import java.awt.Color;

public final class De
extends jb {
    private final kC A;
    private final kC I;

    public De() {
        De a2;
        De de2 = a2;
        super(Oqa.COLUMN, tTa.h, yRa.d);
        de2.J(gra.SPACE_BETWEEN);
        de2.J(cPa.x);
        de2.f(uqa.g);
        de2.i(uqa.g);
        De de3 = a2;
        de2.I = new kC(uSa.E, uSa.E, null, hpa.Z, kpa.n, Color.WHITE);
        de2.f((ad)de2.I);
        a2.A = new kC(uSa.E, uSa.E, null, hpa.Z, WF.e.size() + Rua.Z + WF.J(), Color.WHITE);
        a2.f((ad)a2.A);
        De de4 = a2;
        de4.I.J(lE.THIN);
        de4.A.J(lE.THIN);
        de4.J(Color.WHITE);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        De a2;
        int c2 = n3;
        De de2 = a2 = this;
        a2.I.J((Color)Bc.E.transparent(WF.J()));
        de2.A.J((Color)Bc.E.transparent(WF.J()));
        de2.A.J(WF.e.size() + Rua.Z + WF.J());
        super.J((int)b2, c2);
    }

    @Override
    public void e() {
        De a2;
        De de2 = a2;
        if.f((double)(a2.I + oua.i), (double)de2.J, (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
        if.f((double)(de2.I + oua.i), (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
    }
}

