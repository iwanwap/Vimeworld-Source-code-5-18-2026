/*
 * Decompiled with CFR 0.152.
 */
package org.joml.sampling;

class Math
extends org.joml.Math {
    static final double PI = java.lang.Math.PI;
    static final double PI2 = java.lang.Math.PI * 2;
    static final double PIHalf = 1.5707963267948966;
    private static final double ONE_OVER_PI = 0.3183098861837907;
    private static final double s5 = Double.longBitsToDouble(4523227044276562163L);
    private static final double s4 = Double.longBitsToDouble(-4671934770969572232L);
    private static final double s3 = Double.longBitsToDouble(4575957211482072852L);
    private static final double s2 = Double.longBitsToDouble(-4628199223918090387L);
    private static final double s1 = Double.longBitsToDouble(4607182418589157889L);

    Math() {
    }

    static double sin_roquen_9(double v2) {
        double i2 = java.lang.Math.rint(v2 * 0.3183098861837907);
        double x2 = v2 - i2 * java.lang.Math.PI;
        double qs2 = 1 - 2 * ((int)i2 & 1);
        double x22 = x2 * x2;
        x2 = qs2 * x2;
        double r2 = s5;
        r2 = r2 * x22 + s4;
        r2 = r2 * x22 + s3;
        r2 = r2 * x22 + s2;
        r2 = r2 * x22 + s1;
        return x2 * r2;
    }
}

