/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FIa
 *  KTa
 *  NQa
 *  NTa
 *  Vua
 *  XTa
 *  Ypa
 *  Yra
 *  dpa
 *  lqa
 *  nka
 *  pPa
 *  pua
 *  vRa
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class pha_1 {
    private final String m;
    private final int C;
    private boolean i;
    private int M;
    private static final Logger k = LogManager.getLogger();
    private final IntBuffer j;
    private final FloatBuffer J;
    private final int A;
    private final FIa I;

    private void d() {
        pha_1 a2;
        a2.i = vRa.d;
        if (a2.I != null) {
            a2.I.l();
        }
    }

    public void J(float[] fArray) {
        Object b2 = fArray;
        pha_1 a2 = this;
        if (((Object)b2).length < a2.A) {
            k.warn(new StringBuilder().insert(2 & 5, Yra.N).append(a2.A).append(yOa.U).append(((Object)b2).length).append(wua.z).toString());
            return;
        }
        a2.J.position(uSa.E);
        a2.J.put((float[])b2);
        a2.J.position(uSa.E);
        a2.d();
    }

    private void C() {
        pha_1 a2;
        switch (a2.C) {
            case 4: {
                pha_1 pha_12 = a2;
                while (false) {
                }
                nka.f((int)pha_12.M, (FloatBuffer)pha_12.J);
                return;
            }
            case 5: {
                pha_1 pha_13 = a2;
                nka.J((int)pha_13.M, (FloatBuffer)pha_13.J);
                return;
            }
            case 6: {
                pha_1 pha_14 = a2;
                nka.l((int)pha_14.M, (FloatBuffer)pha_14.J);
                return;
            }
            case 7: {
                pha_1 pha_15 = a2;
                nka.C((int)pha_15.M, (FloatBuffer)pha_15.J);
                return;
            }
        }
        k.warn(new StringBuilder().insert(3 ^ 3, BQa.L).append(a2.A).append(dsa.c).toString());
    }

    public String J() {
        pha_1 a2;
        return a2.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l() {
        pha_1 a2;
        switch (a2.C) {
            case 8: {
                nka.f((int)a2.M, vRa.d != 0, (FloatBuffer)a2.J);
                return;
            }
            case 9: {
                nka.J((int)a2.M, vRa.d != 0, (FloatBuffer)a2.J);
                return;
            }
            case 10: {
                nka.l((int)a2.M, vRa.d != 0, (FloatBuffer)a2.J);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        void q2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f18;
        void g2;
        void h2;
        void i2;
        void j2;
        void k2;
        void l2;
        void m2;
        void n2;
        void o2;
        void p;
        float f19 = f17;
        pha_1 a2 = this;
        a2.J.position(uSa.E);
        a2.J.put(uSa.E, (float)p);
        a2.J.put(vRa.d, (float)o2);
        a2.J.put(uqa.g, (float)n2);
        a2.J.put(yRa.d, (float)m2);
        a2.J.put(AQa.P, (float)l2);
        a2.J.put(tTa.h, (float)k2);
        a2.J.put(uua.p, (float)j2);
        a2.J.put(XTa.W, (float)i2);
        a2.J.put(Yqa.i, (float)h2);
        a2.J.put(WOa.fa, (float)g2);
        a2.J.put(NTa.C, (float)f18);
        a2.J.put(pPa.f, (float)e2);
        a2.J.put(lqa.s, (float)d2);
        a2.J.put(uua.s, (float)c2);
        a2.J.put(hpa.Z, (float)b2);
        a2.J.put(Ypa.A, (float)q2);
        a2.d();
    }

    public void J(Matrix4f matrix4f) {
        Matrix4f b2 = matrix4f;
        pha_1 a2 = this;
        Object object = b2;
        Object object2 = b2;
        Object object3 = b2;
        Object object4 = b2;
        Object object5 = b2;
        Object object6 = b2;
        Matrix4f matrix4f2 = b2;
        Matrix4f matrix4f3 = b2;
        a2.J(((Matrix4f)object).m00, ((Matrix4f)object).m01, ((Matrix4f)object2).m02, ((Matrix4f)object2).m03, ((Matrix4f)object3).m10, ((Matrix4f)object3).m11, ((Matrix4f)object4).m12, ((Matrix4f)object4).m13, ((Matrix4f)object5).m20, ((Matrix4f)object5).m21, ((Matrix4f)object6).m22, ((Matrix4f)object6).m23, matrix4f2.m30, matrix4f2.m31, matrix4f3.m32, matrix4f3.m33);
    }

    public void f() {
        pha_1 a2;
        if (!a2.i) {
            // empty if block
        }
        a2.i = uSa.E;
        if (a2.C <= yRa.d) {
            a2.J();
            return;
        }
        if (a2.C <= XTa.W) {
            a2.C();
            return;
        }
        if (a2.C > NTa.C) {
            k.warn(new StringBuilder().insert(3 >> 2, KTa.z).append(a2.C).append(NQa.V).toString());
            return;
        }
        a2.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3) {
        void b2;
        float c2 = f3;
        pha_1 a2 = this;
        a2.J.position(uSa.E);
        a2.J.put(uSa.E, (float)b2);
        a2.J.put(vRa.d, c2);
        a2.d();
    }

    public static int J(String string) {
        String string2 = string;
        int a2 = pua.o;
        if (string2.equals(iSa.g)) {
            a2 = uSa.E;
            return a2;
        }
        if (string2.equals(XOa.o)) {
            a2 = AQa.P;
            return a2;
        }
        if (string2.startsWith(TOa.s)) {
            if (string2.endsWith(zOa.Ja)) {
                a2 = Yqa.i;
                return a2;
            }
            if (string2.endsWith(Hta.Ha)) {
                a2 = WOa.fa;
                return a2;
            }
            if (string2.endsWith(Vua.M)) {
                a2 = NTa.C;
            }
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f6 = f5;
        pha_1 a2 = this;
        a2.J.position(uSa.E);
        a2.J.put((float)d2);
        a2.J.put((float)c2);
        a2.J.put((float)b2);
        a2.J.put((float)e2);
        a2.J.flip();
        a2.d();
    }

    private void J() {
        pha_1 a2;
        switch (a2.C) {
            case 0: {
                pha_1 pha_12 = a2;
                while (false) {
                }
                nka.J((int)pha_12.M, (IntBuffer)pha_12.j);
                return;
            }
            case 1: {
                pha_1 pha_13 = a2;
                nka.f((int)pha_13.M, (IntBuffer)pha_13.j);
                return;
            }
            case 2: {
                pha_1 pha_14 = a2;
                nka.l((int)pha_14.M, (IntBuffer)pha_14.j);
                return;
            }
            case 3: {
                pha_1 pha_15 = a2;
                nka.C((int)pha_15.M, (IntBuffer)pha_15.j);
                return;
            }
        }
        k.warn(new StringBuilder().insert(3 & 4, BQa.L).append(a2.A).append(dpa.ca).toString());
    }

    public void J(int n2) {
        int b2 = n2;
        pha_1 a2 = this;
        a2.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public pha_1(String string, int n2, int n3, FIa fIa2) {
        pha_1 pha_12;
        void a2;
        void c2;
        void d2;
        pha_1 b2;
        int e2 = n3;
        pha_1 pha_13 = b2 = this;
        pha_1 pha_14 = b2;
        pha_14.m = d2;
        pha_14.A = e2;
        pha_13.C = c2;
        pha_13.I = a2;
        if (c2 <= yRa.d) {
            pha_12 = b2;
            b2.j = BufferUtils.createIntBuffer(e2);
            b2.J = null;
        } else {
            pha_12 = b2;
            pha_1 pha_15 = b2;
            pha_15.j = null;
            pha_15.J = BufferUtils.createFloatBuffer(e2);
        }
        pha_12.M = pua.o;
        b2.d();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        pha_1 a2;
        int n6 = n5;
        pha_1 pha_12 = a2 = this;
        pha_12.j.position(uSa.E);
        if (pha_12.C >= 0) {
            void d2;
            a2.j.put(uSa.E, (int)d2);
        }
        if (a2.C >= vRa.d) {
            void c2;
            a2.j.put(vRa.d, (int)c2);
        }
        if (a2.C >= uqa.g) {
            void b2;
            a2.j.put(uqa.g, (int)b2);
        }
        if (a2.C >= yRa.d) {
            void e2;
            a2.j.put(yRa.d, (int)e2);
        }
        a2.d();
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5) {
        pha_1 a2;
        float f6 = f5;
        pha_1 pha_12 = a2 = this;
        pha_12.J.position(uSa.E);
        if (pha_12.C >= AQa.P) {
            void d2;
            a2.J.put(uSa.E, (float)d2);
        }
        if (a2.C >= tTa.h) {
            void c2;
            a2.J.put(vRa.d, (float)c2);
        }
        if (a2.C >= uua.p) {
            void b2;
            a2.J.put(uqa.g, (float)b2);
        }
        if (a2.C >= XTa.W) {
            void e2;
            a2.J.put(yRa.d, (float)e2);
        }
        a2.d();
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        pha_1 a2 = this;
        a2.J.position(uSa.E);
        a2.J.put(uSa.E, (float)c2);
        a2.J.put(vRa.d, (float)b2);
        a2.J.put(uqa.g, d2);
        a2.d();
    }

    public void J(float f2) {
        float b2 = f2;
        pha_1 a2 = this;
        a2.J.position(uSa.E);
        a2.J.put(uSa.E, b2);
        a2.d();
    }
}

