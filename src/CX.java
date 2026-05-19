/*
 * Decompiled with CFR 0.152.
 */
public final class CX<K, V>
extends Ky<K, V> {
    private final V I;

    @Override
    public V J(K k2) {
        CX<K, V> b2 = k2;
        CX a2 = this;
        if ((b2 = super.J(b2)) == null) {
            return a2.I;
        }
        return (V)b2;
    }

    public CX(V v2) {
        CX<K, V> b2 = v2;
        CX a2 = this;
        a2.I = b2;
    }
}

