/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  jca
 *  kba
 */
import java.io.IOException;

public final class jca_1
implements KC<Pd> {
    private int A;
    private int I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        jca_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeByte(a2.I);
    }

    @Override
    public void J(Pd pd2) {
        jca_1 b2 = pd2;
        jca_1 a2 = this;
        b2.J((jca)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        jca_1 a2;
        Lca b2 = lca;
        jca_1 jca_12 = a2 = this;
        jca_12.A = b2.readVarIntFromBuffer();
        jca_12.I = b2.readUnsignedByte();
    }

    public jca_1() {
        jca_1 a2;
    }

    public int f() {
        jca_1 a2;
        return a2.I;
    }

    public int J() {
        jca_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public jca_1(int n2, kba kba2) {
        void b2;
        jca_1 a2;
        jca_1 c2 = kba2;
        jca_1 jca_12 = a2 = this;
        jca_12.A = b2;
        jca_12.I = c2.f();
    }
}

