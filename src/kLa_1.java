/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FF
 *  Jja
 *  Kpa
 *  LF
 *  PE
 *  Sw
 *  U
 *  Wsa
 *  bd
 *  kLa
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kLa_1
extends Jja {
    private final String D;
    public boolean f;
    private Thread F;
    private final Sw g;
    public Long L;
    private static final String E = "CL_00001049";
    private static final AtomicInteger m;
    private static final boolean C;
    private BufferedImage i;
    public Map<String, rla> M;
    private boolean k;
    private final bd j;
    private static final Pattern J;
    private static final Logger A;
    public Boolean I;

    public static /* synthetic */ bd J(kLa a2) {
        return a2.j;
    }

    public void d() {
        kLa_1 a2;
        if (!J.matcher(a2.D).matches()) {
            A.warn(new StringBuilder().insert(5 >> 3, fPa.Aa).append(a2.D).append(xTa.f).toString());
            a2.I = uSa.E != 0;
            return;
        }
        kLa_1 kLa_12 = a2;
        kLa_1 kLa_13 = a2;
        a2.F = new eLa((kLa)a2, Wsa.M + m.incrementAndGet());
        kLa_12.F.setDaemon(vRa.d != 0);
        kLa_12.F.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void C() {
        var3_2 = this;
        var5_3 = FF.J((String)var3_2.D, (Proxy)Kpa.J().J());
        var4_5 /* !! */  = FF.J((LF)var5_3);
        if (var4_5 /* !! */ .J() / ySa.T == uqa.g) ** GOTO lbl21
        v0 = var3_2.i != null ? vRa.d : uSa.E;
        ** GOTO lbl19
        {
            catch (Exception var5_4) {
                try {
                    kLa_1.A.error(new StringBuilder().insert(3 ^ 3, KQa.r).append(var5_4.getClass().getName()).append(Xpa.E).append(var5_4.getMessage()).toString());
                    if (var3_2.i != null) {
                        v1 = vRa.d;
                    }
                    v1 = uSa.E;
                }
                catch (Throwable var7_11) {
                    var3_2.I = (boolean)(var3_2.i != null ? vRa.d : uSa.E);
                    throw var7_11;
                }
lbl19:
                // 1 sources

                var3_2.I = (boolean)v0;
                return;
lbl21:
                // 1 sources

                var4_5 /* !! */  = (PE)var4_5 /* !! */ .J();
                if (var3_2.g == null) ** GOTO lbl66
                try {
                    block22: {
                        a = var3_2.g.J();
                        var2_6 = null;
                        try {
                            a.write((byte[])var4_5 /* !! */ );
                            if (a != null) {
                                if (var2_6 == null) break block22;
                            }
                            ** GOTO lbl62
                        }
                        catch (Throwable var1_8) {
                            try {
                                var2_6 = var1_8;
                                throw var2_6;
                            }
                            catch (Throwable var6_10) {
                                if (a != null) {
                                    if (var2_6 != null) {
                                        try {
                                            a.close();
                                            v2 = var6_10;
                                            throw v2;
                                        }
                                        catch (Throwable var1_9) {
                                            v2 = var6_10;
                                            var2_6.addSuppressed(var1_9);
                                            throw v2;
                                        }
                                    }
                                    a.close();
                                }
                                v2 = var6_10;
                                throw v2;
                            }
                        }
                        try {
                            a.close();
                        }
                        catch (Throwable var1_7) {
                            var2_6.addSuppressed(var1_7);
                        }
                        ** GOTO lbl62
                    }
                    a.close();
                    ** GOTO lbl62
                }
                catch (Exception a) {}
                {
                    var3_2.g.f();
                    throw a;
lbl62:
                    // 4 sources

                    if (var3_2.L != null) {
                        v3 = var3_2;
                        v3.g.J(v3.L.longValue());
                    }
                    var3_2.g.J(gsa.Y);
lbl66:
                    // 2 sources

                    a = ImageIO.read(new ByteArrayInputStream((byte[])var4_5 /* !! */ ));
                    if (var3_2.j != null) {
                        a = var3_2.j.J((BufferedImage)a);
                    }
                    var3_2.J((BufferedImage)a);
                    var3_2.I = (boolean)(var3_2.i != null ? vRa.d : uSa.E);
                }
                return;
                var3_2.I = v1;
                return;
            }
        }
    }

    private void f() {
        kLa_1 a2;
        if (!a2.k && a2.i != null) {
            a2.k = vRa.d;
            if (a2.J != null) {
                a2.l();
            }
            gLa.J(super.J(), a2.i);
        }
    }

    private boolean f() {
        kLa_1 kLa_12 = this;
        if (!kLa_12.f) {
            return uSa.E != 0;
        }
        Proxy a2 = Kpa.J().J();
        if (a2.type() != Proxy.Type.DIRECT && a2.type() != Proxy.Type.SOCKS) {
            return uSa.E != 0;
        }
        return kLa_12.D.startsWith(rSa.ba);
    }

    public static /* synthetic */ void J(kLa a2) {
        super.C();
    }

    public static /* synthetic */ String J(kLa a2) {
        return a2.D;
    }

    public int J() {
        kLa_1 a2;
        kLa_1 kLa_12 = a2;
        kLa_12.f();
        return super.J();
    }

    public static /* synthetic */ boolean J(kLa a2) {
        return super.f();
    }

    public static /* synthetic */ BufferedImage J(kLa a2) {
        return a2.i;
    }

    public static /* synthetic */ Logger J() {
        return A;
    }

    public void J(U u2) throws IOException {
        kLa_1 b2 = u2;
        kLa_1 a2 = this;
        if (a2.i == null && a2.J != null) {
            super.J((U)b2);
        }
        if (a2.I == null) {
            a2.d();
        }
    }

    public static /* synthetic */ Sw J(kLa a2) {
        return a2.g;
    }

    public static /* synthetic */ boolean J() {
        return C;
    }

    /*
     * WARNING - void declaration
     */
    public kLa_1(Sw sw2, String string, ResourceLocation resourceLocation, bd bd2) {
        kLa_1 e2;
        void c2;
        void d2;
        void b2;
        kLa_1 a2;
        kLa_1 kLa_12 = kLa_13;
        kLa_1 kLa_13 = bd2;
        kLa_1 kLa_14 = a2 = kLa_12;
        kLa_1 kLa_15 = a2;
        super((ResourceLocation)b2);
        a2.I = null;
        a2.f = uSa.E;
        kLa_15.L = null;
        kLa_1 kLa_16 = a2;
        kLa_15.M = new ConcurrentHashMap<String, rla>();
        kLa_15.g = d2;
        kLa_14.D = c2;
        kLa_14.j = e2;
    }

    static {
        C = Boolean.getBoolean(sOa.Ga);
        J = Pattern.compile(Jpa.u);
        A = LogManager.getLogger();
        m = new AtomicInteger(uSa.E);
    }

    public void J(BufferedImage bufferedImage) {
        Object b2 = bufferedImage;
        kLa_1 a2 = this;
        a2.i = b2;
        if (a2.j != null) {
            a2.j.J();
        }
        a2.I = (a2.i != null ? vRa.d : uSa.E) != 0;
    }

    public static /* synthetic */ BufferedImage J(kLa kLa2, BufferedImage bufferedImage) {
        Object b2 = bufferedImage;
        kLa a2 = kLa2;
        a2.i = b2;
        return a2.i;
    }
}

