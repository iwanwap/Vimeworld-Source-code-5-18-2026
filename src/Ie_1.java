/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bpa
 *  DQa
 *  ERa
 *  JPa
 *  Kd
 *  Le
 *  NTa
 *  PF
 *  QF
 *  QSa
 *  bqa
 *  if
 *  kC
 *  lPa
 *  uKa
 */
import java.awt.Color;

public final class Ie_1
extends QF {
    private final kC J;
    private final kC A;
    private final kC I;

    public Ie_1() {
        super(sOa.S, QSa.p, kTa.j, kTa.j, (Color)Bc.sb.transparent(WF.J()), null, (Color)Bc.I.transparent(WF.J()));
        Ie_1 a2;
        Ie_1 ie_1 = a2;
        a2.J = new kC(null, yOa.B, Bua.I, (Color)Bc.Ba);
        ie_1.A = new kC(null, yOa.B, BQa.l, (Color)Bc.qa);
        a2.I = new kC(null, yOa.B, QSa.z, (Color)Bc.qa);
        a2.A = Kd.S;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Ie_1 ie_1 = this;
        if (!WF.f()) {
            return;
        }
        if (!WF.l()) {
            return;
        }
        ie_1.j = Bc.sb.transparent(WF.J());
        ie_1.I = Bc.I.transparent(WF.J());
        super.J((int)b2, (int)a2);
        uKa.B();
        Le.J((PF)PF.VIME_ART, (int)ERa.C).J(bqa.f, (int)(ie_1.I + ie_1.k / KPa.y - DQa.S), (int)(ie_1.J + ie_1.j / KPa.y - lPa.K), Bc.Ba.transparent(WF.J()).getRGB(), uSa.E != 0);
        if (ie_1.A != false) {
            Ie_1 ie_12 = ie_1;
            ie_12.J.J((Color)Bc.Ba.transparent(WF.J()));
            ie_12.A.J((Color)Bc.qa.transparent(WF.J()));
            ie_12.I.J((Color)Bc.qa.transparent(WF.J()));
            int n4 = eq.m + yRa.d;
            int c2 = eq.E + yRa.d;
            int n5 = JPa.ga;
            int n6 = Bpa.Z;
            ie_12.J.C((double)(n4 + NTa.C));
            ie_12.J.l((double)(c2 + NTa.C));
            ie_12.A.C((double)(n4 + NTa.C));
            ie_12.A.l((double)(c2 + osa.c));
            ie_12.I.C((double)(n4 + NTa.C));
            ie_12.I.l((double)(c2 + osa.c + NTa.C));
            if.C((double)(n4 - yRa.d), (double)(c2 - yRa.d), (double)(n5 + uua.p), (double)(n6 + uua.p), (Color)Bc.q.transparent(WF.J() * Ora.D), (Kd)Kd.S);
            if.J((double)n4, (double)c2, (double)n5, (double)n6, (Color)Bc.Ja.transparent(WF.J()), (Color)Bc.Ga.transparent(WF.J()), (Kd)Kd.S);
            ie_12.J.J((int)b2, (int)a2);
            ie_12.A.J((int)b2, (int)a2);
            ie_12.I.J((int)b2, (int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        Ie_1 a2 = this;
        if (b2 == false && e2 != false) {
            WF.D();
        }
    }
}

