/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Pd
 *  cca
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cca_2
implements KC<Pd> {
    private sZ C;
    private int i;
    private int M;
    private Daa k;
    private boolean j;
    private int J;
    private Fy A;
    private boolean I;

    @Override
    public void J(Pd pd2) {
        cca_2 b2 = pd2;
        cca_2 a2 = this;
        b2.J((cca)a2);
    }

    public int l() {
        cca_2 a2;
        return a2.i;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        cca_2 a2;
        Lca b2 = lca2;
        cca_2 cca_22 = a2 = this;
        cca_22.i = b2.readInt();
        int n2 = b2.readUnsignedByte();
        cca_22.I = (n2 & Yqa.i) == Yqa.i ? vRa.d : uSa.E;
        Object object = b2;
        cca_2 cca_23 = a2;
        cca_23.k = Daa.getByID(n2 &= Jra.Fa);
        cca_23.J = b2.readByte();
        a2.C = sZ.getDifficultyEnum(((Lca)object).readUnsignedByte());
        a2.M = ((Lca)object).readUnsignedByte();
        a2.A = Fy.J(b2.readStringFromBuffer(ERa.C));
        if (a2.A == null) {
            a2.A = Fy.M;
        }
        a2.j = b2.readBoolean();
    }

    public boolean f() {
        cca_2 a2;
        return a2.j;
    }

    public Fy J() {
        cca_2 a2;
        return a2.A;
    }

    public cca_2() {
        cca_2 a2;
    }

    public int f() {
        cca_2 a2;
        return a2.M;
    }

    @Override
    public void f(Lca lca2) throws IOException {
        cca_2 a2;
        Lca b2 = lca2;
        cca_2 cca_22 = a2 = this;
        b2.writeInt(a2.i);
        int n2 = cca_22.k.getID();
        if (cca_22.I) {
            n2 |= Yqa.i;
        }
        b2.writeByte(n2);
        b2.writeByte(a2.J);
        b2.writeByte(a2.C.getDifficultyId());
        b2.writeByte(a2.M);
        b2.writeString(a2.A.J());
        b2.writeBoolean(a2.j);
    }

    public boolean J() {
        cca_2 a2;
        return a2.I;
    }

    public int J() {
        cca_2 a2;
        return a2.J;
    }

    public sZ J() {
        cca_2 a2;
        return a2.C;
    }

    public Daa J() {
        cca_2 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public cca_2(int n2, Daa daa2, boolean bl2, int n3, sZ sZ2, int n4, Fy fy2, boolean bl3) {
        void i2;
        void b2;
        void f2;
        void c2;
        void g2;
        void d2;
        void e2;
        void h2;
        cca_2 a2;
        boolean bl4 = bl3;
        cca_2 cca_22 = a2 = this;
        cca_2 cca_23 = a2;
        cca_2 cca_24 = a2;
        cca_2 cca_25 = a2;
        cca_25.i = h2;
        cca_25.J = e2;
        cca_24.C = d2;
        cca_24.k = g2;
        cca_23.M = c2;
        cca_23.I = f2;
        cca_22.A = b2;
        cca_22.j = i2;
    }
}

