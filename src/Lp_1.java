/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lp
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lp_1 {
    private final Bp C;
    private final long i;
    private long M;
    private final Lp k;
    private boolean j;
    private int J;
    private String A;
    private List<Lp> I;

    public static /* synthetic */ List J(Lp a2) {
        return a2.I;
    }

    public boolean J() {
        Lp_1 a2;
        if (!a2.I.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ long f(Lp a2) {
        return a2.i;
    }

    public static /* synthetic */ long J(Lp a2) {
        return a2.M;
    }

    public static /* synthetic */ int J(Lp lp2, int n2) {
        int b2 = n2;
        Lp a2 = lp2;
        a2.J = b2;
        return a2.J;
    }

    public static /* synthetic */ boolean J(Lp lp2, boolean bl) {
        boolean b2 = bl;
        Lp a2 = lp2;
        a2.j = b2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public Lp_1(Lp lp2, Bp bp) {
        void b2;
        Lp_1 a2;
        Bp c2 = bp;
        Lp_1 lp_1 = a2 = this;
        a2.i = OT.e;
        a2.M = nqa.i;
        Lp_1 lp_12 = a2;
        a2.I = new ArrayList<Lp>();
        lp_1.k = b2;
        lp_1.C = c2;
    }

    public String J() {
        Lp_1 lp_1 = this;
        if (lp_1.A == null) {
            StringBuilder a2 = new StringBuilder();
            lp_1.J(a2);
            lp_1.A = a2.toString();
        }
        return lp_1.A;
    }

    public static /* synthetic */ long J(Lp b2, long a2) {
        b2.M = a2;
        return b2.M;
    }

    public static /* synthetic */ List J(Lp lp2, List list) {
        Object b2 = list;
        Lp a2 = lp2;
        a2.I = b2;
        return a2.I;
    }

    public static /* synthetic */ Bp J(Lp a2) {
        return a2.C;
    }

    public static /* synthetic */ int J(Lp a2) {
        return a2.J;
    }

    private void J(StringBuilder stringBuilder) {
        StringBuilder b2 = stringBuilder;
        Lp_1 a2 = this;
        if (a2.k != null) {
            Object object = b2;
            super.J((StringBuilder)object);
            ((StringBuilder)object).append(eta.ca);
        }
        b2.append((String)a2.C.I);
    }

    public static /* synthetic */ boolean J(Lp a2) {
        return a2.j;
    }
}

