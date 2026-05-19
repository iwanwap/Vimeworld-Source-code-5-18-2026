/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ada
 *  ECa
 *  NCa
 *  Nba
 *  SRa
 *  TAa
 *  Uba
 *  WQa
 *  dba
 *  rAa
 *  tca
 *  uRa
 *  vRa
 *  yca
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.regex.Pattern;

public final class ZBa_1
extends Ada {
    private static final Pattern m = Pattern.compile(uRa.j);
    private static final Splitter C;
    private static final Pattern i;
    private static final Pattern M;
    public String k;
    private static final Pattern j;
    private static final Pattern J;
    private static final Pattern A;
    private static final Pattern I;

    public NCa J() throws yca {
        int a22;
        String[] stringArray;
        block19: {
            block18: {
                stringArray = this;
                try {
                    if (!m.matcher(stringArray.k).matches()) break block18;
                    return new TAa(Double.parseDouble(stringArray.k.substring(uSa.E, stringArray.k.length() - vRa.d)));
                }
                catch (NumberFormatException numberFormatException) {
                    stringArray.k = stringArray.k.replaceAll(vTa.D, SRa.b);
                    return new tca(stringArray.k);
                }
            }
            if (!J.matcher(stringArray.k).matches()) break block19;
            return new rAa(Float.parseFloat(stringArray.k.substring(uSa.E, stringArray.k.length() - vRa.d)));
        }
        if (A.matcher(stringArray.k).matches()) {
            return new Uba(Byte.parseByte(stringArray.k.substring(uSa.E, stringArray.k.length() - vRa.d)));
        }
        if (i.matcher(stringArray.k).matches()) {
            return new ECa(Long.parseLong(stringArray.k.substring(uSa.E, stringArray.k.length() - vRa.d)));
        }
        if (M.matcher(stringArray.k).matches()) {
            return new dba(Short.parseShort(stringArray.k.substring(uSa.E, stringArray.k.length() - vRa.d)));
        }
        if (I.matcher(stringArray.k).matches()) {
            return new Nba(Integer.parseInt(stringArray.k));
        }
        if (j.matcher(stringArray.k).matches()) {
            return new TAa(Double.parseDouble(stringArray.k));
        }
        if (stringArray.k.equalsIgnoreCase(oQa.l) || stringArray.k.equalsIgnoreCase(MRa.E)) {
            return new Uba((byte)(Boolean.parseBoolean(stringArray.k) ? vRa.d : uSa.E));
        }
        if (stringArray.k.startsWith(dqa.X) && stringArray.k.endsWith(XOa.D)) {
            String string = stringArray.k.substring(vRa.d, stringArray.k.length() - vRa.d);
            String[] a22 = Iterables.toArray(C.split(string), String.class);
            try {
                int n2;
                int[] nArray = new int[a22.length];
                int n3 = n2 = uSa.E;
                while (n3 < a22.length) {
                    int n4 = n2++;
                    nArray[n4] = Integer.parseInt(a22[n4].trim());
                    n3 = n2;
                }
                return new OAa(nArray);
            }
            catch (NumberFormatException numberFormatException) {
                return new tca(stringArray.k);
            }
        }
        if (stringArray.k.startsWith(SRa.b) && stringArray.k.endsWith(SRa.b)) {
            stringArray.k = stringArray.k.substring(vRa.d, stringArray.k.length() - vRa.d);
        }
        stringArray.k = stringArray.k.replaceAll(vTa.D, SRa.b);
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = a22 = uSa.E;
        while (n5 < stringArray.k.length()) {
            if (a22 < stringArray.k.length() - vRa.d && stringArray.k.charAt(a22) == iSa.ca && stringArray.k.charAt(a22 + vRa.d) == iSa.ca) {
                ++a22;
                stringBuilder.append((char)iSa.ca);
            } else {
                stringBuilder.append(stringArray.k.charAt(a22));
            }
            n5 = ++a22;
        }
        return new tca(stringBuilder.toString());
    }

    static {
        J = Pattern.compile(TOa.b);
        A = Pattern.compile(rta.a);
        i = Pattern.compile(WQa.N);
        M = Pattern.compile(FRa.i);
        I = Pattern.compile(wta.Ga);
        j = Pattern.compile(sOa.A);
        C = Splitter.on((char)Yqa.D).omitEmptyStrings();
    }

    /*
     * WARNING - void declaration
     */
    public ZBa_1(String string, String string2) {
        void b2;
        ZBa_1 a2;
        Object c2 = string2;
        ZBa_1 zBa_1 = a2 = this;
        zBa_1.I = b2;
        zBa_1.k = c2;
    }
}

