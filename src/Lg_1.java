/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ce
 *  FF
 *  LF
 *  Lg
 *  PE
 *  WSa
 *  asa
 *  fpa
 *  kqa
 *  mra
 *  pQa
 *  pua
 *  vRa
 *  ysa
 */
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lg_1 {
    private OutputStream a;
    public static final int b = 5000;
    private iD l;
    private int e;
    private long G;
    private Ce D;
    private Socket f;
    private InputStream F;
    private boolean g;
    private boolean L;
    private int E;
    private static final Pattern m = Pattern.compile(yta.H);
    private int C;
    private long i;
    public static final int M = 5000;
    private String k;
    private List<BF> j;
    private Proxy J;
    private List<BF> A;
    private static final String I = "\n";

    public synchronized boolean f() {
        Lg_1 a2;
        if (a2.A.size() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(PE pE2) {
        String[] a2;
        Lg_1 lg_1 = this;
        String string = a2.J(Jpa.t);
        if (string != null && !string.toLowerCase().equals(mra.L)) {
            lg_1.J(new EOFException(lTa.K));
        }
        if ((a2 = a2.J(rQa.T)) != null) {
            int n2;
            a2 = Config.J((String)a2, ATa.s);
            int n3 = n2 = uSa.E;
            while (n3 < a2.length) {
                String[] b2 = a2[n2];
                if ((b2 = lg_1.J((String)b2, (char)tua.w)).length >= uqa.g) {
                    int n4;
                    if (b2[uSa.E].equals(ysa.w) && (n4 = Config.J(b2[vRa.d], pua.o)) > 0) {
                        lg_1.G = n4 * PRa.U;
                    }
                    if (b2[uSa.E].equals(fpa.s) && (n4 = Config.J(b2[vRa.d], pua.o)) > 0) {
                        lg_1.e = n4;
                    }
                }
                n3 = ++n2;
            }
        }
    }

    public synchronized void J(BF bF) {
        BF b2 = bF;
        Lg_1 a2 = this;
        if (!a2.g) {
            a2.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(BF bF, List<BF> list) {
        void b2;
        List<BF> c2 = list;
        Lg_1 a2 = this;
        c2.add((BF)b2);
        a2.notifyAll();
    }

    public synchronized void J(Socket socket) throws IOException {
        Socket b2 = socket;
        Lg_1 a2 = this;
        if (!a2.g) {
            if (a2.f != null) {
                throw new IllegalArgumentException(kqa.O);
            }
            Lg_1 lg_1 = a2;
            lg_1.f = b2;
            lg_1.f.setTcpNoDelay(vRa.d != 0);
            lg_1.F = lg_1.f.getInputStream();
            Lg_1 lg_12 = a2;
            lg_1.a = new BufferedOutputStream(a2.f.getOutputStream());
            lg_1.f();
            lg_1.notifyAll();
        }
    }

    /*
     * WARNING - void declaration
     */
    private BF J(List<BF> list, boolean bl) throws InterruptedException {
        void a2;
        List<BF> c2 = list;
        Lg_1 b2 = this;
        List<BF> list2 = c2;
        while (list2.size() <= 0) {
            list2 = c2;
            Lg_1 lg_1 = b2;
            lg_1.J();
            lg_1.wait(asa.fa);
        }
        b2.f();
        if (a2 != false) {
            return (BF)c2.remove(uSa.E);
        }
        return (BF)c2.get(uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    private void f(Exception exception) {
        Lg_1 lg_1 = this;
        if (lg_1.A.size() > 0) {
            Object b2;
            if (!lg_1.L) {
                void a2;
                Object object = b2 = lg_1.A.remove(uSa.E);
                ((BF)b2).J().J(((BF)object).J(), (Exception)a2);
                ((BF)object).J(vRa.d != 0);
            }
            Lg_1 lg_12 = lg_1;
            while (lg_12.A.size() > 0) {
                b2 = lg_1.A.remove(uSa.E);
                lg_12 = lg_1;
                FF.J((BF)b2);
            }
        }
    }

    public int f() {
        Lg_1 a2;
        return a2.E;
    }

    private synchronized void J(Exception exception) {
        Exception b2 = exception;
        Lg_1 a2 = this;
        if (!a2.g) {
            Lg_1 lg_1 = a2;
            lg_1.g = vRa.d;
            lg_1.f(b2);
            if (lg_1.D != null) {
                a2.D.interrupt();
            }
            if (a2.l != null) {
                a2.l.interrupt();
            }
            try {
                if (a2.f != null) {
                    a2.f.close();
                }
            }
            catch (IOException iOException) {}
            Lg_1 lg_12 = a2;
            lg_12.f = null;
            lg_12.F = null;
            a2.a = null;
        }
    }

    private String J(String string, LF lF2) {
        StringBuilder stringBuilder;
        String a2;
        String c2 = string;
        Lg_1 b2 = this;
        if (m.matcher(c2).matches()) {
            return c2;
        }
        if (c2.startsWith(dua.G)) {
            return new StringBuilder().insert(2 & 5, pQa.ca).append(c2).toString();
        }
        void v0 = a2;
        String string2 = v0.l();
        if (v0.f() != Fua.J) {
            string2 = new StringBuilder().insert(2 & 5, string2).append(Era.Aa).append(a2.f()).toString();
        }
        if (c2.startsWith(WSa.f)) {
            return new StringBuilder().insert(3 >> 2, rSa.ba).append(string2).append(c2).toString();
        }
        int n2 = (a2 = a2.C()).lastIndexOf(WSa.f);
        if (n2 >= 0) {
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(5 >> 3, rSa.ba).append(string2).append(a2.substring(uSa.E, n2 + vRa.d)).append(c2).toString();
        }
        stringBuilder = new StringBuilder();
        return stringBuilder.insert(5 >> 3, rSa.ba).append(string2).append(WSa.f).append(c2).toString();
    }

    public synchronized void f(BF bF, Exception exception) {
        Exception c2 = exception;
        Lg_1 a2 = this;
        a2.J(c2);
    }

    public synchronized boolean J() {
        Lg_1 a2;
        if (a2.g) {
            return vRa.d != 0;
        }
        Lg_1 lg_1 = a2;
        if (lg_1.E >= lg_1.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private String[] J(String string, char n2) {
        String b2;
        int c22 = n2;
        Lg_1 a2 = this;
        if ((c22 = b2.indexOf(c22)) < 0) {
            String[] stringArray = new String[vRa.d];
            stringArray[uSa.E] = b2;
            return stringArray;
        }
        void v1 = b2;
        b2 = v1.substring(uSa.E, c22);
        String c22 = v1.substring(c22 + vRa.d);
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = b2;
        stringArray[vRa.d] = c22;
        return stringArray;
    }

    /*
     * WARNING - void declaration
     */
    public Lg_1(String string, int n2) {
        void b2;
        int c2 = n2;
        Lg_1 a2 = this;
        a2((String)b2, c2, Proxy.NO_PROXY);
    }

    public String J() {
        Lg_1 a2;
        return a2.k;
    }

    public Proxy J() {
        Lg_1 a2;
        return a2.J;
    }

    public synchronized InputStream J() throws IOException, InterruptedException {
        Lg_1 a2;
        Lg_1 lg_1 = a2;
        while (lg_1.F == null) {
            Lg_1 lg_12 = a2;
            lg_1 = lg_12;
            lg_12.J();
            lg_12.wait(asa.fa);
        }
        return a2.F;
    }

    private void f() {
        a.i = System.currentTimeMillis();
    }

    public synchronized OutputStream J() throws IOException, InterruptedException {
        Lg_1 a2;
        Lg_1 lg_1 = a2;
        while (lg_1.a == null) {
            Lg_1 lg_12 = a2;
            lg_1 = lg_12;
            lg_12.J();
            lg_12.wait(asa.fa);
        }
        return a2.a;
    }

    public synchronized BF f() throws InterruptedException {
        Lg_1 a2;
        Lg_1 lg_1 = a2;
        return lg_1.J(lg_1.A, uSa.E != 0);
    }

    public synchronized boolean J(BF bF) {
        BF b2 = bF;
        Object a2 = this;
        if (((Lg_1)a2).J()) {
            return uSa.E != 0;
        }
        Lg_1 lg_1 = a2;
        lg_1.J(b2, ((Lg_1)a2).A);
        lg_1.J(b2, lg_1.j);
        ((Lg_1)a2).E += vRa.d;
        return vRa.d != 0;
    }

    public synchronized void J(BF bF, Exception exception) {
        Exception c2 = exception;
        Lg_1 a2 = this;
        a2.J(c2);
    }

    private void J() {
        Lg_1 a2;
        if (a2.f != null) {
            Lg_1 lg_1 = a2;
            long l2 = lg_1.G;
            if (lg_1.A.size() > 0) {
                l2 = vua.Fa;
            }
            if (System.currentTimeMillis() > a2.i + l2) {
                a2.J(new InterruptedException(new StringBuilder().insert(3 ^ 3, Mqa.T).append(l2).toString()));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Lg_1(String string, int n2, Proxy proxy) {
        void b2;
        void c2;
        Lg_1 a2;
        Proxy d2 = proxy;
        Lg_1 lg_1 = a2 = this;
        Lg_1 lg_12 = a2;
        Lg_1 lg_13 = a2;
        Lg_1 lg_14 = a2;
        Lg_1 lg_15 = a2;
        Lg_1 lg_16 = a2;
        Lg_1 lg_17 = a2;
        Lg_1 lg_18 = a2;
        lg_18.k = null;
        a2.C = uSa.E;
        lg_18.J = Proxy.NO_PROXY;
        Lg_1 lg_19 = a2;
        lg_17.A = new LinkedList<BF>();
        lg_17.j = new LinkedList<BF>();
        lg_17.f = null;
        lg_16.F = null;
        lg_16.a = null;
        lg_15.D = null;
        lg_14.l = null;
        lg_15.E = uSa.E;
        lg_14.L = uSa.E;
        lg_14.G = vua.Fa;
        lg_14.e = PRa.U;
        lg_13.i = System.currentTimeMillis();
        lg_13.g = uSa.E;
        lg_13.k = c2;
        lg_12.C = b2;
        lg_1.J = d2;
        lg_12.D = new Ce((Lg)a2);
        lg_1.D.start();
        lg_1.l = new iD((Lg)a2);
        lg_1.l.start();
    }

    public int J() {
        Lg_1 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public synchronized void J(BF bF, PE pE2) {
        BF c2 = bF;
        Lg_1 b2 = this;
        if (!b2.g) {
            Lg_1 lg_1 = b2;
            lg_1.L = vRa.d;
            lg_1.f();
            if (lg_1.A.size() > 0 && b2.A.get(uSa.E) == c2) {
                Lg_1 lg_12;
                void a2;
                b2.A.remove(uSa.E);
                c2.J(vRa.d != 0);
                String string = a2.J(Bua.F);
                if (a2.J() / ySa.T == yRa.d && string != null && c2.J().J() < tTa.h) {
                    try {
                        string = b2.J(string, c2.J());
                        LF lF2 = FF.J((String)string, (Proxy)c2.J().J());
                        lF2.J(c2.J().J() + vRa.d);
                        FF.J((BF)new BF(lF2, c2.J()));
                        lg_12 = b2;
                    }
                    catch (IOException iOException) {
                        lg_12 = b2;
                        c2.J().J(c2.J(), iOException);
                    }
                } else {
                    a a3 = c2.J();
                    lg_12 = b2;
                    a3.J(c2.J(), (PE)a2);
                }
                lg_12.J((PE)a2);
                return;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, dqa.v).append(c2).toString());
        }
    }

    public synchronized BF J() throws InterruptedException, IOException {
        Lg_1 a2;
        if (a2.j.size() <= 0 && a2.a != null) {
            a2.a.flush();
        }
        Lg_1 lg_1 = a2;
        return lg_1.J(lg_1.j, vRa.d != 0);
    }
}

