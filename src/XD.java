/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  NTa
 *  Qqa
 *  Qsa
 *  SOa
 *  kC
 *  kD
 *  lE
 *  vB
 *  wra
 */
import java.awt.Color;

public final class XD
extends vB {
    private final kD A;
    private final kC I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        boolean bl2 = bl;
        XD a2 = this;
        if (a2.A.f()) {
            void e2;
            void b2;
            void c2;
            void d2;
            a2.A.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
    }

    public XD(Xe xe) {
        XD a2;
        Object b2 = xe;
        XD xD = a2 = this;
        super(uSa.E, uSa.E, Qqa.h, wra.P, (Color)Bc.Pa.transparent(JPa.N), null);
        xD.I = new kC(uSa.E, uSa.E, null, NTa.B);
        a2.I.J(lE.BOLD);
        xD.I.f(Qsa.Ha);
        xD.A = new kD((Xe)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        XD a2;
        int c2 = n3;
        XD xD = a2 = this;
        super.J((int)b2, c2);
        XD xD2 = a2;
        xD.I.C((double)xD2.I);
        xD2.I.l(a2.J + a2.j / KPa.y - a2.I.J() / KPa.y);
        xD.I.J((int)b2, c2);
        xD.A.C((double)(a2.I + a2.k - a2.A.l() - SOa.w));
        xD.A.l(a2.J + a2.j / KPa.y - a2.A.J() / KPa.y);
        xD.A.J((int)b2, c2);
    }
}

