/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oX
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public final class dZ_3 {
    /*
     * WARNING - void declaration
     */
    public static <T extends oX> T J(Random random, Collection<T> collection, int n2) {
        void b2;
        int c2 = n2;
        Random a2 = random;
        if (c2 <= 0) {
            throw new IllegalArgumentException();
        }
        c2 = a2.nextInt(c2);
        return dZ_3.J(b2, c2);
    }

    public static <T extends oX> T J(Random random, Collection<T> collection) {
        Collection<T> b2 = collection;
        Random a2 = random;
        Object object = b2;
        return dZ_3.J(a2, object, dZ_3.J((Collection<? extends oX>)object));
    }

    public dZ_3() {
        dZ_3 a2;
    }

    public static <T extends oX> T J(Collection<T> collection, int n2) {
        Collection<T> collection2 = collection;
        for (oX b2 : collection2) {
            if ((a -= b2.itemWeight) >= 0) continue;
            return (T)b2;
        }
        return (T)((oX)null);
    }

    public static int J(Collection<? extends oX> collection) {
        Iterator<? extends oX> iterator;
        Collection<? extends oX> collection2 = collection;
        int a2 = uSa.E;
        Iterator<? extends oX> iterator2 = iterator = collection2.iterator();
        while (iterator2.hasNext()) {
            oX oX2 = iterator.next();
            a2 += oX2.itemWeight;
            iterator2 = iterator;
        }
        return a2;
    }
}

