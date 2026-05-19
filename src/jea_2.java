/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  ERa
 *  FBa
 *  FPa
 *  Gg
 *  Gl
 *  I
 *  ISa
 *  JPa
 *  Kpa
 *  Lz
 *  MQa
 *  Mda
 *  Oz
 *  UZ
 *  WSa
 *  Waa
 *  XC
 *  XTa
 *  Zpa
 *  aSa
 *  bFa
 *  bpa
 *  eS
 *  gZ
 *  hTa
 *  jea
 *  kGa
 *  kta
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  vea
 *  xOa
 *  xy
 *  zU
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jea_2
extends vL
implements XC {
    private int G;
    public int D;
    public vL f;
    private int F;
    private int E;
    private int m;
    private double C;
    private int i;
    private Block M;
    public int k;
    private boolean j;
    private int J;
    private int A;

    public double J() {
        jea_2 a2;
        return a2.C;
    }

    public boolean u() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void C(Sx sx2) {
        jea_2 jea_22 = this;
        if (!jea_22.j.e && jea_22.j && jea_22.k <= 0) {
            void a2;
            int b2;
            int n2 = b2 = jea_22.D == vRa.d || jea_22.D == uqa.g && a2.h.f() ? vRa.d : uSa.E;
            if (jea_22.D == vRa.d && !a2.K.f(new Mda(Gea.Ma, vRa.d))) {
                b2 = uSa.E;
            }
            if (b2 != 0) {
                jea_2 jea_23 = jea_22;
                jea_23.J(FRa.ba, psa.N, ((jea_22.R.nextFloat() - jea_22.R.nextFloat()) * ZSa.q + pqa.r) * kta.v);
                a2.f((vL)jea_23, vRa.d);
                jea_23.k();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void h2;
        void d5;
        void e2;
        void f4;
        void g2;
        jea_2 c2;
        float f5 = f3;
        jea_2 jea_22 = c2 = this;
        jea_22.l((double)g2, (double)f4, (double)e2);
        jea_22.C((float)d5, (float)h2);
    }

    public void M(int n2) {
        int b2 = n2;
        jea_2 a2 = this;
        a2.m = b2;
    }

    public void C(double a2) {
        b.C = a2;
    }

    public void J(Waa waa2) {
        jea_2 jea_22;
        jea_2 b2 = waa2;
        jea_2 a2 = this;
        jea_2 jea_23 = b2;
        jea_2 jea_24 = a2;
        jea_2 jea_25 = b2;
        a2.F = jea_25.J(fPa.g);
        jea_24.A = jea_25.J(pua.g);
        jea_24.i = b2.J(pua.N);
        a2.G = jea_23.J(sqa.L);
        if (jea_23.J(xSa.l, Yqa.i)) {
            jea_22 = a2;
            a2.M = Block.J(b2.J(xSa.l));
        } else {
            jea_22 = a2;
            a2.M = Block.f(b2.J(xSa.l) & osa.Ja);
        }
        jea_22.E = b2.J(nua.a) & osa.Ja;
        jea_2 jea_26 = a2;
        jea_26.k = b2.J(Qra.v) & osa.Ja;
        jea_26.j = b2.J(hTa.ha) == vRa.d ? vRa.d : uSa.E;
        int n2 = jea_26.j ? 1 : 0;
        if (b2.J(lQa.I, zOa.v)) {
            a2.C = b2.J(lQa.I);
        }
        if (b2.J(fqa.B, zOa.v)) {
            a2.D = b2.J(fqa.B);
            return;
        }
        if (b2.J(xOa.l, zOa.v)) {
            a2.D = b2.f(xOa.l) ? vRa.d : uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public jea_2(Gg gg2, Gl gl2, float f2) {
        void a2;
        void c2;
        jea_2 d2 = gl2;
        jea_2 b2 = this;
        super((Gg)c2);
        b2.F = pua.o;
        b2.A = pua.o;
        b2.i = pua.o;
        b2.C = KPa.y;
        b2.n = Wqa.m;
        b2.f = d2;
        if (b2.f instanceof Sx) {
            b2.D = vRa.d;
            b2.f();
        }
        jea_2 jea_22 = b2;
        jea_2 jea_23 = b2;
        jea_23.l(MQa.L, MQa.L);
        jea_2 jea_24 = d2;
        jea_22.f(((Gl)d2).la, ((Gl)d2).Z + (double)d2.l(), ((Gl)d2).A, ((Gl)jea_24).X, ((Gl)jea_24).d);
        jea_23.la -= (double)(Oz.C((float)(b2.X / Hra.Ga * pua.j)) * TOa.r);
        jea_22.Z -= Tqa.Ia;
        jea_22.A -= (double)(Oz.d((float)(b2.X / Hra.Ga * pua.j)) * TOa.r);
        jea_22.l(jea_22.la, b2.Z, b2.A);
        jea_22.f(-Oz.d((float)(jea_22.X / Hra.Ga * pua.j)) * Oz.C((float)(b2.d / Hra.Ga * pua.j)));
        jea_22.l(Oz.C((float)(jea_22.X / Hra.Ga * pua.j)) * Oz.C((float)(b2.d / Hra.Ga * pua.j)));
        jea_22.J(-Oz.d((float)(jea_22.d / Hra.Ga * pua.j)));
        jea_22.J(jea_22.i, b2.Ea, (double)b2.f, (float)(a2 * Ira.d), pqa.r);
    }

    public boolean I() {
        return uSa.E != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void d() {
        MiniDotItem miniDotItem;
        xy xy2;
        float f2;
        int n2;
        xy xy3;
        jea_2 jea_22;
        jea_2 jea_23 = jea_22 = this;
        super.d();
        if (jea_23.o == JPa.N && jea_22.s == JPa.N) {
            jea_2 jea_24 = jea_22;
            float f3 = Oz.J((double)(jea_24.i * jea_22.i + jea_22.f * jea_22.f));
            jea_24.s = jea_22.X = (float)(Oz.f((double)jea_24.i, (double)jea_22.f) * kta.Da / lQa.f);
            jea_22.o = jea_22.d = (float)(Oz.f((double)jea_22.Ea, (double)f3) * kta.Da / lQa.f);
        }
        jea_2 jea_25 = jea_22;
        XF xF2 = new XF(jea_25.F, jea_25.A, jea_22.i);
        Object a2 = jea_22.j.J(xF2);
        Block block = a2.J();
        if (block.J() != Material.air) {
            Block block2 = block;
            block2.J((I)jea_22.j, xF2);
            xy3 = block2.J((Gg)jea_22.j, xF2, (IBlockState)a2);
            if (xy3 != null) {
                if (xy3.J(new Lz(jea_22.la, jea_22.Z, (double)jea_22.A))) {
                    jea_22.j = vRa.d;
                }
            }
        }
        if (jea_22.k > 0) {
            jea_22.k -= vRa.d;
        }
        if (jea_22.j) {
            Block block3 = block;
            int n3 = block3.f((IBlockState)a2);
            if (block3 == jea_22.M && n3 == jea_22.E) {
                jea_2 jea_26 = jea_22;
                jea_26.G += vRa.d;
                if (jea_26.G < PRa.ga) return;
                jea_22.k();
                return;
            }
            jea_2 jea_27 = jea_22;
            jea_27.j = uSa.E;
            jea_2 jea_28 = jea_22;
            jea_28.f(jea_27.i * (double)(jea_28.R.nextFloat() * psa.N));
            jea_27.J(jea_27.Ea * (double)(jea_22.R.nextFloat() * psa.N));
            jea_27.l((double)(jea_27.f * (double)(jea_22.R.nextFloat() * psa.N)));
            jea_27.G = uSa.E;
            jea_27.J = uSa.E;
            return;
        }
        jea_2 jea_29 = jea_22;
        jea_29.J += vRa.d;
        xy3 = new Lz(jea_22.la, jea_22.Z, (double)jea_22.A);
        xF2 = new Lz(jea_22.la + jea_22.i, jea_22.Z + jea_22.Ea, (double)(jea_22.A + jea_22.f));
        a2 = jea_29.j.J((Lz)xy3, (Lz)xF2, uSa.E != 0, vRa.d != 0, uSa.E != 0);
        xy3 = new Lz(jea_22.la, jea_22.Z, (double)jea_22.A);
        xF2 = new Lz(jea_22.la + jea_22.i, jea_22.Z + jea_22.Ea, (double)(jea_22.A + jea_22.f));
        if (a2 != null) {
            xF2 = new Lz(((RY)a2).I.A, ((RY)a2).I.j, ((RY)a2).I.J);
        }
        block = null;
        jea_2 jea_210 = jea_22;
        List list = jea_22.j.f((vL)jea_210, jea_22.J().l((double)jea_210.i, jea_22.Ea, (double)jea_22.f).f(oua.i, oua.i, oua.i));
        double d2 = aSa.V;
        int n4 = n2 = uSa.E;
        while (n4 < list.size()) {
            vL vL2 = (vL)list.get(n2);
            if (vL2.E() && (vL2 != jea_22.f || jea_22.J >= tTa.h)) {
                double d3;
                f2 = bpa.K;
                xy2 = vL2.J().f((double)f2, (double)f2, (double)f2);
                RY rY2 = xy2.J((Lz)xy3, (Lz)xF2);
                if (rY2 != null && ((d3 = xy3.l(rY2.I)) < d2 || d2 == aSa.V)) {
                    block = vL2;
                    d2 = d3;
                }
            }
            n4 = ++n2;
        }
        if (block != null) {
            a2 = new RY((vL)block);
        }
        if (a2 != null && ((RY)a2).J != null && ((RY)a2).J instanceof Sx) {
            Sx sx2 = (Sx)((RY)a2).J;
            if (sx2.h.M || jea_22.f instanceof Sx && !((Sx)jea_22.f).J(sx2)) {
                a2 = null;
            }
        }
        if (a2 != null) {
            if (((RY)a2).J != null) {
                jea_2 jea_211;
                gZ gZ2;
                int n5;
                jea_2 jea_212 = jea_22;
                float f4 = Oz.J((double)(jea_22.i * jea_212.i + jea_22.Ea * jea_22.Ea + jea_22.f * jea_22.f));
                int n6 = Oz.J((double)((double)f4 * jea_22.C));
                if (jea_212.l()) {
                    int n7 = n6;
                    n5 = n7 + jea_22.R.nextInt(n7 / uqa.g + uqa.g);
                }
                jea_2 jea_213 = jea_22;
                if (jea_22.f == null) {
                    gZ2 = gZ.J((jea)jea_213, (vL)jea_22);
                    jea_211 = jea_22;
                } else {
                    gZ2 = gZ.J((jea)jea_213, (vL)jea_22.f);
                    jea_211 = jea_22;
                }
                if (jea_211.o() && !(((RY)a2).J instanceof vea)) {
                    ((RY)a2).J.J(tTa.h);
                }
                if (((RY)a2).J.J(gZ2, (float)n5)) {
                    if (((RY)a2).J instanceof Gl) {
                        xy2 = (Gl)((RY)a2).J;
                        if (!jea_22.j.e) {
                            xy xy4 = xy2;
                            xy4.M(xy4.J() + vRa.d);
                        }
                        if (jea_22.m > 0) {
                            float f5;
                            float f6 = Oz.J((double)(jea_22.i * jea_22.i + jea_22.f * jea_22.f));
                            if (f5 > JPa.N) {
                                ((RY)a2).J.f((double)(jea_22.i * (double)jea_22.m * Zpa.ca / (double)f6), tpa.k, (double)(jea_22.f * (double)jea_22.m * Zpa.ca / (double)f6));
                            }
                        }
                        if (jea_22.f instanceof Gl) {
                            jea_2 jea_214 = jea_22;
                            kGa.J((Gl)xy2, (vL)jea_214.f);
                            kGa.f((Gl)((Gl)jea_214.f), (vL)xy2);
                        }
                        if (jea_22.f != null && ((RY)a2).J != jea_22.f && ((RY)a2).J instanceof Sx && jea_22.f instanceof bFa) {
                            ((bFa)jea_22.f).I.J((KC)new FBa(uua.p, JPa.N));
                        }
                    }
                    jea_22.J(WSa.Ja, pqa.r, pPa.c / (jea_22.R.nextFloat() * psa.N + ATa.r));
                    if (!(((RY)a2).J instanceof vea)) {
                        jea_22.k();
                    }
                } else {
                    jea_2 jea_215 = jea_22;
                    jea_215.f(jea_215.i * pPa.u);
                    jea_215.J(jea_215.Ea * pPa.u);
                    jea_215.l((double)(jea_215.f * pPa.u));
                    jea_215.X += Hra.Ga;
                    jea_215.s += Hra.Ga;
                    jea_215.J = uSa.E;
                }
            } else {
                XF xF3 = ((RY)a2).J();
                jea_2 jea_216 = jea_22;
                XF xF4 = xF3;
                jea_22.F = xF4.getX();
                jea_22.A = xF4.getY();
                jea_216.i = xF3.getZ();
                IBlockState iBlockState = jea_22.j.J(xF3);
                jea_216.M = iBlockState.J();
                jea_216.E = jea_216.M.f(iBlockState);
                jea_216.f((float)(((RY)a2).I.A - jea_22.la));
                jea_216.J((float)(((RY)a2).I.j - jea_22.Z));
                jea_216.l((float)(((RY)a2).I.J - jea_22.A));
                f2 = Oz.J((double)(jea_216.i * jea_22.i + jea_22.Ea * jea_22.Ea + jea_22.f * jea_22.f));
                jea_216.la -= jea_22.i / (double)f2 * ySa.Ja;
                jea_216.Z -= jea_22.Ea / (double)f2 * ySa.Ja;
                jea_216.A -= jea_22.f / (double)f2 * ySa.Ja;
                jea_216.J(WSa.Ja, pqa.r, pPa.c / (jea_22.R.nextFloat() * psa.N + ATa.r));
                jea_216.j = vRa.d;
                jea_216.k = XTa.W;
                jea_216.A(uSa.E != 0);
                if (jea_216.M.J() != Material.air) {
                    jea_2 jea_217 = jea_22;
                    jea_217.M.J((Gg)jea_217.j, xF3, iBlockState, jea_22);
                }
            }
        }
        if (jea_22.l()) {
            int n8 = n2 = uSa.E;
            while (n8 < AQa.P) {
                double d4 = jea_22.la + jea_22.i * (double)n2 / FPa.T;
                double d5 = jea_22.Z + jea_22.Ea * (double)n2 / FPa.T;
                int n9 = jea_22.A + jea_22.f * (double)n2 / FPa.T;
                int n10 = --1;
                jea_22.j.J(UZ.CRIT, d4, d5, (double)n9, (double)(-jea_22.i), -jea_22.Ea + iSa.P, (double)(-jea_22.f), new int[uSa.E]);
                n8 = ++n2;
            }
        }
        if (jea_22.j.e && (n2 = jea_22.J()) != 0 && (miniDotItem = (MiniDotItem)BS.ITEMS.get(n2)) != null && miniDotItem.model instanceof ImageArrowTrail) {
            ImageArrowTrail imageArrowTrail = (ImageArrowTrail)miniDotItem.model;
            imageArrowTrail.J((jea)jea_22);
        }
        jea_2 jea_218 = jea_22;
        jea_2 jea_219 = jea_218;
        jea_218.la += jea_22.i;
        jea_218.Z += jea_22.Ea;
        jea_218.A += jea_22.f;
        float f7 = Oz.J((double)(jea_218.i * jea_22.i + jea_22.f * jea_22.f));
        jea_218.X = (float)(Oz.f((double)jea_218.i, (double)jea_22.f) * kta.Da / lQa.f);
        jea_218.d = (float)(Oz.f((double)jea_218.Ea, (double)f7) * kta.Da / lQa.f);
        while (jea_219.d - jea_22.o < xua.V) {
            jea_2 jea_220 = jea_22;
            jea_219 = jea_220;
            jea_220.o -= CRa.ja;
        }
        jea_2 jea_221 = jea_22;
        while (jea_221.d - jea_22.o >= Hra.Ga) {
            jea_2 jea_222 = jea_22;
            jea_221 = jea_222;
            jea_222.o += CRa.ja;
        }
        jea_2 jea_223 = jea_22;
        while (jea_223.X - jea_22.s < xua.V) {
            jea_2 jea_224 = jea_22;
            jea_223 = jea_224;
            jea_224.s -= CRa.ja;
        }
        jea_2 jea_225 = jea_22;
        while (jea_225.X - jea_22.s >= Hra.Ga) {
            jea_2 jea_226 = jea_22;
            jea_225 = jea_226;
            jea_226.s += CRa.ja;
        }
        jea_2 jea_227 = jea_22;
        jea_2 jea_228 = jea_22;
        jea_227.d = jea_227.o + (jea_228.d - jea_22.o) * psa.N;
        jea_2 jea_229 = jea_22;
        jea_227.X = jea_228.s + (jea_229.X - jea_229.s) * psa.N;
        float f8 = KPa.w;
        float f9 = Yqa.C;
        if (jea_227.L()) {
            int n11;
            int n12 = n11 = uSa.E;
            while (n12 < AQa.P) {
                float f10 = rta.o;
                int n13 = 4 ^ 5;
                jea_22.j.J(UZ.WATER_BUBBLE, jea_22.la - jea_22.i * (double)f10, jea_22.Z - jea_22.Ea * (double)f10, (double)(jea_22.A - jea_22.f * (double)f10), (double)jea_22.i, jea_22.Ea, (double)jea_22.f, new int[uSa.E]);
                n12 = ++n11;
            }
            f8 = Ora.D;
        }
        if (jea_22.M()) {
            jea_22.I();
        }
        jea_2 jea_230 = jea_22;
        jea_230.f(jea_230.i * (double)f8);
        jea_230.J(jea_230.Ea * (double)f8);
        jea_230.l((double)(jea_230.f * (double)f8));
        jea_230.J(jea_230.Ea - (double)f9);
        jea_230.l(jea_230.la, jea_22.Z, jea_22.A);
        jea_230.c();
    }

    /*
     * WARNING - void declaration
     */
    public void d(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        jea_2 jea_22;
        jea_2 jea_23 = jea_22 = this;
        jea_22.f((double)c2);
        jea_23.J((double)b2);
        jea_23.l((double)a2);
        if (jea_23.o == JPa.N && jea_22.s == JPa.N) {
            void v1 = c2;
            void v2 = a2;
            float d5 = Oz.J((double)(v1 * v1 + v2 * v2));
            jea_2 jea_24 = jea_22;
            jea_24.s = jea_24.X = (float)(Oz.f((double)c2, (double)a2) * kta.Da / lQa.f);
            jea_2 jea_25 = jea_22;
            jea_25.o = jea_25.d = (float)(Oz.f((double)b2, (double)d5) * kta.Da / lQa.f);
            jea_2 jea_26 = jea_22;
            jea_26.o = jea_26.d;
            jea_26.s = jea_26.X;
            jea_2 jea_27 = jea_22;
            jea_26.f(jea_26.la, jea_22.Z, jea_22.A, jea_27.X, jea_27.d);
            jea_26.G = uSa.E;
        }
    }

    public jea_2(Gg gg2) {
        jea_2 a2;
        jea_2 b2 = gg2;
        jea_2 jea_22 = a2 = this;
        super((Gg)b2);
        jea_22.F = pua.o;
        jea_22.A = pua.o;
        jea_22.i = pua.o;
        jea_22.C = KPa.y;
        jea_22.n = Wqa.m;
        jea_22.l(MQa.L, MQa.L);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3) {
        float f4;
        void a2;
        void c2;
        void d5;
        void e2;
        float f5 = f2;
        jea_2 b2 = this;
        void v0 = e2;
        void v1 = d5;
        void v2 = c2;
        float f6 = Oz.J((double)(v0 * v0 + v1 * v1 + v2 * v2));
        e2 /= (double)f6;
        d5 /= (double)f6;
        c2 /= (double)f6;
        e2 += b2.R.nextGaussian() * (double)(b2.R.nextBoolean() ? pua.o : vRa.d) * Nta.B * (double)a2;
        d5 += b2.R.nextGaussian() * (double)(b2.R.nextBoolean() ? pua.o : vRa.d) * Nta.B * (double)a2;
        c2 += b2.R.nextGaussian() * (double)(b2.R.nextBoolean() ? pua.o : vRa.d) * Nta.B * (double)a2;
        jea_2 jea_22 = b2;
        jea_22.f((double)(e2 *= (double)f4));
        jea_22.J((double)(d5 *= (double)f4));
        b2.l((double)(c2 *= (double)f4));
        void v4 = c2;
        f4 = Oz.J((double)(e2 * e2 + v4 * v4));
        b2.s = b2.X = (float)(Oz.f((double)e2, (double)c2) * kta.Da / lQa.f);
        jea_2 jea_23 = b2;
        jea_23.o = jea_23.d = (float)(Oz.f((double)d5, (double)f4) * kta.Da / lQa.f);
        b2.G = uSa.E;
    }

    public boolean l() {
        jea_2 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void A(boolean bl) {
        void a2;
        jea_2 jea_22 = this;
        byte b2 = jea_22.aa.J(ERa.C);
        if (a2 != false) {
            jea_22.aa.J(ERa.C, Byte.valueOf((byte)(b2 | vRa.d)));
            return;
        }
        jea_22.aa.J(ERa.C, Byte.valueOf((byte)(b2 & rQa.p)));
    }

    public void f(Waa waa2) {
        jea_2 b2 = waa2;
        jea_2 a2 = this;
        jea_2 jea_22 = b2;
        jea_22.J(fPa.g, (short)a2.F);
        jea_22.J(pua.g, (short)a2.A);
        jea_22.J(pua.N, (short)a2.i);
        jea_22.J(sqa.L, (short)a2.G);
        ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(a2.M);
        b2.J(xSa.l, resourceLocation == null ? Mqa.y : resourceLocation.toString());
        jea_2 jea_23 = b2;
        jea_23.J(nua.a, (byte)a2.E);
        jea_23.J(Qra.v, (byte)a2.k);
        jea_23.J(hTa.ha, (byte)(a2.j ? vRa.d : uSa.E));
        jea_2 jea_24 = b2;
        jea_24.J(fqa.B, (byte)a2.D);
        jea_24.J(lQa.I, a2.C);
    }

    private void f() {
        Object a2;
        jea_2 jea_22 = this;
        if (!jea_22.j.e && Kpa.J().d() && (a2 = zU.M.f(jea_22.f.J()).J(eS.ARROW)) != null) {
            jea_22.aa.J(yta.Ka, Integer.valueOf(((MiniDotItem)a2).id));
        }
    }

    public void J() {
        jea_2 a2;
        jea_2 jea_22 = a2;
        jea_22.aa.f(ERa.C, (byte)uSa.E);
        jea_22.aa.f(yta.Ka, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public jea_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        jea_2 d5;
        jea_2 e2 = gg2;
        jea_2 jea_22 = d5 = this;
        super((Gg)e2);
        d5.F = pua.o;
        d5.A = pua.o;
        d5.i = pua.o;
        d5.C = KPa.y;
        d5.n = Wqa.m;
        jea_22.l(MQa.L, MQa.L);
        jea_22.l((double)c2, (double)b2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public jea_2(Gg gg2, Gl gl2, Gl gl3, float f2, float f3) {
        double d2;
        void c22;
        void e22;
        jea_2 f4 = gl2;
        jea_2 d3 = this;
        super((Gg)e22);
        d3.F = pua.o;
        d3.A = pua.o;
        d3.i = pua.o;
        d3.C = KPa.y;
        d3.n = Wqa.m;
        d3.f = f4;
        if (d3.f instanceof Sx) {
            d3.D = vRa.d;
            d3.f();
        }
        d3.Z = ((Gl)f4).Z + (double)f4.l() - Tqa.Ia;
        void v0 = c22;
        double d4 = v0.la - ((Gl)f4).la;
        void v1 = c22;
        double d5 = v0.J().j + (double)(v1.u / vQa.q) - d3.Z;
        double d6 = v1.A - ((Gl)f4).A;
        double d7 = d4;
        double d8 = d6;
        double d9 = Oz.J((double)(d7 * d7 + d8 * d8));
        if (d2 >= qQa.P) {
            void a2;
            void b2;
            float e22 = (float)(Oz.f((double)d6, (double)d4) * kta.Da / lQa.f) - ISa.a;
            float c22 = (float)(-(Oz.f((double)d5, (double)d9) * kta.Da / lQa.f));
            double d10 = d4 / d9;
            double d11 = d6 / d9;
            jea_2 jea_22 = d3;
            jea_22.f(((Gl)f4).la + d10, d3.Z, ((Gl)f4).A + d11, e22, c22);
            e22 = (float)(d9 * Bua.Ia);
            jea_22.J(d4, d5 + (double)e22, d6, (float)b2, (float)a2);
        }
    }

    public float l() {
        return JPa.N;
    }

    public int J() {
        jea_2 a2;
        return a2.aa.J(yta.Ka);
    }
}

