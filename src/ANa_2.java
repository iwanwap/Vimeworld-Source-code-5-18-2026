/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  BMa
 *  Cca
 *  Dc
 *  EC
 *  FTa
 *  Gda
 *  Gg
 *  HA
 *  HOa
 *  Hda
 *  JPa
 *  Kma
 *  Kpa
 *  LBa
 *  LNa
 *  Lda
 *  Mda
 *  NTa
 *  PNa
 *  QAa
 *  QS
 *  Qba
 *  Qqa
 *  RBa
 *  Rea
 *  TQa
 *  Tna
 *  Tpa
 *  UNa
 *  UZ
 *  WSa
 *  XTa
 *  Xoa
 *  YMa
 *  Yea
 *  Zna
 *  aSa
 *  aX
 *  aaa
 *  caa
 *  dAa
 *  dna
 *  fba
 *  fpa
 *  gZ
 *  hna
 *  iMa
 *  ida
 *  jFa
 *  jt
 *  jz
 *  kPa
 *  kea
 *  kta
 *  ld
 *  lqa
 *  mAa
 *  mra
 *  nca
 *  oqa
 *  pqa
 *  psa
 *  pua
 *  qBa
 *  qta
 *  sca
 *  uw
 *  vDa
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  wca
 *  xA
 *  xy
 *  yma
 *  zMa
 *  zoa
 *  zsa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ANa_2
extends XW {
    public float V;
    public int t;
    private float R;
    private float Q;
    private boolean N;
    public float T;
    private int q;
    public float x;
    private boolean o;
    public Kpa K;
    private float H;
    public int d;
    public float l;
    private int G;
    private double D;
    private final Laa f;
    public final iMa F;
    public jz g;
    private String L;
    private double E;
    public boolean m;
    public float C;
    private boolean M;
    private double j;
    public float J;

    @Override
    public boolean Q() {
        return vRa.d != 0;
    }

    public boolean U() {
        return vRa.d != 0;
    }

    @Override
    public jFa J(boolean bl2) {
        boolean b22 = bl2;
        ANa_2 a2 = this;
        Gda b22 = b22 ? Gda.DROP_ALL_ITEMS : Gda.DROP_ITEM;
        a2.F.J((KC)new mAa(b22, XF.ORIGIN, DZ.DOWN));
        return null;
    }

    @Override
    public void S() {
        ANa_2 a2;
        a2.F.J((KC)new sca(a2.h));
    }

    public void l(vL vL2) {
        ANa_2 b2 = vL2;
        ANa_2 a2 = this;
        ANa_2 aNa_2 = b2;
        super.l((vL)aNa_2);
        if (aNa_2 instanceof Yea) {
            a2.K.J().J((X)new Tna((Sx)a2, (Yea)b2));
        }
    }

    public void X() {
        ANa_2 a2;
        a2.F.J((KC)new RBa((vL)a2, fba.OPEN_INVENTORY));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(xA xA2) {
        void a2;
        ANa_2 aNa_2 = this;
        Object b2 = a2.f();
        if (fpa.j.equals(b2)) {
            ANa_2 aNa_22 = aNa_2;
            aNa_2.K.J((EC)new Zna((kea)aNa_22.K, (Gg)aNa_22.j, (xA)a2));
            return;
        }
        if (Tpa.H.equals(b2)) {
            ANa_2 aNa_23 = aNa_2;
            aNa_2.K.J((EC)new fma((kea)aNa_23.K, (Gg)aNa_23.j, (fc)a2));
            return;
        }
        if (TQa.r.equals(b2)) {
            ANa_2 aNa_24 = aNa_2;
            aNa_2.K.J((EC)new yma((kea)aNa_24.K, (Gg)aNa_24.j));
        }
    }

    public static /* synthetic */ void J(ANa aNa2, boolean bl2) {
        boolean b2 = bl2;
        ANa a2 = aNa2;
        if (a2.K.L.l()) {
            if (!a2.h.J()) {
                ANa aNa3 = a2;
                aNa3.h.f(vRa.d != 0);
                aNa3.S();
                return;
            }
        } else if (!b2 && a2.g.J) {
            if (a2.H == false) {
                a2.H = XTa.W;
                return;
            }
            ANa aNa4 = a2;
            aNa4.h.f((!aNa4.h.J() ? vRa.d : uSa.E) != 0);
            a2.S();
            a2.H = uSa.E;
        }
    }

    public XF J() {
        ANa_2 a2;
        return new XF(a2.la + kTa.B, a2.Z + kTa.B, a2.A + kTa.B);
    }

    public void V() {
        ANa_2 a2;
        a2.K.J((Mda)null);
        ANa_2 aNa_2 = a2;
        super.r();
        aNa_2.K.J((EC)null);
    }

    public String D() {
        ANa_2 a2;
        return a2.L;
    }

    public void l(String string) {
        Object b2 = string;
        ANa_2 a2 = this;
        a2.L = b2;
    }

    @Override
    public void q() {
        ANa_2 a2;
        if (!a2.ha) {
            return;
        }
        Wx.J(a2.y.J(), dna.J((ANa)a2), null);
    }

    public xy J(vL vL2) {
        ANa_2 b2 = vL2;
        ANa_2 a2 = this;
        if (uw.j > 0 && b2 instanceof Sx) {
            return b2.J();
        }
        return super.J((vL)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Rea rea2, HA hA2) {
        void b2;
        ANa_2 c2 = hA2;
        ANa_2 a2 = this;
        a2.K.J((EC)new zoa((HA)a2.K, (HA)c2, (Rea)b2));
    }

    public void N() {
        ANa_2 a2;
        ANa_2 aNa_2 = a2;
        a2.F.J((KC)new RBa((vL)aNa_2, fba.RIDING_JUMP, (int)(aNa_2.I() * QTa.G)));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void y() {
        block38: {
            block40: {
                block36: {
                    block39: {
                        block37: {
                            block33: {
                                block35: {
                                    block34: {
                                        block32: {
                                            var1_1 = this;
                                            if (var1_1.t > 0) {
                                                v0 = var1_1;
                                                v0.t -= vRa.d;
                                                if (v0.t == 0) {
                                                    var1_1.l((boolean)uSa.E);
                                                }
                                            }
                                            if (var1_1.d > 0) {
                                                var1_1.d -= vRa.d;
                                            }
                                            v1 = var1_1;
                                            v1.x = v1.J;
                                            if (v1.Q == false) break block32;
                                            if (var1_1.K.ta != null && !var1_1.K.ta.J() && !(var1_1.K.ta instanceof Xoa)) {
                                                var1_1.K.J((EC)null);
                                            }
                                            if (var1_1.J == JPa.N) {
                                                var1_1.K.J().J((X)PNa.J((ResourceLocation)new ResourceLocation(wOa.q), (float)(var1_1.R.nextFloat() * Xpa.R + xSa.la)));
                                            }
                                            v2 = var1_1;
                                            v2.J += oqa.c;
                                            if (v2.J >= pqa.r) {
                                                var1_1.J = pqa.r;
                                            }
                                            v3 = var1_1;
                                            var1_1.Q = uSa.E;
                                            break block33;
                                        }
                                        if (!var1_1.J(Hda.D) || var1_1.J(Hda.D).l() <= Psa.M) break block34;
                                        v4 = var1_1;
                                        v4.J += rua.Y;
                                        if (!(v4.J > pqa.r)) break block35;
                                        v3 = var1_1;
                                        var1_1.J = pqa.r;
                                        break block33;
                                    }
                                    if (var1_1.J > JPa.N) {
                                        var1_1.J -= Yqa.C;
                                    }
                                    if (var1_1.J < JPa.N) {
                                        var1_1.J = JPa.N;
                                    }
                                }
                                v3 = var1_1;
                            }
                            if (v3.U > 0) {
                                var1_1.U -= vRa.d;
                            }
                            v5 = var1_1;
                            var5_2 = v5.g.J;
                            var6_3 = v5.g.I;
                            var3_4 = xSa.la;
                            var4_5 = v5.g.A >= var3_4 ? vRa.d : uSa.E;
                            v6 = var1_1;
                            v6.g.J();
                            a = v6.h;
                            if (v6.V() && !var1_1.B()) {
                                v7 = var1_1;
                                v7.g.j *= psa.N;
                                v7.g.A *= psa.N;
                                v7.d = uSa.E;
                            }
                            v8 = var1_1;
                            v9 = var1_1;
                            v9.l(v8.la - (double)v9.F * LPa.e, var1_1.J().j + kTa.B, var1_1.A + (double)var1_1.F * LPa.e);
                            v10 = var1_1;
                            v10.l(var1_1.la - (double)v10.F * LPa.e, var1_1.J().j + kTa.B, var1_1.A - (double)var1_1.F * LPa.e);
                            v11 = var1_1;
                            v11.l(var1_1.la + (double)v11.F * LPa.e, var1_1.J().j + kTa.B, var1_1.A - (double)var1_1.F * LPa.e);
                            v12 = var1_1;
                            v12.l(var1_1.la + (double)v12.F * LPa.e, var1_1.J().j + kTa.B, var1_1.A + (double)var1_1.F * LPa.e);
                            v13 = var2_6 = (float)v8.J().J() > lqa.ga || a.l() != false ? vRa.d : uSa.E;
                            if (!var1_1.ha || var6_3 || var4_5 != 0 || !(var1_1.g.A >= var3_4) || var1_1.j() || var2_6 == 0 || var1_1.V() || var1_1.J(Hda.a)) ** GOTO lbl74
                            if (var1_1.d <= 0 && !var1_1.K.z.CB.isKeyDown()) {
                                v14 = var1_1;
                                var1_1.d = XTa.W;
                            } else {
                                var1_1.l((boolean)vRa.d);
lbl74:
                                // 2 sources

                                v14 = var1_1;
                            }
                            if (v14.j() || !(var1_1.g.A >= var3_4) || var2_6 == 0 || var1_1.V() || var1_1.J(Hda.a)) ** GOTO lbl-1000
                            switch (zMa.I[jt.h.ordinal()]) lbl-1000:
                            // 2 sources

                            {
                                case 1: {
                                    if (false) ** GOTO lbl-1000
                                    if (var1_1.K.z.CB.isKeyDown()) {
                                        v15 = var1_1;
                                        v16 = v15;
                                        v15.l((boolean)vRa.d);
                                        break;
                                    }
                                    ** GOTO lbl93
                                }
                                case 2: {
                                    v17 = var1_1;
                                    v16 = v17;
                                    v17.l((boolean)vRa.d);
                                    break;
                                }
                                case 3: {
                                    if (Nt.I) {
                                        var1_1.l((boolean)vRa.d);
                                    }
                                }
lbl93:
                                // 5 sources

                                default: lbl-1000:
                                // 2 sources

                                {
                                    v16 = var1_1;
                                }
                            }
                            if (v16.j() && (var1_1.g.A < var3_4 || var1_1.ca || var2_6 == 0)) {
                                var1_1.l((boolean)uSa.E);
                            }
                            v18 = a;
                            Wx.J(v18.l(), LNa.J((ANa)var1_1, (boolean)var5_2), null);
                            if (v18.J() && !a.l()) {
                                var1_1.h.f((boolean)uSa.E);
                            }
                            if (a.J() && var1_1.O()) {
                                if (var1_1.g.I) {
                                    v19 = var1_1;
                                    v19.J(var1_1.Ea - (double)(v19.h.J() * vQa.q));
                                }
                                if (var1_1.g.J) {
                                    v20 = var1_1;
                                    v20.J(var1_1.Ea + (double)(v20.h.J() * vQa.q));
                                }
                            }
                            if (!var1_1.T()) break block36;
                            if (var1_1.G < 0) {
                                v21 = var1_1;
                                v21.G += vRa.d;
                                if (v21.G == 0) {
                                    var1_1.H = JPa.N;
                                }
                            }
                            if (!var5_2 || var1_1.g.J) break block37;
                            v22 = var1_1;
                            v23 = v22;
                            v22.G = ypa.y;
                            v22.N();
                            break block38;
                        }
                        if (var5_2 || !var1_1.g.J) break block39;
                        v23 = var1_1;
                        var1_1.G = uSa.E;
                        var1_1.H = JPa.N;
                        break block38;
                    }
                    if (!var5_2) break block40;
                    v24 = var1_1;
                    v24.G += vRa.d;
                    if (v24.G < NTa.C) {
                        v25 = var1_1;
                        v23 = v25;
                        v25.H = (float)v25.G * Nra.e;
                    } else {
                        v23 = var1_1;
                        var1_1.H = xSa.la + kta.v / (float)(var1_1.G - WOa.fa) * Nra.e;
                    }
                    break block38;
                }
                var1_1.H = JPa.N;
            }
            v23 = var1_1;
        }
        super.y();
        if (var1_1.ha && var1_1.h.J() && !var1_1.K.L.l()) {
            v26 = var1_1;
            v26.h.f((boolean)uSa.E);
            v26.S();
        }
        if (var1_1.Ka != Ora.D || a.J() && !a.l()) {
            Kpa.f((String)uqa.fa);
        }
        if (!(Kpa.J().d() || a.f() == vDa.m.J() && a.l() == vDa.C.J() && a.J() == vDa.M.J() && a.f() == vDa.i.J() && a.J() == vDa.J.J())) {
            Kpa.f((String)uqa.fa);
        }
    }

    @Override
    public void d() {
        ANa_2 a2;
        if (a2.j.F(new XF(a2.la, aSa.V, a2.A))) {
            ANa_2 aNa_2 = a2;
            super.d();
            if (aNa_2.B()) {
                ANa_2 aNa_22 = a2;
                ANa_2 aNa_23 = a2;
                aNa_22.F.J((KC)new Cca(aNa_23.X, (float)aNa_23.d, a2.ha));
                ANa_2 aNa_24 = a2;
                aNa_22.F.J((KC)new Lda((float)aNa_24.L, aNa_24.ia, a2.g.J, a2.g.I));
                return;
            }
            a2.W();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ANa_2(Kpa kpa2, Gg gg2, iMa iMa2, Laa laa2) {
        void d2;
        void a2;
        void c2;
        ANa_2 b2;
        ANa_2 e2 = iMa2;
        ANa_2 aNa_2 = b2 = this;
        super((Gg)c2, e2.J());
        b2.F = e2;
        aNa_2.f = a2;
        aNa_2.K = d2;
        aNa_2.Ha = uSa.E;
        ANa_2 aNa_22 = b2;
        aNa_22.h = new vDa();
    }

    @Override
    public void G(vL vL2) {
        ANa_2 b2 = vL2;
        ANa_2 a2 = this;
        a2.K.f.J((vL)b2, UZ.CRIT);
    }

    @Override
    public void J(Mda mda2) {
        ANa_2 b2 = mda2;
        ANa_2 a2 = this;
        if (b2.J() == Gea.MC) {
            a2.K.J((EC)new HOa((Sx)a2, (Mda)b2, vRa.d != 0));
        }
    }

    @Override
    public void J(jFa object) {
        ANa_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(String string, float f2, float f3) {
        void b2;
        void c2;
        ANa_2 a2;
        float d2 = f3;
        ANa_2 aNa_2 = a2 = this;
        aNa_2.j.J(aNa_2.la, a2.Z, a2.A, (String)c2, (float)b2, d2, uSa.E != 0);
    }

    public void f(String string) {
        Object b2 = string;
        ANa_2 a2 = this;
        a2.F.J((KC)new wca((String)b2));
    }

    public boolean O() {
        ANa_2 a2;
        if (a2.K.J() == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(gZ gZ2, float f2) {
        void b2;
        float c2 = f2;
        ANa_2 a2 = this;
        if (!a2.J((gZ)b2)) {
            ANa_2 aNa_2 = a2;
            aNa_2.A(aNa_2.f() - c2);
        }
    }

    public float I() {
        ANa_2 a2;
        return a2.H;
    }

    @Override
    public void k(vL vL2) {
        ANa_2 b2 = vL2;
        ANa_2 a2 = this;
        a2.K.f.J((vL)b2, UZ.CRIT_MAGIC);
    }

    @Override
    public boolean J(gZ gZ2, float f2) {
        float c2 = f2;
        ANa_2 a2 = this;
        return uSa.E != 0;
    }

    public boolean q() {
        int a2;
        ANa_2 aNa_2 = this;
        int n2 = a2 = aNa_2.g != null ? (int)(aNa_2.g.I ? 1 : 0) : uSa.E;
        if (a2 != 0 && aNa_2.R == false) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean T() {
        ANa_2 a2;
        if (a2.ja != null && a2.ja instanceof Rea && ((Rea)a2.ja).ma()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void n() {
        ANa_2 a2;
        a2.F.J((KC)new qBa(Qba.PERFORM_RESPAWN));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(aX aX2, int n2) {
        ANa_2 c2 = aX2;
        ANa_2 b2 = this;
        if (c2 != null && ((aX)c2).isIndependent) {
            void a2;
            super.J((aX)c2, (int)a2);
        }
    }

    public double d() {
        ANa_2 a2;
        return super.d() + oua.i;
    }

    public static /* synthetic */ void J(ANa a2) {
        super.q();
        OT.i.H.M.J(a2);
    }

    @Override
    public void f(ld ld2) {
        ANa_2 b2 = ld2;
        ANa_2 a2 = this;
        a2.K.Ya.J().J((ld)b2);
    }

    @Override
    public void J(HA hA2) {
        String string;
        ANa_2 b2 = hA2;
        ANa_2 a2 = this;
        String string2 = string = b2 instanceof xA ? ((xA)b2).f() : qta.x;
        if (kPa.Ja.equals(string)) {
            a2.K.J((EC)new hna((HA)a2.K, (HA)b2));
            return;
        }
        if (mra.Q.equals(string)) {
            a2.K.J((EC)new BMa((kea)a2.K, (HA)b2));
            return;
        }
        if (cPa.W.equals(string)) {
            a2.K.J((EC)new Kma((kea)a2.K, (HA)b2));
            return;
        }
        if (wua.y.equals(string)) {
            a2.K.J((EC)new kOa((kea)a2.K, (HA)b2));
            return;
        }
        if (zsa.n.equals(string)) {
            a2.K.J((EC)new rma((kea)a2.K, (HA)b2));
            return;
        }
        if (!Qqa.n.equals(string) && !FTa.Ha.equals(string)) {
            a2.K.J((EC)new hna((HA)a2.K, (HA)b2));
            return;
        }
        a2.K.J((EC)new YMa((kea)a2.K, (HA)b2));
    }

    @Override
    public void J(caa caa2) {
        ANa_2 b2 = caa2;
        ANa_2 a2 = this;
        a2.K.J((EC)new bOa((caa)b2));
    }

    public void u() {
        ANa_2 a2;
        ANa_2 aNa_2 = a2;
        super.u();
        aNa_2.F.J((KC)new LBa());
    }

    private boolean J(XF xF2) {
        XF b2 = xF2;
        ANa_2 a2 = this;
        if (!a2.j.J(b2).J().A() && !a2.j.J(b2.up()).J().A()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(double d2, double d3, double d4) {
        double a2;
        void b2;
        void c2;
        ANa_2 aNa_2 = this;
        if (aNa_2.Ma) {
            return uSa.E != 0;
        }
        XF d52 = new XF((double)c2, (double)b2, a2);
        c2 -= (double)d52.getX();
        b2 = a2 - (double)d52.getZ();
        if (!aNa_2.J(d52)) {
            int n2 = pua.o;
            a2 = kTa.P;
            if (aNa_2.J(d52.west()) && c2 < a2) {
                a2 = c2;
                n2 = uSa.E;
            }
            if (aNa_2.J(d52.east()) && oua.i - c2 < a2) {
                a2 = oua.i - c2;
                n2 = vRa.d;
            }
            if (aNa_2.J(d52.north()) && b2 < a2) {
                a2 = b2;
                n2 = AQa.P;
            }
            if (aNa_2.J(d52.south()) && oua.i - b2 < a2) {
                a2 = oua.i - b2;
                n2 = tTa.h;
            }
            float d52 = Nra.e;
            if (n2 == 0) {
                aNa_2.f(-d52);
            }
            if (n2 == vRa.d) {
                aNa_2.f(d52);
            }
            if (n2 == AQa.P) {
                aNa_2.l(-d52);
            }
            if (n2 == tTa.h) {
                aNa_2.l(d52);
            }
        }
        return uSa.E != 0;
    }

    public void W() {
        ANa_2 aNa_2 = this;
        int a2 = aNa_2.j();
        if (a2 != aNa_2.o) {
            ANa_2 aNa_22;
            if (a2 != 0) {
                ANa_2 aNa_23 = aNa_2;
                aNa_22 = aNa_23;
                aNa_23.F.J((KC)new RBa((vL)aNa_2, fba.START_SPRINTING));
            } else {
                ANa_2 aNa_24 = aNa_2;
                aNa_22 = aNa_24;
                aNa_24.F.J((KC)new RBa((vL)aNa_2, fba.STOP_SPRINTING));
            }
            aNa_22.o = a2;
        }
        if ((a2 = aNa_2.q()) != aNa_2.N) {
            ANa_2 aNa_25;
            if (a2 != 0) {
                ANa_2 aNa_26 = aNa_2;
                aNa_25 = aNa_26;
                aNa_26.F.J((KC)new RBa((vL)aNa_2, fba.START_SNEAKING));
            } else {
                ANa_2 aNa_27 = aNa_2;
                aNa_25 = aNa_27;
                aNa_27.F.J((KC)new RBa((vL)aNa_2, fba.STOP_SNEAKING));
            }
            aNa_25.N = a2;
        }
        if (aNa_2.O()) {
            ANa_2 aNa_28;
            int n2;
            ANa_2 aNa_29 = aNa_2;
            double d2 = aNa_29.la - aNa_2.E;
            ANa_2 aNa_210 = aNa_2;
            double d3 = aNa_29.J().j - aNa_210.j;
            double d4 = aNa_210.A - aNa_2.D;
            double d5 = aNa_29.X - aNa_2.Q;
            double d6 = aNa_29.d - aNa_2.R;
            double d7 = d2;
            double d8 = d3;
            double d9 = d4;
            a2 = d7 * d7 + d8 * d8 + d9 * d9 > vua.C || aNa_2.q >= kTa.j ? vRa.d : uSa.E;
            int n3 = n2 = d5 != aSa.V || d6 != aSa.V ? vRa.d : uSa.E;
            if (aNa_2.ja == null) {
                if (a2 != 0 && n2 != 0) {
                    ANa_2 aNa_211 = aNa_2;
                    aNa_28 = aNa_211;
                    ANa_2 aNa_212 = aNa_2;
                    aNa_211.F.J((KC)new QAa(aNa_2.la, aNa_2.J().j, aNa_2.A, aNa_212.X, (float)aNa_212.d, aNa_2.ha));
                } else if (a2 != 0) {
                    ANa_2 aNa_213 = aNa_2;
                    aNa_28 = aNa_213;
                    aNa_213.F.J((KC)new dAa(aNa_2.la, aNa_2.J().j, aNa_2.A, aNa_2.ha));
                } else {
                    ANa_2 aNa_214 = aNa_2;
                    if (n2 != 0) {
                        ANa_2 aNa_215 = aNa_2;
                        aNa_214.F.J((KC)new Cca(aNa_215.X, (float)aNa_215.d, aNa_2.ha));
                        aNa_28 = aNa_2;
                    } else {
                        aNa_214.F.J((KC)new ida(aNa_2.ha));
                        aNa_28 = aNa_2;
                    }
                }
            } else {
                ANa_2 aNa_216 = aNa_2;
                aNa_28 = aNa_216;
                ANa_2 aNa_217 = aNa_2;
                aNa_216.F.J((KC)new QAa(aNa_2.i, WSa.e, (double)aNa_2.f, aNa_217.X, (float)aNa_217.d, aNa_2.ha));
                a2 = uSa.E;
            }
            aNa_28.q += vRa.d;
            aNa_2.m = aNa_2.ha;
            if (a2 != 0) {
                ANa_2 aNa_218 = aNa_2;
                aNa_218.E = aNa_218.la;
                aNa_218.j = aNa_218.J().j;
                aNa_218.D = aNa_218.A;
                aNa_218.q = uSa.E;
            }
            if (n2 != 0) {
                ANa_2 aNa_219 = aNa_2;
                aNa_219.Q = aNa_219.X;
                aNa_219.R = aNa_219.d;
            }
        }
    }

    @Override
    public void r() {
        ANa_2 a2;
        ANa_2 aNa_2 = a2;
        aNa_2.F.J((KC)new nca(a2.G.k));
        aNa_2.V();
    }

    @Override
    public void J(aaa aaa2) {
        ANa_2 b2 = aaa2;
        ANa_2 a2 = this;
        a2.K.J((EC)new sNa((aaa)b2));
    }

    public boolean J(int n2, String string) {
        int c2 = n2;
        ANa_2 b2 = this;
        if (c2 <= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void G(float f2) {
        void a2;
        ANa_2 aNa_2 = this;
        if (aNa_2.M) {
            float f3;
            float b2 = aNa_2.f() - a2;
            if (f3 <= JPa.N) {
                aNa_2.A((float)a2);
                if (!(b2 < JPa.N)) return;
                aNa_2.Fa = (int)(aNa_2.J / uqa.g);
                return;
            }
            ANa_2 aNa_22 = aNa_2;
            aNa_22.Ha = b2;
            aNa_22.A(aNa_22.f());
            aNa_22.Fa = (int)aNa_22.J;
            aNa_22.J(gZ.b, b2);
            aNa_22.ha = aNa_22.la = NTa.C;
            return;
        }
        aNa_2.A((float)a2);
        aNa_2.M = vRa.d;
    }

    public Laa J() {
        ANa_2 a2;
        return a2.f;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, int n3) {
        void b2;
        void c2;
        ANa_2 a2;
        int d2 = n3;
        ANa_2 aNa_2 = a2 = this;
        a2.A = c2;
        aNa_2.Aa = b2;
        aNa_2.j = d2;
    }

    public void e(float f2) {
        float b2 = f2;
        ANa_2 aNa_2 = this;
    }

    public void J(ld ld2) {
        ANa_2 b2 = ld2;
        ANa_2 a2 = this;
        a2.K.Ya.J().J((ld)b2);
    }

    @Override
    public void J(Dc dc2) {
        ANa_2 b2 = dc2;
        ANa_2 a2 = this;
        a2.K.J((EC)new UNa((kea)a2.K, (Dc)b2, (Gg)a2.j));
    }

    @Override
    public void A() {
        ANa_2 a2;
        ANa_2 aNa_2 = a2;
        super.A();
        if (aNa_2.O()) {
            if (!QS.J()) {
                ANa_2 aNa_22 = a2;
                aNa_22.l(aNa_22.g.j);
                aNa_22.M(aNa_22.g.A);
                aNa_22.ja = aNa_22.g.J;
            }
            ANa_2 aNa_23 = a2;
            aNa_23.T = aNa_23.C;
            aNa_23.l = aNa_23.V;
            ANa_2 aNa_24 = a2;
            aNa_23.V = (float)((double)aNa_23.V + (double)(aNa_24.d - aNa_24.V) * kTa.B);
            ANa_2 aNa_25 = a2;
            aNa_23.C = (float)((double)aNa_23.C + (double)(aNa_25.X - aNa_25.C) * kTa.B);
        }
    }

    public void l(boolean bl2) {
        boolean b2 = bl2;
        ANa_2 a2 = this;
        super.l(b2);
        a2.t = b2 ? MTa.g : uSa.E;
    }
}

