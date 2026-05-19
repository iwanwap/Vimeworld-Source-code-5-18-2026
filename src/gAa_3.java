/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 *  gAa
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gAa_3
implements KC<fA> {
    private short J;
    private int A;
    private boolean I;

    @Override
    public void J(Lca lca) throws IOException {
        gAa_3 a2;
        Lca b2 = lca;
        gAa_3 gAa_32 = a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readByte();
        gAa_32.J = ((Lca)object).readShort();
        gAa_32.I = b2.readByte() != 0 ? vRa.d : uSa.E;
    }

    @Override
    public void J(fA fA2) {
        gAa_3 b2 = fA2;
        gAa_3 a2 = this;
        b2.J((gAa)a2);
    }

    public gAa_3() {
        gAa_3 a2;
    }

    public short J() {
        gAa_3 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public gAa_3(int n2, short s2, boolean bl2) {
        void b2;
        void c2;
        gAa_3 a2;
        boolean d2 = bl2;
        gAa_3 gAa_32 = a2 = this;
        a2.A = c2;
        gAa_32.J = b2;
        gAa_32.I = d2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        gAa_3 a2;
        Lca b2 = lca;
        gAa_3 gAa_32 = a2 = this;
        Object object = b2;
        b2.writeByte(gAa_32.A);
        ((Lca)object).writeShort(a2.J);
        ((Lca)object).writeByte(gAa_32.I ? vRa.d : uSa.E);
    }

    public int J() {
        gAa_3 a2;
        return a2.A;
    }
}

