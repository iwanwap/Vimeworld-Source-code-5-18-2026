/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  Gl
 *  JPa
 *  MQa
 *  bSa
 *  jpa
 *  lqa
 *  mLa
 *  pqa
 *  qka
 *  uKa
 */
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.util.ResourceLocation;

public final class mLa_1
extends ic<DDa> {
    private static final ResourceLocation I = new ResourceLocation(ITa.S);

    public ResourceLocation J(DDa dDa2) {
        mLa_1 b2 = dDa2;
        mLa_1 a2 = this;
        return I;
    }

    public mLa_1(oLa oLa2) {
        Object b2 = oLa2;
        mLa_1 a2 = this;
        super((oLa)b2, new ModelIronGolem(), MQa.L);
        mLa_1 mLa_12 = a2;
        mLa_12.f(new qka((mLa)mLa_12));
    }

    /*
     * WARNING - void declaration
     */
    public void J(DDa dDa2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void d22;
        float e2 = f2;
        mLa_1 c2 = this;
        void v0 = d22;
        super.J((Gl)v0, e2, (float)b2, (float)a2);
        if ((double)v0.U >= SPa.x) {
            e2 = bSa.J;
            void v1 = d22;
            float d22 = (Math.abs((v1.E - v1.U * (pqa.r - a2) + lqa.ga) % e2 - e2 * MQa.L) - e2 * rta.o) / (e2 * rta.o);
            uKa.J((float)(jpa.K * d22), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
    }
}

