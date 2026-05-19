/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockWall$EnumType;

public final class eea_1
implements Function<Mda, String> {
    public String J(Mda mda2) {
        eea_1 b2 = mda2;
        eea_1 a2 = this;
        return BlockWall$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }

    public eea_1() {
        eea_1 a2;
    }
}

