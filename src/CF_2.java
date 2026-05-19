/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Dg
 *  Dpa
 *  Je
 *  Kpa
 *  Oqa
 *  ad
 *  bc
 *  dE
 *  df
 *  gra
 *  if
 *  kC
 *  vRa
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public final class CF_2
extends jb {
    private final jb i;
    private final jb M;
    private final jb k;
    private final kC j;
    private final jb J;
    private final jb A;
    private final Map<bc, tD> I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        CF_2 cF_2;
        int c2 = n3;
        CF_2 a2 = this;
        a2.f().clear();
        if (WF.l()) {
            CF_2 cF_22 = a2;
            cF_22.M.f().clear();
            cF_22.M.f((ad)a2.I.get(bc.PARTY));
            CF_2 cF_23 = a2;
            cF_23.M.f((ad)cF_23.I.get(bc.REQUESTS));
            cF_2 = a2;
        } else {
            CF_2 cF_24 = a2;
            cF_24.M.f().clear();
            cF_24.M.f((ad)a2.I.get(bc.PARTY));
            cF_2 = a2;
        }
        cF_2.f(a2.i);
        CF_2 cF_25 = a2;
        cF_25.f(a2.J);
        cF_25.j.J((Color)Bc.Ba.transparent(WF.J()));
        super.J((int)b2, c2);
    }

    public static /* synthetic */ Boolean l() {
        return OT.i.B.microEnabled;
    }

    public static /* synthetic */ void J(pE[] pEArray, Boolean bl) {
        Boolean b2 = bl;
        pE[] a2 = pEArray;
        OT.i.B.J(b2);
        a2[uSa.E].l();
    }

    public static /* synthetic */ Boolean f() {
        return OT.i.B.soundEnabled;
    }

    public static /* synthetic */ Boolean J() {
        if (!OT.i.B.voiceChatKeyBindToggle || !OT.i.B.microEnabled) {
            return uSa.E != 0;
        }
        return (!Dpa.l() ? vRa.d : uSa.E) != 0;
    }

    public CF_2() {
        int a22;
        CF_2 cF_2;
        CF_2 cF_22 = cF_2 = this;
        super(Oqa.ROW, uSa.E, uua.p);
        CF_2 cF_23 = cF_2;
        cF_22.i = new jb(Oqa.COLUMN, uSa.E, uSa.E);
        cF_23.M = new jb(Oqa.COLUMN, vRa.d, uSa.E);
        cF_22.J = new jb(Oqa.COLUMN, tTa.h, uSa.E);
        cF_22.k = new jb(Oqa.COLUMN, AQa.P, uSa.E);
        cF_22.A = new jb(Oqa.COLUMN, tTa.h, uSa.E);
        cF_22.I = new HashMap<bc, tD>();
        cF_22.e(tTa.h);
        cF_22.i(yRa.d);
        tD tD2 = null;
        Object[] objectArray = bc.values();
        int n2 = objectArray.length;
        int n3 = a22 = uSa.E;
        while (n3 < n2) {
            CF_2 cF_24;
            tD tD3;
            bc bc2 = objectArray[a22];
            if (bc2 == bc.SETTINGS) {
                tD2 = tD3 = new tD(bc2);
                cF_24 = cF_2;
            } else {
                CF_2 cF_25 = cF_2;
                cF_24 = cF_25;
                tD3 = new tD(bc2);
                cF_25.M.f((ad)tD3);
            }
            cF_24.I.put(bc2, tD3);
            n3 = ++a22;
        }
        CF_2 cF_26 = cF_2;
        cF_26.M.A(uSa.E);
        cF_26.M.C(uSa.E);
        cF_26.M.J(gra.FLEX_START);
        cF_26.i.f(cF_2.M);
        if (tD2 != null) {
            cF_2.i.f((ad)tD2);
        }
        CF_2 cF_27 = cF_2;
        cF_27.i.J(gra.SPACE_BETWEEN);
        cF_27.i.J(zta.n);
        cF_27.k.f((ad)new df(Kpa.J().J().J()));
        cF_2.j = new kC(uSa.E, uSa.E, null, yOa.B, Kpa.J().J().J(), Color.WHITE);
        cF_27.k.f((ad)cF_2.j);
        CF_2 cF_28 = cF_2;
        cF_28.k.A(uSa.E);
        cF_28.k.C(uSa.E);
        objectArray = new pE[vRa.d];
        pE pE2 = new pE(Wb.SOUND, Dg.J(), dE.J((pE[])objectArray));
        pE a22 = new pE(Wb.MICROPHONE, ie.J(), Je.J((pE)pE2), bg.J());
        objectArray[uSa.E] = a22;
        CF_2 cF_29 = cF_2;
        CF_2 cF_210 = cF_2;
        cF_210.A.f((ad)pE2);
        cF_210.A.f((ad)a22);
        cF_210.A.A(uSa.E);
        cF_210.A.C(uSa.E);
        cF_210.J.f(cF_2.k);
        cF_210.J.f(cF_2.A);
        cF_210.J.J(gra.SPACE_BETWEEN);
        cF_29.J.J(zta.n);
        cF_29.J.M(uSa.E);
        cF_2.J.J(uSa.E);
        cF_29.J(Color.WHITE);
    }

    public static /* synthetic */ void J(pE pE2, Boolean bl) {
        Boolean b2 = bl;
        pE a2 = pE2;
        OT.i.B.f(b2);
        a2.l();
    }

    @Override
    public void e() {
        CF_2 a2;
        if.J(a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(WF.J()), (Color)Bc.Ga.transparent(WF.J()));
    }
}

