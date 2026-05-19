/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  Mda
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lDa
extends sEa {
    public static boolean f(Mda a2) {
        if (a2 != null && a2.J() != null && a2.J() == Gea.Ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int J(Mda mda2) {
        lDa b2 = mda2;
        lDa a2 = this;
        if (lDa.f((Mda)b2)) {
            return vRa.d;
        }
        return super.J((Mda)b2);
    }

    /*
     * WARNING - void declaration
     */
    public lDa(HA hA2, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        lDa a2 = this;
        super((HA)d2, (int)c2, (int)b2, (int)e2);
    }

    @Override
    public boolean J(Mda mda2) {
        lDa b2 = mda2;
        lDa a2 = this;
        if (jX.J((Mda)b2) || lDa.f((Mda)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

