/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RB
 *  XTa
 *  cg
 *  uQa
 *  vRa
 *  zB
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oB_3
extends zB {
    private static final Pattern I = Pattern.compile(uQa.l);

    /*
     * WARNING - void declaration
     */
    public oB_3(String string, String string2, String string3, String string4) {
        Object e2;
        void b2;
        void c2;
        void d2;
        oB_3 oB_32 = object;
        Object object = string4;
        oB_3 a2 = oB_32;
        super((String)d2, (String)c2, (String)b2, (String)e2);
    }

    public boolean l(String string) {
        Object b2 = string;
        oB_3 a2 = this;
        if (!((Matcher)(b2 = I.matcher((CharSequence)b2))).matches()) {
            return uSa.E != 0;
        }
        return ((Matcher)b2).group(vRa.d).matches(a2.e());
    }

    public static RB J(String string, String string2) {
        String string3 = string;
        Object b2 = I.matcher(string3);
        if (!((Matcher)b2).matches()) {
            return null;
        }
        Object object = b2;
        b2 = ((Matcher)object).group(vRa.d);
        String string4 = ((Matcher)object).group(uqa.g);
        String string5 = ((Matcher)object).group(yRa.d);
        if (b2 != null && ((String)b2).length() > 0) {
            String a2;
            a2 = cg.l((String)a2, (String)Bua.f);
            oB_3 oB_32 = new oB_3((String)b2, string5, string4, a2);
            oB_32.J(uSa.E != 0);
            return oB_32;
        }
        return null;
    }

    public String f() {
        oB_3 a2;
        return new StringBuilder().insert(5 >> 3, fqa.c).append(a2.e()).append(XTa.d).append(a2.d()).append(IPa.la).append(a2.d()).toString();
    }

    public boolean f() {
        return uSa.E != 0;
    }
}

