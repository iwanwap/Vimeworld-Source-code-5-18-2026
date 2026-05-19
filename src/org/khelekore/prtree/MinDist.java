/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import org.khelekore.prtree.MBR;
import org.khelekore.prtree.PointND;

public class MinDist {
    private MinDist() {
    }

    public static double get(MBR mbr, PointND p2) {
        double res = 0.0;
        for (int i2 = 0; i2 < p2.getDimensions(); ++i2) {
            double o2 = p2.getOrd(i2);
            double rv2 = MinDist.r(o2, mbr.getMin(i2), mbr.getMax(i2));
            double dr2 = o2 - rv2;
            res += dr2 * dr2;
        }
        return res;
    }

    private static double r(double x2, double min, double max) {
        double r2 = x2;
        if (x2 < min) {
            r2 = min;
        }
        if (x2 > max) {
            r2 = max;
        }
        return r2;
    }
}

