/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JTa
 *  Qqa
 *  RPa
 *  Sna
 *  Spa
 *  TQa
 *  Tpa
 *  Zta
 *  pQa
 *  vRa
 */
import java.net.IDN;
import java.util.Hashtable;
import java.util.regex.Pattern;
import javax.naming.directory.InitialDirContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sna_2 {
    private static final Pattern J = Pattern.compile(Zta.i);
    private final int A;
    private final String I;

    public String J() {
        Sna_2 a2;
        return IDN.toASCII(a2.I);
    }

    private static String[] J(String string) {
        String string2 = string;
        if (string2.contains(Era.Aa) || J.matcher(string2).matches()) {
            String[] stringArray = new String[uqa.g];
            stringArray[uSa.E] = string2;
            stringArray[vRa.d] = Fua.T;
            return stringArray;
        }
        try {
            Class.forName(Spa.J);
            String[] a2 = new Hashtable<String, String>();
            a2.put(Yqa.p, Spa.J);
            a2.put(Qqa.O, uqa.e);
            a2.put(RPa.Aa, TQa.h);
            a2 = new InitialDirContext((Hashtable<?, ?>)a2);
            String[] stringArray = a2;
            String[] stringArray2 = new String[vRa.d];
            stringArray2[uSa.E] = JTa.L;
            a2 = a2.getAttributes(pQa.Da + string2, stringArray2).get(sSa.g).get().toString().split(Tpa.E, AQa.P);
            String[] stringArray3 = new String[uqa.g];
            stringArray3[uSa.E] = a2[yRa.d];
            stringArray3[vRa.d] = a2[uqa.g];
            return stringArray3;
        }
        catch (Throwable throwable) {
            String[] stringArray = new String[uqa.g];
            stringArray[uSa.E] = string2;
            stringArray[vRa.d] = Integer.toString(WRa.d);
            return stringArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    private Sna_2(String string, int n2) {
        void b2;
        Sna_2 a2;
        int c2 = n2;
        Sna_2 sna_2 = a2 = this;
        sna_2.I = b2;
        sna_2.A = c2;
    }

    private static int J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        try {
            return Integer.parseInt(a2.trim());
        }
        catch (Exception exception) {
            return b2;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Sna J(String var0) {
        var3_2 = var0;
        if (var3_2 == null) {
            return null;
        }
        v0 = var3_2;
        var1_3 = v0.split(Era.Aa);
        if (!v0.startsWith(dqa.X) || (var2_4 = var3_2.indexOf(XOa.D)) <= 0) ** GOTO lbl24
        v1 = var3_2;
        a = v1.substring(vRa.d, var2_4);
        var4_6 /* !! */  = v1.substring(var2_4 + vRa.d).trim();
        if (var4_6 /* !! */ .startsWith(Era.Aa)) {
            var4_6 /* !! */  = var4_6 /* !! */ .substring(vRa.d);
            v2 = new String[uqa.g];
            v2[uSa.E] = a;
            v2[vRa.d] = var4_6 /* !! */ ;
            v3 = var1_3 = v2;
        } else {
            v4 = new String[vRa.d];
            v4[uSa.E] = a;
            var1_3 = v4;
lbl24:
            // 2 sources

            v3 = var1_3;
        }
        if (v3.length > uqa.g) {
            v5 = new String[vRa.d];
            v5[uSa.E] = var3_2;
            var1_3 = v5;
        }
        var2_5 = var1_3[uSa.E];
        v6 = a = var1_3.length > vRa.d ? Sna_2.J(var1_3[vRa.d], WRa.d) : WRa.d;
        if (a == WRa.d) {
            var4_6 /* !! */  = Sna_2.J(var2_5);
            var2_5 = var4_6 /* !! */ [uSa.E];
            a = Sna_2.J(var4_6 /* !! */ [vRa.d], WRa.d);
        }
        return new Sna_2(var2_5, a);
    }

    public int J() {
        Sna_2 a2;
        return a2.A;
    }
}

