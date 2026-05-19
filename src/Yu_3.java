/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yu
 */
import java.util.function.Predicate;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Yu_3
implements Predicate {
    private static final Yu I = new Yu_3();

    public static Predicate J() {
        return I;
    }

    public boolean test(Object object) {
        Object b2 = object;
        Yu_3 a2 = this;
        return mx.f((MiniDotItem)b2);
    }

    private Yu_3() {
        Yu_3 a2;
    }
}

