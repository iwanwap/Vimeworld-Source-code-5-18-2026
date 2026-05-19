/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Lra
 *  XTa
 *  ZOa
 *  aJa
 *  aKa
 *  aSa
 *  kpa
 *  kta
 *  mka
 *  pKa
 *  pqa
 *  psa
 *  ska
 *  uKa
 *  vL
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class FOa
extends ska {
    private static final ResourceLocation M = new ResourceLocation(CRa.Da);
    private aJa k;
    private int j;
    private int J;

    public void d() {
        FOa a2;
        FOa fOa2 = a2;
        fOa2.j += vRa.d;
        if (fOa2.j == a2.J) {
            a2.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public FOa(aJa aJa2, Gg gg2, double d2, double d3, double d4) {
        void e2;
        void a2;
        void b2;
        void c2;
        FOa d5;
        FOa f2 = gg2;
        FOa fOa2 = d5 = this;
        FOa fOa3 = d5;
        super((Gg)f2, (double)c2, (double)b2, (double)a2, aSa.V, aSa.V, aSa.V);
        fOa2.k = e2;
        fOa3.f(aSa.V);
        fOa2.J(aSa.V);
        fOa2.l(aSa.V);
        fOa2.J = ZOa.x;
    }

    public int J() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, vL vL2, float f2, float f3, float f4, float f5, float f6, float f7) {
        void h2;
        float f8;
        float f9;
        FOa i22 = vL2;
        FOa g2 = this;
        float i22 = ((float)g2.j + f9) / (float)g2.J;
        i22 *= i22;
        i22 = kta.v - i22 * kta.v;
        if (f8 > pqa.r) {
            i22 = pqa.r;
        }
        i22 *= psa.N;
        uKa.L();
        FOa fOa2 = g2;
        f9 = (float)(fOa2.la - C);
        float e2 = (float)(fOa2.Z - k);
        float d2 = (float)(fOa2.A - j);
        float c2 = fOa2.j.J(new XF((vL)g2));
        fOa2.k.J(M);
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        void v2 = h2;
        float f10 = f9;
        void v4 = h2;
        v4.J(XTa.W, mka.a);
        float f11 = c2;
        v4.J((double)(f9 - Mqa.N), (double)e2, (double)(d2 + Mqa.N)).J(aSa.V, oua.i).J(f11, f11, f11, i22).M();
        float f12 = c2;
        h2.J((double)(f10 + Mqa.N), (double)e2, (double)(d2 + Mqa.N)).J(oua.i, oua.i).J(f12, f12, f12, i22).M();
        float f13 = c2;
        v2.J((double)(f10 + Mqa.N), (double)e2, (double)(d2 - Mqa.N)).J(oua.i, aSa.V).J(f13, f13, f13, i22).M();
        float f14 = c2;
        v2.J((double)(f9 - Mqa.N), (double)e2, (double)(d2 - Mqa.N)).J(aSa.V, aSa.V).J(f14, f14, f14, i22).M();
        pKa.J().J();
        uKa.k();
        uKa.P();
    }
}

