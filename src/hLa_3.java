/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  JPa
 *  MQa
 *  Ola
 *  Qsa
 *  RQa
 *  SQa
 *  XTa
 *  YSa
 *  cRa
 *  kta
 *  lqa
 *  pqa
 *  pua
 *  uKa
 *  vPa
 *  vRa
 */
import java.util.Calendar;
import net.minecraft.block.BlockChest;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.util.ResourceLocation;

public final class hLa_3
extends Ola<Fz> {
    private ModelChest m;
    private static final ResourceLocation C;
    private ModelChest i;
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private boolean j;
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    public hLa_3() {
        hLa_3 hLa_32 = this;
        hLa_3 hLa_33 = hLa_32;
        hLa_32.m = new ModelChest();
        hLa_33.i = new ModelLargeChest();
        Calendar a2 = Calendar.getInstance();
        if (a2.get(uqa.g) + vRa.d == lqa.s && a2.get(tTa.h) >= osa.c && a2.get(tTa.h) <= ITa.E) {
            hLa_32.j = vRa.d;
        }
    }

    static {
        J = new ResourceLocation(cRa.U);
        A = new ResourceLocation(fPa.fa);
        k = new ResourceLocation(hpa.M);
        I = new ResourceLocation(SQa.Aa);
        M = new ResourceLocation(FTa.K);
        C = new ResourceLocation(SPa.w);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Fz fz2, double d2, double d3, double d4, float f2, int n2) {
        Object object;
        Fz fz3;
        int n3;
        Fz g2 = fz2;
        hLa_3 f3 = this;
        uKa.J();
        uKa.I((int)Ira.A);
        uKa.J(vRa.d != 0);
        if (!g2.f()) {
            n3 = uSa.E;
            fz3 = g2;
        } else {
            Fz fz4 = g2;
            object = fz4.J();
            n3 = fz4.C();
            if (object instanceof BlockChest && n3 == 0) {
                ((BlockChest)object).f(g2.f(), g2.J(), g2.f().J(g2.J()));
                n3 = g2.C();
            }
            Fz fz5 = g2;
            fz3 = fz5;
            fz5.M();
        }
        if (fz3.i == null && g2.M == null) {
            float f4;
            void b2;
            void c2;
            void d5;
            void e22;
            void a2;
            if (g2.j == null && g2.A == null) {
                object = f3.m;
                if (a2 >= 0) {
                    f3.J(A[a2]);
                    uKa.G((int)RQa.j);
                    uKa.e();
                    uKa.l((float)YSa.G, (float)YSa.G, (float)pqa.r);
                    uKa.J((float)rRa.T, (float)rRa.T, (float)rRa.T);
                    uKa.G((int)SQa.ca);
                } else if (g2.d() == vRa.d) {
                    f3.J(I);
                } else {
                    hLa_3 hLa_32 = f3;
                    if (f3.j) {
                        hLa_32.J(M);
                    } else {
                        hLa_32.J(C);
                    }
                }
            } else {
                object = f3.i;
                if (a2 >= 0) {
                    f3.J(A[a2]);
                    uKa.G((int)RQa.j);
                    uKa.e();
                    uKa.l((float)Qsa.k, (float)YSa.G, (float)pqa.r);
                    uKa.J((float)rRa.T, (float)rRa.T, (float)rRa.T);
                    uKa.G((int)SQa.ca);
                } else if (g2.d() == vRa.d) {
                    f3.J(J);
                } else {
                    hLa_3 hLa_33 = f3;
                    if (f3.j) {
                        hLa_33.J(A);
                    } else {
                        hLa_33.J(k);
                    }
                }
            }
            uKa.e();
            uKa.o();
            if (a2 < 0) {
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            }
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
            if (n3 == uqa.g && g2.j != null) {
                uKa.J((float)pqa.r, (float)JPa.N, (float)JPa.N);
            }
            if (n3 == tTa.h && g2.A != null) {
                uKa.J((float)JPa.N, (float)JPa.N, (float)vqa.T);
            }
            uKa.J((float)e22, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)vPa.b, (float)vPa.b, (float)vPa.b);
            Object object2 = g2;
            Fz fz6 = g2;
            float f5 = ((Fz)((Object)object2)).g + (((Fz)((Object)object2)).J - fz6.g) * b2;
            if (fz6.i != null) {
                float f6;
                f4 = g2.i.g + (g2.i.J - g2.i.g) * b2;
                if (f6 > f5) {
                    f5 = f4;
                }
            }
            if (g2.M != null) {
                float f7;
                f4 = g2.M.g + (g2.M.J - g2.M.g) * b2;
                if (f7 > f5) {
                    f5 = f4;
                }
            }
            float f8 = f5 = pqa.r - f5;
            f5 = pqa.r - f8 * f8 * f5;
            ((ModelChest)object).chestLid.rotateAngleX = -(f5 * pua.j / kta.v);
            ((ModelChest)object).J();
            uKa.E();
            uKa.D();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (a2 >= 0) {
                uKa.G((int)RQa.j);
                uKa.D();
                uKa.G((int)SQa.ca);
            }
        }
    }
}

