/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  HE
 *  cD
 *  if
 *  vB
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gf_3
extends vB {
    private final HE J;
    private final cD A;
    public final /* synthetic */ cD I;

    /*
     * WARNING - void declaration
     */
    public Gf_3(cD cD2, cD cD3, HE hE2) {
        void b2;
        void c2;
        Gf_3 a2;
        Gf_3 d2 = hE2;
        Gf_3 gf_3 = a2 = this;
        a2.I = c2;
        super(uSa.E, uSa.E, Upa.D, kTa.j, null, null);
        gf_3.J = d2;
        gf_3.A = b2;
    }

    public cD J() {
        Gf_3 a2;
        return a2.A;
    }

    public HE J() {
        Gf_3 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        Gf_3 a2 = this;
        if (b2 == false && e2 != false && WF.l() && WF.J() != a2.J) {
            WF.J(a2.J);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Gf_3 a2 = this;
        if (a2.A != false && WF.l()) {
            if.C((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ga.transparent(WF.J() * a2.A.J()), (Color)Bc.Za.transparent(WF.J() * a2.A.J()));
        }
        super.J((int)b2, c2);
    }
}

