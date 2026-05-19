/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  Kd
 *  Kpa
 *  Oz
 *  PNa
 *  SOa
 *  ac
 *  cRa
 *  if
 *  lPa
 *  pqa
 *  rna
 *  vRa
 *  wNa
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

public final class Cma_3
extends ac {
    public boolean i;
    public final /* synthetic */ Hoa j;
    private final rna J;
    public float A;
    private final String I;

    public void J(int n2, int n3) {
        int c2 = n3;
        Cma_3 a2 = this;
        if (a2.i) {
            Cma_3 cma_3;
            if (a2.J == rna.MASTER) {
                cma_3 = a2;
            } else {
                Cma_3 cma_32 = a2;
                cma_3 = cma_32;
                Hoa.J(cma_32.j).J(a2.J);
            }
            cma_3.j.g.J().J((X)PNa.J((ResourceLocation)new ResourceLocation(cRa.u), (float)pqa.r));
        }
        a2.i = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public Cma_3(Hoa hoa, int n2, int n3, int n4, rna rna2, boolean bl) {
        Cma_3 g2;
        void a2;
        void c2;
        void d2;
        void e2;
        void f2;
        Cma_3 cma_3 = cma_32;
        Cma_3 cma_32 = rna2;
        Cma_3 b2 = cma_3;
        b2.j = f2;
        super((int)e2, (int)d2, (int)c2, a2 != false ? lPa.Ja : Jpa.Ha, kTa.j, Mqa.y);
        Cma_3 cma_33 = b2;
        cma_33.A = pqa.r;
        cma_33.J = g2;
        Cma_3 cma_34 = b2;
        cma_33.I = oha.J(zua.Ka + g2.getCategoryName(), new Object[uSa.E]);
        Cma_3 cma_35 = b2;
        cma_35.i = new StringBuilder().insert(2 & 5, b2.I).append(Xpa.E).append(f2.J((rna)g2)).toString();
        cma_35.A = Hoa.J((Hoa)f2).J((rna)g2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void a2;
        void c2;
        Cma_3 b2 = this;
        int d2 = n2;
        if (super.J((Kpa)c2, d2, (int)a2)) {
            void v0 = c2;
            Cma_3 cma_3 = b2;
            Cma_3 cma_32 = b2;
            cma_3.A = (float)(d2 - (cma_32.m + AQa.P)) / (float)(b2.j - Yqa.i);
            cma_3.A = Oz.J((float)cma_32.A, (float)JPa.N, (float)pqa.r);
            Cma_3 cma_33 = b2;
            v0.z.J(cma_33.J, cma_33.A);
            v0.z.d();
            Cma_3 cma_34 = b2;
            Cma_3 cma_35 = b2;
            cma_3.i = b2.I + Xpa.E + cma_35.j.J(cma_35.J);
            cma_34.i = vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(wNa object) {
        Cma_3 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Kpa kpa2, int n2, int n3) {
        int d2 = n2;
        Cma_3 b2 = this;
        if (b2.k) {
            if (b2.i) {
                void c2;
                void v0 = c2;
                Cma_3 cma_3 = b2;
                Cma_3 cma_32 = b2;
                cma_32.A = (float)(d2 - (cma_32.m + yRa.d)) / (float)(b2.j - kTa.j);
                cma_3.A = Oz.J((float)cma_32.A, (float)JPa.N, (float)pqa.r);
                Cma_3 cma_33 = b2;
                v0.z.J(cma_33.J, cma_33.A);
                v0.z.d();
                Cma_3 cma_34 = b2;
                Cma_3 cma_35 = b2;
                cma_3.i = b2.I + Xpa.E + cma_35.j.J(cma_35.J);
            }
            Cma_3 cma_3 = b2;
            if.J((double)(b2.m + yRa.d + (int)(cma_3.A * (float)(cma_3.j - kTa.j))), (double)((double)(b2.I + AQa.P)), (double)SOa.w, (double)SOa.w, (Color)Bc.Ja, (Color)Bc.Ga, (Kd)Kd.XXS);
        }
    }

    public int J(boolean bl) {
        boolean b2 = bl;
        Cma_3 a2 = this;
        return uSa.E;
    }
}

