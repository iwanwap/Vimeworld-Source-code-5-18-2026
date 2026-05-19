/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  UZ
 *  dda
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dda_1
implements KC<Pd> {
    private boolean L;
    private float E;
    private float m;
    private float C;
    private int i;
    private float M;
    private float k;
    private float j;
    private float J;
    private UZ A;
    private int[] I;

    public boolean J() {
        dda_1 a2;
        return a2.L;
    }

    public double l() {
        dda_1 a2;
        return a2.E;
    }

    public float C() {
        dda_1 a2;
        return a2.j;
    }

    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        Lca b2 = lca;
        dda_1 a2 = this;
        a2.A = UZ.getParticleFromId((int)b2.readInt());
        if (a2.A == null) {
            a2.A = UZ.BARRIER;
        }
        dda_1 dda_12 = a2;
        Object object = b2;
        dda_1 dda_13 = a2;
        Object object2 = b2;
        dda_1 dda_14 = a2;
        Object object3 = b2;
        a2.L = ((Lca)object3).readBoolean();
        dda_14.E = ((Lca)object3).readFloat();
        dda_14.M = b2.readFloat();
        a2.m = ((Lca)object2).readFloat();
        dda_13.k = ((Lca)object2).readFloat();
        dda_13.J = b2.readFloat();
        a2.j = ((Lca)object).readFloat();
        a2.C = ((Lca)object).readFloat();
        dda_12.i = b2.readInt();
        int n3 = a2.A.getArgumentCount();
        dda_12.I = new int[n3];
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            a2.I[n2++] = b2.readVarIntFromBuffer();
            n4 = n2;
        }
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        dda_1 a2 = this;
        b2.writeInt(a2.A.getParticleID());
        b2.writeBoolean(a2.L);
        b2.writeFloat(a2.E);
        b2.writeFloat(a2.M);
        b2.writeFloat(a2.m);
        b2.writeFloat(a2.k);
        b2.writeFloat(a2.J);
        b2.writeFloat(a2.j);
        b2.writeFloat(a2.C);
        b2.writeInt(a2.i);
        int n2 = a2.A.getArgumentCount();
        int n3 = uSa.E;
        int n4 = n3;
        while (n4 < n2) {
            b2.writeVarIntToBuffer(a2.I[n3++]);
            n4 = n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public dda_1(UZ uZ, boolean bl, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int ... nArray) {
        Object l2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        void i2;
        void j2;
        void k2;
        dda_1 a2;
        dda_1 dda_12 = object;
        Object object = nArray;
        dda_1 dda_13 = a2 = dda_12;
        dda_1 dda_14 = a2;
        dda_1 dda_15 = a2;
        dda_1 dda_16 = a2;
        dda_1 dda_17 = a2;
        a2.A = k2;
        dda_17.L = j2;
        dda_17.E = i2;
        dda_16.M = h2;
        dda_16.m = g2;
        dda_15.k = f9;
        dda_15.J = e2;
        dda_14.j = d2;
        dda_14.C = c2;
        dda_13.i = b2;
        dda_13.I = (int[])l2;
    }

    public float l() {
        dda_1 a2;
        return a2.J;
    }

    public int[] J() {
        dda_1 a2;
        return a2.I;
    }

    public float f() {
        dda_1 a2;
        return a2.C;
    }

    public int J() {
        dda_1 a2;
        return a2.i;
    }

    @Override
    public void J(Pd pd2) {
        dda_1 b2 = pd2;
        dda_1 a2 = this;
        b2.J((dda)a2);
    }

    public UZ J() {
        dda_1 a2;
        return a2.A;
    }

    public double f() {
        dda_1 a2;
        return a2.M;
    }

    public dda_1() {
        dda_1 a2;
    }

    public double J() {
        dda_1 a2;
        return a2.m;
    }

    public float J() {
        dda_1 a2;
        return a2.k;
    }
}

