/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UR
 *  ws
 */
import java.util.Comparator;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class UR_3
implements Comparator {
    private static final UR I = new UR_3();

    private UR_3() {
        UR_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public int compare(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        UR_3 a2 = this;
        return ws.f((MiniDotItem)((MiniDotItem)b2), (MiniDotItem)((MiniDotItem)c2));
    }

    public static Comparator J() {
        return I;
    }
}

