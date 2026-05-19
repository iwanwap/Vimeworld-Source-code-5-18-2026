/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4d;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3d;

public class AxisAngle4d
implements Serializable {
    public double x;
    public double y;
    public double z;
    public double angle;

    public AxisAngle4d(double x2, double y2, double z2, double angle) {
        this.set(x2, y2, z2, angle);
    }

    public AxisAngle4d(double[] a2) {
        this.set(a2);
    }

    public AxisAngle4d(AxisAngle4d a1) {
        this.set(a1);
    }

    public AxisAngle4d(AxisAngle4f a1) {
        this.set(a1);
    }

    public AxisAngle4d() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 1.0;
        this.angle = 0.0;
    }

    public AxisAngle4d(Vector3d axis, double angle) {
        this.x = axis.x;
        this.y = axis.y;
        this.z = axis.z;
        this.angle = angle;
    }

    public final void set(Vector3d axis, double angle) {
        this.x = axis.x;
        this.y = axis.y;
        this.z = axis.z;
        this.angle = angle;
    }

    public final void set(double x2, double y2, double z2, double angle) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.angle = angle;
    }

    public final void set(double[] a2) {
        this.x = a2[0];
        this.y = a2[1];
        this.z = a2[2];
        this.angle = a2[3];
    }

    public final void set(AxisAngle4d a1) {
        this.x = a1.x;
        this.y = a1.y;
        this.z = a1.z;
        this.angle = a1.angle;
    }

    public final void set(AxisAngle4f a1) {
        this.x = a1.x;
        this.y = a1.y;
        this.z = a1.z;
        this.angle = a1.angle;
    }

    public final void get(double[] a2) {
        a2[0] = this.x;
        a2[1] = this.y;
        a2[2] = this.z;
        a2[3] = this.angle;
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

    public final void set(Quat4f q1) {
        this.setFromQuat(q1.x, q1.y, q1.z, q1.w);
    }

    public final void set(Quat4d q1) {
        this.setFromQuat(q1.x, q1.y, q1.z, q1.w);
    }

    private void setFromMat(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        double cos = (m00 + m11 + m22 - 1.0) * 0.5;
        this.x = m21 - m12;
        this.y = m02 - m20;
        this.z = m10 - m01;
        double sin = 0.5 * Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.angle = Math.atan2(sin, cos);
    }

    private void setFromQuat(double x2, double y2, double z2, double w2) {
        double sin_a2 = Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
        this.angle = 2.0 * Math.atan2(sin_a2, w2);
        this.x = x2;
        this.y = y2;
        this.z = z2;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ", " + this.angle + ")";
    }

    public boolean equals(AxisAngle4d a1) {
        return a1 != null && this.x == a1.x && this.y == a1.y && this.z == a1.z && this.angle == a1.angle;
    }

    public boolean equals(Object o1) {
        return o1 != null && o1 instanceof AxisAngle4d && this.equals((AxisAngle4d)o1);
    }

    public boolean epsilonEquals(AxisAngle4d a1, double epsilon) {
        return Math.abs(a1.x - this.x) <= epsilon && Math.abs(a1.y - this.y) <= epsilon && Math.abs(a1.z - this.z) <= epsilon && Math.abs(a1.angle - this.angle) <= epsilon;
    }

    public int hashCode() {
        long xbits = Double.doubleToLongBits(this.x);
        long ybits = Double.doubleToLongBits(this.y);
        long zbits = Double.doubleToLongBits(this.z);
        long abits = Double.doubleToLongBits(this.angle);
        return (int)(xbits ^ xbits >> 32 ^ ybits ^ ybits >> 32 ^ zbits ^ zbits >> 32 ^ abits ^ abits >> 32);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x2) {
        this.x = x2;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y2) {
        this.y = y2;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z2) {
        this.z = z2;
    }

    public double getAngle() {
        return this.angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}

