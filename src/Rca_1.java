/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OCa
 *  RQa
 *  asa
 *  gc
 */
public final class Rca_1
implements gc {
    public final /* synthetic */ OCa A;
    private long I;

    public void J(String object) {
        Object b2 = object;
        object = this;
    }

    public Rca_1(OCa oCa2) {
        Rca_1 b2 = oCa2;
        Rca_1 a2 = this;
        a2.A = b2;
        a2.I = System.currentTimeMillis();
    }

    public void l(String object) {
        Object b2 = object;
        object = this;
    }

    public void J() {
    }

    public void f(String object) {
        Object b2 = object;
        object = this;
    }

    public void J(int n2) {
        int b2 = n2;
        Rca_1 a2 = this;
        if (System.currentTimeMillis() - a2.I >= asa.fa) {
            a2.I = System.currentTimeMillis();
            OCa.J().info(new StringBuilder().insert(5 >> 3, RQa.P).append(b2).append(Wqa.fa).toString());
        }
    }
}

