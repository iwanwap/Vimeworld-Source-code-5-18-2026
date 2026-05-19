/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  TQa
 *  YC
 *  YSa
 *  kta
 *  vRa
 */
import java.nio.FloatBuffer;
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4f;
import javax.vecmath.SingularMatrixException;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jc_3 {
    public static final FloatBuffer J = BufferUtils.createFloatBuffer(ERa.C);
    public static Matrix4f A;
    public static final float[] I;

    public static Matrix4f J(Matrix4f a2) {
        J.clear();
        GL11.glGetFloat(TQa.g, J);
        J.get(I);
        Matrix4f matrix4f = a2;
        matrix4f.set(I);
        matrix4f.transpose();
        return a2;
    }

    public static PC J(Matrix4f matrix4f, Matrix4f matrix4f2) {
        Matrix4f b2 = matrix4f2;
        Matrix4f a2 = matrix4f;
        return jc_3.J(a2, b2, YC.ROW);
    }

    static {
        I = new float[ERa.C];
    }

    public jc_3() {
        jc_3 a2;
    }

    public static Vector3f J(Matrix3f matrix3f) {
        Matrix3f matrix3f2 = matrix3f;
        Matrix3f matrix3f3 = new Matrix3f(matrix3f2);
        Matrix3f a2 = new Matrix3f();
        Matrix3f matrix3f4 = new Matrix3f();
        matrix3f4.setIdentity();
        Matrix3f matrix3f5 = a2;
        a2.setIdentity();
        matrix3f5.mul(kta.v);
        Matrix3f matrix3f6 = matrix3f3;
        matrix3f6.add(matrix3f4);
        matrix3f6.invert();
        matrix3f3.mul(YSa.G);
        matrix3f5.sub(matrix3f3);
        Matrix3f matrix3f7 = a2;
        return new Vector3f(matrix3f7.m21, -matrix3f7.m20, a2.m10);
    }

    public static boolean J() {
        if (A == null) {
            A = jc_3.J(new Matrix4f());
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static PC J(Matrix4f matrix4f, Matrix4f matrix4f2, YC yC2) {
        void a2;
        Matrix4f b2;
        Matrix4f matrix4f3 = matrix4f;
        Matrix4f c2 = new Matrix4f(b2);
        if (matrix4f3 != null) {
            c2.set(matrix4f3);
            try {
                c2.invert();
            }
            catch (SingularMatrixException singularMatrixException) {
                PC pC = new PC();
                PC.J(pC, singularMatrixException);
                return pC;
            }
            c2.mul(b2);
        }
        Matrix4f matrix4f4 = new Matrix4f();
        Matrix4f matrix4f5 = new Matrix4f();
        b2 = new Matrix4f();
        Matrix4f matrix4f6 = matrix4f4;
        Matrix4f matrix4f7 = c2;
        matrix4f4.setIdentity();
        b2.setIdentity();
        matrix4f5.setIdentity();
        matrix4f4.m03 = matrix4f7.m03;
        matrix4f6.m13 = matrix4f7.m13;
        matrix4f6.m23 = c2.m23;
        Matrix4f matrix4f8 = c2;
        Vector4f vector4f = new Vector4f(matrix4f8.m00, matrix4f8.m01, c2.m02, JPa.N);
        Matrix4f matrix4f9 = c2;
        Vector4f vector4f2 = new Vector4f(matrix4f9.m10, matrix4f9.m11, c2.m12, JPa.N);
        Matrix4f matrix4f10 = c2;
        Vector4f vector4f3 = new Vector4f(matrix4f10.m20, matrix4f10.m21, c2.m22, JPa.N);
        if (a2 == YC.COLUMN) {
            Matrix4f matrix4f11 = c2;
            vector4f = new Vector4f(matrix4f11.m00, matrix4f11.m10, c2.m20, JPa.N);
            Matrix4f matrix4f12 = c2;
            vector4f2 = new Vector4f(matrix4f12.m01, matrix4f12.m11, c2.m21, JPa.N);
            Matrix4f matrix4f13 = c2;
            vector4f3 = new Vector4f(matrix4f13.m02, matrix4f13.m12, c2.m22, JPa.N);
        }
        vector4f.normalize();
        vector4f2.normalize();
        vector4f3.normalize();
        Matrix4f matrix4f14 = b2;
        matrix4f14.setRow(uSa.E, vector4f);
        b2.setRow(vRa.d, vector4f2);
        matrix4f14.setRow(uqa.g, vector4f3);
        if (a2 == YC.COLUMN) {
            b2.transpose();
        }
        Matrix4f matrix4f15 = matrix4f5;
        Matrix4f matrix4f16 = c2;
        Matrix4f matrix4f17 = c2;
        Matrix4f matrix4f18 = c2;
        matrix4f15.m00 = (float)Math.sqrt(c2.m00 * matrix4f16.m00 + matrix4f17.m01 * matrix4f17.m01 + matrix4f18.m02 * matrix4f18.m02);
        Matrix4f matrix4f19 = c2;
        Matrix4f matrix4f20 = c2;
        Matrix4f matrix4f21 = c2;
        matrix4f15.m11 = (float)Math.sqrt(matrix4f16.m10 * matrix4f19.m10 + matrix4f20.m11 * matrix4f20.m11 + matrix4f21.m12 * matrix4f21.m12);
        Matrix4f matrix4f22 = c2;
        Matrix4f matrix4f23 = c2;
        matrix4f15.m22 = (float)Math.sqrt(matrix4f19.m20 * c2.m20 + matrix4f22.m21 * matrix4f22.m21 + matrix4f23.m22 * matrix4f23.m22);
        if (a2 == YC.COLUMN) {
            Matrix4f matrix4f24 = matrix4f5;
            Matrix4f matrix4f25 = c2;
            Matrix4f matrix4f26 = c2;
            Matrix4f matrix4f27 = c2;
            matrix4f5.m00 = (float)Math.sqrt(c2.m00 * matrix4f25.m00 + matrix4f26.m10 * matrix4f26.m10 + matrix4f27.m20 * matrix4f27.m20);
            Matrix4f matrix4f28 = c2;
            Matrix4f matrix4f29 = c2;
            matrix4f24.m11 = (float)Math.sqrt(matrix4f25.m01 * c2.m01 + matrix4f28.m11 * matrix4f28.m11 + matrix4f29.m21 * matrix4f29.m21);
            Matrix4f matrix4f30 = c2;
            Matrix4f matrix4f31 = c2;
            matrix4f24.m22 = (float)Math.sqrt(c2.m02 * c2.m02 + matrix4f30.m12 * matrix4f30.m12 + matrix4f31.m22 * matrix4f31.m22);
        }
        return new PC(matrix4f4, b2, matrix4f5);
    }

    public static void J() {
        A = null;
    }
}

