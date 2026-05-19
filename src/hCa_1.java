/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Lqa
 *  Pd
 *  hCa
 *  vL
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hCa_1
implements KC<Pd> {
    public boolean C;
    public byte i;
    public byte M;
    public int k;
    public byte j;
    public byte J;
    public byte A;
    public boolean I;

    public hCa_1(int n2) {
        int b2 = n2;
        hCa_1 a2 = this;
        a2.k = b2;
    }

    public String toString() {
        hCa_1 a2;
        return new StringBuilder().insert(2 & 5, Lqa.T).append(super.toString()).toString();
    }

    @Override
    public void J(Pd pd2) {
        hCa_1 b2 = pd2;
        hCa_1 a2 = this;
        b2.J((hCa)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        hCa_1 a2 = this;
        a2.k = b2.readVarIntFromBuffer();
    }

    public byte d() {
        hCa_1 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        hCa_1 a2 = this;
        b2.writeVarIntToBuffer(a2.k);
    }

    public boolean f() {
        hCa_1 a2;
        return a2.C;
    }

    public byte C() {
        hCa_1 a2;
        return a2.A;
    }

    public byte l() {
        hCa_1 a2;
        return a2.j;
    }

    public byte f() {
        hCa_1 a2;
        return a2.i;
    }

    public vL J(Gg gg2) {
        hCa_1 b2 = gg2;
        hCa_1 a2 = this;
        return b2.J(a2.k);
    }

    public hCa_1() {
        hCa_1 a2;
    }

    public boolean J() {
        hCa_1 a2;
        return a2.I;
    }

    public byte J() {
        hCa_1 a2;
        return a2.M;
    }
}

