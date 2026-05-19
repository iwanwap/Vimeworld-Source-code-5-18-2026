/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aKa
 *  pKa
 *  vRa
 */
public final class AQ_2 {
    private final aKa k;
    private final pKa j;
    private hKa J;
    private int A;
    private boolean I;

    public aKa J(double c2, double b2, double a2) {
        AQ_2 d2;
        return d2.k.J(c2, b2, a2);
    }

    public void J() {
        AQ_2 a2;
        if (!a2.I) {
            return;
        }
        a2.j.J();
        a2.I = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, hKa hKa2) {
        void b2;
        hKa c2 = hKa2;
        AQ_2 a2 = this;
        if (a2.A != b2 || a2.J != c2) {
            a2.A = b2;
            a2.J = c2;
            a2.J();
            a2.k.J((int)b2, c2);
            a2.I = vRa.d;
        }
    }

    public AQ_2() {
        AQ_2 a2;
        AQ_2 aQ_2 = a2;
        aQ_2.j = pKa.J();
        aQ_2.k = aQ_2.j.J();
        aQ_2.I = uSa.E;
    }
}

