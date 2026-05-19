/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  CU
 *  Kd
 *  Ke
 *  Le
 *  NTa
 *  Oqa
 *  PF
 *  Ppa
 *  QF
 *  Qsa
 *  SQa
 *  WQa
 *  aSa
 *  ad
 *  asa
 *  bT
 *  iPa
 *  if
 *  nt
 *  pua
 *  uKa
 *  vRa
 *  wra
 *  ws
 */
import java.awt.Color;

public final class gU
extends eF {
    private boolean C;
    private vC M;
    private vC k;
    private final QF j;
    private final ws J;
    private final QF A;
    private final mx I;

    /*
     * WARNING - void declaration
     */
    public gU(mx mx2, ws ws2) {
        void a2;
        gU b2;
        Object c2 = mx2;
        gU gU2 = b2 = this;
        gU gU3 = b2;
        super(Oqa.COLUMN, uSa.E, uSa.E != 0);
        gU gU4 = b2;
        b2.M = new vC();
        gU4.k = new vC();
        b2.C = vRa.d;
        gU3.J = a2;
        gU2.I = c2;
        gU3.j = new QF(uSa.E, uSa.E, iPa.ca, wra.P, (Color)Bc.Ja, (Ke)c2, (Color)Bc.Ga);
        gU2.A = new QF(uSa.E, uSa.E, SQa.i, wra.P, (Color)Bc.Ja, (Ke)c2, (Color)Bc.Ga);
        gU2.j.J(uSa.E != 0);
        gU2.A.J(uSa.E != 0);
        gU2.k.e(PQa.C);
        b2.k.J(PQa.C);
        b2.k.C(PQa.C);
        gU gU5 = b2;
        QF qF2 = gU5.j;
        qF2.getClass();
        b2.j.J(Xu.J(qF2));
        gU5.j.J(bT.J((gU)b2));
        gU gU6 = b2;
        QF qF3 = gU6.A;
        qF3.getClass();
        b2.A.J(Pu.J(qF3));
        gU6.A.J(nt.J((gU)b2));
        gU gU7 = b2;
        gU7.f((ad)gU7.j);
        gU7.f((ad)gU7.A);
    }

    public boolean C() {
        gU a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(gU gU2, int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        gU a2 = gU2;
        if (e2 != false && a2.M.f()) {
            a2.C(uSa.E != 0);
        }
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        gU a2 = this;
        if (a2.C == b2) {
            return;
        }
        a2.I.J().f().removeIf(CU.J());
        a2.C = b2;
        QF qF2 = b2 ? a2.j : a2.A;
        gU gU2 = a2;
        QF qF3 = b2 ? gU2.A : gU2.j;
        mx.J().l(mx.J().J());
        gU gU3 = a2;
        gU3.I.f().J().J(aSa.V, aSa.V);
        gU gU4 = a2;
        gU3.I.f().J().e(a2.I.f().f());
        a2.I.f().J().J((double)gU4.I.f().f());
        gU4.M.J(b2 ? aSa.V : qF3.l(), tpa.k);
        a2.k.J(qF2.l(), tpa.k);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void a2;
        int c22 = n2;
        gU b2 = this;
        b2.M.J();
        b2.k.J();
        gU gU2 = b2;
        if.J((double)gU2.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
        super.J(c22, (int)a2);
        if.J((double)(gU2.I + b2.M.l()), (double)b2.J, (double)b2.k.l(), (double)b2.j, (Color)Bc.sb, (Color)Bc.Da, (Kd)Kd.S_X2);
        Ii c22 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        uKa.K();
        Ii ii2 = c22;
        ii2.J(WQa.v, (int)(b2.j.f() + b2.j.l() / KPa.y - (double)(c22.f(asa.J) / uqa.g)) - NTa.C, (int)(b2.j.C() + b2.j.J() / KPa.y - (double)(c22.J(asa.J) / uqa.g) - oua.i), pua.o, uSa.E != 0);
        ii2.J(Ppa.e, (int)(b2.A.f() + b2.A.l() / KPa.y - (double)(c22.f(Ppa.e) / uqa.g)), (int)(b2.A.C() + b2.A.J() / KPa.y - (double)(c22.J(Ppa.e) / uqa.g) - oua.i), pua.o, uSa.E != 0);
        uKa.c();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(gU gU2, int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        gU a2 = gU2;
        if (e2 != false && a2.M.f()) {
            a2.C(vRa.d != 0);
        }
    }

    public static /* synthetic */ boolean J(ad a2) {
        return a2 instanceof vS;
    }
}

