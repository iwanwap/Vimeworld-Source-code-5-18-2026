/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  CZ
 *  Ega
 *  Gg
 *  fDa
 *  kea
 *  ld
 *  pqa
 *  uKa
 *  wPa
 *  xA
 */
import net.minecraft.util.ResourceLocation;

public final class Zna_3
extends Ama {
    private ld A;
    private static final ResourceLocation I = new ResourceLocation(LRa.O);

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        Zna_3 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        Zna_3 zna_3 = b2;
        zna_3.g.J().J(I);
        Zna_3 zna_32 = b2;
        reference c2 = (zna_3.A - zna_32.j) / uqa.g;
        d2 = (zna_32.I - b2.F) / uqa.g;
        Zna_3 zna_33 = b2;
        zna_3.f((int)c2, (int)d2, uSa.E, uSa.E, zna_33.j, zna_33.F);
    }

    /*
     * WARNING - void declaration
     */
    public Zna_3(kea kea2, Gg gg2, xA xA2) {
        void b2;
        void c2;
        Zna_3 d2 = xA2;
        Zna_3 a2 = this;
        a2((kea)c2, (Gg)b2);
        a2.A = d2.J();
    }

    /*
     * WARNING - void declaration
     */
    public Zna_3(kea kea2, Gg gg2, XF xF2) {
        void b2;
        void c2;
        Zna_3 a2;
        Object d2 = xF2;
        Zna_3 zna_3 = a2 = this;
        super((Ega)new fDa((kea)c2, (Gg)b2, (XF)((Object)d2)));
        a2.A = null;
    }

    /*
     * WARNING - void declaration
     */
    public Zna_3(kea kea2, Gg gg2) {
        void b2;
        Zna_3 c2 = gg2;
        Zna_3 a2 = this;
        a2((kea)b2, (Gg)c2, XF.ORIGIN);
    }

    public void J(int n2, int n3) {
        Zna_3 zna_3;
        String c22;
        int c22 = n2;
        Zna_3 b2 = this;
        if (b2.A == null || b2.A instanceof CZ && ((CZ)b2.A).C().equals(NSa.Ka)) {
            c22 = oha.J(Upa.q, new Object[uSa.E]);
            zna_3 = b2;
        } else {
            Zna_3 zna_32 = b2;
            zna_3 = zna_32;
            c22 = zna_32.A.l();
        }
        zna_3.L.J(c22, EPa.O, uua.p, tpa.i);
        b2.L.J(oha.J(wPa.Ja, new Object[uSa.E]), Yqa.i, b2.F - zua.m + uqa.g, tpa.i);
    }
}

