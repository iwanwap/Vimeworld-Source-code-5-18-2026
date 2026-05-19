/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Ata
 *  Bpa
 *  CR
 *  CY
 *  Cg
 *  DQa
 *  Dga
 *  EQa
 *  ERa
 *  Eoa
 *  FEa
 *  FLa
 *  FPa
 *  Fpa
 *  Gg
 *  Gl
 *  Gua
 *  HA
 *  Hda
 *  I
 *  IJa
 *  ISa
 *  JPa
 *  Jy
 *  Kpa
 *  LQa
 *  Lra
 *  Lz
 *  MQa
 *  MZ
 *  Mda
 *  NOa
 *  NQa
 *  NTa
 *  Nua
 *  Oz
 *  Ppa
 *  Pqa
 *  QFa
 *  QS
 *  QSa
 *  Qha
 *  Qqa
 *  Qsa
 *  Qta
 *  RIa
 *  RPa
 *  RQa
 *  SMa
 *  SQa
 *  Se
 *  TPa
 *  Tpa
 *  U
 *  UD
 *  UZ
 *  VJa
 *  VS
 *  Vla
 *  WQa
 *  WSa
 *  WTa
 *  XE
 *  XSa
 *  XTa
 *  Xja
 *  YSa
 *  Ypa
 *  Yra
 *  Ysa
 *  ZJa
 *  ZOa
 *  ZRa
 *  Zua
 *  aKa
 *  aLa
 *  aPa
 *  aSa
 *  aqa
 *  asa
 *  bRa
 *  bpa
 *  cQa
 *  cRa
 *  cra
 *  dMa
 *  dQa
 *  dpa
 *  eb
 *  ela
 *  ez
 *  fEa
 *  fsa
 *  fua
 *  hTa
 *  hqa
 *  hra
 *  isa
 *  j
 *  jRa
 *  jsa
 *  jt
 *  kGa
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lPa
 *  ld
 *  lqa
 *  mka
 *  nBa
 *  nLa
 *  nka
 *  oqa
 *  pIa
 *  pKa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  sMa
 *  tA
 *  tna
 *  uKa
 *  uRa
 *  ura
 *  uw
 *  vL
 *  vO
 *  vQa
 *  vRa
 *  vea
 *  wOa
 *  wY
 *  wra
 *  xJa
 *  xy
 *  yQa
 *  yra
 *  ysa
 *  zTa
 *  zfa
 *  zla
 *  zsa
 */
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FLa_1
implements j {
    private float ma;
    private float La;
    private float ka;
    private float da;
    private float Ba;
    private Qha[] aa;
    private Kpa ea;
    private float Ea;
    private final VJa Ca;
    public static boolean ia;
    private float Ma;
    private int ba;
    private boolean ha;
    public int Fa;
    private float Ia;
    private int la;
    private int ga;
    private float[] Da;
    private double ca;
    public float Ja;
    private float ja;
    private boolean Ha;
    private long Ga;
    private Qha fa;
    public boolean Ka;
    private float Aa;
    private int S;
    private Random Z;
    private Mda Y;
    private double r;
    private Gg V;
    private float[] z;
    private float X;
    private float y;
    private float U;
    private float P;
    private int u;
    private boolean O;
    public NKa t;
    private int R;
    private wY Q;
    private boolean N;
    public double T;
    public float p;
    private float n;
    private float s;
    private wY w;
    private long W;
    private boolean q;
    public static int x;
    private int v;
    public static final int o;
    private float h;
    private boolean K;
    private static final ResourceLocation[] H;
    private final dMa c;
    private final U B;
    private float d;
    private static final ResourceLocation a;
    public float b;
    private static final String l = "CL_00000947";
    private static final Logger e;
    private boolean G;
    private long D;
    private final int[] f;
    public float F;
    private float g;
    private final ResourceLocation L;
    public vL E;
    public float m;
    private int C;
    private boolean i;
    private double M;
    private FloatBuffer k;
    private static final ResourceLocation j;
    private float J;
    private long A;
    private float I;

    /*
     * WARNING - void declaration
     */
    private void f(float f2, int n2) {
        void b2;
        int c2 = n2;
        FLa_1 a2 = this;
        a2.J((float)b2, c2, vRa.d != 0, vRa.d != 0, uSa.E != 0);
    }

    public dMa J() {
        FLa_1 a2;
        return a2.c;
    }

    private void j() {
        FLa_1 fLa_1 = this;
        if (!fLa_1.O) {
            Cg.l();
            if (Config.f() == ysa.s && Config.M() == fPa.i) {
                Config.J(vRa.d != 0);
            }
            fLa_1.O = vRa.d;
        }
        Config.e();
        Eoa eoa = fLa_1.ea.Ta;
        if (eoa != null) {
            String string;
            if (Config.C() != null) {
                string = TPa.D.replace(TPa.D, Bra.g).replace(GPa.V, XSa.Z);
                Object a2 = new StringBuilder().insert(2 & 5, string).append(Tpa.E).append(Config.C()).toString();
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2;
                a2 = new CY(oha.J(Qra.P, objectArray));
                fLa_1.ea.Ya.J().J((ld)a2);
                Config.d(null);
            }
            if (Config.P()) {
                Config.J(uSa.E != 0);
                string = new CY(oha.J(kpa.a, new Object[uSa.E]));
                fLa_1.ea.Ya.J().J((ld)string);
            }
        }
        if (fLa_1.V != eoa) {
            FLa_1 fLa_12 = fLa_1;
            Se.J((Gg)fLa_1.V, (Gg)eoa);
            Config.l();
            fLa_12.A = nqa.i;
            fLa_12.u = uSa.E;
            fLa_12.V = eoa;
        }
        if (!fLa_1.J(pA.tA)) {
            pA.tA = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void A(float f2) {
        FLa_1 fLa_1;
        FLa_1 fLa_12 = fLa_1 = this;
        fLa_12.T = ZSa.Ha;
        Nua.J();
        FLa_1 b2 = fLa_12.ea.J();
        if (fLa_12.ea.Ta != null && b2 != null) {
            FLa_1 fLa_13;
            Lz lz2;
            Lz lz3;
            Lz lz4;
            double d2;
            void a2;
            double d3;
            FLa_1 fLa_14 = fLa_1;
            fLa_14.ea.U.J(WSa.R);
            fLa_14.ea.V = null;
            boolean bl = QS.J();
            double d4 = d3 = (double)fLa_14.ea.L.J();
            if (fLa_14.ea.L.M()) {
                d3 = lPa.K;
                d4 = lPa.K;
            }
            if (bl) {
                double d5;
                double d6 = Mouse.getX();
                double d7 = Mouse.getY();
                double d8 = oua.i - d6 / (double)fLa_1.ea.t * KPa.y;
                double d9 = d7 / (double)fLa_1.ea.k * KPa.y - oua.i;
                float f3 = QS.f();
                float f4 = QS.C();
                FLa_1 fLa_15 = b2;
                d2 = ((vL)fLa_15).c + (((vL)b2).la - ((vL)b2).c) * (double)a2;
                FLa_1 fLa_16 = b2;
                double d10 = ((vL)fLa_15).ba + (((vL)fLa_16).Z - ((vL)b2).ba) * (double)a2 + (double)b2.l();
                double d11 = ((vL)fLa_16).r + (((vL)b2).A - ((vL)b2).r) * (double)a2;
                double d12 = fLa_1.Aa;
                double d13 = uw.M ? (double)uw.k : (double)fLa_1.n;
                FLa_1 fLa_17 = fLa_1;
                d12 = (double)fLa_17.Aa + (d13 - (double)fLa_1.Aa) * (double)a2;
                d13 = (double)(-Oz.d((float)(f3 * Bua.ga)) * Oz.C((float)(f4 * Bua.ga))) * d12;
                double d14 = (double)(Oz.C((float)(f3 * Bua.ga)) * Oz.C((float)(f4 * Bua.ga))) * d12;
                d12 = (double)(-Oz.d((float)(f4 * Bua.ga))) * d12;
                Lz lz5 = new Lz(d2 - d13, d10 - d12, d11 - d14);
                Lz lz6 = new Lz(d2, d10, d11).d(lz5).J();
                Lz lz7 = new Lz(aSa.V, oua.i, aSa.V).C(lz6).J();
                Lz lz8 = lz6.C(lz7).J();
                FLa_1 fLa_18 = fLa_1;
                d10 = (double)fLa_17.ea.t / (double)fLa_18.ea.k;
                d11 = QS.l();
                d10 = d8 * d11 * d10;
                d11 = d9 * d11;
                Lz lz9 = lz5.f(lz7.A * d10, lz7.j * d10, lz7.J * d10).f(lz8.A * d11, lz8.j * d11, lz8.J * d11);
                d3 = Math.min(mSa.S, Math.max((double)fLa_1.Ea * FPa.T, PRa.Y));
                d10 = ypa.X;
                Lz lz10 = lz9;
                lz7 = lz10.f(lz6.A * d3 / KPa.y, lz6.j * d3 / KPa.y, lz6.J * d3 / KPa.y);
                Object object = lz10.f(-lz6.A * d3 / KPa.y, -lz6.j * d3 / KPa.y, -lz6.J * d3 / KPa.y);
                Lz lz11 = lz10.f(-lz6.A * Qta.h, -lz6.j * Qta.h, -lz6.J * Qta.h);
                RY rY2 = fLa_18.ea.Ta.J(lz11, lz7, uSa.E != 0, uSa.E != 0, vRa.d != 0);
                object = fLa_17.ea.Ta.J(lz9, object, uSa.E != 0, uSa.E != 0, vRa.d != 0);
                d11 = rY2 != null ? rY2.I.l(lz9) : QSa.x;
                double d15 = object != null ? object.I.l(lz9) : QSa.x;
                fLa_1.ea.Oa = rY2;
                lz4 = lz6;
                lz3 = lz7;
                if (d11 == QSa.x) {
                    double d16 = d3;
                    d5 = d16 * d16;
                } else {
                    d5 = d11;
                }
                d4 = d5;
                d3 = d10;
                lz2 = lz9;
                fLa_13 = fLa_1;
            } else {
                FLa_1 fLa_19;
                FLa_1 fLa_110 = b2;
                fLa_1.ea.Oa = fLa_110.J(d3, (float)a2);
                lz2 = fLa_110.f((float)a2);
                if (fLa_1.ea.Oa != null) {
                    fLa_19 = b2;
                    d4 = fLa_1.ea.Oa.I.l(lz2);
                } else {
                    double d17 = d4;
                    d4 = d17 * d17;
                    fLa_19 = b2;
                }
                lz4 = fLa_19.J((float)a2);
                lz3 = lz2.f(lz4.A * d3, lz4.j * d3, lz4.J * d3);
                fLa_13 = fLa_1;
            }
            fLa_13.E = null;
            Lz lz12 = null;
            double d18 = d4;
            float f5 = pqa.r;
            FLa_1 fLa_111 = b2;
            List list = fLa_1.ea.Ta.J((vL)fLa_111, fLa_111.J().l(lz4.A * d3, lz4.j * d3, lz4.J * d3).f((double)f5, (double)f5, (double)f5), Predicates.and(Kaa.A, IKa.J()));
            for (vL vL2 : list) {
                float f6 = vL2.C();
                xy xy2 = vL2.J().f((double)f6, (double)f6, (double)f6);
                RY rY3 = xy2.J(lz2, lz3);
                if (xy2.J(lz2)) {
                    if (!(d18 >= aSa.V)) continue;
                    fLa_1.E = vL2;
                    lz12 = rY3 == null ? lz2 : rY3.I;
                    d18 = aSa.V;
                    continue;
                }
                if (rY3 == null || !((d2 = lz2.l(rY3.I)) < d18) && d18 != aSa.V) continue;
                if (vL2 == ((vL)b2).ja) {
                    if (d18 != aSa.V) continue;
                    fLa_1.E = vL2;
                    lz12 = rY3.I;
                    continue;
                }
                fLa_1.E = vL2;
                lz12 = rY3.I;
                d18 = d2;
            }
            if (!QS.J() && !fLa_1.ea.L.A() && fLa_1.E != null) {
                double d19;
                double d20 = fLa_1.T = lz2.l(lz12);
                if (d19 > KSa.F) {
                    FLa_1 fLa_112 = fLa_1;
                    fLa_112.ea.Oa = new RY(AY.MISS, lz12, null, new XF(lz12));
                    fLa_112.E = null;
                }
            }
            if (fLa_1.E != null && (d18 < d4 || fLa_1.ea.Oa == null)) {
                fLa_1.ea.Oa = new RY(fLa_1.E, lz12);
                if (fLa_1.E instanceof Gl || fLa_1.E instanceof FEa) {
                    fLa_1.ea.V = fLa_1.E;
                }
            }
            fLa_1.ea.U.f();
        }
        Nua.f();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        float f3;
        void a22;
        FLa_1 fLa_1 = this;
        vL vL2 = fLa_1.ea.J();
        fLa_1.Ka = uSa.E;
        if (vL2 instanceof Sx) {
            ((Sx)vL2).h.f();
        }
        FLa_1 fLa_12 = fLa_1;
        FLa_1 fLa_13 = fLa_1;
        GL11.glFog(isa.m, fLa_13.J(fLa_12.m, fLa_12.F, fLa_13.b, pqa.r));
        GL11.glNormal3f(JPa.N, vqa.T, JPa.N);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        Block a22 = aLa.J((Gg)fLa_1.ea.Ta, (vL)vL2, (float)a22);
        float c2 = vqa.T;
        if (f3 >= JPa.N) {
            uKa.l((float)c2);
        } else if (vL2 instanceof Gl && ((Gl)vL2).J(Hda.a)) {
            void v3;
            c2 = eua.C;
            int n3 = ((Gl)vL2).J(Hda.a).l();
            if (n3 < kTa.j) {
                c2 = eua.C + (fLa_1.ja - eua.C) * (pqa.r - (float)n3 / eta.e);
            }
            if (Config.h()) {
                pA.M(rSa.z);
                v3 = b2;
            } else {
                uKa.J((int)rSa.z);
                v3 = b2;
            }
            if (v3 == pua.o) {
                uKa.f((float)JPa.N);
                uKa.J((float)(c2 * xSa.la));
            } else {
                uKa.f((float)(c2 * rta.o));
                uKa.J((float)c2);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance && Config.V()) {
                GL11.glFogi(CRa.Z, Bra.O);
            }
        } else if (fLa_1.K) {
            if (Config.h()) {
                pA.M(QSa.ba);
            } else {
                uKa.J((int)QSa.ba);
            }
            uKa.l((float)Nra.e);
        } else if (a22.J() == Material.water) {
            vL vL3;
            if (Config.h()) {
                pA.M(QSa.ba);
                vL3 = vL2;
            } else {
                uKa.J((int)QSa.ba);
                vL3 = vL2;
            }
            if (vL3 instanceof Gl && ((Gl)vL2).J(Hda.E)) {
                uKa.l((float)Jpa.B);
            } else {
                uKa.l((float)(Nra.e - (float)kGa.f((vL)vL2) * kTa.J));
            }
            if (Config.Da()) {
                uKa.l((float)WRa.e);
            }
        } else if (a22.J() == Material.lava) {
            if (Config.h()) {
                pA.M(QSa.ba);
            } else {
                uKa.J((int)QSa.ba);
            }
            uKa.l((float)kta.v);
        } else {
            void v5;
            c2 = fLa_1.ja;
            if (uw.R != null) {
                c2 = uw.R.floatValue();
            }
            fLa_1.Ka = vRa.d;
            if (Config.h()) {
                pA.M(rSa.z);
                v5 = b2;
            } else {
                uKa.J((int)rSa.z);
                v5 = b2;
            }
            if (v5 == pua.o) {
                uKa.f((float)JPa.N);
                uKa.J((float)c2);
            } else {
                float f4 = c2 * Config.J();
                if (uw.h != null) {
                    f4 = Math.min(c2, uw.h.floatValue());
                }
                uKa.f((float)f4);
                uKa.J((float)c2);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                if (Config.V()) {
                    GL11.glFogi(CRa.Z, Bra.O);
                }
                if (Config.O()) {
                    GL11.glFogi(CRa.Z, Nta.K);
                }
            }
            if (fLa_1.ea.Ta.F.J((int)vL2.la, (int)vL2.A)) {
                uKa.f((float)(c2 * Yqa.C));
                uKa.J((float)c2);
            }
        }
        uKa.a();
        uKa.d();
        uKa.J((int)Yua.O, (int)RPa.Ma);
    }

    public void F() {
        FLa_1 fLa_1 = this;
        FLa_1 a2 = new sMa(fLa_1.ea);
        uKa.A((int)hra.Ja);
        uKa.G((int)WPa.s);
        uKa.y();
        uKa.J((double)aSa.V, (double)a2.f(), (double)a2.J(), (double)aSa.V, (double)Tpa.M, (double)Wqa.Ea);
        uKa.G((int)SQa.ca);
        uKa.y();
        uKa.J((float)JPa.N, (float)JPa.N, (float)dQa.o);
    }

    /*
     * Unable to fully structure code
     */
    public void f(float var1_3, long var2_4) {
        block21: {
            block20: {
                block19: {
                    block18: {
                        var8_5 = this;
                        var8_5.j();
                        var4_6 = Display.isActive();
                        if (var4_6 != 0 || !var8_5.ea.z.i || var8_5.ea.z.tb && Mouse.isButtonDown(vRa.d)) break block18;
                        if (Kpa.J() - var8_5.D <= zsa.R) break block19;
                        v0 = var8_5;
                        v1 = v0;
                        v0.ea.A();
                        break block20;
                    }
                    var8_5.D = Kpa.J();
                }
                v1 = var8_5;
            }
            v1.ea.U.J(yta.M);
            if (var4_6 != 0 && Kpa.ca && var8_5.ea.Ra && !Mouse.isInsideWindow()) {
                Mouse.setGrabbed((boolean)uSa.E);
                Mouse.setCursorPosition(Display.getWidth() / uqa.g, Display.getHeight() / uqa.g);
                Mouse.setGrabbed((boolean)vRa.d);
            }
            if (!var8_5.ea.Ra || var4_6 == 0) ** GOTO lbl52
            v2 = var8_5;
            v2.ea.ea.J();
            var5_8 = v2.ea.z.MC * Ora.D + psa.N;
            var6_10 = var5_8 * var5_8 * var5_8 * Qsa.k;
            var7_12 = (float)v2.ea.ea.A * var6_10;
            c = (float)v2.ea.ea.I * var6_10;
            var9_14 = vRa.d;
            if (v2.ea.z.QC) {
                var9_14 = pua.o;
            }
            if (!var8_5.ea.z.G) break block21;
            v3 = var8_5;
            var8_5.s += var7_12;
            v3.J += c;
            var10_15 = b - var8_5.da;
            var8_5.da = b;
            var7_12 = v3.h * var10_15;
            c = var8_5.Ba * var10_15;
            if (VS.J()) {
                VS.J((float)var7_12, (float)(c * (float)var9_14));
            } else {
                var8_5.ea.c.J(var7_12, c * (float)var9_14);
            }
            ** GOTO lbl52
        }
        v4 = var8_5;
        v4.s = JPa.N;
        v4.J = JPa.N;
        if (VS.J()) {
            VS.J((float)var7_12, (float)(c * (float)var9_14));
            v5 = var8_5;
        } else {
            var8_5.ea.c.J(var7_12, c * (float)var9_14);
lbl52:
            // 4 sources

            v5 = var8_5;
        }
        v5.ea.U.f();
        if (!var8_5.ea.H) {
            v6 = var8_5;
            FLa_1.ia = v6.ea.z.B;
            var5_9 = new sMa(var8_5.ea);
            var6_11 = var5_9.f();
            var7_13 = var5_9.J();
            v7 = var8_5;
            c = Mouse.getX() * var6_11 / v7.ea.t;
            v8 = var7_13;
            var9_14 = v8 - Mouse.getY() * v8 / var8_5.ea.k - vRa.d;
            var10_16 = v6.ea.z.HB;
            if (v7.ea.Ta != null) {
                v9 = var8_5;
                v9.ea.U.J(hra.x);
                var4_6 = Math.min(Kpa.J(), var10_16);
                var4_6 = Math.max(var4_6, Psa.M);
                var11_17 = System.nanoTime() - a;
                a = Math.max((long)(RQa.a / var4_6 / AQa.P) - var11_17, nqa.i);
                v9.J((float)b, System.nanoTime() + a);
                if (nka.R) {
                    v10 = var8_5;
                    v10.ea.Aa.A();
                    if (v10.fa != null && var8_5.q) {
                        uKa.G((int)RQa.j);
                        uKa.e();
                        uKa.y();
                        var8_5.fa.J((float)b);
                        uKa.D();
                    }
                    var8_5.ea.J().J((boolean)vRa.d);
                }
                v11 = var8_5;
                v11.Ga = System.nanoTime();
                v11.ea.U.f(UTa.C);
                if (!v11.ea.z.ba || var8_5.ea.ta != null) {
                    uKa.J((int)jRa.m, (float)Nra.e);
                    v12 = var8_5;
                    v13 = var8_5;
                    v13.F();
                    v12.J(var6_11, var7_13, (float)b);
                    v13.ea.Ya.J((float)b);
                    if (v12.ea.z.l && !var8_5.ea.z.t) {
                        Config.C();
                    }
                    if (var8_5.ea.z.t) {
                        UD.J((sMa)var5_9);
                    }
                }
                v14 = var8_5;
                v15 = v14;
                v14.ea.U.f();
            } else {
                uKa.f((int)uSa.E, (int)uSa.E, (int)var8_5.ea.t, (int)var8_5.ea.k);
                uKa.G((int)WPa.s);
                uKa.y();
                uKa.G((int)SQa.ca);
                uKa.y();
                var8_5.F();
                var8_5.Ga = System.nanoTime();
                v16 = var8_5;
                v15 = v16;
                RKa.E.m = v16.ea.J();
            }
            if (v15.ea.ta != null) {
                uKa.A((int)hra.Ja);
                try {
                    var8_5.ea.ta.J(c, var9_14, (float)b);
                }
                catch (Throwable var4_7) {
                    var11_18 = RIa.J((Throwable)var4_7, (String)lTa.m);
                    v17 = var11_18.J(Jpa.E);
                    v17.J(jsa.G, IJa.J());
                    v17.J(eua.w, (Callable)new zla((FLa)var8_5, c, var9_14));
                    v17.J(RPa.o, (Callable)new ela((FLa)var8_5, var5_9));
                    throw new MZ(var11_18);
                }
            }
            OT.i.F.J(CR.SCREEN);
        }
        v18 = var8_5;
        v18.C();
        v18.M();
        UD.J();
        if (v18.ea.z.AA) {
            var8_5.ea.z.Da = vRa.d;
        }
    }

    public void k() {
        FLa_1 a2;
        a2.Y = null;
        a2.c.J();
    }

    /*
     * WARNING - void declaration
     */
    private void i(float f2) {
        FLa_1 fLa_1;
        XF xF2;
        double d2;
        double d3;
        double d4;
        void a2;
        float f3;
        FLa_1 b2;
        FLa_1 fLa_12;
        block41: {
            block40: {
                float f4;
                block39: {
                    FLa_1 fLa_13 = fLa_12 = this;
                    b2 = fLa_13.ea.J();
                    f3 = b2.l();
                    FLa_1 fLa_14 = b2;
                    d4 = ((vL)b2).c + (((vL)fLa_14).la - ((vL)b2).c) * (double)a2;
                    d3 = ((vL)fLa_14).ba + (((vL)b2).Z - ((vL)b2).ba) * (double)a2 + (double)f3;
                    d2 = ((vL)b2).r + (((vL)b2).A - ((vL)b2).r) * (double)a2;
                    FLa_1 fLa_15 = fLa_12;
                    f4 = fLa_13.Ja + (fLa_15.p - fLa_15.Ja) * a2;
                    if (f4 != JPa.N) {
                        fua.J((float)f4, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                    }
                    if (!(b2 instanceof Gl) || !((Gl)b2).p()) break block39;
                    f3 = (float)((double)f3 + oua.i);
                    uKa.J((float)JPa.N, (float)bpa.K, (float)JPa.N);
                    if (fLa_12.ea.z.b) break block40;
                    xF2 = new XF((vL)b2);
                    IBlockState iBlockState = fLa_12.ea.Ta.J(xF2);
                    Block block = iBlockState.J();
                    if (block == QFa.Pd) {
                        int n2 = iBlockState.J(BlockBed.FACING).getHorizontalIndex();
                        uKa.J((float)(n2 * Jsa.ha), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                    }
                    FLa_1 fLa_16 = b2;
                    uKa.J((float)(((vL)fLa_16).s + (((vL)fLa_16).X - ((vL)b2).s) * a2 + Hra.Ga), (float)JPa.N, (float)vqa.T, (float)JPa.N);
                    FLa_1 fLa_17 = b2;
                    uKa.J((float)(((vL)fLa_16).o + (((vL)fLa_17).d - ((vL)fLa_17).o) * a2), (float)vqa.T, (float)JPa.N, (float)JPa.N);
                    fLa_1 = fLa_12;
                    break block41;
                }
                if (fLa_12.ea.z.ld > 0) {
                    FLa_1 fLa_18;
                    float f5;
                    float f6 = fLa_12.Aa;
                    if (uw.M) {
                        f5 = uw.k;
                        fLa_18 = fLa_12;
                    } else {
                        f5 = fLa_12.n;
                        fLa_18 = fLa_12;
                    }
                    double d5 = f6 + (f5 - fLa_18.Aa) * a2;
                    if (fLa_12.ea.z.b) {
                        uKa.J((float)JPa.N, (float)JPa.N, (float)((float)(-d5)));
                    } else {
                        float f7;
                        float f8;
                        float f9;
                        int n3;
                        FLa_1 fLa_19;
                        FLa_1 fLa_110 = b2;
                        f4 = ((vL)fLa_110).X;
                        float f10 = ((vL)fLa_110).d;
                        if (uw.E) {
                            f4 = uw.D;
                            f10 = uw.o;
                            fLa_19 = fLa_12;
                        } else if (QS.J()) {
                            f4 = QS.f();
                            f10 = QS.C();
                            fLa_19 = fLa_12;
                        } else {
                            if (VS.J()) {
                                f4 = VS.k;
                                f10 = VS.i;
                            }
                            fLa_19 = fLa_12;
                        }
                        if (fLa_19.ea.z.ld == uqa.g) {
                            f10 += Hra.Ga;
                        }
                        double d6 = (double)(-Oz.d((float)(f4 / Hra.Ga * pua.j)) * Oz.C((float)(f10 / Hra.Ga * pua.j))) * d5;
                        double d7 = (double)(Oz.C((float)(f4 / Hra.Ga * pua.j)) * Oz.C((float)(f10 / Hra.Ga * pua.j))) * d5;
                        double d8 = (double)(-Oz.d((float)(f10 / Hra.Ga * pua.j))) * d5;
                        int n4 = n3 = uSa.E;
                        while (n4 < Yqa.i) {
                            RY rY2;
                            float f11 = (n3 & vRa.d) * uqa.g - vRa.d;
                            f9 = (n3 >> vRa.d & vRa.d) * uqa.g - vRa.d;
                            f8 = (n3 >> uqa.g & vRa.d) * uqa.g - vRa.d;
                            if ((rY2 = fLa_12.ea.Ta.J(new Lz(d4 + (double)(f11 *= Nra.e), d3 + (double)(f9 *= Nra.e), d2 + (double)(f8 *= Nra.e)), new Lz(d4 - d6 + (double)f11 + (double)f8, d3 - d8 + (double)f9, d2 - d7 + (double)f8))) != null) {
                                double d9;
                                double d10 = rY2.I.J(new Lz(d4, d3, d2));
                                if (d9 < d5) {
                                    d5 = d10;
                                }
                            }
                            n4 = ++n3;
                        }
                        if (fLa_12.ea.z.ld == uqa.g) {
                            uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                        }
                        n3 = VS.J() ? 1 : 0;
                        boolean bl = QS.J();
                        if (uw.E) {
                            f9 = uw.D;
                            f7 = f8 = uw.o;
                        } else if (bl) {
                            f9 = QS.f();
                            f7 = f8 = QS.C();
                        } else if (n3 != 0) {
                            f9 = VS.k;
                            f7 = f8 = VS.i;
                        } else {
                            FLa_1 fLa_111 = b2;
                            f9 = ((vL)fLa_111).X;
                            f7 = f8 = ((vL)fLa_111).d;
                        }
                        uKa.J((float)(f7 - f10), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                        uKa.J((float)(f9 - f4), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                        uKa.J((float)JPa.N, (float)JPa.N, (float)((float)(-d5)));
                        uKa.J((float)(f4 - f9), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                        uKa.J((float)(f10 - f8), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                    }
                } else {
                    uKa.J((float)JPa.N, (float)JPa.N, (float)Qra.j);
                }
            }
            fLa_1 = fLa_12;
        }
        if (!fLa_1.ea.z.b) {
            FLa_1 fLa_112;
            if (uw.E) {
                uKa.J((float)uw.o, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                fLa_112 = b2;
            } else if (QS.J()) {
                uKa.J((float)QS.C(), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                fLa_112 = b2;
            } else if (VS.J()) {
                uKa.J((float)(VS.j + (VS.i - VS.j) * a2), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                fLa_112 = b2;
            } else {
                FLa_1 fLa_113 = b2;
                fLa_112 = fLa_113;
                uKa.J((float)(((vL)fLa_113).o + (((vL)fLa_113).d - ((vL)b2).o) * a2), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            }
            if (fLa_112 instanceof fEa) {
                xF2 = (fEa)b2;
                uKa.J((float)(((fEa)xF2).ga + (((fEa)xF2).t - ((fEa)xF2).ga) * a2 + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else if (uw.E) {
                uKa.J((float)(uw.D + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else if (QS.J()) {
                uKa.J((float)(QS.J() + (QS.f() - QS.J()) * a2 + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else if (VS.J()) {
                uKa.J((float)(VS.C + (VS.k - VS.C) * a2 + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            } else {
                FLa_1 fLa_114 = b2;
                uKa.J((float)(((vL)fLa_114).s + (((vL)fLa_114).X - ((vL)b2).s) * a2 + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            }
        }
        uKa.J((float)JPa.N, (float)(-f3), (float)JPa.N);
        FLa_1 fLa_115 = b2;
        d4 = ((vL)fLa_115).c + (((vL)b2).la - ((vL)b2).c) * (double)a2;
        FLa_1 fLa_116 = b2;
        d3 = ((vL)fLa_115).ba + (((vL)fLa_116).Z - ((vL)b2).ba) * (double)a2 + (double)f3;
        d2 = ((vL)fLa_116).r + (((vL)b2).A - ((vL)b2).r) * (double)a2;
        fLa_12.K = fLa_12.ea.Aa.J(d4, d3, d2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, boolean bl, boolean bl2, boolean bl3) {
        float f3 = f2;
        FLa_1 e2 = this;
        if (!e2.Ha) {
            void b2;
            void c2;
            void d2;
            uKa.G((int)WPa.s);
            uKa.y();
            float f4 = cra.S;
            if (e2.ea.z.B) {
                uKa.J((float)((float)(-(d2 * uqa.g - vRa.d)) * f4), (float)JPa.N, (float)JPa.N);
            }
            if (Config.h()) {
                pA.g();
            }
            if (QS.J()) {
                FLa_1 fLa_1 = e2;
                FLa_1 fLa_12 = e2;
                f4 = (float)fLa_1.ea.t / (float)fLa_12.ea.k;
                float f5 = QS.l();
                float f6 = f5 * f4;
                float f7 = -fLa_1.ja * kta.v;
                float f8 = fLa_12.ja * kta.v;
                GL11.glOrtho(-f6, f6, -f5, f5, f7, f8);
            } else {
                Project.gluPerspective(e2.J(f3, uSa.E != 0), (float)e2.ea.t / (float)e2.ea.k, Yqa.C, e2.ja * kta.v);
            }
            uKa.G((int)SQa.ca);
            uKa.y();
            if (e2.ea.z.B) {
                uKa.J((float)((float)(d2 * uqa.g - vRa.d) * Nra.e), (float)JPa.N, (float)JPa.N);
            }
            int n3 = uSa.E;
            if (c2 != false) {
                uKa.e();
                FLa_1 fLa_1 = e2;
                fLa_1.f(f3);
                if (fLa_1.ea.z.Ha && !QS.J()) {
                    e2.l(f3);
                }
                FLa_1 fLa_13 = e2;
                fLa_13.d(f3);
                int n4 = n3 = fLa_13.ea.J() instanceof Gl && ((Gl)e2.ea.J()).p() ? vRa.d : uSa.E;
                if (e2.ea.z.ld == 0 && n3 == 0 && !e2.ea.z.ba && !e2.ea.L.f()) {
                    FLa_1 fLa_14;
                    e2.i();
                    FLa_1 fLa_15 = e2;
                    if (Config.h()) {
                        void a2;
                        tA.J((NKa)fLa_15.t, (float)f3, (boolean)a2);
                        fLa_14 = e2;
                    } else {
                        fLa_15.t.J(f3);
                        fLa_14 = e2;
                    }
                    fLa_14.D();
                }
                uKa.D();
            }
            if (b2 == false) {
                return;
            }
            FLa_1 fLa_1 = e2;
            fLa_1.D();
            if (fLa_1.ea.z.ld == 0 && n3 == 0) {
                FLa_1 fLa_16 = e2;
                fLa_16.t.d(f3);
                fLa_16.f(f3);
            }
            if (e2.ea.z.Ha && !QS.J()) {
                e2.l(f3);
            }
            e2.d(f3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, long l2) {
        FLa_1 fLa_1;
        void a2;
        float c2 = f2;
        FLa_1 b2 = this;
        uKa.L();
        FLa_1 fLa_12 = b2;
        fLa_12.C(c2);
        if (fLa_12.ea.J() == null) {
            FLa_1 fLa_13 = b2;
            fLa_13.ea.J((vL)fLa_13.ea.c);
        }
        b2.A(c2);
        if (Config.h()) {
            pA.J(b2.ea, c2, (long)a2);
        }
        uKa.J();
        uKa.K();
        uKa.J((int)jRa.m, (float)Nra.e);
        FLa_1 fLa_14 = b2;
        fLa_14.ea.U.J(ITa.F);
        if (fLa_14.ea.z.B) {
            x = uSa.E;
            uKa.J(uSa.E != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
            FLa_1 fLa_15 = b2;
            fLa_1 = fLa_15;
            fLa_15.J(uSa.E, c2, (long)a2);
            x = vRa.d;
            uKa.J(vRa.d != 0, uSa.E != 0, uSa.E != 0, uSa.E != 0);
            fLa_15.J(vRa.d, c2, (long)a2);
            uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, uSa.E != 0);
        } else {
            FLa_1 fLa_16 = b2;
            fLa_1 = fLa_16;
            fLa_16.J(uqa.g, c2, (long)a2);
        }
        fLa_1.ea.U.f();
    }

    public void G() {
        FLa_1 a2;
        a2.q = !a2.q ? vRa.d : uSa.E;
    }

    public void D() {
        uKa.i((int)nka.P);
        uKa.z();
        uKa.i((int)nka.v);
        if (Config.h()) {
            pA.x();
        }
    }

    public void A() {
        FLa_1 a2;
        if (a2.fa != null) {
            a2.fa.f();
        }
        FLa_1 fLa_1 = a2;
        fLa_1.fa = null;
        fLa_1.C = o;
    }

    /*
     * WARNING - void declaration
     */
    public void M(float f2) {
        float f3;
        void a2;
        FLa_1 fLa_1 = this;
        float f4 = fLa_1.ea.Ta.J((float)a2);
        if (f3 > JPa.N) {
            int b2;
            if (Config.Y()) {
                return;
            }
            FLa_1 fLa_12 = fLa_1;
            fLa_12.i();
            vL vL2 = fLa_12.ea.J();
            Eoa eoa = fLa_12.ea.Ta;
            vL vL3 = vL2;
            int n2 = Oz.f((double)vL3.la);
            int n3 = Oz.f((double)vL3.Z);
            int n4 = Oz.f((double)vL3.A);
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            uKa.m();
            GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.J((int)jRa.m, (float)Nra.e);
            double d2 = vL3.V + (vL2.la - vL2.V) * (double)a2;
            double d3 = vL3.Ga + (vL2.Z - vL2.Ga) * (double)a2;
            double d4 = vL3.Ca + (vL2.A - vL2.Ca) * (double)a2;
            int n5 = Oz.f((double)d3);
            int n6 = tTa.h;
            if (Config.Ba()) {
                n6 = NTa.C;
            }
            int n7 = pua.o;
            float f5 = (float)fLa_1.la + a2;
            aKa2.f(-d2, -d3, -d4);
            if (Config.Ba()) {
                n6 = NTa.C;
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            zz zz2 = new zz();
            int n8 = b2 = n4 - n6;
            while (n8 <= n4 + n6) {
                int n9 = n2 - n6;
                while (n9 <= n2 + n6) {
                    int n10;
                    int n11 = (b2 - n4 + ERa.C) * fPa.i + n10 - n2 + ERa.C;
                    FLa_1 fLa_13 = fLa_1;
                    d2 = (double)fLa_13.z[n11] * kTa.B;
                    d3 = (double)fLa_13.Da[n11] * kTa.B;
                    zz2.func_181079_c(n10, uSa.E, b2);
                    Jy jy2 = eoa.J((XF)zz2);
                    if (jy2.J() || jy2.l()) {
                        int n12 = eoa.J((XF)zz2).getY();
                        int n13 = n3 - n6;
                        int n14 = n3 + n6;
                        if (n13 < n12) {
                            n13 = n12;
                        }
                        if (n14 < n12) {
                            n14 = n12;
                        }
                        int n15 = n12;
                        if (n12 < n5) {
                            n15 = n5;
                        }
                        if (n13 != n14) {
                            double d5;
                            double d6;
                            int n16 = n10;
                            int n17 = b2;
                            fLa_1.Z.setSeed(n16 * n16 * lQa.m + n10 * gua.t ^ n17 * n17 * Zqa.J + b2 * Gua.q);
                            zz2.func_181079_c(n16, n13, b2);
                            float f6 = jy2.J((XF)zz2);
                            if (eoa.J().J(f6, n12) >= VPa.i) {
                                float f7;
                                if (n7 != 0) {
                                    if (n7 >= 0) {
                                        pKa2.J();
                                    }
                                    n7 = uSa.E;
                                    fLa_1.ea.J().J(a);
                                    aKa2.J(XTa.W, mka.F);
                                }
                                int n18 = n10;
                                int n19 = b2;
                                d4 = ((double)(fLa_1.la + n18 * n18 * lQa.m + n10 * gua.t + n19 * n19 * Zqa.J + b2 * Gua.q & tua.U) + (double)a2) / hqa.ha * (uRa.I + fLa_1.Z.nextDouble());
                                d6 = (double)((float)n10 + MQa.L) - vL2.la;
                                d5 = (double)((float)b2 + MQa.L) - vL2.A;
                                double d7 = d6;
                                double d8 = d5;
                                float f8 = f7 = Oz.J((double)(d7 * d7 + d8 * d8)) / (float)n6;
                                float f9 = ((pqa.r - f8 * f8) * MQa.L + MQa.L) * f4;
                                zz2.func_181079_c(n10, n15, b2);
                                int n20 = eoa.J((XF)zz2, uSa.E);
                                int n21 = n20 >> ERa.C & yQa.j;
                                int n22 = n20 & yQa.j;
                                aKa aKa3 = aKa2;
                                int n23 = n10;
                                aKa2.J((double)n10 - d2 + kTa.B, (double)n13, (double)b2 - d3 + kTa.B).J(aSa.V, (double)n13 * VPa.W + d4).J(pqa.r, pqa.r, pqa.r, f9).J(n21, n22).M();
                                aKa2.J((double)n23 + d2 + kTa.B, (double)n13, (double)b2 + d3 + kTa.B).J(oua.i, (double)n13 * VPa.W + d4).J(pqa.r, pqa.r, pqa.r, f9).J(n21, n22).M();
                                aKa3.J((double)n23 + d2 + kTa.B, (double)n14, (double)b2 + d3 + kTa.B).J(oua.i, (double)n14 * VPa.W + d4).J(pqa.r, pqa.r, pqa.r, f9).J(n21, n22).M();
                                aKa3.J((double)n10 - d2 + kTa.B, (double)n14, (double)b2 - d3 + kTa.B).J(aSa.V, (double)n14 * VPa.W + d4).J(pqa.r, pqa.r, pqa.r, f9).J(n21, n22).M();
                            } else {
                                if (n7 != vRa.d) {
                                    if (n7 >= 0) {
                                        pKa2.J();
                                    }
                                    n7 = vRa.d;
                                    fLa_1.ea.J().J(j);
                                    aKa2.J(XTa.W, mka.F);
                                }
                                FLa_1 fLa_14 = fLa_1;
                                d4 = ((float)(fLa_14.la & Vra.c) + a2) / pQa.fa;
                                d6 = fLa_14.Z.nextDouble() + (double)f5 * SPa.x * (double)((float)fLa_1.Z.nextGaussian());
                                d5 = fLa_14.Z.nextDouble() + (double)(f5 * (float)fLa_1.Z.nextGaussian()) * DPa.Ia;
                                double d9 = (double)((float)n10 + MQa.L) - vL2.la;
                                double d10 = (double)((float)b2 + MQa.L) - vL2.A;
                                double d11 = d9;
                                double d12 = d10;
                                float f10 = f6 = Oz.J((double)(d11 * d11 + d12 * d12)) / (float)n6;
                                f6 = ((pqa.r - f10 * f10) * bpa.K + MQa.L) * f4;
                                zz2.func_181079_c(n10, n15, b2);
                                n12 = (eoa.J((XF)zz2, uSa.E) * yRa.d + YSa.L) / AQa.P;
                                n15 = n12 >> ERa.C & yQa.j;
                                aKa aKa4 = aKa2;
                                int n24 = n10;
                                aKa2.J((double)n10 - d2 + kTa.B, (double)n13, (double)b2 - d3 + kTa.B).J(aSa.V + d6, (double)n13 * VPa.W + d4 + d5).J(pqa.r, pqa.r, pqa.r, f6).J(n15, n12 &= yQa.j).M();
                                aKa2.J((double)n24 + d2 + kTa.B, (double)n13, (double)b2 + d3 + kTa.B).J(oua.i + d6, (double)n13 * VPa.W + d4 + d5).J(pqa.r, pqa.r, pqa.r, f6).J(n15, n12).M();
                                aKa4.J((double)n24 + d2 + kTa.B, (double)n14, (double)b2 + d3 + kTa.B).J(oua.i + d6, (double)n14 * VPa.W + d4 + d5).J(pqa.r, pqa.r, pqa.r, f6).J(n15, n12).M();
                                aKa4.J((double)n10 - d2 + kTa.B, (double)n14, (double)b2 - d3 + kTa.B).J(aSa.V + d6, (double)n14 * VPa.W + d4 + d5).J(pqa.r, pqa.r, pqa.r, f6).J(n15, n12).M();
                            }
                        }
                    }
                    n9 = ++n10;
                }
                n8 = ++b2;
            }
            if (n7 >= 0) {
                pKa2.J();
            }
            aKa2.f(aSa.V, aSa.V, aSa.V);
            uKa.h();
            uKa.k();
            uKa.J((int)jRa.m, (float)Nra.e);
            fLa_1.D();
        }
    }

    public void J(U u2) {
        FLa_1 b2 = u2;
        FLa_1 a2 = this;
        if (a2.fa != null) {
            a2.fa.f();
        }
        a2.fa = null;
        if (a2.C != o) {
            FLa_1 fLa_1 = a2;
            fLa_1.J(H[fLa_1.C]);
            return;
        }
        FLa_1 fLa_1 = a2;
        fLa_1.J(fLa_1.ea.J());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(float f2, int n2) {
        float f3;
        void a2;
        float f4;
        float f5;
        float c2 = f2;
        FLa_1 b2 = this;
        b2.ja = b2.ea.z.kc * ERa.C;
        if (Config.V()) {
            b2.ja *= fsa.Ia;
        }
        if (Config.O()) {
            b2.ja *= lqa.l;
        }
        uKa.G((int)WPa.s);
        uKa.y();
        float f6 = cra.S;
        FLa_1 fLa_1 = b2;
        fLa_1.Ea = fLa_1.ja * kta.v;
        if (fLa_1.Ea < cRa.Fa) {
            b2.Ea = cRa.Fa;
        }
        if (b2.ea.Ta.F.J() == vRa.d) {
            b2.Ea = Fpa.q;
        }
        if (QS.J()) {
            FLa_1 fLa_12 = b2;
            FLa_1 fLa_13 = b2;
            f5 = (float)fLa_12.ea.t / (float)fLa_13.ea.k;
            float f7 = QS.l();
            f4 = f7 * f5;
            float f8 = f7;
            float f9 = -fLa_12.Ea;
            float f10 = fLa_13.Ea;
            GL11.glOrtho(-f4, f4, -f8, f8, f9, f10);
            FloatBuffer floatBuffer = xJa.J((int)ERa.C);
            GL11.glGetFloat(Ppa.Q, floatBuffer);
            if (fLa_12.ea.z.B) {
                uKa.J((float)((float)(-(a2 * uqa.g - vRa.d)) * f6), (float)JPa.N, (float)JPa.N);
            }
        } else {
            if (b2.ea.z.B) {
                uKa.J((float)((float)(-(a2 * uqa.g - vRa.d)) * f6), (float)JPa.N, (float)JPa.N);
            }
            if (b2.r != oua.i) {
                FLa_1 fLa_14 = b2;
                uKa.J((float)((float)b2.ca), (float)((float)(-fLa_14.M)), (float)JPa.N);
                uKa.J((double)fLa_14.r, (double)b2.r, (double)oua.i);
            }
            Project.gluPerspective(b2.J(c2, vRa.d != 0), (float)b2.ea.t / (float)b2.ea.k, Yqa.C, b2.Ea);
        }
        uKa.G((int)SQa.ca);
        uKa.y();
        if (b2.ea.z.B) {
            uKa.J((float)((float)(a2 * uqa.g - vRa.d) * Nra.e), (float)JPa.N, (float)JPa.N);
        }
        FLa_1 fLa_15 = b2;
        fLa_15.f(c2);
        if (fLa_15.ea.z.Ha && !QS.J()) {
            b2.l(c2);
        }
        FLa_1 fLa_16 = b2;
        fLa_16.d(c2);
        f5 = fLa_16.ea.c.x + (b2.ea.c.J - b2.ea.c.x) * c2;
        if (f3 > JPa.N) {
            int n3 = kTa.j;
            if (b2.ea.c.J(Hda.D)) {
                n3 = XTa.W;
            }
            float f11 = f5;
            f4 = eua.C / (f11 * f11 + eua.C) - f5 * Bta.G;
            f4 *= f4;
            FLa_1 fLa_17 = b2;
            uKa.J((float)(((float)fLa_17.la + c2) * (float)n3), (float)JPa.N, (float)pqa.r, (float)pqa.r);
            uKa.l((float)(pqa.r / f4), (float)pqa.r, (float)pqa.r);
            uKa.J((float)(-((float)fLa_17.la + c2) * (float)n3), (float)JPa.N, (float)pqa.r, (float)pqa.r);
        }
        FLa_1 fLa_18 = b2;
        fLa_18.i(c2);
        if (!fLa_18.Ha) return;
        switch (b2.R) {
            case 0: {
                uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                return;
            }
            case 1: {
                uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                return;
            }
            case 2: {
                uKa.J((float)kPa.Ha, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                return;
            }
            case 3: {
                uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                return;
            }
            case 4: {
                uKa.J((float)kPa.Ha, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void e(float f2) {
        FLa_1 fLa_1 = this;
        if (fLa_1.ea.z.t && !fLa_1.ea.z.ba && !fLa_1.ea.c.W() && !fLa_1.ea.z.Na) {
            void a2;
            FLa_1 fLa_12 = fLa_1;
            FLa_1 b2 = fLa_12.ea.J();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.C((float)pqa.r);
            uKa.z();
            uKa.J(uSa.E != 0);
            uKa.e();
            uKa.G((int)SQa.ca);
            uKa.y();
            fLa_12.i((float)a2);
            uKa.J((float)JPa.N, (float)b2.l(), (float)JPa.N);
            ZJa.J((xy)new xy(aSa.V, aSa.V, aSa.V, SQa.F, oQa.Ka, oQa.Ka), (int)osa.Ja, (int)uSa.E, (int)uSa.E, (int)osa.Ja);
            ZJa.J((xy)new xy(aSa.V, aSa.V, aSa.V, oQa.Ka, oQa.Ka, SQa.F), (int)uSa.E, (int)uSa.E, (int)osa.Ja, (int)osa.Ja);
            ZJa.J((xy)new xy(aSa.V, aSa.V, aSa.V, oQa.Ka, rQa.k, oQa.Ka), (int)uSa.E, (int)osa.Ja, (int)uSa.E, (int)osa.Ja);
            uKa.D();
            uKa.J(vRa.d != 0);
            uKa.H();
            uKa.k();
        }
    }

    public void i() {
        FLa_1 a2;
        uKa.i((int)nka.P);
        uKa.G((int)RQa.j);
        uKa.y();
        float f2 = KPa.Aa;
        uKa.l((float)f2, (float)f2, (float)f2);
        uKa.J((float)Qsa.k, (float)Qsa.k, (float)Qsa.k);
        uKa.G((int)SQa.ca);
        a2.ea.J().J(a2.L);
        GL11.glTexParameteri(BQa.Z, lQa.E, rSa.z);
        GL11.glTexParameteri(BQa.Z, wua.C, rSa.z);
        GL11.glTexParameteri(BQa.Z, LQa.P, Zua.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, Zua.o);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.H();
        uKa.i((int)nka.v);
        if (Config.h()) {
            pA.ja();
        }
    }

    public Qha J() {
        FLa_1 a2;
        return a2.fa;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void M() {
        FLa_1 fLa_1 = this;
        fLa_1.v = uSa.E;
        if (Config.w() && Config.r()) {
            nBa nBa2;
            if (!fLa_1.ea.d() || (nBa2 = fLa_1.ea.J()) == null) return;
            if (!fLa_1.ea.I() && !(fLa_1.ea.ta instanceof tna)) {
                if (fLa_1.ba > 0) {
                    UD.G.f();
                    FLa_1 fLa_12 = fLa_1;
                    Config.J((long)fLa_12.ba);
                    UD.G.J();
                    fLa_12.v = fLa_12.ba;
                }
                long l2 = System.nanoTime() / Ata.p;
                if (fLa_1.A != nqa.i && fLa_1.u != 0) {
                    long l3 = l2 - fLa_1.A;
                    if (l3 < nqa.i) {
                        fLa_1.A = l2;
                        l3 = nqa.i;
                    }
                    if (l3 < cra.f) return;
                    fLa_1.A = l2;
                    int a2 = nBa2.J();
                    int n2 = a2 - fLa_1.u;
                    if (n2 < 0) {
                        fLa_1.u = a2;
                        n2 = uSa.E;
                    }
                    if (n2 < vRa.d && fLa_1.ba < ySa.T) {
                        fLa_1.ba += uqa.g;
                    }
                    if (n2 > vRa.d && fLa_1.ba > 0) {
                        fLa_1.ba -= vRa.d;
                    }
                    fLa_1.u = a2;
                    return;
                }
                FLa_1 fLa_13 = fLa_1;
                FLa_1 fLa_14 = fLa_1;
                fLa_14.A = l2;
                fLa_13.u = nBa2.J();
                fLa_14.La = pqa.r;
                fLa_13.Ma = SPa.b;
                return;
            }
            if (fLa_1.ea.ta instanceof tna) {
                Config.J(fta.d);
            }
            FLa_1 fLa_15 = fLa_1;
            fLa_15.A = nqa.i;
            fLa_15.u = uSa.E;
            return;
        }
        FLa_1 fLa_16 = fLa_1;
        fLa_16.A = nqa.i;
        fLa_16.u = uSa.E;
    }

    public void J(Mda mda2) {
        FLa_1 a2;
        FLa_1 b2 = mda2;
        FLa_1 fLa_1 = a2 = this;
        fLa_1.Y = b2;
        fLa_1.ga = wra.P;
        fLa_1.U = fLa_1.Z.nextFloat() * kta.v - pqa.r;
        fLa_1.ma = fLa_1.Z.nextFloat() * kta.v - pqa.r;
    }

    public void e() {
        FLa_1 a2;
        if (nka.R && a2.ea.J() instanceof Sx) {
            if (a2.fa != null) {
                a2.fa.f();
            }
            a2.C = (a2.C + vRa.d) % (H.length + vRa.d);
            if (a2.C != o) {
                FLa_1 fLa_1 = a2;
                fLa_1.J(H[fLa_1.C]);
                return;
            }
            a2.fa = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public float J(Gl gl2, float f2) {
        void a2;
        FLa_1 c22 = gl2;
        FLa_1 b2 = this;
        int c22 = c22.J(Hda.w).l();
        if (c22 > ZOa.x) {
            return pqa.r;
        }
        return ZSa.q + Oz.d((float)(((float)c22 - a2) * pua.j * psa.N)) * bpa.K;
    }

    public boolean J(int n2) {
        int b2 = n2;
        FLa_1 a2 = this;
        if (!nka.f()) {
            return uSa.E != 0;
        }
        if (a2.fa != null) {
            FLa_1 fLa_1 = a2;
            if (fLa_1.fa != fLa_1.aa[uqa.g]) {
                FLa_1 fLa_12 = a2;
                if (fLa_12.fa != fLa_12.aa[AQa.P]) {
                    return vRa.d != 0;
                }
            }
        }
        if (b2 != uqa.g && b2 != AQa.P) {
            if (a2.fa == null) {
                return vRa.d != 0;
            }
            a2.fa.f();
            a2.fa = null;
            return vRa.d != 0;
        }
        if (a2.fa != null) {
            FLa_1 fLa_1 = a2;
            if (fLa_1.fa == fLa_1.aa[b2]) {
                return vRa.d != 0;
            }
        }
        if (a2.ea.Ta == null) {
            return vRa.d != 0;
        }
        FLa_1 fLa_1 = a2;
        fLa_1.J(new ResourceLocation(new StringBuilder().insert(3 >> 2, aua.Fa).append(b2).append(Pqa.j).toString()));
        fLa_1.aa[b2] = a2.fa;
        return fLa_1.q;
    }

    private void d() {
        FLa_1 fLa_1 = this;
        float a22 = fLa_1.ea.Ta.J(pqa.r);
        if (!Config.Ba()) {
            a22 /= kta.v;
        }
        if (a22 != JPa.N && Config.z()) {
            int n2;
            FLa_1 fLa_12 = fLa_1;
            FLa_1 fLa_13 = fLa_1;
            fLa_12.Z.setSeed((long)fLa_13.la * bRa.w);
            Object object = fLa_12.ea.J();
            Eoa eoa = fLa_13.ea.Ta;
            object = new XF((vL)object);
            int n3 = NTa.C;
            double d2 = aSa.V;
            double d3 = aSa.V;
            double d4 = aSa.V;
            int n4 = uSa.E;
            int a22 = (int)(QTa.G * a22 * a22);
            if (fLa_12.ea.z.kB == vRa.d) {
                a22 >>= vRa.d;
            } else if (fLa_1.ea.z.kB == uqa.g) {
                a22 = uSa.E;
            }
            int n5 = n2 = uSa.E;
            while (n5 < a22) {
                Eoa eoa2 = eoa;
                XF xF2 = eoa2.J(((XF)((Object)object)).add(fLa_1.Z.nextInt(n3) - fLa_1.Z.nextInt(n3), uSa.E, fLa_1.Z.nextInt(n3) - fLa_1.Z.nextInt(n3)));
                Jy jy2 = eoa2.J(xF2);
                XF xF3 = xF2.down();
                Block block = eoa2.J(xF3).J();
                if (xF2.getY() <= object.getY() + n3 && xF2.getY() >= object.getY() - n3 && jy2.J() && jy2.J(xF2) >= VPa.i) {
                    FLa_1 fLa_14 = fLa_1;
                    double d5 = fLa_14.Z.nextDouble();
                    double d6 = fLa_14.Z.nextDouble();
                    if (block.J() == Material.lava) {
                        fLa_1.ea.Ta.J(UZ.SMOKE_NORMAL, (double)xF2.getX() + d5, (double)((float)xF2.getY() + Nra.e) - block.l(), (double)xF2.getZ() + d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    } else if (block.J() != Material.air) {
                        block.J((I)eoa, xF3);
                        if (fLa_1.Z.nextInt(++n4) == 0) {
                            XF xF4 = xF3;
                            d2 = (double)xF4.getX() + d5;
                            d3 = (double)((float)xF4.getY() + Nra.e) + block.C() - oua.i;
                            d4 = (double)xF4.getZ() + d6;
                        }
                        fLa_1.ea.Ta.J(UZ.WATER_DROP, (double)xF3.getX() + d5, (double)((float)xF3.getY() + Nra.e) + block.C(), (double)xF3.getZ() + d6, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    }
                }
                n5 = ++n2;
            }
            if (n4 > 0) {
                int n6 = fLa_1.S;
                fLa_1.S = n6 + vRa.d;
                if (fLa_1.Z.nextInt(yRa.d) < n6) {
                    fLa_1.S = uSa.E;
                    if (d3 > (double)(object.getY() + vRa.d) && eoa.J((XF)((Object)object)).getY() > Oz.J((float)object.getY())) {
                        fLa_1.ea.Ta.J(d2, d3, d4, kTa.i, Nra.e, MQa.L, uSa.E != 0);
                        return;
                    }
                    fLa_1.ea.Ta.J(d2, d3, d4, kTa.i, psa.N, pqa.r, uSa.E != 0);
                }
            }
        }
    }

    private void C() {
        long l2;
        FLa_1 fLa_1 = this;
        if (fLa_1.ea.Ta != null && (l2 = System.currentTimeMillis()) > fLa_1.W + lTa.n) {
            fLa_1.W = l2;
            int n2 = GL11.glGetError();
            if (n2 != 0) {
                String string = GLU.gluErrorString(n2);
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = n2;
                objectArray[vRa.d] = string;
                FLa_1 a2 = new CY(oha.J(xqa.y, objectArray));
                fLa_1.ea.Ya.J().J((ld)a2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, float f2) {
        FLa_1 fLa_1 = this;
        if (fLa_1.Y != null && fLa_1.ga > 0) {
            void b2;
            void c2;
            float a2;
            a2 = ((float)(wra.P - fLa_1.ga) + a2) / ZRa.l;
            float d2 = a2 * a2;
            float f3 = a2 * d2;
            d2 = (POa.v * f3 * d2 + xTa.m * d2 * d2 + WSa.C * f3 + sSa.Ga * d2 + YSa.G * a2) * pua.j;
            FLa_1 fLa_12 = fLa_1;
            f3 = fLa_12.U * (float)(c2 / AQa.P);
            float f4 = fLa_12.ma * (float)(b2 / AQa.P);
            uKa.K();
            uKa.e();
            uKa.j();
            uKa.J();
            uKa.m();
            nLa.f();
            uKa.J((float)((float)(c2 / uqa.g) + f3 * Oz.l((float)Oz.d((float)(d2 * kta.v)))), (float)((float)(b2 / uqa.g) + f4 * Oz.l((float)Oz.d((float)(d2 * kta.v)))), (float)Qqa.x);
            float f5 = c2 = SPa.b + cPa.Ga * Oz.d((float)d2);
            uKa.l((float)f5, (float)(-c2), (float)f5);
            uKa.J((float)(uua.T * Oz.l((float)Oz.d((float)d2))), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)(lqa.ga * Oz.C((float)(a2 * Qsa.k))), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)(lqa.ga * Oz.C((float)(a2 * Qsa.k))), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            fLa_12.ea.J().J(fLa_1.Y, Xja.FIXED);
            uKa.G();
            uKa.D();
            nLa.C();
            uKa.h();
            uKa.u();
        }
    }

    public static /* synthetic */ Kpa J(FLa a2) {
        return a2.ea;
    }

    public void l() {
        FLa_1 fLa_1;
        FLa_1 fLa_12;
        FLa_1 fLa_13 = this;
        if (nka.R && pIa.J() == null) {
            pIa.J();
        }
        FLa_1 fLa_14 = fLa_13;
        fLa_14.f();
        fLa_14.J();
        fLa_14.I = fLa_14.Ia;
        fLa_14.Aa = uw.M ? uw.k : fLa_13.n;
        FLa_1 fLa_15 = fLa_13;
        fLa_15.Ja = fLa_15.p;
        if (fLa_15.ea.z.G) {
            FLa_1 fLa_16 = fLa_13;
            fLa_12 = fLa_16;
            float a22 = fLa_16.ea.z.MC * Ora.D + psa.N;
            float f2 = a22 * a22 * a22 * Qsa.k;
            fLa_13.h = fLa_16.w.J(fLa_13.s, Yqa.C * f2);
            fLa_16.Ba = fLa_16.Q.J(fLa_13.J, Yqa.C * f2);
            fLa_16.da = JPa.N;
            fLa_16.s = JPa.N;
            fLa_16.J = JPa.N;
        } else {
            FLa_1 fLa_17 = fLa_13;
            fLa_12 = fLa_17;
            fLa_17.h = JPa.N;
            fLa_17.Ba = JPa.N;
            fLa_17.w.J();
            fLa_17.Q.J();
        }
        if (fLa_12.ea.J() == null) {
            FLa_1 fLa_18 = fLa_13;
            fLa_18.ea.J((vL)fLa_18.ea.c);
        }
        FLa_1 fLa_19 = fLa_13;
        vL a22 = fLa_19.ea.J();
        double d2 = a22.la;
        vL vL2 = a22;
        double d3 = a22.Z + (double)vL2.l();
        double d4 = vL2.A;
        float a22 = fLa_19.ea.Ta.J(new XF(d2, d3, d4));
        float f3 = (float)fLa_19.ea.z.kc / Yra.i;
        f3 = Oz.J((float)f3, (float)JPa.N, (float)pqa.r);
        a22 = a22 * (pqa.r - f3) + f3;
        fLa_19.Ia += (a22 - fLa_13.Ia) * Nra.e;
        fLa_19.la += vRa.d;
        fLa_19.t.f();
        fLa_19.d();
        fLa_19.y = fLa_19.g;
        if (KFa.j) {
            FLa_1 fLa_110 = fLa_13;
            fLa_110.g += Yqa.C;
            if (fLa_110.g > pqa.r) {
                fLa_13.g = pqa.r;
            }
            KFa.j = uSa.E;
            fLa_1 = fLa_13;
        } else {
            if (fLa_13.g > JPa.N) {
                fLa_13.g -= oqa.c;
            }
            fLa_1 = fLa_13;
        }
        if (fLa_1.ga > 0) {
            FLa_1 fLa_111 = fLa_13;
            fLa_111.ga -= vRa.d;
            if (fLa_111.ga == 0) {
                fLa_13.Y = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private FloatBuffer J(float f2, float f3, float f4, float f5) {
        void a2;
        void c2;
        void d2;
        float e2 = f4;
        FLa_1 b2 = this;
        if (Config.h()) {
            pA.J((float)d2, (float)c2, e2);
        }
        FLa_1 fLa_1 = b2;
        fLa_1.k.clear();
        b2.k.put((float)d2).put((float)c2).put(e2).put((float)a2);
        b2.k.flip();
        return fLa_1.k;
    }

    /*
     * WARNING - void declaration
     */
    private void J(ResourceLocation resourceLocation) {
        FLa_1 fLa_1 = this;
        if (nka.f()) {
            void a2;
            try {
                FLa_1 fLa_12 = fLa_1;
                fLa_1.fa = new Qha(fLa_1.ea.J(), fLa_12.B, fLa_12.ea.J(), (ResourceLocation)a2);
                fLa_1.fa.J(fLa_1.ea.t, fLa_1.ea.k);
                fLa_1.q = vRa.d;
                return;
            }
            catch (IOException b2) {
                e.warn(new StringBuilder().insert(3 & 4, CRa.E).append(a2).toString(), (Throwable)b2);
                FLa_1 fLa_13 = fLa_1;
                fLa_13.C = o;
                fLa_13.q = uSa.E;
                return;
            }
            catch (JsonSyntaxException b2) {
                e.warn(new StringBuilder().insert(2 & 5, CRa.E).append(a2).toString(), (Throwable)b2);
                FLa_1 fLa_14 = fLa_1;
                fLa_14.C = o;
                fLa_14.q = uSa.E;
            }
        }
    }

    private void d(float f2) {
        float b2 = f2;
        FLa_1 a2 = this;
        if (!(a2.ea.J() instanceof Sx)) {
            return;
        }
        b2 = vO.M.J();
        float f3 = (float)(System.currentTimeMillis() % asa.fa) / Jpa.r;
        float f4 = (float)(Math.sin((double)f3 * lQa.f * KPa.y * uRa.I) * (double)b2 * yra.d);
        float f5 = (float)(Math.abs(Math.sin((double)f3 * lQa.f * KPa.y * KPa.y)) * (double)b2 * yra.d);
        float f6 = (float)(Math.cos((double)f3 * lQa.f * KPa.y * uRa.I) * (double)b2 * yra.d);
        float f7 = (float)(Math.sin((double)f3 * lQa.f * KPa.y * DQa.S) * (double)b2 * WQa.fa);
        b2 = (float)(Math.cos((double)f3 * lQa.f * KPa.y * FPa.T) * (double)b2 * WQa.fa);
        uKa.J((float)f4, (float)f5, (float)f6);
        uKa.J((float)f7, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)b2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
    }

    public static /* synthetic */ String J() throws Exception {
        return Kpa.J().ta.getClass().getCanonicalName();
    }

    /*
     * WARNING - void declaration
     */
    private void C(float f2) {
        FLa_1 fLa_1 = this;
        if (fLa_1.i) {
            FLa_1 fLa_12 = fLa_1;
            fLa_12.ea.U.J(ppa.v);
            Eoa eoa = fLa_12.ea.Ta;
            if (eoa != null) {
                int n2;
                if (Config.Fa()) {
                    FLa_1 fLa_13 = fLa_1;
                    if (XE.J((Gg)eoa, (float)fLa_13.d, (int[])fLa_13.f, (boolean)fLa_1.ea.c.J(Hda.w))) {
                        FLa_1 fLa_14 = fLa_1;
                        fLa_14.Ca.f();
                        fLa_14.i = uSa.E;
                        fLa_14.ea.U.f();
                        return;
                    }
                }
                float f3 = eoa.C(pqa.r);
                float f4 = f3 * fsa.Ia + Yqa.C;
                int n3 = n2 = uSa.E;
                while (n3 < hra.Ja) {
                    float f5;
                    void a2;
                    Eoa eoa2 = eoa;
                    float b22 = eoa2.F.J()[n2 / ERa.C] * f4;
                    float f6 = eoa2.F.J()[n2 % ERa.C] * (fLa_1.d * Nra.e + Ira.d);
                    if (eoa2.f() > 0) {
                        b22 = eoa.F.J()[n2 / ERa.C];
                    }
                    float f7 = b22 * (f3 * pta.d + kPa.W);
                    float f8 = b22 * (f3 * pta.d + kPa.W);
                    float f9 = f6;
                    float f10 = f9 * ((f9 * Ora.D + Xpa.R) * Ora.D + Xpa.R);
                    float f11 = f6;
                    float f12 = f11 * (f11 * f11 * Ora.D + Xpa.R);
                    f7 += f6;
                    f8 += f10;
                    b22 += f12;
                    f7 = f7 * kra.ba + kTa.J;
                    f8 = f8 * kra.ba + kTa.J;
                    b22 = b22 * kra.ba + kTa.J;
                    if (fLa_1.g > JPa.N) {
                        FLa_1 fLa_15 = fLa_1;
                        f5 = fLa_15.y + (fLa_15.g - fLa_1.y) * a2;
                        f7 = f7 * (pqa.r - f5) + f7 * ZSa.q * f5;
                        f8 = f8 * (pqa.r - f5) + f8 * Ora.D * f5;
                        b22 = b22 * (pqa.r - f5) + b22 * Ora.D * f5;
                    }
                    if (eoa.F.J() == vRa.d) {
                        f7 = Zua.c + f6 * wOa.w;
                        f8 = Fua.v + f10 * wOa.w;
                        b22 = rta.o + f12 * wOa.w;
                    }
                    if (fLa_1.ea.c.J(Hda.w)) {
                        float f13;
                        FLa_1 fLa_16 = fLa_1;
                        f5 = fLa_16.J((Gl)fLa_16.ea.c, (float)a2);
                        f6 = pqa.r / f7;
                        if (f13 > pqa.r / f8) {
                            f6 = pqa.r / f8;
                        }
                        if (f6 > pqa.r / b22) {
                            f6 = pqa.r / b22;
                        }
                        f7 = f7 * (pqa.r - f5) + f7 * f6 * f5;
                        f8 = f8 * (pqa.r - f5) + f8 * f6 * f5;
                        b22 = b22 * (pqa.r - f5) + b22 * f6 * f5;
                    }
                    if (f7 > pqa.r) {
                        f7 = pqa.r;
                    }
                    if (f8 > pqa.r) {
                        f8 = pqa.r;
                    }
                    if (b22 > pqa.r) {
                        b22 = pqa.r;
                    }
                    f5 = Config.J(fLa_1.ea.z.pa);
                    f6 = pqa.r - f7;
                    f10 = pqa.r - f8;
                    f12 = pqa.r - b22;
                    float f14 = f6;
                    f6 = pqa.r - f14 * f14 * f6 * f6;
                    float f15 = f10;
                    f10 = pqa.r - f15 * f15 * f10 * f10;
                    float f16 = f12;
                    f12 = pqa.r - f16 * f16 * f12 * f12;
                    f7 = f7 * (pqa.r - f5) + f6 * f5;
                    f8 = f8 * (pqa.r - f5) + f10 * f5;
                    b22 = b22 * (pqa.r - f5) + f12 * f5;
                    f7 = f7 * kra.ba + kTa.J;
                    f8 = f8 * kra.ba + kTa.J;
                    b22 = b22 * kra.ba + kTa.J;
                    if (f7 > pqa.r) {
                        f7 = pqa.r;
                    }
                    if (f8 > pqa.r) {
                        f8 = pqa.r;
                    }
                    if (b22 > pqa.r) {
                        b22 = pqa.r;
                    }
                    if (f7 < JPa.N) {
                        f7 = JPa.N;
                    }
                    if (f8 < JPa.N) {
                        f8 = JPa.N;
                    }
                    if (b22 < JPa.N) {
                        b22 = JPa.N;
                    }
                    int n4 = osa.Ja;
                    int n5 = (int)(f7 * NQa.Y);
                    int n6 = (int)(f8 * NQa.Y);
                    int b22 = (int)(b22 * NQa.Y);
                    fLa_1.f[n2++] = n4 << osa.c | n5 << ERa.C | n6 << Yqa.i | b22;
                    n3 = n2;
                }
                FLa_1 fLa_17 = fLa_1;
                fLa_17.Ca.f();
                fLa_17.i = uSa.E;
                fLa_17.ea.U.f();
            }
        }
    }

    public void J(vL vL2) {
        FLa_1 b2 = vL2;
        FLa_1 a2 = this;
        if (nka.R) {
            if (a2.fa != null) {
                a2.fa.f();
            }
            a2.fa = null;
            if (b2 instanceof zfa) {
                a2.J(new ResourceLocation(rQa.U));
                return;
            }
            if (b2 instanceof Dga) {
                a2.J(new ResourceLocation(Ppa.q));
                return;
            }
            if (b2 instanceof vea) {
                a2.J(new ResourceLocation(Bpa.Ma));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        int c2 = n3;
        FLa_1 a2 = this;
        if (nka.R) {
            void b2;
            if (a2.fa != null) {
                a2.fa.J((int)b2, c2);
            }
            a2.ea.Aa.J((int)b2, c2);
        }
    }

    private void l(float f2) {
        FLa_1 fLa_1 = this;
        if (fLa_1.ea.J() instanceof Sx) {
            float a2;
            Sx sx2;
            Sx sx3 = sx2 = (Sx)fLa_1.ea.J();
            reference b2 = sx2.e - sx3.M;
            b2 = -(sx2.e + b2 * a2);
            Sx sx4 = sx2;
            float f3 = sx3.Z + (sx4.S - sx4.Z) * a2;
            Sx sx5 = sx2;
            a2 = sx2.Ga + (sx5.G - sx5.Ga) * a2;
            uKa.J((float)(Oz.d((float)(b2 * pua.j)) * f3 * MQa.L), (float)(-Math.abs(Oz.C((float)(b2 * pua.j)) * f3)), (float)JPa.N);
            uKa.J((float)(Oz.d((float)(b2 * pua.j)) * f3 * vQa.q), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)(Math.abs(Oz.C((float)(b2 * pua.j - psa.N)) * f3) * eua.C), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)a2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, boolean bl) {
        Block a22;
        vL vL2;
        void b2;
        float c2;
        vL vL3;
        FLa_1 fLa_1;
        block10: {
            block9: {
                block8: {
                    int a22;
                    fLa_1 = this;
                    if (fLa_1.Ha) {
                        return ISa.a;
                    }
                    vL3 = fLa_1.ea.J();
                    c2 = UOa.d;
                    if (a22 != 0) {
                        c2 = fLa_1.ea.z.LA;
                        if (Config.L()) {
                            FLa_1 fLa_12 = fLa_1;
                            c2 *= fLa_12.X + (fLa_12.P - fLa_1.X) * b2;
                        }
                    }
                    a22 = uSa.E;
                    if (fLa_1.ea.ta == null) {
                        a22 = fLa_1.ea.z.Ja.isKeyDown() ? 1 : 0;
                    }
                    if (a22 == 0) break block8;
                    if (!Config.zoomMode) {
                        Config.zoomMode = vRa.d;
                        fLa_1.ea.z.G = vRa.d;
                    }
                    if (!Config.zoomMode) break block9;
                    c2 /= YSa.G;
                    vL2 = vL3;
                    break block10;
                }
                if (Config.zoomMode) {
                    Config.zoomMode = uSa.E;
                    FLa_1 fLa_13 = fLa_1;
                    fLa_13.ea.z.G = uSa.E;
                    FLa_1 fLa_14 = fLa_1;
                    fLa_13.w = new wY();
                    fLa_14.Q = new wY();
                    fLa_13.ea.Aa.W = vRa.d;
                }
            }
            vL2 = vL3;
        }
        if (vL2 instanceof Gl && ((Gl)vL3).f() <= JPa.N) {
            float a22 = (float)((Gl)vL3).a + b2;
            c2 /= (pqa.r - vua.ha / (a22 + vua.ha)) * kta.v + pqa.r;
        }
        if ((a22 = aLa.J((Gg)fLa_1.ea.Ta, (vL)vL3, (float)b2)).J() == Material.water) {
            c2 = c2 * gua.l / UOa.d;
        }
        return c2 += (float)vO.I.J();
    }

    private void f() {
        FLa_1 fLa_1 = this;
        float a2 = pqa.r;
        if (fLa_1.ea.J() instanceof XW) {
            a2 = ((XW)fLa_1.ea.J()).j();
        }
        FLa_1 fLa_12 = fLa_1;
        fLa_12.X = fLa_12.P;
        fLa_12.P += (a2 - fLa_1.P) * MQa.L;
        if (fLa_12.P > Ira.d) {
            fLa_1.P = Ira.d;
        }
        if (fLa_1.P < Nra.e) {
            fLa_1.P = Nra.e;
        }
    }

    private boolean f() {
        int a2;
        FLa_1 fLa_1 = this;
        if (!fLa_1.ha) {
            return uSa.E != 0;
        }
        vL vL2 = fLa_1.ea.J();
        int n2 = a2 = vL2 instanceof Sx && !fLa_1.ea.z.ba ? vRa.d : uSa.E;
        if (a2 != 0 && !((Sx)vL2).h.J) {
            vL2 = ((Sx)vL2).f();
            if (fLa_1.ea.Oa != null && fLa_1.ea.Oa.A == AY.BLOCK) {
                FLa_1 fLa_12 = fLa_1;
                XF xF2 = fLa_12.ea.Oa.J();
                IBlockState iBlockState = fLa_12.ea.Ta.J(xF2);
                Block block = iBlockState.J();
                if (QS.J()) {
                    a2 = vRa.d;
                    return a2 != 0;
                }
                if (fLa_1.ea.L.J() == Daa.SPECTATOR) {
                    a2 = iBlockState.J().a() && fLa_1.ea.Ta.J(xF2) instanceof HA ? vRa.d : uSa.E;
                    return a2 != 0;
                }
                a2 = vL2 != null && (vL2.J(block) || vL2.f(block)) ? vRa.d : uSa.E;
            }
        }
        return a2 != 0;
    }

    public boolean J() {
        FLa_1 a2;
        if (nka.R && a2.fa != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(float f2) {
        FLa_1 fLa_1 = this;
        if (!jt.A && fLa_1.ea.J() instanceof Gl) {
            float f3;
            Gl gl2;
            void a2;
            Gl gl3 = (Gl)fLa_1.ea.J();
            float b2 = (float)gl3.ha - a2;
            if (gl2.f() <= JPa.N) {
                f3 = (float)gl3.a + a2;
                uKa.J((float)(ZRa.l - RPa.l / (f3 + Qsa.U)), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            }
            if (b2 < JPa.N) {
                return;
            }
            b2 /= (float)gl3.la;
            b2 = Oz.d((float)(b2 * b2 * b2 * b2 * pua.j));
            f3 = gl3.k;
            uKa.J((float)(-f3), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)(-b2 * bsa.la), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)f3, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2, long l2) {
        void v14;
        FLa_1 fLa_1;
        Object object;
        FLa_1 fLa_12;
        void a2;
        void c2;
        float d2 = f2;
        FLa_1 b2 = this;
        boolean bl = Config.h();
        if (!QS.J() || c2 == uqa.g) {
            // empty if block
        }
        if (bl) {
            pA.J((int)c2, d2, (long)a2);
        }
        FLa_1 fLa_13 = b2;
        ZJa zJa2 = fLa_13.ea.Aa;
        SMa sMa2 = fLa_13.ea.f;
        boolean bl2 = fLa_13.f();
        uKa.h();
        fLa_13.ea.U.f(cPa.i);
        if (bl) {
            pA.J(uSa.E, uSa.E, b2.ea.t, b2.ea.k);
            fLa_12 = b2;
        } else {
            uKa.f((int)uSa.E, (int)uSa.E, (int)b2.ea.t, (int)b2.ea.k);
            fLa_12 = b2;
        }
        fLa_12.J(d2);
        uKa.A((int)EQa.ca);
        if (bl) {
            pA.o();
        }
        b2.ea.U.f(ySa.F);
        b2.J(d2, (int)c2);
        if (bl) {
            pA.J(d2);
            if (QS.J()) {
                object = xJa.J((int)ERa.C);
                GL11.glGetFloat(Ppa.Q, (FloatBuffer)object);
            }
        }
        aLa.J((Sx)b2.ea.c, (b2.ea.z.ld == uqa.g ? vRa.d : uSa.E) != 0);
        b2.ea.U.f(mPa.u);
        Vla.J();
        FLa_1 fLa_14 = b2;
        fLa_14.ea.U.f(FRa.s);
        object = new ALa();
        vL vL2 = fLa_14.ea.J();
        double d3 = vL2.V + (vL2.la - vL2.V) * (double)d2;
        vL vL3 = vL2;
        double d4 = vL2.Ga + (vL3.Z - vL2.Ga) * (double)d2;
        double d5 = vL3.Ca + (vL2.A - vL2.Ca) * (double)d2;
        Object object2 = object;
        if (bl) {
            tA.J((ALa)object2, (double)d3, (double)d4, (double)d5);
        } else {
            ((ALa)object2).J(d3, d4, d5);
        }
        if ((Config.F() || Config.W() || Config.K()) && !pA.eA) {
            float f3;
            float f4;
            float f5;
            FLa_1 fLa_15 = b2;
            fLa_15.J(pua.o, d2);
            fLa_15.ea.U.f(fqa.E);
            uKa.G((int)WPa.s);
            uKa.y();
            FLa_1 fLa_16 = b2;
            if (QS.J()) {
                float f6 = (float)fLa_16.ea.t / (float)b2.ea.k;
                f5 = QS.l();
                float f7 = f5 * f6;
                f4 = f5;
                FLa_1 fLa_17 = b2;
                float f8 = -fLa_17.Ea;
                f3 = fLa_17.Ea;
                GL11.glOrtho(-f7, f7, -f4, f4, f8, f3);
            } else {
                Project.gluPerspective(fLa_16.J(d2, vRa.d != 0), (float)b2.ea.t / (float)b2.ea.k, Yqa.C, b2.Ea);
            }
            uKa.G((int)SQa.ca);
            if (bl) {
                pA.u();
            }
            zJa2.J(d2, (int)c2);
            if (bl) {
                pA.la();
            }
            uKa.G((int)WPa.s);
            uKa.y();
            FLa_1 fLa_18 = b2;
            if (QS.J()) {
                float f9 = (float)fLa_18.ea.t / (float)b2.ea.k;
                f5 = QS.l();
                float f10 = f5 * f9;
                f4 = f5;
                FLa_1 fLa_19 = b2;
                float f11 = -fLa_19.Ea;
                f3 = fLa_19.Ea;
                GL11.glOrtho(-f10, f10, -f4, f4, f11, f3);
            } else {
                Project.gluPerspective(fLa_18.J(d2, vRa.d != 0), (float)b2.ea.t / (float)b2.ea.k, Yqa.C, b2.Ea);
            }
            uKa.G((int)SQa.ca);
            fLa_1 = b2;
        } else {
            uKa.k();
            fLa_1 = b2;
        }
        fLa_1.J(uSa.E, d2);
        uKa.F((int)gua.X);
        if (vL2.Z + (double)vL2.l() < kpa.t + (double)(b2.ea.z.Y * PRa.E)) {
            b2.J(zJa2, d2, (int)c2);
        }
        FLa_1 fLa_110 = b2;
        fLa_110.ea.U.f(Vra.r);
        fLa_110.J(uSa.E, d2);
        fLa_110.ea.J().J(WKa.C);
        nLa.C();
        fLa_110.ea.U.f(Jqa.x);
        ZJa zJa3 = zJa2;
        if (bl) {
            int n3 = b2.Fa;
            b2.Fa = n3 + vRa.d;
            tA.J((ZJa)zJa3, (vL)vL2, (double)d2, (eb)object, (int)n3, (boolean)b2.ea.c.t());
            v14 = c2;
        } else {
            int n4 = b2.Fa;
            b2.Fa = n4 + vRa.d;
            zJa3.J(vL2, (double)d2, (eb)object, n4, b2.ea.c.t());
            v14 = c2;
        }
        if (v14 == false || c2 == uqa.g) {
            FLa_1 fLa_111 = b2;
            fLa_111.ea.U.f(Ysa.Q);
            UD.l.f();
            fLa_111.ea.Aa.J((long)a2);
            UD.l.J();
        }
        FLa_1 fLa_112 = b2;
        fLa_112.ea.U.f(qQa.a);
        UD.M.f();
        if (fLa_112.ea.z.Ta && c2 > 0) {
            FLa_1 fLa_113 = b2;
            fLa_113.ea.U.f(XSa.Ka);
            GL11.glFinish();
            fLa_113.ea.U.f(qQa.a);
        }
        uKa.G((int)SQa.ca);
        uKa.e();
        uKa.c();
        if (bl) {
            tA.j();
        }
        zJa2.J(ez.SOLID, (double)d2, (int)c2, vL2);
        uKa.K();
        if (bl) {
            tA.C();
        }
        zJa2.J(ez.CUTOUT_MIPPED, (double)d2, (int)c2, vL2);
        b2.ea.J().J(WKa.C).J(uSa.E != 0, uSa.E != 0);
        if (bl) {
            tA.M();
        }
        zJa2.J(ez.CUTOUT, (double)d2, (int)c2, vL2);
        b2.ea.J().J(WKa.C).J();
        if (bl) {
            tA.d();
        }
        UD.M.J();
        uKa.F((int)Zra.f);
        uKa.J((int)jRa.m, (float)Nra.e);
        if (!b2.Ha) {
            uKa.G((int)SQa.ca);
            uKa.D();
            uKa.e();
            nLa.f();
            FLa_1 fLa_114 = b2;
            fLa_114.ea.U.f(UTa.U);
            zJa2.J(vL2, (eb)object, d2);
            nLa.C();
            fLa_114.D();
            uKa.G((int)SQa.ca);
            uKa.D();
            uKa.e();
            if (fLa_114.ea.Oa != null && vL2.J(Material.water) && bl2) {
                Sx sx2 = (Sx)vL2;
                uKa.c();
                b2.ea.U.f(xSa.g);
                zJa2.J(sx2, b2.ea.Oa, uSa.E, d2);
                uKa.K();
            }
        }
        uKa.G((int)SQa.ca);
        uKa.D();
        if (bl2 && b2.ea.Oa != null && !vL2.J(Material.water)) {
            Sx sx3 = (Sx)vL2;
            uKa.c();
            b2.ea.U.f(xSa.g);
            zJa2.J(sx3, b2.ea.Oa, uSa.E, d2);
            uKa.K();
        }
        if (b2.ea.J().i) {
            b2.ea.J().f(d2);
        }
        if (!zJa2.Da.isEmpty()) {
            FLa_1 fLa_115 = b2;
            fLa_115.ea.U.f(aPa.fa);
            uKa.B();
            uKa.J((int)Lra.k, (int)vRa.d, (int)vRa.d, (int)uSa.E);
            fLa_115.ea.J().J(WKa.C).J(uSa.E != 0, uSa.E != 0);
            zJa2.J(pKa.J(), pKa.J().J(), vL2, d2);
            fLa_115.ea.J().J(WKa.C).J();
            uKa.k();
        }
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.k();
        if (!b2.Ha) {
            FLa_1 fLa_116 = b2;
            fLa_116.i();
            fLa_116.ea.U.f(zTa.u);
            if (bl) {
                pA.T();
            }
            sMa2.f(vL2, d2);
            nLa.C();
            FLa_1 fLa_117 = b2;
            fLa_117.J(uSa.E, d2);
            fLa_117.ea.U.f(gua.g);
            if (bl) {
                pA.Y();
            }
            sMa2.J(vL2, d2);
            if (bl) {
                pA.Ma();
            }
            b2.D();
        }
        uKa.J(uSa.E != 0);
        uKa.h();
        b2.ea.U.f(oua.h);
        if (bl) {
            pA.Ia();
        }
        b2.M(d2);
        if (bl) {
            pA.P();
        }
        uKa.J(vRa.d != 0);
        zJa2.J(vL2, d2);
        if (bl) {
            tA.J((FLa)b2, (float)d2, (int)c2);
            pA.t();
        }
        uKa.k();
        uKa.h();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.J((int)jRa.m, (float)Nra.e);
        FLa_1 fLa_118 = b2;
        fLa_118.J(uSa.E, d2);
        uKa.B();
        uKa.J(uSa.E != 0);
        fLa_118.ea.J().J(WKa.C);
        uKa.F((int)gua.X);
        fLa_118.ea.U.f(ERa.S);
        if (bl) {
            pA.N();
        }
        zJa2.J(ez.TRANSLUCENT, (double)d2, (int)c2, vL2);
        if (bl) {
            pA.h();
        }
        OT.i.H.J((ALa)object);
        uKa.F((int)Zra.f);
        uKa.J(vRa.d != 0);
        uKa.h();
        uKa.k();
        uKa.I();
        if (vL2.Z + (double)vL2.l() >= kpa.t + (double)(b2.ea.z.Y * PRa.E)) {
            FLa_1 fLa_119 = b2;
            fLa_119.ea.U.f(ppa.a);
            fLa_119.J(zJa2, d2, (int)c2);
        }
        WTa.J((ZJa)zJa2, (float)d2);
        FLa_1 fLa_120 = b2;
        fLa_120.ea.U.f(Fua.y);
        if (fLa_120.N && !pA.eA) {
            FLa_1 fLa_121;
            if (bl) {
                tA.l((FLa)b2, (float)d2, (int)c2);
                pA.w();
            }
            uKa.A((int)hra.Ja);
            FLa_1 fLa_122 = b2;
            if (bl) {
                tA.f((FLa)fLa_122, (float)d2, (int)c2);
                fLa_121 = b2;
            } else {
                fLa_122.f(d2, (int)c2);
                fLa_121 = b2;
            }
            fLa_121.e(d2);
        }
        if (bl) {
            pA.d();
        }
    }

    private void J() {
        FLa_1 a2;
        FLa_1 fLa_1 = a2;
        fLa_1.ka = (float)((double)fLa_1.ka + (Math.random() - Math.random()) * Math.random() * Math.random());
        fLa_1.ka = (float)((double)fLa_1.ka * Tqa.ja);
        FLa_1 fLa_12 = a2;
        fLa_1.d += (fLa_12.ka - fLa_12.d) * pqa.r;
        fLa_1.i = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    private void J(ZJa zJa2, float f2, int n2) {
        FLa_1 fLa_1 = this;
        if (fLa_1.ea.z.kc >= AQa.P && !Config.x() && pA.J(fLa_1.ea.z) && !QS.J()) {
            void a2;
            void c2;
            void b2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            fLa_1.ea.U.f(dpa.fa);
            uKa.G((int)WPa.s);
            uKa.y();
            if (QS.J()) {
                FLa_1 fLa_12 = fLa_1;
                FLa_1 fLa_13 = fLa_1;
                f7 = (float)fLa_12.ea.t / (float)fLa_13.ea.k;
                f6 = QS.l();
                f5 = f6 * f7;
                float d2 = f6;
                f4 = -fLa_12.Ea * YSa.G;
                f3 = fLa_13.Ea * YSa.G;
                GL11.glOrtho(-f5, f5, -d2, d2, f4, f3);
            } else {
                Project.gluPerspective(fLa_1.J((float)b2, vRa.d != 0), (float)fLa_1.ea.t / (float)fLa_1.ea.k, Yqa.C, fLa_1.Ea * YSa.G);
            }
            uKa.G((int)SQa.ca);
            uKa.e();
            void v2 = b2;
            fLa_1.J(uSa.E, (float)v2);
            c2.l((float)v2, (int)a2);
            uKa.I();
            uKa.D();
            uKa.G((int)WPa.s);
            uKa.y();
            if (QS.J()) {
                FLa_1 fLa_14 = fLa_1;
                FLa_1 fLa_15 = fLa_1;
                f7 = (float)fLa_14.ea.t / (float)fLa_15.ea.k;
                f6 = QS.l();
                f5 = f6 * f7;
                float d2 = f6;
                f4 = -fLa_14.Ea;
                f3 = fLa_15.Ea;
                GL11.glOrtho(-f5, f5, -d2, d2, f4, f3);
            } else {
                Project.gluPerspective(fLa_1.J((float)b2, vRa.d != 0), (float)fLa_1.ea.t / (float)fLa_1.ea.k, Yqa.C, fLa_1.Ea);
            }
            uKa.G((int)SQa.ca);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(float var1_5) {
        v0 = var2_6 = this;
        b = v0.ea.Ta;
        var11_7 = v0.ea.J();
        var4_8 = rta.o + wOa.w * (float)var2_6.ea.z.kc / Ura.m;
        var4_8 = pqa.r - (float)Math.pow(var4_8, VPa.W);
        v1 = b;
        v2 = XE.J((Lz)b.J(var2_6.ea.J(), a), (Gg)v1, (vL)var2_6.ea.J(), (float)a);
        var5_9 = (float)v2.A;
        var6_10 = (float)v2.j;
        var7_11 = (float)v2.J;
        var8_12 = v1.J(a);
        var8_12 = XE.J((Lz)var8_12, (Eoa)b, (vL)var2_6.ea.J(), (float)a);
        var2_6.m = (float)var8_12.A;
        v0.F = (float)var8_12.j;
        v0.b = (float)var8_12.J;
        if (v0.ea.z.kc >= AQa.P) {
            var9_16 = pqa.q;
            var8_12 = Oz.d((float)b.d(a)) > JPa.N ? new Lz(var9_16, aSa.V, aSa.V) : new Lz(oua.i, aSa.V, aSa.V);
            var3_19 = (float)var11_7.J(a).f(var8_12);
            if (v3 < JPa.N) {
                var3_19 = JPa.N;
            }
            if (var3_19 > JPa.N && (var12_22 /* !! */  = b.F.J(b.e(a), a)) != null) {
                v4 = var2_6;
                v4.m = v4.m * (pqa.r - (var3_19 *= var12_22 /* !! */ [yRa.d])) + var12_22 /* !! */ [uSa.E] * var3_19;
                v4.F = v4.F * (pqa.r - var3_19) + var12_22 /* !! */ [vRa.d] * var3_19;
                v4.b = v4.b * (pqa.r - var3_19) + var12_22 /* !! */ [uqa.g] * var3_19;
            }
        }
        v5 = var2_6;
        v5.m += (var5_9 - var2_6.m) * var4_8;
        v5.F += (var6_10 - var2_6.F) * var4_8;
        v5.b += (var7_11 - var2_6.b) * var4_8;
        var9_17 = b.J(a);
        if (v6 > JPa.N) {
            var10_24 = pqa.r - var9_17 * MQa.L;
            var8_13 = pqa.r - var9_17 * Xpa.R;
            v7 = var2_6;
            v7.m *= var10_24;
            v7.F *= var10_24;
            v7.b *= var8_13;
        }
        var10_24 = b.f(a);
        if (v8 > JPa.N) {
            var8_14 = pqa.r - var10_24 * MQa.L;
            v9 = var2_6;
            v9.m *= var8_14;
            v9.F *= var8_14;
            v9.b *= var8_14;
        }
        v10 = var2_6;
        var8_15 = aLa.J((Gg)v10.ea.Ta, (vL)var11_7, (float)a);
        if (v10.K) {
            var3_20 = b.f(a);
            v11 = var2_6;
            v12 = var3_20;
            var2_6.m = (float)v12.A;
            var2_6.F = (float)v12.j;
            var2_6.b = (float)var3_20.J;
        } else {
            if (var8_15.J() == Material.water) {
                v13 = var11_7;
                var3_19 = (float)kGa.f((vL)v13) * psa.N;
                if (v13 instanceof Gl && ((Gl)var11_7).J(Hda.E)) {
                    var3_19 = var3_19 * bpa.K + Ora.D;
                }
                var2_6.m = WRa.e + var3_19;
                var2_6.F = WRa.e + var3_19;
                var2_6.b = psa.N + var3_19;
                v14 = XE.J((I)var2_6.ea.Ta, (double)var2_6.ea.J().la, (double)(var2_6.ea.J().Z + oua.i), (double)var2_6.ea.J().A);
                var12_22 /* !! */  = (float[])v14;
                if (v14 != null) {
                    v15 = var2_6;
                    var2_6.m = (float)var12_22 /* !! */ .A;
                    v15.F = (float)var12_22 /* !! */ .j;
                    v15.b = (float)var12_22 /* !! */ .J;
                }
            } else if (var8_15.J() == Material.lava) {
                v16 = var2_6;
                v16.m = Ora.D;
                v16.F = Nra.e;
                v16.b = JPa.N;
            }
            v11 = var2_6;
        }
        v17 = var2_6;
        var3_21 = v11.I + (v17.Ia - v17.I) * a;
        v18 = var2_6;
        v18.m *= var3_21;
        v18.F *= var3_21;
        v18.b *= var3_21;
        var12_23 = b.F.J();
        v19 = var11_7;
        var9_18 = (var11_7.Ga + (v19.Z - var11_7.Ga) * (double)a) * var12_23;
        if (!(v19 instanceof Gl) || !((Gl)var11_7).J(Hda.a)) ** GOTO lbl95
        b = ((Gl)var11_7).J(Hda.a).l();
        if (b < kTa.j) {
            v20 = var9_18 = var9_18 * (double)(pqa.r - (float)b / eta.e);
        } else {
            var9_18 = aSa.V;
lbl95:
            // 2 sources

            v20 = var9_18;
        }
        if (v20 < oua.i) {
            if (var9_18 < aSa.V) {
                var9_18 = aSa.V;
            }
            v21 = var9_18;
            var9_18 = v21 * v21;
            v22 = var2_6;
            v22.m = (float)((double)v22.m * var9_18);
            v22.F = (float)((double)v22.F * var9_18);
            v22.b = (float)((double)v22.b * var9_18);
        }
        if (var2_6.g > JPa.N) {
            v23 = var2_6;
            b = v23.y + (var2_6.g - var2_6.y) * a;
            var2_6.m = v23.m * (pqa.r - b) + var2_6.m * ZSa.q * b;
            v23.F = v23.F * (pqa.r - b) + var2_6.F * Ora.D * b;
            v23.b = v23.b * (pqa.r - b) + var2_6.b * Ora.D * b;
        }
        if (var11_7 instanceof Gl && ((Gl)var11_7).J(Hda.w)) {
            b = var2_6.J((Gl)var11_7, a);
            var4_8 = pqa.r / var2_6.m;
            if (v24 > pqa.r / var2_6.F) {
                var4_8 = pqa.r / var2_6.F;
            }
            if (var4_8 > pqa.r / var2_6.b) {
                var4_8 = pqa.r / var2_6.b;
            }
            v25 = var2_6;
            v26 = var2_6;
            v25.m = v25.m * (pqa.r - b) + v26.m * var4_8 * b;
            v25.F = v26.F * (pqa.r - b) + var2_6.F * var4_8 * b;
            v25.b = v25.b * (pqa.r - b) + var2_6.b * var4_8 * b;
        }
        if (var2_6.ea.z.B) {
            v27 = var2_6;
            v28 = var2_6;
            b = (v27.m * NSa.B + v28.F * Era.k + var2_6.b * AQa.W) / QTa.G;
            var4_8 = (v27.m * NSa.B + var2_6.F * UOa.d) / QTa.G;
            a = (v28.m * NSa.B + var2_6.b * UOa.d) / QTa.G;
            v27.m = b;
            v27.F = var4_8;
            v27.b = a;
        }
        v29 = var2_6;
        pA.f(v29.m, v29.F, var2_6.b, JPa.N);
    }

    static {
        e = LogManager.getLogger();
        a = new ResourceLocation(NOa.o);
        j = new ResourceLocation(nqa.M);
        ResourceLocation[] resourceLocationArray = new ResourceLocation[osa.c];
        resourceLocationArray[uSa.E] = new ResourceLocation(Jra.Ea);
        resourceLocationArray[vRa.d] = new ResourceLocation(Zua.Z);
        resourceLocationArray[uqa.g] = new ResourceLocation(Lsa.R);
        resourceLocationArray[yRa.d] = new ResourceLocation(Pqa.l);
        resourceLocationArray[AQa.P] = new ResourceLocation(fsa.t);
        resourceLocationArray[tTa.h] = new ResourceLocation(Ysa.I);
        resourceLocationArray[uua.p] = new ResourceLocation(Fpa.ja);
        resourceLocationArray[XTa.W] = new ResourceLocation(oQa.T);
        resourceLocationArray[Yqa.i] = new ResourceLocation(Zua.ga);
        resourceLocationArray[WOa.fa] = new ResourceLocation(Bpa.Ma);
        resourceLocationArray[NTa.C] = new ResourceLocation(XSa.p);
        resourceLocationArray[pPa.f] = new ResourceLocation(RQa.ba);
        resourceLocationArray[lqa.s] = new ResourceLocation(nqa.X);
        resourceLocationArray[uua.s] = new ResourceLocation(fsa.la);
        resourceLocationArray[hpa.Z] = new ResourceLocation(dsa.L);
        resourceLocationArray[Ypa.A] = new ResourceLocation(Qra.x);
        resourceLocationArray[ERa.C] = new ResourceLocation(AQa.Da);
        resourceLocationArray[yta.Ka] = new ResourceLocation(aqa.S);
        resourceLocationArray[yOa.B] = new ResourceLocation(hTa.l);
        resourceLocationArray[wOa.t] = new ResourceLocation(Tpa.Z);
        resourceLocationArray[kTa.j] = new ResourceLocation(nqa.k);
        resourceLocationArray[wOa.h] = new ResourceLocation(Zqa.Ka);
        resourceLocationArray[cQa.o] = new ResourceLocation(rQa.U);
        resourceLocationArray[AQa.ba] = new ResourceLocation(Ppa.q);
        H = resourceLocationArray;
        o = H.length;
    }

    /*
     * WARNING - void declaration
     */
    public FLa_1(Kpa kpa2, U u2) {
        void a2;
        FLa_1 b2;
        FLa_1 c2 = kpa2;
        FLa_1 fLa_1 = b2 = this;
        FLa_1 fLa_12 = b2;
        FLa_1 fLa_13 = b2;
        b2.Z = new Random();
        fLa_13.w = new wY();
        b2.Q = new wY();
        b2.n = YSa.G;
        b2.Aa = YSa.G;
        b2.N = vRa.d;
        b2.ha = vRa.d;
        b2.D = Kpa.J();
        b2.z = new float[ura.V];
        b2.Da = new float[ura.V];
        b2.k = xJa.J((int)ERa.C);
        b2.R = uSa.E;
        b2.Ha = uSa.E;
        b2.r = oua.i;
        fLa_12.O = uSa.E;
        fLa_1.V = null;
        fLa_12.G = uSa.E;
        fLa_1.Ka = uSa.E;
        fLa_1.Ea = PRa.E;
        fLa_1.A = nqa.i;
        fLa_1.u = uSa.E;
        fLa_1.ba = uSa.E;
        fLa_1.v = uSa.E;
        fLa_1.Ma = JPa.N;
        fLa_1.La = JPa.N;
        fLa_1.W = nqa.i;
        fLa_1.aa = new Qha[NTa.C];
        FLa_1 fLa_14 = b2;
        FLa_1 fLa_15 = b2;
        FLa_1 fLa_16 = b2;
        b2.C = o;
        fLa_16.q = uSa.E;
        fLa_16.Fa = uSa.E;
        fLa_16.ea = c2;
        fLa_15.B = a2;
        fLa_15.t = c2.J();
        fLa_14.c = new dMa(c2.J());
        fLa_14.Ca = new VJa(ERa.C, ERa.C);
        fLa_14.L = c2.J().J(kqa.I, b2.Ca);
        b2.f = b2.Ca.J();
        b2.fa = null;
        int n2 = c2 = uSa.E;
        while (n2 < fPa.i) {
            int n3 = uSa.E;
            while (n3 < fPa.i) {
                float f2 = a2 - ERa.C;
                float f3 = c2 - ERa.C;
                float f4 = f2;
                float f5 = f3;
                float f6 = Oz.J((float)(f4 * f4 + f5 * f5));
                FLa_1 fLa_17 = b2;
                fLa_17.z[c2 << tTa.h | a2] = -f3 / f6;
                int n4 = c2 << tTa.h | a2;
                fLa_17.Da[n4] = f2 / f6;
                n3 = ++a2;
            }
            n2 = ++c2;
        }
    }
}

