/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eX
 *  fB
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ZX_3<K, V>
extends Ky<K, V>
implements fB<V> {
    public final eX A = new eX();
    public final Map<V, K> I = ((BiMap)a2.A).inverse();

    @Override
    public int J(V v2) {
        ZX_3<K, V> b2 = v2;
        ZX_3 a2 = this;
        return a2.A.J((Object)b2);
    }

    public ZX_3() {
        ZX_3 a2;
    }

    @Override
    public boolean J(K k2) {
        ZX_3<K, V> b2 = k2;
        ZX_3 a2 = this;
        return (boolean)super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, K k2, V v2) {
        void b2;
        void c2;
        ZX_3 a2;
        ZX_3<K, V> d2 = v2;
        ZX_3 zX_3 = a2 = this;
        zX_3.A.J((Object)d2, (int)c2);
        zX_3.J(b2, d2);
    }

    @Override
    public Iterator<V> iterator() {
        ZX_3 a2;
        return a2.A.iterator();
    }

    public K f(V v2) {
        ZX_3<K, V> b2 = v2;
        ZX_3 a2 = this;
        return a2.I.get(b2);
    }

    @Override
    public V J(K k2) {
        ZX_3<K, V> b2 = k2;
        ZX_3 a2 = this;
        return super.J(b2);
    }

    @Override
    public V J(int n2) {
        int b2 = n2;
        ZX_3 a2 = this;
        return (V)a2.A.J(b2);
    }

    @Override
    public Map<K, V> J() {
        return HashBiMap.create();
    }
}

