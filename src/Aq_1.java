/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DP
 *  NQ
 *  vRa
 *  xq
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Aq_1 {
    private final List<hQ> m;
    private boolean C;
    private String i;
    private final List<DP> M;
    private xq k = xq.OTHER;
    private final Map<UUID, NQ> j;
    private int J;
    private int A;
    private final List<Fq> I;

    public void f(String string) {
        String b2 = string;
        Aq_1 a2 = this;
        a2.i = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string) {
        int b2;
        Aq_1 aq_1 = this;
        xq[] xqArray = xq.values();
        int n2 = xqArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            xq xq2 = xqArray[b2];
            if (xq.access$000((xq)xq2).equals(a2)) {
                aq_1.k = xq2;
                return;
            }
            n3 = ++b2;
        }
        aq_1.k = xq.OTHER;
    }

    public void J(hQ hQ2) {
        hQ b2 = hQ2;
        Aq_1 a2 = this;
        a2.m.add(b2);
    }

    public List<Fq> l() {
        Aq_1 a2;
        return a2.I;
    }

    public Collection<NQ> J() {
        Aq_1 a2;
        return a2.j.values();
    }

    public DP J(int n2) {
        int b2 = n2;
        Aq_1 a2 = this;
        if (a2.M.size() <= b2) {
            return null;
        }
        return a2.M.get(b2);
    }

    public void J(DP dP) {
        Aq_1 b2 = dP;
        Aq_1 a2 = this;
        a2.M.add((DP)b2);
    }

    public void J(NQ nQ2) {
        Aq_1 b2 = nQ2;
        Aq_1 a2 = this;
        a2.j.put(b2.J(), (NQ)b2);
    }

    public List<hQ> f() {
        Aq_1 a2;
        return a2.m;
    }

    public boolean J() {
        Aq_1 a2;
        return a2.C;
    }

    public Aq_1() {
        Aq_1 a2;
        a2.C = vRa.d;
        Aq_1 aq_1 = a2;
        a2.M = new ArrayList<DP>();
        a2.j = new HashMap<UUID, NQ>();
        a2.I = new ArrayList<Fq>();
        a2.m = new ArrayList<hQ>();
    }

    public int f() {
        Aq_1 a2;
        return a2.J;
    }

    public xq J() {
        Aq_1 a2;
        return a2.k;
    }

    public int J() {
        Aq_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        Aq_1 a2;
        int c2 = n3;
        Aq_1 aq_1 = a2 = this;
        aq_1.A = b2;
        aq_1.J = c2;
    }

    public String J() {
        Aq_1 a2;
        return a2.i;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Aq_1 a2 = this;
        a2.C = b2;
    }

    public void J(Fq fq) {
        Fq b2 = fq;
        Aq_1 a2 = this;
        a2.I.add(b2);
    }

    public List<DP> J() {
        Aq_1 a2;
        return a2.M;
    }
}

