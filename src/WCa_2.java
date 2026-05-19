/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  WCa
 */
import java.io.IOException;

public final class WCa_2
implements KC<Pd> {
    private int I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        WCa_2 a2 = this;
        b2.writeVarIntToBuffer(a2.I);
    }

    public WCa_2() {
        WCa_2 a2;
    }

    @Override
    public void J(Pd pd2) {
        WCa_2 b2 = pd2;
        WCa_2 a2 = this;
        b2.J((WCa)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        WCa_2 a2 = this;
        a2.I = b2.readVarIntFromBuffer();
    }

    public int J() {
        WCa_2 a2;
        return a2.I;
    }
}

