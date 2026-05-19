/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fba
 *  Pd
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fba_2
implements KC<Pd> {
    private int J;
    private XF A;
    private int I;

    @Override
    public void J(Lca lca) throws IOException {
        Fba_2 a2;
        Lca b2 = lca;
        Fba_2 fba_2 = a2 = this;
        Object object = b2;
        a2.J = ((Lca)object).readVarIntFromBuffer();
        fba_2.A = ((Lca)object).readBlockPos();
        fba_2.I = b2.readUnsignedByte();
    }

    @Override
    public void J(Pd pd2) {
        Fba_2 b2 = pd2;
        Fba_2 a2 = this;
        b2.J((Fba)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Fba_2(int n2, XF xF, int n3) {
        void b2;
        void c2;
        Fba_2 a2;
        int d2 = n3;
        Fba_2 fba_2 = a2 = this;
        a2.J = c2;
        fba_2.A = b2;
        fba_2.I = d2;
    }

    public int f() {
        Fba_2 a2;
        return a2.J;
    }

    public XF J() {
        Fba_2 a2;
        return a2.A;
    }

    public int J() {
        Fba_2 a2;
        return a2.I;
    }

    public Fba_2() {
        Fba_2 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Fba_2 a2 = this;
        Object object = b2;
        Fba_2 fba_2 = a2;
        b2.writeVarIntToBuffer(fba_2.J);
        ((Lca)object).writeBlockPos(fba_2.A);
        ((Lca)object).writeByte(a2.I);
    }
}

