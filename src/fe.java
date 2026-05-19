/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  NPa
 *  ac
 *  bqa
 *  cra
 *  pua
 *  vRa
 *  vpa
 *  zf
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import optifine.Config;

public final class fe
extends EC {
    private EC M;
    public String k;
    private int j;
    private final List J;
    private String A;
    private String I;

    public void l() {
        fe fe2;
        fe fe3 = fe2 = this;
        super.l();
        if ((fe3.j -= vRa.d) == 0) {
            Iterator a2 = fe2.E.iterator();
            Object object = a2;
            while (object.hasNext()) {
                ((ac)a2.next()).J = vRa.d;
                object = a2;
            }
        }
    }

    public void J(int n2) {
        int b2 = n2;
        fe a2 = this;
        a2.j = b2;
        Iterator iterator = b2 = a2.E.iterator();
        while (iterator.hasNext()) {
            ((ac)b2.next()).J = uSa.E;
            iterator = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public fe(EC eC, String string, String string2) {
        void b2;
        void c2;
        fe a2;
        Object d2 = string2;
        fe fe2 = a2 = this;
        a2.J = Lists.newArrayList();
        a2.M = c2;
        fe2.I = b2;
        fe2.A = d2;
        fe2.k = oha.J(cra.g, new Object[uSa.E]);
    }

    public void J(ac ac2) throws IOException {
        fe b2 = ac2;
        fe a2 = this;
        Config.J().J(a2.M);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        fe fe2;
        fe fe3 = fe2 = this;
        fe3.i();
        fe fe4 = fe2;
        fe.J((String)fe3.I, (int)(fe4.A / uqa.g), (int)NPa.e, (int)pua.o);
        int n4 = Jsa.ha;
        Iterator d2 = fe4.J.iterator();
        Iterator iterator = d2;
        while (iterator.hasNext()) {
            fe.J((String)((String)d2.next()), (int)(fe2.A / uqa.g), (int)n4, (int)pua.o);
            n4 += fe2.L.u;
            iterator = d2;
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void A() {
        fe a2;
        a2.E.add(new zf(uSa.E, (int)(a2.A / uqa.g - bqa.Ga), (int)(a2.I / uua.p + zua.m), a2.k));
        fe fe2 = a2;
        fe2.J.clear();
        fe fe3 = a2;
        fe2.J.addAll(fe3.L.J(fe3.A, (int)(a2.A - vpa.o)));
    }
}

