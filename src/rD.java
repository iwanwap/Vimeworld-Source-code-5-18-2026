/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cta
 *  DQa
 *  ERa
 *  FPa
 *  Ff
 *  Fpa
 *  I
 *  ISa
 *  JPa
 *  JTa
 *  Jy
 *  Kpa
 *  LQa
 *  Lra
 *  NOa
 *  NTa
 *  QFa
 *  QSa
 *  Qsa
 *  RA
 *  SRa
 *  Ssa
 *  TQa
 *  Tpa
 *  VQa
 *  XTa
 *  YSa
 *  Yka
 *  Ypa
 *  bSa
 *  cQa
 *  cRa
 *  fTa
 *  fg
 *  jRa
 *  jpa
 *  kqa
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  pua
 *  uOa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  yra
 *  ysa
 *  zsa
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rD {
    private static final String[] e;
    private static final int G = 5;
    private static KLa D;
    private static final int f = 2;
    private static final int F = 1;
    public static final IBlockState g;
    private static final int L = 0;
    private static Map[] E;
    private static final int m = 4;
    private static tE[][] C;
    private static tE[][] i;
    private static final int M = 1;
    private static final int k = 0;
    private static final int[] j;
    private static final int J = 2;
    private static boolean A;
    private static final int I = 3;

    /*
     * WARNING - void declaration
     */
    public static int J(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        void b2;
        void c2;
        boolean d2 = bl4;
        boolean a2 = bl;
        if (c2 != false && a2) {
            if (b2 != false) {
                if (d2) {
                    return Tpa.z;
                }
                return vpa.o;
            }
            if (d2) {
                return yOa.B;
            }
            return uqa.g;
        }
        if (c2 != false && !a2) {
            if (b2 != false) {
                if (d2) {
                    return TQa.ca;
                }
                return cPa.Q;
            }
            if (d2) {
                return wOa.t;
            }
            return yRa.d;
        }
        if (c2 == false && a2) {
            if (b2 != false) {
                if (d2) {
                    return Zqa.G;
                }
                return jRa.q;
            }
            if (d2) {
                return yta.Ka;
            }
            return vRa.d;
        }
        if (b2 != false) {
            if (d2) {
                return fPa.i;
            }
            return QSa.p;
        }
        if (d2) {
            return ERa.C;
        }
        return uSa.E;
    }

    private static tE[][] J(List list) {
        int n2;
        List list2 = list;
        tE[][] tEArray = new tE[list2.size()][];
        int n3 = n2 = uSa.E;
        while (n3 < list2.size()) {
            Object a2 = (List)list2.get(n2);
            if (a2 != null) {
                a2 = a2.toArray(new tE[a2.size()]);
                tEArray[n2] = a2;
            }
            n3 = ++n2;
        }
        return tEArray;
    }

    /*
     * WARNING - void declaration
     */
    private static Yka J(KLa kLa2, Block block, IBlockState iBlockState, Yka yka) {
        void a2;
        Block d222 = block;
        KLa c2 = kLa2;
        if (E == null) {
            return a2;
        }
        int d222 = c2.C();
        if (d222 >= 0 && d222 < E.length) {
            Yka d222;
            IdentityHashMap<void, Yka> b2 = E[d222];
            if (b2 == null) {
                rD.E[d222] = b2 = new IdentityHashMap<void, Yka>(vRa.d);
            }
            if ((d222 = (Yka)b2.get(a2)) == null) {
                d222 = rD.J((Yka)a2, c2);
                b2.put(a2, d222);
            }
            return d222;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void f(tE tE2, List list) {
        tE tE3 = tE2;
        if (tE3.i != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < tE3.i.length) {
                int b2 = tE3.i[n2].J();
                if (b2 < 0) {
                    Config.J(new StringBuilder().insert(2 & 5, lPa.la).append(b2).toString());
                } else {
                    void a2;
                    rD.J(tE3, (List)a2, b2);
                }
                n3 = ++n2;
            }
        }
    }

    private static boolean J() {
        int n2;
        Object object;
        int n3;
        ArrayList<tE> arrayList = new ArrayList<tE>();
        int n4 = n3 = uSa.E;
        while (n4 < i.length) {
            object = i[n3];
            if (object != null) {
                arrayList.addAll(Arrays.asList(object));
            }
            n4 = ++n3;
        }
        int n5 = n3 = uSa.E;
        while (n5 < C.length) {
            object = C[n3];
            if (object != null) {
                arrayList.addAll(Arrays.asList(object));
            }
            n5 = ++n3;
        }
        ArrayList<tE> arrayList2 = arrayList;
        tE[] tEArray = arrayList2.toArray(new tE[arrayList2.size()]);
        object = new HashSet();
        HashSet<KLa> hashSet = new HashSet<KLa>();
        int n6 = n2 = uSa.E;
        while (n6 < tEArray.length) {
            tE tE2 = tEArray[n2];
            if (tE2.c != null) {
                object.addAll(Arrays.asList(tE2.c));
            }
            if (tE2.A != null) {
                hashSet.addAll(Arrays.asList(tE2.A));
            }
            n6 = ++n2;
        }
        Object object2 = object;
        object2.retainAll(hashSet);
        if (!object2.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int l(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        switch ((b2 & lqa.s) >> uqa.g) {
            case 1: {
                return uqa.g;
            }
            case 2: {
                return vRa.d;
            }
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static synchronized Yka J(I i2, IBlockState iBlockState, XF xF, Yka yka, JE jE2) {
        void a2;
        void c2;
        Object object;
        void d2;
        I e2 = yka;
        I b2 = i2;
        KLa kLa2 = e2.J();
        if (kLa2 == null) {
            return e2;
        }
        Block block = d2.J();
        DZ dZ = e2.J();
        if (block instanceof BlockPane && kLa2.J().startsWith(Eqa.M) && (object = b2.J(c2.offset(e2.J()))) == d2) {
            return rD.J(D, block, (IBlockState)d2, (Yka)e2);
        }
        object = rD.J(b2, (IBlockState)d2, (XF)c2, dZ, kLa2, (JE)a2);
        if (object == kLa2) {
            return e2;
        }
        return rD.J((KLa)object, block, (IBlockState)d2, (Yka)e2);
    }

    /*
     * WARNING - void declaration
     */
    private static Yka J(Yka yka, KLa kLa2) {
        void a2;
        int b22;
        Yka yka2 = yka;
        int[] nArray = (int[])yka2.J().clone();
        KLa kLa3 = yka2.J();
        int n2 = b22 = uSa.E;
        while (n2 < AQa.P) {
            rD.J(nArray, b22++, kLa3, (KLa)a2);
            n2 = b22;
        }
        Yka b22 = new Yka(nArray, yka2.J(), yka2.J(), (KLa)a2);
        return b22;
    }

    public static int J(int n2) {
        int n3 = n2;
        int a2 = n3 % ERa.C;
        if (a2 == vRa.d) {
            return n3 + uqa.g;
        }
        if (a2 == yRa.d) {
            return n3 - uqa.g;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    private static KLa J(I i2, XF xF, IBlockState iBlockState, int n2) {
        void a22;
        RA c2;
        Object d2 = iBlockState;
        I b2 = i2;
        d2 = d2.J().J((IBlockState)d2, b2, (XF)c2);
        c2 = Kpa.J().J().J().J((IBlockState)d2);
        if (c2 == null) {
            return null;
        }
        d2 = rD.J((int)a22);
        List a22 = c2.J((DZ)((Object)d2));
        if (a22.size() > 0) {
            Yka yka = (Yka)a22.get(uSa.E);
            return yka.J();
        }
        List list = c2.J();
        int n3 = c2 = uSa.E;
        while (n3 < list.size()) {
            a22 = (Yka)list.get(c2);
            if (a22.J() == d2) {
                return a22.J();
            }
            n3 = ++c2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(WKa wKa, IResourcePack iResourcePack) {
        int n2;
        void a2;
        WKa wKa2 = wKa;
        String[] stringArray = fg.J((IResourcePack)a2, (String)LRa.Ka, (String)Jpa.R, (String[])rD.J());
        Arrays.sort(stringArray);
        List list = rD.J(i);
        List list2 = rD.J(C);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            Object object;
            Object b2;
            block6: {
                b2 = stringArray[n2];
                ResourceLocation resourceLocation = new ResourceLocation((String)b2);
                object = a2.J(resourceLocation);
                if (object != null) break block6;
                Config.J(new StringBuilder().insert(3 ^ 3, VQa.Ga).append((String)b2).toString());
            }
            try {
                Properties properties = new Properties();
                properties.load((InputStream)object);
                object = new tE(properties, (String)b2);
                if (((tE)object).A((String)b2)) {
                    Object object2 = object;
                    ((tE)object).J(wKa2);
                    rD.J((tE)object2, list);
                    rD.f((tE)object2, list2);
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.J(new StringBuilder().insert(5 >> 3, VQa.Ga).append((String)b2).toString());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n3 = ++n2;
        }
        C = rD.J(list2);
        i = rD.J(list);
        A = rD.J();
        Config.f(new StringBuilder().insert(3 ^ 3, DQa.s).append(A).toString());
    }

    /*
     * WARNING - void declaration
     */
    private static KLa d(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        KLa g;
        tE tE3;
        tE tE4 = tE3 = tE2;
        KLa[] h = tE4.A;
        KLa kLa3 = rD.f(tE4, (I)g, (IBlockState)f2, (XF)e2, (int)d2, (int)c2, (KLa)b2, (int)a2);
        if (kLa3 != null && kLa3 != b2 && kLa3 != h[yRa.d]) {
            return kLa3;
        }
        if ((g = rD.C(tE3, (I)g, (IBlockState)f2, (XF)e2, (int)d2, (int)c2, (KLa)b2, (int)a2)) == h[uSa.E]) {
            return h[AQa.P];
        }
        if (g == h[vRa.d]) {
            return h[tTa.h];
        }
        if (g == h[uqa.g]) {
            return h[uua.p];
        }
        return g;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int[] nArray, int n2, KLa kLa2, KLa kLa3) {
        void a2;
        void b2;
        int d2 = n2;
        int[] c2 = nArray;
        d2 = c2.length / AQa.P * d2;
        int[] nArray2 = c2;
        float f2 = Float.intBitsToFloat(c2[d2 + AQa.P]);
        float f3 = Float.intBitsToFloat(nArray2[d2 + AQa.P + vRa.d]);
        double d3 = b2.J(f2);
        double d4 = b2.f(f3);
        c2[d2 + AQa.P] = Float.floatToRawIntBits(a2.J(d3));
        nArray2[d2 + AQa.P + vRa.d] = Float.floatToRawIntBits(a2.f(d4));
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, KLa kLa2, int n3) {
        void e2;
        void d2;
        void f2;
        int n4 = n3;
        tE a2 = tE2;
        IBlockState g = f2.J((XF)d2);
        if (e2 == g) {
            return vRa.d != 0;
        }
        if (a2.N == uqa.g) {
            void b2;
            void c2;
            if (g == null) {
                return uSa.E != 0;
            }
            if (g == rD.g) {
                return uSa.E != 0;
            }
            if (rD.J((I)f2, (XF)d2, g, (int)c2) == b2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2.N == yRa.d) {
            if (g == null) {
                return uSa.E != 0;
            }
            if (g == rD.g) {
                return uSa.E != 0;
            }
            if (g.J().J() == e2.J().J()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    static {
        E = null;
        C = null;
        i = null;
        A = uSa.E;
        String[] stringArray = new String[Lra.e];
        stringArray[uSa.E] = Mqa.y;
        stringArray[vRa.d] = ysa.M;
        stringArray[uqa.g] = JTa.Z;
        stringArray[yRa.d] = eua.ca;
        stringArray[AQa.P] = kra.k;
        stringArray[tTa.h] = dsa.w;
        stringArray[uua.p] = BPa.Z;
        stringArray[XTa.W] = Asa.j;
        stringArray[Yqa.i] = opa.h;
        stringArray[WOa.fa] = IPa.Fa;
        stringArray[NTa.C] = zOa.la;
        stringArray[pPa.f] = fTa.Ha;
        stringArray[lqa.s] = iSa.W;
        stringArray[uua.s] = gsa.R;
        stringArray[hpa.Z] = kqa.U;
        stringArray[Ypa.A] = ISa.b;
        stringArray[ERa.C] = NOa.m;
        stringArray[yta.Ka] = yta.E;
        stringArray[yOa.B] = pqa.v;
        stringArray[wOa.t] = wsa.Q;
        stringArray[kTa.j] = xra.d;
        stringArray[wOa.h] = dua.u;
        stringArray[cQa.o] = kqa.Ka;
        stringArray[AQa.ba] = Zqa.q;
        stringArray[osa.c] = rRa.X;
        stringArray[kTa.g] = uOa.Ja;
        stringArray[ITa.E] = oua.v;
        e = stringArray;
        int[] nArray = new int[ysa.s];
        nArray[uSa.E] = uSa.E;
        nArray[vRa.d] = vRa.d;
        nArray[uqa.g] = uqa.g;
        nArray[yRa.d] = yRa.d;
        nArray[AQa.P] = AQa.P;
        nArray[tTa.h] = tTa.h;
        nArray[uua.p] = uua.p;
        nArray[XTa.W] = XTa.W;
        nArray[Yqa.i] = Yqa.i;
        nArray[WOa.fa] = WOa.fa;
        nArray[NTa.C] = NTa.C;
        nArray[pPa.f] = pPa.f;
        nArray[lqa.s] = uSa.E;
        nArray[uua.s] = uSa.E;
        nArray[hpa.Z] = uSa.E;
        nArray[Ypa.A] = uSa.E;
        nArray[ERa.C] = lqa.s;
        nArray[yta.Ka] = uua.s;
        nArray[yOa.B] = hpa.Z;
        nArray[wOa.t] = Ypa.A;
        nArray[kTa.j] = ERa.C;
        nArray[wOa.h] = yta.Ka;
        nArray[cQa.o] = yOa.B;
        nArray[AQa.ba] = wOa.t;
        nArray[osa.c] = kTa.j;
        nArray[kTa.g] = wOa.h;
        nArray[ITa.E] = cQa.o;
        nArray[Lra.e] = AQa.ba;
        nArray[EPa.O] = uSa.E;
        nArray[ITa.A] = uSa.E;
        nArray[Fsa.d] = uSa.E;
        nArray[tua.U] = uSa.E;
        nArray[fPa.i] = osa.c;
        nArray[Zqa.G] = kTa.g;
        nArray[Tpa.z] = ITa.E;
        nArray[TQa.ca] = Lra.e;
        nArray[Qsa.Ha] = EPa.O;
        nArray[LQa.c] = ITa.A;
        nArray[ISa.E] = Fsa.d;
        nArray[CRa.L] = tua.U;
        nArray[wra.P] = fPa.i;
        nArray[kra.U] = Zqa.G;
        nArray[cQa.i] = Tpa.z;
        nArray[iSa.x] = TQa.ca;
        nArray[Yqa.D] = uSa.E;
        nArray[wra.e] = uSa.E;
        nArray[Bpa.Ha] = uSa.E;
        nArray[uOa.F] = uSa.E;
        nArray[QSa.p] = Qsa.Ha;
        nArray[jRa.q] = LQa.c;
        nArray[vpa.o] = ISa.E;
        nArray[cPa.Q] = CRa.L;
        nArray[FPa.F] = wra.P;
        nArray[Bpa.Z] = kra.U;
        nArray[GPa.C] = cQa.i;
        nArray[Fpa.ca] = iSa.x;
        nArray[Upa.D] = Yqa.D;
        nArray[KSa.x] = wra.e;
        nArray[lQa.R] = Bpa.Ha;
        nArray[lPa.p] = uSa.E;
        nArray[Psa.M] = uSa.E;
        nArray[tua.w] = uSa.E;
        nArray[ITa.V] = uSa.E;
        nArray[Ssa.u] = uSa.E;
        j = nArray;
        g = QFa.HF.J();
        D = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        switch (b2) {
            case 3: {
                return uqa.g;
            }
            case 4: {
                return vRa.d;
            }
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa C(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4) {
        tE tE3;
        void d2;
        int n5 = n3;
        tE c2 = tE2;
        int n6 = uSa.E;
        int n7 = uSa.E;
        switch (d2) {
            case 0: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                switch (h) {
                    case 0: 
                    case 1: {
                        return null;
                    }
                    case 2: {
                        tE tE4 = c2;
                        void v1 = g;
                        n6 = rD.J(tE4, (I)v1, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE4, (I)v1, (IBlockState)f2, e2.west(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 3: {
                        tE tE5 = c2;
                        void v3 = g;
                        n6 = rD.J(tE5, (I)v3, (IBlockState)f2, e2.west(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE5, (I)v3, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 4: {
                        tE tE6 = c2;
                        void v5 = g;
                        n6 = rD.J(tE6, (I)v5, (IBlockState)f2, e2.north(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE6, (I)v5, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 5: {
                        tE tE7 = c2;
                        void v7 = g;
                        n6 = rD.J(tE7, (I)v7, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE7, (I)v7, (IBlockState)f2, e2.north(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                }
                break;
            }
            case 1: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                switch (h) {
                    case 0: {
                        tE tE8 = c2;
                        void v9 = g;
                        n6 = rD.J(tE8, (I)v9, (IBlockState)f2, e2.west(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE8, (I)v9, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 1: {
                        tE tE9 = c2;
                        void v11 = g;
                        n6 = rD.J(tE9, (I)v11, (IBlockState)f2, e2.west(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE9, (I)v11, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 2: 
                    case 3: {
                        return null;
                    }
                    case 4: {
                        tE tE10 = c2;
                        void v13 = g;
                        n6 = rD.J(tE10, (I)v13, (IBlockState)f2, e2.down(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE10, (I)v13, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 5: {
                        tE tE11 = c2;
                        void v15 = g;
                        n6 = rD.J(tE11, (I)v15, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE11, (I)v15, (IBlockState)f2, e2.down(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                }
                break;
            }
            case 2: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                switch (h) {
                    case 0: {
                        tE tE12 = c2;
                        void v17 = g;
                        n6 = rD.J(tE12, (I)v17, (IBlockState)f2, e2.north(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE12, (I)v17, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 1: {
                        tE tE13 = c2;
                        void v19 = g;
                        n6 = rD.J(tE13, (I)v19, (IBlockState)f2, e2.north(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE13, (I)v19, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 2: {
                        tE tE14 = c2;
                        void v21 = g;
                        n6 = rD.J(tE14, (I)v21, (IBlockState)f2, e2.down(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE14, (I)v21, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 3: {
                        tE tE15 = c2;
                        void v23 = g;
                        n6 = rD.J(tE15, (I)v23, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        n7 = rD.J(tE15, (I)v23, (IBlockState)f2, e2.down(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                        break;
                    }
                    case 4: 
                    case 5: {
                        return null;
                    }
                }
                break;
            }
        }
        int g = yRa.d;
        if (n6 != 0) {
            if (n7 != 0) {
                g = vRa.d;
                tE3 = c2;
                return tE3.A[g];
            }
            g = uqa.g;
            tE3 = c2;
            return tE3.A[g];
        }
        if (n7 != 0) {
            g = uSa.E;
            tE3 = c2;
            return tE3.A[g];
        }
        g = yRa.d;
        tE3 = c2;
        return tE3.A[g];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa f(tE tE2, XF xF, int n2) {
        int n3;
        void a2;
        void b22;
        tE tE3 = tE2;
        if (tE3.A.length == vRa.d) {
            return tE3.A[uSa.E];
        }
        void v0 = b22;
        int b22 = v0.getX();
        int n4 = v0.getY();
        int n5 = v0.getZ();
        int c2 = uSa.E;
        int n6 = uSa.E;
        switch (a2) {
            case 0: {
                c2 = b22;
                n6 = n5;
                n3 = c2;
                break;
            }
            case 1: {
                c2 = b22;
                n6 = n5;
                n3 = c2;
                break;
            }
            case 2: {
                c2 = -b22 - vRa.d;
                n6 = -n4;
                n3 = c2;
                break;
            }
            case 3: {
                c2 = b22;
                n6 = -n4;
                n3 = c2;
                break;
            }
            case 4: {
                c2 = n5;
                n6 = -n4;
                n3 = c2;
                break;
            }
            case 5: {
                c2 = -n5 - vRa.d;
                n6 = -n4;
            }
            default: {
                n3 = c2;
            }
        }
        c2 = n3 % tE3.p;
        n6 %= tE3.e;
        if (c2 < 0) {
            c2 += tE3.p;
        }
        if (n6 < 0) {
            n6 += tE3.e;
        }
        b22 = n6 * tE3.p + c2;
        return tE3.A[b22];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int J(DZ a2) {
        if (a2 == null) {
            return pua.o;
        }
        switch (Ff.I[a2.ordinal()]) {
            case 1: {
                return uSa.E;
            }
            case 2: {
                return vRa.d;
            }
            case 3: {
                return tTa.h;
            }
            case 4: {
                return AQa.P;
            }
            case 5: {
                return uqa.g;
            }
            case 6: {
                return yRa.d;
            }
        }
        return pua.o;
    }

    private static String[] J() {
        int n2;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = zsa.l;
        if (Config.J(new ResourceLocation(SRa.j))) {
            arrayList.add(string + aua.i);
            arrayList.add(new StringBuilder().insert(3 & 4, string).append(Jra.L).toString());
        }
        if (Config.J(new ResourceLocation(VPa.l))) {
            arrayList.add(new StringBuilder().insert(3 & 4, string).append(NSa.w).toString());
        }
        if (Config.J(new ResourceLocation(Bpa.u))) {
            arrayList.add(new StringBuilder().insert(2 & 5, string).append(yra.X).toString());
        }
        String[] stringArray = new String[ERa.C];
        stringArray[uSa.E] = gQa.r;
        stringArray[vRa.d] = Cta.W;
        stringArray[uqa.g] = mSa.N;
        stringArray[yRa.d] = Ira.r;
        stringArray[AQa.P] = QTa.v;
        stringArray[tTa.h] = xua.e;
        stringArray[uua.p] = bSa.q;
        stringArray[XTa.W] = zsa.ba;
        stringArray[Yqa.i] = opa.Aa;
        stringArray[WOa.fa] = cRa.v;
        stringArray[NTa.C] = yRa.J;
        stringArray[pPa.f] = rQa.a;
        stringArray[lqa.s] = JPa.y;
        stringArray[uua.s] = NSa.A;
        stringArray[hpa.Z] = rQa.Y;
        stringArray[Ypa.A] = GPa.i;
        String[] stringArray2 = stringArray;
        int n3 = n2 = uSa.E;
        while (n3 < stringArray2.length) {
            String string2 = stringArray2[n2];
            if (Config.J(new ResourceLocation(new StringBuilder().insert(3 & 4, tSa.i).append(string2).append(KPa.C).toString()))) {
                arrayList.add(new StringBuilder().insert(2 & 5, string).append(n2).append(NTa.Ca).append(string2).append(Yua.Aa).append(string2).append(Jpa.R).toString());
                arrayList.add(new StringBuilder().insert(2 & 5, string).append(n2).append(NTa.Ca).append(string2).append(YSa.j).append(string2).append(Jpa.R).toString());
            }
            n3 = ++n2;
        }
        ArrayList<String> arrayList2 = arrayList;
        String[] stringArray3 = arrayList2.toArray(new String[arrayList2.size()]);
        return stringArray3;
    }

    public rD() {
        rD a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        switch (b2) {
            case 0: {
                return a2;
            }
            case 1: {
                switch (a2) {
                    case 0: {
                        return uqa.g;
                    }
                    case 1: {
                        return yRa.d;
                    }
                    case 2: {
                        return vRa.d;
                    }
                    case 3: {
                        return uSa.E;
                    }
                }
                return a2;
            }
            case 2: {
                switch (a2) {
                    case 0: {
                        return AQa.P;
                    }
                    case 1: {
                        return tTa.h;
                    }
                    default: {
                        return a2;
                    }
                    case 4: {
                        return vRa.d;
                    }
                    case 5: 
                }
                return uSa.E;
            }
        }
        return a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static DZ J(int a2) {
        switch (a2) {
            case 0: {
                return DZ.DOWN;
            }
            case 1: {
                return DZ.UP;
            }
            case 2: {
                return DZ.NORTH;
            }
            case 3: {
                return DZ.SOUTH;
            }
            case 4: {
                return DZ.WEST;
            }
            case 5: {
                return DZ.EAST;
            }
        }
        return DZ.UP;
    }

    private static List J(tE[][] tEArray) {
        tE[][] tEArray2 = tEArray;
        ArrayList<tE[][]> arrayList = new ArrayList<tE[][]>();
        if (tEArray2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < tEArray2.length) {
                tE[] tEArray3 = tEArray2[n2];
                Object a2 = null;
                if (tEArray3 != null) {
                    a2 = new ArrayList<tE>(Arrays.asList(tEArray3));
                }
                arrayList.add((tE[][])a2);
                n3 = ++n2;
            }
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(tE tE2, List list, int n2) {
        void b2;
        void a2;
        tE tE3 = tE2;
        void v0 = a2;
        while (v0 >= b2.size()) {
            v0 = a2;
            b2.add(null);
        }
        List<tE> c2 = (List)b2.get((int)a2);
        if (c2 == null) {
            c2 = new ArrayList<tE>();
            b2.set((int)a2, c2);
        }
        c2.add(tE3);
    }

    private static KLa J(tE a2) {
        return a2.A[uSa.E];
    }

    public static void f(WKa wKa) {
        WKa wKa2 = wKa;
        C = null;
        i = null;
        E = null;
        if (Config.e()) {
            int a22;
            IResourcePack[] iResourcePackArray = Config.J();
            int n2 = a22 = iResourcePackArray.length - vRa.d;
            while (n2 >= 0) {
                IResourcePack iResourcePack = iResourcePackArray[a22];
                rD.J(wKa2, iResourcePack);
                n2 = --a22;
            }
            WKa wKa3 = wKa2;
            rD.J(wKa3, Config.J());
            ResourceLocation a22 = new ResourceLocation(zta.A);
            D = wKa3.J(a22);
            E = new Map[wKa3.l() + vRa.d];
            if (C.length <= 0) {
                C = null;
            }
            if (i.length <= 0) {
                i = null;
            }
        }
    }

    private static void J(WKa a2) {
    }

    /*
     * WARNING - void declaration
     */
    private static KLa l(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        KLa g;
        tE tE3;
        tE tE4 = tE3 = tE2;
        KLa[] h = tE4.A;
        KLa kLa3 = rD.C(tE4, (I)g, (IBlockState)f2, (XF)e2, (int)d2, (int)c2, (KLa)b2, (int)a2);
        if (kLa3 != null && kLa3 != b2 && kLa3 != h[yRa.d]) {
            return kLa3;
        }
        if ((g = rD.f(tE3, (I)g, (IBlockState)f2, (XF)e2, (int)d2, (int)c2, (KLa)b2, (int)a2)) == h[uSa.E]) {
            return h[AQa.P];
        }
        if (g == h[vRa.d]) {
            return h[tTa.h];
        }
        if (g == h[uqa.g]) {
            return h[uua.p];
        }
        return g;
    }

    /*
     * WARNING - void declaration
     */
    public static KLa J(I i2, IBlockState iBlockState, XF xF, DZ dZ, KLa kLa2, boolean bl, JE jE2) {
        void b2;
        void a2;
        void e2;
        KLa kLa3;
        Object g;
        int n2;
        int n3;
        void d2;
        tE[] tEArray;
        int n4;
        void c2;
        BlockStateBase f2;
        I i3 = i2;
        void v0 = f2;
        v0.J();
        if (!(v0 instanceof BlockStateBase)) {
            return c2;
        }
        f2 = f2;
        if (i != null && (n4 = c2.C()) >= 0 && n4 < i.length && (tEArray = i[n4]) != null) {
            n3 = rD.J((DZ)d2);
            int n5 = n2 = uSa.E;
            while (n5 < tEArray.length) {
                g = tEArray[n2];
                if (g != null && ((tE)g).J(f2.l()) && (kLa3 = rD.J((tE)g, i3, f2, (XF)e2, n3, (KLa)c2, (JE)a2)) != null) {
                    return kLa3;
                }
                n5 = ++n2;
            }
        }
        if (C != null && b2 != false && (n4 = a2.J()) >= 0 && n4 < C.length && (tEArray = C[n4]) != null) {
            n3 = rD.J((DZ)d2);
            int n6 = n2 = uSa.E;
            while (n6 < tEArray.length) {
                g = tEArray[n2];
                if (g != null && ((tE)g).J((KLa)c2) && (kLa3 = rD.J((tE)g, i3, f2, (XF)e2, n3, (KLa)c2, (JE)a2)) != null) {
                    return kLa3;
                }
                n6 = ++n2;
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa f(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4) {
        tE tE3;
        void d2;
        int n5 = n3;
        tE c2 = tE2;
        int n6 = uSa.E;
        int n7 = uSa.E;
        switch (d2) {
            case 0: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == vRa.d) return null;
                if (h == false) {
                    return null;
                }
                tE tE4 = c2;
                void v1 = g;
                n6 = rD.J(tE4, (I)v1, (IBlockState)f2, e2.down(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                n7 = rD.J(tE4, (I)v1, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                break;
            }
            case 1: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == yRa.d) return null;
                if (h == uqa.g) {
                    return null;
                }
                tE tE5 = c2;
                void v3 = g;
                n6 = rD.J(tE5, (I)v3, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                n7 = rD.J(tE5, (I)v3, (IBlockState)f2, e2.north(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                break;
            }
            case 2: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == tTa.h) return null;
                if (h == AQa.P) {
                    return null;
                }
                tE tE6 = c2;
                void v5 = g;
                n6 = rD.J(tE6, (I)v5, (IBlockState)f2, e2.west(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                n7 = rD.J(tE6, (I)v5, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
                break;
            }
        }
        int g = yRa.d;
        if (n6 != 0) {
            if (n7 != 0) {
                g = vRa.d;
                tE3 = c2;
                return tE3.A[g];
            }
            g = uqa.g;
            tE3 = c2;
            return tE3.A[g];
        }
        if (n7 != 0) {
            g = uSa.E;
            tE3 = c2;
            return tE3.A[g];
        }
        g = yRa.d;
        tE3 = c2;
        return tE3.A[g];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa J(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4) {
        int n5;
        void d2;
        int n6 = n3;
        tE c2 = tE2;
        int n7 = uSa.E;
        switch (d2) {
            case 0: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == vRa.d || h == false) {
                    return null;
                }
                n5 = n7 = (int)(rD.J(c2, (I)g, (IBlockState)f2, e2.up(), (int)h, (KLa)b2, (int)a2) ? 1 : 0);
                break;
            }
            case 1: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == yRa.d || h == uqa.g) {
                    return null;
                }
                n5 = n7 = (int)(rD.J(c2, (I)g, (IBlockState)f2, e2.south(), (int)h, (KLa)b2, (int)a2) ? 1 : 0);
                break;
            }
            case 2: {
                void a2;
                void b2;
                void e2;
                void f2;
                void g;
                void h;
                if (h == tTa.h || h == AQa.P) {
                    return null;
                }
                n7 = rD.J(c2, (I)g, (IBlockState)f2, e2.east(), (int)h, (KLa)b2, (int)a2) ? 1 : 0;
            }
            default: {
                n5 = n7;
            }
        }
        if (n5 != 0) {
            return c2.A[uSa.E];
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(tE tE2, List list) {
        tE tE3 = tE2;
        if (tE3.c != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < tE3.c.length) {
                KLa b2 = tE3.c[n2];
                if (!(b2 instanceof KLa)) {
                    Config.J(new StringBuilder().insert(2 & 5, jpa.a).append(b2).append(MTa.n).append(b2.J()).toString());
                } else {
                    int n4 = b2.C();
                    if (n4 < 0) {
                        Config.J(new StringBuilder().insert(5 >> 3, Jsa.w).append(n4).append(Bua.U).append(b2.J()).toString());
                    } else {
                        void a2;
                        rD.J(tE3, (List)a2, n4);
                    }
                }
                n3 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa J(tE tE2, I i2, BlockStateBase blockStateBase, XF xF, int n2, KLa kLa2, JE jE2) {
        void d2;
        void g;
        int n3;
        void e2;
        int n4 = n2;
        tE c2 = tE2;
        int n5 = uSa.E;
        void v0 = e2;
        int n6 = n3 = v0.f();
        Block block = v0.J();
        if (block instanceof BlockRotatedPillar) {
            n5 = rD.l((int)g, n3);
            if (c2.J() <= yRa.d) {
                n6 = n3 & yRa.d;
            }
        }
        if (block instanceof BlockQuartz) {
            n5 = rD.f((int)g, n3);
            if (c2.J() <= uqa.g && n6 > uqa.g) {
                n6 = uqa.g;
            }
        }
        if (!c2.J(e2.l(), n6)) {
            return null;
        }
        if (g >= 0 && c2.k != Ssa.u) {
            n6 = g;
            if (n5 != 0) {
                n6 = rD.J((int)g, n5);
            }
            if ((vRa.d << n6 & c2.k) == 0) {
                return null;
            }
        }
        if ((n6 = d2.getY()) >= c2.I && n6 <= c2.J) {
            void f2;
            Jy jy;
            if (c2.a != null && !c2.J(jy = f2.J((XF)d2))) {
                return null;
            }
            switch (c2.m) {
                case 1: {
                    void a2;
                    void b2;
                    return rD.J(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3, (JE)a2);
                }
                case 2: {
                    void b2;
                    return rD.C(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3);
                }
                case 3: {
                    void b2;
                    return rD.J(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3);
                }
                case 4: {
                    return rD.J(c2, (XF)d2, (int)g);
                }
                case 5: {
                    return rD.f(c2, (XF)d2, (int)g);
                }
                case 6: {
                    void b2;
                    return rD.f(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3);
                }
                case 7: {
                    return rD.J(c2);
                }
                case 8: {
                    void b2;
                    return rD.l(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3);
                }
                case 9: {
                    void b2;
                    return rD.d(c2, (I)f2, (IBlockState)e2, (XF)d2, n5, (int)g, (KLa)b2, n3);
                }
            }
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static KLa J(tE tE2, I i2, IBlockState iBlockState, XF xF, int n2, int n3, KLa kLa2, int n4, JE jE2) {
        tE tE3;
        int n5;
        int n6;
        void b2;
        void c2;
        void f2;
        void g;
        void h;
        void d2;
        void a22;
        int n7 = n2;
        tE e2 = tE2;
        boolean[] i3 = a22.J();
        switch (d2) {
            case 0: {
                boolean[] blArray = i3;
                boolean[] blArray2 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.west(), (int)d2, (KLa)c2, (int)b2);
                blArray2[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.east(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.north(), (int)d2, (KLa)c2, (int)b2);
                blArray2[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.south(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
            case 1: {
                boolean[] blArray = i3;
                boolean[] blArray3 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.west(), (int)d2, (KLa)c2, (int)b2);
                blArray3[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.east(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.south(), (int)d2, (KLa)c2, (int)b2);
                blArray3[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.north(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
            case 2: {
                boolean[] blArray = i3;
                boolean[] blArray4 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.east(), (int)d2, (KLa)c2, (int)b2);
                blArray4[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.west(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.down(), (int)d2, (KLa)c2, (int)b2);
                blArray4[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.up(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
            case 3: {
                boolean[] blArray = i3;
                boolean[] blArray5 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.west(), (int)d2, (KLa)c2, (int)b2);
                blArray5[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.east(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.down(), (int)d2, (KLa)c2, (int)b2);
                blArray5[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.up(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
            case 4: {
                boolean[] blArray = i3;
                boolean[] blArray6 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.north(), (int)d2, (KLa)c2, (int)b2);
                blArray6[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.south(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.down(), (int)d2, (KLa)c2, (int)b2);
                blArray6[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.up(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
            case 5: {
                boolean[] blArray = i3;
                boolean[] blArray7 = i3;
                blArray[uSa.E] = rD.J(e2, (I)h, (IBlockState)g, f2.south(), (int)d2, (KLa)c2, (int)b2);
                blArray7[vRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.north(), (int)d2, (KLa)c2, (int)b2);
                blArray[uqa.g] = rD.J(e2, (I)h, (IBlockState)g, f2.down(), (int)d2, (KLa)c2, (int)b2);
                blArray7[yRa.d] = rD.J(e2, (I)h, (IBlockState)g, f2.up(), (int)d2, (KLa)c2, (int)b2);
                break;
            }
        }
        int a22 = uSa.E;
        if ((i3[uSa.E] & (!i3[vRa.d] ? vRa.d : uSa.E) & (!i3[uqa.g] ? vRa.d : uSa.E) & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
            n6 = a22 = yRa.d;
        } else {
            boolean[] blArray;
            int n8;
            if (!i3[uSa.E]) {
                n8 = vRa.d;
                blArray = i3;
            } else {
                n8 = uSa.E;
                blArray = i3;
            }
            if ((n8 & blArray[vRa.d] & (!i3[uqa.g] ? vRa.d : uSa.E) & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                n6 = a22 = vRa.d;
            } else {
                boolean[] blArray8;
                int n9;
                if (!i3[uSa.E]) {
                    n9 = vRa.d;
                    blArray8 = i3;
                } else {
                    n9 = uSa.E;
                    blArray8 = i3;
                }
                if ((n9 & (!blArray8[vRa.d] ? vRa.d : uSa.E) & i3[uqa.g] & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                    n6 = a22 = lqa.s;
                } else {
                    boolean[] blArray9;
                    int n10;
                    if (!i3[uSa.E]) {
                        n10 = vRa.d;
                        blArray9 = i3;
                    } else {
                        n10 = uSa.E;
                        blArray9 = i3;
                    }
                    if ((n10 & (!blArray9[vRa.d] ? vRa.d : uSa.E) & (!i3[uqa.g] ? vRa.d : uSa.E) & i3[yRa.d]) != 0) {
                        n6 = a22 = Qsa.Ha;
                    } else if ((i3[uSa.E] & i3[vRa.d] & (!i3[uqa.g] ? vRa.d : uSa.E) & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                        n6 = a22 = uqa.g;
                    } else {
                        boolean[] blArray10;
                        int n11;
                        if (!i3[uSa.E]) {
                            n11 = vRa.d;
                            blArray10 = i3;
                        } else {
                            n11 = uSa.E;
                            blArray10 = i3;
                        }
                        if ((n11 & (!blArray10[vRa.d] ? vRa.d : uSa.E) & i3[uqa.g] & i3[yRa.d]) != 0) {
                            n6 = a22 = osa.c;
                        } else if ((i3[uSa.E] & (!i3[vRa.d] ? vRa.d : uSa.E) & i3[uqa.g] & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                            n6 = a22 = Ypa.A;
                        } else if ((i3[uSa.E] & (!i3[vRa.d] ? vRa.d : uSa.E) & (!i3[uqa.g] ? vRa.d : uSa.E) & i3[yRa.d]) != 0) {
                            n6 = a22 = CRa.L;
                        } else {
                            boolean[] blArray11;
                            int n12;
                            if (!i3[uSa.E]) {
                                n12 = vRa.d;
                                blArray11 = i3;
                            } else {
                                n12 = uSa.E;
                                blArray11 = i3;
                            }
                            if ((n12 & blArray11[vRa.d] & i3[uqa.g] & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                                n6 = a22 = uua.s;
                            } else {
                                boolean[] blArray12;
                                int n13;
                                if (!i3[uSa.E]) {
                                    n13 = vRa.d;
                                    blArray12 = i3;
                                } else {
                                    n13 = uSa.E;
                                    blArray12 = i3;
                                }
                                if ((n13 & blArray12[vRa.d] & (!i3[uqa.g] ? vRa.d : uSa.E) & i3[yRa.d]) != 0) {
                                    n6 = a22 = LQa.c;
                                } else {
                                    boolean[] blArray13;
                                    int n14;
                                    if (!i3[uSa.E]) {
                                        n14 = vRa.d;
                                        blArray13 = i3;
                                    } else {
                                        n14 = uSa.E;
                                        blArray13 = i3;
                                    }
                                    if ((n14 & blArray13[vRa.d] & i3[uqa.g] & i3[yRa.d]) != 0) {
                                        n6 = a22 = kTa.g;
                                    } else if ((i3[uSa.E] & (!i3[vRa.d] ? vRa.d : uSa.E) & i3[uqa.g] & i3[yRa.d]) != 0) {
                                        n6 = a22 = Lra.e;
                                    } else if ((i3[uSa.E] & i3[vRa.d] & (!i3[uqa.g] ? vRa.d : uSa.E) & i3[yRa.d]) != 0) {
                                        n6 = a22 = ISa.E;
                                    } else if ((i3[uSa.E] & i3[vRa.d] & i3[uqa.g] & (!i3[yRa.d] ? vRa.d : uSa.E)) != 0) {
                                        n6 = a22 = hpa.Z;
                                    } else {
                                        if (i3[uSa.E] & i3[vRa.d] & i3[uqa.g] & i3[yRa.d]) {
                                            a22 = ITa.E;
                                        }
                                        n6 = a22;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n6 == 0) {
            return e2.A[a22];
        }
        if (!Config.ja()) {
            return e2.A[a22];
        }
        switch (d2) {
            case 0: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                n5 = a22;
                break;
            }
            case 1: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                n5 = a22;
                break;
            }
            case 2: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().down(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().down(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().up(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().up(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                n5 = a22;
                break;
            }
            case 3: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().down(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().down(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.east().up(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.west().up(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                n5 = a22;
                break;
            }
            case 4: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.down().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.down().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.up().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.up().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                n5 = a22;
                break;
            }
            case 5: {
                i3[uSa.E] = !rD.J(e2, (I)h, (IBlockState)g, f2.down().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[vRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.down().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[uqa.g] = !rD.J(e2, (I)h, (IBlockState)g, f2.up().north(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
                i3[yRa.d] = !rD.J(e2, (I)h, (IBlockState)g, f2.up().south(), (int)d2, (KLa)c2, (int)b2) ? vRa.d : uSa.E;
            }
            default: {
                n5 = a22;
            }
        }
        if (n5 == uua.s && i3[uSa.E]) {
            a22 = AQa.P;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == Ypa.A && i3[vRa.d]) {
            a22 = tTa.h;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == LQa.c && i3[uqa.g]) {
            a22 = ERa.C;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == CRa.L && i3[yRa.d]) {
            a22 = yta.Ka;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == hpa.Z && i3[uSa.E] && i3[vRa.d]) {
            a22 = XTa.W;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == kTa.g && i3[uSa.E] && i3[uqa.g]) {
            a22 = uua.p;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == Lra.e && i3[yRa.d] && i3[vRa.d]) {
            a22 = wOa.t;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ISa.E && i3[yRa.d] && i3[uqa.g]) {
            a22 = yOa.B;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == hpa.Z && !i3[uSa.E] && i3[vRa.d]) {
            a22 = tua.U;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == kTa.g && i3[uSa.E] && !i3[uqa.g]) {
            a22 = Fsa.d;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == Lra.e && !i3[yRa.d] && i3[vRa.d]) {
            a22 = kra.U;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ISa.E && i3[yRa.d] && !i3[uqa.g]) {
            a22 = wra.P;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == hpa.Z && i3[uSa.E] && !i3[vRa.d]) {
            a22 = ITa.A;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == kTa.g && !i3[uSa.E] && i3[uqa.g]) {
            a22 = EPa.O;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == Lra.e && i3[yRa.d] && !i3[vRa.d]) {
            a22 = iSa.x;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ISa.E && !i3[yRa.d] && i3[uqa.g]) {
            a22 = cQa.i;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && i3[vRa.d] && i3[uqa.g] && i3[yRa.d]) {
            a22 = Bpa.Ha;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && i3[vRa.d] && i3[uqa.g] && i3[yRa.d]) {
            a22 = WOa.fa;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && !i3[vRa.d] && i3[uqa.g] && i3[yRa.d]) {
            a22 = wOa.h;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && i3[vRa.d] && !i3[uqa.g] && i3[yRa.d]) {
            a22 = Yqa.i;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && i3[vRa.d] && i3[uqa.g] && !i3[yRa.d]) {
            a22 = kTa.j;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && i3[vRa.d] && !i3[uqa.g] && !i3[yRa.d]) {
            a22 = pPa.f;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && !i3[vRa.d] && i3[uqa.g] && i3[yRa.d]) {
            a22 = cQa.o;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && i3[vRa.d] && !i3[uqa.g] && i3[yRa.d]) {
            a22 = AQa.ba;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && !i3[vRa.d] && i3[uqa.g] && !i3[yRa.d]) {
            a22 = NTa.C;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && !i3[vRa.d] && !i3[uqa.g] && i3[yRa.d]) {
            a22 = Tpa.z;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && i3[vRa.d] && i3[uqa.g] && !i3[yRa.d]) {
            a22 = TQa.ca;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && i3[uSa.E] && !i3[vRa.d] && !i3[uqa.g] && !i3[yRa.d]) {
            a22 = fPa.i;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && i3[vRa.d] && !i3[uqa.g] && !i3[yRa.d]) {
            a22 = Zqa.G;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && !i3[vRa.d] && i3[uqa.g] && !i3[yRa.d]) {
            a22 = Yqa.D;
            tE3 = e2;
            return tE3.A[a22];
        }
        if (a22 == ITa.E && !i3[uSa.E] && !i3[vRa.d] && !i3[uqa.g] && i3[yRa.d]) {
            a22 = wra.e;
        }
        tE3 = e2;
        return tE3.A[a22];
    }

    /*
     * WARNING - void declaration
     */
    public static KLa J(tE tE2, int n2, KLa kLa2) {
        void a2;
        int c2 = n2;
        tE b2 = tE2;
        if (b2.m != vRa.d) {
            return a2;
        }
        if (c2 >= 0 && c2 < j.length) {
            c2 = j[c2];
            KLa[] kLaArray = b2.A;
            if (c2 >= 0 && c2 < kLaArray.length) {
                return kLaArray[c2];
            }
            return a2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private static KLa J(tE tE2, XF xF, int n2) {
        tE tE3;
        int c2;
        block5: {
            void b22;
            c2 = n2;
            tE a2 = tE2;
            if (a2.A.length == vRa.d) {
                return a2.A[uSa.E];
            }
            c2 = c2 / a2.n * a2.n;
            int b22 = Config.J((XF)b22, c2) & vqa.F;
            c2 = uSa.E;
            if (a2.H == null) {
                c2 = b22 % a2.A.length;
                tE3 = a2;
            } else {
                int n3;
                b22 %= a2.X;
                int[] nArray = a2.Q;
                int n4 = n3 = uSa.E;
                while (n4 < nArray.length) {
                    if (b22 < nArray[n3]) {
                        c2 = n3;
                        tE3 = a2;
                        break block5;
                    }
                    n4 = ++n3;
                }
                tE3 = a2;
            }
        }
        return tE3.A[c2];
    }

    /*
     * WARNING - void declaration
     */
    private static KLa J(I object, IBlockState iBlockState, XF xF, DZ dZ, KLa kLa2, JE jE2) {
        int n2;
        void a2;
        Object f2;
        void c2;
        void d2;
        void e2;
        I i2 = object;
        object = kLa2;
        I b2 = i2;
        KLa kLa3 = rD.J(b2, (IBlockState)e2, (XF)d2, (DZ)c2, (KLa)f2, vRa.d != 0, (JE)a2);
        if (!A) {
            return kLa3;
        }
        if (kLa3 == f2) {
            return kLa3;
        }
        f2 = kLa3;
        int n3 = n2 = uSa.E;
        while (n3 < yRa.d) {
            KLa kLa4 = rD.J(b2, (IBlockState)e2, (XF)d2, (DZ)c2, (KLa)f2, uSa.E != 0, (JE)a2);
            if (kLa4 == f2) {
                return f2;
            }
            f2 = kLa4;
            n3 = ++n2;
        }
        return f2;
    }
}

