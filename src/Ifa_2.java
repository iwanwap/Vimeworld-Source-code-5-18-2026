/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Az
 *  RC
 *  kta
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class Ifa_2 {
    public final Map<RC, bA> J = Maps.newHashMap();
    public final Multimap<RC, RC> A;
    public final Map<String, bA> I;

    public abstract bA l(RC var1);

    public void f(Multimap<String, CEa> multimap) {
        Iterator b2 = multimap;
        Ifa_2 a2 = this;
        for (Map.Entry entry : b2.entries()) {
            bA bA2 = a2.J((String)entry.getKey());
            if (bA2 == null) continue;
            bA2.f((CEa)entry.getValue());
        }
    }

    public bA f(RC rC2) {
        Ifa_2 b2 = rC2;
        Ifa_2 a2 = this;
        return a2.J.get(b2);
    }

    public void J(Multimap<String, CEa> multimap) {
        Iterator a2;
        Ifa_2 ifa_2 = this;
        for (Map.Entry b2 : a2.entries()) {
            bA bA2 = ifa_2.J((String)b2.getKey());
            if (bA2 == null) continue;
            bA2.f((CEa)b2.getValue());
            bA2.J((CEa)b2.getValue());
        }
    }

    public Collection<bA> J() {
        Ifa_2 a2;
        return a2.I.values();
    }

    public bA J(String string) {
        String b2 = string;
        Ifa_2 a2 = this;
        return a2.I.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public bA J(RC rC2) {
        void a2;
        Ifa_2 ifa_2 = this;
        if (ifa_2.I.containsKey(a2.J())) {
            throw new IllegalArgumentException(kta.ca);
        }
        Ifa_2 ifa_22 = ifa_2;
        bA bA2 = ifa_22.l((RC)a2);
        ifa_22.I.put(a2.J(), bA2);
        ifa_2.J.put((RC)a2, bA2);
        Ifa_2 b2 = a2.J();
        Ifa_2 ifa_23 = b2;
        while (ifa_23 != null) {
            ifa_2.A.put((RC)b2, (RC)a2);
            b2 = b2.J();
            ifa_23 = b2;
        }
        return bA2;
    }

    public Ifa_2() {
        Ifa_2 a2;
        Ifa_2 ifa_2 = a2;
        ifa_2.I = new Az();
        a2.A = HashMultimap.create();
    }

    public void J(bA object) {
        Object b2 = object;
        object = this;
    }
}

