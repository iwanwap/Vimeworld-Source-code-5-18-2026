/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  GT
 *  HT
 *  JPa
 *  Ke
 *  QF
 *  XT
 *  YS
 *  ad
 *  ps
 *  uT
 */
import java.awt.Color;

public final class uT_2
extends QF {
    private final HT A;
    private final YS I;

    /*
     * WARNING - void declaration
     */
    public uT_2(YS yS2, HT hT2, Ke ke) {
        void c2;
        void a2;
        uT_2 b2;
        uT_2 d2 = hT2;
        uT_2 uT_22 = b2 = this;
        super((Ke)a2, (Color)Bc.Ea.transparent(JPa.N), null, null);
        b2.A = d2;
        b2.j = ITa.a;
        b2.I = c2;
        uT_22.J(ps.J((uT)b2));
        uT_22.J(XT.J((HT)d2, (YS)c2));
    }

    public static /* synthetic */ void J(uT uT2, boolean bl) {
        boolean b2 = bl;
        uT a2 = uT2;
        if (b2) {
            a2.J((Color)Bc.Ja);
            return;
        }
        a2.J((Color)Bc.Ea.transparent(JPa.N));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(HT hT2, YS yS2, int n2, int n3, int n4, boolean bl) {
        void a2;
        HT f2 = yS2;
        HT e2 = hT2;
        if (a2 == false && e2.l()) {
            HT hT3 = e2;
            hT3.l(uSa.E != 0);
            if (hT3.J() == f2) {
                return;
            }
            HT hT4 = e2;
            hT4.J((YS)f2);
            hT4.J().J().f().removeIf(GT.J());
            mx.J().l(mx.J().J());
        }
    }

    public static /* synthetic */ boolean J(ad a2) {
        return a2 instanceof vS;
    }

    public YS J() {
        uT_2 a2;
        return a2.I;
    }
}

