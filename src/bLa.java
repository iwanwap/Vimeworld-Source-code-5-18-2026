/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bLa {
    private final int j;
    private final XF J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public bLa(int n2, XF xF2) {
        void b2;
        bLa a2;
        Object c2 = xF2;
        bLa bLa2 = a2 = this;
        bLa2.j = b2;
        bLa2.J = c2;
    }

    public void f(int n2) {
        int b2 = n2;
        bLa a2 = this;
        if (b2 > NTa.C) {
            b2 = NTa.C;
        }
        a2.I = b2;
    }

    public int f() {
        bLa a2;
        return a2.I;
    }

    public int J() {
        bLa a2;
        return a2.A;
    }

    public void J(int n2) {
        int b2 = n2;
        bLa a2 = this;
        a2.A = b2;
    }

    public XF J() {
        bLa a2;
        return a2.J;
    }
}

