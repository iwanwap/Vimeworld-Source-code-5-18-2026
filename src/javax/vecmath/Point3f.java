/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Point3d;
import javax.vecmath.Point4f;
import javax.vecmath.Tuple3d;
import javax.vecmath.Tuple3f;

public class Point3f
extends Tuple3f
implements Serializable {
    public Point3f(float x2, float y2, float z2) {
        super(x2, y2, z2);
    }

    public Point3f(float[] p2) {
        super(p2);
    }

    public Point3f(Point3f p1) {
        super(p1);
    }

    public Point3f(Point3d p1) {
        super(p1);
    }

    public Point3f(Tuple3f t1) {
        super(t1);
    }

    public Point3f(Tuple3d t1) {
        super(t1);
    }

    public Point3f() {
    }

    public final float distanceSquared(Point3f p1) {
        double dx2 = this.x - p1.x;
        double dy2 = this.y - p1.y;
        double dz2 = this.z - p1.z;
        return (float)(dx2 * dx2 + dy2 * dy2 + dz2 * dz2);
    }

    public final float distance(Point3f p1) {
        return (float)Math.sqrt(this.distanceSquared(p1));
    }

    public final float distanceL1(Point3f p1) {
        return Math.abs(this.x - p1.x) + Math.abs(this.y - p1.y) + Math.abs(this.z - p1.z);
    }

    public final float distanceLinf(Point3f p1) {
        return Math.max(Math.max(Math.abs(this.x - p1.x), Math.abs(this.y - p1.y)), Math.abs(this.z - p1.z));
    }

    public final void project(Point4f p1) {
        this.x = p1.x / p1.w;
        this.y = p1.y / p1.w;
        this.z = p1.z / p1.w;
    }
}

