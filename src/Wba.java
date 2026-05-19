/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  td
 */
import java.io.IOException;

public final class Wba
implements KC<td> {
    private long I;

    public Wba(long a2) {
        Wba b2;
        b2.I = a2;
    }

    public Wba() {
        Wba a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Wba a2 = this;
        a2.I = b2.readLong();
    }

    @Override
    public void J(td td2) {
        Wba b2 = td2;
        Wba a2 = this;
        b2.J(a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Wba a2 = this;
        b2.writeLong(a2.I);
    }
}

