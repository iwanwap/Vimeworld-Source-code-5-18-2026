/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ECa
 *  JSa
 *  NCa
 *  Nba
 *  Ssa
 *  TAa
 *  Uba
 *  VQa
 *  Waa
 *  XTa
 *  cQa
 *  cg
 *  dba
 *  pua
 *  rAa
 *  tca
 *  vRa
 *  waa
 *  yra
 */
import java.util.Arrays;
import optifine.Config;
import org.apache.commons.lang3.StringEscapeUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class je_1 {
    private String[] F;
    private static final String g = "iregex:";
    private static final int L = 1;
    private static final String E = "ipattern:";
    private static final int m = 2;
    private static final String C = "pattern:";
    private static final int i = 4;
    private static final String M = "regex:";
    private static final int k = 0;
    private static final int j = 3;
    private String J;
    private String A;
    private int I;

    /*
     * WARNING - void declaration
     */
    private boolean f(NCa nCa2) {
        NCa nCa3;
        Waa waa2;
        void a2;
        je_1 je_12 = this;
        if (a2 instanceof Waa) {
            waa2 = (Waa)a2;
            for (String string : waa2.J()) {
                nCa3 = waa2.J(string);
                if (!je_12.J(nCa3)) continue;
                return vRa.d != 0;
            }
        }
        if (a2 instanceof waa) {
            int n2;
            waa2 = (waa)a2;
            int b2 = waa2.J();
            int n3 = n2 = uSa.E;
            while (n3 < b2) {
                nCa3 = waa2.f(n2);
                if (je_12.J(nCa3)) {
                    return vRa.d != 0;
                }
                n3 = ++n2;
            }
        }
        return uSa.E != 0;
    }

    private static String J(NCa a2) {
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof tca) {
            return ((tca)a2).J();
        }
        if (a2 instanceof Nba) {
            return Integer.toString(((Nba)a2).J());
        }
        if (a2 instanceof Uba) {
            return Byte.toString(((Uba)a2).f());
        }
        if (a2 instanceof dba) {
            return Short.toString(((dba)a2).J());
        }
        if (a2 instanceof ECa) {
            return Long.toString(((ECa)a2).J());
        }
        if (a2 instanceof rAa) {
            return Float.toString(((rAa)a2).J());
        }
        if (a2 instanceof TAa) {
            return Double.toString(((TAa)a2).J());
        }
        return a2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(String string, String string2) {
        void b2;
        String c2 = string2;
        je_1 a2 = this;
        return cg.J((String)b2, (String)c2, (char)cQa.i, (char)Ssa.u);
    }

    public boolean J(Waa waa2) {
        int n2;
        je_1 b2 = waa2;
        je_1 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        int n3 = n2 = uSa.E;
        while (n3 < a2.F.length) {
            String string = a2.F[n2];
            if ((b2 = je_1.J((NCa)b2, string)) == null) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        if (a2.A.equals(JSa.a)) {
            return a2.f((NCa)b2);
        }
        if ((b2 = je_1.J((NCa)b2, a2.A)) == null) {
            return uSa.E != 0;
        }
        if (a2.J((NCa)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static NCa J(NCa nCa2, String string) {
        Object b22 = string;
        NCa a2 = nCa2;
        if (a2 instanceof Waa) {
            Waa waa2 = (Waa)a2;
            return waa2.J((String)b22);
        }
        if (a2 instanceof waa) {
            waa waa3 = (waa)a2;
            int b22 = Config.J((String)b22, pua.o);
            if (b22 < 0) {
                return null;
            }
            return waa3.f(b22);
        }
        return null;
    }

    public je_1(String string, String string2) {
        Object object;
        String[] b2;
        je_1 a2;
        Object c2 = string2;
        je_1 je_12 = a2 = this;
        je_1 je_13 = a2;
        je_13.F = null;
        je_13.A = null;
        je_13.I = uSa.E;
        je_12.J = null;
        b2 = Config.J((String)b2, VQa.ja);
        je_12.F = Arrays.copyOfRange(b2, uSa.E, b2.length - vRa.d);
        a2.A = b2[b2.length - vRa.d];
        if (((String)c2).startsWith(yra.N)) {
            a2.I = vRa.d;
            object = c2 = ((String)c2).substring(yra.N.length());
        } else if (((String)c2).startsWith(Gta.b)) {
            a2.I = uqa.g;
            object = c2 = ((String)c2).substring(Gta.b.length()).toLowerCase();
        } else if (((String)c2).startsWith(kua.F)) {
            a2.I = yRa.d;
            object = c2 = ((String)c2).substring(kua.F.length());
        } else {
            je_1 je_14 = a2;
            if (((String)c2).startsWith(Pua.ga)) {
                je_14.I = AQa.P;
                object = c2 = ((String)c2).substring(Pua.ga.length()).toLowerCase();
            } else {
                je_14.I = uSa.E;
                object = c2;
            }
        }
        a2.J = c2 = StringEscapeUtils.unescapeJava((String)object);
    }

    public String toString() {
        int n2;
        je_1 je_12 = this;
        StringBuffer a2 = new StringBuffer();
        int n3 = n2 = uSa.E;
        while (n3 < je_12.F.length) {
            String string = je_12.F[n2];
            if (n2 > 0) {
                a2.append(VQa.ja);
            }
            a2.append(string);
            n3 = ++n2;
        }
        if (a2.length() > 0) {
            a2.append(VQa.ja);
        }
        Object object = a2;
        ((StringBuffer)object).append(je_12.A);
        a2.append(XTa.d);
        a2.append(je_12.J);
        return ((StringBuffer)object).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean J(NCa nCa2) {
        Object b2 = nCa2;
        je_1 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if ((b2 = je_1.J((NCa)b2)) == null) {
            return uSa.E != 0;
        }
        switch (a2.I) {
            case 0: {
                return ((String)b2).equals(a2.J);
            }
            case 1: {
                return a2.f((String)b2, a2.J);
            }
            case 2: {
                return a2.f(((String)b2).toLowerCase(), a2.J);
            }
            case 3: {
                return a2.J((String)b2, a2.J);
            }
            case 4: {
                return a2.J(((String)b2).toLowerCase(), a2.J);
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, UTa.V).append(a2.I).toString());
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(String string, String string2) {
        void b2;
        String c2 = string2;
        je_1 a2 = this;
        return b2.matches(c2);
    }
}

