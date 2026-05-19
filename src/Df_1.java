/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bg
 *  Df
 *  WSa
 *  vRa
 */
public final class Df_1 {
    private final Bg[] I;

    public Df_1() {
        Df_1 a2;
        a2.I = new Bg[yRa.d];
    }

    private Bg J(String string) {
        String[] a2;
        Df_1 df_1 = this;
        Df_1 b2 = new Bg();
        a2 = a2.split(WSa.f);
        int n2 = a2.length;
        b2.J(Integer.parseInt(a2[uSa.E]) - vRa.d);
        if (n2 > vRa.d) {
            String string2 = a2[vRa.d];
            if (!string2.isEmpty()) {
                b2.f(Integer.parseInt(string2) - vRa.d);
            }
            if (n2 > uqa.g) {
                b2.l(Integer.parseInt(a2[uqa.g]) - vRa.d);
            }
        }
        return b2;
    }

    public Bg[] J() {
        Df_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Df_1(String string, String string2, String string3) {
        void b2;
        void c2;
        String d2 = string3;
        Df_1 a2 = this;
        a2.I = new Bg[yRa.d];
        Df_1 df_1 = a2;
        df_1.I[uSa.E] = a2.J((String)c2);
        Df_1 df_12 = a2;
        df_1.I[vRa.d] = df_12.J((String)b2);
        df_12.I[uqa.g] = a2.J(d2);
    }

    /*
     * WARNING - void declaration
     */
    public Df J(int n2, int n3, int n4) {
        int n5;
        Df_1 df_1 = this;
        Df_1 df_12 = new Df_1();
        int n6 = n5 = uSa.E;
        while (n6 < df_12.I.length) {
            void b2;
            void a2;
            void c2;
            Df_1 d2 = df_1.I[n5];
            df_12.I[n5++] = new Bg(d2.J() + c2, d2.l() + a2, d2.f() + b2);
            n6 = n5;
        }
        return df_12;
    }
}

