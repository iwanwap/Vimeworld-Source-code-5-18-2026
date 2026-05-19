/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Baa
 *  ERa
 *  Faa
 *  Gg
 *  Gua
 *  JSa
 *  Jy
 *  NTa
 *  PU
 *  QFa
 *  RPa
 *  TQa
 *  bpa
 *  dQa
 *  gc
 *  hd
 *  hra
 *  ov
 *  sV
 *  uQa
 *  uV
 *  vRa
 *  xW
 *  xv
 *  xx
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dz_1
implements hd {
    private Bw m;
    private final boolean C;
    private final boolean i;
    private Gg M;
    private Bw k;
    private final uV j;
    private Random J;
    private final IBlockState[] A;
    private final List<RU> I;

    /*
     * WARNING - void declaration
     */
    public void J(Faa faa2, int n2, int n3) {
        Object d2 = faa2;
        Dz_1 c2 = this;
        Object object = d2 = c2.I.iterator();
        while (object.hasNext()) {
            void a2;
            void b2;
            Dz_1 dz_1 = c2;
            ((RU)((Object)d2.next())).J(dz_1, dz_1.M, (int)b2, (int)a2, null);
            object = d2;
        }
    }

    public void J() {
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<AZ> J(VIa vIa, XF xF2) {
        void b2;
        Object c2 = xF2;
        Dz_1 a2 = this;
        return a2.M.J((XF)((Object)c2)).J((VIa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public Dz_1(Gg gg2, long l2, boolean bl, String string) {
        void e22;
        Map a22;
        void c22;
        void d2;
        boolean bl2 = bl;
        Dz_1 b2 = this;
        b2.A = new IBlockState[hra.Ja];
        Dz_1 dz_1 = b2;
        b2.I = Lists.newArrayList();
        dz_1.M = d2;
        Dz_1 dz_12 = b2;
        dz_1.J = new Random((long)c22);
        dz_1.j = uV.J((String)((Object)a22));
        if (e22 != false) {
            Map e22 = b2.j.J();
            if (e22.containsKey(bpa.p)) {
                a22 = (Map)e22.get(bpa.p);
                if (!a22.containsKey(sqa.b)) {
                    a22.put(sqa.b, TQa.h);
                }
                b2.I.add((RU)new xW(a22));
            }
            if (e22.containsKey(JSa.Aa)) {
                b2.I.add((RU)new xv((Map)e22.get(JSa.Aa)));
            }
            if (e22.containsKey(LRa.z)) {
                b2.I.add((RU)new ov((Map)e22.get(LRa.z)));
            }
            if (e22.containsKey(uQa.i)) {
                b2.I.add((RU)new PU((Map)e22.get(uQa.i)));
            }
            if (e22.containsKey(RPa.N)) {
                b2.I.add((RU)new sV((Map)e22.get(RPa.N)));
            }
        }
        if (b2.j.J().containsKey(cPa.k)) {
            b2.m = new Bw(QFa.sc);
        }
        if (b2.j.J().containsKey(LRa.Da)) {
            b2.k = new Bw(QFa.bb);
        }
        Dz_1 dz_13 = b2;
        dz_13.i = dz_13.j.J().containsKey(Jta.e);
        int e22 = uSa.E;
        int a22 = uSa.E;
        int c22 = vRa.d;
        for (xx xx2 : dz_13.j.J()) {
            int n2 = xx2.l();
            while (n2 < xx2.l() + xx2.f()) {
                int n3;
                IBlockState iBlockState = xx2.J();
                if (iBlockState.J() != QFa.HF) {
                    c22 = uSa.E;
                    b2.A[n3] = iBlockState;
                }
                n2 = ++n3;
            }
            if (xx2.J().J() == QFa.HF) {
                a22 += xx2.f();
                continue;
            }
            e22 += xx2.f() + a22;
            a22 = uSa.E;
        }
        d2.J(e22);
        b2.C = c22 != 0 ? uSa.E : (int)(b2.j.J().containsKey(APa.i) ? 1 : 0);
    }

    /*
     * WARNING - void declaration
     */
    public XF J(Gg gg2, String string, XF xF2) {
        Iterator<RU> d2 = string;
        Dz_1 b2 = this;
        if (zpa.d.equals(d2)) {
            for (RU rU2 : b2.I) {
                void a2;
                void c2;
                if (!(rU2 instanceof PU)) continue;
                return rU2.J((Gg)c2, (XF)a2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, int n2, int n3) {
        void b232;
        int d222 = n3;
        Dz_1 a2 = this;
        void c232 = b232 * ERa.C;
        int n4 = d222 * ERa.C;
        XF xF2 = new XF((int)c232, uSa.E, n4);
        Dz_1 dz_1 = a2;
        Jy c232 = dz_1.M.J(new XF((int)(c232 + ERa.C), uSa.E, n4 + ERa.C));
        n4 = uSa.E;
        Dz_1 dz_12 = a2;
        dz_1.J.setSeed(dz_12.M.J());
        long l2 = dz_12.J.nextLong() / kra.G * kra.G + dQa.Ga;
        long l3 = dz_1.J.nextLong() / kra.G * kra.G + dQa.Ga;
        dz_1.J.setSeed((long)b232 * l2 + (long)d222 * l3 ^ a2.M.J());
        Baa b232 = new Baa((int)b232, d222);
        for (RU rU2 : dz_1.I) {
            Dz_1 dz_13 = a2;
            int n5 = rU2.J(dz_13.M, dz_13.J, b232);
            if (!(rU2 instanceof xW)) continue;
            n4 |= n5;
        }
        if (a2.m != null && n4 == 0 && a2.J.nextInt(AQa.P) == 0) {
            Dz_1 dz_14 = a2;
            dz_14.m.J(dz_14.M, a2.J, xF2.add(a2.J.nextInt(ERa.C) + Yqa.i, a2.J.nextInt(hra.Ja), a2.J.nextInt(ERa.C) + Yqa.i));
        }
        if (a2.k != null && n4 == 0 && a2.J.nextInt(Yqa.i) == 0) {
            Dz_1 dz_15 = a2;
            Object d222 = xF2.add(a2.J.nextInt(ERa.C) + Yqa.i, dz_15.J.nextInt(dz_15.J.nextInt(Lsa.L) + Yqa.i), a2.J.nextInt(ERa.C) + Yqa.i);
            if (d222.getY() < a2.M.M() || a2.J.nextInt(NTa.C) == 0) {
                Dz_1 dz_16 = a2;
                dz_16.k.J(dz_16.M, a2.J, (XF)((Object)d222));
            }
        }
        if (a2.i) {
            int d222;
            int n5 = d222 = uSa.E;
            while (n5 < Yqa.i) {
                Dz_1 dz_17 = a2;
                new VV().J(dz_17.M, dz_17.J, xF2.add(a2.J.nextInt(ERa.C) + Yqa.i, a2.J.nextInt(hra.Ja), a2.J.nextInt(ERa.C) + Yqa.i));
                n5 = ++d222;
            }
        }
        if (a2.C) {
            Dz_1 dz_18 = a2;
            c232.J(dz_18.M, dz_18.J, xF2);
        }
    }

    public int J() {
        return uSa.E;
    }

    public boolean J(int n2, int n3) {
        int c2 = n3;
        Dz_1 a2 = this;
        return vRa.d != 0;
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public boolean J(hd hd2, Faa faa2, int n2, int n3) {
        int n4 = n3;
        Dz_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Faa J(int n2, int n3) {
        void a2;
        void b2;
        int n4;
        Jy[] jyArray;
        int c22;
        Dz_1 dz_1 = this;
        oz oz2 = new oz();
        int n5 = c22 = uSa.E;
        while (n5 < dz_1.A.length) {
            jyArray = dz_1.A[c22];
            if (jyArray != null) {
                int n6 = uSa.E;
                while (n6 < ERa.C) {
                    int n7;
                    int n8 = uSa.E;
                    while (n8 < ERa.C) {
                        oz2.J(n7, c22, n4++, (IBlockState)jyArray);
                        n8 = n4;
                    }
                    n6 = ++n7;
                }
            }
            n5 = ++c22;
        }
        Faa faa2 = c22 = dz_1.I.iterator();
        while (faa2.hasNext()) {
            jyArray = c22.next();
            faa2 = c22;
            Dz_1 dz_12 = dz_1;
            jyArray.J((hd)dz_12, dz_12.M, (int)b2, (int)a2, oz2);
        }
        Faa c22 = new Faa(dz_1.M, oz2, (int)b2, (int)a2);
        jyArray = dz_1.M.J().J((Jy[])null, (int)(b2 * ERa.C), (int)(a2 * ERa.C), ERa.C, ERa.C);
        byte[] byArray = c22.J();
        int n9 = n4 = uSa.E;
        while (n9 < byArray.length) {
            int n10 = n4++;
            byArray[n10] = (byte)jyArray[n10].Ka;
            n9 = n4;
        }
        Faa faa3 = c22;
        faa3.d();
        return faa3;
    }

    public boolean J(boolean bl, gc gc2) {
        Dz_1 c2 = gc2;
        Dz_1 a2 = this;
        return vRa.d != 0;
    }

    public Faa J(XF xF2) {
        Object b2 = xF2;
        Dz_1 a2 = this;
        return a2.J(b2.getX() >> AQa.P, b2.getZ() >> AQa.P);
    }

    public String J() {
        return Gua.T;
    }
}

