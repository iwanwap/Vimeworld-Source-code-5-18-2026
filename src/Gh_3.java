/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JPa
 *  LQa
 *  Tpa
 *  Uqa
 *  hqa
 *  hra
 *  nka
 *  pQa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  vpa
 */
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public final class Gh_3 {
    public int E;
    public int m;
    public float[] C;
    public int i;
    public boolean M;
    public int k;
    public int j;
    public int J;
    public int A;
    public int I;

    public void e() {
        nka.l((int)nka.Q, (int)uSa.E);
    }

    public void d() {
        Gh_3 gh_3 = this;
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
            throw new RuntimeException(new StringBuilder().insert(3 >> 2, rua.C).append(a2).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void b2;
        Gh_3 a2;
        int c2 = n3;
        Gh_3 gh_3 = a2 = this;
        Gh_3 gh_32 = a2;
        gh_32.J = b2;
        gh_32.k = c2;
        gh_3.I = b2;
        a2.j = c2;
        gh_3.i = nka.f();
        a2.m = gLa.J();
        if (a2.M) {
            a2.A = nka.J();
        }
        Gh_3 gh_33 = a2;
        gh_33.J(hqa.s);
        uKa.C((int)gh_33.m);
        Gh_3 gh_34 = a2;
        GL11.glTexImage2D(BQa.Z, uSa.E, BRa.z, gh_34.I, gh_34.j, uSa.E, rSa.Ka, Uqa.P, (ByteBuffer)null);
        nka.l((int)nka.Q, (int)a2.i);
        nka.J((int)nka.Q, (int)nka.l, (int)BQa.Z, (int)a2.m, (int)uSa.E);
        if (a2.M) {
            nka.J((int)nka.G, (int)a2.A);
            Gh_3 gh_35 = a2;
            nka.f((int)nka.G, (int)nka.g, (int)gh_35.I, (int)gh_35.j);
            nka.l((int)nka.Q, (int)nka.Z, (int)nka.G, (int)a2.A);
        }
        Gh_3 gh_36 = a2;
        gh_36.C();
        gh_36.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Gh_3 a2 = this;
        uKa.J();
        if (a2.i >= 0) {
            a2.f();
        }
        Gh_3 gh_3 = a2;
        gh_3.f((int)b2, c2);
        gh_3.d();
        nka.l((int)nka.Q, (int)uSa.E);
    }

    public void C() {
        Gh_3 gh_3;
        Gh_3 gh_32 = gh_3 = this;
        gh_32.J(vRa.d != 0);
        Gh_3 gh_33 = gh_3;
        uKa.l((float)gh_32.C[uSa.E], (float)gh_3.C[vRa.d], (float)gh_33.C[uqa.g], (float)gh_3.C[yRa.d]);
        int a2 = qQa.O;
        if (gh_33.M) {
            uKa.J((double)oua.i);
            a2 |= hra.Ja;
        }
        uKa.A((int)a2);
        gh_3.e();
    }

    /*
     * WARNING - void declaration
     */
    public Gh_3(int n2, int n3, boolean bl) {
        void b2;
        void c2;
        Gh_3 a2;
        boolean d2 = bl;
        Gh_3 gh_3 = a2 = this;
        Gh_3 gh_32 = a2;
        gh_32.M = d2;
        a2.i = pua.o;
        gh_32.m = pua.o;
        gh_32.A = pua.o;
        gh_32.C = new float[AQa.P];
        gh_32.C[uSa.E] = pqa.r;
        gh_32.C[vRa.d] = pqa.r;
        gh_3.C[uqa.g] = pqa.r;
        gh_3.C[yRa.d] = JPa.N;
        gh_3.J((int)c2, (int)b2);
    }

    public void l() {
        uKa.C((int)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        Gh_3 a2;
        float f6 = f5;
        Gh_3 gh_3 = a2 = this;
        gh_3.C[uSa.E] = d2;
        gh_3.C[vRa.d] = c2;
        gh_3.C[uqa.g] = b2;
        gh_3.C[yRa.d] = e2;
    }

    public void J(int n2) {
        int b2 = n2;
        Gh_3 a2 = this;
        a2.E = b2;
        uKa.C((int)a2.m);
        GL11.glTexParameterf(BQa.Z, lQa.E, b2);
        GL11.glTexParameterf(BQa.Z, wua.C, b2);
        GL11.glTexParameterf(BQa.Z, LQa.P, XOa.f);
        GL11.glTexParameterf(BQa.Z, pQa.n, XOa.f);
        uKa.C((int)uSa.E);
    }

    public void f() {
        Gh_3 a2;
        if (a2.A > pua.o) {
            nka.d((int)a2.A);
            a2.A = pua.o;
        }
        if (a2.m > pua.o) {
            gLa.J(a2.m);
            a2.m = pua.o;
        }
        if (a2.i > pua.o) {
            nka.l((int)nka.Q, (int)uSa.E);
            nka.e((int)a2.i);
            a2.i = pua.o;
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Gh_3 a2 = this;
        nka.l((int)nka.Q, (int)a2.i);
        if (b2) {
            Gh_3 gh_3 = a2;
            uKa.f((int)uSa.E, (int)uSa.E, (int)gh_3.J, (int)gh_3.k);
        }
    }

    public void J() {
        Gh_3 a2;
        uKa.C((int)a2.m);
    }
}

