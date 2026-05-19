/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RB
 *  Tpa
 *  cg
 *  fpa
 *  pua
 *  vRa
 */
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ub_3
extends RB {
    private static final Pattern I = Pattern.compile(pua.a);

    public String f(String string) {
        Object b2 = string;
        Ub_3 a2 = this;
        return fpa.da;
    }

    public static RB J(String string, String string2) {
        String string3 = string;
        Object object = I.matcher(string3);
        if (!((Matcher)object).matches()) {
            return null;
        }
        Matcher matcher = object;
        object = matcher.group(vRa.d);
        String string4 = matcher.group(uqa.g);
        String string5 = matcher.group(yRa.d);
        Object b2 = cg.J((String)string5, (String)dqa.X, (String)XOa.D);
        if (b2 != null && b2.length() > 0) {
            string5 = string5.replace((CharSequence)b2, Mqa.y).trim();
        }
        b2 = Ub_3.J(string4, (String)b2);
        if (object != null && ((String)object).length() > 0) {
            String a2;
            a2 = cg.l((String)a2, (String)Bua.f);
            return new Ub_3((String)object, string5, string4, (String[])b2, a2);
        }
        return null;
    }

    public boolean l(String string) {
        Object b2 = string;
        Ub_3 a2 = this;
        if (!((Matcher)(b2 = I.matcher((CharSequence)b2))).matches()) {
            return uSa.E != 0;
        }
        return ((Matcher)b2).group(vRa.d).matches(a2.e());
    }

    /*
     * WARNING - void declaration
     */
    public Ub_3(String string, String string2, String string3, String[] stringArray, String string4) {
        Object f2;
        void b2;
        void d2;
        void e2;
        void c2;
        Ub_3 a2;
        Ub_3 ub_3 = object;
        Object object = string4;
        Ub_3 ub_32 = a2 = ub_3;
        void v2 = c2;
        super((String)e2, (String)d2, (String)v2, (String[])b2, (String)v2, (String)f2);
        ub_32.J((ub_32.J().length > vRa.d ? vRa.d : uSa.E) != 0);
    }

    public static String[] J(String string, String string2) {
        Object[] b2 = string2;
        String a2 = string;
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = a2;
        String[] stringArray2 = stringArray;
        if (b2 == null) {
            return stringArray2;
        }
        b2 = b2.trim();
        b2 = cg.l((String)b2, (String)dqa.X);
        b2 = cg.J((String)b2, (String)XOa.D);
        if ((b2 = b2.trim()).length() <= 0) {
            return stringArray2;
        }
        if ((b2 = Config.J((String)b2, Tpa.E)).length <= 0) {
            return stringArray2;
        }
        if (!Arrays.asList(b2).contains(a2)) {
            b2 = (String[])Config.J(b2, a2, uSa.E);
        }
        return b2;
    }

    public String f() {
        Ub_3 a2;
        return new StringBuilder().insert(3 >> 2, Jqa.v).append(a2.e()).append(Tpa.E).append(a2.d()).append(WOa.B).append(a2.d()).toString();
    }
}

