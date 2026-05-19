/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZZ
 *  ey
 *  pua
 *  vRa
 */
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class WX_3<T>
extends UnmodifiableIterator<T[]> {
    private int j;
    private final Iterable<? extends T>[] J;
    private final T[] A;
    private final Iterator<? extends T>[] I;

    public T[] J() {
        WX_3 a2;
        if (!a2.hasNext()) {
            throw new NoSuchElementException();
        }
        WX_3 wX_3 = a2;
        while (wX_3.j < a2.I.length) {
            WX_3 wX_32 = a2;
            WX_3 wX_33 = a2;
            wX_3 = wX_33;
            WX_3 wX_34 = a2;
            wX_32.A[wX_33.j] = wX_34.I[wX_34.j].next();
            wX_32.j += vRa.d;
        }
        return (Object[])a2.A.clone();
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ WX_3(Class clazz, Iterable[] iterableArray, ZZ zZ2) {
        void c2;
        Iterable[] d2 = iterableArray;
        Iterable[] b2 = this;
        super((Class<T>)c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    private WX_3(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        void b2;
        int c2;
        void a2;
        WX_3 wX_3 = this;
        wX_3.j = rQa.p;
        wX_3.J = a2;
        wX_3.I = (Iterator[])ey.J(Iterator.class, (int)wX_3.J.length);
        int n2 = c2 = uSa.E;
        while (n2 < wX_3.J.length) {
            int n3 = c2++;
            wX_3.I[n3] = a2[n3].iterator();
            n2 = c2;
        }
        wX_3.A = ey.J((Class)b2, (int)wX_3.I.length);
    }

    private void J() {
        WX_3 a2;
        WX_3 wX_3 = a2;
        wX_3.j = pua.o;
        Arrays.fill(wX_3.I, null);
        Arrays.fill(wX_3.A, null);
    }

    @Override
    public boolean hasNext() {
        Iterator<? extends T>[] iteratorArray;
        block9: {
            Object a2;
            Iterator<? extends T>[] iteratorArray2 = this;
            if (iteratorArray2.j == rQa.p) {
                int n2;
                iteratorArray2.j = uSa.E;
                a2 = iteratorArray2.I;
                int n3 = iteratorArray2.I.length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    if (!a2[n2].hasNext()) {
                        super.J();
                        break;
                    }
                    n4 = ++n2;
                }
                return vRa.d != 0;
            }
            if (iteratorArray2.j >= iteratorArray2.I.length) {
                iteratorArray2.j = iteratorArray2.I.length - vRa.d;
                Iterator<? extends T>[] iteratorArray3 = iteratorArray2;
                while (iteratorArray3.j >= 0) {
                    a2 = iteratorArray2.I[iteratorArray2.j];
                    if (a2.hasNext()) {
                        iteratorArray = iteratorArray2;
                        break block9;
                    }
                    if (iteratorArray2.j == 0) {
                        super.J();
                        iteratorArray = iteratorArray2;
                        break block9;
                    }
                    a2 = iteratorArray2.J[iteratorArray2.j].iterator();
                    iteratorArray2.I[iteratorArray2.j] = a2;
                    if (!iteratorArray2.I[iteratorArray2.j].hasNext()) {
                        super.J();
                        iteratorArray = iteratorArray2;
                        break block9;
                    }
                    iteratorArray2.j -= vRa.d;
                    iteratorArray3 = iteratorArray2;
                }
            }
            iteratorArray = iteratorArray2;
        }
        if (iteratorArray.j >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

