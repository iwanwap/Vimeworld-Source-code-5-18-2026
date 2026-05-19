/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Bsa
 *  D
 *  DQa
 *  ERa
 *  FPa
 *  Fpa
 *  Gua
 *  Lra
 *  NTa
 *  Ppa
 *  QSa
 *  Sqa
 *  TPa
 *  Tpa
 *  Vua
 *  WSa
 *  Wsa
 *  XSa
 *  XTa
 *  Xsa
 *  Ypa
 *  Zta
 *  Zua
 *  aPa
 *  aQa
 *  cQa
 *  cra
 *  dpa
 *  fsa
 *  iPa
 *  jRa
 *  jpa
 *  lqa
 *  oqa
 *  pPa
 *  pY
 *  pua
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  zTa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public final class pY_2
extends Enum<pY>
implements D {
    private static final /* synthetic */ pY[] $VALUES;
    public static final /* enum */ pY DARK_RED;
    public static final /* enum */ pY DARK_GRAY;
    public static final /* enum */ pY GLITCHY;
    public static final /* enum */ pY UNDERLINE;
    private final String controlString;
    public static final /* enum */ pY DARK_GREEN;
    public static final /* enum */ pY EMIT;
    private final boolean fancyStyling;
    public static final /* enum */ pY OBFUSCATED;
    public static final /* enum */ pY WAVING;
    private final char formattingCode;
    private final int colorIndex;
    public static final /* enum */ pY LIGHT_PURPLE;
    public static final /* enum */ pY WHITE;
    private static final Pattern formattingCodePattern;
    public static final /* enum */ pY BLACK;
    public static final /* enum */ pY YELLOW;
    public static final /* enum */ pY AQUA;
    private static final Map<String, pY> nameMapping;
    public static final /* enum */ pY ABERRATION;
    public static final /* enum */ pY FLIP;
    private final String name;
    public static final /* enum */ pY GOLD;
    public static final /* enum */ pY RESET;
    public static final /* enum */ pY SHAKING;
    public static final /* enum */ pY DARK_BLUE;
    public static final /* enum */ pY BLUE;
    public static final /* enum */ pY GREEN;
    public static final /* enum */ pY ITALIC;
    public static final /* enum */ pY RAINBOW;
    public static final /* enum */ pY DARK_AQUA;
    public static final /* enum */ pY ANIMATED_GRADIENT;
    public static final /* enum */ pY GRAY;
    public static final /* enum */ pY BOLD;
    public static final /* enum */ pY DARK_PURPLE;
    public static final /* enum */ pY STRIKETHROUGH;
    public static final /* enum */ pY RED;
    public static final /* enum */ pY SHIMMER;

    private static String func_175745_c(String a2) {
        return a2.toLowerCase().replaceAll(eta.z, Mqa.y);
    }

    public static String getTextWithoutFormattingCodes(String a2) {
        if (a2 == null) {
            return null;
        }
        return formattingCodePattern.matcher(a2).replaceAll(Mqa.y);
    }

    public static pY valueOf(String a2) {
        return Enum.valueOf(pY_2.class, a2);
    }

    public boolean isColor() {
        pY_2 a2;
        if (!a2.fancyStyling && a2 != RESET) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pY func_175744_a(int n2) {
        int a2;
        int n3 = n2;
        if (n3 < 0) {
            return RESET;
        }
        pY[] pYArray = pY_2.values();
        int n4 = pYArray.length;
        int n5 = a2 = uSa.E;
        while (n5 < n4) {
            pY pY2 = pYArray[a2];
            if (pY2.getColorIndex() == n3) {
                return pY2;
            }
            n5 = ++a2;
        }
        return null;
    }

    public String getFriendlyName() {
        pY_2 a2;
        return a2.name().toLowerCase();
    }

    public static pY[] values() {
        return (pY[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private pY_2(String string2, char c2, boolean bl) {
        void d2;
        void b2;
        void c3;
        boolean bl2 = bl;
        pY_2 a2 = this;
        a2((String)c3, (char)b2, (boolean)d2, pua.o);
    }

    public int getColorIndex() {
        pY_2 a2;
        return a2.colorIndex;
    }

    /*
     * WARNING - void declaration
     */
    private pY_2(String string2, char c2, int n3) {
        void d2;
        void b2;
        void c3;
        int n4 = n3;
        pY_2 a2 = this;
        a2((String)c3, (char)b2, uSa.E != 0, (int)d2);
    }

    /*
     * WARNING - void declaration
     */
    public static Collection<String> getValidValues(boolean bl, boolean bl2) {
        int b2;
        boolean bl3 = bl;
        ArrayList<String> arrayList = Lists.newArrayList();
        pY[] pYArray = pY_2.values();
        int n2 = pYArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            pY pY2 = pYArray[b2];
            if (!(pY2.isColor() && !bl3 || pY2.isFancyStyling() && a2 == false)) {
                arrayList.add(pY2.getFriendlyName());
            }
            n3 = ++b2;
        }
        return arrayList;
    }

    public static pY getValueByName(String a2) {
        if (a2 == null) {
            return null;
        }
        return (pY_2)nameMapping.get(pY_2.func_175745_c(a2));
    }

    static {
        int n2;
        BLACK = new pY_2(vsa.h, (char)QSa.p, uSa.E);
        DARK_BLUE = new pY_2(Asa.Ha, (char)jRa.q, vRa.d);
        DARK_GREEN = new pY_2(Zua.e, (char)vpa.o, uqa.g);
        DARK_AQUA = new pY_2(jRa.a, (char)cPa.Q, yRa.d);
        DARK_RED = new pY_2(Gua.n, (char)FPa.F, AQa.P);
        DARK_PURPLE = new pY_2(MRa.e, (char)Bpa.Z, tTa.h);
        GOLD = new pY_2(cra.h, (char)GPa.C, uua.p);
        GRAY = new pY_2(Qpa.f, (char)Fpa.ca, XTa.W);
        DARK_GRAY = new pY_2(vQa.j, (char)Upa.D, Yqa.i);
        BLUE = new pY_2(aPa.T, (char)KSa.x, WOa.fa);
        GREEN = new pY_2(vqa.E, (char)Hta.k, NTa.C);
        AQUA = new pY_2(QSa.I, (char)dpa.A, pPa.f);
        RED = new pY_2(iPa.j, (char)zOa.v, lqa.s);
        LIGHT_PURPLE = new pY_2(aua.ca, (char)ySa.T, uua.s);
        YELLOW = new pY_2(PRa.h, (char)zTa.C, hpa.Z);
        WHITE = new pY_2(cra.e, (char)jRa.v, Ypa.A);
        OBFUSCATED = new pY_2(Sqa.t, (char)jpa.E, vRa.d != 0);
        SHIMMER = new pY_2(Asa.d, (char)pta.ba, vRa.d != 0);
        BOLD = new pY_2(Tpa.P, (char)Jra.o, vRa.d != 0);
        STRIKETHROUGH = new pY_2(MTa.Da, (char)rSa.i, vRa.d != 0);
        UNDERLINE = new pY_2(DQa.g, (char)Iqa.M, vRa.d != 0);
        ITALIC = new pY_2(aQa.B, (char)fPa.z, vRa.d != 0);
        RAINBOW = new pY_2(mSa.W, (char)yta.g, vRa.d != 0);
        GLITCHY = new pY_2(Ira.Fa, (char)XSa.C, vRa.d != 0);
        WAVING = new pY_2(Wsa.s, (char)rQa.s, vRa.d != 0);
        ABERRATION = new pY_2(eua.E, (char)Ppa.K, vRa.d != 0);
        SHAKING = new pY_2(Xsa.Ja, (char)Zta.Q, vRa.d != 0);
        EMIT = new pY_2(hpa.P, (char)Bsa.E, vRa.d != 0);
        FLIP = new pY_2(fsa.F, (char)Zta.Ma, vRa.d != 0);
        ANIMATED_GRADIENT = new pY_2(Bra.n, (char)APa.J, vRa.d != 0);
        RESET = new pY_2(Vua.u, (char)WSa.o, pua.o);
        pY_2[] pY_2Array = new pY_2[tua.U];
        pY_2Array[uSa.E] = BLACK;
        pY_2Array[vRa.d] = DARK_BLUE;
        pY_2Array[uqa.g] = DARK_GREEN;
        pY_2Array[yRa.d] = DARK_AQUA;
        pY_2Array[AQa.P] = DARK_RED;
        pY_2Array[tTa.h] = DARK_PURPLE;
        pY_2Array[uua.p] = GOLD;
        pY_2Array[XTa.W] = GRAY;
        pY_2Array[Yqa.i] = DARK_GRAY;
        pY_2Array[WOa.fa] = BLUE;
        pY_2Array[NTa.C] = GREEN;
        pY_2Array[pPa.f] = AQUA;
        pY_2Array[lqa.s] = RED;
        pY_2Array[uua.s] = LIGHT_PURPLE;
        pY_2Array[hpa.Z] = YELLOW;
        pY_2Array[Ypa.A] = WHITE;
        pY_2Array[ERa.C] = OBFUSCATED;
        pY_2Array[yta.Ka] = SHIMMER;
        pY_2Array[yOa.B] = BOLD;
        pY_2Array[wOa.t] = STRIKETHROUGH;
        pY_2Array[kTa.j] = UNDERLINE;
        pY_2Array[wOa.h] = ITALIC;
        pY_2Array[cQa.o] = RAINBOW;
        pY_2Array[AQa.ba] = GLITCHY;
        pY_2Array[osa.c] = WAVING;
        pY_2Array[kTa.g] = ABERRATION;
        pY_2Array[ITa.E] = SHAKING;
        pY_2Array[Lra.e] = EMIT;
        pY_2Array[EPa.O] = FLIP;
        pY_2Array[ITa.A] = ANIMATED_GRADIENT;
        pY_2Array[Fsa.d] = RESET;
        $VALUES = pY_2Array;
        nameMapping = Maps.newHashMap();
        formattingCodePattern = Pattern.compile(new StringBuilder().insert(3 >> 2, tSa.X).append(String.valueOf((char)TPa.Aa)).append(oqa.U).toString());
        pY[] pYArray = pY_2.values();
        int n3 = pYArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            pY pY2 = pYArray[n2];
            nameMapping.put(pY_2.func_175745_c(pY2.name), pY2);
            n4 = ++n2;
        }
    }

    public boolean isFancyStyling() {
        pY_2 a2;
        return a2.fancyStyling;
    }

    /*
     * WARNING - void declaration
     */
    private pY_2(String string2, char c2, boolean bl, int n3) {
        void a2;
        void b2;
        void e2;
        void d2;
        pY_2 c3;
        char c4 = c2;
        pY_2 pY_22 = c3 = this;
        pY_2 pY_23 = c3;
        pY_23.name = d2;
        pY_23.formattingCode = e2;
        pY_22.fancyStyling = b2;
        pY_22.colorIndex = a2;
        pY_2 pY_24 = c3;
        pY_22.controlString = FRa.K + (char)e2;
    }

    public String toString() {
        pY_2 a2;
        return a2.controlString;
    }
}

