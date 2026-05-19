/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  Fpa
 *  JPa
 *  KA
 *  Kpa
 *  NTa
 *  Qsa
 *  Qta
 *  Rna
 *  SOa
 *  Spa
 *  Sqa
 *  VJa
 *  WSa
 *  Wc
 *  Wma
 *  Ypa
 *  Zta
 *  asa
 *  bua
 *  lma
 *  lqa
 *  nQa
 *  pY
 *  pqa
 *  pua
 *  uKa
 *  uOa
 *  vRa
 *  ysa
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Rna_2
implements Wc {
    private static final ResourceLocation L;
    private static final ResourceLocation E;
    private final ResourceLocation m;
    private static final ThreadPoolExecutor C;
    private final uLa i;
    private static final Logger M;
    private long k;
    private final lma j;
    private final Kpa J;
    private String A;
    private VJa I;

    static {
        M = LogManager.getLogger();
        C = new ScheduledThreadPoolExecutor(tTa.h, new ThreadFactoryBuilder().setNameFormat(Qsa.Ma).setDaemon(vRa.d != 0).build());
        E = new ResourceLocation(PQa.u);
        L = new ResourceLocation(Nta.I);
    }

    public static /* synthetic */ uLa J(Rna a2) {
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public Rna_2(uLa uLa2, lma lma2) {
        void b2;
        Rna_2 a2;
        Rna_2 c2 = lma2;
        Rna_2 rna_2 = a2 = this;
        rna_2.i = b2;
        rna_2.j = c2;
        a2.J = Kpa.J();
        Rna_2 rna_22 = a2;
        rna_22.m = new ResourceLocation(new StringBuilder().insert(3 ^ 3, Nta.G).append(((lma)c2).serverIP).append(SOa.F).toString());
        a2.I = (VJa)a2.J.J().J(a2.m);
    }

    private boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, ResourceLocation resourceLocation) {
        void b2;
        void c2;
        ResourceLocation d2 = resourceLocation;
        Rna_2 a2 = this;
        a2.J.J().J(d2);
        uKa.B();
        KA.J((int)c2, (int)b2, (float)JPa.N, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Ura.m, (float)Ura.m);
        uKa.k();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void b2;
        int g2 = n2;
        Rna_2 f2 = this;
        if (b2 <= fPa.i) {
            void a2;
            if (b2 < fPa.i && b2 > ERa.C && f2.J()) {
                Rna_2 rna_2 = f2;
                rna_2.i.J(g2);
                rna_2.i.f();
                return vRa.d != 0;
            }
            if (b2 < ERa.C && a2 < ERa.C && f2.i.J((Rna)f2, g2)) {
                f2.i.f((Rna)f2, g2, EC.l());
                return vRa.d != 0;
            }
            if (b2 < ERa.C && a2 > ERa.C && f2.i.f((Rna)f2, g2)) {
                f2.i.J((Rna)f2, g2, EC.l());
                return vRa.d != 0;
            }
        }
        f2.i.J(g2);
        if (Kpa.J() - f2.k < DPa.o) {
            f2.i.f();
        }
        f2.k = Kpa.J();
        return uSa.E != 0;
    }

    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        Rna_2 a2 = this;
    }

    public lma J() {
        Rna_2 a2;
        return a2.j;
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_2, int var2_3, int var3_4, int var4_5, int var5_6, int var6_7, int var7_8, boolean var8_9) {
        block31: {
            var10_10 = this;
            if (!var10_10.j.field_78841_f) {
                v0 = var10_10;
                v0.j.field_78841_f = vRa.d;
                v0.j.pingToServer = Hra.M;
                v0.j.serverMOTD = Mqa.y;
                v0.j.populationInfo = Mqa.y;
                Rna_2.C.submit((Runnable)new Wma((Rna)var10_10));
            }
            d = var10_10.j.version > uOa.F ? vRa.d : uSa.E;
            var9_11 = var10_10.j.version < uOa.F ? vRa.d : uSa.E;
            i = d != 0 || var9_11 != 0 ? vRa.d : uSa.E;
            var10_10.J.Ea.J(var10_10.j.serverName, (int)(g + fPa.i + yRa.d), (int)(f + vRa.d), pua.o);
            var9_12 = var10_10.J.Ea.J(var10_10.j.serverMOTD, (int)(e - fPa.i - uqa.g));
            var11_14 = uSa.E;
            v1 = var11_14;
            while (v1 < Math.min(var9_12.size(), uqa.g)) {
                v2 = (String)var9_12.get(var11_14);
                v3 = var10_10.J.Ea.u * var11_14;
                var10_10.J.Ea.J(v2, (int)(g + fPa.i + yRa.d), (int)(f + lqa.s + v3), Qta.L);
                v1 = ++var11_14;
            }
            var11_15 = i != 0 ? pY.DARK_RED + var10_10.j.gameVersion : var10_10.j.populationInfo;
            v4 = var10_10;
            var9_13 = v4.J.Ea.J(var11_15);
            v4.J.Ea.J(var11_15, (int)(g + e - var9_13 - Ypa.A - uqa.g), (int)(f + vRa.d), Qta.L);
            var11_16 = uSa.E;
            var12_17 = null;
            if (i != 0) {
                i = tTa.h;
                var13_18 = d != 0 ? kua.y : MRa.a;
                var12_17 = var10_10.j.playerList;
            } else if (var10_10.j.field_78841_f && var10_10.j.pingToServer != Hra.M) {
                if (var10_10.j.pingToServer < nqa.i) {
                    i = tTa.h;
                    v5 = var10_10;
                } else if (var10_10.j.pingToServer < Spa.R) {
                    i = uSa.E;
                    v5 = var10_10;
                } else if (var10_10.j.pingToServer < WOa.D) {
                    i = vRa.d;
                    v5 = var10_10;
                } else if (var10_10.j.pingToServer < KSa.N) {
                    i = uqa.g;
                    v5 = var10_10;
                } else if (var10_10.j.pingToServer < asa.fa) {
                    i = yRa.d;
                    v5 = var10_10;
                } else {
                    i = AQa.P;
                    v5 = var10_10;
                }
                if (v5.j.pingToServer < nqa.i) {
                    var13_18 = LPa.fa;
                } else {
                    var13_18 = var10_10.j.pingToServer + APa.z;
                    var12_17 = var10_10.j.playerList;
                }
            } else {
                var11_16 = vRa.d;
                i = (int)(Kpa.J() / WSa.Ia + (long)(h * uqa.g) & bua.L);
                if (i > AQa.P) {
                    i = Yqa.i - i;
                }
                var13_18 = Ira.G;
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            v6 = var10_10;
            v6.J.J().J(KA.A);
            KA.J((int)(g + e - Ypa.A), (int)f, (float)(var11_16 * NTa.C), (float)(MTa.U + i * Yqa.i), (int)NTa.C, (int)Yqa.i, (float)Fpa.q, (float)Fpa.q);
            if (v6.j.J() != null && !var10_10.j.J().equals(var10_10.A)) {
                v7 = var10_10;
                v7.A = v7.j.J();
                v7.J();
                v7.i.J().f();
            }
            v8 = var10_10;
            if (var10_10.I != null) {
                v8.J((int)g, (int)f, var10_10.m);
                v9 = c;
            } else {
                v8.J((int)g, (int)f, Rna_2.E);
                v9 = c;
            }
            d = v9 - g;
            i = b - f;
            if (d >= e - Ypa.A && d <= e - tTa.h && i >= 0 && i <= Yqa.i) {
                v10 = var10_10;
                v11 = v10;
                v10.i.J(var13_18);
            } else {
                if (d >= e - var9_13 - Ypa.A - uqa.g && d <= e - Ypa.A - uqa.g && i >= 0 && i <= Yqa.i) {
                    var10_10.i.J(var12_17);
                }
                v11 = var10_10;
            }
            if (!v11.J.z.tb && a == false) break block31;
            v12 = var10_10;
            v12.J.J().J(Rna_2.L);
            v13 = g;
            KA.J((int)v13, (int)f, (int)(v13 + fPa.i), (int)(f + fPa.i), (int)Zta.ca);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            e = c - g;
            d = b - f;
            if (!v12.J()) ** GOTO lbl111
            if (e < fPa.i && e > ERa.C) {
                KA.J((int)g, (int)f, (float)JPa.N, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                v14 = var10_10;
            } else {
                KA.J((int)g, (int)f, (float)JPa.N, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
lbl111:
                // 2 sources

                v14 = var10_10;
            }
            if (!v14.i.J((Rna)var10_10, (int)h)) ** GOTO lbl118
            if (e < ERa.C && d < ERa.C) {
                KA.J((int)g, (int)f, (float)Sqa.Ja, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                v15 = var10_10;
            } else {
                KA.J((int)g, (int)f, (float)Sqa.Ja, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
lbl118:
                // 2 sources

                v15 = var10_10;
            }
            if (v15.i.f((Rna)var10_10, (int)h)) {
                if (e < ERa.C && d > ERa.C) {
                    KA.J((int)g, (int)f, (float)EPa.r, (float)Ura.m, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
                    return;
                }
                KA.J((int)g, (int)f, (float)EPa.r, (float)JPa.N, (int)fPa.i, (int)fPa.i, (float)Fpa.q, (float)Fpa.q);
            }
        }
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        Rna_2 rna_2 = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J() {
        BufferedImage a2;
        Rna_2 rna_2 = this;
        if (rna_2.j.J() == null) {
            rna_2.J.J().f(rna_2.m);
            rna_2.I = null;
            return;
        }
        ByteBuf byteBuf = Unpooled.copiedBuffer(rna_2.j.J(), Charsets.UTF_8);
        ByteBuf byteBuf2 = Base64.decode(byteBuf);
        try {
            a2 = gLa.J(new ByteBufInputStream(byteBuf2));
            Validate.validState((a2.getWidth() == ysa.s ? vRa.d : uSa.E) != 0, POa.p, new Object[uSa.E]);
            Validate.validState((a2.getHeight() == ysa.s ? vRa.d : uSa.E) != 0, PRa.V, new Object[uSa.E]);
        }
        catch (Throwable throwable) {
            M.error(new StringBuilder().insert(3 ^ 3, eta.Y).append(rna_2.j.serverName).append(nQa.T).append(rna_2.j.serverIP).append(hpa.b).toString(), throwable);
            rna_2.j.J((String)null);
            return;
        }
        finally {
            byteBuf.release();
            byteBuf2.release();
        }
        if (rna_2.I == null) {
            rna_2.I = new VJa(a2.getWidth(), a2.getHeight());
            Rna_2 rna_22 = rna_2;
            rna_2.J.J().J(rna_22.m, (H)rna_22.I);
        }
        a2.getRGB(uSa.E, uSa.E, a2.getWidth(), a2.getHeight(), rna_2.I.J(), uSa.E, a2.getWidth());
        rna_2.I.f();
    }

    public static /* synthetic */ lma J(Rna a2) {
        return a2.j;
    }
}

