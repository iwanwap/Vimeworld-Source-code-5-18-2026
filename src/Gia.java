/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;
import net.minecraft.block.BlockCopper$EnumVariant;

public final class Gia
implements Function {
    private static final Gia I = new Gia();

    public Object apply(Object object) {
        Object b2 = object;
        Gia a2 = this;
        return ((BlockCopper$EnumVariant)((Object)b2)).getName();
    }

    public static Function J() {
        return I;
    }

    private Gia() {
        Gia a2;
    }
}

