/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  FPa
 *  IOa
 *  Kna
 *  Kpa
 *  Mda
 *  Oma
 *  Qba
 *  Spa
 *  XTa
 *  ac
 *  cb
 *  cra
 *  eAa
 *  hra
 *  kqa
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  pua
 *  qBa
 *  uKa
 *  vRa
 *  wb
 *  yQa
 */
import java.io.IOException;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cna
extends EC
implements wb {
    private Oma m;
    private DMa C;
    private cb i;
    public String M;
    private IOa k;
    public EC j;
    private boolean J;
    private Laa A;
    private Ima I;

    public void f() {
        cna a2;
        if (a2.J) {
            cna cna2 = a2;
            cna2.D();
            cna2.J();
            cna2.i = cna2.k;
            cna2.J = uSa.E;
        }
    }

    public static /* synthetic */ Kna a(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna H(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna g(cna a2) {
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public cna(EC eC2, Laa laa) {
        void b2;
        cna a2;
        Object c2 = laa;
        cna cna2 = a2 = this;
        a2.M = kqa.p;
        a2.J = vRa.d;
        cna2.j = b2;
        cna2.A = c2;
    }

    public static /* synthetic */ Kna I(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna j(cna a2) {
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, eAa eAa2) {
        void a2;
        void c2;
        cna b2;
        int d2 = n3;
        cna cna2 = b2 = this;
        cna2.J((int)(c2 + vRa.d), d2 + vRa.d);
        uKa.o();
        nLa.J();
        cna2.m.J(new Mda((eAa)a2, vRa.d, uSa.E), (int)(c2 + uqa.g), d2 + uqa.g);
        nLa.C();
        uKa.E();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(cna cna2, int n2, int n3, eAa eAa2) {
        void b2;
        void c2;
        cna d2 = eAa2;
        cna a2 = cna2;
        a2.J((int)c2, (int)b2, (eAa)d2);
    }

    public void D() {
        cna a2;
        cna cna2 = a2;
        cna cna3 = a2;
        a2.k = new IOa(a2, a2.g);
        cna2.k.l(vRa.d, vRa.d);
        a2.I = new Ima(a2, a2.g);
        cna2.I.l(vRa.d, vRa.d);
        cna cna4 = a2;
        cna2.C = new DMa(cna4, cna4.g);
        cna2.C.l(vRa.d, vRa.d);
        cna cna5 = a2;
        cna2.m = new Oma(cna5, cna5.g);
        cna2.m.l(vRa.d, vRa.d);
    }

    public static /* synthetic */ Kna F(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna k(cna a2) {
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(cna cna2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void g;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n8 = n7;
        cna a2 = cna2;
        a2.J((int)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)g);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(cna cna2, int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        cna a2 = cna2;
        a2.C((int)d2, (int)c2, (int)b2, (int)e2);
    }

    public static /* synthetic */ Kna G(cna a2) {
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(cna cna2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void g;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n8 = n7;
        cna a2 = cna2;
        a2.J((int)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)g);
    }

    public static /* synthetic */ Kna D(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna A(cna a2) {
        return a2.L;
    }

    public void J(ac ac2) throws IOException {
        cna b2 = ac2;
        cna a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == 0) {
                cna cna2 = a2;
                cna2.g.J(cna2.j);
                return;
            }
            if (((ac)b2).C == vRa.d) {
                a2.i = a2.k;
                return;
            }
            if (((ac)b2).C == yRa.d) {
                a2.i = a2.I;
                return;
            }
            if (((ac)b2).C == uqa.g) {
                a2.i = a2.C;
                return;
            }
            if (((ac)b2).C == AQa.P) {
                a2.i = a2.m;
                return;
            }
            a2.i.J((ac)b2);
        }
    }

    public static /* synthetic */ Kna i(cna a2) {
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        cna a2 = this;
        a2.C((int)b2, c2, uSa.E, uSa.E);
    }

    public static /* synthetic */ Kna M(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna e(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna d(cna a2) {
        return a2.L;
    }

    public void d() throws IOException {
        cna a2;
        cna cna2 = a2;
        super.d();
        if (cna2.i != null) {
            a2.i.f();
        }
    }

    public void J() {
        cna cna2 = this;
        cna2.E.add(new ac(uSa.E, (int)(cna2.A / uqa.g + AQa.P), (int)(cna2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(cra.g, new Object[uSa.E])));
        cna2.E.add(new ac(vRa.d, (int)(cna2.A / uqa.g - rRa.f), (int)(cna2.I - FPa.F), Fua.J, kTa.j, oha.J(Jsa.n, new Object[uSa.E])));
        ac ac2 = new ac(uqa.g, (int)(cna2.A / uqa.g - Fua.J), (int)(cna2.I - FPa.F), Fua.J, kTa.j, oha.J(yQa.e, new Object[uSa.E]));
        cna2.E.add(ac2);
        ac ac3 = new ac(yRa.d, (int)(cna2.A / uqa.g), (int)(cna2.I - FPa.F), Fua.J, kTa.j, oha.J(ERa.B, new Object[uSa.E]));
        cna2.E.add(ac3);
        cna a2 = new ac(AQa.P, (int)(cna2.A / uqa.g + Fua.J), (int)(cna2.I - FPa.F), Fua.J, kTa.j, oha.J(DPa.U, new Object[uSa.E]));
        cna2.E.add(a2);
        if (cna2.C.e() == 0) {
            ac2.J = uSa.E;
        }
        if (cna2.I.e() == 0) {
            ac3.J = uSa.E;
        }
        if (cna2.m.e() == 0) {
            ((ac)a2).J = uSa.E;
        }
    }

    public boolean J() {
        cna a2;
        if (!a2.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        cna e2;
        cna cna2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        cna2.g.J().J((ResourceLocation)j);
        pKa pKa2 = pKa.J();
        cna cna3 = e2 = pKa2.J();
        void v2 = d2;
        cna cna4 = e2;
        cna4.J(XTa.W, mka.A);
        cna4.J((double)(d2 + uSa.E), (double)(c2 + yOa.B), (double)cna2.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        e2.J((double)(v2 + yOa.B), (double)(c2 + yOa.B), (double)cna2.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        cna3.J((double)(v2 + yOa.B), (double)(c2 + uSa.E), (double)cna2.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        cna3.J((double)(d2 + uSa.E), (double)(c2 + uSa.E), (double)cna2.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        pKa2.J();
    }

    public static /* synthetic */ Laa J(cna a2) {
        return a2.A;
    }

    public static /* synthetic */ Kna C(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna l(cna a2) {
        return a2.L;
    }

    public static /* synthetic */ Kna f(cna a2) {
        return a2.L;
    }

    public void A() {
        cna a2;
        a2.M = oha.J(ZSa.U, new Object[uSa.E]);
        a2.J = vRa.d;
        a2.g.J().J((KC)new qBa(Qba.REQUEST_STATS));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        cna a2 = this;
        if (a2.J) {
            a2.i();
            cna.J((String)oha.J(eua.a, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)(a2.I / uqa.g), (int)pua.o);
            cna.J((String)((Object)I[(int)(Kpa.J() / Spa.R % (long)((Ima)I).length)]), (int)(a2.A / uqa.g), (int)(a2.I / uqa.g + a2.L.u * uqa.g), (int)pua.o);
            return;
        }
        cna cna2 = a2;
        cna2.i.J((int)c2, (int)b2, d2);
        cna.J((String)cna2.M, (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public static /* synthetic */ Kna J(cna a2) {
        return a2.L;
    }
}

