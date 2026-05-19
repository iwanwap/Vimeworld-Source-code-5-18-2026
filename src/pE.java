/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  ERa
 *  Le
 *  NTa
 *  PF
 *  lqa
 *  uKa
 *  vB
 *  vRa
 */
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pE
extends vB {
    private final Consumer<Boolean> m;
    private static final rc C = Bc.w;
    private rc i;
    private final Supplier<Boolean> M;
    private final Wb k;
    private boolean j;
    private static final rc J = Bc.n;
    private rc A;
    private final Supplier<Boolean> I;

    public void l() {
        pE a2;
        if (a2.I != null) {
            pE pE2 = a2;
            pE2.f(pE2.I.get());
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_3, int var2_5) {
        c = var2_5;
        a = this;
        if (a.A != false) {
            v0 = a;
            v1 = v0;
            v0.j = v0.i.transparent(WF.J());
        } else {
            v2 = a;
            v1 = v2;
            v2.j = v2.A.transparent(WF.J());
        }
        if (v1.M == null || !a.M.get().booleanValue()) ** GOTO lbl17
        if (a.A != false) {
            v3 = a;
            a.j = pE.J.transparent(WF.J());
        } else {
            a.j = pE.C.transparent(WF.J());
lbl17:
            // 2 sources

            v3 = a;
        }
        v3.f((int)b, c);
        v4 = a;
        b = a.j != false ? v4.k.getEmojiEnabled() : v4.k.getEmojiDisabled();
        c = Le.J((PF)PF.VIME_ART, (int)ERa.C);
        uKa.B();
        uKa.K();
        c.J(b, (int)a.I, (int)a.J - vRa.d, a.j.getRGB(), (boolean)uSa.E);
    }

    public boolean l() {
        pE a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public pE(Wb wb2, Supplier<Boolean> supplier, Consumer<Boolean> consumer) {
        void b2;
        void c2;
        Object d2 = consumer;
        pE a2 = this;
        a2((Wb)c2, (Supplier<Boolean>)b2, (Consumer<Boolean>)d2, null);
    }

    /*
     * WARNING - void declaration
     */
    public pE(Wb wb2, Supplier<Boolean> supplier, Consumer<Boolean> consumer, Supplier<Boolean> supplier2) {
        void a2;
        void b2;
        void d2;
        pE c2;
        Supplier<Boolean> e2 = supplier;
        pE pE2 = c2 = this;
        pE pE3 = c2;
        super(uSa.E, uSa.E, NTa.C, lqa.s, null, null, null);
        c2.j = vRa.d;
        c2.A = Bc.Ba;
        c2.i = Bc.Ba;
        pE3.k = d2;
        pE3.I = e2;
        pE2.m = b2;
        pE2.M = a2;
        if (e2 != null) {
            c2.j = (Boolean)e2.get();
            c2.J();
        }
        if (d2 == Wb.KICK) {
            pE pE4 = c2;
            pE4.A = Bc.fa;
            pE4.i = Bc.ua;
        }
        if (d2 == Wb.LEADER) {
            pE pE5 = c2;
            pE5.A = Bc.Ia;
            pE5.i = Bc.ea;
        }
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        pE a2 = this;
        if (a2.j == b2) {
            return;
        }
        a2.j = b2;
        if (a2.m != null) {
            pE pE2 = a2;
            pE2.m.accept(pE2.j);
        }
        a2.J();
    }

    public pE(Wb wb2) {
        Object b2 = wb2;
        pE a2 = this;
        a2((Wb)((Object)b2), null, null);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        pE a2 = this;
        if (e2 != false && b2 == false) {
            pE pE2 = a2;
            pE2.f((!pE2.j ? vRa.d : uSa.E) != 0);
            if (a2.J() != null) {
                void c2;
                void d2;
                a2.J().J((int)d2, (int)c2, (int)b2, (boolean)e2);
            }
        }
    }

    private void J() {
        pE a2;
        if (a2.k != Wb.LEADER && a2.k != Wb.ADD && a2.k != Wb.MUTE) {
            a2.A = a2.j ? Bc.Ba : Bc.fa;
            a2.i = a2.j ? Bc.Ba : Bc.ua;
        }
    }

    public pE f(rc rc2) {
        Object b2 = rc2;
        pE a2 = this;
        a2.A = b2;
        return a2;
    }

    public pE J(rc rc2) {
        Object b2 = rc2;
        pE a2 = this;
        a2.i = b2;
        return a2;
    }
}

