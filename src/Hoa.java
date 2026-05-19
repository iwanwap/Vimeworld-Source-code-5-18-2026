/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  Cma
 *  EC
 *  JPa
 *  Sqa
 *  Ypa
 *  ZOa
 *  ac
 *  cra
 *  lqa
 *  pua
 *  rna
 *  vRa
 */
import java.io.IOException;

public final class Hoa
extends EC {
    private final EC j;
    private final Cia J;
    public String A;
    private String I;

    /*
     * WARNING - void declaration
     */
    public Hoa(EC eC2, Cia cia) {
        void b2;
        Hoa a2;
        Hoa c2 = cia;
        Hoa hoa = a2 = this;
        a2.A = Sqa.E;
        hoa.j = b2;
        hoa.J = c2;
    }

    public void J(ac ac2) throws IOException {
        Hoa b2 = ac2;
        Hoa a2 = this;
        if (((ac)b2).J && ((ac)b2).C == ZOa.x) {
            Hoa hoa = a2;
            hoa.g.z.d();
            hoa.g.J(a2.j);
        }
    }

    public static /* synthetic */ Cia J(Hoa a2) {
        return a2.J;
    }

    public String J(rna rna2) {
        Hoa b22 = rna2;
        Hoa a2 = this;
        float b22 = a2.J.J((rna)b22);
        if (b22 == JPa.N) {
            return a2.I;
        }
        return (int)(b22 * QTa.G) + Wqa.fa;
    }

    public void A() {
        int n2;
        Hoa hoa = this;
        int a2 = uSa.E;
        hoa.A = oha.J(dsa.n, new Object[uSa.E]);
        hoa.I = oha.J(tSa.Ha, new Object[uSa.E]);
        Hoa hoa2 = hoa;
        hoa.E.add(new Cma(hoa2, rna.MASTER.getCategoryId(), (int)(hoa.A / uqa.g - BQa.Q + a2 % uqa.g * rRa.f), (int)(hoa2.I / uua.p - lqa.s + osa.c * (a2 >> vRa.d)), rna.MASTER, vRa.d != 0));
        a2 += uqa.g;
        rna[] rnaArray = rna.values();
        int n3 = rnaArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            rna rna2 = rnaArray[n2];
            if (rna2 != rna.MASTER) {
                Hoa hoa3 = hoa;
                hoa.E.add(new Cma(hoa3, rna2.getCategoryId(), (int)(hoa.A / uqa.g - BQa.Q + ++a2 % uqa.g * rRa.f), (int)(hoa3.I / uua.p - lqa.s + osa.c * (a2 >> vRa.d)), rna2, uSa.E != 0));
            }
            n4 = ++n2;
        }
        hoa.E.add(new ac(ZOa.x, (int)(hoa.A / uqa.g - ySa.T), (int)(hoa.I / uua.p + tua.i), oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        Hoa a2;
        float d2 = f2;
        Hoa hoa = a2 = this;
        a2.i();
        Hoa.J((String)hoa.A, (int)(a2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }
}

