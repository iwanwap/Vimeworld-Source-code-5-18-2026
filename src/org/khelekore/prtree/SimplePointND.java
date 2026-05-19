/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import org.khelekore.prtree.PointND;

public class SimplePointND
implements PointND {
    private final double[] ords;

    public SimplePointND(double ... ords) {
        this.ords = ords;
    }

    @Override
    public int getDimensions() {
        return this.ords.length;
    }

    @Override
    public double getOrd(int axis) {
        return this.ords[axis];
    }
}

