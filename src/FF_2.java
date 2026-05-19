/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LF
 *  Lg
 *  PE
 *  Vua
 *  Ypa
 *  aPa
 *  cra
 *  fsa
 *  lqa
 *  mra
 *  vQa
 *  vRa
 *  zE
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FF_2 {
    public static final String E = "Host";
    public static final String m = "Connection";
    public static final String C = "Location";
    public static final String i = "keep-alive";
    public static final String M = "User-Agent";
    public static final String k = "Accept";
    public static final String j = "chunked";
    public static final String J = "Keep-Alive";
    public static final String A = "Transfer-Encoding";
    private static Map I = new HashMap();

    public static boolean J() {
        Iterator iterator = I.values().iterator();
        while (iterator.hasNext()) {
            if (!((Lg)iterator.next()).f()) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, int n2, Proxy proxy) {
        void b2;
        Proxy c2 = proxy;
        String a2 = string;
        return new StringBuilder().insert(5 >> 3, a2).append(Era.Aa).append((int)b2).append(Vua.m).append(c2).toString();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, a a2, Proxy proxy) throws IOException {
        void b2;
        Object c2 = proxy;
        String a3 = string;
        c2 = FF_2.J(a3, (Proxy)c2);
        FF_2.J(new BF((LF)c2, (a)b2));
    }

    public FF_2() {
        FF_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static LF J(String string, Proxy proxy) throws IOException {
        void a2;
        String string2 = string;
        Object object = new URL(string2);
        if (!((URL)object).getProtocol().equals(cra.j)) {
            throw new IOException(new StringBuilder().insert(3 ^ 3, aPa.h).append(object).toString());
        }
        URL uRL = object;
        object = uRL.getFile();
        String string3 = uRL.getHost();
        int n2 = uRL.getPort();
        if (n2 <= 0) {
            n2 = Fua.J;
        }
        String string4 = Iqa.J;
        String string5 = vQa.J;
        LinkedHashMap<String, String> b2 = new LinkedHashMap<String, String>();
        b2.put(sOa.u, new StringBuilder().insert(2 & 5, cra.X).append(System.getProperty(lqa.Ga)).toString());
        b2.put(vqa.i, string3);
        b2.put(fqa.P, uSa.S);
        b2.put(Jpa.t, mra.L);
        byte[] byArray = new byte[uSa.E];
        return new LF(string3, n2, (Proxy)a2, string4, (String)object, string5, (Map)b2, byArray);
    }

    public static void J(String string, a a2) throws IOException {
        a b2 = a2;
        String a3 = string;
        FF_2.J(a3, b2, Proxy.NO_PROXY);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PE J(LF lF2) throws IOException {
        LF lF3 = lF2;
        PE pE2 = new HashMap();
        Object a22 = new zE(pE2);
        PE pE3 = pE2;
        synchronized (pE3) {
            FF_2.J(new BF(lF3, (a)a22));
            try {
                pE2.wait();
            }
            catch (InterruptedException a22) {
                throw new InterruptedIOException(vsa.I);
            }
            a22 = (Exception)pE2.get(fsa.Ja);
            if (a22 != null) {
                if (a22 instanceof IOException) {
                    throw (IOException)a22;
                }
                if (a22 instanceof RuntimeException) {
                    throw (RuntimeException)a22;
                }
                throw new RuntimeException(((Throwable)a22).getMessage(), (Throwable)a22);
            }
            if ((pE2 = (PE)pE2.get(Ypa.O)) == null) {
                throw new IOException(QTa.h);
            }
            return pE2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static synchronized Lg J(String string, int n2, Proxy proxy) {
        void a2;
        void b2;
        String string2 = string;
        String string3 = FF_2.J(string2, (int)b2, (Proxy)a2);
        String c2 = (Lg)I.get(string3);
        if (c2 == null) {
            c2 = new Lg(string2, (int)b2, (Proxy)a2);
            I.put(string3, c2);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static synchronized void J(String string, int n2, Proxy proxy, Lg lg2) {
        void a2;
        void b2;
        String c2 = string;
        int d22 = n2;
        String d22 = FF_2.J(c2, d22, (Proxy)b2);
        if ((Lg)I.get(d22) == a2) {
            I.remove(d22);
        }
    }

    public static void J(BF bF) {
        Lg lg2;
        BF bF2 = bF;
        BF a2 = bF2.J();
        Lg lg3 = lg2 = FF_2.J(a2.l(), a2.f(), a2.J());
        while (!lg3.J(bF2)) {
            BF bF3 = a2;
            FF_2.J(a2.l(), a2.f(), bF3.J(), lg2);
            lg3 = FF_2.J(bF3.l(), a2.f(), a2.J());
        }
    }

    public static byte[] J(String string, Proxy proxy) throws IOException {
        Object b2 = proxy;
        String a2 = string;
        if ((b2 = FF_2.J(FF_2.J(a2, (Proxy)b2))).J() / ySa.T != uqa.g) {
            throw new IOException(new StringBuilder().insert(3 & 4, Vua.s).append(b2.J()).toString());
        }
        return b2.J();
    }

    public static byte[] J(String a2) throws IOException {
        return FF_2.J(a2, Proxy.NO_PROXY);
    }
}

