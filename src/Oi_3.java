/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MG
 *  Oi
 *  Ph
 *  vRa
 *  xy
 */
import com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.khelekore.prtree.MBRConverter;
import org.khelekore.prtree.PRTree;
import org.khelekore.prtree.SimpleMBR;

public class Oi_3 {
    private final MBRConverter<gh> C;
    private final int i = 9;
    private boolean M;
    private final int k = Fsa.d;
    public Set<gh> j;
    public Set<gh> J;
    public PRTree<gh> A;
    private final Set<gh> I;

    public void f() {
        Oi_3 a2;
        Oi_3 oi_3 = a2;
        oi_3.j.clear();
        oi_3.J.clear();
        a2.M = uSa.E;
        a2.I.clear();
        a2.A = null;
    }

    public void l(gh gh2) {
        gh b2 = gh2;
        Oi_3 a2 = this;
        if (b2.l() && a2.J.add(b2) && !a2.I.remove(b2)) {
            a2.M = vRa.d;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(xy xy2, Collection<gh> collection) {
        void a2;
        void b2;
        Oi_3 oi_3 = this;
        if (oi_3.A != null) {
            Iterator<gh> c2;
            double[] dArray = new double[uua.p];
            dArray[uSa.E] = b2.J;
            dArray[vRa.d] = b2.A;
            dArray[uqa.g] = b2.j;
            dArray[yRa.d] = b2.M;
            dArray[AQa.P] = b2.I;
            dArray[tTa.h] = b2.k;
            SimpleMBR simpleMBR = new SimpleMBR(dArray);
            Iterator<gh> iterator = c2 = oi_3.A.find(simpleMBR).iterator();
            while (iterator.hasNext()) {
                gh gh2 = c2.next();
                iterator = c2;
                a2.add(gh2);
            }
            for (gh gh2 : oi_3.J) {
                if (!gh2.m.J((xy)b2)) continue;
                a2.add(gh2);
            }
        } else {
            for (gh c2 : oi_3.j) {
                if (!c2.m.J((xy)b2)) continue;
                a2.add(c2);
            }
        }
    }

    public void f(gh gh2) {
        gh b2 = gh2;
        Oi_3 a2 = this;
        a2.j.add(b2);
        a2.I.add(b2);
    }

    public void J() {
        Oi_3 a2;
        if (!a2.M && !a2.I.isEmpty()) {
            a2.M = vRa.d;
            a2.I.clear();
        }
        if (!a2.M) {
            return;
        }
        a2.M = uSa.E;
        if (a2.j.size() - a2.J.size() < Fsa.d) {
            a2.A = null;
            return;
        }
        a2.A = new PRTree<gh>(a2.C, WOa.fa);
        a2.A.load(Collections2.filter(a2.j, MG.J((Oi)a2)));
    }

    /*
     * WARNING - void declaration
     */
    public void J(xy xy2, List<xy> list) {
        void a2;
        void b2;
        Oi_3 oi_3 = this;
        if (oi_3.A != null) {
            Iterator<gh> c2;
            double[] dArray = new double[uua.p];
            dArray[uSa.E] = b2.J;
            dArray[vRa.d] = b2.A;
            dArray[uqa.g] = b2.j;
            dArray[yRa.d] = b2.M;
            dArray[AQa.P] = b2.I;
            dArray[tTa.h] = b2.k;
            SimpleMBR simpleMBR = new SimpleMBR(dArray);
            Iterator<gh> iterator = c2 = oi_3.A.find(simpleMBR).iterator();
            while (iterator.hasNext()) {
                gh gh2 = c2.next();
                iterator = c2;
                a2.add(gh2.m);
            }
            for (gh gh2 : oi_3.J) {
                if (!gh2.m.J((xy)b2)) continue;
                a2.add(gh2.m);
            }
        } else {
            for (gh c2 : oi_3.j) {
                if (!c2.m.J((xy)b2)) continue;
                a2.add(c2.m);
            }
        }
    }

    public static /* synthetic */ boolean J(Oi oi2, gh gh2) {
        Object b2 = gh2;
        Oi a2 = oi2;
        if (!a2.J.contains(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(gh gh2) {
        gh b2 = gh2;
        Oi_3 a2 = this;
        Object object = b2;
        a2.j.remove(b2);
        a2.I.remove(object);
        if (((gh)object).l()) {
            a2.J.remove(b2);
            return;
        }
        a2.M = vRa.d;
    }

    public Oi_3() {
        Oi_3 a2;
        a2.i = WOa.fa;
        Oi_3 oi_3 = a2;
        a2.C = new Ph();
        a2.M = uSa.E;
        a2.j = Collections.newSetFromMap(new LinkedHashMap());
        a2.J = Collections.newSetFromMap(new LinkedHashMap());
        a2.I = new HashSet<gh>();
    }
}

