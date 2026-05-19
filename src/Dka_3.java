/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kpa
 *  MQa
 *  QFa
 *  TDa
 *  id
 *  kPa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 */
import net.minecraft.client.model.ModelQuadruped;

public final class Dka_3
implements id<TDa> {
    private final fla I;

    public void J(TDa tDa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Dka_3 i2 = tDa2;
        Dka_3 h2 = this;
        if (!i2.Y() && !i2.C()) {
            i2 = Kpa.J().J();
            Dka_3 dka_3 = h2;
            dka_3.I.J(WKa.C);
            uKa.h();
            uKa.M((int)Yua.O);
            uKa.e();
            uKa.l((float)pqa.r, (float)vqa.T, (float)pqa.r);
            uKa.J((float)psa.N, (float)kPa.W, (float)MQa.L);
            uKa.J((float)CRa.q, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.e();
            uKa.J((float)vPa.b, (float)vPa.b, (float)MQa.L);
            i2.J(QFa.TC.J(), pqa.r);
            uKa.D();
            uKa.e();
            uKa.J((float)Nra.e, (float)JPa.N, (float)eua.l);
            uKa.J((float)CRa.q, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)vPa.b, (float)vPa.b, (float)MQa.L);
            i2.J(QFa.TC.J(), pqa.r);
            uKa.D();
            uKa.D();
            uKa.e();
            ((ModelQuadruped)dka_3.I.J()).head.l(rRa.T);
            uKa.l((float)pqa.r, (float)vqa.T, (float)pqa.r);
            uKa.J((float)JPa.N, (float)ZSa.q, (float)ATa.x);
            uKa.J((float)Fua.Y, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)vPa.b, (float)vPa.b, (float)MQa.L);
            i2.J(QFa.TC.J(), pqa.r);
            uKa.D();
            uKa.M((int)Zra.W);
            uKa.m();
        }
    }

    public Dka_3(fla fla2) {
        Object b2 = fla2;
        Dka_3 a2 = this;
        a2.I = b2;
    }

    public boolean J() {
        return vRa.d != 0;
    }
}

