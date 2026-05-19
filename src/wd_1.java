/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bf
 *  JPa
 *  pqa
 *  vRa
 *  wd
 */
import java.util.ArrayList;
import java.util.List;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wd_1 {
    private float B;
    private final Matrix4f d;
    private final Vector3f a;
    private float b;
    private float l;
    private final Matrix4f e;
    private final String G;
    private final Matrix4f D;
    private float f;
    private float F;
    private final Vector3f g;
    private wd L;
    private float E;
    private final Matrix4f m;
    private List<Bf> C;
    private int i;
    private float M;
    private float k;
    private float j;
    private final Matrix4f J;
    private final String A;
    private float I;

    public float D() {
        wd_1 a2;
        return a2.b;
    }

    public void J(int n2) {
        int b2 = n2;
        wd_1 a2 = this;
        a2.i = b2;
    }

    public void l() {
        wd_1 a2;
        wd_1 wd_12 = a2;
        wd_12.D.setIdentity();
        wd_12.D.m03 = a2.k;
        a2.D.m13 = a2.M;
        wd_12.D.m23 = a2.E;
        wd_12.d.mul(a2.D);
        if (!wd_12.J()) {
            if (a2.B != JPa.N) {
                wd_1 wd_13 = a2;
                a2.D.rotZ(wd_13.B);
                wd_13.d.mul(a2.D);
            }
            if (a2.F != JPa.N) {
                wd_1 wd_14 = a2;
                a2.D.rotY(wd_14.F);
                wd_14.d.mul(a2.D);
            }
            if (a2.f != JPa.N) {
                wd_1 wd_15 = a2;
                a2.D.rotX(wd_15.f);
                wd_15.d.mul(a2.D);
            }
        }
        wd_1 wd_16 = a2;
        wd_16.D.setIdentity();
        wd_16.D.m00 = a2.l;
        a2.D.m11 = a2.I;
        wd_16.D.m22 = a2.j;
        wd_16.d.mul(a2.D);
    }

    /*
     * WARNING - void declaration
     */
    public wd_1(int n2, String string, String string2, Vector3f vector3f, Matrix4f matrix4f) {
        void b2;
        Matrix4f f2;
        void c2;
        void d2;
        void e2;
        wd_1 a2;
        wd_1 wd_12 = matrix4f2;
        Matrix4f matrix4f2 = matrix4f;
        wd_1 wd_13 = a2 = wd_12;
        wd_1 wd_14 = a2;
        wd_1 wd_15 = a2;
        wd_1 wd_16 = a2;
        wd_1 wd_17 = a2;
        a2.C = new ArrayList<Bf>();
        wd_17.d = new Matrix4f();
        a2.J = new Matrix4f();
        wd_16.e = new Matrix4f();
        wd_16.D = new Matrix4f();
        wd_16.i = e2;
        wd_15.A = d2;
        wd_15.G = c2;
        wd_14.m = f2;
        wd_14.g = b2;
        Matrix4f matrix4f3 = f2;
        wd_13.a = new Vector3f(matrix4f3.m03, matrix4f3.m13, f2.m23);
        Vector3f vector3f2 = new Vector3f((Vector3f)b2);
        vector3f2.sub(a2.a);
        a2.b = vector3f2.length();
        wd_13.J.set(f2);
        wd_13.J.invert();
        wd_13.e.setIdentity();
    }

    public Vector3f f() {
        wd_1 a2;
        return a2.a;
    }

    public float A() {
        wd_1 a2;
        return a2.k;
    }

    public Matrix4f e() {
        wd_1 a2;
        return a2.d;
    }

    public List<Bf> J() {
        wd_1 a2;
        return a2.C;
    }

    public float i() {
        wd_1 a2;
        return a2.M;
    }

    public void D(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.k = b2;
    }

    public float M() {
        wd_1 a2;
        return a2.F;
    }

    public Matrix4f d() {
        wd_1 a2;
        return a2.m;
    }

    public Matrix4f J(Matrix4f matrix4f) {
        Object b2 = matrix4f;
        wd_1 a2 = this;
        ((Matrix4f)b2).setIdentity();
        wd_1 wd_12 = a2;
        a2.d.set(wd_12.e);
        wd_12.l();
        if (wd_12.L != null) {
            b2 = new Matrix4f(a2.L.d);
        }
        Object object = b2;
        ((Matrix4f)object).mul(a2.d);
        return object;
    }

    public float e() {
        wd_1 a2;
        return a2.l;
    }

    public float d() {
        wd_1 a2;
        return a2.f;
    }

    public void A(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.E = b2;
    }

    public void i(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.j = b2;
    }

    public Matrix4f C() {
        wd_1 a2;
        return a2.J;
    }

    public void M(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.l = b2;
    }

    public void J(Bf bf2) {
        wd_1 b2 = bf2;
        wd_1 a2 = this;
        a2.C.add((Bf)b2);
    }

    public void e(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.M = b2;
    }

    public Matrix4f l() {
        wd_1 wd_12;
        wd_1 wd_13 = wd_12 = this;
        Matrix4f a2 = wd_13.J(new Matrix4f());
        wd_12.d.set(a2);
        wd_13.J();
        Object object = a2;
        ((Matrix4f)object).set(wd_12.d);
        ((Matrix4f)object).mul(wd_12.J);
        return object;
    }

    public void d(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.B = b2;
    }

    public void C(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.F = b2;
    }

    public float C() {
        wd_1 a2;
        return a2.E;
    }

    public void f() {
        wd_1 a2;
        a2.M = a2.E = JPa.N;
        a2.k = a2.E;
        a2.F = a2.B = JPa.N;
        a2.f = a2.B;
        a2.I = a2.j = pqa.r;
        a2.l = a2.j;
    }

    public boolean J() {
        wd_1 a2;
        if (!a2.C.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        Object object = this;
        if (((wd_1)object).J()) {
            Object a2;
            Object object2 = a2 = ((wd_1)object).C.iterator();
            while (object2.hasNext()) {
                ((Bf)a2.next()).J((wd)object);
                object2 = a2;
            }
        }
    }

    public float l() {
        wd_1 a2;
        return a2.j;
    }

    public void l(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.I = b2;
    }

    public Matrix4f f() {
        wd_1 a2;
        return a2.D;
    }

    public String f() {
        wd_1 a2;
        return a2.A;
    }

    public void J(List<Bf> list) {
        List<Bf> b2 = list;
        wd_1 a2 = this;
        a2.C = b2;
    }

    public Vector3f J() {
        wd_1 a2;
        return a2.g;
    }

    public int J() {
        wd_1 a2;
        return a2.i;
    }

    public float f() {
        wd_1 a2;
        return a2.B;
    }

    public String J() {
        wd_1 a2;
        return a2.G;
    }

    public float J() {
        wd_1 a2;
        return a2.I;
    }

    public void f(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.b = b2;
    }

    public Matrix4f J() {
        wd_1 a2;
        return a2.e;
    }

    public wd J() {
        wd_1 a2;
        return a2.L;
    }

    public void J(wd wd2) {
        wd_1 b2 = wd2;
        wd_1 a2 = this;
        a2.L = b2;
    }

    public void J(float f2) {
        float b2 = f2;
        wd_1 a2 = this;
        a2.f = b2;
    }
}

