/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  dCa
 */
import java.io.IOException;

public final class dCa_3
implements KC<Pd> {
    private int I;

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        dCa_3 a2 = this;
        a2.I = b2.readVarIntFromBuffer();
    }

    @Override
    public void J(Pd pd2) {
        dCa_3 b2 = pd2;
        dCa_3 a2 = this;
        b2.J((dCa)a2);
    }

    public dCa_3() {
        dCa_3 a2;
    }

    public int J() {
        dCa_3 a2;
        return a2.I;
    }

    public dCa_3(int n2) {
        int b2 = n2;
        dCa_3 a2 = this;
        a2.I = b2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        dCa_3 a2 = this;
        b2.writeVarIntToBuffer(a2.I);
    }
}

