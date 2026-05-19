/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SQa
 *  aSa
 *  fSa
 *  tsa
 *  uRa
 *  vRa
 *  vSa
 */
public final class ita_2<T extends fSa>
extends tsa<T> {
    public double A;
    public vSa I;

    /*
     * WARNING - void declaration
     */
    public double J(double d2, int n2, int n3, int n4) {
        void d3;
        void b2;
        void e2;
        void c2;
        ita_2 a2;
        int n5 = n4;
        ita_2 ita_22 = a2 = this;
        double d4 = ita_22.J((int)(c2 - vRa.d), (int)e2);
        double d5 = ita_22.J((int)c2, (int)e2);
        double d6 = ita_22.J((int)b2, (int)e2);
        double d7 = ita_22.J((int)(b2 + vRa.d), (int)e2);
        void v1 = d3;
        double d8 = v1 * v1;
        void var12_12 = d8 * d3;
        double d9 = (d5 - d4) * (oua.i + a2.A) * (double)(vRa.d - a2.I.value) / KPa.y;
        d9 += (d6 - d5) * (oua.i - a2.A) * (double)(vRa.d - a2.I.value) / KPa.y;
        double d10 = (d6 - d5) * (oua.i + a2.A) * (double)(vRa.d - a2.I.value) / KPa.y;
        double d11 = KPa.y * var12_12 - uRa.I * d8 + oua.i;
        d3 = var12_12 - KPa.y * d8 + d3;
        void var16_16 = var12_12 - d8;
        d8 = SQa.E * var12_12 + uRa.I * d8;
        return d11 * d5 + d3 * d9 + var16_16 * (d10 += (d7 - d6) * (oua.i - a2.A) * (double)(vRa.d - a2.I.value) / KPa.y) + d8 * d6;
    }

    public ita_2(T ... TArray) {
        T[] b2 = TArray;
        T[] a2 = this;
        super(vSa.Normal, b2);
    }

    /*
     * WARNING - void declaration
     */
    public ita_2(vSa vSa2, T ... TArray) {
        void b2;
        T[] c2 = TArray;
        T[] a2 = this;
        super(aSa.V, (vSa)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public ita_2(double d2, vSa vSa2, T ... TArray) {
        void b2;
        void c2;
        T[] d3;
        T[] TArray2 = TArray3;
        T[] TArray3 = TArray;
        T[] a2 = TArray2;
        super(d3);
        a2.A = c2;
        a2.I = b2;
    }
}

