/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class dDa
implements Function<Mda, String> {
    public String J(Mda mda2) {
        dDa b2 = mda2;
        dDa a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }

    public dDa() {
        dDa a2;
    }
}

