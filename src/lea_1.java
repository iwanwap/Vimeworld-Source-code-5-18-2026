/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ifa
 *  RC
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lea_1
implements bA {
    private final RC C;
    private final Map<String, Set<CEa>> i;
    public double M;
    private final Map<Integer, Set<CEa>> k;
    private boolean j;
    public double J;
    private final Map<UUID, CEa> A;
    private final Ifa I;

    @Override
    public double J() {
        lea_1 a2;
        return a2.M;
    }

    public void f() {
        lea_1 a2;
        a2.j = vRa.d;
        a2.I.J((bA)a2);
    }

    @Override
    public RC J() {
        lea_1 a2;
        return a2.C;
    }

    @Override
    public Collection<CEa> J(int n2) {
        int b2 = n2;
        lea_1 a2 = this;
        return a2.k.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public lea_1(Ifa ifa, RC rC) {
        void a2;
        lea_1 b2;
        lea_1 c2 = ifa;
        lea_1 lea_12 = b2 = this;
        lea_1 lea_13 = b2;
        b2.k = Maps.newHashMap();
        b2.i = Maps.newHashMap();
        lea_13.A = Maps.newHashMap();
        lea_13.j = vRa.d;
        lea_13.I = c2;
        lea_12.C = a2;
        lea_12.M = a2.J();
        int n2 = c2 = uSa.E;
        while (n2 < yRa.d) {
            b2.k.put(c2++, Sets.newHashSet());
            n2 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(CEa cEa2) {
        void a2;
        int b22;
        lea_1 lea_12 = this;
        int n2 = b22 = uSa.E;
        while (n2 < yRa.d) {
            Set<CEa> set = lea_12.k.get(b22);
            set.remove(a2);
            n2 = ++b22;
        }
        Set<CEa> b22 = lea_12.i.get(a2.J());
        if (b22 != null) {
            Set<CEa> set = b22;
            set.remove(a2);
            if (set.isEmpty()) {
                lea_12.i.remove(a2.J());
            }
        }
        lea_12.A.remove(a2.J());
        lea_12.f();
    }

    @Override
    public void J(double a2) {
        lea_1 b2;
        if (a2 != b2.J()) {
            b2.M = a2;
            b2.f();
        }
    }

    @Override
    public Collection<CEa> J() {
        int a2;
        lea_1 lea_12 = this;
        HashSet<CEa> hashSet = Sets.newHashSet();
        int n2 = a2 = uSa.E;
        while (n2 < yRa.d) {
            hashSet.addAll(lea_12.J(a2++));
            n2 = a2;
        }
        return hashSet;
    }

    @Override
    public double f() {
        lea_1 a2;
        if (a2.j) {
            a2.J = a2.l();
            a2.j = uSa.E;
        }
        return a2.J;
    }

    @Override
    public CEa J(UUID uUID) {
        UUID b2 = uUID;
        lea_1 a2 = this;
        return a2.A.get(b2);
    }

    @Override
    public void J(CEa cEa2) {
        Object a2 = this;
        CEa b2 = cEa2;
        if (((lea_1)a2).J(b2.J()) != null) {
            throw new IllegalArgumentException(Vra.l);
        }
        Set<CEa> set = ((lea_1)a2).i.get(b2.J());
        if (set == null) {
            set = Sets.newHashSet();
            ((lea_1)a2).i.put(b2.J(), set);
        }
        ((lea_1)a2).k.get(b2.J()).add(b2);
        set.add(b2);
        ((lea_1)a2).A.put(b2.J(), b2);
        ((lea_1)a2).f();
    }

    @Override
    public void J() {
        Object object = this;
        Object a2 = ((lea_1)object).J();
        if (a2 != null) {
            Iterator iterator = a2 = Lists.newArrayList(a2).iterator();
            while (iterator.hasNext()) {
                CEa cEa2 = (CEa)a2.next();
                iterator = a2;
                ((lea_1)object).f(cEa2);
            }
        }
    }

    @Override
    public boolean J(CEa cEa2) {
        CEa b2 = cEa2;
        lea_1 a2 = this;
        if (a2.A.get(b2.J()) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Collection<CEa> f(int n2) {
        void a2;
        lea_1 lea_12;
        lea_1 lea_13 = lea_12 = this;
        HashSet<CEa> hashSet = Sets.newHashSet(lea_13.J((int)a2));
        lea_1 b2 = lea_13.C.J();
        Object object = b2;
        while (object != null) {
            bA bA2 = lea_12.I.f((RC)b2);
            if (bA2 != null) {
                hashSet.addAll(bA2.J((int)a2));
            }
            object = b2.J();
        }
        return hashSet;
    }

    public double l() {
        CEa cEa2;
        Iterator<CEa> iterator;
        lea_1 lea_12;
        lea_1 lea_13 = lea_12 = this;
        double d2 = lea_13.J();
        Iterator<CEa> iterator2 = iterator = lea_13.f(uSa.E).iterator();
        while (iterator2.hasNext()) {
            CEa cEa3 = iterator.next();
            d2 += cEa3.J();
            iterator2 = iterator;
        }
        double d3 = d2;
        Iterator<CEa> a2 = lea_12.f(vRa.d).iterator();
        Iterator<CEa> iterator3 = a2;
        while (iterator3.hasNext()) {
            cEa2 = (CEa)a2.next();
            d3 += d2 * cEa2.J();
            iterator3 = a2;
        }
        Iterator<CEa> iterator4 = a2 = lea_12.f(uqa.g).iterator();
        while (iterator4.hasNext()) {
            cEa2 = a2.next();
            d3 *= oua.i + cEa2.J();
            iterator4 = a2;
        }
        return lea_12.C.J(d3);
    }
}

