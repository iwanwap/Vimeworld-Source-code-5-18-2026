/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xc
 */
import java.io.IOException;
import java.security.PublicKey;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jCa
implements KC<Xc> {
    private String J;
    private PublicKey A;
    private byte[] I;

    public byte[] J() {
        jCa a2;
        return a2.I;
    }

    public PublicKey J() {
        jCa a2;
        return a2.A;
    }

    public String J() {
        jCa a2;
        return a2.J;
    }

    @Override
    public void J(Xc xc) {
        jCa b2 = xc;
        jCa a2 = this;
        b2.J(a2);
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        jCa a2 = this;
        b2.writeString(a2.J);
        Object object = b2;
        ((Lca)object).writeByteArray(a2.A.getEncoded());
        ((Lca)object).writeByteArray(a2.I);
    }

    @Override
    public void J(Lca lca) throws IOException {
        jCa a2;
        Lca b2 = lca;
        jCa jCa2 = a2 = this;
        Object object = b2;
        a2.J = ((Lca)object).readStringFromBuffer(kTa.j);
        jCa2.A = az.J(((Lca)object).readByteArray());
        jCa2.I = b2.readByteArray();
    }

    public jCa() {
        jCa a2;
    }

    /*
     * WARNING - void declaration
     */
    public jCa(String string, PublicKey publicKey, byte[] byArray) {
        void b2;
        void c2;
        jCa a2;
        Object d2 = byArray;
        jCa jCa2 = a2 = this;
        a2.J = c2;
        jCa2.A = b2;
        jCa2.I = (byte[])d2;
    }
}

