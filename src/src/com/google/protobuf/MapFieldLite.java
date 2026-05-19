/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V>
extends LinkedHashMap<K, V> {
    private boolean isMutable = true;
    private static final MapFieldLite<?, ?> EMPTY_MAP_FIELD = new MapFieldLite();

    private MapFieldLite() {
    }

    private MapFieldLite(Map<K, V> mapData) {
        super(mapData);
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return EMPTY_MAP_FIELD;
    }

    public void mergeFrom(MapFieldLite<K, V> other) {
        this.ensureMutable();
        if (!other.isEmpty()) {
            this.putAll(other);
        }
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public void clear() {
        this.ensureMutable();
        super.clear();
    }

    @Override
    public V put(K key, V value) {
        this.ensureMutable();
        Internal.checkNotNull(key);
        Internal.checkNotNull(value);
        return super.put(key, value);
    }

    public V put(Map.Entry<K, V> entry) {
        return this.put(entry.getKey(), entry.getValue());
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m2) {
        this.ensureMutable();
        MapFieldLite.checkForNullKeysAndValues(m2);
        super.putAll(m2);
    }

    @Override
    public V remove(Object key) {
        this.ensureMutable();
        return super.remove(key);
    }

    private static void checkForNullKeysAndValues(Map<?, ?> m2) {
        for (Object key : m2.keySet()) {
            Internal.checkNotNull(key);
            Internal.checkNotNull(m2.get(key));
        }
    }

    private static boolean equals(Object a2, Object b2) {
        if (a2 instanceof byte[] && b2 instanceof byte[]) {
            return Arrays.equals((byte[])a2, (byte[])b2);
        }
        return a2.equals(b2);
    }

    static <K, V> boolean equals(Map<K, V> a2, Map<K, V> b2) {
        if (a2 == b2) {
            return true;
        }
        if (a2.size() != b2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a2.entrySet()) {
            if (!b2.containsKey(entry.getKey())) {
                return false;
            }
            if (MapFieldLite.equals(entry.getValue(), b2.get(entry.getKey()))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Map && MapFieldLite.equals(this, (Map)object);
    }

    private static int calculateHashCodeForObject(Object a2) {
        if (a2 instanceof byte[]) {
            return Internal.hashCode((byte[])a2);
        }
        if (a2 instanceof Internal.EnumLite) {
            throw new UnsupportedOperationException();
        }
        return a2.hashCode();
    }

    static <K, V> int calculateHashCodeForMap(Map<K, V> a2) {
        int result = 0;
        for (Map.Entry<K, V> entry : a2.entrySet()) {
            result += MapFieldLite.calculateHashCodeForObject(entry.getKey()) ^ MapFieldLite.calculateHashCodeForObject(entry.getValue());
        }
        return result;
    }

    @Override
    public int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(this);
    }

    private static Object copy(Object object) {
        if (object instanceof byte[]) {
            byte[] data = (byte[])object;
            return Arrays.copyOf(data, data.length);
        }
        return object;
    }

    static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap<K, Object> result = new LinkedHashMap<K, Object>(map.size() * 4 / 3 + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getKey(), MapFieldLite.copy(entry.getValue()));
        }
        return result;
    }

    public MapFieldLite<K, V> mutableCopy() {
        return this.isEmpty() ? new MapFieldLite<K, V>() : new MapFieldLite<K, V>(this);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    private void ensureMutable() {
        if (!this.isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        EMPTY_MAP_FIELD.makeImmutable();
    }
}

