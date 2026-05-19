/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kda
 *  Mda
 *  Pd
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kda_1
implements KC<Pd> {
    private int J;
    private Mda A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Kda_1(int n2, int n3, Mda mda2) {
        void b2;
        void c2;
        Kda_1 a2;
        Kda_1 d2 = mda2;
        Kda_1 kda_1 = a2 = this;
        a2.I = c2;
        kda_1.J = b2;
        kda_1.A = d2 == null ? null : d2.J();
    }

    @Override
    public void J(Pd pd2) {
        Kda_1 b2 = pd2;
        Kda_1 a2 = this;
        b2.J((Kda)a2);
    }

    public Kda_1() {
        Kda_1 a2;
    }

    public int f() {
        Kda_1 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Kda_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.I);
        ((Lca)object).writeShort(a2.J);
        b2.writeItemStackToBuffer(a2.A);
    }

    public int J() {
        Kda_1 a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Kda_1 a2;
        Lca b2 = lca;
        Kda_1 kda_1 = a2 = this;
        Object object = b2;
        a2.I = ((Lca)object).readVarIntFromBuffer();
        kda_1.J = ((Lca)object).readShort();
        kda_1.A = b2.readItemStackFromBuffer();
    }

    public Mda J() {
        Kda_1 a2;
        return a2.A;
    }
}

