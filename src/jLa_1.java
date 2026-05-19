/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Gl
 *  NQa
 *  XE
 *  ZFa
 *  id
 *  iea
 *  pqa
 *  uKa
 *  vL
 *  vRa
 */
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class jLa_1
implements id {
    private static final String j = "CL_00002413";
    private static final ResourceLocation J = new ResourceLocation(BRa.g);
    private final ModelSheep1 A;
    private final Qka I;

    public jLa_1(Qka qka2) {
        Object b2 = qka2;
        jLa_1 a2 = this;
        jLa_1 jLa_12 = a2;
        a2.A = new ModelSheep1();
        a2.I = b2;
    }

    public boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        float f10 = f8;
        jLa_1 a2 = this;
        a2.J((ZFa)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ZFa zFa, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        jLa_1 i2 = zFa;
        jLa_1 h2 = this;
        if (!i2.v() && !i2.C()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            jLa_1 jLa_12;
            void e2;
            h2.I.J(J);
            if (i2.J() && NQa.S.equals(i2.e())) {
                int n2 = vRa.d;
                int n3 = ((ZFa)i2).g / kTa.g + i2.M();
                int n4 = iea.values().length;
                int n5 = n3 % n4;
                n3 = (n3 + vRa.d) % n4;
                float f10 = ((float)(((ZFa)i2).g % kTa.g) + e2) / sSa.E;
                float[] fArray = ZFa.J((iea)iea.byMetadata((int)n5));
                float[] fArray2 = ZFa.J((iea)iea.byMetadata((int)n3));
                if (Config.Fa()) {
                    fArray = XE.J((iea)iea.byMetadata((int)n5), (float[])fArray);
                    fArray2 = XE.J((iea)iea.byMetadata((int)n3), (float[])fArray2);
                }
                uKa.f((float)(fArray[uSa.E] * (pqa.r - f10) + fArray2[uSa.E] * f10), (float)(fArray[vRa.d] * (pqa.r - f10) + fArray2[vRa.d] * f10), (float)(fArray[uqa.g] * (pqa.r - f10) + fArray2[uqa.g] * f10));
                jLa_12 = h2;
            } else {
                float[] fArray = ZFa.J((iea)i2.J());
                if (Config.Fa()) {
                    fArray = XE.J((iea)i2.J(), (float[])fArray);
                }
                uKa.f((float)fArray[uSa.E], (float)fArray[vRa.d], (float)fArray[uqa.g]);
                jLa_12 = h2;
            }
            jLa_12.A.J(h2.I.J());
            jLa_1 jLa_13 = h2;
            jLa_13.A.J((Gl)i2, (float)g2, (float)f9, (float)e2);
            jLa_13.A.J((vL)i2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        }
    }
}

