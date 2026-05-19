/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ht
 */
import java.util.function.Predicate;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class ht_1
implements Predicate {
    private static final ht I = new ht_1();

    private ht_1() {
        ht_1 a2;
    }

    public boolean test(Object object) {
        Object b2 = object;
        ht_1 a2 = this;
        return mx.J((MiniDotItem)b2);
    }

    public static Predicate J() {
        return I;
    }
}

