/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  lba
 */
import java.io.IOException;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lba_1
implements KC<Pd> {
    private double M;
    private double k;
    private float j;
    private double J;
    private float A;
    private Set<WAa> I;

    /*
     * WARNING - void declaration
     */
    public lba_1(double d2, double d3, double d4, float f2, float f3, Set<WAa> set) {
        Set<WAa> g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        lba_1 a2;
        lba_1 lba_12 = set2;
        Set<WAa> set2 = set;
        lba_1 lba_13 = a2 = lba_12;
        lba_1 lba_14 = a2;
        lba_1 lba_15 = a2;
        lba_15.M = f4;
        lba_15.k = e2;
        lba_14.J = d5;
        lba_14.j = c2;
        lba_13.A = b2;
        lba_13.I = g2;
    }

    public Set<WAa> J() {
        lba_1 a2;
        return a2.I;
    }

    public lba_1() {
        lba_1 a2;
    }

    @Override
    public void J(Pd pd2) {
        lba_1 b2 = pd2;
        lba_1 a2 = this;
        b2.J((lba)a2);
    }

    public double l() {
        lba_1 a2;
        return a2.M;
    }

    public double f() {
        lba_1 a2;
        return a2.k;
    }

    public float f() {
        lba_1 a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        lba_1 a2 = this;
        b2.writeDouble(a2.M);
        b2.writeDouble(a2.k);
        b2.writeDouble(a2.J);
        b2.writeFloat(a2.j);
        b2.writeFloat(a2.A);
        b2.writeByte(WAa.func_180056_a(a2.I));
    }

    public float J() {
        lba_1 a2;
        return a2.j;
    }

    public double J() {
        lba_1 a2;
        return a2.J;
    }

    @Override
    public void J(Lca lca) throws IOException {
        lba_1 a2;
        Lca b2 = lca;
        lba_1 lba_12 = a2 = this;
        Object object = b2;
        lba_1 lba_13 = a2;
        Object object2 = b2;
        a2.M = ((Lca)object2).readDouble();
        lba_13.k = ((Lca)object2).readDouble();
        lba_13.J = b2.readDouble();
        a2.j = ((Lca)object).readFloat();
        lba_12.A = ((Lca)object).readFloat();
        lba_12.I = WAa.func_180053_a(b2.readUnsignedByte());
    }
}

