/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JPa
 *  LQa
 *  SQa
 *  Tpa
 *  Uqa
 *  XTa
 *  aKa
 *  aSa
 *  dQa
 *  hqa
 *  hra
 *  mka
 *  nka
 *  pKa
 *  pQa
 *  pqa
 *  pua
 *  uKa
 *  ura
 *  vRa
 *  vpa
 */
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public final class gHa_3 {
    public float[] E;
    public int m;
    public int C;
    public int i;
    public int M;
    public int k;
    public int j;
    public boolean J;
    public int A;
    public int I;

    public void e() {
        gHa_3 gHa_32;
        gHa_3 gHa_33 = gHa_32 = this;
        gHa_33.J(vRa.d != 0);
        gHa_3 gHa_34 = gHa_32;
        uKa.l((float)gHa_33.E[uSa.E], (float)gHa_32.E[vRa.d], (float)gHa_34.E[uqa.g], (float)gHa_32.E[yRa.d]);
        int a2 = qQa.O;
        if (gHa_34.J) {
            uKa.J((double)oua.i);
            a2 |= hra.Ja;
            a2 |= ura.V;
        }
        uKa.A((int)a2);
        gHa_32.f();
    }

    public void d() {
        if (nka.f()) {
            uKa.C((int)uSa.E);
        }
    }

    public void J(int n2) {
        int b2 = n2;
        gHa_3 a2 = this;
        if (nka.f()) {
            a2.j = b2;
            uKa.C((int)a2.i);
            GL11.glTexParameterf(BQa.Z, lQa.E, b2);
            GL11.glTexParameterf(BQa.Z, wua.C, b2);
            GL11.glTexParameterf(BQa.Z, LQa.P, XOa.f);
            GL11.glTexParameterf(BQa.Z, pQa.n, XOa.f);
            uKa.C((int)uSa.E);
        }
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        gHa_3 a2 = this;
        if (nka.f()) {
            nka.l((int)nka.Q, (int)a2.A);
            if (b2) {
                gHa_3 gHa_32 = a2;
                uKa.f((int)uSa.E, (int)uSa.E, (int)gHa_32.M, (int)gHa_32.k);
            }
        }
    }

    public void C() {
        gHa_3 gHa_32 = this;
        int a2 = nka.J((int)nka.Q);
        if (a2 != nka.fa) {
            if (a2 == nka.n) {
                throw new RuntimeException(rta.Ha);
            }
            if (a2 == nka.N) {
                throw new RuntimeException(Tpa.o);
            }
            if (a2 == nka.K) {
                throw new RuntimeException(SPa.v);
            }
            if (a2 == nka.Ha) {
                throw new RuntimeException(vpa.Ka);
            }
            throw new RuntimeException(new StringBuilder().insert(3 ^ 3, rua.C).append(a2).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2, int n3) {
        void b2;
        int c2 = n3;
        gHa_3 a2 = this;
        if (!nka.f()) {
            gHa_3 gHa_32 = a2;
            gHa_32.M = b2;
            gHa_32.k = c2;
            return;
        }
        uKa.J();
        if (a2.A >= 0) {
            a2.l();
        }
        gHa_3 gHa_33 = a2;
        gHa_33.f((int)b2, c2);
        gHa_33.C();
        nka.l((int)nka.Q, (int)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        gHa_3 a2;
        float f6 = f5;
        gHa_3 gHa_32 = a2 = this;
        gHa_32.E[uSa.E] = d2;
        gHa_32.E[vRa.d] = c2;
        gHa_32.E[uqa.g] = b2;
        gHa_32.E[yRa.d] = e2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, boolean bl2) {
        int d22 = n3;
        gHa_3 b2 = this;
        if (nka.f()) {
            aKa aKa2;
            void a22;
            void c22;
            uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
            uKa.u();
            uKa.J(uSa.E != 0);
            uKa.G((int)WPa.s);
            uKa.y();
            uKa.J((double)aSa.V, (double)((double)c22), (double)d22, (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
            uKa.G((int)SQa.ca);
            uKa.y();
            uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
            uKa.f((int)uSa.E, (int)uSa.E, (int)c22, (int)d22);
            uKa.H();
            uKa.L();
            uKa.c();
            if (a22 != false) {
                uKa.k();
                uKa.a();
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            gHa_3 gHa_32 = b2;
            gHa_32.J();
            float c22 = (float)c22;
            float d22 = d22;
            gHa_3 gHa_33 = b2;
            float a22 = (float)gHa_32.M / (float)gHa_33.C;
            float f2 = (float)gHa_32.k / (float)b2.m;
            pKa pKa2 = pKa.J();
            aKa aKa3 = aKa2 = pKa2.J();
            aKa aKa4 = aKa2;
            aKa4.J(XTa.W, mka.a);
            aKa4.J(aSa.V, (double)d22, aSa.V).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
            aKa3.J((double)c22, (double)d22, aSa.V).J((double)a22, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
            aKa3.J((double)c22, aSa.V, aSa.V).J((double)a22, (double)f2).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
            aKa3.J(aSa.V, aSa.V, aSa.V).J(aSa.V, (double)f2).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
            pKa2.J();
            gHa_33.d();
            uKa.J(vRa.d != 0);
            uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        }
    }

    public void l() {
        if (nka.f()) {
            gHa_3 a2;
            gHa_3 gHa_32 = a2;
            gHa_32.d();
            gHa_32.f();
            if (gHa_32.I > pua.o) {
                nka.d((int)a2.I);
                a2.I = pua.o;
            }
            if (a2.i > pua.o) {
                gLa.J(a2.i);
                a2.i = pua.o;
            }
            if (a2.A > pua.o) {
                nka.l((int)nka.Q, (int)uSa.E);
                nka.e((int)a2.A);
                a2.A = pua.o;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public gHa_3(int n2, int n3, boolean bl2) {
        void b2;
        void c2;
        gHa_3 a2;
        boolean d2 = bl2;
        gHa_3 gHa_32 = a2 = this;
        gHa_3 gHa_33 = a2;
        gHa_33.J = d2;
        a2.A = pua.o;
        gHa_33.i = pua.o;
        gHa_33.I = pua.o;
        gHa_33.E = new float[AQa.P];
        gHa_33.E[uSa.E] = pqa.r;
        gHa_33.E[vRa.d] = pqa.r;
        gHa_32.E[uqa.g] = pqa.r;
        gHa_32.E[yRa.d] = JPa.N;
        gHa_32.l((int)c2, (int)b2);
    }

    public void f() {
        if (nka.f()) {
            nka.l((int)nka.Q, (int)uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void b2;
        gHa_3 a2;
        int c2 = n3;
        gHa_3 gHa_32 = a2 = this;
        gHa_3 gHa_33 = a2;
        gHa_33.M = b2;
        gHa_33.k = c2;
        gHa_32.C = b2;
        gHa_32.m = c2;
        if (!nka.f()) {
            a2.e();
            return;
        }
        a2.A = nka.f();
        a2.i = gLa.J();
        if (a2.J) {
            a2.I = nka.J();
        }
        gHa_3 gHa_34 = a2;
        gHa_34.J(hqa.s);
        uKa.C((int)gHa_34.i);
        gHa_3 gHa_35 = a2;
        GL11.glTexImage2D(BQa.Z, uSa.E, BRa.z, gHa_35.C, gHa_35.m, uSa.E, rSa.Ka, Uqa.P, (ByteBuffer)null);
        nka.l((int)nka.Q, (int)a2.A);
        nka.J((int)nka.Q, (int)nka.l, (int)BQa.Z, (int)a2.i, (int)uSa.E);
        if (a2.J) {
            nka.J((int)nka.G, (int)a2.I);
            gHa_3 gHa_36 = a2;
            nka.f((int)nka.G, (int)nka.g, (int)gHa_36.C, (int)gHa_36.m);
            nka.l((int)nka.Q, (int)nka.Z, (int)nka.G, (int)a2.I);
        }
        gHa_3 gHa_37 = a2;
        gHa_37.e();
        gHa_37.d();
    }

    public void J() {
        if (nka.f()) {
            gHa_3 a2;
            uKa.C((int)a2.i);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        gHa_3 a2 = this;
        a2.J((int)b2, c2, vRa.d != 0);
    }
}

