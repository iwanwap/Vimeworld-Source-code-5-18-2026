/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  pua
 *  vL
 */
import java.io.IOException;

public final class Bca
implements KC<Pd> {
    private int J;
    private int A;
    private int I;

    @Override
    public void J(Pd pd2) {
        Bca b2 = pd2;
        Bca a2 = this;
        b2.J(a2);
    }

    public Bca() {
        Bca a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Bca a2 = this;
        b2.writeInt(a2.A);
        b2.writeInt(a2.J);
        b2.writeByte(a2.I);
    }

    public int l() {
        Bca a2;
        return a2.I;
    }

    public int f() {
        Bca a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public Bca(int n2, vL vL2, vL vL3) {
        void b2;
        void c2;
        Bca a2;
        Bca d2 = vL3;
        Bca bca2 = a2 = this;
        a2.I = c2;
        bca2.A = b2.M();
        bca2.J = d2 != null ? d2.M() : pua.o;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Bca a2;
        Lca b2 = lca;
        Bca bca2 = a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readInt();
        bca2.J = ((Lca)object).readInt();
        bca2.I = b2.readUnsignedByte();
    }

    public int J() {
        Bca a2;
        return a2.A;
    }
}

