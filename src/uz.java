/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  FAa
 *  OCa
 *  eBa
 *  kA
 *  ld
 *  uaa
 *  vRa
 */
public final class uz
implements kA {
    private boolean j;
    private final OCa J;
    private static final ld A = new CY(Bra.E);
    private final uba I;

    public void J(FAa fAa2) {
        uz b2 = fAa2;
        uz a2 = this;
        if (a2.j) {
            a2.I.J(A);
            return;
        }
        a2.j = vRa.d;
        a2.I.J((KC)new eBa(a2.J.J()));
    }

    /*
     * WARNING - void declaration
     */
    public uz(OCa oCa, uba uba2) {
        void b2;
        uz a2;
        uba c2 = uba2;
        uz uz2 = a2 = this;
        uz2.J = b2;
        uz2.I = c2;
    }

    public void J(uaa uaa2) {
        uz a2;
        uz b2 = uaa2;
        uz uz2 = a2 = this;
        uz2.I.J(new Wba(b2.J()));
        uz2.I.J(A);
    }

    public void J(ld object) {
        uz b2 = object;
        object = this;
    }
}

