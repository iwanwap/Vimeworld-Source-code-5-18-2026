/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EZ
 *  Pz
 *  Vz
 *  ld
 *  pY
 *  qta
 *  vRa
 *  zsa
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class by_1
implements ld {
    public List<ld> siblings = Lists.newArrayList();
    private Vz style;

    public Vz J() {
        by_1 by_12 = this;
        if (by_12.style == null) {
            Object a2;
            by_12.style = new Vz();
            Object object = a2 = by_12.siblings.iterator();
            while (object.hasNext()) {
                ((ld)a2.next()).J().J(by_12.style);
                object = a2;
            }
        }
        return by_12.style;
    }

    public ld J(Vz vz2) {
        Object b2 = vz2;
        by_1 a2 = this;
        a2.style = b2;
        Object object = b2 = a2.siblings.iterator();
        while (object.hasNext()) {
            ((ld)b2.next()).J().J(a2.J());
            object = b2;
        }
        return a2;
    }

    public ld J(ld ld2) {
        by_1 a2;
        by_1 b2 = ld2;
        by_1 by_12 = a2 = this;
        b2.J().J(a2.J());
        by_12.siblings.add(b2);
        return by_12;
    }

    public final String f() {
        Object a2;
        by_1 by_12 = this;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = a2 = by_12.iterator();
        while (object.hasNext()) {
            ld ld2 = (ld)a2.next();
            object = a2;
            stringBuilder.append(ld2.J());
        }
        return stringBuilder.toString();
    }

    public ld J(String string) {
        String b2 = string;
        Object a2 = this;
        return ((by_1)a2).J((ld)new CY(b2));
    }

    public by_1() {
        by_1 a2;
    }

    public final String l() {
        Iterator<ld> iterator;
        by_1 by_12 = this;
        StringBuilder a2 = new StringBuilder();
        Iterator<ld> iterator2 = iterator = by_12.iterator();
        while (iterator2.hasNext()) {
            ld ld2 = iterator.next();
            iterator2 = iterator;
            a2.append(ld2.J().l());
            a2.append(ld2.J());
            a2.append(pY.RESET);
        }
        return a2.toString();
    }

    public int hashCode() {
        by_1 a2;
        return tua.U * a2.style.hashCode() + a2.siblings.hashCode();
    }

    public Iterator<ld> iterator() {
        by_1 a2;
        by_1[] by_1Array = new by_1[vRa.d];
        by_1Array[uSa.E] = a2;
        return Iterators.concat(Iterators.forArray(by_1Array), by_1.J(a2.siblings));
    }

    public List<ld> J() {
        by_1 a2;
        return a2.siblings;
    }

    public static Iterator<ld> J(Iterable<ld> iterable) {
        Iterable<ld> iterable2 = iterable;
        Iterator<Object> a2 = Iterators.concat(Iterators.transform(iterable2.iterator(), new EZ()));
        a2 = Iterators.transform(a2, new Pz());
        return a2;
    }

    public String toString() {
        by_1 a2;
        return new StringBuilder().insert(3 ^ 3, qta.Aa).append(a2.style).append(zsa.s).append(a2.siblings).append((char)ySa.Z).toString();
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof by_1)) {
            return uSa.E != 0;
        }
        b2 = (by_1)b2;
        if (((by_1)a2).siblings.equals(((by_1)b2).siblings) && ((by_1)a2).J().equals((Object)((by_1)b2).J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

