/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  DDa
 *  EQa
 *  FPa
 *  Gg
 *  Gl
 *  Hda
 *  IGa
 *  JPa
 *  KZ
 *  LC
 *  LGa
 *  MQa
 *  MX
 *  Mda
 *  NEa
 *  NTa
 *  QFa
 *  Qsa
 *  SIa
 *  SQa
 *  Usa
 *  Waa
 *  Yfa
 *  ZOa
 *  aSa
 *  aX
 *  bSa
 *  eAa
 *  gFa
 *  gZ
 *  gia
 *  jea
 *  kGa
 *  kba
 *  kta
 *  lFa
 *  lqa
 *  nHa
 *  oA
 *  oHa
 *  pqa
 *  qta
 *  tia
 *  uRa
 *  vL
 *  vRa
 *  wPa
 *  wga
 *  xfa
 *  zfa
 */
import java.util.Calendar;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lEa_3
extends hFa
implements LC {
    private IGa A;
    private ADa I;

    public oA J(KZ kZ2, oA oA2) {
        lEa_3 lEa_32;
        oA a2;
        lEa_3 b2;
        Object c2 = kZ2;
        lEa_3 lEa_33 = b2 = this;
        a2 = super.J((KZ)c2, a2);
        if (lEa_33.j.F instanceof MX && b2.J().nextInt(tTa.h) > 0) {
            lEa_3 lEa_34 = b2;
            lEa_32 = lEa_34;
            lEa_3 lEa_35 = b2;
            lEa_34.D.J(AQa.P, (gFa)lEa_35.I);
            lEa_35.D(vRa.d);
            lEa_34.f(uSa.E, new Mda(Gea.jb));
            lEa_34.J(Kha.A).J(FPa.T);
        } else {
            lEa_32 = b2;
            lEa_3 lEa_36 = b2;
            b2.D.J(AQa.P, (gFa)b2.A);
            lEa_36.J((KZ)c2);
            lEa_36.f((KZ)c2);
        }
        lEa_32.D((b2.R.nextFloat() < vTa.N * c2.f() ? vRa.d : uSa.E) != 0);
        if (b2.f(AQa.P) == null && ((Calendar)(c2 = b2.j.J())).get(uqa.g) + vRa.d == NTa.C && ((Calendar)c2).get(tTa.h) == tua.U && b2.R.nextFloat() < rta.o) {
            b2.f(AQa.P, new Mda(b2.R.nextFloat() < Nra.e ? QFa.NC : QFa.s));
            b2.F[AQa.P] = JPa.N;
        }
        return a2;
    }

    @Override
    public boolean C(vL vL2) {
        lEa_3 a2 = this;
        lEa_3 b2 = vL2;
        if (super.C((vL)b2)) {
            if (a2.I() == vRa.d && b2 instanceof Gl) {
                ((Gl)b2).J(new kba(Hda.H.O, ZOa.x));
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void g() {
        lEa_3 lEa_32;
        lEa_3 lEa_33 = lEa_32 = this;
        super.g();
        if (lEa_33.ja instanceof bga) {
            bga a2 = (bga)lEa_32.ja;
            lEa_32.ba = a2.ba;
        }
    }

    public void J(gZ gZ2) {
        lEa_3 b2 = gZ2;
        lEa_3 a2 = this;
        lEa_3 lEa_32 = b2;
        super.J((gZ)lEa_32);
        if (lEa_32.J() instanceof jea && b2.f() instanceof Sx) {
            Sx sx2 = (Sx)b2.f();
            double d2 = sx2.la - a2.la;
            float f2 = sx2.A - a2.A;
            double d3 = d2;
            float f3 = f2;
            if (d3 * d3 + f3 * f3 >= Npa.f) {
                sx2.J((aX)mY.G);
                return;
            }
        } else if (b2.f() instanceof zfa && ((zfa)b2.f()).ba() && ((zfa)b2.f()).Fa()) {
            ((zfa)b2.f()).X();
            a2.J(new Mda(Gea.GB, vRa.d, a2.I() == vRa.d ? vRa.d : uSa.E), JPa.N);
        }
    }

    public eAa J() {
        return Gea.Ma;
    }

    public float l() {
        lEa_3 a2;
        if (a2.I() == vRa.d) {
            return super.l();
        }
        return wPa.G;
    }

    public void J() {
        lEa_3 a2;
        lEa_3 lEa_32 = a2;
        super.J();
        lEa_32.aa.f(uua.s, new Byte((byte)uSa.E));
    }

    public LGa J() {
        return LGa.UNDEAD;
    }

    @Override
    public String i() {
        return bSa.Y;
    }

    public double C() {
        lEa_3 a2;
        if (a2.Y()) {
            return aSa.V;
        }
        return SQa.ga;
    }

    @Override
    public void y() {
        lEa_3 lEa_32 = this;
        if (lEa_32.j.e() && !lEa_32.j.e) {
            float f2 = lEa_32.J(pqa.r);
            Object a2 = new XF(lEa_32.la, Math.round(lEa_32.Z), (double)lEa_32.A);
            if (f2 > MQa.L && lEa_32.R.nextFloat() * NSa.B < (f2 - Xpa.R) * kta.v && lEa_32.j.j((XF)((Object)a2))) {
                int n2 = vRa.d;
                a2 = lEa_32.f(AQa.P);
                if (a2 != null) {
                    if (a2.d()) {
                        Object object = a2;
                        object.J(object.f() + lEa_32.R.nextInt(uqa.g));
                        if (object.f() >= a2.l()) {
                            lEa_3 lEa_33 = lEa_32;
                            lEa_33.f((Mda)a2);
                            lEa_33.f(AQa.P, null);
                        }
                    }
                    n2 = uSa.E;
                }
                if (n2 != 0) {
                    lEa_32.J(Yqa.i);
                }
            }
        }
        if (lEa_32.j.e && lEa_32.I() == vRa.d) {
            lEa_32.l(lTa.D, yRa.R);
        }
        super.y();
    }

    public void p() {
        lEa_3 a2;
        if (a2.I() == vRa.d) {
            a2.J(new Mda(Gea.GB, vRa.d, vRa.d), JPa.N);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2) {
        void a2;
        lEa_3 c2 = gl2;
        lEa_3 b2 = this;
        c2 = new jea(b2.j, (Gl)b2, (Gl)c2, ySa.Da, (float)(hpa.Z - b2.j.J().getDifficultyId() * AQa.P));
        int n2 = kGa.J((int)wga.M.I, (Mda)b2.J());
        int n3 = kGa.J((int)wga.i.I, (Mda)b2.J());
        c2.C((double)(a2 * kta.v) + b2.R.nextGaussian() * VPa.W + (double)((float)b2.j.J().getDifficultyId() * wsa.W));
        if (n2 > 0) {
            lEa_3 lEa_32 = c2;
            lEa_32.C(lEa_32.J() + (double)n2 * kTa.B + kTa.B);
        }
        if (n3 > 0) {
            c2.M(n3);
        }
        if (kGa.J((int)wga.j.I, (Mda)b2.J()) > 0 || b2.I() == vRa.d) {
            c2.J(ySa.T);
        }
        lEa_3 lEa_33 = b2;
        lEa_33.J(EQa.R, pqa.r, pqa.r / (b2.J().nextFloat() * Xpa.R + xSa.la));
        lEa_33.j.f((vL)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, Mda mda2) {
        void a2;
        lEa_3 b2;
        int c2 = n2;
        lEa_3 lEa_32 = b2 = this;
        super.f(c2, (Mda)a2);
        if (!lEa_32.j.e && c2 == 0) {
            b2.N();
        }
    }

    public void N() {
        lEa_3 lEa_32;
        lEa_3 lEa_33 = lEa_32 = this;
        lEa_3 lEa_34 = lEa_32;
        lEa_33.D.J((gFa)lEa_34.I);
        lEa_33.D.J((gFa)lEa_32.A);
        lEa_3 a2 = lEa_34.J();
        if (a2 != null && a2.J() == Gea.cd) {
            lEa_32.D.J(AQa.P, (gFa)lEa_32.A);
            return;
        }
        lEa_32.D.J(AQa.P, (gFa)lEa_32.I);
    }

    public lEa_3(Gg gg2) {
        lEa_3 a2;
        lEa_3 b2 = gg2;
        lEa_3 lEa_32 = a2 = this;
        super((Gg)b2);
        lEa_3 lEa_33 = a2;
        lEa_32.A = new IGa((LC)a2, oua.i, kTa.j, Psa.M, qta.D);
        lEa_33.I = new ADa((bga)a2, Sx.class, JPa.ja, uSa.E != 0);
        lEa_32.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        lEa_32.D.J(uqa.g, (gFa)new gia((bga)a2));
        lEa_32.D.J(yRa.d, (gFa)new tia((bga)a2, oua.i));
        lEa_32.D.J(yRa.d, (gFa)new lFa((bga)a2, xfa.class, lqa.ga, oua.i, JPa.ja));
        lEa_32.D.J(AQa.P, (gFa)new HDa(a2, oua.i));
        lEa_32.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        lEa_32.D.J(uua.p, (gFa)new SIa((Yfa)a2));
        lEa_32.L.J(vRa.d, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        lEa_3 lEa_34 = a2;
        lEa_34.L.J(uqa.g, (gFa)new NEa((bga)a2, Sx.class, vRa.d != 0));
        lEa_34.L.J(yRa.d, (gFa)new NEa((bga)a2, DDa.class, vRa.d != 0));
        if (b2 != null && !((Gg)b2).e) {
            a2.N();
        }
    }

    public void J(Waa waa2) {
        lEa_3 b2 = waa2;
        lEa_3 a2 = this;
        lEa_3 lEa_32 = b2;
        super.J((Waa)lEa_32);
        if (lEa_32.J(Vra.Y, zOa.v)) {
            a2.D(b2.J(Vra.Y));
        }
        a2.N();
    }

    public String A() {
        return Usa.N;
    }

    public void f(Waa waa2) {
        lEa_3 b2 = waa2;
        lEa_3 a2 = this;
        lEa_3 lEa_32 = b2;
        super.f((Waa)lEa_32);
        lEa_32.J(Vra.Y, (byte)a2.I());
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        int c2;
        int b2;
        void a2;
        lEa_3 lEa_32 = this;
        if (lEa_32.I() == vRa.d) {
            b2 = lEa_32.R.nextInt(yRa.d + a2) - vRa.d;
            int n3 = c2 = uSa.E;
            while (n3 < b2) {
                lEa_32.J(Gea.qc, vRa.d);
                n3 = ++c2;
            }
        } else {
            b2 = lEa_32.R.nextInt(yRa.d + a2);
            int n4 = c2 = uSa.E;
            while (n4 < b2) {
                lEa_32.J(Gea.Ma, vRa.d);
                n4 = ++c2;
            }
        }
        b2 = lEa_32.R.nextInt(yRa.d + a2);
        int n5 = c2 = uSa.E;
        while (n5 < b2) {
            lEa_32.J(Gea.Ya, vRa.d);
            n5 = ++c2;
        }
    }

    @Override
    public String f() {
        return uRa.d;
    }

    @Override
    public void s() {
        lEa_3 a2;
        lEa_3 lEa_32 = a2;
        super.s();
        lEa_32.J(Kha.j).J(VPa.W);
    }

    public void D(int n2) {
        int b2 = n2;
        lEa_3 a2 = this;
        a2.aa.J(uua.s, Byte.valueOf((byte)b2));
        a2.z = b2 == vRa.d ? vRa.d : uSa.E;
        int n3 = a2.z ? 1 : 0;
        if (b2 == vRa.d) {
            a2.l(lTa.D, yRa.R);
            return;
        }
        a2.l(lEa_3.d(), UOa.k);
    }

    public int I() {
        lEa_3 a2;
        return a2.aa.J(uua.s);
    }

    public void J(XF xF2, Block block) {
        Block c2 = block;
        lEa_3 a2 = this;
        a2.J(UOa.z, VPa.i, pqa.r);
    }

    public void J(KZ kZ2) {
        lEa_3 a2;
        lEa_3 b2 = kZ2;
        lEa_3 lEa_32 = a2 = this;
        super.J((KZ)b2);
        lEa_32.f(uSa.E, new Mda((eAa)Gea.cd));
    }
}

