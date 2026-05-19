/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bsa
 *  Cia
 *  DW
 *  ERa
 *  Fpa
 *  JPa
 *  JTa
 *  Kna
 *  Kpa
 *  Lra
 *  MQa
 *  NPa
 *  NQa
 *  NTa
 *  QSa
 *  Qta
 *  Sf
 *  TPa
 *  U
 *  WSa
 *  Wsa
 *  XE
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  aJa
 *  aKa
 *  aPa
 *  aSa
 *  aoa
 *  aqa
 *  asa
 *  bpa
 *  cI
 *  cQa
 *  cRa
 *  dQa
 *  hra
 *  if
 *  j
 *  jRa
 *  jpa
 *  kg
 *  kpa
 *  kta
 *  lPa
 *  mka
 *  pKa
 *  pPa
 *  pqa
 *  psa
 *  pua
 *  q
 *  qta
 *  qy
 *  uKa
 *  uRa
 *  vPa
 *  vRa
 *  wOa
 */
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.io.IOUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kna_2
implements j,
q {
    public ResourceLocation P;
    public int u;
    public Cia O;
    private boolean t;
    private boolean R;
    private static final String Q = "CL_00000660";
    private boolean N;
    private final float[] T;
    public Random p;
    public boolean n;
    private float s;
    private float w;
    public int[] W;
    private boolean q;
    private float x;
    private float v;
    private boolean o;
    private float h;
    private float K;
    private boolean H;
    public float c;
    private float B;
    private int d;
    private float a;
    private boolean b;
    private boolean l;
    private final aJa e;
    private char G;
    private boolean D;
    public static boolean f = vRa.d;
    private boolean F;
    private final int[] g;
    private static final ResourceLocation[] L = new ResourceLocation[hra.Ja];
    private boolean E;
    private final byte[] m;
    private float C;
    private ResourceLocation i;
    private boolean M;
    private static final String k = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000";
    private boolean j;
    private long J;
    private boolean A;
    private boolean I;

    public void f(boolean bl) {
        boolean b2 = bl;
        Kna_2 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    private float f(char c2, boolean bl) {
        void a22;
        char c222 = c2;
        Kna_2 b2 = this;
        if (b2.m[c222] == 0) {
            return JPa.N;
        }
        int n2 = c222 / hra.Ja;
        Kna_2 kna_2 = b2;
        kna_2.J(n2);
        n2 = kna_2.m[c222] >>> AQa.P;
        int n3 = kna_2.m[c222] & Ypa.A;
        float f2 = n2 &= Ypa.A;
        float f3 = n3 + vRa.d;
        float f4 = (float)(c222 % ERa.C * ERa.C) + f2;
        float c222 = (c222 & osa.Ja) / ERa.C * ERa.C;
        float f5 = f3 - f2 - WRa.e;
        float a22 = a22 != false ? pqa.r : JPa.N;
        GL11.glBegin(tTa.h);
        GL11.glTexCoord2f(f4 / Fpa.q, c222 / Fpa.q);
        float f6 = f4;
        Kna_2 kna_22 = b2;
        GL11.glVertex3f(b2.v + a22, kna_22.K, JPa.N);
        GL11.glTexCoord2f(f6 / Fpa.q, (c222 + MRa.C) / Fpa.q);
        Kna_2 kna_23 = b2;
        GL11.glVertex3f(kna_22.v - a22, kna_23.K + zpa.M, JPa.N);
        GL11.glTexCoord2f((f6 + f5) / Fpa.q, c222 / Fpa.q);
        Kna_2 kna_24 = b2;
        GL11.glVertex3f(kna_23.v + f5 / kta.v + a22, kna_24.K, JPa.N);
        GL11.glTexCoord2f((f6 + f5) / Fpa.q, (c222 + MRa.C) / Fpa.q);
        GL11.glVertex3f(kna_24.v + f5 / kta.v - a22, b2.K + zpa.M, JPa.N);
        GL11.glEnd();
        return (f3 - f2) / kta.v + pqa.r;
    }

    private void C() {
        Kna_2 a2;
        Kna_2 kna_2 = a2;
        kna_2.D = uSa.E;
        kna_2.F = uSa.E;
        kna_2.H = uSa.E;
        kna_2.N = uSa.E;
        kna_2.j = uSa.E;
        kna_2.t = uSa.E;
        kna_2.b = uSa.E;
        kna_2.M = uSa.E;
        kna_2.E = uSa.E;
        kna_2.l = uSa.E;
        kna_2.I = uSa.E;
        kna_2.G = (char)uSa.E;
        kna_2.q = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, boolean bl) {
        void b2;
        int n2;
        float f2;
        float f3;
        Kna_2 kna_2 = this;
        long l2 = OT.e;
        if (l2 >= kna_2.J + Nta.Z) {
            kna_2.J = l2;
            f2 = f3 = pqa.r;
        } else {
            long l3 = l2 - kna_2.J;
            f2 = f3 = (float)l3 / sra.B;
        }
        if (f2 > MQa.L) {
            f3 = MQa.L - (f3 - MQa.L);
        }
        int n3 = uSa.E;
        int[] nArray = kna_2.g;
        int n4 = uSa.E;
        int n5 = n2 = uSa.E;
        while (n5 < b2.length()) {
            int n6;
            int n7;
            void a2;
            int n8;
            char c2 = b2.charAt(n2);
            if (c2 == TPa.Aa && n2 + vRa.d < b2.length() && !Keyboard.isKeyDown(kTa.T)) {
                char c3 = b2.charAt(n2 + vRa.d);
                n8 = jpa.ga.indexOf(Character.toLowerCase(c3));
                if (n8 < ERa.C) {
                    kna_2.C();
                    kna_2.o = uSa.E;
                    n4 = uSa.E;
                    if (n8 < 0) {
                        n8 = Ypa.A;
                    }
                    if (a2 != false) {
                        n8 += 16;
                    }
                    int n9 = kna_2.W[n8];
                    if (Config.Fa()) {
                        n9 = XE.f((int)n8, (int)n9);
                    }
                    kna_2.d = n9;
                    kna_2.f((float)(kna_2.d >> ERa.C) / NQa.Y, (float)(n9 >> Yqa.i & osa.Ja) / NQa.Y, (float)(n9 & osa.Ja) / NQa.Y, kna_2.s);
                } else if (n8 == ERa.C) {
                    kna_2.D = vRa.d;
                } else if (n8 == yta.Ka) {
                    kna_2.H = vRa.d;
                } else if (n8 == yOa.B) {
                    kna_2.M = vRa.d;
                } else if (n8 == wOa.t) {
                    kna_2.j = vRa.d;
                } else if (n8 == kTa.j) {
                    kna_2.N = vRa.d;
                } else if (n8 == wOa.h) {
                    qy qy2;
                    int n10 = n2;
                    if (b2.length() - n2 - uqa.g >= 0 && (qy2 = Kna_2.J(b2.substring(n2 + uqa.g))) != null) {
                        if (a2 != false) {
                            qy2 = qy2.J(Bsa.n);
                        }
                        qy qy3 = qy2;
                        kna_2.d = qy3.l();
                        kna_2.f((float)qy3.J() / NQa.Y, (float)qy2.C() / NQa.Y, (float)qy2.d() / NQa.Y, kna_2.s);
                        n2 += uqa.g * qy2.f();
                    }
                    if (kna_2.o) {
                        int n11;
                        int n12;
                        if (n4 == 0) {
                            int n13;
                            int n14;
                            block90: {
                                int n15 = n14 = n10;
                                while (n15 < b2.length()) {
                                    n12 = b2.charAt(n14);
                                    if (n12 == TPa.Aa && n14 + vRa.d < b2.length()) {
                                        n7 = b2.charAt(n14 + vRa.d);
                                        n11 = cQa.m.indexOf(Character.toLowerCase((char)n7));
                                        if (n11 != pua.o) {
                                            n13 = n4;
                                            break block90;
                                        }
                                        if (n7 == sOa.D) {
                                            n6 = Kna_2.l((String)b2, n14 + uqa.g);
                                            if (n4 <= 0 || nArray[n4 - vRa.d] != n6) {
                                                nArray[n4++] = n6;
                                                if (n4 >= cRa.h) {
                                                    n13 = n4;
                                                    break block90;
                                                }
                                            }
                                        }
                                    }
                                    n15 = ++n14;
                                }
                                n13 = n4;
                            }
                            n14 = n13;
                            int n16 = uSa.E;
                            while (n16 < n14 - vRa.d) {
                                ++n4;
                                nArray[n14 + n12] = nArray[n14 - n12 - uqa.g];
                                n16 = ++n12;
                            }
                        }
                        if (n4 > 0) {
                            float f4 = (float)((l2 + tpa.Ja - (long)((int)((float)n3 / (float)n4 * APa.O))) % tpa.Ja) / APa.O;
                            n12 = (int)(f4 * (float)(n4 - vRa.d));
                            n7 = nArray[n12];
                            n11 = nArray[n12 + vRa.d];
                            float f5 = f4 * (float)(n4 - vRa.d) - (float)n12;
                            float f6 = (float)(n7 >> ERa.C & osa.Ja) * (pqa.r - f5) + (float)(n11 >> ERa.C & osa.Ja) * f5;
                            float f7 = (float)(n7 >> Yqa.i & osa.Ja) * (pqa.r - f5) + (float)(n11 >> Yqa.i & osa.Ja) * f5;
                            float c4 = (float)(n7 & osa.Ja) * (pqa.r - f5) + (float)(n11 & osa.Ja) * f5;
                            if (a2 != false) {
                                f6 -= cPa.Ga;
                                f7 -= cPa.Ga;
                                c4 -= cPa.Ga;
                                f6 = Math.max(JPa.N, f6);
                                f7 = Math.max(JPa.N, f7);
                                c4 = Math.max(JPa.N, c4);
                            }
                            kna_2.f(f6 / NQa.Y, f7 / NQa.Y, c4 / NQa.Y, kna_2.s);
                        }
                    }
                } else if (n8 == cQa.o) {
                    kna_2.t = vRa.d;
                } else if (n8 == AQa.ba) {
                    kna_2.b = vRa.d;
                } else if (n8 == osa.c) {
                    kna_2.F = vRa.d;
                } else if (n8 == kTa.g) {
                    kna_2.E = vRa.d;
                } else if (n8 == ITa.E) {
                    kna_2.l = vRa.d;
                } else if (n8 == Lra.e) {
                    kna_2.I = vRa.d;
                } else if (n8 == EPa.O) {
                    if (n2 + uqa.g < b2.length()) {
                        kna_2.G = b2.charAt(n2 + uqa.g);
                        if (kna_2.G <= osa.Ja) {
                            kna_2.G = (char)uSa.E;
                        } else {
                            ++n2;
                        }
                    }
                } else if (n8 == ITa.A) {
                    kna_2.q = vRa.d;
                } else if (n8 == Fsa.d) {
                    kna_2.o = vRa.d;
                } else {
                    Kna_2 kna_22 = kna_2;
                    kna_22.C();
                    Kna_2 kna_23 = kna_2;
                    kna_22.f(kna_22.w, kna_23.B, kna_23.a, kna_2.s);
                }
                ++n2;
            } else {
                int n17;
                float f8;
                boolean bl2;
                float f9;
                long l4;
                long l5;
                long l6;
                long l7;
                int n18 = Qta.V.indexOf(c2);
                if (kna_2.D && n18 != pua.o) {
                    char c5;
                    n8 = kna_2.J(c2);
                    while (n8 != kna_2.J(c5 = Qta.V.charAt(n18 = kna_2.p.nextInt(Qta.V.length())))) {
                    }
                    c2 = c5;
                }
                if (kna_2.F && n18 != pua.o && (l7 = (l2 + (long)n3 * (l6 = yta.p)) % (l5 = lTa.n)) < (l4 = tpa.Ja)) {
                    char c6;
                    int n19 = kna_2.J(c2);
                    while (n19 != kna_2.J(c6 = Qta.V.charAt(n18 = kna_2.p.nextInt(Qta.V.length())))) {
                    }
                    c2 = c6;
                }
                if (kna_2.b) {
                    float f10 = (float)(l2 % tpa.Ja) / APa.O - (float)(n3 % osa.c) / KSa.I;
                    int n20 = rc.HSBtoRGB(f10, Ora.D, a2 != false ? bpa.K : pqa.r);
                    kna_2.f((float)(n20 >> ERa.C & osa.Ja) / NQa.Y, (float)(n20 >> Yqa.i & osa.Ja) / NQa.Y, (float)(n20 & osa.Ja) / NQa.Y, kna_2.s);
                }
                n8 = kna_2.I ? 1 : 0;
                float f11 = JPa.N;
                float f12 = JPa.N;
                if (n8 != 0) {
                    float f13 = bpa.K;
                    long l8 = asa.fa;
                    float f14 = (float)(l2 % l8) / (float)l8;
                    float f15 = f14 * Ypa.Ha;
                    int n21 = yRa.d;
                    int n22 = AQa.P;
                    float c4 = f15 * (float)n21 + (float)n3 * rRa.C;
                    f9 = f15 * (float)n22 + (float)n3 * CRa.la;
                    f11 = (float)Math.sin(c4) * f13;
                    f12 = (float)Math.sin(f9) * f13;
                    Kna_2 kna_24 = kna_2;
                    kna_24.v += f11;
                    kna_24.K += f12;
                }
                if (bl2 = kna_2.q) {
                    float f16;
                    long l9 = tpa.Ja;
                    float f17 = (float)(l2 % l9) / (float)l9;
                    float f18 = (float)n3 * VPa.i;
                    float f19 = Ora.D;
                    if ((f17 = (f17 + f18) % pqa.r) < f19) {
                        f16 = JPa.N;
                    } else {
                        float f20;
                        float f21;
                        float c4 = (f17 - f19) / (pqa.r - f19);
                        if (f21 < MQa.L) {
                            f20 = kta.v * c4 * c4;
                        } else {
                            f8 = pqa.r - c4;
                            f20 = pqa.r - kta.v * f8 * f8;
                        }
                        f16 = f20 * Ypa.Ha;
                    }
                    float c4 = (float)Math.cos(f16);
                    uKa.m();
                    uKa.e();
                    Kna_2 kna_25 = kna_2;
                    uKa.J((float)(kna_2.v + YSa.G), (float)(kna_25.K + YSa.G), (float)JPa.N);
                    uKa.l((float)pqa.r, (float)c4, (float)pqa.r);
                    uKa.J((float)(-(kna_25.v + YSa.G)), (float)(-(kna_2.K + YSa.G)), (float)JPa.N);
                }
                float f22 = JPa.N;
                n7 = kna_2.E;
                if (n7 != 0) {
                    long l10 = Hra.m;
                    float f23 = Jsa.Z;
                    float f24 = MQa.L;
                    float c4 = (float)(l2 % l10) / (float)l10 * Ypa.Ha;
                    f9 = (float)n3 * f24;
                    f22 = (float)Math.sin(c4 + f9) * f23;
                    kna_2.K += f22;
                }
                float f25 = n18 != pua.o && !kna_2.A ? kna_2.c : MQa.L;
                n6 = Sf.J((char)c2) != null ? vRa.d : uSa.E;
                int n23 = n17 = (c2 == '\u0000' || n18 == pua.o || kna_2.A) && a2 != false ? vRa.d : uSa.E;
                if (n6 != 0 && n17 != 0) {
                    if (bl2) {
                        uKa.D();
                        uKa.h();
                    }
                    Kna_2 kna_26 = kna_2;
                    kna_26.v += FRa.Ga;
                    if (kna_26.H) {
                        kna_2.v += f25;
                    }
                } else {
                    long l11;
                    long l12;
                    long l13;
                    long l14;
                    float f26;
                    float f27;
                    float f28;
                    float f29;
                    float f30;
                    long l15;
                    boolean bl3;
                    if (n17 != 0) {
                        Kna_2 kna_27 = kna_2;
                        kna_27.v -= f25;
                        kna_27.K -= f25;
                    }
                    if (bl3 = kna_2.l) {
                        float f31;
                        float c4 = (float)Math.sin((double)((float)(l2 % tpa.Ja) / APa.O) * lQa.f * KPa.y * uRa.I);
                        f9 = (float)Math.sin((double)((float)(l2 % xra.b) / wOa.z) * lQa.f * KPa.y * KPa.y);
                        f8 = Math.abs(c4 * f9) * ZSa.q + bpa.K;
                        if (f31 > Nra.e) {
                            l15 = dQa.c;
                            f30 = (float)(l2 % l15) / (float)l15 * Ypa.Ha;
                            float f32 = Ira.d * f8;
                            float f33 = (float)Math.cos(f30) * f32;
                            float f34 = (float)Math.sin(f30) * f32;
                            float f35 = (float)Math.cos((double)f30 + lQa.f) * f32;
                            float f36 = (float)Math.sin((double)f30 + lQa.f) * f32;
                            Kna_2 kna_28 = kna_2;
                            float f37 = kna_28.s * Xpa.R * f8;
                            float f38 = kna_28.v;
                            f29 = kna_28.K;
                            f28 = kna_28.x;
                            f27 = kna_28.C;
                            f26 = kna_28.h;
                            kna_28.v = f38 + f33;
                            kna_28.K = f29 + f34;
                            kna_28.f(pqa.r, Xpa.R, Xpa.R, f37);
                            kna_28.J(c2, kna_2.N);
                            Kna_2 kna_29 = kna_2;
                            kna_2.v = f38 + f35;
                            kna_29.K = f29 + f36;
                            kna_29.f(Xpa.R, Ora.D, pqa.r, f37);
                            kna_29.J(c2, kna_2.N);
                            kna_2.v = f38;
                            kna_2.K = f29;
                            kna_2.f(f28, f27, f26, kna_2.s);
                        }
                    }
                    float c4 = kna_2.J(c2, kna_2.N);
                    if (n17 != 0) {
                        Kna_2 kna_210 = kna_2;
                        kna_210.v += f25;
                        kna_210.K += f25;
                    }
                    if (kna_2.H) {
                        kna_2.v += f25;
                        if (n17 != 0) {
                            Kna_2 kna_211 = kna_2;
                            kna_211.v -= f25;
                            kna_211.K -= f25;
                        }
                        if (n6 == 0) {
                            Kna_2 kna_212 = kna_2;
                            kna_212.J(c2, kna_212.N);
                        }
                        kna_2.v -= f25;
                        if (n17 != 0) {
                            Kna_2 kna_213 = kna_2;
                            kna_213.v += f25;
                            kna_213.K += f25;
                        }
                        c4 += f25;
                    }
                    if (kna_2.M) {
                        pKa pKa2 = pKa.J();
                        aKa aKa2 = pKa2.J();
                        uKa.z();
                        aKa aKa3 = aKa2;
                        Kna_2 kna_214 = kna_2;
                        aKa aKa4 = aKa2;
                        aKa4.J(XTa.W, mka.M);
                        Kna_2 kna_215 = kna_2;
                        aKa4.J((double)kna_2.v, (double)(kna_215.K + (float)(kna_215.u / uqa.g)), aSa.V).M();
                        Kna_2 kna_216 = kna_2;
                        aKa2.J((double)(kna_214.v + c4), (double)(kna_216.K + (float)(kna_216.u / uqa.g)), aSa.V).M();
                        Kna_2 kna_217 = kna_2;
                        aKa3.J((double)(kna_214.v + c4), (double)(kna_217.K + (float)(kna_217.u / uqa.g) - pqa.r), aSa.V).M();
                        Kna_2 kna_218 = kna_2;
                        aKa3.J((double)kna_2.v, (double)(kna_218.K + (float)(kna_218.u / uqa.g) - pqa.r), aSa.V).M();
                        pKa2.J();
                        uKa.H();
                    }
                    if (kna_2.j) {
                        pKa pKa3 = pKa.J();
                        aKa aKa5 = pKa3.J();
                        uKa.z();
                        aKa5.J(XTa.W, mka.M);
                        int n24 = kna_2.j ? pua.o : uSa.E;
                        aKa aKa6 = aKa5;
                        Kna_2 kna_219 = kna_2;
                        Kna_2 kna_220 = kna_2;
                        aKa5.J((double)(kna_2.v + (float)n24), (double)(kna_220.K + (float)kna_220.u), aSa.V).M();
                        Kna_2 kna_221 = kna_2;
                        aKa5.J((double)(kna_219.v + c4), (double)(kna_221.K + (float)kna_221.u), aSa.V).M();
                        Kna_2 kna_222 = kna_2;
                        aKa6.J((double)(kna_219.v + c4), (double)(kna_222.K + (float)kna_222.u - pqa.r), aSa.V).M();
                        Kna_2 kna_223 = kna_2;
                        aKa6.J((double)(kna_2.v + (float)n24), (double)(kna_223.K + (float)kna_223.u - pqa.r), aSa.V).M();
                        pKa3.J();
                        uKa.H();
                    }
                    if (kna_2.t) {
                        char c7 = c2;
                        float f39 = kta.v;
                        Kna_2 kna_224 = kna_2;
                        float f40 = kna_224.u;
                        float f41 = kna_224.v - f39 + f3 * kta.v * (c4 + f39);
                        f30 = kna_224.K - f40 + f3 * kta.v * ((float)kna_2.u + f40);
                        cI.J((Runnable)aoa.J((Kna)kna_224, (char)c7, (float)f25, n17 != 0, n6 != 0));
                        kna_224.J(f41, f30, f39, f40);
                        cI.J();
                        kna_224.f(kna_224.d);
                    }
                    if (bl2) {
                        uKa.D();
                        uKa.h();
                    }
                    if (n8 != 0) {
                        Kna_2 kna_225 = kna_2;
                        kna_225.v -= f11;
                        kna_225.K -= f12;
                    }
                    if (n7 != 0) {
                        kna_2.K -= f22;
                    }
                    if (kna_2.G != '\u0000' && a2 == false && (l14 = (l13 = l2 + (l12 = (long)n3 * Xsa.f + (long)c2 * asa.O)) % (l11 = dQa.c)) < (l15 = asa.fa)) {
                        float f42;
                        Kna_2 kna_226;
                        float f43 = (float)l14 / (float)l15;
                        int n25 = n3 * Asa.C + c2 * jpa.o;
                        f29 = (float)(n25 % aPa.Y) / CRa.ja * Ypa.Ha;
                        f28 = qta.D;
                        Kna_2 kna_227 = kna_2;
                        f27 = kna_227.v + (float)Math.cos(f29) * f28 * f43;
                        f26 = kna_227.K + (float)Math.sin(f29) * f28 * f43 * MQa.L;
                        float f44 = bpa.K;
                        if (f43 < f44) {
                            Kna_2 kna_228 = kna_2;
                            kna_226 = kna_228;
                            f42 = kna_228.s;
                        } else {
                            f44 = (f43 - f44) / (pqa.r - f44);
                            f42 = (pqa.r - f44) * kna_2.s;
                            kna_226 = kna_2;
                        }
                        kna_226.J(f27, f26, f42);
                    }
                    ++n3;
                    kna_2.v += c4;
                }
            }
            n5 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private float J(int n2, boolean n3) {
        void b22;
        int c2 = n3;
        Kna_2 a2 = this;
        void var3_6 = b22 % ERa.C * Yqa.i;
        void var4_7 = b22 / ERa.C * Yqa.i;
        c2 = c2 != 0 ? vRa.d : uSa.E;
        Kna_2 kna_2 = a2;
        kna_2.J(kna_2.i);
        float b22 = kna_2.T[b22];
        float f2 = zpa.M;
        GL11.glBegin(tTa.h);
        GL11.glTexCoord2f((float)var3_6 / PRa.E, (float)var4_7 / PRa.E);
        GL11.glVertex3f(kna_2.v + (float)c2, a2.K, JPa.N);
        GL11.glTexCoord2f((float)var3_6 / PRa.E, ((float)var4_7 + zpa.M) / PRa.E);
        GL11.glVertex3f(kna_2.v - (float)c2, a2.K + zpa.M, JPa.N);
        GL11.glTexCoord2f(((float)var3_6 + f2 - pqa.r) / PRa.E, (float)var4_7 / PRa.E);
        GL11.glVertex3f(kna_2.v + f2 - pqa.r + (float)c2, a2.K, JPa.N);
        GL11.glTexCoord2f(((float)var3_6 + f2 - pqa.r) / PRa.E, ((float)var4_7 + zpa.M) / PRa.E);
        GL11.glVertex3f(kna_2.v + f2 - pqa.r - (float)c2, a2.K + zpa.M, JPa.N);
        GL11.glEnd();
        return b22;
    }

    public InputStream J(ResourceLocation resourceLocation) throws IOException {
        ResourceLocation b2 = resourceLocation;
        Kna_2 a2 = this;
        return Kpa.J().J().J(b2).J();
    }

    /*
     * Unable to fully structure code
     */
    public String J(String var1_2, int var2_3, boolean var3_4) {
        block7: {
            var5_5 = this;
            var4_6 = new StringBuilder();
            d = JPa.N;
            var6_7 = a != false ? c.length() - vRa.d : uSa.E;
            var7_8 = a != false ? pua.o : vRa.d;
            var8_9 = uSa.E;
            var9_10 = uSa.E;
            v0 = var10_11 = var6_7;
            while (v0 >= 0 && var10_11 < c.length() && d < (float)b) {
                block11: {
                    block8: {
                        block9: {
                            block10: {
                                var11_12 = c.charAt(var10_11);
                                var12_13 = var5_5.J(var11_12);
                                if (var8_9 == 0) break block8;
                                var8_9 = uSa.E;
                                if (var11_12 == Jra.o || var11_12 == NPa.i) break block9;
                                if (var11_12 != sOa.D || c.length() - var6_7 - vRa.d < 0 || (var13_14 = Kna_2.J(c.substring(var6_7 + vRa.d))) == null) break block10;
                                var6_7 += uqa.g * var13_14.f();
                                var9_10 = uSa.E;
                                v1 = d;
                                break block11;
                            }
                            if (var11_12 != WSa.o && var11_12 != aqa.Aa && !Kna_2.f(var11_12)) ** GOTO lbl37
                            var9_10 = uSa.E;
                            v1 = d;
                            break block11;
                        }
                        var9_10 = vRa.d;
                        v1 = d;
                        break block11;
                    }
                    if (var12_13 < JPa.N) {
                        var8_9 = vRa.d;
                        v1 = d;
                    } else {
                        d += var12_13;
                        if (var9_10 != 0) {
                            d += pqa.r;
                        }
lbl37:
                        // 4 sources

                        v1 = d;
                    }
                }
                if (v1 > (float)b) {
                    v2 = var4_6;
                    break block7;
                }
                v3 = var4_6;
                if (a != false) {
                    v3.insert(uSa.E, var11_12);
                    v4 = var10_11;
                } else {
                    v3.append(var11_12);
                    v4 = var10_11;
                }
                v0 = v4 + var7_8;
            }
            v2 = var4_6;
        }
        return v2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        void d2;
        Kna_2 b2;
        float e2 = f4;
        Kna_2 kna_2 = b2 = this;
        b2.x = d2;
        kna_2.C = c2;
        kna_2.h = e2;
        uKa.f((float)d2, (float)c2, (float)e2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(String string, int n2, int n3, int n4, int n5, boolean bl) {
        void a2;
        void b2;
        void d2;
        void f2;
        int g2 = n2;
        Kna_2 e2 = this;
        if (e2.R) {
            void c2;
            Kna_2 kna_2 = e2;
            int n6 = kna_2.J(kna_2.f((String)f2));
            g2 = g2 + c2 - n6;
        }
        return e2.C((String)f2, g2, (float)d2, (int)b2, (boolean)a2);
    }

    private static boolean f(char a2) {
        if (a2 >= QSa.p && a2 <= KSa.x || a2 >= Hta.k && a2 <= jRa.v || a2 >= fPa.ga && a2 <= NPa.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        Kna_2 a2;
        return a2.A;
    }

    private void l() {
        Kna_2 kna_2 = this;
        InputStream inputStream = null;
        try {
            inputStream = kna_2.J(new ResourceLocation(Yua.G));
            inputStream.read(kna_2.m);
        }
        catch (IOException a22) {
            try {
                throw new RuntimeException(a22);
            }
            catch (Throwable a22) {
                IOUtils.closeQuietly(inputStream);
                throw a22;
            }
        }
        IOUtils.closeQuietly(inputStream);
        return;
    }

    public static String l(String string) {
        String string2 = string;
        String string3 = Mqa.y;
        int a2 = pua.o;
        int n2 = string2.length();
        while ((a2 = string2.indexOf(TPa.Aa, a2 + vRa.d)) != pua.o) {
            if (a2 >= n2 - vRa.d) continue;
            char c2 = string2.charAt(a2 + vRa.d);
            if (Kna_2.f(c2)) {
                string3 = new StringBuilder().insert(2 & 5, FRa.K).append(c2).toString();
                continue;
            }
            if (!Kna_2.J(c2)) continue;
            string3 = new StringBuilder().insert(3 >> 2, string3).append(FRa.K).append(c2).toString();
        }
        return string3;
    }

    /*
     * WARNING - void declaration
     */
    public Kna_2(Cia cia, ResourceLocation resourceLocation, aJa aJa2, boolean bl) {
        int a2;
        void c2;
        void d2;
        Kna_2 b2;
        Kna_2 e22 = aJa2;
        Kna_2 kna_2 = b2 = this;
        Kna_2 kna_22 = b2;
        Kna_2 kna_23 = b2;
        b2.T = new float[hra.Ja];
        b2.u = WOa.fa;
        Kna_2 kna_24 = b2;
        b2.p = new Random();
        b2.m = new byte[opa.w];
        b2.W = new int[fPa.i];
        b2.n = vRa.d;
        b2.c = pqa.r;
        b2.g = new int[hra.Ja];
        b2.x = pqa.r;
        kna_23.C = pqa.r;
        kna_23.h = pqa.r;
        kna_23.O = d2;
        kna_22.P = c2;
        kna_22.i = c2;
        b2.e = e22;
        kna_2.A = a2;
        kna_2.i = kg.J((ResourceLocation)b2.P);
        kna_2.J(kna_2.i);
        int n2 = c2 = uSa.E;
        while (n2 < fPa.i) {
            int e22 = (c2 >> yRa.d & vRa.d) * Ira.ga;
            a2 = (c2 >> uqa.g & vRa.d) * JTa.M + e22;
            int n3 = (c2 >> vRa.d & vRa.d) * JTa.M + e22;
            e22 = (c2 >> uSa.E & vRa.d) * JTa.M + e22;
            if (c2 == uua.p) {
                a2 += 85;
            }
            if (d2.B) {
                int n4 = (a2 * Fsa.d + n3 * lPa.p + e22 * pPa.f) / ySa.T;
                int n5 = (a2 * Fsa.d + n3 * NPa.e) / ySa.T;
                int n6 = (a2 * Fsa.d + e22 * NPa.e) / ySa.T;
                a2 = n4;
                n3 = n5;
                e22 = n6;
            }
            if (c2 >= ERa.C) {
                a2 /= AQa.P;
                n3 /= AQa.P;
                e22 /= AQa.P;
            }
            b2.W[c2++] = (a2 & osa.Ja) << ERa.C | (n3 & osa.Ja) << Yqa.i | e22 & osa.Ja;
            n2 = c2;
        }
        b2.l();
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Kna_2 a2 = this;
        if (!a2.n) {
            return uSa.E;
        }
        return a2.l((String)d2, (float)c2, (float)b2, (int)e2, uSa.E != 0);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Kna_2 a2 = this;
        a2.R = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static int l(String string, int n2) {
        int n3;
        void a2;
        String string2 = string;
        if (a2 < 0 || a2 + tTa.h >= string2.length()) {
            return pua.o;
        }
        int n4 = uSa.E;
        int n5 = n3 = uSa.E;
        while (n5 < uua.p) {
            int n6;
            int n7;
            char b2 = string2.charAt((int)(a2 + n3));
            if (b2 >= QSa.p && b2 <= KSa.x) {
                n7 = b2 - QSa.p;
                n6 = n4;
            } else if (b2 >= fPa.ga && b2 <= NPa.e) {
                n7 = b2 - fPa.ga + NTa.C;
                n6 = n4;
            } else if (b2 >= Hta.k && b2 <= jRa.v) {
                n7 = b2 - Hta.k + NTa.C;
                n6 = n4;
            } else {
                return pua.o;
            }
            n4 = n6 << AQa.P | n7;
            n5 = ++n3;
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        void b2;
        void d2;
        Kna_2 kna_2 = this;
        uKa.e();
        void var5_7 = d2 + b2 / kta.v;
        void e2 = c2 + a2 / kta.v;
        uKa.J((float)var5_7, (float)e2, (float)JPa.N);
        uKa.J((float)nua.E, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)(-var5_7), (float)(-e2), (float)JPa.N);
        if.f((double)((double)d2), (double)((double)c2), (double)((double)b2), (double)((double)a2), (Color)Bc.g.transparent(Math.min(MQa.L, kna_2.s)));
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, float f2, float f3, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        Kna_2 a2 = this;
        return a2.l((String)d2, (float)c2, (float)b2, (int)e2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private float J(char c2, boolean bl) {
        void a2;
        char c3 = c2;
        Kna_2 b2 = this;
        He he = Sf.J((char)c3);
        if (he != null) {
            Kna_2 kna_2 = b2;
            Kna_2 kna_22 = b2;
            float f2 = kna_22.x;
            float f3 = kna_22.C;
            float f4 = kna_2.h;
            kna_2.f(pqa.r, pqa.r, pqa.r, b2.s);
            he.J((int)b2.v, (int)(b2.K - pqa.r));
            kna_2.f(f2, f3, f4, b2.s);
            return FRa.Ga;
        }
        if (c3 == fPa.i) {
            if (!b2.A) {
                return b2.T[c3];
            }
            return YSa.G;
        }
        if (b2.A) {
            return b2.f(c3, (boolean)a2);
        }
        int n2 = Qta.V.indexOf(c3);
        if (n2 != pua.o) {
            return b2.J(n2, (boolean)a2);
        }
        return b2.f(c3, (boolean)a2);
    }

    public boolean J() {
        Kna_2 a2;
        return a2.R;
    }

    /*
     * WARNING - void declaration
     */
    public String f(String string, int n2) {
        void a2;
        Object c2 = string;
        Kna_2 b2 = this;
        Object object = c2;
        int n3 = b2.f((String)object, (int)a2);
        if (((String)object).length() <= n3) {
            return c2;
        }
        Object object2 = c2;
        String string2 = ((String)object2).substring(uSa.E, n3);
        char c3 = ((String)object2).charAt(n3);
        int n4 = c3 == fPa.i || c3 == NTa.C ? vRa.d : uSa.E;
        c2 = new StringBuilder().insert(5 >> 3, Kna_2.l(string2)).append(((String)c2).substring(n3 + (n4 != 0 ? vRa.d : uSa.E))).toString();
        return new StringBuilder().insert(2 & 5, string2).append(SPa.O).append(b2.f((String)c2, (int)a2)).toString();
    }

    /*
     * WARNING - void declaration
     */
    private int C(String string, float f2, float f3, int n2, boolean bl) {
        void c2;
        void d2;
        void a2;
        int f4;
        String e2;
        int n3 = n2;
        Kna_2 b2 = this;
        if (e2 == null) {
            return uSa.E;
        }
        if (b2.R) {
            e2 = b2.f(e2);
        }
        if (f && (f4 & zpa.i) == 0) {
            f4 |= gsa.X;
        }
        if (a2 != false) {
            f4 = (f4 & sOa.fa) >> uqa.g | f4 & gsa.X;
        }
        Kna_2 kna_2 = b2;
        Kna_2 kna_22 = b2;
        int n4 = f4;
        b2.w = (float)(f4 >> ERa.C & osa.Ja) / NQa.Y;
        b2.B = (float)(n4 >> Yqa.i & osa.Ja) / NQa.Y;
        kna_22.a = (float)(n4 & osa.Ja) / NQa.Y;
        kna_22.s = (float)(f4 >> osa.c & osa.Ja) / NQa.Y;
        Kna_2 kna_23 = b2;
        kna_2.f(kna_2.w, kna_23.B, kna_23.a, b2.s);
        kna_2.v = d2;
        b2.K = c2;
        b2.J(e2, (boolean)a2);
        return (int)b2.v;
    }

    /*
     * WARNING - void declaration
     */
    public float J(String string) {
        int b2;
        void a2;
        Kna_2 kna_2 = this;
        if (a2 == null) {
            return JPa.N;
        }
        float f2 = JPa.N;
        int n2 = uSa.E;
        int n3 = b2 = uSa.E;
        while (n3 < a2.length()) {
            float f3;
            char c2 = a2.charAt(b2);
            float f4 = kna_2.J(c2);
            if (f3 < JPa.N && b2 < a2.length() - vRa.d) {
                if ((c2 = a2.charAt(++b2)) != Jra.o && c2 != NPa.i) {
                    qy qy2;
                    if (c2 == Bsa.E && a2.charAt(b2 - vRa.d) == TPa.Aa) {
                        n2 = uSa.E;
                        ++b2;
                    } else if (c2 == sOa.D && a2.charAt(b2 - vRa.d) == TPa.Aa && (qy2 = Kna_2.J(a2.substring(b2 + vRa.d))) != null) {
                        b2 += uqa.g * qy2.f();
                        n2 = uSa.E;
                    } else if (c2 == WSa.o || c2 == aqa.Aa || Kna_2.f(c2)) {
                        n2 = uSa.E;
                    }
                } else {
                    n2 = vRa.d;
                }
                f4 = JPa.N;
            }
            f2 += f4;
            if (n2 != 0 && f4 > JPa.N) {
                f2 += kna_2.A ? MQa.L : kna_2.c;
            }
            n3 = ++b2;
        }
        return f2;
    }

    /*
     * Unable to fully structure code
     */
    private int f(String var1_2, int var2_3) {
        block10: {
            var3_4 = this;
            var5_5 = b.length();
            var4_6 = JPa.N;
            c = uSa.E;
            var6_7 = pua.o;
            var7_8 = uSa.E;
            v0 = c;
            while (v0 < var5_5) {
                block11: {
                    var8_9 = b.charAt(c);
                    switch (var8_9) {
                        case '\n': {
                            --c;
                            while (false) {
                            }
                            v1 = var8_9;
                            break block11;
                        }
                        case ' ': {
                            var6_7 = c;
                        }
                        default: {
                            var4_6 += var3_4.J(var8_9);
                            if (var7_8 == 0) break;
                            var4_6 += pqa.r;
                            v1 = var8_9;
                            break block11;
                        }
                        case '\u00a7': {
                            if (c >= var5_5 - vRa.d) break;
                            if ((var9_10 = b.charAt(++c)) == Jra.o || var9_10 == NPa.i) ** GOTO lbl32
                            if (var9_10 != WSa.o && var9_10 != aqa.Aa && !Kna_2.f(var9_10)) break;
                            var7_8 = uSa.E;
                            v1 = var8_9;
                            break block11;
lbl32:
                            // 1 sources

                            var7_8 = vRa.d;
                        }
                    }
                    v1 = var8_9;
                }
                if (v1 == NTa.C) {
                    var6_7 = ++c;
                    v2 = c;
                    break block10;
                }
                if (var4_6 > (float)a) {
                    v2 = c;
                    break block10;
                }
                v0 = ++c;
            }
            v2 = c;
        }
        if (v2 != var5_5 && var6_7 != pua.o && var6_7 < c) {
            return var6_7;
        }
        return c;
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, float f2, float f3, int n2, boolean bl) {
        void f4;
        void b2;
        void c2;
        void d2;
        void e2;
        boolean bl2 = bl;
        Kna_2 a2 = this;
        return a2.f((String)e2, (float)d2, (float)c2, (int)b2, (boolean)f4);
    }

    public void J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        Kna_2 a2 = this;
        a2.e.J(b2);
    }

    private float J(char n2) {
        int n3;
        int b2 = n2;
        Kna_2 a2 = this;
        if (Sf.J((char)b2) != null) {
            return FRa.Ga;
        }
        if (b2 == TPa.Aa) {
            return vqa.T;
        }
        if (b2 == fPa.i) {
            if (!a2.A) {
                return a2.T[fPa.i];
            }
            return YSa.G;
        }
        int n4 = n3 = a2.A ? pua.o : Qta.V.indexOf(b2);
        if (b2 > 0 && n3 != pua.o) {
            return a2.T[n3];
        }
        if (a2.m[b2] != 0) {
            Kna_2 kna_2 = a2;
            n3 = kna_2.m[b2] >>> AQa.P;
            b2 = kna_2.m[b2] & Ypa.A;
            return (float)(++b2 - (n3 &= Ypa.A)) / kta.v + pqa.r;
        }
        return JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        Kna_2 kna_2;
        Kna_2 kna_22 = kna_2 = this;
        float f5 = kna_22.v;
        float f6 = kna_22.K;
        float d2 = kna_22.s;
        float f7 = kna_22.x;
        float f8 = kna_22.C;
        float f9 = kna_22.h;
        kna_22.v = c2;
        kna_22.K = b2;
        kna_22.s = a2;
        kna_22.f(pqa.r, psa.N, Xpa.R, (float)a2);
        uKa.e();
        uKa.B();
        uKa.u();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.J((float)JPa.N, (float)JPa.N, (float)FRa.Ga);
        kna_22.J(kna_22.G, uSa.E != 0);
        uKa.D();
        uKa.J();
        Kna_2 kna_23 = kna_2;
        kna_23.v = f5;
        kna_23.K = f6;
        kna_2.s = d2;
        kna_2.f(f7, f8, f9, d2);
    }

    /*
     * WARNING - void declaration
     */
    public List J(String string, int n2) {
        void b2;
        int c2 = n2;
        Kna_2 a2 = this;
        return Arrays.asList(a2.f((String)b2, c2).split(SPa.O));
    }

    public static qy J(String a2) {
        try {
            return new qy(Integer.parseInt(a2.substring(uSa.E, uua.p), ERa.C), yRa.d);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void f() {
        var1_2 = this;
        try {
            v0 = var1_2;
            a = gLa.J(v0.J(v0.i));
        }
        catch (IOException var10_3) {
            throw new RuntimeException(var10_3);
        }
        var10_4 = kg.J((ResourceLocation)var1_2.i);
        v1 = a;
        var3_5 = v1.getWidth();
        var4_6 = v1.getHeight();
        var5_7 = var3_5 / ERa.C;
        var6_8 = var4_6 / ERa.C;
        var7_9 = (float)var3_5 / PRa.E;
        var8_10 = Config.J(var7_9, pqa.r, kta.v);
        var1_2.c = pqa.r / var8_10;
        var8_10 = kg.J((Properties)var10_4, (String)Qpa.G, (float)vqa.T);
        if (v2 >= JPa.N) {
            var1_2.c = var8_10;
        }
        var8_11 = new int[var3_5 * var4_6];
        a.getRGB(uSa.E, uSa.E, var3_5, var4_6, var8_11, uSa.E, var3_5);
        a = uSa.E;
        v3 = a;
        while (v3 < hra.Ja) {
            block11: {
                var4_6 = a % ERa.C;
                var9_13 = a / ERa.C;
                var2_12 = uSa.E;
                v4 = var2_12 = var5_7 - vRa.d;
                while (v4 >= 0) {
                    var11_14 = var4_6 * var5_7 + var2_12;
                    var12_15 = vRa.d;
                    v5 = uSa.E;
                    while (v5 < var6_8 && var12_15 != 0) {
                        var14_17 = (var9_13 * var6_8 + var13_16) * var3_5;
                        if ((var8_11[var11_14 + var14_17] >> osa.c & osa.Ja) > ERa.C) {
                            var12_15 = uSa.E;
                        }
                        v5 = ++var13_16;
                    }
                    if (var12_15 == 0) {
                        v6 = a;
                        break block11;
                    }
                    v4 = --var2_12;
                }
                v6 = a;
            }
            if (v6 == fPa.ga) {
                // empty if block
            }
            if (a != fPa.i) ** GOTO lbl57
            if (var5_7 <= Yqa.i) {
                var2_12 = (int)(kta.v * var7_9);
                v7 = var1_2;
            } else {
                var2_12 = (int)(Ira.d * var7_9);
lbl57:
                // 2 sources

                v7 = var1_2;
            }
            v7.T[a++] = (float)(var2_12 + vRa.d) / var7_9 + pqa.r;
            v3 = a;
        }
        kg.J((Properties)var10_4, (float[])var1_2.T);
    }

    public void J() {
        uKa.K();
    }

    public void J(U u2) {
        Kna_2 b2 = u2;
        Kna_2 a2 = this;
        a2.i = kg.J((ResourceLocation)a2.P);
        int n2 = b2 = uSa.E;
        while (n2 < L.length) {
            Kna_2.L[b2++] = null;
            n2 = b2;
        }
        Kna_2 kna_2 = a2;
        kna_2.f();
        kna_2.l();
        DW.J();
    }

    private String f(String string) {
        String b2 = string;
        Kna_2 a2 = this;
        try {
            Bidi bidi = new Bidi(new ArabicShaping(Yqa.i).shape(b2), cRa.h);
            bidi.setReorderingMode(uSa.E);
            return bidi.writeReordered(uqa.g);
        }
        catch (ArabicShapingException arabicShapingException) {
            return b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public String J(String string, int n2) {
        void b2;
        int c2 = n2;
        Kna_2 a2 = this;
        return a2.J((String)b2, c2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public int l(String string, float f2, float f3, int n2, boolean bl) {
        void f4;
        void b2;
        void c2;
        void d2;
        void e2;
        Kna_2 a2;
        boolean bl2 = bl;
        Kna_2 kna_2 = a2 = this;
        return DW.J((String)e2, (float)d2, (float)c2, (int)b2, (boolean)f4, (q)kna_2, (Object)kna_2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        void d2;
        void a2;
        Kna_2 e2;
        Object f2 = string;
        Kna_2 kna_2 = e2 = this;
        e2.C();
        kna_2.d = a2;
        f2 = kna_2.J((String)f2);
        kna_2.J((String)f2, (int)d2, (int)c2, (int)b2, uSa.E != 0);
    }

    public int f(char n2) {
        int b2 = n2;
        Kna_2 a2 = this;
        if ((b2 = cQa.m.indexOf(b2)) >= 0 && b2 < a2.W.length) {
            int n3 = a2.W[b2];
            if (Config.Fa()) {
                n3 = XE.f((int)b2, (int)n3);
            }
            return n3;
        }
        return Wsa.K;
    }

    private static boolean J(char a2) {
        if (a2 >= jpa.E && a2 <= fPa.z || a2 >= jRa.X && a2 <= vPa.Ka || a2 == WSa.o || a2 == aqa.Aa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(int n2) {
        int b22 = n2;
        Kna_2 a2 = this;
        float f2 = (float)(b22 >> ERa.C & osa.Ja) / NQa.Y;
        float f3 = (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y;
        float b22 = (float)(b22 & osa.Ja) / NQa.Y;
        Kna_2 kna_2 = a2;
        a2.x = f2;
        kna_2.C = f3;
        kna_2.h = b22;
        uKa.f((float)f2, (float)f3, (float)b22, (float)a2.s);
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, int n2) {
        void b2;
        int c2 = n2;
        Kna_2 a2 = this;
        return a2.u * a2.J((String)b2, c2).size();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Kna kna2, char c2, float f2, boolean bl, boolean bl2) {
        void d2;
        Kna c3;
        float e2 = f2;
        Kna kna3 = c3 = kna2;
        super.J((char)d2, kna3.N);
        if (kna3.H) {
            void a2;
            void b2;
            c3.v += e2;
            if (b2 != false) {
                Kna kna4 = c3;
                kna4.v -= e2;
                kna4.K -= e2;
            }
            if (a2 == false) {
                Kna kna5 = c3;
                super.J((char)d2, kna5.N);
            }
            c3.v -= e2;
            if (b2 != false) {
                Kna kna6 = c3;
                kna6.v += e2;
                kna6.K += e2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public int f(String string, float f2, float f3, int n2, boolean bl) {
        void b2;
        void c2;
        void d2;
        void e2;
        int f4;
        Kna_2 a2;
        boolean bl2 = bl;
        Kna_2 kna_2 = a2 = this;
        kna_2.J();
        kna_2.C();
        if (f4 != 0) {
            Kna_2 kna_22 = a2;
            f4 = kna_22.C((String)e2, (float)(d2 + pqa.r), (float)(c2 + pqa.r), (int)b2, vRa.d != 0);
            kna_22.C();
            f4 = Math.max(f4, a2.C((String)e2, (float)d2, (float)c2, (int)b2, uSa.E != 0));
            return f4;
        }
        f4 = a2.C((String)e2, (float)d2, (float)c2, (int)b2, uSa.E != 0);
        return f4;
    }

    public int J(char c2) {
        char b2 = c2;
        Kna_2 a2 = this;
        return Math.round(a2.J(b2));
    }

    private void J(int n2) {
        Kna_2 a2;
        int b2 = n2;
        Kna_2 kna_2 = a2 = this;
        kna_2.J(kna_2.J(b2));
    }

    private String J(String string) {
        String b2 = string;
        Kna_2 a2 = this;
        String string2 = b2;
        while (string2 != null && b2.endsWith(SPa.O)) {
            Object object = b2;
            string2 = ((String)object).substring(uSa.E, ((String)object).length() - vRa.d);
        }
        return b2;
    }

    public int J(String string) {
        String b2 = string;
        Kna_2 a2 = this;
        return (int)a2.J(b2);
    }

    private ResourceLocation J(int n2) {
        int b2 = n2;
        Kna_2 a2 = this;
        if (L[b2] == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2;
            Kna_2.L[b2] = new ResourceLocation(String.format(aPa.H, objectArray));
            int n3 = b2;
            Kna_2.L[n3] = kg.J((ResourceLocation)L[n3]);
        }
        return L[b2];
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, int n2, int n3, int n4, boolean bl) {
        void b2;
        Iterator f2 = string;
        Kna_2 e2 = this;
        Iterator iterator = f2 = e2.J((String)((Object)f2), (int)b2).iterator();
        while (iterator.hasNext()) {
            void a2;
            void c2;
            void d2;
            Object e3 = f2.next();
            e2.J((String)e3, (int)d2, (int)c2, (int)b2, e2.d, (boolean)a2);
            c2 += e2.u;
            iterator = f2;
        }
    }
}

