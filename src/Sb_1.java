/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qsa
 *  SOa
 *  SQa
 *  VQa
 *  Ysa
 *  pPa
 *  qta
 *  wra
 *  xOa
 *  yQa
 *  zTa
 *  zsa
 */
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sb_1 {
    public static final String d = "MC_OS_WINDOWS";
    public static final String a = "MC_GL_RENDERER_INTEL";
    public static final String b = "MC_GL_VENDOR_ATI";
    private static String l = Asa.w;
    public static final String e = "MC_GL_RENDERER_MESA";
    public static final String G = "MC_OS_OTHER";
    public static final String D = "MC_GL_RENDERER_GEFORCE";
    public static final String f = "MC_GL_VENDOR_XORG";
    public static final String F = "MC_GL_RENDERER_RADEON";
    public static final String g = "MC_GL_RENDERER_QUADRO";
    public static final String L = "MC_GL_RENDERER_OTHER";
    public static final String E = "MC_OS_MAC";
    public static final String m = "MC_GL_VENDOR_NVIDIA";
    public static final String C = "MC_GL_VERSION";
    public static final String i = "MC_GL_RENDERER_GALLIUM";
    public static final String M = "MC_OS_LINUX";
    public static final String k = "MC_VERSION";
    public static final String j = "MC_GL_VENDOR_OTHER";
    public static final String J = "MC_GLSL_VERSION";
    private static String[] A;
    public static final String I = "MC_GL_VENDOR_INTEL";

    public static String C() {
        return l;
    }

    public static String l() {
        String string = Config.openGlRenderer;
        if (string == null) {
            return pPa.U;
        }
        if ((string = string.toLowerCase()).startsWith(Asa.F)) {
            return xqa.p;
        }
        if (string.startsWith(Psa.Ka)) {
            return xqa.p;
        }
        if (string.startsWith(xTa.V)) {
            return xqa.p;
        }
        if (string.startsWith(SQa.X)) {
            return zTa.J;
        }
        if (string.startsWith(Gta.Ka)) {
            return xra.Ka;
        }
        if (string.startsWith(WPa.Aa)) {
            return rta.q;
        }
        if (string.startsWith(SOa.ga)) {
            return rta.q;
        }
        if (string.startsWith(zsa.f)) {
            return Iqa.Q;
        }
        if (string.startsWith(Ysa.z)) {
            return Iqa.Q;
        }
        if (string.startsWith(qta.Ga)) {
            return tpa.Ka;
        }
        return pPa.U;
    }

    public Sb_1() {
        Sb_1 a2;
    }

    public static String[] J() {
        if (A == null) {
            int n2;
            String[] stringArray = Config.l();
            String[] stringArray2 = new String[stringArray.length];
            int n3 = n2 = uSa.E;
            while (n3 < stringArray.length) {
                int n4 = n2;
                int n5 = n2++;
                stringArray2[n5] = l + stringArray[n5];
                n3 = n2;
            }
            A = stringArray2;
        }
        return A;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String f() {
        Xy xy2 = maa.J();
        switch (zb.I[xy2.ordinal()]) {
            case 1: {
                return sra.b;
            }
            case 2: {
                return xOa.R;
            }
            case 3: {
                return WOa.Aa;
            }
        }
        return rRa.Ka;
    }

    public static String J() {
        String string = Config.openGlVendor;
        if (string == null) {
            return wra.H;
        }
        if ((string = string.toLowerCase()).startsWith(Psa.Ka)) {
            return Qsa.Q;
        }
        if (string.startsWith(Gta.Ka)) {
            return POa.U;
        }
        if (string.startsWith(SOa.ga)) {
            return VQa.f;
        }
        if (string.startsWith(rRa.t)) {
            return yQa.W;
        }
        return wra.H;
    }
}

