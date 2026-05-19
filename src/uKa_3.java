/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fla
 *  Gla
 *  Hka
 *  Kka
 *  MJa
 *  Mla
 *  QKa
 *  RQa
 *  Ssa
 *  Usa
 *  ZRa
 *  aQa
 *  fsa
 *  fua
 *  ila
 *  kja
 *  nKa
 *  nka
 *  nla
 *  pqa
 *  tla
 *  vRa
 *  wra
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uKa_3 {
    private static WJa c;
    private static sja B;
    private static tla d;
    public static boolean a;
    private static ila b;
    private static kja l;
    private static QKa[] e;
    public static nla G;
    private static tLa D;
    private static tja f;
    private static int F;
    private static nKa g;
    private static float L;
    private static int E;
    private static Hka m;
    private static Mla C;
    private static sja[] i;
    private static final String M = "CL_00002558";
    private static sja k;
    private static aja j;
    private static mla J;
    private static Fla A;
    private static sja I;

    public static void U() {
        uKa_3.J.I.f();
    }

    public static int l() {
        return nka.v + E;
    }

    public static void C(float a2) {
        if (a2 != L) {
            L = a2;
            GL11.glLineWidth(a2);
        }
    }

    public static boolean d() {
        return sja.J(uKa_3.f.A);
    }

    public static void P() {
        B.J();
    }

    public static void s() {
        if (Config.Ca()) {
            int n2 = GL11.glGetInteger(aQa.a);
            int n3 = GL11.glGetInteger(Ssa.c);
            int n4 = uKa_3.l();
            int n5 = uKa_3.f();
            if (n5 > 0 && (n2 != n4 || n3 != n5)) {
                Config.f(new StringBuilder().insert(3 & 4, fsa.P).append(n4).append(wra.v).append(n2).append(ATa.E).append(n5).append(wua.j).append(n3).toString());
            }
        }
    }

    public static void y() {
        GL11.glLoadIdentity();
    }

    public static void I(int a2) {
        if (a2 != uKa_3.b.I) {
            uKa_3.b.I = a2;
            GL11.glDepthFunc(a2);
        }
    }

    public static int f() {
        return uKa_3.e[uKa_3.E].A;
    }

    public static void u() {
        uKa_3.b.J.f();
    }

    public static boolean C() {
        return sja.J(uKa_3.A.I);
    }

    public static void q() {
        uKa_3.d.A.J();
    }

    public static void f(double c2, double b2, double a2) {
        fua.J((double)c2, (double)b2, (double)a2);
    }

    public static void z() {
        uKa_3.e[uKa_3.E].I.f();
    }

    public static void o() {
        I.J();
    }

    public static boolean l() {
        return uKa_3.b.A;
    }

    public static void h() {
        uKa_3.A.I.J();
    }

    public static void f(MJa a2) {
        uKa_3.J((MJa)a2).I.J();
    }

    public static int J() {
        return GL11.glGenTextures();
    }

    public static void l(float a2) {
        if (a2 != uKa_3.C.J) {
            uKa_3.C.J = a2;
            GL11.glFogf(Yqa.u, a2);
        }
    }

    public static void j(int a2) {
        i[a2].J();
    }

    public static void J(IntBuffer a2) {
        IntBuffer intBuffer = a2;
        IntBuffer intBuffer2 = intBuffer;
        intBuffer.rewind();
        while (intBuffer2.position() < a2.limit()) {
            IntBuffer intBuffer3 = a2;
            intBuffer2 = intBuffer3;
            uKa_3.D(intBuffer3.get());
        }
        a2.rewind();
    }

    public static void J(int n2, float f2) {
        float b2 = f2;
        int a2 = n2;
        if (a2 != uKa_3.f.I || b2 != uKa_3.f.J) {
            uKa_3.f.I = a2;
            uKa_3.f.J = b2;
            GL11.glAlphaFunc(a2, b2);
        }
    }

    public static void F(int a2) {
        if (a2 != F) {
            F = a2;
            GL11.glShadeModel(a2);
        }
    }

    public static void m() {
        uKa_3.A.I.f();
    }

    public static boolean f() {
        return sja.J(uKa_3.C.k);
    }

    public static void E() {
        I.f();
    }

    public static boolean J() {
        return sja.J(uKa_3.b.J);
    }

    public static void K() {
        uKa_3.f.A.J();
    }

    public static void c() {
        uKa_3.f.A.f();
    }

    public static void k(int a2) {
        uKa_3.e[uKa_3.E].A = a2;
    }

    public static void J(FloatBuffer a2) {
        GL11.glMultMatrix(a2);
    }

    public static void J(MJa a2) {
        uKa_3.J((MJa)a2).I.f();
    }

    public static void B() {
        uKa_3.j.j.J();
    }

    public static void G(int a2) {
        GL11.glMatrixMode(a2);
    }

    public static void f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (a2 != uKa_3.j.I || b2 != uKa_3.j.A) {
            uKa_3.j.I = a2;
            uKa_3.j.A = b2;
            GL11.glBlendFunc(a2, b2);
        }
    }

    public static void L() {
        B.f();
    }

    public static void J(float f2, float f3) {
        float b2 = f3;
        float a2 = f2;
        if (a2 != uKa_3.J.j || b2 != uKa_3.J.J) {
            uKa_3.J.j = a2;
            uKa_3.J.J = b2;
            GL11.glPolygonOffset(a2, b2);
        }
    }

    public static void b() {
        k.f();
    }

    public static void a() {
        uKa_3.m.A.J();
    }

    public static void H() {
        uKa_3.e[uKa_3.E].I.J();
    }

    public static void D(int n2) {
        int n3 = n2;
        if (n3 != 0) {
            int a2;
            GL11.glDeleteTextures(n3);
            QKa[] qKaArray = e;
            int n4 = e.length;
            int n5 = a2 = uSa.E;
            while (n5 < n4) {
                QKa qKa2 = qKaArray[a2];
                if (qKa2.A == n3) {
                    qKa2.A = uSa.E;
                }
                n5 = ++a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void l(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        fua.f((float)a2, (float)b2, (float)c2);
    }

    public static void A(int a2) {
        if (a) {
            fua.J((int)a2);
        }
    }

    public static void i(int a2) {
        if (E != a2 - nka.v) {
            E = a2 - nka.v;
            nka.M((int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        int d2 = n5;
        int a2 = n2;
        GL11.glViewport(a2, (int)c2, (int)b2, d2);
    }

    public static void g() {
        uKa_3.d.A.f();
    }

    public static void I() {
        uKa_3.C.k.f();
    }

    /*
     * WARNING - void declaration
     */
    public static void l(float f2, float f3, float f4, float f5) {
        void b2;
        void c2;
        float d2 = f5;
        float a2 = f2;
        if (a2 != uKa_3.g.J.j || c2 != uKa_3.g.J.A || b2 != uKa_3.g.J.I || d2 != uKa_3.g.J.J) {
            uKa_3.g.J.j = a2;
            uKa_3.g.J.A = c2;
            uKa_3.g.J.I = b2;
            uKa_3.g.J.J = d2;
            GL11.glClearColor(a2, (float)c2, (float)b2, d2);
        }
    }

    public static void j() {
        GL11.glPushAttrib(ZRa.w);
    }

    public static void F() {
        uKa_3.D.I.f();
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        if (uKa_3.d.j != a2 || uKa_3.d.k != b2 || uKa_3.d.J != c2) {
            uKa_3.d.j = a2;
            uKa_3.d.k = b2;
            uKa_3.d.J = c2;
            GL11.glStencilOp(a2, (int)b2, c2);
        }
    }

    public static void k() {
        uKa_3.j.j.f();
    }

    public static void M(int a2) {
        if (a2 != uKa_3.A.A) {
            uKa_3.A.A = a2;
            GL11.glCullFace(a2);
        }
    }

    public static void e(int a2) {
        if (uKa_3.d.I != a2) {
            uKa_3.d.I = a2;
            GL11.glStencilMask(a2);
        }
    }

    public static void d(int a2) {
        i[a2].f();
    }

    public static void G() {
        GL11.glPopAttrib();
    }

    public static void f(float a2) {
        if (a2 != uKa_3.C.A) {
            uKa_3.C.A = a2;
            GL11.glFogf(CRa.G, a2);
        }
    }

    public static void D() {
        GL11.glPopMatrix();
    }

    /*
     * WARNING - void declaration
     */
    public static void f(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        uKa_3.f(a2, (float)b2, c2, pqa.r);
    }

    public static void C(int a2) {
        if (a2 != uKa_3.e[uKa_3.E].A) {
            uKa_3.e[uKa_3.E].A = a2;
            GL11.glBindTexture(BQa.Z, a2);
        }
    }

    public static void A() {
        uKa_3.D.I.J();
    }

    public static void i() {
        uKa_3.J.I.J();
    }

    public static void J(double f2, double e2, double d2, double c2, double b2, double a2) {
        GL11.glOrtho(f2, e2, d2, c2, b2, a2);
    }

    public static void l(int a2) {
        GL11.glCallList(a2);
    }

    public static void M() {
        uKa_3.G.I = uKa_3.G.J = vqa.T;
        uKa_3.G.A = uKa_3.G.J;
        uKa_3.G.j = uKa_3.G.J;
    }

    public static void f(int a2) {
        if (a2 != uKa_3.D.A) {
            uKa_3.D.A = a2;
            GL11.glLogicOp(a2);
        }
    }

    public static void e() {
        GL11.glPushMatrix();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        if (uKa_3.d.M.I != a2 || uKa_3.d.M.A != b2 || uKa_3.d.M.J != c2) {
            uKa_3.d.M.I = a2;
            uKa_3.d.M.A = b2;
            uKa_3.d.M.J = c2;
            GL11.glStencilFunc(a2, (int)b2, c2);
        }
    }

    public static void d() {
        uKa_3.C.k.J();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        fua.J((float)a2, (float)b2, (float)c2);
    }

    public static void J(int n2, FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        int a2 = n2;
        GL11.glGetFloat(a2, b2);
    }

    public static void J(int a2) {
        if (a2 != uKa_3.C.I) {
            uKa_3.C.I = a2;
            GL11.glFogi(RQa.s, a2);
        }
    }

    public static void C() {
        uKa_3.m.A.f();
    }

    public static void J(float a2) {
        if (a2 != uKa_3.C.j) {
            uKa_3.C.j = a2;
            GL11.glFogf(sOa.L, a2);
        }
    }

    public static void J(boolean a2) {
        if (a2 != uKa_3.b.A) {
            uKa_3.b.A = a2;
            GL11.glDepthMask(a2);
        }
    }

    public static void J(double a2) {
        if (a2 != uKa_3.g.A) {
            uKa_3.g.A = a2;
            GL11.glClearDepth(a2);
        }
    }

    public static void l() {
        k.J();
    }

    public static void J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (a2 != uKa_3.m.J || b2 != uKa_3.m.I) {
            uKa_3.m.J = a2;
            uKa_3.m.I = b2;
            GL11.glColorMaterial(a2, b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(MJa mJa2, int n2, FloatBuffer floatBuffer) {
        void b2;
        Object c2 = floatBuffer;
        MJa a2 = mJa2;
        GL11.glTexGen(uKa_3.J((MJa)a2).J, (int)b2, (FloatBuffer)c2);
    }

    public uKa_3() {
        uKa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void f(float f2, float f3, float f4, float f5) {
        void b2;
        void c2;
        float d2 = f5;
        float a2 = f2;
        if (a2 != uKa_3.G.j || c2 != uKa_3.G.A || b2 != uKa_3.G.I || d2 != uKa_3.G.J) {
            uKa_3.G.j = a2;
            uKa_3.G.A = c2;
            uKa_3.G.I = b2;
            uKa_3.G.J = d2;
            GL11.glColor4f(a2, (float)c2, (float)b2, d2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Gla J(MJa a2) {
        switch (Kka.I[a2.ordinal()]) {
            case 1: {
                return uKa_3.c.A;
            }
            case 2: {
                return uKa_3.c.j;
            }
            case 3: {
                return uKa_3.c.J;
            }
            case 4: {
                return uKa_3.c.I;
            }
        }
        return uKa_3.c.A;
    }

    public static void f() {
        GL11.glBindTexture(BQa.Z, uKa_3.e[uKa_3.E].A);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        int d2 = n5;
        int a2 = n2;
        if (a2 != uKa_3.j.I || c2 != uKa_3.j.A || b2 != uKa_3.j.J || d2 != uKa_3.j.k) {
            uKa_3.j.I = a2;
            uKa_3.j.A = c2;
            uKa_3.j.J = b2;
            uKa_3.j.k = d2;
            nka.J((int)a2, (int)c2, (int)b2, (int)d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        void b2;
        void c2;
        boolean d2 = bl4;
        boolean a2 = bl;
        if (a2 != uKa_3.l.I || c2 != uKa_3.l.J || b2 != uKa_3.l.j || d2 != uKa_3.l.A) {
            uKa_3.l.I = a2;
            uKa_3.l.J = c2;
            uKa_3.l.j = b2;
            uKa_3.l.A = d2;
            GL11.glColorMask(a2, (boolean)c2, (boolean)b2, d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(MJa mJa2, int n2) {
        void a2;
        MJa mJa3 = mJa2;
        MJa b2 = uKa_3.J(mJa3);
        if (a2 != b2.A) {
            b2.A = a2;
            GL11.glTexGeni(b2.J, BPa.P, (int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4, float f5) {
        void b2;
        void c2;
        float d2 = f5;
        float a2 = f2;
        fua.J((float)a2, (float)c2, (float)b2, (float)d2);
    }

    static {
        int n2;
        f = new tja(null);
        B = new sja(kua.Y);
        i = new sja[Yqa.i];
        m = new Hka(null);
        j = new aja(null);
        b = new ila(null);
        C = new Mla(null);
        A = new Fla(null);
        J = new mla(null);
        D = new tLa(null);
        c = new WJa(null);
        g = new nKa(null);
        d = new tla(null);
        k = new sja(Usa.Aa);
        E = uSa.E;
        e = new QKa[fPa.i];
        F = gua.X;
        I = new sja(rua.x);
        l = new kja(null);
        G = new nla();
        L = tua.r;
        a = vRa.d;
        int n3 = n2 = uSa.E;
        while (n3 < Yqa.i) {
            int n4 = n2;
            sja sja2 = new sja(qQa.O + n2);
            uKa_3.i[n4] = sja2;
            n3 = ++n2;
        }
        int n5 = n2 = uSa.E;
        while (n5 < fPa.i) {
            uKa_3.e[n2++] = new QKa(null);
            n5 = n2;
        }
    }

    public static void J() {
        uKa_3.b.J.J();
    }

    public static void J(double c2, double b2, double a2) {
        fua.f((double)c2, (double)b2, (double)a2);
    }
}

