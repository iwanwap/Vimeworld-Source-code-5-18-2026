/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockSand$EnumType;

public final class cFa_1
implements Function<Mda, String> {
    public String J(Mda mda2) {
        cFa_1 b2 = mda2;
        cFa_1 a2 = this;
        return BlockSand$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }

    public cFa_1() {
        cFa_1 a2;
    }
}

