/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Uk
 *  WK
 *  XTa
 */
public final class Vl_2
extends Ak {
    public WK A;
    public t I;

    /*
     * WARNING - void declaration
     */
    public Vl_2(Uk uk2, WK wK2, t t2) {
        void b2;
        void c2;
        Vl_2 a2;
        Object d2 = t2;
        Vl_2 vl_2 = a2 = this;
        super((Uk)c2);
        vl_2.A = b2;
        vl_2.I = d2;
    }

    public String toString() {
        Vl_2 a2;
        return new StringBuilder().insert(3 >> 2, a2.A.f()).append(XTa.d).append(a2.I.toString()).toString();
    }

    public double J() {
        Vl_2 a2;
        Vl_2 vl_2 = a2;
        double d2 = vl_2.I.J().J();
        vl_2.A.J(d2);
        return d2;
    }
}

