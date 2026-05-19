/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  DQa
 *  FPa
 *  Gg
 *  Gl
 *  Hba
 *  IGa
 *  ISa
 *  JFa
 *  JTa
 *  LC
 *  LGa
 *  Lra
 *  NEa
 *  NTa
 *  Oz
 *  QFa
 *  Qsa
 *  SIa
 *  UZ
 *  Waa
 *  XTa
 *  YSa
 *  Yfa
 *  Ypa
 *  ZRa
 *  Zpa
 *  Zta
 *  aSa
 *  aX
 *  afa
 *  cRa
 *  dpa
 *  fTa
 *  gFa
 *  gZ
 *  hTa
 *  hqa
 *  jea
 *  kba
 *  kqa
 *  kta
 *  nHa
 *  oHa
 *  pqa
 *  pua
 *  sd
 *  uRa
 *  ura
 *  vL
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IDa
extends hFa
implements sd,
LC {
    private int[] C;
    private static final Predicate<vL> i = new JFa();
    private float[] M;
    private int k;
    private float[] j;
    private float[] J;
    private float[] A;
    private int[] I;

    public int f() {
        return AQa.P;
    }

    public void J(boolean bl, int n2) {
        boolean c22 = bl;
        IDa b2 = this;
        Object c22 = b2.J(Gea.pA, vRa.d);
        if (c22 != null) {
            c22.A();
        }
        if (!b2.j.e) {
            c22 = b2.j.J(Sx.class, b2.J().f(ZRa.r, fqa.W, ZRa.r)).iterator();
            Iterator iterator = c22;
            while (iterator.hasNext()) {
                ((Sx)((Object)c22.next())).J((aX)mY.H);
                iterator = c22;
            }
        }
    }

    public int f(int n2) {
        int b2 = n2;
        IDa a2 = this;
        return a2.aa.J(yta.Ka + b2);
    }

    public float f(int n2) {
        int b2 = n2;
        IDa a2 = this;
        return a2.j[b2];
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Gl gl2) {
        void b2;
        IDa c2 = gl2;
        IDa a2 = this;
        a2.J((int)b2, ((Gl)c2).la, ((Gl)c2).Z + (double)c2.l() * kTa.B, ((Gl)c2).A, (b2 == false && a2.R.nextFloat() < ZSa.r ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        IDa a2 = this;
        a2.aa.J(yta.Ka + b2, Integer.valueOf(c2));
    }

    public String A() {
        return XOa.s;
    }

    public void r() {
        IDa iDa = this;
        if (iDa.I() > 0) {
            int a2 = iDa.I() - vRa.d;
            if (a2 <= 0) {
                IDa iDa2 = iDa;
                IDa iDa3 = iDa;
                iDa2.j.J((vL)iDa3, iDa2.la, iDa3.Z + (double)iDa.l(), (double)iDa.A, BRa.k, uSa.E != 0, iDa.j.J().f(kqa.N));
                iDa.j.l(Lra.m, new XF((vL)iDa), uSa.E);
            }
            IDa iDa4 = iDa;
            iDa4.D(a2);
            if (iDa4.g % NTa.C == 0) {
                iDa.e(FRa.Ga);
                return;
            }
        } else {
            IDa iDa5;
            int n2;
            int a2;
            super.r();
            int n3 = a2 = vRa.d;
            while (n3 < yRa.d) {
                IDa iDa6 = iDa;
                if (iDa6.g >= iDa6.C[a2 - vRa.d]) {
                    Object object;
                    IDa iDa7 = iDa;
                    iDa.C[a2 - vRa.d] = iDa7.g + NTa.C + iDa.R.nextInt(NTa.C);
                    if (iDa7.j.J() == sZ.NORMAL || iDa.j.J() == sZ.HARD) {
                        n2 = a2 - vRa.d;
                        IDa iDa8 = iDa;
                        int n4 = iDa8.I[a2 - vRa.d];
                        iDa8.I[n2] = iDa.I[a2 - vRa.d] + vRa.d;
                        if (n4 > Ypa.A) {
                            float f2 = FRa.Ga;
                            float f3 = eua.C;
                            IDa iDa9 = iDa;
                            IDa iDa10 = iDa;
                            double d2 = Oz.J((Random)iDa9.R, (double)(iDa10.la - (double)f2), (double)(iDa.la + (double)f2));
                            double d3 = Oz.J((Random)iDa9.R, (double)(iDa.Z - (double)f3), (double)(iDa.Z + (double)f3));
                            double d4 = Oz.J((Random)iDa10.R, (double)(iDa.A - (double)f2), (double)(iDa.A + (double)f2));
                            iDa9.J(a2 + vRa.d, d2, d3, d4, vRa.d != 0);
                            iDa9.I[a2 - vRa.d] = uSa.E;
                        }
                    }
                    if ((n2 = iDa.f(a2)) > 0) {
                        object = iDa.j.J(n2);
                        if (object != null && object.K() && iDa.J((vL)object) <= ura.Ga && iDa.l((vL)object)) {
                            if (object instanceof Sx && ((Sx)((Object)object)).h.M) {
                                iDa.J(a2, uSa.E);
                            } else {
                                iDa.J(a2 + vRa.d, (Gl)object);
                                IDa iDa11 = iDa;
                                iDa.C[a2 - vRa.d] = iDa11.g + wra.P + iDa.R.nextInt(kTa.j);
                                iDa11.I[a2 - vRa.d] = uSa.E;
                            }
                        } else {
                            iDa.J(a2, uSa.E);
                        }
                    } else {
                        object = iDa.j.J(Gl.class, iDa.J().f(vQa.c, Wqa.Z, vQa.c), Predicates.and(i, Kaa.A));
                        int n5 = uSa.E;
                        while (n5 < NTa.C && !object.isEmpty()) {
                            int n6;
                            Object object2 = object;
                            Gl gl2 = (Gl)object2.get(iDa.R.nextInt(object2.size()));
                            if (gl2 != iDa && gl2.K() && iDa.l((vL)gl2)) {
                                if (gl2 instanceof Sx) {
                                    if (((Sx)gl2).h.M) break;
                                    iDa.J(a2, gl2.M());
                                    break;
                                }
                                iDa.J(a2, gl2.M());
                                break;
                            }
                            object.remove(gl2);
                            n5 = ++n6;
                        }
                    }
                }
                n3 = ++a2;
            }
            IDa iDa12 = iDa;
            if (iDa.C() != null) {
                iDa12.J(uSa.E, iDa.C().M());
                iDa5 = iDa;
            } else {
                iDa12.J(uSa.E, uSa.E);
                iDa5 = iDa;
            }
            if (iDa5.k > 0) {
                IDa iDa13 = iDa;
                iDa13.k -= vRa.d;
                if (iDa13.k == 0 && iDa.j.J().f(kqa.N)) {
                    int n7;
                    IDa iDa14 = iDa;
                    a2 = Oz.f((double)iDa14.Z);
                    n2 = Oz.f((double)iDa14.la);
                    int n8 = Oz.f((double)iDa14.A);
                    int n9 = uSa.E;
                    int n10 = n7 = pua.o;
                    while (n10 <= vRa.d) {
                        int n11 = pua.o;
                        while (n11 <= vRa.d) {
                            int n12;
                            int n13 = uSa.E;
                            while (n13 <= yRa.d) {
                                int n14;
                                int n15 = n2 + n7;
                                int n16 = a2 + n14;
                                int n17 = n8 + n12;
                                XF xF = new XF(n15, n16, n17);
                                Block block = iDa.j.J(xF).J();
                                if (block.J() != Material.air && IDa.J(block)) {
                                    n9 = iDa.j.f(xF, vRa.d != 0) || n9 != 0 ? vRa.d : uSa.E;
                                }
                                n13 = ++n14;
                            }
                            n11 = ++n12;
                        }
                        n10 = ++n7;
                    }
                    if (n9 != 0) {
                        iDa.j.J((Sx)null, FPa.s, new XF((vL)iDa), uSa.E);
                    }
                }
            }
            if (iDa.g % kTa.j == 0) {
                iDa.e(pqa.r);
            }
        }
    }

    private double l(int n2) {
        int b22 = n2;
        IDa a2 = this;
        if (b22 <= 0) {
            return (double)a2.A;
        }
        IDa iDa = a2;
        float b22 = Oz.d((float)((iDa.ba + (float)(cRa.n * (b22 - vRa.d))) / Hra.Ga * pua.j));
        return (double)(iDa.A + (double)b22 * ISa.ca);
    }

    public IDa(Gg gg2) {
        IDa a2;
        IDa b2 = gg2;
        IDa iDa = a2 = this;
        super((Gg)b2);
        iDa.M = new float[uqa.g];
        iDa.j = new float[uqa.g];
        iDa.A = new float[uqa.g];
        iDa.J = new float[uqa.g];
        iDa.C = new int[uqa.g];
        iDa.I = new int[uqa.g];
        iDa.A(iDa.J());
        iDa.l(ATa.r, Bpa.w);
        iDa.z = vRa.d;
        ((Hba)iDa.J()).f(vRa.d != 0);
        IDa iDa2 = a2;
        iDa2.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        iDa2.D.J(uqa.g, (gFa)new IGa((LC)a2, oua.i, wra.P, eta.e));
        iDa2.D.J(tTa.h, (gFa)new HDa(a2, oua.i));
        iDa2.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        iDa2.D.J(XTa.W, (gFa)new SIa((Yfa)a2));
        iDa2.L.J(vRa.d, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        a2.L.J(uqa.g, (gFa)new NEa((bga)a2, Yfa.class, uSa.E, uSa.E != 0, uSa.E != 0, i));
        a2.A = (float[])vpa.o;
    }

    public void D(int n2) {
        int b2 = n2;
        IDa a2 = this;
        a2.aa.J(kTa.j, Integer.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        float f5;
        void c2;
        float d2 = f3;
        IDa b2 = this;
        d2 = Oz.f((float)(d2 - c2));
        if (f5 > a2) {
            d2 = a2;
        }
        if (d2 < -a2) {
            d2 = -a2;
        }
        return (float)(c2 + d2);
    }

    @Override
    public void y() {
        int n2;
        double d2;
        double d3;
        double d4;
        IDa a22;
        IDa iDa;
        IDa iDa2 = iDa = this;
        iDa2.J(iDa2.Ea * Zpa.ca);
        if (!iDa2.j.e && iDa.f(uSa.E) > 0 && (a22 = iDa.j.J(iDa.f(uSa.E))) != null) {
            double d5;
            if (iDa.Z < ((vL)a22).Z || !iDa.v() && iDa.Z < ((vL)a22).Z + DQa.S) {
                if (iDa.Ea < aSa.V) {
                    iDa.J(aSa.V);
                }
                IDa iDa3 = iDa;
                iDa3.J(iDa3.Ea + (kTa.B - iDa.Ea) * Zpa.ca);
            }
            IDa iDa4 = a22;
            double d6 = ((vL)iDa4).la - iDa.la;
            d4 = ((vL)iDa4).A - iDa.A;
            double d7 = d6;
            double d8 = d4;
            d3 = d7 * d7 + d8 * d8;
            if (d5 > KSa.F) {
                d2 = Oz.J((double)d3);
                IDa iDa5 = iDa;
                iDa5.f((double)(iDa5.i + (d6 / d2 * kTa.B - iDa.i) * Zpa.ca));
                iDa5.l(iDa5.f + (d4 / d2 * kTa.B - iDa.f) * Zpa.ca);
            }
        }
        if (iDa.i * iDa.i + iDa.f * iDa.f > ySa.Ja) {
            iDa.X = (float)Oz.f((double)iDa.f, iDa.i) * zpa.Z - ISa.a;
        }
        super.y();
        int n3 = a22 = uSa.E;
        while (n3 < uqa.g) {
            IDa iDa6 = iDa;
            iDa.J[a22] = iDa6.j[a22];
            int n4 = a22++;
            iDa6.A[n4] = iDa.M[n4];
            n3 = a22;
        }
        int n5 = a22 = uSa.E;
        while (n5 < uqa.g) {
            int n6 = iDa.f(a22 + vRa.d);
            vL vL2 = null;
            if (n6 > 0) {
                vL2 = iDa.j.J(n6);
            }
            if (vL2 != null) {
                IDa iDa7 = iDa;
                IDa iDa8 = iDa;
                d4 = iDa8.J(a22 + vRa.d);
                d3 = iDa8.f(a22 + vRa.d);
                d2 = iDa7.l(a22 + vRa.d);
                vL vL3 = vL2;
                double d9 = vL3.la - d4;
                double d10 = vL3.Z + (double)vL2.l() - d3;
                double d11 = vL2.A - d2;
                double d12 = d9;
                double d13 = d11;
                double d14 = Oz.J((double)(d12 * d12 + d13 * d13));
                float f2 = (float)(Oz.f((double)d11, (double)d9) * kta.Da / lQa.f) - ISa.a;
                float f3 = (float)(-(Oz.f((double)d10, (double)d14) * kta.Da / lQa.f));
                IDa iDa9 = iDa;
                int n7 = a22;
                iDa7.M[n7] = iDa9.J(iDa9.M[n7], f3, ZRa.l);
                IDa iDa10 = iDa;
                int n8 = a22;
                iDa7.j[n8] = iDa10.J(iDa10.j[n8], f2, FRa.Ga);
            } else {
                IDa iDa11 = iDa;
                int n9 = a22;
                iDa.j[n9] = iDa11.J(iDa11.j[n9], iDa.ba, FRa.Ga);
            }
            n5 = ++a22;
        }
        int a22 = iDa.v() ? 1 : 0;
        int n10 = n2 = uSa.E;
        while (n10 < yRa.d) {
            IDa iDa12 = iDa;
            double d15 = iDa12.J(n2);
            double d16 = iDa12.f(n2);
            double d17 = iDa12.l(n2);
            iDa12.j.J(UZ.SMOKE_NORMAL, d15 + iDa.R.nextGaussian() * osa.b, d16 + iDa.R.nextGaussian() * osa.b, d17 + iDa.R.nextGaussian() * osa.b, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            if (a22 != 0 && iDa.j.v.nextInt(AQa.P) == 0) {
                iDa.j.J(UZ.SPELL_MOB, d15 + iDa.R.nextGaussian() * osa.b, d16 + iDa.R.nextGaussian() * osa.b, d17 + iDa.R.nextGaussian() * osa.b, dpa.X, dpa.X, kTa.B, new int[uSa.E]);
            }
            n10 = ++n2;
        }
        if (iDa.I() > 0) {
            int n11 = n2 = uSa.E;
            while (n11 < yRa.d) {
                int n12 = --1;
                iDa.j.J(UZ.SPELL_MOB, iDa.la + iDa.R.nextGaussian() * oua.i, iDa.Z + (double)(iDa.R.nextFloat() * hTa.w), (double)(iDa.A + iDa.R.nextGaussian() * oua.i), dpa.X, dpa.X, hqa.l, new int[uSa.E]);
                n11 = ++n2;
            }
        }
    }

    @Override
    public String f() {
        return fTa.r;
    }

    public void N() {
        IDa a2;
        IDa iDa = a2;
        iDa.D(fTa.Ja);
        iDa.A(iDa.J() / vQa.q);
    }

    public void J() {
        IDa a2;
        IDa iDa = a2;
        super.J();
        iDa.aa.f(yta.Ka, new Integer(uSa.E));
        iDa.aa.f(yOa.B, new Integer(uSa.E));
        iDa.aa.f(wOa.t, new Integer(uSa.E));
        iDa.aa.f(kTa.j, new Integer(uSa.E));
    }

    public void a() {
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, double d2, double d3, double d4, boolean bl) {
        void a2;
        int f22 = n2;
        IDa e2 = this;
        e2.j.J((Sx)null, Zta.I, new XF((vL)e2), uSa.E);
        IDa iDa = e2;
        double d5 = iDa.J(f22);
        double d6 = iDa.f(f22);
        double d7 = iDa.l(f22);
        afa f22 = new afa((Gg)e2.j, (Gl)e2, (double)(d -= d5), (double)(c -= d6), (double)(b -= d7));
        if (a2 != false) {
            f22.A(vRa.d != 0);
        }
        afa afa2 = f22;
        afa2.Z = d6;
        afa2.la = d5;
        f22.A = d7;
        e2.j.f((vL)f22);
    }

    public LGa J() {
        return LGa.UNDEAD;
    }

    public void J(Gl gl2, float f2) {
        IDa c2 = gl2;
        IDa b2 = this;
        b2.J(uSa.E, (Gl)c2);
    }

    private double f(int n2) {
        int b2 = n2;
        IDa a2 = this;
        if (b2 <= 0) {
            return a2.Z + uRa.I;
        }
        return a2.Z + Jta.ja;
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        IDa iDa = this;
    }

    public boolean v() {
        IDa a2;
        if (a2.f() <= a2.J() / kta.v) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private double J(int n2) {
        int b22 = n2;
        IDa a2 = this;
        if (b22 <= 0) {
            return a2.la;
        }
        IDa iDa = a2;
        float b22 = Oz.C((float)((iDa.ba + (float)(cRa.n * (b22 - vRa.d))) / Hra.Ga * pua.j));
        return iDa.la + (double)b22 * ISa.ca;
    }

    public void J(kba object) {
        IDa b2 = object;
        object = this;
    }

    @Override
    public String i() {
        return JTa.F;
    }

    public void n() {
        a.s = uSa.E;
    }

    public void f(Waa waa2) {
        IDa b2 = waa2;
        IDa a2 = this;
        IDa iDa = b2;
        super.f((Waa)iDa);
        iDa.J(wua.N, a2.I());
    }

    public static boolean J(Block a2) {
        if (a2 != QFa.bg && a2 != QFa.mc && a2 != QFa.jE && a2 != QFa.Ac && a2 != QFa.fE) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int I() {
        IDa a2;
        return a2.aa.J(kTa.j);
    }

    public int J(float f2) {
        float b2 = f2;
        IDa a2 = this;
        return YSa.L;
    }

    public void l(vL vL2) {
        IDa b2 = vL2;
        IDa a2 = this;
        a2.ja = null;
    }

    @Override
    public void s() {
        IDa a2;
        IDa iDa = a2;
        super.s();
        iDa.J(Kha.M).J(dua.d);
        iDa.J(Kha.j).J(Zpa.ca);
        iDa.J(Kha.I).J(ITa.a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(gZ gZ2, float f2) {
        void b2;
        IDa iDa = this;
        if (iDa.J((gZ)b2)) {
            return uSa.E != 0;
        }
        if (b2 != gZ.f && !(b2.f() instanceof IDa)) {
            void a2;
            IDa c2;
            if (iDa.I() > 0 && b2 != gZ.c) {
                return uSa.E != 0;
            }
            if (iDa.v() && (c2 = b2.J()) instanceof jea) {
                return uSa.E != 0;
            }
            c2 = b2.f();
            if (c2 != null && !(c2 instanceof Sx) && c2 instanceof Gl && ((Gl)c2).J() == iDa.J()) {
                return uSa.E != 0;
            }
            if (iDa.k <= 0) {
                iDa.k = kTa.j;
            }
            int n2 = c2 = uSa.E;
            while (n2 < iDa.I.length) {
                int n3 = c2++;
                iDa.I[n3] = iDa.I[n3] + yRa.d;
                n2 = c2;
            }
            return super.J((gZ)b2, (float)a2);
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        IDa a2;
        IDa b2 = waa2;
        IDa iDa = a2 = this;
        super.J((Waa)b2);
        iDa.D(b2.J(wua.N));
    }

    public float J(int n2) {
        int b2 = n2;
        IDa a2 = this;
        return a2.M[b2];
    }
}

