/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bc
 *  ERa
 *  Ke
 *  Le
 *  PF
 *  QF
 *  Qsa
 *  RS
 *  Tpa
 *  VQa
 *  YR
 *  Ypa
 *  Zc
 *  Zta
 *  aS
 *  asa
 *  cQa
 *  pua
 *  uKa
 *  vRa
 *  wI
 *  wra
 *  zU
 */
import java.awt.Color;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class CT
extends QF {
    private final MiniDotItem k;
    private final int j;
    private final Zc J;
    private QF A;
    private QF I;

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(int n2, int n3, Zc zc2, MiniDotItem miniDotItem, int n4, int n5, int n6, boolean bl) {
        void b2;
        void a2;
        int n7 = n2;
        n2 = n4;
        int d2 = n7;
        if (a2 != false && b2 == false) {
            void e2;
            void f2;
            void g2;
            if (d2 < g2) {
                zU.M.J(new StringBuilder().insert(5 >> 3, qQa.z).append(f2.plurals(tTa.h)).append(VQa.ja).toString());
                mx.J().D();
                return;
            }
            wI h2 = new wI();
            h2.put((Object)Wqa.fa, (Object)vRa.y);
            h2.put((Object)xua.Aa, (Object)e2.id);
            zU.M.f(h2);
            if (f2 == Zc.COIN) {
                Zc.setCoins((int)(Zc.getCoins() - g2));
            } else {
                Zc.setVimers((int)(Zc.getVimers() - g2));
            }
            mx.J().D();
        }
    }

    public static /* synthetic */ void f(CT cT2, boolean bl) {
        boolean b2 = bl;
        CT a2 = cT2;
        if (b2) {
            CT cT3 = a2;
            cT3.I.J((Color)Bc.Da);
            cT3.I.f((Color)Bc.L);
            return;
        }
        CT cT4 = a2;
        cT4.I.J((Color)Bc.sb);
        cT4.I.f((Color)Bc.Da);
    }

    public static /* synthetic */ void J(CT cT2, boolean bl) {
        boolean b2 = bl;
        CT a2 = cT2;
        if (b2) {
            a2.A.f((Color)Bc.H);
            return;
        }
        a2.A.f((Color)Bc.Ba);
    }

    /*
     * WARNING - void declaration
     */
    public CT(Ke ke, int n2, int n3, Zc zc2, MiniDotItem miniDotItem) {
        void d2;
        void c2;
        void b2;
        void a2;
        CT e2;
        CT f2 = ke;
        CT cT2 = e2 = this;
        super(uSa.E, uSa.E, cQa.Z, NSa.ga, (Ke)f2, (Color)Bc.Ea, null, (Color)Bc.Ja);
        e2.k = a2;
        cT2.J = b2;
        cT2.j = c2;
        CT cT3 = f2;
        e2.A = new QF(ERa.C, uSa.E, Ypa.Z, wra.P, (Ke)cT3, null, RS.J((Ke)cT3), (Color)Bc.Ba);
        e2.A.J(aS.J((CT)e2));
        e2.I = new QF(EPa.O, uSa.E, Ypa.Z, wra.P, (Ke)f2, (Color)Bc.sb, YR.J((int)d2, (int)c2, (Zc)b2, (MiniDotItem)a2), (Color)Bc.Da);
        e2.I.J(PS.J(e2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Object c2;
        CT cT2 = this;
        int n4 = ((mx)cT2.I).J();
        int n5 = ((mx)cT2.I).l();
        Object object = c2 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        CT cT3 = cT2;
        CT cT4 = cT2;
        cT2.k = (MiniDotItem)((double)Math.max(cQa.Z, ((Ii)c2).f(cT2.k.name) + ERa.C + ERa.C));
        cT2.I = (QF)((double)(n4 / uqa.g) - cT2.k / KPa.y);
        cT2.J = (Zc)((double)(n5 / uqa.g) - cT2.j / KPa.y);
        CT cT5 = cT2;
        cT4.A.C((double)(cT5.I + Zta.ba));
        cT5.I.C((double)(cT2.I + cT2.k - cT2.I.l() - Zta.ba));
        cT4.A.l((double)(cT2.J + cT2.j - Zta.ba - ITa.a));
        cT4.I.l((double)(cT2.J + cT2.j - Zta.ba - ITa.a));
        super.J((int)b2, (int)a2);
        uKa.K();
        ((Ii)object).J(pta.N, (int)(cT2.I + Zta.ba), (int)(cT2.J + Wqa.m), pua.o, uSa.E != 0);
        cT2.A.J((int)b2, (int)a2);
        cT3.I.J((int)b2, (int)a2);
        uKa.K();
        Object object2 = c2;
        Object object3 = c2;
        ((Ii)object3).J(eta.w, (int)(cT2.I + Zta.ba), (int)(cT2.J + Zta.ba + (double)((Ii)c2).J(Mqa.y)), pua.o, uSa.E != 0);
        CT cT6 = cT2;
        ((Ii)object3).J(yRa.Ga, (int)(cT6.I + Zta.ba), (int)(cT2.J + Zta.ba + (double)((Ii)c2).J(Mqa.y) + (double)((Ii)c2).J(Mqa.y)), pua.o, uSa.E != 0);
        ((Ii)object2).J(cT6.k.name, (int)(cT2.I + Zta.ba), (int)(cT2.J + Zta.ba + (double)((Ii)c2).J(zpa.T) + (double)((Ii)c2).J(Mqa.y) + (double)((Ii)c2).J(Mqa.y)), pua.o, uSa.E != 0);
        Object object4 = c2;
        ((Ii)object2).J(asa.Y + cT2.j + Tpa.E + cT2.J.getSymbol(), (int)(cT2.I + Zta.ba), (int)(cT2.J + cT2.j - LRa.j - (double)((Ii)c2).J(Mqa.y)), pua.o, uSa.E != 0);
        ((Ii)object).J(Pua.H, (int)(cT2.A.f() + cT2.A.l() / KPa.y - (double)(((Ii)c2).f(Pua.H) / uqa.g)), (int)(cT2.A.C() + cT2.A.J() / KPa.y - hQa.x), cT2.A.f().getRGB(), uSa.E != 0);
        ((Ii)object2).J(BRa.n, (int)(cT2.I.f() + cT2.I.l() / KPa.y - (double)(((Ii)c2).f(BRa.n) / uqa.g)), (int)(cT2.I.C() + cT2.I.J() / KPa.y - hQa.x), pua.o, uSa.E != 0);
        uKa.c();
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
        CT a2 = this;
        if (a2.A.f()) {
            a2.A.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        if (a2.I.f()) {
            a2.I.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        super.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Ke ke, int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        Ke a2 = ke;
        if (e2 != false && b2 == false) {
            ((mx)a2).D();
        }
    }
}

