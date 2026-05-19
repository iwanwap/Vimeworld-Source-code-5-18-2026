/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CAa
 *  JPa
 *  Mda
 *  Yra
 *  fA
 *  pua
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CAa_3
implements KC<fA> {
    private float i;
    private int M;
    private float k;
    private float j;
    private XF J;
    private static final XF A = new XF(pua.o, pua.o, pua.o);
    private Mda I;

    public XF J() {
        CAa_3 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca2) throws IOException {
        Lca b2 = lca2;
        CAa_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeBlockPos(a2.J);
        ((Lca)object).writeByte(a2.M);
        Object object2 = b2;
        ((Lca)object2).writeItemStackToBuffer(a2.I);
        ((Lca)object2).writeByte((int)(a2.i * Yra.i));
        b2.writeByte((int)(a2.j * Yra.i));
        b2.writeByte((int)(a2.k * Yra.i));
    }

    public CAa_3() {
        CAa_3 a2;
        Ax.J();
    }

    public Mda J() {
        CAa_3 a2;
        return a2.I;
    }

    public float l() {
        CAa_3 a2;
        return a2.j;
    }

    public int J() {
        CAa_3 a2;
        return a2.M;
    }

    public float f() {
        CAa_3 a2;
        return a2.k;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        CAa_3 a2;
        Lca b2 = lca2;
        CAa_3 cAa_3 = a2 = this;
        Object object = b2;
        CAa_3 cAa_32 = a2;
        Object object2 = b2;
        a2.J = ((Lca)object2).readBlockPos();
        cAa_32.M = ((Lca)object2).readUnsignedByte();
        cAa_32.I = b2.readItemStackFromBuffer();
        a2.i = (float)((Lca)object).readUnsignedByte() / Yra.i;
        cAa_3.j = (float)((Lca)object).readUnsignedByte() / Yra.i;
        cAa_3.k = (float)b2.readUnsignedByte() / Yra.i;
    }

    /*
     * WARNING - void declaration
     */
    public CAa_3(XF xF2, int n2, Mda mda2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void e2;
        void f5;
        CAa_3 d2;
        CAa_3 g2 = mda2;
        CAa_3 cAa_3 = d2 = this;
        Ax.J();
        d2.J = f5;
        cAa_3.M = e2;
        cAa_3.I = g2 != null ? g2.J() : null;
        CAa_3 cAa_32 = d2;
        d2.i = c2;
        cAa_32.j = b2;
        cAa_32.k = a2;
    }

    public float J() {
        CAa_3 a2;
        return a2.i;
    }

    public CAa_3(Mda mda2) {
        CAa_3 b2 = mda2;
        CAa_3 a2 = this;
        a2(A, osa.Ja, (Mda)b2, JPa.N, JPa.N, JPa.N);
    }

    @Override
    public void J(fA fA2) {
        CAa_3 b2 = fA2;
        CAa_3 a2 = this;
        b2.J((CAa)a2);
    }
}

