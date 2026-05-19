/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;
import javax.vecmath.Tuple3f;

public class TexCoord3f
extends Tuple3f
implements Serializable {
    public TexCoord3f(float x2, float y2, float z2) {
        super(x2, y2, z2);
    }

    public TexCoord3f(float[] v2) {
        super(v2);
    }

    public TexCoord3f(TexCoord3f v1) {
        super(v1);
    }

    public TexCoord3f() {
    }
}

