/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Gg
 *  Gl
 *  Hda
 *  IGa
 *  JPa
 *  LC
 *  Mda
 *  NEa
 *  NTa
 *  Oz
 *  Qsa
 *  SIa
 *  TQa
 *  UZ
 *  XTa
 *  Yfa
 *  Ypa
 *  Zpa
 *  Zta
 *  aSa
 *  dQa
 *  eAa
 *  gFa
 *  gZ
 *  kDa
 *  kba
 *  nHa
 *  oHa
 *  psa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  wOa
 */
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.material.Material;

public final class nFa_3
extends hFa
implements LC {
    private static final CEa i;
    private static final UUID M;
    private int k;
    private static final eAa[] I;

    public void J() {
        nFa_3 a2;
        nFa_3 nFa_32 = a2;
        super.J();
        nFa_32.J().f(wOa.h, (byte)uSa.E);
    }

    public float l() {
        return FRa.ja;
    }

    public String A() {
        return null;
    }

    @Override
    public void y() {
        nFa_3 nFa_32;
        block13: {
            nFa_3 nFa_33;
            block16: {
                block15: {
                    int n2;
                    block14: {
                        List<kba> list;
                        nFa_32 = this;
                        if (nFa_32.j.e) break block13;
                        if (!nFa_32.v()) break block14;
                        int n3 = nFa_32.k;
                        nFa_32.k = n3 - vRa.d;
                        if (n3 > 0) break block15;
                        nFa_3 nFa_34 = nFa_32;
                        nFa_34.k(uSa.E != 0);
                        nFa_3 a2 = nFa_34.J();
                        nFa_34.f(uSa.E, null);
                        if (a2 != null && a2.J() == Gea.aa && (list = Gea.aa.J((Mda)a2)) != null) {
                            Iterator<kba> iterator;
                            Iterator<kba> iterator2 = iterator = list.iterator();
                            while (iterator2.hasNext()) {
                                kba kba2 = iterator.next();
                                iterator2 = iterator;
                                nFa_32.J(new kba(kba2));
                            }
                        }
                        nFa_3 nFa_35 = nFa_32;
                        nFa_33 = nFa_35;
                        nFa_35.J(Kha.j).f(i);
                        break block16;
                    }
                    int a2 = pua.o;
                    if (nFa_32.R.nextFloat() < VPa.i && nFa_32.J(Material.water) && !nFa_32.J(Hda.E)) {
                        n2 = a2 = aSa.Da;
                    } else if (nFa_32.R.nextFloat() < VPa.i && nFa_32.o() && !nFa_32.J(Hda.G)) {
                        n2 = a2 = dQa.ba;
                    } else if (nFa_32.R.nextFloat() < Yqa.C && nFa_32.f() < nFa_32.J()) {
                        n2 = a2 = QTa.o;
                    } else if (nFa_32.R.nextFloat() < rta.o && nFa_32.C() != null && !nFa_32.J(Hda.o) && nFa_32.C().J((vL)nFa_32) > Bua.W) {
                        n2 = a2 = Zta.j;
                    } else {
                        if (nFa_32.R.nextFloat() < rta.o && nFa_32.C() != null && !nFa_32.J(Hda.o) && nFa_32.C().J((vL)nFa_32) > Bua.W) {
                            a2 = Zta.j;
                        }
                        n2 = a2;
                    }
                    if (n2 > pua.o) {
                        nFa_3 nFa_36 = nFa_32;
                        nFa_36.f(uSa.E, new Mda((eAa)Gea.aa, vRa.d, a2));
                        nFa_36.k = nFa_36.J().C();
                        nFa_36.k(vRa.d != 0);
                        bA bA2 = nFa_36.J(Kha.j);
                        bA2.f(i);
                        bA2.J(i);
                    }
                }
                nFa_33 = nFa_32;
            }
            if (nFa_33.R.nextFloat() < Jra.s) {
                nFa_32.j.J((vL)nFa_32, (byte)Ypa.A);
            }
        }
        super.y();
    }

    public nFa_3(Gg gg2) {
        nFa_3 a2;
        nFa_3 b2 = gg2;
        nFa_3 nFa_32 = a2 = this;
        super((Gg)b2);
        nFa_32.l(nFa_3.d(), UOa.k);
        nFa_32.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        nFa_32.D.J(uqa.g, (gFa)new IGa((LC)a2, oua.i, Psa.M, FRa.Ga));
        nFa_32.D.J(uqa.g, (gFa)new HDa(a2, oua.i));
        nFa_32.D.J(yRa.d, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        nFa_32.D.J(yRa.d, (gFa)new SIa((Yfa)a2));
        nFa_32.L.J(vRa.d, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        a2.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
    }

    @Override
    public void s() {
        nFa_3 a2;
        nFa_3 nFa_32 = a2;
        super.s();
        nFa_32.J(Kha.M).J(rua.g);
        nFa_32.J(Kha.j).J(VPa.W);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl2, int n2) {
        int n3;
        nFa_3 nFa_32 = this;
        int b2 = nFa_32.R.nextInt(yRa.d) + vRa.d;
        int n4 = n3 = uSa.E;
        while (n4 < b2) {
            void a2;
            int c2 = nFa_32.R.nextInt(yRa.d);
            eAa eAa2 = I[nFa_32.R.nextInt(I.length)];
            if (a2 > 0) {
                c2 += nFa_32.R.nextInt((int)(a2 + vRa.d));
            }
            int n5 = uSa.E;
            while (n5 < c2) {
                int n6;
                nFa_32.J(eAa2, vRa.d);
                n5 = ++n6;
            }
            n4 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(byte by2) {
        void a2;
        nFa_3 nFa_32 = this;
        if (a2 == Ypa.A) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < nFa_32.R.nextInt(TQa.ca) + NTa.C) {
                int n3 = --1;
                nFa_32.j.J(UZ.SPELL_WITCH, nFa_32.la + nFa_32.R.nextGaussian() * Hra.Ha, nFa_32.J().M + kTa.B + nFa_32.R.nextGaussian() * Hra.Ha, nFa_32.A + nFa_32.R.nextGaussian() * Hra.Ha, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                n2 = ++b2;
            }
        } else {
            super.J((byte)a2);
        }
    }

    @Override
    public String f() {
        return null;
    }

    static {
        M = UUID.fromString(APa.r);
        i = new CEa(M, DQa.Ja, Nta.a, uSa.E).J(uSa.E != 0);
        eAa[] eAaArray = new eAa[Yqa.i];
        eAaArray[uSa.E] = Gea.Sa;
        eAaArray[vRa.d] = Gea.hb;
        eAaArray[uqa.g] = Gea.zc;
        eAaArray[yRa.d] = Gea.Kd;
        eAaArray[AQa.P] = Gea.J;
        eAaArray[tTa.h] = Gea.xB;
        eAaArray[uua.p] = Gea.t;
        eAaArray[XTa.W] = Gea.t;
        I = eAaArray;
    }

    public void k(boolean bl2) {
        boolean b2 = bl2;
        nFa_3 a2 = this;
        a2.J().J(wOa.h, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    @Override
    public String i() {
        return null;
    }

    public boolean v() {
        nFa_3 a2;
        if (a2.J().J(wOa.h) == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Gl gl2, float f2) {
        nFa_3 c2 = gl2;
        nFa_3 b2 = this;
        if (!b2.v()) {
            kDa kDa2;
            float f3;
            kDa a2 = new kDa(b2.j, (Gl)b2, vTa.v);
            nFa_3 nFa_32 = c2;
            double d2 = ((Gl)nFa_32).Z + (double)c2.l() - Tqa.T;
            a2.d -= Lsa.X;
            double d3 = ((Gl)nFa_32).la + ((Gl)c2).i - b2.la;
            d2 -= b2.Z;
            double d4 = ((Gl)nFa_32).A + ((Gl)c2).f - b2.A;
            double d5 = d3;
            double d6 = d4;
            float f4 = Oz.J((double)(d5 * d5 + d6 * d6));
            if (f3 >= Qsa.k && !c2.J(Hda.N)) {
                kDa kDa3 = a2;
                kDa2 = kDa3;
                kDa3.M(rSa.Ha);
            } else if (c2.f() >= Qsa.k && !c2.J(Hda.c)) {
                kDa kDa4 = a2;
                kDa2 = kDa4;
                kDa4.M(Zpa.R);
            } else {
                if (f4 <= vQa.q && !c2.J(Hda.Q) && b2.R.nextFloat() < rta.o) {
                    a2.M(kra.X);
                }
                kDa2 = a2;
            }
            kDa2.J(d3, d2 + (double)(f4 * psa.N), d4, wOa.w, Qsa.k);
            b2.j.f((vL)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public float f(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        nFa_3 a2 = this;
        void v0 = b2;
        c2 = super.f((gZ)v0, c2);
        if (v0.f() == a2) {
            c2 = JPa.N;
        }
        if (b2.J()) {
            c2 = (float)((double)c2 * uSa.W);
        }
        return c2;
    }
}

