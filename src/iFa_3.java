/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockDirt$DirtType;

public final class iFa_3
implements Function<Mda, String> {
    public iFa_3() {
        iFa_3 a2;
    }

    public String J(Mda mda2) {
        iFa_3 b2 = mda2;
        iFa_3 a2 = this;
        return BlockDirt$DirtType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

