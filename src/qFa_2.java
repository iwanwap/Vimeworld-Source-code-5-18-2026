/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;
import net.minecraft.block.BlockPlanks$EnumType;

public final class qFa_2
implements Function<Mda, String> {
    public qFa_2() {
        qFa_2 a2;
    }

    public String J(Mda mda2) {
        qFa_2 b2 = mda2;
        qFa_2 a2 = this;
        return BlockPlanks$EnumType.byMetadata(b2.J()).getUnlocalizedName();
    }
}

