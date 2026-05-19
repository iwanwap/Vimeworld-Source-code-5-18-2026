/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  Eu
 */
import java.util.Comparator;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Eu_3
implements Comparator {
    private static final Eu instance = new Eu_3();

    private Eu_3() {
        Eu_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public int compare(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        Eu_3 a2 = this;
        return BS.J((MiniDotItem)((MiniDotItem)b2), (MiniDotItem)((MiniDotItem)c2));
    }

    public static Comparator J() {
        return instance;
    }
}

