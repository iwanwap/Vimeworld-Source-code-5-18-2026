/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Bpa
 *  DQa
 *  Dla
 *  ERa
 *  GC
 *  Gg
 *  Gl
 *  Gua
 *  ISa
 *  JPa
 *  JQa
 *  JSa
 *  KTa
 *  Kpa
 *  Lra
 *  MQa
 *  Mda
 *  Oz
 *  Qsa
 *  Rua
 *  SQa
 *  Tpa
 *  Uqa
 *  Usa
 *  Wsa
 *  XTa
 *  Xja
 *  YJa
 *  YSa
 *  Yba
 *  aKa
 *  aSa
 *  bqa
 *  dW
 *  eAa
 *  ez
 *  fpa
 *  hy
 *  kpa
 *  kta
 *  mka
 *  nLa
 *  nka
 *  pKa
 *  pqa
 *  psa
 *  pua
 *  uKa
 *  uw
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  vf
 *  wOa
 *  xKa
 *  xOa
 *  yQa
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NKa {
    private static final String G = "CL_00000953";
    private float D;
    private float f;
    private float F;
    private static final ResourceLocation g;
    private final xKa L;
    private int E;
    private Mda m;
    private float C;
    private static final ResourceLocation i;
    private final Kpa M;
    private static final Mda k;
    private Mda j;
    private float J;
    private float A;
    private final oLa I;

    static {
        i = new ResourceLocation(Rua.e);
        g = new ResourceLocation(KTa.Ka);
        k = new Mda((eAa)null);
    }

    /*
     * WARNING - void declaration
     */
    private void J(ANa aNa2, float f2) {
        void a2;
        NKa c22 = aNa2;
        NKa b2 = this;
        NKa nKa = c22;
        NKa nKa2 = c22;
        float f3 = ((ANa)nKa).l + (((ANa)nKa2).V - ((ANa)c22).l) * a2;
        NKa nKa3 = c22;
        float c22 = ((ANa)nKa).T + (((ANa)nKa3).C - ((ANa)nKa3).T) * a2;
        uKa.J((float)((((ANa)nKa2).d - f3) * Nra.e), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)((((ANa)nKa).X - c22) * Nra.e), (float)JPa.N, (float)pqa.r, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2) {
        void a2;
        NKa nKa = this;
        uKa.c();
        if (nKa.M.c.h()) {
            int n2;
            IBlockState iBlockState = nKa.M.Ta.J(new XF((vL)nKa.M.c));
            NKa nKa2 = nKa;
            XF xF = new XF((vL)nKa2.M.c);
            NKa b2 = nKa2.M.c;
            int n3 = n2 = uSa.E;
            while (n3 < Yqa.i) {
                NKa nKa3 = b2;
                double d2 = ((ANa)nKa3).la + (double)(((float)((n2 >> uSa.E) % uqa.g) - MQa.L) * ((ANa)b2).F * xSa.la);
                double d3 = ((ANa)nKa3).Z + (double)(((float)((n2 >> vRa.d) % uqa.g) - MQa.L) * Nra.e);
                double d4 = ((ANa)nKa3).A + (double)(((float)((n2 >> uqa.g) % uqa.g) - MQa.L) * ((ANa)b2).F * xSa.la);
                XF xF2 = new XF(d2, d3 + (double)b2.l(), d4);
                IBlockState iBlockState2 = nKa.M.Ta.J(xF2);
                if (iBlockState2.J().e()) {
                    iBlockState = iBlockState2;
                }
                n3 = ++n2;
            }
            if (iBlockState.J().J() != hy.INVISIBLE) {
                NKa nKa4 = nKa;
                nKa4.J((float)a2, nKa4.M.J().J().J(iBlockState));
            }
        }
        if (!nKa.M.c.t()) {
            if (nKa.M.c.J(Material.water)) {
                nKa.C((float)a2);
            }
            if (nKa.M.c.o()) {
                nKa.l((float)a2);
            }
        }
        uKa.K();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, Mda mda2, Xja xja2) {
        NKa d2 = mda2;
        NKa b2 = this;
        if (d2 != null) {
            void a2;
            void c2;
            Block block = Block.J(d2.J());
            uKa.e();
            if (b2.L.J((Mda)d2)) {
                uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
                if (!(!b2.J(block) || Config.h() && pA.r)) {
                    uKa.J(uSa.E != 0);
                }
            }
            b2.L.J((Mda)d2, (Gl)c2, (Xja)a2);
            if (b2.J(block)) {
                uKa.J(vRa.d != 0);
            }
            uKa.D();
        }
    }

    public void d() {
        a.D = JPa.N;
    }

    private void J(float f2, KLa kLa2) {
        KLa c22 = kLa2;
        NKa a2 = this;
        a2.M.J().J(WKa.C);
        pKa pKa2 = pKa.J();
        aKa b2 = pKa2.J();
        uKa.f((float)Nra.e, (float)Nra.e, (float)Nra.e, (float)MQa.L);
        uKa.e();
        KLa kLa3 = c22;
        float c22 = kLa3.l();
        float f3 = kLa3.C();
        float f4 = kLa3.J();
        float f5 = kLa3.f();
        aKa aKa2 = b2;
        b2.J(XTa.W, mka.A);
        aKa2.J(pqa.q, pqa.q, KPa.I).J((double)f3, (double)f5).M();
        aKa2.J(oua.i, pqa.q, KPa.I).J((double)c22, (double)f5).M();
        aKa2.J(oua.i, oua.i, KPa.I).J((double)c22, (double)f4).M();
        aKa2.J(pqa.q, oua.i, KPa.I).J((double)f3, (double)f4).M();
        pKa2.J();
        uKa.D();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    private void f(Dla dla2) {
        NKa b2 = dla2;
        NKa a2 = this;
        uKa.e();
        uKa.J((float)Upa.O, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)nua.E, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)lQa.Y, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)SQa.w, (float)zua.w, (float)KTa.r);
        b2.l((XW)a2.M.c);
        uKa.D();
    }

    private boolean J(Block block) {
        Block b2 = block;
        NKa a2 = this;
        if (b2 != null && b2.J() == ez.TRANSLUCENT) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void C() {
        a.f = JPa.N;
    }

    private void l() {
        uKa.J((float)vPa.b, (float)psa.N, (float)JPa.N);
        uKa.J((float)NSa.B, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)sSa.fa, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)gua.l, (float)JPa.N, (float)pqa.r, (float)JPa.N);
    }

    private void J(XW xW, float f2) {
        float a2;
        XW c22 = xW;
        NKa b2 = this;
        float c22 = (float)c22.j() - a2 + pqa.r;
        a2 = c22 / (float)b2.m.C();
        c22 = Oz.l((float)(Oz.C((float)(c22 / YSa.G * pua.j)) * Nra.e));
        if (a2 >= xSa.la) {
            c22 = JPa.N;
        }
        uKa.J((float)JPa.N, (float)c22, (float)JPa.N);
        c22 = pqa.r - (float)Math.pow(a2, bqa.E);
        uKa.J((float)(c22 * Ora.D), (float)(c22 * vPa.b), (float)(c22 * JPa.N));
        uKa.J((float)(c22 * ISa.a), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(c22 * FRa.Ga), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)(c22 * NSa.B), (float)JPa.N, (float)JPa.N, (float)pqa.r);
    }

    private void J(XW xW, float f2, float f3) {
        GC c2;
        float b2;
        float d2 = f3;
        NKa a2 = this;
        float f4 = SQa.w * Oz.d((float)(Oz.J((float)d2) * pua.j));
        float f5 = Xpa.R * Oz.d((float)(Oz.J((float)d2) * pua.j * kta.v));
        float f6 = Tpa.S * Oz.d((float)(d2 * pua.j));
        uKa.J((float)f4, (float)f5, (float)f6);
        uKa.J((float)JSa.p, (float)eua.l, (float)TOa.c);
        uKa.J((float)JPa.N, (float)(b2 * eua.l), (float)JPa.N);
        uKa.J((float)nua.E, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        float f7 = d2;
        b2 = Oz.d((float)(f7 * f7 * pua.j));
        uKa.J((float)(Oz.d((float)(Oz.J((float)d2) * pua.j)) * UOa.d), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(b2 * Lsa.X), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        NKa nKa = a2;
        nKa.M.J().J(c2.J());
        uKa.J((float)vqa.T, (float)xOa.C, (float)Bpa.w);
        uKa.J((float)JQa.q, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)Qsa.U, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.l((float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J((float)JPa.ha, (float)JPa.N, (float)JPa.N);
        c2 = nKa.I.J((vL)a2.M.c);
        uKa.m();
        ((Dla)c2).f((XW)a2.M.c);
        uKa.h();
    }

    /*
     * WARNING - void declaration
     */
    private void f(XW xW) {
        void a2;
        NKa nKa;
        NKa nKa2 = nKa = this;
        nKa2.M.J().J(a2.J());
        NKa b2 = (Dla)nKa2.I.J((vL)nKa.M.c);
        if (!a2.C()) {
            uKa.m();
            NKa nKa3 = nKa;
            nKa3.J((Dla)b2);
            nKa3.f((Dla)b2);
            uKa.h();
        }
    }

    private void J(XW xW) {
        XW b322 = xW;
        NKa a2 = this;
        int b322 = a2.M.Ta.J(new XF(b322.la, b322.Z + (double)b322.l(), (double)b322.A), uSa.E);
        if (Config.J()) {
            b322 = vf.J((vL)a2.M.J(), (int)b322);
        }
        float f2 = b322 & yQa.j;
        float b322 = b322 >> ERa.C;
        nka.J((int)nka.P, (float)f2, (float)b322);
    }

    public void f() {
        NKa nKa;
        NKa nKa2 = nKa = this;
        nKa2.C = nKa2.D;
        ANa aNa2 = nKa2.M.c;
        Mda mda2 = aNa2.K.f();
        int a22 = uSa.E;
        if (nKa2.m != null && mda2 != null) {
            if (!nKa.m.J(mda2)) {
                a22 = vRa.d;
            }
        } else {
            a22 = nKa.m == null && mda2 == null ? uSa.E : vRa.d;
        }
        float f2 = Xpa.R;
        float a22 = a22 != 0 ? JPa.N : pqa.r;
        float f3 = Oz.J((float)(a22 - nKa.D), (float)(-f2), (float)f2);
        NKa nKa3 = nKa;
        nKa3.D += f3;
        if (nKa3.D < Nra.e) {
            if (Config.h()) {
                pA.J(mda2);
            }
            nKa.m = mda2;
            nKa.E = aNa2.K.J;
        }
        nKa.J = nKa.A;
        aNa2 = uw.g;
        if (aNa2 == null && !uw.I) {
            aNa2 = k;
        }
        int n2 = nKa.j != aNa2 ? vRa.d : uSa.E;
        a22 = n2 != 0 ? JPa.N : pqa.r;
        NKa nKa4 = nKa;
        nKa4.A += Oz.J((float)(a22 - nKa.A), (float)(-f2), (float)f2);
        if (nKa4.A < Nra.e) {
            nKa.j = aNa2;
        }
        NKa nKa5 = nKa;
        nKa5.F = nKa5.f;
        nKa5.f += Ora.I;
        if (nKa5.f > pqa.r) {
            nKa.f = pqa.r;
        }
    }

    private void C(float f2) {
        float b2 = f2;
        NKa a2 = this;
        if (!Config.h() || pA.J()) {
            NKa nKa = a2;
            nKa.M.J().J(g);
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            float f3 = nKa.M.c.J(b2);
            uKa.f((float)f3, (float)f3, (float)f3, (float)MQa.L);
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.e();
            b2 = -nKa.M.c.X / EPa.r;
            float f4 = nKa.M.c.d / EPa.r;
            aKa aKa3 = aKa2;
            aKa3.J(XTa.W, mka.A);
            aKa3.J(pqa.q, pqa.q, KPa.I).J((double)(YSa.G + b2), (double)(YSa.G + f4)).M();
            aKa3.J(oua.i, pqa.q, KPa.I).J((double)(JPa.N + b2), (double)(YSa.G + f4)).M();
            aKa3.J(oua.i, oua.i, KPa.I).J((double)(JPa.N + b2), (double)(JPa.N + f4)).M();
            aKa3.J(pqa.q, oua.i, KPa.I).J((double)(YSa.G + b2), (double)(JPa.N + f4)).M();
            pKa2.J();
            uKa.D();
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(XW xW, float f2, float f3, float f4) {
        void b2;
        float c2;
        void a2;
        Object e322 = xW;
        NKa d2 = this;
        float f5 = Tpa.S * Oz.d((float)(Oz.J((float)a2) * pua.j));
        float f6 = psa.N * Oz.d((float)(Oz.J((float)a2) * pua.j * kta.v));
        float f7 = ATa.x * Oz.d((float)(a2 * pua.j));
        uKa.J((float)f5, (float)f6, (float)f7);
        NKa nKa = d2;
        float e322 = nKa.J(c2);
        uKa.J((float)JPa.N, (float)Bta.G, (float)JQa.g);
        uKa.J((float)JPa.N, (float)(b2 * qQa.f), (float)JPa.N);
        uKa.J((float)JPa.N, (float)(e322 * vPa.b), (float)JPa.N);
        uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(e322 * Gua.Ja), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        nKa.f((XW)((Object)e322));
        void v1 = a2;
        e322 = Oz.d((float)(v1 * v1 * pua.j));
        c2 = Oz.d((float)(Oz.J((float)a2) * pua.j));
        uKa.J((float)(e322 * Lsa.X), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(c2 * Lsa.X), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)(c2 * sSa.fa), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.l((float)JPa.c, (float)JPa.c, (float)JPa.c);
        uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)vqa.T, (float)vqa.T, (float)JPa.N);
        uKa.l((float)vsa.J, (float)vsa.J, (float)vsa.J);
        nKa.M.J().J(i);
        pKa pKa2 = pKa.J();
        aKa e322 = pKa2.J();
        GL11.glNormal3f(JPa.N, JPa.N, vqa.T);
        aKa aKa2 = e322;
        aKa2.J(XTa.W, mka.A);
        aKa2.J(cPa.L, FRa.k, aSa.V).J(aSa.V, oua.i).M();
        aKa2.J(FRa.k, FRa.k, aSa.V).J(oua.i, oua.i).M();
        aKa2.J(FRa.k, cPa.L, aSa.V).J(oua.i, aSa.V).M();
        aKa2.J(cPa.L, cPa.L, aSa.V).J(aSa.V, aSa.V).M();
        pKa2.J();
        NKa nKa2 = d2;
        e322 = Gea.wa.J(nKa2.m, (Gg)nKa2.M.Ta);
        if (e322 != null) {
            d2.M.R.J().J((dW)e322, uSa.E != 0);
        }
    }

    private void J(float f2, XW xW) {
        float f3;
        float b2;
        XW c22 = xW;
        NKa a2 = this;
        uKa.J((float)fpa.ia, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)csa.P, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)sOa.Z, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)Hra.ha, (float)psa.N, (float)JPa.N);
        b2 = (float)a2.m.C() - ((float)c22.j() - b2 + pqa.r);
        float c22 = b2 / eta.e;
        c22 = (c22 * c22 + c22 * kta.v) / vQa.q;
        if (f3 > pqa.r) {
            c22 = pqa.r;
        }
        if (c22 > Nra.e) {
            b2 = Oz.d((float)((b2 - Nra.e) * Jsa.Z));
            float f4 = c22 - Nra.e;
            uKa.J((float)((b2 *= f4) * JPa.N), (float)(b2 * Jpa.B), (float)(b2 * JPa.N));
        }
        uKa.J((float)(c22 * JPa.N), (float)(c22 * JPa.N), (float)(c22 * Nra.e));
        uKa.l((float)pqa.r, (float)pqa.r, (float)(pqa.r + c22 * psa.N));
    }

    private float J(float f2) {
        float b2 = f2;
        NKa a2 = this;
        return -Oz.C((float)(Oz.J((float)(pqa.r - b2 / nua.E + Nra.e), (float)JPa.N, (float)pqa.r) * pua.j)) * MQa.L + MQa.L;
    }

    private void l(float f2) {
        int n2;
        NKa nKa = this;
        pKa a2 = pKa.J();
        aKa aKa2 = a2.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)ATa.r);
        uKa.I((int)wOa.a);
        uKa.J(uSa.E != 0);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        float f3 = pqa.r;
        int n3 = n2 = uSa.E;
        while (n3 < uqa.g) {
            uKa.e();
            NKa nKa2 = nKa;
            KLa b22 = nKa2.M.J().J(tpa.d);
            nKa2.M.J().J(WKa.C);
            Object object = b22;
            float b22 = ((KLa)object).l();
            float f4 = ((KLa)object).C();
            float f5 = ((KLa)object).J();
            float f6 = ((KLa)object).f();
            float f7 = (JPa.N - f3) / kta.v;
            float f8 = f7 + f3;
            float f9 = JPa.N - f3 / kta.v;
            float f10 = f9 + f3;
            float f11 = vPa.b;
            uKa.J((float)((float)(-(n2 * uqa.g - vRa.d)) * Wsa.Q), (float)SQa.w, (float)JPa.N);
            uKa.J((float)((float)(n2 * uqa.g - vRa.d) * FRa.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            aKa aKa3 = aKa2;
            float f12 = f8;
            aKa aKa4 = aKa2;
            aKa4.J(XTa.W, mka.A);
            aKa4.J((double)f7, (double)f9, (double)f11).J((double)f4, (double)f6).M();
            aKa2.J((double)f12, (double)f9, (double)f11).J((double)b22, (double)f6).M();
            aKa3.J((double)f12, (double)f10, (double)f11).J((double)b22, (double)f5).M();
            aKa3.J((double)f7, (double)f10, (double)f11).J((double)f4, (double)f5).M();
            a2.J();
            uKa.D();
            n3 = ++n2;
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.k();
        uKa.J(vRa.d != 0);
        uKa.I((int)Ira.A);
    }

    public NKa(Kpa kpa2) {
        NKa a2;
        NKa b2 = kpa2;
        NKa nKa = a2 = this;
        a2.E = pua.o;
        a2.j = k;
        a2.f = pqa.r;
        a2.F = pqa.r;
        a2.M = b2;
        nKa.I = a2.M.J();
        nKa.L = b2.J();
    }

    public void J() {
        a.D = JPa.N;
    }

    private void f(float f2) {
        float b2 = f2;
        NKa a2 = this;
        float f3 = Tpa.S * Oz.d((float)(Oz.J((float)b2) * pua.j));
        float f4 = psa.N * Oz.d((float)(Oz.J((float)b2) * pua.j * kta.v));
        b2 = ATa.x * Oz.d((float)(b2 * pua.j));
        uKa.J((float)f3, (float)f4, (float)b2);
    }

    private void J(Dla dla2) {
        NKa b2 = dla2;
        NKa a2 = this;
        uKa.e();
        uKa.J((float)Uqa.h, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)EPa.r, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)APa.ja, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)rta.o, (float)DQa.ca, (float)wOa.w);
        b2.f((XW)a2.M.c);
        uKa.D();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(float f2) {
        void a2;
        NKa nKa;
        NKa nKa2 = nKa = this;
        float f3 = pqa.r - (nKa2.C + (nKa2.D - nKa.C) * a2);
        NKa nKa3 = nKa;
        NKa b2 = nKa3.M.c;
        float f4 = b2.f((float)a2);
        NKa nKa4 = b2;
        float f5 = ((ANa)b2).o + (((ANa)b2).d - ((ANa)nKa4).o) * a2;
        NKa nKa5 = b2;
        float f6 = ((ANa)nKa4).s + (((ANa)nKa5).X - ((ANa)nKa5).s) * a2;
        nKa3.J(f5, f6);
        nKa3.J((XW)((Object)b2));
        nKa3.J((ANa)b2, (float)a2);
        uKa.o();
        uKa.e();
        if (nKa3.j != k) {
            float f7;
            NKa nKa6 = nKa;
            f6 = pqa.r - (nKa6.J + (nKa6.A - nKa.J) * a2);
            NKa nKa7 = nKa;
            float f8 = nKa7.f - nKa7.F;
            if (f7 < JPa.N) {
                f8 += pqa.r;
            }
            NKa nKa8 = nKa;
            f8 = nKa8.F + f8 * a2;
            uKa.e();
            uKa.l((float)vqa.T, (float)pqa.r, (float)pqa.r);
            if (nKa8.j != null) {
                uKa.M((int)Yua.O);
                NKa nKa9 = nKa;
                nKa9.f(f6, f8);
                nKa9.J((Gl)b2, nKa9.j, Xja.FIRST_PERSON);
                uKa.M((int)Zra.W);
            } else if (!b2.C()) {
                nKa.J((XW)((Object)b2), f6, f8);
            }
            uKa.D();
        }
        if (nKa.m != null) {
            NKa nKa10;
            if (nKa.m.J() instanceof Yba) {
                NKa nKa11 = nKa;
                nKa10 = nKa11;
                nKa11.J((XW)((Object)b2), f5, f3, f4);
            } else {
                if (b2.j() > 0) {
                    YFa yFa = nKa.m.J();
                    switch (YJa.I[yFa.ordinal()]) {
                        case 1: {
                            nKa.f(f3, JPa.N);
                            break;
                        }
                        case 2: 
                        case 3: {
                            nKa.J((XW)((Object)b2), (float)a2);
                            nKa.f(f3, JPa.N);
                            break;
                        }
                        case 4: {
                            NKa nKa12 = nKa;
                            nKa12.f(f3, JPa.N);
                            nKa12.l();
                            break;
                        }
                        case 5: {
                            nKa.f(f3, JPa.N);
                            nKa.J((float)a2, (XW)((Object)b2));
                        }
                    }
                } else {
                    nKa.f(f4);
                    nKa.f(f3, f4);
                }
                nKa10 = nKa;
            }
            nKa10.J((Gl)b2, nKa.m, Xja.FIRST_PERSON);
        } else if (!b2.C()) {
            nKa.J((XW)((Object)b2), f3, f4);
        }
        uKa.D();
        uKa.E();
        nLa.C();
    }

    private void f(float f2, float f3) {
        float b2;
        float c2 = f3;
        NKa a2 = this;
        uKa.J((float)Hta.X, (float)Usa.q, (float)TOa.c);
        uKa.J((float)JPa.N, (float)(b2 * eua.l), (float)JPa.N);
        uKa.J((float)nua.E, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        float f4 = c2;
        b2 = Oz.d((float)(f4 * f4 * pua.j));
        c2 = Oz.d((float)(Oz.J((float)c2) * pua.j));
        uKa.J((float)(b2 * Lsa.X), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(c2 * Lsa.X), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)(c2 * sSa.fa), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.l((float)Xpa.R, (float)Xpa.R, (float)Xpa.R);
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3) {
        void b2;
        float c2 = f3;
        NKa a2 = this;
        uKa.e();
        uKa.J((float)b2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)c2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        nLa.f();
        uKa.D();
    }
}

