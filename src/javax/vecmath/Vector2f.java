/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Tuple2d;
import javax.vecmath.Tuple2f;
import javax.vecmath.Vector2d;

public class Vector2f
extends Tuple2f
implements Serializable {
    public Vector2f(float x2, float y2) {
        super(x2, y2);
    }

    public Vector2f(float[] v2) {
        super(v2);
    }

    public Vector2f(Vector2f v1) {
        super(v1);
    }

    public Vector2f(Vector2d v1) {
        super(v1);
    }

    public Vector2f(Tuple2f t1) {
        super(t1);
    }

    public Vector2f(Tuple2d t1) {
        super(t1);
    }

    public Vector2f() {
    }

    public final float dot(Vector2f v1) {
        return this.x * v1.x + this.y * v1.y;
    }

    public final float length() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public final float lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }

    public final void normalize() {
        double d2 = this.length();
        this.x = (float)((double)this.x / d2);
        this.y = (float)((double)this.y / d2);
    }

    public final void normalize(Vector2f v1) {
        this.set(v1);
        this.normalize();
    }

    public final float angle(Vector2f v1) {
        return (float)Math.abs(Math.atan2(this.x * v1.y - this.y * v1.x, this.dot(v1)));
    }
}

