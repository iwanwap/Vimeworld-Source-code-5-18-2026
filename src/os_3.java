/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Js
 *  os
 */
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class os_3
implements Consumer {
    private static final os instance = new os_3();

    public static Consumer J() {
        return instance;
    }

    public void accept(Object object) {
        Object b2 = object;
        os_3 a2 = this;
        BaseItem.J((Js)b2);
    }

    private os_3() {
        os_3 a2;
    }
}

