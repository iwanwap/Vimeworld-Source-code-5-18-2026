/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JQa
 *  Lqa
 *  Mda
 *  ffa
 */
import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.block.BlockIronOre$EnumType;

public final class wDa
extends ffa {
    /*
     * WARNING - void declaration
     */
    public wDa(Block block, Block block2, Function function) {
        void b2;
        void c2;
        Object d2 = function;
        wDa a2 = this;
        super((Block)c2, (Block)b2, (Function)d2);
    }

    public String C(Mda mda2) {
        wDa b2 = mda2;
        wDa a2 = this;
        if (b2.J() == 0) {
            return Lqa.Aa;
        }
        return new StringBuilder().insert(3 ^ 3, JQa.j).append(BlockIronOre$EnumType.byMetadata(b2.J()).getName()).toString();
    }
}

