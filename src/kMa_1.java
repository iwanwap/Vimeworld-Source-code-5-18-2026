/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Kpa
 *  Loa
 *  NTa
 *  Qsa
 *  SOa
 *  Sna
 *  XTa
 *  aPa
 *  ac
 *  asa
 *  dQa
 *  fpa
 *  ld
 *  pua
 *  vRa
 *  vpa
 *  yra
 */
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class kMa_1
extends Loa {
    private static final long[] E;
    private int m;
    private int C;
    private int i;
    private final ld M;
    private static final List<String> k;
    private long j;
    private final AtomicBoolean J;
    public static final Logger A;
    private List<String> I;

    public static int J(String a2) {
        return k.indexOf(a2);
    }

    public void A() {
        kMa_1 a2;
        kMa_1 kMa_12 = a2;
        kMa_12.E.clear();
        a2.I = kMa_12.L.J(a2.M.l(), (int)(a2.A - vpa.o));
        kMa_12.m = kMa_12.I.size() * a2.L.u;
        kMa_12.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - ySa.T), (int)(a2.I / uqa.g + a2.m / uqa.g + a2.L.u), oha.J(SOa.l, new Object[uSa.E])));
    }

    public void J(Exception exception, InetAddress inetAddress, Sna sna) {
        kMa_1 d2 = sna;
        kMa_1 a2 = this;
        a2.j = System.currentTimeMillis();
        a2.J.set(vRa.d != 0);
    }

    static {
        A = LogManager.getLogger(KSa.a);
        k = new ArrayList<String>();
        long[] lArray = new long[NTa.C];
        lArray[uSa.E] = vua.Fa;
        lArray[vRa.d] = vua.Fa;
        lArray[uqa.g] = vua.Fa;
        lArray[yRa.d] = fpa.g;
        lArray[AQa.P] = fpa.g;
        lArray[tTa.h] = fpa.g;
        lArray[uua.p] = rpa.t;
        lArray[XTa.W] = rpa.t;
        lArray[Yqa.i] = rpa.t;
        lArray[WOa.fa] = kra.ja;
        E = lArray;
        String string = System.getProperty(aPa.a);
        A.info(new StringBuilder().insert(3 >> 2, mPa.A).append(string).toString());
        if (string != null) {
            k.addAll(Arrays.asList(string.split(yra.t)));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void J(int var1_1, int var2_2, float var3_3) {
        block8: {
            v0 = var4_4 = this /* !! */ ;
            v0.i();
            if (!v0.J.get()) break block8;
            var5_5 = kMa_1.E[var4_4.i];
            var7_7 = System.currentTimeMillis() - var4_4.j;
            if (var7_7 > var5_5) {
                v1 = var4_4;
                v1.i += vRa.d;
                if (v1.i >= kMa_1.E.length) {
                    var4_4.i = kMa_1.E.length - vRa.d;
                }
                var4_4.J.set((boolean)uSa.E);
                var4_4.k = null;
                var4_4.J(kMa_1.k.get(var4_4.C));
                if ((var4_4.C += vRa.d) >= kMa_1.k.size()) {
                    var4_4.C = uSa.E;
                }
                v2 = new Object[uqa.g];
                v2[uSa.E] = var4_4.i;
                v2[vRa.d] = kMa_1.E[var4_4.i];
                d /* !! */  = oha.J(hQa.Aa, v2);
            } else {
                var9_9 = (var5_5 - var7_7) / asa.fa + dQa.Ga;
                d /* !! */  = var9_9 + XTa.Da;
            }
            ** GOTO lbl34
        }
        if (var4_4.k == null) {
            d /* !! */  = oha.J(hQa.Aa, new Object[uSa.E]);
            v3 /* !! */  = d /* !! */ ;
        } else {
            d /* !! */  = oha.J(yra.m, new Object[uSa.E]);
lbl34:
            // 3 sources

            v3 /* !! */  = d /* !! */ ;
        }
        kMa_1.J((String)v3 /* !! */ , (int)(var4_4.A / uqa.g), (int)(var4_4.I / uqa.g - var4_4.m / uqa.g - Qsa.Ha), (int)pua.o);
        v4 = var4_4;
        var5_6 = var4_4.I / uqa.g - v4.m / uqa.g;
        if (v4.I != null) {
            v5 = var6_10 = var4_4.I.iterator();
            while (v5.hasNext()) {
                var7_8 = var6_10.next();
                v5 = var6_10;
                v6 = var5_6;
                var5_6 += 10;
                kMa_1.J((String)var7_8, (int)(var4_4.A / uqa.g), (int)v6, (int)pua.o);
            }
        }
        super.f((int)c, (int)b, (float)a);
    }

    /*
     * WARNING - void declaration
     */
    public kMa_1(EC eC2, Kpa kpa2, int n2, ld ld2) {
        kMa_1 e2;
        void b2;
        void c2;
        void d2;
        kMa_1 a2;
        kMa_1 kMa_12 = kMa_13;
        kMa_1 kMa_13 = ld2;
        kMa_1 kMa_14 = a2 = kMa_12;
        super((EC)d2, (Kpa)c2);
        kMa_1 kMa_15 = a2;
        a2.J = new AtomicBoolean(vRa.d != 0);
        a2.C = b2;
        kMa_14.j = System.currentTimeMillis();
        kMa_14.I = (List<String>)vRa.d;
        kMa_14.M = e2;
    }
}

