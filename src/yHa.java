/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  NQa
 *  Pqa
 *  Rd
 *  UIa
 *  aJa
 *  bd
 *  cGa
 *  dQa
 *  gla
 *  hra
 *  kLa
 *  vRa
 *  wOa
 *  xHa
 *  xOa
 *  yb
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.util.ResourceLocation;

public final class yHa {
    private static final ExecutorService i;
    private final File M;
    private final LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> k;
    private final MinecraftSessionService j;
    private final File J;
    private static final List<String> A;
    private final aJa I;

    /*
     * WARNING - void declaration
     */
    public void J(GameProfile gameProfile, yb yb2, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        yHa a2 = this;
        i.submit((Runnable)new xHa(a2, (GameProfile)c2, d2, (yb)b2));
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        void b2;
        Object c2 = type;
        yHa a2 = this;
        return a2.J((MinecraftProfileTexture)b2, (MinecraftProfileTexture.Type)((Object)c2), null);
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        yHa a2 = this;
        return a2.k.getUnchecked(b2);
    }

    public static /* synthetic */ MinecraftSessionService J(yHa a2) {
        return a2.j;
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Nta.A;
        stringArray[vRa.d] = hpa.c;
        stringArray[uqa.g] = NQa.l;
        A = Arrays.asList(stringArray);
        i = new ThreadPoolExecutor(uSa.E, uqa.g, dQa.Ga, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }

    /*
     * Unable to fully structure code
     */
    public ResourceLocation J(MinecraftProfileTexture var1_2, MinecraftProfileTexture.Type var2_3, yb var3_4) {
        block10: {
            var7_5 = this;
            var4_6 = c.getHash();
            var5_7 = Kpa.J().ha.J((MinecraftProfileTexture.Type)b, (String)var4_6);
            var4_6 = new ResourceLocation((b == MinecraftProfileTexture.Type.SKIN ? xOa.q : Pqa.p) + (String)var4_6 + KPa.C);
            var6_8 = var7_5.I.J((ResourceLocation)var4_6);
            if (var6_8 != null) {
                if (var6_8 instanceof kLa && ((kLa)var6_8).I != Boolean.TRUE) {
                    if (a != null) {
                        a.J((MinecraftProfileTexture.Type)b, UIa.J(), (MinecraftProfileTexture)c);
                    }
                    return UIa.J();
                }
                v0 = d = var5_7.J() != false && var5_7.J() < c.timestamp ? vRa.d : uSa.E;
                if (!c.getUrl().contains(wOa.Ja)) {
                    d = uSa.E;
                }
                if (d == 0) {
                    if (a != null) {
                        a.J((MinecraftProfileTexture.Type)b, (ResourceLocation)var4_6, (MinecraftProfileTexture)c);
                    }
                    return var4_6;
                }
            }
            if (var6_8 instanceof Rd) {
                ((Rd)var6_8).l();
            }
            d = c.getUrl();
            for (String var8_9 : yHa.A) {
                if (!d.startsWith(var8_9)) continue;
                v1 = d = new StringBuilder().insert(5 >> 3, Yua.V).append(d.substring(var8_9.length())).toString();
                break block10;
            }
            v1 = d;
        }
        if (!v1.startsWith(Yua.V)) ** GOTO lbl35
        if (d.contains(vRa.A)) {
            v2 = new StringBuilder();
            d = v2.insert(3 ^ 3, (String)d).append(MRa.B).append(c.timestamp).toString();
            v3 = b;
        } else {
            v2 = new StringBuilder();
            d = v2.insert(3 & 4, (String)d).append(hra.t).append(c.timestamp).toString();
lbl35:
            // 2 sources

            v3 = b;
        }
        var6_8 = v3 == MinecraftProfileTexture.Type.SKIN ? new gla() : new ILa();
        var8_9 = new kLa(var5_7, (String)d, UIa.J(), (bd)new cGa(var7_5, (bd)var6_8, var5_7, (MinecraftProfileTexture)c, (yb)a, (MinecraftProfileTexture.Type)b, (ResourceLocation)var4_6));
        var8_9.L = c.timestamp;
        v4 = var4_6;
        var7_5.I.J((ResourceLocation)v4, (H)var8_9);
        return v4;
    }

    /*
     * WARNING - void declaration
     */
    public yHa(aJa aJa2, File file, MinecraftSessionService minecraftSessionService) {
        void b2;
        void c2;
        yHa a2;
        MinecraftSessionService d2 = minecraftSessionService;
        yHa yHa2 = a2 = this;
        yHa yHa3 = a2;
        yHa3.I = c2;
        yHa3.J = b2;
        yHa yHa4 = a2;
        yHa2.M = new File(a2.J.getParentFile(), xOa.O);
        yHa2.j = d2;
        yHa2.k = CacheBuilder.newBuilder().expireAfterAccess(yRa.W, TimeUnit.SECONDS).build(new rHa(a2));
    }
}

