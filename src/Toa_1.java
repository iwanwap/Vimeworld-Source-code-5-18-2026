/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Qsa
 *  ac
 *  aqa
 *  ld
 *  pua
 *  vpa
 */
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class Toa_1
extends EC {
    private final EC k;
    private List<String> j;
    private int J;
    private String A;
    private ld I;

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        Toa_1 toa_1 = this;
    }

    public void A() {
        Toa_1 a2;
        Toa_1 toa_1 = a2;
        toa_1.E.clear();
        a2.j = toa_1.L.J(a2.I.l(), (int)(a2.A - vpa.o));
        toa_1.J = toa_1.j.size() * a2.L.u;
        toa_1.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / uqa.g + a2.J / uqa.g + a2.L.u), oha.J(aqa.F, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        Toa_1 toa_1;
        Toa_1 toa_12 = toa_1 = this;
        toa_12.i();
        Toa_1 toa_13 = toa_1;
        Toa_1.J((String)toa_12.A, (int)(toa_1.A / uqa.g), (int)(toa_13.I / uqa.g - toa_1.J / uqa.g - Qsa.Ha), (int)pua.o);
        reference var4_5 = toa_13.I / uqa.g - toa_1.J / uqa.g;
        if (toa_12.j != null) {
            Iterator<String> d2 = toa_1.j.iterator();
            Object object = d2;
            while (object.hasNext()) {
                String string = (String)d2.next();
                object = d2;
                Toa_1.J((String)string, (int)(toa_1.A / uqa.g), (int)(var4_6 += 10), (int)pua.o);
            }
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void J(ac ac2) throws IOException {
        Toa_1 b2 = ac2;
        Toa_1 a2 = this;
        if (((ac)b2).C == 0) {
            Toa_1 toa_1 = a2;
            toa_1.g.J(toa_1.k);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Toa_1(EC eC, String string, ld ld2) {
        void b2;
        void c2;
        Toa_1 a2;
        Toa_1 d2 = ld2;
        Toa_1 toa_1 = a2 = this;
        toa_1.k = c2;
        toa_1.A = oha.J((String)b2, new Object[uSa.E]);
        a2.I = d2;
    }
}

