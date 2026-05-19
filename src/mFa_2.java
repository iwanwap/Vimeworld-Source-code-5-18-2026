/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  Afa
 *  CY
 *  CZ
 *  Dc
 *  ERa
 *  GY
 *  Gg
 *  Gl
 *  Hba
 *  Hda
 *  Iga
 *  KTa
 *  KZ
 *  Mda
 *  NCa
 *  NPa
 *  NTa
 *  PTa
 *  QFa
 *  Qia
 *  Qqa
 *  Qsa
 *  RDa
 *  SGa
 *  Sea
 *  Sia
 *  Ssa
 *  TQa
 *  Tha
 *  Tz
 *  UZ
 *  Uta
 *  Uz
 *  Waa
 *  Wha
 *  XTa
 *  Yfa
 *  Ypa
 *  ZOa
 *  Zea
 *  Zta
 *  bRa
 *  bqa
 *  cEa
 *  cQa
 *  eAa
 *  gB
 *  gFa
 *  gZ
 *  iea
 *  jFa
 *  jpa
 *  kba
 *  kpa
 *  kta
 *  lFa
 *  ld
 *  lqa
 *  mFa
 *  nFa
 *  nGa
 *  nHa
 *  nda
 *  oA
 *  oHa
 *  pPa
 *  pqa
 *  pua
 *  rC
 *  rha
 *  tEa
 *  uQa
 *  vHa
 *  vL
 *  vQa
 *  vRa
 *  vpa
 *  wEa
 *  wFa
 *  wIa
 *  wOa
 *  wPa
 *  waa
 *  wra
 *  yDa
 *  zEa
 *  zsa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mFa_2
extends wEa
implements Dc,
rC {
    private int v;
    private GY o;
    private int h;
    private boolean K;
    private boolean c;
    private boolean B;
    private int d;
    private int e;
    private boolean G;
    private int D;
    public Aaa C;
    private Sx i;
    private yDa M;
    private String k;
    private boolean j;
    private boolean A;
    private static final gB[][][][] I;

    public void J(Mda mda2) {
        mFa_2 b2 = mda2;
        mFa_2 a2 = this;
        if (!a2.j.e && a2.c > -a2.j() + kTa.j) {
            a2.c = -a2.j();
            if (b2 != null) {
                mFa_2 mFa_22 = a2;
                mFa_22.J(Jta.Y, a2.G(), mFa_22.M());
                return;
            }
            a2.J(KTa.k, a2.G(), a2.M());
        }
    }

    public String A() {
        mFa_2 a2;
        if (a2.ba()) {
            return Tqa.s;
        }
        return bqa.t;
    }

    public void T() {
        a.G = vRa.d;
    }

    public boolean ka() {
        mFa_2 a2;
        return a2.c;
    }

    private void X() {
        mFa_2 a2;
        if (!a2.j) {
            a2.j = vRa.d;
            if (a2.Y()) {
                a2.D.J(Yqa.i, (gFa)new wIa((mFa)a2, uQa.D));
                return;
            }
            if (a2.g() == 0) {
                a2.D.J(uua.p, (gFa)new hia((mFa)a2, oQa.fa));
            }
        }
    }

    public String f() {
        return Wqa.Fa;
    }

    public boolean Ha() {
        int a2;
        mFa_2 mFa_22 = this;
        int n2 = a2 = mFa_22.g() == 0 ? vRa.d : uSa.E;
        if (a2 != 0) {
            if (!mFa_22.l(tTa.h)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (!mFa_22.l(vRa.d)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String i() {
        return pPa.i;
    }

    public void l(Sx sx2) {
        Object b2 = sx2;
        mFa_2 a2 = this;
        a2.i = b2;
    }

    public Sx J() {
        mFa_2 a2;
        return a2.i;
    }

    static {
        gB[][][][] gBArrayArray = new gB[tTa.h][][][];
        gB[][][] gBArrayArray2 = new gB[AQa.P][][];
        gB[][] gBArrayArray3 = new gB[AQa.P][];
        gB[] gBArray = new gB[AQa.P];
        gBArray[uSa.E] = new RDa(Gea.DC, new Sea(yOa.B, cQa.o));
        gBArray[vRa.d] = new RDa(Gea.cA, new Sea(Ypa.A, wOa.t));
        gBArray[uqa.g] = new RDa(Gea.EB, new Sea(Ypa.A, wOa.t));
        gBArray[yRa.d] = new wFa(Gea.Ra, new Sea(pta.a, rQa.p));
        gBArrayArray3[uSa.E] = gBArray;
        gB[] gBArray2 = new gB[uqa.g];
        gBArray2[uSa.E] = new RDa(eAa.J((Block)QFa.s), new Sea(Yqa.i, uua.s));
        gBArray2[vRa.d] = new wFa(Gea.mA, new Sea(ERa.Ka, rQa.p));
        gBArrayArray3[vRa.d] = gBArray2;
        gB[] gBArray3 = new gB[uqa.g];
        gBArray3[uSa.E] = new RDa(eAa.J((Block)QFa.HC), new Sea(XTa.W, lqa.s));
        gBArray3[vRa.d] = new wFa(Gea.Mb, new Sea(kpa.w, jpa.r));
        gBArrayArray3[uqa.g] = gBArray3;
        gB[] gBArray4 = new gB[uqa.g];
        gBArray4[uSa.E] = new wFa(Gea.ka, new Sea(zsa.a, ypa.y));
        gBArray4[vRa.d] = new wFa(Gea.Da, new Sea(vRa.d, vRa.d));
        gBArrayArray3[yRa.d] = gBArray4;
        gBArrayArray2[uSa.E] = gBArrayArray3;
        gB[][] gBArrayArray4 = new gB[uqa.g][];
        gB[] gBArray5 = new gB[yRa.d];
        gBArray5[uSa.E] = new RDa(Gea.gd, new Sea(Ypa.A, kTa.j));
        gBArray5[vRa.d] = new RDa(Gea.qc, new Sea(ERa.C, osa.c));
        gBArray5[uqa.g] = new Afa(Gea.E, new Sea(uua.p, uua.p), Gea.Ka, new Sea(uua.p, uua.p));
        gBArrayArray4[uSa.E] = gBArray5;
        gB[] gBArray6 = new gB[vRa.d];
        gBArray6[uSa.E] = new tEa((eAa)Gea.DA, new Sea(XTa.W, Yqa.i));
        gBArrayArray4[vRa.d] = gBArray6;
        gBArrayArray2[vRa.d] = gBArrayArray4;
        gB[][] gBArrayArray5 = new gB[uqa.g][];
        gB[] gBArray7 = new gB[uqa.g];
        gBArray7[uSa.E] = new RDa(eAa.J((Block)QFa.cd), new Sea(ERa.C, cQa.o));
        gBArray7[vRa.d] = new wFa((eAa)Gea.ja, new Sea(yRa.d, AQa.P));
        gBArrayArray5[uSa.E] = gBArray7;
        gB[] gBArray8 = new gB[ERa.C];
        gBArray8[uSa.E] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, uSa.E), new Sea(vRa.d, uqa.g));
        gBArray8[vRa.d] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, vRa.d), new Sea(vRa.d, uqa.g));
        gBArray8[uqa.g] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, uqa.g), new Sea(vRa.d, uqa.g));
        gBArray8[yRa.d] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, yRa.d), new Sea(vRa.d, uqa.g));
        gBArray8[AQa.P] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, AQa.P), new Sea(vRa.d, uqa.g));
        gBArray8[tTa.h] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, tTa.h), new Sea(vRa.d, uqa.g));
        gBArray8[uua.p] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, uua.p), new Sea(vRa.d, uqa.g));
        gBArray8[XTa.W] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, XTa.W), new Sea(vRa.d, uqa.g));
        gBArray8[Yqa.i] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, Yqa.i), new Sea(vRa.d, uqa.g));
        gBArray8[WOa.fa] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, WOa.fa), new Sea(vRa.d, uqa.g));
        gBArray8[NTa.C] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, NTa.C), new Sea(vRa.d, uqa.g));
        gBArray8[pPa.f] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, pPa.f), new Sea(vRa.d, uqa.g));
        gBArray8[lqa.s] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, lqa.s), new Sea(vRa.d, uqa.g));
        gBArray8[uua.s] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, uua.s), new Sea(vRa.d, uqa.g));
        gBArray8[hpa.Z] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, hpa.Z), new Sea(vRa.d, uqa.g));
        gBArray8[Ypa.A] = new wFa(new Mda(eAa.J((Block)QFa.cd), vRa.d, Ypa.A), new Sea(vRa.d, uqa.g));
        gBArrayArray5[vRa.d] = gBArray8;
        gBArrayArray2[uqa.g] = gBArrayArray5;
        gB[][] gBArrayArray6 = new gB[uqa.g][];
        gB[] gBArray9 = new gB[uqa.g];
        gBArray9[uSa.E] = new RDa(Gea.gd, new Sea(Ypa.A, kTa.j));
        gBArray9[vRa.d] = new wFa(Gea.Ma, new Sea(pqa.c, Qqa.i));
        gBArrayArray6[uSa.E] = gBArray9;
        gB[] gBArray10 = new gB[uqa.g];
        gBArray10[uSa.E] = new wFa((eAa)Gea.cd, new Sea(uqa.g, yRa.d));
        gBArray10[vRa.d] = new Afa(eAa.J((Block)QFa.Q), new Sea(NTa.C, NTa.C), Gea.M, new Sea(uua.p, NTa.C));
        gBArrayArray6[vRa.d] = gBArray10;
        gBArrayArray2[yRa.d] = gBArrayArray6;
        gBArrayArray[uSa.E] = gBArrayArray2;
        gB[][][] gBArrayArray7 = new gB[vRa.d][][];
        gB[][] gBArrayArray8 = new gB[uua.p][];
        gB[] gBArray11 = new gB[uqa.g];
        gBArray11[uSa.E] = new RDa(Gea.LB, new Sea(osa.c, Qsa.Ha));
        gBArray11[vRa.d] = new Zea();
        gBArrayArray8[uSa.E] = gBArray11;
        gB[] gBArray12 = new gB[yRa.d];
        gBArray12[uSa.E] = new RDa(Gea.Qa, new Sea(Yqa.i, NTa.C));
        gBArray12[vRa.d] = new wFa(Gea.Gb, new Sea(NTa.C, lqa.s));
        gBArray12[uqa.g] = new wFa(eAa.J((Block)QFa.gA), new Sea(yRa.d, AQa.P));
        gBArrayArray8[vRa.d] = gBArray12;
        gB[] gBArray13 = new gB[yRa.d];
        gBArray13[uSa.E] = new RDa(Gea.sb, new Sea(uqa.g, uqa.g));
        gBArray13[vRa.d] = new wFa(Gea.lC, new Sea(NTa.C, lqa.s));
        gBArray13[uqa.g] = new wFa(eAa.J((Block)QFa.ye), new Sea(kpa.w, ERa.Ka));
        gBArrayArray8[uqa.g] = gBArray13;
        gB[] gBArray14 = new gB[vRa.d];
        gBArray14[uSa.E] = new Zea();
        gBArrayArray8[yRa.d] = gBArray14;
        gB[] gBArray15 = new gB[vRa.d];
        gBArray15[uSa.E] = new Zea();
        gBArrayArray8[AQa.P] = gBArray15;
        gB[] gBArray16 = new gB[vRa.d];
        gBArray16[uSa.E] = new wFa(Gea.F, new Sea(kTa.j, cQa.o));
        gBArrayArray8[tTa.h] = gBArray16;
        gBArrayArray7[uSa.E] = gBArrayArray8;
        gBArrayArray[vRa.d] = gBArrayArray7;
        gB[][][] gBArrayArray9 = new gB[vRa.d][][];
        gB[][] gBArrayArray10 = new gB[AQa.P][];
        gB[] gBArray17 = new gB[uqa.g];
        gBArray17[uSa.E] = new RDa(Gea.qa, new Sea(Qsa.Ha, wra.P));
        gBArray17[vRa.d] = new RDa(Gea.Bb, new Sea(Yqa.i, NTa.C));
        gBArrayArray10[uSa.E] = gBArray17;
        gB[] gBArray18 = new gB[uqa.g];
        gBArray18[uSa.E] = new wFa(Gea.zc, new Sea(pta.a, pua.o));
        gBArray18[vRa.d] = new wFa(new Mda(Gea.Q, vRa.d, iea.BLUE.getDyeDamage()), new Sea(rQa.p, pua.o));
        gBArrayArray10[vRa.d] = gBArray18;
        gB[] gBArray19 = new gB[uqa.g];
        gBArray19[uSa.E] = new wFa(Gea.da, new Sea(XTa.W, pPa.f));
        gBArray19[vRa.d] = new wFa(eAa.J((Block)QFa.rc), new Sea(ERa.Ka, pua.o));
        gBArrayArray10[uqa.g] = gBArray19;
        gB[] gBArray20 = new gB[vRa.d];
        gBArray20[uSa.E] = new wFa(Gea.Tb, new Sea(yRa.d, pPa.f));
        gBArrayArray10[yRa.d] = gBArray20;
        gBArrayArray9[uSa.E] = gBArrayArray10;
        gBArrayArray[uqa.g] = gBArrayArray9;
        gB[][][] gBArrayArray11 = new gB[yRa.d][][];
        gB[][] gBArrayArray12 = new gB[AQa.P][];
        gB[] gBArray21 = new gB[uqa.g];
        gBArray21[uSa.E] = new RDa(Gea.qc, new Sea(ERa.C, osa.c));
        gBArray21[vRa.d] = new wFa((eAa)Gea.G, new Sea(AQa.P, uua.p));
        gBArrayArray12[uSa.E] = gBArray21;
        gB[] gBArray22 = new gB[uqa.g];
        gBArray22[uSa.E] = new RDa(Gea.GA, new Sea(XTa.W, WOa.fa));
        gBArray22[vRa.d] = new wFa((eAa)Gea.x, new Sea(NTa.C, hpa.Z));
        gBArrayArray12[vRa.d] = gBArray22;
        gB[] gBArray23 = new gB[uqa.g];
        gBArray23[uSa.E] = new RDa(Gea.b, new Sea(yRa.d, AQa.P));
        gBArray23[vRa.d] = new tEa((eAa)Gea.X, new Sea(ERa.C, wOa.t));
        gBArrayArray12[uqa.g] = gBArray23;
        gB[] gBArray24 = new gB[AQa.P];
        gBArray24[uSa.E] = new wFa((eAa)Gea.ea, new Sea(tTa.h, XTa.W));
        gBArray24[vRa.d] = new wFa((eAa)Gea.e, new Sea(WOa.fa, pPa.f));
        gBArray24[uqa.g] = new wFa((eAa)Gea.Nd, new Sea(tTa.h, XTa.W));
        gBArray24[yRa.d] = new wFa((eAa)Gea.d, new Sea(pPa.f, Ypa.A));
        gBArrayArray12[yRa.d] = gBArray24;
        gBArrayArray11[uSa.E] = gBArrayArray12;
        gB[][] gBArrayArray13 = new gB[yRa.d][];
        gB[] gBArray25 = new gB[uqa.g];
        gBArray25[uSa.E] = new RDa(Gea.qc, new Sea(ERa.C, osa.c));
        gBArray25[vRa.d] = new wFa(Gea.ra, new Sea(uua.p, Yqa.i));
        gBArrayArray13[uSa.E] = gBArray25;
        gB[] gBArray26 = new gB[uqa.g];
        gBArray26[uSa.E] = new RDa(Gea.GA, new Sea(XTa.W, WOa.fa));
        gBArray26[vRa.d] = new tEa(Gea.LA, new Sea(WOa.fa, NTa.C));
        gBArrayArray13[vRa.d] = gBArray26;
        gB[] gBArray27 = new gB[yRa.d];
        gBArray27[uSa.E] = new RDa(Gea.b, new Sea(yRa.d, AQa.P));
        gBArray27[vRa.d] = new tEa(Gea.Ga, new Sea(lqa.s, Ypa.A));
        gBArray27[uqa.g] = new tEa(Gea.Z, new Sea(WOa.fa, lqa.s));
        gBArrayArray13[uqa.g] = gBArray27;
        gBArrayArray11[vRa.d] = gBArrayArray13;
        gB[][] gBArrayArray14 = new gB[yRa.d][];
        gB[] gBArray28 = new gB[uqa.g];
        gBArray28[uSa.E] = new RDa(Gea.qc, new Sea(ERa.C, osa.c));
        gBArray28[vRa.d] = new tEa(Gea.NB, new Sea(tTa.h, XTa.W));
        gBArrayArray14[uSa.E] = gBArray28;
        gB[] gBArray29 = new gB[uqa.g];
        gBArray29[uSa.E] = new RDa(Gea.GA, new Sea(XTa.W, WOa.fa));
        gBArray29[vRa.d] = new tEa(Gea.gB, new Sea(WOa.fa, pPa.f));
        gBArrayArray14[vRa.d] = gBArray29;
        gB[] gBArray30 = new gB[uqa.g];
        gBArray30[uSa.E] = new RDa(Gea.b, new Sea(yRa.d, AQa.P));
        gBArray30[vRa.d] = new tEa(Gea.zb, new Sea(lqa.s, Ypa.A));
        gBArrayArray14[uqa.g] = gBArray30;
        gBArrayArray11[uqa.g] = gBArrayArray14;
        gBArrayArray[yRa.d] = gBArrayArray11;
        gB[][][] gBArrayArray15 = new gB[uqa.g][][];
        gB[][] gBArrayArray16 = new gB[uqa.g][];
        gB[] gBArray31 = new gB[uqa.g];
        gBArray31[uSa.E] = new RDa(Gea.fa, new Sea(hpa.Z, yOa.B));
        gBArray31[vRa.d] = new RDa(Gea.od, new Sea(hpa.Z, yOa.B));
        gBArrayArray16[uSa.E] = gBArray31;
        gB[] gBArray32 = new gB[yRa.d];
        gBArray32[uSa.E] = new RDa(Gea.qc, new Sea(ERa.C, osa.c));
        gBArray32[vRa.d] = new wFa(Gea.kd, new Sea(jpa.r, kpa.w));
        gBArray32[uqa.g] = new wFa(Gea.Aa, new Sea(Qqa.i, zsa.a));
        gBArrayArray16[vRa.d] = gBArray32;
        gBArrayArray15[uSa.E] = gBArrayArray16;
        gB[][] gBArrayArray17 = new gB[yRa.d][];
        gB[] gBArray33 = new gB[uqa.g];
        gBArray33[uSa.E] = new RDa(Gea.Xb, new Sea(WOa.fa, lqa.s));
        gBArray33[vRa.d] = new wFa((eAa)Gea.W, new Sea(uqa.g, AQa.P));
        gBArrayArray17[uSa.E] = gBArray33;
        gB[] gBArray34 = new gB[vRa.d];
        gBArray34[uSa.E] = new tEa((eAa)Gea.r, new Sea(XTa.W, lqa.s));
        gBArrayArray17[vRa.d] = gBArray34;
        gB[] gBArray35 = new gB[vRa.d];
        gBArray35[uSa.E] = new wFa(Gea.NA, new Sea(Yqa.i, NTa.C));
        gBArrayArray17[uqa.g] = gBArray35;
        gBArrayArray15[vRa.d] = gBArrayArray17;
        gBArrayArray[AQa.P] = gBArrayArray15;
        I = gBArrayArray;
    }

    public boolean ca() {
        mFa_2 a2;
        return a2.l(vRa.d);
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(boolean var1_1) {
        block5: {
            block6: {
                var3_2 = this;
                if (var3_2.B || a == false || !var3_2.ca()) break block6;
                a = uSa.E;
                v0 = var2_3 = uSa.E;
                while (v0 < var3_2.M.f()) {
                    b = var3_2.M.J(var2_3);
                    if (b == null) ** GOTO lbl17
                    if (b.J() == Gea.Ra && b.E >= yRa.d) {
                        v1 = vRa.d;
                        var3_2.M.J(var2_3, yRa.d);
                    } else {
                        if ((b.J() == Gea.cA || b.J() == Gea.EB) && b.E >= lqa.s) {
                            a = vRa.d;
                            var3_2.M.J(var2_3, lqa.s);
                        }
lbl17:
                        // 4 sources

                        v1 = a;
                    }
                    if (v1 != 0) {
                        v2 = var3_2;
                        v3 = v2;
                        var3_2.j.J((vL)v2, (byte)yOa.B);
                        var3_2.B = vRa.d;
                        break block5;
                    }
                    v0 = ++var2_3;
                }
            }
            v3 = var3_2;
        }
        return v3.B;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void r() {
        var1_1 = this;
        if ((var1_1.v -= vRa.d) > 0) ** GOTO lbl21
        a = new XF((vL)var1_1);
        v0 = var1_1;
        v0.j.J().J(a);
        v1 = var1_1;
        v0.v = NPa.e + v1.R.nextInt(vpa.o);
        v0.C = v1.j.J().J(a, fPa.i);
        if (v0.C == null) {
            v2 = var1_1;
            v3 = v2;
            v2.W();
        } else {
            v4 = var1_1;
            var2_2 /* !! */  = v4.C.J();
            v5 = var1_1;
            v5.J((XF)var2_2 /* !! */ , (int)((float)v5.C.l() * pqa.r));
            if (v4.G) {
                var1_1.G = uSa.E;
                var1_1.C.J(tTa.h);
            }
lbl21:
            // 4 sources

            v3 = var1_1;
        }
        if (!v3.ba() && var1_1.e > 0) {
            v6 = var1_1;
            v6.e -= vRa.d;
            if (v6.e <= 0) {
                if (var1_1.A) {
                    for (Uz var2_2 : var1_1.o) {
                        if (!var2_2 /* !! */ .l()) continue;
                        var2_2 /* !! */ .J(var1_1.R.nextInt(uua.p) + var1_1.R.nextInt(uua.p) + uqa.g);
                    }
                    v7 = var1_1;
                    v7.V();
                    v7.A = uSa.E;
                    if (v7.C != null && var1_1.k != null) {
                        v8 = var1_1;
                        var1_1.j.J((vL)v8, (byte)hpa.Z);
                        v8.C.J(var1_1.k, vRa.d);
                    }
                }
                var1_1.J(new kba(Hda.t.O, ZOa.x, uSa.E));
            }
        }
        super.r();
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ2, oA oA2) {
        void b2;
        mFa_2 a2;
        mFa_2 c2 = oA2;
        mFa_2 mFa_22 = a2 = this;
        c2 = super.J((KZ)b2, (oA)c2);
        mFa_22.k(mFa_22.j.v.nextInt(tTa.h));
        mFa_22.X();
        return c2;
    }

    public boolean Fa() {
        int n2;
        mFa_2 mFa_22 = this;
        int n3 = n2 = uSa.E;
        while (n3 < mFa_22.M.f()) {
            mFa_2 a2 = mFa_22.M.J(n2);
            if (a2 != null && (a2.J() == Gea.o || a2.J() == Gea.cA || a2.J() == Gea.EB)) {
                return vRa.d != 0;
            }
            n3 = ++n2;
        }
        return uSa.E != 0;
    }

    public boolean n() {
        return uSa.E != 0;
    }

    public void I(boolean bl) {
        boolean b2 = bl;
        mFa_2 a2 = this;
        a2.c = b2;
    }

    public void j(boolean bl) {
        boolean b2 = bl;
        mFa_2 a2 = this;
        a2.B = b2;
    }

    private void V() {
        gB[][][] gBArray;
        gB[][][] gBArray2 = this;
        gB[][][] a2 = I[gBArray2.g()];
        if (gBArray2.D != 0 && gBArray2.h != 0) {
            gBArray = gBArray2;
            gBArray2.h += vRa.d;
        } else {
            gBArray2.D = gBArray2.R.nextInt(a2.length) + vRa.d;
            gBArray = gBArray2;
            gBArray2.h = vRa.d;
        }
        if (gBArray.o == null) {
            gB[][][] gBArray3 = gBArray2;
            gBArray2.o = new GY();
        }
        int n2 = gBArray2.D - vRa.d;
        int n3 = gBArray2.h - vRa.d;
        a2 = a2[n2];
        if (n3 >= 0 && n3 < a2.length) {
            a2 = a2[n3];
            n2 = a2.length;
            int n4 = n3 = uSa.E;
            while (n4 < n2) {
                gB[][] gBArray4 = a2[n3];
                gBArray4.J(gBArray2.o, gBArray2.R);
                n4 = ++n3;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ld J() {
        var2_1 = this /* !! */ ;
        var1_2 = var2_1.e();
        if (var1_2 != null && var1_2.length() > 0) {
            v0 /* !! */  = a /* !! */  = new CY(var1_2);
            a /* !! */ .J().J(var2_1.J());
            v0 /* !! */ .J().J(var2_1.J().toString());
            return v0 /* !! */ ;
        }
        if (var2_1.o == null) {
            var2_1.V();
        }
        a /* !! */  = null;
        switch (var2_1.g()) lbl-1000:
        // 2 sources

        {
            case 0: {
                if (false) ** GOTO lbl-1000
                if (var2_1.D == vRa.d) {
                    v1 /* !! */  = a /* !! */  = Zqa.I;
                    break;
                }
                if (var2_1.D == uqa.g) {
                    v1 /* !! */  = a /* !! */  = bRa.Y;
                    break;
                }
                if (var2_1.D == yRa.d) {
                    v1 /* !! */  = a /* !! */  = Qqa.c;
                    break;
                }
                if (var2_1.D == AQa.P) {
                    v1 /* !! */  = a /* !! */  = sra.l;
                    break;
                }
                ** GOTO lbl52
            }
            case 1: {
                v1 /* !! */  = a /* !! */  = rua.N;
                break;
            }
            case 2: {
                v1 /* !! */  = a /* !! */  = zta.U;
                break;
            }
            case 3: {
                if (var2_1.D == vRa.d) {
                    v1 /* !! */  = a /* !! */  = Ypa.R;
                    break;
                }
                if (var2_1.D == uqa.g) {
                    v1 /* !! */  = a /* !! */  = SPa.D;
                    break;
                }
                if (var2_1.D == yRa.d) {
                    v1 /* !! */  = a /* !! */  = wPa.n;
                    break;
                }
                ** GOTO lbl52
            }
            case 4: {
                if (var2_1.D == vRa.d) {
                    v1 /* !! */  = a /* !! */  = Uta.Q;
                    break;
                }
                if (var2_1.D == uqa.g) {
                    a /* !! */  = kTa.c;
                }
            }
lbl52:
            // 6 sources

            default: {
                v1 /* !! */  = a /* !! */ ;
            }
        }
        if (v1 /* !! */  != null) {
            v2 = var1_2 = new CZ(new StringBuilder().insert(3 ^ 3, yOa.y).append((String)a /* !! */ ).toString(), new Object[uSa.E]);
            var1_2.J().J(var2_1.J());
            v2.J().J(var2_1.J().toString());
            return v2;
        }
        return super.J();
    }

    public mFa_2(Gg gg2) {
        mFa_2 b2 = gg2;
        mFa_2 a2 = this;
        a2((Gg)b2, uSa.E);
    }

    public void N() {
        mFa_2 a2;
        if (a2.g() == 0) {
            a2.D.J(Yqa.i, (gFa)new hia((mFa)a2, oQa.fa));
        }
        super.N();
    }

    public void J(Uz uz2) {
        mFa_2 b2 = uz2;
        mFa_2 a2 = this;
        mFa_2 mFa_22 = b2;
        mFa_22.f();
        a2.c = -a2.j();
        a2.J(Jta.Y, a2.G(), a2.M());
        int n2 = yRa.d + a2.R.nextInt(AQa.P);
        if (mFa_22.f() == vRa.d || a2.R.nextInt(tTa.h) == 0) {
            a2.e = wra.P;
            a2.A = vRa.d;
            a2.B = vRa.d;
            a2.k = a2.i != null ? a2.i.J() : null;
            n2 += 5;
        }
        if (b2.J().J() == Gea.kc) {
            a2.d += b2.J().E;
        }
        if (b2.f()) {
            mFa_2 mFa_23 = a2;
            a2.j.f((vL)new zEa((Gg)mFa_23.j, mFa_23.la, a2.Z + kTa.B, (double)a2.A, n2));
        }
    }

    public void J() {
        mFa_2 a2;
        mFa_2 mFa_22 = a2;
        super.J();
        mFa_22.aa.f(ERa.C, uSa.E);
    }

    public boolean ba() {
        mFa_2 a2;
        if (a2.i != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2) {
        void a2;
        mFa_2 b2 = this;
        int c2 = n2;
        if (super.f(c2, (Mda)a2)) {
            return vRa.d != 0;
        }
        if ((c2 -= vpa.Ja) >= 0 && c2 < b2.M.f()) {
            b2.M.J(c2, (Mda)a2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean v() {
        mFa_2 a2;
        return a2.K;
    }

    public void J(byte by2) {
        byte b2 = by2;
        mFa_2 a2 = this;
        if (b2 == lqa.s) {
            a2.J(UZ.HEART);
            return;
        }
        if (b2 == uua.s) {
            a2.J(UZ.VILLAGER_ANGRY);
            return;
        }
        if (b2 == hpa.Z) {
            a2.J(UZ.VILLAGER_HAPPY);
            return;
        }
        super.J(b2);
    }

    public mFa J(wEa wEa2) {
        mFa_2 b2 = wEa2;
        mFa_2 a2 = this;
        b2 = new mFa_2((Gg)a2.j);
        b2.J(a2.j.J(new XF((vL)b2)), null);
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(jFa jFa2) {
        void a2;
        mFa_2 mFa_22 = this;
        Mda mda2 = a2.J();
        mFa_2 b2 = mda2.J();
        if (mFa_22.J((eAa)b2)) {
            b2 = mFa_22.M.J(mda2);
            if (b2 == null) {
                a2.k();
                return;
            }
            mda2.E = ((Mda)b2).E;
        }
    }

    public void s() {
        mFa_2 a2;
        mFa_2 mFa_22 = a2;
        super.s();
        mFa_22.J(Kha.j).J(kTa.B);
    }

    private boolean J(eAa eAa2) {
        mFa_2 b2 = eAa2;
        mFa_2 a2 = this;
        if (b2 == Gea.Ra || b2 == Gea.cA || b2 == Gea.EB || b2 == Gea.DC || b2 == Gea.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(GY object) {
        mFa_2 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(int n2) {
        int n3;
        mFa_2 mFa_22 = this;
        int n4 = mFa_22.g() == 0 ? vRa.d : uSa.E;
        int n5 = n3 = uSa.E;
        while (n5 < mFa_22.M.f()) {
            mFa_2 b2 = mFa_22.M.J(n3);
            if (b2 != null) {
                void a2;
                if (b2.J() == Gea.Ra && ((Mda)b2).E >= yRa.d * a2 || b2.J() == Gea.cA && ((Mda)b2).E >= lqa.s * a2 || b2.J() == Gea.EB && ((Mda)b2).E >= lqa.s * a2) {
                    return vRa.d != 0;
                }
                if (n4 != 0 && b2.J() == Gea.DC && ((Mda)b2).E >= WOa.fa * a2) {
                    return vRa.d != 0;
                }
            }
            n5 = ++n3;
        }
        return uSa.E != 0;
    }

    public int g() {
        mFa_2 a2;
        return Math.max(a2.aa.J(ERa.C) % tTa.h, uSa.E);
    }

    public boolean J(Sx sx2) {
        int n2;
        Sx b2 = sx2;
        mFa_2 a2 = this;
        Mda mda2 = b2.K.f();
        int n3 = n2 = mda2 != null && mda2.J() == Gea.SB ? vRa.d : uSa.E;
        if (n2 == 0 && a2.K() && !a2.ba() && !a2.Y()) {
            if (!(a2.j.e || a2.o != null && a2.o.size() <= 0)) {
                a2.l(b2);
                b2.J(a2);
            }
            b2.J(Tz.J);
            return vRa.d != 0;
        }
        return super.J(b2);
    }

    public boolean O() {
        mFa_2 a2;
        return a2.l(uqa.g);
    }

    public boolean r() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public mFa_2(Gg gg2, int n2) {
        void b2;
        mFa_2 a2;
        int c2 = n2;
        mFa_2 mFa_22 = a2 = this;
        super((Gg)b2);
        mFa_2 mFa_23 = a2;
        a2.M = new yDa(rua.la, uSa.E != 0, Yqa.i);
        mFa_22.k(c2);
        a2.l(mFa_2.d(), Ssa.la);
        ((Hba)mFa_22.J()).d(vRa.d != 0);
        ((Hba)a2.J()).J(vRa.d != 0);
        mFa_2 mFa_24 = a2;
        mFa_24.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        mFa_24.D.J(vRa.d, (gFa)new lFa((bga)((Object)a2), nda.class, Qsa.k, oQa.fa, oQa.fa));
        mFa_24.D.J(vRa.d, (gFa)new nGa((mFa)a2));
        mFa_24.D.J(vRa.d, (gFa)new SGa((mFa)a2));
        mFa_24.D.J(uqa.g, (gFa)new Wha((bga)((Object)a2)));
        mFa_24.D.J(yRa.d, (gFa)new vHa((bga)((Object)a2)));
        mFa_24.D.J(AQa.P, (gFa)new Tha((Yfa)a2, vRa.d != 0));
        mFa_24.D.J(tTa.h, (gFa)new Qia((bga)((Object)a2), oQa.fa));
        mFa_24.D.J(uua.p, (gFa)new Sia((mFa)a2));
        mFa_24.D.J(XTa.W, (gFa)new rha((mFa)a2));
        mFa_24.D.J(WOa.fa, (gFa)new eGa((Yfa)a2, Sx.class, vQa.q, pqa.r));
        mFa_24.D.J(WOa.fa, (gFa)new Iga((mFa)a2));
        mFa_24.D.J(WOa.fa, (gFa)new HDa((bga)((Object)a2), oQa.fa));
        mFa_24.D.J(NTa.C, (gFa)new nHa((Yfa)a2, Yfa.class, Qsa.k));
        mFa_24.D(vRa.d != 0);
    }

    public void k(int n2) {
        int b2 = n2;
        mFa_2 a2 = this;
        a2.aa.J(ERa.C, Integer.valueOf(b2));
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        mFa_2 a2 = this;
        a2.K = b2;
    }

    public void l(Gl gl2) {
        mFa_2 a2;
        mFa_2 b2 = gl2;
        mFa_2 mFa_22 = a2 = this;
        super.l((Gl)b2);
        if (mFa_22.C != null && b2 != null) {
            mFa_2 mFa_23 = b2;
            a2.C.J((Gl)mFa_23);
            if (mFa_23 instanceof Sx) {
                int n2 = pua.o;
                if (a2.Y()) {
                    n2 = ERa.Ka;
                }
                mFa_2 mFa_24 = a2;
                mFa_24.C.J(b2.J(), n2);
                if (mFa_24.K()) {
                    a2.j.J((vL)a2, (byte)uua.s);
                }
            }
        }
    }

    public void J(cEa cEa2) {
        mFa_2 b2 = cEa2;
        mFa_2 a2 = this;
        if (!a2.j.e && !a2.J) {
            mFa_2 mFa_22 = b2 = new nFa((Gg)a2.j);
            mFa_2 mFa_23 = a2;
            mFa_22.f(a2.la, a2.Z, (double)a2.A, mFa_23.X, mFa_23.d);
            mFa_22.J(a2.j.J(new XF((vL)b2)), null);
            b2.G(a2.t());
            if (a2.J()) {
                mFa_2 mFa_24 = b2;
                mFa_24.J(a2.e());
                mFa_24.f(a2.a());
            }
            a2.j.f((vL)b2);
            a2.k();
        }
    }

    public GY J(Sx sx2) {
        Object b2 = sx2;
        mFa_2 a2 = this;
        if (a2.o == null) {
            a2.V();
        }
        return a2.o;
    }

    public float l() {
        mFa_2 mFa_22 = this;
        float a2 = FRa.ja;
        if (mFa_22.Y()) {
            a2 = (float)((double)a2 - dqa.m);
        }
        return a2;
    }

    public void J(Waa waa2) {
        Waa waa3;
        mFa_2 b2 = waa2;
        mFa_2 a2 = this;
        mFa_2 mFa_22 = b2;
        mFa_2 mFa_23 = a2;
        mFa_2 mFa_24 = b2;
        mFa_2 mFa_25 = a2;
        super.J((Waa)b2);
        mFa_25.k(b2.J(qQa.fa));
        a2.d = mFa_24.J(Ssa.n);
        mFa_23.D = mFa_24.J(TQa.y);
        mFa_23.h = b2.J(oua.a);
        a2.B = mFa_22.f(xTa.R);
        if (mFa_22.J(PTa.B, NTa.C)) {
            waa3 = b2.J(PTa.B);
            mFa_2 mFa_26 = a2;
            mFa_26.o = new GY(waa3);
        }
        waa3 = b2.J(eua.O, NTa.C);
        int n2 = b2 = uSa.E;
        while (n2 < waa3.J()) {
            Mda mda2 = Mda.J((Waa)waa3.J(b2));
            if (mda2 != null) {
                a2.M.J(mda2);
            }
            n2 = ++b2;
        }
        mFa_2 mFa_27 = a2;
        mFa_27.D(vRa.d != 0);
        mFa_27.X();
    }

    public void f(Waa waa2) {
        int n2;
        mFa_2 b2 = waa2;
        mFa_2 a2 = this;
        mFa_2 mFa_22 = b2;
        mFa_2 mFa_23 = a2;
        super.f((Waa)b2);
        mFa_2 mFa_24 = b2;
        mFa_24.J(qQa.fa, a2.g());
        mFa_24.J(Ssa.n, a2.d);
        mFa_24.J(TQa.y, a2.D);
        mFa_22.J(oua.a, a2.h);
        mFa_22.J(xTa.R, a2.B);
        if (mFa_23.o != null) {
            b2.J(PTa.B, (NCa)a2.o.getRecipiesAsTags());
        }
        waa waa3 = new waa();
        int n3 = n2 = uSa.E;
        while (n3 < a2.M.f()) {
            Mda mda2 = a2.M.J(n2);
            if (mda2 != null) {
                waa3.J((NCa)mda2.J(new Waa()));
            }
            n3 = ++n2;
        }
        b2.J(eua.O, (NCa)waa3);
    }

    public yDa J() {
        mFa_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(gZ gZ2) {
        mFa_2 mFa_22;
        void a2;
        block4: {
            mFa_2 mFa_23;
            block1: {
                block2: {
                    mFa_2 b2;
                    block3: {
                        mFa_23 = this;
                        if (mFa_23.C == null) break block1;
                        b2 = a2.f();
                        if (b2 == null) break block2;
                        if (!(b2 instanceof Sx)) break block3;
                        mFa_2 mFa_24 = mFa_23;
                        mFa_22 = mFa_24;
                        mFa_24.C.J(b2.J(), rQa.p);
                        break block4;
                    }
                    if (!(b2 instanceof WC)) break block1;
                    mFa_2 mFa_25 = mFa_23;
                    mFa_22 = mFa_25;
                    mFa_25.C.C();
                    break block4;
                }
                if (mFa_23.j.J((vL)mFa_23, Zta.ba) != null) {
                    mFa_23.C.C();
                }
            }
            mFa_22 = mFa_23;
        }
        super.J((gZ)a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(UZ uZ) {
        int b2;
        mFa_2 mFa_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < tTa.h) {
            void a2;
            mFa_2 mFa_23 = mFa_22;
            double d2 = mFa_23.R.nextGaussian() * GPa.g;
            double d3 = mFa_23.R.nextGaussian() * GPa.g;
            double d4 = mFa_23.R.nextGaussian() * GPa.g;
            int n3 = 2 ^ 3;
            mFa_23.j.J((UZ)a2, mFa_22.la + (double)(mFa_22.R.nextFloat() * mFa_22.F * kta.v) - (double)mFa_22.F, mFa_22.Z + oua.i + (double)(mFa_22.R.nextFloat() * mFa_22.u), (double)(mFa_22.A + (double)(mFa_22.R.nextFloat() * mFa_22.F * kta.v) - (double)mFa_22.F), d2, d3, d4, new int[uSa.E]);
            n2 = ++b2;
        }
    }
}

