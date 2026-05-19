/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Pd
 *  tba
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tba_1
implements KC<Pd> {
    private int J;
    private int A;
    private Mda I;

    @Override
    public void J(Lca lca) throws IOException {
        tba_1 a2;
        Lca b2 = lca;
        tba_1 tba_12 = a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readByte();
        tba_12.J = ((Lca)object).readShort();
        tba_12.I = b2.readItemStackFromBuffer();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        tba_1 a2 = this;
        b2.writeByte(a2.A);
        b2.writeShort(a2.J);
        b2.writeItemStackToBuffer(a2.I);
    }

    public int f() {
        tba_1 a2;
        return a2.A;
    }

    public Mda J() {
        tba_1 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        tba_1 b2 = pd2;
        tba_1 a2 = this;
        b2.J((tba)a2);
    }

    public tba_1() {
        tba_1 a2;
    }

    public int J() {
        tba_1 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public tba_1(int n2, int n3, Mda mda2) {
        void b2;
        void c2;
        tba_1 a2;
        tba_1 d2 = mda2;
        tba_1 tba_12 = a2 = this;
        a2.A = c2;
        tba_12.J = b2;
        tba_12.I = d2 == null ? null : d2.J();
    }
}

