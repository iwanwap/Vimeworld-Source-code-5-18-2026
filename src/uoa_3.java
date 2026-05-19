/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  EC
 *  JPa
 *  KA
 *  Lqa
 *  MQa
 *  NQa
 *  Qba
 *  Qsa
 *  Sqa
 *  Tpa
 *  Uqa
 *  Uta
 *  XTa
 *  ZOa
 *  aKa
 *  aSa
 *  kpa
 *  lqa
 *  mka
 *  ooa
 *  pKa
 *  pY
 *  pqa
 *  pua
 *  qBa
 *  uKa
 *  ura
 *  vPa
 *  vRa
 *  vpa
 *  wNa
 *  wra
 */
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uoa_3
extends EC {
    private List<String> m;
    private int i;
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private static final Logger j;
    private int J;
    private float A = MQa.L;

    public uoa_3() {
        uoa_3 a2;
    }

    static {
        j = LogManager.getLogger();
        M = new ResourceLocation(bsa.N);
        k = new ResourceLocation(wsa.z);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void A() {
        uoa_3 uoa_32 = this;
        if (uoa_32.m == null) {
            uoa_32.m = Lists.newArrayList();
            try {
                int n2;
                Object a2 = Mqa.y;
                String string = new StringBuilder().insert(3 >> 2, Mqa.y).append(pY.WHITE).append(pY.OBFUSCATED).append(pY.GREEN).append(pY.AQUA).toString();
                int n3 = Uta.H;
                InputStream inputStream = uoa_32.g.J().J(new ResourceLocation(vPa.E)).J();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                Random random = new Random(Lqa.v);
                BufferedReader bufferedReader2 = bufferedReader;
                while ((a2 = bufferedReader2.readLine()) != null) {
                    a2 = ((String)a2).replaceAll(Uqa.u, uoa_32.g.J().J());
                    Object object = a2;
                    while (object.contains(string)) {
                        Object object2 = a2;
                        int n4 = ((String)object2).indexOf(string);
                        String string2 = ((String)object2).substring(uSa.E, n4);
                        String string3 = ((String)object2).substring(n4 + string.length());
                        object = new StringBuilder().insert(3 & 4, string2).append(pY.WHITE).append(pY.OBFUSCATED).append(pta.y.substring(uSa.E, random.nextInt(AQa.P) + yRa.d)).append(string3).toString();
                    }
                    uoa_3 uoa_33 = uoa_32;
                    uoa_33.m.addAll(uoa_33.g.Ea.J((String)a2, n3));
                    uoa_32.m.add(Mqa.y);
                    bufferedReader2 = bufferedReader;
                }
                inputStream.close();
                int n5 = n2 = uSa.E;
                while (n5 < Yqa.i) {
                    uoa_32.m.add(Mqa.y);
                    n5 = ++n2;
                }
                inputStream = uoa_32.g.J().J(new ResourceLocation(kpa.Y)).J();
                BufferedReader bufferedReader3 = bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                while (true) {
                    if ((a2 = bufferedReader3.readLine()) == null) {
                        inputStream.close();
                        uoa_32.J = uoa_32.m.size() * lqa.s;
                        return;
                    }
                    a2 = ((String)a2).replaceAll(Uqa.u, uoa_32.g.J().J());
                    a2 = ((String)a2).replaceAll(ura.t, rta.N);
                    bufferedReader3 = bufferedReader;
                    uoa_3 uoa_34 = uoa_32;
                    uoa_34.m.addAll(uoa_34.g.Ea.J((String)a2, n3));
                    uoa_32.m.add(Mqa.y);
                }
            }
            catch (Exception a2) {
                j.error(Bsa.F, (Throwable)a2);
            }
        }
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        uoa_3 a2 = this;
        if (c3 == vRa.d) {
            a2.J();
        }
    }

    public boolean J() {
        return vRa.d != 0;
    }

    private void J() {
        uoa_3 a2;
        uoa_3 uoa_32 = a2;
        uoa_32.g.c.F.J((KC)new qBa(Qba.PERFORM_RESPAWN));
        uoa_32.g.J((EC)null);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        int n4;
        void a2;
        void b2;
        void c2;
        uoa_3 uoa_32;
        uoa_3 uoa_33 = uoa_32 = this;
        uoa_33.f((int)c2, (int)b2, (float)a2);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        int n5 = Uta.H;
        float f3 = uoa_33.A / uqa.g - n5 / uqa.g;
        int d2 = uoa_33.I + vpa.o;
        float f4 = -((float)uoa_33.i + a2) * uoa_32.A;
        uKa.e();
        uKa.J((float)JPa.N, (float)f4, (float)JPa.N);
        uoa_33.g.J().J(M);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uoa_33.f((int)f3, d2, uSa.E, uSa.E, BQa.Q, Yqa.D);
        uoa_33.f((int)(f3 + BQa.Q), d2, uSa.E, wra.e, BQa.Q, Yqa.D);
        d2 += ZOa.x;
        int n6 = n4 = uSa.E;
        while (n6 < uoa_32.m.size()) {
            if (n4 == uoa_32.m.size() - vRa.d) {
                float f5;
                float f6 = (float)d2 + f4 - (float)(uoa_32.I / uqa.g - uua.p);
                if (f5 < JPa.N) {
                    uKa.J((float)JPa.N, (float)(-f6), (float)JPa.N);
                }
            }
            if ((float)d2 + f4 + Fua.Y + Qsa.k > JPa.N && (float)d2 + f4 < (float)uoa_32.I) {
                String string = uoa_32.m.get(n4);
                if (string.startsWith(osa.G)) {
                    uoa_32.L.J(string.substring(yRa.d), f3 + (n5 - uoa_32.L.J(string.substring(yRa.d))) / uqa.g, (float)d2, pua.o);
                } else {
                    uoa_3 uoa_34 = uoa_32;
                    uoa_34.L.p.setSeed((long)n4 * Tpa.G + (long)(uoa_32.i / AQa.P));
                    uoa_34.L.J(string, f3, (float)d2, pua.o);
                }
            }
            d2 += 12;
            n6 = ++n4;
        }
        uKa.D();
        uoa_3 uoa_35 = uoa_32;
        uoa_3 uoa_36 = uoa_32;
        uoa_36.g.J().J(k);
        uKa.B();
        uKa.f((int)uSa.E, (int)Wqa.w);
        n4 = (int)uoa_36.A;
        int n7 = uoa_35.I;
        aKa aKa3 = aKa2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.a);
        aKa4.J(aSa.V, (double)n7, (double)uoa_32.I).J(aSa.V, oua.i).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa3.J((double)n4, (double)n7, (double)uoa_32.I).J(oua.i, oua.i).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa3.J((double)n4, aSa.V, (double)uoa_32.I).J(oua.i, aSa.V).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        aKa2.J(aSa.V, aSa.V, (double)uoa_32.I).J(aSa.V, aSa.V).J(pqa.r, pqa.r, pqa.r, pqa.r).M();
        pKa2.J();
        uKa.k();
        super.J((int)c2, (int)b2, (float)a2);
    }

    private void f(int n2, int n3, float f2) {
        float f3;
        float a2;
        uoa_3 uoa_32 = this;
        pKa c2 = pKa.J();
        aKa b2 = c2.J();
        uoa_3 uoa_33 = uoa_32;
        uoa_3 uoa_34 = uoa_32;
        uoa_34.g.J().J(KA.J);
        b2.J(XTa.W, mka.a);
        float f4 = uoa_34.A;
        uoa_3 uoa_35 = uoa_32;
        float f5 = JPa.N - ((float)uoa_35.i + a2) * MQa.L * uoa_32.A;
        float f6 = (float)uoa_33.I - ((float)uoa_32.i + a2) * MQa.L * uoa_32.A;
        float f7 = vsa.J;
        float d2 = ((float)uoa_35.i + a2 - JPa.N) * WRa.e;
        a2 = ((float)(uoa_33.J + uoa_32.I + uoa_32.I + osa.c) / uoa_32.A - eta.e - ((float)uoa_32.i + a2)) * Qsa.N;
        if (f3 < d2) {
            d2 = a2;
        }
        if (d2 > pqa.r) {
            d2 = pqa.r;
        }
        float f8 = d2;
        d2 = f8 * f8;
        d2 = d2 * Sqa.Ja / NQa.Y;
        aKa aKa2 = b2;
        float f9 = d2;
        b2.J(aSa.V, (double)uoa_32.I, (double)uoa_32.I).J(aSa.V, (double)(f5 * f7)).J(f9, f9, f9, pqa.r).M();
        float f10 = d2;
        aKa2.J((double)f4, (double)uoa_32.I, (double)uoa_32.I).J((double)((float)f4 * f7), (double)(f5 * f7)).J(f10, f10, f10, pqa.r).M();
        float f11 = d2;
        aKa2.J((double)f4, aSa.V, (double)uoa_32.I).J((double)((float)f4 * f7), (double)(f6 * f7)).J(f11, f11, f11, pqa.r).M();
        float f12 = d2;
        aKa2.J(aSa.V, aSa.V, (double)uoa_32.I).J(aSa.V, (double)(f6 * f7)).J(f12, f12, f12, pqa.r).M();
        c2.J();
    }

    public void l() {
        uoa_3 uoa_32;
        uoa_3 uoa_33 = uoa_32 = this;
        uoa_3 a22 = uoa_33.g.J();
        wNa wNa2 = uoa_33.g.J();
        if (uoa_33.i == 0) {
            uoa_3 uoa_34 = a22;
            uoa_34.f();
            uoa_34.J(ooa.CREDITS);
            wNa2.d();
        }
        wNa2.J();
        uoa_3 uoa_35 = uoa_32;
        uoa_35.i += vRa.d;
        uoa_3 uoa_36 = uoa_32;
        float a22 = (float)(uoa_35.J + uoa_32.I + uoa_32.I + osa.c) / uoa_36.A;
        if ((float)uoa_36.i > a22) {
            uoa_32.J();
        }
    }
}

