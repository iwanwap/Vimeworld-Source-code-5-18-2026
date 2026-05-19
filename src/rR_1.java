/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  ERa
 *  Kd
 *  Sf
 *  if
 *  pua
 *  vB
 */
import java.awt.Color;

public final class rR_1
extends vB {
    private final He A;
    private final nu I;

    public rR_1(nu nu2) {
        Object b2 = nu2;
        rR_1 a2 = this;
        super((int)nu.J((nu)((Object)b2)) + ERa.C, (int)nu.f((nu)((Object)b2)) + ERa.C, kTa.j, kTa.j, null, null);
        a2.I = b2;
        a2.A = Sf.J((char)kra.Da);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        rR_1 a2;
        int c2 = n3;
        rR_1 rR_12 = a2 = this;
        rR_1 rR_13 = a2;
        rR_13.I = (nu)((double)((int)rR_13.I.f() + ERa.C));
        rR_12.J = (int)rR_13.I.C() + ERa.C;
        rR_12.f((int)b2, c2);
        if (rR_12.A != false) {
            if.J((double)(a2.I - Wqa.m), (double)(a2.J - Wqa.m), (double)ITa.a, (double)ITa.a, (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
        }
        rR_1 rR_14 = a2;
        rR_14.A.J((int)rR_14.I, (int)a2.J, kTa.j, kTa.j, pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        rR_1 a2 = this;
        if (e2 == false) {
            return;
        }
        if (nu.J(a2.I)) {
            nu.J(a2.I).l(uSa.E != 0);
            return;
        }
        nu.J(a2.I).f(uSa.E != 0);
    }
}

