/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  ERa
 *  Kd
 *  Le
 *  PF
 *  dpa
 *  if
 *  vB
 *  vRa
 */
import java.awt.Color;

public final class rT_3
extends vB {
    private final vS I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        boolean bl3 = bl2;
        rT_3 a2 = this;
        if (e2 == false) {
            return;
        }
        a2.I.l(vRa.d != 0);
    }

    public rT_3(vS vS2) {
        Object b2 = vS2;
        rT_3 a2 = this;
        super((int)b2.f() + Upa.D, (int)b2.C() + ERa.C, kTa.j, kTa.j, null, null);
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        int c22 = n2;
        rT_3 b2 = this;
        b2.I = (vS)((double)((int)b2.I.f() + (b2.I.C() ? Upa.D : ERa.C)));
        rT_3 rT_32 = b2;
        rT_32.J = (int)b2.I.C() + ERa.C;
        rT_32.f(c22, (int)a2);
        if (rT_32.A) {
            if.J((double)(b2.I - Wqa.m), (double)(b2.J - Wqa.m), (double)ITa.a, (double)ITa.a, (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
        }
        Ii c22 = Le.J((PF)PF.VIME_ART, (int)kTa.j);
        c22.J(dpa.ga, (int)(b2.I + b2.k / KPa.y - (double)(c22.f(dpa.ga) / uqa.g)), (int)(b2.J + b2.j / KPa.y - (double)(c22.J(dpa.ga) / uqa.g)), Bc.H.getRGB(), uSa.E != 0);
    }
}

