/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cBa
 *  fA
 */
import java.io.IOException;

public final class cBa_1
implements KC<fA> {
    private int I;

    @Override
    public void J(fA fA2) {
        cBa_1 b2 = fA2;
        cBa_1 a2 = this;
        b2.J((cBa)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        cBa_1 a2 = this;
        a2.I = b2.readVarIntFromBuffer();
    }

    public int J() {
        cBa_1 a2;
        return a2.I;
    }

    public cBa_1() {
        cBa_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        cBa_1 a2 = this;
        b2.writeVarIntToBuffer(a2.I);
    }

    public cBa_1(int n2) {
        int b2 = n2;
        cBa_1 a2 = this;
        a2.I = b2;
    }
}

