/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Pd
 *  ada
 *  ica
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ada_2
implements KC<Pd> {
    private String A;
    private int I;

    public ada_2() {
        ada_2 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        ada_2 a2;
        Lca b2 = lca;
        ada_2 ada_22 = a2 = this;
        ada_22.I = b2.readByte();
        ada_22.A = b2.readStringFromBuffer(ERa.C);
    }

    @Override
    public void J(Pd pd2) {
        ada_2 b2 = pd2;
        ada_2 a2 = this;
        b2.J((ada)a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        ada_2 a2 = this;
        b2.writeByte(a2.I);
        b2.writeString(a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public ada_2(int n2, ica ica2) {
        void b2;
        ada_2 c2 = ica2;
        ada_2 a2 = this;
        a2.I = b2;
        if (c2 == null) {
            a2.A = Mqa.y;
            return;
        }
        a2.A = c2.J();
    }

    public String J() {
        ada_2 a2;
        return a2.A;
    }

    public int J() {
        ada_2 a2;
        return a2.I;
    }
}

