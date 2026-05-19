/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  AY
 *  Aha
 *  Ata
 *  BRa
 *  BX
 *  Bpa
 *  C
 *  CMa
 *  CV
 *  CY
 *  Cia
 *  Cla
 *  Cra
 *  Cta
 *  DW
 *  Dha
 *  EC
 *  EQa
 *  ERa
 *  Eoa
 *  FEa
 *  FLa
 *  FPa
 *  FQa
 *  FTa
 *  GCa
 *  Gg
 *  Gy
 *  Hia
 *  JHa
 *  JPa
 *  JTa
 *  Joa
 *  KTa
 *  Kna
 *  Kpa
 *  LQa
 *  Loa
 *  Lqa
 *  MAa
 *  MBa
 *  MQa
 *  MX
 *  MZ
 *  Mda
 *  Moa
 *  Mpa
 *  NA
 *  NCa
 *  NOa
 *  NPa
 *  NTa
 *  Nia
 *  OC
 *  OCa
 *  Oaa
 *  Oea
 *  Oga
 *  Oz
 *  PIa
 *  PTa
 *  Ppa
 *  Pqa
 *  Pra
 *  QJa
 *  QS
 *  QSa
 *  QZ
 *  Qba
 *  Qsa
 *  RIa
 *  RLa
 *  RQa
 *  RR
 *  Rpa
 *  Rua
 *  SF
 *  SMa
 *  SQa
 *  Sf
 *  Spa
 *  Sqa
 *  Sra
 *  Ssa
 *  TEa
 *  TPa
 *  TQa
 *  Tpa
 *  U
 *  URa
 *  UU
 *  Uqa
 *  Uta
 *  VJa
 *  VLa
 *  VQa
 *  VS
 *  Vua
 *  WFa
 *  WMa
 *  WQa
 *  WSa
 *  WTa
 *  Waa
 *  Wda
 *  Wsa
 *  XSa
 *  XTa
 *  Xoa
 *  YSa
 *  Yea
 *  Yra
 *  Ysa
 *  ZJa
 *  ZOa
 *  ZQa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aA
 *  aIa
 *  aJa
 *  aKa
 *  aPa
 *  aSa
 *  aqa
 *  asa
 *  bSa
 *  bqa
 *  bua
 *  coa
 *  cra
 *  cx
 *  cy
 *  dGa
 *  dQa
 *  dpa
 *  dra
 *  eAa
 *  eQa
 *  eia
 *  fIa
 *  fpa
 *  gHa
 *  gIa
 *  gOa
 *  gda
 *  gna
 *  hOa
 *  hra
 *  hz
 *  iMa
 *  iPa
 *  iQa
 *  iTa
 *  ina
 *  ipa
 *  isa
 *  j
 *  jQa
 *  jRa
 *  jd
 *  jsa
 *  kFa
 *  kPa
 *  kQa
 *  kga
 *  kpa
 *  lPa
 *  ld
 *  lma
 *  mTa
 *  mZ
 *  mka
 *  moa
 *  nBa
 *  nka
 *  oPa
 *  ooa
 *  ora
 *  pKa
 *  pPa
 *  pQa
 *  pb
 *  pqa
 *  psa
 *  pua
 *  qBa
 *  qna
 *  qpa
 *  qta
 *  rga
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  sA
 *  sMa
 *  sQa
 *  tca
 *  uKa
 *  uOa
 *  uRa
 *  uY
 *  ura
 *  uw
 *  vL
 *  vQa
 *  vRa
 *  vU
 *  vpa
 *  wBa
 *  wNa
 *  wOa
 *  wPa
 *  waa
 *  wqa
 *  xKa
 *  xha
 *  yQa
 *  yra
 *  zU
 *  zma
 *  zsa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.util.internal.ThreadLocalRandom;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;
import ru.vimeworld.configuration.ConfigurationService;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kpa_3
implements c,
jd {
    public boolean Ra;
    public long oa;
    public int Wa;
    private static int ua;
    private boolean Ua;
    public static byte[] ra;
    public int pa;
    public gna Ya;
    public EC ta;
    private int wa;
    public boolean va;
    private long Pa;
    public hOa Za;
    private boolean sa;
    private final Oaa na;
    public long Na;
    public Kna xa;
    public final DefaultResourcePack ya;
    public RY Oa;
    private Fia Qa;
    private int Va;
    public final pZ Sa;
    public Eoa Ta;
    private lma Xa;
    private int qa;
    private yHa za;
    private final List<IResourcePack> ma;
    public long La;
    private static Kpa ka;
    private boolean da;
    private final PropertyMap Ba;
    private final boolean aa;
    public LY ea;
    public Kna Ea;
    private long Ca;
    private int ia;
    private long Ma;
    private oLa ba;
    public kv ha;
    private aJa Fa;
    public final File Ia;
    private pb la;
    private wNa ga;
    private final Queue<FutureTask<?>> Da;
    public static final boolean ca;
    public Mpa Ja;
    private boolean ja;
    private uba Ha;
    private NA Ga;
    private String fa;
    private eia Ka;
    public ZJa Aa;
    private long S;
    public static final Set<String> Z;
    public boolean Y;
    private nBa r;
    public vL V;
    public Cia z;
    private final Proxy X;
    public long y;
    public final gda U;
    private xKa P;
    public vL u;
    private NKa O;
    public int t;
    public FLa R;
    private gHa Q;
    public final Zv N;
    private int T;
    public final File p;
    private int n;
    private long s;
    public Gy w;
    private GCa W;
    public long q;
    private dGa x;
    private ResourceLocation v;
    public long o;
    private final File h;
    private final Thread K;
    public boolean H;
    public ANa c;
    private QJa B;
    private static final ResourceLocation d;
    private boolean a;
    private RIa b;
    public volatile boolean l;
    public String e;
    private String G;
    private static final Logger D;
    public SMa f;
    public final Zv F;
    public long g;
    public SF L;
    public final kga E;
    private final boolean m;
    private WMa C;
    public int i;
    private static final List<DisplayMode> M;
    public int k;
    private WKa j;
    private final PropertyMap J;
    private final String A;
    private final MinecraftSessionService I;

    public static void f(String string) {
        String string2 = string;
        String a2 = Kpa_3.J().J();
        if (a2 != null) {
            String string3 = a2;
            string3.J().J((String)null);
            string3.J().J((ld)new CY(string2));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void m() {
        block22: {
            block24: {
                block28: {
                    block27: {
                        block26: {
                            block25: {
                                block23: {
                                    var1_1 = this /* !! */ ;
                                    if (var1_1.Oa == null) break block22;
                                    v0 = var1_1;
                                    var5_2 = v0.c.h.f();
                                    var6_3 = uSa.E;
                                    var7_4 = uSa.E;
                                    var4_5 = null;
                                    if (v0.Oa.A != AY.BLOCK) break block23;
                                    v1 = var1_1;
                                    var2_6 = v1.Oa.J();
                                    var3_7 = v1.Ta.J(var2_6).J();
                                    if (var3_7.J() == Material.air) {
                                        return;
                                    }
                                    a /* !! */  = var3_7.J((Gg)var1_1.Ta, var2_6);
                                    if (a /* !! */  == null) {
                                        return;
                                    }
                                    if (var5_2 && EC.C()) {
                                        var4_5 = var1_1.Ta.J(var2_6);
                                    }
                                    var8_9 = a /* !! */  instanceof kda != false && var3_7.H() == false ? Block.J((eAa)a /* !! */ ) : var3_7;
                                    v2 = var1_1;
                                    v3 = v2;
                                    var6_3 = var8_9.f((Gg)v2.Ta, var2_6);
                                    var7_4 = a /* !! */ .M();
                                    break block24;
                                }
                                if (var1_1.Oa.A != AY.ENTITY || var1_1.Oa.J == null || !var5_2) {
                                    return;
                                }
                                if (!(var1_1.Oa.J instanceof WFa)) break block25;
                                a /* !! */  = Gea.xa;
                                v3 = var1_1;
                                break block24;
                            }
                            if (!(var1_1.Oa.J instanceof Nia)) break block26;
                            a /* !! */  = Gea.i;
                            v3 = var1_1;
                            break block24;
                        }
                        if (!(var1_1.Oa.J instanceof FEa)) break block27;
                        var2_6 = (FEa)var1_1.Oa.J;
                        var3_7 = var2_6.J();
                        if (var3_7 == null) {
                            a /* !! */  = Gea.Ia;
                        } else {
                            v4 = var3_7;
                            a /* !! */  = v4.J();
                            var6_3 = v4.J();
                            var7_4 = vRa.d;
                        }
                        ** GOTO lbl87
                    }
                    if (!(var1_1.Oa.J instanceof Yea)) break block28;
                    var2_6 = (Yea)var1_1.Oa.J;
                    switch (Pra.A[var2_6.J().ordinal()]) lbl-1000:
                    // 2 sources

                    {
                        case 1: {
                            if (false) ** GOTO lbl-1000
                            a /* !! */  = Gea.Oa;
                            break;
                        }
                        case 2: {
                            a /* !! */  = Gea.A;
                            break;
                        }
                        case 3: {
                            a /* !! */  = Gea.na;
                            break;
                        }
                        case 4: {
                            a /* !! */  = Gea.ld;
                            break;
                        }
                        case 5: {
                            a /* !! */  = Gea.u;
                            break;
                        }
                        default: {
                            a /* !! */  = Gea.T;
                            break;
                        }
                    }
                    ** GOTO lbl87
                }
                if (var1_1.Oa.J instanceof Wda) {
                    a /* !! */  = Gea.ba;
                    v3 = var1_1;
                } else if (var1_1.Oa.J instanceof Oea) {
                    a /* !! */  = Gea.U;
                    v3 = var1_1;
                } else {
                    a /* !! */  = Gea.SB;
                    var6_3 = PIa.J((vL)var1_1.Oa.J);
                    var7_4 = vRa.d;
                    if (!PIa.k.containsKey(var6_3)) {
                        return;
                    }
lbl87:
                    // 5 sources

                    v3 = var1_1;
                }
            }
            var2_6 = v3.c.K;
            if (var4_5 == null) {
                v5 = var5_2;
                var2_6.J((eAa)a /* !! */ , var6_3, (boolean)var7_4, var5_2);
            } else {
                var3_7 = var1_1.J((eAa)a /* !! */ , var6_3, var4_5);
                v5 = var5_2;
                v6 = var2_6;
                v6.J(v6.J, (Mda)var3_7);
            }
            if (v5) {
                v7 = var1_1;
                var3_8 = v7.c.x.A.size() - WOa.fa + var2_6.J;
                v8 = var2_6;
                v7.L.J(v8.J(v8.J), var3_8);
            }
        }
    }

    public PropertyMap f() {
        Kpa_3 kpa_3 = this;
        if (kpa_3.J.isEmpty()) {
            Kpa_3 kpa_32 = kpa_3;
            GameProfile a2 = kpa_3.J().fillProfileProperties(kpa_32.na.J(), uSa.E != 0);
            kpa_32.J.putAll(a2.getProperties());
        }
        return kpa_3.J;
    }

    public boolean I() {
        Kpa_3 a2;
        return a2.sa;
    }

    public gHa J() {
        Kpa_3 a2;
        return a2.Q;
    }

    public void E() {
        block13: {
            Kpa_3 a2;
            block14: {
                if (a2.i > 0) break block13;
                if (!uw.e.J()) {
                    long l2 = a2.z.H.getPressedEventNanos() / Ata.p;
                    if (l2 - nua.W < a2.g) {
                        return;
                    }
                    a2.g = l2;
                }
                RR.j.J();
                Kpa_3 kpa_3 = a2;
                kpa_3.c.u();
                if (kpa_3.Oa != null) break block14;
                D.error(sSa.Da);
                if (a2.L.i()) {
                    a2.i = NTa.C;
                    return;
                }
                break block13;
            }
            switch (Pra.I[a2.Oa.A.ordinal()]) {
                case 1: {
                    Kpa_3 kpa_3 = a2;
                    while (false) {
                    }
                    kpa_3.L.J((Sx)kpa_3.c, a2.Oa.J);
                    return;
                }
                case 2: {
                    Kpa_3 kpa_3 = a2;
                    XF xF2 = kpa_3.Oa.J();
                    if (kpa_3.Ta.J(xF2).J().J() != Material.air) {
                        a2.L.l(xF2, a2.Oa.j);
                        return;
                    }
                    break;
                }
                default: {
                    if (!a2.L.i()) break block13;
                }
            }
            if (!a2.L.i()) break block13;
            a2.i = NTa.C;
        }
    }

    public void K() {
        Kpa_3 kpa_3 = this;
        if (!kpa_3.a && Display.wasResized()) {
            Kpa_3 kpa_32 = kpa_3;
            int n2 = kpa_32.t;
            int a2 = kpa_32.k;
            kpa_32.t = Display.getWidth();
            kpa_32.k = Display.getHeight();
            if (kpa_32.t != n2 || kpa_3.k != a2) {
                if (kpa_3.t <= 0) {
                    kpa_3.t = vRa.d;
                }
                if (kpa_3.k <= 0) {
                    kpa_3.k = vRa.d;
                }
                Kpa_3 kpa_33 = kpa_3;
                kpa_33.J(kpa_33.t, kpa_33.k);
            }
        }
    }

    public eia J() {
        Kpa_3 a2;
        return a2.Ka;
    }

    public aJa J() {
        Kpa_3 a2;
        return a2.Fa;
    }

    public PropertyMap J() {
        Kpa_3 a2;
        return a2.Ba;
    }

    @Override
    public ListenableFuture<Object> J(Runnable runnable) {
        Runnable b2 = runnable;
        Kpa_3 a2 = this;
        Object object = b2;
        Validate.notNull(object);
        return a2.J(Executors.callable((Runnable)object));
    }

    public RIa J(RIa rIa2) {
        Kpa_3 b2 = rIa2;
        Kpa_3 a2 = this;
        Kpa_3 kpa_3 = b2;
        kpa_3.J().J(Era.i, (Callable)new ipa((Kpa)a2));
        kpa_3.J().J(Bra.B, (Callable)new oOa((Kpa)a2));
        kpa_3.J().J(iSa.a, (Callable)new dra((Kpa)a2));
        kpa_3.J().J(Iqa.ca, (Callable)new Sra((Kpa)a2));
        kpa_3.J().J(osa.y, (Callable)new FQa((Kpa)a2));
        kpa_3.J().J(wua.K, (Callable)new eQa((Kpa)a2));
        kpa_3.J().J(JTa.Ga, (Callable)new kQa((Kpa)a2));
        kpa_3.J().J(Ysa.y, (Callable)new wqa((Kpa)a2));
        kpa_3.J().J(Jsa.I, (Callable)new ara((Kpa)a2));
        kpa_3.J().J(Lsa.h, (Callable)new ora((Kpa)a2));
        kpa_3.J().J(VPa.x, (Callable)new qpa((Kpa)a2));
        if (a2.Ta != null) {
            a2.Ta.J((RIa)b2);
        }
        return b2;
    }

    public wNa J() {
        Kpa_3 a2;
        return a2.ga;
    }

    public Proxy J() {
        Kpa_3 a2;
        return a2.X;
    }

    /*
     * Unable to fully structure code
     */
    public void c() throws IOException {
        block96: {
            block97: {
                block94: {
                    block95: {
                        v0 = var2_8 = this;
                        var2_8.N.f(v0.N.f() + vRa.d);
                        if (v0.Wa > 0) {
                            var2_8.Wa -= vRa.d;
                        }
                        v1 = var2_8;
                        v1.U.J(UTa.C);
                        if (!v1.sa) {
                            var2_8.Ya.C();
                        }
                        v2 = var2_8;
                        v2.U.f();
                        v2.R.A(pqa.r);
                        v2.U.J(ppa.E);
                        if (!v2.sa && var2_8.Ta != null) {
                            var2_8.L.l();
                        }
                        v3 = var2_8;
                        v3.U.f(oua.D);
                        if (!v3.sa) {
                            var2_8.Fa.f();
                        }
                        if (var2_8.ta != null || var2_8.c == null) break block94;
                        if (!(var2_8.c.f() <= JPa.N)) break block95;
                        v4 = var2_8;
                        v5 = v4;
                        v4.J((EC)null);
                        break block96;
                    }
                    if (!var2_8.c.p() || var2_8.Ta == null) break block97;
                    v6 = var2_8;
                    v5 = v6;
                    v6.J((EC)new moa());
                    break block96;
                }
                if (var2_8.ta != null && var2_8.ta instanceof moa && !var2_8.c.p()) {
                    var2_8.J((EC)null);
                }
            }
            v5 = var2_8;
        }
        if (v5.ta != null) {
            var2_8.i = Uqa.G;
        }
        OT.i.l();
        zU.M.l();
        var1_9 = ThreadLocalRandom.current().nextInt();
        try {
            cx.J((int)var1_9);
            throw new RuntimeException(ppa.J);
        }
        catch (UU a) {
            block106: {
                block105: {
                    block104: {
                        block98: {
                            if (a.getVerify() != (long)(var1_9 + var2_8.F.f()) + cx.i.f()) {
                                throw new RuntimeException(Jta.b);
                            }
                            if (var2_8.ta == null) ** GOTO lbl-1000
                            try {
                                var2_8.ta.e();
                            }
                            catch (Throwable a) {
                                var3_11 = RIa.J((Throwable)a, (String)dua.Ga);
                                var3_11.J(vpa.x).J(jsa.G, (Callable)new Rpa((Kpa)var2_8));
                                throw new MZ(var3_11);
                            }
                            if (var2_8.ta != null) {
                                try {
                                    var2_8.ta.l();
                                    v7 = var2_8;
                                }
                                catch (Throwable a) {
                                    var3_12 = RIa.J((Throwable)a, (String)kpa.D);
                                    var3_12.J(vpa.x).J(jsa.G, (Callable)new iQa((Kpa)var2_8));
                                    throw new MZ(var3_12);
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                v7 = var2_8;
                            }
                            if (v7.ta != null && !var2_8.ta.f) break block98;
                            var2_8.U.f(yta.M);
                            while (Mouse.next()) {
                                if (OT.i.f()) continue;
                                a = Mouse.getEventButton();
                                mIa.setKeyBindState(a - ySa.T, Mouse.getEventButtonState());
                                if (Mouse.getEventButtonState()) {
                                    if (QS.l((int)a)) continue;
                                    if (var2_8.c.t() && a == uqa.g) {
                                        var2_8.Ya.J().J();
                                    } else {
                                        mIa.onTick(a - ySa.T, Mouse.getEventNanoseconds());
                                    }
                                }
                                if ((var3_13 = Kpa_3.J() - var2_8.o) > FTa.N) continue;
                                var1_9 = Mouse.getEventDWheel();
                                if (var1_9 == 0) ** GOTO lbl99
                                if (QS.J() && QS.f((int)(var1_9 < 0 ? pua.o : vRa.d))) continue;
                                if (var2_8.c.t()) {
                                    var1_9 = var1_9 < 0 ? pua.o : vRa.d;
                                    v8 = var2_8;
                                    if (var2_8.Ya.J().J()) {
                                        v8.Ya.J().J(-var1_9);
                                        v9 = var2_8;
                                    } else {
                                        var5_19 = Oz.J((float)(v8.c.h.J() + (float)var1_9 * Qsa.N), (float)JPa.N, (float)psa.N);
                                        v10 = var2_8;
                                        v9 = v10;
                                        v10.c.h.J(var5_19);
                                    }
                                } else {
                                    var2_8.c.K.J(var1_9);
lbl99:
                                    // 2 sources

                                    v9 = var2_8;
                                }
                                if (v9.ta == null) {
                                    if (var2_8.Ra || !Mouse.getEventButtonState()) continue;
                                    var2_8.C();
                                    continue;
                                }
                                if (var2_8.ta == null) continue;
                                var2_8.ta.d();
                            }
                            if (var2_8.i > 0) {
                                var2_8.i -= vRa.d;
                            }
                            var2_8.U.f(uqa.C);
                            while (Keyboard.next()) {
                                block100: {
                                    block103: {
                                        block101: {
                                            block102: {
                                                block99: {
                                                    if (OT.i.J((boolean)uSa.E)) continue;
                                                    if (var2_8.D()) break;
                                                    a = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + hra.Ja : Keyboard.getEventKey();
                                                    mIa.setKeyBindState(a, Keyboard.getEventKeyState());
                                                    if (Keyboard.getEventKeyState()) {
                                                        mIa.onTick(a, Keyboard.getEventNanoseconds());
                                                    }
                                                    if (var2_8.Pa > nqa.i) {
                                                        if (Kpa_3.J() - var2_8.Pa >= bqa.S) {
                                                            throw new MZ(new RIa(ppa.p, new Throwable()));
                                                        }
                                                        if (!Keyboard.isKeyDown(Bpa.Ha) || !Keyboard.isKeyDown(tua.w)) {
                                                            var2_8.Pa = fqa.Da;
                                                        }
                                                    } else if (Keyboard.isKeyDown(Bpa.Ha) && Keyboard.isKeyDown(tua.w)) {
                                                        var2_8.Pa = Kpa_3.J();
                                                    }
                                                    if (!Keyboard.getEventKeyState()) continue;
                                                    if (a == ITa.V && var2_8.R != null) {
                                                        var2_8.R.G();
                                                    }
                                                    if (var2_8.ta == null) break block99;
                                                    v11 = var2_8;
                                                    v12 = v11;
                                                    v11.ta.C();
                                                    break block100;
                                                }
                                                if (a == vRa.d) {
                                                    var2_8.A();
                                                    break;
                                                }
                                                if (a == fPa.i && Keyboard.isKeyDown(tua.w) && var2_8.Ya != null) {
                                                    var2_8.Ya.J().l();
                                                }
                                                if (a != tua.U && a != kTa.j || !Keyboard.isKeyDown(tua.w)) break block101;
                                                var3_14 = System.currentTimeMillis();
                                                if (var3_14 - var2_8.q >= lTa.n) break block102;
                                                if (var2_8.Ta == null) break block101;
                                                v13 = a;
                                                var2_8.Ya.J().J((ld)new CY(Zua.x));
                                                break block103;
                                            }
                                            var2_8.q = var3_14;
                                            var2_8.i();
                                        }
                                        v13 = a;
                                    }
                                    if (v13 == LQa.c && Keyboard.isKeyDown(tua.w)) {
                                        var3_15 = new StringBuilder(System.lineSeparator());
                                        var1_10 = ManagementFactory.getThreadMXBean().dumpAllThreads((boolean)vRa.d, (boolean)vRa.d);
                                        var5_20 = var1_10.length;
                                        v14 = uSa.E;
                                        while (v14 < var5_20) {
                                            var7_22 = var1_10[var6_21];
                                            var3_15.append(var7_22.toString());
                                            v14 = ++var6_21;
                                        }
                                        Kpa_3.D.warn(var3_15.toString());
                                    }
                                    if (a == Zqa.G && Keyboard.isKeyDown(tua.w)) {
                                        var2_8.z.f(Fha.RENDER_DISTANCE, EC.l() != false ? pua.o : vRa.d);
                                    }
                                    if (a != Fsa.d || Keyboard.isKeyDown(tua.w)) {
                                        // empty if block
                                    }
                                    if (a == TQa.ca && Keyboard.isKeyDown(tua.w)) {
                                        var2_8.z.aa = var2_8.z.aa == false ? vRa.d : uSa.E;
                                        var2_8.z.d();
                                    }
                                    if (a == QSa.p && Keyboard.isKeyDown(tua.w)) {
                                        v15 = var2_8;
                                        v15.ba.J((boolean)(v15.ba.l() == false ? vRa.d : uSa.E));
                                    }
                                    if (a == Tpa.z && Keyboard.isKeyDown(tua.w)) {
                                        var2_8.ba.i = var2_8.ba.i == false ? vRa.d : uSa.E;
                                        v16 = (int)var2_8.ba.i;
                                    }
                                    if (a == kTa.g && Keyboard.isKeyDown(tua.w)) {
                                        var2_8.z.i = var2_8.z.i == false ? vRa.d : uSa.E;
                                        var2_8.z.d();
                                    }
                                    if (a == lPa.p && !uw.B) {
                                        var2_8.z.ba = var2_8.z.ba == false ? vRa.d : uSa.E;
                                        v17 = (int)var2_8.z.ba;
                                    }
                                    if (a == tua.w) {
                                        var2_8.z.t = var2_8.z.t == false ? vRa.d : uSa.E;
                                        v18 = var2_8;
                                        v18.z.Da = EC.l();
                                        v18.z.mA = EC.f();
                                    }
                                    if (var2_8.z.Sb.isPressed() && !uw.a) {
                                        v19 = var2_8;
                                        v19.z.ld += vRa.d;
                                        if (v19.z.ld > uqa.g) {
                                            var2_8.z.ld = uSa.E;
                                        }
                                        v20 = var2_8;
                                        if (var2_8.z.ld == 0) {
                                            v20.R.J(var2_8.J());
                                            v21 = var2_8;
                                        } else {
                                            if (v20.z.ld == vRa.d) {
                                                var2_8.R.J(null);
                                            }
                                            v21 = var2_8;
                                        }
                                        v21.Aa.d();
                                    }
                                    if (var2_8.z.CB.isPressed()) {
                                        v22 = (int)(Nt.I = Nt.I == false ? vRa.d : uSa.E);
                                    }
                                    if (var2_8.z.Gb.isPressed()) {
                                        var2_8.z.G = var2_8.z.G == false ? vRa.d : uSa.E;
                                    }
                                    v12 = var2_8;
                                }
                                if (!v12.z.t || !var2_8.z.Da) continue;
                                if (a == pPa.f) {
                                    var2_8.f(uSa.E);
                                }
                                v23 = uSa.E;
                                while (v23 < WOa.fa) {
                                    if (a == uqa.g + var3_16) {
                                        var2_8.f(var3_16 + vRa.d);
                                    }
                                    v23 = ++var3_16;
                                }
                            }
                            VS.f();
                            QS.l();
                            if (!Display.isActive()) {
                                mIa.unPressAllKeys();
                            }
                            v24 = a = uSa.E;
                            while (v24 < WOa.fa) {
                                if (var2_8.z.Ga[a].isPressed()) {
                                    if (var2_8.c.t()) {
                                        var2_8.Ya.J().f(a);
                                    } else {
                                        var2_8.c.K.J = a;
                                    }
                                }
                                v24 = ++a;
                            }
                            a = var2_8.z.qa != kFa.HIDDEN ? vRa.d : uSa.E;
                            v25 = var2_8;
                            while (v25.z.xc.isPressed()) {
                                if (var2_8.L.J()) {
                                    v26 = var2_8;
                                    v25 = v26;
                                    v26.c.X();
                                    continue;
                                }
                                v27 = var2_8;
                                v25 = v27;
                                v27.J().J((KC)new qBa(Qba.OPEN_INVENTORY_ACHIEVEMENT));
                                v28 = var2_8;
                                v28.J((EC)new Joa((Sx)v28.c));
                            }
                            block14: while (true) {
                                v29 = var2_8;
                                while (v29.z.ub.isPressed()) {
                                    if (var2_8.c.t()) continue block14;
                                    v30 = var2_8;
                                    v29 = v30;
                                    v30.c.J(EC.C());
                                }
                                break;
                            }
                            v31 = var2_8;
                            while (v31.z.wc.isPressed() && a != 0) {
                                v32 = var2_8;
                                v31 = v32;
                                v32.J((EC)new Xoa());
                            }
                            if (var2_8.ta == null && var2_8.z.Wc.isPressed() && a != 0) {
                                var2_8.J((EC)new Xoa(WSa.f));
                            }
                            if (var2_8.c.V()) {
                                if (!var2_8.z.pA.isKeyDown()) {
                                    v33 = var2_8;
                                    v33.L.f((Sx)v33.c);
                                }
                                v34 = var2_8;
                                while (v34.z.H.isPressed()) {
                                    v34 = var2_8;
                                }
                                v35 = var2_8;
                                while (v35.z.pA.isPressed()) {
                                    v35 = var2_8;
                                }
                                v36 = var2_8;
                                while (v36.z.I.isPressed()) {
                                    v36 = var2_8;
                                }
                            } else {
                                v37 = var2_8;
                                while (v37.z.H.isPressed()) {
                                    v38 = var2_8;
                                    v37 = v38;
                                    v38.E();
                                }
                                v39 = var2_8;
                                while (v39.z.pA.isPressed()) {
                                    v40 = var2_8;
                                    v39 = v40;
                                    v40.f();
                                }
                                v41 = var2_8;
                                while (v41.z.I.isPressed()) {
                                    v42 = var2_8;
                                    v41 = v42;
                                    v42.m();
                                }
                            }
                            if (var2_8.z.pA.isKeyDown() && var2_8.Wa == 0 && !var2_8.c.V()) {
                                var3_17 = Sys.getTime() * Ata.p;
                                v43 = var2_8;
                                v43.z.pA.setPressedEventNanos(var3_17);
                                v43.f();
                            }
                            v44 = var2_8;
                            v44.J((boolean)(v44.ta == null && var2_8.z.H.isKeyDown() != false && var2_8.Ra != false ? vRa.d : uSa.E));
                        }
                        if (var2_8.Ta != null) {
                            if (var2_8.c != null) {
                                v45 = var2_8;
                                v45.Va += vRa.d;
                                if (v45.Va == Fsa.d) {
                                    var2_8.Va = uSa.E;
                                    var2_8.Ta.l((vL)var2_8.c);
                                }
                            }
                            v46 = var2_8;
                            v46.U.f(dqa.ja);
                            if (!v46.sa) {
                                var2_8.R.l();
                            }
                            v47 = var2_8;
                            v47.U.f(Rua.V);
                            if (!v47.sa) {
                                var2_8.Aa.D();
                            }
                            v48 = var2_8;
                            v48.U.f(hra.x);
                            if (!v48.sa) {
                                if (var2_8.Ta.f() > 0) {
                                    v49 = var2_8;
                                    v49.Ta.l(v49.Ta.f() - vRa.d);
                                }
                                var2_8.Ta.M();
                            }
                            v50 = var2_8;
                            v51 = v50;
                            v50.L.C();
                        } else {
                            if (var2_8.R.J()) {
                                var2_8.R.A();
                            }
                            v51 = var2_8;
                        }
                        if (!v51.sa) {
                            v52 = var2_8;
                            v52.C.J();
                            v52.ga.J();
                        }
                        if (var2_8.Ta == null) break block104;
                        if (!var2_8.sa) {
                            v53 = var2_8;
                            v53.Ta.J((boolean)(v53.Ta.J() != sZ.PEACEFUL ? vRa.d : uSa.E), (boolean)vRa.d);
                            try {
                                var2_8.Ta.e();
                                v54 = var2_8;
                            }
                            catch (Throwable a) {
                                var3_18 = RIa.J((Throwable)a, (String)fta.ja);
                                if (var2_8.Ta == null) {
                                    var3_18.J(Upa.t).J(Upa.f, (Object)ySa.g);
                                } else {
                                    var2_8.Ta.J(var3_18);
                                }
                                throw new MZ(var3_18);
                            }
                        } else {
                            v54 = var2_8;
                        }
                        v54.U.f(qta.M);
                        if (!var2_8.sa && var2_8.Ta != null) {
                            v55 = var2_8;
                            v55.Ta.J(Oz.f((double)v55.c.la), Oz.f((double)var2_8.c.Z), Oz.f((double)var2_8.c.A));
                        }
                        v56 = var2_8;
                        v56.U.f(gua.g);
                        if (v56.sa) break block105;
                        v57 = var2_8;
                        v58 = v57;
                        v57.f.J();
                        break block106;
                    }
                    if (var2_8.Ha != null) {
                        v59 = var2_8;
                        v59.U.f(kTa.h);
                        v59.Ha.C();
                    }
                }
                v58 = var2_8;
            }
            v58.U.f();
            var2_8.o = Kpa_3.J();
            return;
        }
    }

    public static void B() {
        nBa nBa2;
        if (ka != null && (nBa2 = ka.J()) != null) {
            nBa2.A();
        }
    }

    public dGa J() {
        Kpa_3 a2;
        return a2.x;
    }

    public nBa J() {
        Kpa_3 a2;
        return a2.r;
    }

    public void L() {
        a.l = uSa.E;
    }

    public void f(GCa gCa2) {
        Iterator iterator;
        Kpa_3 b2 = gCa2;
        Kpa_3 a2 = this;
        Kpa_3 kpa_3 = b2;
        kpa_3.f(RQa.i, ua);
        kpa_3.f(xSa.ja, a2.z.y);
        kpa_3.f(lPa.G, Display.getDisplayMode().getFrequency());
        kpa_3.f(Bra.k, a2.a ? vRa.U : zta.e);
        Kpa_3 kpa_32 = b2;
        kpa_32.f(sOa.Ha, (OCa.J() - b2.J()) / RQa.N * asa.fa);
        kpa_32.f(aqa.i, a2.J());
        String string = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? Nta.Ha : fpa.z;
        Kpa_3 kpa_33 = b2;
        kpa_33.f(vQa.Ia, string);
        Kpa_3 kpa_34 = a2;
        kpa_33.f(tTa.V, kpa_34.x.l().size());
        int n2 = uSa.E;
        Iterator iterator2 = iterator = kpa_34.x.l().iterator();
        while (iterator2.hasNext()) {
            nIa nIa2 = (nIa)iterator.next();
            iterator2 = iterator;
            StringBuilder stringBuilder = new StringBuilder().append(fpa.b).append(n2).append(XOa.D);
            ++n2;
            b2.f(stringBuilder.toString(), nIa2.J());
        }
        if (a2.r != null && a2.r.J() != null) {
            b2.f(Nta.ja, a2.r.J().J());
        }
    }

    /*
     * WARNING - void declaration
     */
    private Mda J(eAa eAa2, int n2, uY uY2) {
        void b22;
        Waa c2;
        Kpa_3 d2 = uY2;
        Kpa_3 a2 = this;
        Mda b22 = new Mda((eAa)c2, vRa.d, (int)b22);
        Waa waa2 = new Waa();
        d2.J(waa2);
        if (c2 == Gea.GB && waa2.J(dQa.l)) {
            c2 = waa2.J(dQa.l);
            d2 = new Waa();
            Mda mda2 = b22;
            d2.J(Pqa.Aa, (NCa)c2);
            mda2.J((Waa)d2);
            return mda2;
        }
        Mda mda3 = b22;
        mda3.J(uua.M, (NCa)waa2);
        c2 = new Waa();
        d2 = new waa();
        d2.J((NCa)new tca(NPa.Ja));
        c2.J(KQa.h, (NCa)d2);
        mda3.J(Jpa.q, (NCa)c2);
        return mda3;
    }

    public void J(EC eC2) {
        Kpa_3 kpa_3;
        Kpa_3 b2 = eC2;
        Kpa_3 a2 = this;
        if (a2.ta != null) {
            a2.ta.M();
        }
        if (b2 == null && a2.Ta == null) {
            kpa_3 = b2 = new Moa();
        } else {
            if (b2 == null && a2.c.f() <= JPa.N) {
                b2 = new CMa();
            }
            kpa_3 = b2;
        }
        if (kpa_3 instanceof Moa || b2 instanceof uLa) {
            a2.z.t = uSa.E;
            a2.Ya.J().l();
        }
        a2.ta = b2;
        if (b2 != null) {
            sMa sMa2;
            a2.j();
            sMa sMa3 = sMa2 = new sMa((Kpa)a2);
            int n2 = sMa3.f();
            int n3 = sMa3.J();
            b2.f((Kpa)a2, n2, n3);
            a2.H = uSa.E;
            if (!((EC)b2).f) {
                mIa.unPressAllKeys();
                return;
            }
        } else {
            if (a2.f() && !a2.r.z()) {
                a2.ga.d();
            }
            a2.C();
        }
    }

    public void J(vL vL2) {
        Kpa_3 b2 = vL2;
        Kpa_3 a2 = this;
        a2.u = b2;
        a2.R.J((vL)b2);
    }

    public U J() {
        Kpa_3 a2;
        return a2.Ga;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        Kpa_3 kpa_3 = this;
        try {
            Kpa_3 kpa_32;
            Kpa_3 kpa_33;
            block11: {
                block10: {
                    block9: {
                        kpa_3.a = !kpa_3.a ? vRa.d : uSa.E;
                        Kpa_3 kpa_34 = kpa_3;
                        kpa_3.z.ab = kpa_34.a;
                        if (!kpa_34.a) break block9;
                        Kpa_3 kpa_35 = kpa_3;
                        kpa_35.k();
                        kpa_35.t = Display.getDisplayMode().getWidth();
                        kpa_35.k = Display.getDisplayMode().getHeight();
                        if (kpa_35.t <= 0) {
                            kpa_3.t = vRa.d;
                        }
                        if (kpa_3.k > 0) break block10;
                        kpa_33 = kpa_3;
                        kpa_3.k = vRa.d;
                        break block11;
                    }
                    Kpa_3 kpa_36 = kpa_3;
                    Display.setDisplayMode(new DisplayMode(kpa_36.n, kpa_36.qa));
                    Kpa_3 kpa_37 = kpa_3;
                    kpa_37.t = kpa_37.n;
                    kpa_37.k = kpa_37.qa;
                    if (kpa_37.t <= 0) {
                        kpa_3.t = vRa.d;
                    }
                    if (kpa_3.k <= 0) {
                        kpa_3.k = vRa.d;
                    }
                }
                kpa_33 = kpa_3;
            }
            Kpa_3 kpa_38 = kpa_3;
            if (kpa_33.ta != null) {
                Kpa_3 kpa_39 = kpa_3;
                kpa_38.J(kpa_39.t, kpa_39.k);
                kpa_32 = kpa_3;
            } else {
                kpa_38.l();
                kpa_32 = kpa_3;
            }
            Display.setFullscreen(kpa_32.a);
            Kpa_3 kpa_310 = kpa_3;
            Display.setVSyncEnabled(kpa_310.z.y);
            kpa_310.d();
            mIa.unPressAllKeys();
            return;
        }
        catch (Exception a2) {
            D.error(XSa.c, (Throwable)a2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J(aJa aJa2) throws LWJGLException {
        aKa aKa2;
        pKa a22;
        Kpa_3 kpa_3 = this;
        sMa sMa2 = new sMa((Kpa)kpa_3);
        int n2 = sMa2.l();
        gHa gHa2 = new gHa(sMa2.f() * n2, sMa2.J() * n2, vRa.d != 0);
        gHa2.J(uSa.E != 0);
        uKa.G((int)WPa.s);
        uKa.y();
        uKa.J((double)aSa.V, (double)sMa2.f(), (double)sMa2.J(), (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
        uKa.G((int)SQa.ca);
        uKa.y();
        uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
        uKa.L();
        uKa.I();
        uKa.u();
        uKa.H();
        Object b22 = null;
        try {
            b22 = kpa_3.ya.J(d);
            kpa_3.v = a22.J(Fsa.k, new VJa(ImageIO.read((InputStream)b22)));
            a22.J(kpa_3.v);
        }
        catch (IOException a22) {
            D.error(new StringBuilder().insert(2 & 5, oua.Ka).append(d).toString(), (Throwable)a22);
        }
        finally {
            IOUtils.closeQuietly((InputStream)b22);
        }
        a22 = pKa.J();
        aKa aKa3 = aKa2 = a22.J();
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.a);
        aKa4.J(aSa.V, (double)kpa_3.k, aSa.V).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa3.J((double)kpa_3.t, (double)kpa_3.k, aSa.V).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa3.J((double)kpa_3.t, aSa.V, aSa.V).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa3.J(aSa.V, aSa.V, aSa.V).J(aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        a22.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        int a22 = hra.Ja;
        int b22 = hra.Ja;
        Kpa_3 kpa_32 = kpa_3;
        kpa_32.J((sMa2.f() - a22) / uqa.g, (sMa2.J() - b22) / uqa.g, uSa.E, uSa.E, a22, b22, osa.Ja, osa.Ja, osa.Ja, osa.Ja);
        uKa.L();
        uKa.I();
        gHa2.f();
        gHa2.J(sMa2.f() * n2, sMa2.J() * n2);
        uKa.K();
        uKa.J((int)jRa.m, (float)Nra.e);
        kpa_32.d();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void a2;
        int c22 = n2;
        Kpa_3 b2 = this;
        b2.t = Math.max(vRa.d, c22);
        b2.k = Math.max(vRa.d, (int)a2);
        if (b2.ta != null) {
            sMa c22 = new sMa((Kpa)b2);
            b2.ta.J((Kpa)b2, c22.f(), c22.J());
        }
        b2.Ja = new Mpa((Kpa)b2);
        b2.l();
    }

    public void a() {
        Kpa_3 a2;
        try {
            ra = new byte[uSa.E];
            a2.Aa.G();
        }
        catch (Throwable throwable) {}
        try {
            System.gc();
            a2.J((Eoa)null);
        }
        catch (Throwable throwable) {}
        System.gc();
    }

    public static boolean j() {
        if (ka != null && Kpa_3.ka.z.u) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public pb J() {
        Kpa_3 a2;
        return a2.la;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Eoa eoa2, String string) {
        Kpa_3 kpa_3;
        Kpa_3 c2 = eoa2;
        Kpa_3 b2 = this;
        if (c2 == null) {
            iMa iMa2 = b2.J();
            if (iMa2 != null) {
                iMa2.J();
            }
            if (b2.r != null && b2.r.k()) {
                Kpa_3 kpa_32 = b2;
                kpa_32.r.C();
                kpa_32.r.F();
            }
            Kpa_3 kpa_33 = b2;
            kpa_33.r = null;
            kpa_33.Za.l();
            kpa_33.R.k();
        }
        Kpa_3 kpa_34 = b2;
        kpa_34.u = null;
        kpa_34.Ha = null;
        if (b2.Ja != null) {
            void a2;
            Kpa_3 kpa_35 = b2;
            kpa_35.Ja.J((String)a2);
            kpa_35.Ja.f(Mqa.y);
        }
        if (c2 == null && b2.Ta != null) {
            Kpa_3 kpa_36 = b2;
            b2.x.J();
            kpa_36.Ya.l();
            kpa_36.J((lma)null);
            kpa_36.ja = uSa.E;
        }
        b2.ga.C();
        b2.Ta = c2;
        OT.i.f();
        if (c2 != null) {
            if (b2.Aa != null) {
                b2.Aa.J((Eoa)c2);
            }
            if (b2.f != null) {
                b2.f.J((Gg)c2);
            }
            if (b2.c == null) {
                Kpa_3 kpa_37 = b2;
                kpa_37.c = kpa_37.L.J((Gg)c2, new Laa());
                kpa_37.L.l((Sx)b2.c);
            }
            kpa_3 = b2;
            Kpa_3 kpa_38 = b2;
            kpa_38.c.D();
            c2.f((vL)kpa_38.c);
            b2.c.g = new cy(b2.z);
            Kpa_3 kpa_39 = b2;
            b2.L.J((Sx)kpa_39.c);
            b2.u = kpa_39.c;
        } else {
            kpa_3 = b2;
            b2.la.J();
            b2.c = null;
            OT.i.J();
            zU.M.C();
        }
        kpa_3.o = nqa.i;
    }

    /*
     * WARNING - void declaration
     */
    public void f(RIa rIa2) {
        void a2;
        Kpa_3 kpa_3 = this;
        Object b2 = new File(Kpa_3.J().p, QSa.M);
        b2 = new File((File)b2, Jqa.L + new SimpleDateFormat(fpa.P).format(new Date()) + JTa.A);
        void v0 = a2;
        TEa.J((String)v0.C());
        if (v0.J() != null) {
            TEa.J((String)new StringBuilder().insert(3 ^ 3, jsa.r).append(a2.J()).toString());
            System.exit(pua.o);
            return;
        }
        if (a2.J((File)b2)) {
            TEa.J((String)new StringBuilder().insert(3 >> 2, jsa.r).append(((File)b2).getAbsolutePath()).toString());
            System.exit(pua.o);
            return;
        }
        TEa.J((String)ura.c);
        System.exit(rQa.p);
    }

    private void H() throws LWJGLException {
        Kpa_3 kpa_3 = this;
        Display.setResizable(vRa.d != 0);
        Display.setTitle(rpa.fa);
        try {
            Display.create(new PixelFormat().withDepthBits(osa.c).withStencilBits(Yqa.i));
            return;
        }
        catch (LWJGLException a2) {
            Kpa_3 kpa_32;
            D.error(yQa.J, (Throwable)a2);
            try {
                Thread.sleep(asa.fa);
                kpa_32 = kpa_3;
            }
            catch (InterruptedException interruptedException) {
                kpa_32 = kpa_3;
            }
            if (kpa_32.a) {
                kpa_3.k();
            }
            Display.create();
            return;
        }
    }

    public yHa J() {
        Kpa_3 a2;
        return a2.za;
    }

    public QJa J() {
        Kpa_3 a2;
        return a2.B;
    }

    public boolean F() {
        Kpa_3 a2;
        return a2.a;
    }

    public ooa J() {
        Kpa_3 a2;
        if (a2.c != null) {
            if (a2.c.j.F instanceof MX) {
                return ooa.NETHER;
            }
            if (a2.c.j.F instanceof hz) {
                if (KFa.J != null && KFa.I > 0) {
                    return ooa.END_BOSS;
                }
                return ooa.END;
            }
            if (a2.c.h.f() && a2.c.h.l()) {
                return ooa.CREATIVE;
            }
            return ooa.GAME;
        }
        return ooa.MENU;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2) {
        Kpa_3 kpa_3;
        Kpa_3 kpa_32 = kpa_3 = this;
        List b2 = kpa_32.U.J(kpa_32.G);
        if (b2 != null && !b2.isEmpty()) {
            void a2;
            MBa mBa2 = (MBa)b2.remove(uSa.E);
            if (a2 == false) {
                int n3;
                if (mBa2.field_76331_c.length() > 0 && (n3 = kpa_3.G.lastIndexOf(VQa.ja)) >= 0) {
                    kpa_3.G = kpa_3.G.substring(uSa.E, n3);
                    return;
                }
            } else if (--a2 < b2.size() && !((MBa)b2.get((int)a2)).field_76331_c.equals(Qsa.h)) {
                if (kpa_3.G.length() > 0) {
                    Kpa_3 kpa_33 = kpa_3;
                    kpa_3.G = kpa_3.G + VQa.ja;
                }
                kpa_3.G = new StringBuilder().insert(3 & 4, kpa_3.G).append(((MBa)b2.get((int)a2)).field_76331_c).toString();
            }
        }
    }

    private void g() throws LWJGLException, IOException {
        Kpa_3 kpa_3;
        Kpa_3 kpa_32;
        Kpa_3 a2;
        Kpa_3 kpa_33 = a2;
        Kpa_3 kpa_34 = a2;
        kpa_34.z = new Cia((Kpa)kpa_34, a2.p);
        Kpa_3 kpa_35 = a2;
        kpa_34.ma.add(a2.ya);
        kpa_35.M();
        if (kpa_35.z.YC > 0 && a2.z.Tb > 0) {
            Kpa_3 kpa_36 = a2;
            kpa_36.t = kpa_36.z.Tb;
            kpa_36.k = kpa_36.z.YC;
        }
        D.info(new StringBuilder().insert(3 >> 2, KTa.g).append(Sys.getVersion()).toString());
        Kpa_3 kpa_37 = a2;
        kpa_37.G();
        kpa_37.e();
        kpa_37.H();
        if (Boolean.getBoolean(aPa.q)) {
            RLa.J();
        }
        nka.J();
        Kpa_3 kpa_38 = a2;
        a2.Q = new gHa(a2.t, a2.k, vRa.d != 0);
        kpa_38.Q.J(JPa.N, JPa.N, JPa.N, JPa.N);
        kpa_38.I();
        Kpa_3 kpa_39 = a2;
        kpa_38.x = new dGa(a2.h, new File(a2.p, MRa.y), (IResourcePack)kpa_39.ya, kpa_39.E, a2.z);
        kpa_38.Ga = new Hia(a2.E);
        ConfigurationService.J().f();
        Kpa_3 kpa_310 = a2;
        kpa_38.Ka = new eia(kpa_310.E, kpa_310.z.pb);
        kpa_38.Ga.J((j)a2.Ka);
        kpa_38.i();
        kpa_38.Fa = new aJa((U)a2.Ga);
        kpa_38.Ga.J((j)a2.Fa);
        kpa_38.J(kpa_38.Fa);
        kpa_38.za = new yHa(a2.Fa, new File(a2.Ia, qQa.ca), a2.I);
        kpa_38.la = new QZ(new File(a2.p, ZRa.p));
        Kpa_3 kpa_311 = a2;
        kpa_38.ga = new wNa((U)kpa_311.Ga, kpa_311.z);
        kpa_38.Ga.J((j)a2.ga);
        kpa_38.C = new WMa((Kpa)a2);
        kpa_38.Ea = new Kna(a2.z, new ResourceLocation(GPa.Aa), a2.Fa, uSa.E != 0);
        if (kpa_38.z.pb != null) {
            Kpa_3 kpa_312 = a2;
            a2.Ea.f(kpa_312.M());
            kpa_312.Ea.J(a2.Ka.f());
        }
        Kpa_3 kpa_313 = a2;
        a2.xa = new Kna(a2.z, new ResourceLocation(bua.Q), a2.Fa, uSa.E != 0);
        Kpa_3 kpa_314 = a2;
        kpa_313.Ga.J((j)kpa_314.Ea);
        kpa_314.Ga.J((j)a2.xa);
        kpa_313.Ga.J((j)new Kia());
        kpa_313.Ga.J((j)new rga());
        mY.q.J((OC)new ZQa((Kpa)a2));
        Kpa_3 kpa_315 = a2;
        kpa_315.ea = new LY();
        kpa_315.J(rRa.j);
        uKa.H();
        uKa.F((int)gua.X);
        uKa.J((double)oua.i);
        uKa.J();
        uKa.I((int)Ira.A);
        uKa.K();
        uKa.J((int)jRa.m, (float)Nra.e);
        uKa.M((int)Zra.W);
        uKa.G((int)WPa.s);
        uKa.y();
        uKa.G((int)SQa.ca);
        kpa_315.J(uqa.P);
        kpa_315.j = new WKa(oua.D);
        kpa_315.j.J(a2.z.ea);
        kpa_315.Fa.J(WKa.C, (C)a2.j);
        a2.Fa.J(WKa.C);
        kpa_313.j.f(uSa.E != 0, (a2.z.ea > 0 ? vRa.d : uSa.E) != 0);
        Kpa_3 kpa_316 = a2;
        a2.Qa = new Fia(a2.j);
        kpa_316.Ga.J((j)a2.Qa);
        a2.P = new xKa(a2.Fa, a2.Qa);
        Kpa_3 kpa_317 = a2;
        kpa_316.ba = new oLa(kpa_317.Fa, kpa_317.P);
        kpa_316.O = new NKa((Kpa)a2);
        kpa_316.Ga.J((j)a2.P);
        Kpa_3 kpa_318 = a2;
        kpa_316.R = new FLa((Kpa)kpa_318, (U)kpa_318.Ga);
        kpa_316.Ga.J((j)a2.R);
        kpa_316.B = new QJa(a2.Qa.J(), a2.z);
        kpa_316.Ga.J((j)a2.B);
        kpa_316.Aa = new ZJa((Kpa)a2);
        kpa_316.Ga.J((j)a2.Aa);
        kpa_316.Za = new hOa((Kpa)a2);
        Kpa_3 kpa_319 = a2;
        uKa.f((int)uSa.E, (int)uSa.E, (int)kpa_319.t, (int)kpa_319.k);
        Kpa_3 kpa_320 = a2;
        kpa_316.f = new SMa((Gg)kpa_320.Ta, kpa_320.Fa);
        kpa_316.J(Cra.D);
        kpa_316.Ya = new gna((Kpa)a2);
        if (kpa_316.fa != null) {
            Kpa_3 kpa_321 = a2;
            kpa_32 = kpa_321;
            Kpa_3 kpa_322 = a2;
            kpa_321.J((EC)new Loa((EC)new Moa(), (Kpa)kpa_322, a2.fa, kpa_322.ia));
        } else {
            Kpa_3 kpa_323 = a2;
            kpa_32 = kpa_323;
            kpa_323.J((EC)new Moa());
        }
        kpa_32.Fa.f(a2.v);
        a2.v = null;
        a2.Ja = new Mpa((Kpa)a2);
        if (a2.z.ab && !a2.a) {
            a2.b();
        }
        try {
            Display.setVSyncEnabled(a2.z.y);
            kpa_3 = a2;
        }
        catch (OpenGLException openGLException) {
            Kpa_3 kpa_324 = a2;
            kpa_3 = kpa_324;
            kpa_324.z.y = uSa.E;
            kpa_324.z.d();
        }
        kpa_3.Aa.F();
        OT.i.J((Kpa)a2);
        Sf.J();
        zU.M.J((Kpa)a2);
        RR.J.J((Kpa)a2);
        mTa.C();
        wBa.getById((int)uSa.E);
    }

    public String f() {
        Kpa_3 a2;
        return a2.A;
    }

    public static long J() {
        return Sys.getTime() * asa.fa / Sys.getTimerResolution();
    }

    public static boolean k() {
        if (ka != null && Kpa_3.ka.z.oa != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean G() {
        if (ka == null || !Kpa_3.ka.z.ba) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public NKa J() {
        Kpa_3 a2;
        return a2.O;
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string) {
        int b2;
        Kpa_3 kpa_3 = this;
        if (kpa_3.Ua && (b2 = GL11.glGetError()) != 0) {
            void a2;
            String string2 = GLU.gluErrorString(b2);
            D.error(Xpa.c);
            D.error(new StringBuilder().insert(3 ^ 3, zta.l).append((String)a2).toString());
            D.error(b2 + Xpa.E + string2);
            DW.A = vRa.d;
            DW.J();
        }
    }

    private void I() {
        Kpa_3 a2;
        Kpa_3 kpa_3 = a2;
        kpa_3.E.J((sA)new ZGa(), wGa.class);
        kpa_3.E.J((sA)new tGa(), JHa.class);
        kpa_3.E.J((sA)new Oga(), fIa.class);
        kpa_3.E.J((sA)new Aha(), QIa.class);
        kpa_3.E.J((sA)new wia(), xha.class);
    }

    public lma J() {
        Kpa_3 a2;
        return a2.Xa;
    }

    public void j() {
        Kpa_3 a2;
        if (a2.Ra) {
            mIa.unPressAllKeys();
            a2.Ra = uSa.E;
            a2.ea.l();
        }
    }

    public void F() {
        Kpa_3 kpa_3 = this;
        kpa_3.l = vRa.d;
        try {
            kpa_3.g();
        }
        catch (Throwable a2) {
            RIa rIa2 = RIa.J((Throwable)a2, (String)pua.c);
            rIa2.J(LQa.n);
            Kpa_3 kpa_32 = kpa_3;
            kpa_32.f(kpa_32.J(rIa2));
            return;
        }
        try {
            oW.J();
            block12: while (true) {
                Kpa_3 kpa_33 = kpa_3;
                while (kpa_33.l) {
                    if (!kpa_3.da || kpa_3.b == null) {
                        try {
                            kpa_3.D();
                            kpa_33 = kpa_3;
                        }
                        catch (OutOfMemoryError a2) {
                            Kpa_3 kpa_34 = kpa_3;
                            kpa_34.a();
                            kpa_33 = kpa_3;
                            kpa_34.J((EC)new VLa());
                            System.gc();
                        }
                        continue;
                    }
                    Kpa_3 kpa_35 = kpa_3;
                    kpa_35.f(kpa_35.b);
                    continue block12;
                }
                break;
            }
            return;
        }
        catch (xZ a2) {
            return;
        }
        catch (MZ a2) {
            MZ mZ2 = a2;
            Kpa_3 kpa_36 = kpa_3;
            kpa_3.J(mZ2.getCrashReport());
            kpa_36.a();
            D.fatal(uua.ja, (Throwable)a2);
            kpa_36.f(mZ2.getCrashReport());
            return;
        }
        catch (Throwable a2) {
            Kpa_3 kpa_37 = kpa_3;
            RIa rIa3 = kpa_37.J(new RIa(wOa.i, a2));
            kpa_37.a();
            D.fatal(KQa.X, a2);
            kpa_37.f(rIa3);
            return;
        }
        finally {
            kpa_3.J();
        }
    }

    private void k() throws LWJGLException {
        Kpa_3 kpa_3 = this;
        HashSet<Object> hashSet = Sets.newHashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        Object object = Display.getDesktopDisplayMode();
        if (!hashSet.contains(object) && maa.J() == Xy.OSX) {
            Iterator<DisplayMode> iterator = M.iterator();
            block0: while (true) {
                Iterator<DisplayMode> iterator2 = iterator;
                block1: while (iterator2.hasNext()) {
                    int n2;
                    Object a222;
                    DisplayMode displayMode;
                    block5: {
                        displayMode = iterator.next();
                        int n3 = vRa.d;
                        for (Object a222 : hashSet) {
                            if (((DisplayMode)a222).getBitsPerPixel() != fPa.i || ((DisplayMode)a222).getWidth() != displayMode.getWidth() || ((DisplayMode)a222).getHeight() != displayMode.getHeight()) continue;
                            n2 = n3 = uSa.E;
                            break block5;
                        }
                        n2 = n3;
                    }
                    if (n2 != 0) continue block0;
                    Iterator iterator3 = hashSet.iterator();
                    do {
                        if (iterator3.hasNext()) continue;
                        iterator2 = iterator;
                        continue block1;
                    } while (((DisplayMode)(a222 = (DisplayMode)iterator3.next())).getBitsPerPixel() != fPa.i || ((DisplayMode)a222).getWidth() != displayMode.getWidth() / uqa.g || ((DisplayMode)a222).getHeight() != displayMode.getHeight() / uqa.g);
                    object = a222;
                    continue block0;
                }
                break;
            }
        }
        Display.setDisplayMode((DisplayMode)object);
        Kpa_3 kpa_32 = kpa_3;
        kpa_32.t = ((DisplayMode)object).getWidth();
        kpa_32.k = ((DisplayMode)object).getHeight();
    }

    public static Kpa J() {
        return ka;
    }

    public oLa J() {
        Kpa_3 a2;
        return a2.ba;
    }

    public Kpa_3(ina ina2) {
        Kpa_3 a2;
        Kpa_3 b2 = ina2;
        Kpa_3 kpa_3 = a2 = this;
        Kpa_3 kpa_32 = a2;
        Kpa_3 kpa_33 = b2;
        Kpa_3 kpa_34 = a2;
        Kpa_3 kpa_35 = b2;
        Kpa_3 kpa_36 = a2;
        kpa_36.Ua = vRa.d;
        Kpa_3 kpa_37 = a2;
        kpa_37.w = new Gy(eta.e);
        kpa_36.W = new GCa(Qsa.ca, (jd)a2, OCa.J());
        kpa_36.o = Kpa_3.J();
        kpa_36.Sa = new pZ();
        kpa_36.y = System.nanoTime();
        kpa_36.U = new gda();
        kpa_36.Pa = fqa.Da;
        kpa_36.E = new kga();
        kpa_36.ma = Lists.newArrayList();
        kpa_36.Da = Queues.newArrayDeque();
        kpa_36.K = Thread.currentThread();
        kpa_36.l = vRa.d;
        kpa_36.e = Mqa.y;
        kpa_36.Y = vRa.d;
        kpa_36.Na = Kpa_3.J();
        kpa_36.La = fqa.Da;
        kpa_36.G = gua.u;
        kpa_36.g = LQa.ha;
        kpa_36.oa = LQa.ha;
        kpa_36.F = new Zv(uSa.E, kTa.j);
        kpa_36.N = new Zv(uSa.E, vpa.o);
        ka = kpa_36;
        a2.p = ((ina)kpa_35).I.I;
        kpa_34.Ia = ((ina)kpa_35).I.j;
        kpa_34.h = ((ina)b2).I.A;
        a2.A = ((ina)kpa_33).J.I;
        kpa_32.Ba = ((ina)kpa_33).A.J;
        kpa_32.J = ((ina)b2).A.A;
        kpa_3.ha = new kv(new File(a2.Ia, xTa.L), new File(a2.Ia, qQa.ca));
        kpa_3.ya = new DefaultResourcePack(new aIa(((ina)b2).I.j, ((ina)b2).I.J).J());
        kpa_3.X = ((ina)b2).A.j == null ? Proxy.NO_PROXY : ((ina)b2).A.j;
        Kpa_3 kpa_38 = a2;
        kpa_38.I = new YggdrasilAuthenticationService(a2.X, UUID.randomUUID().toString()).createMinecraftSessionService();
        kpa_38.na = ((ina)b2).A.I;
        D.info(new StringBuilder().insert(3 & 4, NSa.r).append(a2.na.J()).toString());
        if (Boolean.getBoolean(tTa.v)) {
            D.info(new StringBuilder().insert(2 & 5, nqa.r).append(a2.na.f()).append(hpa.b).toString());
        }
        Kpa_3 kpa_39 = a2;
        Kpa_3 kpa_310 = b2;
        kpa_39.m = ((ina)kpa_310).J.A;
        kpa_39.t = ((ina)kpa_310).j.I > 0 ? ((ina)b2).j.I : vRa.d;
        a2.k = ((ina)b2).j.J > 0 ? ((ina)b2).j.J : vRa.d;
        Kpa_3 kpa_311 = b2;
        Kpa_3 kpa_312 = a2;
        Kpa_3 kpa_313 = b2;
        a2.n = ((ina)kpa_313).j.I;
        kpa_312.qa = ((ina)kpa_313).j.J;
        kpa_312.a = ((ina)kpa_311).j.A;
        a2.aa = Kpa_3.C();
        a2.r = new nBa((Kpa)a2);
        if (((ina)kpa_311).k.I != null) {
            Kpa_3 kpa_314 = a2;
            kpa_314.fa = ((ina)b2).k.I;
            kpa_314.ia = ((ina)b2).k.A;
        }
        ImageIO.setUseCache(uSa.E != 0);
        gIa.J();
        TEa.f();
        System.setErr(new zY(pta.g, System.err));
    }

    public boolean D() {
        int a2;
        Kpa_3 kpa_3 = this;
        int n2 = a2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
        if (!(a2 == 0 || Keyboard.isRepeatEvent() || kpa_3.ta instanceof qna && ((qna)kpa_3.ta).J > Kpa_3.J() - fta.d || !Keyboard.getEventKeyState())) {
            if (a2 == kpa_3.z.m.getKeyCode()) {
                kpa_3.b();
            } else if (a2 == kpa_3.z.v.getKeyCode()) {
                Kpa_3 kpa_32 = kpa_3;
                Kpa_3 kpa_33 = kpa_3;
                kpa_3.Ya.J().J(BX.J((File)kpa_32.p, (int)kpa_32.t, (int)kpa_33.k, (gHa)kpa_33.Q));
            }
            if (Kpa_3.J().ta == null) {
                if (a2 == kpa_3.z.E.getKeyCode()) {
                    kpa_3.J((EC)mx.J());
                } else if (a2 == kpa_3.z.V.getKeyCode()) {
                    zma.J();
                } else if (a2 == kpa_3.z.QA.getKeyCode()) {
                    Kpa_3.J().J((EC)Xe.J());
                }
                if (QS.J()) {
                    return QS.J((int)a2);
                }
            }
        }
        return uSa.E != 0;
    }

    private void J(long l2) {
        Kpa_3 kpa_3 = this;
        if (kpa_3.U.e) {
            StringBuilder stringBuilder;
            int n2;
            int n3;
            Object object;
            int n4;
            Kpa_3 kpa_32 = kpa_3;
            List a2 = kpa_32.U.J(kpa_32.G);
            MBa mBa2 = (MBa)a2.remove(uSa.E);
            uKa.A((int)hra.Ja);
            uKa.G((int)WPa.s);
            uKa.a();
            uKa.y();
            uKa.J((double)aSa.V, (double)kpa_3.t, (double)kpa_3.k, (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
            uKa.G((int)SQa.ca);
            uKa.y();
            uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
            uKa.C((float)pqa.r);
            uKa.z();
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            int b2 = rRa.f;
            Kpa_3 kpa_33 = kpa_3;
            int n5 = kpa_33.t - b2 - NTa.C;
            int n6 = kpa_33.k - b2 * uqa.g;
            uKa.B();
            aKa aKa3 = aKa2;
            int n7 = n5;
            aKa aKa4 = aKa2;
            aKa4.J(XTa.W, mka.I);
            aKa4.J((double)((float)n5 - (float)b2 * isa.W), (double)((float)n6 - (float)b2 * Ora.D - Yra.i), aSa.V).J(ZOa.x, uSa.E, uSa.E, uSa.E).M();
            aKa2.J((double)((float)n7 - (float)b2 * isa.W), (double)(n6 + b2 * uqa.g), aSa.V).J(ZOa.x, uSa.E, uSa.E, uSa.E).M();
            aKa3.J((double)((float)n7 + (float)b2 * isa.W), (double)(n6 + b2 * uqa.g), aSa.V).J(ZOa.x, uSa.E, uSa.E, uSa.E).M();
            aKa3.J((double)((float)n5 + (float)b2 * isa.W), (double)((float)n6 - (float)b2 * Ora.D - Yra.i), aSa.V).J(ZOa.x, uSa.E, uSa.E, uSa.E).M();
            pKa2.J();
            uKa.k();
            double d2 = aSa.V;
            int n8 = n4 = uSa.E;
            while (n8 < a2.size()) {
                float f2;
                float f3;
                float f4;
                int n9;
                object = (MBa)a2.get(n4);
                aKa aKa5 = aKa2;
                n3 = Oz.f((double)(object.field_76332_a / FPa.T)) + vRa.d;
                aKa5.J(uua.p, mka.I);
                n2 = object.func_76329_a();
                int n10 = n2 >> ERa.C & osa.Ja;
                int n11 = n2 >> Yqa.i & osa.Ja;
                int n12 = n2 & osa.Ja;
                aKa5.J((double)n5, (double)n6, aSa.V).J(n10, n11, n12, osa.Ja).M();
                int n13 = n9 = n3;
                while (n13 >= 0) {
                    f4 = (float)((d2 + object.field_76332_a * (double)n9 / (double)n3) * lQa.f * KPa.y / fqa.W);
                    f3 = Oz.d((float)f4) * (float)b2;
                    f2 = Oz.C((float)f4) * (float)b2 * MQa.L;
                    aKa2.J((double)((float)n5 + f3), (double)((float)n6 - f2), aSa.V).J(n10, n11, n12, osa.Ja).M();
                    n13 = --n9;
                }
                pKa2.J();
                aKa2.J(tTa.h, mka.I);
                int n14 = n9 = n3;
                while (n14 >= 0) {
                    f4 = (float)((d2 + object.field_76332_a * (double)n9 / (double)n3) * lQa.f * KPa.y / fqa.W);
                    f3 = Oz.d((float)f4) * (float)b2;
                    f2 = Oz.C((float)f4) * (float)b2 * MQa.L;
                    aKa aKa6 = aKa2;
                    aKa6.J((double)((float)n5 + f3), (double)((float)n6 - f2), aSa.V).J(n10 >> vRa.d, n11 >> vRa.d, n12 >> vRa.d, osa.Ja).M();
                    aKa6.J((double)((float)n5 + f3), (double)((float)n6 - f2 + FRa.Ga), aSa.V).J(n10 >> vRa.d, n11 >> vRa.d, n12 >> vRa.d, osa.Ja).M();
                    n14 = --n9;
                }
                pKa2.J();
                d2 += object.field_76332_a;
                n8 = ++n4;
            }
            DecimalFormat decimalFormat = new DecimalFormat(dua.M);
            uKa.H();
            object = Mqa.y;
            if (!mBa2.field_76331_c.equals(Qsa.h)) {
                object = new StringBuilder().insert(3 >> 2, (String)object).append(ppa.n).toString();
            }
            if (mBa2.field_76331_c.length() == 0) {
                stringBuilder = new StringBuilder();
                object = stringBuilder.insert(2 & 5, (String)object).append(pQa.o).toString();
            } else {
                stringBuilder = new StringBuilder();
                object = stringBuilder.insert(3 & 4, (String)object).append(mBa2.field_76331_c).append(Tpa.E).toString();
            }
            n3 = Wsa.K;
            kpa_3.Ea.J((String)object, (float)(n5 - b2), (float)(n6 - b2 / uqa.g - ERa.C), n3);
            object = new StringBuilder().insert(3 >> 2, decimalFormat.format(mBa2.field_76330_b)).append(Wqa.fa).toString();
            kpa_3.Ea.J((String)object, (float)(n5 + b2 - kpa_3.Ea.J((String)object)), (float)(n6 - b2 / uqa.g - ERa.C), n3);
            n2 = uSa.E;
            int n15 = n2;
            while (n15 < a2.size()) {
                StringBuilder stringBuilder2;
                MBa mBa3 = (MBa)a2.get(n2);
                String string = Mqa.y;
                if (mBa3.field_76331_c.equals(Qsa.h)) {
                    stringBuilder2 = new StringBuilder();
                    string = stringBuilder2.insert(3 & 4, string).append(ERa.ca).toString();
                } else {
                    stringBuilder2 = new StringBuilder();
                    string = stringBuilder2.insert(3 ^ 3, string).append(dqa.X).append(n2 + vRa.d).append(mPa.Z).toString();
                }
                string = new StringBuilder().insert(2 & 5, string).append(mBa3.field_76331_c).toString();
                kpa_3.Ea.J(string, (float)(n5 - b2), (float)(n6 + b2 / uqa.g + n2 * Yqa.i + kTa.j), mBa3.func_76329_a());
                string = new StringBuilder().insert(3 & 4, decimalFormat.format(mBa3.field_76332_a)).append(Wqa.fa).toString();
                kpa_3.Ea.J(string, (float)(n5 + b2 - vpa.o - kpa_3.Ea.J(string)), (float)(n6 + b2 / uqa.g + n2 * Yqa.i + kTa.j), mBa3.func_76329_a());
                string = new StringBuilder().insert(3 ^ 3, decimalFormat.format(mBa3.field_76330_b)).append(Wqa.fa).toString();
                float f5 = n6 + b2 / uqa.g + n2 * Yqa.i + kTa.j;
                kpa_3.Ea.J(string, (float)(n5 + b2 - kpa_3.Ea.J(string)), f5, mBa3.func_76329_a());
                n15 = ++n2;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void G() {
        Kpa_3 kpa_3 = this;
        if (maa.J() != Xy.OSX) {
            Object a2;
            InputStream inputStream;
            block5: {
                inputStream = null;
                a2 = null;
                try {
                    Kpa_3 kpa_32 = kpa_3;
                    inputStream = kpa_32.ya.l(new ResourceLocation(cra.z));
                    a2 = kpa_32.ya.l(new ResourceLocation(aSa.L));
                    if (inputStream == null || a2 == null) break block5;
                    ByteBuffer[] byteBufferArray = new ByteBuffer[uqa.g];
                    byteBufferArray[uSa.E] = kpa_3.J(inputStream);
                    byteBufferArray[vRa.d] = kpa_3.J((InputStream)a2);
                    Display.setIcon(byteBufferArray);
                }
                catch (IOException iOException) {
                    try {
                        D.error(Tqa.Ka, (Throwable)iOException);
                    }
                    catch (Throwable throwable) {
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream)a2);
                        throw throwable;
                    }
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream)a2);
                    return;
                }
            }
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly((InputStream)a2);
            return;
        }
    }

    public Oaa J() {
        Kpa_3 a2;
        return a2.na;
    }

    public final boolean A() {
        Kpa_3 a2;
        return a2.m;
    }

    public iMa J() {
        Kpa_3 a2;
        if (a2.c != null) {
            return a2.c.F;
        }
        return null;
    }

    private ByteBuffer J(InputStream inputStream) throws IOException {
        int n2;
        Object b2 = inputStream;
        Kpa_3 a2 = this;
        Object object = b2 = ImageIO.read((InputStream)b2);
        b2 = ((BufferedImage)object).getRGB(uSa.E, uSa.E, ((BufferedImage)object).getWidth(), ((BufferedImage)b2).getHeight(), null, uSa.E, ((BufferedImage)b2).getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(AQa.P * ((Object)b2).length);
        int n3 = ((Object)b2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object2 = b2[n2];
            byteBuffer.putInt(object2 << Yqa.i | object2 >> osa.c & osa.Ja);
            n4 = ++n2;
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.flip();
        return byteBuffer2;
    }

    public WMa J() {
        Kpa_3 a2;
        return a2.C;
    }

    public static int l() {
        int n2;
        int n3 = n2 = qQa.O;
        while (n3 > 0) {
            int n4 = n2;
            GL11.glTexImage2D(aPa.E, uSa.E, rSa.Ka, n4, n4, uSa.E, rSa.Ka, Uqa.P, (ByteBuffer)null);
            if (GL11.glGetTexLevelParameteri(aPa.E, uSa.E, mPa.H) != 0) {
                return n2;
            }
            n3 = n2 >> vRa.d;
        }
        return pua.o;
    }

    public WKa J() {
        Kpa_3 a2;
        return a2.j;
    }

    public static Map<String, String> J() {
        HashMap<String, String> hashMap = Maps.newHashMap();
        String string = hashMap.put(pqa.e, Kpa_3.J().J().J());
        HashMap<String, String> hashMap2 = hashMap;
        hashMap.put(Hra.K, Kpa_3.J().J().C());
        hashMap2.put(hQa.j, nua.D);
        return hashMap2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public <V> ListenableFuture<V> J(Callable<V> callable) {
        void a2;
        Kpa_3 kpa_3 = this;
        Validate.notNull(a2);
        if (!kpa_3.J()) {
            ListenableFutureTask b2 = ListenableFutureTask.create(a2);
            Queue<FutureTask<?>> queue = kpa_3.Da;
            synchronized (queue) {
                kpa_3.Da.add(b2);
                return b2;
            }
        }
        try {
            return Futures.immediateFuture(a2.call());
        }
        catch (Exception b2) {
            return Futures.immediateFailedCheckedFuture(b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(GCa gCa2) {
        void a2;
        Kpa_3 kpa_3 = this;
        void v0 = a2;
        v0.J(cra.Ja, (Object)GL11.glGetString(zsa.ca));
        v0.J(vRa.k, (Object)GL11.glGetString(PRa.m));
        v0.J(NOa.Ha, (Object)jQa.J());
        v0.J(uOa.Ha, (Object)kpa_3.A);
        ContextCapabilities b2 = GLContext.getCapabilities();
        v0.J(tTa.S, (Object)b2.GL_ARB_arrays_of_arrays);
        v0.J(Uta.E, (Object)b2.GL_ARB_base_instance);
        v0.J(fta.H, (Object)b2.GL_ARB_blend_func_extended);
        v0.J(nOa.H, (Object)b2.GL_ARB_clear_buffer_object);
        v0.J(MQa.A, (Object)b2.GL_ARB_color_buffer_float);
        v0.J(uqa.s, (Object)b2.GL_ARB_compatibility);
        v0.J(Wsa.Aa, (Object)b2.GL_ARB_compressed_texture_pixel_storage);
        v0.J(PQa.t, (Object)b2.GL_ARB_compute_shader);
        v0.J(lQa.u, (Object)b2.GL_ARB_copy_buffer);
        v0.J(oua.W, (Object)b2.GL_ARB_copy_image);
        v0.J(wta.g, (Object)b2.GL_ARB_depth_buffer_float);
        v0.J(PQa.t, (Object)b2.GL_ARB_compute_shader);
        v0.J(lQa.u, (Object)b2.GL_ARB_copy_buffer);
        v0.J(oua.W, (Object)b2.GL_ARB_copy_image);
        v0.J(wta.g, (Object)b2.GL_ARB_depth_buffer_float);
        v0.J(nOa.y, (Object)b2.GL_ARB_depth_clamp);
        v0.J(Pua.l, (Object)b2.GL_ARB_depth_texture);
        v0.J(GPa.Da, (Object)b2.GL_ARB_draw_buffers);
        v0.J(BPa.q, (Object)b2.GL_ARB_draw_buffers_blend);
        v0.J(URa.a, (Object)b2.GL_ARB_draw_elements_base_vertex);
        v0.J(dpa.O, (Object)b2.GL_ARB_draw_indirect);
        v0.J(pta.Aa, (Object)b2.GL_ARB_draw_instanced);
        v0.J(Rua.E, (Object)b2.GL_ARB_explicit_attrib_location);
        v0.J(cra.n, (Object)b2.GL_ARB_explicit_uniform_location);
        v0.J(Wqa.l, (Object)b2.GL_ARB_fragment_layer_viewport);
        v0.J(gua.f, (Object)b2.GL_ARB_fragment_program);
        v0.J(wua.c, (Object)b2.GL_ARB_fragment_shader);
        v0.J(hpa.H, (Object)b2.GL_ARB_fragment_program_shadow);
        v0.J(STa.h, (Object)b2.GL_ARB_framebuffer_object);
        v0.J(pQa.Aa, (Object)b2.GL_ARB_framebuffer_sRGB);
        v0.J(AQa.w, (Object)b2.GL_ARB_geometry_shader4);
        v0.J(ZSa.v, (Object)b2.GL_ARB_gpu_shader5);
        v0.J(YSa.w, (Object)b2.GL_ARB_half_float_pixel);
        v0.J(yra.G, (Object)b2.GL_ARB_half_float_vertex);
        v0.J(Qra.n, (Object)b2.GL_ARB_instanced_arrays);
        v0.J(NSa.ja, (Object)b2.GL_ARB_map_buffer_alignment);
        v0.J(Ppa.V, (Object)b2.GL_ARB_map_buffer_range);
        v0.J(Pua.h, (Object)b2.GL_ARB_multisample);
        v0.J(Vua.I, (Object)b2.GL_ARB_multitexture);
        v0.J(Asa.e, (Object)b2.GL_ARB_occlusion_query2);
        v0.J(jsa.L, (Object)b2.GL_ARB_pixel_buffer_object);
        v0.J(YSa.Y, (Object)b2.GL_ARB_seamless_cube_map);
        v0.J(kua.g, (Object)b2.GL_ARB_shader_objects);
        v0.J(NOa.w, (Object)b2.GL_ARB_shader_stencil_export);
        v0.J(cPa.R, (Object)b2.GL_ARB_shader_texture_lod);
        v0.J(pta.S, (Object)b2.GL_ARB_shadow);
        v0.J(Vua.g, (Object)b2.GL_ARB_shadow_ambient);
        v0.J(ZRa.Ga, (Object)b2.GL_ARB_stencil_texturing);
        v0.J(zsa.w, (Object)b2.GL_ARB_sync);
        v0.J(aqa.N, (Object)b2.GL_ARB_tessellation_shader);
        v0.J(xra.Q, (Object)b2.GL_ARB_texture_border_clamp);
        v0.J(kTa.M, (Object)b2.GL_ARB_texture_buffer_object);
        v0.J(FTa.b, (Object)b2.GL_ARB_texture_cube_map);
        v0.J(NPa.j, (Object)b2.GL_ARB_texture_cube_map_array);
        v0.J(aPa.Da, (Object)b2.GL_ARB_texture_non_power_of_two);
        v0.J(kPa.e, (Object)b2.GL_ARB_uniform_buffer_object);
        v0.J(hpa.N, (Object)b2.GL_ARB_vertex_blend);
        v0.J(TPa.L, (Object)b2.GL_ARB_vertex_buffer_object);
        v0.J(rSa.p, (Object)b2.GL_ARB_vertex_program);
        v0.J(ZSa.Ka, (Object)b2.GL_ARB_vertex_shader);
        v0.J(WQa.Z, (Object)b2.GL_EXT_bindable_uniform);
        v0.J(mPa.F, (Object)b2.GL_EXT_blend_equation_separate);
        v0.J(Lqa.Ka, (Object)b2.GL_EXT_blend_func_separate);
        v0.J(nOa.Ha, (Object)b2.GL_EXT_blend_minmax);
        v0.J(cPa.h, (Object)b2.GL_EXT_blend_subtract);
        v0.J(Pua.fa, (Object)b2.GL_EXT_draw_instanced);
        v0.J(qsa.j, (Object)b2.GL_EXT_framebuffer_multisample);
        v0.J(KTa.i, (Object)b2.GL_EXT_framebuffer_object);
        v0.J(mPa.ha, (Object)b2.GL_EXT_framebuffer_sRGB);
        v0.J(Hra.s, (Object)b2.GL_EXT_geometry_shader4);
        v0.J(osa.g, (Object)b2.GL_EXT_gpu_program_parameters);
        v0.J(Qpa.p, (Object)b2.GL_EXT_gpu_shader4);
        v0.J(NPa.H, (Object)b2.GL_EXT_multi_draw_arrays);
        v0.J(kpa.f, (Object)b2.GL_EXT_packed_depth_stencil);
        v0.J(QSa.s, (Object)b2.GL_EXT_paletted_texture);
        v0.J(LRa.J, (Object)b2.GL_EXT_rescale_normal);
        v0.J(pta.B, (Object)b2.GL_EXT_separate_shader_objects);
        v0.J(Wsa.U, (Object)b2.GL_EXT_shader_image_load_store);
        v0.J(pta.Ia, (Object)b2.GL_EXT_shadow_funcs);
        v0.J(uRa.h, (Object)b2.GL_EXT_shared_texture_palette);
        v0.J(hQa.ja, (Object)b2.GL_EXT_stencil_clear_tag);
        v0.J(EQa.F, (Object)b2.GL_EXT_stencil_two_side);
        v0.J(LPa.N, (Object)b2.GL_EXT_stencil_wrap);
        v0.J(BRa.x, (Object)b2.GL_EXT_texture_3d);
        v0.J(Ssa.Ga, (Object)b2.GL_EXT_texture_array);
        v0.J(XTa.q, (Object)b2.GL_EXT_texture_buffer_object);
        v0.J(UTa.Z, (Object)b2.GL_EXT_texture_integer);
        v0.J(uSa.h, (Object)b2.GL_EXT_texture_lod_bias);
        v0.J(wPa.Aa, (Object)b2.GL_EXT_texture_sRGB);
        v0.J(Ura.s, (Object)b2.GL_EXT_vertex_shader);
        v0.J(Sqa.z, (Object)b2.GL_EXT_vertex_weighting);
        v0.J(Zta.B, (Object)GL11.glGetInteger(uqa.D));
        GL11.glGetError();
        a2.J(ySa.p, (Object)GL11.glGetInteger(KTa.h));
        GL11.glGetError();
        a2.J(Spa.Q, (Object)GL11.glGetInteger(nqa.ja));
        GL11.glGetError();
        a2.J(WRa.g, (Object)GL11.glGetInteger(JPa.Y));
        GL11.glGetError();
        a2.J(bSa.Q, (Object)GL11.glGetInteger(FTa.J));
        GL11.glGetError();
        a2.J(bSa.Q, (Object)GL11.glGetInteger(Jra.Y));
        GL11.glGetError();
        a2.J(NTa.ba, (Object)Kpa_3.l());
    }

    public GCa J() {
        Kpa_3 a2;
        return a2.W;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2, mZ mZ2) {
        void b2;
        void c2;
        Kpa_3 a2;
        Object d22 = mZ2;
        Kpa_3 kpa_3 = a2 = this;
        kpa_3.J((Eoa)null);
        System.gc();
        Object object = kpa_3.la.J((String)c2, uSa.E != 0);
        vU vU2 = object.J();
        if (vU2 == null && d22 != null) {
            vU2 = new vU((mZ)d22, (String)c2);
            object.J(vU2);
        }
        if (d22 == null) {
            d22 = new mZ(vU2);
        }
        try {
            a2.r = new nBa((Kpa)a2, (String)c2, (String)b2, (mZ)d22);
            a2.r.e();
            a2.ja = vRa.d;
        }
        catch (Throwable d22) {
            object = RIa.J((Throwable)d22, (String)pQa.Ia);
            Dha dha2 = object.J(pQa.Ia);
            dha2.J(cTa.a, (Object)c2);
            dha2.J(Psa.L, (Object)b2);
            throw new MZ((RIa)object);
        }
        a2.Ja.l(oha.J(LRa.U, new Object[uSa.E]));
        while (!a2.r.e()) {
            d22 = a2.r.M();
            if (d22 != null) {
                a2.Ja.f(oha.J((String)d22, new Object[uSa.E]));
            } else {
                a2.Ja.f(Mqa.y);
            }
            try {
                Thread.sleep(FTa.N);
            }
            catch (InterruptedException interruptedException) {}
        }
        Kpa_3 kpa_32 = a2;
        kpa_32.J((EC)null);
        d22 = kpa_32.r.J().J();
        Object object2 = object = uba.J((SocketAddress)d22);
        ((uba)object).J((aA)new coa((uba)object, (Kpa)a2, null));
        ((uba)object2).J((KC)new MAa(uOa.F, d22.toString(), uSa.E, wBa.LOGIN));
        ((uba)object).J(new VBa(a2.J().J()));
        kpa_32.Ha = object;
    }

    public int f() {
        Kpa_3 a2;
        if (a2.Ta == null && a2.ta != null) {
            return Fsa.d;
        }
        return a2.z.HB;
    }

    public ListenableFuture<Object> J() {
        Kpa_3 a2;
        Kpa_3 kpa_3 = a2;
        Kpa_3 kpa_32 = a2;
        return kpa_32.J((Runnable)new sQa((Kpa)kpa_32));
    }

    private void J(boolean bl2) {
        boolean b22 = bl2;
        Kpa_3 a2 = this;
        if (!b22) {
            a2.i = uSa.E;
        }
        if (a2.i <= 0 && !a2.c.V()) {
            if (b22 && a2.Oa != null && a2.Oa.A == AY.BLOCK) {
                Kpa_3 kpa_3 = a2;
                XF b22 = kpa_3.Oa.J();
                if (kpa_3.Ta.J(b22).J().J() != Material.air && a2.L.J(b22, a2.Oa.j)) {
                    Kpa_3 kpa_32 = a2;
                    a2.f.J(b22, kpa_32.Oa.j);
                    kpa_32.c.u();
                    return;
                }
            } else {
                a2.L.f();
            }
        }
    }

    public MinecraftSessionService J() {
        Kpa_3 a2;
        return a2.I;
    }

    public xKa J() {
        Kpa_3 a2;
        return a2.P;
    }

    public void J(RIa rIa2) {
        Kpa_3 a2;
        Kpa_3 b2 = rIa2;
        Kpa_3 kpa_3 = a2 = this;
        kpa_3.da = vRa.d;
        kpa_3.b = b2;
    }

    public boolean i() {
        Kpa_3 a2;
        if ((float)a2.f() < Fha.FRAMERATE_LIMIT.getValueMax()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ String J(Kpa a2) {
        return a2.A;
    }

    public vL J() {
        Kpa_3 a2;
        return a2.u;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void D() throws IOException {
        Kpa_3 kpa_3;
        long l2;
        long l3;
        long l4;
        long l5;
        Kpa_3 kpa_32;
        block17: {
            block24: {
                block26: {
                    Kpa_3 kpa_33;
                    long l6;
                    block29: {
                        Kpa_3 kpa_34;
                        block28: {
                            block27: {
                                block25: {
                                    long l7;
                                    block23: {
                                        block18: {
                                            Kpa_3 kpa_35;
                                            block20: {
                                                block22: {
                                                    block21: {
                                                        block19: {
                                                            int a2;
                                                            kpa_32 = this;
                                                            l5 = System.nanoTime();
                                                            kpa_32.U.J(gua.u);
                                                            if (Display.isCreated() && Display.isCloseRequested()) {
                                                                kpa_32.L();
                                                            }
                                                            oW.l();
                                                            if (kpa_32.sa && kpa_32.Ta != null) {
                                                                Kpa_3 kpa_36 = kpa_32;
                                                                float f2 = kpa_36.w.j.J();
                                                                kpa_36.w.J();
                                                                kpa_36.w.j.J(f2);
                                                            } else {
                                                                kpa_32.w.J();
                                                            }
                                                            oW.J();
                                                            oW.f();
                                                            Kpa_3 kpa_37 = kpa_32;
                                                            kpa_37.U.J(gQa.n);
                                                            Queue<FutureTask<?>> queue = kpa_37.Da;
                                                            synchronized (queue) {
                                                                Kpa_3 kpa_38 = kpa_32;
                                                                while (!kpa_38.Da.isEmpty()) {
                                                                    maa.J(kpa_32.Da.poll(), D);
                                                                    kpa_38 = kpa_32;
                                                                }
                                                            }
                                                            kpa_32.U.f();
                                                            l4 = System.nanoTime();
                                                            Kpa_3 kpa_39 = kpa_32;
                                                            kpa_39.U.J(ERa.la);
                                                            int n2 = kpa_39.w.M.f();
                                                            int n3 = a2 = uSa.E;
                                                            while (n3 < n2) {
                                                                kpa_32.c();
                                                                n3 = ++a2;
                                                            }
                                                            Kpa_3 kpa_310 = kpa_32;
                                                            CV.M = kpa_310.w.j.J();
                                                            oW.C();
                                                            kpa_310.va = uSa.E;
                                                            if (kpa_310.Ta != null && kpa_32.c != null && kpa_32.Ta.e && System.currentTimeMillis() - kpa_32.J().J().m > KSa.N) {
                                                                kpa_32.va = vRa.d;
                                                            }
                                                            if (Cta.I.equals(a2 = System.getProperty(RQa.d)) || n2 <= 0) break block17;
                                                            l3 = System.currentTimeMillis();
                                                            if (l3 - kpa_32.Ma <= vua.Fa) break block18;
                                                            l2 = (l3 - kpa_32.Ma) / cra.f;
                                                            l6 = kpa_32.N.f() - kpa_32.F.f();
                                                            if (l6 <= l2 + fta.d) break block19;
                                                            Kpa_3.f(Wsa.J);
                                                            kpa_35 = kpa_32;
                                                            break block20;
                                                        }
                                                        if (l6 <= l2 + rQa.v) break block21;
                                                        Kpa_3 kpa_311 = kpa_32;
                                                        kpa_311.T += vRa.d;
                                                        if (kpa_311.T <= uqa.g) break block22;
                                                        Kpa_3.f(UOa.j);
                                                        kpa_35 = kpa_32;
                                                        break block20;
                                                    }
                                                    kpa_32.T = uSa.E;
                                                }
                                                kpa_35 = kpa_32;
                                            }
                                            kpa_35.F.f(kpa_32.N.f());
                                            l7 = kpa_32.Ma = l3;
                                            break block23;
                                        }
                                        if (l3 < kpa_32.Ma) {
                                            Kpa_3.f(KSa.W);
                                        }
                                        l7 = l3;
                                    }
                                    if (l7 - kpa_32.Ca <= asa.fa) break block24;
                                    if (kpa_32.s != nqa.i) break block25;
                                    kpa_33 = kpa_32;
                                    kpa_32.s = System.nanoTime() / Ata.p;
                                    kpa_32.S = Sys.getTime();
                                    break block26;
                                }
                                l2 = System.nanoTime() / Ata.p;
                                l6 = Sys.getTime();
                                Kpa_3 kpa_312 = kpa_32;
                                long l8 = kpa_312.s - l2;
                                long l9 = kpa_312.S - l6;
                                if (Math.abs(l8 - l9) <= cra.f) break block27;
                                Kpa_3 kpa_313 = kpa_32;
                                kpa_313.wa += vRa.d;
                                if (kpa_313.wa <= uqa.g) break block28;
                                Kpa_3.f(nOa.A);
                                kpa_34 = kpa_32;
                                break block29;
                            }
                            kpa_32.wa = uSa.E;
                        }
                        kpa_34 = kpa_32;
                    }
                    kpa_34.s = l2;
                    kpa_33 = kpa_32;
                    kpa_32.S = l6;
                }
                kpa_33.Ca = l3;
            }
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = ERa.la;
            NativeClassLoaderUtils.call((Object)objectArray);
        }
        Kpa_3 kpa_314 = kpa_32;
        kpa_314.U.f(Fsa.X);
        l3 = System.nanoTime() - l4;
        kpa_314.J(vqa.a);
        kpa_314.U.f(gua.n);
        Kpa_3 kpa_315 = kpa_32;
        kpa_314.ga.J((Sx)kpa_315.c, kpa_315.w.j.J());
        kpa_314.U.f();
        kpa_314.U.J(Zpa.h);
        uKa.e();
        uKa.A((int)EQa.ca);
        kpa_314.Q.J(vRa.d != 0);
        kpa_314.U.J(Jpa.q);
        uKa.H();
        if (kpa_314.c != null && kpa_32.c.h()) {
            kpa_32.z.ld = uSa.E;
        }
        Kpa_3 kpa_316 = kpa_32;
        kpa_316.U.f();
        if (!kpa_316.H) {
            WTa.J((iTa)iTa.START, (float)kpa_32.w.j.J());
            Kpa_3 kpa_317 = kpa_32;
            kpa_317.U.f(dqa.ja);
            Kpa_3 kpa_318 = kpa_32;
            kpa_317.R.f(kpa_318.w.j.J(), l5);
            kpa_318.U.f();
            WTa.J((iTa)iTa.END, (float)kpa_32.w.j.J());
        }
        Kpa_3 kpa_319 = kpa_32;
        kpa_319.U.f();
        if (kpa_319.z.t && kpa_32.z.Da && !kpa_32.z.ba) {
            if (!kpa_32.U.e) {
                kpa_32.U.J();
            }
            kpa_3 = kpa_32;
            kpa_32.U.e = vRa.d;
            kpa_32.J(l3);
        } else {
            kpa_3 = kpa_32;
            kpa_32.U.e = uSa.E;
            kpa_32.La = System.nanoTime();
        }
        kpa_3.Za.f();
        Kpa_3 kpa_320 = kpa_32;
        kpa_320.Q.f();
        uKa.D();
        uKa.e();
        Kpa_3 kpa_321 = kpa_32;
        kpa_320.Q.J(kpa_32.t, kpa_321.k);
        uKa.D();
        kpa_321.U.J(gua.u);
        kpa_320.d();
        Thread.yield();
        kpa_320.J(bua.I);
        kpa_320.pa += vRa.d;
        kpa_320.sa = kpa_320.f() && kpa_32.ta != null && kpa_32.ta.J() && !kpa_32.r.z() ? vRa.d : uSa.E;
        l2 = System.nanoTime();
        kpa_32.Sa.J(l2 - kpa_32.y);
        kpa_32.y = l2;
        while (Kpa_3.J() >= kpa_32.Na + asa.fa) {
            ua = kpa_32.pa;
            Object[] objectArray = new Object[Yqa.i];
            objectArray[uSa.E] = ua;
            objectArray[vRa.d] = Cla.L;
            objectArray[uqa.g] = Cla.L != vRa.d ? wsa.Q : Mqa.y;
            objectArray[yRa.d] = (float)kpa_32.z.HB == Fha.FRAMERATE_LIMIT.getValueMax() ? eta.K : Integer.valueOf(kpa_32.z.HB);
            objectArray[AQa.P] = kpa_32.z.y ? AQa.V : Mqa.y;
            Object object = objectArray[tTa.h] = kpa_32.z.u ? Mqa.y : ZSa.c;
            objectArray[uua.p] = kpa_32.z.z == 0 ? Mqa.y : (kpa_32.z.z == vRa.d ? Tqa.f : KTa.P);
            objectArray[XTa.W] = nka.J() ? PTa.w : Mqa.y;
            kpa_32.e = String.format(Bpa.t, objectArray);
            Cla.L = uSa.E;
            Kpa_3 kpa_322 = kpa_32;
            kpa_322.Na += asa.fa;
            kpa_322.pa = uSa.E;
            kpa_322.W.l();
            if (kpa_322.W.J()) continue;
            kpa_32.W.C();
        }
        if (kpa_32.i()) {
            Kpa_3 kpa_323 = kpa_32;
            kpa_323.U.J(iPa.ja);
            Display.sync(kpa_323.f());
            kpa_323.U.f();
        }
        kpa_32.U.f();
    }

    public void A() {
        Kpa_3 a2;
        if (a2.ta == null) {
            Kpa_3 kpa_3 = a2;
            kpa_3.J((EC)new gOa());
            if (kpa_3.f() && !a2.r.z()) {
                a2.ga.l();
            }
        }
    }

    public pZ J() {
        Kpa_3 a2;
        return a2.Sa;
    }

    public void i() {
        Kpa_3 kpa_3;
        Iterator iterator;
        Kpa_3 kpa_32;
        Kpa_3 kpa_33 = kpa_32 = this;
        ArrayList<IResourcePack> a2 = Lists.newArrayList(kpa_33.ma);
        Iterator iterator2 = iterator = kpa_33.x.l().iterator();
        while (iterator2.hasNext()) {
            nIa nIa2 = (nIa)iterator.next();
            iterator2 = iterator;
            a2.add(nIa2.J());
        }
        if (kpa_32.x.J() != null) {
            a2.add(kpa_32.x.J());
        }
        try {
            kpa_32.Ga.J((List)a2);
            kpa_3 = kpa_32;
        }
        catch (RuntimeException runtimeException) {
            D.info(ZRa.k, (Throwable)runtimeException);
            Object object = a2;
            object.clear();
            Kpa_3 kpa_34 = kpa_32;
            object.addAll(kpa_32.ma);
            kpa_3 = kpa_34;
            Kpa_3 kpa_35 = kpa_32;
            kpa_35.x.J(Collections.emptyList());
            kpa_35.Ga.J((List)a2);
            kpa_35.z.Ab.clear();
            kpa_34.z.sb.clear();
            kpa_34.z.d();
        }
        kpa_3.Ka.J((List)a2);
        if (kpa_32.Aa != null) {
            kpa_32.Aa.J();
        }
    }

    @Override
    public boolean J() {
        Kpa_3 a2;
        if (Thread.currentThread() == a2.K) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void M() {
        Kpa_3 a2;
        oPa oPa2 = new oPa((Kpa)a2, ZRa.T);
        oPa2.setDaemon(vRa.d != 0);
        oPa2.start();
    }

    private void e() throws LWJGLException {
        Kpa_3 kpa_3 = this;
        if (kpa_3.a) {
            Display.setFullscreen(vRa.d != 0);
            DisplayMode a2 = Display.getDisplayMode();
            Kpa_3 kpa_32 = kpa_3;
            kpa_32.t = Math.max(vRa.d, a2.getWidth());
            kpa_32.k = Math.max(vRa.d, a2.getHeight());
            return;
        }
        Kpa_3 kpa_33 = kpa_3;
        Display.setDisplayMode(new DisplayMode(kpa_33.t, kpa_33.k));
    }

    public static int J() {
        return ua;
    }

    private String J() {
        Kpa_3 a2;
        if (a2.r != null) {
            if (a2.r.z()) {
                return BQa.S;
            }
            return ura.H;
        }
        if (a2.Xa != null) {
            if (a2.Xa.J()) {
                return WOa.p;
            }
            return jRa.L;
        }
        return kra.Ga;
    }

    public void J(Eoa eoa2) {
        Kpa_3 b2 = eoa2;
        Kpa_3 a2 = this;
        a2.J((Eoa)b2, Mqa.y);
    }

    public boolean M() {
        Kpa_3 a2;
        if (a2.Ka.J() || a2.z.Lc) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ eia J(Kpa a2) {
        return a2.Ka;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        void f2;
        void a2;
        void b2;
        void c2;
        void d2;
        void g2;
        void h2;
        void e2;
        void i2;
        void j2;
        aKa aKa2;
        Kpa_3 kpa_3 = this;
        float f3 = KPa.Aa;
        float k2 = KPa.Aa;
        aKa aKa3 = aKa2 = pKa.J().J();
        void v1 = j2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.a);
        aKa4.J((double)j2, (double)(i2 + e2), aSa.V).J((double)((float)h2 * f3), (double)((float)(g2 + e2) * k2)).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        aKa2.J((double)(v1 + f2), (double)(i2 + e2), aSa.V).J((double)((float)(h2 + f2) * f3), (double)((float)(g2 + e2) * k2)).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        aKa3.J((double)(v1 + f2), (double)i2, aSa.V).J((double)((float)(h2 + f2) * f3), (double)((float)g2 * k2)).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        aKa3.J((double)j2, (double)i2, aSa.V).J((double)((float)h2 * f3), (double)((float)g2 * k2)).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        pKa.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        Kpa_3 kpa_3;
        Kpa_3 kpa_32 = kpa_3 = this;
        kpa_32.Ta.i();
        kpa_32.Ta.k();
        int n3 = uSa.E;
        String string = null;
        if (kpa_32.c != null) {
            Kpa_3 kpa_33 = kpa_3;
            n3 = kpa_33.c.M();
            Kpa_3 kpa_34 = kpa_3;
            kpa_33.Ta.C((vL)kpa_34.c);
            string = kpa_34.c.D();
        }
        Kpa_3 kpa_35 = kpa_3;
        kpa_35.u = null;
        Kpa_3 b2 = kpa_35.c;
        Kpa_3 kpa_36 = kpa_3;
        kpa_35.c = kpa_35.L.J((Gg)kpa_36.Ta, kpa_36.c == null ? new Laa() : kpa_3.c.J());
        Kpa_3 kpa_37 = kpa_3;
        kpa_37.c.J().J(b2.J().f());
        kpa_37.c.Ha = a2;
        kpa_37.u = kpa_37.c;
        kpa_37.c.D();
        kpa_37.c.l(string);
        kpa_37.Ta.f((vL)kpa_3.c);
        Kpa_3 kpa_38 = kpa_3;
        Kpa_3 kpa_39 = kpa_3;
        kpa_38.L.l((Sx)kpa_39.c);
        kpa_38.c.g = new cy(kpa_3.z);
        kpa_39.c.l(n3);
        kpa_38.L.J((Sx)kpa_3.c);
        kpa_38.c.D(b2.W());
        if (kpa_37.ta instanceof CMa) {
            kpa_3.J((EC)null);
        }
    }

    public boolean e() {
        Kpa_3 a2;
        return a2.aa;
    }

    public void d() {
        Kpa_3 a2;
        Kpa_3 kpa_3 = a2;
        kpa_3.U.J(kPa.m);
        GL11.glPushAttrib(TQa.d);
        Display.update();
        GL11.glPopAttrib();
        kpa_3.U.f();
        kpa_3.K();
    }

    public boolean d() {
        Kpa_3 a2;
        return a2.ja;
    }

    public boolean l() {
        Kpa_3 a2;
        return a2.z.qc;
    }

    public void C() {
        Kpa_3 a2;
        if (Display.isActive() && !a2.Ra) {
            Kpa_3 kpa_3 = a2;
            a2.Ra = vRa.d;
            kpa_3.ea.f();
            kpa_3.J((EC)null);
            kpa_3.i = Uqa.G;
        }
    }

    public void J(lma lma2) {
        Kpa_3 b2 = lma2;
        Kpa_3 a2 = this;
        a2.Xa = b2;
    }

    public void l() {
        Kpa_3 a2;
        Kpa_3 kpa_3 = a2;
        Kpa_3 kpa_32 = a2;
        kpa_3.Q.l(kpa_3.t, kpa_32.k);
        if (kpa_32.R != null) {
            Kpa_3 kpa_33 = a2;
            kpa_33.R.J(kpa_33.t, a2.k);
        }
    }

    private static boolean C() {
        int n2;
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Era.Da;
        stringArray[vRa.d] = yOa.q;
        stringArray[uqa.g] = wsa.Y;
        String[] stringArray2 = stringArray;
        int n3 = stringArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            String string = System.getProperty(stringArray2[n2]);
            if (string != null && string.contains(Lsa.Q)) {
                return vRa.d != 0;
            }
            n4 = ++n2;
        }
        return uSa.E != 0;
    }

    static {
        D = LogManager.getLogger();
        d = new ResourceLocation(hQa.f);
        ca = maa.J() == Xy.OSX ? vRa.d : uSa.E;
        ra = new byte[NSa.s];
        DisplayMode[] displayModeArray = new DisplayMode[uqa.g];
        displayModeArray[uSa.E] = new DisplayMode(sSa.D, eta.p);
        displayModeArray[vRa.d] = new DisplayMode(Cra.K, Npa.J);
        M = Lists.newArrayList(displayModeArray);
        Z = new HashSet<String>();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f() {
        block17: {
            block19: {
                block18: {
                    var3_1 = this /* !! */ ;
                    if (var3_1.L.C()) break block17;
                    if (!uw.e.J()) {
                        var1_2 = var3_1.z.pA.getPressedEventNanos() / Ata.p;
                        if (var1_2 != nqa.i && var1_2 - nua.W < var3_1.oa) {
                            return;
                        }
                        var3_1.oa = var1_2;
                    }
                    RR.A.J();
                    v0 = var3_1;
                    v0.Wa = AQa.P;
                    var1_3 = vRa.d;
                    var2_4 = v0.c.K.f();
                    if (v0.Oa != null) break block18;
                    Kpa_3.D.warn(sSa.Da);
                    v1 = var1_3;
                    break block19;
                }
                switch (Pra.I[var3_1.Oa.A.ordinal()]) {
                    case 1: {
                        v2 = var3_1;
                        while (false) {
                        }
                        if (v2.L.J((Sx)v2.c, var3_1.Oa.J, var3_1.Oa)) {
                            v1 = var1_3 = uSa.E;
                            break;
                        }
                        v3 = var3_1;
                        if (v3.L.J((Sx)v3.c, var3_1.Oa.J)) {
                            v1 = var1_3 = uSa.E;
                            break;
                        }
                        ** GOTO lbl50
                    }
                    case 2: {
                        v4 = var3_1;
                        a /* !! */  = v4.Oa.J();
                        if (v4.Ta.J((XF)a /* !! */ ).J().J() != Material.air) {
                            var4_5 = var2_4 != null ? var2_4.E : uSa.E;
                            v5 = var3_1;
                            WTa.J((Sx)var3_1.c, (cua)cua.RIGHT_CLICK_BLOCK, (Gg)v5.Ta, (XF)a /* !! */ , (DZ)var3_1.Oa.j);
                            v6 = var3_1;
                            if (v5.L.J(v6.c, v6.Ta, var2_4, (XF)a /* !! */ , var3_1.Oa.j, var3_1.Oa.I)) {
                                var1_3 = uSa.E;
                                var3_1.c.u();
                            }
                            if (var2_4 == null) {
                                return;
                            }
                            if (var2_4.E == 0) {
                                v1 = var1_3;
                                var3_1.c.K.j[var3_1.c.K.J] = null;
                                break;
                            }
                            if (var2_4.E != var4_5 || var3_1.L.A()) {
                                var3_1.R.t.d();
                            }
                        }
                    }
lbl50:
                    // 7 sources

                    default: {
                        v1 = var1_3;
                    }
                }
            }
            if (v1 != 0) {
                v7 = var3_1;
                a /* !! */  = v7.c.K.f();
                WTa.J((Sx)v7.c, (cua)cua.RIGHT_CLICK_AIR, (Gg)var3_1.Ta, null, null);
                if (a /* !! */  != null) {
                    v8 = var3_1;
                    if (v8.L.J((Sx)v8.c, (Gg)var3_1.Ta, (Mda)a /* !! */ )) {
                        var3_1.R.t.J();
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J() {
        var1_2 = this;
        try {
            Kpa_3.D.info(XSa.u);
            try {
                var1_2.J((Eoa)null);
                ** GOTO lbl-1000
            }
            catch (Throwable v0) {
                OT.i.C();
                v1 = var1_2;
                v1.ha.l();
                v1.ga.f();
            }
        }
        finally {
            Display.destroy();
            ConfigurationService.J().J();
            if (!var1_2.da) {
                System.exit(uSa.E);
            }
        }
        System.gc();
    }

    public boolean f() {
        Kpa_3 a2;
        if (a2.ja && a2.r != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

