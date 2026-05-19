/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Ega
 *  HA
 *  Kpa
 *  kea
 *  pqa
 *  sda
 *  uKa
 */
import net.minecraft.util.ResourceLocation;

public final class BMa_3
extends Ama {
    private HA M;
    private static final ResourceLocation k = new ResourceLocation(oQa.K);
    private HA I;

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        BMa_3 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        BMa_3 bMa_3 = b2;
        bMa_3.g.J().J(k);
        BMa_3 bMa_32 = b2;
        int c2 = (bMa_3.A - bMa_32.j) / uqa.g;
        d2 = (bMa_32.I - b2.F) / uqa.g;
        BMa_3 bMa_33 = b2;
        bMa_3.f(c2, (int)d2, uSa.E, uSa.E, bMa_33.j, bMa_33.F);
    }

    /*
     * WARNING - void declaration
     */
    public BMa_3(kea kea2, HA hA2) {
        void b2;
        BMa_3 a2;
        BMa_3 c2 = hA2;
        BMa_3 bMa_3 = a2 = this;
        BMa_3 bMa_32 = a2;
        super((Ega)new sda((kea)b2, (HA)c2, (Sx)Kpa.J().c));
        bMa_32.I = b2;
        bMa_3.M = c2;
        bMa_32.f = uSa.E;
        bMa_3.F = ITa.Da;
    }

    public void J(int n2, int n3) {
        BMa_3 a2;
        int c2 = n3;
        BMa_3 bMa_3 = a2 = this;
        bMa_3.L.J(bMa_3.M.J().f(), Yqa.i, uua.p, tpa.i);
        BMa_3 bMa_32 = a2;
        bMa_32.L.J(bMa_32.I.J().f(), Yqa.i, a2.F - zua.m + uqa.g, tpa.i);
    }
}

