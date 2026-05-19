/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Kpa
 *  kLa
 *  vRa
 *  wka
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import javax.imageio.ImageIO;
import optifine.Config;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eLa
extends Thread {
    public final /* synthetic */ kLa A;
    private static final String I = "CL_00001050";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        var3_2 = this;
        if (var3_2.J()) {
            return;
        }
        var1_3 = null;
        if (kLa.J()) {
            v0 = new Object[uqa.g];
            v0[uSa.E] = kLa.J((kLa)var3_2.A);
            v0[vRa.d] = kLa.J((kLa)var3_2.A).J();
            kLa.J().info(Bsa.Ga, v0);
        }
        if (kLa.J((kLa)var3_2.A)) {
            kLa.J((kLa)var3_2.A);
            return;
        }
        var1_3 = var3_2.J();
        if (var1_3.getResponseCode() / ySa.T == uqa.g) ** GOTO lbl-1000
        if (var1_3.getErrorStream() != null) {
            Config.J(var1_3.getErrorStream());
        }
        if (var1_3 == null) ** GOTO lbl35
        var1_3.disconnect();
        ** GOTO lbl35
        {
            catch (Exception var2_12) {
                block30: {
                    try {
                        kLa.J().error(new StringBuilder().insert(3 & 4, zua.O).append(kLa.J((kLa)var3_2.A)).append(Xpa.E).append(var2_12.getClass().getName()).append(Xpa.E).append(var2_12.getMessage()).toString());
                        if (var1_3 == null) ** GOTO lbl105
                        var1_3.disconnect();
                    }
                    catch (Throwable var8_13) {
                        if (var1_3 != null) {
                            var1_3.disconnect();
                        }
                        var3_2.A.I = (boolean)(kLa.J((kLa)var3_2.A) != null ? vRa.d : uSa.E);
                        throw var8_13;
                    }
lbl35:
                    // 2 sources

                    var3_2.A.I = (boolean)(kLa.J((kLa)var3_2.A) != null ? vRa.d : uSa.E);
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if (kLa.J((kLa)var3_2.A) == null) ** GOTO lbl94
                        a = new ByteArrayOutputStream();
                        try {
                            IOUtils.copy(var1_3.getInputStream(), (OutputStream)a);
                            v1 = a;
                        }
                        catch (Exception var4_4) {
                            kLa.J((kLa)var3_2.A).f();
                            throw var4_4;
                        }
                    }
                    var4_5 = v1.toByteArray();
                    try {
                        block29: {
                            a = kLa.J((kLa)var3_2.A).J();
                            var5_6 = null;
                            try {
                                a.write(var4_5);
                                if (a != null) {
                                    if (var5_6 == null) break block29;
                                }
                                ** GOTO lbl87
                            }
                            catch (Throwable var6_8) {
                                try {
                                    var5_6 = var6_8;
                                    throw var5_6;
                                }
                                catch (Throwable var7_10) {
                                    if (a != null) {
                                        if (var5_6 != null) {
                                            try {
                                                a.close();
                                                v2 = var7_10;
                                                throw v2;
                                            }
                                            catch (Throwable var6_9) {
                                                v2 = var7_10;
                                                var5_6.addSuppressed(var6_9);
                                                throw v2;
                                            }
                                        }
                                        a.close();
                                    }
                                    v2 = var7_10;
                                    throw v2;
                                }
                            }
                            try {
                                a.close();
                            }
                            catch (Throwable var6_7) {
                                var5_6.addSuppressed(var6_7);
                            }
                            ** GOTO lbl87
                        }
                        a.close();
                        ** GOTO lbl87
                    }
                    catch (Exception a) {}
                    {
                        block31: {
                            kLa.J((kLa)var3_2.A).f();
                            throw a;
lbl87:
                            // 4 sources

                            if (var3_2.A.L != null) {
                                kLa.J((kLa)var3_2.A).J(var3_2.A.L.longValue());
                            }
                            v3 = var3_2;
                            v4 = v3;
                            kLa.J((kLa)v3.A).J(gsa.Y);
                            var2_11 = ImageIO.read(new ByteArrayInputStream(var4_5));
                            break block31;
lbl94:
                            // 1 sources

                            var2_11 = gLa.J(var1_3.getInputStream());
                            v4 = var3_2;
                        }
                        if (kLa.J((kLa)v4.A) != null) {
                            var2_11 = kLa.J((kLa)var3_2.A).J(var2_11);
                        }
                        var3_2.A.J(var2_11);
                        if (var1_3 == null) break block30;
                        var1_3.disconnect();
                    }
                }
                var3_2.A.I = (boolean)(kLa.J((kLa)var3_2.A) != null ? vRa.d : uSa.E);
                return;
lbl105:
                // 2 sources

                var3_2.A.I = (boolean)(kLa.J((kLa)var3_2.A) != null ? vRa.d : uSa.E);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public eLa(kLa kLa2, String string) {
        void b2;
        String c2 = string;
        eLa a2 = this;
        a2.A = b2;
        super(c2);
    }

    public static /* synthetic */ rla J(String a2) {
        return new rla(null);
    }

    private HttpURLConnection J() throws IOException {
        eLa eLa2 = this;
        URL uRL = new URL(kLa.J((kLa)eLa2.A));
        rla rla2 = (rla)eLa2.A.M.computeIfAbsent(uRL.getHost().toLowerCase(Locale.ROOT), wka.J());
        if (rla2.I == null) {
            // empty if block
        }
        while (true) {
            try {
                HttpURLConnection a2 = (HttpURLConnection)uRL.openConnection(Kpa.J().J());
                a2.setDoInput(vRa.d != 0);
                a2.setDoOutput(uSa.E != 0);
                a2.connect();
                return a2;
            }
            catch (IOException a2) {
                IOException iOException = a2;
                rla rla3 = rla2;
                rla3.A = vRa.d;
                rla3.J();
                if (rla3.J()) continue;
                throw iOException;
            }
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean J() {
        var1_2 = this;
        if (kLa.J((kLa)var1_2.A) == null) return (boolean)uSa.E;
        if (kLa.J((kLa)var1_2.A).J() == false) return (boolean)uSa.E;
        if (var1_2.A.L != null && kLa.J((kLa)var1_2.A).J() < var1_2.A.L) {
            if (kLa.J() == false) return (boolean)uSa.E;
            v0 = new Object[yRa.d];
            v0[uSa.E] = kLa.J((kLa)var1_2.A).J();
            v0[vRa.d] = var1_2.A.L;
            v0[uqa.g] = kLa.J((kLa)var1_2.A).J();
            kLa.J().info(tpa.t, v0);
            return (boolean)uSa.E;
        }
        if (kLa.J()) {
            v1 = new Object[vRa.d];
            v1[uSa.E] = kLa.J((kLa)var1_2.A).J();
            kLa.J().info(Bra.fa, v1);
        }
        a = kLa.J((kLa)var1_2.A).J();
        var2_3 = null;
        kLa.J((kLa)var1_2.A, (BufferedImage)ImageIO.read(a));
        if (a == null) ** GOTO lbl62
        if (var2_3 == null) ** GOTO lbl59
        ** GOTO lbl51
        {
            catch (IOException a) {
                kLa.J().error(new StringBuilder().insert(5 >> 3, Xpa.s).append(kLa.J((kLa)var1_2.A).J()).toString(), (Throwable)a);
                kLa.J((kLa)var1_2.A).f();
                return (boolean)uSa.E;
            }
            {
                block16: {
                    catch (Throwable var3_5) {
                        try {
                            var2_3 = var3_5;
                            throw var2_3;
                        }
                        catch (Throwable var4_7) {
                            if (a != null) {
                                if (var2_3 != null) {
                                    try {
                                        a.close();
                                        v2 = var4_7;
                                        throw v2;
                                    }
                                    catch (Throwable var3_6) {
                                        v2 = var4_7;
                                        var2_3.addSuppressed(var3_6);
                                        throw v2;
                                    }
                                }
                                a.close();
                            }
                            v2 = var4_7;
                            throw v2;
                        }
                    }
lbl51:
                    // 1 sources

                    try {
                        a.close();
                        v3 = var1_2;
                    }
                    catch (Throwable var3_4) {}
                    v3 = var1_2;
                    var2_3.addSuppressed(var3_4);
                    break block16;
lbl59:
                    // 1 sources

                    a.close();
                    v3 = var1_2;
                    break block16;
lbl62:
                    // 1 sources

                    v3 = var1_2;
                }
                if (kLa.J((kLa)v3.A) != null) {
                    v4 = var1_2;
                    v4.A.J(kLa.J((kLa)v4.A).J(kLa.J((kLa)var1_2.A)));
                }
                var1_2.A.I = (boolean)(kLa.J((kLa)var1_2.A) != null ? vRa.d : uSa.E);
                return (boolean)vRa.d;
            }
        }
    }
}

