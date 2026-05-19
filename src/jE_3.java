/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  NCa
 *  WSa
 *  Waa
 *  jE
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jE_3
implements D {
    public Map<String, CE> actions;

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        Iterator iterator;
        jE_3 jE_32 = this;
        jE_32.actions.clear();
        Iterator iterator2 = iterator = a2.J().iterator();
        while (iterator2.hasNext()) {
            Object b2 = (String)iterator.next();
            NCa nCa2 = a2.J((String)b2);
            jE_3 jE_33 = jE_32;
            b2 = jE_33.J((String)b2);
            CE cE2 = new CE((String)b2);
            cE2.J(nCa2);
            jE_33.actions.put((String)b2, cE2);
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public CE J(String string) {
        void a2;
        jE_3 jE_32 = this;
        Object b2 = jE_32.actions.get(a2);
        if (b2 == null) {
            return new CE((String)a2);
        }
        return b2;
    }

    public jE_3() {
        jE_3 a2;
        jE_3 jE_32 = a2;
        jE_32.actions = new HashMap<String, CE>();
    }

    public String J(String string) {
        String b2 = string;
        jE_3 a2 = this;
        return b2.replaceAll(sra.T, WSa.b).toLowerCase();
    }

    public Waa J(Waa waa2) {
        Waa a2;
        jE_3 jE_32 = this;
        if (jE_32.actions.isEmpty()) {
            return null;
        }
        if (a2 == null) {
            a2 = new Waa();
        }
        for (Map.Entry<String, CE> b22 : jE_32.actions.entrySet()) {
            CE cE2 = b22.getValue();
            String b22 = b22.getKey();
            if (b22.equals(cE2.J()) && cE2.J()) continue;
            a2.J(b22, cE2.J());
        }
        return a2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        jE_3 a2 = this;
        if (b2 instanceof jE_3) {
            jE_3 jE_32 = (jE_3)b2;
            return Objects.equals(a2.actions, jE_32.actions);
        }
        return super.equals(b2);
    }

    public void J(jE jE2) {
        jE_3 a2;
        jE_3 b2 = jE2;
        jE_3 jE_32 = a2 = this;
        jE_32.actions.clear();
        jE_32.actions.putAll(b2.actions);
    }
}

