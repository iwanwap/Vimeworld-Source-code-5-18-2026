/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  C
 *  EE
 *  ERa
 *  FE
 *  FTa
 *  JSa
 *  Jg
 *  Jja
 *  Kpa
 *  Me
 *  NA
 *  NOa
 *  NQa
 *  OE
 *  Oz
 *  Pqa
 *  RQa
 *  SQa
 *  SRa
 *  Se
 *  Spa
 *  U
 *  Uqa
 *  VQa
 *  Vua
 *  WSa
 *  XE
 *  YSa
 *  Yra
 *  ZRa
 *  aPa
 *  cRa
 *  fE
 *  hqa
 *  hra
 *  j
 *  jg
 *  lPa
 *  pQa
 *  pe
 *  pua
 *  uKa
 *  uOa
 *  vRa
 *  wf
 *  xJa
 *  yQa
 */
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cg_3 {
    public static final String Oa = "minecraft:blocks/";
    public static final String Qa = "log_acacia_top";
    public static KLa Va;
    public static final String Sa = "leaves_spruce";
    public static final String Ta = "bedrock";
    public static final String Xa = "leaves_acacia";
    public static final String qa = "netherrack";
    public static final String za = "grass_side";
    public static final String ma = "minecraft:items/";
    public static final String La = "end_stone";
    public static final String ka = "compass";
    public static final String da = "lava_still";
    public static final String Ba = "coal_ore";
    public static final String aa = "log_spruce";
    public static final String ea = "coarse_dirt";
    public static KLa Ea;
    public static final String Ca = "stone_slab_top";
    public static final String ia = "log_jungle_top";
    public static KLa Ma;
    public static final String ba = "redstone_lamp_off";
    public static final String ha = "glass_pane_top";
    public static final String Fa = "grass_side_snowed";
    public static final String Ia = "redstone_ore";
    public static final String la = "log_oak_top";
    public static final String ga = "glass";
    public static final String Da = "leaves_jungle";
    public static final String ca = "leaves_birch";
    public static final String Ja = "mycelium_side";
    public static KLa ja;
    public static final String Ha = "leaves_big_oak";
    public static KLa Ga;
    public static final String fa = "cactus_side";
    public static final String Ka = "diamond_ore";
    public static KLa Aa;
    public static KLa S;
    public static final String Z = "gold_ore";
    public static final String Y = "mycelium_top";
    public static final String r = "grass_top";
    public static KLa V;
    public static final String z = "log_birch_top";
    public static final String X = "sand";
    public static final String y = "iron_ore";
    public static final String U = "log_acacia";
    public static final String P = "fire_layer_1";
    public static final String u = "obsidian";
    public static final String O = "log_birch";
    public static final String t = "log_jungle";
    public static KLa R;
    public static final String Q = "log_big_oak_top";
    public static KLa N;
    public static final String T = "log_big_oak";
    public static final String p = "clock";
    public static final String n = "leaves_spruce_opaque";
    public static final String s = "log_spruce_top";
    public static final String w = "sandstone_top";
    public static KLa W;
    public static final String q = "sandstone_bottom";
    public static final String x = "dirt";
    private static IntBuffer v;
    public static final String o = "farmland_wet";
    public static final String h = "fire_layer_0";
    public static final String K = "snow";
    public static final String H = "stone_slab_side";
    public static KLa c;
    public static KLa B;
    public static final String d = "lapis_ore";
    public static KLa a;
    public static KLa b;
    public static KLa l;
    public static final String e = "water_flow";
    public static final String G = "water_still";
    public static KLa D;
    public static final String f = "stone";
    public static final String F = "redstone_lamp_on";
    public static final String g = "log_oak";
    public static final String L = "portal";
    public static final String E = "leaves_oak";
    public static final String m = "leaves_spruce";
    public static final String C = "lava_flow";
    public static final String i = "soul_sand";
    public static final String M = "gravel";
    public static final String k = "grass_side_overlay";
    public static final String j = "clay";
    public static final String J = "farmland_dry";
    public static final String A = "glowstone";
    public static KLa I;

    public Cg_3() {
        Cg_3 a2;
    }

    public static boolean J(int a2) {
        if (Oz.C((int)a2) == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void l() {
        Object object;
        NA nA2;
        U u2 = Config.J();
        if (u2 instanceof NA) {
            nA2 = (NA)u2;
            object = new wf();
            nA2.J((j)object);
        }
        nA2 = new fE();
        object = new ResourceLocation(cTa.o);
        Config.J().J((ResourceLocation)object, (C)nA2);
    }

    public static int l(int n2) {
        int a2;
        int n3 = n2;
        int n4 = a2 = vRa.d;
        while (n4 < n3) {
            n4 = a2 * uqa.g;
        }
        return a2;
    }

    static {
        v = xJa.J((int)hra.Ja);
    }

    public static BufferedImage l(BufferedImage bufferedImage, int n2) {
        int b2 = n2;
        BufferedImage a2 = bufferedImage;
        if (a2 == null) {
            return a2;
        }
        BufferedImage bufferedImage2 = a2;
        int n3 = bufferedImage2.getWidth();
        int n4 = bufferedImage2.getHeight();
        b2 = Math.max(n3, b2);
        if ((b2 = Oz.C((int)b2)) == n3) {
            return a2;
        }
        n4 = n4 * b2 / n3;
        BufferedImage bufferedImage3 = new BufferedImage(b2, n4, uqa.g);
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (b2 % n3 != 0) {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D.drawImage(a2, uSa.E, uSa.E, b2, n4, null);
        return bufferedImage3;
    }

    public static int f(int n2) {
        int n3 = n2;
        int a2 = vRa.d;
        int n4 = uSa.E;
        int n5 = a2;
        while (n5 < n3) {
            ++n4;
            n5 = a2 *= uqa.g;
        }
        return n4;
    }

    public static H J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        Object a2 = Config.J().J(resourceLocation2);
        if (a2 != null) {
            return a2;
        }
        if (!Config.f(resourceLocation2)) {
            return null;
        }
        a2 = new Jja(resourceLocation2);
        Config.J().J(resourceLocation2, (H)a2);
        return a2;
    }

    public static void J(KLa kLa2) {
        int a2;
        KLa kLa3 = kLa2;
        int[][] nArray = kLa3.J(uSa.E);
        int n2 = a2 = uSa.E;
        while (n2 < nArray.length) {
            int[] nArray2 = nArray[a2];
            if (nArray2 == null) {
                Config.f(new StringBuilder().insert(2 & 5, Mqa.y).append(a2).append(Xpa.E).append(nArray2).toString());
            } else {
                Config.f(new StringBuilder().insert(2 & 5, Mqa.y).append(a2).append(Xpa.E).append(nArray2.length).toString());
            }
            n2 = ++a2;
        }
    }

    public static BufferedImage f(BufferedImage bufferedImage, int n2) {
        int b2;
        int a2;
        BufferedImage bufferedImage2 = bufferedImage;
        if (bufferedImage2 == null) {
            return bufferedImage2;
        }
        BufferedImage bufferedImage3 = bufferedImage2;
        int n3 = bufferedImage3.getWidth();
        int n4 = bufferedImage3.getHeight();
        if (n3 >= a2) {
            return bufferedImage2;
        }
        int n5 = b2 = n3;
        while (n5 < a2) {
            n5 = b2 * uqa.g;
        }
        a2 = n4 * b2 / n3;
        BufferedImage bufferedImage4 = new BufferedImage(b2, a2, uqa.g);
        Graphics2D graphics2D = bufferedImage4.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        Graphics2D graphics2D2 = graphics2D;
        graphics2D2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D2.drawImage(bufferedImage2, uSa.E, uSa.E, b2, a2, null);
        return bufferedImage4;
    }

    public static int J() {
        int n2;
        int n3 = n2 = opa.w;
        while (n3 > 0) {
            int n4 = n2;
            GL11.glTexImage2D(aPa.E, uSa.E, rSa.Ka, n4, n4, uSa.E, rSa.Ka, Uqa.P, (IntBuffer)null);
            GL11.glGetError();
            if (GL11.glGetTexLevelParameteri(aPa.E, uSa.E, mPa.H) != 0) {
                return n2;
            }
            n3 = n2 >> vRa.d;
        }
        return pua.o;
    }

    public static String J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        String string3 = YSa.y;
        if (a2.startsWith(string3)) {
            a2 = a2.substring(string3.length());
            return a2;
        }
        if (a2.startsWith(cRa.A)) {
            a2 = a2.substring(uqa.g);
            if (!b2.endsWith(WSa.f)) {
                b2 = new StringBuilder().insert(3 >> 2, b2).append(WSa.f).toString();
            }
            a2 = new StringBuilder().insert(3 ^ 3, b2).append(a2).toString();
            return a2;
        }
        if (a2.startsWith(Wqa.j)) {
            a2 = a2.substring(vRa.d);
        }
        b2 = ITa.T;
        if (a2.startsWith(Ura.u)) {
            a2 = a2.substring(uqa.g);
            a2 = new StringBuilder().insert(3 >> 2, b2).append(a2).toString();
            return a2;
        }
        if (a2.startsWith(WSa.f)) {
            a2 = new StringBuilder().insert(2 & 5, b2).append(a2.substring(vRa.d)).toString();
            return a2;
        }
        return a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Dimension J(InputStream inputStream, String string) {
        Iterator<ImageReader> b2 = string;
        InputStream a2 = inputStream;
        Iterator<ImageReader> iterator = b2 = ImageIO.getImageReadersBySuffix((String)((Object)b2));
        while (iterator.hasNext()) {
            ImageReader imageReader = b2.next();
            try {
                ImageInputStream imageInputStream = ImageIO.createImageInputStream(a2);
                ImageReader imageReader2 = imageReader;
                imageReader2.setInput(imageInputStream);
                int n2 = imageReader2.getWidth(imageReader2.getMinIndex());
                int n3 = imageReader2.getHeight(imageReader2.getMinIndex());
                Dimension dimension = new Dimension(n2, n3);
                return dimension;
            }
            catch (IOException iOException) {
                iterator = b2;
            }
            finally {
                imageReader.dispose();
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, int n2, int n3, int n4, int n5) {
        void c2;
        File file;
        int e22 = n2;
        String d2 = string;
        Cg_3.J(e22);
        GL11.glPixelStorei(Pqa.J, vRa.d);
        GL11.glPixelStorei(zua.j, vRa.d);
        File e22 = new File(d2).getParentFile();
        if (e22 != null) {
            e22.mkdirs();
        }
        int n6 = e22 = uSa.E;
        while (n6 < ERa.C) {
            File file2 = new File(new StringBuilder().insert(3 >> 2, d2).append(IPa.W).append(e22).append(KPa.C).toString());
            file = file2;
            file2.delete();
            n6 = ++e22;
        }
        int n7 = e22 = uSa.E;
        while (n7 <= c2) {
            void a2;
            void b2;
            file = new File(new StringBuilder().insert(2 & 5, d2).append(IPa.W).append(e22).append(KPa.C).toString());
            void var6_10 = b2 >> e22;
            void var7_12 = a2 >> e22;
            void var8_14 = var6_10 * var7_12;
            Object object = BufferUtils.createIntBuffer((int)var8_14);
            int[] nArray = new int[var8_14];
            GL11.glGetTexImage(BQa.Z, e22, NSa.U, aua.N, (IntBuffer)object);
            ((IntBuffer)object).get(nArray);
            object = new BufferedImage((int)var6_10, (int)var7_12, uqa.g);
            ((BufferedImage)object).setRGB(uSa.E, uSa.E, (int)var6_10, (int)var7_12, nArray, uSa.E, (int)var6_10);
            try {
                ImageIO.write((RenderedImage)object, GPa.l, file);
                Config.f(new StringBuilder().insert(5 >> 3, FTa.Ja).append(file).toString());
            }
            catch (Exception exception) {
                Config.J(new StringBuilder().insert(3 & 4, Qra.Y).append(file).toString());
                Config.J(new StringBuilder().insert(3 ^ 3, Mqa.y).append(exception.getClass().getName()).append(Xpa.E).append(exception.getMessage()).toString());
            }
            n7 = ++e22;
        }
    }

    public static void J(int a2) {
        uKa.C((int)a2);
    }

    public static WKa J() {
        return Kpa.J().J();
    }

    public static BufferedImage J(BufferedImage bufferedImage, int n2) {
        BufferedImage a2;
        int b2 = n2;
        BufferedImage bufferedImage2 = a2 = bufferedImage;
        int n3 = bufferedImage2.getWidth();
        int n4 = bufferedImage2.getHeight() * b2 / n3;
        BufferedImage bufferedImage3 = new BufferedImage(b2, n4, uqa.g);
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (b2 < n3 || b2 % n3 != 0) {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D.drawImage(a2, uSa.E, uSa.E, b2, n4, null);
        return bufferedImage3;
    }

    public static String J(String string) {
        String string2 = string;
        int a2 = string2.lastIndexOf(uOa.F);
        if (a2 < 0) {
            return Mqa.y;
        }
        return string2.substring(uSa.E, a2);
    }

    public static void f() {
        WKa wKa2 = Cg_3.J();
        if (wKa2 != null) {
            String string = yOa.N;
            WKa wKa3 = wKa2;
            I = wKa3.l(string + Pua.Aa);
            Va = wKa2.l(new StringBuilder().insert(3 & 4, string).append(WOa.r).toString());
            N = wKa3.l(new StringBuilder().insert(5 >> 3, string).append(JSa.Ha).toString());
            S = wKa3.l(new StringBuilder().insert(3 & 4, string).append(Yra.p).toString());
            D = wKa3.l(new StringBuilder().insert(5 >> 3, string).append(TOa.la).toString());
            Ea = wKa3.l(new StringBuilder().insert(3 >> 2, string).append(cTa.D).toString());
            a = wKa3.l(new StringBuilder().insert(3 >> 2, string).append(RQa.o).toString());
            c = wKa3.l(new StringBuilder().insert(3 ^ 3, string).append(NQa.t).toString());
            B = wKa3.l(new StringBuilder().insert(2 & 5, string).append(VQa.T).toString());
            b = wKa3.l(new StringBuilder().insert(3 ^ 3, string).append(wua.E).toString());
            R = wKa3.l(new StringBuilder().insert(5 >> 3, string).append(NOa.D).toString());
            Ma = wKa3.l(new StringBuilder().insert(0, string).append(wua.f).toString());
            Aa = wKa3.l(new StringBuilder().insert(0, string).append(ZRa.U).toString());
            V = wKa3.l(new StringBuilder().insert(0, string).append(SQa.Q).toString());
            ja = wKa3.l(new StringBuilder().insert(0, string).append(pQa.T).toString());
            l = wKa3.l(new StringBuilder().insert(0, string).append(lPa.D).toString());
            string = Spa.C;
            Ga = wKa3.l(new StringBuilder().insert(0, string).append(Iqa.w).toString());
            W = wKa3.l(new StringBuilder().insert(0, string).append(Vua.Aa).toString());
        }
    }

    public static void J() {
        if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            float f2 = GL11.glGetFloat(yQa.f);
            float f3 = Config.d();
            f3 = Math.min(f3, f2);
            GL11.glTexParameterf(BQa.Z, SRa.A, f3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static BufferedImage J(String string, BufferedImage bufferedImage) {
        void a2;
        String string2 = string;
        if (string2.startsWith(dsa.q) || string2.startsWith(Eqa.z)) {
            int b2;
            void v0 = a2;
            int n2 = v0.getWidth();
            if (n2 == (b2 = v0.getHeight()) * uqa.g) {
                Graphics2D graphics2D;
                BufferedImage bufferedImage2 = new BufferedImage(n2, b2 * uqa.g, uqa.g);
                Graphics2D graphics2D2 = graphics2D = bufferedImage2.createGraphics();
                graphics2D2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics2D2.drawImage((Image)a2, uSa.E, uSa.E, n2, b2, null);
                return bufferedImage2;
            }
        }
        return a2;
    }

    public static void J(U a2) {
        if (Cg_3.J() != null) {
            Config.f(hqa.I);
            jg.f();
            Jg.f();
            Cg_3.f();
            pe.J();
            OE.J();
            FE.J();
            Jg.l();
            XE.f();
            jg.J();
            Se.f();
            Me.J();
            pA.Ja();
            Kg.J();
            Config.J();
            EE.J();
            Config.J().f();
        }
    }

    public static int J(int n2) {
        int n3;
        int n4 = n2;
        int a2 = vRa.d;
        int n5 = n3 = uSa.E;
        while (n5 < n4) {
            a2 *= uqa.g;
            n5 = ++n3;
        }
        return a2;
    }
}

