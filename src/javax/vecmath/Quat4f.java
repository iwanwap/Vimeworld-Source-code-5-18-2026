/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4d;
import javax.vecmath.Tuple4d;
import javax.vecmath.Tuple4f;

public class Quat4f
extends Tuple4f
implements Serializable {
    public Quat4f(float x2, float y2, float z2, float w2) {
        super(x2, y2, z2, w2);
    }

    public Quat4f(float[] q2) {
        super(q2);
    }

    public Quat4f(Quat4f q1) {
        super(q1);
    }

    public Quat4f(Quat4d q1) {
        super(q1);
    }

    public Quat4f(Tuple4d t1) {
        super(t1);
    }

    public Quat4f(Tuple4f t1) {
        super(t1);
    }

    public Quat4f() {
    }

    public final void conjugate(Quat4f q1) {
        this.x = -q1.x;
        this.y = -q1.y;
        this.z = -q1.z;
        this.w = q1.w;
    }

    public final void conjugate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    public final void mul(Quat4f q1, Quat4f q2) {
        this.set(q1.x * q2.w + q1.w * q2.x + q1.y * q2.z - q1.z * q2.y, q1.y * q2.w + q1.w * q2.y + q1.z * q2.x - q1.x * q2.z, q1.z * q2.w + q1.w * q2.z + q1.x * q2.y - q1.y * q2.x, q1.w * q2.w - q1.x * q2.x - q1.y * q2.y - q1.z * q2.z);
    }

    public final void mul(Quat4f q1) {
        this.set(this.x * q1.w + this.w * q1.x + this.y * q1.z - this.z * q1.y, this.y * q1.w + this.w * q1.y + this.z * q1.x - this.x * q1.z, this.z * q1.w + this.w * q1.z + this.x * q1.y - this.y * q1.x, this.w * q1.w - this.x * q1.x - this.y * q1.y - this.z * q1.z);
    }

    public final void mulInverse(Quat4f q1, Quat4f q2) {
        double n2 = this.norm();
        n2 = n2 == 0.0 ? n2 : 1.0 / n2;
        this.set((float)((double)(q1.x * q2.w - q1.w * q2.x - q1.y * q2.z + q1.z * q2.y) * n2), (float)((double)(q1.y * q2.w - q1.w * q2.y - q1.z * q2.x + q1.x * q2.z) * n2), (float)((double)(q1.z * q2.w - q1.w * q2.z - q1.x * q2.y + q1.y * q2.x) * n2), (float)((double)(q1.w * q2.w + q1.x * q2.x + q1.y * q2.y + q1.z * q2.z) * n2));
    }

    public final void mulInverse(Quat4f q1) {
        double n2 = this.norm();
        n2 = n2 == 0.0 ? n2 : 1.0 / n2;
        this.set((float)((double)(this.x * q1.w - this.w * q1.x - this.y * q1.z + this.z * q1.y) * n2), (float)((double)(this.y * q1.w - this.w * q1.y - this.z * q1.x + this.x * q1.z) * n2), (float)((double)(this.z * q1.w - this.w * q1.z - this.x * q1.y + this.y * q1.x) * n2), (float)((double)(this.w * q1.w + this.x * q1.x + this.y * q1.y + this.z * q1.z) * n2));
    }

    private final double norm() {
        return this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w;
    }

    public final void inverse(Quat4f q1) {
        double n2 = q1.norm();
        this.x = (float)((double)(-q1.x) / n2);
        this.y = (float)((double)(-q1.y) / n2);
        this.z = (float)((double)(-q1.z) / n2);
        this.w = (float)((double)q1.w / n2);
    }

    public final void inverse() {
        double n2 = this.norm();
        this.x = (float)((double)(-this.x) / n2);
        this.y = (float)((double)(-this.y) / n2);
        this.z = (float)((double)(-this.z) / n2);
        this.w = (float)((double)this.w / n2);
    }

    public final void normalize(Quat4f q1) {
        double n2 = Math.sqrt(q1.norm());
        this.x = (float)((double)q1.x / n2);
        this.y = (float)((double)q1.y / n2);
        this.z = (float)((double)q1.z / n2);
        this.w = (float)((double)q1.w / n2);
    }

    public final void normalize() {
        float n2 = (float)Math.sqrt(this.norm());
        this.x /= n2;
        this.y /= n2;
        this.z /= n2;
        this.w /= n2;
    }

    public final void set(Matrix4f m1) {
        this.setFromMat(m1.m00, m1.m01, m1.m02, m1.m10, m1.m11, m1.m12, m1.m20, m1.m21, m1.m22);
    }

    public final void set(Matrix4d m1) {
        this.setFromMat(m1.m00, m1.m01, m1.m02, m1.m10, m1.m11, m1.m12, m1.m20, m1.m21, m1.m22);
    }

    public final void set(Matrix3f m1) {
        this.setFromMat(m1.m00, m1.m01, m1.m02, m1.m10, m1.m11, m1.m12, m1.m20, m1.m21, m1.m22);
    }

    public final void set(Matrix3d m1) {
        this.setFromMat(m1.m00, m1.m01, m1.m02, m1.m10, m1.m11, m1.m12, m1.m20, m1.m21, m1.m22);
    }

    public final void set(AxisAngle4f a1) {
        this.x = a1.x;
        this.y = a1.y;
        this.z = a1.z;
        double n2 = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        float s2 = (float)(Math.sin(0.5 * (double)a1.angle) / n2);
        this.x *= s2;
        this.y *= s2;
        this.z *= s2;
        this.w = (float)Math.cos(0.5 * (double)a1.angle);
    }

    public final void set(AxisAngle4d a1) {
        this.x = (float)a1.x;
        this.y = (float)a1.y;
        this.z = (float)a1.z;
        double n2 = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        float s2 = (float)(Math.sin(0.5 * a1.angle) / n2);
        this.x *= s2;
        this.y *= s2;
        this.z *= s2;
        this.w = (float)Math.cos(0.5 * a1.angle);
    }

    public final void interpolate(Quat4f q1, double alpha) {
        this.normalize();
        double n1 = Math.sqrt(q1.norm());
        double x1 = (double)q1.x / n1;
        double y1 = (double)q1.y / n1;
        double z1 = (double)q1.z / n1;
        double w1 = (double)q1.w / n1;
        double t2 = (double)this.x * x1 + (double)this.y * y1 + (double)this.z * z1 + (double)this.w * w1;
        if (1.0 <= Math.abs(t2)) {
            return;
        }
        double sin_t = Math.sin(t2 = Math.acos(t2));
        if (sin_t == 0.0) {
            return;
        }
        double s2 = Math.sin((1.0 - alpha) * t2) / sin_t;
        t2 = Math.sin(alpha * t2) / sin_t;
        this.x = (float)(s2 * (double)this.x + t2 * x1);
        this.y = (float)(s2 * (double)this.y + t2 * y1);
        this.z = (float)(s2 * (double)this.z + t2 * z1);
        this.w = (float)(s2 * (double)this.w + t2 * w1);
    }

    public final void interpolate(Quat4f q1, Quat4f q2, double alpha) {
        this.set(q1);
        this.interpolate(q2, alpha);
    }

    private void setFromMat(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        double tr2 = m00 + m11 + m22;
        if (tr2 >= 0.0) {
            double s2 = Math.sqrt(tr2 + 1.0);
            this.w = (float)(s2 * 0.5);
            s2 = 0.5 / s2;
            this.x = (float)((m21 - m12) * s2);
            this.y = (float)((m02 - m20) * s2);
            this.z = (float)((m10 - m01) * s2);
        } else {
            double max = Math.max(Math.max(m00, m11), m22);
            if (max == m00) {
                double s3 = Math.sqrt(m00 - (m11 + m22) + 1.0);
                this.x = (float)(s3 * 0.5);
                s3 = 0.5 / s3;
                this.y = (float)((m01 + m10) * s3);
                this.z = (float)((m20 + m02) * s3);
                this.w = (float)((m21 - m12) * s3);
            } else if (max == m11) {
                double s4 = Math.sqrt(m11 - (m22 + m00) + 1.0);
                this.y = (float)(s4 * 0.5);
                s4 = 0.5 / s4;
                this.z = (float)((m12 + m21) * s4);
                this.x = (float)((m01 + m10) * s4);
                this.w = (float)((m02 - m20) * s4);
            } else {
                double s5 = Math.sqrt(m22 - (m00 + m11) + 1.0);
                this.z = (float)(s5 * 0.5);
                s5 = 0.5 / s5;
                this.x = (float)((m20 + m02) * s5);
                this.y = (float)((m12 + m21) * s5);
                this.w = (float)((m10 - m01) * s5);
            }
        }
    }
}

