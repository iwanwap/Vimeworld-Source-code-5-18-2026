/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Pd
 */
import java.io.IOException;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zBa
implements KC<Pd> {
    private Mda[] A;
    private int I;

    public zBa() {
        zBa a2;
    }

    @Override
    public void J(Pd pd2) {
        zBa b2 = pd2;
        zBa a2 = this;
        b2.J(a2);
    }

    public int J() {
        zBa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public zBa(int n2, List<Mda> list) {
        void a2;
        zBa b2;
        int c2 = n2;
        zBa zBa2 = b2 = this;
        zBa2.I = c2;
        zBa2.A = new Mda[a2.size()];
        int n3 = c2 = uSa.E;
        while (n3 < b2.A.length) {
            Mda mda2 = (Mda)a2.get(c2);
            b2.A[c2] = mda2 == null ? null : mda2.J();
            n3 = ++c2;
        }
    }

    public Mda[] J() {
        zBa a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        zBa zBa2 = this;
        void v0 = a2;
        v0.writeByte(zBa2.I);
        v0.writeShort(zBa2.A.length);
        Mda[] mdaArray = zBa2.A;
        int n2 = mdaArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            Mda mda2 = mdaArray[b2];
            a2.writeItemStackToBuffer(mda2);
            n3 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        zBa zBa2;
        zBa zBa3 = zBa2 = this;
        zBa3.I = a2.readUnsignedByte();
        short s = a2.readShort();
        zBa3.A = new Mda[s];
        int n2 = b2 = uSa.E;
        while (n2 < s) {
            zBa2.A[b2++] = a2.readItemStackFromBuffer();
            n2 = b2;
        }
    }
}

