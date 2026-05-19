/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rf
 *  ue
 *  xE
 */
import java.util.Map;

public final class gg {
    private final rf J;
    private final rf A;
    private final rf I;

    public rf l() {
        gg a2;
        return a2.I;
    }

    public rf f() {
        gg a2;
        return a2.J;
    }

    public void J(Map<String, ue> map) {
        Map<String, ue> b2 = map;
        gg a2 = this;
        if (a2.I != null) {
            a2.I.J((Map)b2);
        }
        if (a2.A != null) {
            a2.A.J((Map)b2);
        }
        if (a2.J != null) {
            a2.J.J((Map)b2);
        }
    }

    public rf J() {
        gg a2;
        return a2.A;
    }

    public void J(rf rf2) {
        gg b2 = rf2;
        gg a2 = this;
        if (a2.I != null) {
            xE.J((rf)a2.I, (rf)b2);
        }
        if (a2.A != null) {
            xE.J((rf)a2.A, (rf)b2);
        }
        if (a2.J != null) {
            xE.J((rf)a2.J, (rf)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(rf rf2, rf rf3) {
        gg c2 = rf2;
        gg b2 = this;
        if (b2.I != null) {
            xE.J((rf)b2.I, (rf)c2);
        }
        if (b2.A != null) {
            void a2;
            xE.J((rf)b2.A, (rf)a2);
        }
        if (b2.J != null) {
            xE.J((rf)b2.J, (rf)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public gg(rf rf2, rf rf3, rf rf4) {
        void b2;
        void c2;
        gg a2;
        gg d2 = rf4;
        gg gg2 = a2 = this;
        a2.I = c2;
        gg2.A = b2;
        gg2.J = d2;
    }
}

