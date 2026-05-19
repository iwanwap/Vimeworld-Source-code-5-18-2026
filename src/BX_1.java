/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CY
 *  CZ
 *  Pqa
 *  fpa
 *  gEa
 *  gHa
 *  ld
 *  nka
 *  psa
 *  uKa
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public final class BX_1 {
    private static final Logger j = LogManager.getLogger();
    private static int[] J;
    private static IntBuffer A;
    private static final DateFormat I;

    static {
        I = new SimpleDateFormat(fpa.P);
    }

    private static File J(File file) {
        File file2 = file;
        String string = I.format(new Date()).toString();
        int a2 = vRa.d;
        while (true) {
            File file3 = new File(file2, string + (a2 == vRa.d ? Mqa.y : new StringBuilder().insert(5 >> 3, IPa.W).append(a2).toString()) + KPa.C);
            if (!file3.exists()) {
                return file3;
            }
            ++a2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static ld J(File var0, String var1_3, int var2_4, int var3_5, gHa var4_6) {
        block12: {
            block11: {
                var6_7 = var0;
                var5_8 = new File(var6_7, Eqa.y);
                var5_8.mkdir();
                if (nka.f()) {
                    v0 = a;
                    c = v0.C;
                    b = v0.m;
                }
                e = c * b;
                if (BX_1.A == null || BX_1.A.capacity() < e) {
                    BX_1.A = BufferUtils.createIntBuffer((int)e);
                    BX_1.J = new int[e];
                }
                GL11.glPixelStorei(Pqa.J, vRa.d);
                GL11.glPixelStorei(zua.j, vRa.d);
                BX_1.A.clear();
                if (!nka.f()) break block11;
                uKa.C((int)a.i);
                GL11.glGetTexImage(BQa.Z, uSa.E, NSa.U, aua.N, BX_1.A);
                ** GOTO lbl27
            }
            GL11.glReadPixels(uSa.E, uSa.E, c, b, NSa.U, aua.N, BX_1.A);
lbl27:
            // 2 sources

            BX_1.A.get(BX_1.J);
            gLa.f(BX_1.J, c, b);
            e = null;
            if (!nka.f()) break block12;
            v1 = a;
            e = new BufferedImage(v1.M, v1.k, vRa.d);
            v2 = a;
            v3 = var8_12 = (var7_10 = v2.m - v2.k);
            while (v3 < a.m) {
                v4 = uSa.E;
                while (v4 < a.M) {
                    v5 = var9_14;
                    v6 = var8_12 * a.C + var9_14;
                    e.setRGB(v5, var8_12 - var7_10, BX_1.J[v6]);
                    v4 = ++var9_14;
                }
                ** break block13
            }
            ** GOTO lbl55
lbl-1000:
            // 1 sources

            {
                v3 = ++var8_12;
                continue;
                break;
            }
        }
        try {
            e = new BufferedImage(c, b, vRa.d);
            e.setRGB(uSa.E, uSa.E, c, b, BX_1.J, uSa.E, c);
lbl55:
            // 2 sources

            if (d == null) {
                var7_11 = BX_1.J(var5_8);
                v7 = e;
            } else {
                var7_11 = new File(var5_8, (String)d);
                v7 = e;
            }
            ImageIO.write((RenderedImage)v7, GPa.l, var7_11);
            var8_13 = new CY(var7_11.getName());
            var8_13.J().J(new PEa(gEa.OPEN_FILE, var7_11.getAbsolutePath()));
            var8_13.J().F(Boolean.valueOf((boolean)vRa.d));
            v8 = new Object[vRa.d];
            v8[uSa.E] = var8_13;
            return new CZ(Bsa.l, v8);
        }
        catch (Exception var5_9) {
            BX_1.j.warn(QTa.s, (Throwable)var5_9);
            v9 = new Object[vRa.d];
            v9[uSa.E] = var5_9.getMessage();
            return new CZ(psa.z, v9);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ld J(File file, int n2, int n3, gHa gHa2) {
        void b2;
        void c2;
        File d2 = gHa2;
        File a2 = file;
        return BX_1.J(a2, null, (int)c2, (int)b2, (gHa)d2);
    }

    public BX_1() {
        BX_1 a2;
    }
}

