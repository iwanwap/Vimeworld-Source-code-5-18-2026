/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  NPa
 *  Tpa
 *  gc
 *  pua
 *  vQa
 *  vRa
 */
public final class FNa_1
extends EC
implements gc {
    private boolean k;
    private String j;
    private int J;
    private String I = Mqa.y;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        FNa_1 a2 = this;
        if (a2.k) {
            a2.g.J((EC)null);
            return;
        }
        a2.i();
        FNa_1.J((String)a2.I, (int)(a2.A / uqa.g), (int)NPa.e, (int)pua.o);
        FNa_1.J((String)new StringBuilder().insert(3 >> 2, a2.j).append(Tpa.E).append(a2.J).append(Wqa.fa).toString(), (int)(a2.A / uqa.g), (int)Jsa.ha, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void l(String string) {
        Object b2 = string;
        FNa_1 a2 = this;
        a2.J((String)b2);
    }

    public void J(String string) {
        Object b2 = string;
        FNa_1 a2 = this;
        a2.I = b2;
        a2.f(vQa.Y);
    }

    public void J() {
        a.k = vRa.d;
    }

    public void f(String string) {
        Object b2 = string;
        FNa_1 a2 = this;
        a2.j = b2;
        a2.J(uSa.E);
    }

    public void J(int n2) {
        int b2 = n2;
        FNa_1 a2 = this;
        a2.J = b2;
    }

    public FNa_1() {
        FNa_1 a2;
        a2.j = Mqa.y;
    }
}

