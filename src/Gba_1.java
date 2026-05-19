/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gba
 *  Mda
 *  fA
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gba_1
implements KC<fA> {
    private Mda A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Gba_1(int n2, Mda mda2) {
        void b2;
        Gba_1 a2;
        Gba_1 c2 = mda2;
        Gba_1 gba_1 = a2 = this;
        gba_1.I = b2;
        gba_1.A = c2 != null ? c2.J() : null;
    }

    public Mda J() {
        Gba_1 a2;
        return a2.A;
    }

    @Override
    public void J(fA fA2) {
        Gba_1 b2 = fA2;
        Gba_1 a2 = this;
        b2.J((Gba)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Gba_1 a2;
        Lca b2 = lca;
        Gba_1 gba_1 = a2 = this;
        gba_1.I = b2.readShort();
        gba_1.A = b2.readItemStackFromBuffer();
    }

    public int J() {
        Gba_1 a2;
        return a2.I;
    }

    public Gba_1() {
        Gba_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Gba_1 a2 = this;
        b2.writeShort(a2.I);
        b2.writeItemStackToBuffer(a2.A);
    }
}

