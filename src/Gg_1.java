/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  AY
 *  Ay
 *  Baa
 *  Cra
 *  DY
 *  Dha
 *  ERa
 *  EX
 *  Eaa
 *  FPa
 *  Faa
 *  Fpa
 *  Gg
 *  I
 *  JPa
 *  Jy
 *  KTa
 *  KZ
 *  Lqa
 *  Lra
 *  Lt
 *  Lz
 *  MQa
 *  MZ
 *  Mda
 *  Mz
 *  NQa
 *  NTa
 *  Nv
 *  OCa
 *  Oy
 *  Oz
 *  QFa
 *  QS
 *  RIa
 *  RPa
 *  SRa
 *  Sqa
 *  Ssa
 *  TX
 *  UZ
 *  Vb
 *  Vx
 *  Waa
 *  XB
 *  XTa
 *  Xv
 *  Yfa
 *  Ypa
 *  ZOa
 *  Zta
 *  aSa
 *  bpa
 *  bqa
 *  fX
 *  fsa
 *  gda
 *  hd
 *  hra
 *  isa
 *  jRa
 *  kta
 *  lqa
 *  mZ
 *  oY
 *  oZ
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  qV
 *  qca
 *  qta
 *  rd
 *  uY
 *  uw
 *  vL
 *  vRa
 *  vU
 *  wOa
 *  xy
 *  ysa
 *  yz
 *  zsa
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStairs$EnumHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Gg_1
implements I {
    public int u;
    private int O;
    public final List<vL> t;
    public boolean R;
    public final List<vL> Q;
    private final Calendar N;
    private int T;
    public hd p;
    private final List<uY> n;
    public float s;
    public final List<Sx> w;
    private long W;
    private boolean q;
    public qca x;
    public final Random v;
    public final List<uY> o;
    public DZ h;
    public vU K;
    public final gda H;
    private final PX c;
    private int B;
    public List<Vb> d;
    public float a;
    public Set<Baa> b;
    private final List<uY> l;
    public final boolean e;
    public float G;
    public final List<uY> D;
    public final OX<vL> f;
    public final Ty F;
    public boolean g;
    public yz L;
    public Nv E;
    public boolean m;
    public final int C = 1013904223;
    public qV i;
    public final XB M;
    private int k;
    public boolean j;
    public final List<vL> J;
    public float A;
    public int[] I;

    public void l(int n2) {
        int b2 = n2;
        Gg_1 a2 = this;
        a2.O = b2;
    }

    public List<Oy> J(Xv xv2, boolean bl) {
        boolean c2 = bl;
        Gg_1 a2 = this;
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(XF xF2, boolean bl) {
        void a2;
        Object c2 = xF2;
        Gg_1 b2 = this;
        if (Gg_1.f((XF)((Object)c2)) && b2.J(c2.getX() >> AQa.P, c2.getZ() >> AQa.P, (boolean)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(xy xy2, Material material, vL vL2) {
        void a2;
        int n2;
        int n3;
        void c22;
        Gg_1 gg_1 = this;
        void v0 = c22;
        int c22 = Oz.f((double)v0.J);
        int n4 = Oz.f((double)(v0.A + oua.i));
        int n5 = Oz.f((double)v0.j);
        int n6 = Oz.f((double)(v0.M + oua.i));
        int n7 = Oz.f((double)v0.I);
        if (!gg_1.J(c22, n5, n7, n4, n6, n3 = Oz.f((double)(v0.k + oua.i)), vRa.d != 0)) {
            return uSa.E != 0;
        }
        int n8 = uSa.E;
        Gg_1 d2 = new Lz(aSa.V, aSa.V, aSa.V);
        zz zz2 = new zz();
        int n9 = n2 = c22;
        while (n9 < n4) {
            int n10 = n5;
            while (n10 < n6) {
                int n11;
                int n12 = n7;
                while (n12 < n3) {
                    double d3;
                    void b2;
                    zz2.func_181079_c(n2, n11, c22);
                    IBlockState iBlockState = gg_1.J(zz2);
                    Block block = iBlockState.J();
                    if (block.J() == b2 && (double)n6 >= (d3 = (double)((float)(n11 + vRa.d) - BlockLiquid.J(iBlockState.J(BlockLiquid.LEVEL))))) {
                        n8 = vRa.d;
                        d2 = block.J((Gg)gg_1, (XF)zz2, (vL)a2, (Lz)d2);
                    }
                    n12 = ++c22;
                }
                n10 = ++n11;
            }
            n9 = ++n2;
        }
        if (d2.J() > aSa.V && a2.b()) {
            d2 = d2.J();
            double d4 = Jra.M;
            void v4 = a2;
            v4.f(v4.i + ((Lz)d2).A * d4);
            v4.J(v4.Ea + ((Lz)d2).j * d4);
            v4.l(v4.f + ((Lz)d2).J * d4);
        }
        return n8 != 0;
    }

    public boolean j(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J((XF)((Object)b2)).J((XF)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Gg_1 a2 = this;
        return a2.p.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public Sx J(UUID uUID) {
        int n2;
        Gg_1 gg_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < gg_1.w.size()) {
            void a2;
            Object b2 = gg_1.w.get(n2);
            if (a2.equals(b2.J())) {
                return b2;
            }
            n3 = ++n2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void C(XF xF2) {
        int b2;
        Gg_1 gg_1 = this;
        int n2 = b2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            Vb vb2 = gg_1.d.get(b2);
            vb2.J((XF)a2);
            n2 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, int n2, boolean bl) {
        void a2;
        void c2;
        int d2 = n2;
        Gg_1 b2 = this;
        return b2.J(c2.getX() - d2, c2.getY() - d2, c2.getZ() - d2, c2.getX() + d2, c2.getY() + d2, c2.getZ() + d2, (boolean)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Sx J(vL vL2, double d2) {
        void a2;
        Gg_1 c2 = vL2;
        Gg_1 b2 = this;
        return b2.J(((vL)c2).la, ((vL)c2).Z, ((vL)c2).A, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        Gg_1 a2 = this;
        if (d2 != DZ.WEST) {
            a2.l(c2.west(), (Block)b2);
        }
        if (d2 != DZ.EAST) {
            a2.l(c2.east(), (Block)b2);
        }
        if (d2 != DZ.DOWN) {
            a2.l(c2.down(), (Block)b2);
        }
        if (d2 != DZ.UP) {
            a2.l(c2.up(), (Block)b2);
        }
        if (d2 != DZ.NORTH) {
            a2.l(c2.north(), (Block)b2);
        }
        if (d2 != DZ.SOUTH) {
            a2.l(c2.south(), (Block)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, XF xF3, boolean bl) {
        void a2;
        void c2;
        Object d2 = xF3;
        Gg_1 b2 = this;
        return b2.J(c2.getX(), c2.getY(), c2.getZ(), d2.getX(), d2.getY(), d2.getZ(), (boolean)a2);
    }

    public float J() {
        Gg_1 a2;
        Gg_1 gg_1 = a2;
        return Ty.C[gg_1.F.J(gg_1.K.f())];
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mz mz2, XF xF2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        Gg_1 gg_1;
        void b2;
        Object c22 = xF2;
        Gg_1 a2 = this;
        if (!uw.x) {
            return uSa.E != 0;
        }
        if (!a2.E.J((XF)((Object)c22))) {
            return uSa.E != 0;
        }
        int n10 = uSa.E;
        if (!a2.J((XF)((Object)c22), yta.Ka, uSa.E != 0)) {
            return uSa.E != 0;
        }
        int n11 = uSa.E;
        int n12 = uSa.E;
        Gg_1 gg_12 = a2;
        Object object = c22;
        a2.H.J(vsa.t);
        int n13 = gg_12.J((Mz)b2, (XF)((Object)object));
        int n14 = gg_12.J((XF)((Object)object), (Mz)b2);
        Object object2 = c22;
        int c22 = object2.getX();
        int n15 = object2.getY();
        int n16 = object2.getZ();
        zz zz2 = new zz();
        if (n14 > n13) {
            Gg_1 gg_13 = a2;
            gg_1 = gg_13;
            gg_13.I[n12++] = Hta.o;
        } else {
            if (n14 < n13) {
                a2.I[n12++] = Hta.o | n13 << yOa.B;
                while (n11 < n12) {
                    ++n10;
                    n9 = a2.I[n11];
                    ++n11;
                    n8 = (n9 & Ssa.u) - fPa.i + c22;
                    n7 = (n9 >> uua.p & Ssa.u) - fPa.i + n15;
                    n6 = (n9 >> lqa.s & Ssa.u) - fPa.i + n16;
                    int n17 = n9 >> yOa.B & Ypa.A;
                    zz2.func_181079_c(n8, n7, n6);
                    n5 = a2.J((Mz)b2, (XF)zz2);
                    if (n5 != n17) continue;
                    a2.J((Mz)b2, (XF)zz2, uSa.E);
                    if (n17 <= 0 || (n4 = Oz.f((int)(n8 - c22))) + (n3 = Oz.f((int)(n7 - n15))) + (n2 = Oz.f((int)(n6 - n16))) >= yta.Ka) continue;
                    zz zz3 = new zz();
                    DZ[] dZArray = DZ.VALUES;
                    n13 = DZ.VALUES.length;
                    int n18 = uSa.E;
                    while (n18 < n13) {
                        DZ dZ2 = dZArray[n14];
                        int n19 = n8 + dZ2.getFrontOffsetX();
                        int n20 = n7 + dZ2.getFrontOffsetY();
                        int n21 = n6 + dZ2.getFrontOffsetZ();
                        zz3.func_181079_c(n19, n20, n21);
                        int n22 = Math.max(vRa.d, a2.J(zz3).J().C());
                        n5 = a2.J((Mz)b2, (XF)zz3);
                        if (n5 == n17 - n22 && n12 < a2.I.length) {
                            a2.I[n12++] = n19 - c22 + fPa.i | n20 - n15 + fPa.i << uua.p | n21 - n16 + fPa.i << lqa.s | n17 - n22 << yOa.B;
                        }
                        n18 = ++n14;
                    }
                }
                n11 = uSa.E;
            }
            gg_1 = a2;
        }
        gg_1.H.f();
        a2.H.J(WPa.e);
        while (n11 < n12) {
            int n23;
            Gg_1 gg_14 = a2;
            ++n10;
            n9 = gg_14.I[n11];
            ++n11;
            n8 = (n9 & Ssa.u) - fPa.i + c22;
            n7 = (n9 >> uua.p & Ssa.u) - fPa.i + n15;
            n6 = (n9 >> lqa.s & Ssa.u) - fPa.i + n16;
            zz zz4 = zz2.func_181079_c(n8, n7, n6);
            n5 = gg_14.J((Mz)b2, (XF)zz4);
            n4 = gg_14.J((XF)zz4, (Mz)b2);
            if (n4 == n5) continue;
            a2.J((Mz)b2, (XF)zz4, n4);
            if (n4 <= n5) continue;
            n3 = Math.abs(n8 - c22);
            n2 = Math.abs(n7 - n15);
            int n24 = Math.abs(n6 - n16);
            int n25 = n23 = n12 < a2.I.length - uua.p ? vRa.d : uSa.E;
            if (n3 + n2 + n24 >= yta.Ka || n23 == 0) continue;
            if (a2.J((Mz)b2, zz4.west()) < n4) {
                a2.I[n12++] = n8 - vRa.d - c22 + fPa.i + (n7 - n15 + fPa.i << uua.p) + (n6 - n16 + fPa.i << lqa.s);
            }
            if (a2.J((Mz)b2, zz4.east()) < n4) {
                a2.I[n12++] = n8 + vRa.d - c22 + fPa.i + (n7 - n15 + fPa.i << uua.p) + (n6 - n16 + fPa.i << lqa.s);
            }
            if (a2.J((Mz)b2, zz4.down()) < n4) {
                a2.I[n12++] = n8 - c22 + fPa.i + (n7 - vRa.d - n15 + fPa.i << uua.p) + (n6 - n16 + fPa.i << lqa.s);
            }
            if (a2.J((Mz)b2, zz4.up()) < n4) {
                a2.I[n12++] = n8 - c22 + fPa.i + (n7 + vRa.d - n15 + fPa.i << uua.p) + (n6 - n16 + fPa.i << lqa.s);
            }
            if (a2.J((Mz)b2, zz4.north()) < n4) {
                a2.I[n12++] = n8 - c22 + fPa.i + (n7 - n15 + fPa.i << uua.p) + (n6 - vRa.d - n16 + fPa.i << lqa.s);
            }
            if (a2.J((Mz)b2, zz4.south()) >= n4) continue;
            a2.I[n12++] = n8 - c22 + fPa.i + (n7 - n15 + fPa.i << uua.p) + (n6 + vRa.d - n16 + fPa.i << lqa.s);
        }
        Gg_1 gg_15 = a2;
        gg_15.E.J(n10);
        gg_15.H.f();
        return vRa.d != 0;
    }

    public XF J() {
        Gg_1 gg_1 = this;
        Object a2 = new XF(gg_1.K.C(), gg_1.K.e(), gg_1.K.f());
        if (!gg_1.J().J((XF)((Object)a2))) {
            Gg_1 gg_12 = gg_1;
            Gg_1 gg_13 = gg_1;
            a2 = gg_13.l(new XF(gg_13.J().D(), aSa.V, gg_1.J().C()));
        }
        return a2;
    }

    public int M() {
        Gg_1 a2;
        return a2.T;
    }

    /*
     * WARNING - void declaration
     */
    public uY J(XF xF2) {
        Gg_1 gg_1;
        uY uY2;
        int n2;
        Gg_1 b2;
        void a2;
        Gg_1 gg_12;
        block8: {
            gg_12 = this;
            if (!Gg_1.f((XF)a2)) {
                return null;
            }
            b2 = null;
            if (gg_12.q) {
                int n3 = n2 = uSa.E;
                while (n3 < gg_12.n.size()) {
                    uY2 = gg_12.n.get(n2);
                    if (!uY2.d() && uY2.J().equals(a2)) {
                        gg_1 = b2 = uY2;
                        break block8;
                    }
                    n3 = ++n2;
                }
            }
            gg_1 = b2;
        }
        if (gg_1 == null) {
            b2 = gg_12.J((XF)a2).J((XF)a2, oY.IMMEDIATE);
        }
        if (b2 == null) {
            int n4 = n2 = uSa.E;
            while (n4 < gg_12.n.size()) {
                uY2 = gg_12.n.get(n2);
                if (!uY2.d() && uY2.J().equals(a2)) {
                    b2 = uY2;
                    return b2;
                }
                n4 = ++n2;
            }
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void l(XF xF2) {
        int b2;
        Gg_1 gg_1 = this;
        int n2 = b2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            Vb vb2 = gg_1.d.get(b2);
            vb2.f((XF)a2);
            n2 = ++b2;
        }
    }

    public Lz f(float f2) {
        float f3;
        float f4;
        float f5;
        float a2;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        float f6 = Oz.C((float)(gg_12.e(a2) * pua.j * kta.v)) * kta.v + MQa.L;
        f6 = Oz.J((float)f6, (float)JPa.N, (float)pqa.r);
        float f7 = (float)(gg_12.W >> ERa.C & nua.u) / NQa.Y;
        float f8 = (float)(gg_12.W >> Yqa.i & nua.u) / NQa.Y;
        float f9 = (float)(gg_12.W & nua.u) / NQa.Y;
        float f10 = gg_12.J(a2);
        if (f5 > JPa.N) {
            f4 = (f7 * bpa.K + f8 * iSa.Ja + f9 * wsa.W) * Ora.D;
            float b2 = pqa.r - f10 * fsa.Ia;
            f7 = f7 * b2 + f4 * (pqa.r - b2);
            f8 = f8 * b2 + f4 * (pqa.r - b2);
            f9 = f9 * b2 + f4 * (pqa.r - b2);
        }
        f7 *= f6 * ATa.r + Nra.e;
        f8 *= f6 * ATa.r + Nra.e;
        f9 *= f6 * Sqa.g + VPa.i;
        f4 = gg_1.f(a2);
        if (f3 > JPa.N) {
            float b2 = (f7 * bpa.K + f8 * iSa.Ja + f9 * wsa.W) * psa.N;
            a2 = pqa.r - f4 * fsa.Ia;
            f7 = f7 * a2 + b2 * (pqa.r - a2);
            f8 = f8 * a2 + b2 * (pqa.r - a2);
            f9 = f9 * a2 + b2 * (pqa.r - a2);
        }
        return new Lz((double)f7, (double)f8, (double)f9);
    }

    /*
     * WARNING - void declaration
     */
    public void d(XF xF2, Block block) {
        Block c2 = block;
        Gg_1 a2 = this;
        if (a2.K.J() != Fy.A) {
            void b2;
            a2.f((XF)b2, c2);
        }
    }

    public abstract int e();

    /*
     * WARNING - void declaration
     */
    public void l(int n2, XF xF2, int n3) {
        int d2;
        Gg_1 gg_1 = this;
        int n4 = d2 = uSa.E;
        while (n4 < gg_1.d.size()) {
            void a2;
            void b2;
            void c2;
            gg_1.d.get(++d2).f((int)c2, (XF)b2, (int)a2);
            n4 = d2;
        }
    }

    public int d() {
        Gg_1 a2;
        Gg_1 gg_1 = a2;
        return gg_1.F.J(gg_1.K.f());
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, String string) {
        int c2;
        Gg_1 gg_1 = this;
        int n2 = c2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void b2;
            void a2;
            gg_1.d.get(++c2).J((String)a2, (XF)b2);
            n2 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(XF xF2, Mz mz2) {
        int n2;
        void b2;
        void a2;
        Gg_1 gg_1 = this;
        if (a2 == Mz.SKY && gg_1.j((XF)b2)) {
            return Ypa.A;
        }
        Object object = gg_1.J((XF)b2).J();
        int c2 = a2 == Mz.SKY ? uSa.E : ((Block)object).f();
        int n3 = ((Block)object).C();
        if (n3 >= Ypa.A && ((Block)object).f() > 0) {
            n3 = vRa.d;
        }
        if (n3 < vRa.d) {
            n3 = vRa.d;
        }
        if (n3 >= Ypa.A) {
            return uSa.E;
        }
        if (c2 >= hpa.Z) {
            return c2;
        }
        object = new zz();
        DZ[] dZArray = DZ.VALUES;
        int n4 = DZ.VALUES.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            DZ dZ2 = dZArray[n2];
            ((zz)((Object)object)).func_181079_c(b2.getX() + dZ2.getFrontOffsetX(), b2.getY() + dZ2.getFrontOffsetY(), b2.getZ() + dZ2.getFrontOffsetZ());
            int n6 = gg_1.J((Mz)a2, (XF)((Object)object)) - n3;
            if (n6 > c2) {
                c2 = n6;
            }
            if (c2 >= hpa.Z) {
                return c2;
            }
            n5 = ++n2;
        }
        return c2;
    }

    public void J(uY uY2) {
        Gg_1 b2 = uY2;
        Gg_1 a2 = this;
        a2.l.add((uY)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, String string, float f2, float f3) {
        int e2;
        Gg_1 gg_1 = this;
        int n2 = e2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void v1 = d2;
            gg_1.d.get(++e2).J((Sx)v1, (String)c2, v1.la, (double)d2.Z, (double)d2.A, (float)b2, (float)a2);
            n2 = e2;
        }
    }

    public float e(float f2) {
        Gg_1 a2;
        float b2 = f2;
        Gg_1 gg_1 = a2 = this;
        return gg_1.F.J(gg_1.K.f(), b2);
    }

    public int C() {
        return hra.Ja;
    }

    public boolean F(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.d((XF)((Object)b2), vRa.d != 0);
    }

    public boolean f() {
        return uSa.E != 0;
    }

    public void G() {
        int n2;
        int n3;
        Sx sx2;
        int n4;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        gg_12.b.clear();
        gg_12.H.J(Lra.Ha);
        int n5 = n4 = uSa.E;
        while (n5 < gg_1.w.size()) {
            Sx sx3 = sx2 = gg_1.w.get(n4);
            n3 = Oz.f((double)(sx3.la / Zta.ba));
            n2 = Oz.f((double)(sx3.A / Zta.ba));
            int a2 = gg_1.e();
            int n6 = -a2;
            while (n6 <= a2) {
                int n7;
                int n8 = -a2;
                while (n8 <= a2) {
                    int n9;
                    gg_1.b.add(new Baa(n7 + n3, n9++ + n2));
                    n8 = n9;
                }
                n6 = ++n7;
            }
            n5 = ++n4;
        }
        Gg_1 gg_13 = gg_1;
        gg_13.H.f();
        if (gg_13.k > 0) {
            gg_1.k -= vRa.d;
        }
        Gg_1 gg_14 = gg_1;
        gg_14.H.J(PRa.q);
        if (!gg_14.w.isEmpty()) {
            Gg_1 gg_15 = gg_1;
            n4 = gg_1.v.nextInt(gg_15.w.size());
            sx2 = gg_15.w.get(n4);
            n3 = Oz.f((double)sx2.la) + gg_1.v.nextInt(pPa.f) - tTa.h;
            Gg_1 gg_16 = gg_1;
            n2 = Oz.f((double)sx2.Z) + gg_16.v.nextInt(pPa.f) - tTa.h;
            int a2 = Oz.f((double)sx2.A) + gg_1.v.nextInt(pPa.f) - tTa.h;
            Gg_1 gg_17 = gg_1;
            gg_16.D(new XF(n3, n2, a2));
        }
        gg_1.H.f();
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, int n2) {
        void a2;
        Gg_1 b2;
        Object c22 = xF2;
        Gg_1 gg_1 = b2 = this;
        int n3 = gg_1.f(Mz.SKY, (XF)((Object)c22));
        int c22 = gg_1.f(Mz.BLOCK, (XF)((Object)c22));
        if (c22 < a2) {
            c22 = a2;
        }
        return n3 << kTa.j | c22 << AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public NZ J(vL vL2, double d2, double d3, double d4, float f2, boolean bl) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        boolean bl2 = bl;
        Gg_1 a2 = this;
        return a2.J((vL)f3, (double)e2, (double)d5, (double)c2, (float)b2, uSa.E != 0, (boolean)g2);
    }

    public void e(vL vL2) {
        Gg_1 b2 = vL2;
        Gg_1 a2 = this;
        Gg_1 gg_1 = b2;
        gg_1.k();
        if (gg_1 instanceof Sx) {
            a2.w.remove(b2);
            a2.C();
        }
        Gg_1 gg_12 = b2;
        int n2 = ((vL)gg_12).N;
        int n3 = ((vL)gg_12).L;
        if (((vL)gg_12).T && a2.J(n2, n3, vRa.d != 0)) {
            a2.J(n2, n3).J((vL)b2);
        }
        a2.Q.remove(b2);
        a2.d((vL)b2);
    }

    public void f(long a2) {
        Gg_1 b2;
        b2.K.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(Class<?> clazz) {
        Gg_1 gg_1 = this;
        int n2 = uSa.E;
        for (vL vL2 : gg_1.Q) {
            void a2;
            if (vL2 instanceof Yfa && ((Yfa)vL2).Q() || !a2.isAssignableFrom(vL2.getClass())) continue;
            ++n2;
        }
        return n2;
    }

    public Dha J(RIa rIa2) {
        Gg_1 b2 = rIa2;
        Gg_1 a2 = this;
        b2 = b2.J(Upa.t, vRa.d);
        b2.J(sqa.K, a2.K == null ? UOa.I : a2.K.f());
        Gg_1 gg_1 = b2;
        gg_1.J(XOa.fa, (Callable)new Eaa((Gg)a2));
        gg_1.J(Sqa.Ia, (Callable)new EX((Gg)a2));
        try {
            a2.K.J((Dha)b2);
            return b2;
        }
        catch (Throwable throwable) {
            Gg_1 gg_12 = b2;
            gg_12.J(Mqa.R, throwable);
            return gg_12;
        }
    }

    public boolean J(uY uY2) {
        Gg_1 b2 = uY2;
        Gg_1 a2 = this;
        boolean bl = a2.D.add((uY)b2);
        if (bl && b2 instanceof rd) {
            a2.o.add((uY)b2);
        }
        return bl;
    }

    public void l(Collection<vL> collection) {
        Iterator b2 = collection;
        Gg_1 a2 = this;
        a2.Q.addAll((Collection<vL>)((Object)b2));
        b2 = b2.iterator();
        Iterator iterator = b2;
        while (iterator.hasNext()) {
            vL vL2 = (vL)b2.next();
            iterator = b2;
            a2.J(vL2);
        }
    }

    public void D() {
    }

    public boolean k(XF xF2) {
        Gg_1 a2 = this;
        Object b2 = xF2;
        if (a2.f(((XF)((Object)b2)).down(), DZ.DOWN) > 0) {
            return vRa.d != 0;
        }
        if (a2.f(((XF)((Object)b2)).up(), DZ.UP) > 0) {
            return vRa.d != 0;
        }
        if (a2.f(((XF)((Object)b2)).north(), DZ.NORTH) > 0) {
            return vRa.d != 0;
        }
        if (a2.f(((XF)((Object)b2)).south(), DZ.SOUTH) > 0) {
            return vRa.d != 0;
        }
        if (a2.f(((XF)((Object)b2)).west(), DZ.WEST) > 0) {
            return vRa.d != 0;
        }
        if (a2.f(((XF)((Object)b2)).east(), DZ.EAST) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public hd f() {
        Gg_1 a2;
        return a2.p;
    }

    public int J(XF xF2, boolean bl) {
        Object c2 = xF2;
        Gg_1 b2 = this;
        if (c2.getX() >= lQa.s && c2.getZ() >= lQa.s && c2.getX() < RPa.Da && c2.getZ() < RPa.Da) {
            int a22;
            if (a22 != 0 && b2.J((XF)((Object)c2)).J().D()) {
                Gg_1 gg_1 = b2;
                Gg_1 gg_12 = c2;
                Gg_1 gg_13 = b2;
                a22 = gg_13.J(((XF)((Object)c2)).up(), uSa.E != 0);
                int n2 = gg_13.J(((XF)((Object)c2)).east(), uSa.E != 0);
                int n3 = b2.J(((XF)((Object)gg_12)).west(), uSa.E != 0);
                int n4 = gg_1.J(((XF)((Object)gg_12)).south(), uSa.E != 0);
                int n5 = gg_1.J(((XF)((Object)c2)).north(), uSa.E != 0);
                if (n2 > a22) {
                    a22 = n2;
                }
                if (n3 > a22) {
                    a22 = n3;
                }
                if (n4 > a22) {
                    a22 = n4;
                }
                if (n5 > a22) {
                    a22 = n5;
                }
                return a22;
            }
            if (c2.getY() < 0) {
                return uSa.E;
            }
            if (c2.getY() >= hra.Ja) {
                c2 = new XF(c2.getX(), osa.Ja, c2.getZ());
            }
            Faa a22 = b2.J((XF)((Object)c2));
            return a22.J((XF)((Object)c2), b2.B);
        }
        return Ypa.A;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, boolean bl, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        int j2;
        Gg_1 gg_1 = this;
        int n3 = j2 = uSa.E;
        while (n3 < gg_1.d.size()) {
            void a2;
            void b2;
            void c2;
            void d8;
            void e2;
            void f2;
            void g2;
            void h2;
            void i2;
            gg_1.d.get(++j2).J((int)i2, (boolean)h2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
            n3 = j2;
        }
    }

    public int C(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J((XF)((Object)b2), vRa.d != 0);
    }

    public IBlockState J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        if (!Gg_1.f((XF)((Object)b2))) {
            return QFa.HF.J();
        }
        return a2.J((XF)((Object)b2)).J((XF)((Object)b2));
    }

    public void J(XF xF2, Block block, int n2) {
        int d2 = n2;
        Gg_1 gg_1 = this;
    }

    /*
     * WARNING - void declaration
     */
    public List<xy> J(xy xy2) {
        void a2;
        Gg_1 gg_1 = this;
        ArrayList<xy> arrayList = Lists.newArrayList();
        void v0 = a2;
        int b2 = Oz.f((double)v0.J);
        int n2 = Oz.f((double)(v0.A + oua.i));
        int n3 = Oz.f((double)v0.j);
        int n4 = Oz.f((double)(v0.M + oua.i));
        int n5 = Oz.f((double)v0.I);
        int n6 = Oz.f((double)(v0.k + oua.i));
        zz zz2 = new zz();
        int n7 = b2 = b2;
        while (n7 < n2) {
            int n8 = n5;
            while (n8 < n6) {
                int n9;
                if (gg_1.F(zz2.func_181079_c(b2, ysa.s, n9))) {
                    int n10 = n3 - vRa.d;
                    while (n10 < n4) {
                        IBlockState iBlockState;
                        int n11;
                        int n12 = b2;
                        zz2.func_181079_c(n12, n11, n9);
                        (n12 >= lQa.s && b2 < RPa.Da && n9 >= lQa.s && n9 < RPa.Da ? gg_1.J(zz2) : QFa.bg.J()).J().J((Gg)gg_1, zz2, iBlockState, (xy)a2, arrayList, null);
                        n10 = ++n11;
                    }
                }
                n8 = ++n9;
            }
            n7 = ++b2;
        }
        return arrayList;
    }

    public boolean J(Xv xv2) {
        Gg_1 b2 = xv2;
        Gg_1 a2 = this;
        return a2.J((Xv)b2, vRa.d != 0);
    }

    public yz J() {
        Gg_1 a2;
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, DZ dZ2) {
        void a2;
        void b2;
        Gg_1 gg_1 = this;
        IBlockState c2 = gg_1.J((XF)b2);
        return c2.J().f(gg_1, (XF)b2, c2, (DZ)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block, XF xF3) {
        Object d222 = xF2;
        Gg_1 c2 = this;
        if (!c2.e) {
            void a2;
            void b2;
            IBlockState iBlockState = c2.J((XF)((Object)d222));
            try {
                iBlockState.J().J(iBlockState, (Gg)c2, (XF)((Object)d222), (Block)b2, (XF)a2);
                return;
            }
            catch (Throwable d222) {
                Dha dha;
                RIa d222 = RIa.J((Throwable)d222, (String)Cra.E);
                Dha dha2 = dha = d222.J(eta.fa);
                dha2.J(XOa.Aa, (Callable)new TX((Gg)c2, (Block)b2));
                Dha.J((Dha)dha2, (XF)a2, (IBlockState)iBlockState);
                throw new MZ(d222);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public NZ J(vL vL2, double d2, double d3, double d4, float f2, boolean bl, boolean bl2) {
        void h2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g2;
        boolean bl3 = bl2;
        Gg_1 a2 = this;
        NZ nZ2 = new NZ((Gg)a2, (vL)g2, (double)f3, (double)e2, (double)d5, (float)c2, (boolean)b2, (boolean)h2);
        nZ2.J();
        nZ2.J(vRa.d != 0);
        return nZ2;
    }

    public boolean J(boolean bl) {
        boolean b2 = bl;
        Gg_1 a2 = this;
        return uSa.E != 0;
    }

    public void J(double d2, double d3, double d4, String string, float f2, float f3, boolean bl) {
        boolean bl2 = bl;
        Gg_1 a2 = this;
    }

    public int l() {
        Gg_1 a2;
        if (a2.F.f()) {
            return XOa.h;
        }
        return hra.Ja;
    }

    /*
     * WARNING - void declaration
     */
    public KZ J(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        long l2 = nqa.i;
        float b2 = JPa.N;
        if (gg_1.F((XF)a2)) {
            Gg_1 gg_12 = gg_1;
            b2 = gg_12.J();
            l2 = gg_12.J((XF)a2).J();
        }
        return new KZ(gg_1.J(), gg_1.f(), l2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, IBlockState iBlockState, int n2) {
        void a2;
        IBlockState b2;
        Object d2 = xF2;
        Gg_1 c2 = this;
        if (!Gg_1.f((XF)((Object)d2))) {
            return uSa.E != 0;
        }
        if (!c2.e && c2.K.J() == Fy.A) {
            return uSa.E != 0;
        }
        Faa faa2 = c2.J((XF)((Object)d2));
        Block block = b2.J();
        if ((b2 = faa2.J((XF)((Object)d2), b2)) == null) {
            return uSa.E != 0;
        }
        Block block2 = b2.J();
        if (block.C() != block2.C() || block.f() != block2.f()) {
            c2.H.J(NQa.Ia);
            c2.D((XF)((Object)d2));
            c2.H.f();
        }
        if ((a2 & uqa.g) != 0 && (!c2.e || (a2 & AQa.P) == 0) && faa2.l()) {
            c2.C((XF)((Object)d2));
        }
        if (!c2.e && (a2 & vRa.d) != 0) {
            Block block3 = block;
            c2.d((XF)((Object)d2), b2.J());
            c2.C((XF)((Object)d2), block3);
            if (block3.F()) {
                c2.J((XF)((Object)d2), block);
            }
        } else if (!c2.e && (a2 & ERa.C) == 0) {
            c2.C((XF)((Object)d2), block);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2) {
        void b2;
        Gg_1 a2;
        boolean c2 = bl2;
        Gg_1 gg_1 = a2 = this;
        gg_1.m = b2;
        gg_1.R = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void C(XF xF2, Block block) {
        void a2;
        Gg_1 b2;
        XF c2 = xF2;
        Gg_1 gg_1 = b2 = this;
        XF xF3 = c2;
        Gg_1 gg_12 = b2;
        XF xF4 = c2;
        b2.J(xF4.west(), (Block)a2, c2);
        gg_12.J(xF4.east(), (Block)a2, c2);
        gg_12.J(c2.down(), (Block)a2, c2);
        b2.J(xF3.up(), (Block)a2, c2);
        gg_1.J(xF3.north(), (Block)a2, c2);
        gg_1.J(c2.south(), (Block)a2, c2);
    }

    public Faa J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public boolean f(vL vL2) {
        Gg_1 b2 = vL2;
        Gg_1 a2 = this;
        Gg_1 gg_1 = b2;
        int n2 = Oz.f((double)(((vL)gg_1).la / Zta.ba));
        int n3 = Oz.f((double)(((vL)gg_1).A / Zta.ba));
        int n4 = ((vL)gg_1).k;
        if (gg_1 instanceof Sx) {
            n4 = vRa.d;
        }
        if (n4 == 0 && !a2.J(n2, n3, vRa.d != 0)) {
            return uSa.E != 0;
        }
        if (b2 instanceof Sx) {
            Sx sx2 = (Sx)((Object)b2);
            a2.w.add(sx2);
            a2.C();
        }
        Gg_1 gg_12 = a2;
        gg_12.J(n2, n3).f((vL)b2);
        gg_12.Q.add((vL)b2);
        a2.J((vL)b2);
        return vRa.d != 0;
    }

    public boolean e() {
        Gg_1 a2;
        if (a2.B < AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> List<T> J(Class<? extends T> clazz, xy xy2, Predicate<? super T> predicate) {
        void b2;
        Gg_1 gg_1 = this;
        void v0 = b2;
        int d2 = Oz.f((double)((v0.J - KPa.y) / Zta.ba));
        int n2 = Oz.f((double)((v0.A + KPa.y) / Zta.ba));
        int n3 = Oz.f((double)((v0.I - KPa.y) / Zta.ba));
        int n4 = Oz.f((double)((v0.k + KPa.y) / Zta.ba));
        ArrayList arrayList = Lists.newArrayList();
        int n5 = d2 = d2;
        while (n5 <= n2) {
            int n6 = n3;
            while (n6 <= n4) {
                int n7;
                if (gg_1.J(d2, n7, vRa.d != 0)) {
                    void a2;
                    void c2;
                    gg_1.J(d2, n7).J((Class)c2, (xy)b2, arrayList, (Predicate)a2);
                }
                n6 = ++n7;
            }
            n5 = ++d2;
        }
        return arrayList;
    }

    public int f() {
        Gg_1 a2;
        return a2.O;
    }

    /*
     * WARNING - void declaration
     */
    public Gg_1(XB xB2, vU vU2, Ty ty2, gda gda2, boolean bl) {
        void a2;
        void d2;
        void b2;
        void e2;
        Gg_1 c2;
        Ty f2 = ty2;
        Gg_1 gg_1 = c2 = this;
        Gg_1 gg_12 = c2;
        Gg_1 gg_13 = c2;
        Gg_1 gg_14 = c2;
        c2.T = Ssa.u;
        c2.Q = Lists.newArrayList();
        c2.t = Lists.newArrayList();
        c2.D = Lists.newArrayList();
        c2.o = Lists.newArrayList();
        c2.n = Lists.newArrayList();
        c2.l = Lists.newArrayList();
        c2.w = Lists.newArrayList();
        c2.J = Lists.newArrayList();
        Gg_1 gg_15 = c2;
        c2.f = new OX();
        c2.W = opa.R;
        c2.u = new Random().nextInt();
        c2.C = jRa.ja;
        c2.v = new Random();
        c2.d = Lists.newArrayList();
        c2.N = Calendar.getInstance();
        c2.x = new qca();
        c2.b = Sets.newHashSet();
        c2.E = new Nv();
        gg_14.h = null;
        gg_14.k = c2.v.nextInt(zsa.P);
        gg_14.m = vRa.d;
        gg_14.R = vRa.d;
        gg_14.I = new int[CRa.Y];
        gg_13.M = e2;
        gg_13.H = b2;
        gg_12.K = d2;
        gg_12.F = f2;
        gg_1.e = a2;
        gg_1.c = f2.J();
    }

    public static boolean J(I i2, XF xF2) {
        IBlockState a2;
        I i3 = i2;
        Block b2 = (a2 = i3.J((XF)((Object)a2))).J();
        if (b2.J().J() && b2.l()) {
            return vRa.d != 0;
        }
        if (b2 instanceof BlockStairs) {
            if (a2.J(BlockStairs.HALF) == BlockStairs$EnumHalf.TOP) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof BlockSlab) {
            if (a2.J(BlockSlab.HALF) == BlockSlab$EnumBlockHalf.TOP) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 instanceof BlockHopper) {
            return vRa.d != 0;
        }
        if (b2 instanceof BlockSnow) {
            if (a2.J(BlockSnow.LAYERS) == XTa.W) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, String string, float f2, float f3) {
        int e2;
        Gg_1 gg_1 = this;
        int n2 = e2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            void b2;
            void d2;
            void c2;
            gg_1.d.get(++e2).J((String)c2, d2.la, d2.Z, d2.A, (float)b2, (float)a2);
            n2 = e2;
        }
    }

    public boolean G(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J((XF)((Object)b2), QFa.HF.J(), yRa.d);
    }

    public abstract hd J();

    public void J(vL vL2, byte by2) {
        byte c2 = by2;
        Gg_1 gg_1 = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, XF xF2, DZ dZ2) {
        void a2;
        Object d2 = xF2;
        Gg_1 b2 = this;
        if (b2.J((XF)((Object)(d2 = ((XF)((Object)d2)).offset((DZ)a2)))).J() == QFa.ic) {
            void c2;
            Gg_1 gg_1 = b2;
            gg_1.J((Sx)c2, ZSa.l, (XF)((Object)d2), uSa.E);
            gg_1.G((XF)((Object)d2));
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, XF xF3) {
        void b2;
        Object c2 = xF3;
        Gg_1 a2 = this;
        return a2.J((XF)b2, (XF)((Object)c2), vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, boolean bl) {
        void a2;
        void c2;
        int d2 = n3;
        Gg_1 b2 = this;
        if (b2.p.J((int)c2, d2) && (a2 != false || !b2.p.J((int)c2, d2).f())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean D(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        int b2 = uSa.E;
        if (!gg_1.F.f()) {
            b2 |= gg_1.J(Mz.SKY, (XF)a2);
        }
        return (b2 |= gg_1.J(Mz.BLOCK, (XF)a2)) != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        void e2;
        void b2;
        int n6 = n5;
        Gg_1 a2 = this;
        if (b2 > e2) {
            void v0 = e2;
            e2 = b2;
            b2 = v0;
        }
        if (!a2.F.f()) {
            void var5_7;
            void v1 = var5_7 = b2;
            while (v1 <= e2) {
                a2.J(Mz.SKY, new XF((int)d2, (int)var5_7++, (int)c2));
                v1 = var5_7;
            }
        }
        void v2 = d2;
        a2.J((int)v2, (int)b2, (int)c2, (int)v2, (int)e2, (int)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void d(vL vL2) {
        int b2;
        Gg_1 gg_1 = this;
        int n2 = b2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            Vb vb2 = gg_1.d.get(b2);
            vb2.f((vL)a2);
            n2 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Vx J(Class<? extends Vx> clazz, String string) {
        void b2;
        String c2 = string;
        Gg_1 a2 = this;
        return a2.i.J((Class)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(XF xF2, Block block) {
        Gg_1 gg_1 = this;
        if (!gg_1.e) {
            void a2;
            void b2;
            IBlockState iBlockState = gg_1.J((XF)b2);
            try {
                iBlockState.J().J((Gg)gg_1, (XF)b2, iBlockState, (Block)a2);
                return;
            }
            catch (Throwable c22) {
                Dha dha;
                RIa c22 = RIa.J((Throwable)c22, (String)Cra.E);
                Dha dha2 = dha = c22.J(eta.fa);
                dha2.J(XOa.Aa, (Callable)new fX((Gg)gg_1, (Block)a2));
                Dha.J((Dha)dha2, (XF)b2, (IBlockState)iBlockState);
                throw new MZ(c22);
            }
        }
    }

    public float d(float f2) {
        float b2 = f2;
        Gg_1 a2 = this;
        return a2.e(b2) * pua.j * kta.v;
    }

    public boolean A(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J((XF)((Object)b2)).C();
    }

    /*
     * WARNING - void declaration
     */
    public Sx J(String string) {
        int n2;
        Gg_1 gg_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < gg_1.w.size()) {
            void a2;
            Object b2 = gg_1.w.get(n2);
            if (a2.equals(((Sx)((Object)b2)).J())) {
                return b2;
            }
            n3 = ++n2;
        }
        return null;
    }

    public void J(long a2) {
        Gg_1 b2;
        b2.K.f(a2);
    }

    public XF l(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        int n2 = b2.getX() >= lQa.s && b2.getZ() >= lQa.s && b2.getX() < RPa.Da && b2.getZ() < RPa.Da ? (a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P, vRa.d != 0) ? a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P).J(b2.getX() & Ypa.A, b2.getZ() & Ypa.A) : uSa.E) : a2.M() + vRa.d;
        return new XF(b2.getX(), n2, b2.getZ());
    }

    public boolean C(xy xy2) {
        Gg_1 b22 = xy2;
        Gg_1 a2 = this;
        Gg_1 gg_1 = b22;
        int b22 = Oz.f((double)((xy)gg_1).J);
        int n2 = Oz.f((double)((xy)gg_1).A);
        int n3 = Oz.f((double)((xy)gg_1).j);
        int n4 = Oz.f((double)((xy)gg_1).M);
        int n5 = Oz.f((double)((xy)gg_1).I);
        int n6 = Oz.f((double)((xy)gg_1).k);
        zz zz2 = new zz();
        int n7 = b22 = b22;
        while (n7 <= n2) {
            int n8 = n3;
            while (n8 <= n4) {
                int n9;
                int n10 = n5;
                while (n10 <= n6) {
                    int n11;
                    if (a2.J(zz2.func_181079_c(b22, n9, n11)).J().J().l()) {
                        return vRa.d != 0;
                    }
                    n10 = ++n11;
                }
                n8 = ++n9;
            }
            n7 = ++b22;
        }
        return uSa.E != 0;
    }

    public void A() {
        Gg_1 a2;
        if (a2.K.f()) {
            a2.G = pqa.r;
            if (a2.K.J()) {
                a2.s = pqa.r;
            }
        }
    }

    public String f() {
        Gg_1 a2;
        return a2.p.J();
    }

    public boolean l(xy xy2) {
        Gg_1 b2 = xy2;
        Gg_1 a2 = this;
        return a2.J((xy)b2, (vL)null);
    }

    public qca J() {
        Gg_1 a2;
        return a2.x;
    }

    public boolean f(xy xy2) {
        Gg_1 b22 = xy2;
        Gg_1 a2 = this;
        Gg_1 gg_1 = b22;
        int b22 = Oz.f((double)((xy)gg_1).J);
        int n2 = Oz.f((double)((xy)gg_1).A);
        int n3 = Oz.f((double)((xy)gg_1).j);
        int n4 = Oz.f((double)((xy)gg_1).M);
        int n5 = Oz.f((double)((xy)gg_1).I);
        int n6 = Oz.f((double)((xy)gg_1).k);
        zz zz2 = new zz();
        int n7 = b22 = b22;
        while (n7 <= n2) {
            int n8 = n3;
            while (n8 <= n4) {
                int n9;
                int n10 = n5;
                while (n10 <= n6) {
                    int n11;
                    if (a2.J(zz2.func_181079_c(b22, n9, n11)).J().J() != Material.air) {
                        return vRa.d != 0;
                    }
                    n10 = ++n11;
                }
                n8 = ++n9;
            }
            n7 = ++b22;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(xy xy2, Material material) {
        Gg_1 c22 = xy2;
        Gg_1 b2 = this;
        Gg_1 gg_1 = c22;
        int c22 = Oz.f((double)((xy)gg_1).J);
        int n2 = Oz.f((double)(((xy)gg_1).A + oua.i));
        int n3 = Oz.f((double)((xy)gg_1).j);
        int n4 = Oz.f((double)(((xy)gg_1).M + oua.i));
        int n5 = Oz.f((double)((xy)gg_1).I);
        int n6 = Oz.f((double)(((xy)gg_1).k + oua.i));
        zz zz2 = new zz();
        int n7 = c22 = c22;
        while (n7 < n2) {
            int n8 = n3;
            while (n8 < n4) {
                int n9;
                int n10 = n5;
                while (n10 < n6) {
                    void a2;
                    int n11;
                    if (b2.J(zz2.func_181079_c(c22, n9, n11)).J().J() == a2) {
                        return vRa.d != 0;
                    }
                    n10 = ++n11;
                }
                n8 = ++n9;
            }
            n7 = ++c22;
        }
        return uSa.E != 0;
    }

    public void C(vL vL2) {
        Gg_1 b2 = vL2;
        Gg_1 a2 = this;
        if (((vL)b2).Aa != null) {
            ((vL)b2).Aa.l((vL)null);
        }
        if (((vL)b2).ja != null) {
            b2.l(null);
        }
        Gg_1 gg_1 = b2;
        gg_1.k();
        if (gg_1 instanceof Sx) {
            a2.w.remove(b2);
            Gg_1 gg_12 = a2;
            gg_12.C();
            gg_12.d((vL)b2);
        }
    }

    public String J() {
        Gg_1 a2;
        return new StringBuilder().insert(3 & 4, Sqa.J).append(a2.Q.size()).toString();
    }

    public List<vL> J() {
        Gg_1 a2;
        return a2.Q;
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        Gg_1 b2 = gg_1.J((XF)a2);
        if (b2 != null && gg_1.q) {
            b2.d();
            gg_1.n.remove(b2);
            return;
        }
        if (b2 != null) {
            gg_1.n.remove(b2);
            gg_1.D.remove(b2);
            gg_1.o.remove(b2);
        }
        gg_1.J((XF)a2).J((XF)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Block block, XF xF2, Random random) {
        void c2;
        void b2;
        Random d2 = random;
        Gg_1 a2 = this;
        a2.g = vRa.d;
        void v0 = b2;
        c2.f((Gg)a2, (XF)v0, a2.J((XF)v0), d2);
        a2.g = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, XF xF2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Gg_1 a2 = this;
        a2.J((Sx)null, (int)c2, (XF)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public int f(Mz mz2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Gg_1 a2 = this;
        if (a2.F.f() && b2 == Mz.SKY) {
            return uSa.E;
        }
        if (c2.getY() < 0) {
            c2 = new XF(c2.getX(), uSa.E, c2.getZ());
        }
        if (!Gg_1.f((XF)((Object)c2))) {
            return b2.defaultLightValue;
        }
        if (!a2.F((XF)((Object)c2))) {
            return b2.defaultLightValue;
        }
        if (a2.J((XF)((Object)c2)).J().D()) {
            Gg_1 gg_1 = a2;
            void v1 = b2;
            Gg_1 gg_12 = a2;
            int n2 = gg_12.J((Mz)b2, ((XF)((Object)c2)).up());
            int n3 = gg_12.J((Mz)b2, ((XF)((Object)c2)).east());
            int n4 = a2.J((Mz)v1, ((XF)((Object)c2)).west());
            int n5 = gg_1.J((Mz)v1, ((XF)((Object)c2)).south());
            int n6 = gg_1.J((Mz)b2, ((XF)((Object)c2)).north());
            if (n3 > n2) {
                n2 = n3;
            }
            if (n4 > n2) {
                n2 = n4;
            }
            if (n5 > n2) {
                n2 = n5;
            }
            if (n6 > n2) {
                n2 = n6;
            }
            return n2;
        }
        Faa faa2 = a2.J((XF)((Object)c2));
        return faa2.J((Mz)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mz mz2, XF xF2, int n2) {
        Object d2 = xF2;
        Gg_1 b2 = this;
        if (Gg_1.f((XF)((Object)d2)) && b2.F((XF)((Object)d2))) {
            void a2;
            void c2;
            Gg_1 gg_1 = b2;
            gg_1.J((XF)((Object)d2)).J((Mz)c2, (XF)((Object)d2), (int)a2);
            gg_1.l((XF)((Object)d2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(UZ uZ, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        Gg_1 i2 = uZ;
        Gg_1 h2 = this;
        h2.J(i2.getParticleID(), i2.getShouldIgnoreRange(), (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
    }

    public Block J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        b2 = new XF(b2.getX(), a2.M(), b2.getZ());
        Gg_1 gg_1 = a2;
        while (!gg_1.J(((XF)((Object)b2)).up())) {
            b2 = ((XF)((Object)b2)).up();
            gg_1 = a2;
        }
        return a2.J((XF)((Object)b2)).J();
    }

    /*
     * WARNING - void declaration
     */
    public float C(float f2) {
        void a2;
        Gg_1 gg_1 = this;
        float b2 = gg_1.e((float)a2);
        b2 = pqa.r - (Oz.C((float)(b2 * pua.j * kta.v)) * kta.v + psa.N);
        b2 = Oz.J((float)b2, (float)JPa.N, (float)pqa.r);
        b2 = pqa.r - b2;
        b2 = (float)((double)b2 * (oua.i - (double)(gg_1.J((float)a2) * eua.C) / Zta.ba));
        b2 = (float)((double)b2 * (oua.i - (double)(gg_1.f((float)a2) * eua.C) / Zta.ba));
        return b2 * xSa.la + psa.N;
    }

    /*
     * WARNING - void declaration
     */
    public float J(Lz lz2, xy xy2) {
        Gg_1 c2 = xy2;
        Gg_1 a2 = this;
        double d2 = oua.i / ((((xy)c2).A - ((xy)c2).J) * KPa.y + oua.i);
        double d3 = oua.i / ((((xy)c2).M - ((xy)c2).j) * KPa.y + oua.i);
        double d4 = oua.i / ((((xy)c2).k - ((xy)c2).I) * KPa.y + oua.i);
        double d5 = (oua.i - Math.floor(oua.i / d2) * d2) / KPa.y;
        double d6 = (oua.i - Math.floor(oua.i / d4) * d4) / KPa.y;
        if (d2 >= aSa.V && d3 >= aSa.V && d4 >= aSa.V) {
            float f2;
            int n2 = uSa.E;
            int n3 = uSa.E;
            float f3 = f2 = JPa.N;
            while (f3 <= pqa.r) {
                float f4 = JPa.N;
                while (f4 <= pqa.r) {
                    float f5;
                    float f6 = JPa.N;
                    while (f6 <= pqa.r) {
                        void b2;
                        float f7;
                        Gg_1 gg_1 = c2;
                        Gg_1 gg_12 = c2;
                        double d7 = ((xy)gg_1).J + (((xy)gg_12).A - ((xy)c2).J) * (double)f2;
                        double d8 = ((xy)gg_12).j + (((xy)c2).M - ((xy)c2).j) * (double)f5;
                        double d9 = ((xy)gg_1).I + (((xy)c2).k - ((xy)c2).I) * (double)f7;
                        if (a2.J(new Lz(d7 + d5, d8, d9 + d6), (Lz)b2) == null) {
                            ++n2;
                        }
                        ++n3;
                        f6 = (float)((double)f7 + d4);
                    }
                    f4 = (float)((double)f5 + d3);
                }
                f3 = (float)((double)f2 + d2);
            }
            return (float)n2 / (float)n3;
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public RY J(Lz lz2, Lz lz3, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        Gg_1 a2 = this;
        return a2.J((Lz)c2, (Lz)b2, d2, uSa.E != 0, uSa.E != 0);
    }

    public boolean i(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        if (!a2.l()) {
            return uSa.E != 0;
        }
        if (!a2.j((XF)((Object)b2))) {
            return uSa.E != 0;
        }
        if (a2.J((XF)((Object)b2)).getY() > b2.getY()) {
            return uSa.E != 0;
        }
        Jy jy2 = a2.J((XF)((Object)b2));
        if (jy2.l()) {
            return uSa.E != 0;
        }
        if (a2.C((XF)((Object)b2), uSa.E != 0)) {
            return uSa.E != 0;
        }
        return jy2.J();
    }

    public Fy J() {
        Gg_1 a2;
        return a2.K.J();
    }

    public Gg J() {
        Gg_1 a2;
        return a2;
    }

    public boolean M(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.l((XF)((Object)b2), vRa.d != 0);
    }

    public boolean J(XF xF2) {
        Gg_1 a2 = this;
        Object b2 = xF2;
        if (a2.J((XF)((Object)b2)).J().J() == Material.air) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(int n2) {
        int b2 = n2;
        Gg_1 a2 = this;
        a2.B = b2;
    }

    public int J() {
        Gg_1 a2;
        return a2.B;
    }

    /*
     * WARNING - void declaration
     */
    public XF J(String string, XF xF2) {
        void b2;
        Object c2 = xF2;
        Gg_1 a2 = this;
        return a2.f().J((Gg)a2, (String)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(PX pX2, vL vL2) {
        Gg_1 gg_1;
        void b2;
        Gg_1 c2 = vL2;
        Gg_1 a2 = this;
        void v0 = b2;
        double d2 = v0.J();
        double d3 = v0.e();
        double d4 = v0.i();
        double d5 = v0.d();
        if (c2.D()) {
            d2 += oua.i;
            d3 += oua.i;
            d4 -= oua.i;
            d5 -= oua.i;
            gg_1 = c2;
        } else {
            d2 -= oua.i;
            d3 -= oua.i;
            d4 += oua.i;
            d5 += oua.i;
            gg_1 = c2;
        }
        if (((vL)gg_1).la > d2 && ((vL)c2).la < d4 && ((vL)c2).A > d3 && ((vL)c2).A < d5) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public PX J() {
        Gg_1 a2;
        return a2.c;
    }

    /*
     * WARNING - void declaration
     */
    public boolean C(XF xF2, boolean bl) {
        void a2;
        Gg_1 b2 = this;
        Object c2 = xF2;
        if (b2.J((XF)((Object)c2)).J((XF)((Object)c2)) > VPa.i) {
            return uSa.E != 0;
        }
        if (a2 == false) {
            return vRa.d != 0;
        }
        if (c2.getY() >= 0 && c2.getY() < hra.Ja && b2.J(Mz.BLOCK, (XF)((Object)c2)) < NTa.C && b2.J((XF)((Object)c2)).J().J() == Material.air && QFa.gC.J((Gg)b2, (XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l(XF xF2, boolean bl) {
        IBlockState iBlockState;
        Block block;
        Gg_1 b2 = this;
        Object c2 = xF2;
        if (b2.J((XF)((Object)c2)).J((XF)((Object)c2)) > VPa.i) {
            return uSa.E != 0;
        }
        if (c2.getY() >= 0 && c2.getY() < hra.Ja && b2.J(Mz.BLOCK, (XF)((Object)c2)) < NTa.C && ((block = (iBlockState = b2.J((XF)((Object)c2))).J()) == QFa.sc || block == QFa.jd) && iBlockState.J(BlockLiquid.LEVEL) == 0) {
            int a2;
            if (a2 == 0) {
                return vRa.d != 0;
            }
            int n2 = a2 = b2.e(((XF)((Object)c2)).west()) && b2.e(((XF)((Object)c2)).east()) && b2.e(((XF)((Object)c2)).north()) && b2.e(((XF)((Object)c2)).south()) ? vRa.d : uSa.E;
            if (a2 == 0) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, XF xF2, int n3) {
        int d2;
        Gg_1 gg_1 = this;
        int n4 = d2 = uSa.E;
        while (n4 < gg_1.d.size()) {
            void a2;
            void b2;
            void c2;
            gg_1.d.get(++d2).J((int)c2, (XF)b2, (int)a2);
            n4 = d2;
        }
    }

    public qV J() {
        Gg_1 a2;
        return a2.i;
    }

    private boolean e(XF xF2) {
        Gg_1 a2 = this;
        Object b2 = xF2;
        if (a2.J((XF)((Object)b2)).J().J() == Material.water) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void l(vL vL2) {
        int n2;
        void a2;
        Gg_1 gg_1 = this;
        void v0 = a2;
        int n3 = Oz.f((double)(v0.la / Zta.ba));
        int n4 = Oz.f((double)(v0.A / Zta.ba));
        int b2 = uqa.g;
        int n5 = n2 = n3 - b2;
        while (n5 <= n3 + b2) {
            int n6 = n4 - b2;
            while (n6 <= n4 + b2) {
                int n7;
                gg_1.J(n2, n7++);
                n6 = n7;
            }
            n5 = ++n2;
        }
        if (!gg_1.Q.contains(a2)) {
            gg_1.Q.add((vL)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2, Block block) {
        void b2;
        Gg_1 a2;
        Block c2 = block;
        Gg_1 gg_1 = a2 = this;
        void v1 = b2;
        Gg_1 gg_12 = a2;
        void v3 = b2;
        a2.l(v3.west(), c2);
        gg_12.l(v3.east(), c2);
        gg_12.l(b2.down(), c2);
        a2.l(v1.up(), c2);
        gg_1.l(v1.north(), c2);
        gg_1.l(b2.south(), c2);
    }

    /*
     * WARNING - void declaration
     */
    public Random J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Gg_1 a2 = this;
        long l2 = (long)c2 * ysa.f + (long)b2 * Iqa.a + a2.J().C() + (long)d2;
        Gg_1 gg_1 = a2;
        gg_1.v.setSeed(l2);
        return gg_1.v;
    }

    public void J(double d2, double d3, double d4, double d5, double d6, double d7, Waa waa2) {
        Gg_1 gg_1 = gg_12;
        Gg_1 gg_12 = waa2;
        Gg_1 a2 = gg_1;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> List<T> f(Class<? extends T> clazz, Predicate<? super T> predicate) {
        Gg_1 gg_1 = this;
        ArrayList<vL> arrayList = Lists.newArrayList();
        for (vL c2 : gg_1.w) {
            void a2;
            void b2;
            if (!b2.isAssignableFrom(c2.getClass()) || !a2.apply(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block) {
        Gg_1 gg_1 = this;
        for (DZ dZ2 : LX.HORIZONTAL) {
            void a2;
            void b2;
            XF xF3 = b2.offset(dZ2);
            if (!gg_1.F(xF3)) continue;
            Object c2 = gg_1.J(xF3);
            if (QFa.kc.C(c2.J())) {
                c2.J().J((Gg)gg_1, xF3, (IBlockState)c2, (Block)a2);
                continue;
            }
            if (!c2.J().A() || !QFa.kc.C((c2 = gg_1.J(xF3 = xF3.offset(dZ2))).J())) continue;
            c2.J().J((Gg)gg_1, xF3, (IBlockState)c2, (Block)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> List<T> J(Class<? extends T> clazz, Predicate<? super T> predicate) {
        Gg_1 gg_1 = this;
        ArrayList<vL> arrayList = Lists.newArrayList();
        for (vL c2 : gg_1.Q) {
            void a2;
            void b2;
            if (!b2.isAssignableFrom(c2.getClass()) || !a2.apply(c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        void f2;
        void c2;
        int h2 = n2;
        Gg_1 g2 = this;
        if (c2 >= 0 && f2 < hra.Ja) {
            void d2;
            e2 >>= AQa.P;
            d2 >>= AQa.P;
            b2 >>= AQa.P;
            int n8 = h2 = (h2 >>= AQa.P);
            while (n8 <= d2) {
                void b2;
                void e2;
                void v1 = e2;
                while (v1 <= b2) {
                    void a2;
                    if (!g2.J(h2, (int)f2, (boolean)a2)) {
                        return uSa.E != 0;
                    }
                    v1 = ++f2;
                }
                n8 = ++h2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, XF xF3) {
        void b2;
        Object c2 = xF3;
        Gg_1 a2 = this;
        a2.J(b2.getX(), b2.getY(), b2.getZ(), c2.getX(), c2.getY(), c2.getZ());
    }

    public long l() {
        Gg_1 a2;
        return a2.K.l();
    }

    public boolean d() {
        Gg_1 a2;
        if ((double)a2.f(pqa.r) > Tqa.ja) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(float f2) {
        void a2;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        float b2 = gg_12.e((float)a2);
        return gg_12.F.J(b2, (float)a2);
    }

    public boolean d(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.l((XF)((Object)b2), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, int n2) {
        void b2;
        int c2 = n2;
        Gg_1 a2 = this;
        return a2.J((XF)b2, c2, vRa.d != 0);
    }

    public void i() {
        Gg_1 a2;
        a2.J(new XF(Yqa.i, ysa.s, Yqa.i));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, DZ dZ2) {
        void b2;
        Gg_1 a2 = this;
        Object c2 = dZ2;
        if (a2.f((XF)b2, (DZ)((Object)c2)) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void M() {
        int n2;
        int n3;
        Gg_1 a22;
        int n4;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        gg_12.H.J(UTa.U);
        gg_12.H.J(pua.p);
        int n5 = n4 = uSa.E;
        while (n5 < gg_1.J.size()) {
            a22 = gg_1.J.get(n4);
            try {
                Gg_1 gg_13 = a22;
                ((vL)gg_13).g += vRa.d;
                gg_13.d();
            }
            catch (Throwable throwable) {
                RIa rIa2 = RIa.J((Throwable)throwable, (String)pQa.A);
                Dha dha = rIa2.J(qta.d);
                if (a22 == null) {
                    dha.J(FPa.Ja, (Object)isa.g);
                } else {
                    a22.J(dha);
                }
                throw new MZ(rIa2);
            }
            if (((vL)a22).J) {
                gg_1.J.remove(n4);
                --n4;
            }
            n5 = ++n4;
        }
        Gg_1 gg_14 = gg_1;
        gg_14.H.f(aSa.c);
        gg_14.Q.removeAll(gg_1.t);
        n4 = uSa.E;
        int n6 = n4;
        while (n6 < gg_1.t.size()) {
            a22 = gg_1.t.get(n4);
            n3 = ((vL)a22).N;
            n2 = ((vL)a22).L;
            if (((vL)a22).T && gg_1.J(n3, n2, vRa.d != 0)) {
                gg_1.J(n3, n2).J((vL)a22);
            }
            n6 = ++n4;
        }
        int n7 = n4 = uSa.E;
        while (n7 < gg_1.t.size()) {
            Gg_1 gg_15 = gg_1;
            gg_15.d(gg_15.t.get(n4++));
            n7 = n4;
        }
        Gg_1 gg_16 = gg_1;
        gg_16.t.clear();
        gg_16.H.f(NSa.D);
        int n8 = n4 = uSa.E;
        while (n8 < gg_1.Q.size()) {
            block31: {
                Gg_1 gg_17;
                block30: {
                    a22 = gg_1.Q.get(n4);
                    if (((vL)a22).ja == null) break block30;
                    if (!((vL)a22).ja.J && ((vL)a22).ja.Aa == a22) break block31;
                    ((vL)a22).ja.Aa = null;
                    ((vL)a22).ja = null;
                }
                gg_1.H.J(ERa.la);
                if (!((vL)a22).J) {
                    try {
                        gg_1.f((vL)a22);
                        gg_17 = gg_1;
                    }
                    catch (Throwable throwable) {
                        RIa rIa3 = RIa.J((Throwable)throwable, (String)pQa.A);
                        Dha dha = rIa3.J(qta.d);
                        a22.J(dha);
                        throw new MZ(rIa3);
                    }
                } else {
                    gg_17 = gg_1;
                }
                gg_17.H.f();
                gg_1.H.J(aSa.c);
                if (((vL)a22).J) {
                    Gg_1 gg_18 = a22;
                    n3 = ((vL)gg_18).N;
                    n2 = ((vL)gg_18).L;
                    if (((vL)gg_18).T && gg_1.J(n3, n2, vRa.d != 0)) {
                        gg_1.J(n3, n2).J((vL)a22);
                    }
                    gg_1.Q.remove(n4);
                    --n4;
                    gg_1.d((vL)a22);
                }
                gg_1.H.f();
            }
            n8 = ++n4;
        }
        Gg_1 gg_19 = gg_1;
        gg_19.H.f(tua.M);
        gg_19.q = vRa.d;
        Iterator<uY> iterator = gg_19.o.iterator();
        while (iterator.hasNext()) {
            Gg_1 gg_110;
            XF xF2;
            a22 = iterator.next();
            if (!a22.d() && a22.f() && gg_1.F(xF2 = a22.J()) && gg_1.c.J(xF2)) {
                try {
                    ((rd)a22).J();
                    gg_110 = a22;
                }
                catch (Throwable throwable) {
                    RIa rIa4 = RIa.J((Throwable)throwable, (String)VPa.q);
                    Dha dha = rIa4.J(SRa.B);
                    a22.J(dha);
                    throw new MZ(rIa4);
                }
            } else {
                gg_110 = a22;
            }
            if (!gg_110.d()) continue;
            iterator.remove();
            Gg_1 gg_111 = gg_1;
            gg_111.D.remove(a22);
            if (!gg_111.F(a22.J())) continue;
            gg_1.J(a22.J()).J(a22.J());
        }
        gg_1.q = uSa.E;
        if (!gg_1.l.isEmpty()) {
            Gg_1 gg_112 = gg_1;
            gg_112.o.removeAll(gg_112.l);
            Gg_1 gg_113 = gg_1;
            gg_113.D.removeAll(gg_113.l);
            gg_1.l.clear();
        }
        Gg_1 gg_114 = gg_1;
        gg_114.H.f(Mqa.x);
        if (!gg_114.n.isEmpty()) {
            int a22;
            int n9 = a22 = uSa.E;
            while (n9 < gg_1.n.size()) {
                uY uY2 = gg_1.n.get(a22);
                if (!uY2.d()) {
                    if (!gg_1.D.contains(uY2)) {
                        gg_1.J(uY2);
                    }
                    if (gg_1.F(uY2.J())) {
                        gg_1.J(uY2.J()).J(uY2.J(), uY2);
                    }
                    gg_1.C(uY2.J());
                }
                n9 = ++a22;
            }
            gg_1.n.clear();
        }
        Gg_1 gg_115 = gg_1;
        gg_115.H.f();
        gg_115.H.f();
        OT.i.H.M.f();
        gg_115.E.f();
        Lt.J();
    }

    /*
     * WARNING - void declaration
     */
    public List<vL> J(vL vL2, xy xy2, Predicate<? super vL> predicate) {
        void b2;
        Gg_1 gg_1 = this;
        ArrayList<vL> arrayList = Lists.newArrayList();
        void v0 = b2;
        int d2 = Oz.f((double)((v0.J - KPa.y) / Zta.ba));
        int n2 = Oz.f((double)((v0.A + KPa.y) / Zta.ba));
        int n3 = Oz.f((double)((v0.I - KPa.y) / Zta.ba));
        int n4 = Oz.f((double)((v0.k + KPa.y) / Zta.ba));
        int n5 = d2 = d2;
        while (n5 <= n2) {
            int n6 = n3;
            while (n6 <= n4) {
                int n7;
                if (gg_1.J(d2, n7, vRa.d != 0)) {
                    void a2;
                    void c2;
                    gg_1.J(d2, n7).J((vL)c2, (xy)b2, arrayList, (Predicate)a2);
                }
                n6 = ++n7;
            }
            n5 = ++d2;
        }
        return arrayList;
    }

    public void l(XF xF2, Block block, int n2, int n3) {
        int n4 = n3;
        Gg_1 a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public int l(XF xF2) {
        int n2;
        Gg_1 gg_1 = this;
        int n3 = uSa.E;
        DZ[] dZArray = DZ.VALUES;
        int n4 = DZ.VALUES.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            void a2;
            Object b22 = dZArray[n2];
            int b22 = gg_1.f(a2.offset((DZ)((Object)b22)), (DZ)((Object)b22));
            if (b22 >= Ypa.A) {
                return Ypa.A;
            }
            if (b22 > n3) {
                n3 = b22;
            }
            n5 = ++n2;
        }
        return n3;
    }

    public boolean C(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        IBlockState iBlockState = a2.J((XF)((Object)b2));
        if ((b2 = iBlockState.J().J((Gg)a2, (XF)((Object)b2), iBlockState)) != null && b2.J() >= oua.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, Faa faa2) {
        void a2;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        gg_12.H.f(sSa.c);
        if (gg_12.k == 0 && !gg_1.e) {
            void b2;
            Sx c2;
            Gg_1 gg_13 = gg_1;
            gg_13.u = gg_13.u * yRa.d + jRa.ja;
            int d2 = gg_13.u >> uqa.g;
            int n4 = d2 & Ypa.A;
            int n5 = d2 >> Yqa.i & Ypa.A;
            XF xF2 = new XF(n4, d2 = d2 >> ERa.C & osa.Ja, n5);
            Block block = a2.J(xF2);
            if (block.J() == Material.air && gg_1.f(xF2) <= gg_1.v.nextInt(Yqa.i) && gg_1.J(Mz.SKY, xF2) <= 0 && (c2 = gg_1.J((double)(n4 += c2) + kTa.B, (double)d2 + kTa.B, (double)(n5 += b2) + kTa.B, Wqa.Z)) != null && c2.f((double)n4 + kTa.B, (double)d2 + kTa.B, (double)n5 + kTa.B) > FPa.T) {
                Gg_1 gg_14 = gg_1;
                gg_14.J((double)n4 + kTa.B, (double)d2 + kTa.B, (double)n5 + kTa.B, GPa.O, ZSa.q, xSa.la + gg_1.v.nextFloat() * psa.N);
                gg_14.k = gg_14.v.nextInt(zsa.P) + MTa.g;
            }
        }
        gg_1.H.f(NQa.Ia);
        a2.f();
    }

    public void e() {
        Gg_1 a2;
        a2.f();
    }

    public float l(float f2) {
        float b2 = f2;
        Gg_1 a2 = this;
        b2 = a2.e(b2);
        float f3 = Oz.J((float)(pqa.r - (Oz.C((float)(b2 * pua.j * kta.v)) * kta.v + rta.o)), (float)JPa.N, (float)pqa.r);
        return f3 * f3 * MQa.L;
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2, uY uY2) {
        Gg_1 c2 = uY2;
        Gg_1 a2 = this;
        if (c2 != null && !c2.d()) {
            void b2;
            if (a2.q) {
                c2.J((XF)b2);
                Iterator<uY> iterator = a2.n.iterator();
                while (iterator.hasNext()) {
                    uY uY3 = iterator.next();
                    if (!uY3.J().equals(b2)) continue;
                    uY3.d();
                    iterator.remove();
                }
                a2.n.add((uY)c2);
                return;
            }
            a2.J((uY)c2);
            a2.J((XF)b2).J((XF)b2, (uY)c2);
        }
    }

    public void f(float f2) {
        Gg_1 a2;
        float b2 = f2;
        Gg_1 gg_1 = a2 = this;
        gg_1.a = b2;
        gg_1.s = b2;
    }

    public void J(XF xF2, uY uY2) {
        Gg_1 b2 = this;
        Object c2 = xF2;
        if (b2.F((XF)((Object)c2))) {
            b2.J((XF)((Object)c2)).l();
        }
    }

    public void f(Vb vb2) {
        Gg_1 b2 = vb2;
        Gg_1 a2 = this;
        a2.d.add((Vb)b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(xy xy2, vL vL2) {
        int n2;
        List<vL> b2;
        Gg_1 gg_1 = this;
        b2 = gg_1.f((vL)null, (xy)b2);
        int n3 = n2 = uSa.E;
        while (n3 < b2.size()) {
            void a2;
            Gg_1 c2 = b2.get(n2);
            if (!((vL)c2).J && ((vL)c2).h && c2 != a2 && (a2 == null || a2.ja != c2 && a2.Aa != c2)) {
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public boolean C() {
        Gg_1 a2;
        return a2.j;
    }

    public void J(float f2) {
        Gg_1 a2;
        float b2 = f2;
        Gg_1 gg_1 = a2 = this;
        gg_1.A = b2;
        gg_1.G = b2;
    }

    public vU J() {
        Gg_1 a2;
        return a2.K;
    }

    public Calendar J() {
        Gg_1 a2;
        if (a2.l() % KSa.N == nqa.i) {
            a2.N.setTimeInMillis(OCa.J());
        }
        return a2.N;
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2, Block block, int n2, int n3) {
        void a2;
        void b2;
        void c2;
        Gg_1 d2;
        Object e2 = xF2;
        Gg_1 gg_1 = d2 = this;
        c2.J((Gg)gg_1, (XF)((Object)e2), gg_1.J((XF)((Object)e2)), (int)b2, (int)a2);
    }

    public void J(mZ mZ2) {
        Gg_1 b2 = mZ2;
        Gg_1 a2 = this;
        a2.K.l(vRa.d != 0);
    }

    public void J(int n2) {
        int b2 = n2;
        Gg_1 a2 = this;
        a2.T = b2;
    }

    public void d() throws oZ {
        Gg_1 a2;
        a2.M.J();
    }

    public int f(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        if (b2.getY() < 0) {
            return uSa.E;
        }
        if (b2.getY() >= hra.Ja) {
            b2 = new XF(b2.getX(), osa.Ja, b2.getZ());
        }
        return a2.J((XF)((Object)b2)).J((XF)((Object)b2), uSa.E);
    }

    public int J(String string) {
        String b2 = string;
        Gg_1 a2 = this;
        return a2.i.J(b2);
    }

    public boolean J(Sx sx2, XF xF2) {
        Object c2 = xF2;
        Gg_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Xv xv2, boolean bl) {
        void a2;
        Gg_1 c2 = xv2;
        Gg_1 b2 = this;
        Gg_1 gg_1 = c2;
        Gg_1 gg_12 = c2;
        Gg_1 gg_13 = c2;
        return b2.J(((Xv)gg_1).minX, ((Xv)gg_1).minY, ((Xv)gg_12).minZ, ((Xv)gg_12).maxX, ((Xv)gg_13).maxY, ((Xv)gg_13).maxZ, (boolean)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(double d2, double d3, double d4, double d5) {
        int n2;
        Gg_1 gg_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < gg_1.w.size()) {
            block3: {
                block4: {
                    void a2;
                    void b2;
                    void c2;
                    void d6;
                    Object e2 = gg_1.w.get(n2);
                    if (!Kaa.A.apply((vL)e2)) break block3;
                    double d7 = e2.f((double)d6, (double)c2, (double)b2);
                    if (a2 < aSa.V) break block4;
                    void v1 = a2;
                    if (!(d7 < v1 * v1)) break block3;
                }
                return vRa.d != 0;
            }
            n3 = ++n2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int f(XF xF2, DZ dZ2) {
        void a2;
        Gg_1 b2 = this;
        Object c2 = xF2;
        IBlockState iBlockState = b2.J((XF)((Object)c2));
        Block block = iBlockState.J();
        if (block.A()) {
            return b2.J((XF)((Object)c2));
        }
        return block.J(b2, (XF)((Object)c2), iBlockState, (DZ)a2);
    }

    public void C() {
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Gg_1 a2 = this;
        if (b2 >= lQa.s && c2 >= lQa.s && b2 < RPa.Da && c2 < RPa.Da) {
            if (!a2.J((int)(b2 >> AQa.P), c2 >> AQa.P, vRa.d != 0)) {
                return uSa.E;
            }
            return a2.J((int)(b2 >> AQa.P), c2 >> AQa.P).J();
        }
        return a2.M() + vRa.d;
    }

    public boolean J(vL vL2) {
        Gg_1 b2 = vL2;
        Gg_1 a2 = this;
        a2.J.add((vL)b2);
        return vRa.d != 0;
    }

    public void f(vL vL2) {
        Gg_1 b2 = vL2;
        Gg_1 a2 = this;
        a2.J((vL)b2, vRa.d != 0);
    }

    public long f() {
        Gg_1 a2;
        return a2.K.f();
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(XF xF2, boolean bl) {
        void a2;
        Gg_1 b2 = this;
        Object c2 = xF2;
        IBlockState iBlockState = b2.J((XF)((Object)c2));
        Block block = iBlockState.J();
        if (block.J() == Material.air) {
            return uSa.E != 0;
        }
        b2.f(zta.Z, (XF)((Object)c2), Block.l(iBlockState));
        if (a2 != false) {
            block.J((Gg)b2, (XF)((Object)c2), iBlockState, uSa.E);
        }
        return b2.J((XF)((Object)c2), QFa.HF.J(), yRa.d);
    }

    public List<Oy> J(Faa faa2, boolean bl) {
        boolean c2 = bl;
        Gg_1 a2 = this;
        return null;
    }

    public vL J(int n2) {
        int b2 = n2;
        Gg_1 a2 = this;
        return a2.f.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public RY J(Lz lz2, Lz lz3) {
        void b2;
        Gg_1 c2 = lz3;
        Gg_1 a2 = this;
        return a2.J((Lz)b2, (Lz)c2, uSa.E != 0, uSa.E != 0, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Lz J(vL vL2, float f2) {
        float f3;
        float f4;
        float f5;
        void b52222;
        void a2;
        Gg_1 gg_1;
        Gg_1 gg_12 = gg_1 = this;
        float f6 = Oz.C((float)(gg_12.e((float)a2) * pua.j * kta.v)) * kta.v + MQa.L;
        f6 = Oz.J((float)f6, (float)JPa.N, (float)pqa.r);
        void v1 = b52222;
        int b52222 = Oz.f((double)v1.la);
        int n2 = Oz.f((double)v1.Z);
        int n3 = Oz.f((double)b52222.A);
        XF b52222 = new XF(b52222, n2, n3);
        Jy jy2 = gg_12.J(b52222);
        int b52222 = jy2.J(jy2.J(b52222));
        float f7 = (float)(b52222 >> ERa.C & osa.Ja) / NQa.Y;
        float f8 = (float)(b52222 >> Yqa.i & osa.Ja) / NQa.Y;
        float b52222 = (float)(b52222 & osa.Ja) / NQa.Y;
        f7 *= f6;
        f8 *= f6;
        b52222 *= f6;
        f6 = gg_12.J((float)a2);
        if (f5 > JPa.N) {
            f4 = (f7 * bpa.K + f8 * iSa.Ja + b52222 * wsa.W) * Ora.D;
            float c2 = pqa.r - f6 * wOa.w;
            f7 = f7 * c2 + f4 * (pqa.r - c2);
            f8 = f8 * c2 + f4 * (pqa.r - c2);
            b52222 = b52222 * c2 + f4 * (pqa.r - c2);
        }
        f4 = gg_1.f((float)a2);
        if (f3 > JPa.N) {
            float c2 = (f7 * bpa.K + f8 * iSa.Ja + b52222 * wsa.W) * psa.N;
            f6 = pqa.r - f4 * wOa.w;
            f7 = f7 * f6 + c2 * (pqa.r - f6);
            f8 = f8 * f6 + c2 * (pqa.r - f6);
            b52222 = b52222 * f6 + c2 * (pqa.r - f6);
        }
        if (gg_1.O > 0) {
            float f9;
            float c2 = (float)gg_1.O - a2;
            if (f9 > pqa.r) {
                c2 = pqa.r;
            }
            f7 = f7 * (pqa.r - (c2 *= KTa.r)) + xSa.la * c2;
            f8 = f8 * (pqa.r - c2) + xSa.la * c2;
            b52222 = b52222 * (pqa.r - c2) + pqa.r * c2;
        }
        return new Lz((double)f7, (double)f8, (double)b52222);
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        int b2 = uSa.E;
        if ((b2 = Math.max(b2, gg_1.J(a2.down(), DZ.DOWN))) >= Ypa.A) {
            return b2;
        }
        if ((b2 = Math.max(b2, gg_1.J(a2.up(), DZ.UP))) >= Ypa.A) {
            return b2;
        }
        if ((b2 = Math.max(b2, gg_1.J(a2.north(), DZ.NORTH))) >= Ypa.A) {
            return b2;
        }
        if ((b2 = Math.max(b2, gg_1.J(a2.south(), DZ.SOUTH))) >= Ypa.A) {
            return b2;
        }
        if ((b2 = Math.max(b2, gg_1.J(a2.west(), DZ.WEST))) >= Ypa.A) {
            return b2;
        }
        if ((b2 = Math.max(b2, gg_1.J(a2.east(), DZ.EAST))) >= Ypa.A) {
            return b2;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, boolean bl) {
        void a2;
        Object c2 = xF2;
        Gg_1 b2 = this;
        if (!Gg_1.f((XF)((Object)c2))) {
            return (boolean)a2;
        }
        if (b2.p.J((XF)((Object)c2)).f()) {
            return (boolean)a2;
        }
        if (((Block)(c2 = b2.J((XF)((Object)c2)).J())).J().J() && ((Block)c2).l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public sZ J() {
        Gg_1 a2;
        return a2.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Block block, XF xF2, boolean bl, DZ dZ2, vL vL2, Mda mda2) {
        void a2;
        void b2;
        void f2;
        void c2;
        void e2;
        boolean g22 = bl;
        Gg_1 d2 = this;
        Block block2 = d2.J((XF)e2).J();
        d2.h = c2;
        xy g22 = g22 ? null : f2.J((Gg)d2, (XF)e2, f2.J());
        d2.h = null;
        if (g22 != null && !d2.J(g22, (vL)b2)) {
            return uSa.E != 0;
        }
        if (block2.J() == Material.circuits && f2 == QFa.Sb) {
            return vRa.d != 0;
        }
        if (block2.J().d() && f2.J((Gg)d2, (XF)e2, (DZ)c2, (Mda)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<vL> f(vL vL2, xy xy2) {
        void b2;
        Gg_1 c2 = xy2;
        Gg_1 a2 = this;
        return a2.J((vL)b2, (xy)c2, Kaa.A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Vx vx2) {
        void b2;
        Gg_1 c2 = vx2;
        Gg_1 a2 = this;
        a2.i.J((String)b2, (Vx)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, int n2, XF xF2, int n3) {
        void a2;
        void b2;
        void c2;
        void d2;
        Gg_1 gg_1 = this;
        try {
            int e22 = uSa.E;
            while (e22 < gg_1.d.size()) {
                gg_1.d.get(++e22).J((Sx)d2, (int)c2, (XF)b2, (int)a2);
            }
        }
        catch (Throwable e22) {
            RIa e22 = RIa.J((Throwable)e22, (String)rQa.Z);
            Dha dha = e22.J(Ora.h);
            dha.J(bqa.n, (Object)Dha.J((XF)b2));
            dha.J(rQa.ia, (Object)d2);
            dha.J(Lqa.e, (Object)((int)c2));
            dha.J(WPa.O, (Object)((int)a2));
            throw new MZ(e22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Sx J(double d2, double d3, double d4, double d5) {
        int n2;
        Gg_1 gg_1 = this;
        double d6 = pqa.q;
        Object object = null;
        int n3 = n2 = uSa.E;
        while (n3 < gg_1.w.size()) {
            block5: {
                double d7;
                Object e2;
                block6: {
                    void a2;
                    void b2;
                    void c2;
                    void d8;
                    e2 = gg_1.w.get(n2);
                    if (!Kaa.A.apply((vL)e2)) break block5;
                    d7 = e2.f((double)d8, (double)c2, (double)b2);
                    if (a2 < aSa.V) break block6;
                    void v1 = a2;
                    if (!(d7 < v1 * v1)) break block5;
                }
                if (d6 == pqa.q || d7 < d6) {
                    d6 = d7;
                    object = e2;
                }
            }
            n3 = ++n2;
        }
        return object;
    }

    public float J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.F.J()[a2.C((XF)((Object)b2))];
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2) {
        int b2;
        Gg_1 gg_1 = this;
        int n2 = b2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            Vb vb2 = gg_1.d.get(b2);
            vb2.J((vL)a2);
            n2 = ++b2;
        }
    }

    public XF f(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        Faa faa2 = a2.J((XF)((Object)b2));
        b2 = new XF(b2.getX(), faa2.f() + ERa.C, b2.getZ());
        Object object = b2;
        while (object.getY() >= 0) {
            XF xF3 = ((XF)((Object)b2)).down();
            Material material = faa2.J(xF3).J();
            if (material.f() && material != Material.leaves) {
                return b2;
            }
            object = xF3;
        }
        return b2;
    }

    public void J(XF xF2, Block block, int n2, int n3) {
        int n4 = n3;
        Gg_1 a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public RY J(Lz lz2, Lz lz3, boolean bl, boolean bl2, boolean bl3) {
        Gg_1 f2 = lz2;
        Gg_1 e2 = this;
        if (!(Double.isNaN(((Lz)f2).A) || Double.isNaN(((Lz)f2).j) || Double.isNaN(((Lz)f2).J))) {
            void d2;
            if (!(Double.isNaN(d2.A) || Double.isNaN(d2.j) || Double.isNaN(d2.J))) {
                void a2;
                RY rY2;
                void c2;
                void b2;
                void v0 = d2;
                int n2 = Oz.f((double)v0.A);
                int n3 = Oz.f((double)v0.j);
                int n4 = Oz.f((double)v0.J);
                Gg_1 gg_1 = f2;
                int n5 = Oz.f((double)((Lz)gg_1).A);
                int n6 = Oz.f((double)((Lz)gg_1).j);
                int n7 = Oz.f((double)((Lz)gg_1).J);
                XF xF2 = new XF(n5, n6, n7);
                IBlockState iBlockState = e2.J(xF2);
                Object object = iBlockState.J();
                if ((b2 == false || object.J((Gg)e2, xF2, iBlockState) != null) && object.J(iBlockState, (boolean)c2) && (rY2 = object.J((Gg)e2, xF2, (Lz)f2, (Lz)d2)) != null) {
                    return rY2;
                }
                rY2 = null;
                int n8 = ZOa.x;
                while (n8-- >= 0) {
                    Lz lz4;
                    int n9;
                    int n10;
                    if (Double.isNaN(((Lz)f2).A) || Double.isNaN(((Lz)f2).j) || Double.isNaN(((Lz)f2).J)) {
                        return null;
                    }
                    if (n5 == n2 && n6 == n3 && n7 == n4) {
                        if (a2 != false) {
                            return rY2;
                        }
                        return null;
                    }
                    int n11 = vRa.d;
                    int n12 = vRa.d;
                    int n13 = vRa.d;
                    double d3 = ZSa.Ha;
                    double d4 = ZSa.Ha;
                    double d5 = ZSa.Ha;
                    if (n2 > n5) {
                        d3 = (double)n5 + oua.i;
                        n10 = n3;
                    } else if (n2 < n5) {
                        d3 = (double)n5 + aSa.V;
                        n10 = n3;
                    } else {
                        n11 = uSa.E;
                        n10 = n3;
                    }
                    if (n10 > n6) {
                        d4 = (double)n6 + oua.i;
                        n9 = n4;
                    } else if (n3 < n6) {
                        d4 = (double)n6 + aSa.V;
                        n9 = n4;
                    } else {
                        n12 = uSa.E;
                        n9 = n4;
                    }
                    if (n9 > n7) {
                        d5 = (double)n7 + oua.i;
                    } else if (n4 < n7) {
                        d5 = (double)n7 + aSa.V;
                    } else {
                        n13 = uSa.E;
                    }
                    double d6 = ZSa.Ha;
                    double d7 = ZSa.Ha;
                    double d8 = ZSa.Ha;
                    void v4 = d2;
                    double d9 = v4.A - ((Lz)f2).A;
                    double d10 = v4.j - ((Lz)f2).j;
                    double d11 = v4.J - ((Lz)f2).J;
                    if (n11 != 0) {
                        d6 = (d3 - ((Lz)f2).A) / d9;
                    }
                    if (n12 != 0) {
                        d7 = (d4 - ((Lz)f2).j) / d10;
                    }
                    if (n13 != 0) {
                        d8 = (d5 - ((Lz)f2).J) / d11;
                    }
                    if (d6 == ITa.P) {
                        d6 = Fpa.t;
                    }
                    if (d7 == ITa.P) {
                        d7 = Fpa.t;
                    }
                    if (d8 == ITa.P) {
                        d8 = Fpa.t;
                    }
                    if (d6 < d7 && d6 < d8) {
                        object = n2 > n5 ? DZ.WEST : DZ.EAST;
                        lz4 = new Lz(d3, ((Lz)f2).j + d10 * d6, ((Lz)f2).J + d11 * d6);
                    } else if (d7 < d8) {
                        object = n3 > n6 ? DZ.DOWN : DZ.UP;
                        lz4 = new Lz(((Lz)f2).A + d9 * d7, d4, ((Lz)f2).J + d11 * d7);
                    } else {
                        object = n4 > n7 ? DZ.NORTH : DZ.SOUTH;
                        lz4 = new Lz(((Lz)f2).A + d9 * d8, ((Lz)f2).j + d10 * d8, d5);
                    }
                    n5 = Oz.f((double)lz4.A) - (object == DZ.EAST ? vRa.d : uSa.E);
                    n6 = Oz.f((double)((Lz)f2).j) - (object == DZ.UP ? vRa.d : uSa.E);
                    n7 = Oz.f((double)((Lz)f2).J) - (object == DZ.SOUTH ? vRa.d : uSa.E);
                    xF2 = new XF(n5, n6, n7);
                    Object object2 = e2.J(xF2);
                    Block block = object2.J();
                    if (b2 != false && block.J((Gg)e2, xF2, (IBlockState)object2) == null) continue;
                    if (block.J((IBlockState)object2, (boolean)c2)) {
                        object2 = block.J((Gg)e2, xF2, (Lz)f2, (Lz)d2);
                        if (object2 == null) continue;
                        return object2;
                    }
                    rY2 = new RY(AY.MISS, (Lz)f2, (DZ)((Object)object), xF2);
                }
                if (a2 != false) {
                    return rY2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public List<xy> J(vL vL2, xy xy2) {
        int n2;
        double d2;
        int n3;
        void a2;
        Gg_1 c2 = vL2;
        Gg_1 b2 = this;
        ArrayList<xy> arrayList = Lists.newArrayList();
        if (c2 instanceof ANa && QS.J()) {
            return QS.J((vL)c2, (xy)a2, arrayList);
        }
        void v0 = a2;
        int n4 = Oz.f((double)v0.J);
        int n5 = Oz.f((double)(v0.A + oua.i));
        int n6 = Oz.f((double)v0.j);
        int n7 = Oz.f((double)(v0.M + oua.i));
        int n8 = Oz.f((double)v0.I);
        int n9 = Oz.f((double)(v0.k + oua.i));
        Gg_1 gg_1 = b2;
        PX pX2 = gg_1.J();
        boolean bl = c2.D();
        boolean bl2 = gg_1.J(pX2, (vL)c2);
        IBlockState iBlockState = QFa.Gd.J();
        zz zz2 = new zz();
        int n10 = n3 = n4;
        while (n10 < n5) {
            int n11 = n8;
            while (n11 < n9) {
                int n12;
                if (b2.F(zz2.func_181079_c(n3, ysa.s, n12))) {
                    int n13 = n6 - vRa.d;
                    while (n13 < n7) {
                        IBlockState iBlockState2;
                        IBlockState iBlockState3;
                        zz2.func_181079_c(n3, n4, n12);
                        if (bl && bl2) {
                            iBlockState3 = iBlockState;
                            c2.e(uSa.E != 0);
                        } else {
                            if (!bl && !bl2) {
                                c2.e(vRa.d != 0);
                            }
                            iBlockState3 = iBlockState2 = iBlockState;
                        }
                        if (pX2.J(zz2) || !bl2) {
                            iBlockState2 = b2.J(zz2);
                        }
                        iBlockState2.J().J((Gg)b2, zz2, iBlockState2, (xy)a2, arrayList, (vL)c2);
                        n13 = ++n4;
                    }
                }
                n11 = ++n12;
            }
            n10 = ++n3;
        }
        double d3 = d2 = VPa.W;
        List<vL> list = b2.f((vL)c2, a2.f(d3, d3, d3));
        int n14 = n2 = uSa.E;
        while (n14 < list.size()) {
            vL vL3 = list.get(n2);
            xy xy3 = vL3.f();
            if (xy3 != null && xy3.J((xy)a2)) {
                arrayList.add(xy3);
            }
            if ((xy3 = c2.J(vL3)) != null && xy3.J((xy)a2)) {
                arrayList.add(xy3);
            }
            n14 = ++n2;
        }
        OT.i.H.M.J((vL)c2, (xy)a2, arrayList);
        return arrayList;
    }

    public void f(Collection<vL> collection) {
        Collection<vL> b2 = collection;
        Gg_1 a2 = this;
        a2.t.addAll(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int g2;
        Gg_1 gg_1 = this;
        int n8 = g2 = uSa.E;
        while (n8 < gg_1.d.size()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            void f2;
            gg_1.d.get(++g2).J((int)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)a2);
            n8 = g2;
        }
    }

    public boolean J(XF xF2, Block block) {
        Block c2 = block;
        Gg_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mz mz2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Gg_1 a2 = this;
        if (c2.getY() < 0) {
            c2 = new XF(c2.getX(), uSa.E, c2.getZ());
        }
        if (c2.getY() >= hra.Ja || !a2.p.J(c2.getX() >> AQa.P, c2.getZ() >> AQa.P)) {
            return b2.defaultLightValue;
        }
        return a2.p.J(c2.getX() >> AQa.P, c2.getZ() >> AQa.P).J((Mz)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, String string, float f2, float f3) {
        int g2;
        Gg_1 gg_1 = this;
        int n2 = g2 = uSa.E;
        while (n2 < gg_1.d.size()) {
            void a2;
            void b2;
            void d5;
            void e2;
            void f4;
            void c2;
            gg_1.d.get(++g2).J((String)c2, (double)f4, (double)e2, (double)d5, (float)b2, (float)a2);
            n2 = g2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(xy xy2, Material material) {
        void b2;
        Gg_1 gg_1 = this;
        void v0 = b2;
        int n2 = Oz.f((double)v0.J);
        int n3 = Oz.f((double)(v0.A + oua.i));
        int n4 = Oz.f((double)v0.j);
        int n5 = Oz.f((double)(v0.M + oua.i));
        int n6 = Oz.f((double)v0.I);
        int n7 = Oz.f((double)(v0.k + oua.i));
        zz zz2 = new zz();
        int n8 = n2 = n2;
        while (n8 < n3) {
            int n9 = n4;
            while (n9 < n5) {
                int n10;
                int n11 = n6;
                while (n11 < n7) {
                    void a2;
                    int n12;
                    IBlockState c22 = gg_1.J(zz2.func_181079_c(n2, n10, n12));
                    if (c22.J().J() == a2) {
                        int c22 = c22.J(BlockLiquid.LEVEL);
                        double d2 = n10 + vRa.d;
                        if (c22 < Yqa.i) {
                            d2 = (double)(n10 + vRa.d) - (double)c22 / Wqa.Z;
                        }
                        if (d2 >= b2.j) {
                            return vRa.d != 0;
                        }
                    }
                    n11 = ++n12;
                }
                n9 = ++n10;
            }
            n8 = ++n2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        if (gg_1.F((XF)a2)) {
            Gg_1 b222 = gg_1.J((XF)a2);
            try {
                return b222.J((XF)a2, gg_1.F.J());
            }
            catch (Throwable b222) {
                RIa b222 = RIa.J((Throwable)b222, (String)sqa.Ha);
                b222.J(Zta.V).J(Bua.F, (Callable)new DY((Gg)gg_1, (XF)a2));
                throw new MZ(b222);
            }
        }
        return gg_1.F.J().J((XF)a2, Jy.Z);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void a2;
        void b2;
        Gg_1 gg_1 = this;
        Object c22 = gg_1.J();
        b2 = b2 * ERa.C + Yqa.i - c22.getX();
        a2 = a2 * ERa.C + Yqa.i - c22.getZ();
        int c22 = XOa.h;
        if (b2 >= -c22 && b2 <= c22 && a2 >= -c22 && a2 <= c22) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(float f2) {
        void a2;
        Gg_1 gg_1 = this;
        float b2 = gg_1.e((float)a2);
        b2 = pqa.r - (Oz.C((float)(b2 * pua.j * kta.v)) * kta.v + MQa.L);
        b2 = Oz.J((float)b2, (float)JPa.N, (float)pqa.r);
        b2 = pqa.r - b2;
        b2 = (float)((double)b2 * (oua.i - (double)(gg_1.J((float)a2) * eua.C) / Zta.ba));
        b2 = (float)((double)b2 * (oua.i - (double)(gg_1.f((float)a2) * eua.C) / Zta.ba));
        b2 = pqa.r - b2;
        return (int)(b2 * AQa.W);
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(XF xF2) {
        void a2;
        Gg_1 gg_1 = this;
        if (a2.getY() >= gg_1.M()) {
            return gg_1.j((XF)a2);
        }
        Object b2 = new XF(a2.getX(), gg_1.M(), a2.getZ());
        if (!gg_1.j((XF)((Object)b2))) {
            return uSa.E != 0;
        }
        b2 = ((XF)((Object)b2)).down();
        Object object = b2;
        while (object.getY() > a2.getY()) {
            Block block = gg_1.J((XF)((Object)b2)).J();
            if (block.C() > 0 && !block.J().l()) {
                return uSa.E != 0;
            }
            object = ((XF)((Object)b2)).down();
        }
        return vRa.d != 0;
    }

    public XF J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        return a2.J((XF)((Object)b2)).J((XF)((Object)b2));
    }

    public float f(float f2) {
        Gg_1 a2;
        float b2 = f2;
        Gg_1 gg_1 = a2 = this;
        return (gg_1.a + (gg_1.s - a2.a) * b2) * a2.J(b2);
    }

    /*
     * Unable to fully structure code
     */
    public void J(vL var1_1, boolean var2_2) {
        block13: {
            c = var1_1;
            b = this;
            v0 = c;
            var5_3 = Oz.f((double)v0.la);
            var4_4 = Oz.f((double)v0.A);
            var3_5 = fPa.i;
            if (a != false && !b.J(var5_3 - var3_5, uSa.E, var4_4 - var3_5, var5_3 + var3_5, uSa.E, var4_4 + var3_5, (boolean)vRa.d)) break block13;
            v1 = c;
            v1.V = v1.la;
            v1.Ga = v1.Z;
            v1.Ca = v1.A;
            v1.s = v1.X;
            v1.o = v1.d;
            if (a == false || !c.T) ** GOTO lbl22
            v2 = c;
            v2.g += vRa.d;
            if (v2.ja != null) {
                v3 = b;
                c.g();
            } else {
                c.d();
lbl22:
                // 2 sources

                v3 = b;
            }
            v3.H.J(vTa.T);
            if (Double.isNaN(c.la) || Double.isInfinite(c.la)) {
                c.la = c.V;
            }
            if (Double.isNaN(c.Z) || Double.isInfinite(c.Z)) {
                c.Z = c.Ga;
            }
            if (Double.isNaN(c.A) || Double.isInfinite(c.A)) {
                c.A = c.Ca;
            }
            if (Double.isNaN(c.d) || Double.isInfinite(c.d)) {
                c.d = c.o;
            }
            if (Double.isNaN(c.X) || Double.isInfinite(c.X)) {
                c.X = c.s;
            }
            v4 = c;
            var5_3 = Oz.f((double)(v4.la / Zta.ba));
            var4_4 = Oz.f((double)(v4.Z / Zta.ba));
            var3_5 = Oz.f((double)(v4.A / Zta.ba));
            if (v4.T && c.N == var5_3 && c.Ba == var4_4 && c.L == var3_5) ** GOTO lbl52
            if (c.T) {
                v5 = c;
                if (b.J(v5.N, v5.L, (boolean)vRa.d)) {
                    v6 = c;
                    v7 = c;
                    b.J(v6.N, v6.L).J((vL)v7, v7.Ba);
                }
            }
            if (b.J(var5_3, var3_5, (boolean)vRa.d)) {
                v8 = b;
                v9 = v8;
                c.T = vRa.d;
                v8.J(var5_3, var3_5).f((vL)c);
            } else {
                c.T = uSa.E;
lbl52:
                // 2 sources

                v9 = b;
            }
            v9.H.f();
            if (a != false && c.T && c.Aa != null) {
                if (!c.Aa.J && c.Aa.ja == c) {
                    b.f(c.Aa);
                    return;
                }
                c.Aa.ja = null;
                c.Aa = null;
            }
        }
    }

    public long J() {
        Gg_1 a2;
        return a2.K.C();
    }

    public void l() {
        Gg_1 a2;
        a2.G();
    }

    public double J() {
        Gg_1 a2;
        if (a2.K.J() == Fy.k) {
            return aSa.V;
        }
        return wua.p;
    }

    public void J(Vb vb2) {
        Gg_1 b2 = vb2;
        Gg_1 a2 = this;
        a2.d.remove(b2);
    }

    public void f() {
        Gg_1 gg_1 = this;
        if (!gg_1.F.f() && !gg_1.e) {
            Gg_1 gg_12;
            Gg_1 gg_13;
            Gg_1 gg_14;
            Gg_1 gg_15;
            int a2 = gg_1.K.i();
            if (a2 > 0) {
                Gg_1 gg_16 = gg_1;
                gg_16.K.f(--a2);
                gg_16.K.d(gg_1.K.J() ? vRa.d : uqa.g);
                Gg_1 gg_17 = gg_1;
                gg_17.K.M(gg_17.K.f() ? vRa.d : uqa.g);
            }
            if ((a2 = gg_1.K.l()) <= 0) {
                Gg_1 gg_18 = gg_1;
                if (gg_1.K.J()) {
                    gg_18.K.d(gg_1.v.nextInt(zsa.P) + csa.W);
                    gg_15 = gg_1;
                } else {
                    gg_18.K.d(gg_1.v.nextInt(Pua.R) + zsa.P);
                    gg_15 = gg_1;
                }
            } else {
                int n2 = --a2;
                gg_1.K.d(n2);
                if (n2 <= 0) {
                    Gg_1 gg_19 = gg_1;
                    gg_19.K.C((!gg_19.K.J() ? vRa.d : uSa.E) != 0);
                }
                gg_15 = gg_1;
            }
            gg_15.a = gg_1.s;
            Gg_1 gg_110 = gg_1;
            if (gg_1.K.J()) {
                gg_110.s = (float)((double)gg_1.s + SPa.x);
                gg_14 = gg_1;
            } else {
                gg_110.s = (float)((double)gg_1.s - SPa.x);
                gg_14 = gg_1;
            }
            gg_14.s = Oz.J((float)gg_1.s, (float)JPa.N, (float)pqa.r);
            a2 = gg_1.K.A();
            if (a2 <= 0) {
                Gg_1 gg_111 = gg_1;
                if (gg_1.K.f()) {
                    gg_111.K.M(gg_1.v.nextInt(zsa.P) + zsa.P);
                    gg_13 = gg_1;
                } else {
                    gg_111.K.M(gg_1.v.nextInt(Pua.R) + zsa.P);
                    gg_13 = gg_1;
                }
            } else {
                int n3 = --a2;
                gg_1.K.M(n3);
                if (n3 <= 0) {
                    Gg_1 gg_112 = gg_1;
                    gg_112.K.d((!gg_112.K.f() ? vRa.d : uSa.E) != 0);
                }
                gg_13 = gg_1;
            }
            gg_13.A = gg_1.G;
            Gg_1 gg_113 = gg_1;
            if (gg_1.K.f()) {
                gg_113.G = (float)((double)gg_1.G + SPa.x);
                gg_12 = gg_1;
            } else {
                gg_113.G = (float)((double)gg_1.G - SPa.x);
                gg_12 = gg_1;
            }
            gg_12.G = Oz.J((float)gg_1.G, (float)JPa.N, (float)pqa.r);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, IBlockState iBlockState) {
        void b2;
        IBlockState c2 = iBlockState;
        Gg_1 a2 = this;
        return a2.J((XF)b2, c2, yRa.d);
    }

    public boolean J(xy xy2) {
        int n2;
        Gg_1 b22 = xy2;
        Gg_1 a2 = this;
        Gg_1 gg_1 = b22;
        int b22 = Oz.f((double)((xy)gg_1).J);
        int n3 = Oz.f((double)(((xy)gg_1).A + oua.i));
        int n4 = Oz.f((double)((xy)gg_1).j);
        int n5 = Oz.f((double)(((xy)gg_1).M + oua.i));
        int n6 = Oz.f((double)((xy)gg_1).I);
        if (a2.J(b22, n4, n6, n3, n5, n2 = Oz.f((double)(((xy)gg_1).k + oua.i)), vRa.d != 0)) {
            zz zz2 = new zz();
            int n7 = b22 = b22;
            while (n7 < n3) {
                int n8 = n4;
                while (n8 < n5) {
                    int n9;
                    int n10 = n6;
                    while (n10 < n2) {
                        int n11;
                        Block block = a2.J(zz2.func_181079_c(b22, n9, n11)).J();
                        if (block == QFa.ic || block == QFa.fA || block == QFa.bb) {
                            return vRa.d != 0;
                        }
                        n10 = ++n11;
                    }
                    n8 = ++n9;
                }
                n7 = ++b22;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(UZ uZ, boolean bl, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        void h2;
        Gg_1 j2 = uZ;
        Gg_1 i2 = this;
        i2.J(j2.getParticleID(), (j2.getShouldIgnoreRange() | h2) != 0, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
    }

    public void J(Collection<uY> collection) {
        Iterator b2 = collection;
        Gg_1 a2 = this;
        if (a2.q) {
            a2.n.addAll((Collection<uY>)((Object)b2));
            return;
        }
        b2 = b2.iterator();
        while (b2.hasNext()) {
            uY uY2;
            uY uY3 = uY2 = (uY)b2.next();
            a2.D.add(uY3);
            if (!(uY3 instanceof rd)) continue;
            a2.o.add(uY2);
        }
    }

    public KX J() {
        Gg_1 a2;
        return a2.K.J();
    }

    public XB J() {
        Gg_1 a2;
        return a2.M;
    }

    private static boolean f(XF a2) {
        if (a2.getX() >= lQa.s && a2.getZ() >= lQa.s && a2.getX() < RPa.Da && a2.getZ() < RPa.Da && a2.getY() >= 0 && a2.getY() < hra.Ja) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Ay J() {
        Gg_1 a2;
        return a2.F.J();
    }

    public boolean l() {
        Gg_1 a2;
        if ((double)a2.J(pqa.r) > iSa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J(float f2) {
        Gg_1 a2;
        float b2 = f2;
        Gg_1 gg_1 = a2 = this;
        return gg_1.A + (gg_1.G - a2.A) * b2;
    }

    public void J() {
        Gg_1 gg_1 = this;
        int a2 = gg_1.J(pqa.r);
        if (a2 != gg_1.B) {
            gg_1.B = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> T J(Class<? extends T> clazz, xy xy2, T t2) {
        int n2;
        Gg_1 b2;
        List<T> c2;
        Gg_1 gg_1 = this;
        c2 = gg_1.J((Class<? extends T>)((Object)c2), (xy)b2);
        b2 = null;
        double d2 = Bra.o;
        int n3 = n2 = uSa.E;
        while (n3 < c2.size()) {
            void a2;
            Gg_1 d3 = (vL)c2.get(n2);
            if (d3 != a2 && Kaa.A.apply((vL)d3)) {
                double d4;
                double d5 = a2.J((vL)d3);
                if (d4 <= d2) {
                    b2 = d3;
                    d2 = d5;
                }
            }
            n3 = ++n2;
        }
        return (T)b2;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> List<T> J(Class<? extends T> clazz, xy xy2) {
        void b2;
        Gg_1 c2 = xy2;
        Gg_1 a2 = this;
        return a2.J((Class<? extends T>)b2, (xy)c2, (T)Kaa.A);
    }

    public void J(XF xF2) {
        Object b2 = xF2;
        Gg_1 a2 = this;
        a2.K.J((XF)((Object)b2));
    }
}

