/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Waa
 *  bqa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Eda_2
implements UB {
    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        Eda_2 eda_2 = this;
        int a2 = uSa.E;
        Eda_2 eda_22 = null;
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            Eda_2 c2 = b2.J(n2);
            if (c2 != null) {
                if (c2.J() == Gea.sb) {
                    if (eda_22 != null) {
                        return uSa.E != 0;
                    }
                    eda_22 = c2;
                } else {
                    if (c2.J() != Gea.MC) {
                        return uSa.E != 0;
                    }
                    ++a2;
                }
            }
            n3 = ++n2;
        }
        if (eda_22 != null && a2 > 0) {
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
        Eda_2 eda_2 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J() instanceof JDa) {
                mdaArray[b2] = mda2;
                return mdaArray;
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    public Eda_2() {
        Eda_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(xFa xFa2) {
        void a2;
        int n2;
        Eda_2 eda_2 = this;
        int n3 = uSa.E;
        Eda_2 b2 = null;
        int n4 = n2 = uSa.E;
        while (n4 < a2.f()) {
            Mda mda2 = a2.J(n2);
            if (mda2 != null) {
                if (mda2.J() == Gea.sb) {
                    if (b2 != null) {
                        return null;
                    }
                    b2 = mda2;
                } else {
                    if (mda2.J() != Gea.MC) {
                        return null;
                    }
                    ++n3;
                }
            }
            n4 = ++n2;
        }
        if (b2 != null && n3 >= vRa.d && JDa.f((Mda)b2) < uqa.g) {
            Mda mda3 = new Mda(Gea.sb, n3);
            mda3.J((Waa)b2.J().J());
            Eda_2 eda_22 = b2;
            mda3.J().J(bqa.b, JDa.f((Mda)eda_22) + vRa.d);
            if (eda_22.l()) {
                mda3.J(b2.J());
            }
            return mda3;
        }
        return null;
    }

    @Override
    public int J() {
        return WOa.fa;
    }

    @Override
    public Mda J() {
        return null;
    }
}

