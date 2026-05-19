/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.awt.Color;
import java.io.Serializable;
import javax.vecmath.Tuple3d;
import javax.vecmath.Tuple3f;

public class Color3f
extends Tuple3f
implements Serializable {
    public Color3f(float x2, float y2, float z2) {
        super(x2, y2, z2);
    }

    public Color3f(float[] c2) {
        super(c2);
    }

    public Color3f(Color3f c1) {
        super(c1);
    }

    public Color3f(Tuple3d t1) {
        super(t1);
    }

    public Color3f(Tuple3f t1) {
        super(t1);
    }

    public Color3f() {
    }

    public Color3f(Color color) {
        this.x = (float)color.getRed() / 255.0f;
        this.y = (float)color.getGreen() / 255.0f;
        this.z = (float)color.getBlue() / 255.0f;
    }

    public final void set(Color color) {
        this.x = (float)color.getRed() / 255.0f;
        this.y = (float)color.getGreen() / 255.0f;
        this.z = (float)color.getBlue() / 255.0f;
    }

    public final Color get() {
        return new Color(this.x, this.y, this.z);
    }
}

