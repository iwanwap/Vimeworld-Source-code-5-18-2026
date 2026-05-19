/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fSa
 *  mta
 *  vRa
 */
import java.util.ArrayList;

public class tsa_2<T extends fSa>
extends mta<T> {
    public T A;
    public T I;

    public tsa_2(T ... TArray) {
        T[] b2 = TArray;
        T[] a2 = this;
        super(b2);
        a2.A = b2[uSa.E].J(b2[uSa.E].l(b2[vRa.d]));
        a2.I = b2[b2.length - vRa.d].J(b2[b2.length - vRa.d].l(b2[b2.length - uqa.g]));
    }

    /*
     * WARNING - void declaration
     */
    public double J(double d2, int n2, int n3, int n4) {
        void d3;
        void b2;
        void e2;
        void c2;
        tsa_2 a2;
        int n5 = n4;
        tsa_2 tsa_22 = a2 = this;
        double d4 = tsa_22.J((int)(c2 - vRa.d), (int)e2);
        double d5 = tsa_22.J((int)c2, (int)e2);
        double d6 = tsa_22.J((int)b2, (int)e2);
        double d7 = tsa_22.J((int)(b2 + vRa.d), (int)e2);
        void v1 = d3;
        void var16_11 = v1 * v1;
        d7 = d7 - d6 - d4 + d5;
        double d8 = d4 - d5 - d7;
        d4 = d6 - d4;
        return d7 * d3 * var16_11 + d8 * var16_11 + d4 * d3 + d5;
    }

    /*
     * WARNING - void declaration
     */
    public double J(int n2, int n3) {
        void b2;
        int c2 = n3;
        tsa_2 a2 = this;
        if (b2 < 0) {
            return a2.A.J(c2);
        }
        if (b2 >= ((ArrayList)a2.A).size()) {
            return a2.I.J(c2);
        }
        return ((fSa)((ArrayList)a2.A).get((int)b2)).J(c2);
    }
}

