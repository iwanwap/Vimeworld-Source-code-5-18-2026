/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QSa
 *  pua
 *  vRa
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cg_1 {
    public static String J(String string) {
        String string2 = string;
        int a2 = cg_1.J(string2, pua.o);
        if (a2 == pua.o) {
            return Mqa.y;
        }
        if (new StringBuilder().insert(3 ^ 3, Mqa.y).append(++a2).toString().length() > string2.length()) {
            return Mqa.y;
        }
        return cg_1.f(new StringBuilder().insert(3 >> 2, Mqa.y).append(a2).toString(), string2.length(), (char)QSa.p);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean C(String string, String string2, char c2) {
        void b2;
        char c2222 = c2;
        String a2 = string;
        if (b2 != null && a2 != null) {
            int n2;
            StringTokenizer stringTokenizer;
            if (b2.indexOf(c2222) < 0) {
                return b2.equals(a2);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String c2222 = new StringBuilder().insert(2 & 5, Mqa.y).append(c2222).toString();
            if (b2.startsWith(c2222)) {
                arrayList.add(Mqa.y);
            }
            StringTokenizer stringTokenizer2 = stringTokenizer = new StringTokenizer((String)b2, c2222);
            while (stringTokenizer2.hasMoreElements()) {
                StringTokenizer stringTokenizer3 = stringTokenizer;
                stringTokenizer2 = stringTokenizer3;
                arrayList.add(stringTokenizer3.nextToken());
            }
            if (b2.endsWith(c2222)) {
                arrayList.add(Mqa.y);
            }
            if (!a2.startsWith(c2222 = (String)arrayList.get(uSa.E))) {
                return uSa.E != 0;
            }
            ArrayList<String> arrayList2 = arrayList;
            c2222 = (String)arrayList2.get(arrayList2.size() - vRa.d);
            if (!a2.endsWith(c2222)) {
                return uSa.E != 0;
            }
            int c2222 = uSa.E;
            int n3 = n2 = uSa.E;
            while (n3 < arrayList.size()) {
                String string3 = (String)arrayList.get(n2);
                if (string3.length() > 0) {
                    int n4 = a2.indexOf(string3, c2222);
                    if (n4 < 0) {
                        return uSa.E != 0;
                    }
                    c2222 = n4 + string3.length();
                }
                n3 = ++n2;
            }
            return vRa.d != 0;
        }
        if (b2 == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f(String string, String[] stringArray) {
        int b2;
        void a2;
        String string2 = string;
        if (string2 == null) {
            return uSa.E != 0;
        }
        if (a2 == null) {
            return uSa.E != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (string2.startsWith((String)var3_4)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    public static boolean J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        if (a2 != null) {
            a2 = a2.trim();
        }
        if (b2 != null) {
            b2 = b2.trim();
        }
        return cg_1.equals(a2, (Object)b2);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean l(String string, String string2, char c2) {
        String c3 = string2;
        String b2 = string;
        if (b2 != null && c3 != null) {
            void a2;
            if (b2.length() < c3.length()) {
                return uSa.E != 0;
            }
            String string3 = b2;
            return cg_1.f(string3.substring(string3.length() - c3.length(), b2.length()), c3, (char)a2);
        }
        if (b2 == c3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int f(String[] stringArray, String string) {
        void a2;
        String[] stringArray2 = stringArray;
        if (stringArray2 != null && a2 != null) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < stringArray2.length) {
                if (stringArray2[b2].endsWith((String)a2)) {
                    return b2;
                }
                n2 = ++b2;
            }
            return pua.o;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean equals(char c2, String string) {
        void a2;
        char c3 = c2;
        int n2 = uSa.E;
        int n3 = n2;
        char b2 = (char)n2;
        while (n3 < a2.length()) {
            if (a2.charAt(b2) == c3) {
                return vRa.d != 0;
            }
            b2 = (char)(b2 + 1);
            n3 = b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string, int n2, char c2) {
        void b2;
        String string2 = string;
        if (string2 == null) {
            string2 = Mqa.y;
        }
        if (string2.length() >= b2) {
            return string2;
        }
        CharSequence c3 = new StringBuffer(string2);
        CharSequence charSequence = c3;
        while (charSequence.length() < b2) {
            void a2;
            CharSequence charSequence2 = c3;
            charSequence = charSequence2;
            ((StringBuffer)charSequence2).insert(uSa.E, (char)a2);
        }
        return ((StringBuffer)c3).toString();
    }

    public cg_1() {
        cg_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean f(String string, String string2, char c2) {
        String c3 = string2;
        String b2 = string;
        if (b2 != null && c3 != null) {
            int n2;
            if (b2.length() != c3.length()) {
                return uSa.E != 0;
            }
            int n3 = n2 = uSa.E;
            while (n3 < c3.length()) {
                void a2;
                char c4 = c3.charAt(n2);
                if (c4 != a2 && b2.charAt(n2) != c4) {
                    return uSa.E != 0;
                }
                n3 = ++n2;
            }
            return vRa.d != 0;
        }
        if (b2 == c3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String l(String string, String string2, String string3) {
        void b2;
        String c2 = string3;
        String a2 = string;
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = b2;
        String[] stringArray2 = new String[vRa.d];
        stringArray2[uSa.E] = c2;
        return cg_1.J(a2, stringArray, stringArray2);
    }

    public static String l(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        if (a2 != null && b2 != null) {
            if (a2.startsWith(b2)) {
                a2 = a2.substring(b2.length());
            }
            return a2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string, String[] stringArray) {
        void a2;
        String string2 = string;
        if (string2 != null && a2 != null) {
            int b2;
            int n2 = string2.length();
            int n3 = b2 = uSa.E;
            while (n3 < ((void)a2).length) {
                void var4_5 = a2[b2];
                if ((string2 = cg_1.l(string2, (String)var4_5)).length() != n2) {
                    return string2;
                }
                n3 = ++b2;
            }
            return string2;
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(String string, String[] stringArray, char c2) {
        void b2;
        int c3;
        String string2 = string;
        int n2 = c3 = uSa.E;
        while (n2 < ((void)b2).length) {
            void a2;
            void var4_5 = b2[c3];
            if (cg_1.C(string2, (String)var4_5, (char)a2)) {
                return vRa.d != 0;
            }
            n2 = ++c3;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(String string, String[] stringArray, String[] stringArray2) {
        void b2;
        String[] c2 = stringArray2;
        String a2 = string;
        a2 = cg_1.f(a2, (String[])b2);
        a2 = cg_1.J(a2, c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string, String string2, String string3) {
        void b2;
        String c2 = string3;
        String a2 = string;
        if (a2 != null && b2 != null) {
            if (c2 == null) {
                c2 = Mqa.y;
            }
            if (a2.endsWith((String)b2)) {
                String string4 = a2;
                a2 = string4.substring(uSa.E, string4.length() - b2.length());
            }
            return new StringBuilder().insert(3 & 4, a2).append(c2).toString();
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(String string, String string2, char c2, char c3) {
        void c4;
        char d222 = c2;
        String b2 = string;
        if (c4 != null && b2 != null) {
            int n2;
            StringTokenizer stringTokenizer;
            void a2;
            if (c4.indexOf(d222) < 0) {
                if (c4.indexOf((int)a2) < 0) {
                    return c4.equals(b2);
                }
                return cg_1.f(b2, (String)c4, (char)a2);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String d222 = new StringBuilder().insert(5 >> 3, Mqa.y).append(d222).toString();
            if (c4.startsWith(d222)) {
                arrayList.add(Mqa.y);
            }
            StringTokenizer stringTokenizer2 = stringTokenizer = new StringTokenizer((String)c4, d222);
            while (stringTokenizer2.hasMoreElements()) {
                StringTokenizer stringTokenizer3 = stringTokenizer;
                stringTokenizer2 = stringTokenizer3;
                arrayList.add(stringTokenizer3.nextToken());
            }
            if (c4.endsWith(d222)) {
                arrayList.add(Mqa.y);
            }
            if (!cg_1.J(b2, d222 = (String)arrayList.get(uSa.E), (char)a2)) {
                return uSa.E != 0;
            }
            ArrayList<String> arrayList2 = arrayList;
            d222 = (String)arrayList2.get(arrayList2.size() - vRa.d);
            if (!cg_1.l(b2, d222, (char)a2)) {
                return uSa.E != 0;
            }
            int d222 = uSa.E;
            int n3 = n2 = uSa.E;
            while (n3 < arrayList.size()) {
                String string3 = (String)arrayList.get(n2);
                if (string3.length() > 0) {
                    int n4 = cg_1.J(b2, string3, d222, (char)a2);
                    if (n4 < 0) {
                        return uSa.E != 0;
                    }
                    d222 = n4 + string3.length();
                }
                n3 = ++n2;
            }
            return vRa.d != 0;
        }
        if (c4 == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(String string, String[] stringArray) {
        int b2;
        void a2;
        String string2 = string;
        if (string2 == null) {
            return uSa.E != 0;
        }
        if (a2 == null) {
            return uSa.E != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (string2.endsWith((String)var3_4)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(String[] stringArray, String string) {
        void a2;
        String[] stringArray2 = stringArray;
        if (stringArray2 != null && a2 != null) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < stringArray2.length) {
                if (stringArray2[b2].startsWith((String)a2)) {
                    return b2;
                }
                n2 = ++b2;
            }
            return pua.o;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(String string, int n2, char c2) {
        void b2;
        String string2 = string;
        if (string2 == null) {
            string2 = Mqa.y;
        }
        if (string2.length() >= b2) {
            return string2;
        }
        CharSequence c3 = new StringBuffer(string2);
        CharSequence charSequence = c3;
        while (charSequence.length() < b2) {
            void a2;
            CharSequence charSequence2 = c3;
            charSequence = charSequence2;
            ((StringBuffer)charSequence2).append((char)a2);
        }
        return ((StringBuffer)c3).toString();
    }

    public static boolean f(String a2) {
        if (a2 == null) {
            return vRa.d != 0;
        }
        if (a2.trim().length() <= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(String a2) {
        if (!cg_1.f(a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean equals(Object object, Object object2) {
        Object a2 = object;
        Object b2 = object2;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (a2 != null && a2.equals(b2)) {
            return vRa.d != 0;
        }
        if (b2 != null && b2.equals(a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String f(String string, String string2) {
        void a2;
        int b2;
        String string3 = string;
        int n2 = b2 = uSa.E;
        while (n2 < a2.length()) {
            if (string3.indexOf(a2.charAt(b2)) < 0) {
                string3 = new StringBuilder().insert(3 & 4, string3).append(a2.charAt(b2)).toString();
            }
            n2 = ++b2;
        }
        return string3;
    }

    /*
     * WARNING - void declaration
     */
    public static String[] J(String[] stringArray, int n2, int n3) {
        void b2;
        void a2;
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            return stringArray2;
        }
        if (a2 > 0 && b2 < stringArray2.length) {
            int c22;
            if (b2 >= a2) {
                return stringArray2;
            }
            ArrayList<String> arrayList = new ArrayList<String>(stringArray2.length);
            int n4 = c22 = uSa.E;
            while (n4 < stringArray2.length) {
                String string = stringArray2[c22];
                if (c22 < b2 || c22 >= a2) {
                    arrayList.add(string);
                }
                n4 = ++c22;
            }
            ArrayList<String> arrayList2 = arrayList;
            String[] c22 = arrayList2.toArray(new String[arrayList2.size()]);
            return c22;
        }
        return stringArray2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(String string, String string2, char c2) {
        String c3 = string2;
        String b2 = string;
        if (b2 != null && c3 != null) {
            void a2;
            if (b2.length() < c3.length()) {
                return uSa.E != 0;
            }
            return cg_1.f(b2.substring(uSa.E, c3.length()), c3, (char)a2);
        }
        if (b2 == c3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(String string, String[] stringArray) {
        void a2;
        String string2 = string;
        if (string2 != null && a2 != null) {
            int b2;
            int n2 = string2.length();
            int n3 = b2 = uSa.E;
            while (n3 < ((void)a2).length) {
                void var4_5 = a2[b2];
                if ((string2 = cg_1.J(string2, (String)var4_5)).length() != n2) {
                    return string2;
                }
                n3 = ++b2;
            }
            return string2;
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(String string, String string2, String string3) {
        void a2;
        String c22 = string2;
        String b2 = string;
        if (b2 != null && c22 != null && a2 != null) {
            int c22 = b2.indexOf(c22);
            if (c22 < 0) {
                return null;
            }
            int n2 = b2.indexOf((String)a2, c22);
            if (n2 < 0) {
                return null;
            }
            return b2.substring(c22, n2 + a2.length());
        }
        return null;
    }

    public static String J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        if (a2 != null && b2 != null) {
            if (a2.endsWith(b2)) {
                String string3 = a2;
                a2 = string3.substring(uSa.E, string3.length() - b2.length());
            }
            return a2;
        }
        return a2;
    }

    public static int J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        if (a2 == null) {
            return b2;
        }
        try {
            return Integer.parseInt(a2);
        }
        catch (NumberFormatException numberFormatException) {
            return b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, String string2, int n2, char c2) {
        void c3;
        int d2 = n2;
        String b2 = string;
        if (b2 != null && c3 != null) {
            if (d2 >= 0 && d2 <= b2.length()) {
                if (b2.length() < d2 + c3.length()) {
                    return pua.o;
                }
                int n3 = d2 = d2;
                while (n3 + c3.length() <= b2.length()) {
                    void a2;
                    int n4 = d2++;
                    if (cg_1.f(b2.substring(n4, n4 + c3.length()), (String)c3, (char)a2)) {
                        return d2;
                    }
                    n3 = d2;
                }
                return pua.o;
            }
            return pua.o;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public static String[] J(String string, String string2) {
        String string3 = string;
        if (string3 != null && string3.length() > 0) {
            int b2;
            void a2;
            if (a2 == null) {
                String[] stringArray = new String[vRa.d];
                stringArray[uSa.E] = string3;
                return stringArray;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = uSa.E;
            int n3 = b2 = uSa.E;
            while (n3 < string3.length()) {
                if (cg_1.equals(string3.charAt(b2), (String)a2)) {
                    arrayList.add(string3.substring(n2, b2));
                    n2 = b2 + vRa.d;
                }
                n3 = ++b2;
            }
            ArrayList<String> arrayList2 = arrayList;
            String string4 = string3;
            arrayList2.add(string4.substring(n2, string4.length()));
            return arrayList2.toArray(new String[arrayList2.size()]);
        }
        return new String[uSa.E];
    }
}

