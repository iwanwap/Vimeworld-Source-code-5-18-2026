/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tf
 *  fA
 *  hca
 *  vL
 */
import java.io.IOException;
import java.util.UUID;

public final class hca_3
implements KC<fA> {
    private UUID I;

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        hca_3 a2 = this;
        a2.I = b2.readUuid();
    }

    @Override
    public void J(fA fA2) {
        hca_3 b2 = fA2;
        hca_3 a2 = this;
        b2.J((hca)a2);
    }

    public hca_3() {
        hca_3 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        hca_3 a2 = this;
        b2.writeUuid(a2.I);
    }

    public vL J(Tf tf2) {
        hca_3 b2 = tf2;
        hca_3 a2 = this;
        return b2.J(a2.I);
    }

    public hca_3(UUID uUID) {
        UUID b2 = uUID;
        hca_3 a2 = this;
        a2.I = b2;
    }
}

