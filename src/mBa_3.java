/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Pd
 *  mBa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mBa_3
implements KC<Pd> {
    private Daa j;
    private Fy J;
    private sZ A;
    private int I;

    public Fy J() {
        mBa_3 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public mBa_3(int n2, sZ sZ2, Fy fy2, Daa daa) {
        void b2;
        Object e2;
        void c2;
        void d2;
        mBa_3 a2;
        mBa_3 mBa_32 = object;
        Object object = daa;
        mBa_3 mBa_33 = a2 = mBa_32;
        mBa_3 mBa_34 = a2;
        mBa_34.I = d2;
        mBa_34.A = c2;
        mBa_33.j = e2;
        mBa_33.J = b2;
    }

    public sZ J() {
        mBa_3 a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        mBa_3 a2 = this;
        Object object = b2;
        a2.I = b2.readInt();
        a2.A = sZ.getDifficultyEnum(((Lca)object).readUnsignedByte());
        a2.j = Daa.getByID(((Lca)object).readUnsignedByte());
        a2.J = Fy.J(b2.readStringFromBuffer(ERa.C));
        if (a2.J == null) {
            a2.J = Fy.M;
        }
    }

    public int J() {
        mBa_3 a2;
        return a2.I;
    }

    public mBa_3() {
        mBa_3 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        mBa_3 a2 = this;
        b2.writeInt(a2.I);
        b2.writeByte(a2.A.getDifficultyId());
        b2.writeByte(a2.j.getID());
        b2.writeString(a2.J.J());
    }

    public Daa J() {
        mBa_3 a2;
        return a2.j;
    }

    @Override
    public void J(Pd pd2) {
        mBa_3 b2 = pd2;
        mBa_3 a2 = this;
        b2.J((mBa)a2);
    }
}

