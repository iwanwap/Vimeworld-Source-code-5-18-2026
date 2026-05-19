/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  CK
 *  FPa
 *  GL
 *  JQa
 *  Lj
 *  Lqa
 *  ML
 *  Mk
 *  PJ
 *  PTa
 *  Pk
 *  QL
 *  RPa
 *  SRa
 *  TL
 *  TPa
 *  Tk
 *  UJ
 *  VQa
 *  Vua
 *  WK
 *  Xj
 *  Xk
 *  YSa
 *  Yra
 *  bK
 *  bqa
 *  dK
 *  el
 *  fL
 *  fpa
 *  gJ
 *  gL
 *  mj
 *  nJ
 *  pPa
 *  pua
 *  qk
 *  ql
 *  rJ
 *  vRa
 *  vk
 *  vpa
 *  wk
 *  xJ
 *  xK
 *  xL
 *  yQa
 *  yj
 *  yk
 *  yra
 *  zL
 */
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Xj_2 {
    public Map<String, Class<? extends RL>> J;
    public boolean A;
    public sK I;

    public boolean f(Object object) {
        Object b2 = object;
        Xj_2 a2 = this;
        if (b2 instanceof String && a2.f((String)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(Object object) {
        Object b2 = object;
        Xj_2 a2 = this;
        if (b2 instanceof String && !a2.J((String)b2) && !a2.f((String)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public t f(List<Object> list) throws Exception {
        int n2;
        int n3;
        List<Object> a2 = this;
        List<Object> b2 = list;
        t t2 = ((Xj_2)((Object)a2)).J(b2);
        if (t2 != null) {
            return t2;
        }
        int n4 = b2.size();
        if (n4 == vRa.d) {
            return ((Xj_2)((Object)a2)).J(b2.get(uSa.E));
        }
        if (n4 == uqa.g) {
            List<Object> list2 = b2;
            Object e2 = list2.get(uSa.E);
            Object e3 = list2.get(vRa.d);
            if ((((Xj_2)((Object)a2)).J(e2) || e2.equals(Vua.m)) && e3 instanceof List) {
                return ((Xj_2)((Object)a2)).J((String)e2, (List)e3);
            }
        }
        int n5 = n3 = (n2 = ((Xj_2)((Object)a2)).J(b2));
        while (n5 != pua.o) {
            int n6 = ((Xj_2)((Object)a2)).J(b2, n3 - vRa.d);
            if (n6 != pua.o) {
                Object object = ((Xj_2)((Object)a2)).J((String)b2.get(n6));
                yk yk2 = ((Xj_2)((Object)a2)).J((String)b2.get(n3));
                if (yk2.value > object.value) {
                    Xj_2 xj_2 = a2;
                    t t3 = xj_2.f(b2.subList(uSa.E, n6));
                    t t4 = xj_2.f(b2.subList(n6 + vRa.d, n4));
                    return new xJ(object, t3, t4);
                }
                if (object.value > yk2.value) {
                    yk yk3 = ((Xj_2)((Object)a2)).J((String)b2.get(n2));
                    if (yk3.value < object.value) {
                        Xj_2 xj_2 = a2;
                        t t5 = xj_2.f(b2.subList(uSa.E, n2));
                        object = xj_2.f(b2.subList(n2 + vRa.d, n4));
                        return new xJ(yk3, t5, (t)object);
                    }
                    Xj_2 xj_2 = a2;
                    t t6 = xj_2.f(b2.subList(uSa.E, n3));
                    object = xj_2.f(b2.subList(n3 + vRa.d, n4));
                    return new xJ(yk2, t6, (t)object);
                }
            }
            n5 = n6;
        }
        yk yk4 = ((Xj_2)((Object)a2)).J((String)b2.get(n2));
        return new xJ(yk4, ((Xj_2)((Object)a2)).f(b2.subList(uSa.E, n2)), ((Xj_2)((Object)a2)).f(b2.subList(n2 + vRa.d, n4)));
    }

    public int J(List<Object> list) {
        List<Object> b2 = list;
        Xj_2 a2 = this;
        Object object = b2;
        return a2.J((List<Object>)object, object.size() - vRa.d);
    }

    public Xj J() {
        Xj_2 a2;
        a2.A = uSa.E;
        return a2;
    }

    public WK J(String string) {
        String b2 = string;
        Xj_2 a2 = this;
        return a2.I.get(b2);
    }

    public t J(String string, List<Object> list) throws Exception {
        Object object;
        Object a2;
        String c2 = string;
        Xj_2 b2 = this;
        if (c2.equals(dqa.O)) {
            return new fL(b2.f((List<Object>)a2));
        }
        if (c2.startsWith(dqa.O) && c2.length() > vRa.d) {
            return new fL(b2.J(c2.substring(vRa.d), (List<Object>)a2));
        }
        if (c2.equals(Vua.m)) {
            return new Pk((t)new TL(b2.f((List<Object>)a2)));
        }
        if (c2.startsWith(Vua.m) && c2.length() > vRa.d) {
            return new Pk(b2.J(c2.substring(vRa.d), (List<Object>)a2));
        }
        if (!b2.J.containsKey(c2)) {
            throw new Exception(new StringBuilder().insert(3 ^ 3, KPa.Q).append(c2).append(Lqa.z).toString());
        }
        ArrayList<t> arrayList = new ArrayList<t>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            object = a2.next();
            if (object.equals(yra.t)) {
                arrayList.add(b2.f(arrayList2));
                arrayList2.clear();
                continue;
            }
            arrayList2.add(object);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(b2.f(arrayList2));
        }
        a2 = b2.J.get(c2);
        Class[] classArray = new Class[uqa.g];
        classArray[uSa.E] = t[].class;
        classArray[vRa.d] = String.class;
        object = ((Class)a2).getConstructor(classArray);
        Object[] objectArray = new Object[uqa.g];
        ArrayList<t> arrayList3 = arrayList;
        objectArray[uSa.E] = arrayList3.toArray(new t[arrayList3.size()]);
        objectArray[vRa.d] = c2;
        return ((Constructor)object).newInstance(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public int J(List<Object> list, int n2) {
        int c2 = n2;
        Xj_2 a2 = this;
        int n3 = c2 = c2;
        while (n3 >= 0) {
            block3: {
                block4: {
                    Object var4_6;
                    void b2;
                    Object e2 = b2.get(c2);
                    if (!a2.f(e2)) break block3;
                    if (!e2.equals(Vua.m)) break block4;
                    e2 = c2 < b2.size() - vRa.d ? b2.get(c2 + vRa.d) : null;
                    Object v1 = var4_6 = c2 > 0 ? b2.get(c2 - vRa.d) : null;
                    if (e2 instanceof List && (a2.f((Object)var4_6) || var4_6 == null)) break block3;
                }
                return c2;
            }
            n3 = --c2;
        }
        return pua.o;
    }

    public String[] J(String string) throws Exception {
        int n2;
        String b2 = string;
        Xj_2 a2 = this;
        if (a2.A && !b2.matches(Yua.Y)) {
            throw new Exception(new StringBuilder().insert(3 ^ 3, Bua.h).append(b2).append(VQa.s).toString());
        }
        String[] stringArray = b2.split(ySa.U);
        int n3 = uSa.E;
        int n4 = uSa.E;
        String[] stringArray2 = stringArray;
        int n5 = stringArray.length;
        int n6 = n2 = uSa.E;
        while (n6 < n5) {
            String string2 = stringArray2[n2];
            if (string2.equals(pPa.k)) {
                ++n3;
            } else if (string2.equals(hpa.b)) {
                ++n4;
            }
            n6 = ++n2;
        }
        if (n3 != n4) {
            throw new Exception(new StringBuilder().insert(3 & 4, Bua.h).append(b2).append(UOa.u).append(n3).append(xqa.E).append(n4).append(vpa.l).toString());
        }
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    public List<Object> J(String[] var1_1) {
        var3_2 = this;
        var7_3 = new ArrayList<Object>();
        b = Mqa.y;
        var4_4 = ((void)a).length;
        var5_5 = uSa.E;
        v0 = var6_6 = uSa.E;
        while (v0 < var4_4) {
            block18: {
                block20: {
                    block19: {
                        var2_7 = a[var6_6];
                        if (var6_6 >= ((void)a).length - vRa.d) ** GOTO lbl-1000
                        if (var3_2.f((String)var2_7 + (String)a[var6_6 + vRa.d])) {
                            v1 = vRa.d;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v1 = var8_8 = uSa.E;
                        }
                        if (var2_7.equals(SRa.b)) {
                            v2 = var5_5 = var5_5 == 0 ? vRa.d : uSa.E;
                        }
                        if (var5_5 == 0) break block19;
                        b = new StringBuilder().insert(5 >> 3, (String)b).append((String)var2_7).toString();
                        break block18;
                    }
                    if (!var3_2.f((String)var2_7) && var8_8 == 0 && !var2_7.equals(yra.t)) break block20;
                    if (!var2_7.equals(Vua.m)) ** GOTO lbl-1000
                    var9_9 = var7_3.size();
                    var10_10 = b.trim().isEmpty();
                    var11_11 = var9_9 == 0 && var10_10 != 0 ? vRa.d : uSa.E;
                    v3 = var12_13 = var9_9 > 0 && (var3_2.f(var7_3.get(var9_9 - vRa.d)) != false || var7_3.get(var9_9 - vRa.d).equals(yra.t) != false) && var10_10 != 0 ? vRa.d : uSa.E;
                    if (var11_11 != 0 || var12_13 != 0) {
                        b = new StringBuilder().insert(3 & 4, (String)b).append((String)var2_7).toString();
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (!b.isEmpty()) {
                            var7_3.add(b);
                            b = Mqa.y;
                        }
                        v4 = var7_3;
                        if (var8_8 != 0) {
                            v5 = a[var6_6 + vRa.d];
                            ++var6_6;
                            v4.add(new StringBuilder().insert(3 >> 2, (String)var2_7).append((String)v5).toString());
                        } else {
                            v4.add(var2_7);
                        }
                    }
                    break block18;
                }
                if (var2_7.equals(pPa.k)) {
                    if (!b.isEmpty()) {
                        var7_3.add(b);
                        b = Mqa.y;
                    }
                    var9_9 = vRa.d;
                    v6 = var6_6 + vRa.d;
                    while (v6 < var4_4) {
                        var11_12 = a[var10_10];
                        if (var11_12.equals(pPa.k)) {
                            v7 = ++var9_9;
                        } else {
                            if (var11_12.equals(hpa.b)) {
                                // empty if block
                            }
                            v7 = --var9_9;
                        }
                        if (v7 == 0) {
                            var7_3.add(var3_2.J(b.split(ySa.U)));
                            var6_6 = var10_10;
                            b = Mqa.y;
                            break;
                        }
                        b = new StringBuilder().insert(2 & 5, (String)b).append((String)var11_12).toString();
                        v6 = ++var10_10;
                    }
                } else {
                    b = new StringBuilder().insert(5 >> 3, (String)b).append((String)var2_7).toString();
                }
            }
            v0 = ++var6_6;
        }
        if (!b.isEmpty()) {
            var7_3.add(b);
        }
        return var3_2.J(var7_3);
    }

    public void J(WK wK2) {
        Xj_2 b2 = wK2;
        Xj_2 a2 = this;
        a2.I.put(b2.f(), (WK)b2);
    }

    /*
     * WARNING - void declaration
     */
    public t J(List<Object> list) throws Exception {
        int n2;
        void a2;
        Xj_2 xj_2 = this;
        int n3 = pua.o;
        int n4 = uSa.E;
        int b2 = pua.o;
        int n5 = uSa.E;
        int n6 = a2.size();
        int n7 = n2 = uSa.E;
        while (n7 < n6) {
            Object e2 = a2.get(n2);
            if (e2 instanceof String) {
                if (e2.equals(vRa.A)) {
                    if (n3 == pua.o) {
                        n3 = n2;
                    }
                    ++n4;
                } else if (e2.equals(Era.Aa)) {
                    if (n5 + vRa.d == n4 && b2 == pua.o) {
                        b2 = n2;
                    }
                    ++n5;
                }
            }
            n7 = ++n2;
        }
        if (n4 == n5 && n3 > 0 && n3 + vRa.d < b2 && b2 < n6 - vRa.d) {
            return new ML(xj_2.f(a2.subList(uSa.E, n3)), xj_2.f(a2.subList(n3 + vRa.d, b2)), xj_2.f(a2.subList(b2 + vRa.d, n6)));
        }
        return null;
    }

    public boolean f(String string) {
        String b2 = string;
        Xj_2 a2 = this;
        if (yk.OPERATORS.contains(b2) || b2.equals(vRa.A) || b2.equals(Era.Aa)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public yk J(String string) throws Exception {
        void a2;
        int b2;
        Xj_2 xj_2 = this;
        yk[] ykArray = yk.values();
        int n2 = ykArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            yk yk2 = ykArray[b2];
            if (yk2.sign.equals(a2)) {
                return yk2;
            }
            n3 = ++b2;
        }
        throw new Exception(new StringBuilder().insert(5 >> 3, FPa.x).append((String)a2).append(YSa.ia).toString());
    }

    public boolean J(String string) {
        String b2 = string;
        Xj_2 a2 = this;
        return b2.matches(Ora.g);
    }

    /*
     * WARNING - void declaration
     */
    private List<Object> J(List<Object> list) {
        void a2;
        int n2;
        Xj_2 xj_2 = this;
        ArrayList b2 = new ArrayList();
        int n3 = n2 = uSa.E;
        while (n3 < a2.size()) {
            Object e2 = a2.get(n2);
            if (e2 instanceof String) {
                String string = ((String)e2).trim();
                if (!string.isEmpty()) {
                    b2.add(string);
                }
            } else {
                b2.add(xj_2.J((List)e2));
            }
            n3 = ++n2;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public t J(Object object) throws Exception {
        void a2;
        Xj_2 xj_2 = this;
        if (a2 instanceof String) {
            Object b2 = (String)a2;
            if (((String)b2).startsWith(dqa.O)) {
                return new fL(xj_2.J((Object)((String)b2).substring(vRa.d)));
            }
            if (((String)b2).startsWith(SRa.b) && ((String)b2).endsWith(SRa.b)) {
                Object object2 = b2;
                return new wk(((String)object2).substring(vRa.d, ((String)object2).length() - vRa.d));
            }
            if (xj_2.J((String)b2)) {
                return new wk(Double.parseDouble((String)b2));
            }
            if (xj_2.J(b2)) {
                if (((String)b2).startsWith(Vua.m)) {
                    WK wK2 = xj_2.J((String)(b2 = ((String)b2).substring(vRa.d)));
                    if (wK2 != null) {
                        return new Pk((t)wK2);
                    }
                } else {
                    WK wK3 = xj_2.J((String)b2);
                    if (wK3 != null) {
                        return wK3;
                    }
                }
            }
        } else if (a2 instanceof List) {
            return new TL(xj_2.f((List)a2));
        }
        throw new Exception(new StringBuilder().insert(3 & 4, Fsa.V).append(a2).toString());
    }

    public t J(String string) throws Exception {
        Xj_2 a2;
        String b2 = string;
        Xj_2 xj_2 = a2 = this;
        return xj_2.f(xj_2.J(xj_2.J(b2)));
    }

    public Xj_2() {
        Xj_2 a2;
        Xj_2 xj_2 = a2;
        Xj_2 xj_22 = a2;
        xj_2.I = new sK();
        xj_22.J = new HashMap<String, Class<? extends RL>>();
        xj_2.A = vRa.d;
        xj_2.J(new WK(xua.C, lQa.f));
        xj_2.J(new WK(xqa.X, TPa.a));
        xj_2.J.put(BQa.C, zL.class);
        a2.J.put(mSa.s, GL.class);
        a2.J.put(Yra.l, Tk.class);
        a2.J.put(Lqa.r, mj.class);
        a2.J.put(fqa.la, IJ.class);
        a2.J.put(fpa.s, JL.class);
        a2.J.put(Bua.r, vk.class);
        a2.J.put(kua.A, qk.class);
        a2.J.put(yRa.Q, QL.class);
        a2.J.put(lTa.ja, CK.class);
        a2.J.put(JQa.D, Hl.class);
        a2.J.put(PQa.S, nJ.class);
        a2.J.put(XOa.J, el.class);
        a2.J.put(nqa.U, Lj.class);
        a2.J.put(ypa.r, gJ.class);
        a2.J.put(RPa.D, ik.class);
        a2.J.put(vua.A, PJ.class);
        a2.J.put(Tqa.v, xL.class);
        a2.J.put(PTa.R, gL.class);
        a2.J.put(bqa.W, xK.class);
        a2.J.put(Ira.J, bK.class);
        a2.J.put(iSa.Y, Mk.class);
        a2.J.put(yQa.Aa, Xk.class);
        a2.J.put(Psa.A, UJ.class);
        a2.J.put(Yua.ca, XK.class);
        a2.J.put(IPa.M, ql.class);
        a2.J.put(WRa.r, rJ.class);
        a2.J.put(BRa.s, dK.class);
        a2.J.put(Nta.P, yj.class);
    }
}

