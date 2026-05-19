/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bpa
 *  F
 *  FPa
 *  HT
 *  Kd
 *  Ke
 *  Le
 *  NQa
 *  Oqa
 *  PF
 *  QF
 *  Qsa
 *  SOa
 *  YS
 *  ad
 *  if
 *  lPa
 *  pqa
 *  uKa
 *  uT
 *  vQa
 *  vRa
 *  ws
 */
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class HT_3
extends QF
implements F {
    private YS M;
    private final ws k;
    private boolean j;
    private boolean J;
    private final eF I;

    public void l(boolean bl) {
        boolean b2 = bl;
        HT_3 a2 = this;
        if (a2.J == b2) {
            return;
        }
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        HT_3 a2 = this;
        if (e2 == false) {
            return;
        }
        if (!a2.j) {
            return;
        }
        HT_3 hT_3 = a2;
        hT_3.l((!hT_3.J ? vRa.d : uSa.E) != 0);
    }

    public boolean l() {
        HT_3 a2;
        return a2.J;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        HT_3 a2 = this;
        if (a2.j == b2) {
            return;
        }
        a2.j = b2;
        if (!b2) {
            a2.l(uSa.E != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        Ii ii2;
        Object c2;
        void a22;
        void b22;
        HT_3 hT_3 = this;
        Ii ii3 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        hT_3.k = (ws)((double)(ii3.f(hT_3.M.getDisplayName() + Hta.V + (hT_3.l() ? vQa.L : Bpa.W)) + EPa.O));
        HT_3 hT_32 = hT_3;
        super.J((int)b22, (int)a22);
        if (hT_32.j) {
            c2 = Color.WHITE;
            ii2 = ii3;
        } else {
            c2 = Bc.E;
            ii2 = ii3;
        }
        ii2.J(new StringBuilder().insert(3 >> 2, hT_3.M.getDisplayName()).append(Hta.V).append(hT_3.l() ? vQa.L : Bpa.W).toString(), (int)(hT_3.I + SOa.w), hT_3.J + hT_3.j / KPa.y - hQa.x, ((Color)c2).getRGB(), uSa.E != 0);
        uKa.f((float)((float)((Color)c2).getRed() / NQa.Y), (float)((float)((Color)c2).getGreen() / NQa.Y), (float)((float)((Color)c2).getBlue() / NQa.Y), (float)pqa.r);
        if (hT_3.J) {
            HT_3 hT_33 = hT_3;
            HT_3 hT_34 = hT_3;
            hT_33.I.C((double)hT_34.I);
            hT_33.I.l(hT_3.J + ITa.a + lPa.K + FPa.T);
            hT_34.I.J((double)hT_3.k);
            for (ad ad2 : hT_33.I.f()) {
                if (!(ad2 instanceof uT)) continue;
                ad2.J((double)hT_3.k);
            }
            HT_3 hT_35 = hT_3;
            HT_3 hT_36 = hT_3;
            if.J((double)hT_35.I.f(), (double)hT_36.I.C(), (double)hT_3.I.l(), (double)hT_3.I.J(), (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
            hT_36.I.J((int)b22, (int)a22);
            c2 = hT_35.I.f().iterator();
            Object object = c2;
            while (object.hasNext()) {
                ad ad2;
                ad2 = (ad)c2.next();
                if (!(ad2 instanceof uT)) {
                    object = c2;
                    continue;
                }
                uT b22 = (uT)ad2;
                String a22 = b22.J().getDisplayName();
                object = c2;
                ii3.J(a22, (int)(b22.f() + SOa.w), (int)(b22.C() + b22.J() / KPa.y - (double)ii3.J(a22) / KPa.y), Bc.Ba.getRGB(), uSa.E != 0);
            }
        }
    }

    public eF J() {
        HT_3 a2;
        return a2.I;
    }

    public void J(YS yS2) {
        HT_3 b2 = yS2;
        HT_3 a2 = this;
        a2.M = b2;
    }

    public void f() {
        HT_3 a2;
        if (!a2.j) {
            return;
        }
        if (a2.A) {
            HT_3 hT_3 = a2;
            hT_3.j = Bc.Ja;
            hT_3.I = Bc.Ga;
            return;
        }
        HT_3 hT_3 = a2;
        hT_3.j = Bc.Ea;
        hT_3.I = Bc.Ja;
    }

    public YS J() {
        HT_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public HT_3(Ke ke, ws ws2) {
        int n2;
        YS[] a2;
        void b2;
        HT_3 hT_3;
        HT_3 hT_32 = hT_3 = this;
        super((Ke)b2, (Color)Bc.Ea, null, (Color)Bc.Ja);
        HT_3 hT_33 = hT_3;
        hT_3.I = new eF(Oqa.ROW, vRa.d, uSa.E != 0);
        hT_33.J = uSa.E;
        hT_3.j = vRa.d;
        hT_32.j = ITa.a;
        hT_32.k = a2;
        hT_32.M = YS.NEW;
        a2 = YS.values();
        int n3 = a2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            HT_3 c2 = a2[n2];
            c2 = new uT((YS)c2, (HT)hT_3, (Ke)b2);
            hT_3.I.f((ad)c2);
            n4 = ++n2;
        }
    }

    public ws J() {
        HT_3 a2;
        return a2.k;
    }
}

