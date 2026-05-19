/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lu
 *  cT
 */
import java.util.function.Function;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class Lu_1
implements Function {
    private static final Lu instance = new Lu_1();

    public static Function J() {
        return instance;
    }

    private Lu_1() {
        Lu_1 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Lu_1 a2 = this;
        return BaseItem.J((cT)b2);
    }
}

