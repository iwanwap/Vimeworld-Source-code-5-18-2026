/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qAa_1
implements UB {
    private final Mda A;
    private final List<Mda> I;

    @Override
    public Mda J(xFa xFa2) {
        xFa b2 = xFa2;
        qAa_1 a2 = this;
        return a2.A.J();
    }

    @Override
    public int J() {
        qAa_1 a2;
        return a2.I.size();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        qAa_1 qAa_12 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    @Override
    public Mda J() {
        qAa_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        qAa_1 qAa_12 = this;
        ArrayList<Mda> a2 = Lists.newArrayList(qAa_12.I);
        int n3 = n2 = uSa.E;
        while (n3 < b2.d()) {
            int n4 = uSa.E;
            while (n4 < b2.C()) {
                int n5;
                Mda mda2 = b2.f(n5, n2);
                if (mda2 != null) {
                    int n6;
                    block5: {
                        int n7 = uSa.E;
                        for (Mda c2 : a2) {
                            if (mda2.J() != c2.J() || c2.J() != BQa.h && mda2.J() != c2.J()) continue;
                            n6 = n7 = vRa.d;
                            a2.remove(c2);
                            break block5;
                        }
                        n6 = n7;
                    }
                    if (n6 == 0) {
                        return uSa.E != 0;
                    }
                }
                n4 = ++n5;
            }
            n3 = ++n2;
        }
        return a2.isEmpty();
    }

    /*
     * WARNING - void declaration
     */
    public qAa_1(Mda mda2, List<Mda> list) {
        void b2;
        qAa_1 a2;
        List<Mda> c2 = list;
        qAa_1 qAa_12 = a2 = this;
        qAa_12.A = b2;
        qAa_12.I = c2;
    }
}

