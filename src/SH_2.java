/*
 * Decompiled with CFR 0.152.
 */
public final class SH_2
implements m {
    private final int A;
    private final Ni I;

    public static m J(Ni ni2, int n2) {
        int b2 = n2;
        Ni a2 = ni2;
        return new SH_2(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private SH_2(Ni ni2, int n2) {
        void b2;
        SH_2 a2;
        int c2 = n2;
        SH_2 sH_2 = a2 = this;
        sH_2.I = b2;
        sH_2.A = c2;
    }

    @Override
    public String J() {
        SH_2 a2;
        SH_2 sH_2 = a2;
        return Ni.J(sH_2.I, sH_2.A);
    }
}

