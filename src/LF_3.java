/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LF_3 {
    public static final String f = "GET";
    public static final String F = "POST";
    private Map<String, String> g;
    private String L;
    private Proxy E;
    private int m;
    public static final String C = "HEAD";
    private String i;
    public static final String M = "HTTP/1.0";
    public static final String k = "HTTP/1.1";
    private byte[] j;
    private String J;
    private int A;
    private String I;

    public int f() {
        LF_3 a2;
        return a2.A;
    }

    public String C() {
        LF_3 a2;
        return a2.J;
    }

    public String l() {
        LF_3 a2;
        return a2.I;
    }

    public Map<String, String> J() {
        LF_3 a2;
        return a2.g;
    }

    public String f() {
        LF_3 a2;
        return a2.i;
    }

    public Proxy J() {
        LF_3 a2;
        return a2.E;
    }

    public void J(int n2) {
        int b2 = n2;
        LF_3 a2 = this;
        a2.m = b2;
    }

    /*
     * WARNING - void declaration
     */
    public LF_3(String string, int n2, Proxy proxy, String string2, String string3, String string4, Map<String, String> map, byte[] byArray) {
        Object i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        LF_3 a2;
        LF_3 lF_3 = object;
        Object object = byArray;
        LF_3 lF_32 = a2 = lF_3;
        LF_3 lF_33 = a2;
        LF_3 lF_34 = a2;
        LF_3 lF_35 = a2;
        LF_3 lF_36 = a2;
        LF_3 lF_37 = a2;
        LF_3 lF_38 = a2;
        a2.I = null;
        lF_38.A = uSa.E;
        lF_38.E = Proxy.NO_PROXY;
        lF_38.L = null;
        lF_37.J = null;
        lF_37.i = null;
        LF_3 lF_39 = a2;
        lF_36.g = new LinkedHashMap<String, String>();
        lF_36.j = null;
        lF_36.m = uSa.E;
        lF_35.I = h2;
        lF_35.A = g2;
        lF_34.E = f2;
        lF_34.L = e2;
        lF_33.J = d2;
        lF_33.i = c2;
        lF_32.g = b2;
        lF_32.j = (byte[])i2;
    }

    public String J() {
        LF_3 a2;
        return a2.L;
    }

    public byte[] J() {
        LF_3 a2;
        return a2.j;
    }

    public int J() {
        LF_3 a2;
        return a2.m;
    }
}

