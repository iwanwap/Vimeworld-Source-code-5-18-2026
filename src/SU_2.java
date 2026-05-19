/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eS
 *  rt
 */
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class SU_2
implements Consumer {
    private final MiniDotItem J;
    private final eS A;
    private final rt I;

    public void accept(Object object) {
        SU_2 a2;
        Object b2 = object;
        SU_2 sU_2 = a2 = this;
        jU.J(sU_2.A, sU_2.J, a2.I, (jU)b2);
    }

    /*
     * WARNING - void declaration
     */
    private SU_2(eS eS2, MiniDotItem miniDotItem, rt rt2) {
        void b2;
        void c2;
        SU_2 a2;
        SU_2 d2 = rt2;
        SU_2 sU_2 = a2 = this;
        a2.A = c2;
        sU_2.J = b2;
        sU_2.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Consumer J(eS eS2, MiniDotItem miniDotItem, rt rt2) {
        void b2;
        eS c2 = rt2;
        eS a2 = eS2;
        return new SU_2(a2, (MiniDotItem)b2, (rt)c2);
    }
}

