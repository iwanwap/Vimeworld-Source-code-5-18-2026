/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  F
 *  ISa
 *  Ke
 *  Le
 *  PF
 *  QF
 *  QSa
 *  Qsa
 *  TU
 *  uKa
 *  vRa
 *  wra
 *  ysa
 */
import java.awt.Color;

public class KS_3
extends QF
implements F {
    private static final Color i = new Color(ISa.E, iSa.x, QSa.p);
    private final TU M;
    private static final Color k;
    private final int J = 20;
    private static final Color A;
    public char I;

    /*
     * WARNING - void declaration
     */
    public KS_3(Ke ke2, TU tU2) {
        void b2;
        KS_3 c2 = tU2;
        KS_3 a2 = this;
        super(uSa.E, uSa.E, QSa.p, wra.P, null, (Ke)b2, c2 != null && c2.isNew() ? k : null);
        KS_3 kS_3 = a2;
        a2.J = kTa.j;
        kS_3.M = c2;
        kS_3.I = (char)(c2 == null ? fPa.i : (int)c2.getSymbol());
    }

    public void f() {
        KS_3 a2;
        if (a2.f()) {
            a2.j = i;
            a2.I = (char)(a2.M != null && a2.M.isNew() ? k : A);
            return;
        }
        a2.j = null;
        a2.I = (char)(a2.M != null && a2.M.isNew() ? k : null);
    }

    public TU J() {
        KS_3 a2;
        return a2.M;
    }

    static {
        A = new Color(cPa.Q, Psa.M, ysa.s);
        k = new Color(osa.Ja, Tqa.K, ysa.s);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        KS_3 a2 = this;
        a2.f((int)b2, c2);
        if (mx.J().J() != a2.M) {
            super.J((int)b2, c2);
        }
        KS_3 kS_3 = a2;
        int n4 = kS_3.I + a2.k / KPa.y - Wqa.m;
        int n5 = kS_3.J + a2.j / KPa.y - Wqa.m;
        uKa.K();
        Le.J((PF)PF.VIME_ART, (int)Qsa.Ha).J(a2.I + Mqa.y, n4, (int)n5 - vRa.d, Bc.Ba.getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        boolean bl3 = bl2;
        KS_3 a2 = this;
        if (a2.A == false) {
            return;
        }
        if (e2 == false) {
            return;
        }
        ((mx)a2.I).J(a2.M);
    }
}

