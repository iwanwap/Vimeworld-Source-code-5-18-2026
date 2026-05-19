/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gl
 *  NEa
 *  NTa
 *  dFa
 *  vL
 *  vRa
 *  yha
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import java.util.List;

public class NEa_3<T extends Gl>
extends dFa {
    public Predicate<? super T> k;
    public final Class<T> j;
    private final int J;
    public Gl A;
    public final Gga I;

    /*
     * WARNING - void declaration
     */
    public NEa_3(bga bga2, Class<T> clazz, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        NEa_3<T> a2 = this;
        a2((bga)c2, (Class<T>)b2, d2, uSa.E != 0);
    }

    public boolean f() {
        NEa_3 a2;
        if (a2.J > 0 && a2.j.J().nextInt(a2.J) != 0) {
            return uSa.E != 0;
        }
        NEa_3 nEa_3 = a2;
        double d2 = nEa_3.J();
        NEa_3 nEa_32 = a2;
        double d3 = d2;
        List list = ((bga)((Object)nEa_3.j)).j.J(nEa_32.j, nEa_32.j.J().f(d3, FPa.T, d3), Predicates.and(a2.k, Kaa.A));
        Collections.sort(list, a2.I);
        if (list.isEmpty()) {
            return uSa.E != 0;
        }
        a2.A = (Gl)list.get(uSa.E);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public NEa_3(bga bga2, Class<T> clazz, boolean bl, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        NEa_3<T> a2 = this;
        a2((bga)d2, (Class<T>)c2, NTa.C, (boolean)b2, (boolean)e2, null);
    }

    public void l() {
        NEa_3 a2;
        NEa_3 nEa_3 = a2;
        a2.j.C(nEa_3.A);
        super.l();
    }

    /*
     * WARNING - void declaration
     */
    public NEa_3(bga bga2, Class<T> clazz, int n2, boolean bl, boolean bl2, Predicate<? super T> predicate) {
        void a2;
        void d2;
        void e2;
        void b2;
        void c2;
        NEa_3 f2;
        Object g2 = bga2;
        NEa_3 nEa_3 = f2 = this;
        NEa_3 nEa_32 = f2;
        super((bga)((Object)g2), (boolean)c2, (boolean)b2);
        nEa_32.j = e2;
        nEa_32.J = d2;
        nEa_3.I = new Gga((vL)g2);
        f2.J(vRa.d);
        nEa_3.k = new yha((NEa)f2, (Predicate)a2);
    }
}

