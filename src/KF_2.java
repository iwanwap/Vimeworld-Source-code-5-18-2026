/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DQa
 *  ISa
 *  KF
 *  Kd
 *  LD
 *  NTa
 *  Oqa
 *  Pe
 *  TPa
 *  ad
 *  cI
 *  hf
 *  if
 *  kC
 *  lE
 *  pqa
 *  vRa
 *  wOa
 */
import java.awt.Color;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KF_2
extends jb {
    private long f;
    private final oE F;
    private final vC g;
    private final String L;
    private boolean E;
    private final kC C;
    private final eF i;
    private final kC M;
    private final List<hf> k;
    private final boolean j;
    private long A;
    private final String I;

    public void J() {
        a.E = vRa.d;
    }

    public boolean e() {
        KF_2 a2;
        if (a2.i != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     */
    public void f(int var1_2, int var2_4) {
        c = var1_2;
        b = this;
        if (!((double)c > b.I) || !((double)a > b.J) || !((double)c < b.I + b.k)) ** GOTO lbl-1000
        v0 = (double)a;
        v1 = b.J + b.j;
        v2 = b.i != null ? wOa.t : uSa.E;
        if (v0 < v1 + (double)v2) {
            v3 = vRa.d;
        } else lbl-1000:
        // 2 sources

        {
            v3 = uSa.E;
        }
        var3_5 = v3;
        c = (int)b.A;
        b.A = var3_5;
        if (var3_5 != c) {
            b.f();
        }
    }

    @Override
    public void e() {
        KF_2 kF_2;
        KF_2 kF_22;
        KF_2 kF_23 = kF_22 = this;
        float a2 = kF_23.g.J();
        if (kF_23.i != null) {
            KF_2 kF_24 = kF_22;
            kF_2 = kF_24;
            if.d((double)kF_22.I, (double)kF_24.J, kF_22.k, (double)kF_22.j, (Color)kF_22.F.getBackground().transparent(a2), (Color)kF_22.F.getBorder().transparent(a2), (Kd)Kd.S);
        } else {
            KF_2 kF_25 = kF_22;
            kF_2 = kF_25;
            if.J((double)kF_25.I, (double)kF_22.J, kF_22.k, (double)kF_22.j, (Color)kF_22.F.getBackground().transparent(a2), (Color)kF_22.F.getBorder().transparent(a2), (Kd)Kd.S);
        }
        if (kF_2.j) {
            KF_2 kF_26 = kF_22;
            cI.J((Runnable)LD.J((KF)kF_26));
            if.f((double)kF_26.I, (double)kF_22.J, (double)(kF_22.k - kF_22.k * JC.f(kF_22.f + WOa.D, kF_22.f - WOa.D + kF_22.A, System.currentTimeMillis())), (double)DQa.S, (Color)Bc.Ba.transparent(a2));
            cI.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public KF_2(oE oE2, String string, String string2, List<hf> list, long l2, boolean bl) {
        void f22;
        void b2;
        void c2;
        Iterator e2;
        void a2;
        KF_2 d2;
        Object g2 = string2;
        KF_2 kF_2 = d2 = this;
        KF_2 kF_22 = d2;
        KF_2 kF_23 = d2;
        super(Oqa.ROW, uSa.E, uSa.E);
        KF_2 kF_24 = d2;
        d2.g = new vC();
        kF_24.f = System.currentTimeMillis();
        d2.E = uSa.E;
        d2.L = (String)tTa.h;
        d2.F = (oE)tTa.h;
        d2.g = (vC)tTa.h;
        d2.c = tTa.h;
        d2.k = (List<hf>)tTa.h;
        d2.d = Bc.Ba;
        kF_23.j = a2;
        kF_23.I = e2;
        kF_22.L = g2;
        kF_22.k = c2;
        kF_2.A = b2;
        d2.F = f22;
        kF_2.k = (List<hf>)Hta.h;
        d2.j = pqa.q;
        d2.m = vRa.d;
        d2.b = vRa.d;
        d2.M = new kC(null, ((String)((Object)e2)).replace((char)ISa.E, (char)TPa.Aa), (Color)f22.getTitleColor().transparent(d2.g.J()));
        d2.f((ad)d2.M);
        KF_2 kF_25 = d2;
        kF_25.M.J(lE.BOLD);
        kF_25.M.f(yOa.B);
        kF_25.C = new kC(null, ((String)g2).replace((char)ISa.E, (char)TPa.Aa), (Color)f22.getSubtitleColor().transparent(d2.g.J()));
        kF_25.f((ad)kF_25.C);
        KF_2 kF_26 = d2;
        kF_26.C.J(lE.REGULAR);
        kF_26.C.f(yOa.B);
        kF_26.M.J(vRa.d != 0);
        kF_26.C.J(vRa.d != 0);
        if (c2 != null && !c2.isEmpty()) {
            d2.i = new eF(Oqa.ROW, uSa.E, vRa.d != 0);
            int f22 = uSa.E;
            Iterator iterator = e2 = c2.iterator();
            while (iterator.hasNext()) {
                KF_2 kF_27;
                g2 = (hf)e2.next();
                g2 = new Pe(g2.J(), (KF)d2, g2.J(), g2.J());
                g2.J(Hta.h / (double)c2.size());
                if (c2.size() > vRa.d) {
                    g2.J(f22 == 0 ? vRa.d : (f22 == c2.size() - vRa.d ? uqa.g : uSa.E));
                    kF_27 = d2;
                } else {
                    g2.J(yRa.d);
                    kF_27 = d2;
                }
                ++f22;
                kF_27.i.f((ad)g2);
                iterator = e2;
            }
        } else {
            d2.i = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        KF_2 a2;
        int c2 = n3;
        KF_2 kF_2 = a2 = this;
        a2.g.J();
        KF_2 kF_22 = a2;
        KF_2 kF_23 = a2;
        kF_22.M.J((Color)kF_23.F.getTitleColor().transparent(a2.g.J()));
        kF_22.C.J((Color)a2.F.getSubtitleColor().transparent(a2.g.J()));
        kF_23.M.J((int)a2.k - NTa.C);
        kF_22.C.J((int)a2.k - NTa.C);
        kF_22.l();
        super.J((int)b2, c2);
        if (kF_2.i != null) {
            KF_2 kF_24 = a2;
            KF_2 kF_25 = a2;
            kF_24.i.C((double)kF_25.I);
            kF_24.i.l(a2.J + a2.j);
            kF_25.i.J((int)b2, c2);
        }
    }

    @Override
    public void d() {
        KF_2 a2;
        if.f((double)a2.I, (double)a2.J, a2.k, (double)(a2.j + (double)(a2.i != null ? wOa.t : uSa.E)), (Color)Bc.Ba);
    }

    public void J(long a2) {
        b.f = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl) {
        boolean bl2 = bl;
        KF_2 a2 = this;
        if (a2.i == null) {
            return;
        }
        if (a2.i.f()) {
            void e2;
            void b2;
            void c2;
            void d2;
            a2.i.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
    }

    public oE J() {
        KF_2 a2;
        return a2.F;
    }

    public long f() {
        KF_2 a2;
        return a2.f + a2.A;
    }

    public boolean J() {
        KF_2 a2;
        return a2.E;
    }

    public static /* synthetic */ void J(KF a2) {
        if.A((double)a2.I, (double)a2.J, a2.k, (double)a2.j, (Color)Color.WHITE, (Kd)Kd.S);
    }

    public long J() {
        KF_2 a2;
        return a2.f;
    }

    public vC f() {
        KF_2 a2;
        return a2.g;
    }
}

