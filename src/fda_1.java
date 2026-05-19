/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  Waa
 *  fda
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fda_1
implements KC<Pd> {
    private XF J;
    private Waa A;
    private int I;

    public Waa J() {
        fda_1 a2;
        return a2.A;
    }

    public XF J() {
        fda_1 a2;
        return a2.J;
    }

    @Override
    public void J(Pd pd2) {
        fda_1 b2 = pd2;
        fda_1 a2 = this;
        b2.J((fda)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        fda_1 a2;
        Lca b2 = lca;
        fda_1 fda_12 = a2 = this;
        Object object = b2;
        a2.J = ((Lca)object).readBlockPos();
        fda_12.I = ((Lca)object).readUnsignedByte();
        fda_12.A = b2.readNBTTagCompoundFromBuffer();
    }

    public fda_1() {
        fda_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public fda_1(XF xF2, int n2, Waa waa2) {
        void b2;
        void c2;
        fda_1 a2;
        fda_1 d2 = waa2;
        fda_1 fda_12 = a2 = this;
        a2.J = c2;
        fda_12.I = b2;
        fda_12.A = d2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        fda_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeBlockPos(a2.J);
        ((Lca)object).writeByte((byte)a2.I);
        b2.writeNBTTagCompoundToBuffer(a2.A);
    }

    public int J() {
        fda_1 a2;
        return a2.I;
    }
}

