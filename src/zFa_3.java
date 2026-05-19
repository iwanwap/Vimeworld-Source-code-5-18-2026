/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPrismarine$EnumType;

public final class zFa_3
implements Function<Mda, String> {
    public String J(Mda mda2) {
        zFa_3 b2 = mda2;
        zFa_3 a2 = this;
        return BlockPrismarine$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }

    public zFa_3() {
        zFa_3 a2;
    }
}

