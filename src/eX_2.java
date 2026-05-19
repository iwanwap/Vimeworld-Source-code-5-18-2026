/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cQa
 *  fB
 *  pua
 */
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class eX_2
implements fB {
    private final List J;
    private final IdentityHashMap A;
    private static final String I = "CL_00001203";

    public int J(Object object) {
        Object b2 = object;
        eX_2 a2 = this;
        if ((b2 = (Integer)a2.A.get(b2)) == null) {
            return pua.o;
        }
        return (Integer)b2;
    }

    public Iterator iterator() {
        eX_2 a2;
        return Iterators.filter(a2.J.iterator(), Predicates.notNull());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Object object, int n2) {
        void b2;
        eX_2 a2;
        int c2 = n2;
        eX_2 eX_22 = a2 = this;
        eX_2 eX_23 = eX_22;
        eX_22.A.put(b2, c2);
        while (eX_23.J.size() <= c2) {
            eX_2 eX_24 = a2;
            eX_23 = eX_24;
            eX_24.J.add(null);
        }
        a2.J.set(c2, b2);
    }

    public eX_2() {
        eX_2 a2;
        eX_2 eX_22 = a2;
        a2.A = new IdentityHashMap(cQa.z);
        eX_22.J = Lists.newArrayList();
    }

    public final Object J(int n2) {
        int b2 = n2;
        eX_2 a2 = this;
        if (b2 >= 0 && b2 < a2.J.size()) {
            return a2.J.get(b2);
        }
        return null;
    }

    public List J() {
        eX_2 a2;
        return a2.J;
    }
}

