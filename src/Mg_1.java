/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  Oy
 *  YLa
 *  aSa
 *  vRa
 */
import com.google.common.collect.Iterators;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class Mg_1
extends TreeSet {
    private int minX;
    private int minZ;
    private YLa longHashMap;
    private int maxZ;
    private int maxX;
    private static final int UNDEFINED = Integer.MIN_VALUE;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean add(Object object) {
        void a22;
        Mg_1 mg_1 = this;
        if (!(a22 instanceof Oy)) {
            return uSa.E != 0;
        }
        Mg_1 b2 = (Oy)a22;
        if (b2 == null) {
            return uSa.E != 0;
        }
        boolean a22 = mg_1.getSubSet((Oy)b2, vRa.d != 0).add(b2);
        if (a22 != (b2 = super.add(a22))) {
            throw new IllegalStateException(new StringBuilder().insert(2 & 5, yta.i).append(a22).append(aSa.t).append(b2).toString());
        }
        return b2;
    }

    public Mg_1(Set set) {
        Object b2 = set;
        Mg_1 a2 = this;
        Mg_1 mg_1 = a2;
        a2.longHashMap = new YLa();
        mg_1.minX = ypa.L;
        a2.minZ = ypa.L;
        a2.maxX = ypa.L;
        a2.maxZ = ypa.L;
        Object object = b2 = b2.iterator();
        while (object.hasNext()) {
            Object object2 = b2;
            object = object2;
            Object e2 = object2.next();
            a2.add(e2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setIteratorLimits(int n2, int n3, int n4, int n5) {
        void e2;
        void c2;
        void b2;
        void d2;
        Mg_1 a2;
        int n6 = n5;
        Mg_1 mg_1 = a2 = this;
        Mg_1 mg_12 = a2;
        mg_12.minX = Math.min((int)d2, (int)b2);
        mg_12.minZ = Math.min((int)c2, (int)e2);
        mg_1.maxX = Math.max((int)d2, (int)b2);
        mg_1.maxZ = Math.max((int)c2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    private Set getSubSet(int n2, int n3, boolean bl) {
        void a2;
        void b2;
        int d22 = n2;
        Mg_1 c2 = this;
        long l2 = Baa.J((int)d22, (int)b2);
        HashSet d22 = (HashSet)c2.longHashMap.J(l2);
        if (d22 == null && a2 != false) {
            d22 = new HashSet();
            c2.longHashMap.J(l2, d22);
        }
        return d22;
    }

    @Override
    public boolean contains(Object object) {
        Object b2 = object;
        Mg_1 a2 = this;
        if (!(b2 instanceof Oy)) {
            return uSa.E != 0;
        }
        Set set = a2.getSubSet((Oy)(b2 = (Oy)b2), uSa.E != 0);
        if (set == null) {
            return uSa.E != 0;
        }
        return set.contains(b2);
    }

    @Override
    public boolean remove(Object object) {
        Object b2 = object;
        Mg_1 a2 = this;
        if (!(b2 instanceof Oy)) {
            return uSa.E != 0;
        }
        Set set = a2.getSubSet((Oy)(b2 = (Oy)b2), uSa.E != 0);
        if (set == null) {
            return uSa.E != 0;
        }
        boolean bl = set.remove(b2);
        if (bl != (b2 = super.remove(b2))) {
            throw new IllegalStateException(new StringBuilder().insert(3 >> 2, yta.i).append(bl).append(aSa.t).append(b2).toString());
        }
        return b2;
    }

    public void clearIteratorLimits() {
        Mg_1 a2;
        Mg_1 mg_1 = a2;
        mg_1.minX = ypa.L;
        mg_1.minZ = ypa.L;
        mg_1.maxX = ypa.L;
        mg_1.maxZ = ypa.L;
    }

    @Override
    public Iterator iterator() {
        Mg_1 mg_1 = this;
        if (mg_1.minX == ypa.L) {
            return super.iterator();
        }
        if (mg_1.size() <= 0) {
            return Iterators.emptyIterator();
        }
        Mg_1 mg_12 = mg_1;
        int n2 = mg_12.minX >> AQa.P;
        int n3 = mg_12.minZ >> AQa.P;
        int n4 = mg_12.maxX >> AQa.P;
        int n5 = mg_12.maxZ >> AQa.P;
        AbstractCollection a2 = new ArrayList();
        int n6 = n2 = n2;
        while (n6 <= n4) {
            int n7 = n3;
            while (n7 <= n5) {
                int n8;
                Set set = mg_1.getSubSet(n2, n8, uSa.E != 0);
                if (set != null) {
                    a2.add(set.iterator());
                }
                n7 = ++n8;
            }
            n6 = ++n2;
        }
        if (a2.size() <= 0) {
            return Iterators.emptyIterator();
        }
        if (a2.size() == vRa.d) {
            return (Iterator)a2.get(uSa.E);
        }
        return Iterators.concat(a2.iterator());
    }

    /*
     * WARNING - void declaration
     */
    private Set getSubSet(Oy oy, boolean bl) {
        void a2;
        Object c22 = oy;
        Mg_1 b2 = this;
        if (c22 == null) {
            return null;
        }
        Object object = c22 = ((Oy)c22).position;
        int c22 = object.getX() >> AQa.P;
        int n2 = object.getZ() >> AQa.P;
        return b2.getSubSet(c22, n2, (boolean)a2);
    }
}

