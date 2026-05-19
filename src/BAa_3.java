/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BAa
 *  Pd
 */
import java.io.IOException;

public final class BAa_3
implements KC<Pd> {
    private XF I;

    @Override
    public void J(Pd pd2) {
        BAa_3 b2 = pd2;
        BAa_3 a2 = this;
        b2.J((BAa)a2);
    }

    public BAa_3() {
        BAa_3 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        BAa_3 a2 = this;
        a2.I = b2.readBlockPos();
    }

    public XF J() {
        BAa_3 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        BAa_3 a2 = this;
        b2.writeBlockPos(a2.I);
    }

    public BAa_3(XF xF2) {
        Object b2 = xF2;
        BAa_3 a2 = this;
        a2.I = b2;
    }
}

