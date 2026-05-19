/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bc
 *  Gf
 *  HE
 *  Le
 *  Oqa
 *  PF
 *  aSa
 *  ad
 *  bpa
 *  cD
 *  if
 *  lPa
 *  pqa
 *  vQa
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class cD_1
extends jb {
    private final vC j;
    private HE J;
    private float A;
    private final Map<HE, Gf> I;

    public cD_1() {
        cD_1 a2;
        cD_1 cD_12 = a2;
        super(Oqa.COLUMN, uSa.E, uSa.E);
        a2.J = null;
        cD_1 cD_13 = a2;
        cD_12.I = new HashMap<HE, Gf>();
        cD_13.j = new vC(aSa.V);
        cD_12.A = WF.J();
        cD_1 cD_14 = a2;
        cD_12.I.put(HE.ON, new Gf((cD)cD_14, (cD)cD_14, HE.ON));
        cD_1 cD_15 = a2;
        a2.I.put(HE.REQUEST, new Gf((cD)cD_15, (cD)cD_15, HE.REQUEST));
        cD_1 cD_16 = a2;
        a2.I.put(HE.OFF, new Gf((cD)cD_16, (cD)cD_16, HE.OFF));
        cD_12.f((ad)cD_12.I.get(HE.ON));
        cD_1 cD_17 = a2;
        cD_17.f((ad)cD_17.I.get(HE.REQUEST));
        cD_1 cD_18 = a2;
        cD_18.f((ad)cD_18.I.get(HE.OFF));
        a2.J(Color.WHITE);
    }

    @Override
    public void e() {
        cD_1 a2;
        if.C(a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(a2.A * WF.J()), (Color)Bc.Ga.transparent(a2.A * WF.J()));
    }

    public float J() {
        cD_1 a2;
        return a2.A;
    }

    public void J(HE hE2) {
        cD_1 b2 = hE2;
        cD_1 a2 = this;
        if (b2 == null) {
            b2 = HE.ON;
        }
        if (a2.J == b2) {
            return;
        }
        cD_1 cD_12 = a2;
        cD_12.j.J(cD_12.I.get((Object)b2).f() - a2.I, BRa.Y);
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b22;
        int c22 = n3;
        cD_1 a2 = this;
        a2.A = pqa.r;
        if (!WF.l()) {
            a2.A = bpa.K;
        }
        a2.j.J();
        cD_1 cD_12 = a2;
        super.J((int)b22, c22);
        cD_12.A *= WF.J();
        if.C((double)(cD_12.I + a2.j.l()), (double)a2.J, (double)mPa.s, (double)vQa.c, (Color)Bc.sb.transparent(a2.A), (Color)Bc.Da.transparent(a2.A));
        Iterator<Gf> b22 = cD_12.I.values().iterator();
        Iterator<Gf> iterator = b22;
        while (iterator.hasNext()) {
            Gf c22 = b22.next();
            String string = c22.J().getEmoji();
            Le.J((PF)PF.VIME_ART, (int)kTa.j).J(string, (int)(c22.f() + c22.l() / KPa.y - lPa.K), (int)(c22.C() + c22.J() / KPa.y - Wqa.Z), Bc.Ba.transparent(a2.A).getRGB(), uSa.E != 0);
            iterator = b22;
        }
        if (a2.J != WF.J()) {
            a2.J(WF.J());
        }
    }
}

