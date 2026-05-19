/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  ld
 */
import java.io.IOException;

public final class mba
implements KC<Pd> {
    private ld I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        mba a2 = this;
        b2.writeChatComponent(a2.I);
    }

    public mba(ld ld2) {
        mba b2 = ld2;
        mba a2 = this;
        a2.I = b2;
    }

    public ld J() {
        mba a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        mba a2 = this;
        a2.I = b2.readChatComponent();
    }

    public mba() {
        mba a2;
    }

    @Override
    public void J(Pd pd2) {
        mba b2 = pd2;
        mba a2 = this;
        b2.J(a2);
    }
}

