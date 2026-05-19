/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  HT
 *  Kd
 *  Ke
 *  Ls
 *  Oqa
 *  TU
 *  UR
 *  YS
 *  Zc
 *  Zs
 *  ad
 *  eT
 *  if
 *  lPa
 *  pua
 *  vRa
 *  wPa
 *  wT
 *  wra
 *  ws
 *  zU
 */
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ws_3
extends eF
implements F {
    private final Ls i;
    private boolean M;
    private final gU k;
    private final HT j;
    private final eT J;
    private final TT A;
    private final mx I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        ws_3 a2;
        int c2 = n3;
        ws_3 ws_32 = a2 = this;
        ws_3 ws_33 = a2;
        if.C((double)(ws_33.I - lPa.K), (double)(a2.J - lPa.K), (double)(a2.k + hQa.x), (double)(a2.j + hQa.x), (Color)new Color(rSa.E), (Kd)Kd.S_X2);
        super.J((int)b2, c2);
        ws_3 ws_34 = a2;
        ws_32.i.C((double)(ws_34.I.J() - wra.P) - a2.i.l());
        ws_34.i.l((double)a2.J);
        ws_32.i.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public ws_3(mx mx2, TT tT) {
        void a2;
        ws_3 b2;
        Object c2 = mx2;
        ws_3 ws_32 = b2 = this;
        ws_3 ws_33 = b2;
        super(Oqa.COLUMN, osa.c, uSa.E != 0);
        b2.M = vRa.d;
        ws_33.j = (HT)ITa.a;
        ws_33.I = c2;
        ws_3 ws_34 = b2;
        ws_33.i = new Ls((mx)((Object)c2));
        ws_32.j = new HT((Ke)c2, (ws)b2);
        b2.A = a2;
        ws_32.I = (mx)wPa.Q;
        b2.J = (eT)ITa.a;
        b2.k = new gU((mx)((Object)c2), (ws)b2);
        b2.f(b2.k);
        b2.J = new eT((mx)((Object)c2));
        b2.f((ad)b2.J);
        ws_3 ws_35 = b2;
        ws_35.f((ad)ws_35.j);
    }

    public eT J() {
        ws_3 a2;
        return a2.J;
    }

    public static /* synthetic */ int f(MiniDotItem miniDotItem, MiniDotItem miniDotItem2) {
        MiniDotItem b2 = miniDotItem2;
        MiniDotItem a2 = miniDotItem;
        if (a2.currency == Zc.VIMER && b2.currency != Zc.VIMER) {
            return pua.o;
        }
        if (a2.currency != Zc.VIMER && b2.currency == Zc.VIMER) {
            return vRa.d;
        }
        if (a2.status == YT.BUYABLE && b2.status != YT.BUYABLE) {
            return pua.o;
        }
        if (a2.status != YT.BUYABLE && b2.status == YT.BUYABLE) {
            return vRa.d;
        }
        if (a2.status == YT.VIME_PASS && b2.status != YT.VIME_PASS) {
            return pua.o;
        }
        if (a2.status != YT.VIME_PASS && b2.status == YT.VIME_PASS) {
            return vRa.d;
        }
        if (a2.status == YT.CHEST_ONLY && b2.status != YT.CHEST_ONLY) {
            return pua.o;
        }
        if (a2.status != YT.CHEST_ONLY && b2.status == YT.CHEST_ONLY) {
            return vRa.d;
        }
        if (a2.status == YT.ARCHIVED && b2.status != YT.ARCHIVED) {
            return pua.o;
        }
        if (a2.status != YT.ARCHIVED && b2.status == YT.ARCHIVED) {
            return vRa.d;
        }
        return Integer.compare(b2.price, a2.price);
    }

    public HT J() {
        ws_3 a2;
        return a2.j;
    }

    @Override
    public gU J() {
        ws_3 a2;
        return a2.k;
    }

    @Override
    public TT J() {
        ws_3 a2;
        return a2.A;
    }

    private void J(List<MiniDotItem> list) {
        List<MiniDotItem> b2 = list;
        ws_3 a2 = this;
        b2.sort(UR.J());
    }

    public static /* synthetic */ int J(MiniDotItem miniDotItem, MiniDotItem miniDotItem2) {
        MiniDotItem b2 = miniDotItem2;
        MiniDotItem a2 = miniDotItem;
        if (zU.M.J().J(a2) && !zU.M.J().J(b2)) {
            return pua.o;
        }
        if (!zU.M.J().J(a2) && zU.M.J().J(b2)) {
            return vRa.d;
        }
        return uSa.E;
    }

    public YS J() {
        ws_3 a2;
        return a2.j.J();
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<MiniDotItem> J(TU tU2) {
        ws_3 a2;
        Object b2 = tU2;
        ws_3 ws_32 = a2 = this;
        b2 = ws_32.I.J((TU)b2);
        YS yS2 = ws_32.J();
        ws_32.J((List<MiniDotItem>)b2);
        switch (wT.I[yS2.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                Collections.reverse(b2);
                break;
            }
        }
        Object object = b2;
        object.sort(Zs.J());
        return object;
    }

    public void C(boolean bl2) {
        boolean b2 = bl2;
        ws_3 a2 = this;
        if (a2.M == b2) {
            return;
        }
        ws_3 ws_32 = a2;
        ws_32.M = b2;
        ws_32.j.f(b2);
        ws_32.J.f(b2);
    }
}

