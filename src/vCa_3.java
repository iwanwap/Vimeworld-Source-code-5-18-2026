/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  Cta
 *  ERa
 *  FPa
 *  FTa
 *  Fpa
 *  ISa
 *  JPa
 *  LQa
 *  Lqa
 *  Lra
 *  Mda
 *  NPa
 *  NQa
 *  NTa
 *  Oba
 *  Ppa
 *  QFa
 *  QSa
 *  Qqa
 *  Qsa
 *  RQa
 *  SQa
 *  Ssa
 *  TQa
 *  Tpa
 *  Vua
 *  WSa
 *  XSa
 *  XTa
 *  Ypa
 *  Yra
 *  ZRa
 *  Zta
 *  aqa
 *  bSa
 *  bpa
 *  bqa
 *  cQa
 *  cRa
 *  dpa
 *  hqa
 *  iPa
 *  jRa
 *  jpa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  pqa
 *  uOa
 *  vPa
 *  vRa
 *  vpa
 *  wOa
 *  wda
 *  wra
 *  ysa
 *  zTa
 */
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class vCa_3
extends Oba {
    public static final Set<Block> I;

    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2, Block block) {
        Block c2 = block;
        vCa_3 a2 = this;
        if (c2.J() == Material.amethyst) {
            return a2.A;
        }
        if (c2.J() != Material.iron && c2.J() != Material.anvil && c2.J() != Material.rock) {
            void b2;
            return super.J((Mda)b2, c2);
        }
        return a2.A;
    }

    public vCa_3(wda wda2) {
        vCa_3 b2 = wda2;
        vCa_3 a2 = this;
        super(kta.v, (wda)b2, I);
    }

    public boolean J(Block block) {
        Block b2 = block;
        vCa_3 a2 = this;
        if (b2 == QFa.DC) {
            if (a2.I.getHarvestLevel() == yRa.d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 == QFa.tA) {
            if (a2.I.getHarvestLevel() >= vRa.d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 == QFa.X) {
            if (a2.I.getHarvestLevel() == yRa.d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2 != QFa.ca && b2 != QFa.Ic) {
            if (b2 != QFa.c && b2 != QFa.Ab) {
                if (b2 != QFa.WC && b2 != QFa.zE) {
                    if (b2 != QFa.eB && b2 != QFa.b) {
                        if (b2 != QFa.qA && b2 != QFa.xC) {
                            if (b2 != QFa.M && b2 != QFa.Oc) {
                                if (b2.J() == Material.rock) {
                                    return vRa.d != 0;
                                }
                                if (b2.J() == Material.iron) {
                                    return vRa.d != 0;
                                }
                                if (b2.J() == Material.anvil) {
                                    return vRa.d != 0;
                                }
                                return uSa.E != 0;
                            }
                            if (a2.I.getHarvestLevel() >= uqa.g) {
                                return vRa.d != 0;
                            }
                            return uSa.E != 0;
                        }
                        if (a2.I.getHarvestLevel() >= vRa.d) {
                            return vRa.d != 0;
                        }
                        return uSa.E != 0;
                    }
                    if (a2.I.getHarvestLevel() >= vRa.d) {
                        return vRa.d != 0;
                    }
                    return uSa.E != 0;
                }
                if (a2.I.getHarvestLevel() >= uqa.g) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            if (a2.I.getHarvestLevel() >= uqa.g) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2.I.getHarvestLevel() >= uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        Block[] blockArray = new Block[sOa.x];
        blockArray[uSa.E] = QFa.gc;
        blockArray[vRa.d] = QFa.Za;
        blockArray[uqa.g] = QFa.yB;
        blockArray[yRa.d] = QFa.g;
        blockArray[AQa.P] = QFa.ca;
        blockArray[tTa.h] = QFa.Ic;
        blockArray[uua.p] = QFa.Rd;
        blockArray[XTa.W] = QFa.JC;
        blockArray[Yqa.i] = QFa.WC;
        blockArray[WOa.fa] = QFa.zE;
        blockArray[NTa.C] = QFa.Ta;
        blockArray[pPa.f] = QFa.eB;
        blockArray[lqa.s] = QFa.b;
        blockArray[uua.s] = QFa.qA;
        blockArray[hpa.Z] = QFa.xC;
        blockArray[Ypa.A] = QFa.Oc;
        blockArray[ERa.C] = QFa.h;
        blockArray[yta.Ka] = QFa.GA;
        blockArray[yOa.B] = QFa.C;
        blockArray[wOa.t] = QFa.SA;
        blockArray[kTa.j] = QFa.M;
        blockArray[wOa.h] = QFa.qC;
        blockArray[cQa.o] = QFa.ec;
        blockArray[AQa.ba] = QFa.Gd;
        blockArray[osa.c] = QFa.Ib;
        blockArray[kTa.g] = QFa.Yc;
        blockArray[ITa.E] = QFa.od;
        blockArray[Lra.e] = QFa.yb;
        blockArray[EPa.O] = QFa.Sa;
        blockArray[ITa.A] = QFa.gB;
        blockArray[Fsa.d] = QFa.he;
        blockArray[tua.U] = QFa.bA;
        blockArray[fPa.i] = QFa.SC;
        blockArray[Zqa.G] = QFa.Wa;
        blockArray[Tpa.z] = QFa.HA;
        blockArray[TQa.ca] = QFa.Ff;
        blockArray[Qsa.Ha] = QFa.JA;
        blockArray[LQa.c] = QFa.nc;
        blockArray[ISa.E] = QFa.Fd;
        blockArray[CRa.L] = QFa.kA;
        blockArray[wra.P] = QFa.fd;
        blockArray[kra.U] = QFa.Ha;
        blockArray[cQa.i] = QFa.e;
        blockArray[iSa.x] = QFa.zb;
        blockArray[Yqa.D] = QFa.Wd;
        blockArray[wra.e] = QFa.Ef;
        blockArray[Bpa.Ha] = QFa.ed;
        blockArray[uOa.F] = QFa.hC;
        blockArray[QSa.p] = QFa.B;
        blockArray[jRa.q] = QFa.cF;
        blockArray[vpa.o] = QFa.mf;
        blockArray[cPa.Q] = QFa.HB;
        blockArray[FPa.F] = QFa.sd;
        blockArray[Bpa.Z] = QFa.Ld;
        blockArray[GPa.C] = QFa.fC;
        blockArray[Fpa.ca] = QFa.ga;
        blockArray[Upa.D] = QFa.KA;
        blockArray[KSa.x] = QFa.La;
        blockArray[lQa.R] = QFa.UC;
        blockArray[lPa.p] = QFa.KE;
        blockArray[Psa.M] = QFa.Tc;
        blockArray[tua.w] = QFa.AB;
        blockArray[ITa.V] = QFa.qc;
        blockArray[Ssa.u] = QFa.tc;
        blockArray[ysa.s] = QFa.Ra;
        blockArray[fPa.ga] = QFa.tb;
        blockArray[SPa.T] = QFa.Ya;
        blockArray[Vra.b] = QFa.Xa;
        blockArray[WPa.L] = QFa.qa;
        blockArray[Cra.S] = QFa.wc;
        blockArray[NPa.e] = QFa.GF;
        blockArray[hqa.K] = QFa.Zc;
        blockArray[Eqa.Ka] = QFa.vB;
        blockArray[Pua.Ka] = QFa.Dc;
        blockArray[bqa.Ga] = QFa.hD;
        blockArray[jRa.X] = QFa.VE;
        blockArray[NPa.i] = QFa.Ua;
        blockArray[uqa.b] = QFa.ad;
        blockArray[RQa.b] = QFa.Df;
        blockArray[vPa.Ka] = QFa.mD;
        blockArray[Fua.J] = QFa.SF;
        blockArray[csa.A] = QFa.eD;
        blockArray[aqa.Aa] = QFa.K;
        blockArray[pPa.ja] = QFa.SB;
        blockArray[Vua.J] = QFa.Ca;
        blockArray[Ira.ga] = QFa.ia;
        blockArray[Bra.C] = QFa.nC;
        blockArray[Jqa.S] = QFa.Mg;
        blockArray[ZRa.D] = QFa.bC;
        blockArray[bSa.Da] = QFa.ld;
        blockArray[Jsa.ha] = QFa.lA;
        blockArray[rRa.R] = QFa.rA;
        blockArray[iSa.ca] = QFa.nd;
        blockArray[fPa.t] = QFa.Cc;
        blockArray[bpa.I] = QFa.aa;
        blockArray[pqa.ga] = QFa.Sd;
        blockArray[zua.m] = QFa.ya;
        blockArray[Hta.k] = QFa.xa;
        blockArray[dpa.A] = QFa.zf;
        blockArray[zOa.v] = QFa.jc;
        blockArray[ySa.T] = QFa.Pb;
        blockArray[zTa.C] = QFa.fa;
        blockArray[jRa.v] = QFa.ZD;
        blockArray[Bsa.E] = QFa.GB;
        blockArray[Lqa.h] = QFa.m;
        blockArray[xua.S] = QFa.FA;
        blockArray[Yra.j] = QFa.wA;
        blockArray[jpa.E] = QFa.o;
        blockArray[Jra.o] = QFa.dA;
        blockArray[rSa.i] = QFa.dB;
        blockArray[Iqa.M] = QFa.Gc;
        blockArray[fPa.z] = QFa.qd;
        blockArray[BRa.E] = QFa.PE;
        blockArray[XSa.C] = QFa.TD;
        blockArray[WSa.o] = QFa.sa;
        blockArray[pta.ba] = QFa.Gb;
        blockArray[rQa.s] = QFa.Va;
        blockArray[Ppa.K] = QFa.wb;
        blockArray[Zta.Q] = QFa.ac;
        blockArray[yta.g] = QFa.kb;
        blockArray[sOa.D] = QFa.YC;
        blockArray[APa.J] = QFa.xB;
        blockArray[Zta.Ma] = QFa.Se;
        blockArray[JPa.ga] = QFa.Kd;
        blockArray[cPa.Ea] = QFa.xA;
        blockArray[ySa.Z] = QFa.sB;
        blockArray[rQa.i] = QFa.x;
        blockArray[cRa.h] = QFa.AA;
        blockArray[XOa.h] = QFa.mC;
        blockArray[rpa.F] = QFa.TA;
        blockArray[GPa.G] = QFa.wE;
        blockArray[vRa.Ea] = QFa.Ma;
        blockArray[gsa.Ja] = QFa.Kb;
        blockArray[ITa.Da] = QFa.rb;
        blockArray[Qqa.Ja] = QFa.Qd;
        blockArray[RQa.R] = QFa.mA;
        blockArray[PRa.D] = QFa.fb;
        blockArray[ATa.L] = QFa.Id;
        blockArray[Ypa.Z] = QFa.GD;
        blockArray[iPa.ca] = QFa.Md;
        blockArray[Bua.v] = QFa.Mf;
        blockArray[SQa.i] = QFa.TB;
        blockArray[Fsa.D] = QFa.Vb;
        blockArray[NQa.L] = QFa.Cd;
        blockArray[FTa.A] = QFa.pC;
        blockArray[Cta.a] = QFa.KD;
        I = Sets.newHashSet(blockArray);
    }
}

