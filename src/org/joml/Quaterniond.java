/*
 * Decompiled with CFR 0.152.
 */
package org.joml;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.NumberFormat;
import org.joml.AxisAngle4d;
import org.joml.AxisAngle4f;
import org.joml.Math;
import org.joml.Matrix3d;
import org.joml.Matrix3dc;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4d;
import org.joml.Matrix4dc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Matrix4x3dc;
import org.joml.Matrix4x3fc;
import org.joml.Options;
import org.joml.Quaterniondc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Runtime;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4d;
import org.joml.Vector4dc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class Quaterniond
implements Externalizable,
Cloneable,
Quaterniondc {
    private static final long serialVersionUID = 1L;
    public double x;
    public double y;
    public double z;
    public double w;

    public Quaterniond() {
        this.w = 1.0;
    }

    public Quaterniond(double x2, double y2, double z2, double w2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.w = w2;
    }

    public Quaterniond(Quaterniondc source) {
        this.x = source.x();
        this.y = source.y();
        this.z = source.z();
        this.w = source.w();
    }

    public Quaterniond(Quaternionfc source) {
        this.x = source.x();
        this.y = source.y();
        this.z = source.z();
        this.w = source.w();
    }

    public Quaterniond(AxisAngle4f axisAngle) {
        double s2 = Math.sin((double)axisAngle.angle * 0.5);
        this.x = (double)axisAngle.x * s2;
        this.y = (double)axisAngle.y * s2;
        this.z = (double)axisAngle.z * s2;
        this.w = Math.cosFromSin(s2, (double)axisAngle.angle * 0.5);
    }

    public Quaterniond(AxisAngle4d axisAngle) {
        double s2 = Math.sin(axisAngle.angle * 0.5);
        this.x = axisAngle.x * s2;
        this.y = axisAngle.y * s2;
        this.z = axisAngle.z * s2;
        this.w = Math.cosFromSin(s2, axisAngle.angle * 0.5);
    }

    public double x() {
        return this.x;
    }

    public double y() {
        return this.y;
    }

    public double z() {
        return this.z;
    }

    public double w() {
        return this.w;
    }

    public Quaterniond normalize() {
        double invNorm = Math.invsqrt(this.lengthSquared());
        this.x *= invNorm;
        this.y *= invNorm;
        this.z *= invNorm;
        this.w *= invNorm;
        return this;
    }

    public Quaterniond normalize(Quaterniond dest) {
        double invNorm = Math.invsqrt(this.lengthSquared());
        dest.x = this.x * invNorm;
        dest.y = this.y * invNorm;
        dest.z = this.z * invNorm;
        dest.w = this.w * invNorm;
        return dest;
    }

    public Quaterniond add(double x2, double y2, double z2, double w2) {
        return this.add(x2, y2, z2, w2, this);
    }

    public Quaterniond add(double x2, double y2, double z2, double w2, Quaterniond dest) {
        dest.x = this.x + x2;
        dest.y = this.y + y2;
        dest.z = this.z + z2;
        dest.w = this.w + w2;
        return dest;
    }

    public Quaterniond add(Quaterniondc q2) {
        return this.add(q2, this);
    }

    public Quaterniond add(Quaterniondc q2, Quaterniond dest) {
        dest.x = this.x + q2.x();
        dest.y = this.y + q2.y();
        dest.z = this.z + q2.z();
        dest.w = this.w + q2.w();
        return dest;
    }

    public Quaterniond sub(double x2, double y2, double z2, double w2) {
        return this.sub(x2, y2, z2, w2, this);
    }

    public Quaterniond sub(double x2, double y2, double z2, double w2, Quaterniond dest) {
        dest.x = this.x - x2;
        dest.y = this.y - y2;
        dest.z = this.z - z2;
        dest.w = this.w - w2;
        return dest;
    }

    public Quaterniond sub(Quaterniondc q2) {
        return this.sub(q2, this);
    }

    public Quaterniond sub(Quaterniondc q2, Quaterniond dest) {
        dest.x = this.x - q2.x();
        dest.y = this.y - q2.y();
        dest.z = this.z - q2.z();
        dest.w = this.w - q2.w();
        return dest;
    }

    public double dot(Quaterniondc otherQuat) {
        return this.x * otherQuat.x() + this.y * otherQuat.y() + this.z * otherQuat.z() + this.w * otherQuat.w();
    }

    public double angle() {
        return 2.0 * Math.safeAcos(this.w);
    }

    public Matrix3d get(Matrix3d dest) {
        return dest.set(this);
    }

    public Matrix3f get(Matrix3f dest) {
        return dest.set(this);
    }

    public Matrix4d get(Matrix4d dest) {
        return dest.set(this);
    }

    public Matrix4f get(Matrix4f dest) {
        return dest.set(this);
    }

    public AxisAngle4f get(AxisAngle4f dest) {
        double x2 = this.x;
        double y2 = this.y;
        double z2 = this.z;
        double w2 = this.w;
        if (w2 > 1.0) {
            double invNorm = Math.invsqrt(this.lengthSquared());
            x2 *= invNorm;
            y2 *= invNorm;
            z2 *= invNorm;
            w2 *= invNorm;
        }
        dest.angle = (float)(2.0 * Math.acos(w2));
        double s2 = Math.sqrt(1.0 - w2 * w2);
        if (s2 < 0.001) {
            dest.x = (float)x2;
            dest.y = (float)y2;
            dest.z = (float)z2;
        } else {
            s2 = 1.0 / s2;
            dest.x = (float)(x2 * s2);
            dest.y = (float)(y2 * s2);
            dest.z = (float)(z2 * s2);
        }
        return dest;
    }

    public AxisAngle4d get(AxisAngle4d dest) {
        double x2 = this.x;
        double y2 = this.y;
        double z2 = this.z;
        double w2 = this.w;
        if (w2 > 1.0) {
            double invNorm = Math.invsqrt(this.lengthSquared());
            x2 *= invNorm;
            y2 *= invNorm;
            z2 *= invNorm;
            w2 *= invNorm;
        }
        dest.angle = 2.0 * Math.acos(w2);
        double s2 = Math.sqrt(1.0 - w2 * w2);
        if (s2 < 0.001) {
            dest.x = x2;
            dest.y = y2;
            dest.z = z2;
        } else {
            s2 = 1.0 / s2;
            dest.x = x2 * s2;
            dest.y = y2 * s2;
            dest.z = z2 * s2;
        }
        return dest;
    }

    public Quaterniond get(Quaterniond dest) {
        return dest.set(this);
    }

    public Quaternionf get(Quaternionf dest) {
        return dest.set(this);
    }

    public Quaterniond set(double x2, double y2, double z2, double w2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.w = w2;
        return this;
    }

    public Quaterniond set(Quaterniondc q2) {
        this.x = q2.x();
        this.y = q2.y();
        this.z = q2.z();
        this.w = q2.w();
        return this;
    }

    public Quaterniond set(Quaternionfc q2) {
        this.x = q2.x();
        this.y = q2.y();
        this.z = q2.z();
        this.w = q2.w();
        return this;
    }

    public Quaterniond set(AxisAngle4f axisAngle) {
        return this.setAngleAxis(axisAngle.angle, axisAngle.x, axisAngle.y, axisAngle.z);
    }

    public Quaterniond set(AxisAngle4d axisAngle) {
        return this.setAngleAxis(axisAngle.angle, axisAngle.x, axisAngle.y, axisAngle.z);
    }

    public Quaterniond setAngleAxis(double angle, double x2, double y2, double z2) {
        double s2 = Math.sin(angle * 0.5);
        this.x = x2 * s2;
        this.y = y2 * s2;
        this.z = z2 * s2;
        this.w = Math.cosFromSin(s2, angle * 0.5);
        return this;
    }

    public Quaterniond setAngleAxis(double angle, Vector3dc axis) {
        return this.setAngleAxis(angle, axis.x(), axis.y(), axis.z());
    }

    private void setFromUnnormalized(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        double nm00 = m00;
        double nm01 = m01;
        double nm02 = m02;
        double nm10 = m10;
        double nm11 = m11;
        double nm12 = m12;
        double nm20 = m20;
        double nm21 = m21;
        double nm22 = m22;
        double lenX = Math.invsqrt(m00 * m00 + m01 * m01 + m02 * m02);
        double lenY = Math.invsqrt(m10 * m10 + m11 * m11 + m12 * m12);
        double lenZ = Math.invsqrt(m20 * m20 + m21 * m21 + m22 * m22);
        this.setFromNormalized(nm00 *= lenX, nm01 *= lenX, nm02 *= lenX, nm10 *= lenY, nm11 *= lenY, nm12 *= lenY, nm20 *= lenZ, nm21 *= lenZ, nm22 *= lenZ);
    }

    private void setFromNormalized(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        double tr2 = m00 + m11 + m22;
        if (tr2 >= 0.0) {
            double t2 = Math.sqrt(tr2 + 1.0);
            this.w = t2 * 0.5;
            t2 = 0.5 / t2;
            this.x = (m12 - m21) * t2;
            this.y = (m20 - m02) * t2;
            this.z = (m01 - m10) * t2;
        } else if (m00 >= m11 && m00 >= m22) {
            double t3 = Math.sqrt(m00 - (m11 + m22) + 1.0);
            this.x = t3 * 0.5;
            t3 = 0.5 / t3;
            this.y = (m10 + m01) * t3;
            this.z = (m02 + m20) * t3;
            this.w = (m12 - m21) * t3;
        } else if (m11 > m22) {
            double t4 = Math.sqrt(m11 - (m22 + m00) + 1.0);
            this.y = t4 * 0.5;
            t4 = 0.5 / t4;
            this.z = (m21 + m12) * t4;
            this.x = (m10 + m01) * t4;
            this.w = (m20 - m02) * t4;
        } else {
            double t5 = Math.sqrt(m22 - (m00 + m11) + 1.0);
            this.z = t5 * 0.5;
            t5 = 0.5 / t5;
            this.x = (m02 + m20) * t5;
            this.y = (m21 + m12) * t5;
            this.w = (m01 - m10) * t5;
        }
    }

    public Quaterniond setFromUnnormalized(Matrix4fc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromUnnormalized(Matrix4x3fc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromUnnormalized(Matrix4x3dc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix4fc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix4x3fc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix4x3dc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromUnnormalized(Matrix4dc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix4dc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromUnnormalized(Matrix3fc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix3fc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromUnnormalized(Matrix3dc mat) {
        this.setFromUnnormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond setFromNormalized(Matrix3dc mat) {
        this.setFromNormalized(mat.m00(), mat.m01(), mat.m02(), mat.m10(), mat.m11(), mat.m12(), mat.m20(), mat.m21(), mat.m22());
        return this;
    }

    public Quaterniond fromAxisAngleRad(Vector3dc axis, double angle) {
        return this.fromAxisAngleRad(axis.x(), axis.y(), axis.z(), angle);
    }

    public Quaterniond fromAxisAngleRad(double axisX, double axisY, double axisZ, double angle) {
        double hangle = angle / 2.0;
        double sinAngle = Math.sin(hangle);
        double invVLength = 1.0 / Math.sqrt(axisX * axisX + axisY * axisY + axisZ * axisZ);
        double invVLengthTimesSinAngle = invVLength * sinAngle;
        this.x = axisX * invVLengthTimesSinAngle;
        this.y = axisY * invVLengthTimesSinAngle;
        this.z = axisZ * invVLengthTimesSinAngle;
        this.w = Math.cosFromSin(sinAngle, hangle);
        return this;
    }

    public Quaterniond fromAxisAngleDeg(Vector3dc axis, double angle) {
        return this.fromAxisAngleRad(axis.x(), axis.y(), axis.z(), Math.toRadians(angle));
    }

    public Quaterniond fromAxisAngleDeg(double axisX, double axisY, double axisZ, double angle) {
        return this.fromAxisAngleRad(axisX, axisY, axisZ, Math.toRadians(angle));
    }

    public Quaterniond mul(Quaterniondc q2) {
        return this.mul(q2, this);
    }

    public Quaterniond mul(Quaterniondc q2, Quaterniond dest) {
        return this.mul(q2.x(), q2.y(), q2.z(), q2.w(), dest);
    }

    public Quaterniond mul(double qx2, double qy2, double qz2, double qw2) {
        return this.mul(qx2, qy2, qz2, qw2, this);
    }

    public Quaterniond mul(double qx2, double qy2, double qz2, double qw2, Quaterniond dest) {
        return dest.set(Math.fma(this.w, qx2, Math.fma(this.x, qw2, Math.fma(this.y, qz2, -this.z * qy2))), Math.fma(this.w, qy2, Math.fma(-this.x, qz2, Math.fma(this.y, qw2, this.z * qx2))), Math.fma(this.w, qz2, Math.fma(this.x, qy2, Math.fma(-this.y, qx2, this.z * qw2))), Math.fma(this.w, qw2, Math.fma(-this.x, qx2, Math.fma(-this.y, qy2, -this.z * qz2))));
    }

    public Quaterniond mul(double f2) {
        return this.mul(f2, this);
    }

    public Quaterniond mul(double f2, Quaterniond dest) {
        dest.x = this.x * f2;
        dest.y = this.y * f2;
        dest.z = this.z * f2;
        dest.w = this.w * f2;
        return dest;
    }

    public Quaterniond premul(Quaterniondc q2) {
        return this.premul(q2, this);
    }

    public Quaterniond premul(Quaterniondc q2, Quaterniond dest) {
        return this.premul(q2.x(), q2.y(), q2.z(), q2.w(), dest);
    }

    public Quaterniond premul(double qx2, double qy2, double qz2, double qw2) {
        return this.premul(qx2, qy2, qz2, qw2, this);
    }

    public Quaterniond premul(double qx2, double qy2, double qz2, double qw2, Quaterniond dest) {
        return dest.set(Math.fma(qw2, this.x, Math.fma(qx2, this.w, Math.fma(qy2, this.z, -qz2 * this.y))), Math.fma(qw2, this.y, Math.fma(-qx2, this.z, Math.fma(qy2, this.w, qz2 * this.x))), Math.fma(qw2, this.z, Math.fma(qx2, this.y, Math.fma(-qy2, this.x, qz2 * this.w))), Math.fma(qw2, this.w, Math.fma(-qx2, this.x, Math.fma(-qy2, this.y, -qz2 * this.z))));
    }

    public Vector3d transform(Vector3d vec) {
        return this.transform(vec.x, vec.y, vec.z, vec);
    }

    public Vector3d transformInverse(Vector3d vec) {
        return this.transformInverse(vec.x, vec.y, vec.z, vec);
    }

    public Vector3d transformUnit(Vector3d vec) {
        return this.transformUnit(vec.x, vec.y, vec.z, vec);
    }

    public Vector3d transformInverseUnit(Vector3d vec) {
        return this.transformInverseUnit(vec.x, vec.y, vec.z, vec);
    }

    public Vector3d transformPositiveX(Vector3d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        dest.x = ww2 + xx2 - zz2 - yy2;
        dest.y = xy2 + zw2 + zw2 + xy2;
        dest.z = xz2 - yw2 + xz2 - yw2;
        return dest;
    }

    public Vector4d transformPositiveX(Vector4d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        dest.x = ww2 + xx2 - zz2 - yy2;
        dest.y = xy2 + zw2 + zw2 + xy2;
        dest.z = xz2 - yw2 + xz2 - yw2;
        return dest;
    }

    public Vector3d transformUnitPositiveX(Vector3d dest) {
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double zw2 = this.z * this.w;
        dest.x = 1.0 - yy2 - yy2 - zz2 - zz2;
        dest.y = xy2 + zw2 + xy2 + zw2;
        dest.z = xz2 - yw2 + xz2 - yw2;
        return dest;
    }

    public Vector4d transformUnitPositiveX(Vector4d dest) {
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double zw2 = this.z * this.w;
        dest.x = 1.0 - yy2 - yy2 - zz2 - zz2;
        dest.y = xy2 + zw2 + xy2 + zw2;
        dest.z = xz2 - yw2 + xz2 - yw2;
        return dest;
    }

    public Vector3d transformPositiveY(Vector3d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = -zw2 + xy2 - zw2 + xy2;
        dest.y = yy2 - zz2 + ww2 - xx2;
        dest.z = yz2 + yz2 + xw2 + xw2;
        return dest;
    }

    public Vector4d transformPositiveY(Vector4d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = -zw2 + xy2 - zw2 + xy2;
        dest.y = yy2 - zz2 + ww2 - xx2;
        dest.z = yz2 + yz2 + xw2 + xw2;
        return dest;
    }

    public Vector4d transformUnitPositiveY(Vector4d dest) {
        double xx2 = this.x * this.x;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        dest.x = xy2 - zw2 + xy2 - zw2;
        dest.y = 1.0 - xx2 - xx2 - zz2 - zz2;
        dest.z = yz2 + yz2 + xw2 + xw2;
        return dest;
    }

    public Vector3d transformUnitPositiveY(Vector3d dest) {
        double xx2 = this.x * this.x;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        dest.x = xy2 - zw2 + xy2 - zw2;
        dest.y = 1.0 - xx2 - xx2 - zz2 - zz2;
        dest.z = yz2 + yz2 + xw2 + xw2;
        return dest;
    }

    public Vector3d transformPositiveZ(Vector3d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = yw2 + xz2 + xz2 + yw2;
        dest.y = yz2 + yz2 - xw2 - xw2;
        dest.z = zz2 - yy2 - xx2 + ww2;
        return dest;
    }

    public Vector4d transformPositiveZ(Vector4d dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = yw2 + xz2 + xz2 + yw2;
        dest.y = yz2 + yz2 - xw2 - xw2;
        dest.z = zz2 - yy2 - xx2 + ww2;
        return dest;
    }

    public Vector4d transformUnitPositiveZ(Vector4d dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double yw2 = this.y * this.w;
        dest.x = xz2 + yw2 + xz2 + yw2;
        dest.y = yz2 + yz2 - xw2 - xw2;
        dest.z = 1.0 - xx2 - xx2 - yy2 - yy2;
        return dest;
    }

    public Vector3d transformUnitPositiveZ(Vector3d dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double yw2 = this.y * this.w;
        dest.x = xz2 + yw2 + xz2 + yw2;
        dest.y = yz2 + yz2 - xw2 - xw2;
        dest.z = 1.0 - xx2 - xx2 - yy2 - yy2;
        return dest;
    }

    public Vector4d transform(Vector4d vec) {
        return this.transform(vec, vec);
    }

    public Vector4d transformInverse(Vector4d vec) {
        return this.transformInverse(vec, vec);
    }

    public Vector3d transform(Vector3dc vec, Vector3d dest) {
        return this.transform(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector3d transformInverse(Vector3dc vec, Vector3d dest) {
        return this.transformInverse(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector3d transform(double x2, double y2, double z2, Vector3d dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double ww2 = this.w * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        double yw2 = this.y * this.w;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 - zw2) * k2, y2, 2.0 * (xz2 + yw2) * k2 * z2)), Math.fma(2.0 * (xy2 + zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 - xw2) * k2 * z2)), Math.fma(2.0 * (xz2 - yw2) * k2, x2, Math.fma(2.0 * (yz2 + xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)));
    }

    public Vector3d transformInverse(double x2, double y2, double z2, Vector3d dest) {
        double n2 = 1.0 / Math.fma(this.x, this.x, Math.fma(this.y, this.y, Math.fma(this.z, this.z, this.w * this.w)));
        double qx2 = this.x * n2;
        double qy2 = this.y * n2;
        double qz2 = this.z * n2;
        double qw2 = this.w * n2;
        double xx2 = qx2 * qx2;
        double yy2 = qy2 * qy2;
        double zz2 = qz2 * qz2;
        double ww2 = qw2 * qw2;
        double xy2 = qx2 * qy2;
        double xz2 = qx2 * qz2;
        double yz2 = qy2 * qz2;
        double xw2 = qx2 * qw2;
        double zw2 = qz2 * qw2;
        double yw2 = qy2 * qw2;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 + zw2) * k2, y2, 2.0 * (xz2 - yw2) * k2 * z2)), Math.fma(2.0 * (xy2 - zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 + xw2) * k2 * z2)), Math.fma(2.0 * (xz2 + yw2) * k2, x2, Math.fma(2.0 * (yz2 - xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)));
    }

    public Vector4d transform(Vector4dc vec, Vector4d dest) {
        return this.transform(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector4d transformInverse(Vector4dc vec, Vector4d dest) {
        return this.transformInverse(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector4d transform(double x2, double y2, double z2, Vector4d dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double ww2 = this.w * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        double yw2 = this.y * this.w;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 - zw2) * k2, y2, 2.0 * (xz2 + yw2) * k2 * z2)), Math.fma(2.0 * (xy2 + zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 - xw2) * k2 * z2)), Math.fma(2.0 * (xz2 - yw2) * k2, x2, Math.fma(2.0 * (yz2 + xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)), dest.w);
    }

    public Vector4d transformInverse(double x2, double y2, double z2, Vector4d dest) {
        double n2 = 1.0 / Math.fma(this.x, this.x, Math.fma(this.y, this.y, Math.fma(this.z, this.z, this.w * this.w)));
        double qx2 = this.x * n2;
        double qy2 = this.y * n2;
        double qz2 = this.z * n2;
        double qw2 = this.w * n2;
        double xx2 = qx2 * qx2;
        double yy2 = qy2 * qy2;
        double zz2 = qz2 * qz2;
        double ww2 = qw2 * qw2;
        double xy2 = qx2 * qy2;
        double xz2 = qx2 * qz2;
        double yz2 = qy2 * qz2;
        double xw2 = qx2 * qw2;
        double zw2 = qz2 * qw2;
        double yw2 = qy2 * qw2;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 + zw2) * k2, y2, 2.0 * (xz2 - yw2) * k2 * z2)), Math.fma(2.0 * (xy2 - zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 + xw2) * k2 * z2)), Math.fma(2.0 * (xz2 + yw2) * k2, x2, Math.fma(2.0 * (yz2 - xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)));
    }

    public Vector3f transform(Vector3f vec) {
        return this.transform((double)vec.x, (double)vec.y, (double)vec.z, vec);
    }

    public Vector3f transformInverse(Vector3f vec) {
        return this.transformInverse((double)vec.x, (double)vec.y, (double)vec.z, vec);
    }

    public Vector4d transformUnit(Vector4d vec) {
        return this.transformUnit(vec, vec);
    }

    public Vector4d transformInverseUnit(Vector4d vec) {
        return this.transformInverseUnit(vec, vec);
    }

    public Vector3d transformUnit(Vector3dc vec, Vector3d dest) {
        return this.transformUnit(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector3d transformInverseUnit(Vector3dc vec, Vector3d dest) {
        return this.transformInverseUnit(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector3d transformUnit(double x2, double y2, double z2, Vector3d dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set(Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 - zw2), y2, 2.0 * (xz2 + yw2) * z2)), Math.fma(2.0 * (xy2 + zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 - xw2) * z2)), Math.fma(2.0 * (xz2 - yw2), x2, Math.fma(2.0 * (yz2 + xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Vector3d transformInverseUnit(double x2, double y2, double z2, Vector3d dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set(Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 + zw2), y2, 2.0 * (xz2 - yw2) * z2)), Math.fma(2.0 * (xy2 - zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 + xw2) * z2)), Math.fma(2.0 * (xz2 + yw2), x2, Math.fma(2.0 * (yz2 - xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Vector4d transformUnit(Vector4dc vec, Vector4d dest) {
        return this.transformUnit(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector4d transformInverseUnit(Vector4dc vec, Vector4d dest) {
        return this.transformInverseUnit(vec.x(), vec.y(), vec.z(), dest);
    }

    public Vector4d transformUnit(double x2, double y2, double z2, Vector4d dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set(Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 - zw2), y2, 2.0 * (xz2 + yw2) * z2)), Math.fma(2.0 * (xy2 + zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 - xw2) * z2)), Math.fma(2.0 * (xz2 - yw2), x2, Math.fma(2.0 * (yz2 + xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)), dest.w);
    }

    public Vector4d transformInverseUnit(double x2, double y2, double z2, Vector4d dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set(Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 + zw2), y2, 2.0 * (xz2 - yw2) * z2)), Math.fma(2.0 * (xy2 - zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 + xw2) * z2)), Math.fma(2.0 * (xz2 + yw2), x2, Math.fma(2.0 * (yz2 - xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)), dest.w);
    }

    public Vector3f transformUnit(Vector3f vec) {
        return this.transformUnit((double)vec.x, (double)vec.y, (double)vec.z, vec);
    }

    public Vector3f transformInverseUnit(Vector3f vec) {
        return this.transformInverseUnit((double)vec.x, (double)vec.y, (double)vec.z, vec);
    }

    public Vector3f transformPositiveX(Vector3f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        dest.x = (float)(ww2 + xx2 - zz2 - yy2);
        dest.y = (float)(xy2 + zw2 + zw2 + xy2);
        dest.z = (float)(xz2 - yw2 + xz2 - yw2);
        return dest;
    }

    public Vector4f transformPositiveX(Vector4f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        dest.x = (float)(ww2 + xx2 - zz2 - yy2);
        dest.y = (float)(xy2 + zw2 + zw2 + xy2);
        dest.z = (float)(xz2 - yw2 + xz2 - yw2);
        return dest;
    }

    public Vector3f transformUnitPositiveX(Vector3f dest) {
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double zw2 = this.z * this.w;
        dest.x = (float)(1.0 - yy2 - yy2 - zz2 - zz2);
        dest.y = (float)(xy2 + zw2 + xy2 + zw2);
        dest.z = (float)(xz2 - yw2 + xz2 - yw2);
        return dest;
    }

    public Vector4f transformUnitPositiveX(Vector4f dest) {
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double zw2 = this.z * this.w;
        dest.x = (float)(1.0 - yy2 - yy2 - zz2 - zz2);
        dest.y = (float)(xy2 + zw2 + xy2 + zw2);
        dest.z = (float)(xz2 - yw2 + xz2 - yw2);
        return dest;
    }

    public Vector3f transformPositiveY(Vector3f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = (float)(-zw2 + xy2 - zw2 + xy2);
        dest.y = (float)(yy2 - zz2 + ww2 - xx2);
        dest.z = (float)(yz2 + yz2 + xw2 + xw2);
        return dest;
    }

    public Vector4f transformPositiveY(Vector4f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = (float)(-zw2 + xy2 - zw2 + xy2);
        dest.y = (float)(yy2 - zz2 + ww2 - xx2);
        dest.z = (float)(yz2 + yz2 + xw2 + xw2);
        return dest;
    }

    public Vector4f transformUnitPositiveY(Vector4f dest) {
        double xx2 = this.x * this.x;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        dest.x = (float)(xy2 - zw2 + xy2 - zw2);
        dest.y = (float)(1.0 - xx2 - xx2 - zz2 - zz2);
        dest.z = (float)(yz2 + yz2 + xw2 + xw2);
        return dest;
    }

    public Vector3f transformUnitPositiveY(Vector3f dest) {
        double xx2 = this.x * this.x;
        double zz2 = this.z * this.z;
        double xy2 = this.x * this.y;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        dest.x = (float)(xy2 - zw2 + xy2 - zw2);
        dest.y = (float)(1.0 - xx2 - xx2 - zz2 - zz2);
        dest.z = (float)(yz2 + yz2 + xw2 + xw2);
        return dest;
    }

    public Vector3f transformPositiveZ(Vector3f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = (float)(yw2 + xz2 + xz2 + yw2);
        dest.y = (float)(yz2 + yz2 - xw2 - xw2);
        dest.z = (float)(zz2 - yy2 - xx2 + ww2);
        return dest;
    }

    public Vector4f transformPositiveZ(Vector4f dest) {
        double ww2 = this.w * this.w;
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double xz2 = this.x * this.z;
        double yw2 = this.y * this.w;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        dest.x = (float)(yw2 + xz2 + xz2 + yw2);
        dest.y = (float)(yz2 + yz2 - xw2 - xw2);
        dest.z = (float)(zz2 - yy2 - xx2 + ww2);
        return dest;
    }

    public Vector4f transformUnitPositiveZ(Vector4f dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double yw2 = this.y * this.w;
        dest.x = (float)(xz2 + yw2 + xz2 + yw2);
        dest.y = (float)(yz2 + yz2 - xw2 - xw2);
        dest.z = (float)(1.0 - xx2 - xx2 - yy2 - yy2);
        return dest;
    }

    public Vector3f transformUnitPositiveZ(Vector3f dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double yw2 = this.y * this.w;
        dest.x = (float)(xz2 + yw2 + xz2 + yw2);
        dest.y = (float)(yz2 + yz2 - xw2 - xw2);
        dest.z = (float)(1.0 - xx2 - xx2 - yy2 - yy2);
        return dest;
    }

    public Vector4f transform(Vector4f vec) {
        return this.transform(vec, vec);
    }

    public Vector4f transformInverse(Vector4f vec) {
        return this.transformInverse(vec, vec);
    }

    public Vector3f transform(Vector3fc vec, Vector3f dest) {
        return this.transform((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector3f transformInverse(Vector3fc vec, Vector3f dest) {
        return this.transformInverse((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector3f transform(double x2, double y2, double z2, Vector3f dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double ww2 = this.w * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        double yw2 = this.y * this.w;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 - zw2) * k2, y2, 2.0 * (xz2 + yw2) * k2 * z2)), Math.fma(2.0 * (xy2 + zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 - xw2) * k2 * z2)), Math.fma(2.0 * (xz2 - yw2) * k2, x2, Math.fma(2.0 * (yz2 + xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)));
    }

    public Vector3f transformInverse(double x2, double y2, double z2, Vector3f dest) {
        double n2 = 1.0 / Math.fma(this.x, this.x, Math.fma(this.y, this.y, Math.fma(this.z, this.z, this.w * this.w)));
        double qx2 = this.x * n2;
        double qy2 = this.y * n2;
        double qz2 = this.z * n2;
        double qw2 = this.w * n2;
        double xx2 = qx2 * qx2;
        double yy2 = qy2 * qy2;
        double zz2 = qz2 * qz2;
        double ww2 = qw2 * qw2;
        double xy2 = qx2 * qy2;
        double xz2 = qx2 * qz2;
        double yz2 = qy2 * qz2;
        double xw2 = qx2 * qw2;
        double zw2 = qz2 * qw2;
        double yw2 = qy2 * qw2;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 + zw2) * k2, y2, 2.0 * (xz2 - yw2) * k2 * z2)), Math.fma(2.0 * (xy2 - zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 + xw2) * k2 * z2)), Math.fma(2.0 * (xz2 + yw2) * k2, x2, Math.fma(2.0 * (yz2 - xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)));
    }

    public Vector4f transform(Vector4fc vec, Vector4f dest) {
        return this.transform((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector4f transformInverse(Vector4fc vec, Vector4f dest) {
        return this.transformInverse((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector4f transform(double x2, double y2, double z2, Vector4f dest) {
        double xx2 = this.x * this.x;
        double yy2 = this.y * this.y;
        double zz2 = this.z * this.z;
        double ww2 = this.w * this.w;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double yz2 = this.y * this.z;
        double xw2 = this.x * this.w;
        double zw2 = this.z * this.w;
        double yw2 = this.y * this.w;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set((float)Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 - zw2) * k2, y2, 2.0 * (xz2 + yw2) * k2 * z2)), (float)Math.fma(2.0 * (xy2 + zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 - xw2) * k2 * z2)), (float)Math.fma(2.0 * (xz2 - yw2) * k2, x2, Math.fma(2.0 * (yz2 + xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)), dest.w);
    }

    public Vector4f transformInverse(double x2, double y2, double z2, Vector4f dest) {
        double n2 = 1.0 / Math.fma(this.x, this.x, Math.fma(this.y, this.y, Math.fma(this.z, this.z, this.w * this.w)));
        double qx2 = this.x * n2;
        double qy2 = this.y * n2;
        double qz2 = this.z * n2;
        double qw2 = this.w * n2;
        double xx2 = qx2 * qx2;
        double yy2 = qy2 * qy2;
        double zz2 = qz2 * qz2;
        double ww2 = qw2 * qw2;
        double xy2 = qx2 * qy2;
        double xz2 = qx2 * qz2;
        double yz2 = qy2 * qz2;
        double xw2 = qx2 * qw2;
        double zw2 = qz2 * qw2;
        double yw2 = qy2 * qw2;
        double k2 = 1.0 / (xx2 + yy2 + zz2 + ww2);
        return dest.set(Math.fma((xx2 - yy2 - zz2 + ww2) * k2, x2, Math.fma(2.0 * (xy2 + zw2) * k2, y2, 2.0 * (xz2 - yw2) * k2 * z2)), Math.fma(2.0 * (xy2 - zw2) * k2, x2, Math.fma((yy2 - xx2 - zz2 + ww2) * k2, y2, 2.0 * (yz2 + xw2) * k2 * z2)), Math.fma(2.0 * (xz2 + yw2) * k2, x2, Math.fma(2.0 * (yz2 - xw2) * k2, y2, (zz2 - xx2 - yy2 + ww2) * k2 * z2)), (double)dest.w);
    }

    public Vector4f transformUnit(Vector4f vec) {
        return this.transformUnit(vec, vec);
    }

    public Vector4f transformInverseUnit(Vector4f vec) {
        return this.transformInverseUnit(vec, vec);
    }

    public Vector3f transformUnit(Vector3fc vec, Vector3f dest) {
        return this.transformUnit((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector3f transformInverseUnit(Vector3fc vec, Vector3f dest) {
        return this.transformInverseUnit((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector3f transformUnit(double x2, double y2, double z2, Vector3f dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set((float)Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 - zw2), y2, 2.0 * (xz2 + yw2) * z2)), (float)Math.fma(2.0 * (xy2 + zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 - xw2) * z2)), (float)Math.fma(2.0 * (xz2 - yw2), x2, Math.fma(2.0 * (yz2 + xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Vector3f transformInverseUnit(double x2, double y2, double z2, Vector3f dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set((float)Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 + zw2), y2, 2.0 * (xz2 - yw2) * z2)), (float)Math.fma(2.0 * (xy2 - zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 + xw2) * z2)), (float)Math.fma(2.0 * (xz2 + yw2), x2, Math.fma(2.0 * (yz2 - xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Vector4f transformUnit(Vector4fc vec, Vector4f dest) {
        return this.transformUnit((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector4f transformInverseUnit(Vector4fc vec, Vector4f dest) {
        return this.transformInverseUnit((double)vec.x(), (double)vec.y(), (double)vec.z(), dest);
    }

    public Vector4f transformUnit(double x2, double y2, double z2, Vector4f dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set((float)Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 - zw2), y2, 2.0 * (xz2 + yw2) * z2)), (float)Math.fma(2.0 * (xy2 + zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 - xw2) * z2)), (float)Math.fma(2.0 * (xz2 - yw2), x2, Math.fma(2.0 * (yz2 + xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Vector4f transformInverseUnit(double x2, double y2, double z2, Vector4f dest) {
        double xx2 = this.x * this.x;
        double xy2 = this.x * this.y;
        double xz2 = this.x * this.z;
        double xw2 = this.x * this.w;
        double yy2 = this.y * this.y;
        double yz2 = this.y * this.z;
        double yw2 = this.y * this.w;
        double zz2 = this.z * this.z;
        double zw2 = this.z * this.w;
        return dest.set((float)Math.fma(Math.fma(-2.0, yy2 + zz2, 1.0), x2, Math.fma(2.0 * (xy2 + zw2), y2, 2.0 * (xz2 - yw2) * z2)), (float)Math.fma(2.0 * (xy2 - zw2), x2, Math.fma(Math.fma(-2.0, xx2 + zz2, 1.0), y2, 2.0 * (yz2 + xw2) * z2)), (float)Math.fma(2.0 * (xz2 + yw2), x2, Math.fma(2.0 * (yz2 - xw2), y2, Math.fma(-2.0, xx2 + yy2, 1.0) * z2)));
    }

    public Quaterniond invert(Quaterniond dest) {
        double invNorm = 1.0 / this.lengthSquared();
        dest.x = -this.x * invNorm;
        dest.y = -this.y * invNorm;
        dest.z = -this.z * invNorm;
        dest.w = this.w * invNorm;
        return dest;
    }

    public Quaterniond invert() {
        return this.invert(this);
    }

    public Quaterniond div(Quaterniondc b2, Quaterniond dest) {
        double invNorm = 1.0 / Math.fma(b2.x(), b2.x(), Math.fma(b2.y(), b2.y(), Math.fma(b2.z(), b2.z(), b2.w() * b2.w())));
        double x2 = -b2.x() * invNorm;
        double y2 = -b2.y() * invNorm;
        double z2 = -b2.z() * invNorm;
        double w2 = b2.w() * invNorm;
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public Quaterniond div(Quaterniondc b2) {
        return this.div(b2, this);
    }

    public Quaterniond div(double d2, Quaterniond dest) {
        dest.x = this.x / d2;
        dest.y = this.y / d2;
        dest.z = this.z / d2;
        dest.w = this.w / d2;
        return this;
    }

    public Quaterniond div(double d2) {
        return this.div(d2, this);
    }

    public Quaterniond conjugate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
        return this;
    }

    public Quaterniond conjugate(Quaterniond dest) {
        dest.x = -this.x;
        dest.y = -this.y;
        dest.z = -this.z;
        dest.w = this.w;
        return dest;
    }

    public Quaterniond identity() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.w = 1.0;
        return this;
    }

    public double lengthSquared() {
        return Math.fma(this.x, this.x, Math.fma(this.y, this.y, Math.fma(this.z, this.z, this.w * this.w)));
    }

    public Quaterniond rotationXYZ(double angleX, double angleY, double angleZ) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double cycz = cy2 * cz2;
        double sysz = sy2 * sz2;
        double sycz = sy2 * cz2;
        double cysz = cy2 * sz2;
        this.w = cx2 * cycz - sx2 * sysz;
        this.x = sx2 * cycz + cx2 * sysz;
        this.y = cx2 * sycz - sx2 * cysz;
        this.z = cx2 * cysz + sx2 * sycz;
        return this;
    }

    public Quaterniond rotationZYX(double angleZ, double angleY, double angleX) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double cycz = cy2 * cz2;
        double sysz = sy2 * sz2;
        double sycz = sy2 * cz2;
        double cysz = cy2 * sz2;
        this.w = cx2 * cycz + sx2 * sysz;
        this.x = sx2 * cycz - cx2 * sysz;
        this.y = cx2 * sycz + sx2 * cysz;
        this.z = cx2 * cysz - sx2 * sycz;
        return this;
    }

    public Quaterniond rotationYXZ(double angleY, double angleX, double angleZ) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double x2 = cy2 * sx2;
        double y2 = sy2 * cx2;
        double z2 = sy2 * sx2;
        double w2 = cy2 * cx2;
        this.x = x2 * cz2 + y2 * sz2;
        this.y = y2 * cz2 - x2 * sz2;
        this.z = w2 * sz2 - z2 * cz2;
        this.w = w2 * cz2 + z2 * sz2;
        return this;
    }

    public Quaterniond slerp(Quaterniondc target, double alpha) {
        return this.slerp(target, alpha, this);
    }

    public Quaterniond slerp(Quaterniondc target, double alpha, Quaterniond dest) {
        double scale1;
        double scale0;
        double cosom = Math.fma(this.x, target.x(), Math.fma(this.y, target.y(), Math.fma(this.z, target.z(), this.w * target.w())));
        double absCosom = Math.abs(cosom);
        if (1.0 - absCosom > 1.0E-6) {
            double sinSqr = 1.0 - absCosom * absCosom;
            double sinom = Math.invsqrt(sinSqr);
            double omega = Math.atan2(sinSqr * sinom, absCosom);
            scale0 = Math.sin((1.0 - alpha) * omega) * sinom;
            scale1 = Math.sin(alpha * omega) * sinom;
        } else {
            scale0 = 1.0 - alpha;
            scale1 = alpha;
        }
        scale1 = cosom >= 0.0 ? scale1 : -scale1;
        dest.x = Math.fma(scale0, this.x, scale1 * target.x());
        dest.y = Math.fma(scale0, this.y, scale1 * target.y());
        dest.z = Math.fma(scale0, this.z, scale1 * target.z());
        dest.w = Math.fma(scale0, this.w, scale1 * target.w());
        return dest;
    }

    public static Quaterniondc slerp(Quaterniond[] qs2, double[] weights, Quaterniond dest) {
        dest.set(qs2[0]);
        double w2 = weights[0];
        for (int i2 = 1; i2 < qs2.length; ++i2) {
            double w0 = w2;
            double w1 = weights[i2];
            double rw1 = w1 / (w0 + w1);
            w2 += w1;
            dest.slerp(qs2[i2], rw1);
        }
        return dest;
    }

    public Quaterniond scale(double factor) {
        return this.scale(factor, this);
    }

    public Quaterniond scale(double factor, Quaterniond dest) {
        double sqrt = Math.sqrt(factor);
        dest.x = sqrt * this.x;
        dest.y = sqrt * this.y;
        dest.z = sqrt * this.z;
        dest.w = sqrt * this.w;
        return dest;
    }

    public Quaterniond scaling(double factor) {
        double sqrt = Math.sqrt(factor);
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.w = sqrt;
        return this;
    }

    public Quaterniond integrate(double dt2, double vx2, double vy2, double vz2) {
        return this.integrate(dt2, vx2, vy2, vz2, this);
    }

    public Quaterniond integrate(double dt2, double vx2, double vy2, double vz2, Quaterniond dest) {
        double s2;
        double dqW;
        double thetaX = dt2 * vx2 * 0.5;
        double thetaY = dt2 * vy2 * 0.5;
        double thetaZ = dt2 * vz2 * 0.5;
        double thetaMagSq = thetaX * thetaX + thetaY * thetaY + thetaZ * thetaZ;
        if (thetaMagSq * thetaMagSq / 24.0 < 1.0E-8) {
            dqW = 1.0 - thetaMagSq * 0.5;
            s2 = 1.0 - thetaMagSq / 6.0;
        } else {
            double thetaMag = Math.sqrt(thetaMagSq);
            double sin = Math.sin(thetaMag);
            s2 = sin / thetaMag;
            dqW = Math.cosFromSin(sin, thetaMag);
        }
        double dqX = thetaX * s2;
        double dqY = thetaY * s2;
        double dqZ = thetaZ * s2;
        return dest.set(Math.fma(dqW, this.x, Math.fma(dqX, this.w, Math.fma(dqY, this.z, -dqZ * this.y))), Math.fma(dqW, this.y, Math.fma(-dqX, this.z, Math.fma(dqY, this.w, dqZ * this.x))), Math.fma(dqW, this.z, Math.fma(dqX, this.y, Math.fma(-dqY, this.x, dqZ * this.w))), Math.fma(dqW, this.w, Math.fma(-dqX, this.x, Math.fma(-dqY, this.y, -dqZ * this.z))));
    }

    public Quaterniond nlerp(Quaterniondc q2, double factor) {
        return this.nlerp(q2, factor, this);
    }

    public Quaterniond nlerp(Quaterniondc q2, double factor, Quaterniond dest) {
        double cosom = Math.fma(this.x, q2.x(), Math.fma(this.y, q2.y(), Math.fma(this.z, q2.z(), this.w * q2.w())));
        double scale0 = 1.0 - factor;
        double scale1 = cosom >= 0.0 ? factor : -factor;
        dest.x = Math.fma(scale0, this.x, scale1 * q2.x());
        dest.y = Math.fma(scale0, this.y, scale1 * q2.y());
        dest.z = Math.fma(scale0, this.z, scale1 * q2.z());
        dest.w = Math.fma(scale0, this.w, scale1 * q2.w());
        double s2 = Math.invsqrt(Math.fma(dest.x, dest.x, Math.fma(dest.y, dest.y, Math.fma(dest.z, dest.z, dest.w * dest.w))));
        dest.x *= s2;
        dest.y *= s2;
        dest.z *= s2;
        dest.w *= s2;
        return dest;
    }

    public static Quaterniondc nlerp(Quaterniond[] qs2, double[] weights, Quaterniond dest) {
        dest.set(qs2[0]);
        double w2 = weights[0];
        for (int i2 = 1; i2 < qs2.length; ++i2) {
            double w0 = w2;
            double w1 = weights[i2];
            double rw1 = w1 / (w0 + w1);
            w2 += w1;
            dest.nlerp(qs2[i2], rw1);
        }
        return dest;
    }

    public Quaterniond nlerpIterative(Quaterniondc q2, double alpha, double dotThreshold, Quaterniond dest) {
        double scale1;
        double scale0;
        double q2w;
        double q2z;
        double q2y;
        double q1x = this.x;
        double q1y = this.y;
        double q1z = this.z;
        double q1w = this.w;
        double q2x = q2.x();
        double dot = Math.fma(q1x, q2x, Math.fma(q1y, q2y = q2.y(), Math.fma(q1z, q2z = q2.z(), q1w * (q2w = q2.w()))));
        double absDot = Math.abs(dot);
        if (0.999999 < absDot) {
            return dest.set(this);
        }
        double alphaN = alpha;
        while (absDot < dotThreshold) {
            float s2;
            scale0 = 0.5;
            double d2 = scale1 = dot >= 0.0 ? 0.5 : -0.5;
            if (alphaN < 0.5) {
                q2x = Math.fma(scale0, q2x, scale1 * q1x);
                q2y = Math.fma(scale0, q2y, scale1 * q1y);
                q2z = Math.fma(scale0, q2z, scale1 * q1z);
                q2w = Math.fma(scale0, q2w, scale1 * q1w);
                s2 = (float)Math.invsqrt(Math.fma(q2x, q2x, Math.fma(q2y, q2y, Math.fma(q2z, q2z, q2w * q2w))));
                q2x *= (double)s2;
                q2y *= (double)s2;
                q2z *= (double)s2;
                q2w *= (double)s2;
                alphaN += alphaN;
            } else {
                q1x = Math.fma(scale0, q1x, scale1 * q2x);
                q1y = Math.fma(scale0, q1y, scale1 * q2y);
                q1z = Math.fma(scale0, q1z, scale1 * q2z);
                q1w = Math.fma(scale0, q1w, scale1 * q2w);
                s2 = (float)Math.invsqrt(Math.fma(q1x, q1x, Math.fma(q1y, q1y, Math.fma(q1z, q1z, q1w * q1w))));
                q1x *= (double)s2;
                q1y *= (double)s2;
                q1z *= (double)s2;
                q1w *= (double)s2;
                alphaN = alphaN + alphaN - 1.0;
            }
            dot = Math.fma(q1x, q2x, Math.fma(q1y, q2y, Math.fma(q1z, q2z, q1w * q2w)));
            absDot = Math.abs(dot);
        }
        scale0 = 1.0 - alphaN;
        scale1 = dot >= 0.0 ? alphaN : -alphaN;
        double resX = Math.fma(scale0, q1x, scale1 * q2x);
        double resY = Math.fma(scale0, q1y, scale1 * q2y);
        double resZ = Math.fma(scale0, q1z, scale1 * q2z);
        double resW = Math.fma(scale0, q1w, scale1 * q2w);
        double s3 = Math.invsqrt(Math.fma(resX, resX, Math.fma(resY, resY, Math.fma(resZ, resZ, resW * resW))));
        dest.x = resX * s3;
        dest.y = resY * s3;
        dest.z = resZ * s3;
        dest.w = resW * s3;
        return dest;
    }

    public Quaterniond nlerpIterative(Quaterniondc q2, double alpha, double dotThreshold) {
        return this.nlerpIterative(q2, alpha, dotThreshold, this);
    }

    public static Quaterniond nlerpIterative(Quaterniondc[] qs2, double[] weights, double dotThreshold, Quaterniond dest) {
        dest.set(qs2[0]);
        double w2 = weights[0];
        for (int i2 = 1; i2 < qs2.length; ++i2) {
            double w0 = w2;
            double w1 = weights[i2];
            double rw1 = w1 / (w0 + w1);
            w2 += w1;
            dest.nlerpIterative(qs2[i2], rw1, dotThreshold);
        }
        return dest;
    }

    public Quaterniond lookAlong(Vector3dc dir, Vector3dc up2) {
        return this.lookAlong(dir.x(), dir.y(), dir.z(), up2.x(), up2.y(), up2.z(), this);
    }

    public Quaterniond lookAlong(Vector3dc dir, Vector3dc up2, Quaterniond dest) {
        return this.lookAlong(dir.x(), dir.y(), dir.z(), up2.x(), up2.y(), up2.z(), dest);
    }

    public Quaterniond lookAlong(double dirX, double dirY, double dirZ, double upX, double upY, double upZ) {
        return this.lookAlong(dirX, dirY, dirZ, upX, upY, upZ, this);
    }

    public Quaterniond lookAlong(double dirX, double dirY, double dirZ, double upX, double upY, double upZ, Quaterniond dest) {
        double z2;
        double y2;
        double x2;
        double w2;
        double invDirLength = Math.invsqrt(dirX * dirX + dirY * dirY + dirZ * dirZ);
        double dirnX = -dirX * invDirLength;
        double dirnY = -dirY * invDirLength;
        double dirnZ = -dirZ * invDirLength;
        double leftX = upY * dirnZ - upZ * dirnY;
        double leftY = upZ * dirnX - upX * dirnZ;
        double leftZ = upX * dirnY - upY * dirnX;
        double invLeftLength = Math.invsqrt(leftX * leftX + leftY * leftY + leftZ * leftZ);
        double upnX = dirnY * (leftZ *= invLeftLength) - dirnZ * (leftY *= invLeftLength);
        double upnY = dirnZ * (leftX *= invLeftLength) - dirnX * leftZ;
        double upnZ = dirnX * leftY - dirnY * leftX;
        double tr2 = leftX + upnY + dirnZ;
        if (tr2 >= 0.0) {
            double t2 = Math.sqrt(tr2 + 1.0);
            w2 = t2 * 0.5;
            t2 = 0.5 / t2;
            x2 = (dirnY - upnZ) * t2;
            y2 = (leftZ - dirnX) * t2;
            z2 = (upnX - leftY) * t2;
        } else if (leftX > upnY && leftX > dirnZ) {
            double t3 = Math.sqrt(1.0 + leftX - upnY - dirnZ);
            x2 = t3 * 0.5;
            t3 = 0.5 / t3;
            y2 = (leftY + upnX) * t3;
            z2 = (dirnX + leftZ) * t3;
            w2 = (dirnY - upnZ) * t3;
        } else if (upnY > dirnZ) {
            double t4 = Math.sqrt(1.0 + upnY - leftX - dirnZ);
            y2 = t4 * 0.5;
            t4 = 0.5 / t4;
            x2 = (leftY + upnX) * t4;
            z2 = (upnZ + dirnY) * t4;
            w2 = (leftZ - dirnX) * t4;
        } else {
            double t5 = Math.sqrt(1.0 + dirnZ - leftX - upnY);
            z2 = t5 * 0.5;
            t5 = 0.5 / t5;
            x2 = (dirnX + leftZ) * t5;
            y2 = (upnZ + dirnY) * t5;
            w2 = (upnX - leftY) * t5;
        }
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public String toString() {
        return Runtime.formatNumbers(this.toString(Options.NUMBER_FORMAT));
    }

    public String toString(NumberFormat formatter) {
        return "(" + Runtime.format(this.x, formatter) + " " + Runtime.format(this.y, formatter) + " " + Runtime.format(this.z, formatter) + " " + Runtime.format(this.w, formatter) + ")";
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(this.x);
        out.writeDouble(this.y);
        out.writeDouble(this.z);
        out.writeDouble(this.w);
    }

    public void readExternal(ObjectInput in2) throws IOException, ClassNotFoundException {
        this.x = in2.readDouble();
        this.y = in2.readDouble();
        this.z = in2.readDouble();
        this.w = in2.readDouble();
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp = Double.doubleToLongBits(this.w);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.x);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.y);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.z);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Quaterniond other = (Quaterniond)obj;
        if (Double.doubleToLongBits(this.w) != Double.doubleToLongBits(other.w)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return Double.doubleToLongBits(this.z) == Double.doubleToLongBits(other.z);
    }

    public Quaterniond difference(Quaterniondc other) {
        return this.difference(other, this);
    }

    public Quaterniond difference(Quaterniondc other, Quaterniond dest) {
        double invNorm = 1.0 / this.lengthSquared();
        double x2 = -this.x * invNorm;
        double y2 = -this.y * invNorm;
        double z2 = -this.z * invNorm;
        double w2 = this.w * invNorm;
        dest.set(Math.fma(w2, other.x(), Math.fma(x2, other.w(), Math.fma(y2, other.z(), -z2 * other.y()))), Math.fma(w2, other.y(), Math.fma(-x2, other.z(), Math.fma(y2, other.w(), z2 * other.x()))), Math.fma(w2, other.z(), Math.fma(x2, other.y(), Math.fma(-y2, other.x(), z2 * other.w()))), Math.fma(w2, other.w(), Math.fma(-x2, other.x(), Math.fma(-y2, other.y(), -z2 * other.z()))));
        return dest;
    }

    public Quaterniond rotationTo(double fromDirX, double fromDirY, double fromDirZ, double toDirX, double toDirY, double toDirZ) {
        double tz2;
        double fz2;
        double ty2;
        double fy2;
        double tn2;
        double tx2;
        double fn2 = Math.invsqrt(Math.fma(fromDirX, fromDirX, Math.fma(fromDirY, fromDirY, fromDirZ * fromDirZ)));
        double fx2 = fromDirX * fn2;
        double dot = fx2 * (tx2 = toDirX * (tn2 = Math.invsqrt(Math.fma(toDirX, toDirX, Math.fma(toDirY, toDirY, toDirZ * toDirZ))))) + (fy2 = fromDirY * fn2) * (ty2 = toDirY * tn2) + (fz2 = fromDirZ * fn2) * (tz2 = toDirZ * tn2);
        if (dot < -0.999999) {
            double x2 = fy2;
            double y2 = -fx2;
            double z2 = 0.0;
            double w2 = 0.0;
            if (x2 * x2 + y2 * y2 == 0.0) {
                x2 = 0.0;
                y2 = fz2;
                z2 = -fy2;
                w2 = 0.0;
            }
            this.x = x2;
            this.y = y2;
            this.z = z2;
            this.w = 0.0;
        } else {
            double sd2 = Math.sqrt((1.0 + dot) * 2.0);
            double isd2 = 1.0 / sd2;
            double cx2 = fy2 * tz2 - fz2 * ty2;
            double cy2 = fz2 * tx2 - fx2 * tz2;
            double cz2 = fx2 * ty2 - fy2 * tx2;
            double x3 = cx2 * isd2;
            double y3 = cy2 * isd2;
            double z3 = cz2 * isd2;
            double w3 = sd2 * 0.5;
            double n2 = Math.invsqrt(Math.fma(x3, x3, Math.fma(y3, y3, Math.fma(z3, z3, w3 * w3))));
            this.x = x3 * n2;
            this.y = y3 * n2;
            this.z = z3 * n2;
            this.w = w3 * n2;
        }
        return this;
    }

    public Quaterniond rotationTo(Vector3dc fromDir, Vector3dc toDir) {
        return this.rotationTo(fromDir.x(), fromDir.y(), fromDir.z(), toDir.x(), toDir.y(), toDir.z());
    }

    public Quaterniond rotateTo(double fromDirX, double fromDirY, double fromDirZ, double toDirX, double toDirY, double toDirZ, Quaterniond dest) {
        double w2;
        double z2;
        double y2;
        double x2;
        double tz2;
        double fz2;
        double ty2;
        double fy2;
        double tn2;
        double tx2;
        double fn2 = Math.invsqrt(Math.fma(fromDirX, fromDirX, Math.fma(fromDirY, fromDirY, fromDirZ * fromDirZ)));
        double fx2 = fromDirX * fn2;
        double dot = fx2 * (tx2 = toDirX * (tn2 = Math.invsqrt(Math.fma(toDirX, toDirX, Math.fma(toDirY, toDirY, toDirZ * toDirZ))))) + (fy2 = fromDirY * fn2) * (ty2 = toDirY * tn2) + (fz2 = fromDirZ * fn2) * (tz2 = toDirZ * tn2);
        if (dot < -0.999999) {
            x2 = fy2;
            y2 = -fx2;
            z2 = 0.0;
            w2 = 0.0;
            if (x2 * x2 + y2 * y2 == 0.0) {
                x2 = 0.0;
                y2 = fz2;
                z2 = -fy2;
                w2 = 0.0;
            }
        } else {
            double sd2 = Math.sqrt((1.0 + dot) * 2.0);
            double isd2 = 1.0 / sd2;
            double cx2 = fy2 * tz2 - fz2 * ty2;
            double cy2 = fz2 * tx2 - fx2 * tz2;
            double cz2 = fx2 * ty2 - fy2 * tx2;
            x2 = cx2 * isd2;
            y2 = cy2 * isd2;
            z2 = cz2 * isd2;
            w2 = sd2 * 0.5;
            double n2 = Math.invsqrt(Math.fma(x2, x2, Math.fma(y2, y2, Math.fma(z2, z2, w2 * w2))));
            x2 *= n2;
            y2 *= n2;
            z2 *= n2;
            w2 *= n2;
        }
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public Quaterniond rotationAxis(AxisAngle4f axisAngle) {
        return this.rotationAxis(axisAngle.angle, axisAngle.x, axisAngle.y, axisAngle.z);
    }

    public Quaterniond rotationAxis(double angle, double axisX, double axisY, double axisZ) {
        double hangle = angle / 2.0;
        double sinAngle = Math.sin(hangle);
        double invVLength = Math.invsqrt(axisX * axisX + axisY * axisY + axisZ * axisZ);
        return this.set(axisX * invVLength * sinAngle, axisY * invVLength * sinAngle, axisZ * invVLength * sinAngle, Math.cosFromSin(sinAngle, hangle));
    }

    public Quaterniond rotationX(double angle) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return this.set(sin, 0.0, cos, 0.0);
    }

    public Quaterniond rotationY(double angle) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return this.set(0.0, sin, 0.0, cos);
    }

    public Quaterniond rotationZ(double angle) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return this.set(0.0, 0.0, sin, cos);
    }

    public Quaterniond rotateTo(double fromDirX, double fromDirY, double fromDirZ, double toDirX, double toDirY, double toDirZ) {
        return this.rotateTo(fromDirX, fromDirY, fromDirZ, toDirX, toDirY, toDirZ, this);
    }

    public Quaterniond rotateTo(Vector3dc fromDir, Vector3dc toDir, Quaterniond dest) {
        return this.rotateTo(fromDir.x(), fromDir.y(), fromDir.z(), toDir.x(), toDir.y(), toDir.z(), dest);
    }

    public Quaterniond rotateTo(Vector3dc fromDir, Vector3dc toDir) {
        return this.rotateTo(fromDir.x(), fromDir.y(), fromDir.z(), toDir.x(), toDir.y(), toDir.z(), this);
    }

    public Quaterniond rotateX(double angle) {
        return this.rotateX(angle, this);
    }

    public Quaterniond rotateX(double angle, Quaterniond dest) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return dest.set(this.w * sin + this.x * cos, this.y * cos + this.z * sin, this.z * cos - this.y * sin, this.w * cos - this.x * sin);
    }

    public Quaterniond rotateY(double angle) {
        return this.rotateY(angle, this);
    }

    public Quaterniond rotateY(double angle, Quaterniond dest) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return dest.set(this.x * cos - this.z * sin, this.w * sin + this.y * cos, this.x * sin + this.z * cos, this.w * cos - this.y * sin);
    }

    public Quaterniond rotateZ(double angle) {
        return this.rotateZ(angle, this);
    }

    public Quaterniond rotateZ(double angle, Quaterniond dest) {
        double sin = Math.sin(angle * 0.5);
        double cos = Math.cosFromSin(sin, angle * 0.5);
        return dest.set(this.x * cos + this.y * sin, this.y * cos - this.x * sin, this.w * sin + this.z * cos, this.w * cos - this.z * sin);
    }

    public Quaterniond rotateLocalX(double angle) {
        return this.rotateLocalX(angle, this);
    }

    public Quaterniond rotateLocalX(double angle, Quaterniond dest) {
        double hangle = angle * 0.5;
        double s2 = Math.sin(hangle);
        double c2 = Math.cosFromSin(s2, hangle);
        dest.set(c2 * this.x + s2 * this.w, c2 * this.y - s2 * this.z, c2 * this.z + s2 * this.y, c2 * this.w - s2 * this.x);
        return dest;
    }

    public Quaterniond rotateLocalY(double angle) {
        return this.rotateLocalY(angle, this);
    }

    public Quaterniond rotateLocalY(double angle, Quaterniond dest) {
        double hangle = angle * 0.5;
        double s2 = Math.sin(hangle);
        double c2 = Math.cosFromSin(s2, hangle);
        dest.set(c2 * this.x + s2 * this.z, c2 * this.y + s2 * this.w, c2 * this.z - s2 * this.x, c2 * this.w - s2 * this.y);
        return dest;
    }

    public Quaterniond rotateLocalZ(double angle) {
        return this.rotateLocalZ(angle, this);
    }

    public Quaterniond rotateLocalZ(double angle, Quaterniond dest) {
        double hangle = angle * 0.5;
        double s2 = Math.sin(hangle);
        double c2 = Math.cosFromSin(s2, hangle);
        dest.set(c2 * this.x - s2 * this.y, c2 * this.y + s2 * this.x, c2 * this.z + s2 * this.w, c2 * this.w - s2 * this.z);
        return dest;
    }

    public Quaterniond rotateXYZ(double angleX, double angleY, double angleZ) {
        return this.rotateXYZ(angleX, angleY, angleZ, this);
    }

    public Quaterniond rotateXYZ(double angleX, double angleY, double angleZ, Quaterniond dest) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double cycz = cy2 * cz2;
        double sysz = sy2 * sz2;
        double sycz = sy2 * cz2;
        double cysz = cy2 * sz2;
        double w2 = cx2 * cycz - sx2 * sysz;
        double x2 = sx2 * cycz + cx2 * sysz;
        double y2 = cx2 * sycz - sx2 * cysz;
        double z2 = cx2 * cysz + sx2 * sycz;
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public Quaterniond rotateZYX(double angleZ, double angleY, double angleX) {
        return this.rotateZYX(angleZ, angleY, angleX, this);
    }

    public Quaterniond rotateZYX(double angleZ, double angleY, double angleX, Quaterniond dest) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double cycz = cy2 * cz2;
        double sysz = sy2 * sz2;
        double sycz = sy2 * cz2;
        double cysz = cy2 * sz2;
        double w2 = cx2 * cycz + sx2 * sysz;
        double x2 = sx2 * cycz - cx2 * sysz;
        double y2 = cx2 * sycz + sx2 * cysz;
        double z2 = cx2 * cysz - sx2 * sycz;
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public Quaterniond rotateYXZ(double angleY, double angleX, double angleZ) {
        return this.rotateYXZ(angleY, angleX, angleZ, this);
    }

    public Quaterniond rotateYXZ(double angleY, double angleX, double angleZ, Quaterniond dest) {
        double sx2 = Math.sin(angleX * 0.5);
        double cx2 = Math.cosFromSin(sx2, angleX * 0.5);
        double sy2 = Math.sin(angleY * 0.5);
        double cy2 = Math.cosFromSin(sy2, angleY * 0.5);
        double sz2 = Math.sin(angleZ * 0.5);
        double cz2 = Math.cosFromSin(sz2, angleZ * 0.5);
        double yx2 = cy2 * sx2;
        double yy2 = sy2 * cx2;
        double yz2 = sy2 * sx2;
        double yw2 = cy2 * cx2;
        double x2 = yx2 * cz2 + yy2 * sz2;
        double y2 = yy2 * cz2 - yx2 * sz2;
        double z2 = yw2 * sz2 - yz2 * cz2;
        double w2 = yw2 * cz2 + yz2 * sz2;
        return dest.set(Math.fma(this.w, x2, Math.fma(this.x, w2, Math.fma(this.y, z2, -this.z * y2))), Math.fma(this.w, y2, Math.fma(-this.x, z2, Math.fma(this.y, w2, this.z * x2))), Math.fma(this.w, z2, Math.fma(this.x, y2, Math.fma(-this.y, x2, this.z * w2))), Math.fma(this.w, w2, Math.fma(-this.x, x2, Math.fma(-this.y, y2, -this.z * z2))));
    }

    public Vector3d getEulerAnglesXYZ(Vector3d eulerAngles) {
        eulerAngles.x = Math.atan2(this.x * this.w - this.y * this.z, 0.5 - this.x * this.x - this.y * this.y);
        eulerAngles.y = Math.safeAsin(2.0 * (this.x * this.z + this.y * this.w));
        eulerAngles.z = Math.atan2(this.z * this.w - this.x * this.y, 0.5 - this.y * this.y - this.z * this.z);
        return eulerAngles;
    }

    public Vector3d getEulerAnglesZYX(Vector3d eulerAngles) {
        eulerAngles.x = Math.atan2(this.y * this.z + this.w * this.x, 0.5 - this.x * this.x - this.y * this.y);
        eulerAngles.y = Math.safeAsin(-2.0 * (this.x * this.z - this.w * this.y));
        eulerAngles.z = Math.atan2(this.x * this.y + this.w * this.z, 0.5 - this.y * this.y - this.z * this.z);
        return eulerAngles;
    }

    public Vector3d getEulerAnglesZXY(Vector3d eulerAngles) {
        eulerAngles.x = Math.safeAsin(2.0 * (this.w * this.x + this.y * this.z));
        eulerAngles.y = Math.atan2(this.w * this.y - this.x * this.z, 0.5 - this.y * this.y - this.x * this.x);
        eulerAngles.z = Math.atan2(this.w * this.z - this.x * this.y, 0.5 - this.z * this.z - this.x * this.x);
        return eulerAngles;
    }

    public Vector3d getEulerAnglesYXZ(Vector3d eulerAngles) {
        eulerAngles.x = Math.safeAsin(-2.0 * (this.y * this.z - this.w * this.x));
        eulerAngles.y = Math.atan2(this.x * this.z + this.y * this.w, 0.5 - this.y * this.y - this.x * this.x);
        eulerAngles.z = Math.atan2(this.y * this.x + this.w * this.z, 0.5 - this.x * this.x - this.z * this.z);
        return eulerAngles;
    }

    public Quaterniond rotateAxis(double angle, double axisX, double axisY, double axisZ, Quaterniond dest) {
        double hangle = angle / 2.0;
        double sinAngle = Math.sin(hangle);
        double invVLength = Math.invsqrt(Math.fma(axisX, axisX, Math.fma(axisY, axisY, axisZ * axisZ)));
        double rx2 = axisX * invVLength * sinAngle;
        double ry2 = axisY * invVLength * sinAngle;
        double rz2 = axisZ * invVLength * sinAngle;
        double rw2 = Math.cosFromSin(sinAngle, hangle);
        return dest.set(Math.fma(this.w, rx2, Math.fma(this.x, rw2, Math.fma(this.y, rz2, -this.z * ry2))), Math.fma(this.w, ry2, Math.fma(-this.x, rz2, Math.fma(this.y, rw2, this.z * rx2))), Math.fma(this.w, rz2, Math.fma(this.x, ry2, Math.fma(-this.y, rx2, this.z * rw2))), Math.fma(this.w, rw2, Math.fma(-this.x, rx2, Math.fma(-this.y, ry2, -this.z * rz2))));
    }

    public Quaterniond rotateAxis(double angle, Vector3dc axis, Quaterniond dest) {
        return this.rotateAxis(angle, axis.x(), axis.y(), axis.z(), dest);
    }

    public Quaterniond rotateAxis(double angle, Vector3dc axis) {
        return this.rotateAxis(angle, axis.x(), axis.y(), axis.z(), this);
    }

    public Quaterniond rotateAxis(double angle, double axisX, double axisY, double axisZ) {
        return this.rotateAxis(angle, axisX, axisY, axisZ, this);
    }

    public Vector3d positiveX(Vector3d dir) {
        double invNorm = 1.0 / this.lengthSquared();
        double nx2 = -this.x * invNorm;
        double ny2 = -this.y * invNorm;
        double nz2 = -this.z * invNorm;
        double nw2 = this.w * invNorm;
        double dy2 = ny2 + ny2;
        double dz2 = nz2 + nz2;
        dir.x = -ny2 * dy2 - nz2 * dz2 + 1.0;
        dir.y = nx2 * dy2 + nw2 * dz2;
        dir.z = nx2 * dz2 - nw2 * dy2;
        return dir;
    }

    public Vector3d normalizedPositiveX(Vector3d dir) {
        double dy2 = this.y + this.y;
        double dz2 = this.z + this.z;
        dir.x = -this.y * dy2 - this.z * dz2 + 1.0;
        dir.y = this.x * dy2 - this.w * dz2;
        dir.z = this.x * dz2 + this.w * dy2;
        return dir;
    }

    public Vector3d positiveY(Vector3d dir) {
        double invNorm = 1.0 / this.lengthSquared();
        double nx2 = -this.x * invNorm;
        double ny2 = -this.y * invNorm;
        double nz2 = -this.z * invNorm;
        double nw2 = this.w * invNorm;
        double dx2 = nx2 + nx2;
        double dy2 = ny2 + ny2;
        double dz2 = nz2 + nz2;
        dir.x = nx2 * dy2 - nw2 * dz2;
        dir.y = -nx2 * dx2 - nz2 * dz2 + 1.0;
        dir.z = ny2 * dz2 + nw2 * dx2;
        return dir;
    }

    public Vector3d normalizedPositiveY(Vector3d dir) {
        double dx2 = this.x + this.x;
        double dy2 = this.y + this.y;
        double dz2 = this.z + this.z;
        dir.x = this.x * dy2 + this.w * dz2;
        dir.y = -this.x * dx2 - this.z * dz2 + 1.0;
        dir.z = this.y * dz2 - this.w * dx2;
        return dir;
    }

    public Vector3d positiveZ(Vector3d dir) {
        double invNorm = 1.0 / this.lengthSquared();
        double nx2 = -this.x * invNorm;
        double ny2 = -this.y * invNorm;
        double nz2 = -this.z * invNorm;
        double nw2 = this.w * invNorm;
        double dx2 = nx2 + nx2;
        double dy2 = ny2 + ny2;
        double dz2 = nz2 + nz2;
        dir.x = nx2 * dz2 + nw2 * dy2;
        dir.y = ny2 * dz2 - nw2 * dx2;
        dir.z = -nx2 * dx2 - ny2 * dy2 + 1.0;
        return dir;
    }

    public Vector3d normalizedPositiveZ(Vector3d dir) {
        double dx2 = this.x + this.x;
        double dy2 = this.y + this.y;
        double dz2 = this.z + this.z;
        dir.x = this.x * dz2 - this.w * dy2;
        dir.y = this.y * dz2 + this.w * dx2;
        dir.z = -this.x * dx2 - this.y * dy2 + 1.0;
        return dir;
    }

    public Quaterniond conjugateBy(Quaterniondc q2) {
        return this.conjugateBy(q2, this);
    }

    public Quaterniond conjugateBy(Quaterniondc q2, Quaterniond dest) {
        double invNorm = 1.0 / q2.lengthSquared();
        double qix = -q2.x() * invNorm;
        double qiy = -q2.y() * invNorm;
        double qiz = -q2.z() * invNorm;
        double qiw = q2.w() * invNorm;
        double qpx = Math.fma(q2.w(), this.x, Math.fma(q2.x(), this.w, Math.fma(q2.y(), this.z, -q2.z() * this.y)));
        double qpy = Math.fma(q2.w(), this.y, Math.fma(-q2.x(), this.z, Math.fma(q2.y(), this.w, q2.z() * this.x)));
        double qpz = Math.fma(q2.w(), this.z, Math.fma(q2.x(), this.y, Math.fma(-q2.y(), this.x, q2.z() * this.w)));
        double qpw = Math.fma(q2.w(), this.w, Math.fma(-q2.x(), this.x, Math.fma(-q2.y(), this.y, -q2.z() * this.z)));
        return dest.set(Math.fma(qpw, qix, Math.fma(qpx, qiw, Math.fma(qpy, qiz, -qpz * qiy))), Math.fma(qpw, qiy, Math.fma(-qpx, qiz, Math.fma(qpy, qiw, qpz * qix))), Math.fma(qpw, qiz, Math.fma(qpx, qiy, Math.fma(-qpy, qix, qpz * qiw))), Math.fma(qpw, qiw, Math.fma(-qpx, qix, Math.fma(-qpy, qiy, -qpz * qiz))));
    }

    public boolean isFinite() {
        return Math.isFinite(this.x) && Math.isFinite(this.y) && Math.isFinite(this.z) && Math.isFinite(this.w);
    }

    public boolean equals(Quaterniondc q2, double delta) {
        if (this == q2) {
            return true;
        }
        if (q2 == null) {
            return false;
        }
        if (this.getClass() != q2.getClass()) {
            return false;
        }
        if (!Runtime.equals(this.x, q2.x(), delta)) {
            return false;
        }
        if (!Runtime.equals(this.y, q2.y(), delta)) {
            return false;
        }
        if (!Runtime.equals(this.z, q2.z(), delta)) {
            return false;
        }
        return Runtime.equals(this.w, q2.w(), delta);
    }

    public boolean equals(double x2, double y2, double z2, double w2) {
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(x2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(y2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.z) != Double.doubleToLongBits(z2)) {
            return false;
        }
        return Double.doubleToLongBits(this.w) == Double.doubleToLongBits(w2);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

