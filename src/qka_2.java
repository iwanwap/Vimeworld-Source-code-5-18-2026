/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DDa
 *  ISa
 *  JPa
 *  Kpa
 *  MQa
 *  QFa
 *  QJa
 *  id
 *  mLa
 *  nka
 *  pqa
 *  pua
 *  uKa
 */
import net.minecraft.client.model.ModelIronGolem;

public final class qka_2
implements id<DDa> {
    private final mLa I;

    /*
     * WARNING - void declaration
     */
    public void J(DDa dDa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        qka_2 i22 = dDa2;
        qka_2 h2 = this;
        if (i22.I() != 0) {
            void e2;
            float f9;
            QJa g22 = Kpa.J().J();
            uKa.o();
            uKa.e();
            uKa.J((float)(eua.C + Hra.Ga * ((ModelIronGolem)h2.I.J()).ironGolemRightArm.rotateAngleX / pua.j), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)BQa.P, (float)UTa.q, (float)BQa.P);
            float f10 = f9 = MQa.L;
            uKa.l((float)f10, (float)(-f9), (float)f10);
            int i22 = i22.J((float)e2);
            int g22 = i22 % opa.w;
            nka.J((int)nka.P, (float)((float)g22 / pqa.r), (float)((float)(i22 /= opa.w) / pqa.r));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            h2.I.J(WKa.C);
            g22.J(QFa.l.J(), pqa.r);
            uKa.D();
            uKa.E();
        }
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public qka_2(mLa mLa2) {
        qka_2 b2 = mLa2;
        qka_2 a2 = this;
        a2.I = b2;
    }
}

