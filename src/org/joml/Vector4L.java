/*
 * Decompiled with CFR 0.152.
 */
package org.joml;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.text.NumberFormat;
import org.joml.Math;
import org.joml.MemUtil;
import org.joml.Options;
import org.joml.Runtime;
import org.joml.Vector2L;
import org.joml.Vector2Lc;
import org.joml.Vector2d;
import org.joml.Vector2f;
import org.joml.Vector2ic;
import org.joml.Vector3L;
import org.joml.Vector3Lc;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector3ic;
import org.joml.Vector4Lc;
import org.joml.Vector4dc;
import org.joml.Vector4fc;
import org.joml.Vector4ic;

public class Vector4L
implements Externalizable,
Cloneable,
Vector4Lc {
    private static final long serialVersionUID = 1L;
    public long x;
    public long y;
    public long z;
    public long w;

    public Vector4L() {
        this.w = 1L;
    }

    public Vector4L(Vector4Lc v2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = v2.w();
    }

    public Vector4L(Vector4ic v2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = v2.w();
    }

    public Vector4L(Vector3Lc v2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = w2;
    }

    public Vector4L(Vector3ic v2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = w2;
    }

    public Vector4L(Vector2Lc v2, long z2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = z2;
        this.w = w2;
    }

    public Vector4L(Vector2ic v2, long z2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = z2;
        this.w = w2;
    }

    public Vector4L(Vector3fc v2, float w2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        this.z = Math.roundLongUsing(v2.z(), mode);
        this.w = Math.roundLongUsing(w2, mode);
    }

    public Vector4L(Vector4fc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        this.z = Math.roundLongUsing(v2.z(), mode);
        this.w = Math.roundLongUsing(v2.w(), mode);
    }

    public Vector4L(Vector4dc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        this.z = Math.roundLongUsing(v2.z(), mode);
        this.w = Math.roundLongUsing(v2.w(), mode);
    }

    public Vector4L(long s2) {
        this.x = s2;
        this.y = s2;
        this.z = s2;
        this.w = s2;
    }

    public Vector4L(long x2, long y2, long z2, long w2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.w = w2;
    }

    public Vector4L(int[] xyzw) {
        this.x = xyzw[0];
        this.y = xyzw[1];
        this.z = xyzw[2];
        this.w = xyzw[3];
    }

    public Vector4L(ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
    }

    public Vector4L(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
    }

    public Vector4L(LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
    }

    public Vector4L(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
    }

    public long x() {
        return this.x;
    }

    public long y() {
        return this.y;
    }

    public long z() {
        return this.z;
    }

    public long w() {
        return this.w;
    }

    public Vector3f xyz(Vector3f dest) {
        return dest.set(this.x, this.y, this.z);
    }

    public Vector3d xyz(Vector3d dest) {
        return dest.set(this.x, this.y, this.z);
    }

    public Vector3L xyz(Vector3L dest) {
        return dest.set(this.x, this.y, this.z);
    }

    public Vector2f xy(Vector2f dest) {
        return dest.set(this.x, this.y);
    }

    public Vector2d xy(Vector2d dest) {
        return dest.set(this.x, this.y);
    }

    public Vector2L xy(Vector2L dest) {
        return dest.set(this.x, this.y);
    }

    public Vector4L set(Vector4Lc v2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = v2.w();
        return this;
    }

    public Vector4L set(Vector4ic v2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = v2.w();
        return this;
    }

    public Vector4L set(Vector4dc v2) {
        this.x = (int)v2.x();
        this.y = (int)v2.y();
        this.z = (int)v2.z();
        this.w = (int)v2.w();
        return this;
    }

    public Vector4L set(Vector4dc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        this.z = Math.roundLongUsing(v2.z(), mode);
        this.w = Math.roundLongUsing(v2.w(), mode);
        return this;
    }

    public Vector4L set(Vector4fc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        this.z = Math.roundLongUsing(v2.z(), mode);
        this.w = Math.roundLongUsing(v2.w(), mode);
        return this;
    }

    public Vector4L set(Vector3ic v2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = v2.z();
        this.w = w2;
        return this;
    }

    public Vector4L set(Vector2ic v2, long z2, long w2) {
        this.x = v2.x();
        this.y = v2.y();
        this.z = z2;
        this.w = w2;
        return this;
    }

    public Vector4L set(long s2) {
        this.x = s2;
        this.y = s2;
        this.z = s2;
        this.w = s2;
        return this;
    }

    public Vector4L set(long x2, long y2, long z2, long w2) {
        this.x = x2;
        this.y = y2;
        this.z = z2;
        this.w = w2;
        return this;
    }

    public Vector4L set(int[] xyzw) {
        this.x = xyzw[0];
        this.y = xyzw[1];
        this.z = xyzw[2];
        this.w = xyzw[3];
        return this;
    }

    public Vector4L set(ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
        return this;
    }

    public Vector4L set(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
        return this;
    }

    public Vector4L set(LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
        return this;
    }

    public Vector4L set(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
        return this;
    }

    public Vector4L setFromAddress(long address) {
        if (Options.NO_UNSAFE) {
            throw new UnsupportedOperationException("Not supported when using joml.nounsafe");
        }
        MemUtil.MemUtilUnsafe.get(this, address);
        return this;
    }

    public long get(int component) throws IllegalArgumentException {
        switch (component) {
            case 0: {
                return this.x;
            }
            case 1: {
                return this.y;
            }
            case 2: {
                return this.z;
            }
            case 3: {
                return this.w;
            }
        }
        throw new IllegalArgumentException();
    }

    public int maxComponent() {
        long absX = Math.abs(this.x);
        long absY = Math.abs(this.y);
        long absZ = Math.abs(this.z);
        long absW = Math.abs(this.w);
        if (absX >= absY && absX >= absZ && absX >= absW) {
            return 0;
        }
        if (absY >= absZ && absY >= absW) {
            return 1;
        }
        if (absZ >= absW) {
            return 2;
        }
        return 3;
    }

    public int minComponent() {
        long absX = Math.abs(this.x);
        long absY = Math.abs(this.y);
        long absZ = Math.abs(this.z);
        long absW = Math.abs(this.w);
        if (absX < absY && absX < absZ && absX < absW) {
            return 0;
        }
        if (absY < absZ && absY < absW) {
            return 1;
        }
        if (absZ < absW) {
            return 2;
        }
        return 3;
    }

    public Vector4L setComponent(int component, long value) throws IllegalArgumentException {
        switch (component) {
            case 0: {
                this.x = value;
                break;
            }
            case 1: {
                this.y = value;
                break;
            }
            case 2: {
                this.z = value;
                break;
            }
            case 3: {
                this.w = value;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        return this;
    }

    public LongBuffer get(LongBuffer buffer) {
        MemUtil.INSTANCE.put(this, buffer.position(), buffer);
        return buffer;
    }

    public LongBuffer get(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.put(this, index, buffer);
        return buffer;
    }

    public ByteBuffer get(ByteBuffer buffer) {
        MemUtil.INSTANCE.put(this, buffer.position(), buffer);
        return buffer;
    }

    public ByteBuffer get(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.put(this, index, buffer);
        return buffer;
    }

    public Vector4Lc getToAddress(long address) {
        if (Options.NO_UNSAFE) {
            throw new UnsupportedOperationException("Not supported when using joml.nounsafe");
        }
        MemUtil.MemUtilUnsafe.put(this, address);
        return this;
    }

    public Vector4L sub(Vector4Lc v2) {
        return this.sub(v2, this);
    }

    public Vector4L sub(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x - v2.x();
        dest.y = this.y - v2.y();
        dest.z = this.z - v2.z();
        dest.w = this.w - v2.w();
        return dest;
    }

    public Vector4L sub(Vector4ic v2) {
        return this.sub(v2, this);
    }

    public Vector4L sub(Vector4ic v2, Vector4L dest) {
        dest.x = this.x - (long)v2.x();
        dest.y = this.y - (long)v2.y();
        dest.z = this.z - (long)v2.z();
        dest.w = this.w - (long)v2.w();
        return dest;
    }

    public Vector4L sub(long x2, long y2, long z2, long w2) {
        return this.sub(x2, y2, z2, w2, this);
    }

    public Vector4L sub(long x2, long y2, long z2, long w2, Vector4L dest) {
        dest.x = this.x - x2;
        dest.y = this.y - y2;
        dest.z = this.z - z2;
        dest.w = this.w - w2;
        return dest;
    }

    public Vector4L add(Vector4Lc v2) {
        return this.add(v2, this);
    }

    public Vector4L add(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x + v2.x();
        dest.y = this.y + v2.y();
        dest.z = this.z + v2.z();
        dest.w = this.w + v2.w();
        return dest;
    }

    public Vector4L add(Vector4ic v2) {
        return this.add(v2, this);
    }

    public Vector4L add(Vector4ic v2, Vector4L dest) {
        dest.x = this.x + (long)v2.x();
        dest.y = this.y + (long)v2.y();
        dest.z = this.z + (long)v2.z();
        dest.w = this.w + (long)v2.w();
        return dest;
    }

    public Vector4L add(long x2, long y2, long z2, long w2) {
        return this.add(x2, y2, z2, w2, this);
    }

    public Vector4L add(long x2, long y2, long z2, long w2, Vector4L dest) {
        dest.x = this.x + x2;
        dest.y = this.y + y2;
        dest.z = this.z + z2;
        dest.w = this.w + w2;
        return dest;
    }

    public Vector4L mul(Vector4Lc v2) {
        return this.mul(v2, this);
    }

    public Vector4L mul(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x * v2.x();
        dest.y = this.y * v2.y();
        dest.z = this.z * v2.z();
        dest.w = this.w * v2.w();
        return dest;
    }

    public Vector4L mul(Vector4ic v2) {
        return this.mul(v2, this);
    }

    public Vector4L mul(Vector4ic v2, Vector4L dest) {
        dest.x = this.x * (long)v2.x();
        dest.y = this.y * (long)v2.y();
        dest.z = this.z * (long)v2.z();
        dest.w = this.w * (long)v2.w();
        return dest;
    }

    public Vector4L div(Vector4Lc v2) {
        return this.div(v2, this);
    }

    public Vector4L div(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x / v2.x();
        dest.y = this.y / v2.y();
        dest.z = this.z / v2.z();
        dest.w = this.w / v2.w();
        return dest;
    }

    public Vector4L div(Vector4ic v2) {
        return this.div(v2, this);
    }

    public Vector4L div(Vector4ic v2, Vector4L dest) {
        dest.x = this.x / (long)v2.x();
        dest.y = this.y / (long)v2.y();
        dest.z = this.z / (long)v2.z();
        dest.w = this.w / (long)v2.w();
        return dest;
    }

    public Vector4L mul(long scalar) {
        return this.mul(scalar, this);
    }

    public Vector4L mul(long scalar, Vector4L dest) {
        dest.x = this.x * scalar;
        dest.y = this.y * scalar;
        dest.z = this.z * scalar;
        dest.w = this.w * scalar;
        return dest;
    }

    public Vector4L div(float scalar) {
        return this.div(scalar, this);
    }

    public Vector4L div(float scalar, Vector4L dest) {
        float invscalar = 1.0f / scalar;
        dest.x = (int)((float)this.x * invscalar);
        dest.y = (int)((float)this.y * invscalar);
        dest.z = (int)((float)this.z * invscalar);
        dest.w = (int)((float)this.w * invscalar);
        return dest;
    }

    public Vector4L div(long scalar) {
        return this.div(scalar, this);
    }

    public Vector4L div(long scalar, Vector4L dest) {
        dest.x = this.x / scalar;
        dest.y = this.y / scalar;
        dest.z = this.z / scalar;
        dest.w = this.w / scalar;
        return dest;
    }

    public long lengthSquared() {
        return this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w;
    }

    public static long lengthSquared(long x2, long y2, long z2, long w2) {
        return x2 * x2 + y2 * y2 + z2 * z2 + w2 * w2;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w);
    }

    public static double length(long x2, long y2, long z2, long w2) {
        return Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2 + w2 * w2);
    }

    public double distance(Vector4Lc v2) {
        return this.distance(v2.x(), v2.y(), v2.z(), v2.w());
    }

    public double distance(Vector4ic v2) {
        return this.distance(v2.x(), v2.y(), v2.z(), v2.w());
    }

    public double distance(long x2, long y2, long z2, long w2) {
        long dx2 = this.x - x2;
        long dy2 = this.y - y2;
        long dz2 = this.z - z2;
        long dw2 = this.w - w2;
        return Math.sqrt(Math.fma(dx2, dx2, Math.fma(dy2, dy2, Math.fma(dz2, dz2, dw2 * dw2))));
    }

    public long gridDistance(Vector4Lc v2) {
        return Math.abs(v2.x() - this.x()) + Math.abs(v2.y() - this.y()) + Math.abs(v2.z() - this.z()) + Math.abs(v2.w() - this.w());
    }

    public long gridDistance(Vector4ic v2) {
        return Math.abs((long)v2.x() - this.x()) + Math.abs((long)v2.y() - this.y()) + Math.abs((long)v2.z() - this.z()) + Math.abs((long)v2.w() - this.w());
    }

    public long gridDistance(long x2, long y2, long z2, long w2) {
        return Math.abs(x2 - this.x()) + Math.abs(y2 - this.y()) + Math.abs(z2 - this.z()) + Math.abs(w2 - this.w());
    }

    public long distanceSquared(Vector4Lc v2) {
        return this.distanceSquared(v2.x(), v2.y(), v2.z(), v2.w());
    }

    public long distanceSquared(Vector4ic v2) {
        return this.distanceSquared(v2.x(), v2.y(), v2.z(), v2.w());
    }

    public long distanceSquared(long x2, long y2, long z2, long w2) {
        long dx2 = this.x - x2;
        long dy2 = this.y - y2;
        long dz2 = this.z - z2;
        long dw2 = this.w - w2;
        return dx2 * dx2 + dy2 * dy2 + dz2 * dz2 + dw2 * dw2;
    }

    public static double distance(long x1, long y1, long z1, long w1, long x2, long y2, long z2, long w2) {
        long dx2 = x1 - x2;
        long dy2 = y1 - y2;
        long dz2 = z1 - z2;
        long dw2 = w1 - w2;
        return Math.sqrt(dx2 * dx2 + dy2 * dy2 + dz2 * dz2 + dw2 * dw2);
    }

    public static long distanceSquared(long x1, long y1, long z1, long w1, long x2, long y2, long z2, long w2) {
        long dx2 = x1 - x2;
        long dy2 = y1 - y2;
        long dz2 = z1 - z2;
        long dw2 = w1 - w2;
        return dx2 * dx2 + dy2 * dy2 + dz2 * dz2 + dw2 * dw2;
    }

    public long dot(Vector4Lc v2) {
        return this.x * v2.x() + this.y * v2.y() + this.z * v2.z() + this.w * v2.w();
    }

    public long dot(Vector4ic v2) {
        return this.x * (long)v2.x() + this.y * (long)v2.y() + this.z * (long)v2.z() + this.w * (long)v2.w();
    }

    public Vector4L zero() {
        this.x = 0L;
        this.y = 0L;
        this.z = 0L;
        this.w = 0L;
        return this;
    }

    public Vector4L negate() {
        return this.negate(this);
    }

    public Vector4L negate(Vector4L dest) {
        dest.x = -this.x;
        dest.y = -this.y;
        dest.z = -this.z;
        dest.w = -this.w;
        return dest;
    }

    public String toString() {
        return Runtime.formatNumbers(this.toString(Options.NUMBER_FORMAT));
    }

    public String toString(NumberFormat formatter) {
        return "(" + formatter.format(this.x) + " " + formatter.format(this.y) + " " + formatter.format(this.z) + " " + formatter.format(this.w) + ")";
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeLong(this.x);
        out.writeLong(this.y);
        out.writeLong(this.z);
        out.writeLong(this.w);
    }

    public void readExternal(ObjectInput in2) throws IOException, ClassNotFoundException {
        this.x = in2.readLong();
        this.y = in2.readLong();
        this.z = in2.readLong();
        this.w = in2.readLong();
    }

    public Vector4L min(Vector4Lc v2) {
        return this.min(v2, this);
    }

    public Vector4L min(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x < v2.x() ? this.x : v2.x();
        dest.y = this.y < v2.y() ? this.y : v2.y();
        dest.z = this.z < v2.z() ? this.z : v2.z();
        dest.w = this.w < v2.w() ? this.w : v2.w();
        return dest;
    }

    public Vector4L max(Vector4Lc v2) {
        return this.max(v2, this);
    }

    public Vector4L max(Vector4Lc v2, Vector4L dest) {
        dest.x = this.x > v2.x() ? this.x : v2.x();
        dest.y = this.y > v2.y() ? this.y : v2.y();
        dest.z = this.z > v2.z() ? this.z : v2.z();
        dest.w = this.w > v2.w() ? this.w : v2.w();
        return dest;
    }

    public Vector4L absolute() {
        return this.absolute(this);
    }

    public Vector4L absolute(Vector4L dest) {
        dest.x = Math.abs(this.x);
        dest.y = Math.abs(this.y);
        dest.z = Math.abs(this.z);
        dest.w = Math.abs(this.w);
        return dest;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (int)(this.x ^ this.x >>> 32);
        result = 31 * result + (int)(this.y ^ this.y >>> 32);
        result = 31 * result + (int)(this.z ^ this.z >>> 32);
        result = 31 * result + (int)(this.w ^ this.w >>> 32);
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
        Vector4L other = (Vector4L)obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.z != other.z) {
            return false;
        }
        return this.w == other.w;
    }

    public boolean equals(long x2, long y2, long z2, long w2) {
        if (this.x != x2) {
            return false;
        }
        if (this.y != y2) {
            return false;
        }
        if (this.z != z2) {
            return false;
        }
        return this.w == w2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

