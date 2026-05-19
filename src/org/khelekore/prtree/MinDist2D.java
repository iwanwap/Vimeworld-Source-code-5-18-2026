/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

public class MinDist2D {
    private MinDist2D() {
    }

    public static double get(double minx, double miny, double maxx, double maxy, double x2, double y2) {
        double rx2 = MinDist2D.r(x2, minx, maxx);
        double ry2 = MinDist2D.r(y2, miny, maxy);
        double xd2 = x2 - rx2;
        double yd2 = y2 - ry2;
        return xd2 * xd2 + yd2 * yd2;
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

