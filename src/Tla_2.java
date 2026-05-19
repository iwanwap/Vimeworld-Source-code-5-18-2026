/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  RQa
 *  SQa
 *  id
 *  kta
 *  nja
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  zfa
 */
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.util.ResourceLocation;

public final class Tla_2
implements id<zfa> {
    private final nja J;
    private final ModelCreeper A;
    private static final ResourceLocation I = new ResourceLocation(vua.E);

    /*
     * WARNING - void declaration
     */
    public void J(zfa zfa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Tla_2 i2 = zfa2;
        Tla_2 h2 = this;
        if (i2.ba()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            float e2;
            boolean bl2 = i2.C();
            uKa.J((!bl2 ? vRa.d : uSa.E) != 0);
            Tla_2 tla_2 = h2;
            tla_2.J.J(I);
            uKa.G((int)RQa.j);
            uKa.y();
            e2 = (float)((zfa)i2).g + e2;
            uKa.J((float)(e2 * Jpa.B), (float)(e2 * Jpa.B), (float)JPa.N);
            uKa.G((int)SQa.ca);
            uKa.B();
            float f10 = MQa.L;
            uKa.f((float)f10, (float)f10, (float)f10, (float)pqa.r);
            uKa.L();
            uKa.f((int)vRa.d, (int)vRa.d);
            tla_2.A.J(h2.J.J());
            tla_2.A.J((vL)i2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
            uKa.G((int)RQa.j);
            uKa.y();
            uKa.G((int)SQa.ca);
            uKa.P();
            uKa.k();
            uKa.J((boolean)bl2);
        }
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public Tla_2(nja nja2) {
        Tla_2 b2 = nja2;
        Tla_2 a2 = this;
        Tla_2 tla_2 = a2;
        a2.A = new ModelCreeper(kta.v);
        a2.J = b2;
    }
}

