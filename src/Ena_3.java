/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HNa
 *  ISa
 *  NTa
 *  XTa
 *  aKa
 *  aSa
 *  cb
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class Ena_3
extends cb {
    public final /* synthetic */ HNa A;
    public int I;

    public void l() {
    }

    public boolean f(int n2) {
        int b2 = n2;
        Ena_3 a2 = this;
        if (b2 == a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, ResourceLocation resourceLocation) {
        aKa a2;
        void b2;
        int d2 = n2;
        Ena_3 c2 = this;
        Ena_3 ena_3 = c2;
        ena_3.A.l((d2 += tTa.h) - vRa.d, d2 + fPa.i, (int)(b2 - vRa.d), oua.S);
        ena_3.A.l(d2 - vRa.d, d2 + fPa.i, (int)(b2 + fPa.i), gsa.Ga);
        ena_3.A.f(d2 - vRa.d, (int)(b2 - vRa.d), (int)(b2 + fPa.i), oua.S);
        ena_3.A.f(d2 + fPa.i, (int)(b2 - vRa.d), (int)(b2 + fPa.i), gsa.Ga);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        ena_3.B.J().J((ResourceLocation)a2);
        pKa pKa2 = pKa.J();
        aKa aKa2 = a2 = pKa2.J();
        int n4 = d2;
        aKa aKa3 = a2;
        aKa3.J(XTa.W, mka.A);
        aKa3.J((double)(d2 + uSa.E), (double)(b2 + fPa.i), aSa.V).J(aSa.V, oua.i).M();
        a2.J((double)(n4 + fPa.i), (double)(b2 + fPa.i), aSa.V).J(oua.i, oua.i).M();
        aKa2.J((double)(n4 + fPa.i), (double)(b2 + uSa.E), aSa.V).J(oua.i, aSa.V).M();
        aKa2.J((double)(d2 + uSa.E), (double)(b2 + uSa.E), aSa.V).J(aSa.V, aSa.V).M();
        pKa2.J();
    }

    public void J(int n2, boolean bl, int n3, int n4) {
        Ena_3 d2;
        int e2 = n2;
        Ena_3 ena_3 = d2 = this;
        ena_3.I = e2;
        ena_3.A.J();
        HNa.J((HNa)ena_3.A).f(((rNa)HNa.J().get((int)HNa.J((HNa)d2.A).I)).I.toString());
    }

    public int e() {
        return HNa.J().size();
    }

    public Ena_3(HNa hNa2) {
        Ena_3 b2 = hNa2;
        Ena_3 a2 = this;
        a2.A = b2;
        Ena_3 ena_3 = b2;
        super(((HNa)b2).g, ((HNa)ena_3).A, ((HNa)ena_3).I, Fua.J, ((HNa)b2).I - fPa.i, ISa.E);
        a2.I = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        int g22 = n2;
        Ena_3 f2 = this;
        rNa g22 = (rNa)HNa.J().get(g22);
        Ena_3 ena_3 = f2;
        ena_3.J((int)e2, (int)d2, g22.A);
        ena_3.A.L.J(g22.J, (int)(e2 + fPa.i + NTa.C), (int)(d2 + hpa.Z), pua.o);
    }
}

