/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bma
 *  Cia
 *  DW
 *  EC
 *  ERa
 *  ISa
 *  Qta
 *  XTa
 *  ac
 *  cra
 *  eia
 *  pPa
 *  pua
 *  sMa
 *  vRa
 *  zf
 */
import java.io.IOException;

public final class Bma_1
extends EC {
    private final eia M;
    private jma k;
    public EC j;
    private zf J;
    private final Cia A;
    private zf I;

    /*
     * WARNING - void declaration
     */
    public Bma_1(EC eC2, Cia cia, eia eia2) {
        void b2;
        void c2;
        Bma_1 a2;
        Bma_1 d2 = eia2;
        Bma_1 bma_1 = a2 = this;
        a2.j = c2;
        bma_1.A = b2;
        bma_1.M = d2;
    }

    public static /* synthetic */ Cia J(Bma a2) {
        return a2.A;
    }

    public void J(ac ac2) throws IOException {
        Bma_1 b2 = ac2;
        Bma_1 a2 = this;
        if (((ac)b2).J) {
            switch (((ac)b2).C) {
                case 5: {
                    return;
                }
                case 6: {
                    Bma_1 bma_1 = a2;
                    bma_1.g.J(bma_1.j);
                    return;
                }
                case 100: {
                    sMa sMa2;
                    if (!(b2 instanceof zf)) break;
                    a2.A.f(((zf)b2).f(), vRa.d);
                    ((ac)b2).i = a2.A.J(Fha.FORCE_UNICODE_FONT);
                    sMa sMa3 = sMa2 = new sMa(a2.g);
                    int n2 = sMa3.f();
                    int n3 = sMa3.J();
                    a2.f(a2.g, n2, n3);
                    DW.J();
                    return;
                }
                default: {
                    a2.k.J((ac)b2);
                }
            }
        }
    }

    public static /* synthetic */ eia J(Bma a2) {
        return a2.M;
    }

    public static /* synthetic */ zf f(Bma a2) {
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        Bma_1 bma_1 = this;
        bma_1.k.J((int)c2, (int)b2, (float)a2);
        String string = oha.J(pua.h, new Object[uSa.E]);
        Object d2 = new StringBuilder().insert(2 & 5, pPa.k).append(oha.J(lQa.V, new Object[uSa.E])).append(hpa.b).toString();
        Bma_1.J((String)string, (int)(bma_1.A / uqa.g), (int)ERa.C, (int)pua.o);
        Bma_1.J((String)d2, (int)(bma_1.A / uqa.g), (int)(bma_1.I - Upa.D), (int)Qta.L);
        super.J((int)c2, (int)b2, (float)a2);
    }

    public static /* synthetic */ zf J(Bma a2) {
        return a2.I;
    }

    public void d() throws IOException {
        Bma_1 a2;
        Bma_1 bma_1 = a2;
        super.d();
        bma_1.k.f();
    }

    public void A() {
        Bma_1 a2;
        a2.J = new zf(ySa.T, (int)(a2.A / uqa.g - BQa.Q), (int)(a2.I - ISa.E), Fha.FORCE_UNICODE_FONT, a2.A.J(Fha.FORCE_UNICODE_FONT));
        a2.E.add(a2.J);
        a2.I = new zf(uua.p, (int)(a2.A / uqa.g - BQa.Q + rRa.f), (int)(a2.I - ISa.E), oha.J(cra.g, new Object[uSa.E]));
        a2.E.add(a2.I);
        Bma_1 bma_1 = a2;
        bma_1.k = new jma((Bma)bma_1, a2.g);
        bma_1.k.l(XTa.W, Yqa.i);
    }
}

