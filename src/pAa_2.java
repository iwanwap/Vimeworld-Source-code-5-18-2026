/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  pAa
 *  vL
 */
import java.io.IOException;

public final class pAa_2
implements KC<Pd> {
    public int I;

    public pAa_2(vL vL2) {
        pAa_2 b2 = vL2;
        pAa_2 a2 = this;
        a2.I = b2.M();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        pAa_2 a2 = this;
        b2.writeVarIntToBuffer(a2.I);
    }

    public pAa_2() {
        pAa_2 a2;
    }

    public vL J(Gg gg2) {
        pAa_2 b2 = gg2;
        pAa_2 a2 = this;
        return b2.J(a2.I);
    }

    @Override
    public void J(Pd pd2) {
        pAa_2 b2 = pd2;
        pAa_2 a2 = this;
        b2.J((pAa)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        pAa_2 a2 = this;
        a2.I = b2.readVarIntFromBuffer();
    }
}

