/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Gua
 *  JSa
 *  LQa
 *  MQa
 *  NPa
 *  NTa
 *  Nc
 *  Ppa
 *  RB
 *  Rua
 *  Sb
 *  Ssa
 *  Tpa
 *  UC
 *  URa
 *  Ub
 *  WSa
 *  aQa
 *  asa
 *  bRa
 *  bua
 *  cQa
 *  cg
 *  isa
 *  lB
 *  oB
 *  pua
 *  rb
 *  uOa
 *  uQa
 *  ura
 *  vRa
 *  xOa
 *  yra
 *  zB
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import optifine.Config;
import shadersmod.client.IShaderPack;

public final class HC_3 {
    private static final Pattern J;
    private static final Set<String> A;
    private static final Pattern I;

    public static RB[] J(IShaderPack iShaderPack, String[] stringArray, List<Integer> list) {
        Object c2;
        Iterator a2;
        rb b2;
        IShaderPack iShaderPack2 = iShaderPack;
        if (iShaderPack2 == null) {
            return new RB[uSa.E];
        }
        HashMap<String, RB> hashMap = new HashMap<String, RB>();
        HC_3.J(iShaderPack2, qQa.e, (String[])b2, hashMap);
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)a2.next();
            c2 = new StringBuilder().insert(3 >> 2, KPa.F).append(n2).toString();
            iterator = a2;
            HC_3.J(iShaderPack2, (String)c2, (String[])b2, hashMap);
        }
        Collection collection = hashMap.values();
        c2 = collection.toArray(new RB[collection.size()]);
        b2 = new rb();
        Arrays.sort(c2, b2);
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static String[] J(String string, String[] stringArray) {
        void a2;
        int b22;
        String string2 = string;
        ArrayList<void> arrayList = new ArrayList<void>();
        int n2 = b22 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var4_6 = a2[b22];
            if (string2.contains((CharSequence)var4_6)) {
                arrayList.add(var4_6);
            }
            n2 = ++b22;
        }
        ArrayList<void> arrayList2 = arrayList;
        String[] b22 = arrayList2.toArray(new String[arrayList2.size()]);
        return b22;
    }

    private static Set<String> J() {
        HashSet<String> hashSet = new HashSet<String>();
        boolean bl2 = hashSet.add(zta.o);
        HashSet<String> hashSet2 = hashSet;
        hashSet.add(uQa.U);
        hashSet2.add(Gua.X);
        hashSet.add(Fua.Q);
        hashSet.add(xua.H);
        hashSet.add(lTa.Aa);
        hashSet.add(Cra.R);
        hashSet.add(MTa.N);
        hashSet.add(kua.q);
        hashSet.add(KQa.q);
        hashSet.add(dqa.Q);
        hashSet.add(MTa.Ia);
        hashSet.add(Ssa.Aa);
        hashSet.add(LQa.Ia);
        hashSet.add(Bra.L);
        hashSet.add(Rua.W);
        hashSet.add(ura.ca);
        hashSet.add(Gta.I);
        hashSet.add(NPa.P);
        hashSet.add(URa.d);
        hashSet.add(hpa.t);
        hashSet.add(MQa.t);
        hashSet.add(uOa.fa);
        hashSet.add(Bpa.r);
        hashSet.add(bRa.V);
        hashSet.add(ppa.x);
        hashSet.add(Hra.k);
        hashSet.add(aQa.Ja);
        hashSet.add(Ppa.r);
        hashSet.add(cPa.Aa);
        hashSet.add(Hta.j);
        hashSet.add(cQa.J);
        hashSet.add(PQa.f);
        hashSet.add(BQa.y);
        return hashSet2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(String string, Properties properties, Map<String, RB[]> map, lB[] lBArray, RB[] rBArray) {
        void c2;
        int n2;
        void d2;
        String string2 = string;
        String[] stringArray = d2.getProperty(string2);
        if (stringArray == null) {
            return uSa.E != 0;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        HashSet<String> hashSet = new HashSet<String>();
        stringArray = Config.J((String)stringArray, Tpa.E);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            String e2 = stringArray[n2];
            if (e2.equals(Mqa.j)) {
                arrayList.add(null);
            } else if (hashSet.contains(e2)) {
                Config.J(new StringBuilder().insert(3 ^ 3, yra.Da).append(e2).append(NPa.r).append(string2).toString());
            } else {
                Object object;
                void a2;
                void b2;
                hashSet.add(e2);
                if (e2.equals(sSa.V)) {
                    if (b2 == null) {
                        Config.J(new StringBuilder().insert(3 ^ 3, oua.g).append(e2).append(NPa.r).append(string2).toString());
                    } else {
                        object = new Nc((lB[])b2, (RB[])a2);
                        arrayList.add(object);
                    }
                } else if (e2.equals(JSa.a)) {
                    object = new SB(xOa.j);
                    arrayList.add(object);
                } else if (e2.startsWith(dqa.X) && e2.endsWith(XOa.D)) {
                    StringBuilder stringBuilder;
                    object = cg.l((String)e2, (String)dqa.X, (String)XOa.D);
                    if (!object.matches(BRa.q)) {
                        stringBuilder = new StringBuilder();
                        Config.J(stringBuilder.insert(3 >> 2, bua.j).append(e2).append(NPa.r).append(string2).toString());
                    } else {
                        stringBuilder = new StringBuilder();
                        if (!HC_3.J(stringBuilder.insert(3 ^ 3, asa.u).append((String)object).toString(), (Properties)d2, (Map<String, RB[]>)c2, (lB[])b2, (RB[])a2)) {
                            Config.J(new StringBuilder().insert(3 ^ 3, bua.j).append(e2).append(NPa.r).append(string2).toString());
                        } else {
                            UC uC2 = new UC((String)object);
                            arrayList.add(uC2);
                        }
                    }
                } else {
                    object = tc.J(e2, (RB[])a2);
                    if (object == null) {
                        Config.J(new StringBuilder().insert(3 ^ 3, Hta.n).append(e2).append(NPa.r).append(string2).toString());
                        arrayList.add(null);
                    } else {
                        object.J(vRa.d != 0);
                        arrayList.add(object);
                    }
                }
            }
            n3 = ++n2;
        }
        ArrayList<Object> arrayList2 = arrayList;
        RB[] rBArray2 = arrayList2.toArray(new RB[arrayList2.size()]);
        c2.put(string2, rBArray2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(RB rB2, String[] stringArray) {
        void a2;
        int b2;
        RB rB3 = rB2;
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (rB3.f((String)var3_4)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, IShaderPack iShaderPack, int n2, List<String> list, int n3) throws IOException {
        void b2;
        void c2;
        CharArrayWriter d2;
        void a2;
        String string2 = string;
        if (a2 >= NTa.C) {
            throw new IOException(new StringBuilder().insert(3 ^ 3, sOa.Ja).append((int)a2).append(xqa.I).append(string2).toString());
        }
        ++a2;
        Object e2 = d2.J(string2);
        if (e2 == null) {
            return null;
        }
        e2 = new InputStreamReader((InputStream)e2, sqa.E);
        e2 = new BufferedReader((Reader)e2);
        e2 = HC_3.J((BufferedReader)e2, string2, (IShaderPack)((Object)d2), (int)c2, (List<String>)b2, (int)a2);
        d2 = new CharArrayWriter();
        Object object = e2;
        while ((c2 = ((BufferedReader)object).readLine()) != null) {
            CharArrayWriter charArrayWriter = d2;
            charArrayWriter.write(c2);
            charArrayWriter.write(SPa.O);
            object = e2;
        }
        return d2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static void J(IShaderPack iShaderPack, String string, Map<String, RB> map) {
        int n2;
        void b2;
        IShaderPack iShaderPack2 = iShaderPack;
        String[] stringArray = HC_3.J(iShaderPack2, (String)b2);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            IShaderPack c2 = HC_3.J(stringArray[n2], (String)b2);
            if (!(c2 == null || c2.e().startsWith(Sb.C()) || c2.f() && !HC_3.J((RB)c2, stringArray))) {
                void a2;
                String string2 = c2.e();
                RB rB2 = (RB)a2.get(string2);
                if (rB2 != null) {
                    if (!Config.equals(rB2.J(), c2.J())) {
                        Config.J(new StringBuilder().insert(3 >> 2, isa.L).append(c2.e()).toString());
                        Config.J(new StringBuilder().insert(3 ^ 3, UTa.n).append(Config.J(rB2.f())).append(Xpa.E).append(rB2.J()).toString());
                        Config.J(new StringBuilder().insert(2 & 5, UTa.n).append(Config.J(c2.f())).append(Xpa.E).append(c2.J()).toString());
                        rB2.f(uSa.E != 0);
                    }
                    if (rB2.C() == null || rB2.C().length() <= 0) {
                        rB2.J(c2.C());
                    }
                    rB2.J(c2.f());
                } else {
                    a2.put(string2, c2);
                }
            }
            n3 = ++n2;
        }
    }

    public HC_3() {
        HC_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static Map<String, RB[]> J(Properties properties, lB[] lBArray, RB[] rBArray) {
        void a2;
        void b2;
        Properties properties2 = properties;
        Map<Object, Object> c2 = new HashMap();
        HC_3.J(bRa.b, properties2, (Map<String, RB[]>)c2, (lB[])b2, (RB[])a2);
        if (c2.isEmpty()) {
            return null;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(IShaderPack iShaderPack, String string, String[] stringArray, Map<String, RB> map) {
        void b2;
        int n2;
        IShaderPack iShaderPack2 = iShaderPack;
        int n3 = n2 = uSa.E;
        while (n3 < ((void)b2).length) {
            IShaderPack d2 = b2[n2];
            if (!((String)((Object)d2)).equals(Mqa.y)) {
                void a2;
                void c2;
                String string2 = new StringBuilder().insert(3 & 4, (String)c2).append(WSa.f).append((String)((Object)d2)).append(Cra.F).toString();
                StringBuilder stringBuilder = new StringBuilder();
                IShaderPack iShaderPack3 = iShaderPack2;
                HC_3.J(iShaderPack3, string2, (Map<String, RB>)a2);
                HC_3.J(iShaderPack3, stringBuilder.insert(3 & 4, (String)c2).append(WSa.f).append((String)((Object)d2)).append(gsa.j).toString(), (Map<String, RB>)a2);
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static RB J(String string, String string2) {
        void a2;
        String string3 = string;
        String b2 = null;
        if (null == null) {
            b2 = zB.J((String)string3, (String)a2);
        }
        if (b2 == null) {
            b2 = Ub.J((String)string3, (String)a2);
        }
        if (b2 != null) {
            return b2;
        }
        if (b2 == null) {
            b2 = oB.J((String)string3, (String)a2);
        }
        if (b2 == null) {
            b2 = eB.J(string3, (String)a2);
        }
        if (b2 != null && A.contains(b2.e())) {
            return b2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static BufferedReader J(BufferedReader bufferedReader, String string, IShaderPack iShaderPack, int n2, List<String> list, int n3) throws IOException {
        void e2;
        BufferedReader bufferedReader2 = bufferedReader;
        String string2 = WSa.f;
        int n4 = e2.lastIndexOf(WSa.f);
        if (n4 >= 0) {
            string2 = e2.substring(uSa.E, n4);
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n5 = pua.o;
        LinkedHashSet<CharSequence> linkedHashSet = new LinkedHashSet<CharSequence>();
        int n6 = vRa.d;
        BufferedReader bufferedReader3 = bufferedReader2;
        while (true) {
            void c2;
            CharSequence charSequence;
            Object f2;
            Object object;
            String string3;
            if ((string3 = bufferedReader3.readLine()) == null) {
                object = charArrayWriter.toCharArray();
                if (n5 >= 0 && linkedHashSet.size() > 0) {
                    Object object2;
                    f2 = new StringBuilder();
                    Object object3 = object2 = linkedHashSet.iterator();
                    while (object3.hasNext()) {
                        charSequence = (String)object2.next();
                        object3 = object2;
                        f2.append(Jqa.v);
                        f2.append((String)charSequence);
                        f2.append(SPa.O);
                    }
                    object2 = f2.toString();
                    charSequence = new StringBuilder(new String((char[])object));
                    ((StringBuilder)charSequence).insert(n5, (String)object2);
                    String string4 = ((StringBuilder)charSequence).toString();
                    object = string4.toCharArray();
                }
                f2 = new CharArrayReader((char[])object);
                return new BufferedReader((Reader)f2);
            }
            if (n5 < 0) {
                Matcher matcher = I.matcher(string3);
                object = matcher;
                if (matcher.matches()) {
                    f2 = new StringBuilder().insert(3 & 4, ITa.s).append(Config.C()).append(dqa.s).append(Config.f().C()).append(APa.B).append(Config.l().C()).append(gua.G).append(Sb.f()).append(gua.G).append(Sb.J()).append(gua.G).append(Sb.l()).append(SPa.O).toString();
                    String string5 = new StringBuilder().insert(2 & 5, string3).append(SPa.O).append((String)f2).toString();
                    charSequence = new StringBuilder().insert(3 & 4, Jpa.Ka).append(n6 + vRa.d).append(Tpa.E).append((int)c2).toString();
                    string3 = new StringBuilder().insert(3 & 4, string5).append((String)charSequence).toString();
                    n5 = charArrayWriter.size() + string5.length();
                }
            }
            Matcher matcher = J.matcher(string3);
            object = matcher;
            if (matcher.matches()) {
                void a2;
                int n7;
                void d2;
                void b2;
                CharSequence charSequence2;
                StringBuilder stringBuilder;
                f2 = object.group(vRa.d);
                boolean bl2 = f2.startsWith(WSa.f);
                if (bl2) {
                    stringBuilder = new StringBuilder();
                    charSequence2 = stringBuilder.insert(2 & 5, qQa.e).append((String)f2).toString();
                } else {
                    stringBuilder = new StringBuilder();
                    charSequence2 = charSequence = stringBuilder.insert(3 ^ 3, string2).append(WSa.f).append((String)f2).toString();
                }
                if (!b2.contains(charSequence)) {
                    b2.add(charSequence);
                }
                if ((string3 = HC_3.J((String)charSequence, (IShaderPack)d2, n7 = b2.indexOf(charSequence) + vRa.d, (List<String>)b2, (int)a2)) == null) {
                    throw new IOException(new StringBuilder().insert(3 ^ 3, Asa.R).append((String)e2).toString());
                }
                if (string3.endsWith(SPa.O)) {
                    String string6 = string3;
                    string3 = string6.substring(uSa.E, string6.length() - vRa.d);
                }
                string3 = new StringBuilder().insert(3 >> 2, CRa.Ha).append(n7).append(SPa.O).append(string3).append(rSa.q).append(n6 + vRa.d).append(Tpa.E).append((int)c2).toString();
            }
            if (n5 >= 0 && string3.contains(Sb.C())) {
                f2 = HC_3.J(string3, Sb.J());
                int n8 = uSa.E;
                while (n8 < ((String[])f2).length) {
                    int n9;
                    charSequence = f2[n9];
                    linkedHashSet.add(charSequence);
                    n8 = ++n9;
                }
            }
            CharArrayWriter charArrayWriter2 = charArrayWriter;
            ++n6;
            charArrayWriter2.write(string3);
            charArrayWriter2.write(SPa.O);
            bufferedReader3 = bufferedReader2;
        }
    }

    /*
     * WARNING - void declaration
     * Could not resolve type clashes
     */
    private static lB J(String string, Properties properties, Set<String> set, RB[] rBArray) {
        void c2;
        void b2;
        String string2 = string;
        String string3 = vsa.l;
        String[] stringArray = new StringBuilder().insert(2 & 5, string3).append(string2).toString();
        if (b2.contains(stringArray)) {
            Config.J(new StringBuilder().insert(3 >> 2, iSa.z).append(string2).toString());
            return null;
        }
        b2.add(string2);
        lB lB2 = new lB(string2);
        stringArray = Config.J(c2.getProperty((String)stringArray), Tpa.E);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < stringArray.length) {
            String d2;
            void a2;
            Object object;
            String string4 = stringArray[n2];
            if (string4.startsWith(string3)) {
                object = string4.substring(string3.length());
                d2 = HC_3.J((String)object, (Properties)c2, (Set<String>)b2, (RB[])a2);
                if (lB2 != null) {
                    lB lB3 = lB2;
                    lB3.J((lB)d2);
                    lB3.J(d2.J());
                }
            } else {
                String string5;
                object = Config.J(string4, Bua.o);
                if (((String[])object).length == vRa.d) {
                    Object object2;
                    d2 = object[uSa.E];
                    boolean bl2 = vRa.d;
                    if (d2.startsWith(dqa.O)) {
                        bl2 = uSa.E;
                        d2 = d2.substring(vRa.d);
                    }
                    string5 = ura.j;
                    if (!bl2 && d2.startsWith(ura.j)) {
                        object2 = d2.substring(string5.length());
                        if (!pA.J((String)object2)) {
                            Config.J(new StringBuilder().insert(3 ^ 3, IPa.Ka).append((String)object2).append(asa.A).append(lB2.J()).toString());
                        } else {
                            lB2.J((String)object2);
                        }
                    } else {
                        object2 = tc.J(d2, (RB[])a2);
                        if (!(object2 instanceof zB)) {
                            Config.J(new StringBuilder().insert(5 >> 3, Hta.n).append(d2).toString());
                        } else {
                            lB2.J(d2, String.valueOf(bl2));
                            object2.J(vRa.d != 0);
                        }
                    }
                } else if (((String[])object).length != uqa.g) {
                    Config.J(new StringBuilder().insert(2 & 5, JSa.J).append(string4).toString());
                } else {
                    d2 = object[uSa.E];
                    String string6 = object[vRa.d];
                    string5 = tc.J(d2, (RB[])a2);
                    if (string5 == null) {
                        Config.J(new StringBuilder().insert(5 >> 3, Hta.n).append(string4).toString());
                    } else if (!string5.J(string6)) {
                        Config.J(new StringBuilder().insert(3 >> 2, Bsa.e).append(string4).toString());
                    } else {
                        string5.J(vRa.d != 0);
                        lB2.J(d2, string6);
                    }
                }
            }
            n3 = ++n2;
        }
        return lB2;
    }

    private static String[] J(IShaderPack iShaderPack, String string) {
        String[] a2;
        block3: {
            String[] stringArray;
            IShaderPack iShaderPack2 = iShaderPack;
            try {
                ArrayList b2 = new ArrayList();
                a2 = HC_3.J((String)a2, iShaderPack2, uSa.E, b2, uSa.E);
                if (a2 != null) break block3;
                stringArray = new String[uSa.E];
            }
            catch (IOException b2) {
                Config.f(new StringBuilder().insert(3 >> 2, b2.getClass().getName()).append(Xpa.E).append(b2.getMessage()).toString());
                return new String[uSa.E];
            }
            return stringArray;
        }
        a2 = Config.J(new ByteArrayInputStream(a2.getBytes()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static lB[] J(Properties properties, RB[] rBArray) {
        Properties properties2 = properties;
        String string = vsa.l;
        ArrayList<lB> arrayList = new ArrayList<lB>();
        for (String b322 : properties2.keySet()) {
            void a2;
            if (!b322.startsWith(string)) continue;
            String string2 = b322.substring(string.length());
            properties2.getProperty(b322);
            HashSet<String> b322 = new HashSet<String>();
            lB b322 = HC_3.J(string2, properties2, b322, (RB[])a2);
            if (b322 == null) continue;
            arrayList.add(b322);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        ArrayList<lB> arrayList2 = arrayList;
        lB[] lBArray = arrayList2.toArray(new lB[arrayList2.size()]);
        return lBArray;
    }

    static {
        I = Pattern.compile(Yqa.w);
        J = Pattern.compile(tSa.M);
        A = HC_3.J();
    }
}

