/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JQa
 *  RB
 *  Tpa
 *  Ub
 *  XTa
 *  cg
 *  vRa
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class eB
extends Ub {
    private String A;
    private static final Pattern I = Pattern.compile(JQa.Y);

    public String f() {
        eB a2;
        return new StringBuilder().insert(3 ^ 3, Mqa.P).append(a2.A).append(Tpa.E).append(a2.e()).append(XTa.d).append(a2.d()).append(IPa.la).append(a2.d()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public eB(String string, String string2, String string3, String string4, String[] stringArray, String string5) {
        void e2;
        Object g;
        void b2;
        void c2;
        void d2;
        void f2;
        eB a2;
        eB eB2 = object;
        Object object = string5;
        eB eB3 = a2 = eB2;
        super((String)f2, (String)d2, (String)c2, (String[])b2, (String)g);
        eB3.A = null;
        eB3.A = e2;
    }

    public boolean l(String string) {
        Object b2 = string;
        eB a2 = this;
        if (!((Matcher)(b2 = I.matcher((CharSequence)b2))).matches()) {
            return uSa.E != 0;
        }
        return ((Matcher)b2).group(uqa.g).matches(a2.e());
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
        String string6 = matcher.group(AQa.P);
        Object b2 = cg.J((String)string6, (String)dqa.X, (String)XOa.D);
        if (b2 != null && b2.length() > 0) {
            string6 = string6.replace((CharSequence)b2, Mqa.y).trim();
        }
        b2 = eB.J((String)string5, (String)b2);
        if (string4 != null && string4.length() > 0) {
            String a2;
            a2 = cg.l((String)a2, (String)Bua.f);
            return new eB(string4, (String)object, string6, string5, (String[])b2, a2);
        }
        return null;
    }
}

