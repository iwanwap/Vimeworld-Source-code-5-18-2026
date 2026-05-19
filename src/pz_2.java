/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bz
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pz_2 {
    private final bz M;
    private boolean k;
    private static final String j = "CL_00000137";
    private String J;
    private int A;
    private double I;

    /*
     * Unable to fully structure code
     */
    public void J(String var1_1) {
        b = var1_1;
        a = this;
        a.J = b;
        if (a.J != null) {
            if (b.equals(MRa.E)) {
                a.k = uSa.E;
                return;
            }
            if (b.equals(oQa.l)) {
                a.k = vRa.d;
                return;
            }
        }
        a.k = Boolean.parseBoolean(b);
        a.A = a.k != false ? vRa.d : uSa.E;
        try {
            a.A = Integer.parseInt(b);
            v0 = a;
            ** GOTO lbl20
        }
        catch (NumberFormatException v1) {
            try {
                v0 = a;
lbl20:
                // 2 sources

                v0.I = Double.parseDouble(b);
                return;
            }
            catch (NumberFormatException v2) {
                return;
            }
        }
    }

    public String J() {
        pz_2 a2;
        return a2.J;
    }

    public boolean J() {
        pz_2 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public pz_2(String string, bz bz2) {
        void b2;
        pz_2 c2 = bz2;
        pz_2 a2 = this;
        a2.M = c2;
        a2.J((String)b2);
    }

    public bz J() {
        pz_2 a2;
        return a2.M;
    }

    public int J() {
        pz_2 a2;
        return a2.A;
    }
}

