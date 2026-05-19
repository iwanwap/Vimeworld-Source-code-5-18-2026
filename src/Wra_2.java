/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  NTa
 *  TQa
 *  hra
 *  lqa
 *  psa
 *  vRa
 */
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Wra_2 {
    public static final int M = 16;
    private static final String k = "AES";
    public static final int j = 32;
    public static final int J = 12;
    private static final SecureRandom A;
    private static final String I = "AES/GCM/NoPadding";

    public Wra_2() {
        Wra_2 a2;
    }

    public static byte[] f() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(NTa.S);
            keyGenerator.init(hra.Ja);
            return keyGenerator.generateKey().getEncoded();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(UTa.A, noSuchAlgorithmException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] f(byte[] byArray, byte[] byArray2) {
        void a2;
        byte[] byArray3 = byArray;
        if (((void)a2).length < lqa.s) {
            return null;
        }
        try {
            Cipher cipher;
            Object b2 = new SecretKeySpec(byArray3, NTa.S);
            Cipher cipher2 = cipher = Cipher.getInstance(psa.ca);
            Object object = b2;
            cipher2.init(uqa.g, (Key)b2, new GCMParameterSpec(XOa.h, (byte[])a2, uSa.E, lqa.s));
            return cipher2.doFinal((byte[])a2, lqa.s, ((void)a2).length - lqa.s);
        }
        catch (BadPaddingException | IllegalBlockSizeException b2) {
            return null;
        }
        catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException b2) {
            throw new RuntimeException(TQa.l, b2);
        }
    }

    static {
        try {
            A = SecureRandom.getInstanceStrong();
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] J(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = byArray;
        try {
            byte[] b2;
            void a2;
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray4, NTa.S);
            Object c2 = Cipher.getInstance(psa.ca);
            byte[] byArray5 = c2;
            byArray5.init(vRa.d, (Key)secretKeySpec, new GCMParameterSpec(XOa.h, (byte[])a2));
            b2 = byArray5.doFinal(b2);
            c2 = new byte[((void)a2).length + b2.length];
            System.arraycopy(a2, uSa.E, c2, uSa.E, ((void)a2).length);
            System.arraycopy(b2, uSa.E, c2, ((void)a2).length, b2.length);
            return c2;
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            return null;
        }
        catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | NoSuchPaddingException generalSecurityException) {
            throw new RuntimeException(Gua.I, generalSecurityException);
        }
    }

    public static byte[] J() {
        byte[] byArray = new byte[lqa.s];
        A.nextBytes(byArray);
        return byArray;
    }

    public static byte[] J(byte[] byArray, byte[] byArray2) {
        byte[] b2 = byArray2;
        byte[] a2 = byArray;
        return Wra_2.J(a2, b2, Wra_2.J());
    }
}

