/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  NPa
 *  PTa
 *  Qta
 *  Vua
 *  Waa
 *  bpa
 *  bz
 *  kqa
 *  lPa
 *  pz
 *  uQa
 *  vRa
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KX {
    private static final String A = "CL_00000136";
    private TreeMap I;

    public String J(String string) {
        Object b2 = string;
        KX a2 = this;
        if ((b2 = (pz)a2.I.get(b2)) != null) {
            return b2.J();
        }
        return Mqa.y;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, bz bz2) {
        void a2;
        Object c2 = string;
        KX b2 = this;
        if ((c2 = (pz)b2.I.get(c2)) != null && (c2.J() == a2 || a2 == bz.ANY_VALUE)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        Iterator iterator;
        KX kX2 = this;
        Iterator iterator2 = iterator = a2.J().iterator();
        while (iterator2.hasNext()) {
            String b2 = (String)iterator.next();
            String string = a2.J(b2);
            iterator2 = iterator;
            kX2.J(b2, string);
        }
    }

    public String[] J() {
        KX a2;
        Set set = a2.I.keySet();
        return set.toArray(new String[set.size()]);
    }

    public Waa J() {
        Iterator iterator;
        KX kX2 = this;
        Waa waa2 = new Waa();
        Iterator iterator2 = iterator = kX2.I.keySet().iterator();
        while (iterator2.hasNext()) {
            KX a2 = iterator.next();
            pz pz2 = (pz)kX2.I.get(a2);
            waa2.J((String)((Object)a2), pz2.J());
            iterator2 = iterator;
        }
        return waa2;
    }

    public boolean f(String string) {
        Object b2 = string;
        KX a2 = this;
        if ((b2 = (pz)a2.I.get(b2)) != null) {
            return b2.J();
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void a2;
        void b2;
        KX kX2 = this;
        KX c2 = (pz)kX2.I.get(b2);
        if (c2 != null) {
            c2.J((String)a2);
            return;
        }
        kX2.J((String)b2, (String)a2, bz.ANY_VALUE);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2, bz bz2) {
        void b2;
        void c2;
        KX d2 = bz2;
        KX a2 = this;
        a2.I.put(c2, new pz((String)b2, (bz)d2));
    }

    public int J(String string) {
        Object b2 = string;
        KX a2 = this;
        if ((b2 = (pz)a2.I.get(b2)) != null) {
            return b2.J();
        }
        return uSa.E;
    }

    public boolean J(String string) {
        String b2 = string;
        KX a2 = this;
        return a2.I.containsKey(b2);
    }

    public KX() {
        KX a2;
        KX kX2 = a2;
        kX2.I = new TreeMap();
        a2.J(bpa.Da, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(kqa.N, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(STa.b, MRa.E, bz.BOOLEAN_VALUE);
        kX2.J(uQa.Ga, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(Gua.H, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(Qta.Ja, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(qQa.y, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(lPa.L, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(Ora.Y, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(PTa.Ka, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(cTa.X, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(Vua.C, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(cPa.e, NPa.ca, bz.NUMERICAL_VALUE);
        kX2.J(Ura.Q, oQa.l, bz.BOOLEAN_VALUE);
        kX2.J(oQa.Aa, MRa.E, bz.BOOLEAN_VALUE);
    }
}

