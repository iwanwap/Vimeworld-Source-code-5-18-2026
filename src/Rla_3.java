/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  Kpa
 *  Lra
 *  MQa
 *  Oz
 *  QFa
 *  QJa
 *  bpa
 *  pqa
 *  uKa
 *  vL
 *  vPa
 */
import net.minecraft.util.ResourceLocation;

public final class Rla_3
extends GC<vFa> {
    public ResourceLocation J(vFa vFa2) {
        Object b2 = vFa2;
        Rla_3 a2 = this;
        return WKa.C;
    }

    public Rla_3(oLa oLa2) {
        Object b2 = oLa2;
        Rla_3 a2 = this;
        super((oLa)b2);
        a2.I = MQa.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vFa vFa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void a2;
        void f4;
        void c2;
        void d5;
        void e2;
        Rla_3 rla_3 = this;
        QJa qJa2 = Kpa.J().J();
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5 + MQa.L), (float)((float)c2));
        if ((float)f4.A - a2 + pqa.r < FRa.Ga) {
            float g2 = pqa.r - ((float)f4.A - a2 + pqa.r) / FRa.Ga;
            g2 = Oz.J((float)g2, (float)JPa.N, (float)pqa.r);
            g2 *= g2;
            g2 *= g2;
            float f5 = pqa.r + g2 * bpa.K;
            uKa.l((float)f5, (float)f5, (float)f5);
        }
        float g2 = (pqa.r - ((float)f4.A - a2 + pqa.r) / QTa.G) * xSa.la;
        void v1 = f4;
        rla_3.f((vL)v1);
        uKa.J((float)vPa.b, (float)vPa.b, (float)MQa.L);
        qJa2.J(QFa.Lc.J(), f4.J((float)a2));
        uKa.J((float)JPa.N, (float)JPa.N, (float)pqa.r);
        if (v1.A / tTa.h % uqa.g == 0) {
            uKa.z();
            uKa.L();
            uKa.B();
            uKa.f((int)Lra.k, (int)Nra.c);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)g2);
            uKa.J((float)TOa.p, (float)TOa.p);
            uKa.i();
            qJa2.J(QFa.Lc.J(), pqa.r);
            uKa.J((float)JPa.N, (float)JPa.N);
            uKa.U();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.k();
            uKa.P();
            uKa.H();
        }
        uKa.D();
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

