/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Ega
 *  FTa
 *  Gl
 *  HA
 *  Joa
 *  Kpa
 *  Rea
 *  TQa
 *  XEa
 *  XTa
 *  jRa
 *  pqa
 *  uKa
 *  vPa
 *  vpa
 */
import net.minecraft.util.ResourceLocation;

public final class zoa_3
extends Ama {
    private HA m;
    private float C;
    private Rea i;
    private HA M;
    private static final ResourceLocation k = new ResourceLocation(FTa.Fa);
    private float A;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        int d2 = n3;
        zoa_3 b2 = this;
        b2.A = (float)c2;
        b2.C = d2;
        super.J((int)c2, d2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public zoa_3(HA hA2, HA hA3, Rea rea2) {
        void b2;
        void c2;
        zoa_3 a2;
        zoa_3 d2 = rea2;
        zoa_3 zoa_32 = a2 = this;
        zoa_3 zoa_33 = a2;
        super((Ega)new XEa((HA)c2, (HA)b2, (Rea)d2, (Sx)Kpa.J().c));
        a2.M = c2;
        zoa_32.m = b2;
        zoa_32.i = d2;
        zoa_32.f = uSa.E;
    }

    public void J(int n2, int n3) {
        zoa_3 a2;
        int c2 = n3;
        zoa_3 zoa_32 = a2 = this;
        zoa_32.L.J(zoa_32.m.J().f(), Yqa.i, uua.p, tpa.i);
        zoa_3 zoa_33 = a2;
        zoa_33.L.J(zoa_33.M.J().f(), Yqa.i, a2.F - zua.m + uqa.g, tpa.i);
    }

    public void J(float f2, int n2, int n3) {
        int d2 = n2;
        zoa_3 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        zoa_3 zoa_32 = b2;
        zoa_32.g.J().J(k);
        zoa_3 zoa_33 = b2;
        float c2 = (zoa_32.A - zoa_33.j) / uqa.g;
        d2 = (zoa_33.I - b2.F) / uqa.g;
        zoa_3 zoa_34 = b2;
        zoa_32.f((int)c2, d2, uSa.E, uSa.E, zoa_34.j, zoa_34.F);
        if (zoa_32.i.ca()) {
            b2.f((int)(c2 + vPa.Ka), d2 + yta.Ka, uSa.E, b2.F, Jsa.ha, GPa.C);
        }
        if (b2.i.fa()) {
            b2.f((int)(c2 + XTa.W), d2 + TQa.ca, uSa.E, b2.F + GPa.C, yOa.B, yOa.B);
        }
        Joa.J((int)(c2 + cPa.Q), (int)(d2 + Psa.M), (int)yta.Ka, (float)((float)(c2 + cPa.Q) - b2.A), (float)((float)(d2 + jRa.X - vpa.o) - b2.C), (Gl)b2.i);
    }
}

