/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  F
 *  JPa
 *  Kd
 *  Le
 *  PF
 *  Qsa
 *  TQa
 *  ad
 *  hqa
 *  if
 *  vRa
 *  zsa
 */
import java.awt.Color;

public final class xe_2
extends ad
implements F {
    private rc k;
    private float j;
    private rc J;
    private final Ii A;
    private final Xe I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        xe_2 xe_22;
        rc a22;
        rc b22;
        void a22;
        void b22;
        xe_2 xe_23;
        xe_2 xe_24 = xe_23 = this;
        xe_24.f((int)b22, (int)a22);
        if (xe_24.A != false) {
            b22 = xe_23.I.d() ? Bc.Da : Bc.I;
            a22 = xe_23.I.d() ? Bc.L : Bc.sb;
            xe_22 = xe_23;
        } else {
            b22 = xe_23.I.d() ? Bc.sb : Bc.Ea;
            a22 = xe_23.I.d() ? Bc.Da : Bc.Ja;
            xe_22 = xe_23;
        }
        xe_22.j = xe_23.I.J().J();
        Object c2 = xe_23.I.d() ? zsa.v : aua.z;
        xe_2 xe_25 = xe_23;
        xe_25.k = (rc)((double)(xe_25.A.f((String)c2) + EPa.O));
        xe_25.I = (Xe)(xe_25.I.J().f() + xe_23.I.J().l() / KPa.y - xe_23.k / KPa.y);
        xe_25.J = (rc)((double)xe_25.I.f() / KPa.y + xe_23.I.J().J() / KPa.y + hqa.ha);
        if.J((double)xe_25.I, (double)xe_23.J, (double)xe_23.k, (double)xe_23.j, (Color)b22.transparent(xe_23.j), (Color)a22.transparent(xe_23.j), (Kd)Kd.S_X2);
        xe_25.A.J((String)c2, (int)(xe_23.I + xe_23.k / KPa.y - (double)xe_23.A.f((String)c2) / KPa.y), (int)(xe_23.J + xe_23.j / KPa.y - (double)xe_23.A.J(Mqa.y) / KPa.y), Bc.Ba.transparent(xe_23.j).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        boolean bl3 = bl2;
        xe_2 a2 = this;
        if (e2 == false) {
            return;
        }
        if (a2.I.d()) {
            a2.I.D();
        }
        xe_2 xe_22 = a2;
        xe_22.I.J((!xe_22.I.d() ? vRa.d : uSa.E) != 0);
    }

    public xe_2(Xe xe2) {
        xe_2 a2;
        Object b2 = xe2;
        xe_2 xe_22 = a2 = this;
        xe_2 xe_23 = a2;
        xe_23.j = JPa.N;
        xe_22.I = b2;
        xe_23.A = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        xe_22.J = Bc.Ea;
        xe_22.k = Bc.Ja;
        xe_22.k = (rc)TQa.Ja;
        xe_22.j = (float)ITa.a;
    }
}

