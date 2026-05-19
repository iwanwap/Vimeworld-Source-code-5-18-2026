/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.GMatrix;
import javax.vecmath.Tuple2f;
import javax.vecmath.Tuple3d;
import javax.vecmath.Tuple3f;
import javax.vecmath.Tuple4d;
import javax.vecmath.Tuple4f;

public class GVector
implements Serializable {
    private int elementCount;
    private double[] elementData;

    public GVector(int length) {
        this.elementCount = length;
        this.elementData = new double[length];
    }

    public GVector(double[] vector) {
        this(vector.length);
        System.arraycopy(vector, 0, this.elementData, 0, this.elementCount);
    }

    public GVector(GVector vector) {
        this(vector.elementCount);
        System.arraycopy(vector.elementData, 0, this.elementData, 0, this.elementCount);
    }

    public GVector(Tuple2f tuple) {
        this(2);
        this.set(tuple);
    }

    public GVector(Tuple3f tuple) {
        this(3);
        this.set(tuple);
    }

    public GVector(Tuple3d tuple) {
        this(3);
        this.set(tuple);
    }

    public GVector(Tuple4f tuple) {
        this(4);
        this.set(tuple);
    }

    public GVector(Tuple4d tuple) {
        this(4);
        this.set(tuple);
    }

    public GVector(double[] vector, int length) {
        this(length);
        System.arraycopy(vector, 0, this.elementData, 0, this.elementCount);
    }

    public final double norm() {
        return Math.sqrt(this.normSquared());
    }

    public final double normSquared() {
        double s2 = 0.0;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            s2 += this.elementData[i2] * this.elementData[i2];
        }
        return s2;
    }

    public final void normalize(GVector v1) {
        this.set(v1);
        this.normalize();
    }

    public final void normalize() {
        double len = this.norm();
        int i2 = 0;
        while (i2 < this.elementCount) {
            int n2 = i2++;
            this.elementData[n2] = this.elementData[n2] / len;
        }
    }

    public final void scale(double s2, GVector v1) {
        this.set(v1);
        this.scale(s2);
    }

    public final void scale(double s2) {
        int i2 = 0;
        while (i2 < this.elementCount) {
            int n2 = i2++;
            this.elementData[n2] = this.elementData[n2] * s2;
        }
    }

    public final void scaleAdd(double s2, GVector v1, GVector v2) {
        double[] v1data = v1.elementData;
        double[] v2data = v2.elementData;
        if (this.elementCount != v1.elementCount) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != v1's size:" + v1.elementCount);
        }
        if (this.elementCount != v2.elementCount) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != v2's size:" + v2.elementCount);
        }
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            this.elementData[i2] = s2 * v1data[i2] + v2data[i2];
        }
    }

    public final void add(GVector vector) {
        double[] v1data = vector.elementData;
        if (this.elementCount != vector.elementCount) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != v2's size:" + vector.elementCount);
        }
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            int n2 = i2;
            this.elementData[n2] = this.elementData[n2] + v1data[i2];
        }
    }

    public final void add(GVector vector1, GVector vector2) {
        this.set(vector1);
        this.add(vector2);
    }

    public final void sub(GVector vector) {
        double[] v1data = vector.elementData;
        if (this.elementCount != vector.elementCount) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != vector's size:" + vector.elementCount);
        }
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            int n2 = i2;
            this.elementData[n2] = this.elementData[n2] - v1data[i2];
        }
    }

    public final void sub(GVector vector1, GVector vector2) {
        this.set(vector1);
        this.sub(vector2);
    }

    public final void mul(GMatrix m1, GVector v1) {
        double[] v1data = v1.elementData;
        int v1size = v1.elementCount;
        int nCol = m1.getNumCol();
        int nRow = m1.getNumRow();
        if (v1size != nCol) {
            throw new IllegalArgumentException("v1.size:" + v1size + " != m1.nCol:" + nCol);
        }
        if (this.elementCount != nRow) {
            throw new IllegalArgumentException("this.size:" + this.elementCount + " != m1.nRow:" + nRow);
        }
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            double sum = 0.0;
            for (int j2 = 0; j2 < nCol; ++j2) {
                sum += m1.getElement(i2, j2) * v1data[j2];
            }
            this.elementData[i2] = sum;
        }
    }

    public final void mul(GVector v1, GMatrix m1) {
        double[] v1data = v1.elementData;
        int v1size = v1.elementCount;
        int nCol = m1.getNumCol();
        int nRow = m1.getNumRow();
        if (v1size != nRow) {
            throw new IllegalArgumentException("v1.size:" + v1size + " != m1.nRow:" + nRow);
        }
        if (this.elementCount != nCol) {
            throw new IllegalArgumentException("this.size:" + this.elementCount + " != m1.nCol:" + nCol);
        }
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            double sum = 0.0;
            for (int j2 = 0; j2 < nRow; ++j2) {
                sum += m1.getElement(j2, i2) * v1data[j2];
            }
            this.elementData[i2] = sum;
        }
    }

    public final void negate() {
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            this.elementData[i2] = -this.elementData[i2];
        }
    }

    public final void zero() {
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            this.elementData[i2] = 0.0;
        }
    }

    public final void setSize(int newSize) {
        if (newSize < 0) {
            throw new NegativeArraySizeException("newSize:" + newSize + " < 0");
        }
        if (this.elementCount < newSize) {
            double[] oldData = this.elementData;
            this.elementData = new double[newSize];
            System.arraycopy(oldData, 0, this.elementData, 0, this.elementCount);
        }
        this.elementCount = newSize;
    }

    public final void set(double[] vector) {
        System.arraycopy(vector, 0, this.elementData, 0, this.elementCount);
    }

    public final void set(GVector vector) {
        System.arraycopy(vector.elementData, 0, this.elementData, 0, this.elementCount);
    }

    public final void set(Tuple2f tuple) {
        this.elementData[0] = tuple.x;
        this.elementData[1] = tuple.y;
    }

    public final void set(Tuple3f tuple) {
        this.elementData[0] = tuple.x;
        this.elementData[1] = tuple.y;
        this.elementData[2] = tuple.z;
    }

    public final void set(Tuple3d tuple) {
        this.elementData[0] = tuple.x;
        this.elementData[1] = tuple.y;
        this.elementData[2] = tuple.z;
    }

    public final void set(Tuple4f tuple) {
        this.elementData[0] = tuple.x;
        this.elementData[1] = tuple.y;
        this.elementData[2] = tuple.z;
        this.elementData[3] = tuple.w;
    }

    public final void set(Tuple4d tuple) {
        this.elementData[0] = tuple.x;
        this.elementData[1] = tuple.y;
        this.elementData[2] = tuple.z;
        this.elementData[3] = tuple.w;
    }

    public final int getSize() {
        return this.elementCount;
    }

    public final double getElement(int index) {
        try {
            return this.elementData[index];
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException("index:" + index + "must be in [0, " + (this.elementCount - 1) + "]");
        }
    }

    public final void setElement(int index, double value) {
        try {
            this.elementData[index] = value;
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException("index:" + index + " must be in [0, " + (this.elementCount - 1) + "]");
        }
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("(");
        for (int i2 = 0; i2 < this.elementCount - 1; ++i2) {
            buf.append(this.elementData[i2]);
            buf.append(",");
        }
        buf.append(this.elementData[this.elementCount - 1]);
        buf.append(")");
        return buf.toString();
    }

    public int hashCode() {
        int hash = 0;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            long bits = Double.doubleToLongBits(this.elementData[i2]);
            hash ^= (int)(bits ^ bits >> 32);
        }
        return hash;
    }

    public boolean equals(GVector vector1) {
        if (vector1 == null) {
            return false;
        }
        if (this.elementCount != vector1.elementCount) {
            return false;
        }
        double[] v1data = vector1.elementData;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            if (this.elementData[i2] == v1data[i2]) continue;
            return false;
        }
        return true;
    }

    public boolean equals(Object o1) {
        return o1 != null && o1 instanceof GVector && this.equals((GVector)o1);
    }

    public boolean epsilonEquals(GVector v1, double epsilon) {
        if (this.elementCount != v1.elementCount) {
            return false;
        }
        double[] v1data = v1.elementData;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            if (!(Math.abs(this.elementData[i2] - v1data[i2]) > epsilon)) continue;
            return false;
        }
        return true;
    }

    public final double dot(GVector v1) {
        double[] v1data = v1.elementData;
        if (this.elementCount != v1.elementCount) {
            throw new IllegalArgumentException("this.size:" + this.elementCount + " != v1.size:" + v1.elementCount);
        }
        double sum = 0.0;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            sum += this.elementData[i2] * v1data[i2];
        }
        return sum;
    }

    public final void SVDBackSolve(GMatrix U2, GMatrix W2, GMatrix V2, GVector b2) {
        double s2;
        int j2;
        if (this.elementCount != U2.getNumRow() || this.elementCount != U2.getNumCol()) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != U.nRow,nCol:" + U2.getNumRow() + "," + U2.getNumCol());
        }
        if (this.elementCount != W2.getNumRow()) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != W.nRow:" + W2.getNumRow());
        }
        if (b2.elementCount != W2.getNumCol()) {
            throw new ArrayIndexOutOfBoundsException("b.size:" + b2.elementCount + " != W.nCol:" + W2.getNumCol());
        }
        if (b2.elementCount != V2.getNumRow() || b2.elementCount != V2.getNumCol()) {
            throw new ArrayIndexOutOfBoundsException("b.size:" + this.elementCount + " != V.nRow,nCol:" + V2.getNumRow() + "," + V2.getNumCol());
        }
        int m2 = U2.getNumRow();
        int n2 = V2.getNumRow();
        double[] tmp = new double[n2];
        for (j2 = 0; j2 < n2; ++j2) {
            s2 = 0.0;
            double wj2 = W2.getElement(j2, j2);
            if (wj2 != 0.0) {
                for (int i2 = 0; i2 < m2; ++i2) {
                    s2 += U2.getElement(i2, j2) * b2.elementData[i2];
                }
                s2 /= wj2;
            }
            tmp[j2] = s2;
        }
        for (j2 = 0; j2 < n2; ++j2) {
            s2 = 0.0;
            for (int jj2 = 0; jj2 < n2; ++jj2) {
                s2 += V2.getElement(j2, jj2) * tmp[jj2];
            }
            this.elementData[j2] = s2;
        }
    }

    public final void LUDBackSolve(GMatrix LU2, GVector b2, GVector permutation) {
        int j2;
        double sum;
        int i2;
        if (this.elementCount != b2.elementCount) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != b.size:" + b2.elementCount);
        }
        if (this.elementCount != LU2.getNumRow()) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != LU.nRow:" + LU2.getNumRow());
        }
        if (this.elementCount != LU2.getNumCol()) {
            throw new ArrayIndexOutOfBoundsException("this.size:" + this.elementCount + " != LU.nCol:" + LU2.getNumCol());
        }
        int n2 = this.elementCount;
        double[] indx = permutation.elementData;
        double[] x2 = this.elementData;
        double[] bdata = b2.elementData;
        for (int i3 = 0; i3 < n2; ++i3) {
            x2[i3] = bdata[(int)indx[i3]];
        }
        int ii2 = -1;
        for (i2 = 0; i2 < n2; ++i2) {
            sum = x2[i2];
            if (0 <= ii2) {
                for (j2 = ii2; j2 <= i2 - 1; ++j2) {
                    sum -= LU2.getElement(i2, j2) * x2[j2];
                }
            } else if (sum != 0.0) {
                ii2 = i2;
            }
            x2[i2] = sum;
        }
        for (i2 = n2 - 1; i2 >= 0; --i2) {
            sum = x2[i2];
            for (j2 = i2 + 1; j2 < n2; ++j2) {
                sum -= LU2.getElement(i2, j2) * x2[j2];
            }
            x2[i2] = sum / LU2.getElement(i2, i2);
        }
    }

    public final double angle(GVector v1) {
        return Math.acos(this.dot(v1) / this.norm() / v1.norm());
    }

    public final void interpolate(GVector v1, GVector v2, float alpha) {
        this.interpolate(v1, v2, (double)alpha);
    }

    public final void interpolate(GVector v1, float alpha) {
        this.interpolate(v1, (double)alpha);
    }

    public final void interpolate(GVector v1, GVector v2, double alpha) {
        this.set(v1);
        this.interpolate(v2, alpha);
    }

    public final void interpolate(GVector v1, double alpha) {
        double[] v1data = v1.elementData;
        if (this.elementCount != v1.elementCount) {
            throw new IllegalArgumentException("this.size:" + this.elementCount + " != v1.size:" + v1.elementCount);
        }
        double beta = 1.0 - alpha;
        for (int i2 = 0; i2 < this.elementCount; ++i2) {
            this.elementData[i2] = beta * this.elementData[i2] + alpha * v1data[i2];
        }
    }
}

