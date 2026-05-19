/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xc
 *  ld
 */
import java.io.IOException;

public final class sBa
implements KC<Xc> {
    private ld I;

    public ld J() {
        sBa a2;
        return a2.I;
    }

    public sBa(ld ld2) {
        sBa b2 = ld2;
        sBa a2 = this;
        a2.I = b2;
    }

    @Override
    public void J(Xc xc) {
        sBa b2 = xc;
        sBa a2 = this;
        b2.J(a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        sBa a2 = this;
        b2.writeChatComponent(a2.I);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        sBa a2 = this;
        a2.I = b2.readChatComponent();
    }

    public sBa() {
        sBa a2;
    }
}

