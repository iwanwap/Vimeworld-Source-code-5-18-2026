/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Ju
 *  Ke
 *  Oqa
 *  QF
 *  Zta
 *  ad
 *  eC
 *  eS
 *  iS
 *  if
 *  rR
 *  tS
 *  vRa
 *  wOa
 *  yt
 *  zU
 *  zs
 */
import java.awt.Color;
import net.xtrafrancyz.mods.minidot.items.impl.BedrockModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nu
extends QF {
    private final eF k;
    private final rR j;
    private final boolean J;
    private final vS I;

    public void C() {
        nu a2;
        a2.J();
    }

    public void l() {
        nu nu2 = this;
        if (nu2.I.J().type == eS.PET) {
            for (Object e2 : nu2.k.f()) {
                if (!(e2 instanceof Ju)) continue;
                ((Ju)e2).e();
                return;
            }
        }
    }

    public boolean C() {
        nu a2;
        if (zU.E && a2.I.J().model instanceof BedrockModel && ((BedrockModel)a2.I.J().model).f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ vS J(nu a2) {
        return a2.I;
    }

    public static /* synthetic */ double f(nu a2) {
        return (double)a2.J;
    }

    public static /* synthetic */ double J(nu a2) {
        return (double)a2.I;
    }

    public static /* synthetic */ boolean J(nu a2) {
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public nu(vS vS2, Ke ke) {
        void b2;
        nu c2 = ke;
        nu a2 = this;
        a2((vS)b2, (Ke)c2, uSa.E != 0);
    }

    public boolean l() {
        nu a2;
        if (a2.J) {
            return a2.C();
        }
        return a2.I.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        nu a2 = this;
        if (a2.j.f()) {
            a2.j.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        if (a2.k.f() && (a2.J || zU.M.J(iS.MINIDOT_GUI).J(a2.I.J()))) {
            a2.k.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        nu a2;
        int c2 = n3;
        nu nu2 = a2 = this;
        nu nu3 = a2;
        nu nu4 = a2;
        nu4.I = (vS)nu4.I.f();
        nu4.J = nu4.I.C();
        nu4.k = (eF)nu4.I.l();
        nu3.j = (rR)nu3.I.J();
        super.J((int)b2, c2);
        nu nu5 = a2;
        nu2.k.C((double)(nu5.I + Wqa.Z));
        nu5.k.l(a2.J + mPa.s);
        nu2.k.J((double)(a2.k - Zta.ba));
        nu2.k.f((double)(a2.j - mPa.s - Wqa.Z));
        nu2.k.J((int)b2, c2);
        if (!nu2.J && !zU.M.J(iS.MINIDOT_GUI).J(a2.I.J())) {
            if.f((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.c.transparent(wOa.w));
        }
        nu nu6 = a2;
        nu6.j.J((int)b2, c2);
        nu6.l();
    }

    private void J() {
        nu nu2;
        nu nu3 = nu2 = this;
        nu3.k.f().clear();
        if (nu3.J) {
            if (nu2.C()) {
                nu2.k.f((ad)new tS(nu2));
            }
            return;
        }
        if (nu2.I.J().J()) {
            zs a2 = nu2.I.J().J();
            if (a2 != null && a2.J().size() > vRa.d) {
                nu2.k.f(new JT(nu2));
            }
            if (nu2.I.J().type == eS.PET) {
                nu2.k.f((ad)new Ju(nu2));
            }
            for (eC eC2 : nu2.I.J().J().values()) {
                if (!(eC2 instanceof lu)) continue;
                nu2.k.f((ad)new yt(nu2, (lu)eC2));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public nu(vS vS2, Ke ke, boolean bl) {
        void a2;
        void b2;
        QF d2 = vS2;
        nu c2 = this;
        QF qF2 = d2;
        nu nu2 = c2;
        nu nu3 = c2;
        super((int)d2.f(), (int)d2.C(), (int)d2.l(), (int)d2.J(), d2.J(), (Ke)b2, d2.f());
        nu nu4 = c2;
        nu3.j = new rR(c2);
        nu3.k = new eF(Oqa.ROW, hpa.Z, vRa.d != 0);
        nu3.I = d2;
        nu2.J = a2;
        nu2.I = (vS)d2.f();
        c2.J = qF2.C();
        c2.k = (eF)qF2.l();
        c2.j = (rR)d2.J();
        c2.J();
    }
}

