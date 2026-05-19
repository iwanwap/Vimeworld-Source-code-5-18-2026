/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Goa
 *  Kpa
 *  MNa
 *  Rna
 *  Wc
 *  bNa
 *  pua
 *  vRa
 *  xoa
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class pna
extends qMa {
    private int i;
    private final Wc j;
    private final List<Goa> J;
    private final List<Rna> A;
    private final uLa I;

    @Override
    public boolean f(int n2) {
        int b2 = n2;
        pna a2 = this;
        if (b2 == a2.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public pna(uLa uLa2, Kpa kpa2, int n2, int n3, int n4, int n5, int n6) {
        void g;
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        pna a2;
        int n7 = n6;
        pna pna2 = a2 = this;
        super((Kpa)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)h);
        a2.A = Lists.newArrayList();
        a2.J = Lists.newArrayList();
        pna pna3 = a2;
        pna2.j = new bNa();
        pna2.i = pua.o;
        pna2.I = g;
    }

    public int l() {
        pna a2;
        return super.l() + Ira.ga;
    }

    public int M() {
        pna a2;
        return super.M() + Fsa.d;
    }

    public int e() {
        pna a2;
        return a2.A.size() + vRa.d + a2.J.size();
    }

    /*
     * WARNING - void declaration
     */
    public void J(xoa xoa2) {
        void a2;
        int b2;
        pna pna2 = this;
        pna2.A.clear();
        int n2 = b2 = uSa.E;
        while (n2 < a2.J()) {
            pna2.A.add(new Rna(pna2.I, a2.J(b2++)));
            n2 = b2;
        }
    }

    public int i() {
        pna a2;
        return a2.i;
    }

    public void J(List<MNa> list) {
        Object b2 = list;
        pna a2 = this;
        a2.J.clear();
        b2 = b2.iterator();
        Object object = b2;
        while (object.hasNext()) {
            MNa mNa = (MNa)b2.next();
            object = b2;
            a2.J.add(new Goa(a2.I, mNa));
        }
    }

    public void l(int n2) {
        int b2 = n2;
        pna a2 = this;
        a2.i = b2;
    }

    @Override
    public Wc J(int n2) {
        int b2 = n2;
        pna a2 = this;
        if (b2 < a2.A.size()) {
            return (Wc)a2.A.get(b2);
        }
        if ((b2 -= a2.A.size()) == 0) {
            return a2.j;
        }
        return (Wc)a2.J.get(--b2);
    }
}

