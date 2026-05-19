/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  RAa
 *  vL
 */
import java.io.IOException;

public final class RAa_3
implements KC<Pd> {
    private int A;
    private byte I;

    public vL J(Gg gg2) {
        RAa_3 b2 = gg2;
        RAa_3 a2 = this;
        return b2.J(a2.A);
    }

    public RAa_3() {
        RAa_3 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        RAa_3 a2;
        Lca b2 = lca;
        RAa_3 rAa_3 = a2 = this;
        rAa_3.A = b2.readVarIntFromBuffer();
        rAa_3.I = b2.readByte();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        RAa_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeByte(a2.I);
    }

    public byte J() {
        RAa_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public RAa_3(vL vL2, byte by2) {
        void b2;
        RAa_3 a2;
        byte c2 = by2;
        RAa_3 rAa_3 = a2 = this;
        rAa_3.A = b2.M();
        rAa_3.I = c2;
    }

    @Override
    public void J(Pd pd2) {
        RAa_3 b2 = pd2;
        RAa_3 a2 = this;
        b2.J((RAa)a2);
    }
}

