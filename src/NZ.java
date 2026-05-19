/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  ERa
 *  Gg
 *  Gl
 *  Iha
 *  JPa
 *  Lz
 *  Oz
 *  QFa
 *  UZ
 *  YSa
 *  Ypa
 *  aSa
 *  bpa
 *  gZ
 *  kta
 *  pqa
 *  psa
 *  qta
 *  vL
 *  vRa
 *  xy
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NZ {
    private final double L;
    private final float E;
    private final Gg m;
    private final Random C;
    private final double i;
    private final Map<Sx, Lz> M;
    private final double k;
    private final boolean j;
    private final vL J;
    private final boolean A;
    private final List<XF> I;

    /*
     * WARNING - void declaration
     */
    public NZ(Gg gg2, vL vL2, double d2, double d3, double d4, float f2, List<XF> list) {
        List<XF> h;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g;
        NZ nZ = list2;
        List<XF> list2 = list;
        NZ a2 = nZ;
        a2((Gg)g, (vL)f3, (double)e2, (double)d5, (double)c2, (float)b2, uSa.E != 0, vRa.d != 0, h);
    }

    public List<XF> J() {
        NZ a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public NZ(Gg gg2, vL vL2, double d2, double d3, double d4, float f2, boolean bl, boolean bl2) {
        void i2;
        void b2;
        void d5;
        void e2;
        void f3;
        void c2;
        void g;
        void h;
        NZ a2;
        boolean bl3 = bl2;
        NZ nZ = a2 = this;
        NZ nZ2 = a2;
        NZ nZ3 = a2;
        NZ nZ4 = a2;
        NZ nZ5 = a2;
        a2.C = new Random();
        nZ5.I = Lists.newArrayList();
        a2.M = Maps.newHashMap();
        nZ4.m = h;
        nZ4.J = g;
        nZ3.E = c2;
        nZ3.L = f3;
        nZ2.k = e2;
        nZ2.i = d5;
        nZ.A = b2;
        nZ.j = i2;
    }

    public void f() {
        NZ a2;
        a2.I.clear();
    }

    public Gl J() {
        NZ a2;
        if (a2.J == null) {
            return null;
        }
        if (a2.J instanceof vFa) {
            return ((vFa)a2.J).J();
        }
        if (a2.J instanceof Gl) {
            return (Gl)a2.J;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public NZ(Gg gg2, vL vL2, double d2, double d3, double d4, float f2, boolean bl, boolean bl2, List<XF> list) {
        List<XF> j2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        void g;
        void h;
        void i2;
        NZ a2;
        NZ nZ = list2;
        List<XF> list2 = list;
        NZ nZ2 = a2 = nZ;
        nZ2((Gg)i2, (vL)h, (double)g, (double)f3, (double)e2, (float)d5, (boolean)c2, (boolean)b2);
        nZ2.I.addAll((Collection<XF>)j2);
    }

    public void J() {
        int n2;
        int n3;
        int a22;
        NZ nZ = this;
        HashSet<XF> hashSet = Sets.newHashSet();
        int n4 = a22 = uSa.E;
        while (n4 < ERa.C) {
            int n5 = uSa.E;
            while (n5 < ERa.C) {
                int n6 = uSa.E;
                while (n6 < ERa.C) {
                    block15: {
                        if (a22 != 0 && a22 != Ypa.A && n3 != 0 && n3 != Ypa.A && n2 != 0 && n2 != Ypa.A) break block15;
                        double d2 = (float)a22 / qta.D * kta.v - pqa.r;
                        double d3 = (float)n3 / qta.D * kta.v - pqa.r;
                        double d4 = (float)n2 / qta.D * kta.v - pqa.r;
                        double d5 = d2;
                        double d6 = d3;
                        double d7 = d4;
                        double d8 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
                        d2 /= d8;
                        d3 /= d8;
                        d4 /= d8;
                        NZ nZ2 = nZ;
                        NZ nZ3 = nZ;
                        float f2 = nZ2.E * (ZSa.q + nZ3.m.v.nextFloat() * Ora.D);
                        double d9 = nZ3.L;
                        double d10 = nZ2.k;
                        double d11 = nZ2.i;
                        float f3 = f2;
                        while (f3 > JPa.N) {
                            block16: {
                                XF xF;
                                block17: {
                                    xF = new XF(d9, d10, d11);
                                    IBlockState iBlockState = nZ.m.J(xF);
                                    if (iBlockState.J().J() != Material.air) {
                                        float f4;
                                        if (nZ.J != null) {
                                            NZ nZ4 = nZ;
                                            f4 = nZ.J.J(nZ4, nZ4.m, xF, iBlockState);
                                        } else {
                                            f4 = iBlockState.J().J((vL)null);
                                        }
                                        float f5 = f4;
                                        f2 -= (f5 + bpa.K) * bpa.K;
                                    }
                                    if (!(f2 > JPa.N)) break block16;
                                    if (nZ.J == null) break block17;
                                    NZ nZ5 = nZ;
                                    if (!nZ.J.J(nZ5, nZ5.m, xF, iBlockState, f2)) break block16;
                                }
                                hashSet.add(xF);
                            }
                            d9 += d2 * osa.b;
                            d10 += d3 * osa.b;
                            d11 += d4 * osa.b;
                            f3 = f2 - Bpa.i;
                        }
                    }
                    n6 = ++n2;
                }
                n5 = ++n3;
            }
            n4 = ++a22;
        }
        nZ.I.addAll(hashSet);
        NZ nZ6 = nZ;
        float a22 = nZ6.E * kta.v;
        n3 = Oz.f((double)(nZ6.L - (double)a22 - oua.i));
        n2 = Oz.f((double)(nZ6.L + (double)a22 + oua.i));
        int n7 = Oz.f((double)(nZ6.k - (double)a22 - oua.i));
        int n8 = Oz.f((double)(nZ6.k + (double)a22 + oua.i));
        int n9 = Oz.f((double)(nZ6.i - (double)a22 - oua.i));
        int n10 = Oz.f((double)(nZ6.i + (double)a22 + oua.i));
        List list = nZ6.m.f(nZ.J, new xy((double)n3, (double)n7, (double)n9, (double)n2, (double)n8, (double)n10));
        Lz lz2 = new Lz(nZ.L, nZ.k, nZ.i);
        int n11 = uSa.E;
        int n12 = n11;
        while (n12 < list.size()) {
            vL vL2 = (vL)list.get(n11);
            if (!vL2.i()) {
                double d12;
                double d13 = vL2.J(nZ.L, nZ.k, nZ.i) / (double)a22;
                if (d12 <= oua.i) {
                    vL vL3 = vL2;
                    double d14 = vL3.la - nZ.L;
                    vL vL4 = vL2;
                    double d15 = vL3.Z + (double)vL4.l() - nZ.k;
                    double d16 = vL4.A - nZ.i;
                    double d17 = d14;
                    double d18 = d15;
                    double d19 = d16;
                    double d20 = Oz.J((double)(d17 * d17 + d18 * d18 + d19 * d19));
                    if (d20 != aSa.V) {
                        double d21;
                        d14 /= d20;
                        d15 /= d20;
                        d16 /= d20;
                        vL vL5 = vL2;
                        double d22 = nZ.m.J(lz2, vL5.J());
                        double d23 = d21 = (oua.i - d13) * d22;
                        vL2.J(gZ.J((NZ)nZ), (float)((int)((d23 * d23 + d21) / KPa.y * Wqa.Z * (double)a22 + oua.i)));
                        vL vL6 = vL2;
                        double d24 = Iha.J((vL)vL6, (double)d21);
                        vL6.f(vL6.i + d14 * d24);
                        vL6.J(vL6.Ea + d15 * d24);
                        vL6.l(vL6.f + d16 * d24);
                        if (vL5 instanceof Sx && !((Sx)vL2).h.M) {
                            nZ.M.put((Sx)vL2, new Lz(d14 * d21, d15 * d21, d16 * d21));
                        }
                    }
                }
            }
            n12 = ++n11;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl) {
        NZ nZ;
        NZ nZ2;
        NZ nZ3 = nZ2 = this;
        nZ2.m.J(nZ3.L, nZ2.k, nZ2.i, sOa.r, YSa.G, (pqa.r + (nZ2.m.v.nextFloat() - nZ2.m.v.nextFloat()) * psa.N) * ZSa.q);
        if (nZ3.E >= kta.v && nZ2.j) {
            NZ nZ4 = nZ2;
            nZ = nZ4;
            nZ2.m.J(UZ.EXPLOSION_HUGE, nZ4.L, nZ2.k, nZ2.i, oua.i, aSa.V, aSa.V, new int[uSa.E]);
        } else {
            NZ nZ5 = nZ2;
            nZ = nZ5;
            nZ5.m.J(UZ.EXPLOSION_LARGE, nZ2.L, nZ2.k, nZ2.i, oua.i, aSa.V, aSa.V, new int[uSa.E]);
        }
        if (nZ.j) {
            for (XF b2 : nZ2.I) {
                void a2;
                Block block = nZ2.m.J(b2).J();
                if (a2 != false) {
                    XF xF = b2;
                    double d2 = (float)xF.getX() + nZ2.m.v.nextFloat();
                    NZ nZ6 = nZ2;
                    double d3 = (float)xF.getY() + nZ6.m.v.nextFloat();
                    double d4 = (float)xF.getZ() + nZ2.m.v.nextFloat();
                    double d5 = d2 - nZ2.L;
                    double d6 = d3 - nZ2.k;
                    double d7 = d4 - nZ2.i;
                    double d8 = d5;
                    double d9 = d6;
                    double d10 = d7;
                    double d11 = Oz.J((double)(d8 * d8 + d9 * d9 + d10 * d10));
                    d5 /= d11;
                    d6 /= d11;
                    d7 /= d11;
                    d11 = kTa.B / (d11 / (double)nZ2.E + tpa.k);
                    nZ2.m.J(UZ.EXPLOSION_NORMAL, (d2 + nZ2.L * oua.i) / KPa.y, (d3 + nZ2.k * oua.i) / KPa.y, (d4 + nZ2.i * oua.i) / KPa.y, d5 *= (d11 *= (double)(nZ2.m.v.nextFloat() * nZ2.m.v.nextFloat() + bpa.K)), d6 *= d11, d7 *= d11, new int[uSa.E]);
                    nZ6.m.J(UZ.SMOKE_NORMAL, d2, d3, d4, d5, d6, d7, new int[uSa.E]);
                }
                if (block.J() == Material.air) continue;
                if (block.J(nZ2)) {
                    NZ nZ7 = nZ2;
                    XF xF = b2;
                    block.J(nZ7.m, xF, nZ7.m.J(xF), pqa.r / nZ2.E, uSa.E);
                }
                nZ2.m.J(b2, QFa.HF.J(), yRa.d);
                block.J(nZ2.m, b2, nZ2);
            }
        }
        if (nZ2.A) {
            for (XF b2 : nZ2.I) {
                if (nZ2.m.J(b2).J().J() != Material.air || !nZ2.m.J(b2.down()).J().J() || nZ2.C.nextInt(yRa.d) != 0) continue;
                nZ2.m.J(b2, QFa.ic.J());
            }
        }
    }

    public Map<Sx, Lz> J() {
        NZ a2;
        return a2.M;
    }
}

