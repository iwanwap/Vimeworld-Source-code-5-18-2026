/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AA
 *  DQa
 *  ERa
 *  FLa
 *  FPa
 *  Gua
 *  JPa
 *  JQa
 *  KTa
 *  Kpa
 *  LQa
 *  Lra
 *  PTa
 *  SQa
 *  Tpa
 *  URa
 *  Uqa
 *  VQa
 *  XTa
 *  YSa
 *  ZJa
 *  ZOa
 *  aLa
 *  aQa
 *  bRa
 *  dQa
 *  eb
 *  ez
 *  fsa
 *  fua
 *  hqa
 *  hra
 *  jRa
 *  kpa
 *  kqa
 *  lqa
 *  nka
 *  pPa
 *  pQa
 *  pqa
 *  pua
 *  uKa
 *  uw
 *  vL
 *  vRa
 *  wOa
 *  zTa
 *  zsa
 */
import java.nio.IntBuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class tA_3 {
    public static void g() {
        if (pA.pd) {
            uKa.J(vRa.d != 0);
            pA.e(yRa.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void l(FLa fLa, float f2, int n2) {
        int c2 = n2;
        FLa a2 = fLa;
        if (!pA.eA && !pA.d()) {
            void b2;
            pA.K();
            uKa.B();
            pA.M();
            GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
            a2.J((float)b2, c2, vRa.d != 0, uSa.E != 0, vRa.d != 0);
            pA.i();
            pA.J(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(ZJa zJa2, vL vL2, double d2, eb eb2, int n2, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d3;
        void e2;
        boolean bl2 = bl;
        ZJa a2 = zJa2;
        a2.J((vL)e2, (double)d3, (eb)c2, (int)b2, (boolean)f2);
    }

    public static void I() {
        GL11.glVertexPointer(yRa.d, JPa.la, Upa.D, nqa.i);
        GL11.glColorPointer(AQa.P, Uqa.P, Upa.D, hQa.Ka);
        GL11.glTexCoordPointer(uqa.g, JPa.la, Upa.D, LQa.ca);
        nka.J((int)nka.P);
        GL11.glTexCoordPointer(uqa.g, Yua.W, Upa.D, wua.S);
        nka.J((int)nka.v);
        GL11.glNormalPointer(sra.Z, Upa.D, ATa.y);
        GL20.glVertexAttribPointer(pA.wb, uqa.g, JPa.la, uSa.E != 0, Upa.D, URa.E);
        GL20.glVertexAttribPointer(pA.ra, AQa.P, Yua.W, uSa.E != 0, Upa.D, XOa.g);
        GL20.glVertexAttribPointer(pA.hb, yRa.d, Yua.W, uSa.E != 0, Upa.D, yRa.Ia);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(FLa fLa, float f2, int n2) {
        int c2 = n2;
        FLa a2 = fLa;
        if (!pA.eA) {
            void b2;
            pA.ba();
            a2.J((float)b2, c2, uSa.E != 0, vRa.d != 0, uSa.E != 0);
            pA.fa();
        }
    }

    public static void j() {
        if (pA.pd) {
            pA.Nc = vRa.d;
            pA.e(XTa.W);
        }
    }

    public static void f(ez a2) {
        if (pA.J(a2)) {
            uKa.m();
        }
        if (nka.J()) {
            GL11.glEnableClientState(pqa.n);
            GL20.glEnableVertexAttribArray(pA.wb);
            GL20.glEnableVertexAttribArray(pA.ra);
            GL20.glEnableVertexAttribArray(pA.hb);
        }
    }

    public static void F() {
    }

    public static void k() {
        if (pA.pd) {
            if (pA.DC >= uqa.g) {
                uKa.i((int)TOa.l);
                pA.d(kqa.d);
                GL11.glCopyTexSubImage2D(BQa.Z, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, pA.zA, pA.t);
                pA.d(QTa.b);
                uKa.i((int)YSa.Ka);
            }
            pA.e(lqa.s);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(FLa fLa, int n2, float f2, long l2) {
        FLa fLa2 = fLa;
        if (pA.B > 0 && (pA.u -= vRa.d) <= 0) {
            FLa d2;
            void b2;
            Kpa c2 = Kpa.J();
            c2.U.f(DQa.z);
            ZJa a2 = c2.Aa;
            pA.eA = vRa.d;
            pA.u = pA.ba;
            pA.aa = c2.z.ld;
            if (!uw.a) {
                c2.z.ld = vRa.d;
            }
            pA.d(aua.R);
            GL11.glMatrixMode(WPa.s);
            GL11.glPushMatrix();
            GL11.glMatrixMode(SQa.ca);
            GL11.glPushMatrix();
            c2.U.f(pQa.q);
            EXTFramebufferObject.glBindFramebufferEXT(zsa.h, pA.ca);
            pA.d(hqa.V);
            pA.e(Fsa.d);
            void v0 = b2;
            c2.U.f(VQa.z);
            fLa2.J((float)v0, uqa.g);
            pA.f((float)v0);
            Kpa kpa2 = c2;
            aLa.J((Sx)kpa2.c, (kpa2.z.ld == uqa.g ? vRa.d : uSa.E) != 0);
            pA.d(VQa.z);
            GL20.glDrawBuffers(pA.Qc);
            pA.d(FPa.X);
            GL11.glReadBuffer(uSa.E);
            pA.d(uSa.D);
            EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, zua.J, BQa.Z, pA.Ma.get(uSa.E), uSa.E);
            if (pA.ha != 0) {
                EXTFramebufferObject.glFramebufferTexture2DEXT(zsa.h, rua.t, BQa.Z, pA.bA.get(uSa.E), uSa.E);
            }
            pA.e(zTa.i);
            GL11.glClearColor(pqa.r, pqa.r, pqa.r, pqa.r);
            fua.J((int)(pA.ha != 0 ? osa.x : hra.Ja));
            pA.d(pQa.q);
            Kpa kpa3 = c2;
            kpa3.U.f(KTa.S);
            Object object = YA.J();
            kpa3.U.f(fsa.c);
            object = new ALa((AA)object);
            FLa fLa3 = d2 = kpa3.J();
            double d3 = fLa3.V + (d2.la - d2.V) * (double)b2;
            FLa fLa4 = d2;
            double d4 = fLa3.Ga + (fLa4.Z - d2.Ga) * (double)b2;
            double d5 = fLa4.Ca + (d2.A - d2.Ca) * (double)b2;
            ((ALa)object).J(d3, d4, d5);
            uKa.F((int)gua.X);
            uKa.J();
            uKa.I((int)Ira.A);
            uKa.J(vRa.d != 0);
            uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
            uKa.m();
            kpa3.U.f(Gua.O);
            kpa3.J().J(WKa.C);
            kpa3.U.f(Nra.C);
            int n3 = uSa.E;
            n3 = fLa2.Fa;
            fLa2.Fa = n3 + vRa.d;
            a2.J((vL)d2, (double)b2, (eb)object, n3, c2.c.t());
            kpa3.U.f(aQa.J);
            kpa3.U.f(ZOa.M);
            uKa.G((int)SQa.ca);
            uKa.e();
            uKa.c();
            a2.J(ez.SOLID, (double)b2, uqa.g, (vL)d2);
            pA.d(ATa.A);
            uKa.K();
            a2.J(ez.CUTOUT_MIPPED, (double)b2, uqa.g, (vL)d2);
            pA.d(dQa.N);
            c2.J().J(WKa.C).J(uSa.E != 0, uSa.E != 0);
            a2.J(ez.CUTOUT, (double)b2, uqa.g, (vL)d2);
            pA.d(XTa.P);
            Kpa kpa4 = c2;
            kpa4.J().J(WKa.C).J();
            uKa.F((int)Zra.f);
            uKa.J((int)jRa.m, (float)Nra.e);
            uKa.G((int)SQa.ca);
            uKa.D();
            uKa.e();
            kpa4.U.f(Npa.y);
            a2.J((vL)d2, (eb)object, (float)b2);
            pA.d(Npa.y);
            uKa.G((int)SQa.ca);
            uKa.D();
            uKa.J(vRa.d != 0);
            uKa.k();
            uKa.h();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.J((int)jRa.m, (float)Nra.e);
            if (pA.B >= uqa.g) {
                uKa.i((int)Fsa.Ga);
                pA.d(Tpa.L);
                GL11.glCopyTexSubImage2D(BQa.Z, uSa.E, uSa.E, uSa.E, uSa.E, uSa.E, pA.sb, pA.ld);
                pA.d(pua.B);
                uKa.i((int)YSa.Ka);
            }
            uKa.k();
            uKa.J(vRa.d != 0);
            c2.J().J(WKa.C);
            uKa.F((int)gua.X);
            pA.d(JQa.W);
            GL20.glDrawBuffers(pA.Qc);
            pA.d(DQa.x);
            pA.e(JQa.W);
            if (pA.l()) {
                c2.U.f(dsa.ga);
                a2.J(ez.TRANSLUCENT, (double)b2, uqa.g, (vL)d2);
                pA.d(dsa.ga);
            }
            uKa.F((int)Zra.f);
            uKa.J(vRa.d != 0);
            uKa.h();
            uKa.k();
            GL11.glFlush();
            pA.d(PTa.F);
            pA.eA = uSa.E;
            if (!uw.a) {
                c2.z.ld = pA.aa;
            }
            c2.U.f(fPa.J);
            if (pA.Tc) {
                if (pA.B >= vRa.d) {
                    if (pA.aC[uSa.E]) {
                        uKa.i((int)zpa.A);
                        uKa.C((int)pA.Ma.get(uSa.E));
                        GL30.glGenerateMipmap(BQa.Z);
                        GL11.glTexParameteri(BQa.Z, lQa.E, pA.MC[uSa.E] ? pQa.t : ITa.n);
                    }
                    if (pA.B >= uqa.g && pA.aC[vRa.d]) {
                        uKa.i((int)Fsa.Ga);
                        uKa.C((int)pA.Ma.get(vRa.d));
                        GL30.glGenerateMipmap(BQa.Z);
                        GL11.glTexParameteri(BQa.Z, lQa.E, pA.MC[vRa.d] ? pQa.t : ITa.n);
                    }
                    uKa.i((int)YSa.Ka);
                }
                if (pA.ha >= vRa.d) {
                    if (pA.VC[uSa.E]) {
                        uKa.i((int)bRa.U);
                        uKa.C((int)pA.bA.get(uSa.E));
                        GL30.glGenerateMipmap(BQa.Z);
                        GL11.glTexParameteri(BQa.Z, lQa.E, pA.na[uSa.E] ? pQa.t : ITa.n);
                    }
                    if (pA.ha >= uqa.g && pA.VC[vRa.d]) {
                        uKa.i((int)pQa.U);
                        uKa.C((int)pA.bA.get(vRa.d));
                        GL30.glGenerateMipmap(BQa.Z);
                        GL11.glTexParameteri(BQa.Z, lQa.E, pA.na[vRa.d] ? pQa.t : ITa.n);
                    }
                    uKa.i((int)YSa.Ka);
                }
            }
            pA.d(fPa.J);
            EXTFramebufferObject.glBindFramebufferEXT(zsa.h, pA.KC);
            GL11.glViewport(uSa.E, uSa.E, pA.zA, pA.t);
            pA.xa = null;
            c2.J().J(WKa.C);
            pA.e(XTa.W);
            GL11.glMatrixMode(SQa.ca);
            GL11.glPopMatrix();
            GL11.glMatrixMode(WPa.s);
            GL11.glPopMatrix();
            GL11.glMatrixMode(SQa.ca);
            pA.d(zta.f);
        }
    }

    public static void G() {
        if (pA.pd) {
            pA.e(yRa.d);
        }
    }

    public static void D() {
        uKa.k();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(FLa fLa, float f2, int n2) {
        int c2 = n2;
        FLa a2 = fLa;
        if (!pA.eA && !pA.G()) {
            void b2;
            pA.K();
            pA.M();
            GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
            a2.J((float)b2, c2, vRa.d != 0, uSa.E != 0, uSa.E != 0);
            pA.i();
            pA.J(vRa.d != 0);
        }
    }

    public tA_3() {
        tA_3 a2;
    }

    public static void A() {
        if (pA.pd) {
            pA.e(pPa.f);
            if (pA.Wc[pPa.f] == pA.Wc[XTa.W]) {
                pA.J(pA.Ya);
                uKa.J(uSa.E != 0);
            }
        }
    }

    public static void i() {
    }

    public static void M() {
        if (pA.pd) {
            pA.e(XTa.W);
        }
    }

    public static void e() {
    }

    public static void d() {
        if (pA.pd) {
            pA.e(yRa.d);
        }
    }

    public static void C() {
        if (pA.pd) {
            pA.e(XTa.W);
        }
    }

    public static void l() {
        pA.e(hpa.Z);
    }

    public static void J(ALa d2, double c2, double b2, double a2) {
        d2.J(c2, b2, a2);
    }

    public static void J(ez a2) {
        if (nka.J()) {
            GL11.glDisableClientState(pqa.n);
            GL20.glDisableVertexAttribArray(pA.wb);
            GL20.glDisableVertexAttribArray(pA.ra);
            GL20.glDisableVertexAttribArray(pA.hb);
        }
        if (pA.J(a2)) {
            uKa.h();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(NKa nKa, float f2, boolean bl) {
        void b2;
        boolean c22 = bl;
        NKa a2 = nKa;
        uKa.J(vRa.d != 0);
        if (c22) {
            uKa.I((int)wOa.a);
            GL11.glPushMatrix();
            IntBuffer c22 = pA.xa;
            pA.J(pA.ya);
            pA.r = vRa.d;
            a2.J((float)b2);
            pA.r = uSa.E;
            pA.J(c22);
            GL11.glPopMatrix();
        }
        uKa.I((int)Ira.A);
        GL11.glColor4f(pqa.r, pqa.r, pqa.r, pqa.r);
        a2.J((float)b2);
    }

    public static void f() {
        if (pA.pd) {
            if (pA.A()) {
                pA.e(wOa.t);
                return;
            }
            pA.e(ERa.C);
            return;
        }
        pA.e(uSa.E);
    }

    public static void J() {
        pA.e(yta.Ka);
    }
}

