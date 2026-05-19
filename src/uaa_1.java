/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kA
 *  uaa
 */
import java.io.IOException;

public final class uaa_1
implements KC<kA> {
    private long I;

    public uaa_1() {
        uaa_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        uaa_1 a2 = this;
        b2.writeLong(a2.I);
    }

    @Override
    public void J(kA kA2) {
        uaa_1 b2 = kA2;
        uaa_1 a2 = this;
        b2.J((uaa)a2);
    }

    public long J() {
        uaa_1 a2;
        return a2.I;
    }

    public uaa_1(long a2) {
        uaa_1 b2;
        b2.I = a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        uaa_1 a2 = this;
        a2.I = b2.readLong();
    }
}

