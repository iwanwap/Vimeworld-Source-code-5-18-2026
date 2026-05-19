/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  cRa
 *  dW
 *  vRa
 */
public final class zx {
    private int m;
    private int C;
    public final Sx i;
    private int M;
    private int k;
    public int j;
    public final /* synthetic */ dW J;
    private int A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public zx(dW dW2, Sx sx2) {
        void b2;
        zx a2;
        Object c2 = sx2;
        zx zx2 = a2 = this;
        a2.J = b2;
        a2.I = vRa.d;
        a2.k = uSa.E;
        a2.M = uSa.E;
        zx2.A = cRa.h;
        zx2.C = cRa.h;
        zx2.i = c2;
    }

    public KC J(Mda mda2) {
        zx b2 = mda2;
        zx a2 = this;
        if (a2.I) {
            a2.I = uSa.E;
            zx zx2 = a2;
            return new AAa(b2.J(), a2.J.C, a2.J.A.values(), a2.J.j, zx2.k, zx2.M, a2.A + vRa.d - a2.k, a2.C + vRa.d - a2.M);
        }
        int n2 = a2.m;
        a2.m = n2 + vRa.d;
        if (n2 % tTa.h == 0) {
            return new AAa(b2.J(), a2.J.C, a2.J.A.values(), a2.J.j, uSa.E, uSa.E, uSa.E, uSa.E);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        zx a2 = this;
        if (a2.I) {
            zx zx2 = a2;
            zx2.k = Math.min(zx2.k, (int)b2);
            zx2.M = Math.min(zx2.M, c2);
            zx2.A = Math.max(zx2.A, (int)b2);
            zx2.C = Math.max(zx2.C, c2);
            return;
        }
        zx zx3 = a2;
        zx zx4 = a2;
        zx4.I = vRa.d;
        zx4.k = b2;
        zx3.M = c2;
        zx3.A = b2;
        a2.C = c2;
    }
}

