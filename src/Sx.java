/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  CY
 *  DQa
 *  Dc
 *  ERa
 *  Ega
 *  Fpa
 *  Gg
 *  Gl
 *  HA
 *  Hda
 *  ISa
 *  JPa
 *  Kpa
 *  LEa
 *  LGa
 *  LQa
 *  Lra
 *  Lz
 *  MFa
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  OCa
 *  Oz
 *  PIa
 *  PTa
 *  QFa
 *  RQa
 *  Rea
 *  SQa
 *  Sqa
 *  Ssa
 *  Tpa
 *  Tz
 *  UZ
 *  VEa
 *  Vua
 *  Vz
 *  WQa
 *  WSa
 *  WTa
 *  Waa
 *  Wda
 *  XTa
 *  Yaa
 *  Yea
 *  Yfa
 *  Ypa
 *  Yra
 *  ZOa
 *  Zb
 *  Zta
 *  aQa
 *  aSa
 *  aX
 *  aaa
 *  bFa
 *  bpa
 *  bqa
 *  bua
 *  cQa
 *  cRa
 *  caa
 *  eAa
 *  gEa
 *  gZ
 *  hqa
 *  ica
 *  jFa
 *  jea
 *  kGa
 *  kea
 *  kta
 *  ld
 *  mca
 *  pda
 *  pqa
 *  psa
 *  pua
 *  qEa
 *  qca
 *  tda
 *  uRa
 *  uX
 *  uf
 *  ufa
 *  vL
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  waa
 *  wra
 *  xA
 *  xba
 *  xy
 *  yra
 *  zda
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Sx
extends Gl {
    public int Aa;
    public float S;
    public float Z;
    public double Y;
    private MFa V;
    public XF z;
    public int X;
    public float y;
    private int t;
    public boolean R;
    private XF N;
    private XF T;
    public double p;
    public float n;
    public Ega x;
    private int v;
    public double o;
    public LEa h;
    public kea K;
    public int H;
    public float c;
    public double B;
    private int d;
    private final GameProfile l;
    public uX e;
    public Ega G;
    private int D;
    private boolean F;
    private Mda g;
    private boolean L;
    public Fga E;
    public final uf m;
    public double C;
    public double k;
    public int j;
    public float A;

    public float l() {
        Sx sx2 = this;
        float a2 = FRa.ja;
        if (sx2.p()) {
            a2 = psa.N;
        }
        if (sx2.q()) {
            a2 -= UOa.W;
        }
        return a2;
    }

    public void J(vL vL2, int n2) {
        Collection collection;
        Iterator b2;
        Sx a2;
        int c22 = n2;
        Sx sx2 = a2 = this;
        sx2.j(c22);
        Collection c22 = sx2.J().J(lb.J);
        if (b2 instanceof Sx) {
            a2.J(Tz.p);
            Collection collection2 = c22;
            c22.addAll(a2.J().J(lb.i));
            collection = collection2;
            collection2.addAll(a2.J((vL)b2));
        } else {
            a2.J(Tz.N);
            collection = c22;
        }
        Iterator iterator = b2 = collection.iterator();
        while (iterator.hasNext()) {
            c22 = (ica)b2.next();
            iterator = b2;
            a2.J().J(a2.J(), (ica)c22).J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2) {
        void b2;
        Sx c2 = mda2;
        Sx a2 = this;
        if (b2 >= 0 && b2 < a2.K.j.length) {
            a2.K.J((int)b2, (Mda)c2);
            return vRa.d != 0;
        }
        void var4_3 = b2 - ySa.T;
        if (var4_3 >= 0 && var4_3 < a2.K.A.length) {
            void var3_4 = var4_3 + vRa.d;
            if (c2 != null && c2.J() != null && (c2.J() instanceof VEa ? Yfa.J((Mda)c2) != var3_4 : var3_4 != AQa.P || c2.J() != Gea.GB && !(c2.J() instanceof kda))) {
                return uSa.E != 0;
            }
            a2.K.J((int)(var4_3 + a2.K.j.length), (Mda)c2);
            return vRa.d != 0;
        }
        void var3_5 = b2 - ZOa.x;
        if (var3_5 >= 0 && var3_5 < a2.V.f()) {
            a2.V.J((int)var3_5, (Mda)c2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(pda pda2) {
        Sx b2 = pda2;
        Sx a2 = this;
        if ((a2.J().J(NTa.C) & b2.getPartMask()) == b2.getPartMask()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J(int n2) {
        int b2 = n2;
        Sx a2 = this;
        if (b2 > AQa.P) {
            return yra.u;
        }
        return XOa.F;
    }

    public boolean J(Block block) {
        Object b2 = block;
        Sx a2 = this;
        return a2.K.J((Block)b2);
    }

    public boolean V() {
        Sx a2;
        if (a2.g != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        Sx a2 = this;
        if (!a2.J((gZ)b2)) {
            if (!b2.d() && a2.x() && c2 > JPa.N) {
                c2 = (pqa.r + c2) * MQa.L;
            }
            Sx sx2 = a2;
            Sx sx3 = a2;
            c2 = sx3.J((gZ)b2, c2);
            float f3 = c2 = sx2.f((gZ)b2, c2);
            c2 = Math.max(c2 - a2.A(), JPa.N);
            sx2.i(sx3.A() - (f3 - c2));
            if (c2 != JPa.N) {
                Sx sx4 = a2;
                sx4.D(b2.J());
                f3 = sx4.f();
                sx4.A(sx4.f() - c2);
                sx4.J().J((gZ)b2, f3, c2);
                if (c2 < cRa.d) {
                    a2.J(Tz.w, Math.round(c2 * FRa.Ga));
                }
            }
        }
    }

    public MFa J() {
        Sx a2;
        return a2.V;
    }

    /*
     * WARNING - void declaration
     */
    public void j(int n2) {
        void a2;
        Sx sx2;
        Sx sx3 = sx2 = this;
        int b2 = sx3.g();
        sx3.aa.J(yOa.B, Integer.valueOf(b2 + a2));
    }

    public String M() {
        return RQa.c;
    }

    public void J(gZ gZ2) {
        Sx sx2;
        Sx a2;
        Sx b2 = gZ2;
        Sx sx3 = a2 = this;
        super.J((gZ)b2);
        sx3.l(psa.N, psa.N);
        sx3.l(sx3.la, a2.Z, a2.A);
        sx3.J(Tqa.Ia);
        if (sx3.J().equals(hqa.J)) {
            a2.J(new Mda(Gea.Mb, vRa.d), vRa.d != 0, uSa.E != 0);
        }
        if (!a2.j.J().f(STa.b)) {
            a2.K.J();
        }
        if (b2 != null) {
            Sx sx4 = a2;
            sx2 = sx4;
            Sx sx5 = a2;
            sx4.f(-Oz.C((float)((sx4.k + sx5.X) * pua.j / Hra.Ga)) * Nra.e);
            sx4.l(-Oz.d((float)((sx5.k + a2.X) * pua.j / Hra.Ga)) * Nra.e);
        } else {
            Sx sx6 = a2;
            sx2 = sx6;
            sx6.f(aSa.V);
            sx6.l(aSa.V);
        }
        sx2.J(Tz.K);
        a2.f(Tz.Y);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF, boolean bl) {
        Object c2 = xF;
        Sx b2 = this;
        if (c2 != null) {
            void a2;
            Sx sx2 = b2;
            sx2.T = c2;
            sx2.L = a2;
            return;
        }
        Sx sx3 = b2;
        sx3.T = null;
        sx3.L = uSa.E;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float F() {
        Sx sx2 = this;
        if (sx2.z != null) {
            Sx sx3 = sx2;
            Object a2 = sx3.j.J(sx3.z);
            if (a2.J() != QFa.Pd) {
                return sx2.X;
            }
            a2 = a2.J(BlockDirectional.FACING);
            switch (FFa.I[((Enum)a2).ordinal()]) {
                case 1: {
                    return ISa.a;
                }
                case 2: {
                    return zta.B;
                }
                case 3: {
                    return JPa.N;
                }
                case 4: {
                    return Hra.Ga;
                }
            }
        }
        return JPa.N;
    }

    public int J(Sx sx2) {
        Sx b22 = sx2;
        Sx a2 = this;
        if (a2.j.J().f(STa.b)) {
            return uSa.E;
        }
        int b22 = a2.j * XTa.W;
        if (b22 > ySa.T) {
            return ySa.T;
        }
        return b22;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Sx a2 = this;
        return a2.K.l(b2);
    }

    public qca J() {
        Sx a2;
        return a2.j.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, boolean bl) {
        Sx sx3;
        void a2;
        Sx c2 = sx2;
        Sx b2 = this;
        if (a2 != false) {
            sx3 = b2;
            Sx sx4 = c2;
            Sx sx5 = c2;
            Sx sx6 = b2;
            Sx sx7 = c2;
            b2.K.J(c2.K);
            b2.A(sx7.f());
            sx6.e = sx7.e;
            sx6.j = c2.j;
            b2.Aa = sx5.Aa;
            b2.A = sx5.A;
            b2.G(c2.g());
            b2.ia = sx4.ia;
            b2.q = sx4.q;
            b2.x = c2.x;
        } else {
            if (b2.j.J().f(STa.b)) {
                Sx sx8 = c2;
                b2.K.J(c2.K);
                b2.j = c2.j;
                b2.Aa = sx8.Aa;
                b2.A = sx8.A;
                b2.G(c2.g());
            }
            sx3 = b2;
        }
        sx3.t = c2.t;
        b2.V = c2.V;
        b2.J().J(NTa.C, Byte.valueOf(c2.J().J(NTa.C)));
    }

    public void q() {
        Sx a2;
        Sx sx2 = a2;
        super.q();
        sx2.J(Tz.j);
        if (sx2.j()) {
            a2.D(xSa.la);
            return;
        }
        a2.D(psa.N);
    }

    public void g() {
        Sx sx2 = this;
        if (!sx2.j.e && sx2.q()) {
            sx2.l(null);
            sx2.i(uSa.E != 0);
            return;
        }
        Sx sx3 = sx2;
        double d2 = sx3.la;
        float f2 = sx3.Z;
        float f3 = sx3.A;
        int n2 = sx3.X;
        int a2 = sx3.d;
        super.g();
        sx3.Z = sx3.S;
        sx3.S = JPa.N;
        sx3.M(sx3.la - d2, sx2.Z - f2, sx2.A - f3);
        if (sx3.ja instanceof zda) {
            Sx sx4 = sx2;
            sx2.d = a2;
            sx4.X = n2;
            sx4.ba = ((zda)sx2.ja).ba;
        }
    }

    public void k(vL object) {
        Sx b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public float J(Block block) {
        float f2;
        void var1_3;
        void b22 = var1_3;
        Sx a2 = this;
        float b22 = a2.K.J((Block)b22);
        if (f2 > pqa.r) {
            Sx sx2 = a2;
            int n2 = kGa.C((Gl)sx2);
            Mda mda2 = sx2.K.f();
            if (n2 > 0 && mda2 != null) {
                int n3 = n2;
                b22 += (float)(n3 * n3 + vRa.d);
            }
        }
        if (a2.J(Hda.f)) {
            b22 *= pqa.r + (float)(a2.J(Hda.f).J() + vRa.d) * psa.N;
        }
        if (a2.J(Hda.I)) {
            float f3;
            float f4 = pqa.r;
            switch (a2.J(Hda.I).J()) {
                case 0: {
                    f4 = bpa.K;
                    f3 = b22;
                    break;
                }
                case 1: {
                    f4 = dqa.B;
                    f3 = b22;
                    break;
                }
                case 2: {
                    f4 = APa.o;
                    f3 = b22;
                    break;
                }
                default: {
                    f4 = Sqa.N;
                    f3 = b22;
                }
            }
            b22 = f3 * f4;
        }
        if (a2.J(Material.water) && !kGa.J((Gl)a2)) {
            b22 /= eua.C;
        }
        if (!a2.ha) {
            b22 /= eua.C;
        }
        return b22;
    }

    public int H() {
        Sx a2;
        return a2.d;
    }

    public static UUID J(String a2) {
        return UUID.nameUUIDFromBytes(new StringBuilder().insert(5 >> 3, Mqa.c).append(a2).toString().getBytes(Charsets.UTF_8));
    }

    public void J(aX aX2, int n2) {
        int c2 = n2;
        Sx sx2 = this;
    }

    public void J(Waa waa2) {
        Sx a2;
        Sx b2 = waa2;
        Sx sx2 = a2 = this;
        Sx sx3 = a2;
        Sx sx4 = a2;
        super.J((Waa)b2);
        sx3.w = Sx.J(sx4.l);
        waa waa3 = b2.J(eua.O, NTa.C);
        sx2.K.J(waa3);
        sx3.K.J = b2.J(Upa.p);
        sx2.R = b2.f(PTa.v);
        sx2.d = b2.J(Zta.K);
        sx2.A = b2.J(vTa.V);
        sx2.j = b2.J(hpa.x);
        sx2.Aa = b2.J(pqa.y);
        sx2.t = b2.J(gQa.ga);
        if (sx2.t == 0) {
            a2.t = a2.R.nextInt();
        }
        Sx sx5 = a2;
        sx5.G(b2.J(vRa.fa));
        if (sx5.R) {
            a2.z = new XF((vL)a2);
            a2.J(vRa.d != 0, vRa.d != 0, uSa.E != 0);
        }
        if (b2.J(yra.o, zOa.v) && b2.J(Yra.ga, zOa.v) && b2.J(AQa.Aa, zOa.v)) {
            Sx sx6 = a2;
            sx6.T = new XF(b2.J(yra.o), b2.J(Yra.ga), b2.J(AQa.Aa));
            sx6.L = b2.f(ZSa.S);
        }
        Sx sx7 = a2;
        sx7.e.f((Waa)b2);
        sx7.h.J((Waa)b2);
        if (b2.J(rua.Z, WOa.fa)) {
            b2 = b2.J(rua.Z, NTa.C);
            a2.V.J((waa)b2);
        }
    }

    public void J(xA object) {
        Sx b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Iaa iaa2) {
        void a2;
        Sx sx2 = this;
        if (a2.J()) {
            return vRa.d != 0;
        }
        Sx b2 = sx2.f();
        if (b2 != null && b2.l()) {
            return b2.J().equals(a2.J());
        }
        return uSa.E != 0;
    }

    public void F(int n2) {
        int b2 = n2;
        Sx a2 = this;
        a2.j(b2);
        int n3 = vqa.F - a2.Aa;
        if (b2 > n3) {
            b2 = n3;
        }
        Sx sx2 = a2;
        Sx sx3 = sx2;
        sx2.A += (float)b2 / (float)a2.D();
        sx2.Aa += b2;
        while (sx3.A >= pqa.r) {
            Sx sx4 = a2;
            sx3 = sx4;
            Sx sx5 = a2;
            sx4.A = (sx4.A - pqa.r) * (float)sx5.D();
            sx5.k(vRa.d);
            sx4.A /= (float)a2.D();
        }
    }

    public void f(Waa waa2) {
        Sx b2 = waa2;
        Sx a2 = this;
        Sx sx2 = b2;
        Sx sx3 = a2;
        super.f((Waa)b2);
        Sx sx4 = b2;
        sx4.J(eua.O, (NCa)a2.K.J(new waa()));
        sx4.J(Upa.p, a2.K.J);
        sx4.J(PTa.v, a2.R);
        sx4.J(Zta.K, (short)a2.d);
        sx4.J(vTa.V, a2.A);
        sx4.J(hpa.x, a2.j);
        sx4.J(pqa.y, a2.Aa);
        sx2.J(gQa.ga, a2.t);
        sx2.J(vRa.fa, a2.g());
        if (sx3.T != null) {
            Sx sx5 = b2;
            sx5.J(yra.o, a2.T.getX());
            sx5.J(Yra.ga, a2.T.getY());
            sx5.J(AQa.Aa, a2.T.getZ());
            sx5.J(ZSa.S, a2.L);
        }
        Sx sx6 = a2;
        Sx sx7 = b2;
        sx6.e.J((Waa)sx7);
        sx6.h.f((Waa)b2);
        sx7.J(rua.Z, (NCa)a2.V.J());
        Mda mda2 = sx6.K.f();
        if (mda2 != null && mda2.J() != null) {
            b2.J(WQa.w, (NCa)mda2.J(new Waa()));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, float f2, float f3) {
        void b2;
        void c2;
        float d2 = f3;
        Sx a2 = this;
        a2.j.J(a2, (String)c2, (float)b2, d2);
    }

    public void J(Dc object) {
        Sx b2 = object;
        object = this;
    }

    public void t() {
        Sx sx2 = this;
        if (sx2.g != null) {
            Sx sx3 = sx2;
            sx3.J(sx3.g, ERa.C);
            int n2 = sx3.g.E;
            Sx a2 = sx3.g.J((Gg)sx2.j, sx2);
            if (a2 != sx2.g || a2 != null && ((Mda)a2).E != n2) {
                sx2.K.j[sx2.K.J] = a2;
                if (((Mda)a2).E == 0) {
                    sx2.K.j[sx2.K.J] = null;
                }
            }
            sx2.Q();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(Mda mda2, int n2) {
        Sx c2 = mda2;
        Sx b2 = this;
        if (c2 != b2.g) {
            void a2;
            b2.g = c2;
            b2.D = a2;
            if (!b2.j.e) {
                b2.M(vRa.d != 0);
            }
        }
    }

    public jFa J(Mda mda2, boolean bl) {
        Sx c2 = mda2;
        Sx b2 = this;
        return b2.J((Mda)c2, uSa.E != 0, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static XF J(Gg gg2, XF xF, boolean bl) {
        void b2;
        Gg gg3 = gg2;
        Block c22 = gg3.J((XF)b2).J();
        if (c22 != QFa.Pd) {
            boolean a2;
            if (!a2) {
                return null;
            }
            a2 = c22.f();
            boolean c22 = gg3.J(b2.up()).J().f();
            if (a2 && c22) {
                return b2;
            }
            return null;
        }
        return BlockBed.J(gg3, (XF)b2, uSa.E);
    }

    public Yaa J() {
        Sx a2;
        return a2.J().l(a2.J());
    }

    public ld J() {
        Sx sx2 = this;
        Sx a2 = new CY(mca.J((Yaa)sx2.J(), (String)sx2.J()));
        Vz vz2 = a2.J().J(new PEa(gEa.SUGGEST_COMMAND, new StringBuilder().insert(5 >> 3, Vua.o).append(sx2.J()).append(Tpa.E).toString()));
        Sx sx3 = a2;
        a2.J().J(sx2.J());
        sx3.J().J(sx2.J());
        return sx3;
    }

    public void k() {
        Sx a2;
        Sx sx2 = a2;
        super.k();
        Sx sx3 = a2;
        sx2.x.J(sx3);
        if (sx3.G != null) {
            a2.G.J(a2);
        }
    }

    public void G(vL object) {
        Sx b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2) {
        void b2;
        Sx sx2 = this;
        if (b2.J() == YFa.DRINK) {
            Sx sx3 = sx2;
            sx3.J(MQa.ga, MQa.L, sx3.j.v.nextFloat() * Nra.e + ATa.r);
        }
        if (b2.J() == YFa.EAT) {
            void a2;
            int n3;
            int n4 = n3 = uSa.E;
            while (n4 < a2) {
                Sx c2 = new Lz(((double)sx2.R.nextFloat() - kTa.B) * tpa.k, Math.random() * tpa.k + tpa.k, aSa.V);
                c2 = c2.f(-sx2.d * pua.j / Hra.Ga);
                c2 = c2.J(-sx2.X * pua.j / Hra.Ga);
                double d2 = (double)(-sx2.R.nextFloat()) * oQa.fa - aQa.r;
                Lz lz2 = new Lz(((double)sx2.R.nextFloat() - kTa.B) * aQa.r, d2, oQa.fa);
                lz2 = lz2.f((float)(-sx2.d * pua.j / Hra.Ga));
                lz2 = lz2.J((float)(-sx2.X * pua.j / Hra.Ga));
                lz2 = lz2.f(sx2.la, (double)(sx2.Z + (double)sx2.l()), (double)sx2.A);
                if (b2.i()) {
                    int[] nArray = new int[uqa.g];
                    nArray[uSa.E] = eAa.J((eAa)b2.J());
                    nArray[vRa.d] = b2.J();
                    sx2.j.J(UZ.ITEM_CRACK, lz2.A, lz2.j, lz2.J, ((Lz)c2).A, ((Lz)c2).j + fPa.ca, ((Lz)c2).J, nArray);
                } else {
                    int[] nArray = new int[vRa.d];
                    nArray[uSa.E] = eAa.J((eAa)b2.J());
                    sx2.j.J(UZ.ITEM_CRACK, lz2.A, lz2.j, lz2.J, ((Lz)c2).A, ((Lz)c2).j + fPa.ca, ((Lz)c2).J, nArray);
                }
                n4 = ++n3;
            }
            sx2.J(fta.y, MQa.L + MQa.L * (float)sx2.R.nextInt(uqa.g), (sx2.R.nextFloat() - sx2.R.nextFloat()) * psa.N + pqa.r);
        }
    }

    public boolean N() {
        Sx a2;
        if (a2.R && a2.d >= ySa.T) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Mda[] J() {
        Sx a2;
        return a2.K.A;
    }

    public void r() {
        Sx a2;
        a2.G = a2.x;
    }

    private void M(double c22, double b2, double a2) {
        Sx d2;
        if (d2.ja != null) {
            double d3 = c22;
            double d4 = b2;
            double d5 = a2;
            int c22 = Math.round(Oz.J((double)(d3 * d3 + d4 * d4 + d5 * d5)) * QTa.G);
            if (c22 > 0) {
                if (d2.ja instanceof Yea) {
                    Sx sx2 = d2;
                    sx2.J(Tz.R, c22);
                    if (sx2.N == null) {
                        Sx sx3 = d2;
                        d2.N = new XF((vL)d2);
                        return;
                    }
                    Sx sx4 = d2;
                    if (sx4.N.distanceSq(Oz.f((double)sx4.la), Oz.f((double)d2.Z), Oz.f((double)d2.A)) >= ZOa.ha) {
                        d2.J((aX)mY.K);
                        return;
                    }
                } else {
                    Sx sx5 = d2;
                    if (d2.ja instanceof Wda) {
                        sx5.J(Tz.S, c22);
                        return;
                    }
                    Sx sx6 = d2;
                    if (sx5.ja instanceof zda) {
                        sx6.J(Tz.k, c22);
                        return;
                    }
                    if (sx6.ja instanceof Rea) {
                        d2.J(Tz.U, c22);
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void d(float f2, float f3) {
        void a2;
        void b2;
        Sx sx2;
        Sx sx3;
        Sx sx4 = sx3 = this;
        double d2 = sx4.la;
        float f4 = sx4.Z;
        float f5 = sx4.A;
        if (sx4.h.J() && sx3.ja == null) {
            Sx sx5 = sx3;
            double d3 = sx5.Ea;
            float c2 = sx5.P;
            sx5.P = sx5.h.J() * (float)(sx3.j() ? uqa.g : vRa.d);
            Sx sx6 = sx3;
            sx2 = sx6;
            super.d((float)b2, (float)a2);
            sx6.J(d3 * oQa.fa);
            sx6.P = c2;
        } else {
            Sx sx7 = sx3;
            sx2 = sx7;
            super.d((float)b2, (float)a2);
        }
        sx2.e(sx3.la - d2, sx3.Z - f4, sx3.A - f5);
    }

    public void s() {
        Sx a2;
        Sx sx2 = a2;
        super.s();
        sx2.J().J(Kha.A).J(oua.i);
        sx2.J(Kha.j).J(Tqa.Ia);
    }

    public uX J() {
        Sx a2;
        return a2.e;
    }

    public boolean W() {
        Sx a2;
        return a2.F;
    }

    public void J(Rea rea2, HA object) {
        Sx c2 = object;
        object = this;
    }

    public float A() {
        Sx a2;
        return a2.J().J(yta.Ka);
    }

    public static UUID J(GameProfile gameProfile) {
        GameProfile gameProfile2 = gameProfile;
        Object a2 = gameProfile2.getId();
        if (a2 == null) {
            a2 = Sx.J(gameProfile2.getName());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(Sx sx2) {
        void a2;
        Sx sx3 = this;
        if (!sx3.C()) {
            return uSa.E != 0;
        }
        if (a2.t()) {
            return uSa.E != 0;
        }
        Sx b2 = sx3.J();
        if (b2 == null || a2.J() != b2 || !b2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void D(boolean bl) {
        boolean b2 = bl;
        Sx a2 = this;
        a2.F = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF, DZ dZ2, Mda mda2) {
        void b2;
        void a2;
        Object d2 = xF;
        Sx c2 = this;
        if (c2.h.J) {
            return vRa.d != 0;
        }
        if (a2 == null) {
            return uSa.E != 0;
        }
        d2 = ((XF)((Object)d2)).offset(b2.getOpposite());
        if (a2.f((Block)(d2 = c2.j.J((XF)((Object)d2)).J())) || a2.e()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        Sx a2;
        Sx sx2 = a2;
        super.J();
        sx2.aa.f(ERa.C, (byte)uSa.E);
        sx2.aa.f(yta.Ka, Float.valueOf(JPa.N));
        sx2.aa.f(yOa.B, uSa.E);
        sx2.aa.f(NTa.C, (byte)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(vL vL2) {
        Mda mda2;
        void a2;
        Sx sx2 = this;
        if (sx2.t()) {
            if (a2 instanceof HA) {
                sx2.J((HA)a2);
            }
            return uSa.E != 0;
        }
        Sx sx3 = sx2;
        WTa.J((Sx)sx3, (vL)a2);
        Sx b2 = sx3.f();
        Mda mda3 = mda2 = b2 != null ? b2.J() : null;
        if (!a2.l(sx2)) {
            if (b2 != null && a2 instanceof Gl) {
                if (sx2.h.f()) {
                    b2 = mda2;
                }
                if (b2.J(sx2, (Gl)a2)) {
                    if (((Mda)b2).E <= 0 && !sx2.h.f()) {
                        sx2.x();
                    }
                    return vRa.d != 0;
                }
            }
            return uSa.E != 0;
        }
        if (b2 != null && b2 == sx2.f()) {
            if (((Mda)b2).E <= 0 && !sx2.h.f()) {
                sx2.x();
            } else if (((Mda)b2).E < mda2.E && sx2.h.f()) {
                ((Mda)b2).E = mda2.E;
            }
        }
        return vRa.d != 0;
    }

    public void D() {
        Sx a2;
        Sx sx2 = a2;
        sx2.l(Ora.D, Ssa.la);
        super.D();
        sx2.A(sx2.J());
        sx2.a = uSa.E;
    }

    public void f(aX object) {
        Sx b2 = object;
        object = this;
    }

    public abstract boolean t();

    public void w() {
        Sx a2;
        if (a2.g != null) {
            Sx sx2 = a2;
            Sx sx3 = a2;
            sx2.g.f((Gg)sx2.j, sx3, sx3.D);
        }
        a2.Q();
    }

    public void k(int n2) {
        Sx a2;
        int b22 = n2;
        Sx sx2 = a2 = this;
        sx2.j += b22;
        if (sx2.j < 0) {
            Sx sx3 = a2;
            sx3.j = uSa.E;
            sx3.A = JPa.N;
            sx3.Aa = uSa.E;
        }
        if (b22 > 0 && a2.j % tTa.h == 0 && (float)a2.v < (float)a2.g - QTa.G) {
            float b22 = a2.j > Fsa.d ? pqa.r : (float)a2.j / NSa.B;
            Sx sx4 = a2;
            sx4.j.J((vL)a2, CRa.Aa, b22 * wOa.w, pqa.r);
            a2.v = (int)sx4.g;
        }
    }

    public void S() {
    }

    public void G(int n2) {
        int b2 = n2;
        Sx a2 = this;
        a2.aa.J(yOa.B, Integer.valueOf(b2));
    }

    public jFa J(boolean bl) {
        Sx a2;
        boolean b2 = bl;
        Sx sx2 = a2 = this;
        return sx2.J(a2.K.J(sx2.K.J, b2 && a2.K.f() != null ? a2.K.f().E : vRa.d), uSa.E != 0, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public jFa J(Mda mda2, boolean bl, boolean bl2) {
        Sx sx2;
        void b22;
        void a2;
        Sx d2 = mda2;
        Sx c2 = this;
        if (d2 == null) {
            return null;
        }
        if (((Mda)d2).E == 0) {
            return null;
        }
        float f2 = c2.Z - osa.b + (double)c2.l();
        Sx sx3 = c2;
        d2 = new jFa((Gg)sx3.j, sx3.la, (double)f2, (double)c2.A, (Mda)d2);
        d2.M(wra.P);
        if (a2 != false) {
            d2.f(c2.J());
        }
        if (b22 != false) {
            Sx sx4 = c2;
            sx2 = sx4;
            float b22 = sx4.R.nextFloat() * MQa.L;
            float f3 = sx4.R.nextFloat() * pua.j * kta.v;
            Sx sx5 = d2;
            sx5.f(-Oz.d((float)f3) * b22);
            sx5.l(Oz.C((float)f3) * b22);
            d2.J(Bua.Ia);
        } else {
            float b22 = bpa.K;
            sx2 = c2;
            Sx sx6 = d2;
            Sx sx7 = d2;
            Sx sx8 = d2;
            Sx sx9 = c2;
            sx8.f(-Oz.d((float)(c2.X / Hra.Ga * pua.j)) * Oz.C((float)(sx9.d / Hra.Ga * pua.j)) * b22);
            Sx sx10 = c2;
            sx8.l(Oz.C((float)(sx9.X / Hra.Ga * pua.j)) * Oz.C((float)(sx10.d / Hra.Ga * pua.j)) * b22);
            sx7.J(-Oz.d((float)(sx10.d / Hra.Ga * pua.j)) * b22 + Nra.e);
            float f4 = c2.R.nextFloat() * pua.j * kta.v;
            b22 = WRa.e * c2.R.nextFloat();
            sx7.f(((jFa)sx6).i + Math.cos(f4) * (double)b22);
            sx6.J(((jFa)sx6).Ea + (double)((c2.R.nextFloat() - c2.R.nextFloat()) * Nra.e));
            sx6.l(((jFa)sx6).f + Math.sin(f4) * (double)b22);
        }
        sx2.J((jFa)d2);
        if (a2 != false) {
            c2.J(Tz.P);
        }
        return d2;
    }

    public float D() {
        Sx a2;
        return (float)a2.J(Kha.j).f();
    }

    public boolean r() {
        Sx a2;
        return a2.L;
    }

    public void d() {
        Sx sx2;
        Sx sx3;
        block27: {
            block25: {
                block24: {
                    block26: {
                        Sx sx4;
                        block23: {
                            block21: {
                                block22: {
                                    Sx sx5 = sx3 = this;
                                    sx5.Ma = sx5.t();
                                    sx5.m.J(vRa.d != 0);
                                    if (sx5.t()) {
                                        sx3.d(uSa.E != 0);
                                    }
                                    if (sx3.g == null) break block21;
                                    Mda mda2 = sx3.K.f();
                                    if (mda2 != sx3.g) break block22;
                                    if (sx3.D <= kTa.g && sx3.D % AQa.P == 0) {
                                        sx3.J(mda2, tTa.h);
                                    }
                                    if ((sx3.D -= vRa.d) != 0 || sx3.j.e) break block21;
                                    Sx sx6 = sx3;
                                    sx4 = sx6;
                                    sx6.t();
                                    break block23;
                                }
                                sx3.Q();
                            }
                            sx4 = sx3;
                        }
                        if (sx4.X > 0) {
                            sx3.X -= vRa.d;
                        }
                        if (!sx3.p()) break block24;
                        Sx sx7 = sx3;
                        sx7.d += vRa.d;
                        if (sx7.d > ySa.T) {
                            sx3.d = ySa.T;
                        }
                        if (sx3.j.e) break block25;
                        if (sx3.S()) break block26;
                        Sx sx8 = sx3;
                        sx2 = sx8;
                        sx8.J(vRa.d != 0, vRa.d != 0, uSa.E != 0);
                        break block27;
                    }
                    if (!sx3.j.e()) break block25;
                    Sx sx9 = sx3;
                    sx2 = sx9;
                    sx9.J(uSa.E != 0, vRa.d != 0, vRa.d != 0);
                    break block27;
                }
                if (sx3.d > 0) {
                    Sx sx10 = sx3;
                    sx10.d += vRa.d;
                    if (sx10.d >= Iqa.M) {
                        sx3.d = uSa.E;
                    }
                }
            }
            sx2 = sx3;
        }
        super.d();
        if (!sx3.j.e && sx3.G != null && !sx3.G.J(sx3)) {
            Sx sx11 = sx3;
            sx11.r();
            sx11.G = sx11.x;
        }
        if (sx3.o() && sx3.h.M) {
            sx3.I();
        }
        Sx sx12 = sx3;
        sx12.B = sx12.C;
        sx12.o = sx12.k;
        sx12.p = sx12.Y;
        double d2 = sx12.la - sx3.C;
        float f2 = sx12.Z - sx3.k;
        float f3 = sx12.A - sx3.Y;
        double d3 = Wqa.m;
        if (d2 > d3) {
            sx3.B = sx3.C = sx3.la;
        }
        if (f3 > d3) {
            float f4 = sx3.A;
            sx3.Y = f4;
            sx3.p = f4;
        }
        if (f2 > d3) {
            float f5 = sx3.Z;
            sx3.k = f5;
            sx3.o = f5;
        }
        if (d2 < -d3) {
            sx3.B = sx3.C = sx3.la;
        }
        if (f3 < -d3) {
            float f6 = sx3.A;
            sx3.Y = f6;
            sx3.p = f6;
        }
        if (f2 < -d3) {
            float f7 = sx3.Z;
            sx3.k = f7;
            sx3.o = f7;
        }
        Sx sx13 = sx3;
        sx13.C += d2 * VPa.W;
        sx13.Y += f3 * VPa.W;
        sx13.k += f2 * VPa.W;
        if (sx13.ja == null) {
            sx3.N = null;
        }
        if (!sx3.j.e) {
            Sx sx14 = sx3;
            Sx sx15 = sx3;
            sx14.e.J(sx15);
            sx14.J(Tz.h);
            if (sx15.K()) {
                sx3.J(Tz.Y);
            }
        }
        Sx sx16 = sx3;
        d2 = Oz.J((double)sx16.la, (double)vRa.Ha, (double)zua.U);
        f2 = (float)Oz.J((double)sx16.A, (double)vRa.Ha, (double)zua.U);
        if (d2 != sx3.la || f2 != sx3.A) {
            sx3.l(d2, sx3.Z, f2);
        }
        if (!sx3.R && sx3.g == false) {
            Sx sx17 = sx3;
            Sx a2 = sx17.J();
            if (Math.abs((float)(sx17.F - Ora.D)) > WSa.B || Math.abs(((xy)a2).A - ((xy)a2).J - (double)sx3.F) > XOa.R || Math.abs(((xy)a2).k - ((xy)a2).I - Lra.I) > XOa.R || Math.abs(((xy)a2).M - ((xy)a2).j - WPa.y) > XOa.R) {
                Kpa.f((String)vPa.D);
            }
        }
        if (sx3.ha) {
            Sx sx18 = sx3;
            sx18.J(sx3.Ea - sx18.R.nextDouble() * qQa.g);
        }
    }

    public void n() {
    }

    public void D(int n2) {
        Sx a2;
        int b2 = n2;
        Sx sx2 = a2 = this;
        sx2.j -= b2;
        if (sx2.j < 0) {
            Sx sx3 = a2;
            sx3.j = uSa.E;
            sx3.A = JPa.N;
            sx3.Aa = uSa.E;
        }
        a2.t = a2.R.nextInt();
    }

    public void x() {
        Sx a2;
        Sx sx2 = a2;
        sx2.K.J(sx2.K.J, (Mda)null);
    }

    public float k() {
        int a2;
        Sx sx2 = this;
        int n2 = uSa.E;
        Mda[] mdaArray = sx2.K.A;
        int n3 = sx2.K.A.length;
        int n4 = a2 = uSa.E;
        while (n4 < n3) {
            if (mdaArray[a2] != null) {
                ++n2;
            }
            n4 = ++a2;
        }
        return (float)n2 / (float)sx2.K.A.length;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        float c2 = f2;
        Sx b2 = this;
        if (!b2.h.l()) {
            void a2;
            if (c2 >= kta.v) {
                b2.J(Tz.L, (int)Math.round((double)c2 * fqa.W));
            }
            super.f(c2, (float)a2);
        }
    }

    public void H() {
        Sx a2;
        if (!a2.t()) {
            super.H();
        }
    }

    public boolean J(boolean bl) {
        boolean b2 = bl;
        Sx a2 = this;
        if ((b2 || a2.e.J()) && !a2.h.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        Sx a2;
        return a2.l.getName();
    }

    public boolean f() {
        return OCa.J().G[uSa.E].J().f(Ura.Q);
    }

    public void d(float f2) {
        float b2 = f2;
        Sx a2 = this;
        a2.K.J(b2);
    }

    public boolean u() {
        Sx a2;
        if (!a2.h.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean p() {
        Sx a2;
        return a2.R;
    }

    private void D(vL vL2) {
        Sx b2 = vL2;
        Sx a2 = this;
        b2.C(a2);
    }

    public int g() {
        Sx a2;
        return a2.aa.J(yOa.B);
    }

    public void J(Gl gl2) {
        Object b2 = gl2;
        Sx a2 = this;
        if (b2 instanceof WC) {
            a2.J((aX)mY.l);
        }
        if ((b2 = (oia)PIa.k.get(PIa.J((vL)b2))) != null) {
            a2.J(((oia)b2).I);
        }
    }

    public boolean Z() {
        Sx a2;
        if (a2.f() <= JPa.N || a2.p()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int d() {
        Sx a2;
        if (a2.h.M) {
            return uSa.E;
        }
        return Fua.J;
    }

    public Mda l() {
        Sx a2;
        return a2.g;
    }

    public void J(HA object) {
        Sx b2 = object;
        object = this;
    }

    public boolean w() {
        Sx a2;
        return a2.h.J;
    }

    public int I() {
        Sx a2;
        return a2.t;
    }

    public int C() {
        return NTa.C;
    }

    public boolean y() {
        return vRa.d != 0;
    }

    public boolean G() {
        return vRa.d != 0;
    }

    public int j() {
        Sx a2;
        return a2.D;
    }

    public double C() {
        return SQa.ga;
    }

    public String f() {
        return WRa.a;
    }

    public String i() {
        return Fpa.M;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public ufa J(XF xF) {
        void b222;
        Sx sx2;
        void var1_4;
        void b222 = var1_4;
        Sx a2 = this;
        if (!a2.j.e) {
            if (a2.p() || !a2.K()) {
                return ufa.OTHER_PROBLEM;
            }
            if (!a2.j.F.J()) {
                return ufa.NOT_POSSIBLE_HERE;
            }
            if (a2.j.e()) {
                return ufa.NOT_POSSIBLE_NOW;
            }
            if (Math.abs(a2.la - (double)b222.getX()) > uRa.I || Math.abs((double)(a2.Z - (double)b222.getY())) > KPa.y || Math.abs((double)(a2.A - (double)b222.getZ())) > uRa.I) {
                return ufa.TOO_FAR_AWAY;
            }
            double d2 = Wqa.Z;
            double d3 = DQa.S;
            if (!a2.j.J(hFa.class, new xy((double)b222.getX() - d2, (double)b222.getY() - d3, (double)b222.getZ() - d2, (double)b222.getX() + d2, (double)b222.getY() + d3, (double)b222.getZ() + d2)).isEmpty()) {
                return ufa.NOT_SAFE;
            }
        }
        if (a2.B()) {
            a2.l(null);
        }
        Sx sx3 = a2;
        sx3.l(psa.N, psa.N);
        if (sx3.j.F((XF)b222)) {
            Sx sx4;
            DZ dZ2 = a2.j.J((XF)b222).J(BlockDirectional.FACING);
            float f2 = MQa.L;
            float f3 = MQa.L;
            switch (FFa.I[dZ2.ordinal()]) {
                case 1: {
                    f3 = ATa.r;
                    sx4 = a2;
                    break;
                }
                case 2: {
                    f3 = Nra.e;
                    sx4 = a2;
                    break;
                }
                case 3: {
                    f2 = Nra.e;
                    sx4 = a2;
                    break;
                }
                case 4: {
                    f2 = ATa.r;
                }
                default: {
                    sx4 = a2;
                }
            }
            sx4.J(dZ2);
            Sx sx5 = a2;
            sx2 = sx5;
            sx5.l((float)b222.getX() + f2, (float)b222.getY() + sOa.Ka, (float)b222.getZ() + f3);
        } else {
            XF b222 = new XF((vL)a2);
            Sx sx6 = a2;
            sx2 = sx6;
            sx6.l((float)b222.getX() + MQa.L, (float)b222.getY() + sOa.Ka, (float)b222.getZ() + MQa.L);
        }
        sx2.R = vRa.d;
        Sx sx7 = a2;
        a2.d = uSa.E;
        sx7.z = b222;
        a2.f(aSa.V);
        sx7.J(aSa.V);
        sx7.l(aSa.V);
        if (!sx7.j.e) {
            a2.j.C();
        }
        return ufa.OK;
    }

    /*
     * WARNING - void declaration
     */
    public Sx(Gg gg2, GameProfile gameProfile) {
        Sx sx2;
        boolean bl;
        void a2;
        Sx b2;
        Object c2 = gg2;
        Sx sx3 = b2 = this;
        super((Gg)c2);
        Sx sx4 = b2;
        b2.K = new kea(b2);
        sx4.V = new MFa();
        b2.e = new uX();
        b2.h = new LEa();
        b2.m = new uf(b2);
        b2.F = uSa.E;
        sx3.w = Sx.J((GameProfile)a2);
        sx3.l = a2;
        kea kea2 = b2.K;
        if (!((Gg)c2).e) {
            bl = vRa.d;
            sx2 = b2;
        } else {
            bl = uSa.E;
            sx2 = b2;
        }
        sx3.x = new tda(kea2, bl, sx2);
        Sx sx5 = b2;
        sx5.G = b2.x;
        c2 = c2.J();
        b2.f((double)c2.getX() + kTa.B, c2.getY() + vRa.d, (double)c2.getZ() + kTa.B, JPa.N, JPa.N);
        sx5.Y = Hra.Ga;
        b2.b = kTa.j;
    }

    public int F() {
        Sx a2;
        if (a2.V()) {
            return a2.g.C() - a2.D;
        }
        return uSa.E;
    }

    public Mda f() {
        Sx a2;
        return a2.K.f();
    }

    private boolean S() {
        Sx a2;
        Sx sx2 = a2;
        if (sx2.j.J(sx2.z).J() == QFa.Pd) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void D(float f2) {
        float b2 = f2;
        Sx a2 = this;
        if (!a2.h.M && !a2.j.e) {
            a2.e.J(b2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void J(DZ dZ2) {
        Sx a2;
        DZ b2 = dZ2;
        Sx sx2 = a2 = this;
        sx2.n = JPa.N;
        sx2.c = JPa.N;
        switch (FFa.I[b2.ordinal()]) {
            case 1: {
                a2.c = bqa.N;
                return;
            }
            case 2: {
                a2.c = Ssa.la;
                return;
            }
            case 3: {
                a2.n = Ssa.la;
                return;
            }
            case 4: {
                a2.n = bqa.N;
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private Collection<ica> J(vL vL2) {
        int b22;
        mca mca2;
        void a2;
        int n2;
        Object object = this;
        mca mca3 = object.J().l(object.J());
        if (mca3 != null && (n2 = mca3.J().getColorIndex()) >= 0 && n2 < lb.I.length) {
            Iterator b22 = object.J().J(lb.I[n2]).iterator();
            Object object2 = b22;
            while (object2.hasNext()) {
                mca3 = (ica)b22.next();
                object2 = b22;
                object.J().J(a2.J(), (ica)mca3).J();
            }
        }
        if ((mca2 = object.J().l(a2.J())) != null && (b22 = mca2.J().getColorIndex()) >= 0 && b22 < lb.k.length) {
            return object.J().J(lb.k[b22]);
        }
        return Lists.newArrayList();
    }

    public void a() {
        Sx a2;
        if (!a2.h.J()) {
            super.a();
        }
    }

    public void J(byte by2) {
        byte b2 = by2;
        Sx a2 = this;
        if (b2 == WOa.fa) {
            a2.t();
            return;
        }
        if (b2 == AQa.ba) {
            a2.F = uSa.E;
            return;
        }
        if (b2 == cQa.o) {
            a2.F = vRa.d;
            return;
        }
        super.J(b2);
    }

    public String d() {
        return hqa.Ma;
    }

    public void i(float f2) {
        float b2 = f2;
        Sx a2 = this;
        if (b2 < JPa.N) {
            b2 = JPa.N;
        }
        a2.J().J(yta.Ka, Float.valueOf(b2));
    }

    public Mda J() {
        Sx a2;
        return a2.K.f();
    }

    public void f(ld object) {
        Sx b2 = object;
        object = this;
    }

    public void Q() {
        Sx a2;
        a2.g = null;
        a2.D = uSa.E;
        if (!a2.j.e) {
            a2.M(uSa.E != 0);
        }
    }

    public boolean n() {
        Sx a2;
        if (a2.f() > JPa.N && a2.f() < a2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2, boolean bl3) {
        void a2;
        void c2;
        void b2;
        Sx sx2;
        Sx sx3 = sx2 = this;
        sx3.l(Ora.D, Ssa.la);
        Sx sx4 = sx2;
        Object d2 = sx3.j.J(sx4.z);
        if (sx4.z != null && d2.J() == QFa.Pd) {
            Sx sx5 = sx2;
            sx5.j.J(sx5.z, d2.J(BlockBed.OCCUPIED, uSa.E != 0), AQa.P);
            Sx sx6 = sx2;
            d2 = BlockBed.J((Gg)sx6.j, sx6.z, uSa.E);
            if (d2 == null) {
                d2 = sx2.z.up();
            }
            sx2.l((float)d2.getX() + MQa.L, (float)d2.getY() + Nra.e, (float)d2.getZ() + MQa.L);
        }
        sx2.R = uSa.E;
        if (!sx2.j.e && b2 != false) {
            sx2.j.C();
        }
        int n2 = sx2.d = c2 != false ? uSa.E : ySa.T;
        if (a2 != false) {
            Sx sx7 = sx2;
            sx7.J(sx7.z, uSa.E != 0);
        }
    }

    public void J(jFa jFa2) {
        Sx b2 = jFa2;
        Sx a2 = this;
        a2.j.f((vL)b2);
    }

    public void J(Daa object) {
        Object b2 = object;
        object = this;
    }

    public Mda f(int n2) {
        int b2 = n2;
        Sx a2 = this;
        if (b2 == 0) {
            return a2.K.f();
        }
        return a2.K.A[b2 - vRa.d];
    }

    public void J(aaa object) {
        Sx b2 = object;
        object = this;
    }

    public boolean x() {
        Sx a2;
        if (a2.V() && a2.g.J().J(a2.g) == YFa.BLOCK) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void A(vL vL2) {
        Sx b2 = vL2;
        Sx a2 = this;
        if (b2.I() && !b2.f((vL)a2)) {
            int n2;
            float f2 = (float)a2.J(Kha.A).f();
            int n3 = uSa.E;
            float f3 = JPa.N;
            if (b2 instanceof Gl) {
                f3 = kGa.J((Mda)a2.J(), (LGa)((Gl)b2).J());
                n2 = n3;
            } else {
                f3 = kGa.J((Mda)a2.J(), (LGa)LGa.UNDEFINED);
                n2 = n3;
            }
            n3 = n2 + kGa.l((Gl)a2);
            if (a2.j()) {
                ++n3;
            }
            if (f2 > JPa.N || f3 > JPa.N) {
                int n4;
                int n5 = n4 = a2.O > JPa.N && !a2.ha && !a2.l() && !a2.L() && !a2.J(Hda.a) && a2.ja == null && b2 instanceof Gl ? vRa.d : uSa.E;
                if (n4 != 0 && f2 > JPa.N) {
                    f2 *= Ira.d;
                }
                f2 += f3;
                int n6 = uSa.E;
                int n7 = kGa.f((Gl)a2);
                if (b2 instanceof Gl && n7 > 0 && !b2.o()) {
                    n6 = vRa.d;
                    b2.J(vRa.d);
                }
                Sx sx2 = b2;
                double d2 = ((vL)sx2).i;
                double d3 = ((vL)sx2).Ea;
                double d4 = ((vL)sx2).f;
                if (b2.J(gZ.J((Sx)a2), f2)) {
                    Zb zb2;
                    if (n3 > 0) {
                        Sx sx3 = a2;
                        b2.f(-Oz.d((float)(sx3.X * pua.j / Hra.Ga)) * (float)n3 * MQa.L, tpa.k, Oz.C((float)(a2.X * pua.j / Hra.Ga)) * (float)n3 * MQa.L);
                        Sx sx4 = a2;
                        sx4.f(sx4.i * oQa.fa);
                        sx3.l(sx4.f * oQa.fa);
                        sx3.l(uSa.E != 0);
                    }
                    if (b2 instanceof bFa && ((vL)b2).a) {
                        ((bFa)b2).I.J((KC)new xba((vL)b2));
                        Sx sx5 = b2;
                        ((vL)b2).a = uSa.E;
                        b2.f(d2);
                        sx5.J(d3);
                        sx5.l(d4);
                    }
                    if (n4 != 0) {
                        a2.G((vL)b2);
                    }
                    if (f3 > JPa.N) {
                        a2.k((vL)b2);
                    }
                    if (f2 >= vqa.A) {
                        a2.J((aX)mY.E);
                    }
                    a2.i((vL)b2);
                    if (b2 instanceof Gl) {
                        kGa.J((Gl)b2, (vL)a2);
                    }
                    Sx sx6 = a2;
                    kGa.f((Gl)sx6, (vL)b2);
                    Mda mda2 = sx6.f();
                    Sx sx7 = b2;
                    if (sx7 instanceof qEa && (zb2 = ((qEa)b2).I) instanceof Gl) {
                        sx7 = (Gl)zb2;
                    }
                    if (mda2 != null && sx7 instanceof Gl) {
                        mda2.J((Gl)sx7, a2);
                        if (mda2.E <= 0) {
                            a2.x();
                        }
                    }
                    if (b2 instanceof Gl) {
                        a2.J(Tz.Ga, Math.round(f2 * FRa.Ga));
                        if (n7 > 0) {
                            b2.J(n7 * AQa.P);
                        }
                    }
                    a2.D(bpa.K);
                    return;
                }
                if (n6 != 0) {
                    b2.I();
                }
            }
        }
    }

    public boolean J(Sx sx2) {
        Yaa a2;
        Sx sx3 = this;
        Sx b2 = sx3.J();
        a2 = a2.J();
        if (b2 == null) {
            return vRa.d != 0;
        }
        if (!b2.J(a2)) {
            return vRa.d != 0;
        }
        return b2.f();
    }

    public void J(caa object) {
        Sx b2 = object;
        object = this;
    }

    public int f() {
        Sx a2;
        return a2.K.d();
    }

    public boolean b() {
        Sx a2;
        if (!a2.h.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int D() {
        Sx a2;
        if (a2.j >= Fsa.d) {
            return BRa.E + (a2.j - Fsa.d) * WOa.fa;
        }
        if (a2.j >= Ypa.A) {
            return LQa.c + (a2.j - Ypa.A) * tTa.h;
        }
        return XTa.W + a2.j * uqa.g;
    }

    public GameProfile J() {
        Sx a2;
        return a2.l;
    }

    public void J(Mda object) {
        Sx b2 = object;
        object = this;
    }

    public void A() {
        Sx a2;
        Sx sx2 = a2;
        super.A();
        sx2.z();
        sx2.t = sx2.X;
        sx2.N = (XF)sx2.d;
    }

    public boolean Q() {
        return uSa.E != 0;
    }

    public boolean h() {
        Sx a2;
        if (!a2.R && super.h()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        Sx sx2;
        void b2;
        float c2 = f2;
        Sx a2 = this;
        if (a2.J((gZ)b2)) {
            return uSa.E != 0;
        }
        if (a2.h.M && !b2.A()) {
            return uSa.E != 0;
        }
        a2.s = uSa.E;
        if (sx2.f() <= JPa.N) {
            return uSa.E != 0;
        }
        if (a2.p() && !a2.j.e) {
            a2.J(vRa.d != 0, vRa.d != 0, uSa.E != 0);
        }
        if (b2.e()) {
            if (a2.j.J() == sZ.PEACEFUL) {
                c2 = JPa.N;
            }
            if (a2.j.J() == sZ.EASY) {
                c2 = c2 / kta.v + pqa.r;
            }
            if (a2.j.J() == sZ.HARD) {
                c2 = c2 * vQa.q / kta.v;
            }
        }
        if (c2 == JPa.N) {
            return uSa.E != 0;
        }
        vL vL2 = b2.f();
        if (vL2 instanceof jea && ((jea)vL2).f != null) {
            vL2 = ((jea)vL2).f;
        }
        return super.J((gZ)b2, c2);
    }

    public void y() {
        Sx sx2 = this;
        if (sx2.H > 0) {
            sx2.H -= vRa.d;
        }
        if (sx2.j.J() == sZ.PEACEFUL && sx2.j.J().f(Ora.Y)) {
            if (sx2.f() < sx2.J() && sx2.g % kTa.j == false) {
                sx2.e(pqa.r);
            }
            if (sx2.e.J() && sx2.g % NTa.C == false) {
                Sx sx3 = sx2;
                sx3.e.J(sx3.e.J() + vRa.d);
            }
        }
        Sx sx4 = sx2;
        sx4.K.C();
        sx4.Z = sx4.S;
        super.y();
        bA a222 = sx4.J(Kha.j);
        if (!sx4.j.e) {
            a222.J(sx2.h.f());
        }
        sx2.P = WRa.e;
        if (sx2.j()) {
            sx2.P = (float)((double)sx2.P + dua.w);
        }
        Sx sx5 = sx2;
        sx5.C((float)a222.f());
        float a222 = Oz.J((double)(sx5.i * sx2.i + sx2.f * sx2.f));
        float f2 = (float)(Math.atan(-sx5.Ea * Bua.Ia) * zOa.X);
        if (a222 > Nra.e) {
            a222 = Nra.e;
        }
        if (!sx2.ha || sx2.f() <= JPa.N) {
            a222 = JPa.N;
        }
        if (sx2.ha || sx2.f() <= JPa.N) {
            f2 = JPa.N;
        }
        Sx sx6 = sx2;
        sx6.S += (a222 - sx2.S) * Xpa.R;
        sx6.G += (f2 - sx2.G) * xSa.la;
        if (sx6.f() > JPa.N && !sx2.t()) {
            int n2;
            Sx sx7;
            Object a222 = null;
            if (sx2.ja != null && !sx2.ja.J) {
                Sx sx8 = sx2;
                sx7 = sx8;
                a222 = sx2.J().J(sx8.ja.J()).f(oua.i, aSa.V, oua.i);
            } else {
                Sx sx9 = sx2;
                sx7 = sx9;
                a222 = sx9.J().f(oua.i, kTa.B, oua.i);
            }
            a222 = sx7.j.f((vL)sx2, (xy)a222);
            int n3 = n2 = uSa.E;
            while (n3 < a222.size()) {
                vL vL2 = (vL)a222.get(n2);
                if (!vL2.J) {
                    sx2.D(vL2);
                }
                n3 = ++n2;
            }
        }
    }

    public XF f() {
        Sx a2;
        return a2.T;
    }

    public void f(int n2, Mda mda2) {
        Sx c2 = mda2;
        Sx a2 = this;
        a2.K.A[b] = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void e(double d2, double d3, double d4) {
        Sx sx2 = this;
        if (sx2.ja == null) {
            void a2;
            void b2;
            void c2;
            if (sx2.J(Material.water)) {
                void v0 = c2;
                void v1 = b2;
                void v2 = a2;
                int d5 = Math.round(Oz.J((double)(v0 * v0 + v1 * v1 + v2 * v2)) * QTa.G);
                if (d5 > 0) {
                    Sx sx3 = sx2;
                    sx3.J(Tz.i, d5);
                    sx3.D(bua.T * (float)d5 * Jpa.B);
                    return;
                }
            } else if (sx2.L()) {
                void v4 = c2;
                void v5 = a2;
                int d5 = Math.round(Oz.J((double)(v4 * v4 + v5 * v5)) * QTa.G);
                if (d5 > 0) {
                    Sx sx4 = sx2;
                    sx4.J(Tz.y, d5);
                    sx4.D(bua.T * (float)d5 * Jpa.B);
                    return;
                }
            } else if (sx2.l()) {
                if (b2 > aSa.V) {
                    sx2.J(Tz.m, (int)Math.round((double)(b2 * fqa.W)));
                    return;
                }
            } else if (sx2.ha) {
                void v7 = c2;
                void v8 = a2;
                int d5 = Math.round(Oz.J((double)(v7 * v7 + v8 * v8)) * QTa.G);
                if (d5 > 0) {
                    Sx sx5 = sx2;
                    sx5.J(Tz.e, d5);
                    Sx sx6 = sx2;
                    if (sx5.j()) {
                        sx6.J(Tz.Z, d5);
                        sx2.D(vua.t * (float)d5 * Jpa.B);
                        return;
                    }
                    if (sx6.q()) {
                        sx2.J(Tz.I, d5);
                    }
                    sx2.D(Jpa.B * (float)d5 * Jpa.B);
                    return;
                }
            } else {
                void v11 = c2;
                void v12 = a2;
                int d5 = Math.round(Oz.J((double)(v11 * v11 + v12 * v12)) * QTa.G);
                if (d5 > kTa.g) {
                    sx2.J(Tz.A, d5);
                }
            }
        }
    }

    public void J(aX aX2) {
        Sx b2 = aX2;
        Sx a2 = this;
        a2.J((aX)b2, vRa.d);
    }
}

