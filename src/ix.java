/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  ERa
 *  Gg
 *  NCa
 *  NTa
 *  Nx
 *  Waa
 *  Xv
 *  qU
 *  vRa
 *  waa
 */
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ix
extends Nx {
    private Set<Baa> field_175791_c;
    private boolean field_175790_d;

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, Xv xv) {
        void a2;
        void c2;
        Object d2 = random;
        ix b2 = this;
        if (!b2.field_175790_d) {
            ix ix2 = b2;
            ix2.components.clear();
            ix2.f((Gg)c2, (Random)d2, b2.J(), b2.f());
        }
        super.J((Gg)c2, (Random)d2, (Xv)a2);
    }

    /*
     * WARNING - void declaration
     */
    public ix(Gg gg2, Random random, int n2, int n3) {
        void c2;
        void d2;
        void e2;
        void b2;
        int n4 = n3;
        ix a2 = this;
        super((int)b2, (int)e2);
        a2.field_175791_c = Sets.newHashSet();
        a2.f((Gg)d2, (Random)c2, (int)b2, (int)e2);
    }

    public boolean J(Baa baa2) {
        ix b2 = baa2;
        ix a2 = this;
        if (a2.field_175791_c.contains((Object)b2)) {
            return uSa.E != 0;
        }
        return super.J((Baa)b2);
    }

    public ix() {
        ix a2;
        a2.field_175791_c = Sets.newHashSet();
    }

    public void f(Waa waa2) {
        ix b2 = waa2;
        ix a2 = this;
        ix ix2 = b2;
        super.f((Waa)ix2);
        if (ix2.J(BPa.ca, WOa.fa)) {
            int n2;
            b2 = b2.J(BPa.ca, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < b2.J()) {
                Waa waa3 = b2.J(n2);
                a2.field_175791_c.add(new Baa(waa3.J(DPa.ba), waa3.J(Psa.V)));
                n3 = ++n2;
            }
        }
    }

    public void J(Baa baa2) {
        ix a2;
        ix b2 = baa2;
        ix ix2 = a2 = this;
        super.J((Baa)b2);
        ix2.field_175791_c.add((Baa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        Iterator<Baa> iterator;
        void a2;
        ix ix2;
        ix ix3 = ix2 = this;
        super.J((Waa)a2);
        waa waa3 = new waa();
        Iterator<Baa> iterator2 = iterator = ix3.field_175791_c.iterator();
        while (iterator2.hasNext()) {
            ix b2 = iterator.next();
            Waa waa4 = new Waa();
            iterator2 = iterator;
            Waa waa5 = waa4;
            waa5.J(DPa.ba, ((Baa)b2).j);
            waa5.J(Psa.V, ((Baa)b2).A);
            waa3.J((NCa)waa5);
        }
        a2.J(BPa.ca, (NCa)waa3);
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, Random random, int n2, int n3) {
        void e22;
        void b2;
        void d2;
        void c2;
        int n4 = n3;
        ix a2 = this;
        void v0 = c2;
        v0.setSeed(d2.J());
        long l2 = v0.nextLong();
        long l3 = v0.nextLong();
        l2 = (long)b2 * l2;
        l3 = (long)e22 * l3;
        v0.setSeed(l2 ^ l3 ^ d2.J());
        d2 = b2 * ERa.C + Yqa.i - ITa.A;
        b2 = e22 * ERa.C + Yqa.i - ITa.A;
        DZ e22 = LX.HORIZONTAL.random((Random)c2);
        a2.components.add(new qU((Random)c2, (int)d2, (int)b2, e22));
        a2.J();
        a2.field_175790_d = vRa.d;
    }
}

