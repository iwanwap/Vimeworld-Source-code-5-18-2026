/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  Kpa
 *  NTa
 *  QF
 *  Sf
 *  Xoa
 *  bpa
 *  hTa
 *  if
 *  pua
 *  sMa
 *  uRa
 *  vRa
 */
import java.awt.Color;

public final class iNa
extends QF {
    private boolean I = uSa.E;

    public boolean l() {
        iNa a2;
        return a2.I;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        iNa a2 = this;
        if (a2.I == b2) {
            return;
        }
        a2.I = b2;
        Xoa.j.C(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        iNa iNa2;
        void a2;
        iNa b2;
        int c22 = n2;
        iNa iNa3 = b2 = this;
        b2.I = uRa.I;
        iNa iNa4 = b2;
        iNa3.J = new sMa(Kpa.J()).J() - yRa.d - yOa.B;
        iNa3.f(c22, (int)a2);
        if (iNa3.A) {
            iNa iNa5 = b2;
            iNa5.J(iNa5.I ? Bc.Da : Bc.Ea.transparent(bpa.K));
            iNa2 = b2;
        } else {
            iNa iNa6 = b2;
            iNa6.J(iNa6.I ? Bc.sb : null);
            iNa2 = b2;
        }
        if (iNa2.j != null) {
            if.f((double)b2.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)b2.j);
        }
        if.f((double)(b2.I + b2.k), (double)b2.J, (double)oua.i, (double)DPa.Aa, (Color)Bc.Ea.transparent(bpa.K));
        He c22 = Sf.J((char)hTa.ga);
        if (c22 == null) {
            return;
        }
        c22.J(b2.I + b2.k / KPa.y - DQa.S, (int)(b2.J + b2.j / KPa.y - DQa.S), NTa.C, NTa.C, pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        iNa a2 = this;
        if (e2 == false) {
            return;
        }
        if (b2 != false) {
            return;
        }
        iNa iNa2 = a2;
        iNa2.f((!iNa2.l() ? vRa.d : uSa.E) != 0);
    }

    public iNa() {
        super(uSa.E, uSa.E, kTa.j, yOa.B, null, null, null);
        iNa a2;
    }
}

