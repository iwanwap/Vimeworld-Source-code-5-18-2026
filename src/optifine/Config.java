/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  Cia
 *  D
 *  EC
 *  ERa
 *  Eoa
 *  ISa
 *  JPa
 *  JQa
 *  Kpa
 *  LQa
 *  MQa
 *  Mpa
 *  NTa
 *  Spa
 *  Td
 *  Tf
 *  Tpa
 *  U
 *  Uqa
 *  VJa
 *  VQa
 *  YSa
 *  Ypa
 *  ZJa
 *  aJa
 *  aQa
 *  aSa
 *  bqa
 *  cra
 *  dGa
 *  dpa
 *  kPa
 *  lqa
 *  nBa
 *  nQa
 *  pqa
 *  pua
 *  qta
 *  sMa
 *  tf
 *  uKa
 *  ura
 *  uw
 *  vRa
 *  vf
 *  wOa
 *  wra
 *  yra
 *  ysa
 *  zsa
 */
package optifine;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Config
implements KeepClassName,
D {
    private static boolean notify64BitJava;
    private static int texturePackClouds;
    public static int minecraftVersionInt;
    private static boolean desktopModeChecked;
    public static final String OF_RELEASE = "H8";
    private static Cia gameSettings;
    private static int availableProcessors;
    public static final String OF_EDITION = "HD_U";
    public static String openGlVendor;
    public static Td glVersion;
    private static DisplayMode[] displayModes;
    private static String newRelease;
    private static Thread minecraftThread;
    public static boolean occlusionAvailable;
    public static boolean zoomMode;
    public static final Float DEF_ALPHA_FUNC_LEVEL;
    public static String[] openGlExtensions;
    public static String openGlRenderer;
    public static boolean fancyFogAvailable;
    public static String openGlVersion;
    private static boolean fullscreenModeChecked;
    private static int antialiasingLevel;
    public static boolean waterOpacityChanged;
    public static final String MC_VERSION = "1.8.8";
    public static final String OF_NAME = "OptiFine";
    private static DefaultResourcePack defaultResourcePackLazy;
    private static Kpa minecraft;
    private static boolean initialized;
    private static final Logger LOGGER;
    public static Td glslVersion;
    public static final String VERSION = "OptiFine_1.8.8_HD_U_H8";
    private static DisplayMode desktopDisplayMode;

    public static DisplayMode[] J() {
        if (displayModes == null) {
            DisplayMode[] displayModeArray = Display.getAvailableDisplayModes();
            DisplayMode[] displayModeArray2 = Config.J(displayModeArray);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            displayModeArray2 = displayModeArray2.iterator();
            while (displayModeArray2.hasNext()) {
                Object object = (Dimension)displayModeArray2.next();
                if ((object = Config.J(Config.J(displayModeArray, (Dimension)object), desktopDisplayMode)) == null) continue;
                arrayList.add(object);
            }
            try {
                ArrayList<Object> arrayList2 = arrayList;
                DisplayMode[] displayModeArray3 = displayModeArray2 = arrayList2.toArray(new DisplayMode[arrayList2.size()]);
                Arrays.sort(displayModeArray2, new tf());
                return displayModeArray2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                DisplayMode[] displayModeArray4 = new DisplayMode[vRa.d];
                displayModeArray4[uSa.E] = desktopDisplayMode;
                displayModes = displayModeArray4;
            }
        }
        return displayModes;
    }

    /*
     * WARNING - void declaration
     */
    public static int[] J(int[] nArray, int[] nArray2) {
        void a2;
        int[] nArray3 = nArray;
        if (nArray3 != null && a2 != null) {
            int n2;
            int n3 = nArray3.length;
            int[] b2 = new int[n3 + ((void)a2).length];
            System.arraycopy(nArray3, uSa.E, b2, uSa.E, n3);
            int n4 = n2 = uSa.E;
            while (n4 < ((void)a2).length) {
                int n5 = n2 + n3;
                void v2 = a2[n2];
                b2[n5] = v2;
                n4 = ++n2;
            }
            return b2;
        }
        throw new NullPointerException(bqa.g);
    }

    public static boolean La() {
        return Config.gameSettings.Ea;
    }

    public static int J(int a2) {
        a2 = a2 ^ tua.w ^ a2 >> ERa.C;
        a2 += a2 << yRa.d;
        a2 ^= a2 >> AQa.P;
        a2 *= WOa.k;
        a2 ^= a2 >> Ypa.A;
        return a2;
    }

    public static int J(String string, String string2) {
        int n2;
        String string3;
        Object b2 = string2;
        String a2 = string;
        Object object = Config.J(a2);
        String string4 = object[uSa.E];
        if (!string4.equals(string3 = (b2 = Config.J((String)b2))[uSa.E])) {
            return string4.compareTo(string3);
        }
        int n3 = Config.J(object[vRa.d], pua.o);
        if (n3 != (n2 = Config.J(b2[vRa.d], pua.o))) {
            return n3 - n2;
        }
        if (!((String)(object = object[uqa.g])).equals(b2 = b2[uqa.g])) {
            if (((String)object).isEmpty()) {
                return vRa.d;
            }
            if (((String)b2).isEmpty()) {
                return pua.o;
            }
        }
        return ((String)object).compareTo((String)b2);
    }

    public static boolean Ea() {
        return Config.gameSettings.r;
    }

    private static String e() {
        InputStream inputStream;
        block3: {
            try {
                inputStream = Config.class.getResourceAsStream(oQa.i);
                if (inputStream != null) break block3;
                return null;
            }
            catch (Exception exception) {
                Config.J(new StringBuilder().insert(3 & 4, Mqa.y).append(exception.getClass().getName()).append(Xpa.E).append(exception.getMessage()).toString());
                return null;
            }
        }
        String string = Config.J(inputStream)[uSa.E];
        return string;
    }

    public static boolean Ga() {
        return Config.gameSettings.g;
    }

    public static boolean Ba() {
        if (Config.gameSettings.P == 0) {
            return Config.gameSettings.u;
        }
        if (Config.gameSettings.P == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(String string, boolean bl) {
        String a2;
        block3: {
            boolean b2 = bl;
            a2 = string;
            try {
                if (a2 != null) break block3;
                return b2;
            }
            catch (NumberFormatException numberFormatException) {
                return b2;
            }
        }
        a2 = a2.trim();
        return Boolean.parseBoolean(a2);
    }

    public static void J(String string, String string2) {
        Object b2 = string2;
        String a2 = string;
        b2 = new fe(Config.minecraft.ta, a2, (String)b2);
        minecraft.J((EC)b2);
    }

    public static boolean Ma() {
        if (Config.gameSettings.Ya == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean ea() {
        if (Config.gameSettings.O != yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean la() {
        if (Config.gameSettings.ma == 0) {
            return Config.gameSettings.u;
        }
        if (Config.gameSettings.ma != vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean Ja() {
        if (Config.gameSettings.hc == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float l() {
        if (Config.h() && pA.bc >= JPa.N) {
            return pA.bc;
        }
        return Config.gameSettings.Ba;
    }

    public static boolean Ca() {
        if (Thread.currentThread() == minecraftThread) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean da() {
        return Config.gameSettings.Sa;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void D() {
        int n2 = Config.i();
        if (n2 > 0) {
            DisplayMode displayMode = Display.getDisplayMode();
            Config.f(new StringBuilder().insert(3 >> 2, fqa.Fa).append(n2).toString());
            try {
                Display.destroy();
                Display.setDisplayMode(displayMode);
                Display.create(new PixelFormat().withDepthBits(osa.c).withSamples(n2));
                if (maa.J() != Xy.OSX) {
                    Display.setResizable(uSa.E != 0);
                    Display.setResizable(vRa.d != 0);
                }
            }
            catch (LWJGLException lWJGLException) {
                Config.J(new StringBuilder().insert(3 ^ 3, nOa.E).append(n2).append(rRa.X).toString());
                lWJGLException.printStackTrace();
                try {
                    Display.setDisplayMode(displayMode);
                    Display.create(new PixelFormat().withDepthBits(osa.c));
                    if (maa.J() != Xy.OSX) {
                        Display.setResizable(uSa.E != 0);
                        Display.setResizable(vRa.d != 0);
                    }
                }
                catch (LWJGLException lWJGLException2) {
                    lWJGLException2.printStackTrace();
                    try {
                        Display.setDisplayMode(displayMode);
                        Display.create();
                        if (maa.J() != Xy.OSX) {
                            Display.setResizable(uSa.E != 0);
                            Display.setResizable(vRa.d != 0);
                        }
                    }
                    catch (LWJGLException lWJGLException3) {
                        lWJGLException3.printStackTrace();
                    }
                }
            }
            if (!Kpa.ca && Config.J() != null) {
                InputStream inputStream;
                InputStream inputStream2;
                block15: {
                    inputStream2 = null;
                    inputStream = null;
                    try {
                        inputStream2 = Config.J().l(new ResourceLocation(cra.z));
                        inputStream = Config.J().l(new ResourceLocation(aSa.L));
                        if (inputStream2 == null || inputStream == null) break block15;
                        ByteBuffer[] byteBufferArray = new ByteBuffer[uqa.g];
                        byteBufferArray[uSa.E] = Config.J(inputStream2);
                        byteBufferArray[vRa.d] = Config.J(inputStream);
                        Display.setIcon(byteBufferArray);
                    }
                    catch (IOException iOException) {
                        try {
                            Config.J(new StringBuilder().insert(3 & 4, mPa.q).append(iOException.getClass().getName()).append(Xpa.E).append(iOException.getMessage()).toString());
                        }
                        catch (Throwable throwable) {
                            IOUtils.closeQuietly(inputStream2);
                            IOUtils.closeQuietly(inputStream);
                            throw throwable;
                        }
                        IOUtils.closeQuietly(inputStream2);
                        IOUtils.closeQuietly(inputStream);
                        return;
                    }
                }
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(inputStream);
                return;
            }
        }
    }

    public static boolean equals(Object object, Object object2) {
        Object a2 = object;
        Object b2 = object2;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (a2 == null) {
            return uSa.E != 0;
        }
        return a2.equals(b2);
    }

    public static InputStream J(ResourceLocation a2) throws IOException {
        return Config.J(minecraft.J(), a2);
    }

    public Config() {
        Config a2;
    }

    public static String d() {
        return NTa.T;
    }

    public static boolean ma() {
        return Config.gameSettings.aC;
    }

    public static boolean Aa() {
        return Config.gameSettings.da;
    }

    public static void e(String a2) {
        Config.f(a2);
    }

    public static void A() {
        if (!initialized && Display.isCreated()) {
            initialized = vRa.d;
            Config.M();
        }
    }

    public static float J(float a2) {
        if (a2 < JPa.N) {
            return JPa.N;
        }
        if (a2 > pqa.r) {
            return pqa.r;
        }
        return a2;
    }

    public static void i() {
        availableProcessors = Runtime.getRuntime().availableProcessors();
    }

    public static boolean ga() {
        return Config.gameSettings.J;
    }

    public static DisplayMode f() {
        DisplayMode[] displayModeArray = Config.J();
        if (displayModeArray != null && displayModeArray.length >= vRa.d) {
            DisplayMode displayMode = displayModeArray[displayModeArray.length - vRa.d];
            if (desktopDisplayMode.getWidth() > displayMode.getWidth()) {
                return desktopDisplayMode;
            }
            if (desktopDisplayMode.getWidth() == displayMode.getWidth() && desktopDisplayMode.getHeight() > displayMode.getHeight()) {
                return desktopDisplayMode;
            }
            return displayMode;
        }
        return desktopDisplayMode;
    }

    public static boolean ja() {
        if (Config.gameSettings.za == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void d(String a2) {
        newRelease = a2;
    }

    public static String J(File a2) throws IOException {
        return Config.J(new FileInputStream(a2), sqa.E);
    }

    public static String J(Object[] objectArray) {
        int a2;
        Object[] objectArray2 = objectArray;
        if (objectArray2 == null) {
            return Mqa.y;
        }
        StringBuffer stringBuffer = new StringBuffer(objectArray2.length * tTa.h);
        int n2 = a2 = uSa.E;
        while (n2 < objectArray2.length) {
            Object object = objectArray2[a2];
            if (a2 > 0) {
                stringBuffer.append(TOa.n);
            }
            stringBuffer.append(String.valueOf(object));
            n2 = ++a2;
        }
        return stringBuffer.toString();
    }

    public static boolean Ia() {
        return Config.gameSettings.fa;
    }

    static {
        newRelease = null;
        notify64BitJava = uSa.E;
        openGlVersion = null;
        openGlRenderer = null;
        openGlVendor = null;
        openGlExtensions = null;
        glVersion = null;
        glslVersion = null;
        minecraftVersionInt = pua.o;
        fancyFogAvailable = uSa.E;
        occlusionAvailable = uSa.E;
        gameSettings = null;
        minecraft = Kpa.J();
        initialized = uSa.E;
        minecraftThread = null;
        desktopDisplayMode = null;
        displayModes = null;
        antialiasingLevel = uSa.E;
        availableProcessors = uSa.E;
        zoomMode = uSa.E;
        texturePackClouds = uSa.E;
        waterOpacityChanged = uSa.E;
        fullscreenModeChecked = uSa.E;
        desktopModeChecked = uSa.E;
        defaultResourcePackLazy = null;
        DEF_ALPHA_FUNC_LEVEL = Float.valueOf(Nra.e);
        LOGGER = LogManager.getLogger();
    }

    public static boolean Ka() {
        return Config.gameSettings.Ka;
    }

    public static boolean aa() {
        return Config.gameSettings.gB;
    }

    public static boolean Da() {
        return Config.gameSettings.Qa;
    }

    private static String f(String string) {
        String string2 = string;
        int a2 = string2.indexOf(wra.P);
        if (a2 < 0) {
            return Mqa.y;
        }
        int n2 = string2.indexOf(fPa.i, a2);
        if (n2 < 0) {
            return Mqa.y;
        }
        return string2.substring(a2 + vRa.d, n2);
    }

    public static U J() {
        return minecraft.J();
    }

    private static void M() {
        Config.e(Mqa.y);
        Config.e(Config.d());
        Config.e(new StringBuilder().insert(3 >> 2, MQa.j).append(Config.e()).toString());
        Config.e(new StringBuilder().insert(3 >> 2, VPa.Z).append(System.getProperty(JPa.G)).append(nQa.T).append(System.getProperty(wsa.Y)).append(ppa.c).append(System.getProperty(sSa.la)).toString());
        Config.e(new StringBuilder().insert(3 & 4, vsa.X).append(System.getProperty(lqa.Ga)).append(TOa.n).append(System.getProperty(Fua.i)).toString());
        Config.e(new StringBuilder().insert(3 >> 2, dsa.C).append(System.getProperty(oQa.q)).append(nQa.T).append(System.getProperty(xra.t)).append(cPa.V).append(System.getProperty(ISa.fa)).toString());
        Config.e(new StringBuilder().insert(2 & 5, yta.F).append(Sys.getVersion()).toString());
        openGlVersion = GL11.glGetString(zsa.ca);
        openGlRenderer = GL11.glGetString(Ora.J);
        openGlVendor = GL11.glGetString(PRa.m);
        Config.e(new StringBuilder().insert(3 >> 2, YSa.m).append(openGlRenderer).append(yra.E).append(openGlVersion).append(TOa.n).append(openGlVendor).toString());
        Config.e(new StringBuilder().insert(5 >> 3, yOa.f).append(Config.J()).toString());
        if (!GLContext.getCapabilities().OpenGL12) {
            Config.e(dqa.I);
        }
        if (!(fancyFogAvailable = GLContext.getCapabilities().GL_NV_fog_distance)) {
            Config.e(uSa.v);
        }
        if (!(occlusionAvailable = GLContext.getCapabilities().GL_ARB_occlusion_query)) {
            Config.e(Gta.M);
        }
        int n2 = Cg.J();
        Config.f(new StringBuilder().insert(2 & 5, Qra.Aa).append(n2).append(rRa.X).append(n2).toString());
    }

    public static String[] J(File a2) throws IOException {
        return Config.J(new FileInputStream(a2));
    }

    public static boolean ha() {
        return Config.gameSettings.Za;
    }

    /*
     * WARNING - void declaration
     */
    private static DisplayMode[] J(DisplayMode[] displayModeArray, Dimension dimension) {
        int b22;
        DisplayMode[] displayModeArray2 = displayModeArray;
        ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
        int n2 = b22 = uSa.E;
        while (n2 < displayModeArray2.length) {
            void a2;
            DisplayMode displayMode = displayModeArray2[b22];
            if ((double)displayMode.getWidth() == a2.getWidth() && (double)displayMode.getHeight() == a2.getHeight()) {
                arrayList.add(displayMode);
            }
            n2 = ++b22;
        }
        ArrayList<DisplayMode> arrayList2 = arrayList;
        DisplayMode[] b22 = arrayList2.toArray(new DisplayMode[arrayList2.size()]);
        return b22;
    }

    public static ZJa J() {
        return Config.minecraft.Aa;
    }

    public static boolean ia() {
        if (uw.A) {
            return uSa.E != 0;
        }
        if (Config.gameSettings.p == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean fa() {
        return Config.gameSettings.n;
    }

    public static String C() {
        return newRelease;
    }

    public static boolean ka() {
        if (Config.i() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float f() {
        return DEF_ALPHA_FUNC_LEVEL.floatValue();
    }

    public static boolean Ha() {
        if (Config.J().Q > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean ca() {
        if (Config.gameSettings.Bb == 0) {
            return Config.gameSettings.u;
        }
        if (Config.gameSettings.Bb == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean Fa() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Td J(String string, Td td2) {
        Object b2;
        block5: {
            void a2;
            String string2;
            block4: {
                string2 = string;
                try {
                    if (string2 != null) break block4;
                    return a2;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return a2;
                }
            }
            Pattern pattern = Pattern.compile(xSa.H);
            b2 = pattern.matcher(string2);
            if (((Matcher)b2).matches()) break block5;
            return a2;
        }
        Object object = b2;
        int n2 = Integer.parseInt(((Matcher)object).group(vRa.d));
        int n3 = Integer.parseInt(((Matcher)object).group(uqa.g));
        int n4 = ((Matcher)object).group(AQa.P) != null ? Integer.parseInt(((Matcher)b2).group(AQa.P)) : uSa.E;
        b2 = ((Matcher)b2).group(tTa.h);
        return new Td(n2, n3, n4, (String)b2);
    }

    public static Kpa J() {
        return minecraft;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        if (a2 < b2) {
            return (int)b2;
        }
        if (a2 > c2) {
            return c2;
        }
        return a2;
    }

    public static void C(String a2) {
        LOGGER.error(new StringBuilder().insert(3 ^ 3, qta.W).append(a2).toString());
    }

    public static int D() {
        return Config.gameSettings.LB;
    }

    public static String l() {
        int n2;
        if (minecraft.J() == null) {
            return Mqa.y;
        }
        IResourcePack[] iResourcePackArray = Config.J();
        if (iResourcePackArray.length <= 0) {
            return Config.J().J();
        }
        String[] stringArray = new String[iResourcePackArray.length];
        int n3 = n2 = uSa.E;
        while (n3 < iResourcePackArray.length) {
            int n4 = n2++;
            stringArray[n4] = iResourcePackArray[n4].J();
            n3 = n2;
        }
        String string = Config.J(stringArray);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e() {
        try {
            if (minecraft.F()) {
                if (fullscreenModeChecked) {
                    return;
                }
                fullscreenModeChecked = vRa.d;
                desktopModeChecked = uSa.E;
                DisplayMode displayMode = Display.getDisplayMode();
                Object object = Config.J();
                if (object == null) {
                    return;
                }
                if (displayMode.getWidth() == ((Dimension)object).width && displayMode.getHeight() == ((Dimension)object).height) {
                    return;
                }
                if ((object = Config.J((Dimension)object)) == null) {
                    return;
                }
                Display.setDisplayMode((DisplayMode)object);
                Config.minecraft.t = Display.getDisplayMode().getWidth();
                Config.minecraft.k = Display.getDisplayMode().getHeight();
                if (Config.minecraft.t <= 0) {
                    Config.minecraft.t = vRa.d;
                }
                if (Config.minecraft.k <= 0) {
                    Config.minecraft.k = vRa.d;
                }
                if (Config.minecraft.ta != null) {
                    sMa sMa2 = new sMa(minecraft);
                    int n2 = sMa2.f();
                    int n3 = sMa2.J();
                    Config.minecraft.ta.f(minecraft, n2, n3);
                }
                Config.minecraft.Ja = new Mpa(minecraft);
                Config.d();
                Display.setFullscreen(vRa.d != 0);
                Config.minecraft.z.J();
                uKa.H();
                return;
            }
            if (desktopModeChecked) {
                return;
            }
            desktopModeChecked = vRa.d;
            fullscreenModeChecked = uSa.E;
            Config.minecraft.z.J();
            Display.update();
            uKa.H();
            if (maa.J() == Xy.OSX) return;
            Display.setResizable(uSa.E != 0);
            Display.setResizable(vRa.d != 0);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Config.gameSettings.ya = xqa.A;
            gameSettings.A();
        }
    }

    public static int A() {
        return availableProcessors;
    }

    public static String[] l() {
        if (openGlExtensions == null) {
            openGlExtensions = Config.J();
        }
        return openGlExtensions;
    }

    public static boolean ba() {
        if (Config.gameSettings.cA == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void d() {
        minecraft.J().l(Config.minecraft.t, Config.minecraft.k);
        if (Config.minecraft.R != null) {
            Config.minecraft.R.J(Config.minecraft.t, Config.minecraft.k);
        }
    }

    public static DisplayMode J(Dimension dimension) throws LWJGLException {
        int n2;
        Dimension dimension2 = dimension;
        DisplayMode[] displayModeArray = Config.J();
        int n3 = n2 = uSa.E;
        while (n3 < displayModeArray.length) {
            DisplayMode a2 = displayModeArray[n2];
            if (a2.getWidth() == dimension2.width && a2.getHeight() == dimension2.height) {
                return a2;
            }
            n3 = ++n2;
        }
        return desktopDisplayMode;
    }

    public static boolean v() {
        return Config.gameSettings.ka;
    }

    public static boolean O() {
        if (uw.A) {
            if (!Config.s()) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (Config.gameSettings.p == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Object[] J(Object[] objectArray, Object[] objectArray2) {
        void a2;
        Object[] objectArray3 = objectArray;
        if (objectArray3 == null) {
            throw new NullPointerException(bqa.g);
        }
        if (((void)a2).length == 0) {
            return objectArray3;
        }
        int n2 = objectArray3.length;
        int b22 = n2 + ((void)a2).length;
        Object[] b22 = (Object[])Array.newInstance(objectArray3.getClass().getComponentType(), b22);
        System.arraycopy(objectArray3, uSa.E, b22, uSa.E, n2);
        System.arraycopy(a2, uSa.E, b22, n2, ((void)a2).length);
        return b22;
    }

    public static boolean T() {
        if (Config.f() > DEF_ALPHA_FUNC_LEVEL.floatValue() + BPa.n) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int i() {
        return antialiasingLevel;
    }

    public static IResourcePack[] J() {
        dGa dGa2 = minecraft.J();
        IResourcePack[] iResourcePackArray = dGa2.l();
        ArrayList<IResourcePack> arrayList = new ArrayList<IResourcePack>();
        IResourcePack[] iResourcePackArray2 = iResourcePackArray = iResourcePackArray.iterator();
        while (iResourcePackArray2.hasNext()) {
            Object e2 = iResourcePackArray.next();
            arrayList.add(((nIa)e2).J());
            iResourcePackArray2 = iResourcePackArray;
        }
        if (dGa2.J() != null) {
            arrayList.add(dGa2.J());
        }
        ArrayList<IResourcePack> arrayList2 = arrayList;
        iResourcePackArray = arrayList2.toArray(new IResourcePack[arrayList2.size()]);
        return iResourcePackArray;
    }

    public static boolean X() {
        return Config.gameSettings.jC;
    }

    public static String[] f() {
        int n2;
        DisplayMode[] displayModeArray = Config.J();
        String[] stringArray = new String[displayModeArray.length];
        int n3 = n2 = uSa.E;
        while (n3 < displayModeArray.length) {
            Object object = displayModeArray[n2];
            object = new StringBuilder().insert(3 ^ 3, Mqa.y).append(((DisplayMode)object).getWidth()).append(rRa.X).append(((DisplayMode)object).getHeight()).toString();
            stringArray[n2++] = object;
            n3 = n2;
        }
        return stringArray;
    }

    public static boolean V() {
        if (uw.A) {
            return Config.s();
        }
        if (!Config.s()) {
            return uSa.E != 0;
        }
        if (Config.gameSettings.p == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static DisplayMode J(DisplayMode[] displayModeArray, DisplayMode displayMode) {
        void a2;
        DisplayMode[] displayModeArray2 = displayModeArray;
        if (a2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < displayModeArray2.length) {
                DisplayMode b2 = displayModeArray2[n2];
                if (b2.getBitsPerPixel() == a2.getBitsPerPixel() && b2.getFrequency() == a2.getFrequency()) {
                    return b2;
                }
                n3 = ++n2;
            }
        }
        if (displayModeArray2.length <= 0) {
            return null;
        }
        DisplayMode[] displayModeArray3 = displayModeArray2;
        Arrays.sort(displayModeArray3, new tf());
        return displayModeArray3[displayModeArray2.length - vRa.d];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f(Object object, Object[] objectArray) {
        int b2;
        void a2;
        Object object2 = object;
        if (a2 == null) {
            return uSa.E != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (object2 == var3_4) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    public static boolean N() {
        if (!Config.J()) {
            return uSa.E != 0;
        }
        if (Config.h()) {
            return pA.f();
        }
        return vRa.d != 0;
    }

    public static boolean W() {
        return Config.gameSettings.Pa;
    }

    public static boolean t() {
        return Config.gameSettings.A;
    }

    public static Dimension J() {
        if (desktopDisplayMode == null) {
            return null;
        }
        if (gameSettings == null) {
            return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
        }
        String string = Config.gameSettings.ya;
        if (string.equals(xqa.A)) {
            return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
        }
        String[] stringArray = Config.J(string, Jra.z);
        if (stringArray.length < uqa.g) {
            return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
        }
        return new Dimension(Config.J(stringArray[uSa.E], pua.o), Config.J(stringArray[vRa.d], pua.o));
    }

    public static boolean r() {
        if (Config.A() <= vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static byte[] J(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object a2 = new byte[ura.V];
        InputStream inputStream3 = inputStream2;
        while (true) {
            int n2;
            if ((n2 = inputStream3.read((byte[])a2)) < 0) {
                inputStream2.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write((byte[])a2, uSa.E, n2);
            inputStream3 = inputStream2;
        }
    }

    public static String J(InputStream a2) throws IOException {
        return Config.J(a2, sqa.E);
    }

    public static Td l() {
        if (glslVersion == null && (glslVersion = Config.J(GL11.glGetString(aQa.o), (Td)null)) == null) {
            glslVersion = new Td(vRa.d, NTa.C);
        }
        return glslVersion;
    }

    public static boolean w() {
        return Config.gameSettings.K;
    }

    public static void J(File file, String string) throws IOException {
        Object b2 = string;
        File a2 = file;
        FileOutputStream fileOutputStream = new FileOutputStream(a2);
        b2 = ((String)b2).getBytes(sqa.E);
        FileOutputStream fileOutputStream2 = fileOutputStream;
        fileOutputStream2.write((byte[])b2);
        fileOutputStream2.close();
    }

    public static void l(String string) {
        String string2 = string;
        int a2 = GL11.glGetError();
        if (a2 != 0) {
            String string3 = GLU.gluErrorString(a2);
            Config.C(new StringBuilder().insert(3 & 4, WPa.ja).append(a2).append(nQa.T).append(string3).append(Bua.A).append(string2).toString());
        }
    }

    public static boolean f(ResourceLocation a2) {
        if (Config.J(a2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void f(String a2) {
        LOGGER.info(new StringBuilder().insert(2 & 5, qta.W).append(a2).toString());
    }

    public static boolean S() {
        return Config.gameSettings.OB;
    }

    public static aJa J() {
        return minecraft.J();
    }

    public static boolean n() {
        if (Config.gameSettings.Ya == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static String[] J(String string) {
        String string2 = string;
        if (string2 != null && string2.length() > 0) {
            Object a2 = Pattern.compile(Jpa.V).matcher(string2);
            if (!((Matcher)a2).matches()) {
                String[] stringArray = new String[yRa.d];
                stringArray[uSa.E] = Mqa.y;
                stringArray[vRa.d] = Mqa.y;
                stringArray[uqa.g] = Mqa.y;
                return stringArray;
            }
            Object object = a2;
            a2 = Config.J(((Matcher)object).group(vRa.d));
            String string3 = Config.J(((Matcher)object).group(uqa.g));
            String string4 = Config.J(((Matcher)object).group(yRa.d));
            String[] stringArray = new String[yRa.d];
            stringArray[uSa.E] = a2;
            stringArray[vRa.d] = string3;
            stringArray[uqa.g] = string4;
            return stringArray;
        }
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Mqa.y;
        stringArray[vRa.d] = Mqa.y;
        stringArray[uqa.g] = Mqa.y;
        return stringArray;
    }

    private static ByteBuffer J(InputStream inputStream) throws IOException {
        int n2;
        Object a2;
        InputStream inputStream2 = inputStream;
        Object object = a2 = ImageIO.read(inputStream2);
        a2 = ((BufferedImage)object).getRGB(uSa.E, uSa.E, ((BufferedImage)object).getWidth(), ((BufferedImage)a2).getHeight(), null, uSa.E, ((BufferedImage)a2).getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(AQa.P * ((Object)a2).length);
        int n3 = ((Object)a2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object2 = a2[n2];
            byteBuffer.putInt(object2 << Yqa.i | object2 >> osa.c & osa.Ja);
            n4 = ++n2;
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.flip();
        return byteBuffer2;
    }

    public static IResourcePack J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        Object object = minecraft.J();
        KeepClassName a2 = object.J();
        if (a2 != null && a2.J(resourceLocation2)) {
            return a2;
        }
        object = ((dGa)object).E;
        if (object != null) {
            int n2 = a2 = object.size() - vRa.d;
            while (n2 >= 0) {
                IResourcePack iResourcePack = ((nIa)object.get(a2)).J();
                if (iResourcePack.J(resourceLocation2)) {
                    return iResourcePack;
                }
                n2 = --a2;
            }
        }
        if (Config.J().J(resourceLocation2)) {
            return Config.J();
        }
        return null;
    }

    public static void J(long a2) {
        try {
            Thread.sleep(a2);
            return;
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            return;
        }
    }

    public static void C() {
        String string = Config.minecraft.c == null || Config.minecraft.c.J() == null ? Kpa.J() + Fua.Z + Kpa.J().J().J() : Kpa.J() + Fua.Z + Config.minecraft.c.J().f() + pua.fa + Kpa.J().J().J();
        Config.minecraft.Ea.J(string, uqa.g, uqa.g, oua.S);
    }

    public static boolean x() {
        if (Config.gameSettings.td != 0) {
            if (Config.gameSettings.td == yRa.d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (Config.h() && !pA.yc.J()) {
            return pA.yc.l();
        }
        if (texturePackClouds != 0) {
            if (texturePackClouds == yRa.d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public static int M() {
        int n2;
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Era.Da;
        stringArray[vRa.d] = yOa.q;
        stringArray[uqa.g] = wsa.Y;
        String[] stringArray2 = stringArray;
        int n3 = n2 = uSa.E;
        while (n3 < stringArray2.length) {
            String string = System.getProperty(stringArray2[n2]);
            if (string != null && string.contains(Lsa.Q)) {
                return ysa.s;
            }
            n3 = ++n2;
        }
        return fPa.i;
    }

    private static String[] J() {
        Object object;
        block6: {
            int n2;
            int n3;
            object = Config.f();
            if (object.J() < yRa.d || (n3 = GL11.glGetInteger(kPa.V)) <= 0) break block6;
            String[] stringArray = new String[n3];
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                int n5 = n2++;
                stringArray[n5] = GL30.glGetStringi(bsa.I, n5);
                n4 = n2;
            }
            try {
                return stringArray;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        try {
            object = GL11.glGetString(bsa.I);
            String[] stringArray = object.split(Tpa.E);
            return stringArray;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[uSa.E];
        }
    }

    public static boolean Q() {
        return Config.gameSettings.j;
    }

    public static boolean Z() {
        return uSa.E != 0;
    }

    public static boolean p() {
        if (Config.gameSettings.Ya == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(ResourceLocation a2) {
        if (Config.J(a2) == Config.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String f() {
        StringBuffer stringBuffer = new StringBuffer(fPa.i);
        if (Config.J()) {
            stringBuffer.append(Zqa.X);
            stringBuffer.append(String.valueOf(vf.J()));
            stringBuffer.append(TOa.n);
        }
        stringBuffer.append(NTa.T);
        String string = pA.J();
        if (string != null) {
            stringBuffer.append(TOa.n);
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static boolean R() {
        return Config.gameSettings.c;
    }

    public static String J() {
        Td td2 = Config.f();
        return new StringBuilder().insert(3 & 4, Mqa.y).append(td2.J()).append(VQa.ja).append(td2.f()).append(VQa.ja).append(td2.l()).toString();
    }

    public static boolean Y() {
        if (Config.gameSettings.P == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static Object[] J(Object[] objectArray, Object object) {
        void a2;
        Object[] objectArray2 = objectArray;
        if (objectArray2 == null) {
            throw new NullPointerException(bqa.g);
        }
        int n2 = objectArray2.length;
        int b2 = n2 + vRa.d;
        Object[] objectArray3 = b2 = (Object[])Array.newInstance(objectArray2.getClass().getComponentType(), b2);
        System.arraycopy(objectArray2, uSa.E, objectArray3, uSa.E, n2);
        objectArray3[n2] = a2;
        return b2;
    }

    public static boolean U() {
        if (Config.h() && !pA.i()) {
            return uSa.E != 0;
        }
        if (Config.gameSettings.mB == 0) {
            return Config.gameSettings.u;
        }
        if (Config.gameSettings.mB == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void l() {
        Config.i();
        if (Config.r()) {
            if (Config.w()) {
                minecraftThread.setPriority(NTa.C);
                Config.J(ROa.a, vRa.d);
                return;
            }
            minecraftThread.setPriority(tTa.h);
            Config.J(ROa.a, tTa.h);
            return;
        }
        minecraftThread.setPriority(NTa.C);
        Config.J(ROa.a, tTa.h);
    }

    public static boolean P() {
        return notify64BitJava;
    }

    public static boolean s() {
        return fancyFogAvailable;
    }

    public static boolean y() {
        if (Config.d() > vRa.d) {
            return vRa.d != 0;
        }
        if (Config.i() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Td f() {
        if (glVersion == null) {
            glVersion = Config.J(GL11.glGetString(zsa.ca), (Td)null);
            if (glVersion == null) {
                glVersion = Config.J();
            }
            if (glVersion == null) {
                glVersion = new Td(vRa.d, uSa.E);
            }
        }
        return glVersion;
    }

    public static boolean u() {
        if (!Config.r()) {
            return uSa.E != 0;
        }
        return Config.gameSettings.R;
    }

    public static boolean q() {
        if (Config.gameSettings.O == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int J(String string, int n2) {
        String a2;
        block3: {
            int b2 = n2;
            a2 = string;
            try {
                if (a2 != null) break block3;
                return b2;
            }
            catch (NumberFormatException numberFormatException) {
                return b2;
            }
        }
        a2 = a2.trim();
        return Integer.parseInt(a2);
    }

    public static void J(boolean a2) {
        notify64BitJava = a2;
    }

    public static boolean z() {
        return Config.gameSettings.ga;
    }

    public static boolean o() {
        return Config.gameSettings.gc;
    }

    public static boolean h() {
        return pA.Vc;
    }

    public static DisplayMode J() {
        return desktopDisplayMode;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Object object, Object[] objectArray) {
        int b2;
        void a2;
        Object object2 = object;
        if (a2 == null) {
            return uSa.E != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (Config.equals(object2, var3_4)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    public static int e() {
        return Config.gameSettings.ea;
    }

    public static boolean m() {
        if (Config.d() > vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(U u2, ResourceLocation resourceLocation) {
        block3: {
            Object b2 = resourceLocation;
            U a2 = u2;
            try {
                if (a2.J((ResourceLocation)b2) == null) break block3;
                return vRa.d != 0;
            }
            catch (IOException iOException) {
                return uSa.E != 0;
            }
        }
        return uSa.E != 0;
    }

    public static Tf J() {
        Eoa eoa = Config.minecraft.Ta;
        if (eoa == null) {
            return null;
        }
        if (!minecraft.d()) {
            return null;
        }
        nBa nBa2 = minecraft.J();
        if (nBa2 == null) {
            return null;
        }
        Ty ty2 = eoa.F;
        if (ty2 == null) {
            return null;
        }
        int n2 = ty2.J();
        try {
            nBa2 = nBa2.J(n2);
            return nBa2;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static boolean E() {
        if (Config.gameSettings.ma == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float J() {
        return Config.gameSettings.S;
    }

    public static WKa J() {
        return Config.J().J();
    }

    public static String[] J(String string, String string2) {
        String[] stringArray;
        Object b2 = string2;
        String a2 = string;
        b2 = new StringTokenizer(a2, (String)b2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        Object object = b2;
        while (((StringTokenizer)object).hasMoreTokens()) {
            Object object2 = b2;
            object = object2;
            stringArray = ((StringTokenizer)object2).nextToken();
            arrayList.add(stringArray);
        }
        ArrayList<String[]> arrayList2 = arrayList;
        stringArray = arrayList2.toArray(new String[arrayList2.size()]);
        return stringArray;
    }

    public static double J(double c2, double b2, double a2) {
        if (c2 < b2) {
            return b2;
        }
        if (c2 > a2) {
            return a2;
        }
        return c2;
    }

    public static boolean K() {
        return Config.gameSettings.La;
    }

    public static boolean c() {
        if (Config.gameSettings.ma == 0) {
            if (!Config.gameSettings.u) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (Config.gameSettings.ma == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String J(InputStream inputStream, String string) throws IOException {
        Object b2 = string;
        InputStream a2 = inputStream;
        b2 = new InputStreamReader(a2, (String)b2);
        b2 = new BufferedReader((Reader)b2);
        StringBuffer stringBuffer = new StringBuffer();
        Object object = b2;
        String string2;
        while ((string2 = ((BufferedReader)object).readLine()) != null) {
            stringBuffer.append(string2);
            stringBuffer.append(SPa.O);
            object = b2;
        }
        return stringBuffer.toString();
    }

    public static int J(XF xF2, int n2) {
        int b2 = n2;
        XF a2 = xF2;
        return Config.J(Config.J(Config.J(Config.J(b2 + LQa.c) + a2.getX()) + a2.getZ()) + a2.getY());
    }

    public static boolean B() {
        if (!Config.W()) {
            return uSa.E != 0;
        }
        if (!Config.h() || pA.M()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Cia J() {
        return gameSettings;
    }

    public static int d() {
        return Config.gameSettings.Fa;
    }

    public static boolean L() {
        return Config.gameSettings.fA;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, int n2) {
        ThreadGroup b22;
        String string2;
        block4: {
            string2 = string;
            b22 = Thread.currentThread().getThreadGroup();
            if (b22 != null) break block4;
            return;
        }
        try {
            Thread[] threadArray = new Thread[(b22.activeCount() + NTa.C) * uqa.g];
            b22.enumerate(threadArray, uSa.E != 0);
            for (int i2 = uSa.E; i2 < threadArray.length; ++i2) {
                void a2;
                Thread thread = threadArray[i2];
                if (thread == null || !thread.getName().startsWith(string2)) continue;
                thread.setPriority((int)a2);
            }
        }
        catch (Throwable b22) {
            Config.J(new StringBuilder().insert(5 >> 3, b22.getClass().getName()).append(Xpa.E).append(b22.getMessage()).toString());
        }
    }

    public static boolean b() {
        return Config.gameSettings.GA;
    }

    public static boolean a() {
        return Config.gameSettings.Ca;
    }

    public static boolean H() {
        return Config.gameSettings.XC;
    }

    public static int C() {
        if (minecraftVersionInt < 0) {
            String[] stringArray = Config.J(nua.D, VQa.ja);
            int n2 = uSa.E;
            if (stringArray.length > 0) {
                n2 += Uqa.G * Config.J(stringArray[uSa.E], uSa.E);
            }
            if (stringArray.length > vRa.d) {
                n2 += ySa.T * Config.J(stringArray[vRa.d], uSa.E);
            }
            if (stringArray.length > uqa.g) {
                n2 += vRa.d * Config.J(stringArray[uqa.g], uSa.E);
            }
            minecraftVersionInt = n2;
        }
        return minecraftVersionInt;
    }

    private static Set<Dimension> J(DisplayMode[] displayModeArray) {
        int n2;
        DisplayMode[] displayModeArray2 = displayModeArray;
        HashSet<Dimension> hashSet = new HashSet<Dimension>();
        int n3 = n2 = uSa.E;
        while (n3 < displayModeArray2.length) {
            Object a2 = displayModeArray2[n2];
            a2 = new Dimension(((DisplayMode)a2).getWidth(), ((DisplayMode)a2).getHeight());
            hashSet.add((Dimension)a2);
            n3 = ++n2;
        }
        return hashSet;
    }

    public static void f() {
        Config.A();
        antialiasingLevel = Config.gameSettings.Q;
        Config.D();
        Config.e();
        minecraftThread = Thread.currentThread();
        Config.l();
        pA.J(Kpa.J());
    }

    public static boolean g() {
        if (!Config.W()) {
            return uSa.E != 0;
        }
        if (!Config.h() || pA.D()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static float J(String string, float f2) {
        String a2;
        block3: {
            float b2 = f2;
            a2 = string;
            try {
                if (a2 != null) break block3;
                return b2;
            }
            catch (NumberFormatException numberFormatException) {
                return b2;
            }
        }
        a2 = a2.trim();
        return Float.parseFloat(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(int n2, int n3, int n4) {
        void b2;
        int c2 = n4;
        int a2 = n2;
        if (a2 >= b2 && a2 <= c2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String[] J(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        ArrayList<String> arrayList = new ArrayList<String>();
        Closeable a2 = new InputStreamReader(inputStream2, sqa.E);
        a2 = new BufferedReader((Reader)a2);
        Closeable closeable = a2;
        while (true) {
            String string;
            if ((string = closeable.readLine()) == null) {
                ArrayList<String> arrayList2 = arrayList;
                return arrayList2.toArray(new String[arrayList2.size()]);
            }
            arrayList.add(string);
            closeable = a2;
        }
    }

    public static VJa J(VJa vJa2) {
        Object a2;
        block5: {
            VJa vJa3;
            block4: {
                vJa3 = vJa2;
                try {
                    ResourceLocation resourceLocation = new ResourceLocation(hQa.f);
                    a2 = Config.J(resourceLocation);
                    if (a2 != null) break block4;
                    return vJa3;
                }
                catch (Exception exception) {
                    Config.J(new StringBuilder().insert(2 & 5, exception.getClass().getName()).append(Xpa.E).append(exception.getMessage()).toString());
                    return vJa3;
                }
            }
            a2 = ImageIO.read((InputStream)a2);
            if (a2 != null) break block5;
            return vJa3;
        }
        a2 = new VJa((BufferedImage)a2);
        return a2;
    }

    public static boolean I() {
        return Config.gameSettings.gC;
    }

    public static InputStream J(U u2, ResourceLocation resourceLocation) throws IOException {
        Object b2 = resourceLocation;
        U a2 = u2;
        if ((b2 = a2.J((ResourceLocation)b2)) == null) {
            return null;
        }
        return b2.J();
    }

    public static boolean j() {
        if (Config.gameSettings.td != 0) {
            if (Config.gameSettings.td == uqa.g) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (Config.h() && !pA.yc.J()) {
            return pA.yc.C();
        }
        if (texturePackClouds != 0) {
            if (texturePackClouds == uqa.g) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return Config.gameSettings.u;
    }

    public static boolean F() {
        return Config.gameSettings.ua;
    }

    public static String J(String a2) {
        if (a2 == null) {
            return Mqa.y;
        }
        return a2;
    }

    public static int[] J(int[] nArray, int n2) {
        int b2 = n2;
        int[] a2 = nArray;
        int[] nArray2 = new int[vRa.d];
        nArray2[uSa.E] = b2;
        return Config.J(a2, nArray2);
    }

    public static boolean k() {
        return Config.gameSettings.w;
    }

    public static boolean G() {
        if (Config.gameSettings.DA == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void J(Cia a2) {
        if (gameSettings == null) {
            gameSettings = a2;
            desktopDisplayMode = Display.getDesktopDisplayMode();
            Config.i();
        }
    }

    public static void J(String a2) {
        LOGGER.warn(new StringBuilder().insert(5 >> 3, qta.W).append(a2).toString());
    }

    public static boolean D() {
        return Config.gameSettings.Ra;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        if (a2 < b2) {
            return (float)b2;
        }
        if (a2 > c2) {
            return c2;
        }
        return a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int l() {
        switch (Config.gameSettings.U) {
            case 0: {
                return Spa.Ha;
            }
            case 1: {
                return Spa.Ha;
            }
            case 2: {
                if (Config.y()) {
                    return yta.t;
                }
                return Spa.Ha;
            }
            case 3: {
                if (Config.y()) {
                    return ITa.n;
                }
                return Spa.Ha;
            }
        }
        return Spa.Ha;
    }

    public static boolean A() {
        if (Config.gameSettings.ea > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean i() {
        if (Config.gameSettings.hc != uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static IResource J(ResourceLocation a2) throws IOException {
        return minecraft.J().J(a2);
    }

    private static Td J() {
        Td td2;
        if (GLContext.getCapabilities().OpenGL44) {
            return new Td(AQa.P, AQa.P);
        }
        if (GLContext.getCapabilities().OpenGL43) {
            return new Td(AQa.P, yRa.d);
        }
        if (GLContext.getCapabilities().OpenGL42) {
            return new Td(AQa.P, uqa.g);
        }
        if (GLContext.getCapabilities().OpenGL41) {
            return new Td(AQa.P, vRa.d);
        }
        if (GLContext.getCapabilities().OpenGL40) {
            return new Td(AQa.P, uSa.E);
        }
        if (GLContext.getCapabilities().OpenGL33) {
            return new Td(yRa.d, yRa.d);
        }
        if (GLContext.getCapabilities().OpenGL32) {
            return new Td(yRa.d, uqa.g);
        }
        if (GLContext.getCapabilities().OpenGL31) {
            return new Td(yRa.d, vRa.d);
        }
        if (GLContext.getCapabilities().OpenGL30) {
            return new Td(yRa.d, uSa.E);
        }
        if (GLContext.getCapabilities().OpenGL21) {
            return new Td(uqa.g, vRa.d);
        }
        if (GLContext.getCapabilities().OpenGL20) {
            return new Td(uqa.g, uSa.E);
        }
        if (GLContext.getCapabilities().OpenGL15) {
            return new Td(vRa.d, tTa.h);
        }
        if (GLContext.getCapabilities().OpenGL14) {
            return new Td(vRa.d, AQa.P);
        }
        if (GLContext.getCapabilities().OpenGL13) {
            return new Td(vRa.d, yRa.d);
        }
        if (GLContext.getCapabilities().OpenGL12) {
            return new Td(vRa.d, uqa.g);
        }
        if (GLContext.getCapabilities().OpenGL11) {
            td2 = new Td(vRa.d, vRa.d);
            return td2;
        }
        td2 = new Td(vRa.d, uSa.E);
        return td2;
    }

    public static boolean M() {
        return Config.gameSettings.CC;
    }

    public static DefaultResourcePack J() {
        if (defaultResourcePackLazy == null) {
            dGa dGa2;
            Kpa kpa2 = Kpa.J();
            defaultResourcePackLazy = kpa2.ya;
            if (defaultResourcePackLazy == null && (dGa2 = kpa2.J()) != null) {
                defaultResourcePackLazy = (DefaultResourcePack)dGa2.k;
            }
        }
        return defaultResourcePackLazy;
    }

    public static boolean e() {
        if (Config.gameSettings.za != yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int f() {
        if (System.getenv(NSa.Da) != null) {
            return ysa.s;
        }
        return fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    public static Object[] J(Object[] objectArray, Object object, int n2) {
        Object[] b2;
        void a2;
        Object[] objectArray2 = objectArray;
        ArrayList<Object> c2 = new ArrayList<Object>(Arrays.asList(objectArray2));
        c2.add((int)a2, b2);
        b2 = (Object[])Array.newInstance(objectArray2.getClass().getComponentType(), c2.size());
        return c2.toArray(b2);
    }

    public static boolean d() {
        if (Config.gameSettings.NA == 0) {
            return Config.gameSettings.u;
        }
        if (Config.gameSettings.NA == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String J(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        if (nArray2 == null) {
            return Mqa.y;
        }
        StringBuffer stringBuffer = new StringBuffer(nArray2.length * tTa.h);
        int n2 = a2 = uSa.E;
        while (n2 < nArray2.length) {
            int n3 = nArray2[a2];
            if (a2 > 0) {
                stringBuffer.append(TOa.n);
            }
            stringBuffer.append(String.valueOf(n3));
            n2 = ++a2;
        }
        return stringBuffer.toString();
    }

    public static int J() {
        if (gameSettings == null) {
            return NTa.C;
        }
        return Config.gameSettings.kc;
    }

    public static Fia J() {
        return Config.minecraft.J().J;
    }

    public static boolean C() {
        return occlusionAvailable;
    }

    public static boolean l() {
        return Config.gameSettings.ca;
    }

    public static boolean f() {
        if (Config.gameSettings.cA != uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J() {
        if (Config.gameSettings.DA != yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static void J() {
        texturePackClouds = uSa.E;
        U u2 = Config.J();
        if (u2 != null) {
            Object object;
            block9: {
                InputStream inputStream;
                block8: {
                    inputStream = u2.J(new ResourceLocation(ura.fa)).J();
                    if (inputStream != null) break block8;
                    return;
                }
                object = new Properties();
                Properties properties = object;
                properties.load(inputStream);
                inputStream.close();
                object = properties.getProperty(dpa.fa);
                if (object != null) break block9;
                return;
            }
            try {
                Config.f(new StringBuilder().insert(3 & 4, nua.T).append((String)object).toString());
                object = ((String)object).toLowerCase();
                if (((String)object).equals(wOa.m)) {
                    texturePackClouds = vRa.d;
                }
                if (((String)object).equals(JQa.n)) {
                    texturePackClouds = uqa.g;
                }
                if (((String)object).equals(kra.Ea)) {
                    texturePackClouds = yRa.d;
                    return;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

