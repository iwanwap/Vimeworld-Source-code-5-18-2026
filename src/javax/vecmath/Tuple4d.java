/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Tuple4f;

public abstract class Tuple4d
implements Serializable {
    public double x;
    public double y;
    public double z;
    public double w;

    public Tuple4d(double x2, double y2, double z2, double w2) {
        this.set(x2, y2, z2, w2);
    }

    public Tuple4d(double[] t2) {
        this.set(t2);
    }

    public Tuple4d(Tuple4d t1) {
        this.set(t1);
    }

    public Tuple4d(Tuple4f t1) {
        this.set(t1);
    }

    public Tuple4d() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.w = 0.0;
    }

    public final void set(double x2, double y2, double z2, double w2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.w = w2;
    }

    public final void set(double[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
        this.w = t2[3];
    }

    public final void set(Tuple4d t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
        this.w = t1.w;
    }

    public final void set(Tuple4f t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
        this.w = t1.w;
    }

    public final void get(double[] t2) {
        t2[0] = this.x;
        t2[1] = this.y;
        t2[2] = this.z;
        t2[3] = this.w;
    }

    public final void get(Tuple4d t2) {
        t2.x = this.x;
        t2.y = this.y;
        t2.z = this.z;
        t2.w = this.w;
    }

    public final void add(Tuple4d t1, Tuple4d t2) {
        this.x = t1.x + t2.x;
        this.y = t1.y + t2.y;
        this.z = t1.z + t2.z;
        this.w = t1.w + t2.w;
    }

    public final void add(Tuple4d t1) {
        this.x += t1.x;
        this.y += t1.y;
        this.z += t1.z;
        this.w += t1.w;
    }

    public final void sub(Tuple4d t1, Tuple4d t2) {
        this.x = t1.x - t2.x;
        this.y = t1.y - t2.y;
        this.z = t1.z - t2.z;
        this.w = t1.w - t2.w;
    }

    public final void sub(Tuple4d t1) {
        this.x -= t1.x;
        this.y -= t1.y;
        this.z -= t1.z;
        this.w -= t1.w;
    }

    public final void negate(Tuple4d t1) {
        this.x = -t1.x;
        this.y = -t1.y;
        this.z = -t1.z;
        this.w = -t1.w;
    }

    public final void negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
        this.w = -this.w;
    }

    public final void scale(double s2, Tuple4d t1) {
        this.x = s2 * t1.x;
        this.y = s2 * t1.y;
        this.z = s2 * t1.z;
        this.w = s2 * t1.w;
    }

    public final void scale(double s2) {
        this.x *= s2;
        this.y *= s2;
        this.z *= s2;
        this.w *= s2;
    }

    public final void scaleAdd(double s2, Tuple4d t1, Tuple4d t2) {
        this.x = s2 * t1.x + t2.x;
        this.y = s2 * t1.y + t2.y;
        this.z = s2 * t1.z + t2.z;
        this.w = s2 * t1.w + t2.w;
    }

    public final void scaleAdd(double s2, Tuple4d t1) {
        this.x = s2 * this.x + t1.x;
        this.y = s2 * this.y + t1.y;
        this.z = s2 * this.z + t1.z;
        this.w = s2 * this.z + t1.w;
    }

    public int hashCode() {
        long xbits = Double.doubleToLongBits(this.x);
        long ybits = Double.doubleToLongBits(this.y);
        long zbits = Double.doubleToLongBits(this.z);
        long wbits = Double.doubleToLongBits(this.w);
        return (int)(xbits ^ xbits >> 32 ^ ybits ^ ybits >> 32 ^ zbits ^ zbits >> 32 ^ wbits ^ wbits >> 32);
    }

    public boolean equals(Tuple4d t1) {
        return t1 != null && this.x == t1.x && this.y == t1.y && this.z == t1.z && this.w == t1.w;
    }

    public boolean epsilonEquals(Tuple4d t1, double epsilon) {
        return Math.abs(t1.x - this.x) <= epsilon && Math.abs(t1.y - this.y) <= epsilon && Math.abs(t1.z - this.z) <= epsilon && Math.abs(t1.w - this.w) <= epsilon;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
    }

    public final void clamp(double min, double max, Tuple4d t2) {
        this.set(t2);
        this.clamp(min, max);
    }

    public final void clampMin(double min, Tuple4d t2) {
        this.set(t2);
        this.clampMin(min);
    }

    public final void clampMax(double max, Tuple4d t2) {
        this.set(t2);
        this.clampMax(max);
    }

    public final void absolute(Tuple4d t2) {
        this.set(t2);
        this.absolute();
    }

    public final void clamp(double min, double max) {
        this.clampMin(min);
        this.clampMax(max);
    }

    public final void clampMin(double min) {
        if (this.x < min) {
            this.x = min;
        }
        if (this.y < min) {
            this.y = min;
        }
        if (this.z < min) {
            this.z = min;
        }
        if (this.w < min) {
            this.w = min;
        }
    }

    public final void clampMax(double max) {
        if (this.x > max) {
            this.x = max;
        }
        if (this.y > max) {
            this.y = max;
        }
        if (this.z > max) {
            this.z = max;
        }
        if (this.w > max) {
            this.w = max;
        }
    }

    public final void absolute() {
        if (this.x < 0.0) {
            this.x = -this.x;
        }
        if (this.y < 0.0) {
            this.y = -this.y;
        }
        if (this.z < 0.0) {
            this.z = -this.z;
        }
        if (this.w < 0.0) {
            this.w = -this.w;
        }
    }

    public final void interpolate(Tuple4d t1, Tuple4d t2, double alpha) {
        this.set(t1);
        this.interpolate(t2, alpha);
    }

    public final void interpolate(Tuple4d t1, double alpha) {
        double beta = 1.0 - alpha;
        this.x = beta * this.x + alpha * t1.x;
        this.y = beta * this.y + alpha * t1.y;
        this.z = beta * this.z + alpha * t1.z;
        this.w = beta * this.w + alpha * t1.w;
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

    public double getW() {
        return this.w;
    }

    public void setW(double w2) {
        this.w = w2;
    }
}

