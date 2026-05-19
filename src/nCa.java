/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 */
import java.io.IOException;

public final class nCa
implements KC<Pd> {
    private int I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        nCa a2 = this;
        b2.writeByte(a2.I);
    }

    public nCa(int n2) {
        int b2 = n2;
        nCa a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        nCa a2 = this;
        a2.I = b2.readUnsignedByte();
    }

    public nCa() {
        nCa a2;
    }

    @Override
    public void J(Pd pd2) {
        nCa b2 = pd2;
        nCa a2 = this;
        b2.J(a2);
    }
}

