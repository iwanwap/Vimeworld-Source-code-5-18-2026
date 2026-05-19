/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  KA
 *  Kpa
 *  SE
 *  YSa
 *  cI
 *  dD
 *  uf
 *  vB
 *  vRa
 *  ysa
 */
import java.awt.Color;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

public final class SE_1
extends vB {
    private final uf J;
    private final MiniDotEmote A;
    private final Xe I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        SE_1 a2;
        int c2 = n3;
        SE_1 sE_1 = a2 = this;
        sE_1.f((int)b2, c2);
        SE_1 sE_12 = a2;
        KA.J((int)((int)sE_1.I), (int)((int)a2.J), (int)((int)(sE_12.I + a2.k)), (int)((int)(a2.J + a2.j)), (int)a2.j.getRGB());
        cI.J((Runnable)dD.J((SE)sE_12));
        if (sE_1.J.J() != a2.A) {
            SE_1 sE_13 = a2;
            sE_13.J.J(sE_13.A, null);
        }
        a2.J.J(JPa.N, JPa.N, (double)(a2.I + a2.k / KPa.y), (double)(a2.J + a2.j - YSa.D), JPa.N, JPa.N, ysa.s, JPa.N, uSa.E != 0);
        cI.J();
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void a2;
        Object c2 = n2;
        SE_1 b2 = this;
        int n4 = b2.I.J().J().f() && (double)c2 >= b2.I && (double)a2 >= b2.J && (double)c2 <= b2.I + b2.k && (double)a2 <= b2.J + b2.j ? vRa.d : uSa.E;
        c2 = b2.A;
        b2.A = (MiniDotEmote)n4;
        if (n4 != c2) {
            b2.f();
        }
    }

    public void f() {
        SE_1 a2;
        SE_1 sE_1 = a2;
        sE_1.J(sE_1.A != false ? Bc.Ja : Bc.Ea);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        SE_1 a2 = this;
        if (e2 == false) {
            return;
        }
        if (a2.A == false) {
            return;
        }
        if (!a2.I.d()) {
            return;
        }
        if (a2.I.l().l()) {
            return;
        }
        if (a2.I.J().J() == null) {
            return;
        }
        a2.I.J().J().f(a2.A);
    }

    public static /* synthetic */ void J(SE a2) {
        KA.J((int)((int)a2.I), (int)((int)a2.J), (int)((int)(a2.I + a2.k)), (int)((int)(a2.J + a2.j)), (int)a2.j.getRGB());
    }

    /*
     * WARNING - void declaration
     */
    public SE_1(MiniDotEmote miniDotEmote, Xe xe) {
        void b2;
        SE_1 a2;
        Object c2 = xe;
        SE_1 sE_1 = a2 = this;
        super(uSa.E, uSa.E, ppa.f, ppa.f, (Color)Bc.Ea, null);
        sE_1.A = b2;
        sE_1.I = c2;
        SE_1 sE_12 = a2;
        sE_1.J = new uf((Sx)Kpa.J().c);
    }
}

