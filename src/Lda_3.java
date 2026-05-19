/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lda
 *  fA
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lda_3
implements KC<fA> {
    private float j;
    private float J;
    private boolean A;
    private boolean I;

    @Override
    public void J(fA fA2) {
        Lda_3 b2 = fA2;
        Lda_3 a2 = this;
        b2.J((Lda)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Lda_3(float f2, float f3, boolean bl, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        Lda_3 a2;
        boolean bl3 = bl2;
        Lda_3 lda_3 = a2 = this;
        Lda_3 lda_32 = a2;
        lda_32.J = d2;
        lda_32.j = c2;
        lda_3.I = b2;
        lda_3.A = e2;
    }

    public Lda_3() {
        Lda_3 a2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lda_3 a2;
        Lca b22 = lca;
        Lda_3 lda_3 = a2 = this;
        Object object = b22;
        a2.J = ((Lca)object).readFloat();
        lda_3.j = ((Lca)object).readFloat();
        byte b22 = b22.readByte();
        lda_3.I = (b22 & vRa.d) > 0 ? vRa.d : uSa.E;
        a2.A = (b22 & uqa.g) > 0 ? vRa.d : uSa.E;
    }

    public boolean f() {
        Lda_3 a2;
        return a2.A;
    }

    public float f() {
        Lda_3 a2;
        return a2.J;
    }

    public float J() {
        Lda_3 a2;
        return a2.j;
    }

    public boolean J() {
        Lda_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        void a2;
        Lda_3 lda_3;
        Lda_3 lda_32 = lda_3 = this;
        a2.writeFloat(lda_3.J);
        a2.writeFloat(lda_32.j);
        int b2 = uSa.E;
        if (lda_32.I) {
            b2 = (byte)(b2 | vRa.d);
        }
        if (lda_3.A) {
            b2 = (byte)(b2 | uqa.g);
        }
        a2.writeByte(b2);
    }
}

