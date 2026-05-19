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
 *  vRa
 */
import java.awt.Color;

public final class lT_3
extends vB {
    private final He A;
    private final vS I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        lT_3 a2;
        int c2 = n3;
        lT_3 lT_32 = a2 = this;
        lT_3 lT_33 = a2;
        lT_33.I = (vS)((double)((int)lT_33.I.f() + ERa.C));
        lT_32.J = (int)lT_33.I.C() + ERa.C;
        lT_32.f((int)b2, c2);
        if (lT_32.A != false) {
            if.J((double)(a2.I - Wqa.m), (double)(a2.J - Wqa.m), (double)ITa.a, (double)ITa.a, (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
        }
        lT_3 lT_34 = a2;
        lT_34.A.J((int)lT_34.I, (int)a2.J, kTa.j, kTa.j, pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        boolean bl3 = bl2;
        lT_3 a2 = this;
        if (e2 == false) {
            return;
        }
        a2.I.f(vRa.d != 0);
    }

    public lT_3(vS vS2) {
        Object b2 = vS2;
        lT_3 a2 = this;
        super((int)b2.f() + ERa.C, (int)b2.C() + ERa.C, kTa.j, kTa.j, null, null);
        a2.I = b2;
        a2.A = Sf.J((char)PRa.K);
    }
}

