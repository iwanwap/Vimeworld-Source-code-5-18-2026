/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class SEa_1
implements Function<Mda, String> {
    public String J(Mda mda2) {
        SEa_1 b2 = mda2;
        SEa_1 a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J() + AQa.P).getUnlocalizedName();
    }

    public SEa_1() {
        SEa_1 a2;
    }
}

