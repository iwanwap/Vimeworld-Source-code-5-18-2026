/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  iCa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iCa_3
implements KC<Pd> {
    private int J;
    private float A;
    private float I;

    @Override
    public void J(Lca lca) throws IOException {
        iCa_3 a2;
        Lca b2 = lca;
        iCa_3 iCa_32 = a2 = this;
        Object object = b2;
        a2.I = ((Lca)object).readFloat();
        iCa_32.J = ((Lca)object).readVarIntFromBuffer();
        iCa_32.A = b2.readFloat();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        iCa_3 a2 = this;
        b2.writeFloat(a2.I);
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.J);
        ((Lca)object).writeFloat(a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public iCa_3(float f2, int n2, float f3) {
        void b2;
        void c2;
        iCa_3 a2;
        float d2 = f3;
        iCa_3 iCa_32 = a2 = this;
        a2.I = c2;
        iCa_32.J = b2;
        iCa_32.A = d2;
    }

    public float f() {
        iCa_3 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        iCa_3 b2 = pd2;
        iCa_3 a2 = this;
        b2.J((iCa)a2);
    }

    public iCa_3() {
        iCa_3 a2;
    }

    public int J() {
        iCa_3 a2;
        return a2.J;
    }

    public float J() {
        iCa_3 a2;
        return a2.A;
    }
}

