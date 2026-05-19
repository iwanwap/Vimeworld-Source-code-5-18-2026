/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gda
 *  fA
 *  mAa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mAa_1
implements KC<fA> {
    private DZ J;
    private XF A;
    private Gda I;

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        mAa_1 a2 = this;
        a2.I = b2.readEnumValue(Gda.class);
        mAa_1 mAa_12 = a2;
        mAa_12.A = b2.readBlockPos();
        mAa_12.J = DZ.getFront(b2.readUnsignedByte());
    }

    public XF J() {
        mAa_1 a2;
        return a2.A;
    }

    public DZ J() {
        mAa_1 a2;
        return a2.J;
    }

    public mAa_1() {
        mAa_1 a2;
        Ax.J();
    }

    @Override
    public void J(fA fA2) {
        mAa_1 b2 = fA2;
        mAa_1 a2 = this;
        b2.J((mAa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public mAa_1(Gda gda2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        mAa_1 a2;
        Object d2 = dZ2;
        mAa_1 mAa_12 = a2 = this;
        Ax.J();
        a2.I = c2;
        mAa_12.A = b2;
        mAa_12.J = d2;
    }

    public Gda J() {
        mAa_1 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        mAa_1 a2 = this;
        Object object = b2;
        mAa_1 mAa_12 = a2;
        b2.writeEnumValue((Enum<?>)mAa_12.I);
        ((Lca)object).writeBlockPos(mAa_12.A);
        ((Lca)object).writeByte(a2.J.getIndex());
    }
}

