/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class zt
implements Predicate {
    private final mx I;

    public static Predicate J(mx a2) {
        return new zt(a2);
    }

    private zt(mx mx2) {
        Object b2 = mx2;
        zt a2 = this;
        a2.I = b2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        zt a2 = this;
        return mx.J(a2.I, (MiniDotItem)b2);
    }
}

