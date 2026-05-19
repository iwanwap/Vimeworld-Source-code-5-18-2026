/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Kna
 *  Kpa
 *  TPa
 *  XTa
 *  aKa
 *  aSa
 *  jpa
 *  k
 *  kta
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  vRa
 */
import java.awt.Color;

public abstract class aT_3
extends Bp {
    public static String J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        String string2 = Mqa.y;
        int n3 = a2.length();
        int n4 = b2 = b2;
        while (n4 >= 0) {
            if (a2.charAt(b2) == TPa.Aa && b2 < n3 - vRa.d) {
                char c2 = a2.charAt(b2 + vRa.d);
                string2 = new StringBuilder().insert(5 >> 3, FRa.K).append(c2).append(string2).toString();
                if (!aT_3.J(c2)) {
                    return string2;
                }
            }
            n4 = --b2;
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(long l2, String string, float f2, float f3, float f4, boolean bl, int n2, int n3, boolean bl2) {
        int n4;
        block8: {
            int n5;
            block9: {
                void a2;
                void f5;
                void g2;
                void i2;
                int n6;
                int n7;
                char[] cArray;
                void j2;
                void h2;
                int d2;
                Kna kna2;
                block6: {
                    int n8;
                    block7: {
                        void c2;
                        void b2;
                        block5: {
                            float f6 = f4;
                            aT_3 e2 = this;
                            kna2 = Kpa.J().Ea;
                            if (d2 != 0) {
                                g2 -= (float)kna2.J((String)h2) * j2 / kta.v;
                                f5 -= (float)kna2.u * j2 / kta.v;
                            }
                            d2 = aT_3.J((int)b2);
                            int n9 = n5 = j2 != pqa.r ? vRa.d : uSa.E;
                            if (n5 != 0) {
                                uKa.e();
                                void v1 = j2;
                                uKa.l((float)v1, (float)v1, (float)JPa.N);
                            }
                            if (c2 != uqa.g) break block5;
                            cArray = h2.toCharArray();
                            n6 = n7 = uSa.E;
                            break block6;
                        }
                        n8 = c2 == vRa.d ? aT_3.J((long)i2) : b2;
                        n8 = aT_3.l(n8, d2);
                        if (c2 != vRa.d) break block7;
                        n4 = n5;
                        kna2.f((String)h2, (float)(g2 / j2), (float)(f5 / j2), n8, (boolean)a2);
                        break block8;
                    }
                    kna2.l((String)h2, (float)(g2 / j2), (float)(f5 / j2), n8, (boolean)a2);
                    break block9;
                }
                while (n6 < cArray.length) {
                    char c3 = cArray[n7];
                    if (c3 == TPa.Aa) {
                        n6 = n7 += 2;
                        continue;
                    }
                    String string2 = new StringBuilder().insert(5 >> 3, aT_3.J((String)h2, n7)).append(c3).toString();
                    Kna kna3 = kna2;
                    float f7 = kna3.J(string2);
                    int n10 = aT_3.l(aT_3.J((long)i2, (float)g2, (float)f5), d2);
                    kna3.f(string2, (float)(g2 / j2), (float)(f5 / j2), n10, (boolean)a2);
                    g2 += f7 * j2;
                    n6 = ++n7;
                }
            }
            n4 = n5;
        }
        if (n4 != 0) {
            uKa.D();
        }
    }

    public static int J(long a2) {
        return Color.HSBtoRGB((float)((double)a2 % Vra.Ma / Vra.Ma), xSa.la, xSa.la);
    }

    public static int J(long l2, float f2, float f3) {
        long c2;
        float b2 = f3;
        float a2 = f2;
        return Color.HSBtoRGB((float)(((double)c2 - (double)a2 * Wqa.m - (double)b2 * Wqa.m) % DPa.P / DPa.P), xSa.la, xSa.la);
    }

    public aT_3(String string) {
        String b2 = string;
        aT_3 a2 = this;
        super((k)OT.i.F, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(long l2, float f2, float f3, int n2, int n3) {
        void b2;
        long e2;
        void d2;
        int n4 = n3;
        float a2 = f2;
        if (d2 == uqa.g) {
            void c2;
            return aT_3.J(e2, a2, (float)c2);
        }
        if (d2 == vRa.d) {
            return aT_3.J(e2);
        }
        return (int)b2;
    }

    public static boolean J(char a2) {
        if (a2 == jpa.E || a2 == Jra.o || a2 == rSa.i || a2 == Iqa.M || a2 == fPa.z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(long l2, float f2, float f3, float f4, float f5) {
        void b2;
        float f6;
        float f7 = f2;
        uKa.z();
        uKa.F((int)gua.X);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        aKa2.J(XTa.W, mka.I);
        float f8 = eua.C;
        float f9 = f6 = f7;
        while (f9 < f7 + b2) {
            void a2;
            void c2;
            void v1 = c2;
            while (v1 < c2 + a2) {
                long e2;
                void d2;
                float f10 = Math.min(f7 + b2, f6 + f8) - f6;
                float f11 = Math.min((float)(c2 + a2), (float)(d2 + f8)) - d2;
                int n2 = aT_3.J(e2, f6, (float)d2);
                int n3 = aT_3.J(e2, f6 + f10, (float)d2);
                int n4 = aT_3.J(e2, f6, (float)(d2 + f11));
                int n5 = aT_3.J(e2, f6 + f10, (float)(d2 + f11));
                aKa aKa3 = aKa2;
                float f12 = f6;
                aKa2.J((double)f6, (double)(d2 + f11), aSa.V).J(n4 >> ERa.C & osa.Ja, n4 >> Yqa.i & osa.Ja, n4 & osa.Ja, n4 >> osa.c & osa.Ja).M();
                aKa2.J((double)(f12 + f10), (double)(d2 + f11), aSa.V).J(n5 >> ERa.C & osa.Ja, n5 >> Yqa.i & osa.Ja, n5 & osa.Ja, n5 >> osa.c & osa.Ja).M();
                aKa3.J((double)(f12 + f10), (double)d2, aSa.V).J(n3 >> ERa.C & osa.Ja, n3 >> Yqa.i & osa.Ja, n3 & osa.Ja, n3 >> osa.c & osa.Ja).M();
                aKa3.J((double)f6, (double)d2, aSa.V).J(n2 >> ERa.C & osa.Ja, n2 >> Yqa.i & osa.Ja, n2 & osa.Ja, n2 >> osa.c & osa.Ja).M();
                v1 = d2 + f8;
            }
            f9 = f6 + f8;
        }
        pKa2.J();
        uKa.H();
    }
}

