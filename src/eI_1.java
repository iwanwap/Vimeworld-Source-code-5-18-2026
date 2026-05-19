/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ah
 *  NTa
 *  ai
 *  asa
 *  iG
 *  ska
 *  vRa
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eI_1 {
    private final Queue<qI> j;
    private long J;
    private List<qI> A;
    private final Set<qI> I;

    public void f(qI qI2) {
        qI b2 = qI2;
        eI_1 a2 = this;
        if (b2.G > OT.e) {
            a2.j.add(b2);
            return;
        }
        eI_1 eI_12 = a2;
        Object object = b2;
        eI_12.I.add(b2);
        ((qI)object).J();
        if (eI_12.J((qI)object)) {
            a2.A.add(b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(qI qI2) {
        void a2;
        eI_1 eI_12 = this;
        float f2 = (float)ska.C;
        float f3 = (float)ska.k;
        float b2 = (float)ska.j;
        void v0 = a2;
        v0.J(f2, f3, b2);
        if (v0.L < Math.max(a2.v, Ura.v)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        eI_1 a2;
        return a2.I.size() + a2.j.size();
    }

    public void J(qI qI2) {
        qI b2 = qI2;
        eI_1 a2 = this;
        a2.I.remove(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ boolean J(long l2, float f2, float f3, float f4, qI qI2) {
        void b2;
        void c2;
        long e2;
        void d2;
        qI qI3 = qI2;
        float a2 = f2;
        if (d2.x < e2) {
            return vRa.d != 0;
        }
        d2.J(a2, (float)c2, (float)b2);
        return uSa.E != 0;
    }

    public static /* synthetic */ long J(qI a2) {
        return a2.G;
    }

    public void J() {
        eI_1 a2;
        eI_1 eI_12 = a2;
        eI_12.I.clear();
        eI_12.A.clear();
        eI_12.j.clear();
    }

    public static /* synthetic */ int J(qI qI2, qI qI3) {
        qI b2 = qI3;
        qI a2 = qI2;
        return Float.compare(a2.L, b2.L);
    }

    /*
     * WARNING - void declaration
     */
    public List<qI> J(long l2) {
        eI_1 eI_12;
        void a2;
        Object b2;
        eI_1 eI_13 = this;
        float f2 = (float)ska.C;
        float f3 = (float)ska.k;
        float f4 = (float)ska.j;
        Object object = b2 = eI_13.j.peek();
        while (object != null && ((qI)b2).G < a2) {
            eI_1 eI_14 = eI_13;
            eI_13.j.remove();
            eI_14.I.add((qI)b2);
            ((qI)b2).J();
            if (eI_14.J((qI)b2)) {
                eI_13.A.add((qI)b2);
            }
            object = eI_13.j.peek();
        }
        if (a2 - eI_13.J > asa.fa) {
            eI_13.J = a2;
            b2 = new ArrayList(Math.max(NTa.C, eI_13.A.size() + NTa.C));
            Iterator<qI> iterator = eI_13.I.iterator();
            block1: while (true) {
                Iterator<qI> iterator2 = iterator;
                while (iterator2.hasNext()) {
                    qI qI2 = iterator.next();
                    if (qI2.x < a2) {
                        Iterator<qI> iterator3 = iterator;
                        iterator2 = iterator3;
                        iterator3.remove();
                        continue;
                    }
                    qI qI3 = qI2;
                    qI3.J(f2, f3, f4);
                    if (!(qI3.L < Math.max(qI2.v, Ura.v))) continue block1;
                    b2.add(qI2);
                    continue block1;
                }
                break;
            }
            eI_12 = eI_13;
            eI_13.A = b2;
        } else {
            eI_1 eI_15 = eI_13;
            eI_12 = eI_15;
            eI_15.A.removeIf(ai.J((long)a2, (float)f2, (float)f3, (float)f4));
        }
        eI_12.A.sort(Ah.J());
        return eI_13.A;
    }

    public List<qI> J() {
        eI_1 a2;
        return a2.A;
    }

    public eI_1() {
        eI_1 a2;
        eI_1 eI_12 = a2;
        a2.I = new LinkedHashSet<qI>();
        eI_12.A = new ArrayList<qI>();
        a2.j = new PriorityQueue(Comparator.comparingLong(iG.J()));
    }
}

