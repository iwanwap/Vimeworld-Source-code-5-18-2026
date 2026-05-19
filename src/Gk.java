/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gk
extends Gl {
    private final Mda[] A;
    public Mda I;

    public Gk(Gg gg2) {
        Gk b2 = gg2;
        Gk a2 = this;
        super((Gg)b2);
        Gk gk = a2;
        a2.I = new Mda(Gea.Ga);
        gk.A = new Mda[uSa.E];
    }

    public Mda f(int n2) {
        int b2 = n2;
        Gk a2 = this;
        return a2.A[b2];
    }

    public Mda J() {
        Gk a2;
        return a2.I;
    }

    public void f(int n2, Mda mda2) {
        Gk c2 = mda2;
        Gk a2 = this;
        a2.A[b] = c2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Gk a2 = this;
        return a2.A[b2];
    }

    public Mda[] J() {
        Gk a2;
        return a2.A;
    }
}

