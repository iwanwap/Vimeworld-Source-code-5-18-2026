/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fpa
 *  MBa
 *  Qsa
 *  UD
 *  VQa
 *  ZOa
 *  Zpa
 *  aSa
 *  asa
 *  bpa
 *  bua
 *  uKa
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gda_3 {
    private String b;
    private static final String l = "CL_00001497";
    public boolean e;
    private static final int G;
    private static final int D;
    public boolean f;
    private final List F;
    private final List g = Lists.newArrayList();
    private boolean L;
    private static final Logger E;
    private static final int m;
    private static final int C;
    private static final int i;
    private static final String M = "scheduledExecutables";
    private static final String k = "preRenderErrors";
    private final Map j;
    private static final String J = "display";
    private static final String A = "tick";
    private static final String I = "render";

    public void f() {
        gda_3 a2;
        if (a2.L && a2.e) {
            String string;
            long l2;
            long l3 = System.nanoTime();
            gda_3 gda_32 = a2;
            long l4 = (Long)gda_32.F.remove(gda_32.F.size() - vRa.d);
            gda_3 gda_33 = a2;
            a2.g.remove(gda_33.g.size() - vRa.d);
            l3 -= l4;
            if (gda_33.j.containsKey(a2.b)) {
                gda_3 gda_34 = a2;
                gda_3 gda_35 = a2;
                gda_34.j.put(gda_34.b, (Long)gda_35.j.get(gda_35.b) + l3);
                l2 = l3;
            } else {
                gda_3 gda_36 = a2;
                gda_36.j.put(gda_36.b, l3);
                l2 = l3;
            }
            if (l2 > bua.k) {
                E.warn(new StringBuilder().insert(3 ^ 3, opa.f).append(a2.b).append(bpa.r).append((double)l3 / ZOa.ha).append(Fpa.N).toString());
            }
            if (!a2.g.isEmpty()) {
                gda_3 gda_37 = a2;
                string = (String)gda_37.g.get(gda_37.g.size() - vRa.d);
            } else {
                string = Mqa.y;
            }
            a2.b = string;
        }
    }

    public void f(String string) {
        String b2 = string;
        gda_3 a2 = this;
        if (a2.L) {
            gda_3 gda_32 = a2;
            gda_32.f();
            gda_32.J(b2);
        }
    }

    public List J(String string) {
        Object object2;
        gda_3 a2;
        Object b2 = string;
        gda_3 gda_32 = a2 = this;
        gda_32.L = gda_32.f;
        if (!gda_32.L) {
            MBa[] mBaArray = new MBa[vRa.d];
            mBaArray[uSa.E] = new MBa(gua.u, aSa.V, aSa.V);
            return new ArrayList<MBa>(Arrays.asList(mBaArray));
        }
        if (!a2.e) {
            return null;
        }
        long l2 = a2.j.containsKey(gua.u) ? (Long)a2.j.get(gua.u) : nqa.i;
        long l3 = a2.j.containsKey(b2) ? (Long)a2.j.get(b2) : fqa.Da;
        ArrayList<MBa> arrayList = Lists.newArrayList();
        if (((String)b2).length() > 0) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(VQa.ja).toString();
        }
        long l4 = nqa.i;
        for (Object object2 : a2.j.keySet()) {
            if (((String)object2).length() <= ((String)b2).length() || !((String)object2).startsWith((String)b2) || ((String)object2).indexOf(VQa.ja, ((String)b2).length() + vRa.d) >= 0) continue;
            l4 += ((Long)a2.j.get(object2)).longValue();
        }
        float f2 = l4;
        if (l4 < l3) {
            l4 = l3;
        }
        if (l2 < l4) {
            l2 = l4;
        }
        for (Object e2 : a2.j.keySet()) {
            String string2 = (String)e2;
            if (string2.length() <= ((String)b2).length() || !string2.startsWith((String)b2) || string2.indexOf(VQa.ja, ((String)b2).length() + vRa.d) >= 0) continue;
            l3 = (Long)a2.j.get(string2);
            double d2 = (double)l3 * fqa.W / (double)l4;
            double d3 = (double)l3 * fqa.W / (double)l2;
            string2 = string2.substring(((String)b2).length());
            arrayList.add(new MBa(string2, d2, d3));
        }
        object2 = a2.j.keySet().iterator();
        Iterator iterator = object2;
        while (iterator.hasNext()) {
            Object e2;
            e2 = object2.next();
            gda_3 gda_33 = a2;
            Object e3 = e2;
            gda_33.j.put(e3, (Long)gda_33.j.get(e3) * mSa.g / asa.fa);
            iterator = object2;
        }
        if ((float)l4 > f2) {
            arrayList.add(new MBa(Qsa.h, (double)((float)l4 - f2) * fqa.W / (double)l4, (double)((float)l4 - f2) * fqa.W / (double)l2));
        }
        ArrayList<MBa> arrayList2 = arrayList;
        Collections.sort(arrayList2);
        arrayList2.add(uSa.E, new MBa((String)b2, fqa.W, (double)l4 * fqa.W / (double)l2));
        return arrayList2;
    }

    public String J() {
        gda_3 a2;
        if (a2.g.size() == 0) {
            return gsa.l;
        }
        gda_3 gda_32 = a2;
        return (String)gda_32.g.get(gda_32.g.size() - vRa.d);
    }

    /*
     * Unable to fully structure code
     */
    public void J(String var1_1) {
        b = var1_1;
        a = this;
        if (UD.f()) {
            var2_2 = b.hashCode();
            if (var2_2 == gda_3.C && b.equals(gQa.n)) {
                UD.j.f();
            } else if (var2_2 == gda_3.G && b.equals(ERa.la) && Config.Ca()) {
                UD.j.J();
                UD.c.f();
            } else if (var2_2 == gda_3.i && b.equals(Fsa.X)) {
                UD.c.J();
            }
        }
        if (!Config.ha()) ** GOTO lbl22
        var2_2 = b.hashCode();
        if (var2_2 == gda_3.m && b.equals(Zpa.h)) {
            uKa.a = uSa.E;
            v0 = a;
        } else {
            if (var2_2 == gda_3.D && b.equals(Jpa.q)) {
                uKa.a = vRa.d;
            }
lbl22:
            // 4 sources

            v0 = a;
        }
        if (v0.L && a.e) {
            if (a.b.length() > 0) {
                v1 = a;
                a.b = a.b + VQa.ja;
            }
            a.b = new StringBuilder().insert(3 & 4, a.b).append(b).toString();
            a.g.add(a.b);
            a.F.add(System.nanoTime());
        }
    }

    public void J() {
        gda_3 a2;
        gda_3 gda_32 = a2;
        gda_32.j.clear();
        gda_32.b = Mqa.y;
        gda_32.g.clear();
        gda_32.L = gda_32.f;
    }

    public gda_3() {
        gda_3 a2;
        a2.F = Lists.newArrayList();
        a2.b = Mqa.y;
        a2.j = Maps.newHashMap();
        a2.L = a2.f = vRa.d;
    }

    static {
        E = LogManager.getLogger();
        C = gQa.n.hashCode();
        G = ERa.la.hashCode();
        i = Fsa.X.hashCode();
        m = Zpa.h.hashCode();
        D = Jpa.q.hashCode();
    }
}

