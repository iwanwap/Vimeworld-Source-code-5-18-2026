/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  pqa
 *  wd
 */
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Bf_2 {
    private final Matrix4f M;
    private final int k;
    private final wd j;
    private final Vector4f J;
    private final Vector4f A;
    private final boolean I;

    public void J(wd wd2) {
        Vector3f vector3f;
        Bf_2 b2 = wd2;
        Bf_2 a2 = this;
        if (a2.k == 0 || a2.j == null) {
            return;
        }
        Bf_2 bf_2 = a2;
        Bf_2 bf_22 = a2;
        a2.A.set(JPa.N, JPa.N, JPa.N, pqa.r);
        bf_22.j.e().transform(a2.A);
        bf_22.J.set(JPa.N, JPa.N, JPa.N, pqa.r);
        b2.e().transform(a2.J);
        Bf_2 bf_23 = a2;
        bf_22.J.sub(bf_23.A);
        float f2 = bf_2.J.length();
        bf_23.M.set(b2.e());
        bf_2.M.invert();
        bf_2.J.set(a2.A);
        bf_2.M.transform(a2.J);
        Vector3f vector3f2 = new Vector3f(a2.J.x, a2.J.y, a2.J.z);
        vector3f2.normalize();
        bf_2.J.set(JPa.N, JPa.N, pqa.r, pqa.r);
        bf_2.j.e().transform(a2.J);
        Vector3f vector3f3 = vector3f = new Vector3f(JPa.N, pqa.r, JPa.N);
        vector3f.normalize();
        vector3f3.cross(vector3f2, vector3f3);
        vector3f3.normalize();
        Vector3f vector3f4 = new Vector3f(JPa.N, JPa.N, JPa.N);
        vector3f4.cross(vector3f, vector3f2);
        vector3f4.normalize();
        bf_2.M.setIdentity();
        bf_2.M.m00 = vector3f.x;
        bf_2.M.m10 = vector3f.y;
        bf_2.M.m20 = vector3f.z;
        bf_2.M.m01 = vector3f2.x;
        bf_2.M.m11 = vector3f2.y;
        bf_2.M.m21 = vector3f2.z;
        bf_2.M.m02 = vector3f4.x;
        bf_2.M.m12 = vector3f4.y;
        bf_2.M.m22 = vector3f4.z;
        if (bf_2.I) {
            Bf_2 bf_24 = a2;
            bf_24.J.set(JPa.N, f2 - b2.D(), JPa.N, pqa.r);
            bf_24.M.transform(a2.J);
            a2.M.m03 = a2.J.x;
            bf_24.M.m13 = a2.J.y;
            bf_24.M.m23 = a2.J.z;
        }
        Matrix4f matrix4f = new Matrix4f();
        Bf_2 bf_25 = b2;
        Bf_2 bf_26 = b2;
        bf_25.e().set(bf_26.J());
        bf_25.l();
        bf_26.e().mul(a2.M);
        if (bf_25.J() != null) {
            matrix4f = new Matrix4f(b2.J().e());
        }
        matrix4f.mul(b2.e());
        b2.e().set(matrix4f);
    }

    /*
     * WARNING - void declaration
     */
    public Bf_2(wd wd2, int n2, boolean bl) {
        void b2;
        void c2;
        Bf_2 a2;
        boolean d2 = bl;
        Bf_2 bf_2 = a2 = this;
        Bf_2 bf_22 = a2;
        Bf_2 bf_23 = a2;
        bf_23.A = new Vector4f();
        bf_22.J = new Vector4f();
        bf_22.M = new Matrix4f();
        bf_22.j = c2;
        bf_2.k = b2;
        bf_2.I = d2;
    }

    public int J() {
        Bf_2 a2;
        return a2.k;
    }

    public Vector4f f() {
        Bf_2 a2;
        return a2.A;
    }

    public Vector4f J() {
        Bf_2 a2;
        return a2.J;
    }

    public Matrix4f J() {
        Bf_2 a2;
        return a2.M;
    }

    public wd J() {
        Bf_2 a2;
        return a2.j;
    }

    public boolean J() {
        Bf_2 a2;
        return a2.I;
    }
}

