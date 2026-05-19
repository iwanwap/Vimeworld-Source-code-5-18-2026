/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  fA
 *  tBa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tBa_3
implements KC<fA> {
    private Mda M;
    private int k;
    private int j;
    private short J;
    private int A;
    private int I;

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        tBa_3 a2 = this;
        b2.writeByte(a2.k);
        b2.writeShort(a2.I);
        b2.writeByte(a2.j);
        b2.writeShort(a2.J);
        b2.writeByte(a2.A);
        b2.writeItemStackToBuffer(a2.M);
    }

    public int C() {
        tBa_3 a2;
        return a2.I;
    }

    public Mda J() {
        tBa_3 a2;
        return a2.M;
    }

    public short J() {
        tBa_3 a2;
        return a2.J;
    }

    public tBa_3() {
        tBa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public tBa_3(int n2, int n3, int n4, int n5, Mda mda2, short s2) {
        void c2;
        void a2;
        tBa_3 g2;
        void d2;
        void e2;
        void f2;
        tBa_3 b2;
        tBa_3 tBa_32 = tBa_33;
        tBa_3 tBa_33 = mda2;
        tBa_3 tBa_34 = b2 = tBa_32;
        tBa_3 tBa_35 = b2;
        tBa_35.k = f2;
        tBa_35.I = e2;
        tBa_34.j = d2;
        tBa_34.M = g2 != null ? g2.J() : null;
        tBa_3 tBa_36 = b2;
        tBa_36.J = a2;
        tBa_36.A = c2;
    }

    public int l() {
        tBa_3 a2;
        return a2.A;
    }

    public int f() {
        tBa_3 a2;
        return a2.j;
    }

    @Override
    public void J(Lca lca) throws IOException {
        tBa_3 a2;
        Lca b2 = lca;
        tBa_3 tBa_32 = a2 = this;
        Object object = b2;
        tBa_3 tBa_33 = a2;
        Object object2 = b2;
        a2.k = ((Lca)object2).readByte();
        tBa_33.I = ((Lca)object2).readShort();
        tBa_33.j = b2.readByte();
        a2.J = ((Lca)object).readShort();
        tBa_32.A = ((Lca)object).readByte();
        tBa_32.M = b2.readItemStackFromBuffer();
    }

    public int J() {
        tBa_3 a2;
        return a2.k;
    }

    @Override
    public void J(fA fA2) {
        tBa_3 b2 = fA2;
        tBa_3 a2 = this;
        b2.J((tBa)a2);
    }
}

