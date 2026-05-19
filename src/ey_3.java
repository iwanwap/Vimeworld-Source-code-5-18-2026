/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cy
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

public final class ey_3 {
    private static <T> Iterable<List<T>> f(Iterable<Object[]> a2) {
        return Iterables.transform(a2, new Hz(null));
    }

    private static <T> T[] J(Class<? super T> clazz, Iterable<? extends T> iterable) {
        Iterator a2;
        Class<? super T> clazz2 = clazz;
        Serializable b2 = Lists.newArrayList();
        Iterator iterator = a2 = a2.iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = a2;
            iterator = iterator2;
            Object t2 = iterator2.next();
            b2.add(t2);
        }
        return b2.toArray(ey_3.f(clazz2, b2.size()));
    }

    public static <T> Iterable<T[]> J(Class<T> clazz, Iterable<? extends Iterable<? extends T>> iterable) {
        Iterable<? extends Iterable<? extends T>> b2 = iterable;
        Class<T> a2 = clazz;
        return new Cy(a2, ey_3.J(Iterable.class, b2), null);
    }

    public static <T> Iterable<List<T>> J(Iterable<? extends Iterable<? extends T>> a2) {
        return ey_3.f(ey_3.J(Object.class, a2));
    }

    private static <T> T[] f(Class<? super T> clazz, int n2) {
        int b2 = n2;
        Class<? super T> a2 = clazz;
        return (Object[])Array.newInstance(a2, b2);
    }

    public static /* synthetic */ Object[] J(Class clazz, int n2) {
        int b2 = n2;
        Class a2 = clazz;
        return ey_3.f(a2, b2);
    }

    public ey_3() {
        ey_3 a2;
    }
}

