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
import org.joml.Vector2Lc;
import org.joml.Vector2dc;
import org.joml.Vector2fc;
import org.joml.Vector2ic;

public class Vector2L
implements Externalizable,
Cloneable,
Vector2Lc {
    private static final long serialVersionUID = 1L;
    public long x;
    public long y;

    public Vector2L() {
    }

    public Vector2L(long s2) {
        this.x = s2;
        this.y = s2;
    }

    public Vector2L(long x2, long y2) {
        this.x = x2;
        this.y = y2;
    }

    public Vector2L(float x2, float y2, int mode) {
        this.x = Math.roundLongUsing(x2, mode);
        this.y = Math.roundLongUsing(y2, mode);
    }

    public Vector2L(double x2, double y2, int mode) {
        this.x = Math.roundLongUsing(x2, mode);
        this.y = Math.roundLongUsing(y2, mode);
    }

    public Vector2L(Vector2Lc v2) {
        this.x = v2.x();
        this.y = v2.y();
    }

    public Vector2L(Vector2ic v2) {
        this.x = v2.x();
        this.y = v2.y();
    }

    public Vector2L(Vector2fc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
    }

    public Vector2L(Vector2dc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
    }

    public Vector2L(long[] xy2) {
        this.x = xy2[0];
        this.y = xy2[1];
    }

    public Vector2L(ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
    }

    public Vector2L(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
    }

    public Vector2L(LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
    }

    public Vector2L(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
    }

    public long x() {
        return this.x;
    }

    public long y() {
        return this.y;
    }

    public Vector2L set(long s2) {
        this.x = s2;
        this.y = s2;
        return this;
    }

    public Vector2L set(long x2, long y2) {
        this.x = x2;
        this.y = y2;
        return this;
    }

    public Vector2L set(Vector2Lc v2) {
        this.x = v2.x();
        this.y = v2.y();
        return this;
    }

    public Vector2L set(Vector2ic v2) {
        this.x = v2.x();
        this.y = v2.y();
        return this;
    }

    public Vector2L set(Vector2dc v2) {
        this.x = (long)v2.x();
        this.y = (long)v2.y();
        return this;
    }

    public Vector2L set(Vector2dc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        return this;
    }

    public Vector2L set(Vector2fc v2, int mode) {
        this.x = Math.roundLongUsing(v2.x(), mode);
        this.y = Math.roundLongUsing(v2.y(), mode);
        return this;
    }

    public Vector2L set(long[] xy2) {
        this.x = xy2[0];
        this.y = xy2[1];
        return this;
    }

    public Vector2L set(ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
        return this;
    }

    public Vector2L set(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
        return this;
    }

    public Vector2L set(LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, buffer.position(), buffer);
        return this;
    }

    public Vector2L set(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.get(this, index, buffer);
        return this;
    }

    public Vector2L setFromAddress(long address) {
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
        }
        throw new IllegalArgumentException();
    }

    public Vector2L setComponent(int component, long value) throws IllegalArgumentException {
        switch (component) {
            case 0: {
                this.x = value;
                break;
            }
            case 1: {
                this.y = value;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        return this;
    }

    public ByteBuffer get(ByteBuffer buffer) {
        MemUtil.INSTANCE.put(this, buffer.position(), buffer);
        return buffer;
    }

    public ByteBuffer get(int index, ByteBuffer buffer) {
        MemUtil.INSTANCE.put(this, index, buffer);
        return buffer;
    }

    public LongBuffer get(LongBuffer buffer) {
        MemUtil.INSTANCE.put(this, buffer.position(), buffer);
        return buffer;
    }

    public LongBuffer get(int index, LongBuffer buffer) {
        MemUtil.INSTANCE.put(this, index, buffer);
        return buffer;
    }

    public Vector2Lc getToAddress(long address) {
        if (Options.NO_UNSAFE) {
            throw new UnsupportedOperationException("Not supported when using joml.nounsafe");
        }
        MemUtil.MemUtilUnsafe.put(this, address);
        return this;
    }

    public Vector2L sub(Vector2Lc v2) {
        return this.sub(v2, this);
    }

    public Vector2L sub(Vector2Lc v2, Vector2L dest) {
        dest.x = this.x - v2.x();
        dest.y = this.y - v2.y();
        return dest;
    }

    public Vector2L sub(Vector2ic v2) {
        return this.sub(v2, this);
    }

    public Vector2L sub(Vector2ic v2, Vector2L dest) {
        dest.x = this.x - (long)v2.x();
        dest.y = this.y - (long)v2.y();
        return dest;
    }

    public Vector2L sub(long x2, long y2) {
        return this.sub(x2, y2, this);
    }

    public Vector2L sub(long x2, long y2, Vector2L dest) {
        dest.x = this.x - x2;
        dest.y = this.y - y2;
        return dest;
    }

    public long lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }

    public static long lengthSquared(long x2, long y2) {
        return x2 * x2 + y2 * y2;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static double length(long x2, long y2) {
        return Math.sqrt(x2 * x2 + y2 * y2);
    }

    public double distance(Vector2Lc v2) {
        long dx2 = this.x - v2.x();
        long dy2 = this.y - v2.y();
        return Math.sqrt(dx2 * dx2 + dy2 * dy2);
    }

    public double distance(long x2, long y2) {
        long dx2 = this.x - x2;
        long dy2 = this.y - y2;
        return Math.sqrt(dx2 * dx2 + dy2 * dy2);
    }

    public long distanceSquared(Vector2Lc v2) {
        long dx2 = this.x - v2.x();
        long dy2 = this.y - v2.y();
        return dx2 * dx2 + dy2 * dy2;
    }

    public long distanceSquared(long x2, long y2) {
        long dx2 = this.x - x2;
        long dy2 = this.y - y2;
        return dx2 * dx2 + dy2 * dy2;
    }

    public long gridDistance(Vector2Lc v2) {
        return Math.abs(v2.x() - this.x()) + Math.abs(v2.y() - this.y());
    }

    public long gridDistance(long x2, long y2) {
        return Math.abs(x2 - this.x()) + Math.abs(y2 - this.y());
    }

    public static double distance(long x1, long y1, long x2, long y2) {
        long dx2 = x1 - x2;
        long dy2 = y1 - y2;
        return Math.sqrt(dx2 * dx2 + dy2 * dy2);
    }

    public static long distanceSquared(long x1, long y1, long x2, long y2) {
        long dx2 = x1 - x2;
        long dy2 = y1 - y2;
        return dx2 * dx2 + dy2 * dy2;
    }

    public Vector2L add(Vector2Lc v2) {
        this.x += v2.x();
        this.y += v2.y();
        return this;
    }

    public Vector2L add(Vector2Lc v2, Vector2L dest) {
        dest.x = this.x + v2.x();
        dest.y = this.y + v2.y();
        return dest;
    }

    public Vector2L add(Vector2ic v2) {
        this.x += (long)v2.x();
        this.y += (long)v2.y();
        return this;
    }

    public Vector2L add(Vector2ic v2, Vector2L dest) {
        dest.x = this.x + (long)v2.x();
        dest.y = this.y + (long)v2.y();
        return dest;
    }

    public Vector2L add(long x2, long y2) {
        return this.add(x2, y2, this);
    }

    public Vector2L add(long x2, long y2, Vector2L dest) {
        dest.x = this.x + x2;
        dest.y = this.y + y2;
        return dest;
    }

    public Vector2L mul(long scalar) {
        return this.mul(scalar, this);
    }

    public Vector2L mul(long scalar, Vector2L dest) {
        dest.x = this.x * scalar;
        dest.y = this.y * scalar;
        return dest;
    }

    public Vector2L mul(Vector2Lc v2) {
        return this.mul(v2, this);
    }

    public Vector2L mul(Vector2Lc v2, Vector2L dest) {
        dest.x = this.x * v2.x();
        dest.y = this.y * v2.y();
        return dest;
    }

    public Vector2L mul(Vector2ic v2) {
        return this.mul(v2, this);
    }

    public Vector2L mul(Vector2ic v2, Vector2L dest) {
        dest.x = this.x * (long)v2.x();
        dest.y = this.y * (long)v2.y();
        return dest;
    }

    public Vector2L mul(long x2, long y2) {
        return this.mul(x2, y2, this);
    }

    public Vector2L mul(long x2, long y2, Vector2L dest) {
        dest.x = this.x * x2;
        dest.y = this.y * y2;
        return dest;
    }

    public Vector2L div(float scalar) {
        return this.div(scalar, this);
    }

    public Vector2L div(float scalar, Vector2L dest) {
        float invscalar = 1.0f / scalar;
        dest.x = (int)((float)this.x * invscalar);
        dest.y = (int)((float)this.y * invscalar);
        return dest;
    }

    public Vector2L div(long scalar) {
        return this.div(scalar, this);
    }

    public Vector2L div(long scalar, Vector2L dest) {
        dest.x = this.x / scalar;
        dest.y = this.y / scalar;
        return dest;
    }

    public Vector2L zero() {
        this.x = 0L;
        this.y = 0L;
        return this;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeLong(this.x);
        out.writeLong(this.y);
    }

    public void readExternal(ObjectInput in2) throws IOException, ClassNotFoundException {
        this.x = in2.readLong();
        this.y = in2.readLong();
    }

    public Vector2L negate() {
        return this.negate(this);
    }

    public Vector2L negate(Vector2L dest) {
        dest.x = -this.x;
        dest.y = -this.y;
        return dest;
    }

    public Vector2L min(Vector2Lc v2) {
        return this.min(v2, this);
    }

    public Vector2L min(Vector2Lc v2, Vector2L dest) {
        dest.x = this.x < v2.x() ? this.x : v2.x();
        dest.y = this.y < v2.y() ? this.y : v2.y();
        return dest;
    }

    public Vector2L max(Vector2Lc v2) {
        return this.max(v2, this);
    }

    public Vector2L max(Vector2Lc v2, Vector2L dest) {
        dest.x = this.x > v2.x() ? this.x : v2.x();
        dest.y = this.y > v2.y() ? this.y : v2.y();
        return dest;
    }

    public long maxComponent() {
        long absY;
        long absX = Math.abs(this.x);
        if (absX >= (absY = Math.abs(this.y))) {
            return 0L;
        }
        return 1L;
    }

    public long minComponent() {
        long absY;
        long absX = Math.abs(this.x);
        if (absX < (absY = Math.abs(this.y))) {
            return 0L;
        }
        return 1L;
    }

    public Vector2L absolute() {
        return this.absolute(this);
    }

    public Vector2L absolute(Vector2L dest) {
        dest.x = Math.abs(this.x);
        dest.y = Math.abs(this.y);
        return dest;
    }

    public int hashCode() {
        long prime = 31L;
        long result = 1L;
        result = 31L * result + this.x;
        result = 31L * result + this.y;
        return (int)(result ^ result >> 32);
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
        Vector2L other = (Vector2L)obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    public boolean equals(long x2, long y2) {
        if (this.x != x2) {
            return false;
        }
        return this.y == y2;
    }

    public String toString() {
        return Runtime.formatNumbers(this.toString(Options.NUMBER_FORMAT));
    }

    public String toString(NumberFormat formatter) {
        return "(" + formatter.format(this.x) + " " + formatter.format(this.y) + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

