/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public final class dF_2
extends Properties {
    private Set<Object> keysOrdered;

    /*
     * WARNING - void declaration
     */
    @Override
    public synchronized Object put(Object object, Object object2) {
        void a2;
        dF_2 b2;
        Object c2 = object;
        dF_2 dF_22 = b2 = this;
        dF_22.keysOrdered.add(c2);
        return super.put(c2, (Object)a2);
    }

    @Override
    public synchronized Enumeration<Object> keys() {
        dF_2 a2;
        return Collections.enumeration(a2.keySet());
    }

    @Override
    public Set<Object> keySet() {
        dF_2 dF_22;
        dF_2 dF_23 = dF_22 = this;
        Set<Object> a2 = super.keySet();
        dF_23.keysOrdered.retainAll(a2);
        return Collections.unmodifiableSet(dF_23.keysOrdered);
    }

    public dF_2() {
        dF_2 a2;
        dF_2 dF_22 = a2;
        dF_22.keysOrdered = new LinkedHashSet<Object>();
    }
}

