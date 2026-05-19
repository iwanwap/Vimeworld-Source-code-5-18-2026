/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Ega
 *  HA
 *  Hda
 *  JPa
 *  Mda
 *  NTa
 *  QFa
 *  Waa
 *  Ypa
 *  ZFa
 *  ZRa
 *  aSa
 *  aX
 *  cRa
 *  fda
 *  hra
 *  iea
 *  jsa
 *  kba
 *  kea
 *  kta
 *  pqa
 *  pua
 *  rd
 *  uRa
 *  ura
 *  vRa
 *  vX
 *  xy
 *  zsa
 */
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cz_3
extends vX
implements rd,
HA {
    private Mda E;
    private int m;
    public static final Hda[][] C;
    private int i;
    private String M;
    private long k;
    private float j;
    private final List<VX> J = Lists.newArrayList();
    private int A;
    private boolean I;

    public int l() {
        return vRa.d;
    }

    public int f() {
        return vRa.d;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Cz_3 a2 = this;
        if (b2 == 0) {
            return a2.E;
        }
        return null;
    }

    public Mda f(int n2) {
        int b22 = n2;
        Cz_3 a2 = this;
        if (b22 == 0 && a2.E != null) {
            Mda b22 = a2.E;
            a2.E = null;
            return b22;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        void b22;
        int c2 = n3;
        Cz_3 a2 = this;
        if (b22 == false && a2.E != null) {
            if (c2 >= a2.E.E) {
                Mda b22 = a2.E;
                a2.E = null;
                return b22;
            }
            a2.E.E -= c2;
            return new Mda(a2.E.J(), c2, a2.E.J());
        }
        return null;
    }

    public Cz_3() {
        Cz_3 a2;
        a2.m = pua.o;
    }

    public String J() {
        Cz_3 a2;
        if (a2.J()) {
            return a2.M;
        }
        return tpa.Q;
    }

    public boolean J(Sx sx2) {
        Cz_3 a2;
        Object b2 = sx2;
        Cz_3 cz_3 = a2 = this;
        if (cz_3.worldObj.J(cz_3.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void A() {
        block17: {
            v0 = var1_3 = this;
            var8_4 = v0.m;
            var5_5 = v0.pos.getX();
            var10_6 = v0.pos.getY();
            var4_7 = v0.pos.getZ();
            v0.m = uSa.E;
            v0.J.clear();
            v0.I = vRa.d;
            var2_8 = new VX(ZFa.J((iea)iea.WHITE));
            v0.J.add(var2_8);
            var6_10 = vRa.d;
            var7_11 /* !! */  = new zz();
            a = var10_6 + vRa.d;
            v1 = a;
            while (v1 < hra.Ja) {
                block19: {
                    var9_15 = var1_3.worldObj.J((XF)var7_11 /* !! */ .func_181079_c(var5_5, a, var4_7));
                    if (var9_15.J() != QFa.VA) break block19;
                    var3_12 = ZFa.J((iea)var9_15.J(BlockStainedGlass.COLOR));
                    v2 = var6_10;
                    ** GOTO lbl34
                }
                if (var9_15.J() != QFa.KC) {
                    if (var9_15.J().C() >= Ypa.A && var9_15.J() != QFa.bg) {
                        v3 = var1_3;
                        v4 = v3;
                        v3.I = uSa.E;
                        v3.J.clear();
                        break block17;
                    }
                    var2_8.J();
                } else {
                    var3_12 = ZFa.J((iea)var9_15.J(BlockStainedGlassPane.COLOR));
                    v2 = var6_10;
lbl34:
                    // 2 sources

                    if (v2 == 0) {
                        v5 = new float[yRa.d];
                        v5[uSa.E] = (var2_8.J()[uSa.E] + var3_12[uSa.E]) / kta.v;
                        v5[vRa.d] = (var2_8.J()[vRa.d] + var3_12[vRa.d]) / kta.v;
                        v5[uqa.g] = (var2_8.J()[uqa.g] + var3_12[uqa.g]) / kta.v;
                        var3_12 = v5;
                    }
                    if (Arrays.equals(var3_12, var2_8.J())) {
                        var2_8.J();
                    } else {
                        var2_8 = new VX(var3_12);
                        var1_3.J.add(var2_8);
                    }
                    var6_10 = uSa.E;
                }
                v1 = ++a;
            }
            v4 = var1_3;
        }
        if (v4.I) {
            block18: {
                v6 = a = vRa.d;
                while (v6 <= AQa.P) {
                    var9_16 = var10_6 - a;
                    if (var9_16 < 0) {
                        v7 = var1_3;
                        break block18;
                    }
                    var3_14 = vRa.d;
                    v8 = var5_5 - a;
                    while (v8 <= var5_5 + a && var3_14 != 0) {
                        v9 = var4_7 - a;
                        while (v9 <= var4_7 + a) {
                            var7_11 /* !! */  = var1_3.worldObj.J(new XF(var2_9, var9_16, var6_10)).J();
                            if (var7_11 /* !! */  != QFa.Ab && var7_11 /* !! */  != QFa.WC && var7_11 /* !! */  != QFa.ca && var7_11 /* !! */  != QFa.eB) {
                                var3_14 = uSa.E;
                                break;
                            }
                            v9 = ++var6_10;
                        }
                        v8 = ++var2_9;
                    }
                    if (var3_14 == 0) {
                        v7 = var1_3;
                        break block18;
                    }
                    var1_3.m = a++;
                    v6 = a;
                }
                v7 = var1_3;
            }
            if (v7.m == 0) {
                var1_3.I = uSa.E;
            }
        }
        if (!var1_3.worldObj.e && var1_3.m == AQa.P && var8_4 < var1_3.m) {
            v10 = a = var1_3.worldObj.J(Sx.class, new xy((double)var5_5, (double)var10_6, (double)var4_7, (double)var5_5, (double)(var10_6 - AQa.P), (double)var4_7).f(Wqa.m, DQa.S, Wqa.m)).iterator();
            while (v10.hasNext()) {
                var9_15 = (Sx)a.next();
                v10 = a;
                var9_15.J((aX)mY.W);
            }
        }
    }

    private void i() {
        Cz_3 cz_3 = this;
        if (cz_3.I && cz_3.m > 0 && !cz_3.worldObj.e && cz_3.A > 0) {
            Cz_3 cz_32 = cz_3;
            double d2 = cz_32.m * NTa.C + NTa.C;
            int n2 = uSa.E;
            if (cz_32.m >= AQa.P) {
                Cz_3 cz_33 = cz_3;
                if (cz_33.A == cz_33.i) {
                    n2 = vRa.d;
                }
            }
            Cz_3 cz_34 = cz_3;
            int n3 = cz_34.pos.getX();
            int a22 = cz_34.pos.getY();
            int n4 = cz_34.pos.getZ();
            double d3 = d2;
            Object object = new xy((double)n3, (double)a22, (double)n4, (double)(n3 + vRa.d), (double)(a22 + vRa.d), (double)(n4 + vRa.d)).f(d3, d3, d3).l(aSa.V, (double)cz_3.worldObj.C(), aSa.V);
            object = cz_34.worldObj.J(Sx.class, (xy)object);
            Iterator iterator = a22 = object.iterator();
            while (iterator.hasNext()) {
                Sx sx2 = (Sx)((Object)a22.next());
                iterator = a22;
                sx2.J(new kba(cz_3.A, cRa.n, n2, vRa.d != 0, vRa.d != 0));
            }
            if (cz_3.m >= AQa.P) {
                Cz_3 cz_35 = cz_3;
                if (cz_35.A != cz_35.i && cz_3.i > 0) {
                    Iterator a22 = object.iterator();
                    Iterator iterator2 = a22;
                    while (iterator2.hasNext()) {
                        Sx sx3 = (Sx)((Object)a22.next());
                        iterator2 = a22;
                        sx3.J(new kba(cz_3.i, cRa.n, uSa.E, vRa.d != 0, vRa.d != 0));
                    }
                }
            }
        }
    }

    public void f(Waa waa2) {
        Cz_3 b2 = waa2;
        Cz_3 a2 = this;
        Cz_3 cz_3 = b2;
        super.f((Waa)b2);
        a2.A = a2.f(cz_3.J(jsa.Q));
        a2.i = a2.f(cz_3.J(uRa.T));
        a2.m = b2.J(yRa.D);
    }

    public KC J() {
        Cz_3 cz_3 = this;
        Cz_3 a2 = new Waa();
        cz_3.J((Waa)a2);
        return new fda(cz_3.pos, yRa.d, (Waa)a2);
    }

    public void M() {
        Cz_3 a2;
        Cz_3 cz_3 = a2;
        cz_3.A();
        cz_3.i();
    }

    public boolean J() {
        Cz_3 a2;
        if (a2.M != null && a2.M.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Cz_3 a2 = this;
        switch (b2) {
            case 0: {
                a2.m = c2;
                return;
            }
            case 1: {
                a2.A = a2.f(c2);
                return;
            }
            case 2: {
                a2.i = a2.f(c2);
                return;
            }
        }
    }

    public boolean J(int n2, Mda mda2) {
        Cz_3 c2 = mda2;
        Cz_3 a2 = this;
        if (c2.J() == Gea.kc || c2.J() == Gea.b || c2.J() == Gea.Bb || c2.J() == Gea.GA) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(String string) {
        Object b2 = string;
        Cz_3 a2 = this;
        a2.M = b2;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    private int f(int n2) {
        void a2;
        Cz_3 cz_3 = this;
        if (a2 >= 0 && a2 < Hda.A.length && Hda.A[a2] != null) {
            Cz_3 b2 = Hda.A[a2];
            if (b2 != Hda.o && b2 != Hda.f && b2 != Hda.u && b2 != Hda.e && b2 != Hda.l && b2 != Hda.t) {
                return uSa.E;
            }
            return (int)a2;
        }
        return uSa.E;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int J(int n2) {
        int b2 = n2;
        Cz_3 a2 = this;
        switch (b2) {
            case 0: {
                return a2.m;
            }
            case 1: {
                return a2.A;
            }
            case 2: {
                return a2.i;
            }
        }
        return uSa.E;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void l() {
        a.E = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void b2;
        Cz_3 c2 = mda2;
        Cz_3 a2 = this;
        if (b2 == false) {
            a2.E = c2;
        }
    }

    public double C() {
        return ura.n;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void a2;
        int c2 = n2;
        Cz_3 b2 = this;
        if (c2 == vRa.d) {
            b2.M();
            return vRa.d != 0;
        }
        return super.J(c2, (int)a2);
    }

    public float J() {
        Cz_3 cz_3 = this;
        if (!cz_3.I) {
            return JPa.N;
        }
        Cz_3 cz_32 = cz_3;
        int a2 = (int)(cz_3.worldObj.l() - cz_32.k);
        cz_3.k = cz_32.worldObj.l();
        if (a2 > vRa.d) {
            Cz_3 cz_33 = cz_3;
            cz_33.j -= (float)a2 / ZRa.l;
            if (cz_33.j < JPa.N) {
                cz_3.j = JPa.N;
            }
        }
        Cz_3 cz_34 = cz_3;
        cz_34.j += POa.o;
        if (cz_34.j > pqa.r) {
            cz_3.j = pqa.r;
        }
        return cz_3.j;
    }

    static {
        Hda[][] hdaArrayArray = new Hda[AQa.P][];
        Hda[] hdaArray = new Hda[uqa.g];
        hdaArray[uSa.E] = Hda.o;
        hdaArray[vRa.d] = Hda.f;
        hdaArrayArray[uSa.E] = hdaArray;
        Hda[] hdaArray2 = new Hda[uqa.g];
        hdaArray2[uSa.E] = Hda.u;
        hdaArray2[vRa.d] = Hda.e;
        hdaArrayArray[vRa.d] = hdaArray2;
        Hda[] hdaArray3 = new Hda[vRa.d];
        hdaArray3[uSa.E] = Hda.l;
        hdaArrayArray[uqa.g] = hdaArray3;
        Hda[] hdaArray4 = new Hda[vRa.d];
        hdaArray4[uSa.E] = Hda.t;
        hdaArrayArray[yRa.d] = hdaArray4;
        C = hdaArrayArray;
    }

    public void J(Waa waa2) {
        Cz_3 b2 = waa2;
        Cz_3 a2 = this;
        Cz_3 cz_3 = b2;
        super.J((Waa)cz_3);
        b2.J(jsa.Q, a2.A);
        cz_3.J(uRa.T, a2.i);
        cz_3.J(yRa.D, a2.m);
    }

    public String f() {
        return zsa.n;
    }

    public List<VX> J() {
        Cz_3 a2;
        return a2.J;
    }

    public void J() {
        Cz_3 a2;
        if (a2.worldObj.l() % Vra.B == nqa.i) {
            a2.M();
        }
    }

    public Ega J(kea kea2, Sx sx2) {
        Cz_3 c2 = kea2;
        Cz_3 b2 = this;
        return new xda(c2, b2);
    }
}

