/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Pd
 *  cQa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cda
implements KC<Pd> {
    private Lca A;
    private String I;

    @Override
    public void J(Pd pd2) {
        Cda b2 = pd2;
        Cda a2 = this;
        b2.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        void a2;
        Cda cda = this;
        void v0 = a2;
        cda.I = v0.readStringFromBuffer(kTa.j);
        int b2 = v0.readableBytes();
        if (b2 >= 0 && b2 <= JPa.E) {
            Cda cda2 = cda;
            cda2.A = new Lca(a2.readBytes(b2));
            return;
        }
        throw new IOException(cQa.S);
    }

    /*
     * WARNING - void declaration
     */
    public Cda(String string, Lca lca) {
        void b2;
        Lca c2 = lca;
        Cda a2 = this;
        a2.I = b2;
        a2.A = c2;
        if (((Lca)a2.A).writerIndex() > JPa.E) {
            throw new IllegalArgumentException(cQa.S);
        }
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Cda a2 = this;
        b2.writeString(a2.I);
        b2.writeBytes(a2.A);
    }

    public Cda() {
        Cda a2;
    }

    public String J() {
        Cda a2;
        return a2.I;
    }

    public Lca J() {
        Cda a2;
        return a2.A;
    }
}

