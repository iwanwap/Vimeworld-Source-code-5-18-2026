/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  vRa
 */
public class AA_1 {
    public float[] k;
    public float[] j;
    public float[] J;
    private static final String A = "CL_00000977";
    public float[][] I = new float[uua.p][AQa.P];

    /*
     * WARNING - void declaration
     */
    private float J(float[] fArray, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        Object e2 = fArray;
        AA_1 d2 = this;
        return (float)(e2[uSa.E] * c2 + e2[vRa.d] * b2 + e2[uqa.g] * a2 + e2[yRa.d]);
    }

    public AA_1() {
        AA_1 a2;
        AA_1 aA_1 = a2;
        aA_1.j = new float[ERa.C];
        aA_1.k = new float[ERa.C];
        aA_1.J = new float[ERa.C];
    }

    public boolean J(double f22, double e22, double d22, double c2, double b2, double a2) {
        float f22 = (float)f22;
        float f3 = (float)e22;
        float e22 = (float)d22;
        float f4 = (float)c2;
        float d22 = (float)b2;
        float f5 = (float)a2;
        int n2 = c2 = uSa.E;
        while (n2 < uua.p) {
            float[] fArray;
            AA_1 g;
            AA_1 aA_1 = g;
            float[] fArray2 = aA_1.I[c2];
            if (aA_1.J(fArray, f22, f3, e22) <= JPa.N && g.J(fArray2, f4, f3, e22) <= JPa.N && g.J(fArray2, f22, d22, e22) <= JPa.N && g.J(fArray2, f4, d22, e22) <= JPa.N && g.J(fArray2, f22, f3, f5) <= JPa.N && g.J(fArray2, f4, f3, f5) <= JPa.N && g.J(fArray2, f22, d22, f5) <= JPa.N && g.J(fArray2, f4, d22, f5) <= JPa.N) {
                return uSa.E != 0;
            }
            n2 = ++c2;
        }
        return vRa.d != 0;
    }
}

