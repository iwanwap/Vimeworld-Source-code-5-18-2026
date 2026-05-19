/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Rba
 *  fA
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rba_2
implements KC<fA> {
    private Lca A;
    private String I;

    public String J() {
        Rba_2 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Rba_2 a2 = this;
        b2.writeString(a2.I);
        b2.writeBytes(a2.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        void a2;
        Rba_2 rba_2 = this;
        void v0 = a2;
        rba_2.I = v0.readStringFromBuffer(kTa.j);
        int b2 = v0.readableBytes();
        if (b2 >= 0 && b2 <= BQa.h) {
            Rba_2 rba_22 = rba_2;
            rba_22.A = new Lca(a2.readBytes(b2));
            return;
        }
        throw new IOException(EQa.n);
    }

    public Lca J() {
        Rba_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public Rba_2(String string, Lca lca) {
        void b2;
        Lca c2 = lca;
        Rba_2 a2 = this;
        a2.I = b2;
        a2.A = c2;
        if (((Lca)a2.A).writerIndex() > BQa.h) {
            throw new IllegalArgumentException(EQa.n);
        }
    }

    @Override
    public void J(fA fA2) {
        Rba_2 b2 = fA2;
        Rba_2 a2 = this;
        b2.J((Rba)a2);
    }

    public Rba_2() {
        Rba_2 a2;
    }
}

