/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ela
 *  Gl
 *  JPa
 *  Kpa
 *  MQa
 *  Mda
 *  Xja
 *  ZRa
 *  Zua
 *  aSa
 *  eAa
 *  hra
 *  id
 *  nFa
 *  pqa
 *  pua
 *  uKa
 *  xOa
 */
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelWitch;

public final class yja_2
implements id<nFa> {
    private final Ela I;

    public boolean J() {
        return uSa.E != 0;
    }

    public yja_2(Ela ela2) {
        yja_2 b2 = ela2;
        yja_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(nFa nFa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void h2;
        float f9 = f5;
        yja_2 d2 = this;
        Mda g2 = h2.J();
        if (g2 != null) {
            float i2;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.e();
            if (d2.I.J().isChild) {
                uKa.J((float)JPa.N, (float)Jpa.y, (float)JPa.N);
                uKa.J((float)Lsa.X, (float)vqa.T, (float)JPa.N, (float)JPa.N);
                float f10 = MQa.L;
                uKa.l((float)f10, (float)f10, (float)f10);
            }
            ((ModelWitch)d2.I.J()).villagerNose.l(rRa.T);
            uKa.J((float)Mqa.b, (float)aSa.Ha, (float)Zua.y);
            eAa f10 = g2.J();
            Kpa e2 = Kpa.J();
            if (f10 instanceof kda && e2.J().J(Block.J(f10), g2.J())) {
                uKa.J((float)JPa.N, (float)rRa.T, (float)lTa.Z);
                uKa.J((float)NSa.B, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)CRa.M, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                float f11 = i2 = MRa.K;
                uKa.l((float)f11, (float)(-i2), (float)f11);
            } else if (f10 == Gea.cd) {
                uKa.J((float)JPa.N, (float)Mqa.N, (float)dsa.K);
                uKa.J((float)pua.e, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                float f12 = i2 = Jpa.y;
                uKa.l((float)f12, (float)(-i2), (float)f12);
                uKa.J((float)pua.Ja, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)Lsa.X, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else if (f10.i()) {
                if (f10.d()) {
                    uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                    uKa.J((float)JPa.N, (float)Mqa.b, (float)JPa.N);
                }
                d2.I.l();
                uKa.J((float)rRa.T, (float)dsa.K, (float)JPa.N);
                float f13 = i2 = Jpa.y;
                uKa.l((float)f13, (float)(-i2), (float)f13);
                uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)JPa.N, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else {
                uKa.J((float)sqa.Z, (float)sqa.Z, (float)JPa.N);
                i2 = xOa.B;
                uKa.l((float)i2, (float)i2, (float)i2);
                uKa.J((float)Lsa.X, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                uKa.J((float)hra.z, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)TOa.R, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            }
            uKa.J((float)DPa.m, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)ZRa.l, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            e2.J().J((Gl)h2, g2, Xja.THIRD_PERSON);
            uKa.D();
        }
    }
}

