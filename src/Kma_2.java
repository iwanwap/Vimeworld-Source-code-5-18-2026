/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  ERa
 *  Ega
 *  HA
 *  Qsa
 *  SDa
 *  Tpa
 *  ZOa
 *  kea
 *  lqa
 *  pqa
 *  uKa
 *  vPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class Kma_2
extends Ama {
    private static final ResourceLocation k = new ResourceLocation(MRa.u);
    private HA A;
    private final kea I;

    /*
     * WARNING - void declaration
     */
    private int f(int n2) {
        Kma_2 kma_2;
        Kma_2 kma_22 = kma_2 = this;
        int b2 = kma_22.A.J(uqa.g);
        int n3 = kma_22.A.J(yRa.d);
        if (n3 != 0 && b2 != 0) {
            void a2;
            return b2 * a2 / n3;
        }
        return uSa.E;
    }

    public void J(int n2, int n3) {
        Kma_2 b2;
        int c2 = n2;
        Kma_2 kma_2 = b2 = this;
        String string = c2 = kma_2.A.J().f();
        kma_2.L.J(string, b2.j / uqa.g - b2.L.J(string) / uqa.g, uua.p, tpa.i);
        Kma_2 kma_22 = b2;
        kma_22.L.J(kma_22.I.J().f(), Yqa.i, b2.F - zua.m + uqa.g, tpa.i);
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2) {
        void a2;
        Kma_2 kma_2 = this;
        int b2 = kma_2.A.J(vRa.d);
        if (b2 == 0) {
            b2 = ZOa.x;
        }
        return kma_2.A.J(uSa.E) * a2 / b2;
    }

    /*
     * WARNING - void declaration
     */
    public Kma_2(kea kea2, HA hA2) {
        void b2;
        Kma_2 a2;
        Kma_2 c2 = hA2;
        Kma_2 kma_2 = a2 = this;
        super((Ega)new SDa((kea)b2, (HA)c2));
        kma_2.I = b2;
        kma_2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, int n3) {
        void var3_6;
        int d2 = var3_6;
        Kma_2 a2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        Kma_2 kma_2 = a2;
        kma_2.g.J().J(k);
        Kma_2 kma_22 = a2;
        reference c2 = (kma_2.A - kma_22.j) / uqa.g;
        reference b2 = (kma_22.I - a2.F) / uqa.g;
        Kma_2 kma_23 = a2;
        kma_2.f((int)c2, (int)b2, uSa.E, uSa.E, kma_23.j, kma_23.F);
        if (jX.J(kma_2.A)) {
            Kma_2 kma_24 = a2;
            d2 = kma_24.J(uua.s);
            kma_24.f((int)(c2 + Upa.D), (int)(b2 + Qsa.Ha + lqa.s - d2), MTa.U, lqa.s - d2, hpa.Z, d2 + vRa.d);
        }
        Kma_2 kma_25 = a2;
        d2 = kma_25.f(osa.c);
        kma_25.f((int)(c2 + vPa.Ka), (int)(b2 + Tpa.z), MTa.U, hpa.Z, d2 + vRa.d, ERa.C);
    }
}

