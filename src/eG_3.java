/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  g
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eG_3
implements g {
    private final int[] A;
    private final we I;

    public eG_3(we we2) {
        eG_3 a2;
        we b2 = we2;
        eG_3 eG_32 = a2 = this;
        eG_32.I = b2;
        eG_32.A = new int[b2.J() * b2.f()];
    }

    public int[] J(int n2) {
        int b2 = n2;
        eG_3 a2 = this;
        a2.I.l.get(b2).J(a2.A);
        return a2.A;
    }

    public int C() {
        eG_3 a2;
        return a2.I.f();
    }

    public int l() {
        eG_3 a2;
        return a2.I.l.size();
    }

    public int f() {
        eG_3 a2;
        return a2.I.J();
    }

    public int J() {
        eG_3 a2;
        return a2.I.i;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public int J(int n2) {
        int b2 = n2;
        eG_3 a2 = this;
        return a2.I.l.get(b2).J();
    }
}

