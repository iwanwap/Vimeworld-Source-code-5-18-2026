/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class Wz_2 {
    public static <K, V> Map<K, V> J(Iterable<K> iterable, Iterable<V> iterable2) {
        Iterable<Object> b2 = iterable2;
        Iterable<K> a2 = iterable;
        return Wz_2.J(a2, b2, Maps.newLinkedHashMap());
    }

    /*
     * WARNING - void declaration
     */
    public static <K, V> Map<K, V> J(Iterable<K> iterable, Iterable<V> iterable2, Map<K, V> map) {
        void a2;
        Iterator<K> iterator;
        Object c2 = iterable2;
        Iterable<K> b2 = iterable;
        c2 = c2.iterator();
        Iterator<K> iterator2 = iterator = b2.iterator();
        while (iterator2.hasNext()) {
            Iterator<K> iterator3 = iterator;
            iterator2 = iterator3;
            K k2 = iterator3.next();
            a2.put(k2, c2.next());
        }
        if (c2.hasNext()) {
            throw new NoSuchElementException();
        }
        return a2;
    }

    public Wz_2() {
        Wz_2 a2;
    }
}

