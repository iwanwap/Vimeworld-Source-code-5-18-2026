/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  bP
 *  pqa
 *  rP
 *  vRa
 */
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rP_2 {
    private final Matrix3f J;
    private final Matrix4f A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        rP_2 b2 = this;
        void v0 = c2;
        b2.A.scale((float)v0, d2, (float)a2);
        if (Math.abs((float)v0) == Math.abs(d2) && Math.abs(d2) == Math.abs((float)a2)) {
            if (c2 < JPa.N || d2 < JPa.N || a2 < JPa.N) {
                b2.J.scale(Math.signum((float)c2), Math.signum(d2), Math.signum((float)a2));
                return;
            }
        } else {
            b2.J.scale(pqa.r / c2, pqa.r / d2, pqa.r / a2);
            b2.I = uSa.E;
        }
    }

    public void J(Quaternionfc quaternionfc) {
        Quaternionfc b2 = quaternionfc;
        rP_2 a2 = this;
        a2.A.rotate(b2);
        a2.J.rotate(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(Vector3fc vector3fc, Vector3f vector3f) {
        void a2;
        Vector3fc c2 = vector3fc;
        rP_2 b2 = this;
        return b2.J(c2.x(), c2.y(), c2.z(), (Vector3f)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Matrix4f J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        rP_2 a2 = this;
        return a2.A.translate((float)c2, (float)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(float f2, float f3, float f4, Vector3f vector3f) {
        void a2;
        void b2;
        void c2;
        rP_2 d2;
        float e22 = f2;
        rP_2 rP_22 = d2 = this;
        Vector3f e22 = rP_22.J.transform(e22, (float)c2, (float)b2, (Vector3f)a2);
        if (rP_22.I) {
            return e22;
        }
        return e22.normalize();
    }

    public Matrix4f J() {
        rP_2 a2;
        return a2.A;
    }

    public void J(Matrix4fc matrix4fc) {
        Matrix4fc b2 = matrix4fc;
        rP_2 a2 = this;
        Object object = b2;
        a2.A.mul((Matrix4fc)object);
        if (!bP.f((Matrix4fc)object)) {
            if (bP.J((Matrix4fc)b2)) {
                a2.J.mul(new Matrix3f(b2));
                return;
            }
            a2.f();
        }
    }

    public Matrix3f J() {
        rP_2 a2;
        return a2.J;
    }

    public rP_2() {
        rP_2 a2;
        rP_2 rP_22 = a2;
        a2.A = new Matrix4f();
        rP_22.J = new Matrix3f();
        a2.I = vRa.d;
    }

    public rP J() {
        rP_2 a2;
        rP_2 rP_22 = new rP_2();
        rP_22.J((rP)a2);
        return rP_22;
    }

    private void f() {
        rP_2 a2;
        rP_2 rP_22 = a2;
        rP_22.J.set(rP_22.A).invert().transpose();
        a2.I = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Quaternionfc quaternionfc, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        Quaternionfc e2 = quaternionfc;
        rP_2 d2 = this;
        d2.A.rotateAround(e2, (float)c2, (float)b2, (float)a2);
        d2.J.rotate(e2);
    }

    public void J(rP rP2) {
        rP_2 b2 = rP2;
        rP_2 a2 = this;
        a2.A.set(b2.A);
        a2.J.set(b2.J);
        a2.I = b2.I;
    }

    public void J() {
        rP_2 a2;
        a2.A.identity();
        a2.J.identity();
        a2.I = vRa.d;
    }
}

