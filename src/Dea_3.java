/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockFroglight$EnumVariant;

public final class Dea_3
implements Function<Mda, String> {
    public Dea_3() {
        Dea_3 a2;
    }

    public String J(Mda mda2) {
        Dea_3 b2 = mda2;
        Dea_3 a2 = this;
        return BlockFroglight$EnumVariant.byMeta(b2.J()).getUnlocalizedName();
    }
}

