/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  Cia
 *  ERa
 *  Ge
 *  NPa
 *  RPa
 *  SRa
 *  ZRa
 *  fg
 *  lPa
 *  pPa
 *  pua
 *  uOa
 *  uQa
 *  vPa
 *  vRa
 *  yra
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import ru.obfuscator.KeepClassName;

public final class Jg_1 {
    private static Ge[] I = null;

    /*
     * WARNING - void declaration
     */
    private static byte[] f(String string, int n2) {
        Object b22;
        Cia cia2;
        block9: {
            block8: {
                String string2 = string;
                cia2 = Config.J();
                ResourceLocation resourceLocation = new ResourceLocation(string2);
                b22 = Config.J(resourceLocation);
                if (b22 != null) break block8;
                return null;
            }
            Object object = b22;
            b22 = Jg_1.J((InputStream)object);
            ((InputStream)object).close();
            if (b22 != null) break block9;
            return null;
        }
        try {
            void a22;
            if (a22 > 0 && ((BufferedImage)b22).getWidth() != a22) {
                Object object = b22;
                double d2 = ((BufferedImage)b22).getHeight() / ((BufferedImage)object).getWidth();
                int n3 = (int)((double)a22 * d2);
                b22 = Jg_1.J((BufferedImage)object, (int)a22, n3);
            }
            Object object = b22;
            int n4 = ((BufferedImage)object).getWidth();
            int n5 = ((BufferedImage)object).getHeight();
            int[] nArray = new int[n4 * n5];
            byte[] a22 = new byte[n4 * n5 * AQa.P];
            ((BufferedImage)object).getRGB(uSa.E, uSa.E, n4, n5, nArray, uSa.E, n4);
            int b22 = uSa.E;
            int n6 = b22;
            while (n6 < nArray.length) {
                n4 = nArray[b22] >> osa.c & osa.Ja;
                n5 = nArray[b22] >> ERa.C & osa.Ja;
                int n7 = nArray[b22] >> Yqa.i & osa.Ja;
                int n8 = nArray[b22] & osa.Ja;
                if (cia2 != null && cia2.B) {
                    int n9 = (n5 * Fsa.d + n7 * lPa.p + n8 * pPa.f) / ySa.T;
                    int n10 = (n5 * Fsa.d + n7 * NPa.e) / ySa.T;
                    int n11 = (n5 * Fsa.d + n8 * NPa.e) / ySa.T;
                    n5 = n9;
                    n7 = n10;
                    n8 = n11;
                }
                int n12 = b22;
                a22[b22 * AQa.P + uSa.E] = (byte)n5;
                a22[b22 * AQa.P + vRa.d] = (byte)n7;
                a22[n12 * AQa.P + uqa.g] = (byte)n8;
                a22[n12 * AQa.P + yRa.d] = (byte)n4;
                n6 = ++b22;
            }
            return a22;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] J(String string, int n2) {
        void a2;
        String string2 = string;
        byte[] byArray = Jg_1.f(string2, (int)a2);
        Object b2 = byArray;
        if (byArray == null) {
            b2 = Jg_1.f(new StringBuilder().insert(3 ^ 3, ZRa.W).append(string2).toString(), (int)a2);
        }
        return b2;
    }

    public static Ge J(Properties properties, ResourceLocation resourceLocation) {
        Properties properties2;
        Properties properties3 = properties2 = properties;
        String string = properties3.getProperty(RPa.Y);
        Object b2 = properties3.getProperty(uQa.S);
        int n2 = Config.J(properties3.getProperty(rRa.X), pua.o);
        int n3 = Config.J(properties3.getProperty(uOa.Ja), pua.o);
        int n4 = Config.J(properties3.getProperty(Zqa.q), pua.o);
        int n5 = Config.J(properties3.getProperty(opa.h), pua.o);
        if (string != null && b2 != null) {
            if (n2 >= 0 && n3 >= 0 && n4 >= 0 && n5 >= 0) {
                Object a2;
                string = string.trim();
                b2 = ((String)b2).trim();
                a2 = Cg.J((String)((ResourceLocation)a2).J());
                string = Cg.J((String)string, (String)a2);
                b2 = Cg.J((String)b2, (String)a2);
                byte[] byArray = Jg_1.J(string, n4);
                a2 = byArray;
                if (byArray == null) {
                    Config.J(new StringBuilder().insert(3 ^ 3, yra.Ha).append((String)b2).toString());
                    return null;
                }
                ResourceLocation resourceLocation2 = new ResourceLocation((String)b2);
                if (!Config.f(resourceLocation2)) {
                    Config.J(new StringBuilder().insert(2 & 5, Nra.Ka).append((String)b2).toString());
                    return null;
                }
                return new Ge(string, (byte[])a2, (String)b2, resourceLocation2, n2, n3, n4, n5, properties2, vRa.d);
            }
            Config.J(lQa.d);
            return null;
        }
        Config.J(vPa.G);
        return null;
    }

    public static Ge[] J(IResourcePack[] iResourcePackArray) {
        int a22;
        IResourcePack[] iResourcePackArray2 = iResourcePackArray;
        ArrayList<Ge> arrayList = new ArrayList<Ge>();
        int n2 = a22 = uSa.E;
        while (n2 < iResourcePackArray2.length) {
            Ge[] geArray = Jg_1.J(iResourcePackArray2[a22]);
            if (geArray != null) {
                arrayList.addAll(Arrays.asList(geArray));
            }
            n2 = ++a22;
        }
        ArrayList<Ge> arrayList2 = arrayList;
        Ge[] a22 = arrayList2.toArray(new Ge[arrayList2.size()]);
        return a22;
    }

    public static void C() {
        if (I != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < I.length) {
                I[n2++].J();
                n3 = n2;
            }
        }
    }

    public static void l() {
        I = null;
        I = Jg_1.J(Config.J());
        if (Config.S()) {
            Jg_1.C();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static BufferedImage J(BufferedImage bufferedImage, int n2, int n3) {
        Object c2;
        void a2;
        void b2;
        BufferedImage bufferedImage2 = bufferedImage;
        BufferedImage bufferedImage3 = new BufferedImage((int)b2, (int)a2, uqa.g);
        Object object = c2 = bufferedImage3.createGraphics();
        ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        ((Graphics)object).drawImage(bufferedImage2, uSa.E, uSa.E, (int)b2, (int)a2, null);
        return bufferedImage3;
    }

    public static void f() {
        I = null;
    }

    private static BufferedImage J(InputStream inputStream) throws IOException {
        InputStream inputStream2;
        InputStream inputStream3 = inputStream2 = inputStream;
        BufferedImage a2 = ImageIO.read(inputStream3);
        inputStream3.close();
        return a2;
    }

    public static void J() {
        if (I != null && Config.S()) {
            Jg_1.C();
        }
    }

    public static Ge[] J(IResourcePack iResourcePack) {
        int n2;
        IResourcePack iResourcePack2 = iResourcePack;
        String[] stringArray = fg.J((IResourcePack)iResourcePack2, (String)GPa.m, (String)Jpa.R, (String[])null);
        if (stringArray.length <= 0) {
            return null;
        }
        ArrayList<InputStream> arrayList = new ArrayList<InputStream>();
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            block6: {
                InputStream inputStream;
                block7: {
                    Properties properties;
                    String string = stringArray[n2];
                    Config.f(new StringBuilder().insert(3 >> 2, Upa.x).append(string).toString());
                    KeepClassName a2 = new ResourceLocation(string);
                    inputStream = iResourcePack2.J((ResourceLocation)a2);
                    Properties properties2 = properties = new Properties();
                    properties2.load(inputStream);
                    inputStream = Jg_1.J(properties2, (ResourceLocation)a2);
                    if (inputStream == null) break block6;
                    if (Config.J(new ResourceLocation(inputStream.f())) == iResourcePack2) break block7;
                    Config.f(new StringBuilder().insert(3 >> 2, Jra.Aa).append(string).append(SRa.z).toString());
                }
                try {
                    arrayList.add(inputStream);
                }
                catch (FileNotFoundException a2) {
                    Config.J(new StringBuilder().insert(3 >> 2, CRa.A).append(a2.getMessage()).toString());
                }
                catch (IOException a2) {
                    a2.printStackTrace();
                }
            }
            n3 = ++n2;
        }
        ArrayList<InputStream> arrayList2 = arrayList;
        Ge[] geArray = arrayList2.toArray(new Ge[arrayList2.size()]);
        return geArray;
    }

    public Jg_1() {
        Jg_1 a2;
    }
}

