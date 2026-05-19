/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cea
 *  EFa
 *  Ey
 *  Gg
 *  Gl
 *  Hba
 *  ISa
 *  JPa
 *  KZ
 *  Kea
 *  Lz
 *  MQa
 *  Mda
 *  NEa
 *  NTa
 *  OIa
 *  Oz
 *  QFa
 *  QSa
 *  Qsa
 *  SRa
 *  Ssa
 *  UZ
 *  Uda
 *  WDa
 *  Waa
 *  XTa
 *  Yfa
 *  Yra
 *  ZOa
 *  ZRa
 *  Zta
 *  aSa
 *  cfa
 *  eAa
 *  fEa
 *  gFa
 *  gZ
 *  hTa
 *  kta
 *  mDa
 *  nHa
 *  oA
 *  oHa
 *  pPa
 *  pqa
 *  psa
 *  sea
 *  vL
 *  vQa
 *  vRa
 *  wEa
 *  xfa
 *  yCa
 *  yFa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cfa_3
extends fEa {
    private int G;
    private int D;
    private sea E;
    private boolean m;
    private int C;
    private boolean i;
    private int M;
    private Sx A;
    private WDa<xfa> I;

    /*
     * WARNING - void declaration
     */
    public cfa J(wEa wEa2) {
        void a2;
        cfa_3 cfa_32 = this;
        cfa_3 b2 = new cfa_3(cfa_32.j);
        if (a2 instanceof cfa_3) {
            b2.k(cfa_32.R.nextBoolean() ? cfa_32.H() : ((cfa_3)a2).H());
        }
        return b2;
    }

    public void J(Waa waa2) {
        cfa_3 b2 = waa2;
        cfa_3 a2 = this;
        cfa_3 cfa_32 = b2;
        super.J((Waa)cfa_32);
        a2.k(cfa_32.J(psa.ga));
        a2.D = b2.J(CRa.ca);
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ2, oA oA2) {
        cfa_3 cfa_32;
        void b22;
        cfa_3 a2;
        cfa_3 c2 = oA2;
        cfa_3 cfa_33 = a2 = this;
        c2 = super.J((KZ)b22, (oA)c2);
        int b22 = cfa_33.R.nextInt(uua.p);
        int n2 = uSa.E;
        if (c2 instanceof Uda) {
            b22 = ((Uda)c2).I;
            n2 = vRa.d;
            cfa_32 = a2;
        } else {
            c2 = new Uda(b22);
            cfa_32 = a2;
        }
        cfa_32.k(b22);
        if (n2 != 0) {
            a2.D(QSa.e);
        }
        return c2;
    }

    public void f(Waa waa2) {
        cfa_3 b2 = waa2;
        cfa_3 a2 = this;
        cfa_3 cfa_32 = b2;
        super.f((Waa)cfa_32);
        cfa_32.J(psa.ga, a2.H());
        cfa_32.J(CRa.ca, a2.D);
    }

    public String i() {
        return hTa.Ka;
    }

    public boolean C(vL vL2) {
        cfa_3 b2 = vL2;
        cfa_3 a2 = this;
        if (a2.H() == zOa.v) {
            cfa_3 cfa_32 = a2;
            cfa_32.J(ZRa.L, pqa.r, (cfa_32.R.nextFloat() - a2.R.nextFloat()) * psa.N + pqa.r);
            return b2.J(gZ.J((Gl)cfa_32), Qsa.k);
        }
        return b2.J(gZ.J((Gl)a2), vQa.q);
    }

    private boolean J(eAa eAa2) {
        cfa_3 b2 = eAa2;
        cfa_3 a2 = this;
        if (b2 == Gea.EB || b2 == Gea.Jd || b2 == eAa.J((Block)QFa.zc)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void C() {
    }

    public String l() {
        return SRa.ca;
    }

    public void J(boolean bl2, int n2) {
        int c2 = n2;
        cfa_3 a2 = this;
        int b2 = a2.R.nextInt(uqa.g) + a2.R.nextInt(vRa.d + c2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            a2.J(Gea.w, vRa.d);
            n3 = ++c2;
        }
        b2 = a2.R.nextInt(uqa.g);
        int n4 = c2 = uSa.E;
        while (n4 < b2) {
            if (a2.o()) {
                a2.J(Gea.m, vRa.d);
            } else {
                a2.J(Gea.Za, vRa.d);
            }
            n4 = ++c2;
        }
    }

    public int H() {
        cfa_3 a2;
        return a2.aa.J(yOa.B);
    }

    public void r() {
        cfa_3 cfa_32;
        block12: {
            cfa_3 cfa_33;
            block10: {
                cfa_3 a2;
                block11: {
                    cfa_3 cfa_34;
                    cfa_32 = this;
                    if (cfa_32.b.C() > Jra.A) {
                        cfa_3 cfa_35 = cfa_32;
                        cfa_34 = cfa_35;
                        cfa_35.f(sea.SPRINT);
                    } else {
                        if (cfa_32.E != sea.ATTACK) {
                            cfa_32.f(sea.HOP);
                        }
                        cfa_34 = cfa_32;
                    }
                    if (cfa_34.C > 0) {
                        cfa_32.C -= vRa.d;
                    }
                    if (cfa_32.D > 0) {
                        cfa_3 cfa_36 = cfa_32;
                        cfa_32.D -= cfa_36.R.nextInt(yRa.d);
                        if (cfa_36.D < 0) {
                            cfa_32.D = uSa.E;
                        }
                    }
                    if (!cfa_32.ha) break block10;
                    if (!cfa_32.m) {
                        cfa_3 cfa_37 = cfa_32;
                        cfa_37.J(uSa.E != 0, sea.NONE);
                        cfa_37.O();
                    }
                    if (cfa_32.H() == zOa.v && cfa_32.C == 0 && (a2 = cfa_32.C()) != null && cfa_32.J((vL)a2) < Zta.ba) {
                        cfa_3 cfa_38 = cfa_32;
                        cfa_38.J(((Gl)a2).la, ((Gl)a2).A);
                        cfa_38.b.J(((Gl)a2).la, ((Gl)a2).Z, ((Gl)a2).A, cfa_32.b.C());
                        cfa_38.J(sea.ATTACK);
                        cfa_38.m = vRa.d;
                    }
                    if ((a2 = (Cea)cfa_32.f).f()) break block11;
                    if (!cfa_32.b.J() || cfa_32.C != 0) break block10;
                    yCa yCa2 = cfa_32.e.J();
                    Lz lz2 = new Lz(cfa_32.b.f(), cfa_32.b.l(), cfa_32.b.J());
                    if (yCa2 != null && yCa2.f() < yCa2.J()) {
                        lz2 = yCa2.J((vL)cfa_32);
                    }
                    cfa_3 cfa_39 = cfa_32;
                    cfa_33 = cfa_39;
                    cfa_39.J(lz2.A, lz2.J);
                    cfa_39.J(cfa_39.E);
                    break block12;
                }
                if (!a2.J()) {
                    cfa_32.X();
                }
            }
            cfa_33 = cfa_32;
        }
        cfa_33.m = cfa_32.ha;
    }

    public void C(double a2) {
        cfa_3 b2;
        cfa_3 cfa_32 = b2;
        cfa_32.J().J(a2);
        cfa_32.b.J(b2.b.f(), b2.b.l(), b2.b.J(), a2);
    }

    public void J() {
        cfa_3 a2;
        cfa_3 cfa_32 = a2;
        super.J();
        cfa_32.aa.f(yOa.B, (byte)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        cfa_3 b2 = this;
        cfa_3 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        return super.J((gZ)c2, (float)a2);
    }

    public String A() {
        return Ssa.a;
    }

    private void J(double b2, double a2) {
        cfa_3 c2;
        c2.X = (float)(Oz.f((double)(a2 - c2.A), (double)(b2 - c2.la)) * kta.Da / lQa.f) - ISa.a;
    }

    public static /* synthetic */ boolean J(cfa a2) {
        return super.v();
    }

    public float i() {
        cfa_3 a2;
        if (a2.b.J() && a2.b.l() > a2.Z + kTa.B) {
            return MQa.L;
        }
        return a2.E.func_180074_b();
    }

    public boolean ba() {
        cfa_3 a2;
        return a2.i;
    }

    public void f(sea sea2) {
        cfa_3 b2 = sea2;
        cfa_3 a2 = this;
        a2.E = b2;
    }

    public void s() {
        cfa_3 a2;
        cfa_3 cfa_32 = a2;
        super.s();
        cfa_32.J(Kha.M).J(Wqa.m);
        cfa_32.J(Kha.j).J(osa.b);
    }

    private void ba() {
        cfa_3 a2;
        ((Cea)a2.f).J(uSa.E != 0);
    }

    private void v() {
        cfa_3 a2;
        a2.C = a2.g();
    }

    public void y() {
        cfa_3 a2;
        cfa_3 cfa_32 = a2;
        super.y();
        if (cfa_32.M != a2.G) {
            if (a2.M == 0 && !a2.j.e) {
                a2.j.J((vL)a2, (byte)vRa.d);
            }
            a2.M += vRa.d;
            return;
        }
        if (a2.G != 0) {
            cfa_3 cfa_33 = a2;
            cfa_33.M = uSa.E;
            cfa_33.G = uSa.E;
        }
    }

    private void O() {
        cfa_3 a2;
        cfa_3 cfa_32 = a2;
        cfa_32.v();
        cfa_32.ba();
    }

    public void k(int n2) {
        int b2 = n2;
        cfa_3 a2 = this;
        if (b2 == zOa.v) {
            cfa_3 cfa_32 = a2;
            cfa_3 cfa_33 = a2;
            cfa_32.D.J(cfa_33.I);
            cfa_32.D.J(AQa.P, (gFa)new yFa((cfa)a2));
            cfa_33.L.J(vRa.d, (gFa)new IFa((bga)((Object)a2), uSa.E != 0, new Class[uSa.E]));
            cfa_3 cfa_34 = a2;
            cfa_34.L.J(uqa.g, (gFa)new NEa((bga)((Object)a2), Sx.class, vRa.d != 0));
            cfa_34.L.J(uqa.g, (gFa)new NEa((bga)((Object)a2), xfa.class, vRa.d != 0));
            if (!cfa_34.J()) {
                a2.J(Ey.f((String)ypa.Ha));
            }
        }
        a2.aa.J(yOa.B, Byte.valueOf((byte)b2));
    }

    public int f() {
        cfa_3 a2;
        if (a2.H() == zOa.v) {
            return Yqa.i;
        }
        return super.f();
    }

    public void T() {
        cfa_3 a2;
        int[] nArray = new int[vRa.d];
        nArray[uSa.E] = Block.l(QFa.FE.J(XTa.W));
        a2.j.J(UZ.BLOCK_DUST, a2.la + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F, a2.Z + kTa.B + (double)(a2.R.nextFloat() * a2.u), (double)(a2.A + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F), aSa.V, aSa.V, aSa.V, nArray);
        a2.D = ySa.T;
    }

    public cfa_3(Gg gg2) {
        cfa_3 a2;
        cfa_3 b2 = gg2;
        cfa_3 cfa_32 = a2 = this;
        cfa_3 cfa_33 = a2;
        super((Gg)b2);
        a2.M = uSa.E;
        a2.G = uSa.E;
        a2.i = uSa.E;
        a2.m = uSa.E;
        a2.C = uSa.E;
        cfa_33.E = sea.HOP;
        cfa_33.D = uSa.E;
        cfa_33.A = null;
        cfa_32.l(Ora.D, ZSa.q);
        cfa_3 cfa_34 = a2;
        a2.f = new Cea((cfa)a2, (cfa)a2);
        cfa_32.b = new Kea((cfa)a2);
        ((Hba)cfa_32.J()).J(vRa.d != 0);
        cfa_3 cfa_35 = a2;
        cfa_35.e.J(MTa.y);
        cfa_35.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        cfa_35.D.J(vRa.d, (gFa)new mDa((cfa)a2, ZOa.n));
        cfa_35.D.J(uqa.g, (gFa)new OIa((bga)((Object)a2), oua.i, Gea.EB, uSa.E != 0));
        cfa_35.D.J(uqa.g, (gFa)new OIa((bga)((Object)a2), oua.i, Gea.Jd, uSa.E != 0));
        cfa_35.D.J(uqa.g, (gFa)new OIa((bga)((Object)a2), oua.i, eAa.J((Block)QFa.zc), uSa.E != 0));
        cfa_35.D.J(yRa.d, (gFa)new Pia(a2, Jra.A));
        cfa_35.D.J(tTa.h, (gFa)new EFa((cfa)a2));
        cfa_35.D.J(tTa.h, (gFa)new HDa((bga)((Object)a2), oQa.fa));
        cfa_35.D.J(pPa.f, (gFa)new nHa((Yfa)a2, Sx.class, FRa.Ga));
        cfa_35.I = new WDa((cfa)a2, xfa.class, Yra.i, ZOa.n, ZOa.n);
        cfa_35.D.J(AQa.P, a2.I);
        cfa_35.C(aSa.V);
    }

    public String f() {
        return Jpa.Q;
    }

    public void J(byte by2) {
        byte b2 = by2;
        cfa_3 a2 = this;
        if (b2 == vRa.d) {
            a2.j();
            a2.G = NTa.C;
            a2.M = uSa.E;
            return;
        }
        super.J(b2);
    }

    public float l(float f2) {
        float b2 = f2;
        cfa_3 a2 = this;
        if (a2.G == 0) {
            return JPa.N;
        }
        return ((float)a2.M + b2) / (float)a2.G;
    }

    public int g() {
        cfa_3 a2;
        return a2.E.getDuration();
    }

    private void X() {
        cfa_3 a2;
        ((Cea)a2.f).J(vRa.d != 0);
    }

    private boolean v() {
        cfa_3 a2;
        if (a2.D == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(sea sea2) {
        cfa_3 b2 = sea2;
        cfa_3 a2 = this;
        a2.J(vRa.d != 0, (sea)b2);
        a2.G = b2.func_180073_d();
        a2.M = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl2, sea sea2) {
        boolean c2;
        block2: {
            cfa_3 cfa_32;
            cfa_3 b2;
            block1: {
                void a2;
                block0: {
                    c2 = bl2;
                    b2 = this;
                    boolean bl3 = c2;
                    super.A(bl3);
                    if (bl3) break block0;
                    if (b2.E != sea.ATTACK) break block1;
                    cfa_32 = b2;
                    b2.E = sea.HOP;
                    break block2;
                }
                cfa_3 cfa_33 = b2;
                cfa_33.C(Bta.c * (double)a2.getSpeed());
                cfa_33.J(cfa_33.l(), b2.G(), ((b2.R.nextFloat() - b2.R.nextFloat()) * psa.N + pqa.r) * xSa.la);
            }
            cfa_32 = b2;
        }
        cfa_32.i = c2;
    }

    public boolean f(Mda mda2) {
        cfa_3 b2 = mda2;
        cfa_3 a2 = this;
        if (b2 != null && a2.J(b2.J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void p() {
        cfa_3 a2;
        a2.J(new Mda(Gea.WB, vRa.d), JPa.N);
    }
}

