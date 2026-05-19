/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KF
 *  Kd
 *  Le
 *  PF
 *  QF
 *  if
 *  vRa
 *  wOa
 */
import java.awt.Color;
import java.util.function.Consumer;

public final class Pe_3
extends QF {
    private final KF k;
    private final Fg j;
    private final String J;
    private final Consumer<KF> A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Pe_3(Fg fg2, KF kF2, String string, Consumer<KF> consumer) {
        void a2;
        void b2;
        void d2;
        Pe_3 c2;
        Pe_3 e2 = kF2;
        Pe_3 pe_3 = c2 = this;
        Pe_3 pe_32 = c2;
        super(uSa.E, uSa.E, uSa.E, wOa.t, (Color)d2.getBackground().transparent(e2.f().J()), null, (Color)d2.getBorder().transparent(e2.f().J()));
        c2.I = uSa.E;
        pe_32.k = e2;
        pe_32.J = b2;
        pe_3.j = d2;
        pe_3.A = a2;
        pe_3.A = Kd.S;
    }

    public int J() {
        Pe_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        Pe_3 pe_3;
        rc rc2;
        Pe_3 pe_32;
        rc rc3;
        void a2;
        Pe_3 b2;
        int c22 = n2;
        Pe_3 pe_33 = b2 = this;
        super.f(c22, (int)a2);
        if (pe_33.A != false) {
            rc3 = b2.j.getBackgroundHover();
            pe_32 = b2;
        } else {
            rc3 = b2.j.getBackground();
            pe_32 = b2;
        }
        pe_33.j = rc3.transparent(pe_32.k.f().J());
        if (b2.A != false) {
            rc2 = b2.j.getBorderHover();
            pe_3 = b2;
        } else {
            rc2 = b2.j.getBorder();
            pe_3 = b2;
        }
        b2.I = (int)rc2.transparent(pe_3.k.f().J());
        if (b2.I == vRa.d) {
            Pe_3 pe_34 = b2;
            if.C((double)b2.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)((Object)pe_34.j), (Color)pe_34.I, b2.A);
        } else if (b2.I == uqa.g) {
            Pe_3 pe_35 = b2;
            if.f((double)b2.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)((Object)pe_35.j), (Color)pe_35.I, b2.A);
        } else if (b2.I == yRa.d) {
            Pe_3 pe_36 = b2;
            if.l((double)b2.I, (double)b2.J, (double)b2.k, (double)b2.j, (Color)((Object)pe_36.j), (Color)pe_36.I, b2.A);
        } else {
            Pe_3 pe_37 = b2;
            if.J((double)b2.I, (double)b2.J, (double)b2.k, (double)b2.j, (double)oua.i, (Color)((Object)pe_37.j), (Color)pe_37.I);
        }
        Ii c22 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        Pe_3 pe_38 = b2;
        Pe_3 pe_39 = b2;
        c22.J(pe_38.J, pe_38.I + (b2.k - (double)c22.f(b2.J)) / KPa.y, (int)(b2.J + (b2.j - (double)c22.J(b2.J)) / KPa.y - oua.i), (b2.A != false ? pe_39.j.getForegroundHover() : pe_39.j.getForeground()).getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        Pe_3 a2 = this;
        if (b2 != false || e2 != false || a2.A == null) {
            return;
        }
        Pe_3 pe_3 = a2;
        pe_3.A.accept(pe_3.k);
    }

    public void J(int n2) {
        int b2 = n2;
        Pe_3 a2 = this;
        a2.I = b2;
    }
}

