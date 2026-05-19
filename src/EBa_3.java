/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EBa
 *  Pd
 *  vL
 */
import java.io.IOException;

public final class EBa_3
implements KC<Pd> {
    private int A;
    private int I;

    public int f() {
        EBa_3 a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        EBa_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeByte(a2.I);
    }

    public int J() {
        EBa_3 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        EBa_3 b2 = pd2;
        EBa_3 a2 = this;
        b2.J((EBa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public EBa_3(vL vL2, int n2) {
        void b2;
        EBa_3 a2;
        int c2 = n2;
        EBa_3 eBa_3 = a2 = this;
        eBa_3.A = b2.M();
        eBa_3.I = c2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        EBa_3 a2;
        Lca b2 = lca;
        EBa_3 eBa_3 = a2 = this;
        eBa_3.A = b2.readVarIntFromBuffer();
        eBa_3.I = b2.readUnsignedByte();
    }

    public EBa_3() {
        EBa_3 a2;
    }
}

