/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  Gl
 *  JPa
 *  Kpa
 *  MQa
 *  Mda
 *  Xja
 *  asa
 *  eAa
 *  hy
 *  id
 *  pqa
 *  uKa
 */
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;

public final class lja_3
implements id<Gl> {
    private final Ad<?> I;

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void h2;
        float i222 = f3;
        lja_3 f9 = this;
        Mda g2 = h2.J();
        if (g2 != null) {
            uKa.e();
            if (f9.I.J().isChild) {
                i222 = MQa.L;
                uKa.J((float)JPa.N, (float)Jpa.y, (float)JPa.N);
                uKa.J((float)Lsa.X, (float)vqa.T, (float)JPa.N, (float)JPa.N);
                float f10 = i222;
                uKa.l((float)f10, (float)f10, (float)f10);
            }
            ((ModelBiped)f9.I.J()).J(rRa.T);
            uKa.J((float)Mqa.b, (float)asa.t, (float)rRa.T);
            eAa i222 = g2.J();
            Kpa e2 = Kpa.J();
            if (i222 instanceof kda && Block.J(i222).J() == hy.ENTITYBLOCK_ANIMATED) {
                uKa.J((float)JPa.N, (float)sqa.Z, (float)Qra.Z);
                uKa.J((float)eta.e, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)nua.E, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                float i222 = MRa.K;
                uKa.l((float)(-i222), (float)(-i222), (float)i222);
            }
            if (h2.q()) {
                uKa.J((float)JPa.N, (float)STa.N, (float)JPa.N);
            }
            e2.J().J((Gl)h2, g2, Xja.THIRD_PERSON);
            uKa.D();
        }
    }

    public lja_3(Ad<?> ad2) {
        Ad<?> b2 = ad2;
        Ad<?> a2 = this;
        a2.I = b2;
    }
}

