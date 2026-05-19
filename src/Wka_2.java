/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cga
 *  JPa
 *  Kpa
 *  Lra
 *  Oz
 *  QFa
 *  Yea
 *  bpa
 *  pqa
 *  pua
 *  rKa
 *  uKa
 */
import net.minecraft.block.state.IBlockState;

public final class Wka_2
extends rKa<Cga> {
    /*
     * WARNING - void declaration
     */
    public void J(Cga cga2, float f2, IBlockState iBlockState) {
        void a2;
        void b2;
        void c2;
        Wka_2 wka_2 = this;
        int n2 = c2.J();
        if (n2 > pua.o && (float)n2 - b2 + pqa.r < FRa.Ga) {
            float d2 = pqa.r - ((float)n2 - b2 + pqa.r) / FRa.Ga;
            d2 = Oz.J((float)d2, (float)JPa.N, (float)pqa.r);
            d2 *= d2;
            d2 *= d2;
            float f3 = pqa.r + d2 * bpa.K;
            uKa.l((float)f3, (float)f3, (float)f3);
        }
        super.J((Yea)c2, (float)b2, (IBlockState)a2);
        if (n2 > pua.o && n2 / tTa.h % uqa.g == 0) {
            Wka_2 d2 = Kpa.J().J();
            uKa.z();
            uKa.L();
            uKa.B();
            uKa.f((int)Lra.k, (int)Nra.c);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)((pqa.r - ((float)n2 - b2 + pqa.r) / QTa.G) * xSa.la));
            uKa.e();
            d2.J(QFa.Lc.J(), pqa.r);
            uKa.D();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.k();
            uKa.P();
            uKa.H();
        }
    }

    public Wka_2(oLa oLa2) {
        Object b2 = oLa2;
        Wka_2 a2 = this;
        super((oLa)b2);
    }
}

