/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YI
 *  fH
 *  vRa
 */
public final class OG_2<T>
implements Iterable<T> {
    private final fH<T> j;
    private YI J;
    private final boolean A;
    private YI I;

    /*
     * WARNING - void declaration
     */
    public OG_2(fH<T> fH2, boolean bl2) {
        void b2;
        OG_2 a2;
        boolean c2 = bl2;
        OG_2 oG_2 = a2 = this;
        oG_2.j = b2;
        oG_2.A = c2;
    }

    public YI<T> J() {
        OG_2 a2;
        OG_2 oG_2 = a2;
        return new YI(oG_2.j, oG_2.A);
    }

    public OG_2(fH<T> fH2) {
        fH<T> b2 = fH2;
        fH<T> a2 = this;
        super(b2, vRa.d != 0);
    }
}

