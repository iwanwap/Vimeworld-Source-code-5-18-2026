/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  DDa
 *  DQa
 *  ERa
 *  Gg
 *  Gl
 *  Hba
 *  Hda
 *  I
 *  JPa
 *  JTa
 *  KZ
 *  LGa
 *  MEa
 *  MQa
 *  Mda
 *  NEa
 *  NTa
 *  Oz
 *  Pqa
 *  QFa
 *  QSa
 *  Qia
 *  Qsa
 *  RC
 *  RQa
 *  SIa
 *  SQa
 *  Sda
 *  Tga
 *  WSa
 *  Waa
 *  XTa
 *  Yfa
 *  ZOa
 *  aSa
 *  bpa
 *  dQa
 *  eAa
 *  gFa
 *  gZ
 *  kba
 *  kta
 *  lqa
 *  mFa
 *  nHa
 *  nda
 *  oA
 *  oHa
 *  pqa
 *  pua
 *  uRa
 *  uea
 *  vL
 *  vRa
 *  vpa
 *  wOa
 *  wPa
 *  wra
 *  xOa
 *  zfa
 */
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class nda_1
extends hFa {
    private static final CEa E;
    private float m;
    private static final UUID C;
    private int i;
    private final vha M;
    public static final RC k;
    private boolean j;
    private float A;

    public final void G(float f2) {
        nda_1 a2;
        float b2 = f2;
        nda_1 nda_12 = a2 = this;
        super.l(a2.A * b2, nda_12.m * b2);
    }

    public double C() {
        nda_1 a2;
        if (a2.Y()) {
            return aSa.V;
        }
        return SQa.ga;
    }

    public String A() {
        return JTa.D;
    }

    public boolean Fa() {
        nda_1 a2;
        if (a2.J().J(uua.s) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(XF xF, Block block) {
        Block c2 = block;
        nda_1 a2 = this;
        a2.J(rRa.ja, VPa.i, pqa.r);
    }

    public void V() {
        nda_1 a2;
        nda_1 nda_12 = this;
        nda_1 nda_13 = a2 = new mFa((Gg)nda_12.j);
        nda_13.d((vL)nda_12);
        nda_13.J(nda_12.j.J(new XF((vL)a2)), null);
        a2.T();
        if (nda_12.Y()) {
            a2.D(QSa.e);
        }
        nda_1 nda_14 = nda_12;
        nda_12.j.C((vL)nda_14);
        a2.G(nda_14.t());
        if (nda_12.J()) {
            nda_1 nda_15 = a2;
            nda_15.J(nda_12.e());
            nda_15.f(nda_12.a());
        }
        nda_1 nda_16 = nda_12;
        nda_16.j.f((vL)a2);
        a2.J(new kba(Hda.D.O, ZOa.x, uSa.E));
        nda_16.j.J((Sx)null, oua.Z, new XF((int)nda_12.la, (int)nda_12.Z, (int)nda_12.A), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2) {
        void a2;
        nda_1 nda_12;
        nda_1 nda_13 = nda_12 = this;
        super.J((Gl)a2);
        if ((nda_13.j.J() == sZ.NORMAL || nda_12.j.J() == sZ.HARD) && a2 instanceof mFa) {
            if (nda_12.j.J() != sZ.HARD && nda_12.R.nextBoolean()) {
                return;
            }
            Yfa yfa = (Yfa)a2;
            nda_1 b2 = new nda_1((Gg)nda_12.j);
            nda_1 nda_14 = nda_12;
            nda_1 nda_15 = b2;
            nda_15.d((vL)a2);
            nda_14.j.C((vL)a2);
            nda_15.J(nda_14.j.J(new XF((vL)b2)), (oA)null);
            b2.I(vRa.d != 0);
            if (a2.Y()) {
                b2.k(vRa.d != 0);
            }
            b2.G(yfa.t());
            if (yfa.J()) {
                nda_1 nda_16 = b2;
                nda_16.J(yfa.e());
                nda_16.f(yfa.a());
            }
            nda_1 nda_17 = nda_12;
            nda_17.j.f((vL)b2);
            nda_17.j.J((Sx)null, WSa.U, new XF((int)nda_12.la, (int)nda_12.Z, (int)nda_12.A), uSa.E);
        }
    }

    @Override
    public String i() {
        return mPa.C;
    }

    @Override
    public void s() {
        nda_1 a2;
        nda_1 nda_12 = a2;
        super.s();
        nda_12.J(Kha.I).J(cTa.K);
        nda_12.J(Kha.j).J(Qpa.o);
        nda_12.J(Kha.A).J(uRa.I);
        nda_12.J().J(k).J(a2.R.nextDouble() * Tqa.Ia);
    }

    public void J(KZ kZ) {
        nda_1 a2;
        nda_1 b2 = kZ;
        nda_1 nda_12 = a2 = this;
        super.J((KZ)b2);
        float f2 = nda_12.R.nextFloat();
        float f3 = a2.j.J() == sZ.HARD ? Yqa.C : Jpa.B;
        if (f2 < f3) {
            if (a2.R.nextInt(yRa.d) == 0) {
                a2.f(uSa.E, new Mda(Gea.LA));
                return;
            }
            a2.f(uSa.E, new Mda(Gea.NB));
        }
    }

    public void f(Waa waa2) {
        nda_1 a2;
        nda_1 b2 = waa2;
        nda_1 nda_12 = a2 = this;
        super.f((Waa)b2);
        if (nda_12.Y()) {
            b2.J(LRa.I, vRa.d != 0);
        }
        if (a2.Fa()) {
            b2.J(aua.o, vRa.d != 0);
        }
        b2.J(Yqa.ca, a2.v() ? a2.i : pua.o);
        b2.J(Pua.p, a2.ba());
    }

    public float l() {
        nda_1 nda_12 = this;
        float a2 = wPa.G;
        if (nda_12.Y()) {
            a2 = (float)((double)a2 - dqa.m);
        }
        return a2;
    }

    public boolean Y() {
        nda_1 a2;
        if (a2.J().J(lqa.s) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean n() {
        nda_1 a2;
        if (!a2.v()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ, oA oA2) {
        double d2;
        Object object;
        void b2;
        nda_1 a2;
        nda_1 c2 = oA2;
        nda_1 nda_12 = a2 = this;
        c2 = super.J((KZ)b2, (oA)c2);
        float f2 = b2.f();
        nda_12.D((nda_12.R.nextFloat() < vTa.N * f2 ? vRa.d : uSa.E) != 0);
        if (c2 == null) {
            nda_1 nda_13;
            boolean bl;
            nda_1 nda_14 = a2;
            if (nda_14.j.v.nextFloat() < Yqa.C) {
                bl = vRa.d;
                nda_13 = a2;
            } else {
                bl = uSa.E;
                nda_13 = a2;
            }
            c2 = new uea((nda)nda_14, bl, (nda_13.j.v.nextFloat() < Yqa.C ? vRa.d : uSa.E) != 0, null);
        }
        if (c2 instanceof uea) {
            object = (uea)c2;
            if (((uea)object).J) {
                a2.I(vRa.d != 0);
            }
            if (((uea)object).I) {
                nda_1 nda_15 = a2;
                nda_15.k(vRa.d != 0);
                if ((double)nda_15.j.v.nextFloat() < fPa.ca) {
                    List list = a2.j.J(aEa.class, a2.J().f(DQa.S, uRa.I, DQa.S), Kaa.I);
                    if (!list.isEmpty()) {
                        aEa aEa2;
                        aEa aEa3 = aEa2 = (aEa)((Object)list.get(uSa.E));
                        aEa3.F(vRa.d != 0);
                        a2.l((vL)aEa3);
                    }
                } else if ((double)a2.j.v.nextFloat() < fPa.ca) {
                    aEa aEa4;
                    aEa aEa5 = aEa4 = new aEa((Gg)a2.j);
                    aEa5.f(a2.la, a2.Z, a2.A, a2.X, JPa.N);
                    aEa5.J((KZ)b2, null);
                    aEa4.F(vRa.d != 0);
                    a2.j.f((vL)aEa4);
                    a2.l((vL)aEa4);
                }
            }
        }
        nda_1 nda_16 = a2;
        nda_16.j((nda_16.R.nextFloat() < f2 * Nra.e ? vRa.d : uSa.E) != 0);
        nda_1 nda_17 = a2;
        nda_17.J((KZ)b2);
        nda_17.f((KZ)b2);
        if (nda_17.f(AQa.P) == null && ((Calendar)(object = a2.j.J())).get(uqa.g) + vRa.d == NTa.C && ((Calendar)object).get(tTa.h) == tua.U && a2.R.nextFloat() < rta.o) {
            a2.f(AQa.P, new Mda(a2.R.nextFloat() < Nra.e ? QFa.NC : QFa.s));
            a2.F[AQa.P] = JPa.N;
        }
        nda_1 nda_18 = a2;
        nda_18.J(Kha.k).J(new CEa(Pqa.Q, a2.R.nextDouble() * ySa.Ja, uSa.E));
        double d3 = nda_18.R.nextDouble() * Bta.c * (double)f2;
        if (d2 > oua.i) {
            a2.J(Kha.I).J(new CEa(bpa.S, d3, uqa.g));
        }
        if (a2.R.nextFloat() < f2 * Yqa.C) {
            nda_1 nda_19 = a2;
            nda_19.J(k).J(new CEa(sSa.Aa, a2.R.nextDouble() * VPa.W + kTa.B, uSa.E));
            nda_19.J(Kha.M).J(new CEa(sSa.Aa, a2.R.nextDouble() * uRa.I + oua.i, uqa.g));
            nda_19.j(vRa.d != 0);
        }
        return c2;
    }

    public int I() {
        nda_1 nda_12 = this;
        int n2 = vRa.d;
        if (nda_12.R.nextFloat() < Jpa.B) {
            int n3;
            int a2 = uSa.E;
            zz zz2 = new zz();
            int n4 = n3 = (int)nda_12.la - AQa.P;
            while (n4 < (int)nda_12.la + AQa.P && a2 < hpa.Z) {
                int n5 = (int)nda_12.Z - AQa.P;
                while (n5 < (int)nda_12.Z + AQa.P && a2 < hpa.Z) {
                    int n6;
                    int n7 = (int)nda_12.A - AQa.P;
                    while (n7 < (int)nda_12.A + AQa.P && a2 < hpa.Z) {
                        int n8;
                        Block block = nda_12.j.J((XF)zz2.func_181079_c(n3, n6, n8)).J();
                        if (block == QFa.u || block == QFa.Pd) {
                            if (nda_12.R.nextFloat() < bpa.K) {
                                ++n2;
                            }
                            ++a2;
                        }
                        n7 = ++n8;
                    }
                    n5 = ++n6;
                }
                n4 = ++n3;
            }
        }
        return n2;
    }

    @Override
    public void y() {
        nda_1 nda_12 = this;
        if (nda_12.j.e() && !nda_12.j.e && !nda_12.Y()) {
            float f2 = nda_12.J(pqa.r);
            Object a2 = new XF(nda_12.la, Math.round(nda_12.Z), nda_12.A);
            if (f2 > MQa.L && nda_12.R.nextFloat() * NSa.B < (f2 - Xpa.R) * kta.v && nda_12.j.j((XF)((Object)a2))) {
                int n2 = vRa.d;
                a2 = nda_12.f(AQa.P);
                if (a2 != null) {
                    if (a2.d()) {
                        Object object = a2;
                        object.J(object.f() + nda_12.R.nextInt(uqa.g));
                        if (object.f() >= a2.l()) {
                            nda_1 nda_13 = nda_12;
                            nda_13.f((Mda)a2);
                            nda_13.f(AQa.P, null);
                        }
                    }
                    n2 = uSa.E;
                }
                if (n2 != 0) {
                    nda_12.J(Yqa.i);
                }
            }
        }
        if (nda_12.B() && nda_12.C() != null && nda_12.ja instanceof aEa) {
            ((Yfa)nda_12.ja).J().J(nda_12.J().J(), Bta.c);
        }
        super.y();
    }

    @Override
    public String f() {
        return RQa.r;
    }

    public LGa J() {
        return LGa.UNDEAD;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(gZ gZ2, float f2) {
        void a22;
        void b22;
        nda_1 nda_12 = this;
        if (super.J((gZ)b22, (float)a22)) {
            Gl a22 = nda_12.C();
            if (a22 == null && b22.f() instanceof Gl) {
                a22 = (Gl)b22.f();
            }
            if (a22 != null && nda_12.j.J() == sZ.HARD && (double)nda_12.R.nextFloat() < nda_12.J(k).f()) {
                int n2;
                nda_1 nda_13 = nda_12;
                int b22 = Oz.f((double)nda_13.la);
                int n3 = Oz.f((double)nda_13.Z);
                int n4 = Oz.f((double)nda_13.A);
                nda_1 c2 = new nda_1((Gg)nda_12.j);
                int n5 = n2 = uSa.E;
                while (n5 < vpa.o) {
                    int n6;
                    int n7;
                    int n8 = b22 + Oz.J((Random)nda_12.R, (int)XTa.W, (int)wra.P) * Oz.J((Random)nda_12.R, (int)pua.o, (int)vRa.d);
                    if (Gg.J((I)nda_12.j, (XF)new XF(n8, (n7 = n3 + Oz.J((Random)nda_12.R, (int)XTa.W, (int)wra.P) * Oz.J((Random)nda_12.R, (int)pua.o, (int)vRa.d)) - vRa.d, n6 = n4 + Oz.J((Random)nda_12.R, (int)XTa.W, (int)wra.P) * Oz.J((Random)nda_12.R, (int)pua.o, (int)vRa.d))) && nda_12.j.C(new XF(n8, n7, n6)) < NTa.C) {
                        c2.l(n8, n7, n6);
                        if (!nda_12.j.J((double)n8, (double)n7, (double)n6, hpa.y) && nda_12.j.J(c2.J(), (vL)c2)) {
                            nda_1 nda_14 = c2;
                            if (nda_12.j.J((vL)nda_14, nda_14.J()).isEmpty() && !nda_12.j.C(c2.J())) {
                                nda_1 nda_15 = nda_12;
                                nda_1 nda_16 = c2;
                                nda_15.j.f((vL)nda_16);
                                c2.C(a22);
                                nda_16.J(nda_15.j.J(new XF((vL)c2)), (oA)null);
                                nda_12.J(k).J(new CEa(dQa.V, wOa.G, uSa.E));
                                c2.J(k).J(new CEa(xOa.d, wOa.G, uSa.E));
                                break;
                            }
                        }
                    }
                    n5 = ++n2;
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void I(boolean bl) {
        boolean b2 = bl;
        nda_1 a2 = this;
        a2.J().J(uua.s, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    static {
        k = new Sda((RC)null, BQa.D, aSa.V, aSa.V, oua.i).J(aSa.E);
        C = UUID.fromString(TOa.k);
        E = new CEa(C, WSa.fa, kTa.B, vRa.d);
    }

    public void J() {
        nda_1 a2;
        nda_1 nda_12 = a2;
        super.J();
        nda_12.J().f(lqa.s, (byte)uSa.E);
        nda_12.J().f(uua.s, (byte)uSa.E);
        nda_12.J().f(hpa.Z, (byte)uSa.E);
    }

    public void j(boolean bl) {
        boolean b2 = bl;
        nda_1 a2 = this;
        if (a2.j != b2) {
            a2.j = b2;
            if (a2.j) {
                a2.D.J(vRa.d, (gFa)a2.M);
                return;
            }
            nda_1 nda_12 = a2;
            nda_12.D.J((gFa)nda_12.M);
        }
    }

    public void J(byte by2) {
        byte b2 = by2;
        nda_1 a2 = this;
        if (b2 == ERa.C) {
            if (!a2.c()) {
                nda_1 nda_12 = a2;
                nda_12.j.J(nda_12.la + kTa.B, a2.Z + kTa.B, (double)(a2.A + kTa.B), Fua.Ka, pqa.r + a2.R.nextFloat(), a2.R.nextFloat() * ZSa.q + bpa.K, uSa.E != 0);
                return;
            }
        } else {
            super.J(b2);
        }
    }

    public boolean ba() {
        nda_1 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public final void l(float f2, float f3) {
        void a2;
        void b2;
        nda_1 nda_12 = this;
        int c2 = nda_12.A > JPa.N && nda_12.m > JPa.N ? vRa.d : uSa.E;
        nda_1 nda_13 = nda_12;
        nda_13.A = b2;
        nda_13.m = a2;
        if (c2 == 0) {
            nda_12.G(pqa.r);
        }
    }

    @Override
    public void d() {
        nda_1 nda_12 = this;
        if (!nda_12.j.e && nda_12.v()) {
            nda_1 nda_13 = nda_12;
            int a2 = nda_13.I();
            nda_13.i -= a2;
            if (nda_13.i <= 0) {
                nda_12.V();
            }
        }
        super.d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean C(vL vL2) {
        void a2;
        nda_1 nda_12 = this;
        boolean bl = super.C((vL)a2);
        if (bl) {
            nda_1 nda_13 = nda_12;
            int b2 = nda_13.j.J().getDifficultyId();
            if (nda_13.J() == null && nda_12.o() && nda_12.R.nextFloat() < (float)b2 * bpa.K) {
                a2.J(uqa.g * b2);
            }
        }
        return bl;
    }

    public boolean J(Mda mda2) {
        nda_1 b2 = mda2;
        nda_1 a2 = this;
        if (b2.J() == Gea.C && a2.Y() && a2.B()) {
            return uSa.E != 0;
        }
        return super.J((Mda)b2);
    }

    public void J(gZ gZ2) {
        nda_1 b2 = gZ2;
        nda_1 a2 = this;
        nda_1 nda_12 = b2;
        super.J((gZ)nda_12);
        if (nda_12.f() instanceof zfa && !(a2 instanceof MEa) && ((zfa)b2.f()).ba() && ((zfa)b2.f()).Fa()) {
            ((zfa)b2.f()).X();
            a2.J(new Mda(Gea.GB, vRa.d, uqa.g), JPa.N);
        }
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        nda_1 a2 = this;
        a2.G(b2 ? MQa.L : pqa.r);
    }

    public int J(Sx sx2) {
        Object b2 = sx2;
        nda_1 a2 = this;
        if (a2.Y()) {
            a2.A = (int)((float)a2.A * MTa.y);
        }
        return super.J((Sx)((Object)b2));
    }

    public eAa J() {
        return Gea.qa;
    }

    public void J(Waa waa2) {
        nda_1 b2 = waa2;
        nda_1 a2 = this;
        nda_1 nda_12 = b2;
        super.J((Waa)nda_12);
        if (nda_12.f(LRa.I)) {
            a2.k(vRa.d != 0);
        }
        if (b2.f(aua.o)) {
            a2.I(vRa.d != 0);
        }
        if (b2.J(Yqa.ca, zOa.v) && b2.J(Yqa.ca) > pua.o) {
            a2.D(b2.J(Yqa.ca));
        }
        a2.j(b2.f(Pua.p));
    }

    public void D(int n2) {
        nda_1 a2;
        int b2 = n2;
        nda_1 nda_12 = a2 = this;
        nda_12.i = b2;
        nda_12.J().J(hpa.Z, Byte.valueOf((byte)vRa.d));
        nda_12.A(Hda.Q.O);
        nda_1 nda_13 = a2;
        nda_12.J(new kba(Hda.l.O, b2, Math.min(a2.j.J().getDifficultyId() - vRa.d, uSa.E)));
        nda_12.j.J((vL)a2, (byte)ERa.C);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        void a2;
        nda_1 nda_12 = this;
        nda_1 b2 = a2.f();
        if (b2 != null && b2.J() == Gea.pb && b2.J() == 0 && nda_12.Fa() && nda_12.J(Hda.Q)) {
            if (!a2.h.f()) {
                ((Mda)b2).E -= vRa.d;
            }
            if (((Mda)b2).E <= 0) {
                void v0 = a2;
                v0.K.J(v0.K.J, (Mda)null);
            }
            if (!nda_12.j.e) {
                nda_1 nda_13 = nda_12;
                nda_13.D(nda_13.R.nextInt(yRa.w) + csa.W);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public nda_1(Gg gg2) {
        nda_1 a2;
        nda_1 b2 = gg2;
        nda_1 nda_12 = a2 = this;
        super((Gg)b2);
        nda_1 nda_13 = a2;
        nda_12.M = new vha(a2);
        nda_13.j = uSa.E;
        nda_12.A = vqa.T;
        ((Hba)nda_12.J()).d(vRa.d != 0);
        nda_1 nda_14 = a2;
        nda_14.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        nda_14.D.J(uqa.g, (gFa)new ADa((bga)a2, Sx.class, oua.i, uSa.E != 0));
        nda_14.D.J(tTa.h, (gFa)new Qia((bga)a2, oua.i));
        nda_14.D.J(XTa.W, (gFa)new HDa(a2, oua.i));
        nda_14.D.J(Yqa.i, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        nda_14.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        nda_14.N();
        nda_14.l(nda_1.d(), UOa.k);
    }

    public void N() {
        nda_1 a2;
        nda_1 nda_12 = a2;
        nda_12.D.J(AQa.P, (gFa)new ADa((bga)a2, mFa.class, oua.i, vRa.d != 0));
        nda_12.D.J(AQa.P, (gFa)new ADa((bga)a2, DDa.class, oua.i, vRa.d != 0));
        nda_12.D.J(uua.p, (gFa)new Tga((bga)a2, oua.i, uSa.E != 0));
        Class[] classArray = new Class[vRa.d];
        classArray[uSa.E] = MEa.class;
        nda_12.L.J(vRa.d, (gFa)new IFa(a2, vRa.d != 0, classArray));
        nda_1 nda_13 = a2;
        nda_13.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
        nda_13.L.J(uqa.g, (gFa)new NEa((bga)a2, mFa.class, uSa.E != 0));
        nda_13.L.J(uqa.g, (gFa)new NEa((bga)a2, DDa.class, vRa.d != 0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void p() {
        nda_1 a2;
        switch (a2.R.nextInt(yRa.d)) {
            case 0: {
                a2.J(Gea.GA, vRa.d);
                return;
            }
            case 1: {
                a2.J(Gea.EB, vRa.d);
                return;
            }
            case 2: {
                a2.J(Gea.cA, vRa.d);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void k(boolean bl) {
        void a2;
        nda_1 nda_12 = this;
        nda_12.J().J(lqa.s, Byte.valueOf((byte)(a2 != false ? vRa.d : uSa.E)));
        if (nda_12.j != null && !nda_12.j.e) {
            bA b2 = nda_12.J(Kha.j);
            b2.f(E);
            if (a2 != false) {
                b2.J(E);
            }
        }
        nda_12.F((boolean)a2);
    }

    public boolean v() {
        nda_1 a2;
        if (a2.J().J(hpa.Z) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        nda_1 nda_12 = this;
        int a2 = super.f() + uqa.g;
        if (a2 > kTa.j) {
            a2 = kTa.j;
        }
        return a2;
    }
}

