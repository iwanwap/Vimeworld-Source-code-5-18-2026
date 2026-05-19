/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  NU
 *  QFa
 *  psa
 *  ww
 */
import java.util.Random;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.BlockStoneBrick;

public final class hU_2
extends ww {
    /*
     * WARNING - void declaration
     */
    public void J(Random random, int n2, int n3, int n4, boolean bl) {
        void a2;
        Random f22 = random;
        hU_2 e2 = this;
        if (a2 != false) {
            float f3;
            float f22 = f22.nextFloat();
            if (f3 < psa.N) {
                e2.blockstate = QFa.v.J(BlockStoneBrick.CRACKED_META);
                return;
            }
            if (f22 < MQa.L) {
                e2.blockstate = QFa.v.J(BlockStoneBrick.MOSSY_META);
                return;
            }
            hU_2 hU_22 = e2;
            if (f22 < vTa.N) {
                hU_22.blockstate = QFa.Od.J(BlockSilverfish$EnumType.STONEBRICK.getMetadata());
                return;
            }
            hU_22.blockstate = QFa.v.J();
            return;
        }
        e2.blockstate = QFa.HF.J();
    }

    public /* synthetic */ hU_2(NU nU2) {
        hU_2 b2 = nU2;
        hU_2 a2 = this;
        a2();
    }

    private hU_2() {
        hU_2 a2;
    }
}

