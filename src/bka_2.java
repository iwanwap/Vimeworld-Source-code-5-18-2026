/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  Kna
 *  MQa
 *  NTa
 *  Ola
 *  QFa
 *  Qqa
 *  RQa
 *  SQa
 *  XE
 *  YSa
 *  Yra
 *  aPa
 *  aaa
 *  cra
 *  kPa
 *  kta
 *  ld
 *  pqa
 *  uKa
 *  uY
 *  vRa
 *  wOa
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelSign;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;

public final class bka_2
extends Ola {
    private static final String J = "CL_00000970";
    private final ModelSign A;
    private static final ResourceLocation I = new ResourceLocation(gua.h);

    /*
     * WARNING - void declaration
     */
    public void J(uY uY2, double d2, double d3, double d4, float f2, int n2) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        int n3 = n2;
        bka_2 a2 = this;
        a2.J((aaa)f3, (double)e2, (double)d5, (double)c2, (float)b2, (int)g2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(aaa aaa2, double d2, double d3, double d4, float f2, int n2) {
        int n3;
        void a2;
        float f3;
        void f4;
        bka_2 b2;
        block18: {
            int n4;
            void v0;
            void c2;
            void d5;
            void e2;
            float f5 = f2;
            b2 = this;
            Block g222 = f4.J();
            uKa.e();
            f3 = lTa.T;
            if (g222 == QFa.Nd) {
                uKa.J((float)((float)e2 + MQa.L), (float)((float)d5 + wOa.w * f3), (float)((float)c2 + MQa.L));
                float g222 = (float)(f4.C() * aPa.Y) / Yra.i;
                uKa.J((float)(-g222), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                b2.A.signStick.showModel = vRa.d;
                v0 = a2;
            } else {
                int g222 = f4.C();
                float f6 = JPa.N;
                if (g222 == uqa.g) {
                    f6 = Hra.Ga;
                }
                if (g222 == AQa.P) {
                    f6 = ISa.a;
                }
                if (g222 == tTa.h) {
                    f6 = kPa.Ha;
                }
                uKa.J((float)((float)e2 + MQa.L), (float)((float)d5 + wOa.w * f3), (float)((float)c2 + MQa.L));
                uKa.J((float)(-f6), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                uKa.J((float)JPa.N, (float)Qra.Z, (float)Qqa.fa);
                v0 = a2;
                b2.A.signStick.showModel = uSa.E;
            }
            if (v0 >= 0) {
                b2.J((ResourceLocation)((Object)A[a2]));
                uKa.G((int)RQa.j);
                uKa.e();
                uKa.l((float)YSa.G, (float)kta.v, (float)pqa.r);
                uKa.J((float)rRa.T, (float)rRa.T, (float)rRa.T);
                uKa.G((int)SQa.ca);
            } else {
                b2.J(I);
            }
            uKa.o();
            uKa.e();
            float f7 = f3;
            uKa.l((float)f7, (float)(-f3), (float)(-f7));
            b2.A.J();
            uKa.D();
            int g222 = uSa.E;
            int n5 = n4 = uSa.E;
            while (n5 < f4.J.length) {
                if (!(f4.J[n4] == null || StringUtils.isEmpty(f4.J[n4].J()) && f4.J[n4].J().isEmpty())) {
                    n3 = g222 = vRa.d;
                    break block18;
                }
                n5 = ++n4;
            }
            n3 = g222;
        }
        if (n3 != 0) {
            Kna kna2 = b2.J();
            float g222 = vsa.J * f3;
            uKa.J((float)JPa.N, (float)(MQa.L * f3), (float)(cra.S * f3));
            float f8 = g222;
            uKa.l((float)f8, (float)(-g222), (float)f8);
            GL11.glNormal3f(JPa.N, JPa.N, vqa.T * g222);
            uKa.J(uSa.E != 0);
            int g222 = uSa.E;
            if (Config.Fa()) {
                g222 = XE.l((int)g222);
            }
            if (a2 < 0) {
                int n6;
                int n7 = n6 = uSa.E;
                while (n7 < f4.J.length) {
                    if (f4.J[n6] != null) {
                        String e2;
                        List<ld> list = OMa.J(f4.J[n6], Jsa.ha, kna2, uSa.E != 0, vRa.d != 0);
                        String string = e2 = list != null && list.size() > 0 ? list.get(uSa.E).l() : Mqa.y;
                        if (n6 == f4.k) {
                            e2 = new StringBuilder().insert(3 >> 2, vTa.z).append(e2).append(rpa.T).toString();
                            Kna kna3 = kna2;
                            kna3.J(e2, -kna3.J(e2) / uqa.g, n6 * NTa.C - f4.J.length * tTa.h, g222);
                        } else if (e2.length() > 0) {
                            Kna kna4 = kna2;
                            kna4.J(e2, -kna4.J(e2) / uqa.g, n6 * NTa.C - f4.J.length * tTa.h, g222);
                        }
                    }
                    n7 = ++n6;
                }
            }
            uKa.J(vRa.d != 0);
        }
        uKa.D();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if (a2 >= 0) {
            uKa.G((int)RQa.j);
            uKa.D();
            uKa.G((int)SQa.ca);
        }
    }

    public bka_2() {
        bka_2 a2;
        bka_2 bka_22 = a2;
        bka_22.A = new ModelSign();
    }
}

