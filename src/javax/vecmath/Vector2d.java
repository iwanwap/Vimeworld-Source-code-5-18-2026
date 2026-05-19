/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Tuple2d;
import javax.vecmath.Tuple2f;
import javax.vecmath.Vector2f;

public class Vector2d
extends Tuple2d
implements Serializable {
    public Vector2d(double x2, double y2) {
        super(x2, y2);
    }

    public Vector2d(double[] v2) {
        super(v2);
    }

    public Vector2d(Vector2d v1) {
        super(v1);
    }

    public Vector2d(Vector2f v1) {
        super(v1);
    }

    public Vector2d(Tuple2d t1) {
        super(t1);
    }

    public Vector2d(Tuple2f t1) {
        super(t1);
    }

    public Vector2d() {
    }

    public final double dot(Vector2d v1) {
        return this.x * v1.x + this.y * v1.y;
    }

    public final double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public final double lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }

    public final void normalize() {
        double d2 = this.length();
        this.x /= d2;
        this.y /= d2;
    }

    public final void normalize(Vector2d v1) {
        this.set(v1);
        this.normalize();
    }

    public final double angle(Vector2d v1) {
        return Math.abs(Math.atan2(this.x * v1.y - this.y * v1.x, this.dot(v1)));
    }
}

