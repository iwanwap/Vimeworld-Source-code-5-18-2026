/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockStoneBrick$EnumType;

public final class dea
implements Function<Mda, String> {
    public dea() {
        dea a2;
    }

    public String J(Mda mda2) {
        dea b2 = mda2;
        dea a2 = this;
        return BlockStoneBrick$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

