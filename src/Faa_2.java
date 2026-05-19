/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Baa
 *  DX
 *  Dha
 *  ERa
 *  FZ
 *  Faa
 *  Gg
 *  Jy
 *  LQa
 *  MZ
 *  Mz
 *  NOa
 *  NPa
 *  Oz
 *  PY
 *  QFa
 *  RIa
 *  RPa
 *  Rz
 *  Wsa
 *  XX
 *  Ypa
 *  ZOa
 *  Zta
 *  aSa
 *  hY
 *  hd
 *  hra
 *  oY
 *  pua
 *  uRa
 *  uY
 *  uw
 *  vL
 *  vRa
 *  vZ
 *  xy
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Faa_2 {
    private ConcurrentLinkedQueue<XF> H;
    private boolean c;
    private final FZ<vL>[] B;
    private int d;
    private final int[] a;
    public final long b;
    private final byte[] l;
    private final int[] e;
    public final int G;
    private static final Logger D = LogManager.getLogger();
    private int f;
    private final Gg F;
    private final XX[] g;
    private boolean L;
    private boolean E;
    private final Map<XF, uY> m;
    public boolean C;
    private boolean i;
    private boolean M;
    private long k;
    private boolean j;
    private long J;
    private final boolean[] A;
    public final int I;

    /*
     * WARNING - void declaration
     */
    private Block f(int n2, int n3, int n4) {
        XX xX2;
        void b2;
        int d222 = n2;
        Faa_2 c2 = this;
        Block block = QFa.HF;
        if (b2 >= 0 && b2 >> AQa.P < c2.g.length && (xX2 = c2.g[b2 >> AQa.P]) != null) {
            try {
                void a2;
                block = xX2.J(d222, b2 & Ypa.A, (int)a2);
                return block;
            }
            catch (Throwable d222) {
                RIa d222 = RIa.J((Throwable)d222, (String)RPa.Ga);
                throw new MZ(d222);
            }
        }
        return block;
    }

    public boolean J(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        if (b2 ? a2.C && a2.F.l() != a2.k || a2.c : a2.C && a2.F.l() >= a2.k + KSa.N) {
            return vRa.d != 0;
        }
        return a2.c;
    }

    /*
     * WARNING - void declaration
     */
    public Faa_2(Gg gg2, oz oz2, int n2, int n3) {
        int a2;
        int b2;
        void d22;
        Faa_2 faa_2 = this;
        void v0 = d22;
        faa_2((Gg)v0, b2, a2);
        int d22 = hra.Ja;
        b2 = !v0.F.f() ? vRa.d : uSa.E;
        int n4 = a2 = uSa.E;
        while (n4 < ERa.C) {
            int n5 = uSa.E;
            while (n5 < ERa.C) {
                int n6;
                int n7 = uSa.E;
                while (n7 < d22) {
                    void c2;
                    int n8;
                    int n9 = a2 * d22 * ERa.C | n6 * d22 | n8;
                    IBlockState iBlockState = c2.J(n9);
                    if (iBlockState.J().J() != Material.air) {
                        int e2 = n8 >> AQa.P;
                        if (faa_2.g[e2] == null) {
                            int n10 = e2;
                            int n11 = e2;
                            faa_2.g[n11] = new XX(n11 << AQa.P, b2 != 0);
                        }
                        faa_2.g[e2].J(a2, n8 & Ypa.A, n6, iBlockState);
                    }
                    n7 = ++n8;
                }
                n5 = ++n6;
            }
            n4 = ++a2;
        }
    }

    public boolean d() {
        Faa_2 a2;
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, uY uY2) {
        void b2;
        Faa_2 c2 = uY2;
        Faa_2 a2 = this;
        void v0 = b2;
        c2.J(a2.F);
        c2.J((XF)v0);
        if (a2.J((XF)v0) instanceof ITileEntityProvider) {
            if (a2.m.containsKey(b2)) {
                a2.m.get(b2).d();
            }
            c2.C();
            a2.m.put((XF)b2, (uY)c2);
        }
    }

    public void A() {
        int n2;
        Faa_2 faa_2 = this;
        int n3 = faa_2.f();
        faa_2.f = vqa.F;
        int n4 = n2 = uSa.E;
        while (n4 < ERa.C) {
            int n5 = uSa.E;
            while (n5 < ERa.C) {
                int a2;
                faa_2.e[n2 + (a2 << AQa.P)] = rta.n;
                int n6 = n3 + ERa.C;
                while (n6 > 0) {
                    int n7;
                    if (faa_2.f(n2, n7 - vRa.d, a2).C() != 0) {
                        faa_2.a[a2 << AQa.P | n2] = n7;
                        if (faa_2.a[a2 << AQa.P | n2] >= faa_2.f) break;
                        faa_2.f = n7;
                        break;
                    }
                    n6 = --n7;
                }
                n5 = ++a2;
            }
            n4 = ++n2;
        }
        faa_2.c = vRa.d;
    }

    public byte[] J() {
        Faa_2 a2;
        return a2.l;
    }

    private boolean l(int n2, int n3) {
        int a2;
        int c22 = n2;
        Faa_2 b2 = this;
        int n4 = b2.f();
        int n5 = uSa.E;
        int n6 = uSa.E;
        zz c22 = new zz((b2.I << AQa.P) + c22, uSa.E, (b2.G << AQa.P) + a2);
        int n7 = a2 = n4 + ERa.C - vRa.d;
        while (n7 > b2.F.M() || a2 > 0 && n6 == 0) {
            zz zz2 = c22;
            zz2.func_181079_c(zz2.getX(), a2, c22.getZ());
            n4 = b2.J(c22);
            if (n4 == osa.Ja && c22.getY() < b2.F.M()) {
                n6 = vRa.d;
            }
            if (n5 == 0 && n4 > 0) {
                n5 = vRa.d;
            } else if (n5 != 0 && n4 == 0 && !b2.F.D((XF)c22)) {
                return uSa.E != 0;
            }
            n7 = --a2;
        }
        int n8 = a2 = c22.getY();
        while (n8 > 0) {
            zz zz3 = c22;
            zz zz4 = c22;
            zz4.func_181079_c(zz3.getX(), a2, zz4.getZ());
            if (b2.J(zz3).f() > 0) {
                b2.F.D((XF)c22);
            }
            n8 = --a2;
        }
        return vRa.d != 0;
    }

    public int l(XF xF2) {
        Object b2 = xF2;
        Faa_2 a2 = this;
        return a2.J(b2.getX() & Ypa.A, b2.getY(), b2.getZ() & Ypa.A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(byte[] byArray) {
        int b2;
        void a2;
        Faa_2 faa_2 = this;
        if (faa_2.l.length != ((void)a2).length) {
            D.warn(new StringBuilder().insert(3 ^ 3, ITa.Ka).append(((void)a2).length).append(APa.t).append(faa_2.l.length).toString());
            return;
        }
        int n2 = b2 = uSa.E;
        while (n2 < faa_2.l.length) {
            int n3 = b2++;
            faa_2.l[n3] = a2[n3];
            n2 = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Faa_2(Gg gg2, int n2, int n3) {
        void a2;
        void b2;
        Faa_2 d2 = gg2;
        Faa_2 c2 = this;
        c2.g = new XX[ERa.C];
        Faa_2 faa_2 = c2;
        faa_2.l = new byte[hra.Ja];
        faa_2.e = new int[hra.Ja];
        faa_2.A = new boolean[hra.Ja];
        faa_2.m = Maps.newHashMap();
        faa_2.d = mPa.H;
        faa_2.H = Queues.newConcurrentLinkedQueue();
        faa_2.B = new FZ[ERa.C];
        Faa_2 faa_22 = c2;
        Faa_2 faa_23 = c2;
        faa_23.F = d2;
        faa_23.I = b2;
        faa_22.G = a2;
        faa_22.b = Baa.J((int)b2, (int)a2);
        faa_22.a = new int[hra.Ja];
        int n4 = d2 = uSa.E;
        while (n4 < c2.B.length) {
            c2.B[d2++] = new FZ(vL.class);
            n4 = d2;
        }
        Arrays.fill(c2.e, rta.n);
        Arrays.fill(c2.l, (byte)pua.o);
    }

    public void J(uY uY2) {
        Faa_2 a2;
        Faa_2 b2 = uY2;
        Faa_2 faa_2 = a2 = this;
        faa_2.J(b2.J(), (uY)b2);
        if (faa_2.L) {
            a2.F.J((uY)b2);
        }
    }

    public boolean C() {
        Faa_2 a2;
        return a2.j;
    }

    public Baa J() {
        Faa_2 a2;
        Faa_2 faa_2 = a2;
        return new Baa(faa_2.I, faa_2.G);
    }

    public void i() {
        a.d = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, int n2) {
        void a2;
        void b22;
        Faa_2 faa_2 = this;
        if (uw.N != pua.o) {
            return uw.N;
        }
        void v0 = b22;
        int b22 = v0.getX() & Ypa.A;
        int n3 = v0.getY();
        int n4 = v0.getZ() & Ypa.A;
        XX xX2 = faa_2.g[n3 >> AQa.P];
        if (xX2 == null) {
            if (!faa_2.F.F.f() && a2 < Mz.SKY.defaultLightValue) {
                return Mz.SKY.defaultLightValue - a2;
            }
            return uSa.E;
        }
        int c2 = faa_2.F.F.f() ? uSa.E : xX2.l(b22, n3 & Ypa.A, n4);
        if ((b22 = xX2.J(b22, n3 & Ypa.A, n4)) > (c2 -= a2)) {
            c2 = b22;
        }
        return c2;
    }

    public void M(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        a2.L = b2;
    }

    public int f() {
        int a2;
        Faa_2 faa_2 = this;
        int n2 = a2 = faa_2.g.length - vRa.d;
        while (n2 >= 0) {
            if (faa_2.g[a2] != null) {
                return faa_2.g[a2].J();
            }
            n2 = --a2;
        }
        return uSa.E;
    }

    public XX[] J() {
        Faa_2 a2;
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public Block J(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Faa_2 faa_2 = this;
        try {
            return faa_2.f(c2 & Ypa.A, (int)b2, a2 & Ypa.A);
        }
        catch (MZ d2) {
            MZ mZ2 = d2;
            mZ2.getCrashReport().J(NOa.U).J(Bua.F, (Callable)new vZ((Faa)faa_2, (int)c2, (int)b2, (int)a2));
            throw mZ2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XX[] xXArray) {
        int b2;
        void a2;
        Faa_2 faa_2 = this;
        if (faa_2.g.length != ((void)a2).length) {
            D.warn(new StringBuilder().insert(3 ^ 3, zOa.z).append(((void)a2).length).append(APa.t).append(faa_2.g.length).toString());
            return;
        }
        int n2 = b2 = uSa.E;
        while (n2 < faa_2.g.length) {
            int n3 = b2++;
            faa_2.g[n3] = a2[n3];
            n2 = b2;
        }
    }

    public int f(XF xF2) {
        Object b2 = xF2;
        Faa_2 a2 = this;
        return a2.J(b2.getX() & Ypa.A, b2.getZ() & Ypa.A);
    }

    /*
     * WARNING - void declaration
     */
    public uY J(XF xF2, oY oY2) {
        void b2;
        Faa_2 faa_2 = this;
        Faa_2 c2 = faa_2.m.get(b2);
        if (c2 == null) {
            void a2;
            if (a2 == oY.IMMEDIATE) {
                Faa_2 faa_22 = faa_2;
                c2 = faa_22.J((XF)b2);
                faa_22.F.f((XF)b2, (uY)c2);
                return c2;
            }
            if (a2 == oY.QUEUED) {
                faa_2.H.add((XF)b2);
                return c2;
            }
        } else if (c2.d()) {
            faa_2.m.remove(b2);
            return null;
        }
        return c2;
    }

    public void J(XF xF2) {
        Object b2 = xF2;
        Faa_2 a2 = this;
        if (a2.L && (b2 = a2.m.remove(b2)) != null) {
            b2.d();
        }
    }

    public FZ<vL>[] J() {
        Faa_2 a2;
        return a2.B;
    }

    /*
     * WARNING - void declaration
     */
    private void e(boolean bl) {
        Faa_2 faa_2;
        Faa_2 faa_22 = faa_2 = this;
        faa_22.F.H.J(GPa.F);
        if (faa_22.F.J(new XF(faa_2.I * ERa.C + Yqa.i, uSa.E, faa_2.G * ERa.C + Yqa.i), ERa.C)) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < ERa.C) {
                int n4 = uSa.E;
                while (n4 < ERa.C) {
                    int n5;
                    if (faa_2.A[n2 + n5 * ERa.C]) {
                        void a2;
                        Object b2;
                        Iterator<DZ> iterator;
                        Faa_2 faa_23 = faa_2;
                        Faa_2 faa_24 = faa_2;
                        faa_24.A[n2 + n5 * ERa.C] = uSa.E;
                        int n6 = faa_23.J(n2, n5);
                        int n7 = faa_24.I * ERa.C + n2;
                        int n8 = faa_23.G * ERa.C + n5;
                        int n9 = vqa.F;
                        Iterator<DZ> iterator2 = iterator = LX.HORIZONTAL.iterator();
                        while (iterator2.hasNext()) {
                            b2 = iterator.next();
                            n9 = Math.min(n9, faa_2.F.J(n7 + ((DZ)((Object)b2)).getFrontOffsetX(), n8 + ((DZ)((Object)b2)).getFrontOffsetZ()));
                            iterator2 = iterator;
                        }
                        faa_2.J(n7, n8, n9);
                        Iterator<DZ> iterator3 = iterator = LX.HORIZONTAL.iterator();
                        while (iterator3.hasNext()) {
                            b2 = iterator.next();
                            faa_2.J(n7 + ((DZ)((Object)b2)).getFrontOffsetX(), n8 + ((DZ)((Object)b2)).getFrontOffsetZ(), n6);
                            iterator3 = iterator;
                        }
                        if (a2 != false) {
                            faa_2.F.H.f();
                            return;
                        }
                    }
                    n4 = ++n5;
                }
                n3 = ++n2;
            }
            faa_2.i = uSa.E;
        }
        faa_2.F.H.f();
    }

    public void M() {
        Object a2;
        Faa_2 faa_2 = this;
        faa_2.L = uSa.E;
        Object object = a2 = faa_2.m.values().iterator();
        while (object.hasNext()) {
            uY uY2 = (uY)a2.next();
            object = a2;
            faa_2.F.J(uY2);
        }
        int n2 = a2 = uSa.E;
        while (n2 < faa_2.B.length) {
            Faa_2 faa_22 = faa_2;
            faa_22.F.f(faa_22.B[a2++]);
            n2 = a2;
        }
    }

    public Gg J() {
        Faa_2 a2;
        return a2.F;
    }

    /*
     * Unable to fully structure code
     */
    public void J(hd var1_2, hd var2_3, int var3_4, int var4_5) {
        var0_1 = var4_5;
        a = this;
        v0 = d;
        var5_7 = v0.J((int)b, (int)(e - vRa.d));
        var6_8 = v0.J((int)(b + vRa.d), (int)e);
        var7_9 = v0.J((int)b, (int)(e + vRa.d));
        var8_10 = v0.J((int)(b - vRa.d), (int)e);
        var9_11 = v0.J((int)(b - vRa.d), (int)(e - vRa.d));
        var10_12 = v0.J((int)(b + vRa.d), (int)(e + vRa.d));
        var11_13 = v0.J((int)(b - vRa.d), (int)(e + vRa.d));
        var12_14 = v0.J((int)(b + vRa.d), (int)(e - vRa.d));
        if (!var6_8 || !var7_9 || !var10_12) ** GOTO lbl19
        if (!a.M) {
            v1 = var8_10;
            d.J((hd)c, (int)b, (int)e);
        } else {
            d.J((hd)c, (Faa)a, (int)b, (int)e);
lbl19:
            // 2 sources

            v1 = var8_10;
        }
        if (!v1 || !var7_9 || !var11_13) ** GOTO lbl28
        var13_15 = d.J((int)(b - vRa.d), (int)e);
        if (!var13_15.M) {
            v2 = var5_7;
            d.J((hd)c, (int)(b - vRa.d), (int)e);
        } else {
            d.J((hd)c, var13_15, (int)(b - vRa.d), (int)e);
lbl28:
            // 2 sources

            v2 = var5_7;
        }
        if (!v2 || !var6_8 || !var12_14) ** GOTO lbl38
        var13_15 = d.J((int)b, (int)(e - vRa.d));
        v3 = d;
        if (!var13_15.M) {
            v3.J((hd)c, (int)b, (int)(e - vRa.d));
            v4 = var9_11;
        } else {
            v3.J((hd)c, var13_15, (int)b, (int)(e - vRa.d));
lbl38:
            // 2 sources

            v4 = var9_11;
        }
        if (v4 && var5_7 && var8_10) {
            var13_15 = d.J((int)(b - vRa.d), (int)(e - vRa.d));
            v5 = d;
            if (!var13_15.M) {
                v5.J((hd)c, (int)(b - vRa.d), (int)(e - vRa.d));
                return;
            }
            v5.J((hd)c, var13_15, (int)(b - vRa.d), (int)(e - vRa.d));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        void a2;
        int e2 = n4;
        Faa_2 b2 = this;
        if (a2 > e2 && b2.F.J(new XF((int)d2, uSa.E, (int)c2), ERa.C)) {
            if (b2.F.E.J && b2.F.E.A) {
                e2 = Math.max(e2, (int)(a2 - Ypa.A));
            }
            int n6 = e2 = e2;
            while (n6 < a2) {
                b2.F.J(Mz.SKY, new XF((int)d2, e2++, (int)c2));
                n6 = e2;
            }
            b2.c = vRa.d;
        }
    }

    public int J() {
        Faa_2 a2;
        return a2.f;
    }

    public void d(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        a2.c = b2;
    }

    /*
     * WARNING - void declaration
     */
    private uY J(XF xF2) {
        void a2;
        Object object = this;
        Block b2 = ((Faa_2)object).J((XF)a2);
        if (!b2.a()) {
            return null;
        }
        return ((ITileEntityProvider)((Object)b2)).J(((Faa_2)object).F, ((Faa_2)object).l((XF)a2));
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(XF xF2) {
        void a2;
        Object b22;
        Faa_2 faa_2 = this;
        if (faa_2.F.J() == Fy.A) {
            b22 = null;
            if (a2.getY() == Psa.M) {
                b22 = QFa.fE.J();
            }
            if (a2.getY() == NPa.e) {
                b22 = Rz.J((int)a2.getX(), (int)a2.getZ());
            }
            if (b22 == null) {
                return QFa.HF.J();
            }
            return b22;
        }
        try {
            if (a2.getY() >= 0 && a2.getY() >> AQa.P < faa_2.g.length && (b22 = faa_2.g[a2.getY() >> AQa.P]) != null) {
                void v0 = a2;
                int n2 = v0.getX() & Ypa.A;
                int n3 = v0.getY() & Ypa.A;
                int n4 = v0.getZ() & Ypa.A;
                return b22.J(n2, n3, n4);
            }
            return QFa.HF.J();
        }
        catch (Throwable b22) {
            RIa rIa2 = RIa.J((Throwable)b22, (String)uRa.V);
            Dha dha = rIa2.J(NOa.U);
            dha.J(Bua.F, (Callable)new PY((Faa)faa_2, (XF)a2));
            throw new MZ(rIa2);
        }
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        a2.M = b2;
    }

    public boolean J(XF xF2) {
        int n2;
        Object b22 = xF2;
        Faa_2 a2 = this;
        Object object = b22;
        int b22 = object.getX() & Ypa.A;
        int n3 = object.getY();
        if (n3 >= a2.a[(n2 = object.getZ() & Ypa.A) << AQa.P | b22]) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     */
    public IBlockState J(XF var1_4, IBlockState var2_5) {
        block17: {
            block15: {
                block20: {
                    block19: {
                        block18: {
                            block16: {
                                var3_6 = this;
                                v0 = b;
                                var10_7 = v0.getX() & Ypa.A;
                                var4_8 = v0.getY();
                                if (var4_8 >= var3_6.e[var6_10 = (var5_9 = v0.getZ() & Ypa.A) << AQa.P | var10_7] - vRa.d) {
                                    var3_6.e[var6_10] = rta.n;
                                }
                                var6_10 = var3_6.a[var6_10];
                                var7_11 = var3_6.J((XF)b);
                                if (var7_11 == a) {
                                    return null;
                                }
                                var8_12 = a.J();
                                var9_13 = var7_11.J();
                                c = var3_6.g[var4_8 >> AQa.P];
                                var11_14 = uSa.E;
                                if (c == null) {
                                    if (var8_12 == QFa.HF) {
                                        return null;
                                    }
                                    v1 = new XX(var4_8 >> AQa.P << AQa.P, (boolean)(var3_6.F.F.f() == false ? vRa.d : uSa.E));
                                    var3_6.g[var4_8 >> AQa.P] = v1;
                                    c = v1;
                                    var11_14 = var4_8 >= var6_10 ? vRa.d : uSa.E;
                                }
                                c.J(var10_7, var4_8 & Ypa.A, var5_9, (IBlockState)a);
                                if (var9_13 == var8_12) ** GOTO lbl31
                                v2 = var9_13;
                                if (!var3_6.F.e) {
                                    v2.l(var3_6.F, (XF)b, var7_11);
                                    v3 = c;
                                } else {
                                    if (v2 instanceof ITileEntityProvider) {
                                        var3_6.F.f((XF)b);
                                    }
lbl31:
                                    // 4 sources

                                    v3 = c;
                                }
                                if (v3.J(var10_7, var4_8 & Ypa.A, var5_9) != var8_12) {
                                    return null;
                                }
                                if (!uw.x) break block15;
                                if (var11_14 == 0) break block16;
                                v4 = var9_13;
                                var3_6.d();
                                break block17;
                            }
                            c = var8_12.C();
                            var11_14 = var9_13.C();
                            if (c <= 0) break block18;
                            if (var4_8 < var6_10) break block19;
                            v5 = c;
                            var3_6.f(var10_7, var4_8 + vRa.d, var5_9);
                            break block20;
                        }
                        if (var4_8 == var6_10 - vRa.d) {
                            var3_6.f(var10_7, var4_8, var5_9);
                        }
                    }
                    v5 = c;
                }
                if (v5 != var11_14 && (c < var11_14 || var3_6.J(Mz.SKY, (XF)b) > 0 || var3_6.J(Mz.BLOCK, (XF)b) > 0)) {
                    var3_6.J(var10_7, var5_9);
                }
            }
            v4 = var9_13;
        }
        if (v4 instanceof ITileEntityProvider && (c = var3_6.J((XF)b, oY.CHECK)) != null) {
            c.e();
        }
        if (!var3_6.F.e && var9_13 != var8_12) {
            var8_12.f(var3_6.F, (XF)b, (IBlockState)a);
        }
        if (var8_12 instanceof ITileEntityProvider) {
            c = var3_6.J((XF)b, oY.CHECK);
            if (c == null) {
                c = ((ITileEntityProvider)var8_12).J(var3_6.F, var8_12.f((IBlockState)a));
                var3_6.F.f((XF)b, c);
            }
            if (c != null) {
                c.e();
            }
        }
        var3_6.c = vRa.d;
        return var7_11;
    }

    public void f(long a2) {
        b.J = a2;
    }

    public Map<XF, uY> J() {
        Faa_2 a2;
        return a2.m;
    }

    public void l(boolean bl) {
        boolean b22 = bl;
        Faa_2 a2 = this;
        if (a2.i && !a2.F.F.f() && !b22) {
            Faa_2 faa_2 = a2;
            faa_2.e(faa_2.F.e);
        }
        a2.E = vRa.d;
        if (!a2.j && a2.M) {
            a2.e();
        }
        while (!a2.H.isEmpty()) {
            XF b22 = a2.H.poll();
            if (a2.J(b22, oY.CHECK) != null || !a2.J(b22).a()) continue;
            Faa_2 faa_2 = a2;
            uY uY2 = faa_2.J(b22);
            faa_2.F.f(b22, uY2);
            XF xF2 = b22;
            faa_2.F.J(xF2, xF2);
        }
    }

    public void e() {
        Faa_2 faa_2;
        Faa_2 faa_22 = faa_2 = this;
        faa_22.M = vRa.d;
        faa_22.j = vRa.d;
        Faa_2 faa_23 = faa_2;
        XF xF2 = new XF(faa_23.I << AQa.P, uSa.E, faa_2.G << AQa.P);
        if (!faa_23.F.F.f()) {
            if (faa_2.F.J(xF2.add(pua.o, uSa.E, pua.o), xF2.add(ERa.C, faa_2.F.M(), ERa.C))) {
                Faa_2 faa_24;
                block8: {
                    int n2;
                    int n3 = n2 = uSa.E;
                    while (n3 < ERa.C) {
                        int n4 = uSa.E;
                        while (n4 < ERa.C) {
                            int a2;
                            if (!faa_2.l(n2, a2)) {
                                faa_24 = faa_2;
                                faa_2.j = uSa.E;
                                break block8;
                            }
                            n4 = ++a2;
                        }
                        n3 = ++n2;
                    }
                    faa_24 = faa_2;
                }
                if (faa_24.j) {
                    Iterator<DZ> iterator;
                    Iterator<DZ> iterator2 = iterator = LX.HORIZONTAL.iterator();
                    while (iterator2.hasNext()) {
                        DZ a2 = iterator.next();
                        int n5 = a2.getAxisDirection() == DX.POSITIVE ? ERa.C : vRa.d;
                        super.J(a2.getOpposite());
                        iterator2 = iterator;
                    }
                    faa_2.J();
                    return;
                }
            } else {
                faa_2.j = uSa.E;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(XF xF2, Ay ay2) {
        Jy jy2;
        void b2;
        Faa_2 faa_2 = this;
        void v0 = b2;
        int n2 = v0.getX() & Ypa.A;
        int n3 = v0.getZ() & Ypa.A;
        int c2 = faa_2.l[n3 << AQa.P | n2] & osa.Ja;
        if (c2 == osa.Ja) {
            void a2;
            jy2 = a2.J((XF)b2, Jy.Z);
            c2 = jy2.Ka;
            faa_2.l[n3 << AQa.P | n2] = (byte)(c2 & osa.Ja);
        }
        if ((jy2 = Jy.l((int)c2)) == null) {
            return Jy.Z;
        }
        return jy2;
    }

    public int J(XF xF2) {
        Object b2 = xF2;
        Faa_2 a2 = this;
        return a2.J((XF)((Object)b2)).C();
    }

    public void d() {
        int n2;
        Faa_2 faa_2 = this;
        int n3 = faa_2.f();
        faa_2.f = vqa.F;
        int n4 = n2 = uSa.E;
        while (n4 < ERa.C) {
            int n5 = uSa.E;
            while (n5 < ERa.C) {
                Faa_2 faa_22;
                int n6;
                int a2;
                block7: {
                    faa_2.e[n2 + (n6 << AQa.P)] = rta.n;
                    int n7 = n3 + ERa.C;
                    while (n7 > 0) {
                        if (faa_2.f(n2, a2 - vRa.d, n6) != 0) {
                            faa_2.a[n6 << AQa.P | n2] = a2;
                            if (faa_2.a[n6 << AQa.P | n2] >= faa_2.f) break;
                            faa_22 = faa_2;
                            faa_2.f = a2;
                            break block7;
                        }
                        n7 = --a2;
                    }
                    faa_22 = faa_2;
                }
                if (!faa_22.F.F.f()) {
                    a2 = Ypa.A;
                    int n8 = n3 + ERa.C - vRa.d;
                    do {
                        XX xX2;
                        int n9;
                        if ((n9 = faa_2.f(n2, n8, n6)) == 0 && a2 != Ypa.A) {
                            n9 = vRa.d;
                        }
                        if ((a2 -= n9) <= 0 || (xX2 = faa_2.g[n8 >> AQa.P]) == null) continue;
                        xX2.f(n2, n8 & Ypa.A, n6, a2);
                        faa_2.F.l(new XF((faa_2.I << AQa.P) + n2, n8, (faa_2.G << AQa.P) + n6));
                    } while (--n8 > 0 && a2 > 0);
                }
                n5 = ++n6;
            }
            n4 = ++n2;
        }
        faa_2.c = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    private void J(DZ dZ2) {
        block4: {
            int b2222;
            void a2;
            Faa_2 faa_2;
            block7: {
                int b2222;
                block6: {
                    int b2222;
                    block5: {
                        int b2222;
                        faa_2 = this;
                        if (!faa_2.M) break block4;
                        if (a2 != DZ.EAST) break block5;
                        int n2 = b2222 = uSa.E;
                        while (n2 < ERa.C) {
                            faa_2.l(Ypa.A, b2222++);
                            n2 = b2222;
                        }
                        break block4;
                    }
                    if (a2 != DZ.WEST) break block6;
                    int n3 = b2222 = uSa.E;
                    while (n3 < ERa.C) {
                        faa_2.l(uSa.E, b2222++);
                        n3 = b2222;
                    }
                    break block4;
                }
                if (a2 != DZ.SOUTH) break block7;
                int n4 = b2222 = uSa.E;
                while (n4 < ERa.C) {
                    faa_2.l(b2222++, Ypa.A);
                    n4 = b2222;
                }
                break block4;
            }
            if (a2 != DZ.NORTH) break block4;
            int n5 = b2222 = uSa.E;
            while (n5 < ERa.C) {
                faa_2.l(b2222++, uSa.E);
                n5 = b2222;
            }
        }
    }

    public void C() {
        int a2;
        Faa_2 faa_2 = this;
        faa_2.L = vRa.d;
        faa_2.F.J(faa_2.m.values());
        int n2 = a2 = uSa.E;
        while (n2 < faa_2.B.length) {
            Iterator iterator = faa_2.B[a2].iterator();
            while (iterator.hasNext()) {
                Iterator iterator2;
                ((vL)iterator2.next()).b();
                iterator = iterator2;
            }
            Faa_2 faa_22 = faa_2;
            faa_22.F.l(faa_22.B[a2++]);
            n2 = a2;
        }
    }

    public void l() {
        a.c = vRa.d;
    }

    private void J(int n2, int n3) {
        int c2 = n3;
        Faa_2 a2 = this;
        a2.A[b + c2 * ERa.C] = vRa.d;
        a2.i = vRa.d;
    }

    public void f() {
        int n2;
        Faa_2 faa_2;
        Faa_2 faa_22 = faa_2 = this;
        int n3 = faa_22.I << AQa.P;
        int n4 = faa_22.G << AQa.P;
        zz zz2 = new zz();
        zz zz3 = new zz();
        int n5 = n2 = uSa.E;
        while (n5 < Yqa.i) {
            if (faa_2.d >= mPa.H) {
                return;
            }
            Faa_2 faa_23 = faa_2;
            int n6 = faa_23.d % ERa.C;
            int n7 = faa_23.d / ERa.C % ERa.C;
            int n8 = faa_23.d / hra.Ja;
            faa_23.d += vRa.d;
            int n9 = uSa.E;
            while (n9 < ERa.C) {
                int n10;
                int a2;
                zz zz4 = zz2.func_181079_c(n3 + n7, (n6 << AQa.P) + a2, n4 + n8);
                int n11 = n10 = a2 == 0 || a2 == Ypa.A || n7 == 0 || n7 == Ypa.A || n8 == 0 || n8 == Ypa.A ? vRa.d : uSa.E;
                if (faa_2.g[n6] == null && n10 != 0 || faa_2.g[n6] != null && faa_2.g[n6].J(n7, a2, n8).J() == Material.air) {
                    DZ[] dZArray = DZ.VALUES;
                    int n12 = DZ.VALUES.length;
                    int n13 = uSa.E;
                    while (n13 < n12) {
                        int n14;
                        Object object = dZArray[n14];
                        object = zz3.func_181079_c(zz2.getX() + object.getFrontOffsetX(), zz2.getY() + object.getFrontOffsetY(), zz2.getZ());
                        if (faa_2.F.J((XF)((Object)object)).J().f() > 0) {
                            faa_2.F.D((XF)((Object)object));
                        }
                        n13 = ++n14;
                    }
                    faa_2.F.D((XF)zz4);
                }
                n9 = ++a2;
            }
            n5 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mz mz2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Faa_2 a2 = this;
        if (uw.N != pua.o) {
            return uw.N;
        }
        XX xX2 = a2.g[c2.getY() >> AQa.P];
        if (xX2 == null) {
            if (c2.getY() >= a2.a[(c2.getX() & Ypa.A) << AQa.P | c2.getZ() & Ypa.A]) {
                return b2.defaultLightValue;
            }
            return uSa.E;
        }
        if (b2 == Mz.SKY) {
            if (a2.F.F.f()) {
                return uSa.E;
            }
            return xX2.l(c2.getX() & Ypa.A, c2.getY() & Ypa.A, c2.getZ() & Ypa.A);
        }
        return xX2.J(c2.getX() & Ypa.A, c2.getY() & Ypa.A, c2.getZ() & Ypa.A);
    }

    /*
     * WARNING - void declaration
     */
    private int f(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Faa_2 a2 = this;
        return a2.f((int)c2, (int)b2, d2).C();
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, xy xy2, List<vL> list, Predicate<? super vL> predicate) {
        void c2;
        Faa_2 faa_2 = this;
        void v0 = c2;
        int n2 = Oz.f((double)((v0.j - KPa.y) / Zta.ba));
        int n3 = Oz.f((double)((v0.M + KPa.y) / Zta.ba));
        n2 = Oz.f((int)n2, (int)uSa.E, (int)(faa_2.B.length - vRa.d));
        n3 = Oz.f((int)n3, (int)uSa.E, (int)(faa_2.B.length - vRa.d));
        int n4 = n2 = n2;
        while (n4 <= n3) {
            if (!faa_2.B[n2].isEmpty()) {
                for (Faa_2 e2 : faa_2.B[n2]) {
                    vL[] vLArray;
                    void b2;
                    void a2;
                    void d2;
                    if (!e2.J().J((xy)c2) || e2 == d2) continue;
                    if (a2 == null || a2.apply(e2)) {
                        b2.add(e2);
                    }
                    if ((vLArray = e2.J()) == null) continue;
                    int n5 = uSa.E;
                    while (n5 < vLArray.length) {
                        int n6;
                        e2 = vLArray[n6];
                        if (e2 != d2 && e2.J().J((xy)c2) && (a2 == null || a2.apply(e2))) {
                            b2.add(e2);
                        }
                        n5 = ++n6;
                    }
                }
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Faa_2 a2 = this;
        return a2.a[c2 << AQa.P | b2];
    }

    public boolean l() {
        Faa_2 a2;
        if (a2.E && a2.M && a2.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2) {
        void a2;
        Faa_2 faa_2 = this;
        void v0 = a2;
        faa_2.C = vRa.d;
        int b2 = Oz.f((double)(v0.la / Zta.ba));
        int n2 = Oz.f((double)(v0.A / Zta.ba));
        if (b2 != faa_2.I || n2 != faa_2.G) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = a2;
            D.warn(new StringBuilder().insert(3 & 4, aSa.w).append(b2).append(TOa.n).append(n2).append(Tqa.d).append(faa_2.I).append(TOa.n).append(faa_2.G).append(cPa.V).append(a2).toString(), objectArray);
            a2.k();
        }
        if ((b2 = Oz.f((double)(a2.Z / Zta.ba))) < 0) {
            b2 = uSa.E;
        }
        if (b2 >= faa_2.B.length) {
            b2 = faa_2.B.length - vRa.d;
        }
        void v2 = a2;
        a2.T = vRa.d;
        v2.N = faa_2.I;
        v2.Ba = b2;
        a2.L = faa_2.G;
        faa_2.B[b2].add((Object)a2);
    }

    public Block J(XF xF2) {
        Object b2 = xF2;
        Faa_2 a2 = this;
        try {
            return a2.f(b2.getX() & Ypa.A, b2.getY(), b2.getZ() & Ypa.A);
        }
        catch (MZ mZ2) {
            MZ mZ3 = mZ2;
            mZ3.getCrashReport().J(NOa.U).J(Bua.F, (Callable)new hY((Faa)a2, (XF)((Object)b2)));
            throw mZ3;
        }
    }

    public boolean f() {
        return uSa.E != 0;
    }

    public Random J(long a2) {
        Faa_2 b2;
        Faa_2 faa_2 = b2;
        Faa_2 faa_22 = b2;
        return new Random(b2.F.J() + (long)(faa_2.I * faa_2.I * ZOa.Y) + (long)(b2.I * LQa.Da) + (long)(faa_22.G * faa_22.G) * aua.x + (long)(b2.G * RPa.q) ^ a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mz mz2, XF xF2, int n2) {
        void a2;
        void c2;
        void b22;
        Faa_2 faa_2 = this;
        void v0 = b22;
        int b22 = v0.getX() & Ypa.A;
        int d2 = v0.getY();
        int n3 = v0.getZ() & Ypa.A;
        XX xX2 = faa_2.g[d2 >> AQa.P];
        if (xX2 == null) {
            XX xX3 = new XX(d2 >> AQa.P << AQa.P, (!faa_2.F.F.f() ? vRa.d : uSa.E) != 0);
            faa_2.g[d2 >> AQa.P] = xX3;
            xX2 = xX3;
            faa_2.d();
        }
        faa_2.c = vRa.d;
        if (c2 == Mz.SKY) {
            if (!faa_2.F.F.f()) {
                xX2.f(b22, d2 & Ypa.A, n3, (int)a2);
                return;
            }
        } else if (c2 == Mz.BLOCK) {
            xX2.J(b22, d2 & Ypa.A, n3, (int)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, int n4) {
        int b22;
        void c2;
        void a2;
        int n5;
        Faa_2 faa_2 = this;
        int n6 = n5 = faa_2.a[a2 << AQa.P | c2] & osa.Ja;
        if (b22 > n5) {
            n6 = b22;
        }
        int n7 = n6;
        while (n7 > 0 && faa_2.f((int)c2, n6 - vRa.d, (int)a2) == 0) {
            n7 = --n6;
        }
        if (n6 != n5) {
            if (b22 = faa_2.F.E.J((int)(c2 + faa_2.I * ERa.C), b22, (int)(a2 + faa_2.G * ERa.C))) {
                faa_2.F.J((int)(c2 + faa_2.I * ERa.C), (int)(a2 + faa_2.G * ERa.C), n6, n5);
            }
            Faa_2 faa_22 = faa_2;
            faa_22.a[a2 << AQa.P | c2] = n6;
            int n8 = faa_22.I * ERa.C + c2;
            int n9 = faa_22.G * ERa.C + a2;
            if (!faa_22.F.F.f()) {
                XX xX2;
                int d2;
                if (n6 < n5) {
                    int n10 = d2 = n6;
                    while (n10 < n5) {
                        xX2 = faa_2.g[d2 >> AQa.P];
                        if (xX2 != null) {
                            xX2.f((int)c2, d2 & Ypa.A, (int)a2, Ypa.A);
                            faa_2.F.l(new XF((faa_2.I << AQa.P) + c2, d2, (faa_2.G << AQa.P) + a2));
                        }
                        n10 = ++d2;
                    }
                } else {
                    int n11 = d2 = n5;
                    while (n11 < n6) {
                        xX2 = faa_2.g[d2 >> AQa.P];
                        if (xX2 != null) {
                            xX2.f((int)c2, d2 & Ypa.A, (int)a2, uSa.E);
                            faa_2.F.l(new XF((faa_2.I << AQa.P) + c2, d2, (faa_2.G << AQa.P) + a2));
                        }
                        n11 = ++d2;
                    }
                }
                d2 = Ypa.A;
                while (n6 > 0 && d2 > 0) {
                    XX xX3;
                    int n12;
                    if ((n12 = faa_2.f((int)c2, --n6, (int)a2)) == 0) {
                        n12 = vRa.d;
                    }
                    if ((d2 -= n12) < 0) {
                        d2 = uSa.E;
                    }
                    if ((xX3 = faa_2.g[n6 >> AQa.P]) == null) continue;
                    xX3.f((int)c2, n6 & Ypa.A, (int)a2, d2);
                }
            }
            int d2 = faa_2.a[a2 << AQa.P | c2];
            int n13 = n5;
            int n14 = d2;
            if (d2 < n5) {
                n13 = d2;
                n14 = n5;
            }
            if (d2 < faa_2.f) {
                faa_2.f = d2;
            }
            if (b22) {
                if (!faa_2.F.F.f()) {
                    Iterator<DZ> iterator = c2 = LX.HORIZONTAL.iterator();
                    while (iterator.hasNext()) {
                        DZ b22 = c2.next();
                        faa_2.J(n8 + b22.getFrontOffsetX(), n9 + b22.getFrontOffsetZ(), n13, n14);
                        iterator = c2;
                    }
                    faa_2.J(n8, n9, n13, n14);
                }
                faa_2.F.E.J();
            }
            faa_2.c = vRa.d;
        }
    }

    public void J(long a2) {
        b.k = a2;
    }

    public long J() {
        Faa_2 a2;
        return a2.J;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        a2.j = b2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Faa_2 a2 = this;
        a2.C = b2;
    }

    public int[] J() {
        Faa_2 a2;
        return a2.a;
    }

    /*
     * WARNING - void declaration
     */
    private int J(int n2, int n3, int n4) {
        int d2 = n3;
        Faa_2 b2 = this;
        if (d2 >> AQa.P >= b2.g.length) {
            return uSa.E;
        }
        XX xX2 = b2.g[d2 >> AQa.P];
        if (xX2 != null) {
            void a2;
            void c2;
            return xX2.f((int)c2, d2 & Ypa.A, (int)a2);
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int[] nArray) {
        int b2;
        void a2;
        Faa_2 faa_2 = this;
        if (faa_2.a.length != ((void)a2).length) {
            D.warn(new StringBuilder().insert(3 ^ 3, Wsa.F).append(((void)a2).length).append(APa.t).append(faa_2.a.length).toString());
            return;
        }
        int n2 = b2 = uSa.E;
        while (n2 < faa_2.a.length) {
            int n3 = b2++;
            faa_2.a[n3] = a2[n3];
            n2 = b2;
        }
    }

    public void J(vL vL2) {
        Faa_2 b2 = vL2;
        Faa_2 a2 = this;
        Faa_2 faa_2 = b2;
        a2.J((vL)faa_2, ((vL)faa_2).Ba);
    }

    /*
     * WARNING - void declaration
     */
    public XF J(XF xF2) {
        void a2;
        Faa_2 faa_2 = this;
        void v0 = a2;
        int n2 = v0.getX() & Ypa.A;
        int b22 = v0.getZ() & Ypa.A;
        XF b22 = new XF(a2.getX(), faa_2.e[n2 |= b22 << AQa.P], a2.getZ());
        if (b22.getY() == rta.n) {
            int n3 = faa_2.f() + Ypa.A;
            b22 = new XF(a2.getX(), n3, a2.getZ());
            n3 = pua.o;
            while (b22.getY() > 0 && n3 == pua.o) {
                Material material = faa_2.J(b22).J();
                if (!material.f() && !material.l()) {
                    b22 = b22.down();
                    continue;
                }
                n3 = b22.getY() + vRa.d;
            }
            faa_2.e[n2] = n3;
        }
        return new XF(a2.getX(), faa_2.e[n2], a2.getZ());
    }

    public boolean f(int n2, int n3) {
        int a2;
        int c2 = n2;
        Faa_2 b2 = this;
        if (c2 < 0) {
            c2 = uSa.E;
        }
        if (a2 >= hra.Ja) {
            a2 = osa.Ja;
        }
        int n4 = c2 = c2;
        while (n4 <= a2) {
            XX xX2 = b2.g[c2 >> AQa.P];
            if (xX2 != null && !xX2.J()) {
                return uSa.E != 0;
            }
            n4 = c2 += 16;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Faa_2 a2 = this;
        if (b2 == a2.I && c2 == a2.G) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J() {
        int a2;
        Faa_2 faa_2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < faa_2.A.length) {
            faa_2.A[a2++] = vRa.d;
            n2 = a2;
        }
        faa_2.e(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public <T extends vL> void J(Class<? extends T> clazz, xy xy2, List<T> list, Predicate<? super T> predicate) {
        void c2;
        Faa_2 faa_2 = this;
        void v0 = c2;
        int e2 = Oz.f((double)((v0.j - KPa.y) / Zta.ba));
        int n2 = Oz.f((double)((v0.M + KPa.y) / Zta.ba));
        e2 = Oz.f((int)e2, (int)uSa.E, (int)(faa_2.B.length - vRa.d));
        n2 = Oz.f((int)n2, (int)uSa.E, (int)(faa_2.B.length - vRa.d));
        int n3 = e2 = e2;
        while (n3 <= n2) {
            void d2;
            for (vL vL2 : faa_2.B[e2].J((Class)d2)) {
                void b2;
                void a2;
                if (!vL2.J().J((xy)c2) || a2 != null && !a2.apply(vL2)) continue;
                b2.add(vL2);
            }
            n3 = ++e2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Faa_2 faa_2 = this;
        int d2 = faa_2.F.l(new XF((int)c2, uSa.E, (int)b2)).getY();
        if (d2 > a2) {
            faa_2.J((int)c2, (int)b2, (int)a2, d2 + vRa.d);
            return;
        }
        if (d2 < a2) {
            faa_2.J((int)c2, (int)b2, d2, (int)(a2 + vRa.d));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, int n2) {
        void b2;
        int c2 = n2;
        Faa_2 a2 = this;
        if (c2 < 0) {
            c2 = uSa.E;
        }
        if (c2 >= a2.B.length) {
            c2 = a2.B.length - vRa.d;
        }
        a2.B[c2].remove((Object)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(byte[] byArray, int n2, boolean bl) {
        void a2;
        void c2;
        Object object;
        void b2;
        int d2;
        Faa_2 faa_2 = this;
        int n3 = uSa.E;
        int n4 = !faa_2.F.F.f() ? vRa.d : uSa.E;
        int n5 = d2 = uSa.E;
        while (n5 < faa_2.g.length) {
            if ((b2 & vRa.d << d2) != 0) {
                if (faa_2.g[d2] == null) {
                    int n6 = d2;
                    int n7 = d2;
                    faa_2.g[n7] = new XX(n7 << AQa.P, n4 != 0);
                }
                object = faa_2.g[d2].J();
                int n8 = uSa.E;
                while (n8 < ((char[])object).length) {
                    int n9;
                    char c3 = (char)((c2[n3 + vRa.d] & osa.Ja) << Yqa.i | c2[n3] & osa.Ja);
                    n3 += 2;
                    object[n9] = c3;
                    n8 = ++n9;
                }
            } else if (a2 != false && faa_2.g[d2] != null) {
                faa_2.g[d2] = null;
            }
            n5 = ++d2;
        }
        int n10 = d2 = uSa.E;
        while (n10 < faa_2.g.length) {
            if ((b2 & vRa.d << d2) != 0 && faa_2.g[d2] != null) {
                object = faa_2.g[d2].f();
                System.arraycopy(c2, n3, object.J(), uSa.E, object.J().length);
                n3 += object.J().length;
            }
            n10 = ++d2;
        }
        if (n4 != 0) {
            int n11 = d2 = uSa.E;
            while (n11 < faa_2.g.length) {
                if ((b2 & vRa.d << d2) != 0 && faa_2.g[d2] != null) {
                    object = faa_2.g[d2].J();
                    System.arraycopy(c2, n3, object.J(), uSa.E, object.J().length);
                    n3 += object.J().length;
                }
                n11 = ++d2;
            }
        }
        if (a2 != false) {
            System.arraycopy(c2, n3, faa_2.l, uSa.E, faa_2.l.length);
            d2 = n3 + faa_2.l.length;
        }
        int n12 = d2 = uSa.E;
        while (n12 < faa_2.g.length) {
            if (faa_2.g[d2] != null && (b2 & vRa.d << d2) != 0) {
                faa_2.g[d2].J();
            }
            n12 = ++d2;
        }
        Faa_2 faa_22 = faa_2;
        faa_22.j = vRa.d;
        faa_22.M = vRa.d;
        faa_22.A();
        Iterator<uY> iterator = d2 = faa_22.m.values().iterator();
        while (iterator.hasNext()) {
            object = d2.next();
            iterator = d2;
            object.e();
        }
    }

    public boolean J() {
        Faa_2 a2;
        return a2.M;
    }
}

