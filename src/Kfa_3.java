/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockIronOre$EnumType;

public final class Kfa_3
implements Function<Mda, String> {
    public Kfa_3() {
        Kfa_3 a2;
    }

    public String J(Mda mda2) {
        Kfa_3 b2 = mda2;
        Kfa_3 a2 = this;
        return BlockIronOre$EnumType.byMetadata(b2.J()).getName();
    }
}

