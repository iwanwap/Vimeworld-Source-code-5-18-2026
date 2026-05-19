/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GBa
 *  Pd
 */
import java.io.IOException;

public final class GBa_3
implements KC<Pd> {
    private int J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public GBa_3(int n2, int n3, int n4) {
        void b2;
        void c2;
        GBa_3 a2;
        int d2 = n4;
        GBa_3 gBa_3 = a2 = this;
        a2.J = c2;
        gBa_3.I = b2;
        gBa_3.A = d2;
    }

    public GBa_3() {
        GBa_3 a2;
    }

    public int l() {
        GBa_3 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca2) throws IOException {
        Lca b2 = lca2;
        GBa_3 a2 = this;
        b2.writeByte(a2.J);
        b2.writeShort(a2.I);
        b2.writeShort(a2.A);
    }

    public int f() {
        GBa_3 a2;
        return a2.J;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        GBa_3 a2;
        Lca b2 = lca2;
        GBa_3 gBa_3 = a2 = this;
        Object object = b2;
        a2.J = ((Lca)object).readUnsignedByte();
        gBa_3.I = ((Lca)object).readShort();
        gBa_3.A = b2.readShort();
    }

    @Override
    public void J(Pd pd2) {
        GBa_3 b2 = pd2;
        GBa_3 a2 = this;
        b2.J((GBa)a2);
    }

    public int J() {
        GBa_3 a2;
        return a2.A;
    }
}

