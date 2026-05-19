/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cf
 *  Cg
 *  ERa
 *  I
 *  ISa
 *  JPa
 *  Jy
 *  LE
 *  NQa
 *  Oz
 *  Qqa
 *  RPa
 *  Usa
 *  WQa
 *  WSa
 *  Wsa
 *  XE
 *  aqa
 *  cRa
 *  kqa
 *  oqa
 *  pqa
 *  pua
 *  uOa
 *  vRa
 *  ysa
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Pf_1
implements J {
    public static final String h = "color";
    public static final String K = "yOffset";
    private int H;
    private static final int c = -1;
    public static final String B = "source";
    private static final int d = 0;
    private String a;
    public static final String b = "vanilla";
    public static final String l = "yVariance";
    public String e;
    private static final int G = 2;
    private int D;
    private int f;
    public static final String F = "fixed";
    private int g;
    public static final String[] L;
    private static final int E = 1;
    public static final String m = "grid";
    private int[] C;
    public static final String i = "blocks";
    public String M;
    private float[][] k;
    private ze[] j;
    private int J;
    private int A;
    public static final String I = "format";

    public int J(int n2, int n3) {
        int b2;
        int c2 = n3;
        Pf_1 a2 = this;
        b2 = Config.J(b2, uSa.E, a2.g - vRa.d);
        c2 = Config.J(c2, uSa.E, a2.D - vRa.d);
        return a2.C[c2 * a2.g + b2] & Wsa.K;
    }

    public String toString() {
        Pf_1 a2;
        return new StringBuilder().insert(3 & 4, Mqa.y).append(a2.e).append(WSa.f).append(a2.M).append(eua.H).append(Config.J(a2.j)).append(Ira.v).append(a2.a).toString();
    }

    /*
     * WARNING - void declaration
     */
    private int l(Jy jy2, XF xF2) {
        void b22;
        Object c22 = xF2;
        Pf_1 a2 = this;
        int b22 = b22.Ka;
        Pf_1 pf_1 = a2;
        int n2 = c22.getY() - pf_1.H;
        if (pf_1.f > 0) {
            int c22 = Config.J(c22.getX() << ERa.C + c22.getZ());
            int n3 = a2.f * uqa.g + vRa.d;
            c22 = (c22 & osa.Ja) % n3 - a2.f;
            n2 += c22;
        }
        return a2.J(b22, n2);
    }

    public int C() {
        Pf_1 a2;
        return a2.g;
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = WQa.h;
        stringArray[vRa.d] = ISa.X;
        stringArray[uqa.g] = Ura.p;
        L = stringArray;
    }

    public int l() {
        Pf_1 a2;
        return a2.D;
    }

    /*
     * WARNING - void declaration
     */
    public Pf_1(Properties properties, String string, int n2, int n3, String string2) {
        void b2;
        void c2;
        void a2;
        void d2;
        void e2;
        Pf_1 pf_1;
        Pf_1 pf_12 = pf_1 = this;
        Pf_1 pf_13 = pf_1;
        Pf_1 pf_14 = pf_1;
        Pf_1 pf_15 = pf_1;
        pf_15.M = null;
        pf_15.e = null;
        pf_15.A = pua.o;
        pf_14.j = null;
        pf_13.a = null;
        pf_14.J = pua.o;
        pf_13.f = uSa.E;
        pf_13.H = uSa.E;
        pf_13.g = uSa.E;
        pf_13.D = uSa.E;
        pf_12.C = null;
        pf_12.k = null;
        Pf_1 f2 = new LE(IPa.J);
        Pf_1 pf_16 = pf_1;
        Pf_1 pf_17 = pf_1;
        void v6 = e2;
        void v7 = e2;
        Pf_1 pf_18 = pf_1;
        Pf_1 pf_19 = f2;
        pf_1.M = pf_19.f((String)d2);
        pf_1.e = pf_19.J((String)d2);
        pf_18.A = pf_1.J(e2.getProperty(tTa.T, (String)a2));
        pf_18.j = f2.f(v7.getProperty(lTa.A));
        pf_1.a = Pf_1.J(v7.getProperty(kqa.Ha), (String)d2, pf_1.e);
        pf_1.J = LE.f((String)v6.getProperty(Zra.L), (int)pua.o);
        pf_17.f = f2.J(v6.getProperty(Usa.k), uSa.E);
        pf_17.H = f2.J(e2.getProperty(nua.Aa), uSa.E);
        pf_16.g = c2;
        pf_16.D = b2;
    }

    public int[] J() {
        int n2;
        Object object;
        int a22;
        Pf_1 pf_1 = this;
        if (pf_1.j == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n3 = a22 = uSa.E;
        while (n3 < pf_1.j.length) {
            object = pf_1.j[a22];
            if (((ze)object).J() >= 0) {
                hashSet.add(((ze)object).J());
            }
            n3 = ++a22;
        }
        HashSet<Integer> hashSet2 = hashSet;
        Integer[] a22 = hashSet2.toArray(new Integer[hashSet2.size()]);
        object = new int[a22.length];
        int n4 = n2 = uSa.E;
        while (n4 < a22.length) {
            int n5 = n2++;
            object[n5] = a22[n5];
            n4 = n2;
        }
        return object;
    }

    private void J() {
        int n2;
        Object object;
        String string;
        Pf_1 pf_1;
        block8: {
            block7: {
                pf_1 = this;
                try {
                    pf_1.C = null;
                    if (pf_1.a != null) break block7;
                    return;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    return;
                }
            }
            string = new StringBuilder().insert(3 & 4, pf_1.a).append(KPa.C).toString();
            object = Config.J(new ResourceLocation(string));
            if (object != null) break block8;
            return;
        }
        object = gLa.J((InputStream)object);
        if (object == null) {
            return;
        }
        Object object2 = object;
        int a2 = ((BufferedImage)object2).getWidth();
        int n3 = ((BufferedImage)object2).getHeight();
        int n4 = pf_1.g < 0 || pf_1.g == a2 ? vRa.d : uSa.E;
        int n5 = n2 = pf_1.D < 0 || pf_1.D == n3 ? vRa.d : uSa.E;
        if (n4 == 0 || n2 == 0) {
            Pf_1.f(new StringBuilder().insert(3 >> 2, qQa.L).append(a2).append(rRa.X).append(n3).append(BRa.y).append(pf_1.g).append(rRa.X).append(pf_1.D).append(ysa.Ga).append(string).toString());
        }
        Pf_1 pf_12 = pf_1;
        pf_12.g = a2;
        pf_12.D = n3;
        if (pf_1.g <= 0 || pf_1.D <= 0) {
            Pf_1.J(new StringBuilder().insert(2 & 5, Mqa.H).append(a2).append(rRa.X).append(n3).append(ysa.Ga).append(string).toString());
            return;
        }
        pf_1.C = new int[a2 * n3];
        ((BufferedImage)object).getRGB(uSa.E, uSa.E, a2, n3, pf_1.C, uSa.E, a2);
    }

    public int J(int n2) {
        int b2 = n2;
        Pf_1 a2 = this;
        b2 = Config.J(b2, uSa.E, a2.C.length - vRa.d);
        return a2.C[b2] & Wsa.K;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Pf_1 a2 = this;
        ze ze2 = a2.J((int)b2);
        if (ze2 != null) {
            if (c2 >= 0) {
                ze2.J(c2);
                return;
            }
        } else {
            a2.J(new ze((int)b2, c2));
        }
    }

    private static float[][] J(int[] nArray) {
        int n2;
        int[] nArray2 = nArray;
        float[][] fArray = new float[nArray2.length][yRa.d];
        int n3 = n2 = uSa.E;
        while (n3 < nArray2.length) {
            int a22 = nArray2[n2];
            float f2 = (float)(a22 >> ERa.C & osa.Ja) / NQa.Y;
            float f3 = (float)(a22 >> Yqa.i & osa.Ja) / NQa.Y;
            float a22 = (float)(a22 & osa.Ja) / NQa.Y;
            float[] fArray2 = fArray[n2];
            fArray2[uSa.E] = f2;
            fArray2[vRa.d] = f3;
            fArray2[uqa.g] = a22;
            n3 = ++n2;
        }
        return fArray;
    }

    private static void f(String a2) {
        Config.f(new StringBuilder().insert(5 >> 3, oqa.Z).append(a2).toString());
    }

    /*
     * WARNING - void declaration
     */
    public int f(Jy jy2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Pf_1 a2 = this;
        if (a2.A == 0) {
            return a2.J((Jy)b2, (XF)((Object)c2));
        }
        if (a2.A == vRa.d) {
            return a2.l((Jy)b2, (XF)((Object)c2));
        }
        return a2.J;
    }

    public void J(ze ze2) {
        ze b2 = ze2;
        Pf_1 a2 = this;
        if (a2.j == null) {
            a2.j = new ze[uSa.E];
        }
        a2.j = (ze[])Config.J((Object[])a2.j, b2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(Jy jy2, XF xF2) {
        void b22;
        Object c22 = xF2;
        Pf_1 a2 = this;
        void v0 = b22;
        double d2 = Oz.J((float)v0.J((XF)((Object)c22)), (float)JPa.N, (float)pqa.r);
        double d3 = Oz.J((float)v0.f(), (float)JPa.N, (float)pqa.r);
        Pf_1 pf_1 = a2;
        int b22 = (int)((oua.i - d2) * (double)(pf_1.g - vRa.d));
        int c22 = (int)((oua.i - (d3 *= d2)) * (double)(a2.D - vRa.d));
        return pf_1.J(b22, c22);
    }

    public int f() {
        Pf_1 pf_1 = this;
        if (pf_1.A == uqa.g) {
            return pf_1.J;
        }
        int a2 = XE.G.nextInt(pf_1.C.length);
        return pf_1.C[a2];
    }

    /*
     * WARNING - void declaration
     */
    private static String J(String string, String string2, String string3) {
        void b2;
        void a2;
        String c2;
        String string4 = string;
        if (string4 != null) {
            c2 = KPa.C;
            if (string4.endsWith(c2)) {
                String string5 = string4;
                string4 = string5.substring(uSa.E, string5.length() - c2.length());
            }
            string4 = Pf_1.J(string4, (String)a2);
            return string4;
        }
        c2 = b2;
        int n2 = c2.lastIndexOf(uOa.F);
        if (n2 >= 0) {
            c2 = b2.substring(n2 + vRa.d);
        }
        if ((b2 = c2.lastIndexOf(Bpa.Ha)) >= 0) {
            c2 = c2.substring(uSa.E, b2);
        }
        c2 = Pf_1.J(c2, (String)a2);
        return c2;
    }

    public float[][] J() {
        Pf_1 a2;
        if (a2.k == null) {
            a2.k = Pf_1.J(a2.C);
        }
        return a2.k;
    }

    private static void J(String a2) {
        Config.J(new StringBuilder().insert(3 ^ 3, oqa.Z).append(a2).toString());
    }

    private int J(String string) {
        String b2 = string;
        Pf_1 a2 = this;
        if (b2 == null) {
            return uSa.E;
        }
        if (b2.equals(WQa.h)) {
            return uSa.E;
        }
        if (b2.equals(ISa.X)) {
            return vRa.d;
        }
        if (b2.equals(Ura.p)) {
            return uqa.g;
        }
        Pf_1.J(new StringBuilder().insert(3 ^ 3, Jra.Ga).append(b2).toString());
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2) {
        void a2;
        Pf_1 c2 = i2;
        Pf_1 b2 = this;
        c2 = XE.J((I)c2, (XF)a2);
        return b2.f((Jy)c2, (XF)a2);
    }

    public boolean f(String string) {
        String b2 = string;
        Pf_1 a2 = this;
        if (a2.j == null) {
            Pf_1 pf_1 = a2;
            pf_1.j = pf_1.J();
            if (pf_1.j == null) {
                Pf_1.J(new StringBuilder().insert(2 & 5, oua.J).append(b2).toString());
                return uSa.E != 0;
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private ze J(int n2) {
        int b2;
        Pf_1 pf_1 = this;
        if (pf_1.j == null) {
            return null;
        }
        int n3 = b2 = uSa.E;
        while (n3 < pf_1.j.length) {
            void a2;
            ze ze2 = pf_1.j[b2];
            if (ze2.J() == a2) {
                return ze2;
            }
            n3 = ++b2;
        }
        return null;
    }

    private ze[] J() {
        ze[] a22;
        ze[] zeArray = this;
        Object object = Block.J(zeArray.M);
        if (object != null) {
            ze[] zeArray2 = new ze[vRa.d];
            zeArray2[uSa.E] = new ze(Block.J((Block)object));
            return zeArray2;
        }
        object = Pattern.compile(RPa.g).matcher(zeArray.M);
        if (((Matcher)object).matches()) {
            int a22 = Config.J(((Matcher)object).group(vRa.d), pua.o);
            if (a22 >= 0) {
                ze[] zeArray3 = new ze[vRa.d];
                zeArray3[uSa.E] = new ze(a22);
                return zeArray3;
            }
        }
        if ((a22 = new LE(IPa.J).J(zeArray.M)) != null) {
            return a22;
        }
        return null;
    }

    private static String J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        if (!((a2 = Cg.J((String)a2, (String)b2)).startsWith(b2) || a2.startsWith(Qqa.N) || a2.startsWith(ITa.T))) {
            a2 = new StringBuilder().insert(3 >> 2, b2).append(WSa.f).append(a2).toString();
        }
        if (a2.endsWith(KPa.C)) {
            String string3 = a2;
            a2 = string3.substring(uSa.E, string3.length() - AQa.P);
        }
        if (a2.startsWith(b2 = Ira.ca)) {
            a2 = a2.substring(b2.length());
        }
        if (a2.startsWith(WSa.f)) {
            a2 = a2.substring(vRa.d);
        }
        return a2;
    }

    @Override
    public boolean J() {
        Pf_1 a2;
        if (a2.A == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(I i2, double d2, double d3, double d4, int n2) {
        int n3;
        void a2;
        int n4;
        void b22;
        void c22;
        void d222;
        Pf_1 pf_1 = this;
        if (pf_1.A == uqa.g) {
            return pf_1.J;
        }
        int d222 = Oz.f((double)d222);
        int n5 = Oz.f((double)c22);
        int c22 = Oz.f((double)b22);
        int n6 = uSa.E;
        int b22 = uSa.E;
        int n7 = uSa.E;
        int n8 = uSa.E;
        Cf cf2 = new Cf(uSa.E, uSa.E, uSa.E);
        int n9 = n4 = d222 - a2;
        while (n9 <= d222 + a2) {
            int n10 = c22 - a2;
            while (n10 <= c22 + a2) {
                void e2;
                cf2.setXyz(n4, n5, n3);
                int f2 = pf_1.J((I)e2, (XF)cf2);
                n6 += f2 >> ERa.C & osa.Ja;
                b22 += f2 >> Yqa.i & osa.Ja;
                ++n8;
                n7 += f2 & osa.Ja;
                n10 = ++n3;
            }
            n9 = ++n4;
        }
        n4 = n6 / n8;
        n3 = b22 / n8;
        int f2 = n7 / n8;
        return n4 << ERa.C | n3 << Yqa.i | f2;
    }

    public int J() {
        Pf_1 a2;
        if (a2.A == uqa.g) {
            return vRa.d;
        }
        return a2.C.length;
    }

    public boolean J(String string) {
        String b2 = string;
        Pf_1 a2 = this;
        if (a2.A != 0 && a2.A != vRa.d) {
            if (a2.A != uqa.g) {
                return uSa.E != 0;
            }
            if (a2.J < 0) {
                a2.J = Wsa.K;
            }
        } else {
            if (a2.a == null) {
                Pf_1.J(new StringBuilder().insert(5 >> 3, aqa.X).append(b2).toString());
                return uSa.E != 0;
            }
            Pf_1 pf_1 = a2;
            pf_1.J();
            if (pf_1.C == null) {
                return uSa.E != 0;
            }
            if (a2.J < 0) {
                if (a2.A == 0) {
                    a2.J = a2.J(cRa.h, cRa.h);
                }
                if (a2.A == vRa.d) {
                    a2.J = a2.l(Jy.Z, new XF(uSa.E, ysa.s, uSa.E));
                }
            }
        }
        return vRa.d != 0;
    }

    public boolean J(BlockStateBase blockStateBase) {
        BlockStateBase b2 = blockStateBase;
        Pf_1 a2 = this;
        return Nf.J(b2, a2.j);
    }
}

