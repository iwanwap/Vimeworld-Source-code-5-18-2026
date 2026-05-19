/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockStone$EnumType;

public final class gga_2
implements Function<Mda, String> {
    public gga_2() {
        gga_2 a2;
    }

    public String J(Mda mda2) {
        gga_2 b2 = mda2;
        gga_2 a2 = this;
        return BlockStone$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

