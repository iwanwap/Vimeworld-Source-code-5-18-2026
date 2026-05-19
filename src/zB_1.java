/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RB
 *  cg
 *  fpa
 *  vRa
 *  zTa
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class zB_1
extends RB {
    private static final Pattern A;
    private static final Pattern I;

    public static boolean d(String a2) {
        return Boolean.valueOf(a2);
    }

    public String J(String string) {
        Object b2 = string;
        zB_1 a2 = this;
        if (zB_1.d((String)b2)) {
            return Kg.l();
        }
        return Kg.f();
    }

    public boolean f(String string) {
        Object b2 = string;
        zB_1 a2 = this;
        if (((Matcher)(b2 = A.matcher((CharSequence)b2))).matches() && ((Matcher)b2).group(uqa.g).equals(a2.e())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String f() {
        zB_1 a2;
        if (zB_1.d(a2.d())) {
            return new StringBuilder().insert(2 & 5, Jqa.v).append(a2.e()).append(zTa.a).toString();
        }
        return new StringBuilder().insert(3 >> 2, tTa.D).append(a2.e()).append(LRa.R).toString();
    }

    public boolean l(String string) {
        Object b2 = string;
        zB_1 a2 = this;
        if (!((Matcher)(b2 = I.matcher((CharSequence)b2))).matches()) {
            return uSa.E != 0;
        }
        return ((Matcher)b2).group(uqa.g).matches(a2.e());
    }

    public boolean f() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public zB_1(String string, String string2, String string3, String string4) {
        void a2;
        void c2;
        void d2;
        Object e2 = string3;
        zB_1 b2 = this;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = oQa.l;
        stringArray[vRa.d] = MRa.E;
        super((String)d2, (String)c2, (String)e2, stringArray, (String)e2, (String)a2);
    }

    static {
        I = Pattern.compile(SPa.fa);
        A = Pattern.compile(hpa.V);
    }

    public static RB J(String string, String string2) {
        String string3 = string;
        Object b22 = I.matcher(string3);
        if (!((Matcher)b22).matches()) {
            return null;
        }
        Object object = b22;
        b22 = ((Matcher)object).group(vRa.d);
        String string4 = ((Matcher)object).group(uqa.g);
        String string5 = ((Matcher)object).group(yRa.d);
        if (string4 != null && string4.length() > 0) {
            String a2;
            int b22 = !Config.equals(b22, dua.G) ? vRa.d : uSa.E;
            a2 = cg.l((String)a2, (String)Bua.f);
            return new zB_1(string4, string5, String.valueOf(b22 != 0), a2);
        }
        return null;
    }

    public String f(String string) {
        Object b2 = string;
        zB_1 a2 = this;
        if (zB_1.d((String)b2)) {
            return fpa.da;
        }
        return ROa.M;
    }
}

