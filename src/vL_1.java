/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Bsa
 *  CY
 *  DX
 *  Dha
 *  EH
 *  Ey
 *  FPa
 *  Gg
 *  Gl
 *  Hfa
 *  ISa
 *  Iha
 *  JPa
 *  JTa
 *  KTa
 *  Lqa
 *  Lz
 *  MQa
 *  MZ
 *  Mda
 *  NCa
 *  NTa
 *  OCa
 *  OU
 *  Oz
 *  PIa
 *  QFa
 *  QS
 *  QSa
 *  RIa
 *  Rha
 *  SOa
 *  SQa
 *  SRa
 *  Sqa
 *  Ssa
 *  TAa
 *  Tf
 *  Tpa
 *  URa
 *  UZ
 *  WSa
 *  Waa
 *  XSa
 *  XTa
 *  Xha
 *  YSa
 *  Ypa
 *  ZOa
 *  Zpa
 *  aSa
 *  bFa
 *  bRa
 *  bqa
 *  bua
 *  cEa
 *  cRa
 *  eAa
 *  fpa
 *  gZ
 *  hra
 *  hy
 *  iPa
 *  isa
 *  jFa
 *  jHa
 *  jpa
 *  kGa
 *  kPa
 *  kpa
 *  kta
 *  ld
 *  nQa
 *  pEa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  qha
 *  rAa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  via
 *  vpa
 *  wPa
 *  waa
 *  xy
 *  yra
 */
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern$PatternHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class vL_1
implements u {
    private boolean ka;
    public boolean da;
    public int Ba;
    public hga aa;
    public static final int ea = 30;
    public double Ea;
    public double Ca;
    public XF ia;
    public boolean Ma;
    public double ba;
    public boolean ha;
    public int Fa;
    public boolean Ia;
    public double la;
    public boolean ga;
    public float Da;
    public boolean ca;
    public boolean Ja;
    public vL ja;
    public int Ha;
    public double Ga;
    public int fa;
    public float Ka;
    public vL Aa;
    private final via S;
    public double Z;
    public int Y;
    public double r;
    public double V;
    public boolean z;
    public float X;
    public final OU y;
    public int U;
    private boolean P;
    public float u;
    public float O;
    public boolean t;
    public Random R;
    public boolean Q;
    public int N;
    public boolean T;
    private double p;
    public double n;
    public float s;
    public UUID w;
    public float W;
    public Lz q;
    public DZ x;
    private int v;
    public float o;
    public boolean h;
    private static final xy K = new xy(aSa.V, aSa.V, aSa.V, aSa.V, aSa.V, aSa.V);
    public boolean H;
    public double c;
    private int B;
    public float d;
    public boolean a;
    public int b;
    public int l;
    public float e;
    private int G;
    public boolean D;
    public double f;
    public float F;
    public int g;
    public int L;
    private xy E;
    private double m;
    private static int C;
    public double i;
    public float M;
    public boolean k;
    public Gg j;
    public boolean J;
    public double A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public jFa J(eAa eAa2, int n2) {
        void b2;
        int c2 = n2;
        vL_1 a2 = this;
        return a2.J((eAa)b2, c2, JPa.N);
    }

    public void i(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.J(vRa.d, b2);
    }

    public double f(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        c2 = vL_12.la - c2;
        b2 = vL_12.Z - b2;
        a2 = vL_12.A - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public boolean u() {
        return vRa.d != 0;
    }

    public void J(String string) {
        String b2 = string;
        vL_1 a2 = this;
        a2.aa.J(uqa.g, b2);
    }

    public void J(xy xy2) {
        vL_1 b2 = xy2;
        vL_1 a2 = this;
        a2.E = b2;
    }

    public boolean J(gZ gZ2) {
        vL_1 b2 = gZ2;
        vL_1 a2 = this;
        if (a2.P && b2 != gZ.c && !b2.i()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean q() {
        vL_1 a2;
        return a2.J(vRa.d);
    }

    public final Lz J(float f2, float f3) {
        float b2;
        float c2 = f3;
        vL_1 a2 = this;
        float f4 = Oz.C((float)(-c2 * Bua.ga - pua.j));
        c2 = Oz.d((float)(-c2 * Bua.ga - pua.j));
        float f5 = -Oz.C((float)(-b2 * Bua.ga));
        b2 = Oz.d((float)(-b2 * Bua.ga));
        return new Lz((double)(c2 * f5), (double)b2, (double)(f4 * f5));
    }

    public void l(double a2) {
        b.f = a2;
    }

    public boolean l(Sx sx2) {
        Object b2 = sx2;
        vL_1 a2 = this;
        return uSa.E != 0;
    }

    public void K() {
        vL_1 a2;
        if (!a2.z) {
            a2.J(gZ.I, YSa.G);
            a2.J(Ypa.A);
        }
    }

    public void c() {
        vL_1 vL_12 = this;
        XF xF2 = new XF(vL_12.J().J + DPa.Ia, vL_12.J().j + DPa.Ia, vL_12.J().I + DPa.Ia);
        Object a2 = new XF(vL_12.J().A - DPa.Ia, vL_12.J().M - DPa.Ia, vL_12.J().k - DPa.Ia);
        if (vL_12.j.J(xF2, (XF)((Object)a2))) {
            int n2;
            int n3 = n2 = xF2.getX();
            while (n3 <= a2.getX()) {
                int n4 = xF2.getY();
                while (n4 <= a2.getY()) {
                    int n5;
                    int n6 = xF2.getZ();
                    while (n6 <= a2.getZ()) {
                        int n7;
                        XF xF3 = new XF(n2, n5, n7);
                        IBlockState iBlockState = vL_12.j.J(xF3);
                        try {
                            iBlockState.J().J(vL_12.j, xF3, iBlockState, (vL)vL_12);
                        }
                        catch (Throwable throwable) {
                            RIa rIa2 = RIa.J((Throwable)throwable, (String)KTa.o);
                            Dha.J((Dha)rIa2.J(iPa.Aa), (XF)xF3, (IBlockState)iBlockState);
                            throw new MZ(rIa2);
                        }
                        n6 = ++n7;
                    }
                    n4 = ++n5;
                }
                n3 = ++n2;
            }
        }
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    public boolean z() {
        return uSa.E != 0;
    }

    public int J(float f2) {
        float b22 = f2;
        vL_1 a2 = this;
        XF b22 = new XF(a2.la, a2.Z + (double)a2.l(), a2.A);
        if (a2.j.F(b22)) {
            return a2.j.J(b22, uSa.E);
        }
        return uSa.E;
    }

    public boolean o() {
        int a2;
        vL_1 vL_12 = this;
        int n2 = a2 = vL_12.j != null && vL_12.j.e ? vRa.d : uSa.E;
        if (!vL_12.z && (vL_12.B > 0 || a2 != 0 && vL_12.J(uSa.E))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean h() {
        int n2;
        vL_1 vL_12 = this;
        if (vL_12.Ma) {
            return uSa.E != 0;
        }
        zz a2 = new zz(ypa.L, ypa.L, ypa.L);
        int n3 = n2 = uSa.E;
        while (n3 < Yqa.i) {
            vL_1 vL_13 = vL_12;
            vL_1 vL_14 = vL_12;
            int n4 = Oz.f((double)(vL_13.Z + (double)(((float)((n2 >> uSa.E) % uqa.g) - MQa.L) * Nra.e) + (double)vL_14.l()));
            int n5 = Oz.f((double)(vL_14.la + (double)(((float)((n2 >> vRa.d) % uqa.g) - MQa.L) * vL_12.F * xSa.la)));
            int n6 = Oz.f((double)(vL_13.A + (double)(((float)((n2 >> uqa.g) % uqa.g) - MQa.L) * vL_12.F * xSa.la)));
            if (a2.getX() != n5 || a2.getY() != n4 || a2.getZ() != n6) {
                a2.func_181079_c(n5, n4, n6);
                if (vL_12.j.J((XF)a2).J().e()) {
                    return vRa.d != 0;
                }
            }
            n3 = ++n2;
        }
        return uSa.E != 0;
    }

    public void B() {
        vL_1 a2;
        a2.k();
    }

    public void J(vL vL2, int n2) {
        int c2 = n2;
        vL_1 vL_12 = this;
    }

    public void J(byte by2) {
        byte b2 = by2;
        vL_1 vL_12 = this;
    }

    public boolean m() {
        return vRa.d != 0;
    }

    @Override
    public String J() {
        Object object = this;
        if (((vL_1)object).J()) {
            return ((vL_1)object).e();
        }
        Object a2 = PIa.J((vL)object);
        if (a2 == null) {
            a2 = kra.Fa;
        }
        return Ey.f((String)new StringBuilder().insert(3 & 4, Lqa.H).append((String)a2).append(tpa.N).toString());
    }

    /*
     * WARNING - void declaration
     */
    public void C(float f2, float f3) {
        void b2;
        vL_1 a2;
        float c2 = f3;
        vL_1 vL_12 = a2 = this;
        vL_12.X = b2 % CRa.ja;
        vL_12.d = c2 % CRa.ja;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Waa waa2) {
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        String b2 = vL_13.C();
        if (!vL_13.J && b2 != null) {
            void a2;
            void v1 = a2;
            v1.J(QTa.O, b2);
            vL_12.C((Waa)v1);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double f(XF xF2) {
        Object b2 = xF2;
        vL_1 a2 = this;
        return b2.distanceSqToCenter(a2.la, a2.Z, a2.A);
    }

    public void d(Waa object) {
        vL_1 b2 = object;
        object = this;
    }

    public boolean E() {
        return uSa.E != 0;
    }

    public void L() {
        vL_1 vL_12;
        vL_1 vL_13;
        block17: {
            block18: {
                block19: {
                    block16: {
                        block12: {
                            vL_1 vL_14;
                            block15: {
                                block14: {
                                    block13: {
                                        vL_1 vL_15 = vL_13 = this;
                                        vL_15.j.H.J(bsa.w);
                                        if (vL_15.ja != null && vL_13.ja.J) {
                                            vL_13.ja = null;
                                        }
                                        vL_1 vL_16 = vL_13;
                                        vL_16.M = vL_16.e;
                                        vL_16.c = vL_16.la;
                                        vL_16.ba = vL_16.Z;
                                        vL_16.r = vL_16.A;
                                        vL_16.o = vL_16.d;
                                        vL_16.s = vL_16.X;
                                        if (vL_16.j.e || !(vL_13.j instanceof Tf)) break block12;
                                        vL_1 vL_17 = vL_13;
                                        vL_17.j.H.J(SQa.Q);
                                        vL_1 a22 = ((Tf)vL_17.j).J();
                                        vL_1 vL_18 = vL_13;
                                        int n2 = vL_18.d();
                                        if (!vL_18.Q) break block13;
                                        if (!a22.H()) break block14;
                                        if (vL_13.ja == null) {
                                            int n3 = vL_13.Y;
                                            vL_13.Y = n3 + vRa.d;
                                            if (n3 >= n2) {
                                                vL_1 vL_19;
                                                int a22;
                                                vL_1 vL_110 = vL_13;
                                                vL_110.Y = n2;
                                                vL_110.U = vL_110.C();
                                                if (vL_110.j.F.J() == pua.o) {
                                                    a22 = uSa.E;
                                                    vL_19 = vL_13;
                                                } else {
                                                    a22 = pua.o;
                                                    vL_19 = vL_13;
                                                }
                                                vL_19.f(a22);
                                            }
                                        }
                                        vL_14 = vL_13;
                                        vL_13.Q = uSa.E;
                                        break block15;
                                    }
                                    if (vL_13.Y > 0) {
                                        vL_13.Y -= AQa.P;
                                    }
                                    if (vL_13.Y < 0) {
                                        vL_13.Y = uSa.E;
                                    }
                                }
                                vL_14 = vL_13;
                            }
                            if (vL_14.U > 0) {
                                vL_13.U -= vRa.d;
                            }
                            vL_13.j.H.f();
                        }
                        vL_1 vL_111 = vL_13;
                        vL_111.C();
                        vL_111.d();
                        if (!vL_111.j.e) break block16;
                        vL_13.B = uSa.E;
                        vL_12 = vL_13;
                        break block17;
                    }
                    if (vL_13.B <= 0) break block18;
                    if (!vL_13.z) break block19;
                    vL_1 vL_112 = vL_13;
                    vL_112.B -= AQa.P;
                    if (vL_112.B >= 0) break block18;
                    vL_12 = vL_13;
                    vL_13.B = uSa.E;
                    break block17;
                }
                if (vL_13.B % kTa.j == 0) {
                    vL_13.J(gZ.k, pqa.r);
                }
                vL_13.B -= vRa.d;
            }
            vL_12 = vL_13;
        }
        if (vL_12.H()) {
            vL_1 vL_113 = vL_13;
            vL_113.K();
            vL_113.O *= MQa.L;
        }
        if (vL_13.Z < Tpa.D) {
            vL_13.B();
        }
        if (!vL_13.j.e) {
            vL_1 vL_114 = vL_13;
            vL_114.J(uSa.E, (vL_114.B > 0 ? vRa.d : uSa.E) != 0);
        }
        vL_13.ga = uSa.E;
        vL_13.j.H.f();
    }

    public boolean J(gZ gZ2, float f2) {
        vL_1 b2 = this;
        vL_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        b2.i();
        return uSa.E != 0;
    }

    public void b() {
    }

    public DZ f() {
        vL_1 a2;
        return a2.x;
    }

    public void a() {
        vL_1 a2;
        vL_1 vL_12 = a2;
        vL_12.D = vRa.d;
        vL_12.O = JPa.N;
    }

    public void H() {
        float f2;
        float f3;
        int n2;
        float f4;
        vL_1 vL_12 = this;
        float a2 = Oz.J((double)(vL_12.i * vL_12.i * Bua.Ia + vL_12.Ea * vL_12.Ea + vL_12.f * vL_12.f * Bua.Ia)) * psa.N;
        if (f4 > pqa.r) {
            a2 = pqa.r;
        }
        vL_1 vL_13 = vL_12;
        vL_13.J(vL_13.d(), a2, pqa.r + (vL_12.R.nextFloat() - vL_12.R.nextFloat()) * Xpa.R);
        a2 = Oz.f((double)vL_13.J().j);
        int n3 = n2 = uSa.E;
        while ((float)n3 < pqa.r + vL_12.F * eta.e) {
            vL_1 vL_14 = vL_12;
            vL_1 vL_15 = vL_12;
            f3 = (vL_14.R.nextFloat() * kta.v - pqa.r) * vL_15.F;
            f2 = (vL_14.R.nextFloat() * kta.v - pqa.r) * vL_12.F;
            int n4 = 2 ^ 3;
            vL_15.j.J(UZ.WATER_BUBBLE, vL_12.la + (double)f3, (double)(a2 + pqa.r), vL_12.A + (double)f2, vL_12.i, vL_12.Ea - (double)(vL_12.R.nextFloat() * psa.N), vL_12.f, new int[uSa.E]);
            n3 = ++n2;
        }
        int n5 = n2 = uSa.E;
        while ((float)n5 < pqa.r + vL_12.F * eta.e) {
            vL_1 vL_16 = vL_12;
            vL_1 vL_17 = vL_12;
            f3 = (vL_16.R.nextFloat() * kta.v - pqa.r) * vL_17.F;
            f2 = (vL_16.R.nextFloat() * kta.v - pqa.r) * vL_12.F;
            int n6 = 5 >> 2;
            vL_17.j.J(UZ.WATER_SPLASH, vL_12.la + (double)f3, (double)(a2 + pqa.r), vL_12.A + (double)f2, vL_12.i, vL_12.Ea, vL_12.f, new int[uSa.E]);
            n5 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, boolean bl, Block block, XF xF2) {
        void d3;
        void c2;
        vL_1 vL_12 = block2;
        Block block2 = block;
        vL_1 b2 = vL_12;
        if (c2 != false) {
            if (b2.O > JPa.N) {
                vL_1 vL_13;
                Block e2;
                if (e2 != null) {
                    void a2;
                    vL_1 vL_14 = b2;
                    vL_13 = vL_14;
                    vL_1 vL_15 = b2;
                    e2.J(vL_14.j, (XF)a2, (vL)vL_15, vL_15.O);
                } else {
                    vL_1 vL_16 = b2;
                    vL_13 = vL_16;
                    vL_16.f(vL_16.O, pqa.r);
                }
                vL_13.O = JPa.N;
                return;
            }
        } else if (d3 < aSa.V) {
            b2.O = (float)((double)b2.O - d3);
        }
    }

    public void e(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        a2.aa.J(vRa.d, Short.valueOf((short)b2));
    }

    public void J(Dha dha) {
        vL_1 b2 = dha;
        vL_1 a2 = this;
        vL_1 vL_12 = b2;
        vL_12.J(kta.u, new HHa((vL)a2));
        vL_12.J(Hra.Fa, a2.G);
        vL_12.J(Upa.X, (Callable)new Xha((vL)a2));
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = a2.la;
        objectArray[vRa.d] = a2.Z;
        objectArray[uqa.g] = a2.A;
        vL_12.J(kpa.H, String.format(FPa.G, objectArray));
        vL_1 vL_13 = b2;
        vL_13.J(jpa.q, Dha.J((double)Oz.f((double)a2.la), (double)Oz.f((double)a2.Z), (double)Oz.f((double)a2.A)));
        Object[] objectArray2 = new Object[yRa.d];
        objectArray2[uSa.E] = a2.i;
        objectArray2[vRa.d] = a2.Ea;
        objectArray2[uqa.g] = a2.f;
        vL_13.J(SRa.U, String.format(FPa.G, objectArray2));
        vL_1 vL_14 = b2;
        vL_14.J(isa.Ja, (Callable)new jHa((vL)a2));
        vL_14.J(Wqa.K, (Callable)new qha((vL)a2));
    }

    public void d(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        d2.f(c2);
        vL_12.J(b2);
        vL_12.l(a2);
    }

    public void M(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.J(AQa.P, b2);
    }

    public float J(vL vL2) {
        vL_1 a2;
        vL_1 b22 = vL2;
        vL_1 vL_12 = a2 = this;
        float f2 = (float)(vL_12.la - b22.la);
        float f3 = (float)(vL_12.Z - b22.Z);
        float b22 = (float)(vL_12.A - b22.A);
        float f4 = f2;
        float f5 = f3;
        float f6 = b22;
        return Oz.J((float)(f4 * f4 + f5 * f5 + f6 * f6));
    }

    @Override
    public ld J() {
        vL_1 a2;
        vL_1 vL_12 = this;
        vL_1 vL_13 = a2 = new CY(vL_12.J());
        a2.J().J(vL_12.J());
        vL_13.J().J(vL_12.J().toString());
        return vL_13;
    }

    public boolean J(NZ nZ2, Gg gg2, XF xF2, IBlockState iBlockState, float f2) {
        float f3 = f2;
        vL_1 a2 = this;
        return vRa.d != 0;
    }

    private boolean J(xy xy2) {
        vL_1 a2 = this;
        vL_1 b2 = xy2;
        if (a2.j.J((vL)a2, (xy)b2).isEmpty() && !a2.j.C((xy)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        if ((a2.aa.J(uSa.E) & vRa.d << b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void g() {
        vL_1 vL_12 = this;
        if (vL_12.ja.J) {
            vL_12.ja = null;
            return;
        }
        vL_1 vL_13 = vL_12;
        vL_13.f(aSa.V);
        vL_13.J(aSa.V);
        vL_13.l(aSa.V);
        vL_13.d();
        if (vL_13.ja != null) {
            vL_1 vL_14 = vL_12;
            vL_1 vL_15 = vL_14;
            vL_14.ja.M();
            vL_14.m += (double)(vL_12.ja.X - vL_12.ja.s);
            vL_14.p += (double)(vL_12.ja.d - vL_12.ja.o);
            while (vL_15.m >= kta.Da) {
                vL_1 vL_16 = vL_12;
                vL_15 = vL_16;
                vL_16.m -= ZOa.Ja;
            }
            vL_1 vL_17 = vL_12;
            while (vL_17.m < bqa.H) {
                vL_1 vL_18 = vL_12;
                vL_17 = vL_18;
                vL_18.m += ZOa.Ja;
            }
            vL_1 vL_19 = vL_12;
            while (vL_19.p >= kta.Da) {
                vL_1 vL_110 = vL_12;
                vL_19 = vL_110;
                vL_110.p -= ZOa.Ja;
            }
            vL_1 vL_111 = vL_12;
            while (vL_111.p < bqa.H) {
                vL_1 vL_112 = vL_12;
                vL_111 = vL_112;
                vL_112.p += ZOa.Ja;
            }
            vL_1 vL_113 = vL_12;
            double d2 = vL_113.m * kTa.B;
            double d3 = vL_113.p * kTa.B;
            float a2 = FRa.Ga;
            if (d2 > (double)a2) {
                d2 = a2;
            }
            if (d2 < (double)(-a2)) {
                d2 = -a2;
            }
            if (d3 > (double)a2) {
                d3 = a2;
            }
            if (d3 < (double)(-a2)) {
                d3 = -a2;
            }
            vL_1 vL_114 = vL_12;
            vL_114.m -= d2;
            vL_114.p -= d3;
        }
    }

    public UUID J() {
        vL_1 a2;
        return a2.w;
    }

    public double J(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        c2 = vL_12.la - c2;
        b2 = vL_12.Z - b2;
        a2 = vL_12.A - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return Oz.J((double)(d3 * d3 + d4 * d4 + d5 * d5));
    }

    public boolean J() {
        vL_1 a2;
        if (a2.aa.J(uqa.g).length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int A() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        vL_1 vL_12 = this;
        XF d222 = new XF((double)c2, (double)b2, (double)a2);
        c2 -= (double)d222.getX();
        b2 -= (double)d222.getY();
        a2 -= (double)d222.getZ();
        if (vL_12.j.J(vL_12.J()).isEmpty() && !vL_12.j.C(d222)) {
            return uSa.E != 0;
        }
        int n2 = yRa.d;
        double d5 = kTa.P;
        if (!vL_12.j.C(d222.west()) && c2 < d5) {
            d5 = c2;
            n2 = uSa.E;
        }
        if (!vL_12.j.C(d222.east()) && oua.i - c2 < d5) {
            d5 = oua.i - c2;
            n2 = vRa.d;
        }
        if (!vL_12.j.C(d222.up()) && oua.i - b2 < d5) {
            d5 = oua.i - b2;
            n2 = yRa.d;
        }
        if (!vL_12.j.C(d222.north()) && a2 < d5) {
            d5 = a2;
            n2 = AQa.P;
        }
        if (!vL_12.j.C(d222.south()) && oua.i - a2 < d5) {
            d5 = oua.i - a2;
            n2 = tTa.h;
        }
        float d222 = vL_12.R.nextFloat() * psa.N + Nra.e;
        if (n2 == 0) {
            vL_12.f((double)(-d222));
        }
        if (n2 == vRa.d) {
            vL_12.f((double)d222);
        }
        if (n2 == yRa.d) {
            vL_12.J((double)d222);
        }
        if (n2 == AQa.P) {
            vL_12.l(-d222);
        }
        if (n2 == tTa.h) {
            vL_12.l(d222);
        }
        return vRa.d != 0;
    }

    public void d(vL vL2) {
        vL_1 b2 = vL2;
        vL_1 a2 = this;
        vL_1 vL_12 = b2;
        a2.f(b2.la, b2.Z, b2.A, vL_12.X, vL_12.d);
    }

    public boolean f(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        return vL_12.J(vL_12.J().C(c2, b2, a2));
    }

    public boolean K() {
        vL_1 a2;
        if (!a2.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public via J() {
        vL_1 a2;
        return a2.S;
    }

    public boolean c() {
        vL_1 a2;
        if (a2.aa.J(AQa.P) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String M() {
        return SPa.Aa;
    }

    public void I() {
        a.B = uSa.E;
    }

    @Override
    public Gg J() {
        vL_1 a2;
        return a2.j;
    }

    public float J(float f2) {
        float b22 = f2;
        vL_1 a2 = this;
        XF b22 = new XF(a2.la, a2.Z + (double)a2.l(), a2.A);
        if (a2.j.F(b22)) {
            return a2.j.J(b22);
        }
        return JPa.N;
    }

    public int i() {
        vL_1 a2;
        return a2.aa.J(vRa.d);
    }

    public boolean f(vL vL2) {
        vL_1 b2 = vL2;
        vL_1 a2 = this;
        return uSa.E != 0;
    }

    public boolean B() {
        vL_1 a2;
        if (a2.ja != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void C(vL vL2) {
        vL_1 b2 = vL2;
        vL_1 a2 = this;
        a2.S.J(b2.J());
    }

    public void J(cEa cEa2) {
        vL_1 a2;
        vL_1 b2 = cEa2;
        vL_1 vL_12 = a2 = this;
        a2.J(gZ.A, eua.C);
        vL_12.B += vRa.d;
        if (vL_12.B == 0) {
            a2.J(Yqa.i);
        }
    }

    public boolean L() {
        vL_1 a2;
        return a2.H;
    }

    /*
     * WARNING - void declaration
     */
    public void l(double d2, double d3, double d4, float f2, float f3) {
        double d5;
        void a2;
        void f4;
        void c2;
        void d6;
        double e2;
        vL_1 b2;
        float f5 = f2;
        vL_1 vL_12 = b2 = this;
        vL_12.c = vL_12.la = e2;
        vL_1 vL_13 = b2;
        vL_13.ba = vL_13.Z = d6;
        vL_1 vL_14 = b2;
        vL_14.r = vL_14.A = c2;
        vL_1 vL_15 = b2;
        vL_15.s = vL_15.X = f4;
        vL_1 vL_16 = b2;
        vL_16.o = vL_16.d = a2;
        e2 = b2.s - f4;
        if (d5 < bqa.H) {
            b2.s += CRa.ja;
        }
        if (e2 >= kta.Da) {
            b2.s -= CRa.ja;
        }
        vL_1 vL_17 = b2;
        vL_17.l(b2.la, vL_17.Z, b2.A);
        b2.C((float)f4, (float)a2);
    }

    public void d(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        if (b2 == Fsa.d && (b2 = a2.aa.J(b2)) != vqa.T) {
            a2.u = b2;
            a2.e();
        }
    }

    public void C(Sx object) {
        Object b2 = object;
        object = this;
    }

    public String toString() {
        vL_1 a2;
        Object[] objectArray = new Object[XTa.W];
        objectArray[uSa.E] = a2.getClass().getSimpleName();
        objectArray[vRa.d] = a2.J();
        objectArray[uqa.g] = a2.G;
        objectArray[yRa.d] = a2.j == null ? WRa.E : a2.j.J().f();
        objectArray[AQa.P] = a2.la;
        objectArray[tTa.h] = a2.Z;
        objectArray[uua.p] = a2.A;
        return String.format(nQa.w, objectArray);
    }

    public void J(Gg gg2) {
        vL_1 b2 = gg2;
        vL_1 a2 = this;
        a2.j = b2;
    }

    public void f(int n2, Mda object) {
        vL_1 c2 = object;
        object = this;
    }

    public boolean J(Material material) {
        vL_1 a2;
        Material b22 = material;
        vL_1 vL_12 = a2 = this;
        double d2 = a2.Z + (double)vL_12.l();
        XF xF2 = new XF(a2.la, d2, a2.A);
        IBlockState iBlockState = vL_12.j.J(xF2);
        if (iBlockState.J().J() == b22) {
            float b22 = BlockLiquid.J(iBlockState.J().f(iBlockState)) - Eqa.m;
            b22 = (float)(xF2.getY() + vRa.d) - b22;
            int n2 = b22 = d2 < (double)b22 ? vRa.d : uSa.E;
            if (b22 == 0 && a2 instanceof Sx) {
                return uSa.E != 0;
            }
            return b22 != 0;
        }
        return uSa.E != 0;
    }

    public pEa J() {
        vL_1 vL_12 = this;
        vL_1 a2 = new Waa();
        String string = PIa.J((vL)vL_12);
        a2.J(QTa.O, vL_12.J().toString());
        if (string != null) {
            a2.J(Zpa.x, string);
        }
        a2.J(dua.T, vL_12.J());
        return new pEa(Hfa.SHOW_ENTITY, (ld)new CY(a2.toString()));
    }

    public Lz f(float f2) {
        float b2 = f2;
        vL_1 a2 = this;
        if (b2 == pqa.r) {
            return new Lz(a2.la, a2.Z + (double)a2.l(), a2.A);
        }
        vL_1 vL_12 = a2;
        vL_1 vL_13 = a2;
        double d2 = vL_12.c + (vL_13.la - a2.c) * (double)b2;
        double d3 = vL_13.ba + (a2.Z - a2.ba) * (double)b2 + (double)a2.l();
        double d4 = vL_12.r + (a2.A - a2.r) * (double)b2;
        return new Lz(d2, d3, d4);
    }

    public int M() {
        vL_1 a2;
        return a2.G;
    }

    public float e() {
        return JPa.N;
    }

    public void j() {
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        int a22 = Oz.f((double)vL_13.la);
        int n2 = Oz.f((double)(vL_13.Z - Bua.Ia));
        int n3 = Oz.f((double)vL_13.A);
        Object a22 = new XF(a22, n2, n3);
        if ((a22 = vL_13.j.J(a22)).J().J() != hy.INVISIBLE) {
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = Block.l((IBlockState)a22);
            vL_12.j.J(UZ.BLOCK_CRACK, vL_12.la + ((double)vL_12.R.nextFloat() - kTa.B) * (double)vL_12.F, vL_12.J().j + tpa.k, vL_12.A + ((double)vL_12.R.nextFloat() - kTa.B) * (double)vL_12.F, -vL_12.i * FPa.T, Bta.c, -vL_12.f * FPa.T, nArray);
        }
    }

    public void F() {
        vL_1 a2;
        a2.k();
    }

    public void k() {
        a.J = vRa.d;
    }

    public void C(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        if (!a2.z) {
            a2.J(gZ.j, (float)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl) {
        void c22;
        void h22;
        void e2;
        void f4;
        void g2;
        vL_1 d5;
        float f5 = f2;
        vL_1 vL_12 = d5 = this;
        vL_12.l((double)g2, (double)f4, (double)e2);
        vL_12.C((float)h22, (float)c22);
        vL_1 vL_13 = d5;
        Object h22 = vL_12.j.J((vL)vL_13, vL_13.J().J(vQa.e, aSa.V, vQa.e));
        if (!h22.isEmpty()) {
            double d6 = aSa.V;
            h22 = h22.iterator();
            while (h22.hasNext()) {
                xy xy2;
                xy c22 = (xy)h22.next();
                if (!(xy2.M > d6)) continue;
                d6 = c22.M;
            }
            d5.l((double)g2, (double)(f4 += d6 - d5.J().j), (double)e2);
        }
    }

    public void e(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.ka = b2;
    }

    public Lz J(float f2) {
        float b2 = f2;
        vL_1 a2 = this;
        if (b2 == pqa.r) {
            vL_1 vL_12 = a2;
            return vL_12.J(a2.d, vL_12.X);
        }
        vL_1 vL_13 = a2;
        vL_1 vL_14 = a2;
        float f3 = vL_13.o + (vL_13.d - vL_14.o) * b2;
        vL_1 vL_15 = a2;
        b2 = vL_14.s + (vL_15.X - vL_15.s) * b2;
        return vL_13.J(f3, b2);
    }

    public void G() {
    }

    public int hashCode() {
        vL_1 a2;
        return a2.G;
    }

    public xy J(vL vL2) {
        vL_1 b2 = vL2;
        vL_1 a2 = this;
        return null;
    }

    public double J(XF xF2) {
        Object b2 = xF2;
        vL_1 a2 = this;
        return b2.distanceSq(a2.la, a2.Z, a2.A);
    }

    public void l(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        a2.G = b2;
    }

    public static float d() {
        return Ora.D;
    }

    public boolean f(Sx sx2) {
        Sx b2 = sx2;
        vL_1 a2 = this;
        if (b2.t()) {
            return uSa.E != 0;
        }
        return a2.C();
    }

    public boolean f(int n2, Mda mda2) {
        vL_1 c2 = mda2;
        vL_1 a2 = this;
        return uSa.E != 0;
    }

    public hga J() {
        vL_1 a2;
        return a2.aa;
    }

    public void D() {
        vL_1 a2;
        if (a2.j != null) {
            vL_1 vL_12;
            block3: {
                vL_1 vL_13 = a2;
                while (vL_13.Z > aSa.V && a2.Z < ZSa.o) {
                    vL_1 vL_14 = a2;
                    vL_1 vL_15 = a2;
                    vL_15.l(vL_14.la, vL_15.Z, a2.A);
                    vL_1 vL_16 = a2;
                    if (vL_14.j.J((vL)vL_16, vL_16.J()).isEmpty()) {
                        vL_12 = a2;
                        break block3;
                    }
                    vL_1 vL_17 = a2;
                    vL_13 = vL_17;
                    vL_17.Z += oua.i;
                }
                vL_12 = a2;
            }
            vL_12.f(aSa.V);
            vL_1 vL_18 = a2;
            vL_18.J(aSa.V);
            vL_18.l(aSa.V);
            vL_18.d = JPa.N;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void v2;
        void b2;
        void c2;
        vL_1 vL_12 = this;
        void v0 = c2;
        void v1 = b2;
        float d2 = v0 * v0 + v1 * v1;
        if (v2 >= WSa.B) {
            float a2;
            float f5;
            d2 = Oz.J((float)d2);
            if (f5 < pqa.r) {
                d2 = pqa.r;
            }
            d2 = a2 / d2;
            c2 *= d2;
            b2 *= d2;
            vL_1 vL_13 = vL_12;
            a2 = Oz.d((float)(vL_13.X * pua.j / Hra.Ga));
            d2 = Oz.C((float)(vL_13.X * pua.j / Hra.Ga));
            vL_13.f(vL_13.i + (double)(c2 * d2 - b2 * a2));
            vL_13.l(vL_13.f + (double)(b2 * d2 + c2 * a2));
        }
    }

    public void d(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        if (a2.y.J() != a2.ha) {
            throw new IllegalStateException(Asa.I);
        }
        boolean bl2 = b2;
        a2.y.J(bl2);
        a2.ha = bl2;
    }

    public void C(Waa waa2) {
        vL_1 b2 = waa2;
        vL_1 a2 = this;
        try {
            Waa waa3;
            vL_1 vL_12 = b2;
            double[] dArray = new double[yRa.d];
            dArray[uSa.E] = a2.la;
            dArray[vRa.d] = a2.Z;
            dArray[uqa.g] = a2.A;
            vL_12.J(wPa.Ga, (NCa)a2.J(dArray));
            double[] dArray2 = new double[yRa.d];
            dArray2[uSa.E] = a2.i;
            dArray2[vRa.d] = a2.Ea;
            dArray2[uqa.g] = a2.f;
            vL_12.J(JPa.O, (NCa)a2.J(dArray2));
            float[] fArray = new float[uqa.g];
            fArray[uSa.E] = a2.X;
            fArray[vRa.d] = a2.d;
            vL_12.J(Tqa.n, (NCa)a2.J(fArray));
            vL_12.J(hra.h, a2.O);
            vL_12.J(XSa.N, (short)a2.B);
            vL_12.J(pQa.l, (short)a2.i());
            vL_12.J(UOa.x, a2.ha);
            vL_12.J(ROa.Q, a2.Ha);
            vL_12.J(csa.q, a2.P);
            vL_12.J(ySa.N, a2.U);
            vL_12.J(NTa.j, a2.J().getMostSignificantBits());
            vL_12.J(csa.R, a2.J().getLeastSignificantBits());
            if (a2.e() != null && a2.e().length() > 0) {
                vL_1 vL_13 = b2;
                vL_13.J(cRa.k, a2.e());
                vL_13.J(JTa.N, a2.a());
            }
            vL_1 vL_14 = a2;
            vL_14.S.f((Waa)b2);
            if (vL_14.c()) {
                b2.J(vua.ba, a2.c());
            }
            vL_1 vL_15 = a2;
            vL_15.f((Waa)b2);
            if (vL_15.ja != null && a2.ja.f(waa3 = new Waa())) {
                b2.J(SOa.Ga, (NCa)waa3);
                return;
            }
        }
        catch (Throwable throwable) {
            b2 = RIa.J((Throwable)throwable, (String)fpa.u);
            Dha dha = b2.J(Ora.H);
            a2.J(dha);
            throw new MZ((RIa)b2);
        }
    }

    public boolean b() {
        return vRa.d != 0;
    }

    private void A() {
        vL_1 a2;
        vL_1 vL_12 = a2;
        a2.la = (vL_12.J().J + a2.J().A) / KPa.y;
        vL_12.Z = vL_12.J().j;
        vL_12.A = (vL_12.J().I + a2.J().k) / KPa.y;
    }

    @Override
    public vL J() {
        vL_1 a2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, vL vL2) {
        void b2;
        vL_1 c2 = vL2;
        vL_1 a2 = this;
        if (c2 instanceof Gl) {
            kGa.J((Gl)((Gl)c2), (vL)b2);
        }
        kGa.f((Gl)b2, (vL)c2);
    }

    public DZ J() {
        vL_1 a2;
        return DZ.getHorizontal(Oz.f((double)((double)(a2.X * YSa.G / CRa.ja) + kTa.B)) & yRa.d);
    }

    public boolean a() {
        vL_1 a2;
        if (a2.aa.J(yRa.d) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(Waa waa2) {
        Dha dha;
        RIa rIa2;
        vL_1 b2 = waa2;
        vL_1 a2 = this;
        try {
            vL_1 vL_12;
            vL_1 vL_13 = b2;
            waa waa3 = vL_13.J(wPa.Ga, uua.p);
            rIa2 = vL_13.J(JPa.O, uua.p);
            dha = vL_13.J(Tqa.n, tTa.h);
            vL_1 vL_14 = a2;
            RIa rIa3 = rIa2;
            a2.f(rIa3.J(uSa.E));
            vL_14.J(rIa3.J(vRa.d));
            vL_14.l(rIa2.J(uqa.g));
            if (Math.abs(vL_14.i) > Wqa.m) {
                a2.f(aSa.V);
            }
            if (Math.abs(a2.Ea) > Wqa.m) {
                a2.J(aSa.V);
            }
            if (Math.abs(a2.f) > Wqa.m) {
                a2.l(aSa.V);
            }
            a2.V = a2.la = waa3.J(uSa.E);
            a2.c = a2.la;
            a2.Ga = a2.Z = waa3.J(vRa.d);
            a2.ba = a2.Z;
            a2.Ca = a2.A = waa3.J(uqa.g);
            a2.r = a2.A;
            vL_1 vL_15 = a2;
            vL_15.s = vL_15.X = dha.J(uSa.E);
            vL_1 vL_16 = a2;
            vL_16.o = vL_16.d = dha.J(vRa.d);
            vL_1 vL_17 = b2;
            vL_1 vL_18 = a2;
            vL_1 vL_19 = b2;
            vL_1 vL_110 = b2;
            vL_1 vL_111 = a2;
            vL_111.J(vL_111.X);
            vL_111.f(vL_111.X);
            a2.O = vL_110.J(hra.h);
            a2.B = vL_110.J(XSa.N);
            a2.e(b2.J(pQa.l));
            a2.d(vL_19.f(UOa.x));
            vL_18.Ha = vL_19.J(ROa.Q);
            vL_18.P = b2.f(csa.q);
            a2.U = vL_17.J(ySa.N);
            if (vL_17.J(NTa.j, AQa.P) && b2.J(csa.R, AQa.P)) {
                vL_12 = a2;
                a2.w = new UUID(b2.J(NTa.j), b2.J(csa.R));
            } else {
                if (b2.J(URa.V, Yqa.i)) {
                    a2.w = UUID.fromString(b2.J(URa.V));
                }
                vL_12 = a2;
            }
            vL_12.l(a2.la, a2.Z, a2.A);
            vL_1 vL_112 = a2;
            vL_112.C(a2.X, vL_112.d);
            if (b2.J(cRa.k, Yqa.i) && b2.J(cRa.k).length() > 0) {
                a2.J(b2.J(cRa.k));
            }
            vL_1 vL_113 = a2;
            vL_1 vL_114 = a2;
            vL_1 vL_115 = b2;
            vL_114.f(vL_115.f(JTa.N));
            vL_114.S.J((Waa)b2);
            vL_113.C(vL_115.f(vua.ba));
            vL_113.J((Waa)b2);
            if (!a2.m()) return;
            vL_1 vL_116 = a2;
            vL_116.l(a2.la, vL_116.Z, a2.A);
            return;
        }
        catch (Throwable throwable) {
            rIa2 = RIa.J((Throwable)throwable, (String)QSa.n);
            dha = rIa2.J(ISa.F);
            a2.J(dha);
            throw new MZ(rIa2);
        }
    }

    public void i() {
        a.a = vRa.d;
    }

    public boolean H() {
        vL_1 a2;
        return a2.j.f(a2.J().f(pPa.u, bua.o, pPa.u), Material.lava);
    }

    public double d() {
        vL_1 a2;
        return (double)a2.u * Bsa.x;
    }

    public boolean g() {
        return uSa.E != 0;
    }

    public vL[] J() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public RY J(double d2, float f2) {
        void b2;
        vL_1 a2;
        float c22 = f2;
        vL_1 vL_12 = a2 = this;
        Lz lz2 = vL_12.f(c22);
        Lz c22 = vL_12.J(c22);
        c22 = lz2.f(c22.A * b2, c22.j * b2, c22.J * b2);
        return vL_12.j.J(lz2, c22, uSa.E != 0, uSa.E != 0, vRa.d != 0);
    }

    public boolean I() {
        return vRa.d != 0;
    }

    public boolean j() {
        vL_1 a2;
        return a2.J(yRa.d);
    }

    public void C(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        d2.f(c2, b2, a2, vL_12.X, vL_12.d);
    }

    public boolean J(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        c2 = vL_12.la - c2;
        b2 = vL_12.Z - b2;
        a2 = vL_12.A - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return vL_12.J(d3 * d3 + d4 * d4 + d5 * d5);
    }

    /*
     * WARNING - void declaration
     */
    public void l(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        vL_1 vL_14 = vL_12;
        vL_12.la = c2;
        vL_14.Z = b2;
        vL_14.A = a2;
        float d5 = vL_13.F / kta.v;
        float f2 = vL_13.u;
        vL_1 vL_15 = vL_12;
        vL_13.J(new xy((double)(c2 - (double)d5), (double)b2, (double)(a2 - (double)d5), (double)(c2 + (double)d5), (double)(b2 + (double)f2), (double)(a2 + (double)d5)));
    }

    public int e() {
        vL_1 a2;
        return a2.aa.J(AQa.ba);
    }

    public boolean F() {
        vL_1 a2;
        if (a2.e() != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int d() {
        return uSa.E;
    }

    public double C() {
        return aSa.V;
    }

    @Override
    public boolean J(int n2, String string) {
        String c2 = string;
        vL_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Rha rha2, int n2) {
        void b2;
        int c2 = n2;
        vL_1 a2 = this;
        a2.S.J((u)a2, (Rha)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public waa J(double ... dArray) {
        int b2;
        void a2;
        vL_1 vL_12 = this;
        waa waa2 = new waa();
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void var5_6 = a2[b2];
            waa2.J((NCa)new TAa((double)var5_6));
            n3 = ++b2;
        }
        return waa2;
    }

    public final boolean k() {
        vL_1 a2;
        return a2.z;
    }

    public String e() {
        vL_1 a2;
        return a2.aa.J(uqa.g);
    }

    public void f(double a2) {
        b.i = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2) {
        vL_1 vL_12 = this;
        if (!vL_12.j.e && !vL_12.J) {
            void a2;
            vL_1 vL_13 = vL_12;
            vL_13.j.H.J(Ura.H);
            vL_1 b2 = OCa.J();
            int n3 = vL_13.Ha;
            vL_1 vL_14 = b2;
            Tf tf2 = vL_14.J(n3);
            Tf tf3 = vL_14.J((int)a2);
            vL_13.Ha = a2;
            if (n3 == vRa.d && a2 == vRa.d) {
                tf3 = b2.J(uSa.E);
                vL_12.Ha = uSa.E;
            }
            vL_1 vL_15 = vL_12;
            vL_12.j.C((vL)vL_12);
            vL_15.J = uSa.E;
            vL_15.j.H.J(WRa.o);
            b2.J().J((vL)vL_12, n3, tf2, tf3);
            vL_15.j.H.f(tTa.Y);
            b2 = PIa.J((String)PIa.J((vL)vL_12), (Gg)tf3);
            if (b2 != null) {
                b2.f((vL)vL_12);
                if (n3 == vRa.d && a2 == vRa.d) {
                    vL_1 vL_16 = b2;
                    vL_16.J(vL_12.j.f(tf3.J()), b2.X, vL_16.d);
                }
                tf3.f((vL)b2);
            }
            vL_12.J = vRa.d;
            vL_12.j.H.f();
            tf2.H();
            tf3.H();
            vL_12.j.H.f();
        }
    }

    public double J(vL vL2) {
        vL_1 a2;
        vL_1 b2 = vL2;
        vL_1 vL_12 = a2 = this;
        double d2 = vL_12.la - b2.la;
        double d3 = vL_12.Z - b2.Z;
        double d4 = vL_12.A - b2.A;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public void M() {
        vL_1 a2;
        if (a2.Aa != null) {
            vL_1 vL_12 = a2;
            vL_12.Aa.l(vL_12.la, a2.Z + a2.d() + a2.Aa.C(), a2.A);
        }
    }

    public Lz l() {
        vL_1 a2;
        return a2.q;
    }

    public boolean G() {
        vL_1 a2;
        return a2.a();
    }

    @Override
    public Lz J() {
        vL_1 a2;
        return new Lz(a2.la, a2.Z, a2.A);
    }

    public void e() {
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        float a2 = vL_13.u;
        vL_13.u += ZSa.r;
        vL_13.l(vL_13.F, a2);
    }

    /*
     * WARNING - void declaration
     */
    public jFa J(Mda mda2, float f2) {
        vL_1 c2 = mda2;
        vL_1 b2 = this;
        if (((Mda)c2).E != 0 && c2.J() != null) {
            void a2;
            vL_1 vL_12 = b2;
            c2 = new jFa(vL_12.j, vL_12.la, b2.Z + (double)a2, b2.A, (Mda)c2);
            c2.l();
            vL_1 vL_13 = c2;
            b2.j.f((vL)vL_13);
            return vL_13;
        }
        return null;
    }

    public vL_1(Gg gg2) {
        vL_1 a2;
        vL_1 b2 = gg2;
        vL_1 vL_12 = a2 = this;
        vL_1 vL_13 = a2;
        vL_12.y = new OU(uSa.E != 0, NTa.C);
        int n2 = C;
        C = n2 + vRa.d;
        vL_13.G = n2;
        vL_12.n = oua.i;
        vL_12.E = K;
        vL_12.F = Ora.D;
        vL_12.u = Ssa.la;
        vL_12.v = vRa.d;
        vL_12.R = new Random();
        vL_12.b = vRa.d;
        vL_12.ga = vRa.d;
        vL_12.w = Oz.J((Random)vL_12.R);
        vL_12.S = new via();
        a2.j = b2;
        a2.l(aSa.V, aSa.V, aSa.V);
        if (a2.j != null) {
            a2.Ha = ((Gg)b2).F.J();
        }
        vL_1 vL_14 = a2;
        a2.aa = new hga((vL)a2);
        vL_14.aa.f(uSa.E, (byte)uSa.E);
        vL_14.aa.f(vRa.d, (short)vpa.Ja);
        vL_14.aa.f(yRa.d, (byte)uSa.E);
        vL_14.aa.f(uqa.g, Mqa.y);
        vL_14.aa.f(AQa.P, (byte)uSa.E);
        vL_14.J();
        vL_14.aa.f(AQa.ba, uSa.E);
        vL_14.aa.f(Fsa.d, Float.valueOf(a2.u));
    }

    public boolean D() {
        vL_1 a2;
        return a2.ka;
    }

    public xy f() {
        return null;
    }

    public void J(int n2) {
        int b2 = n2;
        vL_1 a2 = this;
        b2 *= kTa.j;
        vL_1 vL_12 = a2;
        if (vL_12.B < (b2 = Iha.J((vL)vL_12, (int)b2))) {
            a2.B = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, float f2, float f3) {
        float d2 = f3;
        vL_1 a2 = this;
        if (!a2.c()) {
            void b2;
            void c2;
            a2.j.J((vL)a2, (String)c2, (float)b2, d2);
        }
    }

    public boolean A() {
        vL_1 a2;
        return a2.J(AQa.P);
    }

    public void l(float f2, float f3) {
        float a2;
        float b2;
        vL_1 vL_12 = this;
        if (b2 != vL_12.F || a2 != vL_12.u) {
            vL_1 vL_13 = vL_12;
            float f4 = vL_13.F;
            vL_1 c2 = Ni.J((vL)vL_13);
            if (c2 != null) {
                if (((EH)c2).m != null) {
                    vL_1 vL_14 = c2;
                    b2 = ((EH)vL_14).m.I;
                    a2 = ((EH)vL_14).m.A;
                }
                b2 *= ((EH)c2).g;
                a2 *= ((EH)c2).g;
            }
            vL_12.F = b2;
            vL_12.u = a2;
            if (c2 != null) {
                vL_1 vL_15 = vL_12;
                vL_15.l(vL_12.la, vL_15.Z, vL_12.A);
                return;
            }
            vL_1 vL_16 = vL_12;
            vL_16.J(new xy(vL_16.J().J, vL_12.J().j, vL_12.J().I, vL_12.J().J + (double)vL_12.F, vL_12.J().j + (double)vL_12.u, vL_12.J().I + (double)vL_12.F));
            if (vL_12.F > f4 && !vL_12.ga && !vL_12.j.e) {
                vL_1 vL_17 = vL_12;
                vL_17.J((double)(f4 - vL_17.F), aSa.V, (double)(f4 - vL_12.F));
            }
        }
    }

    public void l(vL vL2) {
        vL_1 a2;
        vL_1 b2 = vL2;
        vL_1 vL_12 = a2 = this;
        vL_12.p = aSa.V;
        vL_12.m = aSa.V;
        if (b2 == null) {
            if (a2.ja != null) {
                vL_1 vL_13 = a2;
                vL_1 vL_14 = a2;
                vL_13.f(a2.ja.la, vL_13.ja.J().j + (double)a2.ja.u, a2.ja.A, vL_14.X, vL_14.d);
                a2.ja.Aa = null;
            }
            a2.ja = null;
            return;
        }
        if (a2.ja != null) {
            a2.ja.Aa = null;
        }
        if (b2 != null) {
            vL vL3;
            vL vL4 = vL3 = b2.ja;
            while (vL4 != null) {
                if (vL3 == a2) {
                    return;
                }
                vL4 = vL3.ja;
            }
        }
        a2.ja = b2;
        b2.Aa = a2;
    }

    public void f(double c2, double b2, double a2) {
        vL_1 d2;
        vL_1 vL_12 = d2;
        vL_12.f(vL_12.i + c2);
        vL_12.J(vL_12.Ea + b2);
        vL_12.l(vL_12.f + a2);
        vL_12.t = vRa.d;
    }

    public void J(XF xF2) {
        Object b2 = xF2;
        vL_1 a2 = this;
        if (a2.U > 0) {
            a2.U = a2.C();
            return;
        }
        if (!a2.j.e && !b2.equals((Object)a2.ia)) {
            a2.ia = b2;
            double d2 = ((BlockPattern$PatternHelper)(b2 = QFa.rF.J(a2.j, (XF)((Object)b2)))).f().getAxis() == RX.X ? (double)((BlockPattern$PatternHelper)b2).J().getZ() : (double)((BlockPattern$PatternHelper)b2).J().getX();
            double d3 = ((BlockPattern$PatternHelper)b2).f().getAxis() == RX.X ? a2.A : a2.la;
            double d4 = d2;
            d3 = Math.abs(Oz.f((double)(d3 - (double)(((BlockPattern$PatternHelper)b2).f().rotateY().getAxisDirection() == DX.NEGATIVE ? vRa.d : uSa.E)), (double)d4, (double)(d4 - (double)((BlockPattern$PatternHelper)b2).f())));
            d2 = Oz.f((double)(a2.Z - oua.i), (double)((BlockPattern$PatternHelper)b2).J().getY(), (double)(((BlockPattern$PatternHelper)b2).J().getY() - ((BlockPattern$PatternHelper)b2).J()));
            vL_1 vL_12 = a2;
            a2.q = new Lz(d3, d2, aSa.V);
            a2.x = ((BlockPattern$PatternHelper)b2).f();
        }
        a2.Q = vRa.d;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.aa.J(AQa.P, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public boolean i() {
        return uSa.E != 0;
    }

    public String d() {
        return Ssa.Da;
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2) {
        void a2;
        vL_1 vL_12 = this;
        vL_1 b2 = new Waa();
        void v0 = a2;
        v0.C((Waa)b2);
        vL_1 vL_13 = vL_12;
        void v2 = a2;
        vL_12.l((Waa)b2);
        vL_12.U = a2.U;
        vL_12.ia = v2.ia;
        vL_13.q = v2.q;
        vL_13.x = v0.x;
    }

    public boolean J(vL vL2) {
        vL_1 a2 = this;
        vL_1 b2 = vL2;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(ld object) {
        vL_1 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block) {
        void b2;
        void a2;
        vL_1 vL_12 = this;
        Object c2 = a2.stepSound;
        if (vL_12.j.J(b2.up()).J() == QFa.gC) {
            c2 = QFa.gC.stepSound;
            vL_12.J(((Block$SoundType)c2).J(), ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
            return;
        }
        if (!a2.J().l()) {
            vL_12.J(((Block$SoundType)c2).J(), ((Block$SoundType)c2).f() * VPa.i, ((Block$SoundType)c2).J());
        }
    }

    public Waa J() {
        return null;
    }

    public float C() {
        return Nra.e;
    }

    public void f(float f2) {
        float b2 = f2;
        vL_1 vL_12 = this;
    }

    public Lz f() {
        return null;
    }

    public xy J() {
        vL_1 a2;
        return a2.E;
    }

    public boolean J(double a2) {
        vL_1 b2;
        double d2 = b2.J().J();
        if (Double.isNaN(d2)) {
            d2 = oua.i;
        }
        double d3 = d2 = d2 * ypa.X * b2.n;
        if (a2 < d3 * d3) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void d() {
        vL_1 a2;
        a2.L();
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        float c2 = f3;
        vL_1 a2 = this;
        if (a2.Aa != null) {
            void b2;
            a2.Aa.f((float)b2, c2);
        }
    }

    @Override
    public XF J() {
        vL_1 a2;
        return new XF(a2.la, a2.Z + kTa.B, a2.A);
    }

    public boolean M() {
        vL_1 a2;
        if (a2.H || a2.j.i(new XF(a2.la, a2.Z, a2.A)) || a2.j.i(new XF(a2.la, a2.Z + (double)a2.u, a2.A))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean e() {
        vL_1 a2;
        return a2.o();
    }

    public boolean equals(Object object) {
        Object b2 = object;
        vL_1 a2 = this;
        if (b2 instanceof vL_1) {
            if (((vL_1)b2).G == a2.G) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public boolean d() {
        vL_1 vL_12;
        vL_1 a2;
        if (a2.j.J(a2.J().f(aSa.V, bua.o, aSa.V).J(DPa.Ia, DPa.Ia, DPa.Ia), Material.water, (vL)a2)) {
            if (!a2.H && !a2.ga) {
                a2.H();
            }
            vL_12 = a2;
            a2.O = JPa.N;
            a2.H = vRa.d;
            a2.B = uSa.E;
        } else {
            vL_12 = a2;
            a2.H = uSa.E;
        }
        return vL_12.H;
    }

    /*
     * WARNING - void declaration
     */
    public jFa J(eAa eAa2, int n2, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        vL_1 a2 = this;
        return a2.J(new Mda((eAa)c2, (int)b2, uSa.E), d2);
    }

    public int C() {
        return vpa.Ja;
    }

    /*
     * WARNING - void declaration
     */
    public void f(double d2, double d3, double d4, float f2, float f3) {
        void f4;
        void b2;
        void c2;
        void d5;
        void e2;
        vL_1 a2;
        float f5 = f3;
        (a2 = this).c = (a2 = this).la = e2;
        (a2 = this).V = (a2 = this).la;
        a2.ba = a2.Z = d5;
        a2.Ga = a2.Z;
        a2.r = a2.A = c2;
        a2.Ca = a2.A;
        a2.X = b2;
        a2.d = f4;
        vL_1 vL_12 = a2;
        vL_12.l(a2.la, vL_12.Z, a2.A);
    }

    public abstract void f(Waa var1);

    public final String C() {
        vL_1 a2;
        return PIa.J((vL)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, boolean bl) {
        void b2;
        void a2;
        vL_1 vL_12 = this;
        byte c2 = vL_12.aa.J(uSa.E);
        if (a2 != false) {
            vL_12.aa.J(uSa.E, Byte.valueOf((byte)(c2 | vRa.d << b2)));
            return;
        }
        vL_12.aa.J(uSa.E, Byte.valueOf((byte)(c2 & (vRa.d << b2 ^ pua.o))));
    }

    public abstract void J(Waa var1);

    public void J(Gl object) {
        vL_1 b2 = object;
        object = this;
    }

    public void J(float f2) {
        float b2 = f2;
        vL_1 vL_12 = this;
    }

    public void J(double a2) {
        b.Ea = a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Waa waa2) {
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        String b2 = vL_13.C();
        if (!vL_13.J && b2 != null && vL_12.Aa == null) {
            void a2;
            void v1 = a2;
            v1.J(QTa.O, b2);
            vL_12.C((Waa)v1);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public waa J(float ... fArray) {
        int b2;
        void a2;
        vL_1 vL_12 = this;
        waa waa2 = new waa();
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void var5_6 = a2[b2];
            waa2.J((NCa)new rAa((float)var5_6));
            n3 = ++b2;
        }
        return waa2;
    }

    public void J(double d2, double d3, double d4) {
        boolean bl;
        vL_1 vL_12;
        block36: {
            boolean bl2;
            block35: {
                block34: {
                    Block block;
                    List list;
                    xy xy2;
                    xy xy3;
                    Object object;
                    Object d2222;
                    double a2;
                    double b2;
                    double c2;
                    int n2;
                    vL_12 = this;
                    int n3 = n2 = QS.J() && vL_12 instanceof ANa ? vRa.d : uSa.E;
                    if (vL_12.Ma && n2 == 0) {
                        vL_1 vL_13 = vL_12;
                        vL_13.J(vL_13.J().C(c2, b2, a2));
                        vL_13.A();
                        return;
                    }
                    vL_1 vL_14 = vL_12;
                    vL_14.j.H.J(kPa.c);
                    double d5 = vL_14.la;
                    double d6 = vL_14.Z;
                    double d7 = vL_14.A;
                    if (vL_14.D) {
                        vL_1 vL_15 = vL_12;
                        vL_12.D = uSa.E;
                        c2 *= VPa.W;
                        b2 *= ySa.Ja;
                        a2 *= VPa.W;
                        vL_12.f(aSa.V);
                        vL_15.J(aSa.V);
                        vL_15.l(aSa.V);
                    }
                    double d8 = c2;
                    void var16_12 = b2;
                    double d9 = a2;
                    int n4 = n2 = vL_12.ha && vL_12.q() && vL_12 instanceof Sx ? vRa.d : uSa.E;
                    if (n2 != 0) {
                        double d10 = fPa.ca;
                        double d11 = c2;
                        while (d11 != aSa.V) {
                            vL_1 vL_16 = vL_12;
                            if (!vL_12.j.J((vL)vL_16, vL_16.J().C(c2, pqa.q, aSa.V)).isEmpty()) break;
                            d8 = c2 < d10 && c2 >= -d10 ? aSa.V : (c2 > aSa.V ? c2 - d10 : c2 + d10);
                            d11 = c2;
                        }
                        double d12 = a2;
                        while (d12 != aSa.V) {
                            vL_1 vL_17 = vL_12;
                            if (!vL_12.j.J((vL)vL_17, vL_17.J().C(aSa.V, pqa.q, a2)).isEmpty()) break;
                            d9 = a2 < d10 && a2 >= -d10 ? aSa.V : (a2 > aSa.V ? a2 - d10 : a2 + d10);
                            d12 = a2;
                        }
                        double d13 = c2;
                        while (d13 != aSa.V && a2 != aSa.V) {
                            vL_1 vL_18 = vL_12;
                            if (!vL_12.j.J((vL)vL_18, vL_18.J().C(c2, pqa.q, a2)).isEmpty()) break;
                            double d14 = c2 < d10 && c2 >= -d10 ? aSa.V : (d8 = c2 > aSa.V ? c2 - d10 : c2 + d10);
                            d9 = a2 < d10 && a2 >= -d10 ? aSa.V : (a2 > aSa.V ? a2 - d10 : a2 + d10);
                            d13 = c2;
                        }
                    }
                    vL_1 vL_19 = vL_12;
                    vL_1 vL_110 = vL_12;
                    Object object2 = vL_19.j.J((vL)vL_110, vL_110.J().l(c2, b2, a2));
                    xy xy4 = vL_19.J();
                    Object object3 = d2222 = object2.iterator();
                    while (object3.hasNext()) {
                        object = (xy)d2222.next();
                        object3 = d2222;
                        b2 = object.J(vL_12.J(), b2);
                    }
                    vL_1 vL_111 = vL_12;
                    vL_111.J(vL_111.J().C(aSa.V, b2, aSa.V));
                    int d2222 = vL_111.ha || var16_12 != b2 && var16_12 < aSa.V ? vRa.d : uSa.E;
                    object = object2.iterator();
                    Iterator iterator = object;
                    while (iterator.hasNext()) {
                        xy3 = (xy)object.next();
                        iterator = object;
                        c2 = xy3.l(vL_12.J(), c2);
                    }
                    vL_1 vL_112 = vL_12;
                    vL_112.J(vL_112.J().C(c2, aSa.V, aSa.V));
                    object = object2.iterator();
                    Iterator iterator2 = object;
                    while (iterator2.hasNext()) {
                        xy3 = (xy)object.next();
                        iterator2 = object;
                        a2 = xy3.f(vL_12.J(), a2);
                    }
                    vL_1 vL_113 = vL_12;
                    vL_113.J(vL_113.J().C(aSa.V, aSa.V, a2));
                    if (vL_113.Ka > JPa.N && d2222 != 0 && (d8 != c2 || d9 != a2)) {
                        List list2;
                        Iterator iterator3;
                        Iterator iterator4;
                        Iterator iterator5;
                        Iterator iterator6;
                        double d15 = c2;
                        double d16 = b2;
                        double d17 = a2;
                        vL_1 vL_114 = vL_12;
                        xy2 = vL_114.J();
                        vL_114.J(xy4);
                        b2 = vL_114.Ka;
                        vL_1 vL_115 = vL_12;
                        list = vL_114.j.J((vL)vL_115, vL_115.J().l(d8, b2, d9));
                        xy xy5 = vL_114.J();
                        xy xy6 = xy5.l(d8, aSa.V, d9);
                        double d18 = b2;
                        Object object4 = object2 = list.iterator();
                        while (object4.hasNext()) {
                            d18 = ((xy)object2.next()).J(xy6, d18);
                            object4 = object2;
                        }
                        xy5 = xy5.C(aSa.V, d18, aSa.V);
                        double d19 = d8;
                        Iterator iterator7 = iterator6 = list.iterator();
                        while (iterator7.hasNext()) {
                            d19 = ((xy)iterator6.next()).l(xy5, d19);
                            iterator7 = iterator6;
                        }
                        xy5 = xy5.C(d19, aSa.V, aSa.V);
                        double d20 = d9;
                        Object d2222 = list.iterator();
                        Object object5 = d2222;
                        while (object5.hasNext()) {
                            xy xy7 = (xy)d2222.next();
                            object5 = d2222;
                            d20 = xy7.f(xy5, d20);
                        }
                        xy5 = xy5.C(aSa.V, aSa.V, d20);
                        d2222 = vL_12.J();
                        double d21 = b2;
                        Iterator iterator8 = iterator5 = list.iterator();
                        while (iterator8.hasNext()) {
                            d21 = ((xy)iterator5.next()).J((xy)d2222, d21);
                            iterator8 = iterator5;
                        }
                        d2222 = d2222.C(aSa.V, d21, aSa.V);
                        double d23 = d8;
                        Iterator iterator9 = iterator4 = list.iterator();
                        while (iterator9.hasNext()) {
                            d23 = ((xy)iterator4.next()).l((xy)d2222, d23);
                            iterator9 = iterator4;
                        }
                        d2222 = d2222.C(d23, aSa.V, aSa.V);
                        double d24 = d9;
                        Iterator iterator10 = iterator3 = list.iterator();
                        while (iterator10.hasNext()) {
                            d24 = ((xy)iterator3.next()).f((xy)d2222, d24);
                            iterator10 = iterator3;
                        }
                        d2222 = d2222.C(aSa.V, aSa.V, d24);
                        double d25 = d19;
                        double d26 = d20;
                        double d27 = d25 * d25 + d26 * d26;
                        double d28 = d23;
                        double d29 = d24;
                        double d30 = d28 * d28 + d29 * d29;
                        if (d27 > d30) {
                            c2 = d19;
                            a2 = d20;
                            b2 = -d18;
                            list2 = list;
                            vL_12.J(xy5);
                        } else {
                            c2 = d23;
                            a2 = d24;
                            b2 = -d21;
                            list2 = list;
                            vL_12.J((xy)d2222);
                        }
                        d2222 = list2.iterator();
                        Iterator iterator11 = d2222;
                        while (iterator11.hasNext()) {
                            b2 = ((xy)d2222.next()).J(vL_12.J(), b2);
                            iterator11 = d2222;
                        }
                        vL_1 vL_116 = vL_12;
                        vL_116.J(vL_116.J().C(aSa.V, b2, aSa.V));
                        double d31 = d15;
                        double d32 = d17;
                        double d33 = c2;
                        double d34 = a2;
                        if (d31 * d31 + d32 * d32 >= d33 * d33 + d34 * d34) {
                            c2 = d15;
                            b2 = d16;
                            a2 = d17;
                            vL_12.J(xy2);
                        }
                    }
                    vL_1 vL_117 = vL_12;
                    vL_117.j.H.f();
                    vL_117.j.H.J(vPa.f);
                    vL_117.A();
                    vL_12.ca = d8 != c2 || d9 != a2 ? vRa.d : uSa.E;
                    vL_12.Ia = var16_12 != b2 ? vRa.d : uSa.E;
                    vL_1 vL_118 = vL_12;
                    vL_118.d((vL_118.Ia && var16_12 < aSa.V ? vRa.d : uSa.E) != 0);
                    vL_12.da = vL_12.ca || vL_12.Ia ? vRa.d : uSa.E;
                    vL_1 vL_119 = vL_12;
                    int n5 = Oz.f((double)vL_119.la);
                    int n6 = Oz.f((double)(vL_119.Z - Bua.Ia));
                    int n7 = Oz.f((double)vL_119.A);
                    XF xF2 = new XF(n5, n6, n7);
                    Block block2 = vL_119.j.J(xF2).J();
                    if (block2.J() == Material.air && ((block = vL_12.j.J(xF2.down()).J()) instanceof BlockFence || BlockCustomWall.WALL_BLOCKS.contains(block) || block instanceof BlockFenceGate)) {
                        block2 = block;
                        xF2 = xF2.down();
                    }
                    vL_12.J(b2, vL_12.ha, block2, xF2);
                    if (d8 != c2) {
                        vL_12.f(aSa.V);
                    }
                    if (d9 != a2) {
                        vL_12.l(aSa.V);
                    }
                    if (var16_12 != b2) {
                        block2.J(vL_12.j, (vL)vL_12);
                    }
                    if (vL_12.u() && n2 == 0 && vL_12.ja == null) {
                        vL_1 vL_120 = vL_12;
                        double d35 = vL_120.la - d5;
                        double d36 = vL_120.Z - d6;
                        double d37 = vL_120.A - d7;
                        if (block2 != QFa.z) {
                            d36 = aSa.V;
                        }
                        if (block2 != null && vL_12.ha) {
                            block2.J(vL_12.j, xF2, (vL)vL_12);
                        }
                        vL_1 vL_121 = vL_12;
                        double d38 = d35;
                        double d39 = d37;
                        vL_121.e = (float)((double)vL_121.e + (double)Oz.J((double)(d38 * d38 + d39 * d39)) * oQa.fa);
                        double d40 = d35;
                        double d41 = d36;
                        double d42 = d37;
                        vL_121.W = (float)((double)vL_121.W + (double)Oz.J((double)(d40 * d40 + d41 * d41 + d42 * d42)) * oQa.fa);
                        if (vL_121.W > (float)vL_12.v && block2.J() != Material.air) {
                            vL_1 vL_122 = vL_12;
                            vL_122.v = (int)vL_122.W + vRa.d;
                            if (vL_122.L()) {
                                float f2;
                                float f3 = Oz.J((double)(vL_12.i * vL_12.i * Bua.Ia + vL_12.Ea * vL_12.Ea + vL_12.f * vL_12.f * Bua.Ia)) * kPa.W;
                                if (f2 > pqa.r) {
                                    f3 = pqa.r;
                                }
                                vL_1 vL_123 = vL_12;
                                vL_123.J(vL_123.M(), f3, pqa.r + (vL_12.R.nextFloat() - vL_12.R.nextFloat()) * Xpa.R);
                            }
                            vL_12.J(xF2, block2);
                        }
                    }
                    try {
                        vL_12.c();
                    }
                    catch (Throwable throwable) {
                        xy2 = RIa.J((Throwable)throwable, (String)iPa.h);
                        list = xy2.J(ISa.d);
                        vL_12.J((Dha)list);
                        throw new MZ((RIa)xy2);
                    }
                    bl2 = vL_12.M();
                    if (!vL_12.j.J(vL_12.J().J(DPa.Ia, DPa.Ia, DPa.Ia))) break block34;
                    vL_12.C(vRa.d);
                    if (bl2) break block35;
                    vL_1 vL_124 = vL_12;
                    vL_124.B += vRa.d;
                    if (vL_124.B != 0) break block35;
                    bl = bl2;
                    vL_12.J(Yqa.i);
                    break block36;
                }
                if (vL_12.B <= 0) {
                    vL_12.B = -vL_12.b;
                }
            }
            bl = bl2;
        }
        if (bl && vL_12.B > 0) {
            vL_1 vL_125 = vL_12;
            vL_125.J(bRa.T, ZSa.q, ySa.Da + (vL_12.R.nextFloat() - vL_12.R.nextFloat()) * Xpa.R);
            vL_125.B = -vL_125.b;
        }
        vL_12.j.H.f();
    }

    public boolean J(bFa bFa2) {
        vL_1 b2 = bFa2;
        vL_1 a2 = this;
        return vRa.d != 0;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.J(yRa.d, b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3) {
        void a2;
        void b2;
        vL_1 vL_12;
        vL_1 vL_13 = vL_12 = this;
        float f4 = vL_13.d;
        float c2 = vL_13.X;
        vL_13.X = (float)((double)vL_13.X + (double)b2 * uSa.W);
        vL_13.d = (float)((double)vL_13.d - (double)a2 * uSa.W);
        vL_13.d = Oz.J((float)vL_13.d, (float)kPa.Ha, (float)ISa.a);
        vL_13.o += vL_12.d - f4;
        vL_13.s += vL_12.X - c2;
    }

    public void J(vL vL2) {
        vL_1 b2 = vL2;
        vL_1 a2 = this;
        if (b2.Aa != a2 && b2.ja != a2 && !b2.Ma && !a2.Ma) {
            double d2;
            vL_1 vL_12 = b2;
            double d3 = vL_12.la - a2.la;
            double d4 = vL_12.A - a2.A;
            double d5 = Oz.J((double)d3, (double)d4);
            if (d2 >= yra.d) {
                double d6;
                d5 = Oz.J((double)d5);
                d3 /= d5;
                d4 /= d5;
                d5 = oua.i / d5;
                if (d6 > oua.i) {
                    d5 = oua.i;
                }
                d3 *= d5;
                d4 *= d5;
                d3 *= ySa.Ja;
                d4 *= ySa.Ja;
                d3 *= (double)(pqa.r - a2.Da);
                d4 *= (double)(pqa.r - a2.Da);
                if (a2.Aa == null) {
                    a2.f(-d3, aSa.V, -d4);
                }
                if (b2.Aa == null) {
                    b2.f(d3, aSa.V, d4);
                }
            }
        }
    }

    public boolean C() {
        vL_1 a2;
        return a2.J(tTa.h);
    }

    public void C() {
        vL_1 a2;
        if (a2.j() && !a2.L()) {
            a2.j();
        }
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.aa.J(yRa.d, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        vL_1 a2 = this;
        a2.J(tTa.h, b2);
    }

    public float l() {
        vL_1 a2;
        return a2.u * Sqa.g;
    }

    public boolean J(Sx sx2, Lz lz2) {
        vL_1 c2 = lz2;
        vL_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, float f2, float f3) {
        void a2;
        void b2;
        Object d2 = xF2;
        vL_1 c2 = this;
        c2.f((double)d2.getX() + kTa.B, d2.getY(), (double)d2.getZ() + kTa.B, (float)b2, (float)a2);
    }

    public abstract void J();

    public Mda[] J() {
        return null;
    }

    public float J(NZ nZ2, Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState e2;
        vL_1 vL_12 = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        vL_1 a2 = vL_12;
        return e2.J().J((vL)a2);
    }
}

