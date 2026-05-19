/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  Ola
 *  Oz
 *  Ypa
 *  aZ
 *  bpa
 *  pqa
 *  pua
 *  uKa
 *  vPa
 *  wOa
 */
import net.minecraft.client.model.ModelBook;
import net.minecraft.util.ResourceLocation;

public final class Pka
extends Ola<aZ> {
    private static final ResourceLocation A = new ResourceLocation(vPa.T);
    private ModelBook I;

    public Pka() {
        Pka a2;
        Pka pka = a2;
        pka.I = new ModelBook();
    }

    /*
     * WARNING - void declaration
     */
    public void J(aZ aZ2, double d2, double d3, double d4, float f2, int n2) {
        void b2;
        void c2;
        void d5;
        void e2;
        Pka g22 = aZ2;
        Pka f3 = this;
        uKa.e();
        uKa.J((float)((float)e2 + MQa.L), (float)((float)d5 + wOa.w), (float)((float)c2 + MQa.L));
        Pka pka = g22;
        float a2 = (float)((aZ)pka).g + b2;
        uKa.J((float)JPa.N, (float)(Nra.e + Oz.d((float)(a2 * Nra.e)) * Jpa.B), (float)JPa.N);
        float f4 = e2 = ((aZ)pka).J - ((aZ)g22).k;
        while (f4 >= pua.j) {
            f4 = e2 - Ypa.Ha;
        }
        float f5 = e2;
        while (f5 < gQa.X) {
            f5 = e2 + Ypa.Ha;
        }
        Pka pka2 = g22;
        uKa.J((float)(-(((aZ)pka2).k + e2 * b2) * Hra.Ga / pua.j), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)KSa.z, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        f3.J(A);
        Pka pka3 = g22;
        float f6 = ((aZ)pka2).I + (((aZ)pka3).m - ((aZ)pka3).I) * b2 + rta.o;
        Pka pka4 = g22;
        float f7 = ((aZ)g22).I + (((aZ)pka4).m - ((aZ)pka4).I) * b2 + wOa.w;
        float f8 = f6;
        f6 = (f8 - (float)Oz.C((double)f8)) * ySa.Da - bpa.K;
        float f9 = f7;
        f7 = (f9 - (float)Oz.C((double)f9)) * ySa.Da - bpa.K;
        if (f6 < JPa.N) {
            f6 = JPa.N;
        }
        if (f7 < JPa.N) {
            f7 = JPa.N;
        }
        if (f6 > pqa.r) {
            f6 = pqa.r;
        }
        if (f7 > pqa.r) {
            f7 = pqa.r;
        }
        Pka pka5 = g22;
        float g22 = ((aZ)pka5).A + (((aZ)pka5).C - ((aZ)g22).A) * b2;
        uKa.h();
        f3.I.J(null, a2, f6, f7, g22, JPa.N, rRa.T);
        uKa.D();
    }
}

