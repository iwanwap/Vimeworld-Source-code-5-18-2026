/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  Waa
 *  ZAa
 *  vL
 */
import java.io.IOException;

public final class ZAa_1
implements KC<Pd> {
    private Waa A;
    private int I;

    public vL J(Gg gg2) {
        ZAa_1 b2 = gg2;
        ZAa_1 a2 = this;
        return b2.J(a2.I);
    }

    public ZAa_1() {
        ZAa_1 a2;
    }

    public Waa J() {
        ZAa_1 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        ZAa_1 b2 = pd2;
        ZAa_1 a2 = this;
        b2.J((ZAa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public ZAa_1(int n2, Waa waa2) {
        void b2;
        ZAa_1 a2;
        ZAa_1 c2 = waa2;
        ZAa_1 zAa_1 = a2 = this;
        zAa_1.I = b2;
        zAa_1.A = c2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        ZAa_1 a2;
        Lca b2 = lca;
        ZAa_1 zAa_1 = a2 = this;
        zAa_1.I = b2.readVarIntFromBuffer();
        zAa_1.A = b2.readNBTTagCompoundFromBuffer();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        ZAa_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.I);
        ((Lca)object).writeNBTTagCompoundToBuffer(a2.A);
    }
}

