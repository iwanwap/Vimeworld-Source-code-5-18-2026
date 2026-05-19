/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JX
 *  Mda
 *  ffa
 */
import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;

public final class Xda_3
extends ffa {
    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2, int n2) {
        void b2;
        Xda_3 xda_3 = this;
        Object c2 = BlockDoublePlant$EnumPlantType.byMetadata(b2.J());
        if (c2 != BlockDoublePlant$EnumPlantType.GRASS && c2 != BlockDoublePlant$EnumPlantType.FERN) {
            void a2;
            return super.J((Mda)b2, (int)a2);
        }
        return JX.J((double)kTa.B, (double)oua.i);
    }

    /*
     * WARNING - void declaration
     */
    public Xda_3(Block block, Block block2, Function<Mda, String> function) {
        void b2;
        void c2;
        Object d2 = function;
        Xda_3 a2 = this;
        super((Block)c2, (Block)b2, (Function)d2);
    }
}

