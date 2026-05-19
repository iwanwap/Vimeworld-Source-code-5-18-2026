/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 *  ui
 */
public final class hG_3 {
    public Fi M;
    public int k;
    public int j;
    public int J;
    private ui A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public hG_3(Fi fi2, int n2, int n3, int n4, int n5) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        hG_3 a2;
        int n6 = n5;
        hG_3 hG_32 = a2 = this;
        hG_3 hG_33 = a2;
        a2.M = e2;
        hG_33.I = d2;
        hG_33.j = c2;
        hG_32.k = b2;
        hG_32.J = f2;
    }

    public ui J() {
        hG_3 hG_32 = this;
        if (hG_32.A == null) {
            hG_3 a2;
            if (hG_32.M.J == pua.o) {
                return ui.M;
            }
            hG_3 hG_33 = a2 = new ui();
            hG_3 hG_34 = a2;
            hG_3 hG_35 = hG_32;
            ((ui)hG_34).I = hG_35.M.J;
            hG_3 hG_36 = hG_32;
            ((ui)hG_34).A = ((float)hG_35.I + WRa.e) / (float)hG_36.M.M;
            ((ui)hG_33).j = ((float)hG_36.j + WRa.e) / (float)hG_32.M.j;
            ((ui)hG_33).k = ((float)(hG_32.I + hG_32.k) - WRa.e) / (float)hG_32.M.M;
            ((ui)a2).J = ((float)(hG_32.j + hG_32.J) - WRa.e) / (float)hG_32.M.j;
            hG_32.A = a2;
        }
        return hG_32.A;
    }
}

