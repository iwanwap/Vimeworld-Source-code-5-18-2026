/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AA
 *  AJa
 *  AY
 *  Ata
 *  BRa
 *  Cja
 *  Cla
 *  DQa
 *  Dha
 *  EJa
 *  EQa
 *  ERa
 *  Eoa
 *  FJa
 *  FPa
 *  Faa
 *  Gg
 *  I
 *  ISa
 *  JPa
 *  JQa
 *  JTa
 *  Kpa
 *  LQa
 *  Lra
 *  Lz
 *  MQa
 *  MZ
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  PA
 *  PNa
 *  Pja
 *  Py
 *  QFa
 *  QSa
 *  Qha
 *  Qqa
 *  Qsa
 *  RIa
 *  SA
 *  SOa
 *  SRa
 *  Se
 *  Tja
 *  Tpa
 *  U
 *  UD
 *  UZ
 *  Uta
 *  Uy
 *  VQa
 *  Vb
 *  Vda
 *  Vla
 *  Vua
 *  WSa
 *  XE
 *  XTa
 *  YSa
 *  Yha
 *  Ypa
 *  Yra
 *  ZIa
 *  ZJa
 *  ZRa
 *  Zla
 *  Zpa
 *  Zta
 *  aJa
 *  aKa
 *  aQa
 *  aSa
 *  bF
 *  bJa
 *  bRa
 *  bpa
 *  cQa
 *  cja
 *  dQa
 *  eAa
 *  eb
 *  eka
 *  ez
 *  fpa
 *  gHa
 *  hla
 *  hra
 *  j
 *  jRa
 *  jg
 *  kPa
 *  kpa
 *  kqa
 *  kta
 *  lPa
 *  lqa
 *  mka
 *  nLa
 *  nQa
 *  nka
 *  pIa
 *  pKa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  pua
 *  qla
 *  qta
 *  ska
 *  tA
 *  uKa
 *  uOa
 *  uRa
 *  ura
 *  uw
 *  vL
 *  vRa
 *  vf
 *  wOa
 *  wra
 *  xJa
 *  xy
 *  yra
 *  ysa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockCustomLeaves;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ZJa_2
implements Vb,
j {
    private Eoa aa;
    private static final ResourceLocation ea;
    private double Ea;
    private int Ca;
    private double ia;
    private final Vector4f[] Ma;
    private hKa ba;
    private List ha;
    private gHa Fa;
    private EJa Ia;
    private final Map la;
    private boolean ga;
    public final Map Da;
    private Deque ca;
    private int Ja;
    private int ja;
    public final Kpa Ha;
    private bJa Ga;
    private final oLa fa;
    private List Ka;
    private double Aa;
    private List S;
    private List Z;
    private bF Y;
    private final aJa r;
    private int V;
    private bJa z;
    private List X;
    private static final Set y;
    public Set U;
    private int P;
    private boolean u;
    private double O;
    private double t;
    private double R;
    private final Py Q;
    private List N;
    private final KLa[] T;
    private int p;
    private int n;
    private static final Logger s;
    private double w;
    public boolean W;
    public vL q;
    private int x;
    private int v;
    private AA o;
    private Qha h;
    private double K;
    private double H;
    private static final ResourceLocation c;
    private int B;
    public SA d;
    private static final ResourceLocation a;
    private int b;
    private final Set l;
    private static final String e = "CL_00000954";
    private List G;
    private double D;
    private int f;
    private List F;
    private int g;
    public Set L;
    private int E;
    private AJa m;
    private List C;
    private bJa i;
    private final vja M;
    private static final ResourceLocation k;
    private Set j;
    private int J;
    private static final ResourceLocation A;
    private double I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n8 = n7;
        ZJa_2 a2 = this;
        a2.f((int)(f2 - vRa.d), (int)(e2 - vRa.d), (int)(d2 - vRa.d), (int)(c2 + vRa.d), (int)(b2 + vRa.d), (int)(g2 + vRa.d));
    }

    /*
     * WARNING - void declaration
     */
    public void J(pKa pKa2, aKa aKa2, vL vL2, float f2) {
        void a3222;
        Object e2 = vL2;
        ZJa_2 b2 = this;
        ZJa_2 zJa_2 = e2;
        double d2 = ((vL)zJa_2).V + (((vL)e2).la - ((vL)e2).V) * (double)a3222;
        ZJa_2 zJa_22 = e2;
        double d3 = ((vL)zJa_2).Ga + (((vL)zJa_22).Z - ((vL)e2).Ga) * (double)a3222;
        double d4 = ((vL)zJa_22).Ca + (((vL)e2).A - ((vL)e2).Ca) * (double)a3222;
        if (!b2.Da.isEmpty()) {
            void d5;
            void c2;
            void v2 = c2;
            ZJa_2 zJa_23 = b2;
            b2.r.J(WKa.C);
            zJa_23.f();
            c2.J(XTa.W, mka.j);
            v2.f(-d2, -d3, -d4);
            v2.l();
            e2 = zJa_23.Da.values().iterator();
            while (e2.hasNext()) {
                XF xF2;
                bLa a3222 = (bLa)e2.next();
                XF xF3 = xF2 = a3222.J();
                double d6 = (double)xF3.getX() - d2;
                double d7 = (double)xF3.getY() - d3;
                double d8 = (double)xF3.getZ() - d4;
                Object object = b2.aa.J(xF2).J();
                int n2 = !(object instanceof BlockChest) && !(object instanceof BlockEnderChest) && !(object instanceof BlockSign) && !(object instanceof BlockSkull) ? vRa.d : uSa.E;
                if (n2 == 0) continue;
                double d9 = d6;
                double d10 = d7;
                double d11 = d8;
                if (d9 * d9 + d10 * d10 + d11 * d11 > yra.Y) {
                    e2.remove();
                    continue;
                }
                object = b2.aa.J(xF2);
                if (object.J().J() == Material.air) continue;
                int a3222 = a3222.f();
                KLa a3222 = b2.T[a3222];
                b2.Ha.J().J((IBlockState)object, xF2, a3222, (I)b2.aa);
            }
            d5.J();
            c2.f(aSa.V, aSa.V, aSa.V);
            b2.C();
        }
    }

    private void g() {
        ZJa_2 zJa_2 = this;
        pKa pKa2 = pKa.J();
        ZJa_2 a2 = pKa2.J();
        if (zJa_2.z != null) {
            zJa_2.z.l();
        }
        if (zJa_2.Ja >= 0) {
            xJa.J((int)zJa_2.Ja);
            zJa_2.Ja = pua.o;
        }
        if (zJa_2.ga) {
            ZJa_2 zJa_22 = a2;
            ZJa_2 zJa_23 = zJa_2;
            ZJa_2 zJa_24 = zJa_2;
            zJa_2.z = new bJa(zJa_2.ba);
            zJa_23.J((aKa)a2, FRa.B, vRa.d != 0);
            zJa_22.J();
            zJa_22.f();
            zJa_23.z.J(a2.J());
            return;
        }
        zJa_2.Ja = xJa.J((int)vRa.d);
        GL11.glNewList(zJa_2.Ja, Wqa.O);
        zJa_2.J((aKa)a2, FRa.B, vRa.d != 0);
        pKa2.J();
        GL11.glEndList();
    }

    /*
     * WARNING - void declaration
     */
    public void l(float f2, int n2) {
        float c222 = f2;
        ZJa_2 b2 = this;
        if (uw.i) {
            return;
        }
        if (!Config.x() && b2.Ha.Ta.F.J()) {
            void a3222;
            if (Config.h()) {
                pA.l();
            }
            if (Config.j()) {
                b2.f(c222, (int)a3222);
            } else {
                ZJa_2 zJa_2 = b2;
                zJa_2.Y.J(uSa.E != 0, b2.B, c222);
                c222 = JPa.N;
                uKa.m();
                ZJa_2 zJa_22 = b2;
                float f3 = (float)(zJa_2.Ha.J().Ga + (zJa_22.Ha.J().Z - b2.Ha.J().Ga) * (double)c222);
                pKa pKa2 = pKa.J();
                aKa aKa2 = pKa2.J();
                zJa_22.r.J(ea);
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                if (zJa_2.Y.J()) {
                    int n3;
                    ZJa_2 zJa_23 = b2;
                    zJa_23.Y.J();
                    Lz lz2 = zJa_23.aa.f(c222);
                    float f4 = (float)lz2.A;
                    float f5 = (float)lz2.j;
                    float f6 = (float)lz2.J;
                    if (a3222 != uqa.g) {
                        float a3222 = (f4 * NSa.B + f5 * Era.k + f6 * AQa.W) / QTa.G;
                        float f7 = (f4 * NSa.B + f5 * UOa.d) / QTa.G;
                        float f8 = (f4 * NSa.B + f6 * UOa.d) / QTa.G;
                        f4 = a3222;
                        f5 = f7;
                        f6 = f8;
                    }
                    float a3222 = cQa.w;
                    ZJa_2 zJa_24 = b2;
                    double d2 = (float)zJa_24.B + c222;
                    ZJa_2 zJa_25 = b2;
                    d2 = zJa_24.Ha.J().c + (zJa_25.Ha.J().la - b2.Ha.J().c) * (double)c222 + d2 * Yua.t;
                    double d3 = zJa_25.Ha.J().r + (b2.Ha.J().A - b2.Ha.J().r) * (double)c222;
                    int c222 = Oz.f((double)(d2 / fpa.r));
                    int a3222 = Oz.f((double)(d3 / fpa.r));
                    float c222 = zJa_24.aa.F.J() - f3 + bsa.Ka;
                    c222 += b2.Ha.z.Y * PRa.E;
                    float a3222 = (float)((d2 -= (double)(c222 * QSa.ba)) * yOa.Ga);
                    f3 = (float)((d3 -= (double)(a3222 * QSa.ba)) * yOa.Ga);
                    aKa2.J(XTa.W, mka.a);
                    int n4 = n3 = DQa.ja;
                    while (n4 < hra.Ja) {
                        int n5 = DQa.ja;
                        while (n5 < hra.Ja) {
                            int n6;
                            aKa aKa3 = aKa2;
                            aKa aKa4 = aKa2;
                            int n7 = n3;
                            aKa4.J((double)(n3 + uSa.E), (double)c222, (double)(n6 + fPa.i)).J((double)((float)(n7 + uSa.E) * cQa.w + a3222), (double)((float)(n6 + fPa.i) * cQa.w + f3)).J(f4, f5, f6, xSa.la).M();
                            int n8 = n3;
                            aKa4.J((double)(n7 + fPa.i), (double)c222, (double)(n6 + fPa.i)).J((double)((float)(n8 + fPa.i) * cQa.w + a3222), (double)((float)(n6 + fPa.i) * cQa.w + f3)).J(f4, f5, f6, xSa.la).M();
                            aKa3.J((double)(n8 + fPa.i), (double)c222, (double)(n6 + uSa.E)).J((double)((float)(n3 + fPa.i) * cQa.w + a3222), (double)((float)(n6 + uSa.E) * cQa.w + f3)).J(f4, f5, f6, xSa.la).M();
                            aKa aKa5 = aKa3.J((double)(n3 + uSa.E), (double)c222, (double)(n6 + uSa.E)).J((double)((float)(n3 + uSa.E) * cQa.w + a3222), (double)((float)(n6 + uSa.E) * cQa.w + f3));
                            aKa5.J(f4, f5, f6, xSa.la).M();
                            n5 = n6 += 32;
                        }
                        n4 = n3 += 32;
                    }
                    pKa2.J();
                    b2.Y.l();
                }
                b2.Y.f();
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                uKa.k();
                uKa.h();
            }
            if (Config.h()) {
                pA.n();
            }
        }
    }

    private void I() {
        ZJa_2 zJa_2 = this;
        if (Config.F()) {
            int a2;
            uKa.I();
            uKa.c();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            nLa.C();
            uKa.J(uSa.E != 0);
            zJa_2.r.J(c);
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            int n2 = a2 = uSa.E;
            while (n2 < uua.p) {
                uKa.e();
                if (a2 == vRa.d) {
                    uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
                if (a2 == uqa.g) {
                    uKa.J((float)kPa.Ha, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
                if (a2 == yRa.d) {
                    uKa.J((float)Hra.Ga, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                }
                if (a2 == AQa.P) {
                    uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                }
                if (a2 == tTa.h) {
                    uKa.J((float)kPa.Ha, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                }
                aKa aKa3 = aKa2;
                aKa3.J(XTa.W, mka.a);
                aKa3.J(wra.Ja, wra.Ja, wra.Ja).J(aSa.V, aSa.V).J(wra.P, wra.P, wra.P, osa.Ja).M();
                aKa3.J(wra.Ja, wra.Ja, fqa.W).J(aSa.V, Zta.ba).J(wra.P, wra.P, wra.P, osa.Ja).M();
                aKa3.J(fqa.W, wra.Ja, fqa.W).J(Zta.ba, Zta.ba).J(wra.P, wra.P, wra.P, osa.Ja).M();
                aKa3.J(fqa.W, wra.Ja, wra.Ja).J(Zta.ba, aSa.V).J(wra.P, wra.P, wra.P, osa.Ja).M();
                pKa2.J();
                uKa.D();
                n2 = ++a2;
            }
            uKa.J(vRa.d != 0);
            uKa.H();
            uKa.K();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, RY rY2, int n2, float f2) {
        XF c2;
        void b222;
        Object e2 = sx2;
        ZJa_2 d2 = this;
        if (b222 == false && ((RY)((Object)c2)).A == AY.BLOCK) {
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.f((float)JPa.N, (float)JPa.N, (float)JPa.N, (float)Xpa.R);
            uKa.C((float)kta.v);
            uKa.z();
            if (Config.h()) {
                pA.p();
            }
            uKa.J(uSa.E != 0);
            c2 = ((RY)((Object)c2)).J();
            Block b222 = d2.aa.J(c2).J();
            if (b222.J() != Material.air && d2.aa.J().J(c2)) {
                void a2;
                Block block = b222;
                block.J((I)d2.aa, c2);
                reference var5_6 = ((Sx)((Object)e2)).V + (((Sx)((Object)e2)).la - ((Sx)((Object)e2)).V) * (double)a2;
                Object object = e2;
                double d3 = ((Sx)((Object)e2)).Ga + (((Sx)((Object)object)).Z - ((Sx)((Object)e2)).Ga) * (double)a2;
                double d4 = ((Sx)((Object)object)).Ca + (((Sx)((Object)e2)).A - ((Sx)((Object)e2)).Ca) * (double)a2;
                ZJa_2.J(block.J((Gg)d2.aa, c2).f(Wqa.r, Wqa.r, Wqa.r).C((double)(-var5_6), -d3, -d4));
            }
            uKa.J(vRa.d != 0);
            uKa.H();
            if (Config.h()) {
                pA.X();
            }
            uKa.k();
        }
    }

    public Eoa J() {
        ZJa_2 a2;
        return a2.aa;
    }

    /*
     * WARNING - void declaration
     */
    public int J(ez ez2, double d2, int n2, vL vL2) {
        int n3;
        ZJa_2 e2 = ez2;
        ZJa_2 d3 = this;
        nLa.C();
        if (e2 == ez.TRANSLUCENT) {
            void a2;
            d3.Ha.U.J(BRa.fa);
            void v0 = a2;
            double d4 = v0.la - d3.K;
            double d5 = a2.Z - d3.R;
            double d6 = v0.A - d3.O;
            double d7 = d4;
            double d8 = d5;
            double d9 = d6;
            if (d7 * d7 + d8 * d8 + d9 * d9 > oua.i) {
                void v4 = a2;
                d3.K = v4.la;
                d3.R = v4.Z;
                d3.O = a2.A;
                int c2 = uSa.E;
                Iterator iterator = d3.X.iterator();
                d3.U.clear();
                while (iterator.hasNext()) {
                    Cja b2 = (Cja)iterator.next();
                    if (!b2.A.i.f((ez)e2) || c2++ >= Ypa.A) continue;
                    d3.U.add(b2.A);
                }
            }
            d3.Ha.U.f();
        }
        d3.Ha.U.J(kTa.t);
        int n4 = uSa.E;
        int n5 = e2 == ez.TRANSLUCENT ? vRa.d : uSa.E;
        int n6 = n5 != 0 ? d3.X.size() - vRa.d : uSa.E;
        int n7 = n5 != 0 ? pua.o : d3.X.size();
        int n8 = n5 != 0 ? pua.o : vRa.d;
        int n9 = n3 = n6;
        while (n9 != n7) {
            Cla c2 = ((Cja)d3.X.get((int)n3)).A;
            if (!c2.J().J((ez)e2)) {
                ++n4;
                d3.Ia.J(c2, (ez)e2);
            }
            n9 = n3 + n8;
        }
        if (n4 == 0) {
            d3.Ha.U.f();
            return n4;
        }
        if (Config.ia() && d3.Ha.R.Ka) {
            uKa.I();
        }
        ZJa_2 zJa_2 = d3;
        zJa_2.Ha.U.f(new StringBuilder().insert(3 >> 2, kqa.Y).append(e2).toString());
        zJa_2.J((ez)e2);
        d3.Ha.U.f();
        return n4;
    }

    public int C() {
        ZJa_2 a2;
        return a2.m.j.length;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(Collection collection, Collection collection2) {
        ZJa_2 zJa_2;
        ZJa_2 zJa_22 = zJa_2 = this;
        Set cfr_ignored_0 = zJa_22.l;
        Set c2 = zJa_22.l;
        synchronized (c2) {
            void a2;
            void b2;
            zJa_2.l.removeAll((Collection<?>)b2);
            zJa_2.l.addAll(a2);
            return;
        }
    }

    private void J(Iterator iterator) {
        Iterator b2 = iterator;
        ZJa_2 a2 = this;
        while (b2.hasNext()) {
            int n2 = ((bLa)b2.next()).J();
            if (a2.B - n2 <= hra.i) continue;
            b2.remove();
        }
    }

    static {
        s = LogManager.getLogger();
        k = new ResourceLocation(nQa.Z);
        A = new ResourceLocation(tTa.d);
        ea = new ResourceLocation(SPa.Ja);
        c = new ResourceLocation(Uta.N);
        a = new ResourceLocation(lTa.Ha);
        y = Collections.unmodifiableSet(new HashSet<DZ>(Arrays.asList(DZ.values())));
    }

    public int l() {
        ZJa_2 a2;
        return a2.v;
    }

    private void j() {
        ZJa_2 zJa_2 = this;
        pKa pKa2 = pKa.J();
        ZJa_2 a2 = pKa2.J();
        if (zJa_2.i != null) {
            zJa_2.i.l();
        }
        if (zJa_2.n >= 0) {
            xJa.J((int)zJa_2.n);
            zJa_2.n = pua.o;
        }
        if (zJa_2.ga) {
            ZJa_2 zJa_22 = a2;
            ZJa_2 zJa_23 = zJa_2;
            ZJa_2 zJa_24 = zJa_2;
            zJa_2.i = new bJa(zJa_2.ba);
            zJa_23.J((aKa)a2, Yra.i, uSa.E != 0);
            zJa_22.J();
            zJa_22.f();
            zJa_23.i.J(a2.J());
            return;
        }
        zJa_2.n = xJa.J((int)vRa.d);
        GL11.glNewList(zJa_2.n, Wqa.O);
        zJa_2.J((aKa)a2, Yra.i, uSa.E != 0);
        pKa2.J();
        GL11.glEndList();
    }

    public void F() {
        ZJa_2 zJa_2 = this;
        if (nka.R) {
            if (pIa.J() == null) {
                pIa.J();
            }
            ResourceLocation resourceLocation = new ResourceLocation(eua.s);
            try {
                zJa_2.h = new Qha(zJa_2.Ha.J(), zJa_2.Ha.J(), zJa_2.Ha.J(), resourceLocation);
                ZJa_2 zJa_22 = zJa_2;
                zJa_2.h.J(zJa_2.Ha.t, zJa_22.Ha.k);
                zJa_2.Fa = zJa_22.h.J(xqa.u);
                return;
            }
            catch (IOException a2) {
                s.warn(new StringBuilder().insert(3 ^ 3, CRa.E).append(resourceLocation).toString(), (Throwable)a2);
                ZJa_2 zJa_23 = zJa_2;
                zJa_23.h = null;
                zJa_23.Fa = null;
                return;
            }
            catch (JsonSyntaxException a2) {
                s.warn(new StringBuilder().insert(3 ^ 3, CRa.E).append(resourceLocation).toString(), (Throwable)a2);
                ZJa_2 zJa_24 = zJa_2;
                zJa_24.h = null;
                zJa_24.Fa = null;
                return;
            }
        }
        zJa_2.h = null;
        zJa_2.Fa = null;
    }

    private void k() {
        ZJa_2 zJa_2 = this;
        pKa pKa2 = pKa.J();
        ZJa_2 a2 = pKa2.J();
        if (zJa_2.Ga != null) {
            zJa_2.Ga.l();
        }
        if (zJa_2.b >= 0) {
            xJa.J((int)zJa_2.b);
            zJa_2.b = pua.o;
        }
        if (zJa_2.ga) {
            ZJa_2 zJa_22 = a2;
            ZJa_2 zJa_23 = zJa_2;
            ZJa_2 zJa_24 = zJa_2;
            zJa_2.Ga = new bJa(zJa_2.ba);
            zJa_23.J((aKa)a2);
            zJa_22.J();
            zJa_22.f();
            zJa_23.Ga.J(a2.J());
            return;
        }
        zJa_2.b = xJa.J((int)vRa.d);
        uKa.e();
        GL11.glNewList(zJa_2.b, Wqa.O);
        zJa_2.J((aKa)a2);
        pKa2.J();
        GL11.glEndList();
        uKa.D();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(Sx sx2, int n2, XF xF2, int n3) {
        void c2;
        Object e2 = sx2;
        ZJa_2 d2 = this;
        e2 = d2.aa.v;
        switch (c2) {
            case 1000: {
                void b2;
                d2.aa.J((XF)b2, kqa.B, pqa.r, pqa.r, uSa.E != 0);
                return;
            }
            case 1001: {
                void b2;
                d2.aa.J((XF)b2, kqa.B, pqa.r, pPa.c, uSa.E != 0);
                return;
            }
            case 1002: {
                void b2;
                d2.aa.J((XF)b2, EQa.R, pqa.r, pPa.c, uSa.E != 0);
                return;
            }
            case 1003: {
                void b2;
                d2.aa.J((XF)b2, FPa.u, pqa.r, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                return;
            }
            case 1004: {
                void b2;
                d2.aa.J((XF)b2, bRa.T, MQa.L, Zpa.o + (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * xSa.la, uSa.E != 0);
                return;
            }
            case 1005: {
                void a2;
                void b2;
                ZJa_2 zJa_2 = d2;
                if (eAa.l((int)a2) instanceof Aba) {
                    zJa_2.aa.J((XF)b2, kqa.L + ((Aba)eAa.l((int)a2)).I);
                    return;
                }
                zJa_2.aa.J((XF)b2, (String)null);
                return;
            }
            case 1006: {
                void b2;
                d2.aa.J((XF)b2, SOa.z, pqa.r, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                return;
            }
            case 1007: {
                void b2;
                d2.aa.J((XF)b2, ySa.Ga, FRa.Ga, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1008: {
                void b2;
                d2.aa.J((XF)b2, kta.C, FRa.Ga, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1009: {
                void b2;
                d2.aa.J((XF)b2, kta.C, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1010: {
                void b2;
                d2.aa.J((XF)b2, yta.K, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1011: {
                void b2;
                d2.aa.J((XF)b2, Pua.t, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1012: {
                void b2;
                d2.aa.J((XF)b2, Bta.t, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1014: {
                void b2;
                d2.aa.J((XF)b2, tTa.I, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1015: {
                void b2;
                d2.aa.J((XF)b2, bRa.e, Yqa.C, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1016: {
                void b2;
                d2.aa.J((XF)b2, aSa.G, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1017: {
                void b2;
                d2.aa.J((XF)b2, XTa.S, kta.v, (((Random)e2).nextFloat() - ((Random)e2).nextFloat()) * psa.N + pqa.r, uSa.E != 0);
                return;
            }
            case 1020: {
                void b2;
                d2.aa.J((XF)b2, csa.c, pqa.r, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                return;
            }
            case 1021: {
                void b2;
                d2.aa.J((XF)b2, pqa.G, pqa.r, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                return;
            }
            case 1022: {
                void b2;
                d2.aa.J((XF)b2, xua.W, bpa.K, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                return;
            }
            case 2000: {
                int n4;
                void a2;
                void b2;
                c2 = a2 % yRa.d - vRa.d;
                void var5_5 = a2 / yRa.d % yRa.d - vRa.d;
                void v1 = b2;
                double d3 = (double)v1.getX() + (double)c2 * oQa.fa + kTa.B;
                double d4 = (double)v1.getY() + kTa.B;
                double d5 = (double)v1.getZ() + (double)var5_5 * oQa.fa + kTa.B;
                int n5 = n4 = uSa.E;
                while (true) {
                    if (n5 >= NTa.C) {
                        return;
                    }
                    double d6 = ((Random)e2).nextDouble() * iSa.P + SPa.x;
                    double d7 = d3 + (double)c2 * SPa.x + (((Random)e2).nextDouble() - kTa.B) * (double)var5_5 * kTa.B;
                    double d8 = d4 + (((Random)e2).nextDouble() - kTa.B) * kTa.B;
                    double d9 = d5 + (double)var5_5 * SPa.x + (((Random)e2).nextDouble() - kTa.B) * (double)c2 * kTa.B;
                    double d10 = (double)c2 * d6 + ((Random)e2).nextGaussian() * SPa.x;
                    double d11 = uRa.ga + ((Random)e2).nextGaussian() * SPa.x;
                    double d12 = (double)var5_5 * d6 + ((Random)e2).nextGaussian() * SPa.x;
                    int n6 = 2 ^ 3;
                    d2.J(UZ.SMOKE_NORMAL, d7, d8, d9, d10, d11, d12, new int[uSa.E]);
                    n5 = ++n4;
                }
            }
            case 2001: {
                void a2;
                void b2;
                Block block = Block.f(a2 & qQa.Fa);
                if (block.J() != Material.air) {
                    d2.Ha.J().J((X)new PNa(new ResourceLocation(block.stepSound.l()), (block.stepSound.f() + pqa.r) / kta.v, block.stepSound.J() * xSa.la, (float)b2.getX() + MQa.L, (float)b2.getY() + MQa.L, (float)b2.getZ() + MQa.L));
                }
                d2.Ha.f.J((XF)b2, block.J(a2 >> lqa.s & osa.Ja));
                return;
            }
            case 2002: {
                int n7;
                int n8;
                void a2;
                void b2;
                void v4 = b2;
                double d13 = v4.getX();
                double d14 = v4.getY();
                double d15 = v4.getZ();
                int n9 = n8 = uSa.E;
                while (n9 < Yqa.i) {
                    int[] nArray = new int[uqa.g];
                    nArray[uSa.E] = eAa.J((eAa)Gea.aa);
                    nArray[vRa.d] = a2;
                    d2.J(UZ.ITEM_CRACK, d13, d14, d15, ((Random)e2).nextGaussian() * uSa.W, ((Random)e2).nextDouble() * iSa.P, ((Random)e2).nextGaussian() * uSa.W, nArray);
                    n9 = ++n8;
                }
                n8 = Gea.aa.f((int)a2);
                float f2 = (float)(n8 >> ERa.C & osa.Ja) / NQa.Y;
                float f3 = (float)(n8 >> Yqa.i & osa.Ja) / NQa.Y;
                float f4 = (float)(n8 >> uSa.E & osa.Ja) / NQa.Y;
                UZ uZ = UZ.SPELL;
                if (Gea.aa.J((int)a2)) {
                    uZ = UZ.SPELL_INSTANT;
                }
                int n10 = n7 = uSa.E;
                while (true) {
                    if (n10 >= ySa.T) {
                        d2.aa.J((XF)b2, JTa.d, pqa.r, d2.aa.v.nextFloat() * Nra.e + ATa.r, uSa.E != 0);
                        return;
                    }
                    Object object = e2;
                    double d16 = ((Random)object).nextDouble() * FPa.T;
                    double d17 = ((Random)object).nextDouble() * lQa.f * KPa.y;
                    double d18 = Math.cos(d17) * d16;
                    double d19 = SPa.x + ((Random)e2).nextDouble() * kTa.B;
                    double d20 = Math.sin(d17) * d16;
                    ska ska2 = d2.J(uZ.getParticleID(), uZ.getShouldIgnoreRange(), d13 + d18 * tpa.k, d14 + aQa.r, d15 + d20 * tpa.k, d18, d19, d20, new int[uSa.E]);
                    if (ska2 != null) {
                        float f5 = wOa.w + ((Random)e2).nextFloat() * rta.o;
                        ska ska3 = ska2;
                        ska3.f(f2 * f5, f3 * f5, f4 * f5);
                        ska3.f((float)d16);
                    }
                    n10 = ++n7;
                }
            }
            case 2003: {
                double d21;
                int n11;
                void b2;
                void v10 = b2;
                double d22 = (double)v10.getX() + kTa.B;
                double d23 = v10.getY();
                double d24 = (double)v10.getZ() + kTa.B;
                int n12 = n11 = uSa.E;
                while (n12 < Yqa.i) {
                    int[] nArray = new int[vRa.d];
                    nArray[uSa.E] = eAa.J((eAa)Gea.da);
                    d2.J(UZ.ITEM_CRACK, d22, d23, d24, ((Random)e2).nextGaussian() * uSa.W, ((Random)e2).nextDouble() * iSa.P, ((Random)e2).nextGaussian() * uSa.W, nArray);
                    n12 = ++n11;
                }
                double d25 = d21 = aSa.V;
                while (true) {
                    if (!(d25 < kPa.Z)) {
                        return;
                    }
                    ZJa_2 zJa_2 = d2;
                    zJa_2.J(UZ.PORTAL, d22 + Math.cos(d21) * DQa.S, d23 - Qqa.b, d24 + Math.sin(d21) * DQa.S, Math.cos(d21) * kpa.g, aSa.V, Math.sin(d21) * kpa.g, new int[uSa.E]);
                    zJa_2.J(UZ.PORTAL, d22 + Math.cos(d21) * DQa.S, d23 - Qqa.b, d24 + Math.sin(d21) * DQa.S, Math.cos(d21) * cPa.L, aSa.V, Math.sin(d21) * cPa.L, new int[uSa.E]);
                    d25 = d21 + Wqa.z;
                }
            }
            case 2004: {
                int n13;
                void b2;
                int n14 = n13 = uSa.E;
                while (true) {
                    if (n14 >= kTa.j) {
                        return;
                    }
                    void v16 = b2;
                    double d26 = (double)v16.getX() + kTa.B + ((double)d2.aa.v.nextFloat() - kTa.B) * KPa.y;
                    double d27 = (double)v16.getY() + kTa.B + ((double)d2.aa.v.nextFloat() - kTa.B) * KPa.y;
                    ZJa_2 zJa_2 = d2;
                    double d28 = (double)v16.getZ() + kTa.B + ((double)zJa_2.aa.v.nextFloat() - kTa.B) * KPa.y;
                    d2.aa.J(UZ.SMOKE_NORMAL, d26, d27, d28, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    int n15 = 3 >> 1;
                    zJa_2.aa.J(UZ.FLAME, d26, d27, d28, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                    n14 = ++n13;
                }
            }
            case 2005: {
                void a2;
                void b2;
                Vda.J((Gg)d2.aa, (XF)b2, (int)a2);
                return;
            }
        }
    }

    public void J(U u2) {
        ZJa_2 b2 = u2;
        ZJa_2 a2 = this;
        a2.i();
    }

    public void G() {
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2) {
        int n2;
        void a2;
        ZJa_2 zJa_2 = this;
        Random random = new Random(cQa.K);
        a2.J(XTa.W, mka.M);
        int n3 = n2 = uSa.E;
        while (n3 < LQa.v) {
            double d2;
            Random random2 = random;
            double d3 = random2.nextFloat() * kta.v - pqa.r;
            double d4 = random2.nextFloat() * kta.v - pqa.r;
            double d5 = random2.nextFloat() * kta.v - pqa.r;
            double d6 = VPa.i + random.nextFloat() * Nra.e;
            double d7 = d3;
            double d8 = d4;
            double d9 = d5;
            double d10 = d7 * d7 + d8 * d8 + d9 * d9;
            if (d2 < oua.i && d10 > SPa.x) {
                d10 = oua.i / Math.sqrt(d10);
                d3 *= d10;
                d4 *= d10;
                d5 *= d10;
                d10 = d3 * fqa.W;
                double d11 = d4 * fqa.W;
                double d12 = d5 * fqa.W;
                double d13 = Math.atan2(d3, d5);
                double d14 = Math.sin(d13);
                d13 = Math.cos(d13);
                double d15 = d3;
                double d16 = d5;
                d3 = Math.atan2(Math.sqrt(d15 * d15 + d16 * d16), d4);
                d4 = Math.sin(d3);
                d3 = Math.cos(d3);
                d5 = random.nextDouble() * lQa.f * KPa.y;
                double d17 = Math.sin(d5);
                d5 = Math.cos(d5);
                int n4 = uSa.E;
                while (n4 < AQa.P) {
                    int b2;
                    double d18 = (double)((b2 & uqa.g) - vRa.d) * d6;
                    double d19 = (double)((b2 + vRa.d & uqa.g) - vRa.d) * d6;
                    double d20 = d18 * d5 - d19 * d17;
                    d18 = d19 * d5 + d18 * d17;
                    d19 = d20 * d4 + aSa.V * d3;
                    d20 = aSa.V * d4 - d20 * d3;
                    double d21 = d20 * d14 - d18 * d13;
                    d18 = d18 * d14 + d20 * d13;
                    a2.J(d10 + d21, d11 + d19, d12 + d18).M();
                    n4 = ++b2;
                }
            }
            n3 = ++n2;
        }
    }

    public void D() {
        ZJa_2 a2;
        if (Config.h() && Keyboard.isKeyDown(tua.w) && Keyboard.isKeyDown(wOa.t)) {
            pA.J();
            pA.aa();
        }
        ZJa_2 zJa_2 = a2;
        zJa_2.B += vRa.d;
        if (zJa_2.B % kTa.j == 0) {
            ZJa_2 zJa_22 = a2;
            zJa_22.J(zJa_22.Da.values().iterator());
        }
    }

    public void f(XF xF2) {
        Object b22 = xF2;
        ZJa_2 a2 = this;
        Object object = b22;
        int b22 = object.getX();
        int n2 = object.getY();
        int n3 = object.getZ();
        a2.f(b22 - vRa.d, n2 - vRa.d, n3 - vRa.d, b22 + vRa.d, n2 + vRa.d, n3 + vRa.d);
    }

    public boolean J(double d2, double d3, double d4, float f2) {
        float f3 = f2;
        ZJa_2 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, double d2, eb eb2, int n2, boolean bl) {
        Object object;
        Cla cla2;
        Iterator iterator;
        Object object2;
        ALa c2;
        Object object3;
        void d3;
        double d4;
        double d5;
        double d6;
        ZJa_2 e2;
        Object f2;
        block36: {
            block35: {
                f2 = vL2;
                e2 = this;
                if (e2.Ha.z.kc != e2.f) {
                    e2.J();
                }
                e2.aa.H.J(ySa.F);
                ZJa_2 zJa_2 = f2;
                d6 = ((vL)zJa_2).la - e2.w;
                d5 = ((vL)f2).Z - e2.D;
                d4 = ((vL)zJa_2).A - e2.t;
                if (e2.V != ((vL)f2).N || e2.J != ((vL)f2).Ba || e2.g != ((vL)f2).L) break block35;
                double d7 = d6;
                double d8 = d5;
                double d9 = d4;
                if (!(d7 * d7 + d8 * d8 + d9 * d9 > Zta.ba)) break block36;
            }
            ZJa_2 zJa_2 = e2;
            ZJa_2 zJa_22 = f2;
            ZJa_2 zJa_23 = e2;
            ZJa_2 zJa_24 = f2;
            e2.w = ((vL)zJa_24).la;
            zJa_23.D = ((vL)zJa_24).Z;
            zJa_23.t = ((vL)f2).A;
            e2.V = ((vL)zJa_22).N;
            zJa_2.J = ((vL)zJa_22).Ba;
            zJa_2.g = ((vL)f2).L;
            e2.m.J(((vL)f2).la, ((vL)f2).A);
        }
        if (Config.J()) {
            vf.f((ZJa)e2);
        }
        ZJa_2 zJa_2 = e2;
        ZJa_2 zJa_25 = f2;
        ZJa_2 zJa_26 = e2;
        zJa_26.aa.H.f(Tpa.f);
        d6 = ((vL)f2).V + (((vL)f2).la - ((vL)f2).V) * d3;
        d5 = ((vL)zJa_25).Ga + (((vL)f2).Z - ((vL)f2).Ga) * d3;
        d4 = ((vL)zJa_25).Ca + (((vL)f2).A - ((vL)f2).Ca) * d3;
        zJa_26.Ia.J(d6, d5, d4);
        zJa_2.aa.H.f(aQa.Y);
        if (zJa_2.o != null) {
            object3 = new ALa(e2.o);
            object3.J(e2.Q.A, e2.Q.I, e2.Q.J);
            c2 = object3;
        }
        ZJa_2 zJa_27 = e2;
        zJa_27.Ha.U.f(FRa.s);
        object3 = new XF(d6, d5 + (double)f2.l(), d4);
        Cla cla3 = zJa_27.m.J((XF)((Object)object3));
        XF xF2 = new XF(Oz.f((double)(d6 / Zta.ba)) * ERa.C, Oz.f((double)(d5 / Zta.ba)) * ERa.C, Oz.f((double)(d4 / Zta.ba)) * ERa.C);
        zJa_27.W = zJa_27.W || !e2.j.isEmpty() || ((vL)f2).la != e2.I || ((vL)f2).Z != e2.Ea || ((vL)f2).A != e2.ia || (double)((vL)f2).d != e2.H || (double)((vL)f2).X != e2.Aa ? vRa.d : uSa.E;
        ZJa_2 zJa_28 = f2;
        ZJa_2 zJa_29 = e2;
        zJa_29.I = ((vL)f2).la;
        zJa_29.Ea = ((vL)f2).Z;
        e2.ia = ((vL)zJa_28).A;
        e2.H = ((vL)zJa_28).d;
        e2.Aa = ((vL)f2).X;
        int n3 = e2.o != null ? vRa.d : uSa.E;
        UD.K.f();
        if (pA.eA) {
            ZJa_2 zJa_210 = e2;
            zJa_210.X = zJa_210.ha;
            zJa_210.Ka = zJa_210.C;
            zJa_210.N = zJa_210.F;
            if (n3 == 0 && e2.W) {
                ZJa_2 zJa_211 = e2;
                zJa_211.X.clear();
                zJa_211.Ka.clear();
                zJa_211.N.clear();
                object2 = new Ig();
                ZJa_2 zJa_212 = e2;
                iterator = PA.J((Eoa)zJa_211.aa, (double)d3, (vL)f2, (int)zJa_212.f, (AJa)zJa_212.m);
                while (iterator.hasNext()) {
                    cla2 = (Cla)iterator.next();
                    if (cla2 == null) continue;
                    ((Ig)object2).J(cla2);
                    if (!cla2.i.J() || cla2.l()) {
                        e2.X.add(((Ig)object2).J());
                    }
                    object = cla2.J();
                    if (e2.aa.J((XF)((Object)object)).C) {
                        e2.Ka.add(((Ig)object2).J());
                    }
                    if (cla2.J().J().size() <= 0) continue;
                    e2.N.add(((Ig)object2).J());
                }
            }
        } else {
            ZJa_2 zJa_213 = e2;
            zJa_213.X = zJa_213.Z;
            zJa_213.Ka = zJa_213.G;
            zJa_213.N = zJa_213.S;
        }
        if (n3 == 0 && e2.W && !pA.eA) {
            void b2;
            DZ dZ2;
            Vector3f vector3f;
            int n4;
            ZJa_2 zJa_214 = e2;
            zJa_214.W = uSa.E;
            zJa_214.X.clear();
            zJa_214.Ka.clear();
            zJa_214.N.clear();
            zJa_214.ca.clear();
            object2 = zJa_214.ca;
            int n5 = zJa_214.Ha.Y;
            if (cla3 != null) {
                void a2;
                n4 = uSa.E;
                object = new Cja(cla3, (DZ)null, uSa.E, null);
                Set set = y;
                if (set.size() == vRa.d) {
                    vector3f = e2.J((vL)f2, (double)d3);
                    dZ2 = DZ.getFacingFromVector(vector3f.x, vector3f.y, vector3f.z).getOpposite();
                    set.remove((Object)dZ2);
                }
                if (set.isEmpty()) {
                    n4 = vRa.d;
                }
                if (n4 != 0 && a2 == false) {
                    e2.X.add(object);
                } else {
                    if (a2 != false && e2.aa.J((XF)((Object)object3)).J().g()) {
                        n5 = uSa.E;
                    }
                    cla3.J((int)b2);
                    object2.add(object);
                }
            } else {
                int n6;
                n4 = object3.getY() > 0 ? Lsa.L : Yqa.i;
                int n7 = n6 = -e2.f;
                while (n7 <= e2.f) {
                    int n8 = -e2.f;
                    while (n8 <= e2.f) {
                        vector3f = e2.m.J(new XF((n6 << AQa.P) + Yqa.i, n4, (n3 << AQa.P) + Yqa.i));
                        if (vector3f != null && c2.J(((Cla)vector3f).k)) {
                            vector3f.J((int)b2);
                            object2.add(new Cja((Cla)vector3f, (DZ)null, uSa.E, null));
                        }
                        n8 = ++n3;
                    }
                    n7 = ++n6;
                }
            }
            cla2 = DZ.values();
            int n9 = ((DZ[])cla2).length;
            while (!object2.isEmpty()) {
                Cja cja2 = (Cja)object2.poll();
                vector3f = cja2.A;
                dZ2 = cja2.J;
                Vector3f vector3f2 = vector3f;
                f2 = vector3f2.J();
                if (!((Cla)vector3f2).i.J() || vector3f.l()) {
                    e2.X.add(cja2);
                }
                if (e2.aa.J((XF)((Object)f2)).C) {
                    e2.Ka.add(cja2);
                }
                if (vector3f.J().J().size() > 0) {
                    e2.N.add(cja2);
                }
                int n10 = uSa.E;
                while (n10 < n9) {
                    DZ a2 = cla2[f2];
                    if ((n5 == 0 || !cja2.I.contains((Object)a2.getOpposite())) && (n5 == 0 || dZ2 == null || vector3f.J().J(dZ2.getOpposite(), a2)) && (cla3 = e2.J((XF)((Object)object3), (Cla)vector3f, a2)) != null && cla3.J((int)b2) && c2.J(cla3.k)) {
                        cla3 = new Cja(cla3, a2, cja2.k + vRa.d, vRa.d != 0);
                        cla3.I.addAll(cja2.I);
                        cla3.I.add(a2);
                        object2.add(cla3);
                    }
                    n10 = ++f2;
                }
            }
        }
        if (e2.u) {
            e2.J(d6, d5, d4);
            e2.u = uSa.E;
        }
        UD.K.J();
        if (pA.eA) {
            pA.U();
            return;
        }
        ZJa_2 zJa_215 = e2;
        zJa_215.M.J();
        object2 = zJa_215.j;
        zJa_215.j = Sets.newLinkedHashSet();
        iterator = zJa_215.X.iterator();
        UD.C.f();
        while (iterator.hasNext()) {
            cla2 = (Cla)iterator.next();
            Cla cla4 = cla2.A;
            if (!cla4.l() && !object2.contains(cla4)) continue;
            e2.W = vRa.d;
            if (e2.J(xF2, cla2.A)) {
                ZJa_2 zJa_216 = e2;
                if (!cla4.f()) {
                    zJa_216.L.add(cla4);
                    continue;
                }
                zJa_216.Ha.U.J(Vua.a);
                e2.M.J(cla4);
                cla4.J(uSa.E != 0);
                e2.Ha.U.f();
                continue;
            }
            e2.j.add(cla4);
        }
        UD.C.J();
        e2.j.addAll(object2);
        e2.Ha.U.f();
    }

    public void J(XF xF2) {
        Object b22 = xF2;
        ZJa_2 a2 = this;
        Object object = b22;
        int b22 = object.getX();
        int n2 = object.getY();
        int n3 = object.getZ();
        a2.f(b22 - vRa.d, n2 - vRa.d, n3 - vRa.d, b22 + vRa.d, n2 + vRa.d, n3 + vRa.d);
    }

    public void J(Sx sx2, String string, double d2, double d3, double d4, float f2, float f3) {
        float f4 = f3;
        ZJa_2 a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, float f2, boolean bl) {
        int n2;
        void c2;
        ZJa_2 zJa_2 = this;
        c2.J(XTa.W, mka.M);
        int n3 = n2 = uOa.ca;
        while (n3 <= qta.N) {
            int n4 = uOa.ca;
            while (n4 <= qta.N) {
                int d2;
                void b2;
                void a2;
                float f3 = n2;
                float f4 = n2 + ysa.s;
                if (a2 != false) {
                    f4 = n2;
                    f3 = n2 + ysa.s;
                }
                void v2 = c2;
                c2.J((double)f3, (double)b2, (double)d2).M();
                v2.J((double)f4, (double)b2, (double)d2).M();
                v2.J((double)f4, (double)b2, (double)(d2 + ysa.s)).M();
                int n5 = d2 + ysa.s;
                c2.J((double)f3, (double)b2, (double)n5).M();
                n4 = d2 += 64;
            }
            n3 = n2 += 64;
        }
    }

    public void A() {
        ZJa_2 a2;
        if (a2.J()) {
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)uSa.E, (int)vRa.d);
            ZJa_2 zJa_2 = a2;
            zJa_2.Fa.J(zJa_2.Ha.t, a2.Ha.k, uSa.E != 0);
            uKa.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        ZJa_2 zJa_2;
        (zJa_2 = this).o = new Vla();
        ((Vla)(zJa_2 = this).o).J();
        ZJa_2 d222 = new Uy(zJa_2.o.k);
        d222.transpose();
        Uy uy2 = new Uy(zJa_2.o.j);
        uy2.transpose();
        Uy uy3 = new Uy();
        Uy.mul((Matrix4f)uy2, (Matrix4f)((Object)d222), (Matrix4f)uy3);
        uy3.invert();
        ZJa_2 zJa_22 = zJa_2;
        zJa_22.Q.A = c2;
        zJa_22.Q.I = b2;
        zJa_22.Q.J = a2;
        zJa_22.Ma[uSa.E] = new Vector4f(vqa.T, vqa.T, vqa.T, pqa.r);
        zJa_22.Ma[vRa.d] = new Vector4f(pqa.r, vqa.T, vqa.T, pqa.r);
        zJa_22.Ma[uqa.g] = new Vector4f(pqa.r, pqa.r, vqa.T, pqa.r);
        zJa_22.Ma[yRa.d] = new Vector4f(vqa.T, pqa.r, vqa.T, pqa.r);
        zJa_22.Ma[AQa.P] = new Vector4f(vqa.T, vqa.T, pqa.r, pqa.r);
        zJa_22.Ma[tTa.h] = new Vector4f(pqa.r, vqa.T, pqa.r, pqa.r);
        zJa_22.Ma[uua.p] = new Vector4f(pqa.r, pqa.r, pqa.r, pqa.r);
        zJa_22.Ma[XTa.W] = new Vector4f(vqa.T, pqa.r, pqa.r, pqa.r);
        int d222 = uSa.E;
        int n2 = d222;
        while (n2 < Yqa.i) {
            Uy.transform((Matrix4f)uy3, (Vector4f)zJa_2.Ma[d222], (Vector4f)zJa_2.Ma[d222]);
            ZJa_2 zJa_23 = zJa_2;
            zJa_23.Ma[d222].x /= zJa_2.Ma[d222].w;
            ZJa_2 zJa_24 = zJa_2;
            zJa_23.Ma[d222].y /= zJa_24.Ma[d222].w;
            zJa_24.Ma[d222].z /= zJa_2.Ma[d222].w;
            zJa_23.Ma[d222++].w = pqa.r;
            n2 = d222;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(xy xy2, int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        aKa aKa2;
        int n6 = n5;
        xy a2 = xy2;
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        xy xy3 = a2;
        aKa aKa4 = aKa2;
        aKa2.J(yRa.d, mka.I);
        aKa4.J(a2.J, a2.j, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa4.J(a2.A, a2.j, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa2.J(xy3.A, a2.j, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa3.J(xy3.J, a2.j, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa3.J(a2.J, a2.j, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        pKa2.J();
        aKa aKa5 = aKa2;
        xy xy4 = a2;
        aKa aKa6 = aKa2;
        aKa2.J(yRa.d, mka.I);
        aKa6.J(a2.J, a2.M, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa6.J(a2.A, a2.M, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa2.J(xy4.A, a2.M, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa5.J(xy4.J, a2.M, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa5.J(a2.J, a2.M, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        pKa2.J();
        aKa aKa7 = aKa2;
        xy xy5 = a2;
        aKa aKa8 = aKa2;
        xy xy6 = a2;
        aKa aKa9 = aKa2;
        aKa2.J(vRa.d, mka.I);
        aKa9.J(a2.J, a2.j, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa9.J(a2.J, a2.M, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa2.J(xy6.A, a2.j, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa8.J(xy6.A, a2.M, a2.I).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa8.J(a2.A, a2.j, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa2.J(xy5.A, a2.M, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa7.J(xy5.J, a2.j, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        aKa7.J(a2.J, a2.M, a2.k).J((int)d2, (int)c2, (int)b2, (int)e2).M();
        pKa2.J();
    }

    private void i() {
        int a2;
        ZJa_2 zJa_2 = this;
        WKa wKa2 = zJa_2.Ha.J();
        int n2 = a2 = uSa.E;
        while (n2 < zJa_2.T.length) {
            int n3 = a2++;
            zJa_2.T[n3] = wKa2.J(Zpa.z + n3);
            n2 = a2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void f(int n2, XF xF2, int n3) {
        int d2 = n2;
        ZJa_2 c2 = this;
        switch (d2) {
            case 1013: 
            case 1018: {
                void b2;
                if (c2.Ha.J() == null) return;
                void v0 = b2;
                double d3 = (double)v0.getX() - c2.Ha.J().la;
                double d4 = (double)v0.getY() - c2.Ha.J().Z;
                ZJa_2 zJa_2 = c2;
                double d5 = (double)v0.getZ() - zJa_2.Ha.J().A;
                double d6 = d3;
                double d7 = d4;
                double d8 = d5;
                double d9 = Math.sqrt(d6 * d6 + d7 * d7 + d8 * d8);
                ZJa_2 zJa_22 = c2;
                double d10 = zJa_22.Ha.J().la;
                double d11 = zJa_22.Ha.J().Z;
                double d12 = zJa_2.Ha.J().A;
                if (d9 > aSa.V) {
                    d10 += d3 / d9 * KPa.y;
                    d11 += d4 / d9 * KPa.y;
                    d12 += d5 / d9 * KPa.y;
                }
                if (d2 == Lra.m) {
                    c2.aa.J(d10, d11, d12, Psa.ja, pqa.r, pqa.r, uSa.E != 0);
                    return;
                }
                c2.aa.J(d10, d11, d12, SRa.X, eua.C, pqa.r, uSa.E != 0);
                return;
            }
        }
    }

    public ZJa_2(Kpa kpa2) {
        ZJa_2 zJa_2;
        ZJa_2 b2 = kpa2;
        ZJa_2 a2 = this;
        a2.j = Sets.newLinkedHashSet();
        a2.X = Lists.newArrayListWithCapacity(Ypa.S);
        a2.l = Sets.newHashSet();
        a2.b = pua.o;
        a2.n = pua.o;
        a2.Ja = pua.o;
        a2.Da = Maps.newHashMap();
        a2.la = Maps.newHashMap();
        a2.T = new KLa[NTa.C];
        ZJa_2 zJa_22 = a2;
        zJa_22.w = bpa.J;
        zJa_22.D = bpa.J;
        zJa_22.t = bpa.J;
        zJa_22.V = ypa.L;
        zJa_22.J = ypa.L;
        zJa_22.g = ypa.L;
        zJa_22.I = bpa.J;
        zJa_22.Ea = bpa.J;
        zJa_22.ia = bpa.J;
        zJa_22.H = bpa.J;
        zJa_22.Aa = bpa.J;
        ZJa_2 zJa_23 = a2;
        zJa_22.M = new vja();
        zJa_22.f = pua.o;
        zJa_22.Ca = uqa.g;
        zJa_22.u = uSa.E;
        zJa_22.Ma = new Vector4f[Yqa.i];
        ZJa_2 zJa_24 = a2;
        ZJa_2 zJa_25 = a2;
        zJa_25.Q = new Py();
        zJa_25.ga = uSa.E;
        zJa_25.W = vRa.d;
        zJa_25.U = new LinkedHashSet();
        zJa_25.L = new LinkedHashSet();
        zJa_25.ca = new ArrayDeque();
        zJa_25.Ka = new ArrayList(ura.V);
        zJa_25.N = new ArrayList(ura.V);
        zJa_25.Z = new ArrayList(ura.V);
        zJa_25.G = new ArrayList(ura.V);
        zJa_25.S = new ArrayList(ura.V);
        zJa_25.ha = new ArrayList(ura.V);
        zJa_25.C = new ArrayList(ura.V);
        zJa_25.F = new ArrayList(ura.V);
        zJa_25.ja = uSa.E;
        zJa_25.p = uSa.E;
        zJa_25.Y = new bF((Kpa)b2);
        a2.Ha = b2;
        a2.fa = a2.Ha.J();
        zJa_24.r = b2.J();
        a2.r.J(a);
        GL11.glTexParameteri(BQa.Z, LQa.P, kTa.o);
        GL11.glTexParameteri(BQa.Z, pQa.n, kTa.o);
        uKa.C((int)uSa.E);
        zJa_24.i();
        zJa_24.ga = nka.J();
        if (zJa_24.ga) {
            zJa_2 = a2;
            a2.Ia = new Zla();
            a2.d = new Pja();
        } else {
            zJa_2 = a2;
            a2.Ia = new Tja();
            a2.d = new eka();
        }
        zJa_2.ba = new hKa();
        a2.ba.J(new gC(uSa.E, Yha.FLOAT, ZIa.POSITION, yRa.d));
        ZJa_2 zJa_26 = a2;
        zJa_26.k();
        zJa_26.j();
        zJa_26.g();
    }

    public void J(vL vL2, float f2) {
        ZJa_2 c222 = vL2;
        ZJa_2 b2 = this;
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        ZJa_2 zJa_2 = b2;
        PX pX2 = zJa_2.aa.J();
        double d2 = zJa_2.Ha.z.kc * ERa.C;
        if (((vL)c222).la >= pX2.i() - d2 || ((vL)c222).la <= pX2.J() + d2 || ((vL)c222).A >= pX2.d() - d2 || ((vL)c222).A <= pX2.e() + d2) {
            double d3;
            double d4;
            float a2;
            double d5 = oua.i - pX2.J((vL)c222) / d2;
            d5 = Math.pow(d5, FPa.T);
            ZJa_2 zJa_22 = c222;
            double d6 = ((vL)zJa_22).V + (((vL)c222).la - ((vL)c222).V) * (double)a2;
            ZJa_2 zJa_23 = c222;
            double d7 = ((vL)zJa_22).Ga + (((vL)zJa_23).Z - ((vL)c222).Ga) * (double)a2;
            double d8 = ((vL)zJa_23).Ca + (((vL)c222).A - ((vL)c222).Ca) * (double)a2;
            uKa.B();
            uKa.J((int)Lra.k, (int)vRa.d, (int)vRa.d, (int)uSa.E);
            b2.r.J(a);
            uKa.J(uSa.E != 0);
            uKa.e();
            int c222 = pX2.J().getID();
            a2 = (float)(c222 >> ERa.C & osa.Ja) / NQa.Y;
            float f3 = (float)(c222 >> Yqa.i & osa.Ja) / NQa.Y;
            float c222 = (float)(c222 & osa.Ja) / NQa.Y;
            uKa.f((float)a2, (float)f3, (float)c222, (float)((float)d5));
            uKa.J((float)TOa.p, (float)TOa.p);
            uKa.i();
            uKa.J((int)jRa.m, (float)Nra.e);
            uKa.K();
            uKa.m();
            c222 = (float)(Kpa.J() % tpa.Ja) / APa.O;
            aKa aKa3 = aKa2;
            aKa3.J(XTa.W, mka.A);
            aKa3.f(-d6, -d7, -d8);
            d5 = Math.max((double)Oz.f((double)(d8 - d2)), pX2.e());
            d7 = Math.min((double)Oz.J((double)(d8 + d2)), pX2.d());
            if (d6 > pX2.i() - d2) {
                a2 = JPa.N;
                double d9 = d4 = d5;
                while (d9 < d7) {
                    d3 = Math.min(oua.i, d7 - d4);
                    f3 = (float)d3 * MQa.L;
                    aKa aKa4 = aKa2;
                    PX pX3 = pX2;
                    aKa2.J(pX2.i(), ZSa.o, d4).J((double)(c222 + a2), (double)(c222 + JPa.N)).M();
                    aKa2.J(pX3.i(), ZSa.o, d4 + d3).J((double)(c222 + f3 + a2), (double)(c222 + JPa.N)).M();
                    aKa4.J(pX3.i(), aSa.V, d4 + d3).J((double)(c222 + f3 + a2), (double)(c222 + PRa.E)).M();
                    aKa4.J(pX2.i(), aSa.V, d4).J((double)(c222 + a2), (double)(c222 + PRa.E)).M();
                    a2 += MQa.L;
                    d9 = d4 += oua.i;
                }
            }
            if (d6 < pX2.J() + d2) {
                a2 = JPa.N;
                double d10 = d4 = d5;
                while (d10 < d7) {
                    d3 = Math.min(oua.i, d7 - d4);
                    f3 = (float)d3 * MQa.L;
                    aKa aKa5 = aKa2;
                    PX pX4 = pX2;
                    aKa2.J(pX2.J(), ZSa.o, d4).J((double)(c222 + a2), (double)(c222 + JPa.N)).M();
                    aKa2.J(pX4.J(), ZSa.o, d4 + d3).J((double)(c222 + f3 + a2), (double)(c222 + JPa.N)).M();
                    aKa5.J(pX4.J(), aSa.V, d4 + d3).J((double)(c222 + f3 + a2), (double)(c222 + PRa.E)).M();
                    aKa5.J(pX2.J(), aSa.V, d4).J((double)(c222 + a2), (double)(c222 + PRa.E)).M();
                    a2 += MQa.L;
                    d10 = d4 += oua.i;
                }
            }
            d5 = Math.max((double)Oz.f((double)(d6 - d2)), pX2.J());
            d7 = Math.min((double)Oz.J((double)(d6 + d2)), pX2.i());
            if (d8 > pX2.d() - d2) {
                a2 = JPa.N;
                double d11 = d4 = d5;
                while (d11 < d7) {
                    d3 = Math.min(oua.i, d7 - d4);
                    f3 = (float)d3 * MQa.L;
                    double d12 = d4;
                    aKa aKa6 = aKa2;
                    double d13 = d4;
                    aKa2.J(d13, ZSa.o, pX2.d()).J((double)(c222 + a2), (double)(c222 + JPa.N)).M();
                    aKa6.J(d13 + d3, ZSa.o, pX2.d()).J((double)(c222 + f3 + a2), (double)(c222 + JPa.N)).M();
                    aKa6.J(d4 + d3, aSa.V, pX2.d()).J((double)(c222 + f3 + a2), (double)(c222 + PRa.E)).M();
                    aKa2.J(d12, aSa.V, pX2.d()).J((double)(c222 + a2), (double)(c222 + PRa.E)).M();
                    d4 = d12 + oua.i;
                    a2 += MQa.L;
                    d11 = d4;
                }
            }
            if (d8 < pX2.e() + d2) {
                a2 = JPa.N;
                double d14 = d4 = d5;
                while (d14 < d7) {
                    d3 = Math.min(oua.i, d7 - d4);
                    f3 = (float)d3 * MQa.L;
                    double d15 = d4;
                    aKa aKa7 = aKa2;
                    double d16 = d4;
                    aKa2.J(d16, ZSa.o, pX2.e()).J((double)(c222 + a2), (double)(c222 + JPa.N)).M();
                    aKa7.J(d16 + d3, ZSa.o, pX2.e()).J((double)(c222 + f3 + a2), (double)(c222 + JPa.N)).M();
                    aKa7.J(d4 + d3, aSa.V, pX2.e()).J((double)(c222 + f3 + a2), (double)(c222 + PRa.E)).M();
                    aKa2.J(d15, aSa.V, pX2.e()).J((double)(c222 + a2), (double)(c222 + PRa.E)).M();
                    d4 = d15 + oua.i;
                    a2 += MQa.L;
                    d14 = d4;
                }
            }
            pKa2.J();
            aKa2.f(aSa.V, aSa.V, aSa.V);
            uKa.h();
            uKa.c();
            uKa.J((float)JPa.N, (float)JPa.N);
            uKa.U();
            uKa.K();
            uKa.k();
            uKa.D();
            uKa.J(vRa.d != 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void J(ez ez2) {
        ez b2 = ez2;
        ZJa_2 a2 = this;
        a2.Ha.R.i();
        if (nka.J()) {
            GL11.glEnableClientState(WSa.Ma);
            nka.J((int)nka.v);
            GL11.glEnableClientState(dQa.ia);
            nka.J((int)nka.P);
            GL11.glEnableClientState(dQa.ia);
            nka.J((int)nka.v);
            GL11.glEnableClientState(kqa.Ga);
        }
        if (Config.h()) {
            tA.f((ez)b2);
        }
        a2.Ia.J(b2);
        if (Config.h()) {
            tA.J((ez)b2);
        }
        if (nka.J()) {
            for (gC gC2 : mka.j.J()) {
                ZIa zIa = gC2.J();
                int n2 = gC2.l();
                switch (FJa.I[zIa.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(WSa.Ma);
                        break;
                    }
                    case 2: {
                        nka.J((int)(nka.v + n2));
                        GL11.glDisableClientState(dQa.ia);
                        nka.J((int)nka.v);
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState(kqa.Ga);
                        uKa.M();
                        break;
                    }
                }
            }
        }
        a2.Ha.R.D();
    }

    public void M() {
        ZJa_2 a2;
        ZJa_2 zJa_2 = a2;
        zJa_2.j.clear();
        zJa_2.M.f();
    }

    /*
     * WARNING - void declaration
     */
    public Cla J(Cla cla2, DZ dZ2) {
        void a2;
        Object c2 = cla2;
        ZJa_2 b2 = this;
        if (c2 == null) {
            return null;
        }
        c2 = c2.J((DZ)a2);
        return b2.m.J((XF)((Object)c2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(float f2, int n2) {
        int n3;
        float f3;
        float f4;
        float f5;
        int a2;
        float b2;
        ZJa_2 zJa_2;
        ZJa_2 zJa_22 = zJa_2 = this;
        zJa_22.Y.J(vRa.d != 0, zJa_2.B, b2);
        b2 = JPa.N;
        uKa.m();
        ZJa_2 zJa_23 = zJa_2;
        float c2 = (float)(zJa_22.Ha.J().Ga + (zJa_23.Ha.J().Z - zJa_2.Ha.J().Ga) * (double)b2);
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        double d2 = (float)zJa_23.B + b2;
        d2 = (zJa_22.Ha.J().c + (zJa_2.Ha.J().la - zJa_2.Ha.J().c) * (double)b2 + d2 * Yua.t) / hQa.x;
        double d3 = (zJa_22.Ha.J().r + (zJa_2.Ha.J().A - zJa_2.Ha.J().r) * (double)b2) / hQa.x + yta.h;
        c2 = zJa_22.aa.F.J() - c2 + bsa.Ka;
        c2 += zJa_2.Ha.z.Y * PRa.E;
        int n4 = Oz.f((double)(d2 / fpa.r));
        int n5 = Oz.f((double)(d3 / fpa.r));
        d2 -= (double)(n4 * QSa.ba);
        d3 -= (double)(n5 * QSa.ba);
        zJa_22.r.J(ea);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        Lz lz2 = zJa_22.aa.f(b2);
        b2 = (float)lz2.A;
        float f6 = (float)lz2.j;
        float f7 = (float)lz2.J;
        if (a2 != uqa.g) {
            f5 = (b2 * NSa.B + f6 * Era.k + f7 * AQa.W) / QTa.G;
            f4 = (b2 * NSa.B + f6 * UOa.d) / QTa.G;
            f3 = (b2 * NSa.B + f7 * UOa.d) / QTa.G;
            b2 = f5;
            f6 = f4;
            f7 = f3;
        }
        f5 = b2 * ATa.r;
        f4 = f6 * ATa.r;
        f3 = f7 * ATa.r;
        float f8 = b2 * ZSa.q;
        float f9 = f6 * ZSa.q;
        float f10 = f7 * ZSa.q;
        float f11 = b2 * xSa.la;
        float f12 = f6 * xSa.la;
        float f13 = f7 * xSa.la;
        float f14 = (float)Oz.f((double)d2) * KPa.Aa;
        float f15 = (float)Oz.f((double)d3) * KPa.Aa;
        double d4 = d2;
        float f16 = (float)(d4 - (double)Oz.f((double)d4));
        double d5 = d3;
        float f17 = (float)(d5 - (double)Oz.f((double)d5));
        uKa.l((float)Fua.Y, (float)pqa.r, (float)Fua.Y);
        int n6 = n3 = uSa.E;
        while (n6 < uqa.g) {
            ZJa_2 zJa_24;
            if (n3 == 0) {
                uKa.J(uSa.E != 0, uSa.E != 0, uSa.E != 0, uSa.E != 0);
                zJa_24 = zJa_2;
            } else {
                switch (a2) {
                    case 0: {
                        uKa.J(uSa.E != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
                        zJa_24 = zJa_2;
                        break;
                    }
                    case 1: {
                        uKa.J(vRa.d != 0, uSa.E != 0, uSa.E != 0, vRa.d != 0);
                        zJa_24 = zJa_2;
                        break;
                    }
                    case 2: {
                        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
                    }
                    default: {
                        zJa_24 = zJa_2;
                    }
                }
            }
            zJa_24.Y.f();
            n6 = ++n3;
        }
        if (zJa_2.Y.J()) {
            zJa_2.Y.J();
            int n7 = n3 = ERa.Ka;
            while (true) {
                int n8;
                if (n7 <= AQa.P) {
                    n8 = ERa.Ka;
                } else {
                    zJa_2.Y.l();
                    break;
                }
                while (n8 <= AQa.P) {
                    int n9;
                    aKa2.J(XTa.W, mka.D);
                    float f18 = n3 * Yqa.i;
                    float f19 = a2 * Yqa.i;
                    float f20 = f18 - f16;
                    float f21 = f19 - f17;
                    if (c2 > CRa.M) {
                        aKa aKa3 = aKa2;
                        float f22 = f20;
                        aKa2.J((double)(f20 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + Qsa.k)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f8, f9, f10, xSa.la).J(JPa.N, vqa.T, JPa.N).M();
                        aKa2.J((double)(f22 + Qsa.k), (double)(c2 + JPa.N), (double)(f21 + Qsa.k)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f8, f9, f10, xSa.la).J(JPa.N, vqa.T, JPa.N).M();
                        aKa3.J((double)(f22 + Qsa.k), (double)(c2 + JPa.N), (double)(f21 + JPa.N)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f8, f9, f10, xSa.la).J(JPa.N, vqa.T, JPa.N).M();
                        aKa3.J((double)(f20 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + JPa.N)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f8, f9, f10, xSa.la).J(JPa.N, vqa.T, JPa.N).M();
                    }
                    if (c2 <= eua.C) {
                        aKa aKa4 = aKa2;
                        float f23 = f20;
                        aKa2.J((double)(f20 + JPa.N), (double)(c2 + YSa.G - Era.t), (double)(f21 + Qsa.k)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(b2, f6, f7, xSa.la).J(JPa.N, pqa.r, JPa.N).M();
                        aKa2.J((double)(f23 + Qsa.k), (double)(c2 + YSa.G - Era.t), (double)(f21 + Qsa.k)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(b2, f6, f7, xSa.la).J(JPa.N, pqa.r, JPa.N).M();
                        aKa4.J((double)(f23 + Qsa.k), (double)(c2 + YSa.G - Era.t), (double)(f21 + JPa.N)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(b2, f6, f7, xSa.la).J(JPa.N, pqa.r, JPa.N).M();
                        aKa4.J((double)(f20 + JPa.N), (double)(c2 + YSa.G - Era.t), (double)(f21 + JPa.N)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(b2, f6, f7, xSa.la).J(JPa.N, pqa.r, JPa.N).M();
                    }
                    if (n3 > pua.o) {
                        int n10 = uSa.E;
                        while (n10 < Yqa.i) {
                            aKa aKa5 = aKa2;
                            float f24 = f20;
                            aKa2.J((double)(f20 + (float)n9 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + Qsa.k)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(vqa.T, JPa.N, JPa.N).M();
                            aKa2.J((double)(f24 + (float)n9 + JPa.N), (double)(c2 + YSa.G), (double)(f21 + Qsa.k)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(vqa.T, JPa.N, JPa.N).M();
                            aKa5.J((double)(f24 + (float)n9 + JPa.N), (double)(c2 + YSa.G), (double)(f21 + JPa.N)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(vqa.T, JPa.N, JPa.N).M();
                            aKa aKa6 = aKa5.J((double)(f20 + (float)n9 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + JPa.N)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la);
                            aKa6.J(vqa.T, JPa.N, JPa.N).M();
                            n10 = ++n9;
                        }
                    }
                    if (n3 <= vRa.d) {
                        int n11 = uSa.E;
                        while (n11 < Yqa.i) {
                            aKa aKa7 = aKa2;
                            float f25 = f20;
                            aKa2.J((double)(f20 + (float)n9 + pqa.r - Era.t), (double)(c2 + JPa.N), (double)(f21 + Qsa.k)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(pqa.r, JPa.N, JPa.N).M();
                            aKa2.J((double)(f25 + (float)n9 + pqa.r - Era.t), (double)(c2 + YSa.G), (double)(f21 + Qsa.k)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + Qsa.k) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(pqa.r, JPa.N, JPa.N).M();
                            aKa7.J((double)(f25 + (float)n9 + pqa.r - Era.t), (double)(c2 + YSa.G), (double)(f21 + JPa.N)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la).J(pqa.r, JPa.N, JPa.N).M();
                            aKa aKa8 = aKa7.J((double)(f20 + (float)n9 + pqa.r - Era.t), (double)(c2 + JPa.N), (double)(f21 + JPa.N)).J((double)((f18 + (float)n9 + MQa.L) * KPa.Aa + f14), (double)((f19 + JPa.N) * KPa.Aa + f15)).J(f5, f4, f3, xSa.la);
                            aKa8.J(pqa.r, JPa.N, JPa.N).M();
                            n11 = ++n9;
                        }
                    }
                    if (a2 > pua.o) {
                        int n12 = uSa.E;
                        while (n12 < Yqa.i) {
                            aKa aKa9 = aKa2;
                            float f26 = f20;
                            aKa2.J((double)(f20 + JPa.N), (double)(c2 + YSa.G), (double)(f21 + (float)n9 + JPa.N)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, vqa.T).M();
                            aKa2.J((double)(f26 + Qsa.k), (double)(c2 + YSa.G), (double)(f21 + (float)n9 + JPa.N)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, vqa.T).M();
                            aKa9.J((double)(f26 + Qsa.k), (double)(c2 + JPa.N), (double)(f21 + (float)n9 + JPa.N)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, vqa.T).M();
                            aKa aKa10 = aKa9.J((double)(f20 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + (float)n9 + JPa.N)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la);
                            aKa10.J(JPa.N, JPa.N, vqa.T).M();
                            n12 = ++n9;
                        }
                    }
                    if (a2 <= vRa.d) {
                        int n13 = uSa.E;
                        while (n13 < Yqa.i) {
                            aKa aKa11 = aKa2;
                            float f27 = f20;
                            aKa2.J((double)(f20 + JPa.N), (double)(c2 + YSa.G), (double)(f21 + (float)n9 + pqa.r - Era.t)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, pqa.r).M();
                            aKa2.J((double)(f27 + Qsa.k), (double)(c2 + YSa.G), (double)(f21 + (float)n9 + pqa.r - Era.t)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, pqa.r).M();
                            aKa11.J((double)(f27 + Qsa.k), (double)(c2 + JPa.N), (double)(f21 + (float)n9 + pqa.r - Era.t)).J((double)((f18 + Qsa.k) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la).J(JPa.N, JPa.N, pqa.r).M();
                            aKa aKa12 = aKa11.J((double)(f20 + JPa.N), (double)(c2 + JPa.N), (double)(f21 + (float)n9 + pqa.r - Era.t)).J((double)((f18 + JPa.N) * KPa.Aa + f14), (double)((f19 + (float)n9 + MQa.L) * KPa.Aa + f15)).J(f11, f12, f13, xSa.la);
                            aKa12.J(JPa.N, JPa.N, pqa.r).M();
                            n13 = ++n9;
                        }
                    }
                    pKa2.J();
                    n8 = ++a2;
                }
                n7 = ++n3;
            }
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.k();
        uKa.h();
    }

    public void f(vL vL2) {
        ZJa_2 b2 = vL2;
        ZJa_2 a2 = this;
        if (Config.J()) {
            vf.f((vL)b2, (ZJa)a2);
        }
    }

    public void e() {
        ZJa_2 a2;
        a2.Y.C();
    }

    /*
     * WARNING - void declaration
     */
    private Set J(XF xF2) {
        void a2;
        ZJa_2 zJa_2 = this;
        qla qla2 = new qla();
        XF b2 = new XF(a2.getX() >> AQa.P << AQa.P, a2.getY() >> AQa.P << AQa.P, a2.getZ() >> AQa.P << AQa.P);
        Faa faa2 = zJa_2.aa.J(b2);
        XF xF3 = b2;
        for (zz zz2 : XF.getAllInBoxMutable(xF3, xF3.add(Ypa.A, Ypa.A, Ypa.A))) {
            if (!faa2.J((XF)zz2).g()) continue;
            qla2.J((XF)zz2);
        }
        return qla2.J((XF)a2);
    }

    public void d() {
        a.W = vRa.d;
    }

    private void C() {
        uKa.c();
        uKa.J((float)JPa.N, (float)JPa.N);
        uKa.U();
        uKa.K();
        uKa.J(vRa.d != 0);
        uKa.D();
        if (Config.h()) {
            tA.g();
        }
    }

    public void J(Eoa eoa) {
        ZJa_2 b2 = eoa;
        ZJa_2 a2 = this;
        if (a2.aa != null) {
            a2.aa.J((Vb)a2);
        }
        a2.w = bpa.J;
        a2.D = bpa.J;
        a2.t = bpa.J;
        a2.V = ypa.L;
        a2.J = ypa.L;
        a2.g = ypa.L;
        ZJa_2 zJa_2 = b2;
        a2.fa.J((Gg)zJa_2);
        a2.aa = zJa_2;
        if (Config.J()) {
            vf.J();
        }
        if (b2 != null) {
            ZJa_2 zJa_22 = a2;
            b2.f(zJa_22);
            zJa_22.J();
        }
    }

    public void l() {
        ZJa_2 zJa_2 = this;
        for (Cja cja2 : zJa_2.X) {
            cja cja3 = cja2.A.J();
            if (cja3 == null || cja3.J()) continue;
            cja2.A.J(vRa.d != 0);
        }
    }

    public String f() {
        ZJa_2 a2;
        ZJa_2 zJa_2 = a2;
        return new StringBuilder().insert(3 >> 2, NPa.K).append(a2.E).append(WSa.f).append(a2.x).append(lTa.k).append(a2.P).append(VQa.t).append(zJa_2.x - zJa_2.P - a2.E).toString();
    }

    public void J(String string, double d2, double d3, double d4, float f2, float f3) {
        float f4 = f3;
        ZJa_2 a2 = this;
    }

    public int f() {
        ZJa_2 a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, boolean bl, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        void a2;
        void e2;
        void f2;
        void g2;
        void i2;
        boolean j222 = bl;
        ZJa_2 h2 = this;
        try {
            void b2;
            void c2;
            void d8;
            h2.J((int)i2, j222, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
            return;
        }
        catch (Throwable j222) {
            RIa j222 = RIa.J((Throwable)j222, (String)Ata.S);
            Dha d8 = j222.J(Bta.P);
            d8.J(lPa.V, (Object)((int)i2));
            if (a2 != null) {
                d8.J(Ora.Ga, (Object)a2);
            }
            d8.J(qsa.q, (Callable)new hla((ZJa)h2, (double)g2, (double)f2, (double)e2));
            throw new MZ(j222);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(UZ uZ, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        ZJa_2 i2 = uZ;
        ZJa_2 h2 = this;
        h2.J(i2.getParticleID(), i2.getShouldIgnoreRange(), (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF2, Cla cla2) {
        void b2;
        Object c2 = cla2;
        ZJa_2 a2 = this;
        c2 = c2.J();
        if (Oz.f((int)(b2.getX() - c2.getX())) > ERa.C) {
            return uSa.E != 0;
        }
        if (Oz.f((int)(b2.getY() - c2.getY())) > ERa.C) {
            return uSa.E != 0;
        }
        if (Oz.f((int)(b2.getZ() - c2.getZ())) <= ERa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f() {
        uKa.J((int)Qpa.Q, (int)tua.C, (int)vRa.d, (int)uSa.E);
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)MQa.L);
        uKa.J((float)TOa.p, (float)TOa.p);
        uKa.i();
        uKa.J((int)jRa.m, (float)Nra.e);
        uKa.K();
        uKa.e();
        if (Config.h()) {
            tA.A();
        }
    }

    /*
     * Exception decompiling
     */
    public void J(vL var1_1, eb var2_2, float var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 7[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void J(long l2) {
        Iterator a22;
        ZJa_2 zJa_2;
        Cla cla2;
        ZJa_2 zJa_22;
        block7: {
            long a22;
            zJa_22 = this;
            a22 = (long)((double)a22 + GPa.W);
            ZJa_2 zJa_23 = zJa_22;
            zJa_22.W |= zJa_23.M.J(a22);
            if (zJa_23.L.size() > 0) {
                Iterator iterator = a22 = zJa_22.L.iterator();
                while (iterator.hasNext()) {
                    cla2 = (Cla)a22.next();
                    if (!zJa_22.M.f(cla2)) {
                        zJa_2 = zJa_22;
                        break block7;
                    }
                    cla2.J(uSa.E != 0);
                    Iterator iterator2 = a22;
                    iterator = iterator2;
                    iterator2.remove();
                    zJa_22.j.remove(cla2);
                    zJa_22.U.remove(cla2);
                }
            }
            zJa_2 = zJa_22;
        }
        if (zJa_2.U.size() > 0 && (a22 = zJa_22.U.iterator()).hasNext() && zJa_22.M.l(cla2 = (Cla)a22.next())) {
            a22.remove();
        }
        int a22 = uSa.E;
        int n2 = Config.D();
        int n3 = n2 * uqa.g;
        Iterator b2 = zJa_22.j.iterator();
        while (b2.hasNext()) {
            Cla cla3 = (Cla)b2.next();
            if (!zJa_22.M.f(cla3)) {
                return;
            }
            cla3.J(uSa.E != 0);
            b2.remove();
            if (cla3.J().J() && n2 < n3) {
                ++n2;
            }
            if (++a22 < n2) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2) {
        ZJa_2 zJa_2 = this;
        if (zJa_2.Ha.Ta.F.J() == vRa.d) {
            zJa_2.I();
            return;
        }
        if (zJa_2.Ha.Ta.F.J()) {
            ZJa_2 zJa_22;
            double d2;
            float f3;
            float f4;
            float f5;
            int n3;
            int n4;
            float f6;
            float f7;
            void a22;
            void b2;
            uKa.z();
            boolean bl = Config.h();
            if (bl) {
                pA.p();
            }
            ZJa_2 zJa_23 = zJa_2;
            Lz lz2 = zJa_23.aa.J(zJa_23.Ha.J(), (float)b2);
            lz2 = XE.J((Lz)lz2, (I)zJa_2.Ha.Ta, (double)zJa_2.Ha.J().la, (double)(zJa_2.Ha.J().Z + oua.i), (double)zJa_2.Ha.J().A);
            if (bl) {
                pA.J(lz2);
            }
            Lz lz3 = lz2;
            float f8 = (float)lz3.A;
            float f9 = (float)lz3.j;
            float f10 = (float)lz3.J;
            if (a22 != uqa.g) {
                float f11 = (f8 * NSa.B + f9 * Era.k + f10 * AQa.W) / QTa.G;
                float f12 = (f8 * NSa.B + f9 * UOa.d) / QTa.G;
                float f13 = (f8 * NSa.B + f10 * UOa.d) / QTa.G;
                f8 = f11;
                f9 = f12;
                f10 = f13;
            }
            uKa.f((float)f8, (float)f9, (float)f10);
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            uKa.J(uSa.E != 0);
            uKa.d();
            if (bl) {
                pA.v();
            }
            uKa.f((float)f8, (float)f9, (float)f10);
            if (bl) {
                pA.e();
            }
            if (Config.F()) {
                if (zJa_2.ga) {
                    ZJa_2 zJa_24 = zJa_2;
                    zJa_24.i.f();
                    GL11.glEnableClientState(WSa.Ma);
                    GL11.glVertexPointer(yRa.d, JPa.la, lqa.s, nqa.i);
                    zJa_24.i.J(XTa.W);
                    zJa_24.i.J();
                    GL11.glDisableClientState(WSa.Ma);
                } else {
                    uKa.l((int)zJa_2.n);
                }
            }
            uKa.I();
            if (bl) {
                pA.O();
            }
            uKa.c();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            nLa.C();
            float[] fArray = zJa_2.aa.F.J(zJa_2.aa.e((float)b2), (float)b2);
            if (fArray != null && Config.W()) {
                uKa.z();
                if (bl) {
                    pA.p();
                }
                uKa.F((int)gua.X);
                uKa.e();
                uKa.J((float)ISa.a, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)(Oz.d((float)zJa_2.aa.d((float)b2)) < JPa.N ? Hra.Ga : JPa.N), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                uKa.J((float)ISa.a, (float)JPa.N, (float)JPa.N, (float)pqa.r);
                f7 = fArray[uSa.E];
                float c2 = fArray[vRa.d];
                float f14 = fArray[uqa.g];
                if (a22 != uqa.g) {
                    float f15 = (f7 * NSa.B + c2 * Era.k + f14 * AQa.W) / QTa.G;
                    float f16 = (f7 * NSa.B + c2 * UOa.d) / QTa.G;
                    f6 = (f7 * NSa.B + f14 * UOa.d) / QTa.G;
                    f7 = f15;
                    c2 = f16;
                    f14 = f6;
                }
                aKa aKa3 = aKa2;
                aKa3.J(uua.p, mka.I);
                aKa3.J(aSa.V, fqa.W, aSa.V).J(f7, c2, f14, fArray[yRa.d]).M();
                n4 = vRa.d;
                int n5 = n3 = uSa.E;
                while (n5 <= ERa.C) {
                    f6 = (float)n3 * pua.j * kta.v / Yra.i;
                    f5 = Oz.d((float)f6);
                    f4 = Oz.C((float)f6);
                    aKa2.J((double)(f5 * JQa.q), (double)(f4 * JQa.q), (double)(-f4 * ZRa.l * fArray[yRa.d])).J(fArray[uSa.E], fArray[vRa.d], fArray[uqa.g], JPa.N).M();
                    n5 = ++n3;
                }
                pKa2.J();
                uKa.D();
                uKa.F((int)Zra.f);
            }
            uKa.H();
            if (bl) {
                pA.X();
            }
            uKa.J((int)Lra.k, (int)vRa.d, (int)vRa.d, (int)uSa.E);
            uKa.e();
            f7 = pqa.r - zJa_2.aa.J((float)b2);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)f7);
            uKa.J((float)kPa.Ha, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            ZJa_2 zJa_25 = zJa_2;
            jg.J((Gg)zJa_25.aa, (aJa)zJa_25.r, (float)zJa_2.aa.e((float)b2), (float)f7);
            if (bl) {
                pA.ca();
            }
            uKa.J((float)(zJa_2.aa.e((float)b2) * CRa.ja), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            if (bl) {
                pA.Ca();
            }
            float c2 = NSa.B;
            if (Config.B()) {
                zJa_2.r.J(A);
                aKa aKa4 = aKa2;
                float f17 = c2;
                aKa2.J(XTa.W, mka.A);
                aKa2.J((double)(-f17), fqa.W, (double)(-c2)).J(aSa.V, aSa.V).M();
                aKa4.J((double)f17, fqa.W, (double)(-c2)).J(oua.i, aSa.V).M();
                aKa4.J((double)c2, fqa.W, (double)c2).J(oua.i, oua.i).M();
                aKa4.J((double)(-c2), fqa.W, (double)c2).J(aSa.V, oua.i).M();
                pKa2.J();
            }
            c2 = eta.e;
            if (Config.g()) {
                ZJa_2 zJa_26 = zJa_2;
                zJa_26.r.J(k);
                int n6 = zJa_26.aa.d();
                n4 = n6 % AQa.P;
                n3 = n6 / AQa.P % uqa.g;
                f6 = (float)(n4 + uSa.E) / YSa.G;
                f5 = (float)(n3 + uSa.E) / kta.v;
                f4 = (float)(n4 + vRa.d) / YSa.G;
                float a22 = (float)(n3 + vRa.d) / kta.v;
                aKa aKa5 = aKa2;
                float f18 = c2;
                aKa aKa6 = aKa2;
                aKa6.J(XTa.W, mka.A);
                aKa6.J((double)(-c2), wra.Ja, (double)c2).J((double)f4, (double)a22).M();
                aKa2.J((double)f18, wra.Ja, (double)c2).J((double)f6, (double)a22).M();
                aKa5.J((double)f18, wra.Ja, (double)(-c2)).J((double)f6, (double)f5).M();
                aKa5.J((double)(-c2), wra.Ja, (double)(-c2)).J((double)f4, (double)f5).M();
                pKa2.J();
            }
            uKa.z();
            if (bl) {
                pA.p();
            }
            float f19 = zJa_2.aa.l((float)b2) * f7;
            if (f3 > JPa.N && Config.K() && !jg.J((Gg)zJa_2.aa)) {
                float f20 = f19;
                uKa.f((float)f20, (float)f20, (float)f20, (float)f20);
                ZJa_2 zJa_27 = zJa_2;
                if (zJa_2.ga) {
                    zJa_27.Ga.f();
                    GL11.glEnableClientState(WSa.Ma);
                    GL11.glVertexPointer(yRa.d, JPa.la, lqa.s, nqa.i);
                    ZJa_2 zJa_28 = zJa_2;
                    zJa_28.Ga.J(XTa.W);
                    zJa_28.Ga.J();
                    GL11.glDisableClientState(WSa.Ma);
                } else {
                    uKa.l((int)zJa_27.b);
                }
            }
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.k();
            uKa.K();
            uKa.d();
            if (bl) {
                pA.v();
            }
            uKa.D();
            uKa.z();
            if (bl) {
                pA.p();
            }
            uKa.f((float)JPa.N, (float)JPa.N, (float)JPa.N);
            double d3 = zJa_2.Ha.c.f((float)b2).j - zJa_2.aa.J();
            if (d2 < aSa.V) {
                uKa.e();
                uKa.J((float)JPa.N, (float)Fua.Y, (float)JPa.N);
                ZJa_2 zJa_29 = zJa_2;
                if (zJa_2.ga) {
                    zJa_29.z.f();
                    GL11.glEnableClientState(WSa.Ma);
                    GL11.glVertexPointer(yRa.d, JPa.la, lqa.s, nqa.i);
                    ZJa_2 zJa_210 = zJa_2;
                    zJa_210.z.J(XTa.W);
                    zJa_210.z.J();
                    GL11.glDisableClientState(WSa.Ma);
                } else {
                    uKa.l((int)zJa_29.Ja);
                }
                uKa.D();
                f6 = pqa.r;
                f5 = -((float)(d3 + Xpa.o));
                f4 = vqa.T;
                aKa aKa7 = aKa2;
                aKa7.J(XTa.W, mka.I);
                aKa7.J(pqa.q, (double)f5, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, (double)f5, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, (double)f5, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, (double)f5, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, (double)f5, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, (double)f5, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, (double)f5, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, (double)f5, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(pqa.q, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, oua.i).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                aKa7.J(oua.i, pqa.q, pqa.q).J(uSa.E, uSa.E, uSa.E, osa.Ja).M();
                pKa2.J();
            }
            float f21 = f8;
            if (zJa_2.aa.F.d()) {
                uKa.f((float)(f21 * psa.N + Bta.G), (float)(f9 * psa.N + Bta.G), (float)(f10 * Ora.D + Nra.e));
                zJa_22 = zJa_2;
            } else {
                uKa.f((float)f21, (float)f9, (float)f10);
                zJa_22 = zJa_2;
            }
            if (zJa_22.Ha.z.kc <= AQa.P) {
                uKa.f((float)zJa_2.Ha.R.m, (float)zJa_2.Ha.R.F, (float)zJa_2.Ha.R.b);
            }
            uKa.e();
            uKa.J((float)JPa.N, (float)(-((float)(d3 - Zta.ba))), (float)JPa.N);
            if (Config.F()) {
                uKa.l((int)zJa_2.Ja);
            }
            uKa.D();
            uKa.H();
            if (bl) {
                pA.X();
            }
            uKa.J(vRa.d != 0);
        }
    }

    public int J() {
        ZJa_2 a2;
        return a2.X.size();
    }

    public static void J(xy xy2) {
        xy a2;
        xy xy3 = xy2;
        pKa pKa2 = pKa.J();
        xy xy4 = a2 = pKa2.J();
        xy xy5 = xy3;
        xy xy6 = a2;
        a2.J(yRa.d, mka.M);
        xy6.J(xy3.J, xy3.j, xy3.I).M();
        xy6.J(xy3.A, xy3.j, xy3.I).M();
        a2.J(xy5.A, xy3.j, xy3.k).M();
        xy4.J(xy5.J, xy3.j, xy3.k).M();
        xy4.J(xy3.J, xy3.j, xy3.I).M();
        pKa2.J();
        xy xy7 = a2;
        xy xy8 = xy3;
        xy xy9 = a2;
        a2.J(yRa.d, mka.M);
        xy9.J(xy3.J, xy3.M, xy3.I).M();
        xy9.J(xy3.A, xy3.M, xy3.I).M();
        a2.J(xy8.A, xy3.M, xy3.k).M();
        xy7.J(xy8.J, xy3.M, xy3.k).M();
        xy7.J(xy3.J, xy3.M, xy3.I).M();
        pKa2.J();
        xy xy10 = a2;
        xy xy11 = xy3;
        xy xy12 = a2;
        xy xy13 = xy3;
        xy xy14 = a2;
        a2.J(vRa.d, mka.M);
        xy14.J(xy3.J, xy3.j, xy3.I).M();
        xy14.J(xy3.J, xy3.M, xy3.I).M();
        a2.J(xy13.A, xy3.j, xy3.I).M();
        xy12.J(xy13.A, xy3.M, xy3.I).M();
        xy12.J(xy3.A, xy3.j, xy3.k).M();
        a2.J(xy11.A, xy3.M, xy3.k).M();
        xy10.J(xy11.J, xy3.j, xy3.k).M();
        xy10.J(xy3.J, xy3.M, xy3.k).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, int n4, int n5, int n6, int n7) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n8 = n7;
        ZJa_2 a2 = this;
        a2.m.J((int)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)g2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        int c2 = n3;
        ZJa_2 a2 = this;
        if (nka.R && a2.h != null) {
            void b2;
            a2.h.J((int)b2, c2);
        }
    }

    public String J() {
        ZJa_2 zJa_2 = this;
        int n2 = zJa_2.m.j.length;
        int n3 = uSa.E;
        Iterator a2 = zJa_2.X.iterator();
        while (a2.hasNext()) {
            cja cja2 = ((Cja)a2.next()).A.i;
            if (cja2 == cja.J || cja2.J()) continue;
            ++n3;
        }
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = n3;
        objectArray[vRa.d] = n2;
        objectArray[uqa.g] = zJa_2.Ha.Y ? ROa.q : Mqa.y;
        objectArray[yRa.d] = zJa_2.f;
        objectArray[AQa.P] = zJa_2.M.J();
        return String.format(kua.c, objectArray);
    }

    public boolean J() {
        if (!(Config.ha() || Config.h() || Config.ka())) {
            ZJa_2 a2;
            if (a2.Fa != null && a2.h != null && a2.Ha.c != null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public Cla J(XF xF2) {
        Object b2 = xF2;
        ZJa_2 a2 = this;
        return a2.m.J((XF)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, XF xF2) {
        PNa b2;
        void a2;
        ZJa_2 zJa_2 = this;
        Object c2 = (X)zJa_2.la.get(a2);
        if (c2 != null) {
            ZJa_2 zJa_22 = zJa_2;
            zJa_22.Ha.J().f((X)c2);
            zJa_22.la.remove(a2);
        }
        if (b2 != null) {
            c2 = Aba.J((String)b2);
            if (c2 != null) {
                zJa_2.Ha.Ya.J(((Aba)((Object)c2)).f());
            }
            c2 = null;
            if (null == null) {
                c2 = new ResourceLocation((String)b2);
            }
            b2 = PNa.J((ResourceLocation)c2, (float)a2.getX(), (float)a2.getY(), (float)a2.getZ());
            zJa_2.la.put(a2, b2);
            zJa_2.Ha.J().J((X)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(vL vL2, double d2) {
        void a22;
        ZJa_2 c22 = vL2;
        ZJa_2 b2 = this;
        ZJa_2 zJa_2 = c22;
        float f2 = (float)((double)((vL)c22).o + (double)(((vL)zJa_2).d - ((vL)c22).o) * a22);
        ZJa_2 zJa_22 = c22;
        float c22 = (float)((double)((vL)zJa_2).s + (double)(((vL)zJa_22).X - ((vL)zJa_22).s) * a22);
        if (Kpa.J().z.ld == uqa.g) {
            f2 += Hra.Ga;
        }
        float a22 = Oz.C((float)(-c22 * Bua.ga - pua.j));
        c22 = Oz.d((float)(-c22 * Bua.ga - pua.j));
        float f3 = -Oz.C((float)(-f2 * Bua.ga));
        f2 = Oz.d((float)(-f2 * Bua.ga));
        return new Vector3f(c22 * f3, f2, a22 * f3);
    }

    /*
     * WARNING - void declaration
     */
    private Cla J(XF xF2, Cla cla2, DZ dZ2) {
        void a22;
        Object d2 = cla2;
        ZJa_2 b2 = this;
        if ((d2 = d2.f((DZ)a22)).getY() >= 0 && d2.getY() < hra.Ja) {
            void c22;
            void v0 = c22;
            int c22 = Oz.f((int)(v0.getX() - d2.getX()));
            int a22 = Oz.f((int)(v0.getZ() - d2.getZ()));
            if (Config.ia()) {
                if (c22 > b2.ja || a22 > b2.ja) {
                    return null;
                }
            } else {
                int n2 = c22;
                int n3 = a22;
                if (n2 * n2 + n3 * n3 > b2.p) {
                    return null;
                }
            }
            return b2.m.J((XF)((Object)d2));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private ska J(int n2, boolean bl, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        int j2 = n2;
        ZJa_2 i2 = this;
        if (i2.Ha != null && i2.Ha.J() != null && i2.Ha.f != null) {
            void a2;
            void b2;
            void c2;
            void d8;
            void h22;
            void e2;
            void f2;
            void g2;
            int n3 = i2.Ha.z.kB;
            if (n3 == vRa.d && i2.aa.v.nextInt(yRa.d) == 0) {
                n3 = uqa.g;
            }
            ZJa_2 zJa_2 = i2;
            double d9 = zJa_2.Ha.J().la - g2;
            double d10 = zJa_2.Ha.J().Z - f2;
            double d11 = zJa_2.Ha.J().A - e2;
            if (j2 == UZ.EXPLOSION_HUGE.getParticleID() && !Config.H()) {
                return null;
            }
            if (j2 == UZ.EXPLOSION_LARGE.getParticleID() && !Config.H()) {
                return null;
            }
            if (j2 == UZ.EXPLOSION_NORMAL.getParticleID() && !Config.H()) {
                return null;
            }
            if (j2 == UZ.SUSPENDED.getParticleID() && !Config.I()) {
                return null;
            }
            if (j2 == UZ.SUSPENDED_DEPTH.getParticleID() && !Config.da()) {
                return null;
            }
            if (j2 == UZ.SMOKE_NORMAL.getParticleID() && !Config.M()) {
                return null;
            }
            if (j2 == UZ.SMOKE_LARGE.getParticleID() && !Config.M()) {
                return null;
            }
            if (j2 == UZ.SPELL_MOB.getParticleID() && !Config.Ka()) {
                return null;
            }
            if (j2 == UZ.SPELL_MOB_AMBIENT.getParticleID() && !Config.Ka()) {
                return null;
            }
            if (j2 == UZ.SPELL.getParticleID() && !Config.Ka()) {
                return null;
            }
            if (j2 == UZ.SPELL_INSTANT.getParticleID() && !Config.Ka()) {
                return null;
            }
            if (j2 == UZ.SPELL_WITCH.getParticleID() && !Config.Ka()) {
                return null;
            }
            if (j2 == UZ.PORTAL.getParticleID() && !Config.ga()) {
                return null;
            }
            if (j2 == UZ.FLAME.getParticleID() && !Config.X()) {
                return null;
            }
            if (j2 == UZ.REDSTONE.getParticleID() && !Config.l()) {
                return null;
            }
            if (j2 == UZ.DRIP_WATER.getParticleID() && !Config.k()) {
                return null;
            }
            if (j2 == UZ.DRIP_LAVA.getParticleID() && !Config.k()) {
                return null;
            }
            if (j2 == UZ.FIREWORKS_SPARK.getParticleID() && !Config.Ea()) {
                return null;
            }
            if (h22 != false) {
                return i2.Ha.f.J(j2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
            }
            double d12 = ZSa.o;
            if (j2 == UZ.CRIT.getParticleID()) {
                d12 = gQa.Ga;
            }
            double d13 = d9;
            double d14 = d10;
            double d15 = d11;
            if (d13 * d13 + d14 * d14 + d15 * d15 > d12) {
                return null;
            }
            if (n3 > vRa.d) {
                return null;
            }
            ska h22 = i2.Ha.f.J(j2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2);
            if (j2 == UZ.WATER_BUBBLE.getParticleID()) {
                XE.J((ska)h22, (I)i2.aa, (double)g2, (double)f2, (double)e2);
            }
            if (j2 == UZ.WATER_SPLASH.getParticleID()) {
                XE.J((ska)h22, (I)i2.aa, (double)g2, (double)f2, (double)e2);
            }
            if (j2 == UZ.WATER_DROP.getParticleID()) {
                XE.J((ska)h22, (I)i2.aa, (double)g2, (double)f2, (double)e2);
            }
            if (j2 == UZ.TOWN_AURA.getParticleID()) {
                XE.J((ska)h22);
            }
            if (j2 == UZ.PORTAL.getParticleID()) {
                XE.f((ska)h22);
            }
            if (j2 == UZ.REDSTONE.getParticleID()) {
                XE.f((ska)h22, (I)i2.aa, (double)g2, (double)f2, (double)e2);
            }
            return h22;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        ZJa_2 zJa_2 = this;
        if (zJa_2.aa != null) {
            boolean bl;
            Object object;
            zJa_2.W = vRa.d;
            QFa.vd.J(Config.la());
            QFa.Z.J(Config.la());
            Iterator a322 = Block.blockRegistry.iterator();
            while (a322.hasNext()) {
                object = (Block)a322.next();
                if (!(object instanceof BlockCustomLeaves)) continue;
                ((BlockCustomLeaves)object).J(Config.la());
            }
            Kja.J();
            if (Config.J()) {
                vf.J();
            }
            ZJa_2 zJa_22 = zJa_2;
            zJa_22.f = zJa_22.Ha.z.kc;
            zJa_22.ja = zJa_22.f * ERa.C;
            zJa_22.p = zJa_22.ja * zJa_2.ja;
            boolean a322 = zJa_22.ga;
            zJa_22.ga = nka.J();
            if (a322 && !zJa_2.ga) {
                bl = a322;
                ZJa_2 zJa_23 = zJa_2;
                zJa_23.Ia = new Tja();
                zJa_23.d = new eka();
            } else {
                if (!a322 && zJa_2.ga) {
                    ZJa_2 zJa_24 = zJa_2;
                    zJa_24.Ia = new Zla();
                    zJa_24.d = new Pja();
                }
                bl = a322;
            }
            if (bl != zJa_2.ga) {
                ZJa_2 zJa_25 = zJa_2;
                zJa_25.k();
                zJa_25.j();
                zJa_25.g();
            }
            if (zJa_2.m != null) {
                zJa_2.m.J();
            }
            ZJa_2 zJa_26 = zJa_2;
            zJa_26.M();
            object = zJa_26.l;
            Set a322 = zJa_26.l;
            synchronized (a322) {
                zJa_2.l.clear();
            }
            ZJa_2 zJa_27 = zJa_2;
            ZJa_2 zJa_28 = zJa_2;
            zJa_2.m = new AJa((Gg)zJa_27.aa, zJa_27.Ha.z.kc, (ZJa)zJa_28, zJa_28.d);
            if (zJa_2.aa != null && (a322 = zJa_2.Ha.J()) != null) {
                zJa_2.m.J(((vL)a322).la, ((vL)a322).A);
            }
            zJa_2.Ca = uqa.g;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, XF xF2, int n3) {
        void c2;
        void a2;
        ZJa_2 zJa_2 = this;
        if (a2 >= 0 && a2 < NTa.C) {
            void b2;
            Object d2 = (bLa)zJa_2.Da.get((int)c2);
            if (d2 == null || ((bLa)d2).J().getX() != b2.getX() || ((bLa)d2).J().getY() != b2.getY() || ((bLa)d2).J().getZ() != b2.getZ()) {
                d2 = new bLa((int)c2, (XF)b2);
                zJa_2.Da.put((int)c2, d2);
            }
            ((bLa)d2).f((int)a2);
            ((bLa)d2).J(zJa_2.B);
            return;
        }
        zJa_2.Da.remove((int)c2);
    }

    public void J(vL vL2) {
        ZJa_2 b2 = vL2;
        ZJa_2 a2 = this;
        Se.J((vL)b2, (Gg)a2.aa);
        if (Config.J()) {
            vf.J((vL)b2, (ZJa)a2);
        }
    }
}

