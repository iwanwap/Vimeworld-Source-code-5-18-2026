/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  Kd
 *  Kpa
 *  Oqa
 *  Qoa
 *  Qqa
 *  Sf
 *  TQa
 *  Xoa
 *  Zta
 *  aQa
 *  aSa
 *  ad
 *  cI
 *  fpa
 *  hTa
 *  if
 *  pma
 *  sMa
 *  sma
 *  vQa
 *  vRa
 *  xMa
 */
import java.awt.Color;
import java.util.Iterator;

public final class Qoa_2
extends eF {
    private vC M;
    private final pma k;
    private boolean j;
    private vC J;
    private vC A;
    private boolean I;

    public void d(boolean bl) {
        boolean b2 = bl;
        Qoa_2 a2 = this;
        if (a2.j == b2) {
            return;
        }
        a2.j = b2;
        a2.M.f(b2 ? oua.i : aSa.V, aQa.r);
    }

    public vC l() {
        Qoa_2 a2;
        return a2.J;
    }

    public Qoa_2(pma pma2) {
        Object b2;
        Object a2;
        Qoa_2 qoa_2;
        Qoa_2 qoa_22 = qoa_2 = this;
        Qoa_2 qoa_23 = qoa_2;
        super(uSa.E, uSa.E, Oqa.COLUMN, uua.p);
        qoa_2.I = uSa.E;
        Qoa_2 qoa_24 = qoa_2;
        qoa_24.A = new vC();
        qoa_2.J = new vC();
        qoa_2.M = new vC();
        qoa_2.j = uSa.E;
        qoa_2.m = vRa.d;
        qoa_2.k = (pma)FRa.S;
        qoa_2.j = hTa.fa;
        qoa_23.i = uSa.E;
        qoa_22.k = a2;
        qoa_23.g = vRa.d;
        qoa_22.F = vQa.c;
        qoa_22.k = (pma)Qqa.Ja;
        Object object = a2 = Sf.f().entrySet().iterator();
        while (object.hasNext()) {
            b2 = a2.next();
            qoa_2.f((ad)new sma((String)b2.getKey(), (String)b2.getValue()));
            object = a2;
        }
        if (Sf.k) {
            a2 = new StringBuilder();
            b2 = Sf.J().values().iterator();
            Object object2 = b2;
            while (object2.hasNext()) {
                He he = (He)b2.next();
                if (Sf.J().contains(he.J() + Mqa.y)) {
                    object2 = b2;
                    continue;
                }
                ((StringBuilder)a2).append(he.J());
                object2 = b2;
            }
            qoa_2.f((ad)new sma(TQa.b, ((StringBuilder)a2).toString()));
        }
    }

    public vC f() {
        Qoa_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xoa xoa2) {
        Qoa_2 qoa_2 = this;
        Iterator b2 = qoa_2.f.iterator();
        Object object = b2;
        while (object.hasNext()) {
            void a2;
            ad ad2 = (ad)b2.next();
            if (!(ad2 instanceof sma)) {
                object = b2;
                continue;
            }
            ((sma)ad2).J((Xoa)a2);
            object = b2;
        }
    }

    public static /* synthetic */ void J(Qoa a2) {
        if.J((double)(a2.I - Wqa.Z), (double)(a2.J - Wqa.Z), (double)(a2.k + Zta.ba), (double)rua.y, (Color)Color.WHITE, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Qoa_2 qoa_2 = this;
        boolean bl = qoa_2.A.J();
        Qoa_2 qoa_22 = qoa_2;
        qoa_2.J.J();
        qoa_22.M.J();
        super.C();
        if (!qoa_22.I) {
            return;
        }
        int c2 = new sMa(Kpa.J()).J();
        Qoa_2 qoa_23 = qoa_2;
        Qoa_2 qoa_24 = qoa_2;
        Qoa_2 qoa_25 = qoa_2;
        qoa_25.I = fpa.S;
        qoa_25.J = (vC)((double)(c2 - Jpa.Ha - kTa.j));
        if.C((double)(qoa_24.I - Wqa.Z), (double)(qoa_2.J - Wqa.Z), (double)(qoa_2.k + Zta.ba), (double)rua.y, (Color)Bc.Ja, (Color)Bc.Ga);
        cI.J((Runnable)xMa.J((Qoa)qoa_24));
        super.J((int)b2, (int)a2);
        Qoa_2 qoa_26 = qoa_2;
        if.A((double)qoa_23.A.l(), (double)qoa_26.J.l(), (double)Zta.ba, (double)Zta.ba, (Color)Bc.Ba.transparent(qoa_2.M.J()), (Kd)Kd.XS);
        if.f((double)(qoa_26.I - Wqa.Z), (double)(qoa_2.J - Wqa.Z), (double)(qoa_2.k + Zta.ba), (double)hQa.x, (Color)Bc.Ja, (Color)Bc.Ja.transparent(JPa.N));
        if.f((double)(qoa_23.I - Wqa.Z), (double)(qoa_2.J - Wqa.Z + rua.y - hQa.x), (double)(qoa_2.k + Zta.ba), (double)hQa.x, (Color)Bc.Ja.transparent(JPa.N), (Color)Bc.Ja);
        cI.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl) {
        void c2;
        void d2;
        Qoa_2 qoa_2 = this;
        if (!((double)d2 >= qoa_2.I - Wqa.Z && (double)c2 >= qoa_2.J - Wqa.Z && (double)d2 <= qoa_2.I + qoa_2.k + Zta.ba && (double)c2 <= qoa_2.J + iSa.D)) {
            return;
        }
        Iterator e2 = qoa_2.f.iterator();
        block0: while (true) {
            Iterator iterator = e2;
            while (iterator.hasNext()) {
                void a2;
                void b2;
                ad ad2 = (ad)e2.next();
                if (!(ad2 instanceof sma)) {
                    iterator = e2;
                    continue;
                }
                if (!ad2.f()) continue block0;
                ((sma)ad2).J((int)d2, (int)c2, (int)b2, (boolean)a2);
                continue block0;
            }
            break;
        }
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        Qoa_2 a2 = this;
        a2.I = b2;
    }

    public boolean C() {
        Qoa_2 a2;
        return a2.I;
    }
}

