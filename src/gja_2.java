/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kpa
 *  MQa
 *  QJa
 *  bKa
 *  id
 *  nka
 *  pqa
 *  uKa
 *  vea
 */
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class gja_2
implements id<vea> {
    private final bKa I;

    public boolean J() {
        return uSa.E != 0;
    }

    public gja_2(bKa bKa2) {
        gja_2 b2 = bKa2;
        gja_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vea vea2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        gja_2 i22 = vea2;
        gja_2 h2 = this;
        IBlockState g2 = i22.J();
        if (g2.J().J() != Material.air) {
            void e2;
            QJa f222 = Kpa.J().J();
            uKa.o();
            uKa.e();
            uKa.J((float)JPa.N, (float)sOa.Ka, (float)zpa.ja);
            uKa.J((float)eta.e, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)nua.E, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)rta.o, (float)sqa.Z, (float)rta.o);
            float d2 = MQa.L;
            uKa.l((float)(-d2), (float)(-d2), (float)d2);
            int i22 = i22.J((float)e2);
            int f222 = i22 % opa.w;
            nka.J((int)nka.P, (float)((float)f222 / pqa.r), (float)((float)(i22 /= opa.w) / pqa.r));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            h2.I.J(WKa.C);
            f222.J(g2, pqa.r);
            uKa.D();
            uKa.E();
        }
    }
}

