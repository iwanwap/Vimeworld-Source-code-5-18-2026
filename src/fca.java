/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 */
import java.io.IOException;

public final class fca
implements KC<fA> {
    private int A;
    private int I;

    @Override
    public void J(Lca lca) throws IOException {
        fca a2;
        Lca b2 = lca;
        fca fca2 = a2 = this;
        fca2.I = b2.readByte();
        fca2.A = b2.readByte();
    }

    /*
     * WARNING - void declaration
     */
    public fca(int n2, int n3) {
        void b2;
        fca a2;
        int c2 = n3;
        fca fca2 = a2 = this;
        fca2.I = b2;
        fca2.A = c2;
    }

    public int f() {
        fca a2;
        return a2.A;
    }

    @Override
    public void J(fA fA2) {
        fca b2 = fA2;
        fca a2 = this;
        b2.J(a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        fca a2 = this;
        b2.writeByte(a2.I);
        b2.writeByte(a2.A);
    }

    public int J() {
        fca a2;
        return a2.I;
    }

    public fca() {
        fca a2;
    }
}

