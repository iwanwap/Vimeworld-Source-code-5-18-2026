/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  IMa
 *  Qta
 *  ac
 *  cQa
 *  cra
 *  fTa
 *  jna
 *  kpa
 *  lPa
 *  pua
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class jna_1
extends EC {
    private final EC C;
    private final List<String> i;
    private IMa M;
    private final List<String> k;
    private final Cia j;
    private String[] J;
    private String A;
    private ac I;

    public void J(ac ac2) throws IOException {
        jna_1 b2 = ac2;
        jna_1 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C == uqa.g) {
                jna_1 jna_12 = a2;
                jna_12.j.d();
                jna_12.j.d();
                jna_12.g.J(a2.C);
            }
            if (((ac)b2).C == vRa.d) {
                a2.j.f(Fha.SNOOPER_ENABLED, vRa.d);
                a2.I.i = a2.j.J(Fha.SNOOPER_ENABLED);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public jna_1(EC eC2, Cia cia) {
        void b2;
        jna_1 a2;
        jna_1 c2 = cia;
        jna_1 jna_12 = a2 = this;
        a2.k = Lists.newArrayList();
        a2.i = Lists.newArrayList();
        jna_12.C = b2;
        jna_12.j = c2;
    }

    public static /* synthetic */ List f(jna a2) {
        return a2.i;
    }

    public static /* synthetic */ List J(jna a2) {
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        int n4;
        void a2;
        void b2;
        void c2;
        jna_1 jna_12;
        jna_1 jna_13 = jna_12 = this;
        jna_13.i();
        jna_13.M.J((int)c2, (int)b2, (float)a2);
        jna_1.J((String)jna_13.A, (int)(jna_12.A / uqa.g), (int)Yqa.i, (int)pua.o);
        int d2 = cQa.o;
        String[] stringArray = jna_13.J;
        int n5 = stringArray.length;
        int n6 = n4 = uSa.E;
        while (n6 < n5) {
            String string = stringArray[n4];
            jna_1.J((String)string, (int)(jna_12.A / uqa.g), (int)d2, (int)Qta.L);
            d2 += jna_12.L.u;
            n6 = ++n4;
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void A() {
        Object object;
        jna_1 jna_12 = this;
        jna_12.A = oha.J(nqa.Ha, new Object[uSa.E]);
        Object object2 = oha.J(xqa.G, new Object[uSa.E]);
        Object a2 = Lists.newArrayList();
        Object object3 = object2 = jna_12.L.J((String)object2, (int)(jna_12.A - Fsa.d)).iterator();
        while (object3.hasNext()) {
            object = object2.next();
            a2.add((String)object);
            object3 = object2;
        }
        Object object4 = a2;
        jna_12.J = object4.toArray(new String[object4.size()]);
        jna_1 jna_13 = jna_12;
        jna_13.k.clear();
        jna_13.i.clear();
        jna_12.I = new ac(vRa.d, (int)(jna_12.A / uqa.g - kpa.Ha), (int)(jna_12.I - Fsa.d), Jpa.Ha, kTa.j, jna_12.j.J(Fha.SNOOPER_ENABLED));
        jna_13.E.add(jna_12.I);
        jna_12.E.add(new ac(uqa.g, (int)(jna_12.A / uqa.g + uqa.g), (int)(jna_12.I - Fsa.d), Jpa.Ha, kTa.j, oha.J(cra.g, new Object[uSa.E])));
        int n2 = jna_12.g.J() != null && jna_12.g.J().J() != null ? vRa.d : uSa.E;
        object = new TreeMap(jna_12.g.J().J()).entrySet().iterator();
        Iterator iterator = object;
        while (iterator.hasNext()) {
            a2 = (Map.Entry)object.next();
            jna_12.k.add((n2 != 0 ? lPa.n : Mqa.y) + (String)a2.getKey());
            jna_1 jna_14 = jna_12;
            jna_14.i.add(jna_14.L.J((String)a2.getValue(), (int)(jna_12.A - fTa.Ja)));
            iterator = object;
        }
        if (n2 != 0) {
            object = new TreeMap(jna_12.g.J().J().J()).entrySet().iterator();
            Iterator iterator2 = object;
            while (iterator2.hasNext()) {
                a2 = (Map.Entry)object.next();
                jna_12.k.add(new StringBuilder().insert(3 ^ 3, ypa.w).append((String)a2.getKey()).toString());
                jna_1 jna_15 = jna_12;
                jna_15.i.add(jna_15.L.J((String)a2.getValue(), (int)(jna_12.A - fTa.Ja)));
                iterator2 = object;
            }
        }
        jna_12.M = new IMa((jna)jna_12);
    }

    public void d() throws IOException {
        jna_1 a2;
        jna_1 jna_12 = a2;
        super.d();
        jna_12.M.f();
    }
}

