/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RB
 *  lB
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lB_2 {
    private Set<String> J;
    private String A;
    private Map<String, String> I;

    public String[] J() {
        lB_2 a2;
        Set<String> set = a2.I.keySet();
        return set.toArray(new String[set.size()]);
    }

    public void J(Collection<String> collection) {
        Collection<String> b2 = collection;
        lB_2 a2 = this;
        a2.J.addAll(b2);
    }

    public void J(lB lB2) {
        lB_2 b2 = lB2;
        lB_2 a2 = this;
        if (b2 != null) {
            a2.I.putAll(b2.I);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(RB[] rBArray) {
        void a2;
        int n2;
        lB_2 lB_22 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ((void)a2).length) {
            void var3_4 = a2[n2];
            Object b2 = var3_4.e();
            if ((b2 = lB_22.I.get(b2)) != null) {
                var3_4.C((String)b2);
            }
            n3 = ++n2;
        }
    }

    public boolean J(String string) {
        String b2 = string;
        lB_2 a2 = this;
        return a2.J.contains(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void b2;
        String c2 = string2;
        lB_2 a2 = this;
        a2.I.put((String)b2, c2);
    }

    public Collection<String> J() {
        lB_2 a2;
        return new HashSet<String>(a2.J);
    }

    public String J(String string) {
        String b2 = string;
        lB_2 a2 = this;
        return a2.I.get(b2);
    }

    public lB_2(String string) {
        lB_2 a2;
        String b2 = string;
        lB_2 lB_22 = a2 = this;
        a2.A = null;
        lB_2 lB_23 = a2;
        lB_22.I = new HashMap<String, String>();
        lB_22.J = new HashSet<String>();
        lB_22.A = b2;
    }

    public void J(String string) {
        String b2 = string;
        lB_2 a2 = this;
        a2.J.add(b2);
    }

    public String J() {
        lB_2 a2;
        return a2.A;
    }
}

