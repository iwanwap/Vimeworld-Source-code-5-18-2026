/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  JPa
 *  MQa
 *  Oz
 *  RQa
 *  SQa
 *  TQa
 *  Tka
 *  id
 *  pqa
 *  uKa
 *  vL
 *  vQa
 *  vRa
 */
import net.minecraft.client.model.ModelWither;
import net.minecraft.util.ResourceLocation;

public final class CKa_2
implements id<IDa> {
    private final Tka J;
    private final ModelWither A;
    private static final ResourceLocation I = new ResourceLocation(TQa.s);

    /*
     * WARNING - void declaration
     */
    public void J(IDa iDa, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        IDa i2 = iDa;
        CKa_2 h2 = this;
        if (i2.v()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            void e2;
            uKa.J((!i2.C() ? vRa.d : uSa.E) != 0);
            CKa_2 cKa_2 = h2;
            cKa_2.J.J(I);
            uKa.G((int)RQa.j);
            uKa.y();
            float f10 = (float)i2.g + e2;
            float f11 = Oz.C((float)(f10 * WRa.e)) * vQa.q;
            uKa.J((float)f11, (float)(f10 *= Jpa.B), (float)JPa.N);
            uKa.G((int)SQa.ca);
            uKa.B();
            float f12 = MQa.L;
            uKa.f((float)f12, (float)f12, (float)f12, (float)pqa.r);
            uKa.L();
            uKa.f((int)vRa.d, (int)vRa.d);
            cKa_2.A.J((Gl)i2, (float)g2, (float)f9, (float)e2);
            CKa_2 cKa_22 = h2;
            cKa_2.A.J(cKa_22.J.J());
            cKa_22.A.J((vL)i2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
            uKa.G((int)RQa.j);
            uKa.y();
            uKa.G((int)SQa.ca);
            uKa.P();
            uKa.k();
        }
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public CKa_2(Tka tka2) {
        CKa_2 b2 = tka2;
        CKa_2 a2 = this;
        CKa_2 cKa_2 = a2;
        a2.A = new ModelWither(MQa.L);
        a2.J = b2;
    }
}

