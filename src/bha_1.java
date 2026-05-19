/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UK
 *  bha
 */
import java.util.function.Function;
import net.minecraft.block.BlockFroglight$EnumVariant;

public final class bha_1
implements Function {
    private static final bha I = new bha_1();

    public Object apply(Object object) {
        Object b2 = object;
        bha_1 a2 = this;
        return UK.J((BlockFroglight$EnumVariant)((BlockFroglight$EnumVariant)((Object)b2)));
    }

    public static Function J() {
        return I;
    }

    private bha_1() {
        bha_1 a2;
    }
}

