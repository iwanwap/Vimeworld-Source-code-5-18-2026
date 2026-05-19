/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  KTa
 *  Lqa
 *  Lra
 *  MKa
 *  NTa
 *  Nka
 *  OJa
 *  Pla
 *  QFa
 *  RA
 *  Rua
 *  SQa
 *  Vc
 *  Wla
 *  XTa
 *  Xla
 *  Xsa
 *  Ypa
 *  lqa
 *  mra
 *  oKa
 *  pPa
 *  qta
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.block.BlockCopper;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDropper;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockFroglight;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockIronOre;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLogStripped1;
import net.minecraft.block.BlockLogStripped2;
import net.minecraft.block.BlockLogStripped3;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockNewLog2;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockWall;
import net.minecraft.block.CustomBlock;
import net.minecraft.block.CustomBlock$CustomBlockType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oKa_1 {
    private final Fia J;
    private final Pla A;
    private final Map<IBlockState, RA> I;

    public RA J(IBlockState iBlockState) {
        Object b2 = iBlockState;
        oKa_1 a2 = this;
        if ((b2 = a2.I.get(b2)) == null) {
            b2 = a2.J.J();
        }
        return b2;
    }

    public void J(Block ... blockArray) {
        Block[] b2 = blockArray;
        Block[] a2 = this;
        a2.A.J(b2);
    }

    public KLa J(IBlockState iBlockState) {
        RA a2;
        oKa_1 oKa_12 = this;
        Block b2 = a2.J();
        if ((a2 = oKa_12.J((IBlockState)a2)) == null || a2 == oKa_12.J.J()) {
            if (b2 == QFa.WB || b2 == QFa.Nd || b2 == QFa.dC || b2 == QFa.TF || b2 == QFa.w || b2 == QFa.Sc) {
                return oKa_12.J.J().J(Asa.m);
            }
            if (b2 == QFa.ta) {
                return oKa_12.J.J().J(sOa.H);
            }
            if (b2 == QFa.fA || b2 == QFa.bb) {
                return oKa_12.J.J().J(UTa.t);
            }
            if (b2 == QFa.jd || b2 == QFa.sc) {
                return oKa_12.J.J().J(Lra.v);
            }
            if (b2 == QFa.kC) {
                return oKa_12.J.J().J(Ira.O);
            }
            if (b2 == QFa.fE) {
                return oKa_12.J.J().J(JPa.l);
            }
        }
        if (a2 == null) {
            a2 = oKa_12.J.J();
        }
        return a2.J();
    }

    private void f() {
        oKa_1 oKa_12 = this;
        Block[] blockArray = new Block[ERa.C];
        blockArray[uSa.E] = QFa.HF;
        blockArray[vRa.d] = QFa.jd;
        blockArray[uqa.g] = QFa.sc;
        blockArray[yRa.d] = QFa.fA;
        blockArray[AQa.P] = QFa.bb;
        blockArray[tTa.h] = QFa.zA;
        blockArray[uua.p] = QFa.dC;
        blockArray[XTa.W] = QFa.ta;
        blockArray[Yqa.i] = QFa.TF;
        blockArray[WOa.fa] = QFa.Nd;
        blockArray[NTa.C] = QFa.kC;
        blockArray[pPa.f] = QFa.mc;
        blockArray[lqa.s] = QFa.fE;
        blockArray[uua.s] = QFa.WB;
        blockArray[hpa.Z] = QFa.Sc;
        blockArray[Ypa.A] = QFa.w;
        oKa_12.J(blockArray);
        oKa_1 oKa_13 = oKa_12;
        oKa_13.J(QFa.Gd, (Vc)new DKa().J((IProperty<?>)BlockStone.VARIANT).J());
        oKa_13.J(QFa.xd, (Vc)new DKa().J((IProperty<?>)BlockPrismarine.VARIANT).J());
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = BlockLeaves.CHECK_DECAY;
        iPropertyArray[vRa.d] = BlockLeaves.DECAYABLE;
        oKa_13.J((Block)QFa.vd, (Vc)new DKa().J((IProperty<?>)BlockOldLeaf.VARIANT).J(qta.k).J(iPropertyArray).J());
        IProperty[] iPropertyArray2 = new IProperty[uqa.g];
        iPropertyArray2[uSa.E] = BlockLeaves.CHECK_DECAY;
        iPropertyArray2[vRa.d] = BlockLeaves.DECAYABLE;
        oKa_12.J((Block)QFa.Z, (Vc)new DKa().J((IProperty<?>)BlockNewLeaf.VARIANT).J(qta.k).J(iPropertyArray2).J());
        IProperty[] iPropertyArray3 = new IProperty[vRa.d];
        iPropertyArray3[uSa.E] = BlockCactus.AGE;
        oKa_12.J((Block)QFa.dd, (Vc)new DKa().J(iPropertyArray3).J());
        IProperty[] iPropertyArray4 = new IProperty[vRa.d];
        iPropertyArray4[uSa.E] = BlockReed.AGE;
        oKa_12.J((Block)QFa.ka, (Vc)new DKa().J(iPropertyArray4).J());
        IProperty[] iPropertyArray5 = new IProperty[vRa.d];
        iPropertyArray5[uSa.E] = BlockJukebox.HAS_RECORD;
        oKa_12.J(QFa.nB, (Vc)new DKa().J(iPropertyArray5).J());
        IProperty[] iPropertyArray6 = new IProperty[vRa.d];
        iPropertyArray6[uSa.E] = BlockCommandBlock.TRIGGERED;
        oKa_12.J(QFa.Ac, (Vc)new DKa().J(iPropertyArray6).J());
        oKa_1 oKa_14 = oKa_12;
        oKa_14.J(QFa.hc, (Vc)new DKa().J((IProperty<?>)BlockWall.VARIANT).J(tSa.w).J());
        IProperty[] iPropertyArray7 = new IProperty[vRa.d];
        iPropertyArray7[uSa.E] = BlockDoublePlant.field_181084_N;
        oKa_14.J((Block)QFa.Ia, (Vc)new DKa().J((IProperty<?>)BlockDoublePlant.VARIANT).J(iPropertyArray7).J());
        IProperty[] iPropertyArray8 = new IProperty[vRa.d];
        iPropertyArray8[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Ad, (Vc)new DKa().J(iPropertyArray8).J());
        IProperty[] iPropertyArray9 = new IProperty[vRa.d];
        iPropertyArray9[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.yA, (Vc)new DKa().J(iPropertyArray9).J());
        IProperty[] iPropertyArray10 = new IProperty[vRa.d];
        iPropertyArray10[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.hb, (Vc)new DKa().J(iPropertyArray10).J());
        IProperty[] iPropertyArray11 = new IProperty[vRa.d];
        iPropertyArray11[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.tC, (Vc)new DKa().J(iPropertyArray11).J());
        IProperty[] iPropertyArray12 = new IProperty[vRa.d];
        iPropertyArray12[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.na, (Vc)new DKa().J(iPropertyArray12).J());
        IProperty[] iPropertyArray13 = new IProperty[vRa.d];
        iPropertyArray13[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Cb, (Vc)new DKa().J(iPropertyArray13).J());
        IProperty[] iPropertyArray14 = new IProperty[uqa.g];
        iPropertyArray14[uSa.E] = BlockTripWire.DISARMED;
        iPropertyArray14[vRa.d] = BlockTripWire.POWERED;
        oKa_12.J(QFa.Qa, (Vc)new DKa().J(iPropertyArray14).J());
        oKa_1 oKa_15 = oKa_12;
        oKa_15.J((Block)QFa.EC, (Vc)new DKa().J((IProperty<?>)BlockPlanks.VARIANT).J(mra.k).J());
        oKa_15.J((Block)QFa.eb, (Vc)new DKa().J((IProperty<?>)BlockPlanks.VARIANT).J(SQa.Da).J());
        IProperty[] iPropertyArray15 = new IProperty[vRa.d];
        iPropertyArray15[uSa.E] = BlockTNT.EXPLODE;
        oKa_15.J(QFa.Lc, (Vc)new DKa().J(iPropertyArray15).J());
        IProperty[] iPropertyArray16 = new IProperty[vRa.d];
        iPropertyArray16[uSa.E] = BlockFire.AGE;
        oKa_12.J((Block)QFa.ic, (Vc)new DKa().J(iPropertyArray16).J());
        IProperty[] iPropertyArray17 = new IProperty[vRa.d];
        iPropertyArray17[uSa.E] = BlockRedstoneWire.POWER;
        oKa_12.J((Block)QFa.pa, (Vc)new DKa().J(iPropertyArray17).J());
        IProperty[] iPropertyArray18 = new IProperty[vRa.d];
        iPropertyArray18[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.UB, (Vc)new DKa().J(iPropertyArray18).J());
        IProperty[] iPropertyArray19 = new IProperty[vRa.d];
        iPropertyArray19[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.Ed, (Vc)new DKa().J(iPropertyArray19).J());
        IProperty[] iPropertyArray20 = new IProperty[vRa.d];
        iPropertyArray20[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.T, (Vc)new DKa().J(iPropertyArray20).J());
        IProperty[] iPropertyArray21 = new IProperty[vRa.d];
        iPropertyArray21[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.Na, (Vc)new DKa().J(iPropertyArray21).J());
        IProperty[] iPropertyArray22 = new IProperty[vRa.d];
        iPropertyArray22[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.QB, (Vc)new DKa().J(iPropertyArray22).J());
        IProperty[] iPropertyArray23 = new IProperty[vRa.d];
        iPropertyArray23[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.vA, (Vc)new DKa().J(iPropertyArray23).J());
        IProperty[] iPropertyArray24 = new IProperty[vRa.d];
        iPropertyArray24[uSa.E] = BlockDoor.POWERED;
        oKa_12.J(QFa.oC, (Vc)new DKa().J(iPropertyArray24).J());
        oKa_1 oKa_16 = oKa_12;
        oKa_16.J(QFa.cd, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(dsa.P).J());
        oKa_16.J(QFa.XE, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(nqa.S).J());
        oKa_16.J(QFa.za, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(tua.H).J());
        oKa_16.J((Block)QFa.KC, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(Rua.o).J());
        oKa_16.J((Block)QFa.VA, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(Npa.e).J());
        oKa_16.J(QFa.qC, (Vc)new DKa().J((IProperty<?>)BlockSandStone.TYPE).J());
        oKa_16.J(QFa.ec, (Vc)new DKa().J((IProperty<?>)BlockRedSandstone.TYPE).J());
        oKa_16.J((Block)QFa.y, (Vc)new DKa().J((IProperty<?>)BlockTallGrass.TYPE).J());
        IProperty[] iPropertyArray25 = new IProperty[vRa.d];
        iPropertyArray25[uSa.E] = BlockBed.OCCUPIED;
        oKa_16.J(QFa.Pd, (Vc)new DKa().J(iPropertyArray25).J());
        oKa_1 oKa_17 = oKa_12;
        oKa_17.J((Block)QFa.zc, (Vc)new DKa().J((IProperty<?>)QFa.zc.J()).J());
        oKa_17.J((Block)QFa.l, (Vc)new DKa().J((IProperty<?>)QFa.l.J()).J());
        oKa_17.J((Block)QFa.Ib, (Vc)new DKa().J((IProperty<?>)BlockStoneSlab.VARIANT).J(SQa.Da).J());
        oKa_17.J((Block)QFa.F, (Vc)new DKa().J((IProperty<?>)BlockStoneSlabNew.VARIANT).J(SQa.Da).J());
        oKa_17.J(QFa.Od, (Vc)new DKa().J((IProperty<?>)BlockSilverfish.VARIANT).J(Psa.ca).J());
        oKa_17.J(QFa.v, (Vc)new DKa().J((IProperty<?>)BlockStoneBrick.VARIANT).J());
        IProperty[] iPropertyArray26 = new IProperty[vRa.d];
        iPropertyArray26[uSa.E] = BlockDispenser.TRIGGERED;
        oKa_17.J(QFa.EA, (Vc)new DKa().J(iPropertyArray26).J());
        IProperty[] iPropertyArray27 = new IProperty[vRa.d];
        iPropertyArray27[uSa.E] = BlockDropper.TRIGGERED;
        oKa_12.J(QFa.vb, (Vc)new DKa().J(iPropertyArray27).J());
        oKa_1 oKa_18 = oKa_12;
        oKa_18.J(QFa.UA, (Vc)new DKa().J((IProperty<?>)BlockOldLog.VARIANT).J(KQa.K).J());
        oKa_18.J(QFa.hf, (Vc)new DKa().J((IProperty<?>)BlockNewLog.VARIANT).J(KQa.K).J());
        oKa_18.J(QFa.nE, (Vc)new DKa().J((IProperty<?>)BlockNewLog2.VARIANT).J(KQa.K).J());
        oKa_18.J(QFa.L, (Vc)new DKa().J((IProperty<?>)BlockPlanks.VARIANT).J(KTa.W).J());
        oKa_18.J(QFa.Y, (Vc)new DKa().J((IProperty<?>)BlockSapling.TYPE).J(Zqa.Ja).J());
        oKa_18.J((Block)QFa.R, (Vc)new DKa().J((IProperty<?>)BlockSand.VARIANT).J());
        IProperty[] iPropertyArray28 = new IProperty[vRa.d];
        iPropertyArray28[uSa.E] = BlockHopper.ENABLED;
        oKa_18.J((Block)QFa.la, (Vc)new DKa().J(iPropertyArray28).J());
        IProperty[] iPropertyArray29 = new IProperty[vRa.d];
        iPropertyArray29[uSa.E] = BlockFlowerPot.LEGACY_DATA;
        oKa_12.J(QFa.pb, (Vc)new DKa().J(iPropertyArray29).J());
        oKa_1 oKa_19 = oKa_12;
        oKa_19.J(QFa.b, (Vc)new DKa().J((IProperty<?>)BlockIronOre.TYPE).J());
        oKa_19.J(QFa.YA, (Vc)new MKa((oKa)oKa_12));
        oKa_19.J((Block)QFa.BB, (Vc)new Nka((oKa)oKa_12));
        oKa_19.J(QFa.i, (Vc)new Cka((oKa)oKa_12));
        oKa_19.J(QFa.Nb, (Vc)new Wla((oKa)oKa_12));
        oKa_19.J(QFa.Bc, (Vc)new Xla((oKa)oKa_12));
        oKa_19.J((Block)QFa.Rd, (Vc)new xja((oKa)oKa_12));
        oKa_19.J((Block)QFa.wC, (Vc)new lLa((oKa)oKa_12));
        oKa_19.J(QFa.fB, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(Lqa.ca).J());
        oKa_19.J(QFa.ZA, (Vc)new DKa().J((IProperty<?>)BlockColored.COLOR).J(Xsa.K).J());
        oKa_19.J(QFa.zd, (Vc)new DKa().J((IProperty<?>)BlockLogStripped1.VARIANT).J(uqa.j).J());
        oKa_19.J(QFa.Hc, (Vc)new DKa().J((IProperty<?>)BlockLogStripped2.VARIANT).J(uqa.j).J());
        oKa_19.J(QFa.Nf, (Vc)new DKa().J((IProperty<?>)BlockLogStripped3.VARIANT).J(uqa.j).J());
        oKa_19.J(QFa.Kg, (Vc)new DKa().J((IProperty<?>)BlockFroglight.VARIANT).J(WOa.U).J());
        oKa_19.J(QFa.tA, (Vc)new DKa().J((IProperty<?>)BlockCopper.VARIANT).J());
        Object a2 = new OJa((oKa)oKa_12);
        oKa_19.J(QFa.iB, (Vc)a2);
        oKa_19.J(QFa.kB, (Vc)a2);
        oKa_19.J(QFa.lE, (Vc)a2);
        oKa_19.J(QFa.lc, (Vc)a2);
        IProperty[] iPropertyArray30 = new IProperty[vRa.d];
        iPropertyArray30[uSa.E] = BlockFenceGate.POWERED;
        oKa_19.J(QFa.Hb, (Vc)new DKa().J(iPropertyArray30).J());
        IProperty[] iPropertyArray31 = new IProperty[vRa.d];
        iPropertyArray31[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.PA, (Vc)new DKa().J(iPropertyArray31).J());
        IProperty[] iPropertyArray32 = new IProperty[vRa.d];
        iPropertyArray32[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Wc, (Vc)new DKa().J(iPropertyArray32).J());
        IProperty[] iPropertyArray33 = new IProperty[vRa.d];
        iPropertyArray33[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Ve, (Vc)new DKa().J(iPropertyArray33).J());
        IProperty[] iPropertyArray34 = new IProperty[vRa.d];
        iPropertyArray34[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.f, (Vc)new DKa().J(iPropertyArray34).J());
        IProperty[] iPropertyArray35 = new IProperty[vRa.d];
        iPropertyArray35[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.ZB, (Vc)new DKa().J(iPropertyArray35).J());
        IProperty[] iPropertyArray36 = new IProperty[vRa.d];
        iPropertyArray36[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Mc, (Vc)new DKa().J(iPropertyArray36).J());
        IProperty[] iPropertyArray37 = new IProperty[vRa.d];
        iPropertyArray37[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.hA, (Vc)new DKa().J(iPropertyArray37).J());
        IProperty[] iPropertyArray38 = new IProperty[vRa.d];
        iPropertyArray38[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.oc, (Vc)new DKa().J(iPropertyArray38).J());
        IProperty[] iPropertyArray39 = new IProperty[vRa.d];
        iPropertyArray39[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.PB, (Vc)new DKa().J(iPropertyArray39).J());
        IProperty[] iPropertyArray40 = new IProperty[vRa.d];
        iPropertyArray40[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.Db, (Vc)new DKa().J(iPropertyArray40).J());
        IProperty[] iPropertyArray41 = new IProperty[vRa.d];
        iPropertyArray41[uSa.E] = BlockFenceGate.POWERED;
        oKa_12.J(QFa.td, (Vc)new DKa().J(iPropertyArray41).J());
        a2 = Block.blockRegistry.iterator();
        block0: while (true) {
            Object object = a2;
            while (object.hasNext()) {
                Block block = (Block)a2.next();
                CustomBlock customBlock = block.J();
                if (customBlock == null) {
                    object = a2;
                    continue;
                }
                if (customBlock.J() == CustomBlock$CustomBlockType.fence_gate) {
                    IProperty[] iPropertyArray42 = new IProperty[vRa.d];
                    iPropertyArray42[uSa.E] = BlockFenceGate.POWERED;
                    oKa_12.J(block, (Vc)new DKa().J(iPropertyArray42).J());
                    continue block0;
                }
                if (customBlock.J() != CustomBlock$CustomBlockType.door) continue block0;
                IProperty[] iPropertyArray43 = new IProperty[vRa.d];
                iPropertyArray43[uSa.E] = BlockDoor.POWERED;
                oKa_12.J(block, (Vc)new DKa().J(iPropertyArray43).J());
                continue block0;
            }
            break;
        }
    }

    public void J() {
        Iterator iterator;
        oKa_1 oKa_12;
        oKa_1 oKa_13 = oKa_12 = this;
        oKa_13.I.clear();
        Iterator iterator2 = iterator = oKa_13.A.J().entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry a2 = iterator.next();
            oKa_12.I.put((IBlockState)a2.getKey(), oKa_12.J.J((ModelResourceLocation)a2.getValue()));
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Block block, Vc vc2) {
        void b2;
        oKa_1 c2 = vc2;
        oKa_1 a2 = this;
        a2.A.J((Block)b2, (Vc)c2);
    }

    public Pla J() {
        oKa_1 a2;
        return a2.A;
    }

    public Fia J() {
        oKa_1 a2;
        return a2.J;
    }

    public oKa_1(Fia fia2) {
        Fia b2 = fia2;
        oKa_1 a2 = this;
        a2.I = Maps.newIdentityHashMap();
        oKa_1 oKa_12 = a2;
        a2.A = new Pla();
        a2.J = b2;
        a2.f();
    }
}

