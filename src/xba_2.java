/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JTa
 *  Pd
 *  Zta
 *  vL
 *  xba
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xba_2
implements KC<Pd> {
    private int j;
    private int J;
    private int A;
    private int I;

    public xba_2(vL vL2) {
        xba_2 b2 = vL2;
        xba_2 a2 = this;
        a2(b2.M(), ((vL)b2).i, ((vL)b2).Ea, ((vL)b2).f);
    }

    @Override
    public void J(Lca lca) throws IOException {
        xba_2 a2;
        Lca b2 = lca;
        xba_2 xba_22 = a2 = this;
        Object object = b2;
        a2.J = b2.readVarIntFromBuffer();
        a2.A = ((Lca)object).readShort();
        xba_22.j = ((Lca)object).readShort();
        xba_22.I = b2.readShort();
    }

    public double l() {
        xba_2 a2;
        return (double)a2.A / Zta.C;
    }

    public double f() {
        xba_2 a2;
        return (double)a2.j / Zta.C;
    }

    public double J() {
        xba_2 a2;
        return (double)a2.I / Zta.C;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        xba_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeShort(a2.A);
        b2.writeShort(a2.j);
        b2.writeShort(a2.I);
    }

    public int J() {
        xba_2 a2;
        return a2.J;
    }

    public xba_2(int n2, double d2, double d3, double d4) {
        double a2;
        double b2;
        double c2;
        int e2 = n2;
        xba_2 d5 = this;
        d5.J = e2;
        double d6 = JTa.Aa;
        if (c2 < -d6) {
            c2 = -d6;
        }
        if (b2 < -d6) {
            b2 = -d6;
        }
        if (a2 < -d6) {
            a2 = -d6;
        }
        if (c2 > d6) {
            c2 = d6;
        }
        if (b2 > d6) {
            b2 = d6;
        }
        if (a2 > d6) {
            a2 = d6;
        }
        xba_2 xba_22 = d5;
        xba_22.A = (int)(c2 * Zta.C);
        xba_22.j = (int)(b2 * Zta.C);
        d5.I = (int)(a2 * Zta.C);
    }

    @Override
    public void J(Pd pd2) {
        xba_2 b2 = pd2;
        xba_2 a2 = this;
        b2.J((xba)a2);
    }

    public xba_2() {
        xba_2 a2;
    }
}

