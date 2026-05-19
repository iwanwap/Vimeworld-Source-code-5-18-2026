/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Cf
 *  Cg
 *  Cta
 *  ERa
 *  Eoa
 *  Gg
 *  HD
 *  Hda
 *  I
 *  ISa
 *  JPa
 *  Jy
 *  Kpa
 *  LE
 *  LQa
 *  Lra
 *  Lz
 *  MQa
 *  Mda
 *  NOa
 *  NQa
 *  Oz
 *  PIa
 *  Pba
 *  Pf
 *  QFa
 *  RPa
 *  SQa
 *  SRa
 *  Spa
 *  Uqa
 *  WQa
 *  WSa
 *  Wsa
 *  XTa
 *  Xf
 *  Xsa
 *  Yka
 *  Ypa
 *  Yra
 *  ZF
 *  aPa
 *  aSa
 *  ae
 *  bSa
 *  bpa
 *  cRa
 *  cg
 *  dQa
 *  dpa
 *  eAa
 *  fTa
 *  fg
 *  fpa
 *  hqa
 *  hra
 *  iea
 *  isa
 *  jsa
 *  kqa
 *  kta
 *  lPa
 *  mra
 *  nQa
 *  oqa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  ska
 *  ud
 *  ura
 *  uw
 *  vL
 *  vRa
 *  wra
 *  yra
 *  ysa
 *  zsa
 */
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XE_3 {
    private static final J Z;
    private static Pf Y;
    private static gf r;
    private static final J V;
    private static int[] z;
    private static float[][] X;
    private static int[] y;
    private static int U;
    private static Pf P;
    private static final J u;
    private static final J O;
    private static Lz t;
    private static Pf R;
    private static int Q;
    private static Lz N;
    private static int[] T;
    private static int[] p;
    private static Pf n;
    private static int s;
    private static float[][] w;
    private static final IBlockState W;
    private static Pf q;
    private static int x;
    private static final J v;
    private static Pf o;
    private static int[] h;
    private static final IBlockState K;
    private static int H;
    private static Pf[][] c;
    private static Pf B;
    private static int d;
    private static gf a;
    private static Pf b;
    private static Pf l;
    private static Pf[] e;
    public static Random G;
    private static Pf D;
    private static float[][] f;
    private static Pf F;
    private static boolean g;
    private static float[][] L;
    private static int E;
    private static Pf m;
    private static Pf C;
    private static String i;
    private static Lz M;
    private static gf k;
    private static Pf j;
    private static Pf[] J;
    private static Pf A;
    private static int I;

    public static void f(ska ska2) {
        ska ska3 = ska2;
        if (U >= 0) {
            int a22 = U;
            int n2 = a22 >> ERa.C & osa.Ja;
            int n3 = a22 >> Yqa.i & osa.Ja;
            float f2 = (float)n2 / NQa.Y;
            float f3 = (float)n3 / NQa.Y;
            float a22 = (float)(a22 &= osa.Ja) / NQa.Y;
            ska3.f(f2, f3, a22);
        }
    }

    public static void J(ska ska2) {
        ska ska3 = ska2;
        if (R != null) {
            int a22 = R.f();
            int n2 = a22 >> ERa.C & osa.Ja;
            int n3 = a22 >> Yqa.i & osa.Ja;
            float f2 = (float)n2 / NQa.Y;
            float f3 = (float)n3 / NQa.Y;
            float a22 = (float)(a22 &= osa.Ja) / NQa.Y;
            ska3.f(f2, f3, a22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Lz J(I i2, double d2, double d3, double d4) {
        void a2;
        void b22;
        void c22;
        I i3 = i2;
        if (P == null) {
            return null;
        }
        int c22 = P.J(i3, (double)c22, (double)b22, (double)a2, yRa.d);
        int n2 = c22 >> ERa.C & osa.Ja;
        int b22 = c22 >> Yqa.i & osa.Ja;
        int d222 = c22 & osa.Ja;
        float f2 = (float)n2 / NQa.Y;
        float f3 = (float)b22 / NQa.Y;
        float d222 = (float)d222 / NQa.Y;
        return k.J(f2, f3, d222);
    }

    private static void l(String string) {
        Object object;
        String string2;
        block6: {
            string2 = string;
            ResourceLocation resourceLocation = new ResourceLocation(string2);
            object = Config.J(resourceLocation);
            if (object != null) break block6;
            return;
        }
        try {
            Object a2;
            XE_3.f(new StringBuilder().insert(3 & 4, ISa.ja).append(string2).toString());
            Object object2 = a2 = new Properties();
            ((Properties)object2).load((InputStream)object);
            ((InputStream)object).close();
            String[] stringArray = new String[uqa.g];
            stringArray[uSa.E] = Bra.G;
            stringArray[vRa.d] = jsa.W;
            E = XE_3.J((Properties)object2, stringArray);
            Object object3 = a2;
            String string3 = string2;
            Object object4 = a2;
            String string4 = string2;
            Object object5 = a2;
            Object object6 = a2;
            U = XE_3.J((Properties)object6, zta.R);
            d = XE_3.J((Properties)object6, zua.Q);
            s = XE_3.J((Properties)object6, Uqa.ja);
            Q = XE_3.J((Properties)object6, iSa.t);
            H = XE_3.J((Properties)object6, WOa.ga);
            t = XE_3.J((Properties)object6, tSa.F);
            M = XE_3.J((Properties)object5, pPa.Ja);
            N = XE_3.J((Properties)object5, Npa.c);
            e = XE_3.J((Properties)object5, string2);
            z = XE_3.f((Properties)a2, string4, nua.K, Ata.y);
            T = XE_3.f((Properties)object4, string4, FRa.y, dpa.V);
            w = XE_3.J((Properties)object4, string2, Yua.Ha, lQa.Da);
            X = XE_3.J((Properties)a2, string3, uua.R, dQa.Ma);
            p = XE_3.C((Properties)object3, string3, vRa.b, bpa.P);
            int[] nArray = XE_3.J((Properties)object3, string2, aPa.Ka, XOa.i);
            object = nArray;
            if (nArray != null) {
                if (h == null) {
                    h = XE_3.J();
                }
                XE_3.J((int[])object);
            }
            Object object7 = a2;
            y = XE_3.l((Properties)object7, string2, pqa.i, bSa.g);
            I = Config.J(((Properties)object7).getProperty(RPa.a), pua.o);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private static int C(String string) {
        String string2 = string;
        if (string2 == null) {
            return pua.o;
        }
        string2 = string2.trim();
        try {
            int a2 = Integer.parseInt(string2, ERa.C) & Wsa.K;
            return a2;
        }
        catch (NumberFormatException a2) {
            return pua.o;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int J(I i2, XF xF2, J j2, Cf cf2) {
        int n2;
        int n3;
        void c22;
        I i3 = i2;
        int n4 = uSa.E;
        int n5 = uSa.E;
        int n6 = uSa.E;
        void v0 = c22;
        int c22 = v0.getX();
        int a2 = v0.getY();
        int n7 = v0.getZ();
        void var8_13 = a2;
        int n8 = n3 = c22 - vRa.d;
        while (n8 <= c22 + vRa.d) {
            int n9 = n7 - vRa.d;
            while (n9 <= n7 + vRa.d) {
                void b2;
                var8_13.setXyz(n3, a2, n2);
                int d2 = b2.J(i3, (XF)var8_13);
                n4 += d2 >> ERa.C & osa.Ja;
                n5 += d2 >> Yqa.i & osa.Ja;
                n6 += d2 & osa.Ja;
                n9 = ++n2;
            }
            n8 = ++n3;
        }
        n3 = n4 / WOa.fa;
        n2 = n5 / WOa.fa;
        int d2 = n6 / WOa.fa;
        return n3 << ERa.C | n2 << Yqa.i | d2;
    }

    private static Lz l(Lz a2) {
        if (t == null) {
            return a2;
        }
        return t;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(IBlockState iBlockState, int n2) {
        void a2;
        IBlockState iBlockState2 = iBlockState;
        if (!(iBlockState2.J() instanceof BlockRedstoneWire)) {
            return (int)a2;
        }
        Integer b2 = iBlockState2.J(BlockRedstoneWire.POWER);
        if (!(b2 instanceof Integer)) {
            return (int)a2;
        }
        return b2;
    }

    public static int C(int a2) {
        if (s < 0) {
            return a2;
        }
        return s;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(I i2, IBlockState iBlockState, XF xF2, JE jE2) {
        void b2;
        Block c2;
        I i3 = i2;
        void v0 = c2;
        c2 = v0.J();
        Object d2 = XE_3.J((IBlockState)v0);
        if (d2 == null && c2.J() == Material.water) {
            d2 = V;
        }
        if (d2 == null) {
            return c2.J(i3, (XF)b2);
        }
        if (Config.t() && !d2.J()) {
            void a2;
            return XE_3.J(i3, (XF)b2, (J)d2, a2.J());
        }
        return d2.J(i3, (XF)b2);
    }

    private static Pair<Pf[], Integer> J() {
        int n2;
        int n3;
        Integer[] integerArray;
        int n4;
        String string = Spa.i;
        Pf[] pfArray = KPa.C;
        String[] stringArray = fg.J((String)string, (String)pfArray);
        HashMap<Integer, Integer[]> hashMap = new HashMap<Integer, Integer[]>();
        int n5 = n4 = uSa.E;
        while (n5 < stringArray.length) {
            integerArray = stringArray[n4];
            String string2 = cg.l((String)integerArray, (String)string, (String)pfArray);
            n3 = Config.J(string2, ypa.L);
            if (n3 == ypa.L) {
                XE_3.J(new StringBuilder().insert(3 ^ 3, Jra.B).append(string2).append(ysa.Ga).append((String)integerArray).toString());
            } else {
                hashMap.put(n3, integerArray);
            }
            n5 = ++n4;
        }
        Set set = hashMap.keySet();
        integerArray = set.toArray(new Integer[set.size()]);
        Arrays.sort((Object[])integerArray);
        if (integerArray.length <= 0) {
            return new ImmutablePair<Object, Integer>(null, uSa.E);
        }
        int n6 = integerArray[uSa.E];
        n3 = integerArray[integerArray.length - vRa.d];
        pfArray = new Pf[n3 - n6 + vRa.d];
        int n7 = n2 = uSa.E;
        while (n7 < integerArray.length) {
            Integer n8 = integerArray[n2];
            String string3 = (String)hashMap.get(n8);
            Pf pf2 = XE_3.J(string3, pua.o, pua.o);
            if (pf2 != null) {
                if (pf2.C() < ERa.C) {
                    XE_3.J(new StringBuilder().insert(3 & 4, vTa.la).append(pf2.C()).append(ysa.Ga).append(string3).toString());
                } else {
                    int n9 = n8 - n6;
                    pfArray[n9] = pf2;
                }
            }
            n7 = ++n2;
        }
        return new ImmutablePair<Pf[], Integer>(pfArray, n6);
    }

    /*
     * WARNING - void declaration
     */
    private static float[][] J(Properties properties, String string, String string2, String string3) {
        void a2;
        int n2;
        Properties properties2 = properties;
        iea[] c2 = iea.values();
        HashMap<String, iea> hashMap = new HashMap<String, iea>();
        int n3 = n2 = uSa.E;
        while (n3 < c2.length) {
            iea iea2 = c2[n2];
            hashMap.put(iea2.getName(), iea2);
            n3 = ++n2;
        }
        float[][] fArrayArray = new float[c2.length][];
        int n4 = uSa.E;
        for (Object e2 : properties2.keySet()) {
            void b2;
            String string4 = properties2.getProperty((String)e2);
            if (!((String)e2).startsWith((String)b2)) continue;
            String string5 = cg.l((String)((String)e2), (String)b2);
            if (string5.equals(rpa.f)) {
                string5 = Ira.r;
            }
            string5 = (iea)hashMap.get(string5);
            int d222 = XE_3.C(string4);
            if (string5 != null && d222 >= 0) {
                float[] fArray = new float[yRa.d];
                fArray[uSa.E] = (float)(d222 >> ERa.C & osa.Ja) / NQa.Y;
                fArray[vRa.d] = (float)(d222 >> Yqa.i & osa.Ja) / NQa.Y;
                fArray[uqa.g] = (float)(d222 & osa.Ja) / NQa.Y;
                float[] d222 = fArray;
                ++n4;
                fArrayArray[string5.ordinal()] = d222;
                continue;
            }
            XE_3.J(new StringBuilder().insert(5 >> 3, Hta.E).append(e2).append(XTa.d).append(string4).toString());
        }
        if (n4 <= 0) {
            return null;
        }
        XE_3.f(new StringBuilder().insert(5 >> 3, (String)a2).append(pQa.m).append(n4).toString());
        return fArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    private static Lz f(Lz lz2, I i2, double d2, double d3, double d4) {
        void a22;
        void b22;
        void c22;
        Lz e322 = i2;
        Lz d5 = lz2;
        if (A == null) {
            return d5;
        }
        int e322 = A.J((I)e322, (double)c22, (double)b22, (double)a22, yRa.d);
        int c22 = e322 >> ERa.C & osa.Ja;
        int n2 = e322 >> Yqa.i & osa.Ja;
        float f2 = (float)c22 / NQa.Y;
        float f3 = (float)n2 / NQa.Y;
        float e322 = (float)(e322 &= osa.Ja) / NQa.Y;
        Lz lz3 = d5;
        float b22 = (float)lz3.A / bsa.A;
        float f4 = (float)lz3.j / NOa.u;
        float a22 = (float)lz3.J;
        return r.J(f2 *= b22, f3 *= f4, e322 *= a22);
    }

    /*
     * WARNING - void declaration
     */
    private static int[] C(Properties properties, String string, String string2, String string3) {
        void a2;
        Properties properties2 = properties;
        int[] c2 = new int[fPa.i];
        Arrays.fill(c2, pua.o);
        int n2 = uSa.E;
        for (Object d2 : properties2.keySet()) {
            void b2;
            String string4 = properties2.getProperty((String)d2);
            if (!((String)d2).startsWith((String)b2)) continue;
            int n3 = Config.J(cg.l((String)((String)d2), (String)b2), pua.o);
            int n4 = XE_3.C(string4);
            if (n3 >= 0 && n3 < c2.length && n4 >= 0) {
                ++n2;
                c2[n3] = n4;
                continue;
            }
            XE_3.J(new StringBuilder().insert(3 >> 2, Hta.E).append(d2).append(XTa.d).append(string4).toString());
        }
        if (n2 <= 0) {
            return null;
        }
        XE_3.f(new StringBuilder().insert(3 >> 2, (String)a2).append(pQa.m).append(n2).toString());
        return c2;
    }

    public static int f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (p == null) {
            return b2;
        }
        if (a2 >= 0 && a2 < p.length) {
            int n4 = p[a2];
            if (n4 < 0) {
                return b2;
            }
            return n4;
        }
        return b2;
    }

    private static int J(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        if (d < 0) {
            return QFa.pB.J(a2, (XF)((Object)b2));
        }
        return d;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Pf pf2, List list, int n2) {
        void b2;
        void a2;
        Pf pf3 = pf2;
        void v0 = a2;
        while (v0 >= b2.size()) {
            v0 = a2;
            b2.add(null);
        }
        Object c2 = (List)b2.get((int)a2);
        if (c2 == null) {
            c2 = new ArrayList();
            b2.set((int)a2, c2);
        }
        c2.add(pf3);
    }

    /*
     * WARNING - void declaration
     */
    private static float[] J(iea iea2, float[][] fArray, float[] fArray2) {
        void a2;
        Object c2 = fArray;
        iea b2 = iea2;
        if (c2 == null) {
            return a2;
        }
        if (b2 == null) {
            return a2;
        }
        if ((c2 = c2[b2.ordinal()]) == null) {
            return a2;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Gg gg2, float f2, int[] nArray, boolean bl2) {
        Gg gg3 = gg2;
        if (gg3 == null) {
            return uSa.E != 0;
        }
        if (J == null) {
            return uSa.E != 0;
        }
        int n2 = gg3.F.J();
        int n3 = n2 - x;
        if (n3 >= 0 && n3 < J.length) {
            float f3;
            float c22;
            void a22;
            Object object = J[n3];
            if (object == null) {
                return uSa.E != 0;
            }
            int d22 = object.l();
            if (a22 != false && d22 < ysa.s) {
                return uSa.E != 0;
            }
            d22 = object.C();
            if (d22 < ERa.C) {
                XE_3.J(new StringBuilder().insert(5 >> 3, vTa.la).append(d22).append(Uqa.B).append(n2).toString());
                XE_3.J[n3] = null;
                return uSa.E != 0;
            }
            n2 = uSa.E;
            if (a22 != false) {
                n2 = d22 * ERa.C * uqa.g;
            }
            float a22 = lQa.ga * (gg3.C(pqa.r) - psa.N);
            if (gg3.f() > 0) {
                a22 = pqa.r;
            }
            a22 = Config.J(a22);
            c22 = Config.J((float)(c22 + MQa.L)) * (float)(d22 - vRa.d);
            float f4 = Config.J(Config.J().pa);
            int n4 = f3 > WSa.B ? vRa.d : uSa.E;
            Object object2 = object = (Object)object.J();
            XE_3.J((float[][])object2, a22 *= (float)(d22 - vRa.d), n2, d22, L);
            XE_3.J((float[][])object2, c22, n2 + ERa.C * d22, d22, f);
            float[] c22 = new float[yRa.d];
            int n5 = a22 = uSa.E;
            while (n5 < ERa.C) {
                int n6 = uSa.E;
                while (n6 < ERa.C) {
                    int n7;
                    int n8 = n7 = uSa.E;
                    while (n8 < yRa.d) {
                        float d22 = Config.J(L[a22][n7] + f[n2][n7]);
                        if (n4 != 0) {
                            float f5;
                            float f6 = f5 = pqa.r - d22;
                            f5 = pqa.r - f6 * f6 * f5 * f5;
                            d22 = f4 * f5 + (pqa.r - f4) * d22;
                        }
                        c22[n7++] = d22;
                        n8 = n7;
                    }
                    n7 = (int)(c22[uSa.E] * NQa.Y);
                    d22 = (int)(c22[vRa.d] * NQa.Y);
                    int n9 = (int)(c22[uqa.g] * NQa.Y);
                    int n10 = a22 * ERa.C + n2;
                    b[n10] = gsa.X | n7 << ERa.C | d22 << Yqa.i | n9;
                    n6 = ++n2;
                }
                n5 = ++a22;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Lz J(Lz lz2, I i2, double d2, double d3, double d4) {
        void a22;
        void b22;
        void c22;
        Lz e322 = i2;
        Lz d5 = lz2;
        if (b == null) {
            return d5;
        }
        int e322 = b.J((I)e322, (double)c22, (double)b22, (double)a22, yRa.d);
        int c22 = e322 >> ERa.C & osa.Ja;
        int n2 = e322 >> Yqa.i & osa.Ja;
        float f2 = (float)c22 / NQa.Y;
        float f3 = (float)n2 / NQa.Y;
        float e322 = (float)(e322 &= osa.Ja) / NQa.Y;
        Lz lz3 = d5;
        float b22 = (float)lz3.A / MQa.L;
        float f4 = (float)lz3.j / fta.Aa;
        float a22 = (float)lz3.J;
        return a.J(f2 *= b22, f3 *= f4, e322 *= a22);
    }

    public static float J(float f2) {
        float f3 = f2;
        if (I <= 0) {
            return f3;
        }
        float a2 = ROa.p / (float)I;
        return f3 * a2;
    }

    public static /* synthetic */ Pf d() {
        return D;
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, String string2, String[] stringArray, String string3) {
        void c2;
        void a2;
        Object d2;
        block7: {
            Properties properties;
            block6: {
                String string4 = string;
                ResourceLocation resourceLocation = new ResourceLocation(string4);
                d2 = Config.J(resourceLocation);
                if (d2 != null) break block6;
                return a2;
            }
            Properties properties2 = properties = new Properties();
            properties2.load((InputStream)d2);
            ((InputStream)d2).close();
            d2 = properties2.getProperty((String)c2);
            if (d2 != null) break block7;
            return a2;
        }
        try {
            void b2;
            if (!Arrays.asList(b2).contains(d2)) {
                XE_3.J(new StringBuilder().insert(5 >> 3, hqa.N).append((String)c2).append(vTa.S).append((String)d2).toString());
                XE_3.J(new StringBuilder().insert(2 & 5, ERa.d).append(Config.J((Object[])b2)).toString());
                return a2;
            }
            XE_3.f(new StringBuilder().insert(5 >> 3, Mqa.y).append((String)c2).append(vTa.S).append((String)d2).toString());
            return d2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return a2;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return a2;
        }
    }

    private static int l(String string) {
        String string2 = string;
        if (string2 == null) {
            return pua.o;
        }
        int a2 = PIa.J((String)string2);
        if (a2 < 0) {
            return pua.o;
        }
        String string3 = PIa.J((int)a2);
        if (!Config.equals(string2, string3)) {
            return pua.o;
        }
        return a2;
    }

    static {
        i = WQa.h;
        D = null;
        m = null;
        n = null;
        Y = null;
        o = null;
        e = null;
        c = null;
        b = null;
        a = new gf();
        A = null;
        r = new gf();
        P = null;
        k = new gf();
        J = null;
        x = uSa.E;
        L = new float[ERa.C][yRa.d];
        f = new float[ERa.C][yRa.d];
        C = null;
        j = null;
        I = pua.o;
        l = null;
        F = null;
        B = null;
        q = null;
        R = null;
        g = vRa.d;
        E = pua.o;
        U = pua.o;
        d = pua.o;
        s = pua.o;
        Q = pua.o;
        H = pua.o;
        t = null;
        M = null;
        N = null;
        z = null;
        T = null;
        w = null;
        X = null;
        p = null;
        h = null;
        y = null;
        W = QFa.Bc.J();
        K = QFa.sc.J();
        G = new Random();
        v = new ud();
        Z = new HD();
        O = new ae();
        u = new Xf();
        V = new ZF();
    }

    public static void f() {
        i = WQa.h;
        D = null;
        n = null;
        m = null;
        o = null;
        Y = null;
        b = null;
        A = null;
        P = null;
        C = null;
        j = null;
        I = pua.o;
        l = null;
        F = null;
        R = null;
        J = null;
        E = pua.o;
        U = pua.o;
        d = pua.o;
        s = pua.o;
        Q = pua.o;
        H = pua.o;
        t = null;
        M = null;
        N = null;
        e = null;
        c = null;
        g = vRa.d;
        z = null;
        T = null;
        w = null;
        X = null;
        p = null;
        XE_3.J(h);
        y = null;
        Qca.J();
        i = XE_3.J(ura.fa, wra.l, Pf.L, WQa.h);
        String string = kua.G;
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = LQa.L;
        stringArray[vRa.d] = aPa.y;
        Object object = stringArray;
        D = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
        XE_3.J();
        if (Config.Fa()) {
            String[] stringArray2 = new String[uqa.g];
            stringArray2[uSa.E] = Ypa.a;
            stringArray2[vRa.d] = Ata.f;
            object = stringArray2;
            m = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray3 = new String[uqa.g];
            stringArray3[uSa.E] = zpa.N;
            stringArray3[vRa.d] = MRa.Z;
            object = stringArray3;
            n = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray4 = new String[uqa.g];
            stringArray4[uSa.E] = Wsa.G;
            stringArray4[vRa.d] = gQa.Aa;
            object = stringArray4;
            o = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray5 = new String[uqa.g];
            stringArray5[uSa.E] = hQa.fa;
            stringArray5[vRa.d] = ysa.I;
            object = stringArray5;
            Y = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray6 = new String[uqa.g];
            stringArray6[uSa.E] = Lra.O;
            stringArray6[vRa.d] = Fua.A;
            object = stringArray6;
            b = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray7 = new String[uqa.g];
            stringArray7[uSa.E] = EPa.X;
            stringArray7[vRa.d] = dua.h;
            object = stringArray7;
            A = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray8 = new String[uqa.g];
            stringArray8[uSa.E] = ysa.P;
            stringArray8[vRa.d] = DPa.u;
            object = stringArray8;
            P = XE_3.J(string, (String[])object, hra.Ja, hra.Ja);
            String[] stringArray9 = new String[uqa.g];
            stringArray9[uSa.E] = mra.W;
            stringArray9[vRa.d] = Zra.P;
            object = stringArray9;
            C = XE_3.J(string, (String[])object, ERa.C, vRa.d);
            j = XE_3.J(new StringBuilder().insert(3 & 4, string).append(Tqa.w).toString(), pua.o, pua.o);
            l = XE_3.J(new StringBuilder().insert(3 & 4, string).append(SQa.Z).toString(), pua.o, pua.o);
            String[] stringArray10 = new String[uqa.g];
            stringArray10[uSa.E] = NOa.v;
            stringArray10[vRa.d] = Yua.H;
            object = stringArray10;
            F = XE_3.J(string, (String[])object, Yqa.i, vRa.d);
            q = XE_3.J(new StringBuilder().insert(3 >> 2, string).append(Hra.x).toString(), Yqa.i, vRa.d);
            B = XE_3.J(new StringBuilder().insert(2 & 5, string).append(Wsa.c).toString(), Yqa.i, vRa.d);
            String[] stringArray11 = new String[uqa.g];
            stringArray11[uSa.E] = POa.W;
            stringArray11[vRa.d] = zsa.Q;
            object = stringArray11;
            R = XE_3.J(string, (String[])object, pua.o, pua.o);
            object = XE_3.J();
            J = ((Pair)object).getLeft();
            x = (Integer)((Pair)object).getRight();
            XE_3.l(ura.fa);
            String[] stringArray12 = new String[uqa.g];
            stringArray12[uSa.E] = new StringBuilder().insert(5 >> 3, string).append(vRa.Y).toString();
            stringArray12[vRa.d] = new StringBuilder().insert(5 >> 3, string).append(UTa.Ga).toString();
            c = XE_3.J(stringArray12, e, hra.Ja, hra.Ja);
            XE_3.J();
        }
    }

    public static /* synthetic */ Pf C() {
        return o;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, int n2) {
        BufferedImage b2;
        block5: {
            void a2;
            InputStream inputStream;
            block4: {
                String string2 = string;
                try {
                    inputStream = Config.J(new ResourceLocation(string2));
                    if (inputStream != null) break block4;
                    return (int)a2;
                }
                catch (IOException iOException) {
                    return (int)a2;
                }
            }
            InputStream inputStream2 = inputStream;
            b2 = ImageIO.read(inputStream2);
            inputStream2.close();
            if (b2 != null) break block5;
            return (int)a2;
        }
        return b2.getHeight();
    }

    public static int J(float f2) {
        float f3 = f2;
        if (j == null) {
            return pua.o;
        }
        int a2 = (int)Math.round((double)((Oz.d((float)f3) + pqa.r) * (float)(j.J() - vRa.d)) / KPa.y);
        return j.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    private static Pf J(String string, String[] stringArray, int n2, int n3) {
        void c2;
        int n4;
        String string2 = string;
        int n5 = n4 = uSa.E;
        while (n5 < ((void)c2).length) {
            void a2;
            void b2;
            String d2 = c2[n4];
            d2 = new StringBuilder().insert(3 ^ 3, string2).append(d2).toString();
            if ((d2 = XE_3.J(d2, (int)b2, (int)a2)) != null) {
                return d2;
            }
            n5 = ++n4;
        }
        return null;
    }

    public static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (y == null) {
            return b2;
        }
        if (a2 >= 0 && a2 < y.length) {
            int n4 = y[a2];
            if (n4 < 0) {
                return b2;
            }
            return n4;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private static int[] l(Properties properties, String string, String string2, String string3) {
        void a2;
        Properties properties2 = properties;
        int[] c2 = new int[Hda.A.length];
        Arrays.fill(c2, pua.o);
        int n2 = uSa.E;
        for (Object d2 : properties2.keySet()) {
            void b2;
            String string4 = properties2.getProperty((String)d2);
            if (!((String)d2).startsWith((String)b2)) continue;
            int n3 = XE_3.J((String)d2);
            int n4 = XE_3.C(string4);
            if (n3 >= 0 && n3 < c2.length && n4 >= 0) {
                ++n2;
                c2[n3] = n4;
                continue;
            }
            XE_3.J(new StringBuilder().insert(3 ^ 3, Hta.E).append(d2).append(XTa.d).append(string4).toString());
        }
        if (n2 <= 0) {
            return null;
        }
        XE_3.f(new StringBuilder().insert(5 >> 3, (String)a2).append(pQa.m).append(n2).toString());
        return c2;
    }

    public static /* synthetic */ Pf l() {
        return Y;
    }

    public static int l(int a2) {
        if (H < 0) {
            return a2;
        }
        return H;
    }

    public static Lz J(Lz lz2, Gg gg2, vL vL2, float f2) {
        Kpa c2;
        Lz d2 = vL2;
        Lz b2 = lz2;
        switch (c2.F.J()) {
            case 0: {
                Kpa kpa2 = Kpa.J();
                while (false) {
                }
                c2 = kpa2;
                b2 = XE_3.J(b2, (I)c2.Ta, d2.la, d2.Z + oua.i, d2.A);
                return b2;
            }
            case 1: {
                b2 = XE_3.f(b2);
            }
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private static int[] f(Properties properties, String string, String string2, String string3) {
        int n2;
        void a2;
        Properties properties2 = properties;
        ArrayList<Integer> c2 = new ArrayList<Integer>();
        Object d2 = properties2.keySet();
        int n3 = uSa.E;
        d2 = d2.iterator();
        while (d2.hasNext()) {
            void b2;
            Object e2 = d2.next();
            String string4 = properties2.getProperty((String)e2);
            if (!((String)e2).startsWith((String)b2)) continue;
            int n4 = XE_3.l(cg.l((String)((String)e2), (String)b2));
            int n5 = XE_3.C(string4);
            if (n4 >= 0 && n5 >= 0) {
                ArrayList<Integer> arrayList = c2;
                while (arrayList.size() <= n4) {
                    ArrayList<Integer> arrayList2 = c2;
                    arrayList = arrayList2;
                    arrayList2.add(pua.o);
                }
                ++n3;
                c2.set(n4, n5);
                continue;
            }
            XE_3.J(new StringBuilder().insert(3 ^ 3, isa.J).append(e2).append(XTa.d).append(string4).toString());
        }
        if (n3 <= 0) {
            return null;
        }
        XE_3.f(new StringBuilder().insert(3 >> 2, (String)a2).append(pQa.m).append(n3).toString());
        d2 = new int[c2.size()];
        int n6 = n2 = uSa.E;
        while (n6 < ((Object)d2).length) {
            int n7 = n2++;
            d2[n7] = (Integer)c2.get(n7);
            n6 = n2;
        }
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(Pf pf2, List list) {
        Pf pf3 = pf2;
        int[] nArray = pf3.J();
        Object b2 = nArray;
        if (nArray != null && ((Pf)b2).length > 0) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < ((Pf)b2).length) {
                Pf pf4 = b2[n2];
                if (pf4 < 0) {
                    XE_3.J(new StringBuilder().insert(5 >> 3, lPa.la).append((int)pf4).toString());
                } else {
                    void a2;
                    XE_3.J(pf3, (List)a2, (int)pf4);
                }
                n3 = ++n2;
            }
        } else {
            XE_3.J(new StringBuilder().insert(3 >> 2, fpa.Ma).append(Config.J((int[])b2)).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int[] J(Properties properties, String string, String string2, String string3) {
        void a2;
        Properties properties2 = properties;
        int[] c2 = new int[MapColor.mapColorArray.length];
        Arrays.fill(c2, pua.o);
        int n2 = uSa.E;
        for (Object d2 : properties2.keySet()) {
            void b2;
            String string4 = properties2.getProperty((String)d2);
            if (!((String)d2).startsWith((String)b2)) continue;
            int n3 = XE_3.f(cg.l((String)((String)d2), (String)b2));
            int n4 = XE_3.C(string4);
            if (n3 >= 0 && n3 < c2.length && n4 >= 0) {
                ++n2;
                c2[n3] = n4;
                continue;
            }
            XE_3.J(new StringBuilder().insert(5 >> 3, Hta.E).append(d2).append(XTa.d).append(string4).toString());
        }
        if (n2 <= 0) {
            return null;
        }
        XE_3.f(new StringBuilder().insert(3 & 4, (String)a2).append(pQa.m).append(n2).toString());
        return c2;
    }

    private static int J(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        if (C == null) {
            return pua.o;
        }
        int a2 = XE_3.J(iBlockState2, Ypa.A);
        return C.J(a2);
    }

    public static Jy J(I i2, XF xF2) {
        Object b2 = xF2;
        I a2 = i2;
        if ((b2 = a2.J((XF)((Object)b2))) == Jy.g && !Config.Ia()) {
            b2 = Jy.Z;
        }
        return b2;
    }

    private static int[] J() {
        int n2;
        MapColor[] mapColorArray = MapColor.mapColorArray;
        int[] nArray = new int[MapColor.mapColorArray.length];
        Arrays.fill(nArray, pua.o);
        int n3 = n2 = uSa.E;
        while (n3 < mapColorArray.length && n2 < nArray.length) {
            MapColor mapColor = mapColorArray[n2];
            if (mapColor != null) {
                nArray[n2] = mapColor.colorValue;
            }
            n3 = ++n2;
        }
        return nArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pf J(String string, int n2, int n3) {
        String string2 = string;
        try {
            void a2;
            void b2;
            InputStream inputStream;
            ResourceLocation resourceLocation = new ResourceLocation(string2);
            if (!Config.f(resourceLocation)) {
                return null;
            }
            XE_3.f(new StringBuilder().insert(3 ^ 3, Jta.T).append(string2).toString());
            Properties properties = new Properties();
            String c2 = cg.f((String)string2, (String)KPa.C, (String)Jpa.R);
            ResourceLocation resourceLocation2 = new ResourceLocation(c2);
            if (Config.f(resourceLocation2)) {
                InputStream inputStream2 = inputStream = Config.J(resourceLocation2);
                properties.load(inputStream2);
                inputStream2.close();
                XE_3.f(new StringBuilder().insert(3 & 4, kta.E).append(c2).toString());
            } else {
                properties.put(tTa.T, i);
                properties.put(kqa.Ha, string2);
                c2 = string2;
            }
            inputStream = new Pf(properties, c2, (int)b2, (int)a2, i);
            if (!inputStream.J(c2)) {
                return null;
            }
            return inputStream;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Pf[][] J(String[] stringArray, Pf[] pfArray, int n2, int n3) {
        void c2;
        Object d2;
        int n4;
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[vRa.d];
        stringArray3[uSa.E] = Jpa.R;
        String[] stringArray4 = fg.J((String[])stringArray2, (String[])stringArray3);
        Arrays.sort(stringArray4);
        ArrayList arrayList = new ArrayList();
        int n5 = n4 = uSa.E;
        while (n5 < stringArray4.length) {
            InputStream inputStream;
            block9: {
                d2 = stringArray4[n4];
                XE_3.f(new StringBuilder().insert(3 >> 2, pPa.a).append((String)d2).toString());
                ResourceLocation resourceLocation = new ResourceLocation(APa.m, (String)d2);
                inputStream = Config.J(resourceLocation);
                if (inputStream != null) break block9;
                XE_3.J(new StringBuilder().insert(3 & 4, CRa.A).append((String)d2).toString());
            }
            try {
                void a2;
                void b2;
                Properties properties = new Properties();
                properties.load(inputStream);
                inputStream = new Pf(properties, (String)d2, (int)b2, (int)a2, i);
                if (inputStream.J((String)d2) && inputStream.f((String)d2)) {
                    XE_3.J((Pf)inputStream, arrayList);
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                XE_3.J(new StringBuilder().insert(3 ^ 3, CRa.A).append((String)d2).toString());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n5 = ++n4;
        }
        if (c2 != null) {
            int n6 = n4 = uSa.E;
            while (n6 < ((void)c2).length) {
                void v3 = c2[n4];
                d2 = v3;
                XE_3.J((Pf)v3, arrayList);
                n6 = ++n4;
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Pf[][] pfArray2 = XE_3.J(arrayList);
        return pfArray2;
    }

    /*
     * WARNING - void declaration
     */
    public static void f(ska ska2, I i2, double d2, double d3, double d4) {
        ska e222 = i2;
        ska d5 = ska2;
        if (C != null) {
            void a2;
            void b2;
            void c22;
            int e222 = XE_3.J(e222.J(new XF((double)c22, (double)b2, (double)a2)), Ypa.A);
            e222 = C.J(e222);
            int n2 = e222 >> ERa.C & osa.Ja;
            int c22 = e222 >> Yqa.i & osa.Ja;
            float f2 = (float)n2 / NQa.Y;
            float f3 = (float)c22 / NQa.Y;
            float e222 = (float)(e222 &= osa.Ja) / NQa.Y;
            d5.f(f2, f3, e222);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int J(Properties properties, String[] stringArray) {
        void a2;
        int n2;
        Properties properties2 = properties;
        int n3 = n2 = uSa.E;
        while (n3 < ((void)a2).length) {
            Properties b22 = a2[n2];
            int b22 = XE_3.J(properties2, (String)((Object)b22));
            if (b22 >= 0) {
                return b22;
            }
            n3 = ++n2;
        }
        return pua.o;
    }

    private static Pf J(IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        if (c == null) {
            return null;
        }
        if (!(iBlockState2 instanceof BlockStateBase)) {
            return null;
        }
        BlockStateBase blockStateBase = (BlockStateBase)iBlockState2;
        int a22 = blockStateBase.l();
        if (a22 >= 0 && a22 < c.length) {
            int n2;
            Pf[] a22 = c[a22];
            if (a22 == null) {
                return null;
            }
            int n3 = n2 = uSa.E;
            while (n3 < a22.length) {
                Pf pf2 = a22[n2];
                if (pf2.J(blockStateBase)) {
                    return pf2;
                }
                n3 = ++n2;
            }
            return null;
        }
        return null;
    }

    private static void J(int[] nArray) {
        int[] nArray2 = nArray;
        if (nArray2 != null) {
            int a2;
            MapColor[] mapColorArray = MapColor.mapColorArray;
            int n2 = uSa.E;
            int n3 = a2 = uSa.E;
            while (n3 < mapColorArray.length && a2 < nArray2.length) {
                int n4;
                MapColor mapColor = mapColorArray[a2];
                if (mapColor != null && (n4 = nArray2[a2]) >= 0 && mapColor.colorValue != n4) {
                    mapColor.colorValue = n4;
                    n2 = vRa.d;
                }
                n3 = ++a2;
            }
            if (n2 != 0) {
                Kpa.J().J().J();
            }
        }
    }

    private static void f(String a2) {
        Config.f(new StringBuilder().insert(3 & 4, oqa.Z).append(a2).toString());
    }

    public static float[] f(iea iea2, float[] fArray) {
        Object b2 = fArray;
        iea a2 = iea2;
        return XE_3.J(a2, w, (float[])b2);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(Mda mda2, int n2, int n3) {
        int c2 = n3;
        Mda a2 = mda2;
        if (a2 == null) {
            return c2;
        }
        eAa eAa2 = a2.J();
        if (eAa2 == null) {
            return c2;
        }
        if (eAa2 instanceof Pba) {
            void b2;
            return XE_3.J((Pba)eAa2, a2, (int)b2, c2);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(Block block, I i2, XF xF2, JE jE2) {
        void a2;
        Block d2 = i2;
        Block c2 = block;
        d2 = F;
        if (c2 == QFa.i && q != null) {
            d2 = q;
        }
        if (c2 == QFa.Nb && B != null) {
            d2 = B;
        }
        if (d2 == null) {
            return pua.o;
        }
        int b2 = a2.f();
        return d2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(ska ska2, I i2, double d2, double d3, double d4) {
        Object e222 = i2;
        ska d5 = ska2;
        if (D != null || c != null) {
            void a22;
            void b22;
            void c22;
            XF c22 = new XF((double)c22, (double)b22, (double)a22);
            ska ska3 = e222;
            e222 = JE.J((I)ska3, K, c22);
            int e222 = XE_3.J((I)ska3, K, c22, (JE)e222);
            int n2 = e222 >> ERa.C & osa.Ja;
            int n3 = e222 >> Yqa.i & osa.Ja;
            float f2 = (float)n2 / NQa.Y;
            float f3 = (float)n3 / NQa.Y;
            float e222 = (float)(e222 &= osa.Ja) / NQa.Y;
            if (E >= 0) {
                int b22 = E >> ERa.C & osa.Ja;
                int n4 = E >> Yqa.i & osa.Ja;
                int a22 = E & osa.Ja;
                f2 *= (float)b22 / NQa.Y;
                f3 *= (float)n4 / NQa.Y;
                e222 *= (float)a22 / NQa.Y;
            }
            d5.f(f2, f3, e222);
        }
    }

    public static int f(int a2) {
        if (Q < 0) {
            return a2;
        }
        return Q;
    }

    private static int f(String a2) {
        if (a2 == null) {
            return pua.o;
        }
        if (a2.equals(BPa.h)) {
            return MapColor.airColor.colorIndex;
        }
        if (a2.equals(Xsa.J)) {
            return MapColor.grassColor.colorIndex;
        }
        if (a2.equals(dqa.la)) {
            return MapColor.sandColor.colorIndex;
        }
        if (a2.equals(Xpa.r)) {
            return MapColor.clothColor.colorIndex;
        }
        if (a2.equals(TOa.W)) {
            return MapColor.tntColor.colorIndex;
        }
        if (a2.equals(SRa.Q)) {
            return MapColor.iceColor.colorIndex;
        }
        if (a2.equals(mPa.L)) {
            return MapColor.ironColor.colorIndex;
        }
        if (a2.equals(yra.R)) {
            return MapColor.foliageColor.colorIndex;
        }
        if (a2.equals(nua.Z)) {
            return MapColor.clayColor.colorIndex;
        }
        if (a2.equals(aSa.P)) {
            return MapColor.dirtColor.colorIndex;
        }
        if (a2.equals(fpa.F)) {
            return MapColor.stoneColor.colorIndex;
        }
        if (a2.equals(wua.i)) {
            return MapColor.waterColor.colorIndex;
        }
        if (a2.equals(yRa.Ja)) {
            return MapColor.woodColor.colorIndex;
        }
        if (a2.equals(SRa.u)) {
            return MapColor.quartzColor.colorIndex;
        }
        if (a2.equals(pta.A)) {
            return MapColor.goldColor.colorIndex;
        }
        if (a2.equals(nQa.a)) {
            return MapColor.diamondColor.colorIndex;
        }
        if (a2.equals(Ata.Da)) {
            return MapColor.lapisColor.colorIndex;
        }
        if (a2.equals(zta.d)) {
            return MapColor.emeraldColor.colorIndex;
        }
        if (a2.equals(WRa.B)) {
            return MapColor.obsidianColor.colorIndex;
        }
        if (a2.equals(pPa.g)) {
            return MapColor.netherrackColor.colorIndex;
        }
        if (!a2.equals(Yra.p) && !a2.equals(gQa.r)) {
            if (!a2.equals(dQa.m) && !a2.equals(Cta.W)) {
                if (a2.equals(mSa.N)) {
                    return MapColor.magentaColor.colorIndex;
                }
                if (!a2.equals(Ira.r) && !a2.equals(rpa.f)) {
                    if (a2.equals(QTa.v)) {
                        return MapColor.yellowColor.colorIndex;
                    }
                    if (a2.equals(xua.e)) {
                        return MapColor.limeColor.colorIndex;
                    }
                    if (a2.equals(bSa.q)) {
                        return MapColor.pinkColor.colorIndex;
                    }
                    if (a2.equals(zsa.ba)) {
                        return MapColor.grayColor.colorIndex;
                    }
                    if (a2.equals(opa.Aa)) {
                        return MapColor.silverColor.colorIndex;
                    }
                    if (a2.equals(cRa.v)) {
                        return MapColor.cyanColor.colorIndex;
                    }
                    if (a2.equals(yRa.J)) {
                        return MapColor.purpleColor.colorIndex;
                    }
                    if (a2.equals(rQa.a)) {
                        return MapColor.blueColor.colorIndex;
                    }
                    if (a2.equals(JPa.y)) {
                        return MapColor.brownColor.colorIndex;
                    }
                    if (a2.equals(NSa.A)) {
                        return MapColor.greenColor.colorIndex;
                    }
                    if (a2.equals(rQa.Y)) {
                        return MapColor.redColor.colorIndex;
                    }
                    if (a2.equals(GPa.i)) {
                        return MapColor.blackColor.colorIndex;
                    }
                    return pua.o;
                }
                return MapColor.lightBlueColor.colorIndex;
            }
            return MapColor.adobeColor.colorIndex;
        }
        return MapColor.snowColor.colorIndex;
    }

    private static Lz f(Lz a2) {
        if (N == null) {
            return a2;
        }
        return N;
    }

    public static int J(int n2) {
        int n3 = n2;
        if (l == null) {
            return pua.o;
        }
        int a2 = n3 * l.J() / osa.Ja;
        return l.J(a2);
    }

    public static /* synthetic */ Pf f() {
        return m;
    }

    /*
     * WARNING - void declaration
     */
    private static Pf[] J(Properties properties, String string) {
        int n2;
        String string2;
        Properties properties2 = properties;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string3 = PQa.Z;
        Object b2 = new HashMap();
        for (Object object : properties2.keySet()) {
            string2 = properties2.getProperty((String)object);
            if (!((String)object).startsWith(string3)) continue;
            b2.put((Object)object, (Object)string2);
        }
        String[] stringArray = b2.keySet().toArray(new String[b2.size()]);
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            void a2;
            string2 = stringArray[n2];
            b2 = properties2.getProperty(string2);
            XE_3.f(new StringBuilder().insert(2 & 5, xqa.Q).append(string2).append(XTa.d).append((String)b2).toString());
            ze[] zeArray = string2.substring(string3.length());
            String string4 = Cg.J((String)a2);
            zeArray = Cg.J((String)zeArray, (String)string4);
            string4 = XE_3.J((String)zeArray, hra.Ja, hra.Ja);
            if (string4 == null) {
                XE_3.J(new StringBuilder().insert(3 >> 2, eua.J).append((String)zeArray).toString());
            } else {
                zeArray = new LE(Era.Q).f((String)b2);
                if (zeArray != null && zeArray.length > 0) {
                    int n4 = uSa.E;
                    while (n4 < zeArray.length) {
                        int n5;
                        ze ze2 = zeArray[n5];
                        string4.J(ze2);
                        n4 = ++n5;
                    }
                    arrayList.add(string4);
                } else {
                    XE_3.J(new StringBuilder().insert(2 & 5, tSa.W).append((String)b2).toString());
                }
            }
            n3 = ++n2;
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        ArrayList<String> arrayList2 = arrayList;
        Pf[] pfArray = arrayList2.toArray(new Pf[arrayList2.size()]);
        return pfArray;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(Properties properties, String string) {
        void a2;
        Properties properties2 = properties;
        Object b2 = properties2.getProperty((String)a2);
        if (b2 == null) {
            return pua.o;
        }
        int n2 = XE_3.C((String)(b2 = ((String)b2).trim()));
        if (n2 < 0) {
            XE_3.J(new StringBuilder().insert(5 >> 3, Hta.E).append((String)a2).append(XTa.d).append((String)b2).toString());
            return n2;
        }
        XE_3.f(new StringBuilder().insert(3 ^ 3, (String)a2).append(XTa.d).append((String)b2).toString());
        return n2;
    }

    private static Pf[][] J(List list) {
        int n2;
        List list2 = list;
        Pf[][] pfArrayArray = new Pf[list2.size()][];
        int n3 = n2 = uSa.E;
        while (n3 < list2.size()) {
            Object a2 = (List)list2.get(n2);
            if (a2 != null) {
                a2 = a2.toArray(new Pf[a2.size()]);
                pfArrayArray[n2] = a2;
            }
            n3 = ++n2;
        }
        return pfArrayArray;
    }

    private static int J(String string) {
        int n2;
        String string2 = string;
        if (string2.equals(fTa.a)) {
            return uSa.E;
        }
        Hda[] hdaArray = Hda.A;
        int n3 = n2 = uSa.E;
        while (n3 < hdaArray.length) {
            String a2 = hdaArray[n2];
            if (a2 != null && a2.J().equals(string2)) {
                return a2.J();
            }
            n3 = ++n2;
        }
        return pua.o;
    }

    public static void J() {
        g = n == null && m == null && o == null && Y == null && Config.Ia() && Config.t() ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int J(Yka yka, Block block, I i2, XF xF2, JE jE2) {
        Object e2;
        void c2;
        XF b2;
        void a2;
        block24: {
            block25: {
                int n2;
                void d2;
                block26: {
                    Yka yka2 = yka;
                    if (c != null) {
                        IBlockState iBlockState = a2.J();
                        if (!yka2.J()) {
                            if (d2 == QFa.lf) {
                                iBlockState = W;
                            }
                            if (d2 == QFa.pa) {
                                return pua.o;
                            }
                        }
                        if (d2 == QFa.Ia && a2.f() >= Yqa.i) {
                            b2 = b2.down();
                            iBlockState = c2.J(b2);
                        }
                        if ((e2 = XE_3.J(iBlockState)) != null) {
                            if (Config.t() && !e2.J()) {
                                return XE_3.J((I)c2, b2, (J)e2, a2.J());
                            }
                            return e2.J((I)c2, b2);
                        }
                    }
                    if (!yka2.J()) {
                        return pua.o;
                    }
                    if (d2 == QFa.pB) {
                        return XE_3.J((I)c2, b2);
                    }
                    if (d2 == QFa.pa) {
                        return XE_3.J(a2.J());
                    }
                    if (d2 instanceof BlockStem) {
                        return XE_3.J((Block)d2, (I)c2, b2, (JE)a2);
                    }
                    if (g) {
                        return pua.o;
                    }
                    n2 = a2.f();
                    if (d2 == QFa.lf || d2 == QFa.y || d2 == QFa.Ia) break block25;
                    if (d2 != QFa.Ia) break block26;
                    e2 = v;
                    if (n2 >= Yqa.i) {
                        b2 = b2.down();
                    }
                    break block24;
                }
                if (d2 == QFa.vd) {
                    switch (n2 & yRa.d) {
                        case 0: {
                            e2 = Z;
                            break;
                        }
                        case 1: {
                            e2 = O;
                            break;
                        }
                        case 2: {
                            e2 = u;
                            break;
                        }
                        default: {
                            e2 = Z;
                            break;
                        }
                    }
                    break block24;
                } else if (d2 == QFa.Z) {
                    e2 = Z;
                    break block24;
                } else {
                    if (d2 != QFa.vC) {
                        return pua.o;
                    }
                    e2 = Z;
                }
                break block24;
            }
            e2 = v;
        }
        if (Config.t() && !e2.J()) {
            return XE_3.J((I)c2, b2, (J)e2, a2.J());
        }
        return e2.J((I)c2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(Pba pba2, Mda mda2, int n2, int n3) {
        void a2;
        int[] b2;
        Pba d22 = mda2;
        Pba c2 = pba2;
        int d22 = d22.J();
        int[] nArray = b2 = b2 == false ? z : T;
        if (b2 == null) {
            return (int)a2;
        }
        if (d22 >= 0 && d22 < b2.length) {
            if ((d22 = b2[d22]) < 0) {
                return (int)a2;
            }
            return d22;
        }
        return (int)a2;
    }

    public static float[] J(iea iea2, float[] fArray) {
        Object b2 = fArray;
        iea a2 = iea2;
        return XE_3.J(a2, X, (float[])b2);
    }

    private static Lz J(Properties properties, String string) {
        Properties a2 = properties;
        String b322 = string;
        int b322 = XE_3.J(a2, b322);
        if (b322 < 0) {
            return null;
        }
        int n2 = b322 >> ERa.C & osa.Ja;
        int n3 = b322 >> Yqa.i & osa.Ja;
        float f2 = (float)n2 / NQa.Y;
        float f3 = (float)n3 / NQa.Y;
        float b322 = (float)(b322 &= osa.Ja) / NQa.Y;
        return new Lz((double)f2, (double)f3, (double)b322);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(float[][] fArray, float f2, int n2, int n3, float[][] fArray2) {
        void a2;
        void b2;
        void c2;
        int n4;
        void d22;
        float[][] fArray3 = fArray;
        int n5 = (int)Math.floor((double)d22);
        if (n5 == (n4 = (int)Math.ceil((double)d22))) {
            int n6;
            int n7 = n6 = uSa.E;
            while (n7 < ERa.C) {
                float[] fArray4 = fArray3[c2 + n6 * b2 + n5];
                float[][] e2 = a2[n6];
                int n8 = uSa.E;
                while (n8 < yRa.d) {
                    int n9;
                    int n10 = n9++;
                    e2[n10] = (float[])fArray4[n10];
                    n8 = n9;
                }
                n7 = ++n6;
            }
        } else {
            int e2;
            float f3 = pqa.r - (d22 - (float)n5);
            float f4 = pqa.r - ((float)n4 - d22);
            int n11 = e2 = uSa.E;
            while (n11 < ERa.C) {
                float[] fArray5 = fArray3[c2 + e2 * b2 + n5];
                float[] d22 = fArray3[c2 + e2 * b2 + n4];
                void var11_16 = a2[e2];
                int n12 = uSa.E;
                while (n12 < yRa.d) {
                    int n13;
                    int n14 = n13;
                    float f5 = fArray5[n13] * f3 + d22[n14] * f4;
                    var11_16[n14] = f5;
                    n12 = ++n13;
                }
                n11 = ++e2;
            }
        }
    }

    private static void J(String a2) {
        Config.J(new StringBuilder().insert(3 >> 2, oqa.Z).append(a2).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Lz J(Lz lz2, Eoa eoa2, vL vL2, float f2) {
        Kpa c2;
        float d22 = f2;
        Lz a2 = lz2;
        if (uw.L != null) {
            int d22 = uw.L;
            return new Lz((double)((float)(d22 >> ERa.C & osa.Ja) / NQa.Y), (double)((float)(d22 >> Yqa.i & osa.Ja) / NQa.Y), (double)((float)(d22 & osa.Ja) / NQa.Y));
        }
        int d22 = c2.F.J();
        switch (d22) {
            case -1: {
                return XE_3.l(a2);
            }
            case 0: {
                void b2;
                c2 = Kpa.J();
                return XE_3.f(a2, (I)c2.Ta, b2.la, b2.Z + oua.i, b2.A);
            }
            case 1: {
                return XE_3.J(a2);
            }
        }
        return a2;
    }

    public static /* synthetic */ Pf J() {
        return n;
    }

    private static Lz J(Lz a2) {
        if (M == null) {
            return a2;
        }
        return M;
    }

    public XE_3() {
        XE_3 a2;
    }
}

