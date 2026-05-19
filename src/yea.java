/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockCopper$EnumVariant;

public final class yea
implements Function<Mda, String> {
    public String J(Mda mda2) {
        yea b2 = mda2;
        yea a2 = this;
        return BlockCopper$EnumVariant.byMeta(b2.J()).getUnlocalizedName();
    }

    public yea() {
        yea a2;
    }
}

