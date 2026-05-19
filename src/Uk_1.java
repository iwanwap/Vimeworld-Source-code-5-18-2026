/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Fl
 *  JQa
 *  JSa
 *  JTa
 *  Lqa
 *  PTa
 *  Pj
 *  Ql
 *  RPa
 *  TQa
 *  URa
 *  Uk
 *  Vl
 *  WK
 *  Xj
 *  Yl
 *  Ypa
 *  Yra
 *  ZOa
 *  aSa
 *  aqa
 *  bqa
 *  fpa
 *  il
 *  jRa
 *  sk
 *  ura
 *  vK
 *  vRa
 *  wk
 *  wl
 *  yQa
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Uk_1
extends Xj {
    public static final String k = "return ";
    private sk j;
    public static final Ak J = new vK(null, (t)new wk(aSa.V));
    public static final Ak A = new vK(null, (t)new wk(oua.i));
    private boolean I;

    public Ak f(JsonElement jsonElement) throws Ql {
        Object b2 = jsonElement;
        Uk_1 a2 = this;
        if (((JsonElement)b2).isJsonPrimitive()) {
            if (((JsonPrimitive)(b2 = ((JsonElement)b2).getAsJsonPrimitive())).isString()) {
                try {
                    return new vK((Uk)a2, (t)new wk(Double.parseDouble(((JsonPrimitive)b2).getAsString())));
                }
                catch (Exception exception) {
                    return a2.J(((JsonPrimitive)b2).getAsString());
                }
            }
            return new vK((Uk)a2, (t)new wk(((JsonPrimitive)b2).getAsDouble()));
        }
        return J;
    }

    /*
     * WARNING - void declaration
     */
    public WK J(String string) {
        void a2;
        Uk_1 b2;
        Uk_1 uk_1 = this;
        Object object = b2 = uk_1.j == null ? null : (WK)uk_1.j.A.get(a2);
        if (b2 == null) {
            b2 = super.J((String)a2);
        }
        if (b2 == null) {
            b2 = new WK((String)a2, aSa.V);
            uk_1.J((WK)b2);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, double d2) {
        Object c2 = string;
        Uk_1 b2 = this;
        if ((c2 = b2.J((String)c2)) != null) {
            void a2;
            c2.J((double)a2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Ak f(String string) throws Ql {
        String a2;
        Uk_1 uk_1 = this;
        if ((a2 = a2.trim()).startsWith(rSa.N)) {
            try {
                Uk_1 uk_12 = uk_1;
                return new vK((Uk)uk_12, uk_12.J(a2.substring(rSa.N.length()))).J();
            }
            catch (Exception b2) {
                throw new Ql(new StringBuilder().insert(3 ^ 3, hQa.Q).append(a2).append(Vra.W).toString());
            }
        }
        try {
            Uk_1 uk_13 = uk_1;
            Object b2 = uk_13.J(uk_13.J(a2));
            if (b2.size() >= yRa.d && b2.get(uSa.E) instanceof String && uk_1.J(b2.get(uSa.E)) && b2.get(vRa.d).equals(vTa.S)) {
                String string2 = (String)b2.get(uSa.E);
                Object object = b2;
                b2 = object.subList(uqa.g, object.size());
                WK wK2 = null;
                if (!(uk_1.I || uk_1.I.containsKey(string2) || uk_1.j.A.containsKey(string2))) {
                    wK2 = new WK(string2, aSa.V);
                    uk_1.j.A.put(string2, wK2);
                } else {
                    wK2 = uk_1.J(string2);
                }
                Uk_1 uk_14 = uk_1;
                return new Vl((Uk)uk_14, wK2, uk_14.l((List<Object>)b2));
            }
            Uk_1 uk_15 = uk_1;
            return new vK((Uk)uk_15, uk_15.l((List<Object>)b2));
        }
        catch (Exception b2) {
            throw new Ql(new StringBuilder().insert(3 ^ 3, VPa.H).append(a2).append(Vra.W).toString());
        }
    }

    public Ak J(String string) throws Ql {
        int n2;
        sk a2;
        Uk_1 uk_1 = this;
        ArrayList<String> arrayList = new ArrayList<String>();
        a2 = a2.toLowerCase().trim().split(rua.Aa);
        int b22 = ((String[])a2).length;
        int n3 = n2 = uSa.E;
        while (n3 < b22) {
            String string2 = a2[n2];
            if (!string2.trim().isEmpty()) {
                arrayList.add(string2);
            }
            n3 = ++n2;
        }
        if (arrayList.size() == 0) {
            throw new Ql(dqa.E);
        }
        uk_1.j = a2 = new sk((Uk)uk_1);
        try {
            for (String string3 : arrayList) {
                a2.I.add(uk_1.f(string3));
            }
        }
        catch (Exception b22) {
            uk_1.j = null;
            throw b22;
        }
        uk_1.j = null;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string, String string2) {
        void b2;
        Object c2 = string2;
        Uk_1 a2 = this;
        a2.J.put(c2, a2.J.remove(b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void b2;
        Object c2 = string2;
        Uk_1 a2 = this;
        a2.I.put((String)c2, a2.I.remove(b2));
    }

    public Uk_1() {
        Uk_1 a2;
        Uk_1 uk_1 = a2;
        uk_1.J.put(nqa.U, Yl.class);
        a2.J.put(ypa.r, mK.class);
        a2.J.put(RPa.D, il.class);
        a2.J.put(vua.A, Fl.class);
        a2.J.put(Tqa.v, wl.class);
        a2.J.put(PTa.R, Pj.class);
        Uk_1 uk_12 = a2;
        uk_12.f(kua.A, Jra.ba);
        uk_12.f(Yra.l, ZOa.S);
        uk_12.f(fqa.la, ypa.O);
        uk_12.f(nqa.U, ura.Aa);
        uk_12.f(yRa.Q, URa.L);
        uk_12.f(BQa.C, uua.Ja);
        uk_12.f(bqa.W, NSa.H);
        uk_12.f(Ira.J, ypa.g);
        uk_12.f(lTa.ja, Jsa.k);
        uk_12.f(fpa.s, bsa.Aa);
        uk_12.f(Bua.r, JSa.F);
        uk_12.f(PQa.S, aqa.E);
        uk_12.f(XOa.J, bqa.y);
        uk_12.f(iSa.Y, fPa.n);
        uk_12.f(mSa.s, TOa.g);
        uk_12.f(ypa.r, wsa.x);
        uk_12.f(JQa.D, JTa.b);
        uk_12.f(Lqa.r, rRa.c);
        uk_12.f(RPa.D, jRa.z);
        uk_12.f(vua.A, bsa.ga);
        uk_12.f(Tqa.v, aua.Ja);
        uk_12.f(PTa.R, csa.k);
        uk_12.f(yQa.Aa, zta.h);
        uk_12.f(Psa.A, Ypa.q);
        uk_12.f(Yua.ca, JSa.h);
        uk_12.f(IPa.M, Mqa.K);
        uk_12.J(xua.C, TQa.U);
    }

    public Ak J(JsonElement jsonElement) throws Ql {
        Object b2 = jsonElement;
        Uk_1 a2 = this;
        a2.I = vRa.d;
        b2 = a2.f((JsonElement)b2);
        a2.I = uSa.E;
        return b2;
    }

    public boolean f(String string) {
        Object a2 = this;
        String b2 = string;
        if (super.f(b2) || b2.equals(vTa.S)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private t l(List<Object> list) throws Ql {
        Object b22 = list;
        Uk_1 a2 = this;
        try {
            return a2.f((List)b22);
        }
        catch (Exception b22) {
            b22.printStackTrace();
            throw new Ql(Hra.F);
        }
    }
}

