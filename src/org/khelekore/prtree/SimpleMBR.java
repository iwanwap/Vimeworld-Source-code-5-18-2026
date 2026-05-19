/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.Arrays;
import org.khelekore.prtree.MBR;
import org.khelekore.prtree.MBRConverter;

public class SimpleMBR
implements MBR {
    private final double[] values;

    private SimpleMBR(int dimensions) {
        this.values = new double[dimensions * 2];
    }

    public SimpleMBR(double ... values) {
        this.values = (double[])values.clone();
    }

    public <T> SimpleMBR(T t2, MBRConverter<T> converter) {
        int dims = converter.getDimensions();
        this.values = new double[dims * 2];
        int p2 = 0;
        for (int i2 = 0; i2 < dims; ++i2) {
            this.values[p2++] = converter.getMin(i2, t2);
            this.values[p2++] = converter.getMax(i2, t2);
        }
    }

    @Override
    public int getDimensions() {
        return this.values.length / 2;
    }

    @Override
    public double getMin(int axis) {
        return this.values[axis * 2];
    }

    @Override
    public double getMax(int axis) {
        return this.values[axis * 2 + 1];
    }

    @Override
    public MBR union(MBR mbr) {
        int dims = this.getDimensions();
        SimpleMBR n2 = new SimpleMBR(dims);
        int p2 = 0;
        for (int i2 = 0; i2 < dims; ++i2) {
            n2.values[p2] = Math.min(this.getMin(i2), mbr.getMin(i2));
            n2.values[++p2] = Math.max(this.getMax(i2), mbr.getMax(i2));
            ++p2;
        }
        return n2;
    }

    @Override
    public boolean intersects(MBR other) {
        for (int i2 = 0; i2 < this.getDimensions(); ++i2) {
            if (!(other.getMax(i2) < this.getMin(i2)) && !(other.getMin(i2) > this.getMax(i2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public <T> boolean intersects(T t2, MBRConverter<T> converter) {
        for (int i2 = 0; i2 < this.getDimensions(); ++i2) {
            if (!(converter.getMax(i2, t2) < this.getMin(i2)) && !(converter.getMin(i2, t2) > this.getMax(i2))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{values: " + Arrays.toString(this.values) + "}";
    }
}

