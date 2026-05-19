/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Ega
 *  Gua
 *  HA
 *  Kpa
 *  Qea
 *  pqa
 *  uKa
 */
import net.minecraft.util.ResourceLocation;

public final class hna_2
extends Ama {
    private static final ResourceLocation k = new ResourceLocation(cPa.w);
    private int J;
    public HA A;
    private HA I;

    public void J(int n2, int n3) {
        hna_2 a2;
        int c2 = n3;
        hna_2 hna_22 = a2 = this;
        hna_22.L.J(hna_22.A.J().f(), Yqa.i, uua.p, tpa.i);
        hna_2 hna_23 = a2;
        hna_23.L.J(hna_23.I.J().f(), Yqa.i, a2.F - zua.m + uqa.g, tpa.i);
    }

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        hna_2 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        hna_2 hna_22 = b2;
        hna_22.g.J().J(k);
        hna_2 hna_23 = b2;
        reference c2 = (hna_22.A - hna_23.j) / uqa.g;
        d2 = (hna_23.I - b2.F) / uqa.g;
        hna_2 hna_24 = b2;
        hna_22.f((int)c2, (int)d2, uSa.E, uSa.E, hna_24.j, hna_24.J * yOa.B + yta.Ka);
        hna_22.f((int)c2, d2 + b2.J * yOa.B + yta.Ka, uSa.E, rQa.i, b2.j, zua.m);
    }

    /*
     * WARNING - void declaration
     */
    public hna_2(HA hA2, HA hA3) {
        void a2;
        hna_2 b2;
        hna_2 c22 = hA2;
        hna_2 hna_22 = b2 = this;
        hna_2 hna_23 = b2;
        super((Ega)new Qea((HA)c22, (HA)a2, (Sx)Kpa.J().c));
        hna_23.I = c22;
        hna_23.A = a2;
        hna_22.f = uSa.E;
        int c22 = Gua.F - Jra.o;
        hna_22.J = a2.f() / WOa.fa;
        hna_22.F = c22 + b2.J * yOa.B;
    }
}

