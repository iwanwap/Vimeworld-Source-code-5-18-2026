/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  EF
 *  IF
 *  OD
 *  Oqa
 *  aSa
 *  ad
 *  df
 *  gra
 *  if
 *  kC
 *  nD
 *  vRa
 *  wD
 *  zQa
 */
import java.awt.Color;

public final class RF
extends jb {
    private final jb F;
    private String g;
    private final EF L;
    private final kC E;
    private double m;
    private final pE C;
    private final df i;
    private double M;
    private final pE k;
    private boolean j;
    private final jb A;
    private final pE I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        RF a2;
        int c2 = n3;
        RF rF = a2 = this;
        rF.E.J((Color)Bc.Ba.transparent(WF.J()));
        super.J((int)b2, c2);
    }

    public void e(double a2) {
        RF b2;
        if (a2 > aSa.V) {
            b2.J(uSa.E != 0);
        }
        b2.M = a2;
        OT.i.B.J(b2.g, (float)a2);
        b2.I.f((!(a2 <= aSa.V) ? vRa.d : uSa.E) != 0);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        RF a2 = this;
        if (a2.j == b2) {
            return;
        }
        if (b2) {
            a2.m = a2.M;
        }
        a2.e((a2.j = b2) ? aSa.V : a2.m);
        RF rF = a2;
        rF.L.d(rF.M);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(String string, int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        String a2 = string;
        if (e2 != false && b2 == false) {
            WF.d(a2);
        }
    }

    public RF(String string) {
        RF a2;
        Object b2 = string;
        RF rF = a2 = this;
        super(Oqa.COLUMN, tTa.h, yRa.d);
        a2.m = oua.i;
        a2.j = uSa.E;
        a2.M = oua.i;
        RF rF2 = a2;
        a2.F = new jb(Oqa.COLUMN, AQa.P, uSa.E);
        a2.A = new jb(Oqa.COLUMN, tTa.h, uSa.E);
        rF.g = b2;
        a2.f(AQa.P);
        rF.J(cPa.x);
        rF.J(zQa.FLEX_START);
        rF.J(gra.SPACE_BETWEEN);
        wD wD2 = OT.i.B.playerSettingsMap.get(b2);
        if (wD2 != null) {
            RF rF3;
            a2.M = wD2.I;
            a2.j = rF3.M <= aSa.V ? vRa.d : uSa.E;
        }
        a2.i = new df((String)b2);
        a2.F.f((ad)a2.i);
        RF rF4 = a2;
        rF4.F.e(uSa.E);
        a2.E = new kC(uSa.E, uSa.E, null, yOa.B, (String)b2, Color.WHITE);
        rF4.F.f((ad)a2.E);
        a2.I = new pE(Wb.MUTE);
        a2.A.f((ad)a2.I);
        RF rF5 = a2;
        a2.I.J(IF.J((RF)a2));
        RF rF6 = a2;
        rF6.A.e(uSa.E);
        rF6.f(rF6.F);
        RF rF7 = a2;
        rF6.L = new EF(rF7, ZD.J(rF7), null, Ira.d);
        rF5.f(rF5.A);
        rF5.C = (pE)new pE(Wb.KICK).J(OD.J((String)b2));
        a2.k = (pE)new pE(Wb.LEADER).J(nD.J((String)b2));
        a2.J(Color.WHITE);
    }

    @Override
    public void e() {
        RF rF;
        RF a2;
        if (a2.j || a2.M <= aSa.V) {
            RF rF2 = a2;
            rF = rF2;
            rF2.E.J((Color)Bc.qa.transparent(WF.J()));
            rF2.I.f(Bc.qa.transparent(WF.J()));
            a2.I.J(Bc.W.transparent(WF.J()));
        } else {
            RF rF3 = a2;
            rF = rF3;
            rF3.E.J((Color)Bc.Ba.transparent(WF.J()));
            rF3.I.f(Bc.Ba.transparent(WF.J()));
            a2.I.J(Bc.Ba.transparent(WF.J()));
        }
        if (rF.f()) {
            if.f((double)(a2.I + oua.i), (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(WF.J()));
        }
        if.f((double)(a2.I + oua.i), (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
    }

    public void f() {
        RF rF = this;
        if (EF.J() == rF.L && rF.A == false) {
            return;
        }
        RF rF2 = rF;
        rF2.F.f().clear();
        boolean bl = WF.L.containsKey(rF.g);
        boolean a2 = WF.l();
        if (rF2.A != false && (bl || a2)) {
            if (a2) {
                RF rF3 = rF;
                rF.F.f((ad)rF3.C);
                rF3.F.f((ad)rF.k);
            }
            if (bl) {
                RF rF4 = rF;
                rF4.F.f((ad)rF4.L);
                return;
            }
        } else {
            RF rF5 = rF;
            rF5.F.f((ad)rF5.i);
            rF5.F.f((ad)rF.E);
        }
    }

    public double d() {
        RF a2;
        return a2.M;
    }

    public static /* synthetic */ Float J(RF a2) {
        return Float.valueOf((float)a2.M);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(RF rF, int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        RF a2 = rF;
        if (b2 == false && e2 != false) {
            RF rF2 = a2;
            rF2.J((!rF2.I.l() ? vRa.d : uSa.E) != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(String string, int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        String a2 = string;
        if (e2 != false && b2 == false) {
            WF.C(a2);
        }
    }
}

