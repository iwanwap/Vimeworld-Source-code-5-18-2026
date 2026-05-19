/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Matrix3f;
import javax.vecmath.Quat4d;
import javax.vecmath.Quat4f;
import javax.vecmath.Tuple3d;
import javax.vecmath.Vector3d;

public class Matrix3d
implements Serializable {
    public double m00;
    public double m01;
    public double m02;
    public double m10;
    public double m11;
    public double m12;
    public double m20;
    public double m21;
    public double m22;

    public Matrix3d(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        this.set(m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }

    public Matrix3d(double[] v2) {
        this.set(v2);
    }

    public Matrix3d(Matrix3d m1) {
        this.set(m1);
    }

    public Matrix3d(Matrix3f m1) {
        this.set(m1);
    }

    public Matrix3d() {
        this.setZero();
    }

    public String toString() {
        String nl2 = System.getProperty("line.separator", "\n");
        return "[" + nl2 + "  [" + this.m00 + "\t" + this.m01 + "\t" + this.m02 + "]" + nl2 + "  [" + this.m10 + "\t" + this.m11 + "\t" + this.m12 + "]" + nl2 + "  [" + this.m20 + "\t" + this.m21 + "\t" + this.m22 + "] ]";
    }

    public final void setIdentity() {
        this.m00 = 1.0;
        this.m01 = 0.0;
        this.m02 = 0.0;
        this.m10 = 0.0;
        this.m11 = 1.0;
        this.m12 = 0.0;
        this.m20 = 0.0;
        this.m21 = 0.0;
        this.m22 = 1.0;
    }

    public final void setScale(double scale) {
        this.SVD(this);
        this.m00 *= scale;
        this.m11 *= scale;
        this.m22 *= scale;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void setElement(int row, int column, double value) {
        if (row == 0) {
            if (column == 0) {
                this.m00 = value;
                return;
            } else if (column == 1) {
                this.m01 = value;
                return;
            } else {
                if (column != 2) throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
                this.m02 = value;
            }
            return;
        } else if (row == 1) {
            if (column == 0) {
                this.m10 = value;
                return;
            } else if (column == 1) {
                this.m11 = value;
                return;
            } else {
                if (column != 2) throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
                this.m12 = value;
            }
            return;
        } else {
            if (row != 2) throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
            if (column == 0) {
                this.m20 = value;
                return;
            } else if (column == 1) {
                this.m21 = value;
                return;
            } else {
                if (column != 2) throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
                this.m22 = value;
            }
        }
    }

    public final double getElement(int row, int column) {
        if (row == 0) {
            if (column == 0) {
                return this.m00;
            }
            if (column == 1) {
                return this.m01;
            }
            if (column == 2) {
                return this.m02;
            }
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
        if (row == 1) {
            if (column == 0) {
                return this.m10;
            }
            if (column == 1) {
                return this.m11;
            }
            if (column == 2) {
                return this.m12;
            }
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
        if (row == 2) {
            if (column == 0) {
                return this.m20;
            }
            if (column == 1) {
                return this.m21;
            }
            if (column == 2) {
                return this.m22;
            }
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
        throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
    }

    public final void setRow(int row, double x2, double y2, double z2) {
        if (row == 0) {
            this.m00 = x2;
            this.m01 = y2;
            this.m02 = z2;
        } else if (row == 1) {
            this.m10 = x2;
            this.m11 = y2;
            this.m12 = z2;
        } else if (row == 2) {
            this.m20 = x2;
            this.m21 = y2;
            this.m22 = z2;
        } else {
            throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
        }
    }

    public final void setRow(int row, Vector3d v2) {
        if (row == 0) {
            this.m00 = v2.x;
            this.m01 = v2.y;
            this.m02 = v2.z;
        } else if (row == 1) {
            this.m10 = v2.x;
            this.m11 = v2.y;
            this.m12 = v2.z;
        } else if (row == 2) {
            this.m20 = v2.x;
            this.m21 = v2.y;
            this.m22 = v2.z;
        } else {
            throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
        }
    }

    public final void setRow(int row, double[] v2) {
        if (row == 0) {
            this.m00 = v2[0];
            this.m01 = v2[1];
            this.m02 = v2[2];
        } else if (row == 1) {
            this.m10 = v2[0];
            this.m11 = v2[1];
            this.m12 = v2[2];
        } else if (row == 2) {
            this.m20 = v2[0];
            this.m21 = v2[1];
            this.m22 = v2[2];
        } else {
            throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
        }
    }

    public final void getRow(int row, double[] v2) {
        if (row == 0) {
            v2[0] = this.m00;
            v2[1] = this.m01;
            v2[2] = this.m02;
        } else if (row == 1) {
            v2[0] = this.m10;
            v2[1] = this.m11;
            v2[2] = this.m12;
        } else if (row == 2) {
            v2[0] = this.m20;
            v2[1] = this.m21;
            v2[2] = this.m22;
        } else {
            throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
        }
    }

    public final void getRow(int row, Vector3d v2) {
        if (row == 0) {
            v2.x = this.m00;
            v2.y = this.m01;
            v2.z = this.m02;
        } else if (row == 1) {
            v2.x = this.m10;
            v2.y = this.m11;
            v2.z = this.m12;
        } else if (row == 2) {
            v2.x = this.m20;
            v2.y = this.m21;
            v2.z = this.m22;
        } else {
            throw new ArrayIndexOutOfBoundsException("row must be 0 to 2 and is " + row);
        }
    }

    public final void setColumn(int column, double x2, double y2, double z2) {
        if (column == 0) {
            this.m00 = x2;
            this.m10 = y2;
            this.m20 = z2;
        } else if (column == 1) {
            this.m01 = x2;
            this.m11 = y2;
            this.m21 = z2;
        } else if (column == 2) {
            this.m02 = x2;
            this.m12 = y2;
            this.m22 = z2;
        } else {
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
    }

    public final void setColumn(int column, Vector3d v2) {
        if (column == 0) {
            this.m00 = v2.x;
            this.m10 = v2.y;
            this.m20 = v2.z;
        } else if (column == 1) {
            this.m01 = v2.x;
            this.m11 = v2.y;
            this.m21 = v2.z;
        } else if (column == 2) {
            this.m02 = v2.x;
            this.m12 = v2.y;
            this.m22 = v2.z;
        } else {
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
    }

    public final void setColumn(int column, double[] v2) {
        if (column == 0) {
            this.m00 = v2[0];
            this.m10 = v2[1];
            this.m20 = v2[2];
        } else if (column == 1) {
            this.m01 = v2[0];
            this.m11 = v2[1];
            this.m21 = v2[2];
        } else if (column == 2) {
            this.m02 = v2[0];
            this.m12 = v2[1];
            this.m22 = v2[2];
        } else {
            throw new ArrayIndexOutOfBoundsException("col must be 0 to 2 and is " + column);
        }
    }

    public final void getColumn(int column, Vector3d v2) {
        if (column == 0) {
            v2.x = this.m00;
            v2.y = this.m10;
            v2.z = this.m20;
        } else if (column == 1) {
            v2.x = this.m01;
            v2.y = this.m11;
            v2.z = this.m21;
        } else if (column == 2) {
            v2.x = this.m02;
            v2.y = this.m12;
            v2.z = this.m22;
        } else {
            throw new ArrayIndexOutOfBoundsException("column must be 0 to 2 and is " + column);
        }
    }

    public final void getColumn(int column, double[] v2) {
        if (column == 0) {
            v2[0] = this.m00;
            v2[1] = this.m10;
            v2[2] = this.m20;
        } else if (column == 1) {
            v2[0] = this.m01;
            v2[1] = this.m11;
            v2[2] = this.m21;
        } else if (column == 2) {
            v2[0] = this.m02;
            v2[1] = this.m12;
            v2[2] = this.m22;
        } else {
            throw new ArrayIndexOutOfBoundsException("column must be 0 to 2 and is " + column);
        }
    }

    public final double getScale() {
        return this.SVD(null);
    }

    public final void add(double scalar) {
        this.m00 += scalar;
        this.m01 += scalar;
        this.m02 += scalar;
        this.m10 += scalar;
        this.m11 += scalar;
        this.m12 += scalar;
        this.m20 += scalar;
        this.m21 += scalar;
        this.m22 += scalar;
    }

    public final void add(double scalar, Matrix3d m1) {
        this.set(m1);
        this.add(scalar);
    }

    public final void add(Matrix3d m1, Matrix3d m2) {
        this.set(m1.m00 + m2.m00, m1.m01 + m2.m01, m1.m02 + m2.m02, m1.m10 + m2.m10, m1.m11 + m2.m11, m1.m12 + m2.m12, m1.m20 + m2.m20, m1.m21 + m2.m21, m1.m22 + m2.m22);
    }

    public final void add(Matrix3d m1) {
        this.m00 += m1.m00;
        this.m01 += m1.m01;
        this.m02 += m1.m02;
        this.m10 += m1.m10;
        this.m11 += m1.m11;
        this.m12 += m1.m12;
        this.m20 += m1.m20;
        this.m21 += m1.m21;
        this.m22 += m1.m22;
    }

    public final void sub(Matrix3d m1, Matrix3d m2) {
        this.set(m1.m00 - m2.m00, m1.m01 - m2.m01, m1.m02 - m2.m02, m1.m10 - m2.m10, m1.m11 - m2.m11, m1.m12 - m2.m12, m1.m20 - m2.m20, m1.m21 - m2.m21, m1.m22 - m2.m22);
    }

    public final void sub(Matrix3d m1) {
        this.m00 -= m1.m00;
        this.m01 -= m1.m01;
        this.m02 -= m1.m02;
        this.m10 -= m1.m10;
        this.m11 -= m1.m11;
        this.m12 -= m1.m12;
        this.m20 -= m1.m20;
        this.m21 -= m1.m21;
        this.m22 -= m1.m22;
    }

    public final void transpose() {
        double tmp = this.m01;
        this.m01 = this.m10;
        this.m10 = tmp;
        tmp = this.m02;
        this.m02 = this.m20;
        this.m20 = tmp;
        tmp = this.m12;
        this.m12 = this.m21;
        this.m21 = tmp;
    }

    public final void transpose(Matrix3d m1) {
        this.set(m1);
        this.transpose();
    }

    public final void set(Quat4d q1) {
        this.setFromQuat(q1.x, q1.y, q1.z, q1.w);
    }

    public final void set(AxisAngle4d a1) {
        this.setFromAxisAngle(a1.x, a1.y, a1.z, a1.angle);
    }

    public final void set(Quat4f q1) {
        this.setFromQuat(q1.x, q1.y, q1.z, q1.w);
    }

    public final void set(AxisAngle4f a1) {
        this.setFromAxisAngle(a1.x, a1.y, a1.z, a1.angle);
    }

    public final void set(Matrix3d m1) {
        this.m00 = m1.m00;
        this.m01 = m1.m01;
        this.m02 = m1.m02;
        this.m10 = m1.m10;
        this.m11 = m1.m11;
        this.m12 = m1.m12;
        this.m20 = m1.m20;
        this.m21 = m1.m21;
        this.m22 = m1.m22;
    }

    public final void set(Matrix3f m1) {
        this.m00 = m1.m00;
        this.m01 = m1.m01;
        this.m02 = m1.m02;
        this.m10 = m1.m10;
        this.m11 = m1.m11;
        this.m12 = m1.m12;
        this.m20 = m1.m20;
        this.m21 = m1.m21;
        this.m22 = m1.m22;
    }

    public final void set(double[] m2) {
        this.m00 = m2[0];
        this.m01 = m2[1];
        this.m02 = m2[2];
        this.m10 = m2[3];
        this.m11 = m2[4];
        this.m12 = m2[5];
        this.m20 = m2[6];
        this.m21 = m2[7];
        this.m22 = m2[8];
    }

    public final void invert(Matrix3d m1) {
        this.set(m1);
        this.invert();
    }

    public final void invert() {
        double s2 = this.determinant();
        if (s2 == 0.0) {
            return;
        }
        s2 = 1.0 / s2;
        this.set(this.m11 * this.m22 - this.m12 * this.m21, this.m02 * this.m21 - this.m01 * this.m22, this.m01 * this.m12 - this.m02 * this.m11, this.m12 * this.m20 - this.m10 * this.m22, this.m00 * this.m22 - this.m02 * this.m20, this.m02 * this.m10 - this.m00 * this.m12, this.m10 * this.m21 - this.m11 * this.m20, this.m01 * this.m20 - this.m00 * this.m21, this.m00 * this.m11 - this.m01 * this.m10);
        this.mul(s2);
    }

    public final double determinant() {
        return this.m00 * (this.m11 * this.m22 - this.m21 * this.m12) - this.m01 * (this.m10 * this.m22 - this.m20 * this.m12) + this.m02 * (this.m10 * this.m21 - this.m20 * this.m11);
    }

    public final void set(double scale) {
        this.m00 = scale;
        this.m01 = 0.0;
        this.m02 = 0.0;
        this.m10 = 0.0;
        this.m11 = scale;
        this.m12 = 0.0;
        this.m20 = 0.0;
        this.m21 = 0.0;
        this.m22 = scale;
    }

    public final void rotX(double angle) {
        double c2 = Math.cos(angle);
        double s2 = Math.sin(angle);
        this.m00 = 1.0;
        this.m01 = 0.0;
        this.m02 = 0.0;
        this.m10 = 0.0;
        this.m11 = c2;
        this.m12 = -s2;
        this.m20 = 0.0;
        this.m21 = s2;
        this.m22 = c2;
    }

    public final void rotY(double angle) {
        double c2 = Math.cos(angle);
        double s2 = Math.sin(angle);
        this.m00 = c2;
        this.m01 = 0.0;
        this.m02 = s2;
        this.m10 = 0.0;
        this.m11 = 1.0;
        this.m12 = 0.0;
        this.m20 = -s2;
        this.m21 = 0.0;
        this.m22 = c2;
    }

    public final void rotZ(double angle) {
        double c2 = Math.cos(angle);
        double s2 = Math.sin(angle);
        this.m00 = c2;
        this.m01 = -s2;
        this.m02 = 0.0;
        this.m10 = s2;
        this.m11 = c2;
        this.m12 = 0.0;
        this.m20 = 0.0;
        this.m21 = 0.0;
        this.m22 = 1.0;
    }

    public final void mul(double scalar) {
        this.m00 *= scalar;
        this.m01 *= scalar;
        this.m02 *= scalar;
        this.m10 *= scalar;
        this.m11 *= scalar;
        this.m12 *= scalar;
        this.m20 *= scalar;
        this.m21 *= scalar;
        this.m22 *= scalar;
    }

    public final void mul(double scalar, Matrix3d m1) {
        this.set(m1);
        this.mul(scalar);
    }

    public final void mul(Matrix3d m1) {
        this.mul(this, m1);
    }

    public final void mul(Matrix3d m1, Matrix3d m2) {
        this.set(m1.m00 * m2.m00 + m1.m01 * m2.m10 + m1.m02 * m2.m20, m1.m00 * m2.m01 + m1.m01 * m2.m11 + m1.m02 * m2.m21, m1.m00 * m2.m02 + m1.m01 * m2.m12 + m1.m02 * m2.m22, m1.m10 * m2.m00 + m1.m11 * m2.m10 + m1.m12 * m2.m20, m1.m10 * m2.m01 + m1.m11 * m2.m11 + m1.m12 * m2.m21, m1.m10 * m2.m02 + m1.m11 * m2.m12 + m1.m12 * m2.m22, m1.m20 * m2.m00 + m1.m21 * m2.m10 + m1.m22 * m2.m20, m1.m20 * m2.m01 + m1.m21 * m2.m11 + m1.m22 * m2.m21, m1.m20 * m2.m02 + m1.m21 * m2.m12 + m1.m22 * m2.m22);
    }

    public final void mulNormalize(Matrix3d m1) {
        this.mul(m1);
        this.SVD(this);
    }

    public final void mulNormalize(Matrix3d m1, Matrix3d m2) {
        this.mul(m1, m2);
        this.SVD(this);
    }

    public final void mulTransposeBoth(Matrix3d m1, Matrix3d m2) {
        this.mul(m2, m1);
        this.transpose();
    }

    public final void mulTransposeRight(Matrix3d m1, Matrix3d m2) {
        this.set(m1.m00 * m2.m00 + m1.m01 * m2.m01 + m1.m02 * m2.m02, m1.m00 * m2.m10 + m1.m01 * m2.m11 + m1.m02 * m2.m12, m1.m00 * m2.m20 + m1.m01 * m2.m21 + m1.m02 * m2.m22, m1.m10 * m2.m00 + m1.m11 * m2.m01 + m1.m12 * m2.m02, m1.m10 * m2.m10 + m1.m11 * m2.m11 + m1.m12 * m2.m12, m1.m10 * m2.m20 + m1.m11 * m2.m21 + m1.m12 * m2.m22, m1.m20 * m2.m00 + m1.m21 * m2.m01 + m1.m22 * m2.m02, m1.m20 * m2.m10 + m1.m21 * m2.m11 + m1.m22 * m2.m12, m1.m20 * m2.m20 + m1.m21 * m2.m21 + m1.m22 * m2.m22);
    }

    public final void mulTransposeLeft(Matrix3d m1, Matrix3d m2) {
        this.set(m1.m00 * m2.m00 + m1.m10 * m2.m10 + m1.m20 * m2.m20, m1.m00 * m2.m01 + m1.m10 * m2.m11 + m1.m20 * m2.m21, m1.m00 * m2.m02 + m1.m10 * m2.m12 + m1.m20 * m2.m22, m1.m01 * m2.m00 + m1.m11 * m2.m10 + m1.m21 * m2.m20, m1.m01 * m2.m01 + m1.m11 * m2.m11 + m1.m21 * m2.m21, m1.m01 * m2.m02 + m1.m11 * m2.m12 + m1.m21 * m2.m22, m1.m02 * m2.m00 + m1.m12 * m2.m10 + m1.m22 * m2.m20, m1.m02 * m2.m01 + m1.m12 * m2.m11 + m1.m22 * m2.m21, m1.m02 * m2.m02 + m1.m12 * m2.m12 + m1.m22 * m2.m22);
    }

    public final void normalize() {
        this.SVD(this);
    }

    public final void normalize(Matrix3d m1) {
        this.set(m1);
        this.SVD(this);
    }

    public final void normalizeCP() {
        double s2 = Math.pow(Math.abs(this.determinant()), -0.3333333333333333);
        this.mul(s2);
    }

    public final void normalizeCP(Matrix3d m1) {
        this.set(m1);
        this.normalizeCP();
    }

    public boolean equals(Matrix3d m1) {
        return m1 != null && this.m00 == m1.m00 && this.m01 == m1.m01 && this.m02 == m1.m02 && this.m10 == m1.m10 && this.m11 == m1.m11 && this.m12 == m1.m12 && this.m20 == m1.m20 && this.m21 == m1.m21 && this.m22 == m1.m22;
    }

    public boolean equals(Object o1) {
        return o1 != null && o1 instanceof Matrix3d && this.equals((Matrix3d)o1);
    }

    public boolean epsilonEquals(Matrix3d m1, double epsilon) {
        return Math.abs(this.m00 - m1.m00) <= epsilon && Math.abs(this.m01 - m1.m01) <= epsilon && Math.abs(this.m02 - m1.m02) <= epsilon && Math.abs(this.m10 - m1.m10) <= epsilon && Math.abs(this.m11 - m1.m11) <= epsilon && Math.abs(this.m12 - m1.m12) <= epsilon && Math.abs(this.m20 - m1.m20) <= epsilon && Math.abs(this.m21 - m1.m21) <= epsilon && Math.abs(this.m22 - m1.m22) <= epsilon;
    }

    public int hashCode() {
        long bits = Double.doubleToLongBits(this.m00);
        int hash = (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m01);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m02);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m10);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m11);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m12);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m20);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m21);
        hash ^= (int)(bits ^ bits >> 32);
        bits = Double.doubleToLongBits(this.m22);
        return hash ^= (int)(bits ^ bits >> 32);
    }

    public final void setZero() {
        this.m00 = 0.0;
        this.m01 = 0.0;
        this.m02 = 0.0;
        this.m10 = 0.0;
        this.m11 = 0.0;
        this.m12 = 0.0;
        this.m20 = 0.0;
        this.m21 = 0.0;
        this.m22 = 0.0;
    }

    public final void negate() {
        this.m00 = -this.m00;
        this.m01 = -this.m01;
        this.m02 = -this.m02;
        this.m10 = -this.m10;
        this.m11 = -this.m11;
        this.m12 = -this.m12;
        this.m20 = -this.m20;
        this.m21 = -this.m21;
        this.m22 = -this.m22;
    }

    public final void negate(Matrix3d m1) {
        this.set(m1);
        this.negate();
    }

    public final void transform(Tuple3d t2) {
        this.transform(t2, t2);
    }

    public final void transform(Tuple3d t2, Tuple3d result) {
        result.set(this.m00 * t2.x + this.m01 * t2.y + this.m02 * t2.z, this.m10 * t2.x + this.m11 * t2.y + this.m12 * t2.z, this.m20 * t2.x + this.m21 * t2.y + this.m22 * t2.z);
    }

    private void set(double m00, double m01, double m02, double m10, double m11, double m12, double m20, double m21, double m22) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
    }

    private double SVD(Matrix3d rot) {
        double s2 = Math.sqrt((this.m00 * this.m00 + this.m10 * this.m10 + this.m20 * this.m20 + this.m01 * this.m01 + this.m11 * this.m11 + this.m21 * this.m21 + this.m02 * this.m02 + this.m12 * this.m12 + this.m22 * this.m22) / 3.0);
        if (rot != null) {
            double n2 = 1.0 / Math.sqrt(this.m00 * this.m00 + this.m10 * this.m10 + this.m20 * this.m20);
            rot.m00 = this.m00 * n2;
            rot.m10 = this.m10 * n2;
            rot.m20 = this.m20 * n2;
            n2 = 1.0 / Math.sqrt(this.m01 * this.m01 + this.m11 * this.m11 + this.m21 * this.m21);
            rot.m01 = this.m01 * n2;
            rot.m11 = this.m11 * n2;
            rot.m21 = this.m21 * n2;
            n2 = 1.0 / Math.sqrt(this.m02 * this.m02 + this.m12 * this.m12 + this.m22 * this.m22);
            rot.m02 = this.m02 * n2;
            rot.m12 = this.m12 * n2;
            rot.m22 = this.m22 * n2;
        }
        return s2;
    }

    private void setFromQuat(double x2, double y2, double z2, double w2) {
        double n2 = x2 * x2 + y2 * y2 + z2 * z2 + w2 * w2;
        double s2 = n2 > 0.0 ? 2.0 / n2 : 0.0;
        double xs2 = x2 * s2;
        double ys2 = y2 * s2;
        double zs2 = z2 * s2;
        double wx2 = w2 * xs2;
        double wy2 = w2 * ys2;
        double wz2 = w2 * zs2;
        double xx2 = x2 * xs2;
        double xy2 = x2 * ys2;
        double xz2 = x2 * zs2;
        double yy2 = y2 * ys2;
        double yz2 = y2 * zs2;
        double zz2 = z2 * zs2;
        this.m00 = 1.0 - (yy2 + zz2);
        this.m01 = xy2 - wz2;
        this.m02 = xz2 + wy2;
        this.m10 = xy2 + wz2;
        this.m11 = 1.0 - (xx2 + zz2);
        this.m12 = yz2 - wx2;
        this.m20 = xz2 - wy2;
        this.m21 = yz2 + wx2;
        this.m22 = 1.0 - (xx2 + yy2);
    }

    private void setFromAxisAngle(double x2, double y2, double z2, double angle) {
        double n2 = Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
        n2 = 1.0 / n2;
        x2 *= n2;
        y2 *= n2;
        z2 *= n2;
        double c2 = Math.cos(angle);
        double s2 = Math.sin(angle);
        double omc = 1.0 - c2;
        this.m00 = c2 + x2 * x2 * omc;
        this.m11 = c2 + y2 * y2 * omc;
        this.m22 = c2 + z2 * z2 * omc;
        double tmp1 = x2 * y2 * omc;
        double tmp2 = z2 * s2;
        this.m01 = tmp1 - tmp2;
        this.m10 = tmp1 + tmp2;
        tmp1 = x2 * z2 * omc;
        tmp2 = y2 * s2;
        this.m02 = tmp1 + tmp2;
        this.m20 = tmp1 - tmp2;
        tmp1 = y2 * z2 * omc;
        tmp2 = x2 * s2;
        this.m12 = tmp1 - tmp2;
        this.m21 = tmp1 + tmp2;
    }

    public double getM00() {
        return this.m00;
    }

    public void setM00(double m00) {
        this.m00 = m00;
    }

    public double getM01() {
        return this.m01;
    }

    public void setM01(double m01) {
        this.m01 = m01;
    }

    public double getM02() {
        return this.m02;
    }

    public void setM02(double m02) {
        this.m02 = m02;
    }

    public double getM10() {
        return this.m10;
    }

    public void setM10(double m10) {
        this.m10 = m10;
    }

    public double getM11() {
        return this.m11;
    }

    public void setM11(double m11) {
        this.m11 = m11;
    }

    public double getM12() {
        return this.m12;
    }

    public void setM12(double m12) {
        this.m12 = m12;
    }

    public double getM20() {
        return this.m20;
    }

    public void setM20(double m20) {
        this.m20 = m20;
    }

    public double getM21() {
        return this.m21;
    }

    public void setM21(double m21) {
        this.m21 = m21;
    }

    public double getM22() {
        return this.m22;
    }

    public void setM22(double m22) {
        this.m22 = m22;
    }
}

