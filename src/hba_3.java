/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  hba
 */
import java.io.IOException;
import java.util.List;

public final class hba_3
implements KC<Pd> {
    private int A;
    private List<TIa> I;

    @Override
    public void f(Lca lca2) throws IOException {
        hba_3 a2;
        Lca b2 = lca2;
        hba_3 hba_32 = a2 = this;
        b2.writeVarIntToBuffer(hba_32.A);
        hga.J(hba_32.I, b2);
    }

    /*
     * WARNING - void declaration
     */
    public hba_3(int n2, hga hga2, boolean bl2) {
        void a2;
        void c2;
        hga d2 = hga2;
        hba_3 b2 = this;
        b2.A = c2;
        if (a2 != false) {
            b2.I = d2.f();
            return;
        }
        b2.I = d2.J();
    }

    public int J() {
        hba_3 a2;
        return a2.A;
    }

    public List<TIa> J() {
        hba_3 a2;
        return a2.I;
    }

    public hba_3() {
        hba_3 a2;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        hba_3 a2;
        Lca b2 = lca2;
        hba_3 hba_32 = a2 = this;
        hba_32.A = b2.readVarIntFromBuffer();
        hba_32.I = hga.J(b2);
    }

    @Override
    public void J(Pd pd2) {
        hba_3 b2 = pd2;
        hba_3 a2 = this;
        b2.J((hba)a2);
    }
}

