/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RBa
 *  fA
 *  fba
 *  vL
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RBa_3
implements KC<fA> {
    private fba J;
    private int A;
    private int I;

    public int J() {
        RBa_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public RBa_3(vL vL2, fba fba2, int n2) {
        void b2;
        void c2;
        RBa_3 a2;
        int d2 = n2;
        RBa_3 rBa_3 = a2 = this;
        Ax.J();
        a2.A = c2.M();
        rBa_3.J = b2;
        rBa_3.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public RBa_3(vL vL2, fba fba2) {
        void b2;
        RBa_3 c2 = fba2;
        RBa_3 a2 = this;
        a2((vL)b2, (fba)c2, uSa.E);
    }

    @Override
    public void f(Lca lca2) throws IOException {
        Lca b2 = lca2;
        RBa_3 a2 = this;
        Object object = b2;
        RBa_3 rBa_3 = a2;
        b2.writeVarIntToBuffer(rBa_3.A);
        ((Lca)object).writeEnumValue((Enum<?>)rBa_3.J);
        ((Lca)object).writeVarIntToBuffer(a2.I);
    }

    @Override
    public void J(fA fA2) {
        RBa_3 b2 = fA2;
        RBa_3 a2 = this;
        b2.J((RBa)a2);
    }

    public RBa_3() {
        RBa_3 a2;
        Ax.J();
    }

    public fba J() {
        RBa_3 a2;
        return a2.J;
    }

    @Override
    public void J(Lca lca2) throws IOException {
        RBa_3 a2;
        Lca b2 = lca2;
        RBa_3 rBa_3 = a2 = this;
        rBa_3.A = b2.readVarIntFromBuffer();
        rBa_3.J = b2.readEnumValue(fba.class);
        a2.I = b2.readVarIntFromBuffer();
    }
}

