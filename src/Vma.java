/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  NPa
 *  ac
 *  l
 *  pua
 *  vRa
 *  vpa
 *  zf
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Vma
extends EC {
    public String m;
    public String C;
    public l i;
    private int M;
    private final List<String> k;
    public String j;
    public int J;
    private String I;

    public void A() {
        Vma a2;
        a2.E.add(new zf(uSa.E, a2.A / uqa.g - BQa.Q, (int)(a2.I / uua.p + zua.m), a2.C));
        a2.E.add(new zf(vRa.d, a2.A / uqa.g - BQa.Q + rRa.f, (int)(a2.I / uua.p + zua.m), a2.j));
        Vma vma = a2;
        vma.k.clear();
        Vma vma2 = a2;
        vma.k.addAll(vma2.L.J(vma2.I, a2.A - vpa.o));
    }

    public void J(int n2) {
        int b2 = n2;
        Vma a2 = this;
        a2.M = b2;
        Iterator iterator = b2 = a2.E.iterator();
        while (iterator.hasNext()) {
            ((ac)b2.next()).J = uSa.E;
            iterator = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Vma(l l2, String string, String string2, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        Vma a2;
        int n3 = n2;
        Vma vma = a2 = this;
        Vma vma2 = a2;
        a2.k = Lists.newArrayList();
        vma2.i = d2;
        vma2.m = c2;
        vma.I = b2;
        vma.J = e2;
        vma.C = oha.J(dsa.Ha, new Object[uSa.E]);
        a2.j = oha.J(MTa.P, new Object[uSa.E]);
    }

    public void l() {
        Vma vma;
        Vma vma2 = vma = this;
        super.l();
        if ((vma2.M -= vRa.d) == 0) {
            Iterator a2 = vma.E.iterator();
            Object object = a2;
            while (object.hasNext()) {
                ((ac)a2.next()).J = vRa.d;
                object = a2;
            }
        }
    }

    public void J(ac ac2) throws IOException {
        Vma vma;
        boolean bl;
        Vma b2 = ac2;
        Vma a2 = this;
        l l2 = a2.i;
        if (((ac)b2).C == 0) {
            bl = vRa.d;
            vma = a2;
        } else {
            bl = uSa.E;
            vma = a2;
        }
        l2.J(bl, vma.J);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        Vma vma;
        Vma vma2 = vma = this;
        vma2.i();
        Vma vma3 = vma;
        Vma.J((String)vma2.m, (int)(vma3.A / uqa.g), (int)NPa.e, (int)pua.o);
        int n4 = Jsa.ha;
        Iterator<String> d2 = vma3.k.iterator();
        Iterator<String> iterator = d2;
        while (iterator.hasNext()) {
            String string = (String)d2.next();
            iterator = d2;
            int n5 = n4;
            n4 += 20;
            Vma.J((String)string, (int)(vma.A / uqa.g), (int)n5, (int)pua.o);
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Vma(l l2, String string, String string2, String string3, String string4, int n2) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Vma a2;
        int n3 = n2;
        Vma vma = a2 = this;
        Vma vma2 = a2;
        Vma vma3 = a2;
        a2.k = Lists.newArrayList();
        vma3.i = f2;
        vma3.m = e2;
        vma2.I = d2;
        vma2.C = c2;
        vma.j = b2;
        vma.J = g2;
    }
}

