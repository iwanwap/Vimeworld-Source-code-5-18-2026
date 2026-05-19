/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aea
 *  BHa
 *  CY
 *  DQa
 *  ERa
 *  Ey
 *  FEa
 *  Gg
 *  Gl
 *  Hfa
 *  JPa
 *  LGa
 *  Mda
 *  NCa
 *  NTa
 *  Sqa
 *  TQa
 *  Tz
 *  WQa
 *  Waa
 *  aPa
 *  aSa
 *  bSa
 *  eAa
 *  jpa
 *  kGa
 *  kPa
 *  ld
 *  nQa
 *  pEa
 *  pY
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  wPa
 *  waa
 *  wga
 *  ysa
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Mda_3 {
    public static final DecimalFormat L = new DecimalFormat(fPa.R);
    public int E;
    private eAa m;
    private FEa C;
    public int i;
    private boolean M;
    private int k;
    private Waa j;
    private Block J;
    private Block A;
    private boolean I;

    public Waa J() {
        Mda_3 a2;
        return a2.j;
    }

    public int e() {
        Mda_3 a2;
        return a2.J().f();
    }

    public ld J() {
        Mda_3 mda_3 = this;
        Mda_3 a2 = new CY(mda_3.J());
        if (mda_3.l()) {
            a2.J().i(Boolean.valueOf(vRa.d != 0));
        }
        a2 = new CY(dqa.X).J((ld)a2).J(XOa.D);
        if (mda_3.m != null) {
            Waa waa2 = new Waa();
            mda_3.J(waa2);
            a2.J().J(new pEa(Hfa.SHOW_ITEM, (ld)new CY(waa2.toString())));
            a2.J().J(mda_3.J().rarityColor);
        }
        return a2;
    }

    public static boolean l(Mda mda2, Mda mda3) {
        Mda b2 = mda3;
        Mda a2 = mda2;
        if (a2 == null && b2 == null) {
            return vRa.d != 0;
        }
        if (a2 != null && b2 != null) {
            return a2.l(b2);
        }
        return uSa.E != 0;
    }

    public void J(FEa fEa2) {
        Mda_3 b2 = fEa2;
        Mda_3 a2 = this;
        a2.C = b2;
    }

    public boolean G() {
        Mda_3 a2;
        if (!a2.J().J((Mda)a2)) {
            return uSa.E != 0;
        }
        if (!a2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Mda J(Mda a2) {
        if (a2 == null) {
            return null;
        }
        return a2.J();
    }

    public boolean l(Mda mda2) {
        Mda_3 b2 = mda2;
        Mda_3 a2 = this;
        if (b2 != null && a2.m == b2.m && a2.k == b2.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public FEa J() {
        Mda_3 a2;
        return a2.C;
    }

    public static boolean f(Mda mda2, Mda mda3) {
        Mda b2 = mda3;
        Mda a2 = mda2;
        if (a2 == null && b2 == null) {
            return vRa.d != 0;
        }
        if (a2 != null && b2 != null) {
            if (a2.j == null && b2.j != null) {
                return uSa.E != 0;
            }
            if (a2.j == null || a2.j.equals((Object)b2.j)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public eAa J() {
        Mda_3 a2;
        return a2.m;
    }

    public boolean D() {
        Mda_3 a2;
        if (!(a2.e() <= vRa.d || a2.d() && a2.A())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean A() {
        Mda_3 a2;
        if (a2.d() && a2.k > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Multimap<String, CEa> J() {
        HashMultimap<String, Object> hashMultimap;
        Object object = this;
        if (((Mda_3)object).M() && ((Mda_3)object).j.J(kPa.u, WOa.fa)) {
            int n2;
            hashMultimap = HashMultimap.create();
            waa waa2 = ((Mda_3)object).j.J(kPa.u, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < waa2.J()) {
                Waa waa3 = waa2.J(n2);
                CEa a2 = Kha.J(waa3);
                if (a2 != null && a2.J().getLeastSignificantBits() != nqa.i && a2.J().getMostSignificantBits() != nqa.i) {
                    hashMultimap.put(waa3.J(rQa.ga), a2);
                }
                n3 = ++n2;
            }
        } else {
            hashMultimap = ((Mda_3)object).J().J();
        }
        return hashMultimap;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Block block, XF xF2, Sx sx2) {
        Sx e2;
        void b2;
        void c2;
        void d2;
        Mda_3 mda_3 = sx3;
        Sx sx3 = sx2;
        Mda_3 a2 = mda_3;
        if (a2.m.J((Mda)a2, (Gg)d2, (Block)c2, (XF)b2, (Gl)e2)) {
            e2.J(Tz.H[eAa.J((eAa)a2.m)]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(Gg gg2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        Mda_3 a2 = this;
        return a2.J().J((Mda)a2, (Gg)b2, (Sx)((Object)c2));
    }

    public boolean i() {
        Mda_3 a2;
        return a2.m.M();
    }

    public String f() {
        Mda_3 a2;
        return a2.m.C((Mda)a2);
    }

    private boolean f(Mda mda2) {
        Mda_3 b2 = mda2;
        Mda_3 a2 = this;
        if (a2.E != b2.E) {
            return uSa.E != 0;
        }
        if (a2.m != b2.m) {
            return uSa.E != 0;
        }
        if (a2.k != b2.k) {
            return uSa.E != 0;
        }
        if (a2.j == null && b2.j != null) {
            return uSa.E != 0;
        }
        if (a2.j == null || a2.j.equals((Object)b2.j)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda_3(Block block, int n2) {
        void b2;
        int c2 = n2;
        Mda_3 a2 = this;
        a2((Block)b2, c2, uSa.E);
    }

    public boolean l(Block block) {
        Block b2 = block;
        Mda_3 a2 = this;
        return a2.m.J(b2);
    }

    public void f(int n2) {
        int b2 = n2;
        Mda_3 a2 = this;
        if (!a2.M()) {
            Mda_3 mda_3 = a2;
            mda_3.j = new Waa();
        }
        a2.j.J(zOa.f, b2);
    }

    /*
     * Unable to fully structure code
     */
    public List<String> J(Sx var1_6, boolean var2_8) {
        block34: {
            var3_9 = this;
            var4_10 = Lists.newArrayList();
            v0 = var3_9;
            c = v0.J();
            if (v0.l()) {
                c = pY.ITALIC + (String)c;
            }
            c = new StringBuilder().insert(3 >> 2, (String)c).append(pY.RESET).toString();
            if (a != false) {
                var5_11 = Mqa.y;
                if (c.length() > 0) {
                    c = new StringBuilder().insert(2 & 5, (String)c).append(nQa.T).toString();
                    var5_11 = hpa.b;
                }
                v1 = var3_9;
                var6_13 = eAa.J((eAa)v1.m);
                if (v1.i()) {
                    v2 = new Object[yRa.d];
                    v2[uSa.E] = var6_13;
                    v2[vRa.d] = var3_9.k;
                    v2[uqa.g] = var5_11;
                    c = new StringBuilder().insert(2 & 5, (String)c).append(String.format(fPa.d, v2)).toString();
                } else {
                    v3 = new Object[uqa.g];
                    v3[uSa.E] = var6_13;
                    v3[vRa.d] = var5_11;
                    c = new StringBuilder().insert(2 & 5, (String)c).append(String.format(rQa.y, v3)).toString();
                }
            } else if (!var3_9.l() && var3_9.m == Gea.wa) {
                c = new StringBuilder().insert(5 >> 3, (String)c).append(Qra.Ka).append(var3_9.k).toString();
            }
            var4_10.add((String)c);
            var5_12 = uSa.E;
            if (var3_9.M() && var3_9.j.J(Zqa.B, zOa.v)) {
                var5_12 = var3_9.j.J(Zqa.B);
            }
            if ((var5_12 & fPa.i) == 0) {
                var3_9.m.J((Mda)var3_9, (Sx)b, var4_10, (boolean)a);
            }
            if (!var3_9.M()) break block34;
            if ((var5_12 & vRa.d) == 0 && (var6_14 = var3_9.J()) != null) {
                v4 = b = uSa.E;
                while (v4 < var6_14.J()) {
                    v5 = var6_14;
                    c = v5.J(b).J(QTa.O);
                    var7_17 = v5.J(b).J(Jra.ca);
                    if (wga.J((int)c) != null) {
                        var4_10.add(wga.J((int)c).J((int)var7_17));
                    }
                    v4 = ++b;
                }
            }
            if (!var3_9.j.J(Jpa.q, NTa.C)) break block34;
            var6_15 = var3_9.j.J(Jpa.q);
            if (!var6_15.J(Zra.L, yRa.d)) ** GOTO lbl66
            v6 = var4_10;
            if (a != false) {
                v7 = var4_10;
                v6.add(EPa.Z + Integer.toHexString(var6_15.J(Zra.L)).toUpperCase());
                v8 = var6_15;
            } else {
                v6.add(pY.ITALIC + Ey.f((String)cPa.Ha));
lbl66:
                // 2 sources

                v8 = var6_15;
            }
            if (v8.f(KQa.h) == WOa.fa && (b = var6_15.J(KQa.h, Yqa.i)).J() > 0) {
                v9 = c = uSa.E;
                while (v9 < b.J()) {
                    v10 = b.J(c);
                    var4_10.add(pY.DARK_PURPLE + Mqa.y + pY.ITALIC + v10);
                    v9 = ++c;
                }
            }
        }
        if (!(var6_16 = var3_9.J()).isEmpty() && (var5_12 & uqa.g) == 0) {
            var4_10.add(Mqa.y);
            b = var6_16.entries().iterator();
            while (b.hasNext()) {
                c = b.next();
                var7_18 = c.getValue();
                var8_21 = var7_18.J();
                if (var7_18.J() == eAa.L) {
                    var8_21 += (double)kGa.J((Mda)var3_9, (LGa)LGa.UNDEFINED);
                }
                if (var7_18.J() != vRa.d && var7_18.J() != uqa.g) {
                    var10_22 = var8_21;
                    v11 = var8_21;
                } else {
                    var10_22 = var8_21 * fqa.W;
                    v11 = var8_21;
                }
                if (v11 > aSa.V) {
                    v12 = new Object[uqa.g];
                    v12[uSa.E] = Mda_3.L.format(var10_22);
                    v12[vRa.d] = Ey.f((String)new StringBuilder().insert(3 >> 2, Sqa.I).append(c.getKey()).toString());
                    var4_10.add(pY.BLUE + Ey.J((String)new StringBuilder().insert(2 & 5, gua.v).append(var7_18.J()).toString(), (Object[])v12));
                    continue;
                }
                if (!(var8_21 < aSa.V)) continue;
                v13 = new Object[uqa.g];
                v13[uSa.E] = Mda_3.L.format(var10_22 *= pqa.q);
                v13[vRa.d] = Ey.f((String)new StringBuilder().insert(3 & 4, Sqa.I).append(c.getKey()).toString());
                var4_10.add(pY.RED + Ey.J((String)new StringBuilder().insert(3 & 4, ysa.v).append(var7_18.J()).toString(), (Object[])v13));
            }
        }
        if (var3_9.M() && var3_9.J().f(pua.Y) && (var5_12 & AQa.P) == 0) {
            var4_10.add(pY.BLUE + Ey.f((String)bSa.N));
        }
        if (var3_9.M() && var3_9.j.J(bsa.v, WOa.fa) && (var5_12 & Yqa.i) == 0 && (b = var3_9.j.J(bsa.v, Yqa.i)).J() > 0) {
            var4_10.add(Mqa.y);
            var4_10.add(pY.GRAY + Ey.f((String)Bra.N));
            c = uSa.E;
            v14 = c;
            while (v14 < b.J()) {
                var7_19 = Block.J(b.J(c));
                v15 = var4_10;
                if (var7_19 != null) {
                    v15.add(pY.DARK_GRAY + var7_19.f());
                } else {
                    v15.add(pY.DARK_GRAY + JPa.p);
                }
                v14 = ++c;
            }
        }
        if (var3_9.M() && var3_9.j.J(TQa.m, WOa.fa) && (var5_12 & ERa.C) == 0 && (b = var3_9.j.J(TQa.m, Yqa.i)).J() > 0) {
            var4_10.add(Mqa.y);
            var4_10.add(pY.GRAY + Ey.f((String)kPa.j));
            c = uSa.E;
            v16 = c;
            while (v16 < b.J()) {
                var7_20 = Block.J(b.J(c));
                v17 = var4_10;
                if (var7_20 != null) {
                    v17.add(pY.DARK_GRAY + var7_20.f());
                } else {
                    v17.add(pY.DARK_GRAY + JPa.p);
                }
                v16 = ++c;
            }
        }
        if (a != false) {
            if (var3_9.A()) {
                var4_10.add(new StringBuilder().insert(0, tua.I).append(var3_9.l() - var3_9.f()).append(eta.ca).append(var3_9.l()).toString());
            }
            var4_10.add(pY.DARK_GRAY + ((ResourceLocation)eAa.C.f((Object)var3_9.m)).toString());
            if (var3_9.M()) {
                var4_10.add(pY.DARK_GRAY + WQa.q + var3_9.J().J().size() + MRa.V);
            }
        }
        return var4_10;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2) {
        void a2;
        Mda_3 mda_3 = this;
        Mda_3 b2 = new Mda_3(mda_3.m, (int)a2, mda_3.k);
        if (mda_3.j != null) {
            b2.j = (Waa)mda_3.j.J();
        }
        mda_3.E -= a2;
        return b2;
    }

    public int d() {
        Mda_3 a2;
        if (a2.M() && a2.j.J(zOa.f, yRa.d)) {
            return a2.j.J(zOa.f);
        }
        return uSa.E;
    }

    public waa J() {
        Mda_3 a2;
        if (a2.j == null) {
            return null;
        }
        return a2.j.J(Nta.ga, NTa.C);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Block block) {
        void a2;
        Mda_3 mda_3 = this;
        if (a2 == mda_3.A) {
            return mda_3.I;
        }
        mda_3.A = a2;
        if (mda_3.M() && mda_3.j.J(TQa.m, WOa.fa)) {
            int b2;
            waa waa2 = mda_3.j.J(TQa.m, Yqa.i);
            int n2 = b2 = uSa.E;
            while (n2 < waa2.J()) {
                if (Block.J(waa2.J(b2)) == a2) {
                    mda_3.I = vRa.d;
                    return vRa.d != 0;
                }
                n2 = ++b2;
            }
        }
        mda_3.I = uSa.E;
        return uSa.E != 0;
    }

    public static Mda J(Waa waa2) {
        Waa waa3 = waa2;
        Object a2 = new Mda_3();
        a2.f(waa3);
        if (a2.J() != null) {
            return a2;
        }
        return null;
    }

    public boolean M() {
        Mda_3 a2;
        if (a2.j != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public YFa J() {
        Mda_3 a2;
        return a2.J().J((Mda)a2);
    }

    public Waa J(Waa waa2) {
        Mda_3 b2 = waa2;
        Mda_3 a2 = this;
        ResourceLocation resourceLocation = (ResourceLocation)eAa.C.f((Object)a2.m);
        b2.J(QTa.O, resourceLocation == null ? aPa.j : resourceLocation.toString());
        Mda_3 mda_3 = b2;
        mda_3.J(wPa.k, (byte)a2.E);
        Mda_3 mda_32 = a2;
        mda_3.J(sra.s, (short)mda_32.k);
        if (mda_32.j != null) {
            b2.J(kTa.Aa, (NCa)a2.j);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, Random random) {
        int c2 = n2;
        Mda_3 b2 = this;
        if (!b2.d()) {
            return uSa.E != 0;
        }
        if (c2 > 0) {
            int n3 = kGa.J((int)wga.l.I, (Mda)b2);
            int n4 = uSa.E;
            int n5 = n3;
            for (int i2 = uSa.E; n5 > 0 && i2 < c2; ++i2) {
                void a2;
                if (BHa.J((Mda)b2, (int)n3, (Random)a2)) {
                    ++n4;
                }
                n5 = n3;
            }
            if ((c2 -= n4) <= 0) {
                return uSa.E != 0;
            }
        }
        Mda_3 mda_3 = b2;
        mda_3.k += c2;
        if (mda_3.k > b2.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String toString() {
        Mda_3 a2;
        return a2.E + rRa.X + a2.m.J() + eua.Y + a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public Mda_3(Block block, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Mda_3 a2 = this;
        a2(eAa.J((Block)c2), (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Gl gl2) {
        void b22;
        Mda_3 c2 = gl2;
        Mda_3 a2 = this;
        if ((!(c2 instanceof Sx) || !((Sx)((Object)c2)).h.f()) && a2.d() && a2.J((int)b22, c2.J())) {
            Mda_3 mda_3 = c2;
            mda_3.f((Mda)a2);
            a2.E -= vRa.d;
            if (mda_3 instanceof Sx) {
                Sx b22 = (Sx)((Object)c2);
                Mda_3 mda_32 = a2;
                b22.J(Tz.l[eAa.J((eAa)mda_32.m)]);
                if (mda_32.E == 0 && a2.J() instanceof Aea) {
                    b22.x();
                }
            }
            if (a2.E < 0) {
                a2.E = uSa.E;
            }
            a2.k = uSa.E;
        }
    }

    public boolean J(Mda mda2) {
        Mda_3 b2 = mda2;
        Mda_3 a2 = this;
        return a2.f((Mda)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, Sx sx2, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        Mda_3 a2 = this;
        a2.J().J((Mda)a2, (Gg)c2, (Sx)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Sx sx2, int n2) {
        void c2;
        void a2;
        Mda_3 b2;
        Sx d2 = sx2;
        Mda_3 mda_3 = b2 = this;
        d2.J(Tz.c[eAa.J((eAa)mda_3.m)], (int)a2);
        mda_3.m.J((Mda)b2, (Gg)c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda_3(eAa eAa2, int n2) {
        void b2;
        int c2 = n2;
        Mda_3 a2 = this;
        a2((eAa)b2, c2, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gl gl2) {
        void b2;
        Mda_3 c2 = gl2;
        Mda_3 a2 = this;
        return a2.m.J((Mda)a2, (Sx)b2, (Gl)c2);
    }

    public float J(Block block) {
        Block b2 = block;
        Mda_3 a2 = this;
        return a2.J().J((Mda)a2, b2);
    }

    public oda J() {
        Mda_3 mda_3 = this;
        Object a2 = mda_3.J().J((Mda)mda_3);
        if (a2 == oda.COMMON && mda_3.j != null && mda_3.j.J(jpa.M)) {
            a2 = oda.RARE;
        }
        return a2;
    }

    public int C() {
        Mda_3 a2;
        return a2.J().J((Mda)a2);
    }

    public Mda J() {
        Mda_3 mda_3;
        Mda_3 mda_32 = mda_3 = this;
        Mda_3 a2 = new Mda_3(mda_32.m, mda_32.E, mda_3.k);
        if (mda_3.j != null) {
            a2.j = (Waa)mda_3.j.J();
        }
        return a2;
    }

    public Mda_3(Block block) {
        Block b2 = block;
        Mda_3 a2 = this;
        a2(b2, vRa.d);
    }

    public String J() {
        Waa waa2;
        Mda_3 mda_3;
        Mda_3 mda_32 = mda_3 = this;
        Object a2 = mda_3.J().l((Mda)mda_32);
        if (mda_32.j != null && mda_3.j.J(Jpa.q, NTa.C) && (waa2 = mda_3.j.J(Jpa.q)).J(DQa.N, Yqa.i)) {
            a2 = waa2.J(DQa.N);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, vL vL2, int n2, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        Mda_3 a2 = this;
        if (a2.i > 0) {
            a2.i -= vRa.d;
        }
        a2.m.J((Mda)a2, (Gg)d2, (vL)c2, (int)b2, (boolean)e2);
    }

    public boolean e() {
        Mda_3 a2;
        return a2.J().l();
    }

    private Mda_3() {
        Mda_3 a2;
        Mda_3 mda_3 = a2;
        a2.J = null;
        mda_3.M = uSa.E;
        mda_3.A = null;
        mda_3.I = uSa.E;
    }

    public void J(eAa eAa2) {
        Mda_3 b2 = eAa2;
        Mda_3 a2 = this;
        a2.m = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        Mda_3 a2 = this;
        a2.k = b2;
        if (a2.k < 0) {
            a2.k = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda_3(eAa eAa2, int n2, int n3) {
        void b2;
        void c2;
        Mda_3 a2;
        int d2 = n3;
        Mda_3 mda_3 = a2 = this;
        a2.J = null;
        a2.M = uSa.E;
        mda_3.A = null;
        mda_3.I = uSa.E;
        mda_3.m = c2;
        a2.E = b2;
        a2.k = d2;
        if (a2.k < 0) {
            a2.k = uSa.E;
        }
    }

    public boolean d() {
        Mda_3 a2;
        if (a2.m == null) {
            return uSa.E != 0;
        }
        if (a2.m.l() <= 0) {
            return uSa.E != 0;
        }
        if (!a2.M() || !a2.J().f(pua.Y)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int l() {
        Mda_3 a2;
        return a2.m.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, Sx sx2) {
        void b2;
        Mda_3 a2 = this;
        Object c2 = sx2;
        if (a2.m.J((Mda)a2, (Gl)b2, (Gl)c2)) {
            ((Sx)((Object)c2)).J(Tz.H[eAa.J((eAa)a2.m)]);
        }
    }

    public int f() {
        Mda_3 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        Mda_3 h22 = gg2;
        Mda_3 f5 = this;
        boolean h22 = f5.J().J((Mda)f5, (Sx)g2, (Gg)h22, (XF)e2, (DZ)d2, (float)c2, (float)b2, (float)a2);
        if (h22) {
            g2.J(Tz.H[eAa.J((eAa)f5.m)]);
        }
        return h22;
    }

    public boolean C() {
        Mda_3 a2;
        if (a2.J().l((Mda)a2) || a2.j != null && a2.j.J(jpa.M)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        Mda_3 a2;
        if (a2.j == null) {
            return uSa.E != 0;
        }
        if (!a2.j.J(Jpa.q, NTa.C)) {
            return uSa.E != 0;
        }
        return a2.j.J(Jpa.q).J(DQa.N, Yqa.i);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, NCa nCa2) {
        void b2;
        Mda_3 c2 = nCa2;
        Mda_3 a2 = this;
        if (a2.j == null) {
            a2.J(new Waa());
        }
        a2.j.J((String)b2, (NCa)c2);
    }

    public boolean f() {
        Mda_3 a2;
        if (a2.C != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Waa J(String string, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        Mda_3 a2 = this;
        if (a2.j != null && a2.j.J((String)b2, NTa.C)) {
            return a2.j.J((String)b2);
        }
        if (c2) {
            Waa waa2 = c2 = new Waa();
            a2.J((String)b2, (NCa)waa2);
            return waa2;
        }
        return null;
    }

    public void f(Waa waa2) {
        Mda_3 mda_3;
        Mda_3 b2 = waa2;
        Mda_3 a2 = this;
        if (b2.J(QTa.O, Yqa.i)) {
            mda_3 = a2;
            a2.m = eAa.l((String)b2.J(QTa.O));
        } else {
            mda_3 = a2;
            a2.m = eAa.l((int)b2.J(QTa.O));
        }
        mda_3.E = b2.J(wPa.k);
        a2.k = b2.J(sra.s);
        if (a2.k < 0) {
            a2.k = uSa.E;
        }
        if (b2.J(kTa.Aa, NTa.C)) {
            a2.j = b2.J(kTa.Aa);
            if (a2.m != null) {
                Mda_3 mda_32 = a2;
                mda_32.m.J(mda_32.j);
            }
        }
    }

    public static boolean J(Mda mda2, Mda mda3) {
        Mda b2 = mda3;
        Mda a2 = mda2;
        if (a2 == null && b2 == null) {
            return vRa.d != 0;
        }
        if (a2 != null && b2 != null) {
            return super.f(b2);
        }
        return uSa.E != 0;
    }

    public Mda J(String string) {
        String b2 = string;
        Mda_3 a2 = this;
        if (a2.j == null) {
            Mda_3 mda_3 = a2;
            mda_3.j = new Waa();
        }
        if (!a2.j.J(Jpa.q, NTa.C)) {
            a2.j.J(Jpa.q, (NCa)new Waa());
        }
        Mda_3 mda_3 = a2;
        mda_3.j.J(Jpa.q).J(DQa.N, b2);
        return mda_3;
    }

    public Mda_3(eAa eAa2) {
        Mda_3 b2 = eAa2;
        Mda_3 a2 = this;
        a2((eAa)b2, vRa.d);
    }

    public void J() {
        Mda_3 a2;
        if (a2.j != null && a2.j.J(Jpa.q, NTa.C)) {
            Waa waa2 = a2.j.J(Jpa.q);
            waa2.J(DQa.N);
            if (waa2.J()) {
                Mda_3 mda_3 = a2;
                mda_3.j.J(Jpa.q);
                if (mda_3.j.J()) {
                    a2.J((Waa)null);
                }
            }
        }
    }

    public boolean J() {
        Mda_3 a2;
        if (a2.j != null && a2.j.J(Nta.ga, WOa.fa)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        Mda_3 b2 = waa2;
        Mda_3 a2 = this;
        a2.j = b2;
    }

    public int J() {
        Mda_3 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public void J(wga wga2, int n2) {
        void a2;
        void b2;
        Mda_3 c2;
        Mda_3 mda_3 = this;
        if (mda_3.j == null) {
            mda_3.J(new Waa());
        }
        if (!mda_3.j.J(Nta.ga, WOa.fa)) {
            mda_3.j.J(Nta.ga, (NCa)new waa());
        }
        waa waa2 = mda_3.j.J(Nta.ga, NTa.C);
        Mda_3 mda_32 = c2 = new Waa();
        mda_32.J(QTa.O, (short)b2.I);
        mda_32.J(Jra.ca, (byte)a2);
        waa2.J((NCa)mda_32);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Block block) {
        void a2;
        Mda_3 mda_3 = this;
        if (a2 == mda_3.J) {
            return mda_3.M;
        }
        mda_3.J = a2;
        if (mda_3.M() && mda_3.j.J(bsa.v, WOa.fa)) {
            int b2;
            waa waa2 = mda_3.j.J(bsa.v, Yqa.i);
            int n2 = b2 = uSa.E;
            while (n2 < waa2.J()) {
                if (Block.J(waa2.J(b2)) == a2) {
                    mda_3.M = vRa.d;
                    return vRa.d != 0;
                }
                n2 = ++b2;
            }
        }
        mda_3.M = uSa.E;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Gg gg2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        Mda_3 a2 = this;
        return a2.J().f((Mda)a2, (Gg)b2, (Sx)((Object)c2));
    }
}

