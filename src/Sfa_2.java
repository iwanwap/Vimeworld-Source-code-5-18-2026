/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockSilverfish$EnumType;

public final class Sfa_2
implements Function<Mda, String> {
    public Sfa_2() {
        Sfa_2 a2;
    }

    public String J(Mda mda2) {
        Sfa_2 b2 = mda2;
        Sfa_2 a2 = this;
        return BlockSilverfish$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

