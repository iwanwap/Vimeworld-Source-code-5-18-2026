/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  ERa
 *  Ke
 *  Le
 *  Mu
 *  PF
 *  QF
 *  Qsa
 *  XSa
 *  Zta
 *  bpa
 *  iPa
 *  pua
 *  vRa
 *  wra
 *  zT
 */
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;

public final class zT_2
extends QF {
    private QF I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Object c2;
        zT_2 zT_22 = this;
        zT_22.k = ((mx)zT_22.I).J().l();
        Object object = c2 = Le.J((PF)PF.VIME_ART, (int)Qsa.Ha);
        zT_2 zT_23 = zT_22;
        super.J((int)b2, (int)a2);
        zT_2 zT_24 = zT_22;
        zT_23.I.C((double)(zT_24.I + zT_22.k - Zta.ba - zT_22.I.l()));
        zT_24.I.l(zT_22.J + Zta.ba);
        ((Ii)object).J(kra.b, (int)(zT_22.I + Zta.ba), (int)(zT_22.J + zOa.X), pua.o, uSa.E != 0);
        ((Ii)object).J(Npa.fa, (int)(zT_22.I + Zta.ba), (int)(zT_22.J + zOa.X + vua.K), pua.o, uSa.E != 0);
        zT_22.I.J((int)b2, (int)a2);
        ((Ii)object).J(bpa.x, (int)(zT_22.I.f() + zT_22.I.l() / KPa.y - (double)(((Ii)c2).f(bpa.x) / uqa.g)), (int)(zT_22.I.C() + zT_22.I.J() / KPa.y - (double)(((Ii)c2).J(bpa.x) / uqa.g)) - vRa.d, Bc.A.getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(int n2, int n3, int n4, boolean bl) {
        void a2;
        void b2;
        int d22 = n3;
        int c2 = n2;
        if (b2 == false && a2 != false) {
            try {
                Desktop.getDesktop().browse(new URI(XSa.k));
                return;
            }
            catch (Exception d22) {
                d22.printStackTrace();
            }
        }
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
        zT_2 a2 = this;
        if (a2.I.f()) {
            a2.I.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        super.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public static /* synthetic */ void J(zT zT2, boolean bl) {
        boolean b2 = bl;
        zT a2 = zT2;
        if (b2) {
            zT zT3 = a2;
            zT3.I.J((Color)Bc.sa);
            zT3.I.f((Color)Bc.E);
            return;
        }
        zT zT4 = a2;
        zT4.I.J((Color)Bc.Ba);
        zT4.I.f((Color)Bc.qa);
    }

    public zT_2(mx mx2) {
        Object b2 = mx2;
        zT_2 a2 = this;
        super(uSa.E, uSa.E, SPa.h, Eqa.Ka, (Color)Bc.Xb, (Ke)b2, (Color)Bc.y);
        a2.I = new QF(uSa.E, ERa.C, iPa.ca, wra.P, (Color)Bc.Ba, (Ke)b2, (Color)Bc.qa);
        a2.I.J(NR.J());
        a2.I.J(Mu.J((zT)a2));
    }
}

