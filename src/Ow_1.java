/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  hw
 *  ura
 *  vRa
 *  yra
 */
public final class Ow_1
extends hw {
    /*
     * WARNING - void declaration
     */
    public Ow_1(long l2, hw hw2) {
        void b2;
        Ow_1 c2 = hw2;
        Ow_1 a2 = this;
        super((long)b2);
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int e22;
        int n6;
        void a2;
        void b2;
        Ow_1 ow_1 = this;
        void var5_8 = (d14 -= uqa.g) >> uqa.g;
        void var6_9 = (c2 -= uqa.g) >> uqa.g;
        void var7_10 = (b2 >> uqa.g) + uqa.g;
        void var8_11 = (a2 >> uqa.g) + uqa.g;
        int[] nArray = ow_1.A.J((int)var5_8, (int)var6_9, (int)var7_10, (int)var8_11);
        void var10_13 = var7_10 - vRa.d << uqa.g;
        void var11_14 = var8_11 - vRa.d << uqa.g;
        int[] nArray2 = iW.J((int)(var10_13 * var11_14));
        int n7 = n6 = uSa.E;
        while (n7 < var8_11 - vRa.d) {
            int e22 = uSa.E;
            int n8 = nArray[e22 + uSa.E + (n6 + uSa.E) * var7_10];
            int n9 = nArray[e22 + uSa.E + (n6 + vRa.d) * var7_10];
            int n10 = e22;
            while (n10 < var7_10 - vRa.d) {
                Ow_1 ow_12 = ow_1;
                ow_12.J(e22 + var5_8 << uqa.g, n6 + var6_9 << uqa.g);
                double d2 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z;
                double d3 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z;
                ow_12.J(e22 + var5_8 + vRa.d << uqa.g, n6 + var6_9 << uqa.g);
                double d4 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z + FPa.T;
                double d5 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z;
                ow_12.J(e22 + var5_8 << uqa.g, n6 + var6_9 + vRa.d << uqa.g);
                double d6 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z;
                double d7 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z + FPa.T;
                ow_12.J(e22 + var5_8 + vRa.d << uqa.g, n6 + var6_9 + vRa.d << uqa.g);
                double d8 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z + FPa.T;
                double d9 = ((double)ow_12.J(ura.V) / yra.Y - kTa.B) * mSa.z + FPa.T;
                int n11 = nArray[e22 + vRa.d + (n6 + uSa.E) * var7_10] & osa.Ja;
                int n12 = nArray[e22 + vRa.d + (n6 + vRa.d) * var7_10] & osa.Ja;
                int n13 = uSa.E;
                while (n13 < AQa.P) {
                    int n14;
                    int n15 = ((n6 << uqa.g) + n14) * var10_13 + (e22 << uqa.g);
                    int n16 = uSa.E;
                    while (n16 < AQa.P) {
                        int n17;
                        double d10 = ((double)n14 - d3) * ((double)n14 - d3) + ((double)n17 - d2) * ((double)n17 - d2);
                        double d11 = ((double)n14 - d5) * ((double)n14 - d5) + ((double)n17 - d4) * ((double)n17 - d4);
                        double d12 = ((double)n14 - d7) * ((double)n14 - d7) + ((double)n17 - d6) * ((double)n17 - d6);
                        double d13 = ((double)n14 - d9) * ((double)n14 - d9) + ((double)n17 - d8) * ((double)n17 - d8);
                        nArray2[n15++] = d10 < d11 && d10 < d12 && d10 < d13 ? n8 : (d11 < d10 && d11 < d12 && d11 < d13 ? n11 : (d12 < d10 && d12 < d11 && d12 < d13 ? n9 : n12));
                        n16 = ++n17;
                    }
                    n13 = ++n14;
                }
                n8 = n11;
                n9 = n12;
                n10 = ++e22;
            }
            n7 = ++n6;
        }
        int[] nArray3 = iW.J((int)(b2 * a2));
        int n18 = e22 = uSa.E;
        while (n18 < a2) {
            void d14;
            void c2;
            System.arraycopy(nArray2, (e22 + (c2 & yRa.d)) * var10_13 + (d14 & yRa.d), nArray3, e22++ * b2, (int)b2);
            n18 = e22;
        }
        return nArray3;
    }
}

