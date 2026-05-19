/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zU
 */
import java.util.function.Predicate;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class xR_2
implements Predicate {
    private final zU I;

    public static Predicate J(zU a2) {
        return new xR_2(a2);
    }

    private xR_2(zU zU2) {
        xR_2 b2 = zU2;
        xR_2 a2 = this;
        a2.I = b2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        xR_2 a2 = this;
        return a2.I.J((MiniDotItem)b2);
    }
}

