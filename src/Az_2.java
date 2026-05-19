/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class Az_2<V>
implements Map<String, V> {
    private final Map<String, V> I = Maps.newLinkedHashMap();

    @Override
    public void clear() {
        Az_2 a2;
        a2.I.clear();
    }

    @Override
    public boolean isEmpty() {
        Az_2 a2;
        return a2.I.isEmpty();
    }

    @Override
    public Set<Map.Entry<String, V>> entrySet() {
        Az_2 a2;
        return a2.I.entrySet();
    }

    @Override
    public Set<String> keySet() {
        Az_2 a2;
        return a2.I.keySet();
    }

    public Az_2() {
        Az_2 a2;
    }

    @Override
    public V remove(Object object) {
        Object b2 = object;
        Az_2 a2 = this;
        return a2.I.remove(b2.toString().toLowerCase());
    }

    @Override
    public V get(Object object) {
        Object b2 = object;
        Az_2 a2 = this;
        return a2.I.get(b2.toString().toLowerCase());
    }

    @Override
    public boolean containsKey(Object object) {
        Object b2 = object;
        Az_2 a2 = this;
        return a2.I.containsKey(b2.toString().toLowerCase());
    }

    @Override
    public int size() {
        Az_2 a2;
        return a2.I.size();
    }

    @Override
    public Collection<V> values() {
        Az_2 a2;
        return a2.I.values();
    }

    /*
     * WARNING - void declaration
     */
    public V J(String string, V v2) {
        void b2;
        Az_2<V> c2 = v2;
        Az_2 a2 = this;
        return (V)a2.I.put(b2.toLowerCase(), c2);
    }

    @Override
    public boolean containsValue(Object object) {
        Object b2 = object;
        Az_2 a2 = this;
        return a2.I.containsKey(b2);
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> map) {
        Object b2 = map;
        Az_2 a2 = this;
        Object object = b2 = b2.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)b2.next();
            a2.J((String)entry.getKey(), entry.getValue());
            object = b2;
        }
    }
}

