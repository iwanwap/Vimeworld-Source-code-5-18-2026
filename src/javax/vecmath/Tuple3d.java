/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Tuple3f;

public abstract class Tuple3d
implements Serializable {
    public double x;
    public double y;
    public double z;

    public Tuple3d(double x2, double y2, double z2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
    }

    public Tuple3d(double[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
    }

    public Tuple3d(Tuple3d t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public Tuple3d(Tuple3f t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public Tuple3d() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public final void set(double x2, double y2, double z2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
    }

    public final void set(double[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
    }

    public final void set(Tuple3d t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public final void set(Tuple3f t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public final void get(double[] t2) {
        t2[0] = this.x;
        t2[1] = this.y;
        t2[2] = this.z;
    }

    public final void get(Tuple3d t2) {
        t2.x = this.x;
        t2.y = this.y;
        t2.z = this.z;
    }

    public final void add(Tuple3d t1, Tuple3d t2) {
        this.x = t1.x + t2.x;
        this.y = t1.y + t2.y;
        this.z = t1.z + t2.z;
    }

    public final void add(Tuple3d t1) {
        this.x += t1.x;
        this.y += t1.y;
        this.z += t1.z;
    }

    public final void sub(Tuple3d t1, Tuple3d t2) {
        this.x = t1.x - t2.x;
        this.y = t1.y - t2.y;
        this.z = t1.z - t2.z;
    }

    public final void sub(Tuple3d t1) {
        this.x -= t1.x;
        this.y -= t1.y;
        this.z -= t1.z;
    }

    public final void negate(Tuple3d t1) {
        this.x = -t1.x;
        this.y = -t1.y;
        this.z = -t1.z;
    }

    public final void negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    public final void scale(double s2, Tuple3d t1) {
        this.x = s2 * t1.x;
        this.y = s2 * t1.y;
        this.z = s2 * t1.z;
    }

    public final void scale(double s2) {
        this.x *= s2;
        this.y *= s2;
        this.z *= s2;
    }

    public final void scaleAdd(double s2, Tuple3d t1, Tuple3d t2) {
        this.x = s2 * t1.x + t2.x;
        this.y = s2 * t1.y + t2.y;
        this.z = s2 * t1.z + t2.z;
    }

    public final void scaleAdd(double s2, Tuple3d t1) {
        this.x = s2 * this.x + t1.x;
        this.y = s2 * this.y + t1.y;
        this.z = s2 * this.z + t1.z;
    }

    public int hashCode() {
        long xbits = Double.doubleToLongBits(this.x);
        long ybits = Double.doubleToLongBits(this.y);
        long zbits = Double.doubleToLongBits(this.z);
        return (int)(xbits ^ xbits >> 32 ^ ybits ^ ybits >> 32 ^ zbits ^ zbits >> 32);
    }

    public boolean equals(Tuple3d t1) {
        return t1 != null && this.x == t1.x && this.y == t1.y && this.z == t1.z;
    }

    public boolean epsilonEquals(Tuple3d t1, double epsilon) {
        return Math.abs(t1.x - this.x) <= epsilon && Math.abs(t1.y - this.y) <= epsilon && Math.abs(t1.z - this.z) <= epsilon;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public final void absolute(Tuple3d t2) {
        this.set(t2);
        this.absolute();
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
    }

    public final void clamp(float min, float max) {
        this.clampMin(min);
        this.clampMax(max);
    }

    public final void clamp(float min, float max, Tuple3d t2) {
        this.set(t2);
        this.clamp(min, max);
    }

    public final void clampMin(float min) {
        if (this.x < (double)min) {
            this.x = min;
        }
        if (this.y < (double)min) {
            this.y = min;
        }
        if (this.z < (double)min) {
            this.z = min;
        }
    }

    public final void clampMin(float min, Tuple3d t2) {
        this.set(t2);
        this.clampMin(min);
    }

    public final void clampMax(float max, Tuple3d t2) {
        this.set(t2);
        this.clampMax(max);
    }

    public final void clampMax(float max) {
        if (this.x > (double)max) {
            this.x = max;
        }
        if (this.y > (double)max) {
            this.y = max;
        }
        if (this.z > (double)max) {
            this.z = max;
        }
    }

    public final void clamp(double min, double max) {
        this.clampMin(min);
        this.clampMax(max);
    }

    public final void clamp(double min, double max, Tuple3d t2) {
        this.set(t2);
        this.clamp(min, max);
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
    }

    public final void clampMin(double min, Tuple3d t2) {
        this.set(t2);
        this.clampMin(min);
    }

    public final void clampMax(double max, Tuple3d t2) {
        this.set(t2);
        this.clampMax(max);
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
    }

    public final void interpolate(Tuple3d t1, Tuple3d t2, float alpha) {
        this.set(t1);
        this.interpolate(t2, alpha);
    }

    public final void interpolate(Tuple3d t1, float alpha) {
        float beta = 1.0f - alpha;
        this.x = (double)beta * this.x + (double)alpha * t1.x;
        this.y = (double)beta * this.y + (double)alpha * t1.y;
        this.z = (double)beta * this.z + (double)alpha * t1.z;
    }

    public final void interpolate(Tuple3d t1, Tuple3d t2, double alpha) {
        this.set(t1);
        this.interpolate(t2, alpha);
    }

    public final void interpolate(Tuple3d t1, double alpha) {
        double beta = 1.0 - alpha;
        this.x = beta * this.x + alpha * t1.x;
        this.y = beta * this.y + alpha * t1.y;
        this.z = beta * this.z + alpha * t1.z;
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
}

