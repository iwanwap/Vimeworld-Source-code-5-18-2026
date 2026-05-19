/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FZ
 *  Qta
 *  vRa
 *  yY
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class FZ_2<T>
extends AbstractSet<T> {
    private final Set<Class<?>> k;
    private final Map<Class<?>, List<T>> j;
    private final List<T> J;
    private static final Set<Class<?>> A = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Class<T> I;

    public static /* synthetic */ Map J(FZ a2) {
        return a2.j;
    }

    public Class<?> J(Class<?> clazz) {
        Class<?> b2 = clazz;
        FZ_2 a2 = this;
        if (a2.I.isAssignableFrom(b2)) {
            if (!a2.k.contains(b2)) {
                a2.J(b2);
            }
            return b2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, Qta.n).append(b2).toString());
    }

    @Override
    public Iterator<T> iterator() {
        FZ_2 a2;
        if (a2.J.isEmpty()) {
            return Iterators.emptyIterator();
        }
        return Iterators.unmodifiableIterator(a2.J.iterator());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean add(T t2) {
        FZ_2 fZ_2 = this;
        for (Class clazz : fZ_2.k) {
            void a2;
            if (!clazz.isAssignableFrom(a2.getClass())) continue;
            fZ_2.J(a2, clazz);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(T t2, Class<?> clazz) {
        void b2;
        void a2;
        FZ_2 fZ_2 = this;
        Collection<T> c2 = fZ_2.j.get(a2);
        if (c2 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            fZ_2.j.put((Class<?>)a2, (List<T>)Lists.newArrayList(objectArray));
            return;
        }
        c2.add(b2);
    }

    public void J(Class<?> clazz) {
        Class<?> b2 = clazz;
        FZ_2 a2 = this;
        A.add(b2);
        Iterator<T> iterator = a2.J.iterator();
        while (iterator.hasNext()) {
            T t2 = iterator.next();
            if (!b2.isAssignableFrom(t2.getClass())) continue;
            a2.J(t2, b2);
        }
        a2.k.add(b2);
    }

    public FZ_2(Class<T> clazz) {
        Iterator<Class<?>> b2 = clazz;
        FZ_2 a2 = this;
        a2.j = Maps.newHashMap();
        a2.k = Sets.newIdentityHashSet();
        a2.J = Lists.newArrayList();
        a2.I = b2;
        a2.k.add((Class<?>)((Object)b2));
        a2.j.put((Class<?>)((Object)b2), a2.J);
        b2 = A.iterator();
        Iterator<Class<?>> iterator = b2;
        while (iterator.hasNext()) {
            Class<?> clazz2 = b2.next();
            iterator = b2;
            a2.J(clazz2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean remove(Object object) {
        FZ_2 fZ_2 = this;
        int n2 = uSa.E;
        for (Class<?> b2 : fZ_2.k) {
            void a2;
            if (!b2.isAssignableFrom(a2.getClass()) || (b2 = fZ_2.j.get(b2)) == null || !b2.remove(a2)) continue;
            n2 = vRa.d;
        }
        return n2 != 0;
    }

    @Override
    public boolean contains(Object object) {
        Object b2 = object;
        FZ_2 a2 = this;
        return Iterators.contains(a2.J((Class)b2.getClass()).iterator(), b2);
    }

    @Override
    public int size() {
        FZ_2 a2;
        return a2.J.size();
    }

    public <S> Iterable<S> J(Class<S> clazz) {
        Class<S> b2 = clazz;
        FZ_2 a2 = this;
        return new yY((FZ)a2, (Class)b2);
    }
}

