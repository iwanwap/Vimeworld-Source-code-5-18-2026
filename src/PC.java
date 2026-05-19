/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  kta
 *  vRa
 */
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Matrix4f;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PC {
    private Exception j;
    public Matrix4f J;
    public Matrix4f A;
    public Matrix4f I;

    /*
     * WARNING - void declaration
     */
    public PC(Matrix4d matrix4d, Matrix4d matrix4d2, Matrix4d matrix4d3) {
        void b2;
        void c2;
        PC a2;
        Matrix4d d2 = matrix4d3;
        PC pC = a2 = this;
        PC pC2 = a2;
        a2.I = new Matrix4f();
        pC2.A = new Matrix4f();
        a2.J = new Matrix4f();
        pC.j = null;
        a2.I.set((Matrix4d)c2);
        pC.A.set((Matrix4d)b2);
        pC.J.set(d2);
    }

    public Matrix3f f() {
        PC pC = this;
        Matrix3f a2 = new Matrix3f();
        PC pC2 = pC;
        a2.setIdentity();
        a2.m00 = pC2.J.m00;
        a2.m11 = pC2.J.m11;
        a2.m22 = pC.J.m22;
        return a2;
    }

    public Vector3f f() {
        PC a2;
        Vector3f vector3f = new Vector3f();
        vector3f.set(a2.I.m03, a2.I.m13, a2.I.m23);
        return vector3f;
    }

    public Vector3f J(eA eA2) {
        Object b2 = eA2;
        PC a2 = this;
        return a2.J((eA)((Object)b2), null);
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(int n2) {
        PC pC = this;
        Vector3f b2 = new Vector3f(pC.J.m00, pC.J.m11, pC.J.m22);
        Vector3f vector3f = new Vector3f(pC.A.m00, pC.A.m10, pC.A.m20);
        Vector3f vector3f2 = new Vector3f(pC.A.m01, pC.A.m11, pC.A.m21);
        Vector3f vector3f3 = new Vector3f(pC.A.m02, pC.A.m12, pC.A.m22);
        Vector3f vector3f4 = new Vector3f();
        Vector3f vector3f5 = new Vector3f();
        vector3f5.normalize(vector3f2);
        Vector3f vector3f6 = vector3f4;
        vector3f6.cross(vector3f3, vector3f);
        vector3f6.normalize();
        if (vector3f6.dot(vector3f5) < JPa.N) {
            void a2;
            PC.J((int)a2).transform(b2);
        }
        return b2;
    }

    public Exception J() {
        PC a2;
        return a2.j;
    }

    public static /* synthetic */ Exception J(PC pC, Exception exception) {
        Exception b2 = exception;
        PC a2 = pC;
        a2.j = b2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(eA eA2, Vector3f vector3f, int n2) {
        void v7;
        void c2;
        Object d2 = vector3f;
        PC b2 = this;
        Matrix3f matrix3f = b2.J();
        float[] fArray = new float[yRa.d];
        float[] fArray2 = null;
        if (d2 != null) {
            fArray2 = new float[yRa.d];
            ((Tuple3f)d2).get(fArray2);
        }
        Matrix3f matrix3f2 = matrix3f;
        d2 = new Vector3f(matrix3f2.m00, matrix3f2.m10, matrix3f.m20);
        Matrix3f matrix3f3 = matrix3f;
        Vector3f vector3f2 = new Vector3f(matrix3f3.m01, matrix3f3.m11, matrix3f.m21);
        Matrix3f matrix3f4 = matrix3f;
        Vector3f vector3f3 = new Vector3f(matrix3f4.m02, matrix3f4.m12, matrix3f.m22);
        Vector3f vector3f4 = new Vector3f();
        Vector3f vector3f5 = new Vector3f();
        vector3f5.normalize(vector3f2);
        Vector3f vector3f6 = vector3f4;
        vector3f6.cross(vector3f3, (Vector3f)d2);
        vector3f6.normalize();
        if (vector3f6.dot(vector3f5) < JPa.N) {
            void a2;
            matrix3f.mul(PC.J((int)a2));
        }
        void v5 = c2;
        d2 = v5.doTest(v5.thirdIndex, matrix3f);
        if (d2 != null) {
            if (fArray2 != null) {
                d2 = Float.valueOf(fArray2[c2.thirdIndex] + Oz.f((float)(kta.v * (((Float)d2).floatValue() - fArray2[c2.thirdIndex]))) / kta.v);
            }
            fArray[c2.thirdIndex] = ((Float)d2).floatValue();
            void v6 = c2;
            v7 = v6;
            matrix3f.mul(PC.J(v6.thirdIndex, -((Float)d2).floatValue()), matrix3f);
        } else {
            if (fArray2 != null) {
                d2 = Float.valueOf(fArray2[c2.thirdIndex]);
                fArray[c2.thirdIndex] = ((Float)d2).floatValue();
                Matrix3f matrix3f5 = matrix3f;
                matrix3f5.mul(PC.J(c2.thirdIndex, -((Float)d2).floatValue()), matrix3f5);
            }
            v7 = c2;
        }
        d2 = v7.doTest(c2.secondIndex, matrix3f);
        if (d2 == null) {
            return null;
        }
        if (fArray2 != null) {
            d2 = Float.valueOf(fArray2[c2.secondIndex] + Oz.f((float)(((Float)d2).floatValue() - fArray2[c2.secondIndex])));
        }
        fArray[c2.secondIndex] = ((Float)d2).floatValue();
        void v9 = c2;
        matrix3f.mul(PC.J(v9.secondIndex, -((Float)d2).floatValue()), matrix3f);
        d2 = v9.doTest(v9.firstIndex, matrix3f);
        if (d2 == null) {
            return null;
        }
        if (fArray2 != null) {
            d2 = Float.valueOf(fArray2[c2.firstIndex] + Oz.f((float)(((Float)d2).floatValue() - fArray2[c2.firstIndex])));
        }
        fArray[c2.firstIndex] = ((Float)d2).floatValue();
        return new Vector3f(fArray);
    }

    public PC() {
        PC a2;
        PC pC = a2;
        PC pC2 = a2;
        a2.I = new Matrix4f();
        pC2.A = new Matrix4f();
        a2.J = new Matrix4f();
        pC.j = null;
        a2.I.setIdentity();
        pC.A.setIdentity();
        pC.J.setIdentity();
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(eA eA2, int n2) {
        void b2;
        int c2 = n2;
        PC a2 = this;
        return a2.J((eA)b2, null, c2);
    }

    /*
     * WARNING - void declaration
     */
    public PC(Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3) {
        void b2;
        void c2;
        PC a2;
        Matrix4f d2 = matrix4f3;
        PC pC = a2 = this;
        PC pC2 = a2;
        a2.I = new Matrix4f();
        pC2.A = new Matrix4f();
        a2.J = new Matrix4f();
        pC.j = null;
        a2.I.set((Matrix4f)c2);
        pC.A.set((Matrix4f)b2);
        pC.J.set(d2);
    }

    public static Matrix3f J(int n2) {
        int n3 = n2;
        Matrix3f a2 = new Matrix3f();
        a2.setIdentity();
        switch (n3) {
            case 0: {
                while (false) {
                }
                a2.m00 = vqa.T;
                return a2;
            }
            case 1: {
                a2.m11 = vqa.T;
                return a2;
            }
            case 2: {
                a2.m22 = vqa.T;
            }
        }
        return a2;
    }

    public Vector3f J() {
        PC a2;
        return a2.J(uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(eA eA2, Vector3f vector3f) {
        void b2;
        Vector3f c2 = vector3f;
        PC a2 = this;
        return a2.J((eA)b2, c2, uSa.E);
    }

    public Matrix3f J() {
        PC a2;
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.setIdentity();
        matrix3f.setRow(uSa.E, a2.A.m00, a2.A.m01, a2.A.m02);
        matrix3f.setRow(vRa.d, a2.A.m10, a2.A.m11, a2.A.m12);
        matrix3f.setRow(uqa.g, a2.A.m20, a2.A.m21, a2.A.m22);
        return matrix3f;
    }

    /*
     * WARNING - void declaration
     */
    public static Matrix3f J(int n2, double d2) {
        int n3 = n2;
        Matrix3f b2 = new Matrix3f();
        switch (n3) {
            case 0: {
                void a2;
                Matrix3f matrix3f = b2;
                while (false) {
                }
                matrix3f.rotX((float)Math.toRadians((double)a2));
                return matrix3f;
            }
            case 1: {
                void a2;
                Matrix3f matrix3f = b2;
                matrix3f.rotY((float)Math.toRadians((double)a2));
                return matrix3f;
            }
            case 2: {
                void a2;
                b2.rotZ((float)Math.toRadians((double)a2));
            }
        }
        return b2;
    }
}

