/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Zs
 *  ws
 */
import java.util.Comparator;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Zs_2
implements Comparator {
    private static final Zs I = new Zs_2();

    private Zs_2() {
        Zs_2 a2;
    }

    public static Comparator J() {
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public int compare(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        Zs_2 a2 = this;
        return ws.J((MiniDotItem)((MiniDotItem)b2), (MiniDotItem)((MiniDotItem)c2));
    }
}

