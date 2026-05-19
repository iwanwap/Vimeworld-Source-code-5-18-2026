/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vQa
 */
public final class JC {
    public static int J(double a2) {
        return (int)Math.floor(a2 / gua.V * vQa.c);
    }

    public static double J(double d2, double[] dArray) {
        int a2;
        double b2;
        double[] dArray2 = dArray;
        double d3 = dArray2[uSa.E];
        double d4 = Math.abs(b2 - d3);
        int n2 = dArray2.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            double d5;
            double d6 = dArray2[a2];
            double d7 = Math.abs(b2 - d6);
            if (d5 < d4) {
                d4 = d7;
                d3 = d6;
            }
            n3 = ++a2;
        }
        return d3;
    }

    public JC() {
        JC a2;
    }

    public static double f(double c2, double b2, double a2) {
        return (a2 - c2) / (b2 - c2);
    }

    public static double J(double c2, double b2, double a2) {
        return (b2 - c2) * a2 + c2;
    }
}

