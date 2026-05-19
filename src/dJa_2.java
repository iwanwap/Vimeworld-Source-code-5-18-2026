/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  FEa
 *  GC
 *  JPa
 *  Kna
 *  Kpa
 *  Lra
 *  MQa
 *  Mda
 *  NAa
 *  Oz
 *  Qsa
 *  RA
 *  Rua
 *  Usa
 *  XTa
 *  Xja
 *  Yba
 *  aJa
 *  aKa
 *  aSa
 *  asa
 *  bpa
 *  cRa
 *  dW
 *  eAa
 *  hra
 *  jFa
 *  kpa
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  uKa
 *  vL
 *  vPa
 *  vRa
 *  xKa
 *  xb
 *  ysa
 */
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dJa_2
extends GC {
    private xKa M;
    private final Kpa k;
    private static final ResourceLocation j = new ResourceLocation(Rua.e);
    private static final String J = "CL_00001002";
    private final ModelResourceLocation A;
    private final ModelResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public void J(FEa fEa2, double d2, double d3, double d4, float f2, float f3) {
        void c2;
        void d5;
        void e2;
        XF b2;
        dJa_2 g2 = fEa2;
        dJa_2 f4 = this;
        uKa.e();
        XF xF2 = b2 = g2.f();
        double d6 = (double)xF2.getX() - ((FEa)g2).la + e2;
        double d7 = (double)xF2.getY() - ((FEa)g2).Z + d5;
        double d8 = (double)xF2.getZ() - ((FEa)g2).A + c2;
        uKa.f((double)(d6 + kTa.B), (double)(d7 + kTa.B), (double)(d8 + kTa.B));
        dJa_2 dJa_22 = g2;
        uKa.J((float)(Hra.Ga - ((FEa)dJa_22).X), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        ((oLa)((Object)f4.A)).J.J(WKa.C);
        b2 = f4.k.J();
        Fia a2 = b2.J().J();
        RA rA2 = dJa_22.J() != null && g2.J().J() == Gea.wa ? a2.J(f4.A) : a2.J(f4.I);
        uKa.e();
        uKa.J((float)vPa.b, (float)vPa.b, (float)vPa.b);
        b2.J().J(rA2, pqa.r, pqa.r, pqa.r, pqa.r);
        uKa.D();
        uKa.J((float)JPa.N, (float)JPa.N, (float)asa.t);
        dJa_2 dJa_23 = f4;
        dJa_23.J((FEa)g2);
        uKa.D();
        dJa_2 dJa_24 = g2;
        dJa_23.J((FEa)dJa_24, (double)(e2 + (double)((float)((FEa)dJa_24).j.getFrontOffsetX() * bpa.K)), (double)(d5 - VPa.W), (double)(c2 + (double)((float)((FEa)g2).j.getFrontOffsetZ() * bpa.K)));
    }

    /*
     * WARNING - void declaration
     */
    public dJa_2(oLa oLa2, xKa xKa2) {
        void b2;
        dJa_2 a2;
        dJa_2 c2 = xKa2;
        dJa_2 dJa_22 = a2 = this;
        super((oLa)b2);
        a2.k = Kpa.J();
        dJa_2 dJa_23 = a2;
        dJa_22.I = new ModelResourceLocation(Yqa.Ja, AQa.t);
        dJa_22.A = new ModelResourceLocation(Yqa.Ja, Epa.Aa);
        dJa_22.M = c2;
    }

    public ResourceLocation J(vL vL2) {
        dJa_2 b2 = vL2;
        dJa_2 a2 = this;
        return a2.J((FEa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f3;
        dJa_2 a2 = this;
        a2.J((FEa)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)g2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(FEa fEa2) {
        void a2;
        dJa_2 dJa_22 = this;
        Mda mda2 = a2.J();
        if (mda2 != null) {
            mda2 = new jFa(a2.j, aSa.V, aSa.V, aSa.V, mda2);
            eAa eAa2 = mda2.J().J();
            mda2.J().E = vRa.d;
            mda2.m = JPa.N;
            uKa.e();
            uKa.L();
            int b22 = a2.D();
            if (eAa2 instanceof Yba) {
                b22 = b22 % AQa.P * uqa.g;
            }
            uKa.J((float)((float)b22 * CRa.ja / Qsa.k), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            if (eAa2 instanceof Yba) {
                ((oLa)((Object)dJa_22.A)).J.J(j);
                uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                float b22 = hra.Ka;
                uKa.l((float)b22, (float)b22, (float)b22);
                uKa.J((float)Usa.b, (float)Usa.b, (float)JPa.N);
                dW dW2 = Gea.wa.J(mda2.J(), a2.j);
                uKa.J((float)JPa.N, (float)JPa.N, (float)vqa.T);
                if (dW2 != null) {
                    dJa_22.k.R.J().J(dW2, vRa.d != 0);
                }
            } else {
                KLa b22 = null;
                if (eAa2 == Gea.Gb) {
                    KLa kLa2;
                    b22 = dJa_22.k.J().J(rja.I);
                    if (Config.h()) {
                        kLa2 = b22;
                        xb.J((aJa)dJa_22.k.J(), (ResourceLocation)WKa.C);
                    } else {
                        dJa_22.k.J().J(WKa.C);
                        kLa2 = b22;
                    }
                    if (kLa2 instanceof rja) {
                        rja rja2;
                        rja rja3 = rja2 = (rja)b22;
                        rja rja4 = rja2;
                        double d2 = rja4.A;
                        double d3 = rja4.J;
                        rja4.A = aSa.V;
                        rja3.J = aSa.V;
                        rja2.J(a2.j, a2.la, a2.A, Oz.f((float)(cRa.n + a2.j.getHorizontalIndex() * Jsa.ha)), uSa.E != 0, vRa.d != 0);
                        rja3.A = d2;
                        rja2.J = d3;
                    } else {
                        b22 = null;
                    }
                }
                uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
                if (!dJa_22.M.J(mda2.J()) || eAa2 instanceof NAa) {
                    uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                }
                uKa.j();
                nLa.f();
                dJa_22.M.J(mda2.J(), Xja.FIXED);
                nLa.C();
                uKa.G();
                if (b22 != null && b22.e() > 0) {
                    b22.f();
                }
            }
            uKa.P();
            uKa.D();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(FEa fEa2, double d2, double d3, double d4) {
        void d5;
        dJa_2 dJa_22 = this;
        if (Kpa.G() && d5.J() != null && d5.J().l() && ((oLa)((Object)dJa_22.A)).C == d5) {
            float f2;
            float e22 = ySa.Da;
            e22 = rta.D * e22;
            void v0 = d5;
            double d6 = v0.J(((oLa)((Object)dJa_22.A)).B);
            float f3 = f2 = v0.q() ? Ura.m : EPa.r;
            if (d6 < (double)(f3 * f3)) {
                void a2;
                void b2;
                void c2;
                void v2 = d5;
                String string = v2.J().J();
                if (v2.q()) {
                    dJa_2 dJa_23 = dJa_22;
                    Kna kna2 = dJa_23.J();
                    uKa.e();
                    uKa.J((float)((float)c2 + JPa.N), (float)((float)b2 + d5.u + MQa.L), (float)((float)a2));
                    GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
                    uKa.J((float)(-((oLa)((Object)dJa_23.A)).c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                    uKa.J((float)((oLa)((Object)dJa_23.A)).l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                    uKa.l((float)(-e22), (float)(-e22), (float)e22);
                    uKa.L();
                    uKa.J((float)JPa.N, (float)(rta.o / e22), (float)JPa.N);
                    uKa.J(uSa.E != 0);
                    uKa.B();
                    uKa.f((int)Lra.k, (int)kpa.J);
                    pKa pKa2 = pKa.J();
                    aKa e22 = pKa2.J();
                    int n2 = kna2.J(string) / uqa.g;
                    uKa.z();
                    aKa aKa2 = e22;
                    int n3 = n2;
                    aKa aKa3 = e22;
                    aKa3.J(XTa.W, mka.I);
                    aKa3.J((double)(-n2 - vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    e22.J((double)(-n3 - vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    aKa2.J((double)(n3 + vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    aKa2.J((double)(n2 + vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
                    pKa2.J();
                    uKa.H();
                    uKa.J(vRa.d != 0);
                    Kna kna3 = kna2;
                    kna3.J(string, -kna3.J(string) / uqa.g, uSa.E, STa.Ha);
                    uKa.P();
                    uKa.k();
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                    uKa.D();
                    return;
                }
                dJa_22.J((vL)d5, string, (double)c2, (double)b2, (double)a2, ysa.s);
            }
        }
    }

    public ResourceLocation J(FEa fEa2) {
        dJa_2 b2 = fEa2;
        dJa_2 a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        dJa_2 e2 = vL2;
        dJa_2 d5 = this;
        d5.J((FEa)e2, (double)c2, (double)b2, (double)a2);
    }
}

