/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 *  nca
 */
import java.io.IOException;

public final class nca_3
implements KC<fA> {
    private int I;

    @Override
    public void J(fA fA2) {
        nca_3 b2 = fA2;
        nca_3 a2 = this;
        b2.J((nca)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        nca_3 a2 = this;
        a2.I = b2.readByte();
    }

    public nca_3() {
        nca_3 a2;
    }

    public nca_3(int n2) {
        int b2 = n2;
        nca_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        nca_3 a2 = this;
        b2.writeByte(a2.I);
    }
}

