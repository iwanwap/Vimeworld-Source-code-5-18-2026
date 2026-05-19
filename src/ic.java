/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  Gl
 *  LQa
 *  MQa
 *  Qqa
 *  YDa
 *  Yfa
 *  aKa
 *  aSa
 *  bpa
 *  eb
 *  fTa
 *  kta
 *  mka
 *  nka
 *  pKa
 *  pqa
 *  psa
 *  uKa
 *  vL
 *  vRa
 */
import net.minecraft.client.model.ModelBase;
import optifine.Config;

public abstract class ic<T extends Gl>
extends Ad<T> {
    private static final String I = "CL_00001015";

    private double J(double c2, double b2, double a2) {
        double d2 = c2;
        return d2 + (b2 - d2) * a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(T t2, float f2) {
        void a22;
        ic<T> c22 = t2;
        ic b2 = this;
        int c22 = c22.J((float)a22);
        int a22 = c22 % opa.w;
        nka.J((int)nka.P, (float)((float)a22 / pqa.r), (float)((float)(c22 /= opa.w) / pqa.r));
    }

    /*
     * WARNING - void declaration
     */
    public void f(T t2, double d2, double d3, double d4, float f2, float f3) {
        vL b22;
        ic<T> g2 = t2;
        ic f4 = this;
        if (!(Config.h() && pA.eA || !(g2 instanceof Yfa) || (b22 = ((Yfa)g2).l()) == null)) {
            void c2;
            void d5;
            void e2;
            float f5;
            float f6;
            float a2;
            d5 -= (Eqa.O - (double)((Gl)g2).u) * kTa.B;
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            vL vL2 = b22;
            double d6 = f4.J(b22.s, b22.X, (double)(a2 * MQa.L)) * kta.d;
            double d7 = f4.J(vL2.o, b22.d, (double)(a2 * MQa.L)) * kta.d;
            double d8 = Math.cos(d6);
            d6 = Math.sin(d6);
            double d9 = Math.sin(d7);
            if (vL2 instanceof YDa) {
                d8 = aSa.V;
                d6 = aSa.V;
                d9 = pqa.q;
            }
            d7 = Math.cos(d7);
            ic ic2 = f4;
            ic<T> ic3 = g2;
            ic ic4 = f4;
            vL vL3 = b22;
            double d10 = f4.J(b22.c, b22.la, a2) - d8 * LQa.E - d6 * kTa.B * d7;
            d9 = f4.J(vL3.ba + (double)b22.l() * LQa.E, b22.Z + (double)b22.l() * LQa.E, a2) - d9 * kTa.B - VPa.W;
            d7 = ic4.J(vL3.r, b22.A, a2) - d6 * LQa.E + d8 * kTa.B * d7;
            double d11 = ic4.J(((Gl)g2).Ma, ((Gl)g2).ba, a2) * kta.d + fTa.o;
            d8 = Math.cos(d11) * (double)((Gl)g2).F * Qqa.b;
            d6 = Math.sin(d11) * (double)((Gl)g2).F * Qqa.b;
            d11 = f4.J(((Gl)ic3).c, ((Gl)g2).la, a2) + d8;
            double d12 = ic2.J(((Gl)ic3).ba, ((Gl)g2).Z, a2);
            double d13 = ic2.J(((Gl)g2).r, ((Gl)g2).A, a2) + d6;
            e2 += d8;
            c2 += d6;
            d6 = (float)(d10 - d11);
            d8 = (float)(d9 - d12);
            d7 = (float)(d7 - d13);
            uKa.z();
            uKa.L();
            uKa.m();
            if (Config.h()) {
                pA.ma();
            }
            aKa2.J(tTa.h, mka.I);
            int n2 = g2 = uSa.E;
            while (n2 <= osa.c) {
                float b22 = MQa.L;
                a2 = Xpa.R;
                f6 = bpa.K;
                if (g2 % uqa.g == 0) {
                    b22 *= ZSa.q;
                    a2 *= ZSa.q;
                    f6 *= ZSa.q;
                }
                f5 = (float)g2 / KSa.I;
                aKa aKa3 = aKa2;
                float f7 = f5;
                aKa3.J((double)(e2 + d6 * (double)f5 + aSa.V), (double)(d5 + d8 * (double)(f7 * f7 + f5) * kTa.B + (double)((KSa.I - (float)g2) / vqa.A + Mqa.N)), (double)(c2 + d7 * (double)f5)).J(b22, a2, f6, pqa.r).M();
                float f8 = f5;
                aKa aKa4 = aKa3.J((double)(e2 + d6 * (double)f5 + psa.k), (double)(d5 + d8 * (double)(f8 * f8 + f5) * kTa.B + (double)((KSa.I - (float)g2) / vqa.A + Mqa.N) + psa.k), (double)(c2 + d7 * (double)f5));
                aKa4.J(b22, a2, f6, pqa.r).M();
                n2 = ++g2;
            }
            pKa2.J();
            aKa2.J(tTa.h, mka.I);
            int n3 = g2 = uSa.E;
            while (n3 <= osa.c) {
                float b22 = MQa.L;
                a2 = Xpa.R;
                f6 = bpa.K;
                if (g2 % uqa.g == 0) {
                    b22 *= ZSa.q;
                    a2 *= ZSa.q;
                    f6 *= ZSa.q;
                }
                f5 = (float)g2 / KSa.I;
                aKa aKa5 = aKa2;
                float f9 = f5;
                aKa5.J((double)(e2 + d6 * (double)f5 + aSa.V), (double)(d5 + d8 * (double)(f9 * f9 + f5) * kTa.B + (double)((KSa.I - (float)g2) / vqa.A + Mqa.N) + psa.k), (double)(c2 + d7 * (double)f5)).J(b22, a2, f6, pqa.r).M();
                float f10 = f5;
                aKa aKa6 = aKa5.J((double)(e2 + d6 * (double)f5 + psa.k), (double)(d5 + d8 * (double)(f10 * f10 + f5) * kTa.B + (double)((KSa.I - (float)g2) / vqa.A + Mqa.N)), (double)(c2 + d7 * (double)f5 + psa.k));
                aKa6.J(b22, a2, f6, pqa.r).M();
                n3 = ++g2;
            }
            pKa2.J();
            if (Config.h()) {
                pA.j();
            }
            uKa.P();
            uKa.H();
            uKa.h();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ic(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        ic a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(T t2, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void f4;
        void e2;
        ic a2;
        float f5 = f3;
        ic ic2 = a2 = this;
        void v1 = e2;
        super.J((Gl)f4, (double)v1, (double)d5, (double)c2, (float)b2, (float)g2);
        ic2.f(f4, (double)v1, (double)d5, (double)c2, (float)b2, (float)g2);
    }

    public boolean f(T t2) {
        ic a2 = this;
        ic<T> b2 = t2;
        if (super.f((Gl)b2) && (b2.G() || b2.J() && b2 == a2.A.C)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(T t2, eb eb2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void d5;
        ic e2 = this;
        ic<T> f2 = t2;
        if (super.J((vL)f2, (eb)d5, (double)c2, (double)b2, (double)a2)) {
            return vRa.d != 0;
        }
        if (f2 instanceof Yfa && ((Yfa)f2).S() && ((Yfa)f2).l() != null) {
            f2 = ((Yfa)f2).l();
            return d5.J(f2.J());
        }
        return uSa.E != 0;
    }
}

