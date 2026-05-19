/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zCa_3
implements UB {
    @Override
    public Mda J() {
        return null;
    }

    @Override
    public int J() {
        return WOa.fa;
    }

    public zCa_3() {
        zCa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        zCa_3 zCa_32 = this;
        int a2 = uSa.E;
        zCa_3 zCa_33 = null;
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            zCa_3 c2 = b2.J(n2);
            if (c2 != null) {
                if (c2.J() == Gea.wa) {
                    if (zCa_33 != null) {
                        return uSa.E != 0;
                    }
                    zCa_33 = c2;
                } else {
                    if (c2.J() != Gea.CC) {
                        return uSa.E != 0;
                    }
                    ++a2;
                }
            }
            n3 = ++n2;
        }
        if (zCa_33 != null && a2 > 0) {
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
        zCa_3 zCa_32 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
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
        zCa_3 zCa_32 = this;
        int n3 = uSa.E;
        zCa_3 b2 = null;
        int n4 = n2 = uSa.E;
        while (n4 < a2.f()) {
            Mda mda2 = a2.J(n2);
            if (mda2 != null) {
                if (mda2.J() == Gea.wa) {
                    if (b2 != null) {
                        return null;
                    }
                    b2 = mda2;
                } else {
                    if (mda2.J() != Gea.CC) {
                        return null;
                    }
                    ++n3;
                }
            }
            n4 = ++n2;
        }
        if (b2 != null && n3 >= vRa.d) {
            Mda mda3 = new Mda((eAa)Gea.wa, n3 + vRa.d, b2.J());
            if (b2.l()) {
                mda3.J(b2.J());
            }
            return mda3;
        }
        return null;
    }
}

