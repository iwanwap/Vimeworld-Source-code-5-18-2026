/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  Oz
 *  QFa
 *  Tpa
 *  Ypa
 *  bpa
 *  hra
 *  pPa
 *  pQa
 *  pua
 *  uV
 *  vRa
 *  xx
 *  yra
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uV_2 {
    private int J;
    private final List<xx> A = Lists.newArrayList();
    private final Map<String, Map<String, String>> I = Maps.newHashMap();

    public String toString() {
        uV_2 uV_22 = this;
        StringBuilder a2 = new StringBuilder();
        a2.append(yRa.d);
        a2.append(rua.Aa);
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < uV_22.A.size()) {
            if (n2 > 0) {
                a2.append(yra.t);
            }
            xx xx2 = uV_22.A.get(n2);
            a2.append(xx2.toString());
            n3 = ++n2;
        }
        a2.append(rua.Aa);
        a2.append(uV_22.J);
        if (!uV_22.I.isEmpty()) {
            a2.append(rua.Aa);
            n2 = uSa.E;
            Iterator<Map.Entry<String, Map<String, String>>> iterator = uV_22.I.entrySet().iterator();
            while (iterator.hasNext()) {
                Iterator iterator2 = iterator.next();
                if (n2++ > 0) {
                    a2.append(yra.t);
                }
                a2.append(iterator2.getKey().toLowerCase());
                if ((iterator2 = iterator2.getValue()).isEmpty()) continue;
                a2.append(pPa.k);
                int n4 = uSa.E;
                iterator2 = iterator2.entrySet().iterator();
                Iterator iterator3 = iterator2;
                while (iterator3.hasNext()) {
                    Map.Entry entry = iterator2.next();
                    if (n4++ > 0) {
                        a2.append(Tpa.E);
                    }
                    a2.append((String)entry.getKey());
                    a2.append(vTa.S);
                    a2.append((String)entry.getValue());
                    iterator3 = iterator2;
                }
                a2.append(hpa.b);
            }
        } else {
            a2.append(rua.Aa);
        }
        return a2.toString();
    }

    public int J() {
        uV_2 a2;
        return a2.J;
    }

    public static uV J() {
        uV_2 uV_22 = new uV_2();
        uV_22.J(Jy.Z.Ka);
        boolean bl = uV_22.J().add(new xx(vRa.d, QFa.bg));
        uV_2 uV_23 = uV_22;
        uV_22.J().add(new xx(uqa.g, QFa.Bc));
        uV_23.J().add(new xx(vRa.d, (Block)QFa.lf));
        uV_2 uV_24 = uV_22;
        uV_24.J();
        uV_24.J().put(bpa.p, Maps.newHashMap());
        return uV_23;
    }

    private static List<xx> J(int n2, String stringArray) {
        String[] b2 = stringArray;
        int a2 = n2;
        if (b2 != null && b2.length() >= vRa.d) {
            int n3;
            ArrayList<xx> arrayList = Lists.newArrayList();
            b2 = b2.split(yra.t);
            int n4 = uSa.E;
            int n5 = b2.length;
            int n6 = n3 = uSa.E;
            while (n6 < n5) {
                String string = b2[n3];
                if ((string = uV_2.J(a2, string, n4)) == null) {
                    return null;
                }
                arrayList.add((xx)string);
                n4 += string.f();
                n6 = ++n3;
            }
            return arrayList;
        }
        return null;
    }

    public List<xx> J() {
        uV_2 a2;
        return a2.A;
    }

    public uV_2() {
        uV_2 a2;
    }

    public void J() {
        Iterator<xx> iterator;
        uV_2 uV_22 = this;
        int n2 = uSa.E;
        Iterator<xx> iterator2 = iterator = uV_22.A.iterator();
        while (iterator2.hasNext()) {
            uV_2 a2 = iterator.next();
            iterator2 = iterator;
            int n3 = n2;
            a2.J(n3);
            n2 = n3 + a2.f();
        }
    }

    public void J(int n2) {
        int b2 = n2;
        uV_2 a2 = this;
        a2.J = b2;
    }

    public Map<String, Map<String, String>> J() {
        uV_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    private static xx J(int n2, String string, int n3) {
        String string2;
        void a2;
        void b22;
        int n4 = n2;
        String[] c2 = n4 >= yRa.d ? b22.split(APa.u, uqa.g) : b22.split(rRa.X, uqa.g);
        int b22 = vRa.d;
        int n5 = uSa.E;
        if (c2.length == uqa.g) {
            try {
                b22 = Integer.parseInt(c2[uSa.E]);
                if (a2 + b22 >= hra.Ja) {
                    b22 = hra.Ja - a2;
                }
                if (b22 < 0) {
                    b22 = uSa.E;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        Block block = null;
        try {
            Block block2;
            string2 = c2[c2.length - vRa.d];
            if (n4 < yRa.d) {
                c2 = string2.split(Era.Aa, uqa.g);
                if (c2.length > vRa.d) {
                    n5 = Integer.parseInt(c2[vRa.d]);
                }
                block2 = block = Block.f(Integer.parseInt(c2[uSa.E]));
            } else {
                Block block3;
                c2 = string2.split(Era.Aa, yRa.d);
                Block block4 = block = c2.length > vRa.d ? Block.J(new StringBuilder().insert(5 >> 3, c2[uSa.E]).append(Era.Aa).append(c2[vRa.d]).toString()) : null;
                if (block != null) {
                    n5 = c2.length > uqa.g ? Integer.parseInt(c2[uqa.g]) : uSa.E;
                    block3 = block;
                } else {
                    block = Block.J(c2[uSa.E]);
                    if (block != null) {
                        n5 = c2.length > vRa.d ? Integer.parseInt(c2[vRa.d]) : uSa.E;
                    }
                    block3 = block;
                }
                if (block3 == null) {
                    return null;
                }
                block2 = block;
            }
            if (block2 == QFa.HF) {
                n5 = uSa.E;
            }
            if (n5 < 0 || n5 > Ypa.A) {
                n5 = uSa.E;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        string2 = new xx(n4, b22, block, n5);
        string2.J((int)a2);
        return string2;
    }

    public static uV J(String string) {
        int n2;
        String string2 = string;
        if (string2 == null) {
            return uV_2.J();
        }
        String[] stringArray = string2.split(rua.Aa, pua.o);
        int n3 = n2 = stringArray.length == vRa.d ? uSa.E : Oz.J((String)stringArray[uSa.E], (int)uSa.E);
        if (n2 >= 0 && n2 <= yRa.d) {
            uV_2 uV_22 = new uV_2();
            int n4 = stringArray.length == vRa.d ? uSa.E : vRa.d;
            List<xx> list = uV_2.J(n2, stringArray[n4]);
            ++n4;
            List<xx> a222 = list;
            if (list != null && !a222.isEmpty()) {
                uV_22.J().addAll((Collection<xx>)a222);
                uV_22.J();
                int a222 = Jy.Z.Ka;
                if (n2 > 0 && stringArray.length > n4) {
                    int n5 = Oz.J((String)stringArray[n4], (int)a222);
                    ++n4;
                    a222 = n5;
                }
                uV_22.J(a222);
                if (n2 > 0 && stringArray.length > n4) {
                    String string3 = stringArray[n4].toLowerCase();
                    ++n4;
                    stringArray = string3.split(yra.t);
                    n2 = stringArray.length;
                    int n6 = n4 = uSa.E;
                    while (n6 < n2) {
                        String[] a222 = stringArray[n4].split(pQa.r, uqa.g);
                        HashMap<String, String> hashMap = Maps.newHashMap();
                        if (a222[uSa.E].length() > 0) {
                            uV_22.J().put(a222[uSa.E], hashMap);
                            if (a222.length > vRa.d && a222[vRa.d].endsWith(hpa.b) && a222[vRa.d].length() > vRa.d) {
                                a222 = a222[vRa.d].substring(uSa.E, a222[vRa.d].length() - vRa.d).split(Tpa.E);
                                int n7 = uSa.E;
                                while (n7 < a222.length) {
                                    int n8;
                                    String[] stringArray2 = a222[n8].split(vTa.S, uqa.g);
                                    if (stringArray2.length == uqa.g) {
                                        hashMap.put(stringArray2[uSa.E], stringArray2[vRa.d]);
                                    }
                                    n7 = ++n8;
                                }
                            }
                        }
                        n6 = ++n4;
                    }
                } else {
                    uV_22.J().put(bpa.p, Maps.newHashMap());
                }
                return uV_22;
            }
            return uV_2.J();
        }
        return uV_2.J();
    }
}

