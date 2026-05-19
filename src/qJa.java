/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  NPa
 *  Ola
 *  Paa
 *  RQa
 *  SQa
 *  XTa
 *  YSa
 *  cRa
 *  kta
 *  pqa
 *  pua
 *  uKa
 *  vPa
 */
import net.minecraft.client.model.ModelChest;
import net.minecraft.util.ResourceLocation;

public final class qJa
extends Ola<Paa> {
    private ModelChest A;
    private static final ResourceLocation I = new ResourceLocation(NPa.z);

    /*
     * WARNING - void declaration
     */
    public void J(Paa paa, double d2, double d3, double d4, float f2, int n2) {
        void b2;
        void c2;
        void d5;
        void e22;
        void a2;
        qJa g22 = paa;
        qJa f3 = this;
        int n3 = uSa.E;
        if (g22.f()) {
            n3 = g22.C();
        }
        if (a2 >= 0) {
            f3.J((ResourceLocation)((Object)A[a2]));
            uKa.G((int)RQa.j);
            uKa.e();
            uKa.l((float)YSa.G, (float)YSa.G, (float)pqa.r);
            uKa.J((float)rRa.T, (float)rRa.T, (float)rRa.T);
            uKa.G((int)SQa.ca);
        } else {
            f3.J(I);
        }
        uKa.e();
        uKa.o();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J((float)((float)e22), (float)((float)d5 + pqa.r), (float)((float)c2 + pqa.r));
        uKa.l((float)pqa.r, (float)vqa.T, (float)vqa.T);
        uKa.J((float)MQa.L, (float)MQa.L, (float)MQa.L);
        int e22 = uSa.E;
        if (n3 == uqa.g) {
            e22 = cRa.n;
        }
        if (n3 == yRa.d) {
            e22 = uSa.E;
        }
        if (n3 == AQa.P) {
            e22 = Jsa.ha;
        }
        if (n3 == tTa.h) {
            e22 = XTa.p;
        }
        uKa.J((float)e22, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)vPa.b, (float)vPa.b, (float)vPa.b);
        qJa qJa2 = g22;
        float g22 = ((Paa)qJa2).A + (((Paa)qJa2).J - ((Paa)g22).A) * b2;
        float f4 = g22 = pqa.r - g22;
        g22 = pqa.r - f4 * f4 * g22;
        f3.A.chestLid.rotateAngleX = -(g22 * pua.j / kta.v);
        f3.A.J();
        uKa.E();
        uKa.D();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if (a2 >= 0) {
            uKa.G((int)RQa.j);
            uKa.D();
            uKa.G((int)SQa.ca);
        }
    }

    public qJa() {
        qJa a2;
        qJa qJa2 = a2;
        qJa2.A = new ModelChest();
    }
}

