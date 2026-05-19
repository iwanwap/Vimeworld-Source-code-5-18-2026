/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  N
 *  Pqa
 */
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ky<K, V>
implements N<K, V> {
    public final Map<K, V> A;
    private static final Logger I = LogManager.getLogger();

    /*
     * WARNING - void declaration
     */
    public void J(K k2, V v2) {
        void a2;
        Ky<K, V> c2 = k2;
        Ky b2 = this;
        Validate.notNull(c2);
        Validate.notNull(a2);
        if (b2.A.containsKey(c2)) {
            I.debug(new StringBuilder().insert(3 ^ 3, Pqa.W).append(c2).append(yOa.r).toString());
        }
        b2.A.put(c2, a2);
    }

    public boolean J(K k2) {
        Ky<K, V> b2 = k2;
        Ky a2 = this;
        return a2.A.containsKey(b2);
    }

    public Map<K, V> J() {
        return Maps.newHashMap();
    }

    public Ky() {
        Ky a2;
        Ky ky = a2;
        ky.A = ky.J();
    }

    public Set<K> J() {
        Ky a2;
        return Collections.unmodifiableSet(a2.A.keySet());
    }

    public V J(K k2) {
        Ky<K, V> b2 = k2;
        Ky a2 = this;
        return a2.A.get(b2);
    }

    public Iterator<V> iterator() {
        Ky a2;
        return a2.A.values().iterator();
    }
}

