/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockRedSandstone$EnumType;

public final class bfa_1
implements Function<Mda, String> {
    public bfa_1() {
        bfa_1 a2;
    }

    public String J(Mda mda2) {
        bfa_1 b2 = mda2;
        bfa_1 a2 = this;
        return BlockRedSandstone$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

