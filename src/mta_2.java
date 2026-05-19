/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  fSa
 *  vRa
 */
import java.util.ArrayList;

public abstract class mta_2<T extends fSa> {
    public ArrayList<T> A;
    private final Class I;

    public mta_2(T ... TArray) {
        int n2;
        T[] b2 = TArray;
        T[] a2 = this;
        T[] TArray2 = a2;
        a2.A = new ArrayList();
        if (b2.length < uqa.g) {
            throw new IllegalArgumentException(Hra.f);
        }
        a2.I = b2[uSa.E].getClass();
        int n3 = n2 = uSa.E;
        while (n3 < b2.length) {
            a2.A.add(b2[n2++]);
            n3 = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public T J(double d2) {
        int n2;
        int n3;
        void a2;
        mta_2 mta_22 = this;
        if (a2 >= aSa.V && a2 <= oua.i && (n3 = (n2 = (int)((double)(mta_22.A.size() - vRa.d) * a2)) + vRa.d) < mta_22.A.size()) {
            int n4;
            mta_2 b2 = fSa.f((fSa)((fSa)mta_22.A.get(n2)));
            double d3 = oua.i / (double)(mta_22.A.size() - vRa.d);
            double d4 = d3 * (double)n2;
            a2 = (a2 - d4) / d3;
            int n5 = n4 = uSa.E;
            while (n5 < b2.J()) {
                b2.J(n4, mta_22.J((double)a2, n2, n3, n4++));
                n5 = n4;
            }
            return (T)b2;
        }
        return (T)fSa.J((Class)mta_22.I);
    }

    public abstract double J(double var1, int var3, int var4, int var5);

    /*
     * WARNING - void declaration
     */
    public double J(int n2, int n3) {
        void b2;
        int c2 = n3;
        mta_2 a2 = this;
        return ((fSa)a2.A.get((int)b2)).J(c2);
    }
}

