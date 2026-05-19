/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  yAa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yAa_1
implements KC<Pd> {
    private boolean J;
    private int A;
    private short I;

    public yAa_1() {
        yAa_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        yAa_1 a2 = this;
        b2.writeByte(a2.A);
        b2.writeShort(a2.I);
        b2.writeBoolean(a2.J);
    }

    public short J() {
        yAa_1 a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        yAa_1 a2;
        Lca b2 = lca;
        yAa_1 yAa_12 = a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readUnsignedByte();
        yAa_12.I = ((Lca)object).readShort();
        yAa_12.J = b2.readBoolean();
    }

    public int J() {
        yAa_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public yAa_1(int n2, short s2, boolean bl) {
        void b2;
        void c2;
        yAa_1 a2;
        boolean d2 = bl;
        yAa_1 yAa_12 = a2 = this;
        a2.A = c2;
        yAa_12.I = b2;
        yAa_12.J = d2;
    }

    @Override
    public void J(Pd pd2) {
        yAa_1 b2 = pd2;
        yAa_1 a2 = this;
        b2.J((yAa)a2);
    }

    public boolean J() {
        yAa_1 a2;
        return a2.J;
    }
}

