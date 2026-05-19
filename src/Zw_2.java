/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eS
 *  rt
 */
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Zw_2
implements Consumer {
    private final eS J;
    private final rt A;
    private final MiniDotItem I;

    /*
     * WARNING - void declaration
     */
    private Zw_2(eS eS2, MiniDotItem miniDotItem, rt rt2) {
        void b2;
        void c2;
        Zw_2 a2;
        Zw_2 d2 = rt2;
        Zw_2 zw_2 = a2 = this;
        a2.J = c2;
        zw_2.I = b2;
        zw_2.A = d2;
    }

    public void accept(Object object) {
        Zw_2 a2;
        Object b2 = object;
        Zw_2 zw_2 = a2 = this;
        jU.f(zw_2.J, zw_2.I, a2.A, (jU)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(eS eS2, MiniDotItem miniDotItem, rt rt2) {
        void b2;
        eS c2 = rt2;
        eS a2 = eS2;
        return new Zw_2(a2, (MiniDotItem)b2, (rt)c2);
    }
}

