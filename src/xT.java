/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TU
 */
import java.util.function.Predicate;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class xT
implements Predicate {
    private final TU I;

    public static Predicate J(TU a2) {
        return new xT(a2);
    }

    private xT(TU tU) {
        xT b2 = tU;
        xT a2 = this;
        a2.I = b2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        xT a2 = this;
        return mx.J(a2.I, (MiniDotItem)b2);
    }
}

