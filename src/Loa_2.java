/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  EC
 *  Eoa
 *  Koa
 *  Kpa
 *  Loa
 *  SOa
 *  Sna
 *  Toa
 *  aSa
 *  ac
 *  fsa
 *  ld
 *  lma
 *  lqa
 *  pua
 *  vQa
 *  vRa
 *  vna
 *  vpa
 *  yra
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Loa_2
extends EC {
    private static final Logger M;
    public uba k;
    private final EC j;
    public boolean J;
    private static final AtomicInteger A;
    public boolean I;

    public static /* synthetic */ void J(Loa a2) {
        a2.g.J((EC)new Toa(a2.j, xSa.e, (ld)new CY(vQa.ja)));
    }

    public void J(ac ac2) throws IOException {
        Loa_2 b2 = ac2;
        Loa_2 a2 = this;
        if (((ac)b2).C == 0) {
            a2.J = vRa.d;
            if (a2.k != null) {
                a2.k.J((ld)new CY(MTa.r));
            }
            Loa_2 loa_2 = a2;
            loa_2.g.J(loa_2.j);
        }
    }

    static {
        A = new AtomicInteger(uSa.E);
        M = LogManager.getLogger();
    }

    public void J(String string) {
        Object b2 = string;
        Loa_2 a2 = this;
        if (pA.Gb) {
            new Thread(Koa.J((Loa)a2)).start();
            return;
        }
        M.info(new StringBuilder().insert(5 >> 3, Jsa.Aa).append((String)b2).toString());
        new vna((Loa)a2, APa.H + A.incrementAndGet(), (String)b2).start();
    }

    public static /* synthetic */ EC J(Loa a2) {
        return a2.j;
    }

    public static /* synthetic */ Sna J(Loa loa, String string) {
        Object b2 = string;
        Loa a2 = loa;
        return super.J((String)b2);
    }

    public static /* synthetic */ Kpa l(Loa a2) {
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public Loa_2(EC eC2, Kpa kpa2, lma lma2) {
        void c2;
        void a2;
        Loa_2 d2 = kpa2;
        Loa_2 b2 = this;
        void v0 = a2;
        Loa_2 loa_2 = b2;
        b2.I = uSa.E;
        loa_2.g = d2;
        loa_2.j = c2;
        d2.J((Eoa)null);
        d2.J((lma)v0);
        b2.J(v0.serverIP);
    }

    /*
     * WARNING - void declaration
     */
    public Loa_2(EC eC2, Kpa kpa2, String string, int n2) {
        void a2;
        void b2;
        void d2;
        Loa_2 e2 = kpa2;
        Loa_2 c2 = this;
        c2.I = uSa.E;
        c2.g = e2;
        c2.j = d2;
        e2.J((Eoa)null);
        Loa_2 loa_2 = c2;
        c2.J((String)b2 + Era.Aa + (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Loa_2 a2 = this;
        super.J((int)c2, (int)b2, d2);
    }

    public static /* synthetic */ Kpa f(Loa a2) {
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        Loa_2 a2;
        float d2 = f2;
        Loa_2 loa_2 = a2 = this;
        loa_2.i();
        Loa_2.J((String)(loa_2.k == null ? oha.J(hQa.Aa, new Object[uSa.E]) : oha.J(yra.m, new Object[uSa.E])), (int)(a2.A / uqa.g), (int)(a2.I / uqa.g - vpa.o), (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void A() {
        Loa_2 a2;
        Loa_2 loa_2 = a2;
        loa_2.E.clear();
        loa_2.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - ySa.T), a2.I / AQa.P + sOa.D + lqa.s, oha.J(SOa.l, new Object[uSa.E])));
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        Loa_2 loa_2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Exception exception, InetAddress inetAddress, Sna sna) {
        Loa_2 loa_2;
        Object d2;
        String c2;
        Loa_2 loa_22 = this;
        M.error(csa.F, (Throwable)((Object)c2));
        if (c2 instanceof UnknownHostException) {
            d2 = ypa.b;
            loa_2 = loa_22;
        } else {
            void b2;
            d2 = ((Throwable)((Object)c2)).toString();
            if (b2 != null) {
                void a2;
                c2 = new StringBuilder().insert(2 & 5, b2.toString()).append(Era.Aa).append(a2.J()).toString();
                d2 = ((String)d2).replaceAll(c2, Mqa.y);
            }
            loa_2 = loa_22;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = d2;
        loa_2.g.J((EC)new Toa(loa_22.j, xSa.e, (ld)new CZ(fsa.x, objectArray)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private Sna J(String string) {
        void v1;
        block9: {
            void a2;
            block8: {
                Loa_2 loa_2 = this;
                if (a2.equals(Fua.c)) {
                    String string2;
                    Object b2 = null;
                    b2 = (HttpURLConnection)new URL(fsa.S).openConnection();
                    ((URLConnection)b2).setConnectTimeout(aSa.k);
                    ((URLConnection)b2).setReadTimeout(aSa.k);
                    ((URLConnection)b2).setDoInput(vRa.d != 0);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((URLConnection)b2).getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    BufferedReader bufferedReader2 = bufferedReader;
                    while ((string2 = bufferedReader2.readLine()) != null) {
                        bufferedReader2 = bufferedReader;
                        stringBuilder.append(string2);
                    }
                    try {
                        stringBuilder = Sna.J((String)stringBuilder.toString());
                        if (b2 != null) {
                            ((HttpURLConnection)b2).disconnect();
                        }
                        return stringBuilder;
                    }
                    catch (Exception exception) {
                        if (b2 == null) break block8;
                        v1 = a2;
                        ((HttpURLConnection)b2).disconnect();
                        break block9;
                    }
                    catch (Throwable throwable) {
                        if (b2 != null) {
                            ((HttpURLConnection)b2).disconnect();
                        }
                        throw throwable;
                    }
                }
            }
            v1 = a2;
        }
        return Sna.J((String)v1);
    }

    public void l() {
        Loa_2 a2;
        if (a2.k != null) {
            if (a2.k.J()) {
                a2.k.C();
                return;
            }
            a2.k.J();
        }
    }

    public static /* synthetic */ Kpa J(Loa a2) {
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public Loa_2(EC eC2, Kpa kpa2) {
        void b2;
        Loa_2 a2;
        Loa_2 c2 = kpa2;
        Loa_2 loa_2 = a2 = this;
        a2.I = uSa.E;
        loa_2.g = c2;
        loa_2.j = b2;
        c2.J((Eoa)null);
    }
}

