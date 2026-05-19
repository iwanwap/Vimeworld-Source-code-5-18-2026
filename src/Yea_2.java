/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CY
 *  CZ
 *  Cfa
 *  Cga
 *  Cra
 *  DDa
 *  EDa
 *  FPa
 *  Gg
 *  Gl
 *  JPa
 *  Lz
 *  MQa
 *  Mda
 *  NTa
 *  OCa
 *  Oz
 *  PTa
 *  QFa
 *  Qqa
 *  RGa
 *  Rda
 *  SQa
 *  Tf
 *  Tpa
 *  Uea
 *  Waa
 *  XTa
 *  Yea
 *  ZRa
 *  Zua
 *  aSa
 *  cQa
 *  cRa
 *  gZ
 *  kpa
 *  kta
 *  ld
 *  mra
 *  pP
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  wOa
 *  xy
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Yea_2
extends vL
implements fc {
    private boolean G;
    private double D;
    private String f;
    private int F;
    private double E;
    private double m;
    private double C;
    private static final int[][][] M;
    private double k;
    private double j;
    private double J;
    private double I;

    public Lz J(double d2, double d3, double d4) {
        Object d5;
        double a2;
        int n2;
        double b2;
        int n3;
        double c2;
        Yea_2 yea_2 = this;
        int n4 = Oz.f((double)c2);
        if (BlockRailBase.l((Gg)yea_2.j, new XF(n4, (n3 = Oz.f((double)b2)) - vRa.d, n2 = Oz.f((double)a2)))) {
            --n3;
        }
        if (BlockRailBase.J((IBlockState)(d5 = yea_2.j.J(new XF(n4, n3, n2))))) {
            double d6;
            Object object = d5;
            d5 = object.J(((BlockRailBase)object.J()).J());
            d5 = M[((BlockRailBase$EnumRailDirection)((Object)d5)).getMetadata()];
            double d7 = aSa.V;
            double d8 = (double)n4 + kTa.B + (double)d5[uSa.E][uSa.E] * kTa.B;
            double d9 = (double)n3 + BQa.R + (double)d5[uSa.E][vRa.d] * kTa.B;
            double d10 = (double)n2 + kTa.B + (double)d5[uSa.E][uqa.g] * kTa.B;
            double d11 = (double)n4 + kTa.B + (double)d5[vRa.d][uSa.E] * kTa.B;
            double d12 = (double)n3 + BQa.R + (double)d5[vRa.d][vRa.d] * kTa.B;
            double d13 = (double)n2 + kTa.B + (double)d5[vRa.d][uqa.g] * kTa.B;
            d12 = (d12 - d9) * KPa.y;
            d13 -= d10;
            if ((d11 -= d8) == aSa.V) {
                c2 = (double)n4 + kTa.B;
                d7 = a2 - (double)n2;
                d6 = d8;
            } else if (d13 == aSa.V) {
                a2 = (double)n2 + kTa.B;
                d7 = c2 - (double)n4;
                d6 = d8;
            } else {
                double d14 = c2 - d8;
                double d15 = a2 - d10;
                d7 = (d14 * d11 + d15 * d13) * KPa.y;
                d6 = d8;
            }
            c2 = d6 + d11 * d7;
            b2 = d9 + d12 * d7;
            a2 = d10 + d13 * d7;
            if (d12 < aSa.V) {
                b2 += oua.i;
            }
            if (d12 > aSa.V) {
                b2 += kTa.B;
            }
            return new Lz(c2, b2, a2);
        }
        return null;
    }

    public void J(String string) {
        String b2 = string;
        Yea_2 a2 = this;
        a2.f = b2;
    }

    @Override
    public ld J() {
        Yea_2 a2;
        Yea_2 yea_2 = this;
        if (yea_2.J()) {
            Yea_2 yea_22 = a2 = new CY(yea_2.f);
            a2.J().J(yea_2.J());
            yea_22.J().J(yea_2.J().toString());
            return yea_22;
        }
        Yea_2 yea_23 = a2 = new CZ(yea_2.J(), new Object[uSa.E]);
        a2.J().J(yea_2.J());
        yea_23.J().J(yea_2.J().toString());
        return yea_23;
    }

    public boolean E() {
        Yea_2 a2;
        if (a2.J == false) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean J() {
        Yea_2 a2;
        if (a2.f != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(double d2, double d3, double d4, double d5) {
        Object object;
        void b2;
        int n2;
        double c2;
        int e22;
        void d6;
        Yea_2 yea_2 = this;
        int n3 = Oz.f((double)d6);
        if (BlockRailBase.l((Gg)yea_2.j, new XF(n3, (e22 = Oz.f((double)c2)) - vRa.d, n2 = Oz.f((double)b2)))) {
            --e22;
        }
        if (BlockRailBase.J((IBlockState)(object = yea_2.j.J(new XF(n3, e22, n2))))) {
            Yea_2 yea_22;
            void a2;
            IBlockState iBlockState = object;
            object = iBlockState.J(((BlockRailBase)iBlockState.J()).J());
            c2 = e22;
            if (((BlockRailBase$EnumRailDirection)((Object)object)).isAscending()) {
                c2 = e22 + vRa.d;
            }
            int[][] e22 = M[((BlockRailBase$EnumRailDirection)((Object)object)).getMetadata()];
            double d7 = e22[vRa.d][uSa.E] - e22[uSa.E][uSa.E];
            double d8 = e22[vRa.d][uqa.g] - e22[uSa.E][uqa.g];
            double d9 = d7;
            double d10 = d8;
            double d11 = Math.sqrt(d9 * d9 + d10 * d10);
            if (e22[uSa.E][vRa.d] != 0 && Oz.f((double)(d6 += (d7 /= d11) * a2)) - n3 == e22[uSa.E][uSa.E] && Oz.f((double)(b2 += (d8 /= d11) * a2)) - n2 == e22[uSa.E][uqa.g]) {
                c2 += (double)e22[uSa.E][vRa.d];
                yea_22 = yea_2;
            } else {
                if (e22[vRa.d][vRa.d] != 0 && Oz.f((double)d6) - n3 == e22[vRa.d][uSa.E] && Oz.f((double)b2) - n2 == e22[vRa.d][uqa.g]) {
                    c2 += (double)e22[vRa.d][vRa.d];
                }
                yea_22 = yea_2;
            }
            return yea_22.J((double)d6, c2, (double)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        float c2 = f2;
        Yea_2 a2 = this;
        if (!a2.j.e && a2.J == false) {
            void b2;
            if (a2.J((gZ)b2)) {
                return uSa.E != 0;
            }
            Yea_2 yea_2 = a2;
            yea_2.i(-yea_2.D());
            yea_2.A(NTa.C);
            yea_2.i();
            yea_2.l(yea_2.J() + c2 * FRa.Ga);
            int n2 = c2 = b2.f() instanceof Sx && ((Sx)b2.f()).h.f() ? vRa.d : uSa.E;
            if (c2 != 0 || a2.J() > ZRa.l) {
                if (a2.Aa != null) {
                    a2.Aa.l((vL)null);
                }
                if (c2 != 0 && !a2.J()) {
                    a2.k();
                } else {
                    a2.J((gZ)b2);
                }
            }
            return vRa.d != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        Object object = this;
        if (((Yea_2)object).y()) {
            a2.J(Zua.b, vRa.d != 0);
            IBlockState b2 = ((Yea_2)object).J();
            ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(b2.J());
            a2.J(EPa.o, resourceLocation == null ? Mqa.y : resourceLocation.toString());
            void v0 = a2;
            v0.J(uSa.x, b2.J().f(b2));
            v0.J(FRa.V, ((Yea_2)object).F());
        }
        if (((Yea_2)object).f != null && ((Yea_2)object).f.length() > 0) {
            a2.J(cRa.k, ((Yea_2)object).f);
        }
    }

    public abstract Rda J();

    public double e() {
        return Qqa.b;
    }

    public int F() {
        Yea_2 a2;
        if (!a2.y()) {
            return a2.k();
        }
        return a2.J().J(wOa.h);
    }

    public void d(double c2, double b2, double a2) {
        Yea_2 d2;
        Yea_2 yea_2 = d2;
        Yea_2 yea_22 = d2;
        yea_22.f(c2);
        yea_22.J(b2);
        d2.l(a2);
        d2.j = c2;
        yea_2.J = b2;
        yea_2.D = a2;
    }

    public int k() {
        return uua.p;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void h2;
        void c2;
        void d5;
        void e2;
        void f4;
        void g2;
        Yea_2 b2;
        int n3 = n2;
        Yea_2 yea_2 = b2 = this;
        Yea_2 yea_22 = b2;
        Yea_2 yea_23 = b2;
        yea_23.k = g2;
        yea_23.I = f4;
        yea_22.m = e2;
        yea_22.C = (double)d5;
        b2.E = (double)c2;
        yea_2.F = h2 + uqa.g;
        yea_2.f(b2.j);
        yea_2.J(yea_2.J);
        yea_2.l(yea_2.D);
    }

    public int G() {
        Yea_2 a2;
        return a2.aa.J(yta.Ka);
    }

    public xy f() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void l(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Yea_2 yea_2;
        Yea_2 yea_22 = yea_2 = this;
        Yea_2 yea_23 = yea_2;
        yea_2.la = c2;
        yea_23.Z = b2;
        yea_23.A = a2;
        int d5 = yea_22.F / kta.v;
        float f2 = yea_22.u;
        Yea_2 yea_24 = yea_2;
        yea_22.J(new xy((double)(c2 - (double)d5), (double)b2, (double)(a2 - (double)d5), (double)(c2 + (double)d5), (double)(b2 + (double)f2), (double)(a2 + (double)d5)));
    }

    public double d() {
        return aSa.V;
    }

    public void E() {
        Yea_2 a2;
        Yea_2 yea_2 = a2;
        double d2 = yea_2.e();
        yea_2.f(Oz.J((double)yea_2.i, (double)(-d2), (double)d2));
        yea_2.l(Oz.J((double)yea_2.f, (double)(-d2), (double)d2));
        if (yea_2.ha) {
            Yea_2 yea_22 = a2;
            yea_22.f(yea_22.i * kTa.B);
            yea_22.J(yea_22.Ea * kTa.B);
            yea_22.l((double)(yea_22.f * kTa.B));
        }
        Yea_2 yea_23 = a2;
        Yea_2 yea_24 = a2;
        yea_24.J(yea_23.i, yea_24.Ea, (double)a2.f);
        if (!yea_23.ha) {
            Yea_2 yea_25 = a2;
            yea_25.f(yea_25.i * Cra.A);
            yea_25.J(yea_25.Ea * Cra.A);
            yea_25.l((double)(yea_25.f * Cra.A));
        }
    }

    static {
        int[][][] nArrayArray = new int[NTa.C][][];
        int[][] nArrayArray2 = new int[uqa.g][];
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = uSa.E;
        nArray[uqa.g] = pua.o;
        nArrayArray2[uSa.E] = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = uSa.E;
        nArray2[vRa.d] = uSa.E;
        nArray2[uqa.g] = vRa.d;
        nArrayArray2[vRa.d] = nArray2;
        nArrayArray[uSa.E] = nArrayArray2;
        int[][] nArrayArray3 = new int[uqa.g][];
        int[] nArray3 = new int[yRa.d];
        nArray3[uSa.E] = pua.o;
        nArray3[vRa.d] = uSa.E;
        nArray3[uqa.g] = uSa.E;
        nArrayArray3[uSa.E] = nArray3;
        int[] nArray4 = new int[yRa.d];
        nArray4[uSa.E] = vRa.d;
        nArray4[vRa.d] = uSa.E;
        nArray4[uqa.g] = uSa.E;
        nArrayArray3[vRa.d] = nArray4;
        nArrayArray[vRa.d] = nArrayArray3;
        int[][] nArrayArray4 = new int[uqa.g][];
        int[] nArray5 = new int[yRa.d];
        nArray5[uSa.E] = pua.o;
        nArray5[vRa.d] = pua.o;
        nArray5[uqa.g] = uSa.E;
        nArrayArray4[uSa.E] = nArray5;
        int[] nArray6 = new int[yRa.d];
        nArray6[uSa.E] = vRa.d;
        nArray6[vRa.d] = uSa.E;
        nArray6[uqa.g] = uSa.E;
        nArrayArray4[vRa.d] = nArray6;
        nArrayArray[uqa.g] = nArrayArray4;
        int[][] nArrayArray5 = new int[uqa.g][];
        int[] nArray7 = new int[yRa.d];
        nArray7[uSa.E] = pua.o;
        nArray7[vRa.d] = uSa.E;
        nArray7[uqa.g] = uSa.E;
        nArrayArray5[uSa.E] = nArray7;
        int[] nArray8 = new int[yRa.d];
        nArray8[uSa.E] = vRa.d;
        nArray8[vRa.d] = pua.o;
        nArray8[uqa.g] = uSa.E;
        nArrayArray5[vRa.d] = nArray8;
        nArrayArray[yRa.d] = nArrayArray5;
        int[][] nArrayArray6 = new int[uqa.g][];
        int[] nArray9 = new int[yRa.d];
        nArray9[uSa.E] = uSa.E;
        nArray9[vRa.d] = uSa.E;
        nArray9[uqa.g] = pua.o;
        nArrayArray6[uSa.E] = nArray9;
        int[] nArray10 = new int[yRa.d];
        nArray10[uSa.E] = uSa.E;
        nArray10[vRa.d] = pua.o;
        nArray10[uqa.g] = vRa.d;
        nArrayArray6[vRa.d] = nArray10;
        nArrayArray[AQa.P] = nArrayArray6;
        int[][] nArrayArray7 = new int[uqa.g][];
        int[] nArray11 = new int[yRa.d];
        nArray11[uSa.E] = uSa.E;
        nArray11[vRa.d] = pua.o;
        nArray11[uqa.g] = pua.o;
        nArrayArray7[uSa.E] = nArray11;
        int[] nArray12 = new int[yRa.d];
        nArray12[uSa.E] = uSa.E;
        nArray12[vRa.d] = uSa.E;
        nArray12[uqa.g] = vRa.d;
        nArrayArray7[vRa.d] = nArray12;
        nArrayArray[tTa.h] = nArrayArray7;
        int[][] nArrayArray8 = new int[uqa.g][];
        int[] nArray13 = new int[yRa.d];
        nArray13[uSa.E] = uSa.E;
        nArray13[vRa.d] = uSa.E;
        nArray13[uqa.g] = vRa.d;
        nArrayArray8[uSa.E] = nArray13;
        int[] nArray14 = new int[yRa.d];
        nArray14[uSa.E] = vRa.d;
        nArray14[vRa.d] = uSa.E;
        nArray14[uqa.g] = uSa.E;
        nArrayArray8[vRa.d] = nArray14;
        nArrayArray[uua.p] = nArrayArray8;
        int[][] nArrayArray9 = new int[uqa.g][];
        int[] nArray15 = new int[yRa.d];
        nArray15[uSa.E] = uSa.E;
        nArray15[vRa.d] = uSa.E;
        nArray15[uqa.g] = vRa.d;
        nArrayArray9[uSa.E] = nArray15;
        int[] nArray16 = new int[yRa.d];
        nArray16[uSa.E] = pua.o;
        nArray16[vRa.d] = uSa.E;
        nArray16[uqa.g] = uSa.E;
        nArrayArray9[vRa.d] = nArray16;
        nArrayArray[XTa.W] = nArrayArray9;
        int[][] nArrayArray10 = new int[uqa.g][];
        int[] nArray17 = new int[yRa.d];
        nArray17[uSa.E] = uSa.E;
        nArray17[vRa.d] = uSa.E;
        nArray17[uqa.g] = pua.o;
        nArrayArray10[uSa.E] = nArray17;
        int[] nArray18 = new int[yRa.d];
        nArray18[uSa.E] = pua.o;
        nArray18[vRa.d] = uSa.E;
        nArray18[uqa.g] = uSa.E;
        nArrayArray10[vRa.d] = nArray18;
        nArrayArray[Yqa.i] = nArrayArray10;
        int[][] nArrayArray11 = new int[uqa.g][];
        int[] nArray19 = new int[yRa.d];
        nArray19[uSa.E] = uSa.E;
        nArray19[vRa.d] = uSa.E;
        nArray19[uqa.g] = pua.o;
        nArrayArray11[uSa.E] = nArray19;
        int[] nArray20 = new int[yRa.d];
        nArray20[uSa.E] = vRa.d;
        nArray20[vRa.d] = uSa.E;
        nArray20[uqa.g] = uSa.E;
        nArrayArray11[vRa.d] = nArray20;
        nArrayArray[WOa.fa] = nArrayArray11;
        M = nArrayArray;
    }

    public boolean y() {
        Yea_2 a2;
        if (a2.J().J(cQa.o) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Yea_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Yea_2 d5;
        Yea_2 e2 = gg2;
        Yea_2 yea_2 = d5 = this;
        Yea_2 yea_22 = d5;
        Yea_2 yea_23 = d5;
        yea_23((Gg)e2);
        yea_23.l((double)c2, (double)b2, (double)a2);
        yea_22.f(aSa.V);
        yea_22.J(aSa.V);
        d5.l(aSa.V);
        d5.c = c2;
        yea_2.ba = b2;
        yea_2.r = a2;
    }

    public void k() {
        Yea_2 a2;
        super.k();
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, IBlockState iBlockState) {
        Yea_2 yea_2;
        Yea_2 yea_22;
        double d2;
        double d3;
        double d4;
        double d5;
        BlockRailBase$EnumRailDirection a2;
        void b2;
        Yea_2 yea_23 = this;
        yea_23.O = JPa.N;
        Yea_2 yea_24 = yea_23;
        Lz lz2 = yea_24.J(yea_23.la, yea_24.Z, yea_23.A);
        yea_23.Z = b2.getY();
        int n2 = uSa.E;
        int n3 = uSa.E;
        Object c2 = (BlockRailBase)a2.J();
        if (c2 == QFa.JC) {
            boolean bl = a2.J(BlockRailPowered.POWERED);
            n2 = bl ? 1 : 0;
            n3 = !bl ? vRa.d : uSa.E;
        }
        a2 = a2.J(((BlockRailBase)c2).J());
        switch (Uea.I[a2.ordinal()]) {
            case 1: {
                Yea_2 yea_25 = yea_23;
                while (false) {
                }
                yea_25.f(yea_25.i - pua.t);
                yea_25.Z += oua.i;
                break;
            }
            case 2: {
                Yea_2 yea_26 = yea_23;
                yea_26.f(yea_26.i + pua.t);
                yea_26.Z += oua.i;
                break;
            }
            case 3: {
                Yea_2 yea_27 = yea_23;
                yea_27.l((double)(yea_27.f + pua.t));
                yea_27.Z += oua.i;
                break;
            }
            case 4: {
                Yea_2 yea_28 = yea_23;
                yea_28.l((double)(yea_28.f - pua.t));
                yea_28.Z += oua.i;
            }
        }
        Object object = c2 = (Object)M[a2.getMetadata()];
        double d6 = (double)(c2[vRa.d][uSa.E] - object[uSa.E][uSa.E]);
        double d7 = (double)(object[vRa.d][uqa.g] - c2[uSa.E][uqa.g]);
        double d8 = d6;
        double d9 = d7;
        double d10 = Math.sqrt(d8 * d8 + d9 * d9);
        if (yea_23.i * d6 + yea_23.f * d7 < aSa.V) {
            d6 = -d6;
            d7 = -d7;
        }
        double d11 = Math.sqrt(yea_23.i * yea_23.i + yea_23.f * yea_23.f);
        if (d5 > KPa.y) {
            d11 = KPa.y;
        }
        Yea_2 yea_29 = yea_23;
        yea_29.f(d11 * d6 / d10);
        yea_29.l(d11 * d7 / d10);
        if (yea_23.Aa instanceof Gl) {
            double d12;
            d10 = ((Gl)yea_23.Aa).ia;
            if (d12 > aSa.V) {
                double d13;
                Yea_2 yea_210 = yea_23;
                d4 = -Math.sin(yea_210.Aa.X * pua.j / Hra.Ga);
                d3 = Math.cos(yea_210.Aa.X * pua.j / Hra.Ga);
                d2 = yea_210.i * yea_23.i + yea_23.f * yea_23.f;
                if (d13 < SPa.x) {
                    Yea_2 yea_211 = yea_23;
                    yea_211.f(yea_211.i + d4 * tpa.k);
                    yea_211.l((double)(yea_211.f + d3 * tpa.k));
                    n3 = uSa.E;
                }
            }
        }
        if (n3 != 0) {
            double d14;
            d10 = Math.sqrt(yea_23.i * yea_23.i + yea_23.f * yea_23.f);
            Yea_2 yea_212 = yea_23;
            if (d14 < mPa.ia) {
                yea_212.f(yea_23.i * aSa.V);
                Yea_2 yea_213 = yea_23;
                yea_213.J(yea_213.Ea * aSa.V);
                yea_213.l((double)(yea_213.f * aSa.V));
            } else {
                yea_212.f(yea_23.i * kTa.B);
                Yea_2 yea_214 = yea_23;
                yea_214.J(yea_214.Ea * aSa.V);
                yea_214.l((double)(yea_214.f * kTa.B));
            }
        }
        d10 = aSa.V;
        void v19 = b2;
        d4 = (double)v19.getX() + kTa.B + (double)c2[uSa.E][uSa.E] * kTa.B;
        d3 = (double)v19.getZ() + kTa.B + (double)c2[uSa.E][uqa.g] * kTa.B;
        d2 = (double)v19.getX() + kTa.B + (double)c2[vRa.d][uSa.E] * kTa.B;
        double d15 = (double)v19.getZ() + kTa.B + (double)c2[vRa.d][uqa.g] * kTa.B;
        d6 = d2 - d4;
        d7 = d15 - d3;
        if (d6 == aSa.V) {
            Yea_2 yea_215 = yea_23;
            yea_22 = yea_215;
            yea_215.la = (double)b2.getX() + kTa.B;
            d10 = yea_215.A - (double)b2.getZ();
        } else if (d7 == aSa.V) {
            yea_23.A = (double)b2.getZ() + kTa.B;
            Yea_2 yea_216 = yea_23;
            yea_22 = yea_216;
            d10 = yea_216.la - (double)b2.getX();
        } else {
            d2 = yea_23.la - d4;
            Yea_2 yea_217 = yea_23;
            yea_22 = yea_217;
            d15 = yea_217.A - d3;
            d10 = (d2 * d6 + d15 * d7) * KPa.y;
        }
        yea_22.la = d4 + d6 * d10;
        Yea_2 yea_218 = yea_23;
        yea_218.A = d3 + d7 * d10;
        Yea_2 yea_219 = yea_23;
        yea_219.l(yea_218.la, yea_219.Z, yea_23.A);
        d2 = yea_218.i;
        d15 = (double)yea_218.f;
        if (yea_218.Aa != null) {
            d2 *= Bsa.x;
            d15 *= Bsa.x;
        }
        Yea_2 yea_220 = yea_23;
        d6 = yea_220.e();
        d2 = Oz.J((double)d2, (double)(-d6), (double)d6);
        d15 = Oz.J((double)d15, (double)(-d6), (double)d6);
        yea_220.J(d2, aSa.V, d15);
        if (c2[uSa.E][vRa.d] != false && Oz.f((double)yea_23.la) - b2.getX() == c2[uSa.E][uSa.E] && Oz.f((double)yea_23.A) - b2.getZ() == c2[uSa.E][uqa.g]) {
            Yea_2 yea_221 = yea_23;
            yea_2 = yea_221;
            Yea_2 yea_222 = yea_23;
            yea_222.l(yea_221.la, yea_222.Z + (double)c2[uSa.E][vRa.d], yea_23.A);
        } else {
            if (c2[vRa.d][vRa.d] != false && Oz.f((double)yea_23.la) - b2.getX() == c2[vRa.d][uSa.E] && Oz.f((double)yea_23.A) - b2.getZ() == c2[vRa.d][uqa.g]) {
                Yea_2 yea_223 = yea_23;
                yea_223.l(yea_23.la, yea_223.Z + (double)c2[vRa.d][vRa.d], yea_23.A);
            }
            yea_2 = yea_23;
        }
        yea_2.A();
        Yea_2 yea_224 = yea_23;
        Lz lz3 = yea_224.J(yea_23.la, yea_224.Z, yea_23.A);
        if (lz3 != null && lz2 != null) {
            double d16;
            d6 = (lz2.j - lz3.j) * fPa.ca;
            d11 = Math.sqrt(yea_23.i * yea_23.i + yea_23.f * yea_23.f);
            if (d16 > aSa.V) {
                Yea_2 yea_225 = yea_23;
                yea_225.f(yea_225.i / d11 * (d11 + d6));
                yea_225.l((double)(yea_225.f / d11 * (d11 + d6)));
            }
            Yea_2 yea_226 = yea_23;
            yea_226.l(yea_226.la, lz3.j, yea_23.A);
        }
        Yea_2 yea_227 = yea_23;
        int n4 = Oz.f((double)yea_227.la);
        int n5 = Oz.f((double)yea_227.A);
        if (n4 != b2.getX() || n5 != b2.getZ()) {
            Yea_2 yea_228 = yea_23;
            Yea_2 yea_229 = yea_23;
            d11 = Math.sqrt(yea_228.i * yea_229.i + yea_23.f * yea_23.f);
            yea_229.f(d11 * (double)(n4 - b2.getX()));
            yea_228.l(d11 * (double)(n5 - b2.getZ()));
        }
        if (n2 != 0) {
            double d17;
            double d18 = Math.sqrt(yea_23.i * yea_23.i + yea_23.f * yea_23.f);
            if (d17 > SPa.x) {
                d7 = kpa.z;
                Yea_2 yea_230 = yea_23;
                Yea_2 yea_231 = yea_23;
                yea_231.f(yea_230.i + yea_231.i / d18 * d7);
                yea_230.l((double)(yea_230.f + yea_23.f / d18 * d7));
                return;
            }
            if (a2 == BlockRailBase$EnumRailDirection.EAST_WEST) {
                Yea_2 yea_232 = yea_23;
                if (yea_23.j.J(b2.west()).J().A()) {
                    yea_232.f(GPa.g);
                    return;
                }
                if (yea_232.j.J(b2.east()).J().A()) {
                    yea_23.f(Eqa.I);
                    return;
                }
            } else if (a2 == BlockRailBase$EnumRailDirection.NORTH_SOUTH) {
                Yea_2 yea_233 = yea_23;
                if (yea_23.j.J(b2.north()).J().A()) {
                    yea_233.l(GPa.g);
                    return;
                }
                if (yea_233.j.J(b2.south()).J().A()) {
                    yea_23.l(Eqa.I);
                }
            }
        }
    }

    @Override
    public String J() {
        Yea_2 a2;
        if (a2.f != null) {
            return a2.f;
        }
        return super.J();
    }

    public Yea_2(Gg gg2) {
        Yea_2 a2;
        Yea_2 b2 = gg2;
        Yea_2 yea_2 = a2 = this;
        super((Gg)b2);
        yea_2.h = vRa.d;
        yea_2.l(MQa.d, ZSa.q);
    }

    public void A() {
        Yea_2 a2;
        if (a2.Aa != null) {
            Yea_2 yea_2 = a2;
            yea_2.f(yea_2.i * Nta.Ia);
            yea_2.J(yea_2.Ea * aSa.V);
            yea_2.l((double)(yea_2.f * Nta.Ia));
            return;
        }
        Yea_2 yea_2 = a2;
        yea_2.f(yea_2.i * DPa.r);
        yea_2.J(yea_2.Ea * aSa.V);
        yea_2.l((double)(yea_2.f * DPa.r));
    }

    public void J(IBlockState iBlockState) {
        Yea_2 a2;
        IBlockState b2 = iBlockState;
        Yea_2 yea_2 = a2 = this;
        yea_2.J().J(kTa.j, Integer.valueOf(Block.l(b2)));
        yea_2.A(vRa.d != 0);
    }

    public String e() {
        Yea_2 a2;
        return a2.f;
    }

    public void A(int n2) {
        int b2 = n2;
        Yea_2 a2 = this;
        a2.aa.J(yta.Ka, Integer.valueOf(b2));
    }

    public void G() {
        Yea_2 a2;
        Yea_2 yea_2 = a2;
        yea_2.i(-yea_2.D());
        yea_2.A(NTa.C);
        yea_2.l(yea_2.J() + a2.J() * FRa.Ga);
    }

    public int D() {
        Yea_2 a2;
        return a2.aa.J(yOa.B);
    }

    public void d() {
        Yea_2 yea_2;
        Yea_2 a2;
        block25: {
            Yea_2 yea_22;
            block28: {
                block27: {
                    block26: {
                        XF xF2;
                        IBlockState iBlockState;
                        int n2;
                        int n3;
                        block24: {
                            block20: {
                                Yea_2 yea_23;
                                block23: {
                                    block22: {
                                        block21: {
                                            if (a2.G() > 0) {
                                                Yea_2 yea_24 = a2;
                                                yea_24.A(yea_24.G() - vRa.d);
                                            }
                                            if (a2.J() > JPa.N) {
                                                Yea_2 yea_25 = a2;
                                                yea_25.l(yea_25.J() - pqa.r);
                                            }
                                            if (a2.Z < Tpa.D) {
                                                a2.B();
                                            }
                                            if (a2.j.e || !(a2.j instanceof Tf)) break block20;
                                            Yea_2 yea_26 = a2;
                                            yea_26.j.H.J(SQa.Q);
                                            OCa oCa2 = ((Tf)yea_26.j).J();
                                            Yea_2 yea_27 = a2;
                                            n3 = yea_27.d();
                                            if (!yea_27.Q) break block21;
                                            if (!oCa2.H()) break block22;
                                            if (a2.ja == null) {
                                                int n4 = a2.Y;
                                                a2.Y = n4 + vRa.d;
                                                if (n4 >= n3) {
                                                    Yea_2 yea_28;
                                                    Yea_2 yea_29 = a2;
                                                    yea_29.Y = n3;
                                                    yea_29.U = yea_29.C();
                                                    if (yea_29.j.F.J() == pua.o) {
                                                        n2 = uSa.E;
                                                        yea_28 = a2;
                                                    } else {
                                                        n2 = pua.o;
                                                        yea_28 = a2;
                                                    }
                                                    yea_28.f(n2);
                                                }
                                            }
                                            yea_23 = a2;
                                            a2.Q = uSa.E;
                                            break block23;
                                        }
                                        if (a2.Y > 0) {
                                            a2.Y -= AQa.P;
                                        }
                                        if (a2.Y < 0) {
                                            a2.Y = uSa.E;
                                        }
                                    }
                                    yea_23 = a2;
                                }
                                if (yea_23.U > 0) {
                                    a2.U -= vRa.d;
                                }
                                a2.j.H.f();
                            }
                            if (!a2.j.e) break block24;
                            Yea_2 yea_210 = a2;
                            if (a2.F > 0) {
                                double d2 = yea_210.la + (a2.k - a2.la) / (double)a2.F;
                                Yea_2 yea_211 = a2;
                                yea_2 = yea_211;
                                double d3 = yea_211.Z + (a2.I - a2.Z) / (double)a2.F;
                                Yea_2 yea_212 = a2;
                                double d4 = yea_211.A + (yea_212.m - a2.A) / (double)a2.F;
                                double d5 = Oz.J((double)(yea_212.C - (double)a2.X));
                                yea_211.X = (float)((double)yea_211.X + d5 / (double)a2.F);
                                yea_211.d = (float)((double)yea_211.d + (a2.E - (double)a2.d) / (double)a2.F);
                                yea_211.F -= vRa.d;
                                yea_211.l(d2, d3, d4);
                                yea_211.C(yea_211.X, a2.d);
                            } else {
                                yea_210.l(a2.la, a2.Z, a2.A);
                                Yea_2 yea_213 = a2;
                                Yea_2 yea_214 = a2;
                                yea_2 = yea_214;
                                yea_213.C(yea_213.X, yea_214.d);
                            }
                            break block25;
                        }
                        Yea_2 yea_215 = a2;
                        yea_215.c = yea_215.la;
                        yea_215.ba = yea_215.Z;
                        yea_215.r = yea_215.A;
                        yea_215.J(yea_215.Ea - Tpa.fa);
                        int n5 = Oz.f((double)yea_215.la);
                        n3 = Oz.f((double)yea_215.Z);
                        n2 = Oz.f((double)yea_215.A);
                        if (BlockRailBase.l((Gg)yea_215.j, new XF(n5, n3 - vRa.d, n2))) {
                            --n3;
                        }
                        if (!BlockRailBase.J(iBlockState = a2.j.J(xF2 = new XF(n5, n3, n2)))) break block26;
                        IBlockState iBlockState2 = iBlockState;
                        a2.J(xF2, iBlockState2);
                        if (iBlockState2.J() != QFa.gc) break block27;
                        a2.J(n5, n3, n2, iBlockState.J(BlockRailPowered.POWERED));
                        yea_22 = a2;
                        break block28;
                    }
                    a2.E();
                }
                yea_22 = a2;
            }
            yea_22.c();
            a2.d = JPa.N;
            Yea_2 yea_216 = a2;
            double d6 = a2.c - yea_216.la;
            double d7 = yea_216.r - a2.A;
            double d8 = d6;
            double d9 = d7;
            if (d8 * d8 + d9 * d9 > DPa.Ia) {
                a2.X = (float)(Oz.f((double)d7, (double)d6) * kta.Da / lQa.f);
                if (a2.G) {
                    a2.X += Hra.Ga;
                }
            }
            Yea_2 yea_217 = a2;
            double d10 = Oz.f((float)(yea_217.X - yea_217.s));
            if (d10 < mra.j || d10 >= PTa.Aa) {
                Yea_2 yea_218 = a2;
                yea_218.X += Hra.Ga;
                yea_218.G = !yea_218.G ? vRa.d : uSa.E;
            }
            Yea_2 yea_219 = a2;
            Yea_2 yea_220 = a2;
            yea_220.C(yea_219.X, yea_220.d);
            Yea_2 yea_221 = a2;
            for (vL vL2 : yea_219.j.f((vL)yea_221, yea_221.J().f(Bua.Ia, aSa.V, Bua.Ia))) {
                if (vL2 == a2.Aa || !vL2.z() || !(vL2 instanceof Yea_2)) continue;
                vL2.J((vL)a2);
            }
            if (a2.Aa != null && a2.Aa.J) {
                if (a2.Aa.ja == a2) {
                    a2.Aa.ja = null;
                }
                a2.Aa = null;
            }
            Yea_2 yea_222 = a2;
            yea_2 = yea_222;
            yea_222.d();
        }
        pP pP2 = Ni.J(yea_2);
        if (pP2 != null) {
            pP2.J((vL)a2);
        }
    }

    public void J(int n2, int n3, int n4, boolean bl) {
        boolean bl2 = bl;
        Yea_2 a2 = this;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Waa var1_1) {
        block5: {
            block6: {
                b = var1_1;
                a = this;
                if (!b.f(Zua.b)) break block5;
                v0 = b;
                var2_2 = v0.J(uSa.x);
                if (!v0.J(EPa.o, Yqa.i)) break block6;
                var3_3 = Block.J(b.J(EPa.o));
                if (var3_3 == null) {
                    a.J(QFa.HF.J());
                } else {
                    a.J(var3_3.J(var2_2));
                }
                ** GOTO lbl21
            }
            var3_4 = Block.f(b.J(EPa.o));
            v1 = a;
            if (var3_4 == null) {
                v1.J(QFa.HF.J());
                v2 = a;
            } else {
                v1.J(var3_4.J(var2_2));
lbl21:
                // 3 sources

                v2 = a;
            }
            v2.M(b.J(FRa.V));
        }
        if (b.J(cRa.k, Yqa.i) && b.J(cRa.k).length() > 0) {
            a.f = b.J(cRa.k);
        }
    }

    public void i(int n2) {
        int b2 = n2;
        Yea_2 a2 = this;
        a2.aa.J(yOa.B, Integer.valueOf(b2));
    }

    public void M(int n2) {
        Yea_2 a2;
        int b2 = n2;
        Yea_2 yea_2 = a2 = this;
        yea_2.J().J(wOa.h, Integer.valueOf(b2));
        yea_2.A(vRa.d != 0);
    }

    public boolean z() {
        return vRa.d != 0;
    }

    public void J(gZ gZ2) {
        Yea_2 a2;
        Yea_2 b2 = gZ2;
        Yea_2 yea_2 = a2 = this;
        yea_2.k();
        if (yea_2.j.J().f(qQa.y)) {
            b2 = new Mda(Gea.T, vRa.d);
            if (a2.f != null) {
                b2.J(a2.f);
            }
            a2.J((Mda)b2, JPa.N);
        }
    }

    public void l(float f2) {
        float b2 = f2;
        Yea_2 a2 = this;
        a2.aa.J(wOa.t, Float.valueOf(b2));
    }

    public IBlockState f() {
        return QFa.HF.J();
    }

    public void J(vL vL2) {
        Yea_2 b2 = vL2;
        Yea_2 a2 = this;
        if (!(a2.j.e || b2.Ma || a2.Ma || b2 == a2.Aa)) {
            double d2;
            if (b2 instanceof Gl && !(b2 instanceof Sx) && !(b2 instanceof DDa) && a2.J() == Rda.RIDEABLE && a2.i * a2.i + a2.f * a2.f > SPa.x && a2.Aa == null && b2.ja == null) {
                b2.l(a2);
            }
            Yea_2 yea_2 = b2;
            double d3 = yea_2.la - a2.la;
            double d4 = yea_2.A - a2.A;
            double d5 = d3;
            double d6 = d4;
            double d7 = d5 * d5 + d6 * d6;
            if (d2 >= XOa.R) {
                double d8;
                d7 = Oz.J((double)d7);
                d3 /= d7;
                d4 /= d7;
                d7 = oua.i / d7;
                if (d8 > oua.i) {
                    d7 = oua.i;
                }
                d3 *= d7;
                d4 *= d7;
                d3 *= Tqa.Ia;
                d4 *= Tqa.Ia;
                d3 *= (double)(pqa.r - a2.Da);
                d4 *= (double)(pqa.r - a2.Da);
                d3 *= kTa.B;
                d4 *= kTa.B;
                if (b2 instanceof Yea_2) {
                    Lz lz2;
                    Yea_2 yea_22 = b2;
                    d7 = yea_22.la - a2.la;
                    double d9 = yea_22.A - a2.A;
                    Lz lz3 = new Lz(d7, aSa.V, d9).J();
                    if (Math.abs(lz3.f(lz2 = new Lz((double)Oz.C((float)(a2.X * pua.j / Hra.Ga)), aSa.V, (double)Oz.d((float)(a2.X * pua.j / Hra.Ga))).J())) < GPa.fa) {
                        return;
                    }
                    Yea_2 yea_23 = b2;
                    d7 = yea_23.i + a2.i;
                    d9 = ((vL)yea_23).f + a2.f;
                    if (yea_23.J() == Rda.FURNACE && a2.J() != Rda.FURNACE) {
                        Yea_2 yea_24 = b2;
                        Yea_2 yea_25 = a2;
                        yea_25.f(yea_25.i * Bua.Ia);
                        yea_25.l((double)(yea_25.f * Bua.Ia));
                        a2.f(yea_24.i - d3, aSa.V, ((vL)b2).f - d4);
                        Yea_2 yea_26 = b2;
                        yea_26.f(yea_26.i * Cra.A);
                        yea_24.l(((vL)yea_24).f * Cra.A);
                        return;
                    }
                    if (b2.J() != Rda.FURNACE && a2.J() == Rda.FURNACE) {
                        Yea_2 yea_27 = a2;
                        Yea_2 yea_28 = b2;
                        yea_28.f(yea_28.i * Bua.Ia);
                        yea_28.l(((vL)yea_28).f * Bua.Ia);
                        b2.f(yea_27.i + d3, aSa.V, (double)(a2.f + d4));
                        Yea_2 yea_29 = a2;
                        yea_29.f(yea_29.i * Cra.A);
                        yea_27.l((double)(yea_27.f * Cra.A));
                        return;
                    }
                    Yea_2 yea_210 = a2;
                    Yea_2 yea_211 = a2;
                    yea_211.f(yea_211.i * Bua.Ia);
                    yea_210.l((double)(yea_211.f * Bua.Ia));
                    yea_210.f((d7 /= KPa.y) - d3, aSa.V, (d9 /= KPa.y) - d4);
                    Yea_2 yea_212 = b2;
                    yea_212.f(b2.i * Bua.Ia);
                    b2.l(((vL)yea_212).f * Bua.Ia);
                    yea_212.f(d7 + d3, aSa.V, d9 + d4);
                    return;
                }
                a2.f(-d3, aSa.V, -d4);
                b2.f(d3 / FPa.T, aSa.V, d4 / FPa.T);
            }
        }
    }

    public void A(boolean bl) {
        boolean b2 = bl;
        Yea_2 a2 = this;
        a2.J().J(cQa.o, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void J() {
        Yea_2 a2;
        Yea_2 yea_2 = a2;
        yea_2.aa.f(yta.Ka, new Integer(uSa.E));
        yea_2.aa.f(yOa.B, new Integer(vRa.d));
        yea_2.aa.f(wOa.t, new Float(JPa.N));
        yea_2.aa.f(kTa.j, new Integer(uSa.E));
        yea_2.aa.f(wOa.h, new Integer(uua.p));
        yea_2.aa.f(cQa.o, (byte)uSa.E);
    }

    public IBlockState J() {
        Yea_2 a2;
        if (!a2.y()) {
            return a2.f();
        }
        return Block.f(a2.J().J(kTa.j));
    }

    public float J() {
        Yea_2 a2;
        return a2.aa.J(wOa.t);
    }

    public xy J(vL vL2) {
        Yea_2 b2 = vL2;
        Yea_2 a2 = this;
        if (b2.z()) {
            return b2.J();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Yea J(Gg gg2, double d2, double d3, double d4, Rda rda2) {
        void b2;
        void c2;
        void d5;
        Gg e2;
        Gg gg3 = gg2;
        gg2 = rda2;
        Gg a2 = gg3;
        switch (Uea.A[e2.ordinal()]) {
            case 1: {
                return new EDa(a2, (double)d5, (double)c2, (double)b2);
            }
            case 2: {
                return new yda(a2, (double)d5, (double)c2, (double)b2);
            }
            case 3: {
                return new Cga(a2, (double)d5, (double)c2, (double)b2);
            }
            case 4: {
                return new rEa(a2, (double)d5, (double)c2, (double)b2);
            }
            case 5: {
                return new Cfa(a2, (double)d5, (double)c2, (double)b2);
            }
            case 6: {
                return new RGa(a2, (double)d5, (double)c2, (double)b2);
            }
        }
        return new ZEa(a2, (double)d5, (double)c2, (double)b2);
    }
}

