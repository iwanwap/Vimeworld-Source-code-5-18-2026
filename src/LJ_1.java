/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LJ
 */
import java.util.function.ToIntFunction;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentBase;

public final class LJ_1
implements ToIntFunction {
    private static final LJ I = new LJ_1();

    public int applyAsInt(Object object) {
        Object b2 = object;
        LJ_1 a2 = this;
        return ((IComponentBase)b2).J();
    }

    private LJ_1() {
        LJ_1 a2;
    }

    public static ToIntFunction J() {
        return I;
    }
}

