/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Yg
 *  k
 *  rg
 *  vI
 *  vRa
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Yg_1 {
    private final vI j;
    private final Set<Bp> J;
    private static final Map<vI, Yg> A = new HashMap<vI, Yg>();
    private final Set<Bp> I;

    public void f(Bp bp2) {
        Yg_1 a2;
        Bp b2 = bp2;
        Yg_1 yg_1 = a2 = this;
        a2.I.remove(b2);
        yg_1.J.remove(b2);
        if (yg_1.I.isEmpty()) {
            A.remove(a2.j);
        }
    }

    public static Yg J(k k2, String string) {
        String b2 = string;
        k a2 = k2;
        if (b2.startsWith(tpa.U)) {
            a2 = OT.i.F;
        }
        return (Yg_1)A.computeIfAbsent(new vI(a2, b2), rg.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bp bp2, boolean bl) {
        void a2;
        Bp c2 = bp2;
        Yg_1 b2 = this;
        if (a2 != false) {
            b2.J.add(c2);
            return;
        }
        b2.J.remove(c2);
    }

    private Yg_1(vI vI2) {
        Yg_1 a2;
        Yg_1 b2 = vI2;
        Yg_1 yg_1 = a2 = this;
        Yg_1 yg_12 = a2;
        yg_1.I = Collections.newSetFromMap(new IdentityHashMap());
        yg_1.J = Collections.newSetFromMap(new IdentityHashMap());
        yg_1.j = b2;
    }

    public static void J() {
        A.clear();
    }

    public static /* synthetic */ Yg J(vI a2) {
        return new Yg_1(a2);
    }

    public boolean J() {
        Yg_1 a2;
        if (!a2.J.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Bp bp2) {
        Bp b2 = bp2;
        Yg_1 a2 = this;
        a2.I.add(b2);
    }
}

