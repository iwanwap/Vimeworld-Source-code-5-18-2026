/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xc
 */
import java.io.IOException;

public final class iBa
implements KC<Xc> {
    private int I;

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        iBa a2 = this;
        a2.I = b2.readVarIntFromBuffer();
    }

    public int J() {
        iBa a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        iBa a2 = this;
        b2.writeVarIntToBuffer(a2.I);
    }

    @Override
    public void J(Xc xc) {
        iBa b2 = xc;
        iBa a2 = this;
        b2.J(a2);
    }

    public iBa(int n2) {
        int b2 = n2;
        iBa a2 = this;
        a2.I = b2;
    }

    public iBa() {
        iBa a2;
    }
}

