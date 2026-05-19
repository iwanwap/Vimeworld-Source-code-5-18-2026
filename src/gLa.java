/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  HF
 *  JPa
 *  Kpa
 *  LQa
 *  NPa
 *  NQa
 *  Pqa
 *  SQa
 *  Tpa
 *  U
 *  VJa
 *  XTa
 *  Zpa
 *  hqa
 *  kta
 *  lPa
 *  pPa
 *  pQa
 *  pqa
 *  uKa
 *  vRa
 *  xJa
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gLa {
    private static final int[] M;
    private static final String k = "CL_00001067";
    public static final int[] j;
    public static final VJa J;
    private static final Logger A;
    private static final IntBuffer I;

    /*
     * WARNING - void declaration
     */
    public static void f(int[] nArray, int n2, int n3) {
        int n4;
        void a2;
        int c2 = n2;
        int[] b2 = nArray;
        int[] nArray2 = new int[c2];
        void var4_6 = a2 / uqa.g;
        int n5 = n4 = uSa.E;
        while (n5 < var4_6) {
            System.arraycopy(b2, n4 * c2, nArray2, uSa.E, c2);
            System.arraycopy(b2, (int)((a2 - vRa.d - n4) * c2), b2, n4 * c2, c2);
            void v1 = a2 - vRa.d - n4;
            System.arraycopy(nArray2, uSa.E, b2, (int)(v1 * c2), c2);
            n5 = ++n4;
        }
    }

    public static int J(int n2) {
        int n3 = n2;
        int n4 = n3 >> osa.c & osa.Ja;
        int a2 = n3 >> ERa.C & osa.Ja;
        int n5 = n3 >> Yqa.i & osa.Ja;
        int n6 = n3 & osa.Ja;
        int n7 = (a2 * Fsa.d + n5 * lPa.p + n6 * pPa.f) / ySa.T;
        n5 = (a2 * Fsa.d + n5 * NPa.e) / ySa.T;
        a2 = (a2 * Fsa.d + n6 * NPa.e) / ySa.T;
        return n4 << osa.c | n7 << ERa.C | n5 << Yqa.i | a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        int a2;
        int b2;
        BufferedImage bufferedImage2;
        BufferedImage bufferedImage3 = bufferedImage2 = bufferedImage;
        int e2 = bufferedImage3.getWidth();
        int n4 = bufferedImage3.getHeight();
        int n5 = APa.Aa / e2;
        int[] nArray = new int[n5 * e2];
        gLa.f(b2 != 0);
        gLa.J(a2 != 0);
        int n6 = b2 = uSa.E;
        while (n6 < e2 * n4) {
            void c2;
            void d2;
            a2 = b2 / e2;
            int n7 = Math.min(n5, n4 - a2);
            int n8 = e2 * n7;
            bufferedImage2.getRGB(uSa.E, a2, e2, n7, nArray, uSa.E, e2);
            gLa.J(nArray, n8);
            GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)d2, (int)(c2 + a2), e2, n7, NSa.U, aua.N, I);
            n6 = b2 += e2 * n5;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, int[] nArray, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        void f2;
        int b2;
        int a2;
        int c2;
        int i2 = n3;
        int g2 = n2;
        int n7 = APa.Aa / i2;
        gLa.J(c2 != 0, a2 != 0);
        gLa.J(b2 != 0);
        int n8 = b2 = uSa.E;
        while (n8 < i2 * f2) {
            void d2;
            void e2;
            void h;
            a2 = b2 / i2;
            c2 = Math.min(n7, (int)(f2 - a2));
            int n9 = i2 * c2;
            int n10 = b2;
            gLa.J((int[])h, n10, n9);
            GL11.glTexSubImage2D(BQa.Z, g2, (int)e2, (int)(d2 + a2), i2, c2, NSa.U, aua.N, I);
            n8 = n10 + i2 * c2;
        }
    }

    private static void f(boolean a2) {
        gLa.J(a2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static int[][] J(int n2, int n3, int[][] nArray) {
        void a2;
        int n4 = n2;
        int[][] nArrayArray = new int[n4 + vRa.d][];
        nArrayArray[uSa.E] = a2[uSa.E];
        if (n4 > 0) {
            boolean bl;
            int c2;
            int bl2 = uSa.E;
            int n5 = c2 = uSa.E;
            while (n5 < ((void)a2).length) {
                if (a2[uSa.E][c2] >> osa.c == false) {
                    bl = vRa.d;
                    break;
                }
                n5 = ++c2;
            }
            int n6 = c2 = vRa.d;
            while (n6 <= n4) {
                int[][] nArrayArray2 = nArrayArray;
                if (a2[c2] != null) {
                    int n7 = c2;
                    nArrayArray2[n7] = a2[n7];
                } else {
                    void b2;
                    int[] nArray2 = nArrayArray2[c2 - vRa.d];
                    int[] nArray3 = new int[nArray2.length >> uqa.g];
                    void var8_9 = b2 >> c2;
                    int n8 = nArray3.length / var8_9;
                    void var10_11 = var8_9 << vRa.d;
                    int n9 = uSa.E;
                    while (n9 < var8_9) {
                        int n10;
                        int n11 = uSa.E;
                        while (n11 < n8) {
                            int n12;
                            int n13 = uqa.g * (n10 + n12 * var10_11);
                            int n14 = n10 + n12 * var8_9;
                            nArray3[n14] = gLa.J(nArray2[n13 + uSa.E], nArray2[n13 + vRa.d], nArray2[n13 + uSa.E + var10_11], nArray2[n13 + vRa.d + var10_11], bl);
                            n11 = ++n12;
                        }
                        n9 = ++n10;
                    }
                    nArrayArray[c2] = nArray3;
                }
                n6 = ++c2;
            }
        }
        return nArrayArray;
    }

    public static void J(boolean a2) {
        if (a2) {
            GL11.glTexParameteri(BQa.Z, LQa.P, Zpa.p);
            GL11.glTexParameteri(BQa.Z, pQa.n, Zpa.p);
            return;
        }
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int[] nArray, int n3, int n4, int n5, int n6) {
        int f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n7 = n2;
        n2 = n6;
        int a2 = n7;
        gLa.f(a2);
        void v1 = e2;
        gLa.J((int[])v1, ((void)v1).length);
        GL11.glTexSubImage2D(BQa.Z, uSa.E, (int)d2, (int)c2, (int)b2, f2, NSa.U, aua.N, I);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(boolean bl, boolean bl2) {
        void a2;
        boolean bl3 = bl;
        if (bl3) {
            GL11.glTexParameteri(BQa.Z, lQa.E, a2 != false ? ITa.n : rSa.z);
            GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
            return;
        }
        int b2 = Config.l();
        GL11.glTexParameteri(BQa.Z, lQa.E, a2 != false ? b2 : hqa.s);
        GL11.glTexParameteri(BQa.Z, wua.C, hqa.s);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, int n5) {
        int n6 = n2;
        Class<gLa> d2 = gLa.class;
        synchronized (gLa.class) {
            void c2;
            gLa.J(n6);
            gLa.f(n6);
            // ** MonitorExit[d] (shouldn't be in output)
            if (c2 >= 0) {
                GL11.glTexParameteri(BQa.Z, sOa.K, (int)c2);
                GL11.glTexParameterf(BQa.Z, Tpa.ja, JPa.N);
                GL11.glTexParameterf(BQa.Z, JPa.M, (float)c2);
                GL11.glTexParameterf(BQa.Z, Bta.N, JPa.N);
            }
            int n7 = d2 = uSa.E;
            while (n7 <= c2) {
                void b2;
                void a2;
                int n8 = d2;
                void v2 = a2 >> d2;
                GL11.glTexImage2D(BQa.Z, n8, rSa.Ka, (int)(b2 >> n8), (int)v2, uSa.E, NSa.U, aua.N, (IntBuffer)null);
                n7 = ++d2;
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, int n2, int n3, int n4, int n5) {
        void c2;
        int e2 = n2;
        String d2 = string;
        gLa.f(e2);
        GL11.glPixelStorei(Pqa.J, vRa.d);
        GL11.glPixelStorei(zua.j, vRa.d);
        int n6 = e2 = uSa.E;
        while (n6 <= c2) {
            void a2;
            void b2;
            File file = new File(new StringBuilder().insert(3 & 4, d2).append(IPa.W).append(e2).append(KPa.C).toString());
            void var6_9 = b2 >> e2;
            void var7_10 = a2 >> e2;
            void var8_12 = var6_9 * var7_10;
            Object object = BufferUtils.createIntBuffer((int)var8_12);
            int[] nArray = new int[var8_12];
            GL11.glGetTexImage(BQa.Z, e2, NSa.U, aua.N, (IntBuffer)object);
            ((IntBuffer)object).get(nArray);
            object = new BufferedImage((int)var6_9, (int)var7_10, uqa.g);
            ((BufferedImage)object).setRGB(uSa.E, uSa.E, (int)var6_9, (int)var7_10, nArray, uSa.E, (int)var6_9);
            try {
                ImageIO.write((RenderedImage)object, GPa.l, file);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = file.getAbsolutePath();
                A.debug(xSa.s, objectArray);
            }
            catch (Exception exception) {
                A.debug(kta.r, (Throwable)exception);
            }
            n6 = ++e2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        gLa.J(a2, uSa.E, (int)b2, c2);
    }

    public static void f(int a2) {
        uKa.C((int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        void a2;
        void b2;
        BufferedImage d2 = bufferedImage;
        int c2 = n2;
        gLa.J(c2, d2.getWidth(), d2.getHeight());
        return gLa.J(c2, d2, uSa.E, uSa.E, (boolean)b2, (boolean)a2);
    }

    public gLa() {
        gLa a2;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, int n3, int n4, int n5, boolean bl) {
        void c2;
        void d2;
        int e2 = n5;
        int b2 = n2;
        return HF.J((int)b2, (int)d2, (int)c2, (int)e2);
    }

    public static void J(int a2) {
        uKa.D((int)a2);
    }

    public static int[] J(U u2, ResourceLocation resourceLocation) throws IOException {
        Object b22 = resourceLocation;
        U a2 = u2;
        if ((b22 = gLa.J(a2.J((ResourceLocation)b22).J())) == null) {
            return null;
        }
        Object object = b22;
        int b22 = ((BufferedImage)object).getWidth();
        int n2 = ((BufferedImage)object).getHeight();
        int[] nArray = new int[b22 * n2];
        ((BufferedImage)object).getRGB(uSa.E, uSa.E, b22, n2, nArray, uSa.E, b22);
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[] nArray, int n2, int n3) {
        void a2;
        void b2;
        int[] nArray2;
        int[] c2 = nArray2 = nArray;
        if (Kpa.J().z.B) {
            c2 = gLa.J(nArray2);
        }
        I.clear();
        I.put(c2, (int)b2, (int)a2);
        I.position(uSa.E).limit((int)a2);
    }

    public static void J(int[] nArray, int n2) {
        int b2 = n2;
        int[] a2 = nArray;
        gLa.J(a2, uSa.E, b2);
    }

    public static int[] J(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[nArray2.length];
        int n2 = a2 = uSa.E;
        while (n2 < nArray2.length) {
            int n3 = a2++;
            nArray3[n3] = gLa.J(nArray2[n3]);
            n2 = a2;
        }
        return nArray3;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int[] nArray, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        int a2 = n2;
        gLa.f(a2);
        gLa.J(uSa.E, (int[])c2, (int)b2, d2, uSa.E, uSa.E, uSa.E != 0, uSa.E != 0, uSa.E != 0);
    }

    public static int J() {
        return uKa.J();
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl, boolean bl2) {
        int f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n5 = n2;
        n2 = bl2 ? 1 : 0;
        int a2 = n5;
        gLa.f(a2);
        gLa.J((BufferedImage)e2, (int)d2, (int)c2, (boolean)b2, f2 != 0);
        return a2;
    }

    static {
        int n2;
        A = LogManager.getLogger();
        I = xJa.J((int)APa.Aa);
        J = new VJa(ERa.C, ERa.C);
        j = J.J();
        int[] nArray = new int[Yqa.i];
        nArray[uSa.E] = SQa.L;
        nArray[vRa.d] = SQa.L;
        nArray[uqa.g] = SQa.L;
        nArray[yRa.d] = SQa.L;
        nArray[AQa.P] = SQa.L;
        nArray[tTa.h] = SQa.L;
        nArray[uua.p] = SQa.L;
        nArray[XTa.W] = SQa.L;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[Yqa.i];
        nArray3[uSa.E] = gsa.X;
        nArray3[vRa.d] = gsa.X;
        nArray3[uqa.g] = gsa.X;
        nArray3[yRa.d] = gsa.X;
        nArray3[AQa.P] = gsa.X;
        nArray3[tTa.h] = gsa.X;
        nArray3[uua.p] = gsa.X;
        nArray3[XTa.W] = gsa.X;
        int[] nArray4 = nArray3;
        int n3 = nArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < ERa.C) {
            System.arraycopy(n2 < n3 ? nArray2 : nArray4, uSa.E, j, ERa.C * n2, n3);
            int[] nArray5 = n2 < n3 ? nArray4 : nArray2;
            int n5 = ERa.C * n2;
            System.arraycopy(nArray5, uSa.E, j, n5 + n3, n3);
            n4 = ++n2;
        }
        J.f();
        M = new int[AQa.P];
    }

    public static int J(int n2, BufferedImage bufferedImage) {
        BufferedImage b2 = bufferedImage;
        int a2 = n2;
        return gLa.J(a2, b2, uSa.E != 0, uSa.E != 0);
    }

    public static BufferedImage J(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        if (inputStream2 == null) {
            return null;
        }
        try {
            BufferedImage a2 = ImageIO.read(inputStream2);
            return a2;
        }
        finally {
            IOUtils.closeQuietly(inputStream2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        int g2;
        int[][] nArray2 = nArray;
        int n6 = g2 = uSa.E;
        while (n6 < nArray2.length) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            void f2;
            int n7 = g2;
            gLa.J(n7, nArray2[g2], (int)(f2 >> n7), (int)(e2 >> g2), (int)(d2 >> g2), (int)(c2 >> g2), (boolean)b2, (boolean)a2, (nArray2.length > vRa.d ? vRa.d : uSa.E) != 0);
            n6 = ++g2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, int n3, int n4, int n5, int n6) {
        void b22;
        void c22;
        void d22;
        int e2;
        int n7 = n2;
        n2 = n6;
        int a2 = n7;
        float f2 = (float)Math.pow((float)(a2 >> e2 & osa.Ja) / NQa.Y, Jta.ja);
        float d22 = (float)Math.pow((float)(d22 >> e2 & osa.Ja) / NQa.Y, Jta.ja);
        float c22 = (float)Math.pow((float)(c22 >> e2 & osa.Ja) / NQa.Y, Jta.ja);
        float b22 = (float)Math.pow((float)(b22 >> e2 & osa.Ja) / NQa.Y, Jta.ja);
        return (int)((double)((float)Math.pow((double)(f2 + d22 + c22 + b22) * VPa.W, rRa.L)) * pqa.o);
    }
}

