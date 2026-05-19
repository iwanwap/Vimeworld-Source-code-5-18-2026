/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Epa
 *  ISa
 *  JPa
 *  JQa
 *  Kpa
 *  MQa
 *  NOa
 *  Qta
 *  Rua
 *  SOa
 *  Ssa
 *  Uqa
 *  Usa
 *  XTa
 *  YSa
 *  Yra
 *  ZRa
 *  Zta
 *  Zua
 *  aQa
 *  bSa
 *  dpa
 *  fTa
 *  hra
 *  jsa
 *  pPa
 *  pua
 *  qta
 *  vPa
 *  vRa
 *  yQa
 *  zsa
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import optifine.Config;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nka_1 {
    private static boolean ca;
    public static int Ja;
    public static float ja;
    public static int Ha;
    public static int Ga;
    public static int fa;
    public static int Ka;
    public static int Aa;
    public static int S;
    public static int Z;
    private static boolean Y;
    public static int r;
    public static int V;
    public static boolean z;
    public static int X;
    public static int y;
    public static int U;
    public static int P;
    public static float u;
    private static boolean O;
    public static int t;
    public static boolean R;
    public static int Q;
    public static int N;
    public static int T;
    public static int p;
    public static int n;
    private static boolean s;
    private static final String w = "CL_00001179";
    private static String W;
    public static int q;
    public static int x;
    public static int v;
    public static int o;
    private static int h;
    public static int K;
    public static int H;
    public static int c;
    public static int B;
    public static int d;
    private static boolean a;
    public static boolean b;
    public static int l;
    public static int e;
    public static int G;
    public static int D;
    public static int f;
    public static boolean F;
    public static int g;
    public static int L;
    private static String E;
    public static int m;
    public static boolean C;
    public static boolean i;
    public static int M;
    public static boolean k;
    public static int j;
    private static boolean J;
    public static boolean A;
    public static int I;

    public static int f(int a2) {
        if (ca) {
            return ARBShaderObjects.glCreateShaderObjectARB(a2);
        }
        return GL20.glCreateShader(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void l(int n2, boolean bl, FloatBuffer floatBuffer) {
        void b2;
        FloatBuffer c2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniformMatrix4ARB(a2, (boolean)b2, c2);
            return;
        }
        GL20.glUniformMatrix4(a2, (boolean)b2, c2);
    }

    public static void D(int a2) {
        if (ca) {
            ARBShaderObjects.glDeleteObjectARB(a2);
            return;
        }
        GL20.glDeleteProgram(a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void l(int n2, int n3, int n4, int n5) {
        int d2 = n5;
        int a2 = n2;
        if (!A) return;
        switch (h) {
            case 0: {
                void b2;
                void c2;
                GL30.glFramebufferRenderbuffer(a2, (int)c2, (int)b2, d2);
                return;
            }
            case 1: {
                void b2;
                void c2;
                ARBFramebufferObject.glFramebufferRenderbuffer(a2, (int)c2, (int)b2, d2);
                return;
            }
            case 2: {
                void b2;
                void c2;
                EXTFramebufferObject.glFramebufferRenderbufferEXT(a2, (int)c2, (int)b2, d2);
                return;
            }
        }
    }

    public static String f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            return ARBShaderObjects.glGetInfoLogARB(a2, b2);
        }
        return GL20.glGetProgramInfoLog(a2, b2);
    }

    public static int f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            return ARBShaderObjects.glGetObjectParameteriARB(a2, b2);
        }
        return GL20.glGetShaderi(a2, b2);
    }

    public nka_1() {
        nka_1 a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void f(int n2, int n3, int n4, int n5) {
        int d2 = n5;
        int a2 = n2;
        if (!A) return;
        switch (h) {
            case 0: {
                void b2;
                void c2;
                GL30.glRenderbufferStorage(a2, (int)c2, (int)b2, d2);
                return;
            }
            case 1: {
                void b2;
                void c2;
                ARBFramebufferObject.glRenderbufferStorage(a2, (int)c2, (int)b2, d2);
                return;
            }
            case 2: {
                void b2;
                void c2;
                EXTFramebufferObject.glRenderbufferStorageEXT(a2, (int)c2, (int)b2, d2);
                return;
            }
        }
    }

    public static void A(int a2) {
        if (ca) {
            ARBShaderObjects.glLinkProgramARB(a2);
            return;
        }
        GL20.glLinkProgram(a2);
    }

    public static void i(int a2) {
        if (Y) {
            ARBVertexBufferObject.glDeleteBuffersARB(a2);
            return;
        }
        GL15.glDeleteBuffers(a2);
    }

    public static void C(int n2, IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform4ARB(a2, b2);
            return;
        }
        GL20.glUniform4(a2, b2);
    }

    public static void C(int n2, FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform4ARB(a2, b2);
            return;
        }
        GL20.glUniform4(a2, b2);
    }

    public static void M(int a2) {
        if (O) {
            ARBMultitexture.glActiveTextureARB(a2);
            return;
        }
        GL13.glActiveTexture(a2);
    }

    public static int C() {
        if (Y) {
            return ARBVertexBufferObject.glGenBuffersARB();
        }
        return GL15.glGenBuffers();
    }

    public static boolean l() {
        return R;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, ByteBuffer byteBuffer, int n3) {
        void b2;
        int c2 = n3;
        int a2 = n2;
        if (Y) {
            ARBVertexBufferObject.glBufferDataARB(a2, (ByteBuffer)b2, c2);
            return;
        }
        GL15.glBufferData(a2, (ByteBuffer)b2, c2);
    }

    public static boolean f() {
        if (Config.ha()) {
            return uSa.E != 0;
        }
        if (Config.ka()) {
            return uSa.E != 0;
        }
        if (A && Kpa.J().z.qA) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int l() {
        if (ca) {
            return ARBShaderObjects.glCreateProgramObjectARB();
        }
        return GL20.glCreateProgram();
    }

    public static String f() {
        if (E == null) {
            return Jta.F;
        }
        return E;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(int a2) {
        if (!A) return;
        switch (h) {
            case 0: {
                GL30.glDeleteFramebuffers(a2);
                return;
            }
            case 1: {
                ARBFramebufferObject.glDeleteFramebuffers(a2);
                return;
            }
            case 2: {
                EXTFramebufferObject.glDeleteFramebuffersEXT(a2);
                return;
            }
        }
    }

    public static int f(int n2, CharSequence charSequence) {
        CharSequence b2 = charSequence;
        int a2 = n2;
        if (ca) {
            return ARBVertexShader.glGetAttribLocationARB(a2, b2);
        }
        return GL20.glGetAttribLocation(a2, b2);
    }

    public static boolean J() {
        if (Config.y()) {
            return uSa.E != 0;
        }
        if (b && Kpa.J().z.hA) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, float f2, float f3) {
        int n3;
        void b2;
        float c2 = f3;
        int a2 = n2;
        if (O) {
            ARBMultitexture.glMultiTexCoord2fARB(a2, (float)b2, c2);
            n3 = a2;
        } else {
            GL13.glMultiTexCoord2f(a2, (float)b2, c2);
            n3 = a2;
        }
        if (n3 == P) {
            ja = b2;
            u = c2;
        }
    }

    public static String J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            return ARBShaderObjects.glGetInfoLogARB(a2, b2);
        }
        return GL20.glGetShaderInfoLog(a2, b2);
    }

    public static void l(int n2, FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform3ARB(a2, b2);
            return;
        }
        GL20.glUniform3(a2, b2);
    }

    public static void f(int n2, FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform1ARB(a2, b2);
            return;
        }
        GL20.glUniform1(a2, b2);
    }

    public static void J(int n2, ByteBuffer byteBuffer) {
        ByteBuffer b2 = byteBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glShaderSourceARB(a2, b2);
            return;
        }
        GL20.glShaderSource(a2, b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(int a2) {
        if (!A) return;
        switch (h) {
            case 0: {
                GL30.glDeleteRenderbuffers(a2);
                return;
            }
            case 1: {
                ARBFramebufferObject.glDeleteRenderbuffers(a2);
                return;
            }
            case 2: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT(a2);
                return;
            }
        }
    }

    static {
        W = Mqa.y;
        ja = JPa.N;
        u = JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, int n5) {
        int d2 = n3;
        int c2 = n2;
        if (s) {
            void a2;
            void b2;
            if (z) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT(c2, d2, (int)b2, (int)a2);
                return;
            }
            GL14.glBlendFuncSeparate(c2, d2, (int)b2, (int)a2);
            return;
        }
        GL11.glBlendFunc(c2, d2);
    }

    public static void l(int n2, IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform3ARB(a2, b2);
            return;
        }
        GL20.glUniform3(a2, b2);
    }

    public static void C(int a2) {
        if (ca) {
            ARBShaderObjects.glDeleteObjectARB(a2);
            return;
        }
        GL20.glDeleteShader(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int n2, boolean bl, FloatBuffer floatBuffer) {
        void b2;
        FloatBuffer c2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniformMatrix2ARB(a2, (boolean)b2, c2);
            return;
        }
        GL20.glUniformMatrix2(a2, (boolean)b2, c2);
    }

    public static void d(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glAttachObjectARB(a2, b2);
            return;
        }
        GL20.glAttachShader(a2, b2);
    }

    public static void l(int a2) {
        if (ca) {
            ARBShaderObjects.glCompileShaderARB(a2);
            return;
        }
        GL20.glCompileShader(a2);
    }

    /*
     * Unable to fully structure code
     */
    public static void J() {
        block26: {
            block30: {
                block32: {
                    block28: {
                        block31: {
                            block29: {
                                Config.f();
                                var0 = GLContext.getCapabilities();
                                nka_1.O = var0.GL_ARB_multitexture != false && var0.OpenGL13 == false ? vRa.d : uSa.E;
                                nka_1.a = var0.GL_ARB_texture_env_combine != false && var0.OpenGL13 == false ? vRa.d : uSa.E;
                                v0 = (int)nka_1.a;
                                if (nka_1.O) {
                                    v1 = new StringBuilder();
                                    nka_1.W = v1.insert(3 & 4, nka_1.W).append(Ssa.Fa).toString();
                                    nka_1.v = YSa.Ka;
                                    nka_1.P = fTa.l;
                                    nka_1.c = qsa.L;
                                } else {
                                    v1 = new StringBuilder();
                                    nka_1.W = v1.insert(2 & 5, nka_1.W).append(Ira.ha).toString();
                                    nka_1.v = YSa.Ka;
                                    nka_1.P = fTa.l;
                                    nka_1.c = qsa.L;
                                }
                                if (nka_1.a) {
                                    v2 = new StringBuilder();
                                    nka_1.W = v2.insert(3 ^ 3, nka_1.W).append(qta.ja).toString();
                                    nka_1.m = Upa.A;
                                    nka_1.t = vTa.U;
                                    nka_1.f = Rua.F;
                                    nka_1.T = jsa.Aa;
                                    nka_1.S = BQa.A;
                                    nka_1.X = bSa.o;
                                    nka_1.Ka = Ira.W;
                                    nka_1.Aa = rSa.j;
                                    nka_1.Ja = hpa.Ka;
                                    nka_1.D = vsa.fa;
                                    nka_1.e = fqa.Ia;
                                    nka_1.j = vRa.I;
                                    nka_1.B = Qpa.r;
                                    nka_1.x = aQa.Ha;
                                    nka_1.H = TOa.N;
                                    nka_1.r = XTa.m;
                                    nka_1.d = Epa.D;
                                    nka_1.q = Tqa.g;
                                    nka_1.L = dsa.Da;
                                    v3 = var0;
                                } else {
                                    v2 = new StringBuilder();
                                    nka_1.W = v2.insert(3 >> 2, nka_1.W).append(ITa.D).toString();
                                    nka_1.m = Upa.A;
                                    nka_1.t = vTa.U;
                                    nka_1.f = Rua.F;
                                    nka_1.T = jsa.Aa;
                                    nka_1.S = BQa.A;
                                    nka_1.X = bSa.o;
                                    nka_1.Ka = Ira.W;
                                    nka_1.Aa = rSa.j;
                                    nka_1.Ja = hpa.Ka;
                                    nka_1.D = vsa.fa;
                                    nka_1.e = fqa.Ia;
                                    nka_1.j = vRa.I;
                                    nka_1.B = Qpa.r;
                                    nka_1.x = aQa.Ha;
                                    nka_1.H = TOa.N;
                                    nka_1.r = XTa.m;
                                    nka_1.d = Epa.D;
                                    nka_1.q = Tqa.g;
                                    nka_1.L = dsa.Da;
                                    v3 = var0;
                                }
                                nka_1.z = v3.GL_EXT_blend_func_separate != false && var0.OpenGL14 == false ? vRa.d : uSa.E;
                                nka_1.s = var0.OpenGL14 != false || var0.GL_EXT_blend_func_separate != false ? vRa.d : uSa.E;
                                nka_1.A = nka_1.s != false && (var0.GL_ARB_framebuffer_object != false || var0.GL_EXT_framebuffer_object != false || var0.OpenGL30 != false) ? vRa.d : uSa.E;
                                v4 = (int)nka_1.A;
                                if (!nka_1.A) break block28;
                                nka_1.W = new StringBuilder().insert(2 & 5, nka_1.W).append(Fsa.E).toString();
                                if (!var0.OpenGL30) break block29;
                                nka_1.W = new StringBuilder().insert(3 ^ 3, nka_1.W).append(oua.d).toString();
                                nka_1.h = uSa.E;
                                nka_1.Q = zsa.h;
                                nka_1.G = sOa.g;
                                nka_1.l = rua.t;
                                nka_1.Ga = zua.J;
                                nka_1.Z = NOa.r;
                                nka_1.g = pPa.G;
                                nka_1.I = Era.R;
                                nka_1.fa = Iqa.Aa;
                                nka_1.n = gQa.la;
                                nka_1.N = dpa.Da;
                                nka_1.K = WPa.q;
                                nka_1.Ha = jsa.j;
                                v5 = var0;
                                break block30;
                            }
                            if (!var0.GL_ARB_framebuffer_object) break block31;
                            nka_1.W = new StringBuilder().insert(5 >> 3, nka_1.W).append(yQa.x).toString();
                            nka_1.h = vRa.d;
                            nka_1.Q = zsa.h;
                            nka_1.G = sOa.g;
                            nka_1.l = rua.t;
                            nka_1.Ga = zua.J;
                            nka_1.Z = NOa.r;
                            nka_1.g = pPa.G;
                            nka_1.I = Era.R;
                            nka_1.fa = Iqa.Aa;
                            nka_1.N = dpa.Da;
                            nka_1.n = gQa.la;
                            nka_1.K = WPa.q;
                            nka_1.Ha = jsa.j;
                            v5 = var0;
                            break block30;
                        }
                        if (!var0.GL_EXT_framebuffer_object) break block32;
                        nka_1.W = new StringBuilder().insert(3 ^ 3, nka_1.W).append(Zua.n).toString();
                        nka_1.h = uqa.g;
                        nka_1.Q = zsa.h;
                        nka_1.G = sOa.g;
                        nka_1.l = rua.t;
                        nka_1.Ga = zua.J;
                        nka_1.Z = NOa.r;
                        nka_1.g = pPa.G;
                        nka_1.I = Era.R;
                        nka_1.fa = Iqa.Aa;
                        nka_1.N = dpa.Da;
                        nka_1.n = gQa.la;
                        nka_1.K = WPa.q;
                        nka_1.Ha = jsa.j;
                        v5 = var0;
                        break block30;
                    }
                    nka_1.W = new StringBuilder().insert(5 >> 3, nka_1.W).append(Uqa.ha).toString();
                    nka_1.W = new StringBuilder().insert(0, nka_1.W).append(Xpa.W).append(var0.OpenGL14 != false ? Mqa.y : Uqa.c).append(rSa.Ia).toString();
                    nka_1.W = new StringBuilder().insert(0, nka_1.W).append(Zta.f).append(var0.GL_EXT_blend_func_separate != false ? Mqa.y : Uqa.c).append(rSa.Ia).toString();
                    nka_1.W = new StringBuilder().insert(0, nka_1.W).append(hQa.r).append(var0.OpenGL30 != false ? Mqa.y : Uqa.c).append(rSa.Ia).toString();
                    nka_1.W = new StringBuilder().insert(0, nka_1.W).append(aQa.y).append(var0.GL_ARB_framebuffer_object != false ? Mqa.y : Uqa.c).append(MQa.Aa).toString();
                    nka_1.W = new StringBuilder().insert(0, nka_1.W).append(zOa.Ga).append(var0.GL_EXT_framebuffer_object != false ? Mqa.y : Uqa.c).append(dpa.p).toString();
                }
                v5 = var0;
            }
            nka_1.F = v5.OpenGL21;
            nka_1.J = nka_1.F != false || var0.GL_ARB_vertex_shader != false && var0.GL_ARB_fragment_shader != false && var0.GL_ARB_shader_objects != false ? vRa.d : uSa.E;
            nka_1.W = new StringBuilder().insert(0, nka_1.W).append(ZRa.g).append(nka_1.J != false ? Mqa.y : Uqa.c).append(vPa.k).toString();
            if (nka_1.J) {
                if (var0.OpenGL21) {
                    v6 = new StringBuilder();
                    nka_1.W = v6.insert(0, nka_1.W).append(Ora.N).toString();
                    nka_1.ca = uSa.E;
                    nka_1.V = FRa.G;
                    nka_1.o = DQa.y;
                    nka_1.p = ISa.I;
                    nka_1.y = vTa.fa;
                } else {
                    v6 = new StringBuilder();
                    nka_1.W = v6.insert(0, nka_1.W).append(Vra.T).toString();
                    nka_1.ca = vRa.d;
                    nka_1.V = FRa.G;
                    nka_1.o = DQa.y;
                    nka_1.p = ISa.I;
                    nka_1.y = vTa.fa;
                }
            } else {
                nka_1.W = new StringBuilder().insert(0, nka_1.W).append(Ura.Ga).append(var0.OpenGL21 != false ? Mqa.y : Uqa.c).append(rSa.Ia).toString();
                nka_1.W = new StringBuilder().insert(0, nka_1.W).append(xua.U).append(var0.GL_ARB_shader_objects != false ? Mqa.y : Uqa.c).append(rSa.Ia).toString();
                nka_1.W = new StringBuilder().insert(0, nka_1.W).append(Jsa.Q).append(var0.GL_ARB_vertex_shader != false ? Mqa.y : Uqa.c).append(MQa.Aa).toString();
                nka_1.W = new StringBuilder().insert(0, nka_1.W).append(mSa.c).append(var0.GL_ARB_fragment_shader != false ? Mqa.y : Uqa.c).append(dpa.p).toString();
            }
            nka_1.R = nka_1.A != false && nka_1.J != false ? vRa.d : uSa.E;
            var1_1 = GL11.glGetString(PRa.m).toLowerCase();
            nka_1.C = var1_1.contains(SOa.ga);
            nka_1.Y = var0.OpenGL15 == false && var0.GL_ARB_vertex_buffer_object != false ? vRa.d : uSa.E;
            nka_1.b = var0.OpenGL15 != false || nka_1.Y != false ? vRa.d : uSa.E;
            nka_1.W = new StringBuilder().insert(0, nka_1.W).append(hra.e).append(nka_1.b != false ? Mqa.y : Uqa.c).append(vPa.k).toString();
            if (!nka_1.b) ** GOTO lbl176
            if (nka_1.Y) {
                v7 = new StringBuilder();
                nka_1.W = v7.insert(0, nka_1.W).append(Qra.Da).toString();
                nka_1.M = Pua.F;
                nka_1.U = Qta.T;
                v8 = var1_1;
            } else {
                v7 = new StringBuilder();
                nka_1.W = v7.insert(0, nka_1.W).append(JQa.ca).toString();
                nka_1.M = Pua.F;
                nka_1.U = Qta.T;
lbl176:
                // 2 sources

                v8 = var1_1;
            }
            nka_1.k = v8.contains(Psa.Ka);
            if (nka_1.k) {
                if (nka_1.b) {
                    nka_1.i = vRa.d;
                } else {
                    Fha.RENDER_DISTANCE.setValueMax(Yra.i);
                }
            }
            try {
                block27: {
                    var1_1 = Runtime.getRuntime().exec(uSa.j);
                    var2_3 = new BufferedReader(new InputStreamReader(var1_1.getInputStream()));
                    var3_4 = null;
                    while ((var4_5 = var2_3.readLine()) != null) {
                        if (var4_5.trim().isEmpty() || var4_5.contains(DQa.N)) continue;
                        nka_1.E = var4_5.trim();
                    }
                    if (var2_3 == null) break block26;
                    if (var3_4 == null) break block27;
                    try {
                        var2_3.close();
                        return;
                    }
                    catch (Throwable var4_6) {
                        var3_4.addSuppressed(var4_6);
                        return;
                    }
                }
                var2_3.close();
                return;
                catch (Throwable var4_7) {
                    try {
                        var3_4 = var4_7;
                        throw var3_4;
                    }
                    catch (Throwable var5_9) {
                        if (var2_3 == null) ** GOTO lbl219
                        if (var3_4 != null) {
                            try {
                                var2_3.close();
                                v9 = var5_9;
                            }
                            catch (Throwable var4_8) {
                                v9 = var5_9;
                                var3_4.addSuppressed(var4_8);
                            }
                        } else {
                            var2_3.close();
lbl219:
                            // 2 sources

                            v9 = var5_9;
                        }
                        throw v9;
                    }
                }
            }
            catch (IOException var1_2) {
                nka_1.E = Usa.O;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, boolean bl, FloatBuffer floatBuffer) {
        void b2;
        FloatBuffer c2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniformMatrix3ARB(a2, (boolean)b2, c2);
            return;
        }
        GL20.glUniformMatrix3(a2, (boolean)b2, c2);
    }

    public static void C(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform1iARB(a2, b2);
            return;
        }
        GL20.glUniform1i(a2, b2);
    }

    public static void f(int n2, IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform2ARB(a2, b2);
            return;
        }
        GL20.glUniform2(a2, b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void l(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (!A) return;
        switch (h) {
            case 0: {
                GL30.glBindFramebuffer(a2, b2);
                return;
            }
            case 1: {
                ARBFramebufferObject.glBindFramebuffer(a2, b2);
                return;
            }
            case 2: {
                EXTFramebufferObject.glBindFramebufferEXT(a2, b2);
                return;
            }
        }
    }

    public static void f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (Y) {
            ARBVertexBufferObject.glBindBufferARB(a2, b2);
            return;
        }
        GL15.glBindBuffer(a2, b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int J(int a2) {
        if (!A) {
            return pua.o;
        }
        switch (h) {
            case 0: {
                return GL30.glCheckFramebufferStatus(a2);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus(a2);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT(a2);
            }
        }
        return pua.o;
    }

    public static void f(int a2) {
        if (ca) {
            ARBShaderObjects.glUseProgramObjectARB(a2);
            return;
        }
        GL20.glUseProgram(a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void J(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2;
        n2 = n6;
        int a2 = n7;
        if (!A) return;
        switch (h) {
            case 0: {
                int e2;
                void b2;
                void c2;
                void d2;
                GL30.glFramebufferTexture2D(a2, (int)d2, (int)c2, (int)b2, e2);
                return;
            }
            case 1: {
                int e2;
                void b2;
                void c2;
                void d2;
                ARBFramebufferObject.glFramebufferTexture2D(a2, (int)d2, (int)c2, (int)b2, e2);
                return;
            }
            case 2: {
                int e2;
                void b2;
                void c2;
                void d2;
                EXTFramebufferObject.glFramebufferTexture2DEXT(a2, (int)d2, (int)c2, (int)b2, e2);
                return;
            }
        }
    }

    public static int f() {
        if (!A) {
            return pua.o;
        }
        switch (h) {
            case 0: {
                int n2 = GL30.glGenFramebuffers();
                while (false) {
                }
                return n2;
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return pua.o;
    }

    public static int J(int n2, CharSequence charSequence) {
        CharSequence b2 = charSequence;
        int a2 = n2;
        if (ca) {
            return ARBShaderObjects.glGetUniformLocationARB(a2, b2);
        }
        return GL20.glGetUniformLocation(a2, b2);
    }

    public static void J(int a2) {
        if (O) {
            ARBMultitexture.glClientActiveTextureARB(a2);
            return;
        }
        GL13.glClientActiveTexture(a2);
    }

    public static String J() {
        return W;
    }

    public static void J(int n2, FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform2ARB(a2, b2);
            return;
        }
        GL20.glUniform2(a2, b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (!A) return;
        switch (h) {
            case 0: {
                GL30.glBindRenderbuffer(a2, b2);
                return;
            }
            case 1: {
                ARBFramebufferObject.glBindRenderbuffer(a2, b2);
                return;
            }
            case 2: {
                EXTFramebufferObject.glBindRenderbufferEXT(a2, b2);
                return;
            }
        }
    }

    public static void J(int n2, IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        int a2 = n2;
        if (ca) {
            ARBShaderObjects.glUniform1ARB(a2, b2);
            return;
        }
        GL20.glUniform1(a2, b2);
    }

    public static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (ca) {
            return ARBShaderObjects.glGetObjectParameteriARB(a2, b2);
        }
        return GL20.glGetProgrami(a2, b2);
    }

    public static int J() {
        if (!A) {
            return pua.o;
        }
        switch (h) {
            case 0: {
                int n2 = GL30.glGenRenderbuffers();
                while (false) {
                }
                return n2;
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return pua.o;
    }
}

