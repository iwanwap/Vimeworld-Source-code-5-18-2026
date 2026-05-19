/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  vaa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vaa_3
implements KC<Pd> {
    private int J;
    private int A;
    private float I;

    public vaa_3() {
        vaa_3 a2;
    }

    public float J() {
        vaa_3 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        vaa_3 b2 = pd2;
        vaa_3 a2 = this;
        b2.J((vaa)a2);
    }

    public int f() {
        vaa_3 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public vaa_3(float f2, int n2, int n3) {
        void b2;
        void c2;
        vaa_3 a2;
        int d2 = n3;
        vaa_3 vaa_32 = a2 = this;
        a2.I = c2;
        vaa_32.J = b2;
        vaa_32.A = d2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        vaa_3 a2 = this;
        b2.writeFloat(a2.I);
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A);
        ((Lca)object).writeVarIntToBuffer(a2.J);
    }

    @Override
    public void J(Lca lca) throws IOException {
        vaa_3 a2;
        Lca b2 = lca;
        vaa_3 vaa_32 = a2 = this;
        Object object = b2;
        a2.I = ((Lca)object).readFloat();
        vaa_32.A = ((Lca)object).readVarIntFromBuffer();
        vaa_32.J = b2.readVarIntFromBuffer();
    }

    public int J() {
        vaa_3 a2;
        return a2.J;
    }
}

