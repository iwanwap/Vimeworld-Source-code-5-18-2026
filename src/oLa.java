/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  CDa
 *  Cga
 *  Cia
 *  DDa
 *  Dfa
 *  Dga
 *  Dla
 *  ERa
 *  Ela
 *  FEa
 *  GC
 *  GDa
 *  Gg
 *  Gl
 *  HFa
 *  Iea
 *  Ija
 *  Ika
 *  JPa
 *  Kna
 *  Kpa
 *  Lka
 *  Lz
 *  MEa
 *  MQa
 *  Nia
 *  ODa
 *  Oea
 *  Oka
 *  QFa
 *  QS
 *  Qla
 *  Rea
 *  Rka
 *  Rla
 *  SKa
 *  TDa
 *  Tka
 *  UEa
 *  VS
 *  Vka
 *  WEa
 *  WFa
 *  Wda
 *  Wja
 *  Wka
 *  YKa
 *  YSa
 *  Yda
 *  Yea
 *  ZFa
 *  ZJa
 *  Zta
 *  aJa
 *  aKa
 *  aSa
 *  aea
 *  afa
 *  aga
 *  bKa
 *  bpa
 *  cEa
 *  cJa
 *  cRa
 *  cfa
 *  cga
 *  cka
 *  dJa
 *  dLa
 *  dka
 *  eJa
 *  eb
 *  ega
 *  eja
 *  fJa
 *  fka
 *  gJa
 *  gea
 *  hka
 *  hra
 *  iLa
 *  jFa
 *  jea
 *  jka
 *  kDa
 *  kta
 *  lEa
 *  lqa
 *  mEa
 *  mFa
 *  mJa
 *  mLa
 *  mka
 *  nFa
 *  nJa
 *  nQa
 *  nda
 *  nja
 *  nka
 *  pDa
 *  pKa
 *  pqa
 *  qKa
 *  qta
 *  rKa
 *  sFa
 *  tDa
 *  uKa
 *  uda
 *  uw
 *  vJa
 *  vKa
 *  vL
 *  vRa
 *  vea
 *  wOa
 *  wja
 *  xDa
 *  xKa
 *  xfa
 *  xka
 *  xy
 *  yra
 *  zEa
 *  zda
 *  zfa
 *  zka
 */
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import net.minecraft.block.BlockBed;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelRabbit;
import net.minecraft.client.model.ModelSheep2;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.model.ModelZombie;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oLa {
    public float c;
    public vL B;
    private Kna d;
    private Map a;
    public Cia b;
    public float l;
    private double e;
    private Map G;
    public double D;
    private double f;
    private static final String F = "CL_00000991";
    public double g;
    private boolean L;
    private boolean E;
    private boolean m;
    public vL C;
    public boolean i;
    private double M;
    private Dla k;
    public Gg j;
    public aJa J;
    public double A;
    private boolean I;

    /*
     * Unable to fully structure code
     */
    public void J(Gg var1_1, Kna var2_3, vL var3_4, vL var4_5, Cia var5_6, float var6_7) {
        block8: {
            g = var3_4;
            v0 = d = this;
            v1 = d;
            d.j = f;
            v1.b = b;
            v1.B = g;
            v0.C = c;
            v0.d = e;
            if (!(g instanceof Gl) || !((Gl)g).p()) break block8;
            if ((f = f.J(new XF((vL)g))).J() == QFa.Pd) {
                f = f.J(BlockBed.FACING).getHorizontalIndex();
                v2 = d;
                v2.c = f * Jsa.ha + cRa.n;
                v2.l = JPa.N;
            }
            ** GOTO lbl42
        }
        if (uw.E && g instanceof ANa) {
            v3 = b;
            v4 = d;
            v4.c = uw.D;
            v4.l = uw.o;
        } else if (QS.J() && g instanceof ANa) {
            v3 = b;
            v5 = d;
            v5.c = QS.f();
            v5.l = QS.C();
        } else if (VS.J() && g instanceof ANa) {
            v3 = b;
            v6 = d;
            v6.c = VS.C + (VS.k - VS.C) * a;
            v6.l = VS.j + (VS.i - VS.j) * a;
        } else {
            v7 = d;
            v8 = g;
            v7.c = g.s + (v8.X - g.s) * a;
            v9 = g;
            v7.l = v8.o + (v9.d - v9.o) * a;
lbl42:
            // 2 sources

            v3 = b;
        }
        if (v3.ld == uqa.g) {
            d.c += Hra.Ga;
        }
        v10 = d;
        v11 = g;
        d.A = g.V + (g.la - g.V) * (double)a;
        v10.D = v11.Ga + (g.Z - g.Ga) * (double)a;
        v10.g = v11.Ca + (g.A - g.Ca) * (double)a;
    }

    public boolean C() {
        oLa a2;
        return a2.I;
    }

    public void J(double c2, double b2, double a2) {
        oLa d2;
        oLa oLa2 = d2;
        d2.f = c2;
        oLa2.e = b2;
        oLa2.M = a2;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        oLa a2 = this;
        a2.I = b2;
    }

    public Kna J() {
        oLa a2;
        return a2.d;
    }

    /*
     * WARNING - void declaration
     */
    private void J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void a22;
        void c2;
        void d5;
        void e2;
        oLa g2 = vL2;
        oLa f4 = this;
        uKa.J(uSa.E != 0);
        uKa.z();
        uKa.L();
        uKa.m();
        uKa.k();
        oLa oLa2 = g2;
        float b22 = ((vL)oLa2).F / kta.v;
        xy xy2 = oLa2.J();
        ZJa.J((xy)new xy(xy2.J - ((vL)g2).la + e2, xy2.j - ((vL)g2).Z + d5, xy2.I - ((vL)g2).A + c2, xy2.A - ((vL)g2).la + e2, xy2.M - ((vL)g2).Z + d5, xy2.k - ((vL)g2).A + c2), (int)osa.Ja, (int)osa.Ja, (int)osa.Ja, (int)osa.Ja);
        if (oLa2 instanceof Gl) {
            ZJa.J((xy)new xy((double)(e2 - (double)b22), (double)(d5 + (double)g2.l() - yra.d), (double)(c2 - (double)b22), (double)(e2 + (double)b22), (double)(d5 + (double)g2.l() + yra.d), (double)(c2 + (double)b22)), (int)osa.Ja, (int)uSa.E, (int)uSa.E, (int)osa.Ja);
        }
        pKa pKa2 = pKa.J();
        aKa b22 = pKa2.J();
        Lz a22 = g2.J((float)a22);
        aKa aKa2 = b22;
        b22.J(yRa.d, mka.I);
        aKa2.J((double)e2, (double)(d5 + (double)g2.l()), (double)c2).J(uSa.E, uSa.E, osa.Ja, osa.Ja).M();
        aKa2.J((double)(e2 + a22.A * KPa.y), (double)(d5 + (double)g2.l() + a22.j * KPa.y), (double)(c2 + a22.J * KPa.y)).J(uSa.E, uSa.E, osa.Ja, osa.Ja).M();
        pKa2.J();
        uKa.H();
        uKa.P();
        uKa.h();
        uKa.k();
        uKa.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, float f2, boolean bl) {
        void a2;
        void b2;
        oLa d2 = vL2;
        oLa c2 = this;
        if (((vL)d2).g == 0) {
            oLa oLa2 = d2;
            ((vL)oLa2).V = ((vL)oLa2).la;
            ((vL)oLa2).Ga = ((vL)oLa2).Z;
            ((vL)oLa2).Ca = ((vL)oLa2).A;
        }
        oLa oLa3 = d2;
        double d3 = ((vL)oLa3).V + (((vL)d2).la - ((vL)d2).V) * (double)b2;
        oLa oLa4 = d2;
        double d4 = ((vL)oLa3).Ga + (((vL)oLa4).Z - ((vL)d2).Ga) * (double)b2;
        double d5 = ((vL)oLa4).Ca + (((vL)d2).A - ((vL)d2).Ca) * (double)b2;
        oLa oLa5 = d2;
        float f3 = ((vL)oLa3).s + (((vL)oLa5).X - ((vL)oLa5).s) * b2;
        int n2 = oLa3.J((float)b2);
        if (oLa3.o()) {
            n2 = YSa.L;
        }
        int n3 = n2 % opa.w;
        nka.J((int)nka.P, (float)((float)n3 / pqa.r), (float)((float)(n2 /= opa.w) / pqa.r));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        return c2.J((vL)d2, d3 - c2.f, d4 - c2.e, d5 - c2.M, f3, (float)b2, (boolean)a2);
    }

    public void f(float f2) {
        float b2 = f2;
        oLa a2 = this;
        ANa aNa2 = Kpa.J().c;
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        ANa aNa3 = aNa2;
        double d2 = aNa3.V + (aNa2.la - aNa2.V) * (double)b2;
        ANa aNa4 = aNa2;
        double d3 = aNa3.Ga + (aNa4.Z - aNa2.Ga) * (double)b2;
        double d4 = aNa4.Ca + (aNa2.A - aNa2.Ca) * (double)b2;
        double d5 = aSa.V - d3;
        double d6 = ZSa.o - d3;
        uKa.z();
        uKa.k();
        d2 = (double)(aNa3.N << AQa.P) - d2;
        d4 = (double)(aNa3.L << AQa.P) - d4;
        uKa.C((float)pqa.r);
        aKa2.J(yRa.d, mka.I);
        int n2 = b2 = nQa.u;
        while (n2 <= fPa.i) {
            int n3 = nQa.u;
            while (n3 <= fPa.i) {
                int n4;
                aKa aKa3 = aKa2;
                double d7 = d2;
                aKa2.J(d2 + (double)b2, d5, d4 + (double)n4).J(pqa.r, JPa.N, JPa.N, JPa.N).M();
                aKa2.J(d7 + (double)b2, d5, d4 + (double)n4).J(pqa.r, JPa.N, JPa.N, MQa.L).M();
                aKa3.J(d7 + (double)b2, d6, d4 + (double)n4).J(pqa.r, JPa.N, JPa.N, MQa.L).M();
                aKa aKa4 = aKa3.J(d2 + (double)b2, d6, d4 + (double)n4);
                aKa4.J(pqa.r, JPa.N, JPa.N, JPa.N).M();
                n3 = n4 += 16;
            }
            n2 = b2 += 16;
        }
        int n5 = b2 = uqa.g;
        while (n5 < ERa.C) {
            aKa aKa5 = aKa2;
            double d8 = d2;
            aKa aKa6 = aKa2;
            double d9 = d2;
            aKa aKa7 = aKa2;
            aKa7.J(d2 + (double)b2, d5, d4).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa7.J(d2 + (double)b2, d5, d4).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa2.J(d9 + (double)b2, d6, d4).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa6.J(d9 + (double)b2, d6, d4).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa6.J(d2 + (double)b2, d5, d4 + Zta.ba).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa2.J(d8 + (double)b2, d5, d4 + Zta.ba).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa5.J(d8 + (double)b2, d6, d4 + Zta.ba).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa aKa8 = aKa5.J(d2 + (double)b2, d6, d4 + Zta.ba);
            aKa8.J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            n5 = b2 += 2;
        }
        int n6 = b2 = uqa.g;
        while (n6 < ERa.C) {
            aKa aKa9 = aKa2;
            double d10 = d2;
            aKa aKa10 = aKa2;
            double d11 = d2;
            aKa aKa11 = aKa2;
            aKa11.J(d2, d5, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa11.J(d2, d5, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa2.J(d11, d6, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa10.J(d11, d6, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa10.J(d2 + Zta.ba, d5, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa2.J(d10 + Zta.ba, d5, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa9.J(d10 + Zta.ba, d6, d4 + (double)b2).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa aKa12 = aKa9.J(d2 + Zta.ba, d6, d4 + (double)b2);
            aKa12.J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            n6 = b2 += 2;
        }
        int n7 = b2 = uSa.E;
        while (n7 <= hra.Ja) {
            double d12 = (double)b2 - d3;
            aKa aKa13 = aKa2;
            double d13 = d2;
            aKa aKa14 = aKa2;
            double d14 = d2;
            aKa2.J(d2, d12, d4).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            aKa2.J(d14, d12, d4).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa14.J(d14, d12, d4 + Zta.ba).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa14.J(d2 + Zta.ba, d12, d4 + Zta.ba).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa2.J(d13 + Zta.ba, d12, d4).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa13.J(d13, d12, d4).J(pqa.r, pqa.r, JPa.N, pqa.r).M();
            aKa13.J(d2, d12, d4).J(pqa.r, pqa.r, JPa.N, JPa.N).M();
            n7 = b2 += 2;
        }
        pKa2.J();
        uKa.C((float)kta.v);
        aKa2.J(yRa.d, mka.I);
        int n8 = b2 = uSa.E;
        while (n8 <= ERa.C) {
            int n9 = uSa.E;
            while (n9 <= ERa.C) {
                int n10;
                aKa aKa15 = aKa2;
                double d15 = d2;
                aKa2.J(d2 + (double)b2, d5, d4 + (double)n10).J(rta.o, rta.o, pqa.r, JPa.N).M();
                aKa2.J(d15 + (double)b2, d5, d4 + (double)n10).J(rta.o, rta.o, pqa.r, pqa.r).M();
                aKa15.J(d15 + (double)b2, d6, d4 + (double)n10).J(rta.o, rta.o, pqa.r, pqa.r).M();
                aKa aKa16 = aKa15.J(d2 + (double)b2, d6, d4 + (double)n10);
                aKa16.J(rta.o, rta.o, pqa.r, JPa.N).M();
                n9 = n10 += 16;
            }
            n8 = b2 += 16;
        }
        int n11 = b2 = uSa.E;
        while (n11 <= hra.Ja) {
            double d16 = (double)b2 - d3;
            aKa aKa17 = aKa2;
            double d17 = d2;
            aKa aKa18 = aKa2;
            double d18 = d2;
            aKa2.J(d2, d16, d4).J(rta.o, rta.o, pqa.r, JPa.N).M();
            aKa2.J(d18, d16, d4).J(rta.o, rta.o, pqa.r, pqa.r).M();
            aKa18.J(d18, d16, d4 + Zta.ba).J(rta.o, rta.o, pqa.r, pqa.r).M();
            aKa18.J(d2 + Zta.ba, d16, d4 + Zta.ba).J(rta.o, rta.o, pqa.r, pqa.r).M();
            aKa2.J(d17 + Zta.ba, d16, d4).J(rta.o, rta.o, pqa.r, pqa.r).M();
            aKa17.J(d17, d16, d4).J(rta.o, rta.o, pqa.r, pqa.r).M();
            aKa17.J(d2, d16, d4).J(rta.o, rta.o, pqa.r, JPa.N).M();
            n11 = b2 += 16;
        }
        pKa2.J();
        uKa.C((float)pqa.r);
        uKa.B();
        uKa.H();
    }

    public boolean l() {
        oLa a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, float f2) {
        void a22;
        oLa c2 = vL2;
        oLa b2 = this;
        oLa oLa2 = c2;
        double d2 = ((vL)oLa2).V + (((vL)c2).la - ((vL)c2).V) * (double)a22;
        oLa oLa3 = c2;
        double d3 = ((vL)oLa2).Ga + (((vL)oLa3).Z - ((vL)c2).Ga) * (double)a22;
        double d4 = ((vL)oLa3).Ca + (((vL)c2).A - ((vL)c2).Ca) * (double)a22;
        GC gC2 = b2.J((vL)c2);
        if (gC2 != null && b2.J != null) {
            int a22 = c2.J((float)a22);
            int n2 = a22 % opa.w;
            nka.J((int)nka.P, (float)((float)n2 / pqa.r), (float)((float)(a22 /= opa.w) / pqa.r));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            gC2.J((vL)c2, d2 - b2.f, d3 - b2.e, d4 - b2.M);
        }
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        oLa a2 = this;
        a2.L = b2;
    }

    public double l() {
        oLa a2;
        return a2.e;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, eb eb2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        oLa oLa2 = this;
        oLa f2 = oLa2.J((vL)e2);
        if (f2 != null && f2.J((vL)e2, (eb)d5, (double)c2, (double)b2, (double)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Exception decompiling
     */
    public boolean J(vL var1_6, double var2_7, double var4_8, double var6_9, float var8_10, float var9_11, boolean var10_12) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean f() {
        oLa a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f3;
        oLa a2 = this;
        return a2.J((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)g2, uSa.E != 0);
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        oLa a2 = this;
        a2.E = b2;
    }

    /*
     * WARNING - void declaration
     */
    public GC J(Class clazz) {
        void a2;
        oLa oLa2 = this;
        oLa b2 = (GC)oLa2.a.get(a2);
        if (b2 == null && a2 != vL.class) {
            oLa oLa3 = oLa2;
            b2 = oLa3.J(a2.getSuperclass());
            oLa3.a.put(a2, b2);
        }
        return b2;
    }

    public double f() {
        oLa a2;
        return a2.M;
    }

    public void J(Gg gg2) {
        oLa b2 = gg2;
        oLa a2 = this;
        a2.j = b2;
    }

    public double J() {
        oLa a2;
        return a2.f;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        oLa a2 = this;
        a2.m = b2;
    }

    public Map<String, Dla> f() {
        oLa a2;
        return Collections.unmodifiableMap(a2.G);
    }

    /*
     * WARNING - void declaration
     */
    public GC J(vL vL2) {
        void a2;
        oLa oLa2 = this;
        if (a2 instanceof XW) {
            Object b2 = ((XW)a2).l();
            if ((b2 = (Dla)oLa2.G.get(b2)) != null) {
                return b2;
            }
            return oLa2.k;
        }
        return oLa2.J(a2.getClass());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, float f2) {
        void b2;
        float c2 = f2;
        oLa a2 = this;
        return a2.J((vL)b2, c2, uSa.E != 0);
    }

    public double J(double c2, double b2, double a2) {
        oLa d2;
        double d3 = c2 -= d2.A;
        double d4 = b2 -= d2.D;
        double d5 = a2 -= d2.g;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public void J(float f2) {
        float b2 = f2;
        oLa a2 = this;
        a2.c = b2;
    }

    public boolean J() {
        oLa a2;
        return a2.L;
    }

    public void J(Map map) {
        Map b2 = map;
        oLa a2 = this;
        a2.a = b2;
    }

    public Map J() {
        oLa a2;
        return a2.a;
    }

    /*
     * WARNING - void declaration
     */
    public oLa(aJa aJa2, xKa xKa2) {
        void b2;
        oLa c2 = xKa2;
        oLa a2 = this;
        a2.a = Maps.newHashMap();
        a2.G = Maps.newHashMap();
        a2.I = uSa.E;
        a2.L = vRa.d;
        a2.E = uSa.E;
        a2.m = uSa.E;
        a2.i = uSa.E;
        a2.J = b2;
        a2.a.put(aea.class, new qKa(a2));
        a2.a.put(Dga.class, new zka(a2));
        a2.a.put(zda.class, new ZKa(a2, new ModelPig(), ZSa.q));
        a2.a.put(ZFa.class, new Qka(a2, new ModelSheep2(), ZSa.q));
        a2.a.put(aDa.class, new yKa(a2, new ModelCow(), ZSa.q));
        a2.a.put(TDa.class, new fla(a2, new ModelCow(), ZSa.q));
        a2.a.put(xfa.class, new nJa(a2, (ModelBase)new ModelWolf(), MQa.L));
        a2.a.put(aEa.class, new Qla(a2, (ModelBase)new ModelChicken(), bpa.K));
        a2.a.put(ODa.class, new dka(a2, (ModelBase)new ModelOcelot(), Xpa.R));
        a2.a.put(cfa.class, new gJa(a2, (ModelBase)new ModelRabbit(), bpa.K));
        a2.a.put(qda.class, new QLa(a2));
        a2.a.put(uda.class, new Oka(a2));
        a2.a.put(zfa.class, new nja(a2));
        a2.a.put(vea.class, new bKa(a2));
        a2.a.put(Iea.class, new hja(a2));
        a2.a.put(lEa.class, new Lka(a2));
        a2.a.put(nFa.class, new Ela(a2));
        a2.a.put(Zfa.class, new jja(a2));
        a2.a.put(MEa.class, new wja(a2));
        a2.a.put(nda.class, new Rka(a2));
        a2.a.put(cga.class, new vKa(a2, (ModelBase)new ModelSlime(ERa.C), rta.o));
        a2.a.put(ega.class, new eJa(a2));
        a2.a.put(UEa.class, new fka(a2, (ModelBase)new ModelZombie(), MQa.L, lqa.ga));
        a2.a.put(Yda.class, new kKa(a2));
        a2.a.put(HFa.class, new Ija(a2, (ModelBase)new ModelSquid(), ZSa.q));
        a2.a.put(mFa.class, new vJa(a2));
        a2.a.put(DDa.class, new mLa(a2));
        a2.a.put(mEa.class, new xka(a2));
        a2.a.put(GDa.class, new eja(a2));
        a2.a.put(pDa.class, new Ika(a2));
        a2.a.put(sFa.class, new Hla(a2));
        a2.a.put(IDa.class, new Tka(a2));
        a2.a.put(vL.class, new cJa(a2));
        a2.a.put(WFa.class, new Sla(a2));
        a2.a.put(FEa.class, new dJa(a2, (xKa)c2));
        a2.a.put(Nia.class, new fJa(a2));
        a2.a.put(jea.class, new cka(a2));
        a2.a.put(Pda.class, new mJa(a2, Gea.Pd, (xKa)c2));
        a2.a.put(Dfa.class, new mJa(a2, Gea.Uc, (xKa)c2));
        a2.a.put(tDa.class, new mJa(a2, Gea.da, (xKa)c2));
        a2.a.put(WEa.class, new mJa(a2, Gea.C, (xKa)c2));
        a2.a.put(kDa.class, new BJa(a2, (xKa)c2));
        a2.a.put(CDa.class, new mJa(a2, Gea.Tb, (xKa)c2));
        a2.a.put(gea.class, new mJa(a2, Gea.Wa, (xKa)c2));
        a2.a.put(xDa.class, new hka(a2, kta.v));
        a2.a.put(ZDa.class, new hka(a2, MQa.L));
        a2.a.put(afa.class, new SKa(a2));
        a2.a.put(jFa.class, new Ska(a2, (xKa)c2));
        a2.a.put(zEa.class, new YKa(a2));
        a2.a.put(vFa.class, new Rla(a2));
        a2.a.put(aga.class, new Vka(a2));
        a2.a.put(Oea.class, new jka(a2));
        a2.a.put(Cga.class, new Wka(a2));
        a2.a.put(rEa.class, new dLa(a2));
        a2.a.put(Yea.class, new rKa(a2));
        a2.a.put(Wda.class, new vka(a2));
        a2.a.put(Fga.class, new iLa(a2));
        a2.a.put(Rea.class, new fja(a2, new ModelHorse(), wOa.w));
        a2.a.put(cEa.class, new Wja(a2));
        oLa oLa2 = a2;
        oLa2.k = new Dla(oLa2);
        oLa2.G.put(BQa.la, a2.k);
        a2.G.put(qta.K, new Dla(a2, vRa.d != 0));
    }
}

