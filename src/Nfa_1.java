/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockFlower$EnumFlowerColor;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class Nfa_1
implements Function<Mda, String> {
    public String J(Mda mda2) {
        Nfa_1 b2 = mda2;
        Nfa_1 a2 = this;
        return BlockFlower$EnumFlowerType.getType(BlockFlower$EnumFlowerColor.RED, b2.J()).getUnlocalizedName();
    }

    public Nfa_1() {
        Nfa_1 a2;
    }
}

