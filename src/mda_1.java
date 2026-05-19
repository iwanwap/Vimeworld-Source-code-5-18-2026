/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  mda
 */
import java.io.IOException;

public final class mda_1
implements KC<Pd> {
    private int I;

    public mda_1(int n2) {
        int b2 = n2;
        mda_1 a2 = this;
        a2.I = b2;
    }

    public mda_1() {
        mda_1 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        mda_1 a2 = this;
        a2.I = b2.readByte();
    }

    @Override
    public void J(Pd pd2) {
        mda_1 b2 = pd2;
        mda_1 a2 = this;
        b2.J((mda)a2);
    }

    public int J() {
        mda_1 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        mda_1 a2 = this;
        b2.writeByte(a2.I);
    }
}

