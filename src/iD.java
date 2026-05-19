/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Lg
 *  NTa
 *  PE
 *  Tpa
 *  Zta
 *  kta
 *  nQa
 *  pua
 *  vRa
 */
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iD
extends Thread {
    private static final Charset k = Charset.forName(sqa.E);
    private Lg j;
    private static final String J = "Content-Length";
    private static final char A = '\r';
    private static final char I = '\n';

    @Override
    public void run() {
        iD iD2 = this;
        while (!Thread.interrupted()) {
            BF bF = null;
            try {
                iD iD3 = iD2;
                bF = iD3.j.f();
                InputStream a2 = iD3.j.J();
                PE pE2 = iD3.J(a2);
                iD3.j.J(bF, pE2);
            }
            catch (InterruptedException a2) {
                return;
            }
            catch (Exception a2) {
                iD2.j.f(bF, a2);
            }
        }
    }

    private String J(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        String a2;
        iD iD2 = this;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int n2 = pua.o;
        int n3 = uSa.E;
        void v0 = a2;
        while (true) {
            int b2;
            if ((b2 = v0.read()) < 0) {
                byteArrayOutputStream = byteArrayOutputStream2;
                break;
            }
            byteArrayOutputStream2.write(b2);
            if (n2 == uua.s && b2 == NTa.C) {
                n3 = vRa.d;
                byteArrayOutputStream = byteArrayOutputStream2;
                break;
            }
            n2 = b2;
            v0 = a2;
        }
        byte[] b2 = byteArrayOutputStream.toByteArray();
        a2 = new String(b2, k);
        if (n3 != 0) {
            String string = a2;
            a2 = string.substring(uSa.E, string.length() - uqa.g);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(byte[] byArray, InputStream inputStream) throws IOException {
        void b2;
        int c2;
        iD iD2 = this;
        int n2 = c2 = uSa.E;
        while (n2 < ((void)b2).length) {
            void a2;
            void v1 = b2;
            int n3 = a2.read((byte[])v1, c2, ((void)v1).length - c2);
            if (n3 < 0) {
                throw new EOFException();
            }
            n2 = c2 + n3;
        }
    }

    public iD(Lg lg2) {
        iD a2;
        iD b2 = lg2;
        iD iD2 = a2 = this;
        super(kta.B);
        iD2.j = null;
        iD2.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    private byte[] J(InputStream inputStream) throws IOException {
        int n2;
        iD iD2 = this;
        ByteArrayOutputStream b2 = new ByteArrayOutputStream();
        do {
            void a2;
            iD iD3 = iD2;
            n2 = Integer.parseInt(Config.J(iD3.J((InputStream)a2), SPa.t)[uSa.E], ERa.C);
            byte[] byArray = new byte[n2];
            iD3.J(byArray, (InputStream)a2);
            b2.write(byArray);
            iD3.J((InputStream)a2);
        } while (n2 != 0);
        return b2.toByteArray();
    }

    /*
     * WARNING - void declaration
     */
    private PE J(InputStream inputStream) throws IOException {
        void a2;
        Object object = this;
        String string = ((iD)object).J((InputStream)a2);
        String[] stringArray = Config.J(string, Tpa.E);
        if (stringArray.length < yRa.d) {
            throw new IOException(new StringBuilder().insert(3 ^ 3, kta.O).append(string).toString());
        }
        String[] stringArray2 = stringArray;
        String cfr_ignored_0 = stringArray2[uSa.E];
        int n2 = Config.J(stringArray[vRa.d], uSa.E);
        String cfr_ignored_1 = stringArray2[uqa.g];
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        while (true) {
            String string2;
            String string3;
            String string4;
            if ((string4 = ((iD)object).J((InputStream)a2)).length() <= 0) {
                Object b2 = null;
                string3 = (String)linkedHashMap.get(nQa.Ka);
                if (string3 != null) {
                    int n3 = Config.J(string3, pua.o);
                    if (n3 > 0) {
                        b2 = new byte[n3];
                        ((iD)object).J((byte[])b2, (InputStream)a2);
                    }
                } else {
                    string2 = (String)linkedHashMap.get(KQa.Aa);
                    if (Config.equals(string2, Zta.s)) {
                        b2 = ((iD)object).J((InputStream)a2);
                    }
                }
                return new PE(n2, string, linkedHashMap, (byte[])b2);
            }
            int b2 = string4.indexOf(Era.Aa);
            if (b2 <= 0) continue;
            String string5 = string4;
            string3 = string5.substring(uSa.E, b2).trim();
            string2 = string5.substring(b2 + vRa.d).trim();
            linkedHashMap.put(string3, string2);
        }
    }
}

