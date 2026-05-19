/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 */
import java.io.IOException;

public final class nba
implements KC<Pd> {
    private XF I;

    public XF J() {
        nba a2;
        return a2.I;
    }

    public nba(XF xF) {
        Object b2 = xF;
        nba a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Pd pd2) {
        nba b2 = pd2;
        nba a2 = this;
        b2.J(a2);
    }

    public nba() {
        nba a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        nba a2 = this;
        b2.writeBlockPos(a2.I);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        nba a2 = this;
        a2.I = b2.readBlockPos();
    }
}

