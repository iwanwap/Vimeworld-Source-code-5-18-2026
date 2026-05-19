/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;

public final class pfa
implements Function<Mda, String> {
    public pfa() {
        pfa a2;
    }

    public String J(Mda mda2) {
        pfa b2 = mda2;
        pfa a2 = this;
        return BlockDoublePlant$EnumPlantType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

