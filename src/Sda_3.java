/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  RC
 *  Sda
 *  Uta
 *  pqa
 */
public final class Sda_3
extends dfa {
    private final double J;
    private String A;
    private final double I;

    public Sda J(String string) {
        String b2 = string;
        Sda_3 a2 = this;
        a2.A = b2;
        return a2;
    }

    public double J(double a2) {
        Sda_3 b2;
        a2 = Oz.J((double)a2, (double)b2.J, (double)b2.I);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Sda_3(RC rC2, String string, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        Sda_3 d5;
        String f2 = string;
        Sda_3 sda_3 = d5 = this;
        super((RC)e2, f2, (double)c2);
        sda_3.J = b2;
        sda_3.I = a2;
        if (b2 > a2) {
            throw new IllegalArgumentException(pqa.I);
        }
        if (c2 < b2) {
            throw new IllegalArgumentException(Uta.s);
        }
        if (c2 > a2) {
            throw new IllegalArgumentException(Qpa.z);
        }
    }

    public String f() {
        Sda_3 a2;
        return a2.A;
    }
}

