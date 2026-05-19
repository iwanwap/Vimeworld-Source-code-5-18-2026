/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Oqa
 *  ZE
 *  ad
 *  df
 *  gra
 *  if
 *  kC
 *  zQa
 */
import java.awt.Color;

public final class ge_1
extends jb {
    private final jb M;
    private final jb k;
    private final pE j;
    private final pE J;
    private final kC A;
    private final df I;

    public void f() {
        ge_1 a2;
        if (!WF.l()) {
            return;
        }
        ge_1 ge_12 = a2;
        ge_12.k.f().clear();
        if (ge_12.A != false) {
            ge_1 ge_13 = a2;
            a2.k.f((ad)ge_13.j);
            ge_13.k.f((ad)a2.A);
            return;
        }
        ge_1 ge_14 = a2;
        ge_14.k.f((ad)ge_14.I);
        ge_14.k.f((ad)a2.A);
    }

    @Override
    public void e() {
        ge_1 a2;
        if (a2.f()) {
            if.f((double)(a2.I + oua.i), (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(WF.J()));
        }
        if.f((double)(a2.I + oua.i), (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ea.transparent(WF.J() * ATa.r));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        ge_1 ge_12;
        int c2 = n3;
        ge_1 a2 = this;
        if (a2.A != false) {
            ge_1 ge_13 = a2;
            ge_12 = ge_13;
            ge_13.A.J((Color)Bc.Ba.transparent(WF.J()));
            ge_13.J.f(Bc.Ba);
        } else {
            ge_1 ge_14 = a2;
            ge_12 = ge_14;
            ge_14.A.J((Color)Bc.qa.transparent(WF.J()));
            ge_14.J.f(Bc.qa);
        }
        super.J((int)b2, c2);
    }

    public ge_1(String string) {
        ge_1 a2;
        Object b2 = string;
        ge_1 ge_12 = a2 = this;
        super(Oqa.COLUMN, tTa.h, yRa.d);
        ge_1 ge_13 = a2;
        ge_12.k = new jb(Oqa.COLUMN, AQa.P, uSa.E);
        ge_13.M = new jb(Oqa.COLUMN, tTa.h, uSa.E);
        ge_12.f(AQa.P);
        ge_12.J(cPa.x);
        ge_12.J(zQa.FLEX_START);
        ge_12.J(gra.SPACE_BETWEEN);
        ge_12.k.e(uSa.E);
        a2.I = new df((String)b2);
        ge_12.k.f((ad)a2.I);
        a2.A = new kC(uSa.E, uSa.E, null, yOa.B, (String)b2, Color.WHITE);
        a2.k.f((ad)a2.A);
        ge_1 ge_14 = a2;
        ge_14.M.e(uSa.E);
        ge_14.f(ge_14.k);
        ge_14.f(ge_14.M);
        ge_14.j = (pE)new pE(Wb.KICK).J(ZE.J((String)b2));
        a2.J = (pE)new pE(Wb.ADD).J(BE.J((String)b2));
        ge_1 ge_15 = a2;
        a2.M.f((ad)ge_15.J);
        ge_15.J(Color.WHITE);
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
            WF.J(a2);
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
            WF.f(a2);
        }
    }
}

