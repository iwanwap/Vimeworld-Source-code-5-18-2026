/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.GVector;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Matrix4f;

public class GMatrix
implements Serializable {
    private double[] elementData;
    private int nRow;
    private int nCol;

    public GMatrix(int nRow, int nCol) {
        if (nRow < 0) {
            throw new NegativeArraySizeException(nRow + " < 0");
        }
        if (nCol < 0) {
            throw new NegativeArraySizeException(nCol + " < 0");
        }
        this.nRow = nRow;
        this.nCol = nCol;
        this.elementData = new double[nRow * nCol];
        this.setIdentity();
    }

    public GMatrix(int nRow, int nCol, double[] matrix) {
        if (nRow < 0) {
            throw new NegativeArraySizeException(nRow + " < 0");
        }
        if (nCol < 0) {
            throw new NegativeArraySizeException(nCol + " < 0");
        }
        this.nRow = nRow;
        this.nCol = nCol;
        this.elementData = new double[nRow * nCol];
        this.set(matrix);
    }

    public GMatrix(GMatrix matrix) {
        this.nRow = matrix.nRow;
        this.nCol = matrix.nCol;
        int newSize = this.nRow * this.nCol;
        this.elementData = new double[newSize];
        System.arraycopy(matrix.elementData, 0, this.elementData, 0, newSize);
    }

    public final void mul(GMatrix m1) {
        this.mul(this, m1);
    }

    public final void mul(GMatrix m1, GMatrix m2) {
        if (this.nRow != m1.nRow) {
            throw new ArrayIndexOutOfBoundsException("nRow:" + this.nRow + " != m1.nRow:" + m1.nRow);
        }
        if (this.nCol != m2.nCol) {
            throw new ArrayIndexOutOfBoundsException("nCol:" + this.nCol + " != m2.nCol:" + m2.nCol);
        }
        if (m1.nCol != m2.nRow) {
            throw new ArrayIndexOutOfBoundsException("m1.nCol:" + m1.nCol + " != m2.nRow:" + m2.nRow);
        }
        double[] newData = new double[this.nCol * this.nRow];
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                double sum = 0.0;
                for (int k2 = 0; k2 < m1.nCol; ++k2) {
                    sum += m1.elementData[i2 * m1.nCol + k2] * m2.elementData[k2 * m2.nCol + j2];
                }
                newData[i2 * this.nCol + j2] = sum;
            }
        }
        this.elementData = newData;
    }

    public final void mul(GVector v1, GVector v2) {
        if (this.nRow < v1.getSize()) {
            throw new IllegalArgumentException("nRow:" + this.nRow + " < v1.getSize():" + v1.getSize());
        }
        if (this.nCol < v2.getSize()) {
            throw new IllegalArgumentException("nCol:" + this.nCol + " < v2.getSize():" + v2.getSize());
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                this.elementData[i2 * this.nCol + j2] = v1.getElement(i2) * v2.getElement(j2);
            }
        }
    }

    public final void add(GMatrix m1) {
        if (this.nRow != m1.nRow || this.nCol != m1.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m1:(" + m1.nRow + "x" + m1.nCol + ").");
        }
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            int n2 = i2;
            this.elementData[n2] = this.elementData[n2] + m1.elementData[i2];
        }
    }

    public final void add(GMatrix m1, GMatrix m2) {
        if (this.nRow != m1.nRow || this.nCol != m1.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m1:(" + m1.nRow + "x" + m1.nCol + ").");
        }
        if (this.nRow != m2.nRow || this.nCol != m2.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m2:(" + m2.nRow + "x" + m2.nCol + ").");
        }
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            this.elementData[i2] = m1.elementData[i2] + m2.elementData[i2];
        }
    }

    public final void sub(GMatrix m1) {
        if (this.nRow != m1.nRow || this.nCol != m1.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m1:(" + m1.nRow + "x" + m1.nCol + ").");
        }
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            int n2 = i2;
            this.elementData[n2] = this.elementData[n2] - m1.elementData[i2];
        }
    }

    public final void sub(GMatrix m1, GMatrix m2) {
        if (this.nRow != m1.nRow || this.nCol != m1.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m1:(" + m1.nRow + "x" + m1.nCol + ").");
        }
        if (this.nRow != m2.nRow || this.nCol != m2.nCol) {
            throw new IllegalArgumentException("this:(" + this.nRow + "x" + this.nCol + ") != m2:(" + m2.nRow + "x" + m2.nCol + ").");
        }
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            this.elementData[i2] = m1.elementData[i2] - m2.elementData[i2];
        }
    }

    public final void negate() {
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            this.elementData[i2] = -this.elementData[i2];
        }
    }

    public final void negate(GMatrix m1) {
        this.set(m1);
        this.negate();
    }

    public final void setIdentity() {
        this.setZero();
        int min = this.nRow < this.nCol ? this.nRow : this.nCol;
        for (int i2 = 0; i2 < min; ++i2) {
            this.elementData[i2 * this.nCol + i2] = 1.0;
        }
    }

    public final void setZero() {
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            this.elementData[i2] = 0.0;
        }
    }

    public final void identityMinus() {
        this.negate();
        int min = this.nRow < this.nCol ? this.nRow : this.nCol;
        for (int i2 = 0; i2 < min; ++i2) {
            int n2 = i2 * this.nCol + i2;
            this.elementData[n2] = this.elementData[n2] + 1.0;
        }
    }

    public final void invert() {
        if (this.nRow != this.nCol) {
            throw new ArrayIndexOutOfBoundsException("not a square matrix");
        }
        int n2 = this.nRow;
        GMatrix LU2 = new GMatrix(n2, n2);
        GVector permutation = new GVector(n2);
        GVector column = new GVector(n2);
        GVector unit = new GVector(n2);
        this.LUD(LU2, permutation);
        for (int j2 = 0; j2 < n2; ++j2) {
            unit.zero();
            unit.setElement(j2, 1.0);
            column.LUDBackSolve(LU2, unit, permutation);
            this.setColumn(j2, column);
        }
    }

    public final void invert(GMatrix m1) {
        this.set(m1);
        this.invert();
    }

    public final void copySubMatrix(int rowSource, int colSource, int numRow, int numCol, int rowDest, int colDest, GMatrix target) {
        if (rowSource < 0 || colSource < 0 || rowDest < 0 || colDest < 0) {
            throw new ArrayIndexOutOfBoundsException("rowSource,colSource,rowDest,colDest < 0.");
        }
        if (this.nRow < numRow + rowSource || this.nCol < numCol + colSource) {
            throw new ArrayIndexOutOfBoundsException("Source GMatrix too small.");
        }
        if (target.nRow < numRow + rowDest || target.nCol < numCol + colDest) {
            throw new ArrayIndexOutOfBoundsException("Target GMatrix too small.");
        }
        for (int i2 = 0; i2 < numRow; ++i2) {
            for (int j2 = 0; j2 < numCol; ++j2) {
                target.elementData[(i2 + rowDest) * this.nCol + (j2 + colDest)] = this.elementData[(i2 + rowSource) * this.nCol + (j2 + colSource)];
            }
        }
    }

    public final void setSize(int nRow, int nCol) {
        if (nRow < 0 || nCol < 0) {
            throw new NegativeArraySizeException("nRow or nCol < 0");
        }
        int oldnRow = this.nRow;
        int oldnCol = this.nCol;
        int oldSize = this.nRow * this.nCol;
        this.nRow = nRow;
        this.nCol = nCol;
        int newSize = nRow * nCol;
        double[] oldData = this.elementData;
        if (oldnCol == nCol) {
            if (nRow <= oldnRow) {
                return;
            }
            this.elementData = new double[newSize];
            System.arraycopy(oldData, 0, this.elementData, 0, oldSize);
        } else {
            this.elementData = new double[newSize];
            this.setZero();
            for (int i2 = 0; i2 < oldnRow; ++i2) {
                System.arraycopy(oldData, i2 * oldnCol, this.elementData, i2 * nCol, oldnCol);
            }
        }
    }

    public final void set(double[] matrix) {
        int size = this.nRow * this.nCol;
        System.arraycopy(matrix, 0, this.elementData, 0, size);
    }

    public final void set(Matrix3f m1) {
        this.elementData[0] = m1.m00;
        this.elementData[1] = m1.m01;
        this.elementData[2] = m1.m02;
        this.elementData[this.nCol] = m1.m10;
        this.elementData[this.nCol + 1] = m1.m11;
        this.elementData[this.nCol + 2] = m1.m12;
        this.elementData[2 * this.nCol] = m1.m20;
        this.elementData[2 * this.nCol + 1] = m1.m21;
        this.elementData[2 * this.nCol + 2] = m1.m22;
    }

    public final void set(Matrix3d m1) {
        this.elementData[0] = m1.m00;
        this.elementData[1] = m1.m01;
        this.elementData[2] = m1.m02;
        this.elementData[this.nCol] = m1.m10;
        this.elementData[this.nCol + 1] = m1.m11;
        this.elementData[this.nCol + 2] = m1.m12;
        this.elementData[2 * this.nCol] = m1.m20;
        this.elementData[2 * this.nCol + 1] = m1.m21;
        this.elementData[2 * this.nCol + 2] = m1.m22;
    }

    public final void set(Matrix4f m1) {
        this.elementData[0] = m1.m00;
        this.elementData[1] = m1.m01;
        this.elementData[2] = m1.m02;
        this.elementData[3] = m1.m03;
        this.elementData[this.nCol] = m1.m10;
        this.elementData[this.nCol + 1] = m1.m11;
        this.elementData[this.nCol + 2] = m1.m12;
        this.elementData[this.nCol + 3] = m1.m13;
        this.elementData[2 * this.nCol] = m1.m20;
        this.elementData[2 * this.nCol + 1] = m1.m21;
        this.elementData[2 * this.nCol + 2] = m1.m22;
        this.elementData[2 * this.nCol + 3] = m1.m23;
        this.elementData[3 * this.nCol] = m1.m30;
        this.elementData[3 * this.nCol + 1] = m1.m31;
        this.elementData[3 * this.nCol + 2] = m1.m32;
        this.elementData[3 * this.nCol + 3] = m1.m33;
    }

    public final void set(Matrix4d m1) {
        this.elementData[0] = m1.m00;
        this.elementData[1] = m1.m01;
        this.elementData[2] = m1.m02;
        this.elementData[3] = m1.m03;
        this.elementData[this.nCol] = m1.m10;
        this.elementData[this.nCol + 1] = m1.m11;
        this.elementData[this.nCol + 2] = m1.m12;
        this.elementData[this.nCol + 3] = m1.m13;
        this.elementData[2 * this.nCol] = m1.m20;
        this.elementData[2 * this.nCol + 1] = m1.m21;
        this.elementData[2 * this.nCol + 2] = m1.m22;
        this.elementData[2 * this.nCol + 3] = m1.m23;
        this.elementData[3 * this.nCol] = m1.m30;
        this.elementData[3 * this.nCol + 1] = m1.m31;
        this.elementData[3 * this.nCol + 2] = m1.m32;
        this.elementData[3 * this.nCol + 3] = m1.m33;
    }

    public final void set(GMatrix m1) {
        if (m1.nRow < this.nRow || m1.nCol < this.nCol) {
            throw new ArrayIndexOutOfBoundsException("m1 smaller than this matrix");
        }
        System.arraycopy(m1.elementData, 0, this.elementData, 0, this.nRow * this.nCol);
    }

    public final int getNumRow() {
        return this.nRow;
    }

    public final int getNumCol() {
        return this.nCol;
    }

    public final double getElement(int row, int column) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        if (this.nCol <= column) {
            throw new ArrayIndexOutOfBoundsException("column:" + column + " > matrix's nCol:" + this.nCol);
        }
        if (column < 0) {
            throw new ArrayIndexOutOfBoundsException("column:" + column + " < 0");
        }
        return this.elementData[row * this.nCol + column];
    }

    public final void setElement(int row, int column, double value) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        if (this.nCol <= column) {
            throw new ArrayIndexOutOfBoundsException("column:" + column + " > matrix's nCol:" + this.nCol);
        }
        if (column < 0) {
            throw new ArrayIndexOutOfBoundsException("column:" + column + " < 0");
        }
        this.elementData[row * this.nCol + column] = value;
    }

    public final void getRow(int row, double[] array) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        if (array.length < this.nCol) {
            throw new ArrayIndexOutOfBoundsException("array length:" + array.length + " smaller than matrix's nCol:" + this.nCol);
        }
        System.arraycopy(this.elementData, row * this.nCol, array, 0, this.nCol);
    }

    public final void getRow(int row, GVector vector) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        if (vector.getSize() < this.nCol) {
            throw new ArrayIndexOutOfBoundsException("vector size:" + vector.getSize() + " smaller than matrix's nCol:" + this.nCol);
        }
        for (int i2 = 0; i2 < this.nCol; ++i2) {
            vector.setElement(i2, this.elementData[row * this.nCol + i2]);
        }
    }

    public final void getColumn(int col, double[] array) {
        if (this.nCol <= col) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " > matrix's nCol:" + this.nCol);
        }
        if (col < 0) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " < 0");
        }
        if (array.length < this.nRow) {
            throw new ArrayIndexOutOfBoundsException("array.length:" + array.length + " < matrix's nRow=" + this.nRow);
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            array[i2] = this.elementData[i2 * this.nCol + col];
        }
    }

    public final void getColumn(int col, GVector vector) {
        if (this.nCol <= col) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " > matrix's nCol:" + this.nCol);
        }
        if (col < 0) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " < 0");
        }
        if (vector.getSize() < this.nRow) {
            throw new ArrayIndexOutOfBoundsException("vector size:" + vector.getSize() + " < matrix's nRow:" + this.nRow);
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            vector.setElement(i2, this.elementData[i2 * this.nCol + col]);
        }
    }

    public final void get(Matrix3d m1) {
        m1.m00 = this.elementData[0];
        m1.m01 = this.elementData[1];
        m1.m02 = this.elementData[2];
        m1.m10 = this.elementData[this.nCol];
        m1.m11 = this.elementData[this.nCol + 1];
        m1.m12 = this.elementData[this.nCol + 2];
        m1.m20 = this.elementData[2 * this.nCol];
        m1.m21 = this.elementData[2 * this.nCol + 1];
        m1.m22 = this.elementData[2 * this.nCol + 2];
    }

    public final void get(Matrix3f m1) {
        m1.m00 = (float)this.elementData[0];
        m1.m01 = (float)this.elementData[1];
        m1.m02 = (float)this.elementData[2];
        m1.m10 = (float)this.elementData[this.nCol];
        m1.m11 = (float)this.elementData[this.nCol + 1];
        m1.m12 = (float)this.elementData[this.nCol + 2];
        m1.m20 = (float)this.elementData[2 * this.nCol];
        m1.m21 = (float)this.elementData[2 * this.nCol + 1];
        m1.m22 = (float)this.elementData[2 * this.nCol + 2];
    }

    public final void get(Matrix4d m1) {
        m1.m00 = this.elementData[0];
        m1.m01 = this.elementData[1];
        m1.m02 = this.elementData[2];
        m1.m03 = this.elementData[3];
        m1.m10 = this.elementData[this.nCol];
        m1.m11 = this.elementData[this.nCol + 1];
        m1.m12 = this.elementData[this.nCol + 2];
        m1.m13 = this.elementData[this.nCol + 3];
        m1.m20 = this.elementData[2 * this.nCol];
        m1.m21 = this.elementData[2 * this.nCol + 1];
        m1.m22 = this.elementData[2 * this.nCol + 2];
        m1.m23 = this.elementData[2 * this.nCol + 3];
        m1.m30 = this.elementData[3 * this.nCol];
        m1.m31 = this.elementData[3 * this.nCol + 1];
        m1.m32 = this.elementData[3 * this.nCol + 2];
        m1.m33 = this.elementData[3 * this.nCol + 3];
    }

    public final void get(Matrix4f m1) {
        m1.m00 = (float)this.elementData[0];
        m1.m01 = (float)this.elementData[1];
        m1.m02 = (float)this.elementData[2];
        m1.m03 = (float)this.elementData[3];
        m1.m10 = (float)this.elementData[this.nCol];
        m1.m11 = (float)this.elementData[this.nCol + 1];
        m1.m12 = (float)this.elementData[this.nCol + 2];
        m1.m13 = (float)this.elementData[this.nCol + 3];
        m1.m20 = (float)this.elementData[2 * this.nCol];
        m1.m21 = (float)this.elementData[2 * this.nCol + 1];
        m1.m22 = (float)this.elementData[2 * this.nCol + 2];
        m1.m23 = (float)this.elementData[2 * this.nCol + 3];
        m1.m30 = (float)this.elementData[3 * this.nCol];
        m1.m31 = (float)this.elementData[3 * this.nCol + 1];
        m1.m32 = (float)this.elementData[3 * this.nCol + 2];
        m1.m33 = (float)this.elementData[3 * this.nCol + 3];
    }

    public final void get(GMatrix m1) {
        if (m1.nRow < this.nRow || m1.nCol < this.nCol) {
            throw new IllegalArgumentException("m1 matrix is smaller than this matrix.");
        }
        if (m1.nCol == this.nCol) {
            System.arraycopy(this.elementData, 0, m1.elementData, 0, this.nRow * this.nCol);
        } else {
            for (int i2 = 0; i2 < this.nRow; ++i2) {
                System.arraycopy(this.elementData, i2 * this.nCol, m1.elementData, i2 * m1.nCol, this.nCol);
            }
        }
    }

    public final void setRow(int row, double[] array) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        if (array.length < this.nCol) {
            throw new ArrayIndexOutOfBoundsException("array length:" + array.length + " < matrix's nCol=" + this.nCol);
        }
        System.arraycopy(array, 0, this.elementData, row * this.nCol, this.nCol);
    }

    public final void setRow(int row, GVector vector) {
        if (this.nRow <= row) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " > matrix's nRow:" + this.nRow);
        }
        if (row < 0) {
            throw new ArrayIndexOutOfBoundsException("row:" + row + " < 0");
        }
        int vecSize = vector.getSize();
        if (vecSize < this.nCol) {
            throw new ArrayIndexOutOfBoundsException("vector's size:" + vecSize + " < matrix's nCol=" + this.nCol);
        }
        for (int i2 = 0; i2 < this.nCol; ++i2) {
            this.elementData[row * this.nCol + i2] = vector.getElement(i2);
        }
    }

    public final void setColumn(int col, double[] array) {
        if (this.nCol <= col) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " > matrix's nCol=" + this.nCol);
        }
        if (col < 0) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " < 0");
        }
        if (array.length < this.nRow) {
            throw new ArrayIndexOutOfBoundsException("array length:" + array.length + " < matrix's nRow:" + this.nRow);
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            this.elementData[i2 * this.nCol + col] = array[i2];
        }
    }

    public final void setColumn(int col, GVector vector) {
        if (this.nCol <= col) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " > matrix's nCol=" + this.nCol);
        }
        if (col < 0) {
            throw new ArrayIndexOutOfBoundsException("col:" + col + " < 0");
        }
        int vecSize = vector.getSize();
        if (vecSize < this.nRow) {
            throw new ArrayIndexOutOfBoundsException("vector size:" + vecSize + " < matrix's nRow=" + this.nRow);
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            this.elementData[i2 * this.nCol + col] = vector.getElement(i2);
        }
    }

    public final void mulTransposeBoth(GMatrix m1, GMatrix m2) {
        this.mul(m2, m1);
        this.transpose();
    }

    public final void mulTransposeRight(GMatrix m1, GMatrix m2) {
        if (m1.nCol != m2.nCol || this.nRow != m1.nRow || this.nCol != m2.nRow) {
            throw new ArrayIndexOutOfBoundsException("matrices mismatch");
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                double sum = 0.0;
                for (int k2 = 0; k2 < m1.nCol; ++k2) {
                    sum += m1.elementData[i2 * m1.nCol + k2] * m2.elementData[j2 * m2.nCol + k2];
                }
                this.elementData[i2 * this.nCol + j2] = sum;
            }
        }
    }

    public final void mulTransposeLeft(GMatrix m1, GMatrix m2) {
        this.transpose(m1);
        this.mul(m2);
    }

    public final void transpose() {
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = i2 + 1; j2 < this.nCol; ++j2) {
                double tmp = this.elementData[i2 * this.nCol + j2];
                this.elementData[i2 * this.nCol + j2] = this.elementData[j2 * this.nCol + i2];
                this.elementData[j2 * this.nCol + i2] = tmp;
            }
        }
    }

    public final void transpose(GMatrix m1) {
        this.set(m1);
        this.transpose();
    }

    public String toString() {
        String nl2 = System.getProperty("line.separator", "\n");
        StringBuffer out = new StringBuffer("[");
        out.append(nl2);
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            out.append("  [");
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                if (0 < j2) {
                    out.append("\t");
                }
                out.append(this.elementData[i2 * this.nCol + j2]);
            }
            if (i2 + 1 < this.nRow) {
                out.append("]");
                out.append(nl2);
                continue;
            }
            out.append("] ]");
        }
        return out.toString();
    }

    public int hashCode() {
        int hash = 0;
        for (int i2 = 0; i2 < this.nRow * this.nCol; ++i2) {
            long bits = Double.doubleToLongBits(this.elementData[i2]);
            hash ^= (int)(bits ^ bits >> 32);
        }
        return hash;
    }

    public boolean equals(GMatrix m1) {
        if (m1 == null) {
            return false;
        }
        if (m1.nRow != this.nRow) {
            return false;
        }
        if (m1.nCol != this.nCol) {
            return false;
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                if (this.elementData[i2 * this.nCol + j2] == m1.elementData[i2 * this.nCol + j2]) continue;
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object o1) {
        return o1 != null && o1 instanceof GMatrix && this.equals((GMatrix)o1);
    }

    public boolean epsilonEquals(GMatrix m1, float epsilon) {
        if (m1.nRow != this.nRow) {
            return false;
        }
        if (m1.nCol != this.nCol) {
            return false;
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                if (!((double)epsilon < Math.abs(this.elementData[i2 * this.nCol + j2] - m1.elementData[i2 * this.nCol + j2]))) continue;
                return false;
            }
        }
        return true;
    }

    public boolean epsilonEquals(GMatrix m1, double epsilon) {
        if (m1.nRow != this.nRow) {
            return false;
        }
        if (m1.nCol != this.nCol) {
            return false;
        }
        for (int i2 = 0; i2 < this.nRow; ++i2) {
            for (int j2 = 0; j2 < this.nCol; ++j2) {
                if (!(epsilon < Math.abs(this.elementData[i2 * this.nCol + j2] - m1.elementData[i2 * this.nCol + j2]))) continue;
                return false;
            }
        }
        return true;
    }

    public final double trace() {
        int min = this.nRow < this.nCol ? this.nRow : this.nCol;
        double trace = 0.0;
        for (int i2 = 0; i2 < min; ++i2) {
            trace += this.elementData[i2 * this.nCol + i2];
        }
        return trace;
    }

    public final void setScale(double scale) {
        this.setZero();
        int min = this.nRow < this.nCol ? this.nRow : this.nCol;
        for (int i2 = 0; i2 < min; ++i2) {
            this.elementData[i2 * this.nCol + i2] = scale;
        }
    }

    private void setDiag(int i2, double value) {
        this.elementData[i2 * this.nCol + i2] = value;
    }

    private double getDiag(int i2) {
        return this.elementData[i2 * this.nCol + i2];
    }

    private double dpythag(double a2, double b2) {
        double absb;
        double absa = Math.abs(a2);
        if (absa > (absb = Math.abs(b2))) {
            if (absa == 0.0) {
                return 0.0;
            }
            double term = absb / absa;
            if (Math.abs(term) <= Double.MIN_VALUE) {
                return absa;
            }
            return absa * Math.sqrt(1.0 + term * term);
        }
        if (absb == 0.0) {
            return 0.0;
        }
        double term = absa / absb;
        if (Math.abs(term) <= Double.MIN_VALUE) {
            return absb;
        }
        return absb * Math.sqrt(1.0 + term * term);
    }

    public final int SVD(GMatrix u2, GMatrix w2, GMatrix v2) {
        double h2;
        double f2;
        int k2;
        double s2;
        int j2;
        int i2;
        if (u2.nRow != this.nRow || u2.nCol != this.nRow) {
            throw new ArrayIndexOutOfBoundsException("The U Matrix invalid size");
        }
        if (v2.nRow != this.nCol || v2.nCol != this.nCol) {
            throw new ArrayIndexOutOfBoundsException("The V Matrix invalid size");
        }
        if (w2.nCol != this.nCol || w2.nRow != this.nRow) {
            throw new ArrayIndexOutOfBoundsException("The W Matrix invalid size");
        }
        int m2 = this.nRow;
        int n2 = this.nCol;
        int imax = m2 > n2 ? m2 : n2;
        double[] A2 = u2.elementData;
        double[] V2 = v2.elementData;
        int l2 = 0;
        int nm2 = 0;
        double[] rv1 = new double[n2];
        this.get(u2);
        for (i2 = m2; i2 < imax; ++i2) {
            for (j2 = 0; j2 < imax; ++j2) {
                A2[i2 * m2 + j2] = 0.0;
            }
        }
        for (j2 = n2; j2 < imax; ++j2) {
            for (i2 = 0; i2 < imax; ++i2) {
                A2[i2 * m2 + j2] = 0.0;
            }
        }
        w2.setZero();
        double anorm = 0.0;
        double scale = 0.0;
        double g2 = 0.0;
        for (i2 = 0; i2 < n2; ++i2) {
            double a1;
            l2 = i2 + 1;
            rv1[i2] = scale * g2;
            scale = 0.0;
            s2 = 0.0;
            g2 = 0.0;
            if (i2 < m2) {
                for (k2 = i2; k2 < m2; ++k2) {
                    scale += Math.abs(A2[k2 * m2 + i2]);
                }
                if (scale != 0.0) {
                    for (k2 = i2; k2 < m2; ++k2) {
                        int n3 = k2 * m2 + i2;
                        A2[n3] = A2[n3] / scale;
                        s2 += A2[k2 * m2 + i2] * A2[k2 * m2 + i2];
                    }
                    f2 = A2[i2 * m2 + i2];
                    g2 = f2 < 0.0 ? Math.sqrt(s2) : -Math.sqrt(s2);
                    h2 = f2 * g2 - s2;
                    A2[i2 * m2 + i2] = f2 - g2;
                    for (j2 = l2; j2 < n2; ++j2) {
                        s2 = 0.0;
                        for (k2 = i2; k2 < m2; ++k2) {
                            s2 += A2[k2 * m2 + i2] * A2[k2 * m2 + j2];
                        }
                        f2 = s2 / h2;
                        for (k2 = i2; k2 < m2; ++k2) {
                            int n4 = k2 * m2 + j2;
                            A2[n4] = A2[n4] + f2 * A2[k2 * m2 + i2];
                        }
                    }
                    for (k2 = i2; k2 < m2; ++k2) {
                        int n5 = k2 * m2 + i2;
                        A2[n5] = A2[n5] * scale;
                    }
                }
            }
            w2.setDiag(i2, scale * g2);
            scale = 0.0;
            s2 = 0.0;
            g2 = 0.0;
            if (i2 < m2 && i2 != n2 - 1) {
                for (k2 = l2; k2 < n2; ++k2) {
                    scale += Math.abs(A2[i2 * m2 + k2]);
                }
                if (scale != 0.0) {
                    for (k2 = l2; k2 < n2; ++k2) {
                        int n6 = i2 * m2 + k2;
                        A2[n6] = A2[n6] / scale;
                        s2 += A2[i2 * m2 + k2] * A2[i2 * m2 + k2];
                    }
                    f2 = A2[i2 * m2 + l2];
                    g2 = f2 < 0.0 ? Math.sqrt(s2) : -Math.sqrt(s2);
                    h2 = f2 * g2 - s2;
                    A2[i2 * m2 + l2] = f2 - g2;
                    for (k2 = l2; k2 < n2; ++k2) {
                        rv1[k2] = A2[i2 * m2 + k2] / h2;
                    }
                    for (j2 = l2; j2 < m2; ++j2) {
                        s2 = 0.0;
                        for (k2 = l2; k2 < n2; ++k2) {
                            s2 += A2[j2 * m2 + k2] * A2[i2 * m2 + k2];
                        }
                        for (k2 = l2; k2 < n2; ++k2) {
                            int n7 = j2 * m2 + k2;
                            A2[n7] = A2[n7] + s2 * rv1[k2];
                        }
                    }
                    for (k2 = l2; k2 < n2; ++k2) {
                        int n8 = i2 * m2 + k2;
                        A2[n8] = A2[n8] * scale;
                    }
                }
            }
            if (!((a1 = Math.abs(w2.getDiag(i2)) + Math.abs(rv1[i2])) > anorm)) continue;
            anorm = a1;
        }
        i2 = n2 - 1;
        while (i2 >= 0) {
            if (i2 < n2 - 1) {
                if (g2 != 0.0) {
                    for (j2 = l2; j2 < n2; ++j2) {
                        V2[j2 * n2 + i2] = A2[i2 * m2 + j2] / A2[i2 * m2 + l2] / g2;
                    }
                    for (j2 = l2; j2 < n2; ++j2) {
                        s2 = 0.0;
                        for (k2 = l2; k2 < n2; ++k2) {
                            s2 += A2[i2 * m2 + k2] * V2[k2 * n2 + j2];
                        }
                        for (k2 = l2; k2 < n2; ++k2) {
                            int n9 = k2 * n2 + j2;
                            V2[n9] = V2[n9] + s2 * V2[k2 * n2 + i2];
                        }
                    }
                }
                for (j2 = l2; j2 < n2; ++j2) {
                    V2[j2 * n2 + i2] = 0.0;
                    V2[i2 * n2 + j2] = 0.0;
                }
            }
            V2[i2 * n2 + i2] = 1.0;
            g2 = rv1[i2];
            l2 = i2--;
        }
        int imin = m2 < n2 ? m2 : n2;
        for (i2 = imin - 1; i2 >= 0; --i2) {
            l2 = i2 + 1;
            g2 = w2.getDiag(i2);
            for (j2 = l2; j2 < n2; ++j2) {
                A2[i2 * m2 + j2] = 0.0;
            }
            if (g2 != 0.0) {
                g2 = 1.0 / g2;
                for (j2 = l2; j2 < n2; ++j2) {
                    s2 = 0.0;
                    for (k2 = l2; k2 < m2; ++k2) {
                        s2 += A2[k2 * m2 + i2] * A2[k2 * m2 + j2];
                    }
                    f2 = s2 / A2[i2 * m2 + i2] * g2;
                    for (k2 = i2; k2 < m2; ++k2) {
                        int n10 = k2 * m2 + j2;
                        A2[n10] = A2[n10] + f2 * A2[k2 * m2 + i2];
                    }
                }
                for (j2 = i2; j2 < m2; ++j2) {
                    int n11 = j2 * m2 + i2;
                    A2[n11] = A2[n11] * g2;
                }
            } else {
                for (j2 = i2; j2 < m2; ++j2) {
                    A2[j2 * m2 + i2] = 0.0;
                }
            }
            int n12 = i2 * m2 + i2;
            A2[n12] = A2[n12] + 1.0;
        }
        block31: for (k2 = n2 - 1; k2 >= 0; --k2) {
            for (int its = 1; its <= 30; ++its) {
                double z2;
                double y2;
                double c2;
                boolean flag = true;
                for (l2 = k2; l2 >= 0; --l2) {
                    nm2 = l2 - 1;
                    if (Math.abs(rv1[l2]) + anorm == anorm) {
                        flag = false;
                        break;
                    }
                    if (Math.abs(w2.getDiag(nm2)) + anorm == anorm) break;
                }
                if (flag) {
                    c2 = 0.0;
                    s2 = 1.0;
                    for (i2 = l2; i2 <= k2; ++i2) {
                        f2 = s2 * rv1[i2];
                        rv1[i2] = c2 * rv1[i2];
                        if (Math.abs(f2) + anorm == anorm) break;
                        g2 = w2.getDiag(i2);
                        h2 = this.dpythag(f2, g2);
                        w2.setDiag(i2, h2);
                        h2 = 1.0 / h2;
                        c2 = g2 * h2;
                        s2 = -f2 * h2;
                        for (j2 = 0; j2 < m2; ++j2) {
                            y2 = A2[j2 * m2 + nm2];
                            z2 = A2[j2 * m2 + i2];
                            A2[j2 * m2 + nm2] = y2 * c2 + z2 * s2;
                            A2[j2 * m2 + i2] = z2 * c2 - y2 * s2;
                        }
                    }
                }
                z2 = w2.getDiag(k2);
                if (l2 == k2) {
                    if (!(z2 < 0.0)) continue block31;
                    w2.setDiag(k2, -z2);
                    for (j2 = 0; j2 < n2; ++j2) {
                        V2[j2 * n2 + k2] = -V2[j2 * n2 + k2];
                    }
                    continue block31;
                }
                if (its == 30) {
                    return 0;
                }
                double x2 = w2.getDiag(l2);
                nm2 = k2 - 1;
                y2 = w2.getDiag(nm2);
                g2 = rv1[nm2];
                h2 = rv1[k2];
                f2 = ((y2 - z2) * (y2 + z2) + (g2 - h2) * (g2 + h2)) / (2.0 * h2 * y2);
                g2 = this.dpythag(f2, 1.0);
                f2 = ((x2 - z2) * (x2 + z2) + h2 * (y2 / (f2 + (f2 >= 0.0 ? Math.abs(g2) : -Math.abs(g2))) - h2)) / x2;
                s2 = 1.0;
                c2 = 1.0;
                for (j2 = l2; j2 <= nm2; ++j2) {
                    int jj2;
                    i2 = j2 + 1;
                    g2 = rv1[i2];
                    y2 = w2.getDiag(i2);
                    h2 = s2 * g2;
                    g2 = c2 * g2;
                    rv1[j2] = z2 = this.dpythag(f2, h2);
                    c2 = f2 / z2;
                    s2 = h2 / z2;
                    f2 = x2 * c2 + g2 * s2;
                    g2 = g2 * c2 - x2 * s2;
                    h2 = y2 * s2;
                    y2 *= c2;
                    for (jj2 = 0; jj2 < n2; ++jj2) {
                        x2 = V2[jj2 * n2 + j2];
                        z2 = V2[jj2 * n2 + i2];
                        V2[jj2 * n2 + j2] = x2 * c2 + z2 * s2;
                        V2[jj2 * n2 + i2] = z2 * c2 - x2 * s2;
                    }
                    z2 = this.dpythag(f2, h2);
                    w2.setDiag(j2, z2);
                    if (z2 != 0.0) {
                        z2 = 1.0 / z2;
                        c2 = f2 * z2;
                        s2 = h2 * z2;
                    }
                    f2 = c2 * g2 + s2 * y2;
                    x2 = c2 * y2 - s2 * g2;
                    for (jj2 = 0; jj2 < m2; ++jj2) {
                        y2 = A2[jj2 * m2 + j2];
                        z2 = A2[jj2 * m2 + i2];
                        A2[jj2 * m2 + j2] = y2 * c2 + z2 * s2;
                        A2[jj2 * m2 + i2] = z2 * c2 - y2 * s2;
                    }
                }
                rv1[l2] = 0.0;
                rv1[k2] = f2;
                w2.setDiag(k2, x2);
            }
        }
        int rank = 0;
        for (i2 = 0; i2 < n2; ++i2) {
            if (!(w2.getDiag(i2) > 0.0)) continue;
            ++rank;
        }
        return rank;
    }

    private void swapRows(int i2, int j2) {
        for (int k2 = 0; k2 < this.nCol; ++k2) {
            double tmp = this.elementData[i2 * this.nCol + k2];
            this.elementData[i2 * this.nCol + k2] = this.elementData[j2 * this.nCol + k2];
            this.elementData[j2 * this.nCol + k2] = tmp;
        }
    }

    public final int LUD(GMatrix LU2, GVector permutation) {
        if (this.nRow != this.nCol) {
            throw new ArrayIndexOutOfBoundsException("not a square matrix");
        }
        int n2 = this.nRow;
        if (n2 != LU2.nRow) {
            throw new ArrayIndexOutOfBoundsException("this.nRow:" + n2 + " != LU.nRow:" + LU2.nRow);
        }
        if (n2 != LU2.nCol) {
            throw new ArrayIndexOutOfBoundsException("this.nCol:" + n2 + " != LU.nCol:" + LU2.nCol);
        }
        if (permutation.getSize() < n2) {
            throw new ArrayIndexOutOfBoundsException("permutation.size:" + permutation.getSize() + " < this.nCol:" + n2);
        }
        if (this != LU2) {
            LU2.set(this);
        }
        int even = 1;
        double[] a2 = LU2.elementData;
        for (int i2 = 0; i2 < n2; ++i2) {
            permutation.setElement(i2, i2);
        }
        for (int j2 = 0; j2 < n2; ++j2) {
            double dum;
            int k2;
            double sum;
            int i3;
            for (i3 = 0; i3 < j2; ++i3) {
                sum = a2[i3 * n2 + j2];
                for (k2 = 0; k2 < i3; ++k2) {
                    if (a2[i3 * n2 + k2] == 0.0 || a2[k2 * n2 + j2] == 0.0) continue;
                    sum -= a2[i3 * n2 + k2] * a2[k2 * n2 + j2];
                }
                a2[i3 * n2 + j2] = sum;
            }
            double big = 0.0;
            int imax = j2;
            for (i3 = j2; i3 < n2; ++i3) {
                sum = a2[i3 * n2 + j2];
                for (k2 = 0; k2 < j2; ++k2) {
                    if (a2[i3 * n2 + k2] == 0.0 || a2[k2 * n2 + j2] == 0.0) continue;
                    sum -= a2[i3 * n2 + k2] * a2[k2 * n2 + j2];
                }
                a2[i3 * n2 + j2] = sum;
                dum = Math.abs(sum);
                if (!(dum >= big)) continue;
                big = dum;
                imax = i3;
            }
            if (j2 != imax) {
                LU2.swapRows(imax, j2);
                double tmp = permutation.getElement(imax);
                permutation.setElement(imax, permutation.getElement(j2));
                permutation.setElement(j2, tmp);
                even = -even;
            }
            if (j2 == n2 - 1) continue;
            dum = 1.0 / a2[j2 * n2 + j2];
            for (int i4 = j2 + 1; i4 < n2; ++i4) {
                int n3 = i4 * n2 + j2;
                a2[n3] = a2[n3] * dum;
            }
        }
        return even;
    }
}

