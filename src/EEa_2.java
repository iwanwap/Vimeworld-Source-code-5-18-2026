/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class EEa_2
implements Function<Mda, String> {
    public EEa_2() {
        EEa_2 a2;
    }

    public String J(Mda mda2) {
        EEa_2 b2 = mda2;
        EEa_2 a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

