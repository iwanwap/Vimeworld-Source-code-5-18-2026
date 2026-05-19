/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FBa
 *  Pd
 *  bRa
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FBa_3
implements KC<Pd> {
    private int J;
    public static final String[] A;
    private float I;

    static {
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = bRa.v;
        A = stringArray;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        FBa_3 a2 = this;
        b2.writeByte(a2.J);
        b2.writeFloat(a2.I);
    }

    @Override
    public void J(Lca lca) throws IOException {
        FBa_3 a2;
        Lca b2 = lca;
        FBa_3 fBa_3 = a2 = this;
        fBa_3.J = b2.readUnsignedByte();
        fBa_3.I = b2.readFloat();
    }

    public int J() {
        FBa_3 a2;
        return a2.J;
    }

    public FBa_3() {
        FBa_3 a2;
    }

    @Override
    public void J(Pd pd2) {
        FBa_3 b2 = pd2;
        FBa_3 a2 = this;
        b2.J((FBa)a2);
    }

    /*
     * WARNING - void declaration
     */
    public FBa_3(int n2, float f2) {
        void b2;
        FBa_3 a2;
        float c2 = f2;
        FBa_3 fBa_3 = a2 = this;
        fBa_3.J = b2;
        fBa_3.I = c2;
    }

    public float J() {
        FBa_3 a2;
        return a2.I;
    }
}

