/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ppa
 *  YI
 *  fH
 *  vRa
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class YI_3<T>
implements Iterator<T>,
Iterable<T> {
    private final boolean j;
    private final fH<T> J;
    public int A;
    public boolean I;

    public YI_3(fH<T> fH2) {
        fH<T> b2 = fH2;
        fH<T> a2 = this;
        super(b2, vRa.d != 0);
    }

    @Override
    public boolean hasNext() {
        YI_3 a2;
        if (!a2.I) {
            throw new RuntimeException(dua.W);
        }
        YI_3 yI_3 = a2;
        if (yI_3.A < yI_3.J.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void remove() {
        YI_3 a2;
        if (!a2.j) {
            throw new RuntimeException(Ppa.a);
        }
        YI_3 yI_3 = a2;
        yI_3.A -= vRa.d;
        yI_3.J.f(a2.A);
    }

    public void J() {
        a.A = uSa.E;
    }

    public YI<T> J() {
        YI_3 a2;
        return a2;
    }

    @Override
    public T next() {
        YI_3 a2;
        YI_3 yI_3 = a2;
        if (yI_3.A >= yI_3.J.A) {
            throw new NoSuchElementException(String.valueOf(a2.A));
        }
        if (!a2.I) {
            throw new RuntimeException(dua.W);
        }
        int n2 = a2.A;
        a2.A = n2 + vRa.d;
        return (T)a2.J.J[n2];
    }

    /*
     * WARNING - void declaration
     */
    public YI_3(fH<T> fH2, boolean bl2) {
        void b2;
        YI_3 a2;
        boolean c2 = bl2;
        YI_3 yI_3 = a2 = this;
        a2.I = vRa.d;
        yI_3.J = b2;
        yI_3.j = c2;
    }
}

