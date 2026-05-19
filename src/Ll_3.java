/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SK
 *  WN
 *  XM
 *  sG
 *  vRa
 *  xM
 */
import java.util.List;

public final class Ll_3 {
    public SK m;
    public int C;
    public SK i;
    public SK M;
    public SK k;
    public SK j;
    public SK J;
    public K A;
    public static final int I = 255;

    public static SK J(List<xM> list) {
        int n2;
        SK sK2;
        List<xM> list2 = list;
        SK a2 = sK2 = new SK(list2.get(uSa.E));
        SK sK3 = sK2.B ? sK2 : null;
        int n3 = n2 = vRa.d;
        while (n3 < list2.size()) {
            SK sK4 = a2;
            sK4.e = new SK(list2.get(n2));
            a2 = a2.e;
            if (a2.B) {
                sK3 = a2;
            }
            n3 = ++n2;
        }
        if (sK3 != null && a2.e == null) {
            a2.e = sK3;
        }
        return sK2;
    }

    public void J(int n2, int n3) {
        int b2;
        int c2 = n3;
        Ll_3 a2 = this;
        b2 = jI.l(b2, uSa.E);
        c2 = jI.l(c2, uSa.E);
        if (a2.J.l != null && a2.J.l == b2) {
            a2.J.l = c2;
        }
    }

    public void J(XM xM2, int n2) {
        Ll_3 ll_3;
        Ll_3 ll_32;
        Ll_3 ll_33;
        int a2;
        Ll_3 c2 = xM2;
        Ll_3 b2 = this;
        a2 = jI.l(a2, uSa.E);
        if (!c2.hasAnimation()) {
            Ll_3 ll_34 = b2;
            ll_34.j.l = a2;
            ll_34.J.l = a2;
            return;
        }
        if ((c2 = c2.getAnimation()).hasEditDuration()) {
            b2.C = c2.getEditDuration();
        }
        if (c2.hasEditEasing()) {
            Ll_3 ll_35 = c2;
            ll_33 = ll_35;
            b2.A = sG.J((WN)ll_35.getEditEasing(), (K)b2.A);
        } else {
            if (c2.hasEditEasingExpr()) {
                b2.A = sG.J((String)c2.getEditEasingExpr(), (K)b2.A);
            }
            ll_33 = c2;
        }
        if (ll_33.getBothCount() > 0) {
            ll_32 = b2;
            b2.j = Ll_3.J(c2.getBothList());
            b2.J = Ll_3.J(c2.getBothList());
        } else {
            if (c2.getStartCount() > 0) {
                b2.j = Ll_3.J(c2.getStartList());
            }
            if (c2.getFinishCount() > 0) {
                b2.J = Ll_3.J(c2.getFinishList());
            }
            ll_32 = b2;
        }
        if (ll_32.j.l == null) {
            b2.j.l = a2;
        }
        if (b2.J.l == null) {
            b2.J.l = a2;
        }
        if (c2.getVisibleCount() > 0) {
            ll_3 = c2;
            b2.M = Ll_3.J(c2.getVisibleList());
            b2.k = b2.M.J();
        } else {
            if (c2.getVisibleStartCount() > 0) {
                b2.M = Ll_3.J(c2.getVisibleStartList());
            }
            if (c2.getVisibleFinishCount() > 0) {
                b2.k = Ll_3.J(c2.getVisibleFinishList());
            }
            ll_3 = c2;
        }
        if (ll_3.getHoverCount() > 0) {
            b2.m = Ll_3.J(c2.getHoverList());
            b2.i = b2.m.J();
            return;
        }
        if (c2.getHoverStartCount() > 0) {
            b2.m = Ll_3.J(c2.getHoverStartList());
        }
        if (c2.getHoverFinishCount() > 0) {
            b2.i = Ll_3.J(c2.getHoverFinishList());
        }
    }

    public Ll_3() {
        Ll_3 a2;
        Ll_3 ll_3 = a2;
        a2.j = new SK();
        ll_3.J = new SK();
        a2.C = osa.Ja;
        a2.A = sG.A;
    }
}

