/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockSandStone$EnumType;

public final class Rfa_1
implements Function<Mda, String> {
    public Rfa_1() {
        Rfa_1 a2;
    }

    public String J(Mda mda2) {
        Rfa_1 b2 = mda2;
        Rfa_1 a2 = this;
        return BlockSandStone$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

