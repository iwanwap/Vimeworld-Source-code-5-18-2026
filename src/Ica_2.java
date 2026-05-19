/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ada
 *  CBa
 *  Cra
 *  FPa
 *  JPa
 *  Sqa
 *  Tpa
 *  Waa
 *  XSa
 *  ZBa
 *  dpa
 *  jsa
 *  pua
 *  vRa
 *  yca
 */
import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ica_2 {
    private static final Pattern A;
    private static final Logger I;

    private static Ada J(String string, boolean bl) throws yca {
        String a2;
        boolean b22 = bl;
        String string2 = a2 = string;
        String string3 = Ica_2.l(string2, b22);
        String b22 = Ica_2.f(string2, b22);
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = string3;
        stringArray[vRa.d] = b22;
        return Ica_2.J(stringArray);
    }

    public static Waa J(String a2) throws yca {
        if (!(a2 = a2.trim()).startsWith(XSa.e)) {
            throw new yca(WOa.y);
        }
        if (Ica_2.J(a2) != vRa.d) {
            throw new yca(FPa.Ia);
        }
        return (Waa)Ica_2.J(kTa.Aa, a2).J();
    }

    private static boolean J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        if (b2 > 0 && a2.charAt(b2 - vRa.d) == iSa.ca && !Ica_2.J(a2, b2 - vRa.d)) {
            return vRa.d != '\u0000';
        }
        return uSa.E != '\u0000';
    }

    static {
        I = LogManager.getLogger();
        A = Pattern.compile(vsa.o);
    }

    /*
     * WARNING - void declaration
     */
    private static String l(String string, boolean bl) throws yca {
        void a2;
        String string2 = string;
        if (a2 != false && ((string2 = string2.trim()).startsWith(XSa.e) || string2.startsWith(dqa.X))) {
            return Mqa.y;
        }
        int b2 = Ica_2.J(string2, (char)lQa.R);
        if (b2 == pua.o) {
            if (a2 != false) {
                return Mqa.y;
            }
            throw new yca(new StringBuilder().insert(3 & 4, Ura.O).append(string2).toString());
        }
        return string2.substring(uSa.E, b2).trim();
    }

    /*
     * WARNING - void declaration
     */
    private static String f(String string, boolean bl) throws yca {
        void a2;
        String string2 = string;
        if (a2 != false && ((string2 = string2.trim()).startsWith(XSa.e) || string2.startsWith(dqa.X))) {
            return string2;
        }
        int b2 = Ica_2.J(string2, (char)lQa.R);
        if (b2 == pua.o) {
            if (a2 != false) {
                return string2;
            }
            throw new yca(new StringBuilder().insert(5 >> 3, Ura.O).append(string2).toString());
        }
        return string2.substring(b2 + vRa.d).trim();
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, boolean bl) throws yca {
        void a2;
        String string2;
        String string3 = string2 = string;
        int b2 = Ica_2.J(string3, (char)lQa.R);
        int n2 = Ica_2.J(string3, (char)Yqa.D);
        if (a2 != false) {
            if (b2 == pua.o) {
                throw new yca(new StringBuilder().insert(2 & 5, Ura.O).append(string2).toString());
            }
            if (n2 != pua.o && n2 < b2) {
                throw new yca(new StringBuilder().insert(3 >> 2, FPa.L).append(string2).toString());
            }
        } else if (b2 == pua.o || b2 > n2) {
            b2 = pua.o;
        }
        return Ica_2.J(string2, b2);
    }

    public Ica_2() {
        Ica_2 a2;
    }

    public static Ada J(String ... a2) throws yca {
        return Ica_2.J(a2[uSa.E], a2[vRa.d]);
    }

    public static Ada J(String string, String string2) throws yca {
        String b2 = string2;
        String a2 = string;
        if ((b2 = b2.trim()).startsWith(XSa.e)) {
            String string3 = b2;
            b2 = string3.substring(vRa.d, string3.length() - vRa.d);
            uAa uAa2 = new uAa(a2);
            String string4 = b2;
            while (string4.length() > 0) {
                char c2;
                String string5 = Ica_2.J(b2, vRa.d != '\u0000');
                if (string5.length() > 0) {
                    c2 = uSa.E;
                    uAa2.I.add(Ica_2.J(string5, c2 != '\u0000'));
                }
                if (b2.length() < string5.length() + vRa.d) {
                    return uAa2;
                }
                c2 = b2.charAt(string5.length());
                if (c2 != Yqa.D && c2 != JPa.ga && c2 != ySa.Z && c2 != rRa.R && c2 != fPa.t) {
                    throw new yca(new StringBuilder().insert(2 & 5, jsa.n).append(c2).append(Cra.h).append(b2.substring(string5.length())).toString());
                }
                string4 = b2.substring(string5.length() + vRa.d);
            }
            return uAa2;
        }
        if (b2.startsWith(dqa.X) && !A.matcher(b2).matches()) {
            String string5 = b2;
            b2 = string5.substring(vRa.d, string5.length() - vRa.d);
            CBa cBa2 = new CBa(a2);
            String string6 = b2;
            while (string6.length() > 0) {
                char c3;
                String string8 = Ica_2.J(b2, uSa.E != '\u0000');
                if (string8.length() > 0) {
                    c3 = vRa.d;
                    cBa2.I.add(Ica_2.J(string8, c3 != '\u0000'));
                }
                if (b2.length() < string8.length() + vRa.d) {
                    return cBa2;
                }
                c3 = b2.charAt(string8.length());
                if (c3 != Yqa.D && c3 != JPa.ga && c3 != ySa.Z && c3 != rRa.R && c3 != fPa.t) {
                    throw new yca(new StringBuilder().insert(2 & 5, jsa.n).append(c3).append(Cra.h).append(b2.substring(string8.length())).toString());
                }
                string6 = b2.substring(string8.length() + vRa.d);
            }
            return cBa2;
        }
        return new ZBa(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, char c2) {
        String string2 = string;
        int b2 = uSa.E;
        int n2 = vRa.d;
        int n3 = b2;
        while (n3 < string2.length()) {
            char c3 = string2.charAt(b2);
            if (c3 == Tpa.z) {
                if (!Ica_2.J(string2, b2)) {
                    n2 = n2 == 0 ? vRa.d : uSa.E;
                }
            } else if (n2 != 0) {
                void a2;
                if (c3 == a2) {
                    return b2;
                }
                if (c3 == JPa.ga || c3 == rRa.R) {
                    return pua.o;
                }
            }
            n3 = ++b2;
        }
        return pua.o;
    }

    private static String J(String string, int n2) throws yca {
        int b2 = n2;
        String a2 = string;
        Stack<Character> stack = new Stack<Character>();
        int n3 = uSa.E;
        int n4 = uSa.E;
        int n5 = uSa.E;
        int n6 = uSa.E;
        int n7 = b2 += vRa.d;
        while (n7 < a2.length()) {
            char c2;
            block14: {
                char c3;
                block13: {
                    block11: {
                        block12: {
                            c3 = a2.charAt(b2);
                            if (c3 != Tpa.z) break block11;
                            if (!Ica_2.J(a2, b2)) break block12;
                            if (n3 == 0) {
                                throw new yca(new StringBuilder().insert(2 & 5, Sqa.B).append(a2).toString());
                            }
                            break block13;
                        }
                        int n8 = n3 = n3 == 0 ? vRa.d : uSa.E;
                        if (n3 != 0 && n5 == 0) {
                            n4 = vRa.d;
                        }
                        if (n3 != 0) break block13;
                        n6 = b2;
                        c2 = c3;
                        break block14;
                    }
                    if (n3 == 0) {
                        if (c3 != JPa.ga && c3 != rRa.R) {
                            if (c3 == ySa.Z && (stack.isEmpty() || ((Character)stack.pop()).charValue() != JPa.ga)) {
                                throw new yca(new StringBuilder().insert(5 >> 3, opa.s).append(a2).toString());
                            }
                            if (c3 == fPa.t && (stack.isEmpty() || ((Character)stack.pop()).charValue() != rRa.R)) {
                                throw new yca(new StringBuilder().insert(5 >> 3, Qra.Ja).append(a2).toString());
                            }
                            if (c3 == Yqa.D && stack.isEmpty()) {
                                return a2.substring(uSa.E, b2);
                            }
                        } else {
                            stack.push(Character.valueOf(c3));
                        }
                    }
                }
                c2 = c3;
            }
            if (!Character.isWhitespace(c2)) {
                if (n3 == 0 && n4 != 0 && n6 != b2) {
                    return a2.substring(uSa.E, n6 + vRa.d);
                }
                n5 = vRa.d;
            }
            n7 = ++b2;
        }
        return a2.substring(uSa.E, b2);
    }

    public static int J(String string) throws yca {
        int n2;
        String string2 = string;
        int n3 = uSa.E;
        int n4 = uSa.E;
        Stack a2 = new Stack();
        int n5 = n2 = uSa.E;
        while (n5 < string2.length()) {
            char c2 = string2.charAt(n2);
            if (c2 == Tpa.z) {
                if (Ica_2.J(string2, n2)) {
                    if (n4 == 0) {
                        throw new yca(new StringBuilder().insert(3 & 4, Sqa.B).append(string2).toString());
                    }
                } else {
                    n4 = n4 == 0 ? vRa.d : uSa.E;
                }
            } else if (n4 == 0) {
                if (c2 != JPa.ga && c2 != rRa.R) {
                    if (c2 == ySa.Z && (a2.isEmpty() || ((Character)a2.pop()).charValue() != JPa.ga)) {
                        throw new yca(new StringBuilder().insert(3 >> 2, opa.s).append(string2).toString());
                    }
                    if (c2 == fPa.t && (a2.isEmpty() || ((Character)a2.pop()).charValue() != rRa.R)) {
                        throw new yca(new StringBuilder().insert(2 & 5, Qra.Ja).append(string2).toString());
                    }
                } else {
                    if (a2.isEmpty()) {
                        ++n3;
                    }
                    a2.push(Character.valueOf(c2));
                }
            }
            n5 = ++n2;
        }
        if (n4 != 0) {
            throw new yca(new StringBuilder().insert(3 ^ 3, Hra.V).append(string2).toString());
        }
        if (!a2.isEmpty()) {
            throw new yca(new StringBuilder().insert(5 >> 3, dpa.Y).append(string2).toString());
        }
        if (n3 == 0 && !string2.isEmpty()) {
            n3 = vRa.d;
        }
        return n3;
    }
}

