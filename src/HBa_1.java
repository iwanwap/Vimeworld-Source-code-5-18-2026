/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Oba
 *  QFa
 *  XTa
 *  lqa
 *  pPa
 *  pqa
 *  vRa
 *  wda
 */
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;

public final class HBa_1
extends Oba {
    public static final Set<Block> I;

    public boolean J(Block block) {
        Object b2 = block;
        HBa_1 a2 = this;
        if (b2 == QFa.gC) {
            return vRa.d != 0;
        }
        if (b2 == QFa.mb) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public HBa_1(wda wda2) {
        HBa_1 b2 = wda2;
        HBa_1 a2 = this;
        super(pqa.r, (wda)b2, I);
    }

    static {
        Block[] blockArray = new Block[lqa.s];
        blockArray[uSa.E] = QFa.pd;
        blockArray[vRa.d] = QFa.Bc;
        blockArray[uqa.g] = QFa.rd;
        blockArray[yRa.d] = QFa.lf;
        blockArray[AQa.P] = QFa.Q;
        blockArray[tTa.h] = QFa.uB;
        blockArray[uua.p] = QFa.R;
        blockArray[XTa.W] = QFa.ZA;
        blockArray[Yqa.i] = QFa.mb;
        blockArray[WOa.fa] = QFa.gC;
        blockArray[NTa.C] = QFa.VC;
        blockArray[pPa.f] = QFa.q;
        I = Sets.newHashSet(blockArray);
    }
}

