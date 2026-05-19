/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YQ
 *  vL
 *  zU
 */
import java.util.List;
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Gx_1
implements Consumer {
    private final MiniDotItem M;
    private final vL k;
    private final String[] j;
    private final List J;
    private final boolean A;
    private final boolean I;

    /*
     * WARNING - void declaration
     */
    private Gx_1(List list, String[] stringArray, vL vL2, MiniDotItem miniDotItem, boolean bl, boolean bl2) {
        void g;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        Gx_1 a2;
        boolean bl3 = bl2;
        Gx_1 gx_1 = a2 = this;
        Gx_1 gx_12 = a2;
        Gx_1 gx_13 = a2;
        gx_13.J = f2;
        gx_13.j = e2;
        gx_12.k = d2;
        gx_12.M = c2;
        gx_1.I = b2;
        gx_1.A = g;
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(List list, String[] stringArray, vL vL2, MiniDotItem miniDotItem, boolean bl, boolean bl2) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        boolean bl3 = bl2;
        List a2 = list;
        return new Gx_1(a2, (String[])e2, (vL)d2, (MiniDotItem)c2, (boolean)b2, (boolean)f2);
    }

    public void accept(Object object) {
        Gx_1 a2;
        Object b2 = object;
        Gx_1 gx_1 = a2 = this;
        Gx_1 gx_12 = a2;
        Gx_1 gx_13 = a2;
        zU.J((List)gx_1.J, (String[])gx_1.j, (vL)gx_12.k, (MiniDotItem)gx_12.M, (boolean)gx_13.I, (boolean)gx_13.A, (YQ)((YQ)b2));
    }
}

