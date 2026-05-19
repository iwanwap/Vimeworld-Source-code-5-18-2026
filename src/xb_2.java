/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aka
 *  Cb
 *  ERa
 *  JPa
 *  Kpa
 *  LQa
 *  Rd
 *  Tpa
 *  U
 *  Uqa
 *  VJa
 *  Wsa
 *  YSa
 *  ZRa
 *  Zua
 *  aJa
 *  cra
 *  hqa
 *  jRa
 *  jsa
 *  kqa
 *  pQa
 *  pua
 *  uKa
 *  ula
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xb_2 {
    public static Cb e;
    public static Map<Integer, Cb> G;
    public static int D;
    public static ByteBuffer f;
    public static final int F = -8421377;
    public static final int g = 0;
    public static U L;
    public static int E;
    public static String m;
    public static Cb C;
    public static KLa i;
    public static WKa M;
    public static int[] k;
    public static ResourceLocation j;
    public static final int J = 0x100000;
    public static IntBuffer A;
    public static final int I = 0;

    public static void l(int[] nArray, int n2, int n3, int n4) {
        int d2 = n4;
        int[] nArray2 = nArray;
    }

    public static IntBuffer J(int a2) {
        if (A.capacity() < a2) {
            f = BufferUtils.createByteBuffer(xb_2.J(a2) * AQa.P);
            A = f.asIntBuffer();
        }
        return A;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        void d2;
        void e2;
        int[] nArray2 = nArray;
        void var6_7 = e2 * d2;
        Object f2 = xb_2.J((int)var6_7);
        ((IntBuffer)f2).clear();
        if (nArray2.length >= (a2 *= var6_7) + var6_7) {
            void b2;
            void c2;
            void a2;
            ((IntBuffer)f2).put(nArray2, (int)a2, (int)var6_7).position(uSa.E).limit((int)var6_7);
            GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)c2, (int)b2, (int)e2, (int)d2, NSa.U, aua.N, (IntBuffer)f2);
            ((IntBuffer)f2).clear();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        int[][] nArray2;
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        int g2 = n3;
        int[][] e2 = nArray;
        gLa.J(e2, (int)f2, g2, (int)d2, (int)c2, (boolean)b2, (boolean)a2);
        boolean bl3 = uSa.E;
        if (pA.DA) {
            nArray2 = xb_2.J(new StringBuilder().insert(5 >> 3, m).append(ZRa.e).toString(), (int)f2, g2, e2.length, bl3, pua.F);
            uKa.C((int)xb_2.e.A);
            gLa.J(nArray2, (int)f2, g2, (int)d2, (int)c2, (boolean)b2, (boolean)a2);
        }
        if (pA.hA) {
            nArray2 = xb_2.J(new StringBuilder().insert(2 & 5, m).append(jRa.G).toString(), (int)f2, g2, e2.length, bl3, uSa.E);
            uKa.C((int)xb_2.e.J);
            gLa.J(nArray2, (int)f2, g2, (int)d2, (int)c2, (boolean)b2, (boolean)a2);
        }
        uKa.C((int)xb_2.e.I);
    }

    public static void f(Cb a2) {
        C = a2;
        if (pA.pd && uKa.l() == YSa.Ka) {
            if (pA.DA) {
                uKa.i((int)qsa.L);
                uKa.C((int)a2.A);
            }
            if (pA.hA) {
                uKa.i((int)cra.d);
                uKa.C((int)a2.J);
            }
            uKa.i((int)YSa.Ka);
        }
        uKa.C((int)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(U u2, ResourceLocation resourceLocation, int n2, int n3, int[] nArray) {
        void a2;
        void d2;
        void c2;
        int e2 = n3;
        U b2 = u2;
        if (pA.DA) {
            void v0 = c2;
            xb_2.J(b2, xb_2.J((ResourceLocation)d2, kqa.U), (int)v0, e2, (int[])a2, (int)(v0 * e2), pua.F);
        }
        if (pA.hA) {
            void v1 = c2;
            xb_2.J(b2, xb_2.J((ResourceLocation)d2, wsa.Q), (int)v1, e2, (int[])a2, (int)(v1 * e2 * uqa.g), uSa.E);
        }
    }

    public static void J(int a2) {
        xb_2.f(G.get(a2));
    }

    public static IResource J(U u2, ResourceLocation resourceLocation) throws IOException {
        U a2;
        Object b2 = resourceLocation;
        L = a2 = u2;
        j = b2;
        return L.J(j);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[][] nArray, int n2, int n3, int n4, int n5, int n6) {
        void d2;
        int f2 = n2;
        int[][] e2 = nArray;
        IntBuffer intBuffer = xb_2.J(f2 * d2);
        int n7 = e2.length;
        int n8 = uSa.E;
        int n9 = f2;
        while (n9 > 0 && d2 > 0 && n8 < n7) {
            void a2;
            int n10 = f2 * d2;
            int[] nArray2 = e2[n8];
            intBuffer.clear();
            if (nArray2.length >= n10 * (a2 + vRa.d)) {
                void b2;
                void c2;
                intBuffer.put(nArray2, n10 * a2, n10).position(uSa.E).limit(n10);
                GL11.glTexSubImage2D(BQa.Z, n8, (int)c2, (int)b2, f2, (int)d2, NSa.U, aua.N, intBuffer);
            }
            d2 >>= vRa.d;
            c2 >>= vRa.d;
            ++n8;
            b2 >>= vRa.d;
            n9 = f2 >>= vRa.d;
        }
        intBuffer.clear();
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(int[] nArray, int n2, int n3) {
        void b2;
        int c2 = n3;
        int[] a2 = nArray;
        if (a2[uSa.E] >>> osa.c == osa.Ja && a2[(b2 *= c2) - vRa.d] == 0) {
            return vRa.d != 0;
        }
        int n4 = c2 = uSa.E;
        while (n4 < b2) {
            int n5 = a2[c2] >>> osa.c;
            if (n5 != 0 && n5 != osa.Ja) {
                return vRa.d != 0;
            }
            n4 = ++c2;
        }
        return uSa.E != 0;
    }

    public static void J(KLa kLa2, int[] object) {
        Object b2 = object;
        object = kLa2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Cb cb2, int[] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        void c2;
        void d2;
        void g2;
        void e2;
        void f2;
        boolean bl3 = bl2;
        Cb a2 = cb2;
        void b2 = f2 * e2;
        IntBuffer h2 = xb_2.J((int)b2);
        void v0 = g2;
        h2.clear();
        h2.put((int[])v0, uSa.E, (int)b2);
        h2.position(uSa.E).limit((int)b2);
        uKa.C((int)a2.I);
        GL11.glTexParameteri(BQa.Z, lQa.E, hqa.s);
        GL11.glTexParameteri(BQa.Z, wua.C, hqa.s);
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
        GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)d2, (int)c2, (int)f2, (int)e2, NSa.U, aua.N, h2);
        if (((void)v0).length == b2 * yRa.d) {
            h2.clear();
            void v1 = b2;
            h2.put((int[])g2, (int)v1, (int)v1).position(uSa.E);
            h2.position(uSa.E).limit((int)b2);
        }
        uKa.C((int)a2.A);
        GL11.glTexParameteri(BQa.Z, lQa.E, hqa.s);
        GL11.glTexParameteri(BQa.Z, wua.C, hqa.s);
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
        GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)d2, (int)c2, (int)f2, (int)e2, NSa.U, aua.N, h2);
        if (((void)g2).length == b2 * yRa.d) {
            h2.clear();
            h2.put((int[])g2, (int)(b2 * uqa.g), (int)b2);
            h2.position(uSa.E).limit((int)b2);
        }
        uKa.C((int)a2.J);
        GL11.glTexParameteri(BQa.Z, lQa.E, hqa.s);
        GL11.glTexParameteri(BQa.Z, wua.C, hqa.s);
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
        GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)d2, (int)c2, (int)f2, (int)e2, NSa.U, aua.N, h2);
        uKa.i((int)YSa.Ka);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, int n5, ula ula2, WKa wKa2) {
        Cb b2;
        void a2;
        void d2;
        void e2;
        int f2 = n5;
        int c2 = n2;
        zc.J(new StringBuilder().insert(3 & 4, yRa.U).append((int)e2).append(Tpa.E).append((int)d2).append(Tpa.E).append(f2).append(Tpa.E).toString());
        M = a2;
        a2.l = d2;
        a2.A = f2;
        e = b2 = xb_2.J((Rd)a2);
        gLa.J(b2.I, (int)e2, (int)d2, f2);
        if (pA.DA) {
            gLa.J(b2.A, (int)e2, (int)d2, f2);
        }
        if (pA.hA) {
            gLa.J(b2.J, (int)e2, (int)d2, f2);
        }
        uKa.C((int)c2);
    }

    public static String J(String a2) {
        m = a2;
        return m;
    }

    /*
     * WARNING - void declaration
     */
    public static ResourceLocation J(ResourceLocation resourceLocation, String string) {
        void a2;
        ResourceLocation resourceLocation2 = resourceLocation;
        String b2 = resourceLocation2.J().split(KPa.C)[uSa.E];
        return new ResourceLocation(resourceLocation2.f(), new StringBuilder().insert(2 & 5, b2).append(IPa.W).append((String)a2).append(KPa.C).toString());
    }

    public xb_2() {
        xb_2 a2;
    }

    public static H J() {
        VJa vJa2 = new VJa(vRa.d, vRa.d);
        vJa2.J()[uSa.E] = pua.o;
        vJa2.f();
        return vJa2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, VJa vJa2) {
        void b2;
        void c2;
        int d2;
        Cb a2;
        int n5 = n2;
        void v0 = a2;
        a2 = v0.J();
        int[] nArray = v0.J();
        int n6 = d2 = c2 * b2;
        Arrays.fill(nArray, n6, n6 * uqa.g, pua.F);
        Arrays.fill(nArray, d2 * uqa.g, d2 * yRa.d, uSa.E);
        Cb cb2 = a2;
        gLa.J(cb2.I, (int)c2, (int)b2);
        gLa.J(uSa.E != 0, uSa.E != 0);
        gLa.J(uSa.E != 0);
        gLa.J(cb2.A, (int)c2, (int)b2);
        gLa.J(uSa.E != 0, uSa.E != 0);
        gLa.J(uSa.E != 0);
        gLa.J(cb2.J, (int)c2, (int)b2);
        gLa.J(uSa.E != 0, uSa.E != 0);
        gLa.J(uSa.E != 0);
        uKa.C((int)cb2.I);
    }

    public static int[] f(int n2) {
        int n3 = n2;
        int[] a2 = new int[n3 * yRa.d];
        Arrays.fill(a2, uSa.E, n3, uSa.E);
        int n4 = n3;
        Arrays.fill(a2, n4, n4 * uqa.g, pua.F);
        Arrays.fill(a2, n3 * uqa.g, n3 * yRa.d, uSa.E);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, BufferedImage bufferedImage, boolean bl, boolean bl2, U u2, ResourceLocation resourceLocation, Cb cb2) {
        void d2;
        void e2;
        void a2;
        void b2;
        void c2;
        BufferedImage g22 = bufferedImage;
        int f2 = n2;
        BufferedImage bufferedImage2 = g22;
        int g22 = bufferedImage2.getWidth();
        int n3 = bufferedImage2.getHeight();
        int[] nArray = xb_2.J(g22 * n3 * yRa.d);
        bufferedImage2.getRGB(uSa.E, uSa.E, g22, n3, nArray, uSa.E, g22);
        xb_2.J((U)c2, (ResourceLocation)b2, g22, n3, nArray);
        xb_2.J((Cb)a2, nArray, g22, n3, (boolean)e2, (boolean)d2);
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    public static int f(int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        int d2 = n5;
        int a2 = n2;
        return ((a2 >>> osa.c & osa.Ja) + (c2 >>> osa.c & osa.Ja) + (b2 >>> osa.c & osa.Ja) + (d2 >>> osa.c & osa.Ja) + uqa.g) / AQa.P << osa.c | ((a2 >>> ERa.C & osa.Ja) + (c2 >>> ERa.C & osa.Ja) + (b2 >>> ERa.C & osa.Ja) + (d2 >>> ERa.C & osa.Ja) + uqa.g) / AQa.P << ERa.C | ((a2 >>> Yqa.i & osa.Ja) + (c2 >>> Yqa.i & osa.Ja) + (b2 >>> Yqa.i & osa.Ja) + (d2 >>> Yqa.i & osa.Ja) + uqa.g) / AQa.P << Yqa.i | ((a2 >>> uSa.E & osa.Ja) + (c2 >>> uSa.E & osa.Ja) + (b2 >>> uSa.E & osa.Ja) + (d2 >>> uSa.E & osa.Ja) + uqa.g) / AQa.P << uSa.E;
    }

    public static int[] J(int a2) {
        if (k == null) {
            k = new int[JPa.E];
        }
        if (k.length < a2) {
            k = new int[xb_2.J(a2)];
        }
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int[] nArray, int n3, int n4, VJa vJa2) {
        void b2;
        void c2;
        void d2;
        Cb e2;
        VJa vJa3 = vJa2;
        int a2 = n2;
        Cb cb2 = e2 = e2.J();
        void v1 = d2;
        uKa.C((int)e2.I);
        xb_2.J((int[])v1, (int)c2, (int)b2, uSa.E, uSa.E, uSa.E);
        uKa.C((int)e2.A);
        xb_2.J((int[])v1, (int)c2, (int)b2, uSa.E, uSa.E, vRa.d);
        uKa.C((int)cb2.J);
        xb_2.J((int[])d2, (int)c2, (int)b2, uSa.E, uSa.E, uqa.g);
        uKa.C((int)cb2.I);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Cb cb2, int[] nArray, int n2, int n3, boolean bl, boolean bl2) {
        void e2;
        void c2;
        void d2;
        int a2;
        int b2;
        Cb cb3 = cb2;
        b2 = b2 != 0 ? rSa.z : hqa.s;
        a2 = a2 != 0 ? Zua.o : kTa.o;
        void f2 = d2 * c2;
        IntBuffer intBuffer = xb_2.J((int)f2);
        intBuffer.clear();
        intBuffer.put((int[])e2, uSa.E, (int)f2).position(uSa.E).limit((int)f2);
        uKa.C((int)cb3.I);
        GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Ka, (int)d2, (int)c2, uSa.E, NSa.U, aua.N, intBuffer);
        GL11.glTexParameteri(BQa.Z, lQa.E, b2);
        GL11.glTexParameteri(BQa.Z, wua.C, b2);
        GL11.glTexParameteri(BQa.Z, LQa.P, a2);
        GL11.glTexParameteri(BQa.Z, pQa.n, a2);
        void v0 = f2;
        intBuffer.put((int[])e2, (int)v0, (int)v0).position(uSa.E).limit((int)f2);
        uKa.C((int)cb3.A);
        GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Ka, (int)d2, (int)c2, uSa.E, NSa.U, aua.N, intBuffer);
        GL11.glTexParameteri(BQa.Z, lQa.E, b2);
        GL11.glTexParameteri(BQa.Z, wua.C, b2);
        GL11.glTexParameteri(BQa.Z, LQa.P, a2);
        GL11.glTexParameteri(BQa.Z, pQa.n, a2);
        intBuffer.put((int[])e2, (int)(f2 * uqa.g), (int)f2).position(uSa.E).limit((int)f2);
        Cb cb4 = cb3;
        uKa.C((int)cb4.J);
        GL11.glTexImage2D(BQa.Z, uSa.E, rSa.Ka, (int)d2, (int)c2, uSa.E, NSa.U, aua.N, intBuffer);
        GL11.glTexParameteri(BQa.Z, lQa.E, b2);
        GL11.glTexParameteri(BQa.Z, wua.C, b2);
        GL11.glTexParameteri(BQa.Z, LQa.P, a2);
        GL11.glTexParameteri(BQa.Z, pQa.n, a2);
        uKa.C((int)cb4.I);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(U u2, ResourceLocation resourceLocation, int n2, int n3, int[] nArray, int n4, int n5) {
        void b2;
        void c2;
        void d2;
        void e2;
        Object g2 = resourceLocation;
        U f2 = u2;
        int n6 = uSa.E;
        try {
            g2 = ImageIO.read(f2.J((ResourceLocation)g2).J());
            if (g2 != null && ((BufferedImage)g2).getWidth() == e2 && ((BufferedImage)g2).getHeight() == d2) {
                ((BufferedImage)g2).getRGB(uSa.E, uSa.E, (int)e2, (int)d2, (int[])c2, (int)b2, (int)e2);
                n6 = vRa.d;
            }
        }
        catch (IOException iOException) {}
        if (n6 == 0) {
            void a2;
            void v1 = b2;
            Arrays.fill((int[])c2, (int)v1, (int)(v1 + e2 * d2), (int)a2);
        }
    }

    public static void J(H a2) {
        H h2 = a2;
        h2.J();
        if (h2 instanceof WKa) {
            pA.tC = ((WKa)((Object)a2)).l;
            pA.g = ((WKa)((Object)a2)).A;
            xb_2.f(a2.J());
            return;
        }
        pA.tC = uSa.E;
        pA.g = uSa.E;
        xb_2.f(a2.J());
    }

    public static void J() {
        H h2 = Kpa.J().J().J(WKa.C);
        if (h2 != null) {
            Cb cb2 = h2.J();
            uKa.C((int)cb2.I);
            GL11.glTexParameteri(BQa.Z, lQa.E, pA.aB[pA.s]);
            GL11.glTexParameteri(BQa.Z, wua.C, pA.ga[pA.wa]);
            uKa.C((int)cb2.A);
            GL11.glTexParameteri(BQa.Z, lQa.E, pA.aB[pA.ab]);
            GL11.glTexParameteri(BQa.Z, wua.C, pA.ga[pA.Ia]);
            uKa.C((int)cb2.J);
            GL11.glTexParameteri(BQa.Z, lQa.E, pA.aB[pA.JA]);
            GL11.glTexParameteri(BQa.Z, wua.C, pA.ga[pA.M]);
            uKa.C((int)uSa.E);
        }
    }

    public static void J(aJa aJa2, ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        aJa a2 = aJa2;
        WKa wKa2 = (WKa)((Object)a2.J((ResourceLocation)b2));
        pA.tC = wKa2.l;
        pA.g = wKa2.A;
        e = wKa2.J();
        xb_2.f(e);
    }

    public static void J(Cb a2) {
        Cb cb2 = a2;
        xb_2.J(cb2.A, cb2.J);
    }

    public static int f(int n2) {
        int n3 = n2;
        int a2 = uSa.E;
        if ((n3 & jsa.U) != 0) {
            a2 += 16;
            n3 >>= ERa.C;
        }
        if ((n3 & Uqa.Q) != 0) {
            a2 += 8;
            n3 >>= Yqa.i;
        }
        if ((n3 & YSa.c) != 0) {
            a2 += 4;
            n3 >>= AQa.P;
        }
        if ((n3 & uua.p) != 0) {
            a2 += 2;
            n3 >>= uqa.g;
        }
        if ((n3 & uqa.g) != 0) {
            ++a2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static int[] J(BufferedImage object, int n2, int n3, int n4, int n5, int[] nArray, int n6, int n7) {
        void a2;
        void b2;
        BufferedImage h2;
        void f2;
        void g2;
        void d2;
        void e2;
        BufferedImage bufferedImage = object;
        object = nArray;
        BufferedImage c2 = bufferedImage;
        D = e2 * d2;
        c2.getRGB((int)g2, (int)f2, (int)e2, (int)d2, (int[])h2, (int)b2, (int)a2);
        xb_2.J(L, j, (int)e2, (int)d2, (int[])h2);
        return h2;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] J(int[][] nArray, int n2, int n3, int n4) {
        int n5;
        int[][] nArray2 = nArray;
        int n6 = nArray2.length;
        int[][] nArrayArray = new int[n6][];
        int n7 = n5 = uSa.E;
        while (n7 < n6) {
            int[] nArray3 = nArray2[n5];
            if (nArray3 != null) {
                void a2;
                void b2;
                void c2;
                void var8_10 = (c2 >> n5) * (b2 >> n5);
                int[] nArray4 = new int[var8_10 * yRa.d];
                nArrayArray[n5] = nArray4;
                int n8 = nArray3.length / yRa.d;
                void var11_13 = var8_10 * a2;
                int d2 = uSa.E;
                int[] nArray5 = nArray3;
                System.arraycopy(nArray5, (int)var11_13, nArray4, d2, (int)var8_10);
                System.arraycopy(nArray3, (int)(var11_13 += n8), nArray4, d2 += var8_10, (int)var8_10);
                System.arraycopy(nArray5, (int)(var11_13 += n8), nArray4, d2 += var8_10, (int)var8_10);
            }
            n7 = ++n5;
        }
        return nArrayArray;
    }

    public static int J(int a2) {
        int n2 = a2 - vRa.d;
        int n3 = n2 | n2 >> vRa.d;
        int n4 = n3 | n3 >> uqa.g;
        int n5 = n4 | n4 >> AQa.P;
        int n6 = n5 | n5 >> Yqa.i;
        return (n6 | n6 >> ERa.C) + vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] J(int n2, int n3, int[][] nArray) {
        void a2;
        int c2;
        int n4 = n2;
        int n5 = c2 = vRa.d;
        while (n5 <= n4) {
            if (a2[c2] == null) {
                void b2;
                void var4_4 = b2 >> c2;
                void var5_5 = var4_4 * uqa.g;
                void v1 = a2;
                void var6_6 = v1[c2 - vRa.d];
                void v2 = var4_4;
                int[] nArray2 = new int[v2 * v2];
                v1[c2] = nArray2;
                int[] nArray3 = nArray2;
                int n6 = uSa.E;
                while (n6 < var4_4) {
                    int n7;
                    int n8 = uSa.E;
                    while (n8 < var4_4) {
                        int n9;
                        int n10 = n7 * uqa.g * var5_5 + n9 * uqa.g;
                        int n11 = n7 * var4_4 + n9;
                        nArray3[n11] = xb_2.f((int)var6_6[n10], (int)var6_6[n10 + vRa.d], (int)var6_6[n10 + var5_5], (int)var6_6[n10 + var5_5 + vRa.d]);
                        n8 = ++n9;
                    }
                    n6 = ++n7;
                }
            }
            n5 = ++c2;
        }
        return a2;
    }

    public static IntBuffer J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        xb_2.J(a2);
        xb_2.J(a2);
        Arrays.fill(k, uSa.E, a2, b2);
        A.put(k, uSa.E, a2);
        return A;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[] nArray, int n2, int n3, int n4, int n5) {
        void c2;
        int e2 = n2;
        int[] d2 = nArray;
        int n6 = uSa.E;
        int n7 = e2;
        while (n7 > 0 && c2 > 0) {
            void a2;
            void b2;
            GL11.glCopyTexSubImage2D(BQa.Z, n6++, (int)b2, (int)a2, uSa.E, uSa.E, e2, (int)c2);
            c2 /= uqa.g;
            b2 /= uqa.g;
            a2 /= uqa.g;
            n7 = e2 /= uqa.g;
        }
    }

    public static BufferedImage J(ResourceLocation resourceLocation) {
        InputStream a22;
        block5: {
            ResourceLocation resourceLocation2;
            block4: {
                resourceLocation2 = resourceLocation;
                try {
                    if (Config.f(resourceLocation2)) break block4;
                    return null;
                }
                catch (IOException a22) {
                    return null;
                }
            }
            a22 = Config.J(resourceLocation2);
            if (a22 != null) break block5;
            return null;
        }
        Object object = a22;
        BufferedImage bufferedImage = ImageIO.read((InputStream)object);
        ((InputStream)object).close();
        return bufferedImage;
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] J(String string, int n2, int n3, int n4, boolean bl, int n5) {
        void d22;
        void e2;
        int f22 = n4;
        String c2 = string;
        int[][] nArrayArray = new int[f22][];
        Object f22 = nArrayArray;
        int[] d22 = new int[e2 * d22];
        nArrayArray[uSa.E] = d22;
        int n6 = uSa.E;
        BufferedImage bufferedImage = xb_2.J(M.J(new ResourceLocation(c2), uSa.E));
        if (bufferedImage != null) {
            void b2;
            BufferedImage bufferedImage2 = bufferedImage;
            int n7 = bufferedImage2.getWidth();
            bufferedImage2.getHeight();
            if (n7 + (b2 != false ? ERa.C : uSa.E) == e2) {
                n6 = vRa.d;
                int n8 = n7;
                bufferedImage.getRGB(uSa.E, uSa.E, n8, n8, d22, uSa.E, n8);
            }
        }
        if (n6 == 0) {
            void a2;
            Arrays.fill(d22, (int)a2);
        }
        uKa.C((int)xb_2.e.J);
        int[][] nArray = xb_2.J(((int[][])f22).length - vRa.d, (int)e2, f22);
        f22 = nArray;
        return nArray;
    }

    public static KLa J(KLa a2) {
        i = a2;
        return i;
    }

    /*
     * WARNING - void declaration
     */
    public static int[] J(int n2, int n3) {
        void a2;
        int n4 = n2;
        int[] b2 = new int[n4 * yRa.d];
        Arrays.fill(b2, uSa.E, n4, (int)a2);
        int n5 = n4;
        Arrays.fill(b2, n5, n5 * uqa.g, pua.F);
        Arrays.fill(b2, n4 * uqa.g, n4 * yRa.d, uSa.E);
        return b2;
    }

    public static int[][] J(KLa kLa2, int[][] nArray, int n2, int n3) {
        Object d2 = nArray;
        KLa c2 = kLa2;
        return d2;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4) {
        void b2;
        void a2;
        int n5 = n2;
        int c2 = osa.Ja - a2;
        return ((n5 >>> osa.c & osa.Ja) * a2 + (b2 >>> osa.c & osa.Ja) * c2) / osa.Ja << osa.c | ((n5 >>> ERa.C & osa.Ja) * a2 + (b2 >>> ERa.C & osa.Ja) * c2) / osa.Ja << ERa.C | ((n5 >>> Yqa.i & osa.Ja) * a2 + (b2 >>> Yqa.i & osa.Ja) * c2) / osa.Ja << Yqa.i | ((n5 >>> uSa.E & osa.Ja) * a2 + (b2 >>> uSa.E & osa.Ja) * c2) / osa.Ja << uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int c2;
        void a2;
        void b2;
        int[] nArray2 = nArray;
        Math.min((int)b2, (int)a2);
        int d2 = b2;
        int n8 = a2;
        int n9 = uSa.E;
        int n10 = uSa.E;
        int n11 = uSa.E;
        int n12 = uSa.E;
        int n13 = d2;
        while (n13 > vRa.d && n8 > vRa.d) {
            n9 = c2 + d2 * n8;
            n10 = d2 / uqa.g;
            n11 = n8 / uqa.g;
            int n14 = uSa.E;
            while (n14 < n11) {
                n6 = n9 + n7 * n10;
                n5 = c2 + n7 * uqa.g * d2;
                int n15 = uSa.E;
                while (n15 < n10) {
                    int n16;
                    nArray2[n6 + ++n16] = xb_2.J(nArray2[n5 + n16 * uqa.g], nArray2[n5 + n16 * uqa.g + vRa.d], nArray2[n5 + d2 + n16 * uqa.g], nArray2[n5 + d2 + n16 * uqa.g + vRa.d]);
                    n15 = n16;
                }
                n14 = ++n7;
            }
            ++n12;
            d2 = n10;
            n8 = n11;
            c2 = n9;
            n13 = d2;
        }
        int n17 = n12;
        while (n17 > 0) {
            d2 = b2 >> --n12;
            n8 = a2 >> n12;
            n7 = c2 = n9 - d2 * n8;
            int n18 = uSa.E;
            while (n18 < n8) {
                int n19 = uSa.E;
                while (n19 < d2) {
                    if (nArray2[n7] == 0) {
                        nArray2[n7] = nArray2[n9 + n6 / uqa.g * n10 + n5 / uqa.g] & Wsa.K;
                    }
                    ++n7;
                    n19 = ++n5;
                }
                n18 = ++n6;
            }
            n9 = c2;
            n10 = d2;
            n17 = n12;
        }
    }

    public static Cb J(Rd rd2) {
        Rd rd3 = rd2;
        Rd a2 = rd3.multiTex;
        if (a2 == null) {
            int n2 = rd3.J();
            a2 = G.get(n2);
            if (a2 == null) {
                a2 = new Cb(n2, GL11.glGenTextures(), GL11.glGenTextures());
                G.put(n2, (Cb)a2);
            }
            rd3.multiTex = a2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4) {
        int c2 = n4;
        int a2 = n2;
        if (pA.pd && uKa.l() == YSa.Ka) {
            void b2;
            uKa.i((int)qsa.L);
            uKa.C((int)b2);
            uKa.i((int)cra.d);
            uKa.C((int)c2);
            uKa.i((int)YSa.Ka);
        }
        uKa.C((int)a2);
    }

    static {
        f = BufferUtils.createByteBuffer(APa.Aa);
        A = f.asIntBuffer();
        k = new int[JPa.E];
        G = new HashMap<Integer, Cb>();
        M = null;
        i = null;
        e = null;
        C = null;
        E = uSa.E;
        m = null;
        L = null;
        j = null;
        D = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        void a2;
        void b2;
        void c2;
        int n8 = n2;
        int n9 = n8 >>> osa.c & osa.Ja;
        int n10 = c2 >>> osa.c & osa.Ja;
        int n11 = b2 >>> osa.c & osa.Ja;
        int n12 = a2 >>> osa.c & osa.Ja;
        int d2 = n9 + n10 + n11 + n12;
        int n13 = (d2 + uqa.g) / AQa.P;
        if (d2 != 0) {
            n6 = n7 = d2;
        } else {
            n7 = AQa.P;
            n9 = vRa.d;
            n10 = vRa.d;
            n11 = vRa.d;
            n12 = vRa.d;
            n6 = n7;
        }
        d2 = (n6 + vRa.d) / uqa.g;
        return n13 << osa.c | ((n8 >>> ERa.C & osa.Ja) * n9 + (c2 >>> ERa.C & osa.Ja) * n10 + (b2 >>> ERa.C & osa.Ja) * n11 + (a2 >>> ERa.C & osa.Ja) * n12 + d2) / n7 << ERa.C | ((n8 >>> Yqa.i & osa.Ja) * n9 + (c2 >>> Yqa.i & osa.Ja) * n10 + (b2 >>> Yqa.i & osa.Ja) * n11 + (a2 >>> Yqa.i & osa.Ja) * n12 + d2) / n7 << Yqa.i | ((n8 >>> uSa.E & osa.Ja) * n9 + (c2 >>> uSa.E & osa.Ja) * n10 + (b2 >>> uSa.E & osa.Ja) * n11 + (a2 >>> uSa.E & osa.Ja) * n12 + d2) / n7 << uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Aka aka2, U u2, List list) {
        Iterator a2;
        Aka aka3 = aka2;
        int n2 = uSa.E;
        int n3 = uSa.E;
        int n4 = uSa.E;
        int[] nArray = null;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            Object object = a2.next();
            if (object == null) continue;
            try {
                void b2;
                object = new ResourceLocation((String)object);
                BufferedImage c22 = ImageIO.read(b2.J(object).J());
                if (n4 == 0) {
                    BufferedImage bufferedImage = c22;
                    n2 = bufferedImage.getWidth();
                    n3 = bufferedImage.getHeight();
                    n4 = n2 * n3;
                    nArray = xb_2.J(n4, uSa.E);
                }
                int[] nArray2 = xb_2.J(n4 * yRa.d);
                c22.getRGB(uSa.E, uSa.E, n2, n3, nArray2, uSa.E, n2);
                xb_2.J((U)b2, object, n2, n3, nArray2);
                int c22 = uSa.E;
                while (c22 < n4) {
                    int n5 = nArray2[c22] >>> osa.c & osa.Ja;
                    int n6 = n4;
                    nArray[n4 * uSa.E + c22] = xb_2.J(nArray2[n4 * uSa.E + c22], nArray[n4 * uSa.E + c22], n5);
                    nArray[n6 * vRa.d + c22] = xb_2.J(nArray2[n4 * vRa.d + c22], nArray[n4 * vRa.d + c22], n5);
                    nArray[n6 * uqa.g + ++c22] = xb_2.J(nArray2[n4 * uqa.g + c22], nArray[n4 * uqa.g + c22], n5);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        xb_2.J(aka3.J(), nArray, n2, n3, uSa.E != 0, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int c2;
        void a2;
        void b2;
        int[] nArray2 = nArray;
        Math.min((int)b2, (int)a2);
        int d2 = b2;
        int n8 = a2;
        int n9 = uSa.E;
        int n10 = uSa.E;
        int n11 = uSa.E;
        int n12 = uSa.E;
        int n13 = d2;
        while (n13 > vRa.d && n8 > vRa.d) {
            n9 = c2 + d2 * n8;
            n10 = d2 / uqa.g;
            n11 = n8 / uqa.g;
            int n14 = uSa.E;
            while (n14 < n11) {
                n6 = n9 + n7 * n10;
                n5 = c2 + n7 * uqa.g * d2;
                int n15 = uSa.E;
                while (n15 < n10) {
                    int n16;
                    nArray2[n6 + ++n16] = xb_2.f(nArray2[n5 + n16 * uqa.g], nArray2[n5 + n16 * uqa.g + vRa.d], nArray2[n5 + d2 + n16 * uqa.g], nArray2[n5 + d2 + n16 * uqa.g + vRa.d]);
                    n15 = n16;
                }
                n14 = ++n7;
            }
            ++n12;
            d2 = n10;
            n8 = n11;
            c2 = n9;
            n13 = d2;
        }
        int n17 = n12;
        while (n17 > 0) {
            d2 = b2 >> --n12;
            n8 = a2 >> n12;
            n7 = c2 = n9 - d2 * n8;
            int n18 = uSa.E;
            while (n18 < n8) {
                int n19 = uSa.E;
                while (n19 < d2) {
                    if (nArray2[n7] == 0) {
                        nArray2[n7] = nArray2[n9 + n6 / uqa.g * n10 + n5 / uqa.g] & Wsa.K;
                    }
                    ++n7;
                    n19 = ++n5;
                }
                n18 = ++n6;
            }
            n9 = c2;
            n10 = d2;
            n17 = n12;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        void a2;
        void b2;
        void g2;
        void d2;
        void e2;
        void f2;
        int n6 = n5;
        int[][] c2 = nArray;
        gLa.J(c2, (int)f2, (int)e2, (int)d2, (int)g2, (boolean)b2, (boolean)a2);
        if (pA.DA || pA.hA) {
            if (pA.DA) {
                uKa.C((int)xb_2.e.A);
                xb_2.J(c2, (int)f2, (int)e2, (int)d2, (int)g2, vRa.d);
            }
            if (pA.hA) {
                uKa.C((int)xb_2.e.J);
                xb_2.J(c2, (int)f2, (int)e2, (int)d2, (int)g2, uqa.g);
            }
            uKa.C((int)xb_2.e.I);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Rd rd2, int n2) {
        Rd rd3 = rd2;
        Rd b2 = rd3.multiTex;
        if (b2 != null) {
            void a2;
            rd3.multiTex = null;
            Rd rd4 = b2;
            G.remove(b2.I);
            uKa.D((int)rd4.A);
            uKa.D((int)rd4.J);
            if (rd4.I != a2) {
                zc.C(new StringBuilder().insert(5 >> 3, uSa.t).append(b2.I).append(Asa.ga).append((int)a2).toString());
                uKa.D((int)b2.I);
            }
        }
    }

    public static void J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (pA.pd && uKa.l() == YSa.Ka) {
            uKa.i((int)qsa.L);
            uKa.C((int)a2);
            uKa.i((int)cra.d);
            uKa.C((int)b2);
            uKa.i((int)YSa.Ka);
        }
    }
}

