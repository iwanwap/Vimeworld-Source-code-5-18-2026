/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Tca
 *  tZ
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XAa_1
implements UB {
    @Override
    public Mda J() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        XAa_1 xAa_1 = this;
        Mda a2 = null;
        XAa_1 c2 = null;
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            Mda mda2 = b2.J(n2);
            if (mda2 != null) {
                int n4;
                if (mda2.J() != Gea.gC) {
                    return uSa.E != 0;
                }
                if (a2 != null && c2 != null) {
                    return uSa.E != 0;
                }
                Mda mda3 = mda2;
                int n5 = tZ.J((Mda)mda3);
                int n6 = n4 = tZ.f((Mda)mda3) > 0 ? vRa.d : uSa.E;
                if (a2 != null) {
                    if (n4 != 0) {
                        return uSa.E != 0;
                    }
                    if (n5 != tZ.J(a2)) {
                        return uSa.E != 0;
                    }
                    c2 = mda2;
                } else if (c2 != null) {
                    if (n4 == 0) {
                        return uSa.E != 0;
                    }
                    if (n5 != tZ.J((Mda)c2)) {
                        return uSa.E != 0;
                    }
                    a2 = mda2;
                } else if (n4 != 0) {
                    a2 = mda2;
                } else {
                    c2 = a2;
                }
            }
            n3 = ++n2;
        }
        if (a2 != null && c2 != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        XAa_1 xAa_1 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null) {
                if (mda2.J().f()) {
                    mdaArray[b2] = new Mda(mda2.J().f());
                } else if (mda2.M() && tZ.f((Mda)mda2) > 0) {
                    mdaArray[b2] = mda2.J();
                    mdaArray[b2].E = vRa.d;
                }
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(xFa xFa2) {
        void a2;
        int n2;
        XAa_1 xAa_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.f()) {
            XAa_1 b2 = a2.J(n2);
            if (b2 != null && tZ.f((Mda)b2) > 0) {
                b2.J().E = vRa.d;
                return b2.J();
            }
            n3 = ++n2;
        }
        return null;
    }

    private XAa_1() {
        XAa_1 a2;
    }

    @Override
    public int J() {
        return uqa.g;
    }

    public /* synthetic */ XAa_1(Tca tca2) {
        XAa_1 b2 = tca2;
        XAa_1 a2 = this;
        a2();
    }
}

