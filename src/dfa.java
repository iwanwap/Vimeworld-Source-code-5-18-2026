/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RC
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class dfa
implements RC {
    private final double j;
    private final String J;
    private final RC A;
    private boolean I;

    public double J() {
        dfa a2;
        return a2.j;
    }

    public dfa J(boolean bl) {
        boolean b2 = bl;
        dfa a2 = this;
        a2.I = b2;
        return a2;
    }

    public String J() {
        dfa a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public dfa(RC rC, String string, double d2) {
        void a2;
        void c2;
        dfa b2;
        String d3 = string;
        dfa dfa2 = b2 = this;
        b2.A = c2;
        dfa2.J = d3;
        dfa2.j = a2;
        if (d3 == null) {
            throw new IllegalArgumentException(Asa.X);
        }
    }

    public int hashCode() {
        dfa a2;
        return a2.J.hashCode();
    }

    public boolean equals(Object object) {
        Object b2 = object;
        dfa a2 = this;
        if (b2 instanceof RC && a2.J.equals(((RC)b2).J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public RC J() {
        dfa a2;
        return a2.A;
    }

    public boolean J() {
        dfa a2;
        return a2.I;
    }
}

