/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class rFa
implements Function<Mda, String> {
    public rFa() {
        rFa a2;
    }

    public String J(Mda mda) {
        rFa b2 = mda;
        rFa a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J() + Yqa.i).getUnlocalizedName();
    }
}

