/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WX
 *  ZZ
 *  ey
 */
import java.util.Collections;
import java.util.Iterator;

public final class Cy_3<T>
implements Iterable<T[]> {
    private final Iterable<? extends T>[] A;
    private final Class<T> I;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Cy_3(Class clazz, Iterable[] iterableArray, ZZ zZ2) {
        void c2;
        Iterable[] d2 = iterableArray;
        Iterable[] b2 = this;
        super((Class<T>)c2, d2);
    }

    @Override
    public Iterator<T[]> iterator() {
        Cy_3 a2;
        if (a2.A.length <= 0) {
            return Collections.singletonList(ey.J(a2.I, (int)uSa.E)).iterator();
        }
        Cy_3 cy_3 = a2;
        return new WX(cy_3.I, (Iterable[])cy_3.A, null);
    }

    /*
     * WARNING - void declaration
     */
    private Cy_3(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        void b2;
        Iterable<? extends T>[] c2 = iterableArray;
        Iterable<? extends T>[] a2 = this;
        a2.I = b2;
        a2.A = c2;
    }
}

