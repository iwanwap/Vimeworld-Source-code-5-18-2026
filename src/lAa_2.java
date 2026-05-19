/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  lAa
 *  ld
 */
import java.io.IOException;

public final class lAa_2
implements KC<Pd> {
    private ld A;
    private ld I;

    @Override
    public void J(Lca lca) throws IOException {
        lAa_2 a2;
        Lca b2 = lca;
        lAa_2 lAa_22 = a2 = this;
        lAa_22.A = b2.readChatComponent();
        lAa_22.I = b2.readChatComponent();
    }

    public ld f() {
        lAa_2 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        lAa_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeChatComponent(a2.A);
        ((Lca)object).writeChatComponent(a2.I);
    }

    public lAa_2(ld ld2) {
        lAa_2 b2 = ld2;
        lAa_2 a2 = this;
        a2.A = b2;
    }

    public ld J() {
        lAa_2 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        lAa_2 b2 = pd2;
        lAa_2 a2 = this;
        b2.J((lAa)a2);
    }

    public lAa_2() {
        lAa_2 a2;
    }
}

