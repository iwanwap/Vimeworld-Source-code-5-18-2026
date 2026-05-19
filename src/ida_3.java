/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 *  ida
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ida_3
implements KC<fA> {
    public double C;
    public double i;
    public float M;
    public boolean k;
    public float j;
    public boolean J;
    public boolean A;
    public double I;

    public boolean l() {
        ida_3 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        ida_3 a2 = this;
        b2.writeByte(a2.J ? vRa.d : uSa.E);
    }

    public boolean f() {
        ida_3 a2;
        return a2.A;
    }

    public double l() {
        ida_3 a2;
        return a2.i;
    }

    public double f() {
        ida_3 a2;
        return a2.I;
    }

    public boolean J() {
        ida_3 a2;
        return a2.k;
    }

    public ida_3() {
        ida_3 a2;
        Ax.J();
    }

    public double J() {
        ida_3 a2;
        return a2.C;
    }

    public float f() {
        ida_3 a2;
        return a2.j;
    }

    public ida_3(boolean bl2) {
        boolean b2 = bl2;
        ida_3 a2 = this;
        Ax.J();
        a2.J = b2;
    }

    @Override
    public void J(fA fA2) {
        ida_3 b2 = fA2;
        ida_3 a2 = this;
        b2.J((ida)a2);
    }

    public float J() {
        ida_3 a2;
        return a2.M;
    }

    @Override
    public void J(boolean bl2) {
        boolean b2 = bl2;
        ida_3 a2 = this;
        a2.A = b2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        ida_3 a2 = this;
        a2.J = b2.readUnsignedByte() != 0 ? vRa.d : uSa.E;
    }
}

