/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ERa
 *  FPa
 *  GCa
 *  Gg
 *  Gua
 *  HAa
 *  ISa
 *  IY
 *  JTa
 *  KTa
 *  Kpa
 *  Lqa
 *  Lra
 *  Lz
 *  MZ
 *  Mba
 *  Mha
 *  NBa
 *  NTa
 *  Nb
 *  OCa
 *  Oz
 *  PTa
 *  QBa
 *  QSa
 *  QZ
 *  RIa
 *  RQa
 *  Rca
 *  Rha
 *  SRa
 *  Sqa
 *  Ssa
 *  TQa
 *  TY
 *  Tf
 *  Tpa
 *  Uta
 *  VQa
 *  Vb
 *  Vua
 *  WQa
 *  WSa
 *  XB
 *  YSa
 *  Ysa
 *  Yy
 *  Zpa
 *  Zta
 *  aQa
 *  aSa
 *  asa
 *  bqa
 *  bua
 *  cra
 *  dQa
 *  fTa
 *  fpa
 *  gc
 *  gda
 *  hra
 *  isa
 *  jd
 *  jda
 *  kCa
 *  lPa
 *  ld
 *  lqa
 *  mZ
 *  nQa
 *  oZ
 *  oqa
 *  pb
 *  pua
 *  rd
 *  saa
 *  uOa
 *  ura
 *  vL
 *  vRa
 *  vU
 *  ysa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class OCa_1
implements Runnable,
u,
c,
jd {
    public String Aa;
    private long S;
    private int Z;
    private static final Logger Y = LogManager.getLogger();
    private final File r;
    private boolean V;
    public final Nb z;
    private boolean X;
    private boolean y;
    public long[][] U;
    public final long[] P;
    private String u;
    private boolean O;
    private long t;
    private boolean R;
    private final pb Q;
    private int N;
    public final Proxy T;
    private boolean p;
    private final NBa n;
    private long s;
    private boolean w;
    private boolean W;
    private int q;
    private final GameProfileRepository x;
    private static OCa v;
    private final TY o;
    private String h;
    public final gda K;
    private final MinecraftSessionService H;
    private KeyPair c;
    private final List<rd> B;
    private String d;
    private int a;
    public static final File b;
    private boolean l;
    public final Queue<FutureTask<?>> e;
    public Tf[] G;
    private boolean D;
    private final GCa f;
    private String F;
    private String g;
    private final Random L;
    private String E;
    private Cba m;
    private final YggdrasilAuthenticationService C;
    private boolean i;
    private Thread M;
    private boolean k;
    public int j;
    private final kCa J;
    private boolean A;
    private String I;

    public GameProfileRepository J() {
        OCa_1 a2;
        return a2.x;
    }

    public synchronized void M(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        a2.h = b2;
    }

    @Override
    public vL J() {
        return null;
    }

    public boolean o() {
        return uSa.E != 0;
    }

    @Override
    public boolean J(int n2, String string) {
        String c2 = string;
        OCa_1 a2 = this;
        return vRa.d != 0;
    }

    public int A() {
        return ERa.C;
    }

    public pb J() {
        OCa_1 a2;
        return a2.Q;
    }

    public Cba J() {
        OCa_1 a2;
        return a2.m;
    }

    public int i() {
        OCa_1 a2;
        return a2.N;
    }

    public boolean h() {
        return vRa.d != 0;
    }

    public static long J() {
        return System.currentTimeMillis();
    }

    public void J(KeyPair keyPair) {
        KeyPair b2 = keyPair;
        OCa_1 a2 = this;
        a2.c = b2;
    }

    @Override
    public void J(Rha rha, int n2) {
        int c2 = n2;
        OCa_1 oCa_1 = this;
    }

    public void k() {
        GameProfile[] gameProfileArray = this;
        long l2 = System.nanoTime();
        gameProfileArray.Z += vRa.d;
        if (gameProfileArray.A) {
            gameProfileArray.A = uSa.E;
            gameProfileArray.K.e = vRa.d;
            gameProfileArray.K.J();
        }
        gameProfileArray.K.J(gua.u);
        gameProfileArray.J();
        if (l2 - gameProfileArray.s >= nQa.H) {
            int n2;
            gameProfileArray.s = l2;
            gameProfileArray.J.J(new QBa(gameProfileArray.l(), gameProfileArray.M()));
            GameProfile[] a2 = new GameProfile[Math.min(gameProfileArray.M(), lqa.s)];
            int n3 = Oz.J((Random)gameProfileArray.L, (int)uSa.E, (int)(gameProfileArray.M() - a2.length));
            int n4 = n2 = uSa.E;
            while (n4 < a2.length) {
                int n5 = n2++;
                a2[n5] = gameProfileArray.m.J().get(n3 + n5).J();
                n4 = n2;
            }
            Collections.shuffle(Arrays.asList(a2));
            gameProfileArray.J.J().J(a2);
        }
        if (gameProfileArray.Z % cra.I == 0) {
            GameProfile[] gameProfileArray2 = gameProfileArray;
            GameProfile[] gameProfileArray3 = gameProfileArray;
            gameProfileArray2.K.J(lPa.N);
            gameProfileArray3.m.f();
            gameProfileArray2.M(vRa.d != 0);
            gameProfileArray3.K.f();
        }
        GameProfile[] gameProfileArray4 = gameProfileArray;
        gameProfileArray4.K.J(uua.A);
        gameProfileArray.P[gameProfileArray.Z % ySa.T] = System.nanoTime() - l2;
        gameProfileArray.K.f();
        gameProfileArray4.K.J(WRa.C);
        if (!gameProfileArray.f.J() && gameProfileArray.Z > ySa.T) {
            gameProfileArray.f.C();
        }
        if (gameProfileArray.Z % MTa.g == 0) {
            gameProfileArray.f.l();
        }
        gameProfileArray.K.f();
        gameProfileArray.K.f();
    }

    public int M() {
        OCa_1 a2;
        return a2.m.f();
    }

    public KeyPair J() {
        OCa_1 a2;
        return a2.c;
    }

    public boolean m() {
        OCa_1 a2;
        return a2.y;
    }

    public boolean E() {
        OCa_1 a2;
        if (a2.d != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public NBa J() {
        OCa_1 a2;
        return a2.n;
    }

    public TY J() {
        OCa_1 a2;
        return a2.o;
    }

    public void J(GCa gCa) {
        OCa_1 b2 = gCa;
        OCa_1 a2 = this;
        OCa_1 oCa_1 = b2;
        oCa_1.J(ura.H, a2.E());
        oCa_1.J(ERa.j, a2.C());
        oCa_1.J(zOa.T, GraphicsEnvironment.isHeadless() ? wta.b : fqa.N);
        b2.J(PRa.la, a2.a());
    }

    public void J(RIa object) {
        OCa_1 b2 = object;
        object = this;
    }

    public boolean l() {
        return vRa.d != 0;
    }

    @Override
    public Gg J() {
        OCa_1 a2;
        return a2.G[uSa.E];
    }

    public Tf J(int n2) {
        int b2 = n2;
        OCa_1 a2 = this;
        if (b2 == pua.o) {
            return a2.G[vRa.d];
        }
        if (b2 == vRa.d) {
            return a2.G[uqa.g];
        }
        return a2.G[uSa.E];
    }

    public void i(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.p = b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public <V> ListenableFuture<V> J(Callable<V> callable) {
        void a2;
        OCa_1 oCa_1 = this;
        Validate.notNull(a2);
        if (!oCa_1.J() && !oCa_1.I()) {
            Runnable b2 = ListenableFutureTask.create(a2);
            Queue<FutureTask<?>> queue = oCa_1.e;
            synchronized (queue) {
                oCa_1.e.add((FutureTask<?>)b2);
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

    @Override
    public ListenableFuture<Object> J(Runnable runnable) {
        Runnable b2 = runnable;
        OCa_1 a2 = this;
        Runnable runnable2 = b2;
        Validate.notNull(runnable2);
        return a2.J(Executors.callable(runnable2));
    }

    public void f(int n2) {
        int b2 = n2;
        OCa_1 a2 = this;
        a2.N = b2;
    }

    public String[] J() {
        OCa_1 a2;
        return a2.m.l();
    }

    public abstract boolean K();

    public void J(int n2) {
        int b2 = n2;
        OCa_1 a2 = this;
        a2.a = b2;
    }

    public boolean c() {
        OCa_1 a2;
        return a2.R;
    }

    @Override
    public String J() {
        return dqa.a;
    }

    public boolean J(Gg gg2, XF xF, Sx sx2) {
        Object d2 = sx2;
        OCa_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public vL J(UUID uUID) {
        int n2;
        OCa_1 oCa_1 = this;
        Tf[] tfArray = oCa_1.G;
        int n3 = oCa_1.G.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void a2;
            OCa_1 b2 = tfArray[n2];
            if (b2 != null && (b2 = b2.J((UUID)a2)) != null) {
                return b2;
            }
            n4 = ++n2;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private void J(kCa kCa2) {
        Object object = this;
        Object b22 = ((OCa_1)object).J(fTa.fa);
        if (((File)b22).isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                void a2;
                b22 = ImageIO.read((File)b22);
                Validate.validState((((BufferedImage)b22).getWidth() == ysa.s ? vRa.d : uSa.E) != 0, POa.p, new Object[uSa.E]);
                Validate.validState((((BufferedImage)b22).getHeight() == ysa.s ? vRa.d : uSa.E) != 0, PRa.V, new Object[uSa.E]);
                ImageIO.write((RenderedImage)b22, JTa.k, new ByteBufOutputStream(byteBuf));
                ByteBuf byteBuf2 = Base64.encode(byteBuf);
                a2.J(Jsa.Ia + byteBuf2.toString(Charsets.UTF_8));
                return;
            }
            catch (Exception b22) {
                Y.error(BPa.o, (Throwable)b22);
                return;
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public kCa J() {
        OCa_1 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void M(boolean bl) {
        OCa_1 oCa_1 = this;
        if (!oCa_1.D) {
            int n2;
            Tf[] tfArray = oCa_1.G;
            int n3 = oCa_1.G.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                OCa_1 b22 = tfArray[n2];
                if (b22 != null) {
                    void a2;
                    if (a2 == false) {
                        Y.info(new StringBuilder().insert(5 >> 3, wua.Q).append(b22.J().f()).append(dua.f).append(((Tf)b22).F.J()).toString());
                    }
                    try {
                        b22.J(vRa.d != 0, null);
                    }
                    catch (oZ b22) {
                        Y.warn(b22.getMessage());
                    }
                }
                n4 = ++n2;
            }
        }
    }

    @Override
    public Lz J() {
        return new Lz(aSa.V, aSa.V, aSa.V);
    }

    public static /* synthetic */ Logger J() {
        return Y;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> J(u u2, String string, XF xF) {
        int c22;
        Object d2 = string;
        OCa_1 b2 = this;
        ArrayList<String> arrayList = Lists.newArrayList();
        if (((String)d2).startsWith(WSa.f)) {
            void a2;
            void c22;
            int n2 = !((String)(d2 = ((String)d2).substring(vRa.d))).contains(Tpa.E) ? vRa.d : uSa.E;
            List list = b2.z.J((u)c22, (String)d2, (XF)a2);
            if (list != null) {
                for (String string2 : list) {
                    if (n2 != 0) {
                        arrayList.add(WSa.f + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] stringArray = ((String)d2).split(Tpa.E, pua.o);
        String string3 = stringArray[stringArray.length - vRa.d];
        String[] stringArray2 = b2.m.l();
        int n3 = stringArray2.length;
        int n4 = c22 = uSa.E;
        while (n4 < n3) {
            d2 = stringArray2[c22];
            if (Mha.doesStringStartWith((String)string3, (String)d2)) {
                arrayList.add((String)d2);
            }
            n4 = ++c22;
        }
        return arrayList;
    }

    public void e(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, XB xB2) {
        Object c2 = xB2;
        OCa_1 a2 = this;
        if (((File)(c2 = new File(c2.J(), Lqa.y))).isFile()) {
            void b2;
            a2.J(opa.fa + (String)b2 + WSa.f + ((File)c2).getName(), Mqa.y);
        }
    }

    public abstract boolean B();

    public String D() {
        OCa_1 a2;
        return a2.u;
    }

    public abstract sZ J();

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2, long l2, Fy fy2, String string3) {
        mZ mZ2;
        XB e2;
        OCa_1 d2;
        String f2 = string2;
        OCa_1 oCa_1 = d2 = this;
        oCa_1.l((String)e2);
        oCa_1.M(LRa.U);
        oCa_1.G = new Tf[yRa.d];
        d2.U = new long[d2.G.length][ySa.T];
        OCa_1 oCa_12 = d2;
        e2 = oCa_12.Q.J((String)e2, vRa.d != 0);
        oCa_12.J(oCa_12.A(), e2);
        vU vU2 = e2.J();
        if (vU2 == null) {
            if (d2.d()) {
                mZ2 = IY.A;
            } else {
                void a2;
                void b2;
                void c2;
                mZ2 = new mZ((long)c2, d2.J(), d2.K(), d2.B(), (Fy)b2);
                mZ2.J((String)a2);
                if (d2.l) {
                    mZ2.J();
                }
            }
            vU2 = new vU(mZ2, f2);
        } else {
            vU2.J(f2);
            mZ2 = new mZ(vU2);
        }
        int n2 = f2 = uSa.E;
        while (n2 < d2.G.length) {
            OCa_1 oCa_13;
            int b2 = uSa.E;
            if (f2 == vRa.d) {
                b2 = pua.o;
            }
            if (f2 == uqa.g) {
                b2 = vRa.d;
            }
            if (f2 == 0) {
                OCa_1 oCa_14;
                OCa_1 oCa_15 = d2;
                if (d2.d()) {
                    oCa_15.G[f2] = (Tf)new IY((OCa)d2, e2, vU2, b2, d2.K).J();
                    oCa_14 = d2;
                } else {
                    oCa_15.G[f2] = (Tf)new Tf((OCa)d2, e2, vU2, b2, d2.K).J();
                    oCa_14 = d2;
                }
                oCa_14.G[f2].J(mZ2);
                oCa_13 = d2;
            } else {
                OCa_1 oCa_16 = d2;
                d2.G[f2] = (Tf)new Yy((OCa)oCa_16, e2, b2, oCa_16.G[uSa.E], d2.K).J();
                oCa_13 = d2;
            }
            OCa_1 oCa_17 = d2;
            oCa_13.G[f2].f((Vb)new wy((OCa)oCa_17, oCa_17.G[f2]));
            if (!d2.E()) {
                d2.G[f2].J().J(d2.J());
            }
            n2 = ++f2;
        }
        OCa_1 oCa_18 = d2;
        OCa_1 oCa_19 = d2;
        oCa_18.m.J(oCa_19.G);
        oCa_19.J(oCa_18.J());
        oCa_18.i();
    }

    public void e(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.V = b2;
    }

    public File J(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        return new File(a2.J(), b2);
    }

    static {
        b = new File(VPa.X);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2) {
        void b2;
        OCa_1 a2;
        int c2 = n2;
        OCa_1 oCa_1 = a2 = this;
        oCa_1.Aa = b2;
        oCa_1.j = c2;
        Y.info(new StringBuilder().insert(3 & 4, (String)b2).append(Xpa.E).append(c2).append(Wqa.fa).toString());
    }

    @Override
    public XF J() {
        return XF.ORIGIN;
    }

    public MinecraftSessionService J() {
        OCa_1 a2;
        return a2.H;
    }

    @Override
    public ld J() {
        OCa_1 a2;
        return new CY(a2.J());
    }

    public String A() {
        OCa_1 a2;
        return a2.g;
    }

    public String i() {
        OCa_1 a2;
        return a2.E;
    }

    public void d(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.O = b2;
    }

    public void G() {
        a.s = nqa.i;
    }

    public void d(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        Y.warn(b2);
    }

    @Override
    public boolean f() {
        return OCa_1.J().G[uSa.E].J().f(Ura.Q);
    }

    public boolean L() {
        OCa_1 a2;
        return a2.X;
    }

    /*
     * WARNING - void declaration
     */
    public OCa_1(File file, Proxy proxy, File file2) {
        void a2;
        void c2;
        OCa_1 b2;
        Proxy d2 = proxy;
        OCa_1 oCa_1 = b2 = this;
        OCa_1 oCa_12 = b2;
        b2.f = new GCa(Zta.Fa, (jd)b2, OCa_1.J());
        oCa_12.B = Lists.newArrayList();
        b2.K = new gda();
        b2.J = new kCa();
        b2.L = new Random();
        b2.q = pua.o;
        b2.X = vRa.d;
        b2.a = uSa.E;
        b2.P = new long[ySa.T];
        b2.u = Mqa.y;
        b2.F = Mqa.y;
        b2.s = nqa.i;
        b2.e = Queues.newArrayDeque();
        b2.t = OCa_1.J();
        b2.T = d2;
        v = b2;
        b2.r = c2;
        oCa_1.n = new NBa((OCa)b2);
        b2.o = new TY((OCa)b2, (File)a2);
        oCa_1.z = oCa_1.J();
        oCa_1.Q = new QZ((File)c2);
        oCa_1.C = new YggdrasilAuthenticationService(d2, UUID.randomUUID().toString());
        oCa_1.H = oCa_1.C.createMinecraftSessionService();
        oCa_1.x = oCa_1.C.createProfileRepository();
    }

    public boolean b() {
        return vRa.d != 0;
    }

    public abstract boolean a();

    public void D() {
        OCa_1 a2;
        OCa_1 oCa_1 = a2;
        oCa_1.Aa = null;
        oCa_1.j = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(sZ sZ2) {
        int n2;
        OCa_1 oCa_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < oCa_1.G.length) {
            OCa_1 b2 = oCa_1.G[n2];
            if (b2 != null) {
                void a2;
                if (b2.J().d()) {
                    OCa_1 oCa_12 = b2;
                    oCa_12.J().J(sZ.HARD);
                    oCa_12.J(vRa.d != 0, vRa.d != 0);
                } else if (oCa_1.E()) {
                    OCa_1 oCa_13 = b2;
                    oCa_13.J().J((sZ)a2);
                    oCa_13.J((oCa_13.J() != sZ.PEACEFUL ? vRa.d : uSa.E) != 0, vRa.d != 0);
                } else {
                    b2.J().J((sZ)a2);
                    b2.J(oCa_1.b(), oCa_1.y);
                }
            }
            n3 = ++n2;
        }
    }

    public synchronized String M() {
        OCa_1 a2;
        return a2.h;
    }

    public int e() {
        return YSa.Ma;
    }

    /*
     * WARNING - void declaration
     */
    public OCa_1(Proxy proxy, File file) {
        void a2;
        OCa_1 b2;
        Proxy c2 = proxy;
        OCa_1 oCa_1 = b2 = this;
        OCa_1 oCa_12 = b2;
        OCa_1 oCa_13 = b2;
        OCa_1 oCa_14 = b2;
        b2.f = new GCa(Zta.Fa, (jd)b2, OCa_1.J());
        oCa_14.B = Lists.newArrayList();
        b2.K = new gda();
        b2.J = new kCa();
        b2.L = new Random();
        b2.q = pua.o;
        b2.X = vRa.d;
        b2.a = uSa.E;
        b2.P = new long[ySa.T];
        b2.u = Mqa.y;
        b2.F = Mqa.y;
        b2.s = nqa.i;
        b2.e = Queues.newArrayDeque();
        b2.t = OCa_1.J();
        b2.T = c2;
        v = b2;
        oCa_13.r = null;
        oCa_13.n = null;
        oCa_13.o = new TY((OCa)b2, (File)a2);
        oCa_12.z = null;
        oCa_1.Q = null;
        oCa_12.C = new YggdrasilAuthenticationService(c2, UUID.randomUUID().toString());
        oCa_1.H = oCa_1.C.createMinecraftSessionService();
        oCa_1.x = oCa_1.C.createProfileRepository();
    }

    public RIa J(RIa rIa2) {
        OCa_1 b2 = rIa2;
        OCa_1 a2 = this;
        b2.J().J(Lsa.h, (Callable)new mCa((OCa)a2));
        if (a2.m != null) {
            b2.J().J(aSa.x, (Callable)new jda((OCa)a2));
        }
        return b2;
    }

    public int d() {
        return hra.Ja;
    }

    public boolean H() {
        return vRa.d != 0;
    }

    public void A() {
        OCa_1 oCa_1 = this;
        if (!oCa_1.D) {
            Y.info(WQa.f);
            if (oCa_1.J() != null) {
                oCa_1.J().J();
            }
            if (oCa_1.m != null) {
                Y.info(rQa.ja);
                OCa_1 oCa_12 = oCa_1;
                oCa_12.m.f();
                oCa_12.m.C();
            }
            if (oCa_1.G != null) {
                int a2;
                Y.info(CRa.c);
                oCa_1.M(uSa.E != 0);
                int n2 = a2 = uSa.E;
                while (n2 < oCa_1.G.length) {
                    oCa_1.G[a2++].b();
                    n2 = a2;
                }
            }
            if (oCa_1.f.J()) {
                oCa_1.f.J();
            }
            Kpa.J().L = null;
            System.gc();
        }
    }

    public abstract Daa J();

    public boolean g() {
        OCa_1 a2;
        return a2.V;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Daa daa) {
        int b2;
        OCa_1 oCa_1 = this;
        int n2 = b2 = uSa.E;
        while (n2 < oCa_1.G.length) {
            void a2;
            Tf tf = OCa_1.J().G[b2];
            tf.J().J((Daa)a2);
            n2 = ++b2;
        }
    }

    public String e() {
        OCa_1 a2;
        return a2.d;
    }

    public boolean I() {
        OCa_1 a2;
        return a2.k;
    }

    public void C(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        a2.E = b2;
    }

    public void i() {
        int n2;
        OCa_1 oCa_1 = this;
        int n3 = uSa.E;
        OCa_1 oCa_12 = oCa_1;
        oCa_12.M(AQa.ga);
        int a22 = uSa.E;
        Y.info(new StringBuilder().insert(3 & 4, Jta.Ha).append(a22).toString());
        Tf a22 = oCa_12.G[a22];
        XF xF = a22.J();
        long l2 = OCa_1.J();
        int n4 = n2 = fta.Ka;
        while (n4 <= ppa.f && oCa_1.L()) {
            int n5 = fta.Ka;
            while (n5 <= ppa.f && oCa_1.L()) {
                int n6;
                long l3 = OCa_1.J();
                if (l3 - l2 > asa.fa) {
                    oCa_1.J(ypa.m, n3 * ySa.T / SRa.S);
                    l2 = l3;
                }
                ++n3;
                int n7 = xF.getZ() + n6;
                a22.f.l(xF.getX() + n2 >> AQa.P, n7 >> AQa.P);
                n5 = n6 += 16;
            }
            n4 = n2 += 16;
        }
        oCa_1.D();
    }

    public Nb J() {
        OCa_1 a2;
        return a2.z;
    }

    public String d() {
        OCa_1 a2;
        return a2.F;
    }

    public abstract boolean j();

    public abstract String J(Daa var1, boolean var2);

    public boolean F() {
        OCa_1 a2;
        return a2.p;
    }

    public String C() {
        return WQa.h;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.l = b2;
    }

    public saa J() {
        return new saa();
    }

    public void M() {
        int a2;
        OCa_1 oCa_1 = this;
        oCa_1.D = vRa.d;
        oCa_1.J().J();
        int n2 = a2 = uSa.E;
        while (n2 < oCa_1.G.length) {
            Tf tf = oCa_1.G[a2];
            if (tf != null) {
                tf.b();
            }
            n2 = ++a2;
        }
        oCa_1.J().J(oCa_1.G[uSa.E].J().J());
        oCa_1.C();
    }

    public boolean k() {
        OCa_1 a2;
        if (a2.r != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Cba J(OCa a2) {
        return a2.m;
    }

    public static OCa J() {
        return v;
    }

    public int C() {
        OCa_1 a2;
        return a2.a;
    }

    public void l(String string) {
        String b2 = string;
        Object a2 = this;
        if (((OCa_1)a2).J().f(b2)) {
            Y.info(iSa.Q);
            OCa_1 oCa_1 = a2;
            oCa_1.M(FPa.Q);
            oCa_1.J().J(b2, (gc)new Rca((OCa)a2));
        }
    }

    public void e() {
        OCa_1 a2;
        a2.M = new Thread(a2, ROa.a);
        a2.M.start();
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.w = b2;
    }

    public GCa J() {
        OCa_1 a2;
        return a2.f;
    }

    public GameProfile[] J() {
        OCa_1 a2;
        return a2.m.J();
    }

    public void f(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        a2.g = b2;
    }

    public File J() {
        return new File(VQa.ja);
    }

    public String l() {
        OCa_1 a2;
        return a2.I;
    }

    public void d() {
    }

    public boolean G() {
        OCa_1 a2;
        return a2.w;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.W = b2;
    }

    public abstract boolean D();

    public boolean A() {
        OCa_1 a2;
        return a2.O;
    }

    public abstract boolean i() throws IOException;

    public abstract boolean M();

    public void C() {
        a.X = uSa.E;
    }

    public String f() {
        return nua.D;
    }

    public void l() {
        OCa_1 a2;
        v = a2;
    }

    public boolean e() {
        OCa_1 a2;
        return a2.i;
    }

    public void f() {
        a.A = vRa.d;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        OCa_1 a2 = this;
        a2.y = b2;
    }

    public boolean d() {
        OCa_1 a2;
        return a2.W;
    }

    public int l() {
        OCa_1 a2;
        return a2.m.C();
    }

    public abstract int f();

    public Proxy J() {
        OCa_1 a2;
        return a2.T;
    }

    @Override
    public void J(ld ld2) {
        OCa_1 b2 = ld2;
        OCa_1 a2 = this;
        Y.info(b2.f());
    }

    @Override
    public boolean J() {
        OCa_1 a2;
        if (Thread.currentThread() == a2.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        OCa_1 a2;
        return a2.Z;
    }

    public abstract boolean C();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        OCa_1 oCa_1;
        block31: {
            oCa_1 = this;
            if (!oCa_1.i()) {
                oCa_1.J((RIa)null);
                break block31;
            }
            OCa_1 oCa_12 = oCa_1;
            OCa_1 oCa_13 = oCa_12;
            oCa_12.t = OCa_1.J();
            long l2 = nqa.i;
            oCa_12.J.J((ld)new CY(oCa_1.E));
            oCa_12.J.J(new HAa(nua.D, uOa.F));
            oCa_12.J(oCa_12.J);
            while (oCa_13.X) {
                long l3 = OCa_1.J();
                long l4 = l3 - oCa_1.t;
                if (l4 > dQa.c && oCa_1.t - oCa_1.S >= fpa.g) {
                    Object[] objectArray = new Object[uqa.g];
                    objectArray[uSa.E] = l4;
                    objectArray[vRa.d] = l4 / cra.f;
                    Y.warn(XOa.X, objectArray);
                    l4 = dQa.c;
                    oCa_1.S = oCa_1.t;
                }
                if (l4 < nqa.i) {
                    Y.warn(csa.Z);
                    l4 = nqa.i;
                }
                l2 += l4;
                oCa_1.t = l3;
                if (oCa_1.G[uSa.E].i()) {
                    oCa_1.k();
                    l2 = nqa.i;
                } else {
                    long l5 = l2;
                    while (l5 > cra.f) {
                        l5 = l2 - cra.f;
                        oCa_1.k();
                    }
                }
                Thread.sleep(Math.max(dQa.Ga, cra.f - l2));
                oCa_13 = oCa_1;
                oCa_1.i = vRa.d;
            }
        }
        try {
            oCa_1.k = vRa.d;
            oCa_1.A();
            return;
        }
        catch (Throwable throwable) {
            Y.error(Vua.t, throwable);
            return;
        }
        finally {
            oCa_1.d();
        }
        catch (Throwable throwable) {
            try {
                OCa_1 oCa_14;
                Y.error(Ssa.N, throwable);
                RIa rIa2 = null;
                OCa_1 oCa_15 = oCa_1;
                rIa2 = throwable instanceof MZ ? oCa_15.J(((MZ)throwable).getCrashReport()) : oCa_15.J(new RIa(ATa.p, throwable));
                File file = new File(new File(oCa_1.J(), QSa.M), new StringBuilder().insert(3 ^ 3, Jqa.L).append(new SimpleDateFormat(fpa.P).format(new Date())).append(aQa.k).toString());
                if (rIa2.J(file)) {
                    Y.error(new StringBuilder().insert(5 >> 3, Ysa.Ka).append(file.getAbsolutePath()).toString());
                    oCa_14 = oCa_1;
                } else {
                    Y.error(Ysa.ja);
                    oCa_14 = oCa_1;
                }
                oCa_14.J(rIa2);
            }
            catch (Throwable throwable2) {
                Throwable throwable3;
                try {
                    oCa_1.k = vRa.d;
                    oCa_1.A();
                    throwable3 = throwable2;
                    oCa_1.d();
                    throw throwable3;
                }
                catch (Throwable a2) {
                    Y.error(Vua.t, a2);
                    throwable3 = throwable2;
                    throw throwable3;
                }
                finally {
                    oCa_1.d();
                }
            }
            try {
                oCa_1.k = vRa.d;
                oCa_1.A();
                return;
            }
            catch (Throwable throwable4) {
                Y.error(Vua.t, throwable4);
                return;
            }
            finally {
                oCa_1.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J() {
        int n2;
        OCa_1 oCa_1;
        OCa_1 oCa_12 = oCa_1 = this;
        oCa_12.K.J(hQa.W);
        Queue<FutureTask<?>> queue = oCa_12.e;
        synchronized (queue) {
            OCa_1 oCa_13 = oCa_1;
            while (!oCa_13.e.isEmpty()) {
                maa.J(oCa_1.e.poll(), Y);
                oCa_13 = oCa_1;
            }
        }
        oCa_1.K.f(Yqa.E);
        int n3 = n2 = uSa.E;
        while (n3 < oCa_1.G.length) {
            long l2 = System.nanoTime();
            if (n2 == 0 || oCa_1.H()) {
                OCa_1 oCa_14 = oCa_1;
                OCa_1 a2 = oCa_14.G[n2];
                oCa_14.K.J(a2.J().f());
                if (oCa_14.Z % kTa.j == 0) {
                    OCa_1 oCa_15 = oCa_1;
                    oCa_15.K.J(ITa.Aa);
                    oCa_15.m.J((KC)new Mba(a2.l(), a2.f(), a2.J().f(PTa.Ka)), ((Tf)a2).F.J());
                    oCa_15.K.f();
                }
                oCa_1.K.J(ERa.la);
                try {
                    a2.e();
                }
                catch (Throwable throwable) {
                    RIa rIa2 = RIa.J((Throwable)throwable, (String)Gta.D);
                    a2.J(rIa2);
                    throw new MZ(rIa2);
                }
                try {
                    a2.M();
                }
                catch (Throwable throwable) {
                    RIa rIa3 = RIa.J((Throwable)throwable, (String)rpa.M);
                    a2.J(rIa3);
                    throw new MZ(rIa3);
                }
                oCa_1.K.f();
                OCa_1 oCa_16 = oCa_1;
                oCa_16.K.J(ISa.M);
                a2.J().J();
                oCa_16.K.f();
                oCa_16.K.f();
            }
            long[] lArray = oCa_1.U[n2];
            lArray[oCa_1.Z % ySa.T] = System.nanoTime() - l2;
            n3 = ++n2;
        }
        OCa_1 oCa_17 = oCa_1;
        oCa_17.K.f(isa.v);
        oCa_17.J().f();
        oCa_17.K.f(TQa.Ka);
        oCa_17.m.l();
        oCa_17.K.f(Era.a);
        int n4 = n2 = uSa.E;
        while (true) {
            if (n4 >= oCa_1.B.size()) {
                oCa_1.K.f();
                return;
            }
            oCa_1.B.get(n2++).J();
            n4 = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(GCa gCa) {
        void a2;
        OCa_1 oCa_1 = this;
        void v0 = a2;
        v0.f(NTa.E, (Object)(uSa.E != 0));
        v0.f(KTa.Y, (Object)uSa.E);
        if (oCa_1.m != null) {
            void v1 = a2;
            v1.f(Qra.A, (Object)oCa_1.M());
            v1.f(zua.G, (Object)oCa_1.l());
            v1.f(Yua.r, (Object)oCa_1.m.f().length);
        }
        void v2 = a2;
        v2.f(Sqa.y, (Object)oCa_1.w);
        v2.f(oqa.x, (Object)(oCa_1.o() ? Uta.p : Nta.q));
        void v3 = a2;
        v3.f(sOa.Ha, (Object)((OCa_1.J() - a2.J()) / RQa.N * asa.fa));
        OCa_1 oCa_12 = oCa_1;
        v3.f(Jpa.ga, (Object)((int)(Oz.J((long[])oCa_12.P) * Ira.K)));
        int b2 = uSa.E;
        if (oCa_12.G != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < oCa_1.G.length) {
                if (oCa_1.G[n2] != null) {
                    Tf tf = oCa_1.G[n2];
                    vU vU2 = tf.J();
                    void v6 = a2;
                    v6.f(uOa.k + b2 + EPa.I, (Object)tf.F.J());
                    a2.f(new StringBuilder().insert(3 ^ 3, uOa.k).append(b2).append(Zpa.q).toString(), (Object)vU2.J());
                    v6.f(new StringBuilder().insert(3 & 4, uOa.k).append(b2).append(bua.m).toString(), (Object)tf.J());
                    v6.f(new StringBuilder().insert(3 >> 2, uOa.k).append(b2).append(ITa.ca).toString(), (Object)vU2.d());
                    v6.f(new StringBuilder().insert(3 & 4, uOa.k).append(b2).append(Gua.h).toString(), (Object)vU2.J().J());
                    v6.f(new StringBuilder().insert(3 ^ 3, uOa.k).append(b2).append(IPa.Aa).toString(), (Object)vU2.J().J());
                    v6.f(new StringBuilder().insert(3 & 4, uOa.k).append(b2).append(Lra.s).toString(), (Object)oCa_1.N);
                    String string = new StringBuilder().insert(3 & 4, uOa.k).append(b2).append(dsa.W).toString();
                    ++b2;
                    v6.f(string, (Object)tf.f().J());
                }
                n3 = ++n2;
            }
        }
        a2.f(bqa.Fa, (Object)b2);
    }

    public void J(Cba cba) {
        Cba b2 = cba;
        OCa_1 a2 = this;
        a2.m = b2;
    }

    public void J(String string) {
        String b2 = string;
        OCa_1 a2 = this;
        a2.d = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void b2;
        OCa_1 a2;
        String c2 = string2;
        OCa_1 oCa_1 = a2 = this;
        oCa_1.u = b2;
        oCa_1.F = c2;
    }
}

