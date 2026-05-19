/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  vL
 */
import java.io.IOException;

public final class tAa
implements KC<Pd> {
    private int A;
    private byte I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        tAa a2 = this;
        b2.writeInt(a2.A);
        b2.writeByte(a2.I);
    }

    @Override
    public void J(Pd pd2) {
        tAa b2 = pd2;
        tAa a2 = this;
        b2.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public tAa(vL vL2, byte by2) {
        void b2;
        tAa a2;
        byte c2 = by2;
        tAa tAa2 = a2 = this;
        tAa2.A = b2.M();
        tAa2.I = c2;
    }

    public byte J() {
        tAa a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        tAa a2;
        Lca b2 = lca;
        tAa tAa2 = a2 = this;
        tAa2.A = b2.readInt();
        tAa2.I = b2.readByte();
    }

    public tAa() {
        tAa a2;
    }

    public vL J(Gg gg2) {
        tAa b2 = gg2;
        tAa a2 = this;
        return b2.J(a2.A);
    }
}

