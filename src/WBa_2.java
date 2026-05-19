/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WBa
 *  fA
 */
import java.io.IOException;

public final class WBa_2
implements KC<fA> {
    private int I;

    public WBa_2(int n2) {
        int b2 = n2;
        WBa_2 a2 = this;
        a2.I = b2;
    }

    public int J() {
        WBa_2 a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        WBa_2 a2 = this;
        a2.I = b2.readShort();
    }

    public WBa_2() {
        WBa_2 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        WBa_2 a2 = this;
        b2.writeShort(a2.I);
    }

    @Override
    public void J(fA fA2) {
        WBa_2 b2 = fA2;
        WBa_2 a2 = this;
        b2.J((WBa)a2);
    }
}

