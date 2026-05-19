/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kba
 *  kb
 */
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kba_1
implements KC<kb> {
    private byte[] A;
    private byte[] I;

    public byte[] J(PrivateKey privateKey) {
        PrivateKey b2 = privateKey;
        Kba_1 a2 = this;
        if (b2 == null) {
            return a2.A;
        }
        return az.f(b2, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public Kba_1(byte[] byArray, PublicKey publicKey, byte[] byArray2) {
        void b2;
        void c2;
        Kba_1 a2;
        Object d2 = byArray2;
        Kba_1 kba_1 = a2 = this;
        a2.I = new byte[uSa.E];
        a2.A = new byte[uSa.E];
        kba_1.I = c2;
        kba_1.A = az.J((Key)b2, (byte[])d2);
    }

    public Kba_1() {
        Kba_1 a2;
        a2.I = new byte[uSa.E];
        a2.A = new byte[uSa.E];
    }

    /*
     * WARNING - void declaration
     */
    public Kba_1(SecretKey secretKey, PublicKey publicKey, byte[] byArray) {
        void a2;
        void c2;
        Kba_1 b2;
        PublicKey d2 = publicKey;
        Kba_1 kba_1 = b2 = this;
        b2.I = new byte[uSa.E];
        b2.A = new byte[uSa.E];
        kba_1.I = az.J(d2, c2.getEncoded());
        kba_1.A = az.J(d2, (byte[])a2);
    }

    public SecretKey J(PrivateKey privateKey) {
        PrivateKey b2 = privateKey;
        Kba_1 a2 = this;
        return az.J(b2, a2.I);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Kba_1 a2;
        Lca b2 = lca;
        Kba_1 kba_1 = a2 = this;
        kba_1.I = b2.readByteArray();
        kba_1.A = b2.readByteArray();
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Kba_1 a2 = this;
        Object object = b2;
        ((Lca)object).writeByteArray(a2.I);
        ((Lca)object).writeByteArray(a2.A);
    }

    @Override
    public void J(kb kb2) {
        Kba_1 b2 = kb2;
        Kba_1 a2 = this;
        b2.J((Kba)a2);
    }
}

