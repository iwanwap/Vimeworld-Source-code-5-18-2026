/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  LQa
 *  NTa
 *  Tpa
 *  Vua
 *  ZOa
 *  ZRa
 *  ura
 *  vRa
 */
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class az {
    private static final Logger I = LogManager.getLogger();

    public static PublicKey J(byte[] byArray) {
        byte[] byArray2 = byArray;
        try {
            Object a2 = new X509EncodedKeySpec(byArray2);
            return KeyFactory.getInstance(gsa.N).generatePublic((KeySpec)a2);
        }
        catch (NoSuchAlgorithmException a2) {
        }
        catch (InvalidKeySpecException a2) {
            // empty catch block
        }
        I.error(Vua.E);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static Cipher J(int n2, String string, Key key) {
        Object c22 = string;
        int b2 = n2;
        try {
            void a2;
            c22 = Cipher.getInstance((String)c22);
            ((Cipher)c22).init(b2, (Key)a2);
            return c22;
        }
        catch (InvalidKeyException c22) {
            c22.printStackTrace();
        }
        catch (NoSuchAlgorithmException c22) {
            c22.printStackTrace();
        }
        catch (NoSuchPaddingException c22) {
            c22.printStackTrace();
        }
        I.error(LQa.l);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] J(int n2, Key key, byte[] byArray) {
        Key c22 = key;
        int b2 = n2;
        try {
            void a2;
            return az.J(b2, c22.getAlgorithm(), c22).doFinal((byte[])a2);
        }
        catch (IllegalBlockSizeException c22) {
            c22.printStackTrace();
        }
        catch (BadPaddingException c22) {
            c22.printStackTrace();
        }
        I.error(FTa.o);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] J(String string, byte[] ... byArray) {
        String string2 = string;
        try {
            int n2;
            void a2;
            MessageDigest b2 = MessageDigest.getInstance(string2);
            int n3 = ((void)a2).length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                void var5_6 = a2[n2];
                b2.update((byte[])var5_6);
                n4 = ++n2;
            }
        }
        catch (NoSuchAlgorithmException b2) {
            b2.printStackTrace();
            return null;
        }
        return b2.digest();
    }

    public az() {
        az a2;
    }

    public static SecretKey J() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(NTa.S);
            keyGenerator.init(XOa.h, Wx.J());
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static byte[] f(Key key, byte[] byArray) {
        Object b2 = byArray;
        Key a2 = key;
        return az.J(uqa.g, a2, (byte[])b2);
    }

    public static byte[] J(Key key, byte[] byArray) {
        Object b2 = byArray;
        Key a2 = key;
        return az.J(vRa.d, a2, (byte[])b2);
    }

    public static SecretKey J(PrivateKey privateKey, byte[] byArray) {
        Object b2 = byArray;
        PrivateKey a2 = privateKey;
        return new SecretKeySpec(az.f(a2, (byte[])b2), NTa.S);
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] J(String string, PublicKey publicKey, SecretKey secretKey) {
        PublicKey c22 = publicKey;
        String b2 = string;
        try {
            void a2;
            byte[][] byArrayArray = new byte[yRa.d][];
            byArrayArray[uSa.E] = b2.getBytes(ZRa.A);
            byArrayArray[vRa.d] = a2.getEncoded();
            byArrayArray[uqa.g] = c22.getEncoded();
            return az.J(ZOa.ca, byArrayArray);
        }
        catch (UnsupportedEncodingException c22) {
            c22.printStackTrace();
            return null;
        }
    }

    public static KeyPair J() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(gsa.N);
            keyPairGenerator.initialize(ura.V);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            I.error(ZOa.t);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Cipher J(int n2, Key key) {
        int n3 = n2;
        try {
            void a2;
            Cipher b2 = Cipher.getInstance(Tpa.i);
            void v0 = a2;
            void v1 = a2;
            b2.init(n3, (Key)v1, new IvParameterSpec(v1.getEncoded()));
            return b2;
        }
        catch (GeneralSecurityException b2) {
            throw new RuntimeException(b2);
        }
    }
}

