/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class Pfa_3
implements Function<Mda, String> {
    public String J(Mda mda2) {
        Pfa_3 b2 = mda2;
        Pfa_3 a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J() + Yqa.i).getUnlocalizedName();
    }

    public Pfa_3() {
        Pfa_3 a2;
    }
}

