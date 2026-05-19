/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cra
 *  GDa
 *  Gl
 *  JPa
 *  LQa
 *  Lra
 *  Lz
 *  MQa
 *  VQa
 *  XTa
 *  ZOa
 *  aKa
 *  aSa
 *  eb
 *  fTa
 *  jpa
 *  mka
 *  nka
 *  pKa
 *  pQa
 *  pqa
 *  uKa
 *  vQa
 *  vRa
 *  wra
 *  xy
 *  ysa
 */
import net.minecraft.client.model.ModelGuardian;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class eja_1
extends ic<GDa> {
    private static final ResourceLocation j;
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    public int I;

    public eja_1(oLa oLa2) {
        eja_1 a2;
        Object b2 = oLa2;
        eja_1 eja_12 = a2 = this;
        super((oLa)b2, new ModelGuardian(), MQa.L);
        eja_12.I = ((ModelGuardian)eja_12.C).J();
    }

    /*
     * WARNING - void declaration
     */
    private Lz J(Gl gl2, double d2, float f2) {
        void b2;
        void a2;
        eja_1 d3 = gl2;
        eja_1 c2 = this;
        eja_1 eja_12 = d3;
        double d4 = ((Gl)d3).V + (((Gl)eja_12).la - ((Gl)d3).V) * (double)a2;
        b2 = b2 + ((Gl)d3).Ga + (((Gl)d3).Z - ((Gl)d3).Ga) * (double)a2;
        double d5 = ((Gl)eja_12).Ca + (((Gl)d3).A - ((Gl)d3).Ca) * (double)a2;
        return new Lz(d4, (double)b2, d5);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(GDa gDa2, eb eb2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void d5;
        eja_1 e2 = this;
        eja_1 f2 = gDa2;
        if (super.J(f2, (eb)d5, (double)c2, (double)b2, (double)a2)) {
            return vRa.d != 0;
        }
        if (f2.v() && (c2 = f2.d()) != null) {
            eja_1 eja_12 = e2;
            Gl gl2 = c2;
            Lz lz2 = eja_12.J(gl2, (double)gl2.u * kTa.B, pqa.r);
            eja_1 eja_13 = f2;
            f2 = eja_12.J((Gl)eja_13, eja_13.l(), pqa.r);
            if (d5.J(xy.J((double)((Lz)f2).A, (double)((Lz)f2).j, (double)((Lz)f2).J, (double)lz2.A, (double)lz2.j, (double)lz2.J))) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void J(GDa gDa2, float f2) {
        eja_1 c2 = gDa2;
        eja_1 b2 = this;
        if (c2.Fa()) {
            uKa.l((float)vQa.N, (float)vQa.N, (float)vQa.N);
        }
    }

    public ResourceLocation J(GDa gDa2) {
        eja_1 b2 = gDa2;
        eja_1 a2 = this;
        if (b2.Fa()) {
            return A;
        }
        return J;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(GDa gDa2, double d2, double d3, double d4, float f2, float f3) {
        void a22;
        void g3222;
        double c2;
        double d5;
        double e2;
        Lz f2222;
        eja_1 b2;
        float f4 = f2;
        eja_1 eja_12 = b2 = this;
        if (eja_12.I != ((ModelGuardian)eja_12.C).J()) {
            eja_1 eja_13 = b2;
            eja_13.C = new ModelGuardian();
            eja_13.I = ((ModelGuardian)b2.C).J();
        }
        super.J(f2222, e2, d5, c2, (float)g3222, (float)a22);
        Gl g3222 = f2222.d();
        if (g3222 != null) {
            float f5;
            void v2 = f2222;
            float f6 = v2.d((float)a22);
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            b2.J(j);
            GL11.glTexParameterf(BQa.Z, LQa.P, FRa.T);
            GL11.glTexParameterf(BQa.Z, pQa.n, FRa.T);
            uKa.L();
            uKa.m();
            uKa.k();
            uKa.J(vRa.d != 0);
            float f7 = f5 = xra.Ga;
            nka.J((int)nka.P, (float)f7, (float)f7);
            uKa.J((int)Lra.k, (int)vRa.d, (int)vRa.d, (int)uSa.E);
            f5 = (float)v2.j.l() + a22;
            float f8 = f5 * MQa.L % pqa.r;
            float f9 = v2.l();
            uKa.e();
            uKa.J((float)((float)e2), (float)((float)d5 + f9), (float)((float)c2));
            eja_1 eja_14 = b2;
            Gl gl2 = g3222;
            g3222 = eja_14.J(gl2, (double)gl2.u * kTa.B, (float)a22);
            f2222 = eja_14.J((Gl)f2222, f9, (float)a22);
            f2222 = g3222.d(f2222);
            e2 = f2222.J() + oua.i;
            f2222 = f2222.J();
            float g3222 = (float)Math.acos(f2222.j);
            float f2222 = (float)Math.atan2(f2222.J, f2222.A);
            uKa.J((float)((jpa.f + -f2222) * zpa.Z), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)(g3222 * zpa.Z), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            int f2222 = vRa.d;
            d5 = (double)f5 * fPa.ca * (oua.i - (double)(f2222 & vRa.d) * vqa.c);
            aKa aKa3 = aKa2;
            aKa aKa4 = aKa2;
            aKa aKa5 = aKa2;
            aKa5.J(XTa.W, mka.a);
            g3222 = f6 * f6;
            int a22 = ysa.s + (int)(g3222 * xra.Ga);
            int n2 = fPa.i + (int)(g3222 * nOa.g);
            int g3222 = XOa.h - (int)(g3222 * EPa.r);
            c2 = (double)f2222 * iSa.P;
            double d6 = c2 * Bpa.Ja;
            double d7 = aSa.V + Math.cos(d5 + Pua.r) * d6;
            double d8 = aSa.V + Math.sin(d5 + Pua.r) * d6;
            double d9 = aSa.V + Math.cos(d5 + Cra.k) * d6;
            double d10 = aSa.V + Math.sin(d5 + Cra.k) * d6;
            double d11 = aSa.V + Math.cos(d5 + Qpa.Z) * d6;
            double d12 = aSa.V + Math.sin(d5 + Qpa.Z) * d6;
            double d13 = aSa.V + Math.cos(d5 + Psa.ga) * d6;
            d6 = aSa.V + Math.sin(d5 + Psa.ga) * d6;
            double d14 = aSa.V + Math.cos(d5 + lQa.f) * c2;
            double d15 = aSa.V + Math.sin(d5 + lQa.f) * c2;
            double d16 = aSa.V + Math.cos(d5 + aSa.V) * c2;
            double d17 = aSa.V + Math.sin(d5 + aSa.V) * c2;
            double d18 = aSa.V + Math.cos(d5 + fTa.o) * c2;
            double d19 = aSa.V + Math.sin(d5 + fTa.o) * c2;
            double d20 = aSa.V + Math.cos(d5 + LQa.X) * c2;
            d5 = aSa.V + Math.sin(d5 + LQa.X) * c2;
            double d21 = vqa.T + f8;
            c2 = e2 * (kTa.B / c2) + d21;
            aKa4.J(d14, e2, d15).J(VQa.Z, c2).J(a22, n2, g3222, osa.Ja).M();
            aKa5.J(d14, aSa.V, d15).J(VQa.Z, d21).J(a22, n2, g3222, osa.Ja).M();
            aKa4.J(d16, aSa.V, d17).J(aSa.V, d21).J(a22, n2, g3222, osa.Ja).M();
            aKa4.J(d16, e2, d17).J(aSa.V, c2).J(a22, n2, g3222, osa.Ja).M();
            aKa3.J(d18, e2, d19).J(VQa.Z, c2).J(a22, n2, g3222, osa.Ja).M();
            aKa3.J(d18, aSa.V, d19).J(VQa.Z, d21).J(a22, n2, g3222, osa.Ja).M();
            aKa3.J(d20, aSa.V, d5).J(aSa.V, d21).J(a22, n2, g3222, osa.Ja).M();
            aKa3.J(d20, e2, d5).J(aSa.V, c2).J(a22, n2, g3222, osa.Ja).M();
            d5 = aSa.V;
            if (v2.g % uqa.g == 0) {
                d5 = kTa.B;
            }
            aKa aKa6 = aKa2;
            aKa2.J(d7, e2, d8).J(kTa.B, d5 + kTa.B).J(a22, n2, g3222, osa.Ja).M();
            aKa6.J(d9, e2, d10).J(oua.i, d5 + kTa.B).J(a22, n2, g3222, osa.Ja).M();
            aKa6.J(d13, e2, d6).J(oua.i, d5).J(a22, n2, g3222, osa.Ja).M();
            aKa2.J(d11, e2, d12).J(kTa.B, d5).J(a22, n2, g3222, osa.Ja).M();
            pKa2.J();
            uKa.D();
        }
    }

    static {
        J = new ResourceLocation(wra.F);
        A = new ResourceLocation(Vra.o);
        j = new ResourceLocation(ZOa.V);
    }
}

