/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Kna
 *  NTa
 *  Tpa
 *  ld
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public final class OMa {
    public OMa() {
        OMa a2;
    }

    /*
     * WARNING - void declaration
     */
    public static List<ld> J(ld ld2, int n2, P p, boolean bl, boolean bl2) {
        int n3;
        ld ld3 = ld2;
        int n4 = uSa.E;
        CY cY2 = new CY(Mqa.y);
        ArrayList<ld> arrayList = Lists.newArrayList();
        ArrayList<Object> arrayList2 = Lists.newArrayList(ld3);
        int n5 = n3 = uSa.E;
        while (n5 < arrayList2.size()) {
            int n6;
            void d2;
            void c2;
            Object object;
            void a2;
            Object e22;
            String string;
            ld ld4 = (ld)arrayList2.get(n3);
            String string2 = ld4.J();
            int n7 = uSa.E;
            if (string2.contains(SPa.O)) {
                String string3 = string2;
                int e22 = string3.indexOf(NTa.C);
                string = string3.substring(e22 + vRa.d);
                string2 = string3.substring(uSa.E, e22 + vRa.d);
                CY cY3 = new CY(string);
                cY3.J(ld4.J().J());
                arrayList2.add(n3 + vRa.d, cY3);
                n7 = vRa.d;
            }
            if (((String)(e22 = OMa.J(new StringBuilder().insert(3 >> 2, ld4.J().l()).append(string2).toString(), (boolean)a2))).endsWith(SPa.O)) {
                Object object2 = e22;
                object = ((String)object2).substring(uSa.E, ((String)object2).length() - vRa.d);
            } else {
                object = e22;
            }
            string = object;
            int n8 = c2.f(string);
            string2 = new CY(string);
            string2.J(ld4.J().J());
            if (n4 + n8 > d2) {
                Object object3;
                string = c2.J((String)e22, (int)(d2 - n4), uSa.E != 0);
                Object object4 = object3 = string.length() < ((String)e22).length() ? ((String)e22).substring(string.length()) : null;
                if (object3 != null && ((String)object3).length() > 0) {
                    int n9 = string.lastIndexOf(Tpa.E);
                    if (n9 >= 0 && c2.f(((String)e22).substring(uSa.E, n9)) > 0) {
                        void b2;
                        string = ((String)e22).substring(uSa.E, n9);
                        if (b2 != false) {
                            ++n9;
                        }
                        object3 = ((String)e22).substring(n9);
                    } else if (n4 > 0 && !((String)e22).contains(Tpa.E)) {
                        string = Mqa.y;
                        object3 = e22;
                    }
                    e22 = new CY((String)object3);
                    e22.J(ld4.J().J());
                    arrayList2.add(n3 + vRa.d, e22);
                }
                n8 = c2.f(string);
                string2 = new CY(string);
                string2.J(ld4.J().J());
                n7 = vRa.d;
            }
            if (n4 + n8 <= d2) {
                n4 += n8;
                n6 = n7;
                cY2.J((ld)string2);
            } else {
                n6 = n7 = vRa.d;
            }
            if (n6 != 0) {
                arrayList.add((ld)cY2);
                n4 = uSa.E;
                cY2 = new CY(Mqa.y);
            }
            n5 = ++n3;
        }
        ArrayList<ld> arrayList3 = arrayList;
        arrayList3.add((ld)cY2);
        return arrayList3;
    }

    public static String J(String string, boolean bl) {
        boolean b2 = bl;
        String a2 = string;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static List<ld> J(ld ld2, int n2, Kna kna2, boolean bl, boolean bl2) {
        int n3;
        ld ld3 = ld2;
        int n4 = uSa.E;
        CY cY2 = new CY(Mqa.y);
        ArrayList<ld> arrayList = Lists.newArrayList();
        ArrayList<Object> arrayList2 = Lists.newArrayList(ld3);
        int n5 = n3 = uSa.E;
        while (n5 < arrayList2.size()) {
            int n6;
            void d2;
            void c2;
            Object object;
            void a2;
            Object e22;
            String string;
            ld ld4 = (ld)arrayList2.get(n3);
            String string2 = ld4.J();
            int n7 = uSa.E;
            if (string2.contains(SPa.O)) {
                String string3 = string2;
                int e22 = string3.indexOf(NTa.C);
                string = string3.substring(e22 + vRa.d);
                string2 = string3.substring(uSa.E, e22 + vRa.d);
                CY cY3 = new CY(string);
                cY3.J(ld4.J().J());
                arrayList2.add(n3 + vRa.d, cY3);
                n7 = vRa.d;
            }
            if (((String)(e22 = OMa.J(new StringBuilder().insert(3 >> 2, ld4.J().l()).append(string2).toString(), (boolean)a2))).endsWith(SPa.O)) {
                Object object2 = e22;
                object = ((String)object2).substring(uSa.E, ((String)object2).length() - vRa.d);
            } else {
                object = e22;
            }
            string = object;
            int n8 = c2.J(string);
            string2 = new CY(string);
            string2.J(ld4.J().J());
            if (n4 + n8 > d2) {
                Object object3;
                string = c2.J((String)e22, (int)(d2 - n4), uSa.E != 0);
                Object object4 = object3 = string.length() < ((String)e22).length() ? ((String)e22).substring(string.length()) : null;
                if (object3 != null && ((String)object3).length() > 0) {
                    int n9 = string.lastIndexOf(Tpa.E);
                    if (n9 >= 0 && c2.J(((String)e22).substring(uSa.E, n9)) > 0) {
                        void b2;
                        string = ((String)e22).substring(uSa.E, n9);
                        if (b2 != false) {
                            ++n9;
                        }
                        object3 = ((String)e22).substring(n9);
                    } else if (n4 > 0 && !((String)e22).contains(Tpa.E)) {
                        string = Mqa.y;
                        object3 = e22;
                    }
                    e22 = new CY((String)object3);
                    e22.J(ld4.J().J());
                    arrayList2.add(n3 + vRa.d, e22);
                }
                n8 = c2.J(string);
                string2 = new CY(string);
                string2.J(ld4.J().J());
                n7 = vRa.d;
            }
            if (n4 + n8 <= d2) {
                n4 += n8;
                n6 = n7;
                cY2.J((ld)string2);
            } else {
                n6 = n7 = vRa.d;
            }
            if (n6 != 0) {
                arrayList.add((ld)cY2);
                n4 = uSa.E;
                cY2 = new CY(Mqa.y);
            }
            n5 = ++n3;
        }
        ArrayList<ld> arrayList3 = arrayList;
        arrayList3.add((ld)cY2);
        return arrayList3;
    }
}

