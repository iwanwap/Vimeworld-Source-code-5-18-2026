/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  Ke
 *  Le
 *  PF
 *  QF
 *  Qsa
 *  WSa
 *  bSa
 *  pua
 *  uKa
 *  vQa
 *  zU
 */
import java.awt.Color;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;

public final class DT
extends QF {
    private static final MDConfiguration A = ConfigurationService.J(MDConfiguration.class);
    private final XR I;

    public void f() {
        DT a2;
        if (a2.f()) {
            DT dT2 = a2;
            dT2.j = Bc.Ja;
            dT2.I = Bc.Ga;
            return;
        }
        DT dT3 = a2;
        dT3.j = Bc.Ea;
        dT3.I = Bc.Ja;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        DT b2;
        int c22 = n2;
        DT dT2 = b2 = this;
        b2.I = (XR)(b2.I.f() + b2.I.l() - b2.k);
        dT2.J = dT2.I.C() + b2.I.J() - b2.j - KPa.y;
        super.J(c22, (int)a2);
        Ii c22 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        uKa.K();
        Ii ii = c22;
        ii.J(rQa.C, (int)(b2.I + b2.k / KPa.y - Wqa.m), (int)(b2.J + Wqa.m), pua.o, uSa.E != 0);
        ii.J(WSa.I, (int)(b2.I + b2.k / KPa.y - (double)(c22.f(WSa.I) / uqa.g)), (int)(b2.J + Wqa.m + DQa.S + vQa.c), pua.o, uSa.E != 0);
        ii.J(Asa.K, (int)(b2.I + b2.k / KPa.y - (double)(c22.f(Asa.K) / uqa.g)), (int)(b2.J + Wqa.m + DQa.S + vQa.c + (double)c22.J(WSa.I)), pua.o, uSa.E != 0);
        uKa.c();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        DT a2 = this;
        if (e2 == false) {
            return;
        }
        A.J().J().clear();
        zU.M.J().J();
        zU.M.J().f();
    }

    /*
     * WARNING - void declaration
     */
    public DT(XR xR, Ke ke) {
        void b2;
        DT c2 = ke;
        DT a2 = this;
        super(uSa.E, uSa.E, Fua.J, bSa.Da, (Color)Bc.Ea, (Ke)c2, (Color)Bc.Ja);
        a2.I = b2;
    }
}

