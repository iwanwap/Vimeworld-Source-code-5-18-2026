/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  ERa
 *  FPa
 *  Fpa
 *  ISa
 *  LQa
 *  Lra
 *  Mda
 *  NTa
 *  Oba
 *  QFa
 *  QSa
 *  Qsa
 *  Ssa
 *  TQa
 *  Tpa
 *  XTa
 *  Ypa
 *  cQa
 *  jRa
 *  lPa
 *  lqa
 *  pPa
 *  uOa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wda
 *  wra
 */
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class BEa_2
extends Oba {
    public static final Set<Block> I;

    public BEa_2(wda wda2) {
        BEa_2 b2 = wda2;
        BEa_2 a2 = this;
        super(vQa.q, (wda)b2, I);
    }

    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2, Block block) {
        Block c2 = block;
        BEa_2 a2 = this;
        if (c2.J() != Material.wood && c2.J() != Material.plants && c2.J() != Material.vine) {
            void b2;
            return super.J((Mda)b2, c2);
        }
        return a2.A;
    }

    static {
        Block[] blockArray = new Block[Ssa.u];
        blockArray[uSa.E] = QFa.L;
        blockArray[vRa.d] = QFa.gA;
        blockArray[uqa.g] = QFa.UA;
        blockArray[yRa.d] = QFa.hf;
        blockArray[AQa.P] = QFa.nE;
        blockArray[tTa.h] = QFa.zd;
        blockArray[uua.p] = QFa.Hc;
        blockArray[XTa.W] = QFa.Nf;
        blockArray[Yqa.i] = QFa.dC;
        blockArray[WOa.fa] = QFa.s;
        blockArray[NTa.C] = QFa.NC;
        blockArray[pPa.f] = QFa.HC;
        blockArray[lqa.s] = QFa.z;
        blockArray[uua.s] = QFa.mB;
        blockArray[hpa.Z] = QFa.J;
        blockArray[Ypa.A] = QFa.DA;
        blockArray[ERa.C] = QFa.OC;
        blockArray[yta.Ka] = QFa.fc;
        blockArray[yOa.B] = QFa.FC;
        blockArray[wOa.t] = QFa.Fa;
        blockArray[kTa.j] = QFa.a;
        blockArray[wOa.h] = QFa.Wb;
        blockArray[cQa.o] = QFa.ob;
        blockArray[AQa.ba] = QFa.kd;
        blockArray[osa.c] = QFa.ra;
        blockArray[kTa.g] = QFa.Rb;
        blockArray[ITa.E] = QFa.bB;
        blockArray[Lra.e] = QFa.ua;
        blockArray[EPa.O] = QFa.aC;
        blockArray[ITa.A] = QFa.gF;
        blockArray[Fsa.d] = QFa.j;
        blockArray[tua.U] = QFa.RB;
        blockArray[fPa.i] = QFa.Ga;
        blockArray[Zqa.G] = QFa.Mb;
        blockArray[Tpa.z] = QFa.Tb;
        blockArray[TQa.ca] = QFa.ub;
        blockArray[Qsa.Ha] = QFa.zB;
        blockArray[LQa.c] = QFa.AE;
        blockArray[ISa.E] = QFa.WD;
        blockArray[CRa.L] = QFa.ha;
        blockArray[wra.P] = QFa.Hb;
        blockArray[kra.U] = QFa.PA;
        blockArray[cQa.i] = QFa.Wc;
        blockArray[iSa.x] = QFa.Ve;
        blockArray[Yqa.D] = QFa.f;
        blockArray[wra.e] = QFa.ZB;
        blockArray[Bpa.Ha] = QFa.Mc;
        blockArray[uOa.F] = QFa.hA;
        blockArray[QSa.p] = QFa.oc;
        blockArray[jRa.q] = QFa.PB;
        blockArray[vpa.o] = QFa.Db;
        blockArray[cPa.Q] = QFa.td;
        blockArray[FPa.F] = QFa.Ec;
        blockArray[Bpa.Z] = QFa.tB;
        blockArray[GPa.C] = QFa.CC;
        blockArray[Fpa.ca] = QFa.nb;
        blockArray[Upa.D] = QFa.cc;
        blockArray[KSa.x] = QFa.Qc;
        blockArray[lQa.R] = QFa.xc;
        blockArray[lPa.p] = QFa.sA;
        blockArray[Psa.M] = QFa.dc;
        blockArray[tua.w] = QFa.JD;
        blockArray[ITa.V] = QFa.Xc;
        I = Sets.newHashSet(blockArray);
    }
}

