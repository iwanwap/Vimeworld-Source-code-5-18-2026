/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZX
 */
import org.apache.commons.lang3.Validate;

public final class py<K, V>
extends ZX<K, V> {
    private final K A;
    private V I;

    public void J() {
        py a2;
        Validate.notNull(a2.A);
    }

    public V J(int n2) {
        py a2 = this;
        int b22 = n2;
        Object b22 = super.J(b22);
        if (b22 == null) {
            return a2.I;
        }
        return (V)b22;
    }

    public py(K k2) {
        py<K, V> b2 = k2;
        py a2 = this;
        a2.A = b2;
    }

    public V J(K k2) {
        Object b2 = k2;
        py a2 = this;
        if ((b2 = super.J(b2)) == null) {
            return a2.I;
        }
        return (V)b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, K k2, V v2) {
        void c2;
        void b2;
        py<K, V> d2 = v2;
        py a2 = this;
        if (a2.A.equals(b2)) {
            a2.I = d2;
        }
        super.J((int)c2, (Object)b2, (Object)d2);
    }
}

