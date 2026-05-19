/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  yba
 */
import java.io.IOException;

public final class yba_3
implements KC<Pd> {
    private int A;
    private int I;

    @Override
    public void f(Lca lca2) throws IOException {
        Lca b2 = lca2;
        yba_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeVarIntToBuffer(a2.I);
    }

    public yba_3() {
        yba_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public yba_3(int n2, int n3) {
        void b2;
        yba_3 a2;
        int c2 = n3;
        yba_3 yba_32 = a2 = this;
        yba_32.A = b2;
        yba_32.I = c2;
    }

    public int f() {
        yba_3 a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        yba_3 a2;
        Lca b2 = lca2;
        yba_3 yba_32 = a2 = this;
        yba_32.A = b2.readVarIntFromBuffer();
        yba_32.I = b2.readVarIntFromBuffer();
    }

    public int J() {
        yba_3 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        yba_3 b2 = pd2;
        yba_3 a2 = this;
        b2.J((yba)a2);
    }
}

